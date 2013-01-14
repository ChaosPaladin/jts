package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class patrin extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 372) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Legacy of Insolence (In Progress)");

}
if (gg.HaveMemo(talker, 355) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Family Honor (In Progress)");

}
if (gg.HaveMemo(talker, 371) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Shrieks of Ghosts (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 372) == 1) {
myself.SetCurrentQuestID(372);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 5979) < 1 || gg.OwnItemCount(talker, 5980) < 1 || gg.OwnItemCount(talker, 5981) < 1 || gg.OwnItemCount(talker, 5982) < 1 || gg.OwnItemCount(talker, 5983) < 1) {
myself.ShowPage(talker, "patrin_q0372_01.htm");

} else if (gg.OwnItemCount(talker, 5979) >= 1 && gg.OwnItemCount(talker, 5980) >= 1 && gg.OwnItemCount(talker, 5981) >= 1 && gg.OwnItemCount(talker, 5982) >= 1 && gg.OwnItemCount(talker, 5983) >= 1) {
myself.DeleteItem1(talker, 5979, 1);
myself.DeleteItem1(talker, 5980, 1);
myself.DeleteItem1(talker, 5981, 1);
myself.DeleteItem1(talker, 5982, 1);
myself.DeleteItem1(talker, 5983, 1);
i1 = gg.Rand(100);
if (i1 < 30) {
myself.GiveItem1(talker, 5497, 1);

} else if (i1 < 60) {
myself.GiveItem1(talker, 5509, 1);

} else if (i1 < 80) {
myself.GiveItem1(talker, 5526, 1);

} else if (i1 < 90) {
myself.GiveItem1(talker, 5497, 1);
myself.GiveItem1(talker, 5509, 1);
myself.GiveItem1(talker, 5526, 1);

} else if (i1 < 100) {
myself.GiveItem1(talker, 57, 4000);

}
myself.ShowPage(talker, "patrin_q0372_02.htm");

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 355) == 1) {
myself.SetCurrentQuestID(355);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "patrin_q0355_01.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 371) == 1) {
myself.SetCurrentQuestID(371);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "patrin_q0371_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 355) {
myself.SetCurrentQuestID(355);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 355) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (gg.OwnItemCount(talker, 4350) < 1) {
myself.ShowPage(talker, "patrin_q0355_02.htm");

} else if (gg.OwnItemCount(talker, 4350) >= 1 && i0 < 2) {
myself.GiveItem1(talker, 4351, 1);
myself.DeleteItem1(talker, 4350, 1);
gg.AddLog(3, talker, 355);
myself.ShowPage(talker, "patrin_q0355_03.htm");

} else if (gg.OwnItemCount(talker, 4350) >= 1 && i0 < 32) {
myself.GiveItem1(talker, 4352, 1);
myself.DeleteItem1(talker, 4350, 1);
gg.AddLog(3, talker, 355);
myself.ShowPage(talker, "patrin_q0355_04.htm");

} else if (gg.OwnItemCount(talker, 4350) >= 1 && i0 < 62) {
myself.GiveItem1(talker, 4353, 1);
myself.DeleteItem1(talker, 4350, 1);
gg.AddLog(3, talker, 355);
myself.ShowPage(talker, "patrin_q0355_05.htm");

} else if (gg.OwnItemCount(talker, 4350) >= 1 && i0 < 77) {
myself.GiveItem1(talker, 4354, 1);
myself.DeleteItem1(talker, 4350, 1);
gg.AddLog(3, talker, 355);
myself.ShowPage(talker, "patrin_q0355_06.htm");

} else {
myself.DeleteItem1(talker, 4350, 1);
myself.ShowPage(talker, "patrin_q0355_07.htm");

}

}

}

}
if (ask == 371) {
myself.SetCurrentQuestID(371);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 371) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 6002) < 1) {
myself.ShowPage(talker, "patrin_q0371_02.htm");

} else if (gg.OwnItemCount(talker, 6002) >= 1) {
i0 = gg.Rand(100);
if (i0 < 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6003, 1);
myself.DeleteItem1(talker, 6002, 1);
myself.ShowPage(talker, "patrin_q0371_03.htm");

}

} else if (i0 < 32) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6004, 1);
myself.DeleteItem1(talker, 6002, 1);
myself.ShowPage(talker, "patrin_q0371_04.htm");

}

} else if (i0 < 62) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6005, 1);
myself.DeleteItem1(talker, 6002, 1);
myself.ShowPage(talker, "patrin_q0371_05.htm");

}

} else if (i0 < 77) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6006, 1);
myself.DeleteItem1(talker, 6002, 1);
myself.ShowPage(talker, "patrin_q0371_06.htm");

}

} else {
myself.DeleteItem1(talker, 6002, 1);
myself.ShowPage(talker, "patrin_q0371_07.htm");

}
gg.AddLog(3, talker, 371);

}

}

}
super;
	}


}