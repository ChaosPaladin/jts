package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pirates_t_chest extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 383) == 1 && gg.GetMemoState(talker, 383) == 2) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Treasure Hunt (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 383) == 1 && gg.GetMemoState(talker, 383) == 2) {
myself.SetCurrentQuestID(383);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pirates_t_chest_q0383_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 383) {
myself.SetCurrentQuestID(383);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 383) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1661) == 0) {
myself.ShowPage(talker, "pirates_t_chest_q0383_02.htm");

} else if (gg.HaveMemo(talker, 383) == 1 && gg.GetMemoState(talker, 383) == 2 && gg.OwnItemCount(talker, 1661) >= 1) {
myself.DeleteItem1(talker, 1661, 1);
myself.RemoveMemo(talker, 383);
gg.AddLog(2, talker, 383);
gg.AddLog(3, talker, 383);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "pirates_t_chest_q0383_03.htm");
i1 = 0;
i0 = gg.Rand(100);
if (i0 < 5) {
myself.GiveItem1(talker, 2450, 1);

} else if (i0 < 6) {
myself.GiveItem1(talker, 2451, 1);

} else if (i0 < 18) {
myself.GiveItem1(talker, 956, 1);

} else if (i0 < 28) {
myself.GiveItem1(talker, 952, 1);

} else {
i1 = i1 + 500;

}
i0 = gg.Rand(1000);
if (i0 < 25) {
myself.GiveItem1(talker, 4481, 1);

} else if (i0 < 50) {
myself.GiveItem1(talker, 4482, 1);

} else if (i0 < 75) {
myself.GiveItem1(talker, 4483, 1);

} else if (i0 < 100) {
myself.GiveItem1(talker, 4484, 1);

} else if (i0 < 125) {
myself.GiveItem1(talker, 4485, 1);

} else if (i0 < 150) {
myself.GiveItem1(talker, 4486, 1);

} else if (i0 < 175) {
myself.GiveItem1(talker, 4487, 1);

} else if (i0 < 200) {
myself.GiveItem1(talker, 4488, 1);

} else if (i0 < 225) {
myself.GiveItem1(talker, 4489, 1);

} else if (i0 < 250) {
myself.GiveItem1(talker, 4490, 1);

} else if (i0 < 275) {
myself.GiveItem1(talker, 4491, 1);

} else if (i0 < 300) {
myself.GiveItem1(talker, 4492, 1);

} else {
i1 = i1 + 300;

}
i0 = gg.Rand(100);
if (i0 < 4) {
myself.GiveItem1(talker, 1337, 1);

} else if (i0 < 8) {
myself.GiveItem1(talker, 1338, 2);

} else if (i0 < 12) {
myself.GiveItem1(talker, 1339, 2);

} else if (i0 < 16) {
myself.GiveItem1(talker, 3447, 2);

} else if (i0 < 20) {
myself.GiveItem1(talker, 3450, 1);

} else if (i0 < 25) {
myself.GiveItem1(talker, 3453, 1);

} else if (i0 < 27) {
myself.GiveItem1(talker, 3456, 1);

} else {
i1 = i1 + 500;

}
i0 = gg.Rand(100);
if (i0 < 20) {
myself.GiveItem1(talker, 4408, 1);

} else if (i0 < 40) {
myself.GiveItem1(talker, 4409, 1);

} else if (i0 < 60) {
myself.GiveItem1(talker, 4418, 1);

} else if (i0 < 80) {
myself.GiveItem1(talker, 4419, 1);

} else {
i1 = i1 + 500;

}
myself.GiveItem1(talker, 57, i1);

}

}

}

}
super;
	}


}