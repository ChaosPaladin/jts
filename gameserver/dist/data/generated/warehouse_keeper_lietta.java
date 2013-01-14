package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_keeper_lietta extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 622) == 1 && myself.GetOneTimeQuestFlag(talker, 622) == 0 && gg.GetMemoState(talker, 622) == 7 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Specialty Liquor Delivery (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 622) == 1 && myself.GetOneTimeQuestFlag(talker, 622) == 0 && gg.GetMemoState(talker, 622) == 7 * 10 + 1) {
myself.SetCurrentQuestID(622);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 622, 7);
myself.ShowPage(talker, "warehouse_keeper_lietta_q0622_0701.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 622) {
myself.SetCurrentQuestID(622);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 622) {
i0 = myself.GetHTMLCookie(talker, 622, 8 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 622) == 1) {
i1 = gg.Rand(1000);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (i1 < 800) {
myself.GiveItem1(talker, 734, 1);
myself.GiveItem1(talker, 57, 18800);

} else if (i1 < 800 + 80) {
myself.GiveItem1(talker, 6849, 1);

} else if (i1 < 800 + 80 + 80) {
myself.GiveItem1(talker, 6847, 1);

} else if (i1 < 800 + 80 + 80 + 40) {
myself.GiveItem1(talker, 6851, 1);

}

}
gg.AddLog(2, talker, 622);
gg.AddLog(3, talker, 622);
myself.RemoveMemo(talker, 622);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "warehouse_keeper_lietta_q0622_0801.htm");

}

}

}
super;
	}


}