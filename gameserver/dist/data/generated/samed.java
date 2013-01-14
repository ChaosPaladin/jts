package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class samed extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 325) == 1 && gg.OwnItemCount(talker, 1349) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Grim Collector (In Progress)");

}
if (gg.HaveMemo(talker, 325) == 1 && gg.OwnItemCount(talker, 1349) == 1 && gg.OwnItemCount(talker, 1350) + gg.OwnItemCount(talker, 1355) + gg.OwnItemCount(talker, 1356) + gg.OwnItemCount(talker, 1351) + gg.OwnItemCount(talker, 1352) + gg.OwnItemCount(talker, 1353) + gg.OwnItemCount(talker, 1354) + gg.OwnItemCount(talker, 1357) + gg.OwnItemCount(talker, 1358) < 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Grim Collector (In Progress)");

}
if (gg.HaveMemo(talker, 325) == 1 && gg.OwnItemCount(talker, 1358) == 0 && gg.OwnItemCount(talker, 1349) == 1 && gg.OwnItemCount(talker, 1350) + gg.OwnItemCount(talker, 1355) + gg.OwnItemCount(talker, 1356) + gg.OwnItemCount(talker, 1351) + gg.OwnItemCount(talker, 1352) + gg.OwnItemCount(talker, 1353) + gg.OwnItemCount(talker, 1354) + gg.OwnItemCount(talker, 1357) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Grim Collector (In Progress)");

}
if (gg.HaveMemo(talker, 325) == 1 && gg.OwnItemCount(talker, 1349) == 1 && gg.OwnItemCount(talker, 1358) > 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Grim Collector (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 325) == 1 && gg.OwnItemCount(talker, 1349) == 0) {
myself.SetCurrentQuestID(325);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "samed_q0325_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 325) == 1 && gg.OwnItemCount(talker, 1349) == 1 && gg.OwnItemCount(talker, 1350) + gg.OwnItemCount(talker, 1355) + gg.OwnItemCount(talker, 1356) + gg.OwnItemCount(talker, 1351) + gg.OwnItemCount(talker, 1352) + gg.OwnItemCount(talker, 1353) + gg.OwnItemCount(talker, 1354) + gg.OwnItemCount(talker, 1357) + gg.OwnItemCount(talker, 1358) < 1) {
myself.SetCurrentQuestID(325);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "samed_q0325_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 325) == 1 && gg.OwnItemCount(talker, 1358) == 0 && gg.OwnItemCount(talker, 1349) == 1 && gg.OwnItemCount(talker, 1350) + gg.OwnItemCount(talker, 1355) + gg.OwnItemCount(talker, 1356) + gg.OwnItemCount(talker, 1351) + gg.OwnItemCount(talker, 1352) + gg.OwnItemCount(talker, 1353) + gg.OwnItemCount(talker, 1354) + gg.OwnItemCount(talker, 1357) > 0) {
myself.SetCurrentQuestID(325);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "samed_q0325_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 325) == 1 && gg.OwnItemCount(talker, 1349) == 1 && gg.OwnItemCount(talker, 1358) > 0) {
myself.SetCurrentQuestID(325);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "samed_q0325_08.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 325) {
myself.SetCurrentQuestID(325);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 325) {
if (reply == 1) {
myself.ShowQuestPage(talker, "samed_q0325_02.htm", 325);

} else if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "samed_q0325_03.htm");
myself.GiveItem1(talker, 1349, 1);

}

} else if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "samed_q0325_06.htm");
if (gg.OwnItemCount(talker, 1350) + gg.OwnItemCount(talker, 1355) + gg.OwnItemCount(talker, 1356) + gg.OwnItemCount(talker, 1351) + gg.OwnItemCount(talker, 1352) + gg.OwnItemCount(talker, 1353) + gg.OwnItemCount(talker, 1354) + gg.OwnItemCount(talker, 1357) + gg.OwnItemCount(talker, 1358) > 0) {
if (gg.OwnItemCount(talker, 1350) + gg.OwnItemCount(talker, 1355) + gg.OwnItemCount(talker, 1356) + gg.OwnItemCount(talker, 1351) + gg.OwnItemCount(talker, 1352) + gg.OwnItemCount(talker, 1353) + gg.OwnItemCount(talker, 1354) + gg.OwnItemCount(talker, 1357) + gg.OwnItemCount(talker, 1358) >= 10) {
if (gg.OwnItemCount(talker, 1358) >= 1) {
myself.GiveItem1(talker, 57, 1629 + 543 + 30 * gg.OwnItemCount(talker, 1350) + 20 * gg.OwnItemCount(talker, 1351) + 20 * gg.OwnItemCount(talker, 1352) + 100 * gg.OwnItemCount(talker, 1353) + 40 * gg.OwnItemCount(talker, 1354) + 14 * gg.OwnItemCount(talker, 1355) + 14 * gg.OwnItemCount(talker, 1356) + 14 * gg.OwnItemCount(talker, 1357) + 341 * gg.OwnItemCount(talker, 1358));

} else {
myself.GiveItem1(talker, 57, 1629 + 30 * gg.OwnItemCount(talker, 1350) + 20 * gg.OwnItemCount(talker, 1351) + 20 * gg.OwnItemCount(talker, 1352) + 100 * gg.OwnItemCount(talker, 1353) + 40 * gg.OwnItemCount(talker, 1354) + 14 * gg.OwnItemCount(talker, 1355) + 14 * gg.OwnItemCount(talker, 1356) + 14 * gg.OwnItemCount(talker, 1357) + 341 * gg.OwnItemCount(talker, 1358));

}

} else if (gg.OwnItemCount(talker, 1358) >= 1) {
myself.GiveItem1(talker, 57, 543 + 30 * gg.OwnItemCount(talker, 1350) + 20 * gg.OwnItemCount(talker, 1351) + 20 * gg.OwnItemCount(talker, 1352) + 100 * gg.OwnItemCount(talker, 1353) + 40 * gg.OwnItemCount(talker, 1354) + 14 * gg.OwnItemCount(talker, 1355) + 14 * gg.OwnItemCount(talker, 1356) + 14 * gg.OwnItemCount(talker, 1357) + 341 * gg.OwnItemCount(talker, 1358));

} else {
myself.GiveItem1(talker, 57, 30 * gg.OwnItemCount(talker, 1350) + 20 * gg.OwnItemCount(talker, 1351) + 20 * gg.OwnItemCount(talker, 1352) + 100 * gg.OwnItemCount(talker, 1353) + 40 * gg.OwnItemCount(talker, 1354) + 14 * gg.OwnItemCount(talker, 1355) + 14 * gg.OwnItemCount(talker, 1356) + 14 * gg.OwnItemCount(talker, 1357) + 341 * gg.OwnItemCount(talker, 1358));

}

}
myself.DeleteItem1(talker, 1350, gg.OwnItemCount(talker, 1350));
myself.DeleteItem1(talker, 1351, gg.OwnItemCount(talker, 1351));
myself.DeleteItem1(talker, 1352, gg.OwnItemCount(talker, 1352));
myself.DeleteItem1(talker, 1353, gg.OwnItemCount(talker, 1353));
myself.DeleteItem1(talker, 1354, gg.OwnItemCount(talker, 1354));
myself.DeleteItem1(talker, 1355, gg.OwnItemCount(talker, 1355));
myself.DeleteItem1(talker, 1356, gg.OwnItemCount(talker, 1356));
myself.DeleteItem1(talker, 1357, gg.OwnItemCount(talker, 1357));
myself.DeleteItem1(talker, 1358, gg.OwnItemCount(talker, 1358));
myself.DeleteItem1(talker, 1349, gg.OwnItemCount(talker, 1349));
myself.RemoveMemo(talker, 325);
gg.AddLog(2, talker, 325);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

} else if (reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "samed_q0325_07.htm");
if (gg.OwnItemCount(talker, 1350) + gg.OwnItemCount(talker, 1355) + gg.OwnItemCount(talker, 1356) + gg.OwnItemCount(talker, 1351) + gg.OwnItemCount(talker, 1352) + gg.OwnItemCount(talker, 1353) + gg.OwnItemCount(talker, 1354) + gg.OwnItemCount(talker, 1357) + gg.OwnItemCount(talker, 1358) > 0) {
if (gg.OwnItemCount(talker, 1350) + gg.OwnItemCount(talker, 1355) + gg.OwnItemCount(talker, 1356) + gg.OwnItemCount(talker, 1351) + gg.OwnItemCount(talker, 1352) + gg.OwnItemCount(talker, 1353) + gg.OwnItemCount(talker, 1354) + gg.OwnItemCount(talker, 1357) + gg.OwnItemCount(talker, 1358) >= 10) {
if (gg.OwnItemCount(talker, 1358) >= 1) {
myself.GiveItem1(talker, 57, 1629 + 543 + 30 * gg.OwnItemCount(talker, 1350) + 20 * gg.OwnItemCount(talker, 1351) + 20 * gg.OwnItemCount(talker, 1352) + 100 * gg.OwnItemCount(talker, 1353) + 40 * gg.OwnItemCount(talker, 1354) + 14 * gg.OwnItemCount(talker, 1355) + 14 * gg.OwnItemCount(talker, 1356) + 14 * gg.OwnItemCount(talker, 1357) + 341 * gg.OwnItemCount(talker, 1358));

} else {
myself.GiveItem1(talker, 57, 1629 + 30 * gg.OwnItemCount(talker, 1350) + 20 * gg.OwnItemCount(talker, 1351) + 20 * gg.OwnItemCount(talker, 1352) + 100 * gg.OwnItemCount(talker, 1353) + 40 * gg.OwnItemCount(talker, 1354) + 14 * gg.OwnItemCount(talker, 1355) + 14 * gg.OwnItemCount(talker, 1356) + 14 * gg.OwnItemCount(talker, 1357) + 341 * gg.OwnItemCount(talker, 1358));

}

} else if (gg.OwnItemCount(talker, 1358) >= 1) {
myself.GiveItem1(talker, 57, 543 + 30 * gg.OwnItemCount(talker, 1350) + 20 * gg.OwnItemCount(talker, 1351) + 20 * gg.OwnItemCount(talker, 1352) + 100 * gg.OwnItemCount(talker, 1353) + 40 * gg.OwnItemCount(talker, 1354) + 14 * gg.OwnItemCount(talker, 1355) + 14 * gg.OwnItemCount(talker, 1356) + 14 * gg.OwnItemCount(talker, 1357) + 341 * gg.OwnItemCount(talker, 1358));

} else {
myself.GiveItem1(talker, 57, 30 * gg.OwnItemCount(talker, 1350) + 20 * gg.OwnItemCount(talker, 1351) + 20 * gg.OwnItemCount(talker, 1352) + 100 * gg.OwnItemCount(talker, 1353) + 40 * gg.OwnItemCount(talker, 1354) + 14 * gg.OwnItemCount(talker, 1355) + 14 * gg.OwnItemCount(talker, 1356) + 14 * gg.OwnItemCount(talker, 1357) + 341 * gg.OwnItemCount(talker, 1358));

}

}
myself.DeleteItem1(talker, 1350, gg.OwnItemCount(talker, 1350));
myself.DeleteItem1(talker, 1351, gg.OwnItemCount(talker, 1351));
myself.DeleteItem1(talker, 1352, gg.OwnItemCount(talker, 1352));
myself.DeleteItem1(talker, 1353, gg.OwnItemCount(talker, 1353));
myself.DeleteItem1(talker, 1354, gg.OwnItemCount(talker, 1354));
myself.DeleteItem1(talker, 1355, gg.OwnItemCount(talker, 1355));
myself.DeleteItem1(talker, 1356, gg.OwnItemCount(talker, 1356));
myself.DeleteItem1(talker, 1357, gg.OwnItemCount(talker, 1357));
myself.DeleteItem1(talker, 1358, gg.OwnItemCount(talker, 1358));
gg.AddLog(3, talker, 325);

}

} else if (reply == 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "samed_q0325_09.htm");
if (gg.OwnItemCount(talker, 1358) > 0) {
myself.GiveItem1(talker, 57, 543 + 341 * gg.OwnItemCount(talker, 1358));

}
myself.DeleteItem1(talker, 1358, gg.OwnItemCount(talker, 1358));
gg.AddLog(3, talker, 325);

}

}

}
super;
	}


}