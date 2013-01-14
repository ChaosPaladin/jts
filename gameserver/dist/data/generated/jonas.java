package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class jonas extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 330) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Adept of Taste");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) >= 5) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) == 0 && gg.OwnItemCount(talker, 1420) == 0 && gg.OwnItemCount(talker, 1442) + gg.OwnItemCount(talker, 1443) + gg.OwnItemCount(talker, 1444) + gg.OwnItemCount(talker, 1445) + gg.OwnItemCount(talker, 1446) == 1 && gg.OwnItemCount(talker, 1447) + gg.OwnItemCount(talker, 1574) + gg.OwnItemCount(talker, 1575) + gg.OwnItemCount(talker, 1576) + gg.OwnItemCount(talker, 1577) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) == 0 && gg.OwnItemCount(talker, 1420) == 0 && gg.OwnItemCount(talker, 1442) + gg.OwnItemCount(talker, 1443) + gg.OwnItemCount(talker, 1444) + gg.OwnItemCount(talker, 1445) + gg.OwnItemCount(talker, 1446) == 0 && gg.OwnItemCount(talker, 1447) + gg.OwnItemCount(talker, 1574) + gg.OwnItemCount(talker, 1575) + gg.OwnItemCount(talker, 1576) + gg.OwnItemCount(talker, 1577) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Adept of Taste (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 0) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 24) {
myself.FHTML_SetFileName(fhtml0, "jonas_q0330_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 330);
myself.ShowQuestFHTML(talker, fhtml0, 330);

} else {
myself.ShowQuestPage(talker, "jonas_q0330_01.htm", 330);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) < 5) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jonas_q0330_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) >= 5) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1438) == 0) {
if (gg.Rand(10) < 5) {
myself.ShowPage(talker, "jonas_q0330_05t2.htm");
myself.DeleteItem1(talker, 1420, gg.OwnItemCount(talker, 1420));
myself.DeleteItem1(talker, 1424, gg.OwnItemCount(talker, 1424));
myself.DeleteItem1(talker, 1425, gg.OwnItemCount(talker, 1425));
myself.DeleteItem1(talker, 1429, gg.OwnItemCount(talker, 1429));
myself.DeleteItem1(talker, 1430, gg.OwnItemCount(talker, 1430));
myself.DeleteItem1(talker, 1433, gg.OwnItemCount(talker, 1433));
myself.DeleteItem1(talker, 1437, gg.OwnItemCount(talker, 1437));
myself.DeleteItem1(talker, 1438, gg.OwnItemCount(talker, 1438));
myself.DeleteItem1(talker, 1441, gg.OwnItemCount(talker, 1441));
myself.GiveItem1(talker, 1443, 1);

} else {
myself.ShowPage(talker, "jonas_q0330_05t1.htm");
myself.DeleteItem1(talker, 1420, gg.OwnItemCount(talker, 1420));
myself.DeleteItem1(talker, 1424, gg.OwnItemCount(talker, 1424));
myself.DeleteItem1(talker, 1425, gg.OwnItemCount(talker, 1425));
myself.DeleteItem1(talker, 1429, gg.OwnItemCount(talker, 1429));
myself.DeleteItem1(talker, 1430, gg.OwnItemCount(talker, 1430));
myself.DeleteItem1(talker, 1433, gg.OwnItemCount(talker, 1433));
myself.DeleteItem1(talker, 1437, gg.OwnItemCount(talker, 1437));
myself.DeleteItem1(talker, 1438, gg.OwnItemCount(talker, 1438));
myself.DeleteItem1(talker, 1441, gg.OwnItemCount(talker, 1441));
myself.GiveItem1(talker, 1442, 1);

}

}
if (gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1438) == 1) {
if (gg.Rand(10) < 5) {
myself.ShowPage(talker, "jonas_q0330_05t3.htm");
myself.DeleteItem1(talker, 1420, gg.OwnItemCount(talker, 1420));
myself.DeleteItem1(talker, 1424, gg.OwnItemCount(talker, 1424));
myself.DeleteItem1(talker, 1425, gg.OwnItemCount(talker, 1425));
myself.DeleteItem1(talker, 1429, gg.OwnItemCount(talker, 1429));
myself.DeleteItem1(talker, 1430, gg.OwnItemCount(talker, 1430));
myself.DeleteItem1(talker, 1433, gg.OwnItemCount(talker, 1433));
myself.DeleteItem1(talker, 1437, gg.OwnItemCount(talker, 1437));
myself.DeleteItem1(talker, 1438, gg.OwnItemCount(talker, 1438));
myself.DeleteItem1(talker, 1441, gg.OwnItemCount(talker, 1441));
myself.GiveItem1(talker, 1444, 1);

} else {
myself.ShowPage(talker, "jonas_q0330_05t2.htm");
myself.DeleteItem1(talker, 1420, gg.OwnItemCount(talker, 1420));
myself.DeleteItem1(talker, 1424, gg.OwnItemCount(talker, 1424));
myself.DeleteItem1(talker, 1425, gg.OwnItemCount(talker, 1425));
myself.DeleteItem1(talker, 1429, gg.OwnItemCount(talker, 1429));
myself.DeleteItem1(talker, 1430, gg.OwnItemCount(talker, 1430));
myself.DeleteItem1(talker, 1433, gg.OwnItemCount(talker, 1433));
myself.DeleteItem1(talker, 1437, gg.OwnItemCount(talker, 1437));
myself.DeleteItem1(talker, 1438, gg.OwnItemCount(talker, 1438));
myself.DeleteItem1(talker, 1441, gg.OwnItemCount(talker, 1441));
myself.GiveItem1(talker, 1443, 1);

}

}
if (gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1438) == 2) {
if (gg.Rand(10) < 5) {
myself.ShowPage(talker, "jonas_q0330_05t4.htm");
myself.DeleteItem1(talker, 1420, gg.OwnItemCount(talker, 1420));
myself.DeleteItem1(talker, 1424, gg.OwnItemCount(talker, 1424));
myself.DeleteItem1(talker, 1425, gg.OwnItemCount(talker, 1425));
myself.DeleteItem1(talker, 1429, gg.OwnItemCount(talker, 1429));
myself.DeleteItem1(talker, 1430, gg.OwnItemCount(talker, 1430));
myself.DeleteItem1(talker, 1433, gg.OwnItemCount(talker, 1433));
myself.DeleteItem1(talker, 1437, gg.OwnItemCount(talker, 1437));
myself.DeleteItem1(talker, 1438, gg.OwnItemCount(talker, 1438));
myself.DeleteItem1(talker, 1441, gg.OwnItemCount(talker, 1441));
myself.GiveItem1(talker, 1445, 1);

} else {
myself.ShowPage(talker, "jonas_q0330_05t3.htm");
myself.DeleteItem1(talker, 1420, gg.OwnItemCount(talker, 1420));
myself.DeleteItem1(talker, 1424, gg.OwnItemCount(talker, 1424));
myself.DeleteItem1(talker, 1425, gg.OwnItemCount(talker, 1425));
myself.DeleteItem1(talker, 1429, gg.OwnItemCount(talker, 1429));
myself.DeleteItem1(talker, 1430, gg.OwnItemCount(talker, 1430));
myself.DeleteItem1(talker, 1433, gg.OwnItemCount(talker, 1433));
myself.DeleteItem1(talker, 1437, gg.OwnItemCount(talker, 1437));
myself.DeleteItem1(talker, 1438, gg.OwnItemCount(talker, 1438));
myself.DeleteItem1(talker, 1441, gg.OwnItemCount(talker, 1441));
myself.GiveItem1(talker, 1444, 1);

}

}
if (gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1438) == 3) {
if (gg.Rand(10) < 5) {
myself.ShowPage(talker, "jonas_q0330_05t5.htm");
myself.DeleteItem1(talker, 1420, gg.OwnItemCount(talker, 1420));
myself.DeleteItem1(talker, 1424, gg.OwnItemCount(talker, 1424));
myself.DeleteItem1(talker, 1425, gg.OwnItemCount(talker, 1425));
myself.DeleteItem1(talker, 1429, gg.OwnItemCount(talker, 1429));
myself.DeleteItem1(talker, 1430, gg.OwnItemCount(talker, 1430));
myself.DeleteItem1(talker, 1433, gg.OwnItemCount(talker, 1433));
myself.DeleteItem1(talker, 1437, gg.OwnItemCount(talker, 1437));
myself.DeleteItem1(talker, 1438, gg.OwnItemCount(talker, 1438));
myself.DeleteItem1(talker, 1441, gg.OwnItemCount(talker, 1441));
myself.GiveItem1(talker, 1446, 1);
myself.SoundEffect(talker, "ItemSound.quest_jackpot");

} else {
myself.ShowPage(talker, "jonas_q0330_05t4.htm");
myself.DeleteItem1(talker, 1420, gg.OwnItemCount(talker, 1420));
myself.DeleteItem1(talker, 1424, gg.OwnItemCount(talker, 1424));
myself.DeleteItem1(talker, 1425, gg.OwnItemCount(talker, 1425));
myself.DeleteItem1(talker, 1429, gg.OwnItemCount(talker, 1429));
myself.DeleteItem1(talker, 1430, gg.OwnItemCount(talker, 1430));
myself.DeleteItem1(talker, 1433, gg.OwnItemCount(talker, 1433));
myself.DeleteItem1(talker, 1437, gg.OwnItemCount(talker, 1437));
myself.DeleteItem1(talker, 1438, gg.OwnItemCount(talker, 1438));
myself.DeleteItem1(talker, 1441, gg.OwnItemCount(talker, 1441));
myself.GiveItem1(talker, 1445, 1);

}

}

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) == 0 && gg.OwnItemCount(talker, 1420) == 0 && gg.OwnItemCount(talker, 1442) + gg.OwnItemCount(talker, 1443) + gg.OwnItemCount(talker, 1444) + gg.OwnItemCount(talker, 1445) + gg.OwnItemCount(talker, 1446) == 1 && gg.OwnItemCount(talker, 1447) + gg.OwnItemCount(talker, 1574) + gg.OwnItemCount(talker, 1575) + gg.OwnItemCount(talker, 1576) + gg.OwnItemCount(talker, 1577) == 0) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jonas_q0330_06.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) == 0 && gg.OwnItemCount(talker, 1420) == 0 && gg.OwnItemCount(talker, 1442) + gg.OwnItemCount(talker, 1443) + gg.OwnItemCount(talker, 1444) + gg.OwnItemCount(talker, 1445) + gg.OwnItemCount(talker, 1446) == 0 && gg.OwnItemCount(talker, 1447) + gg.OwnItemCount(talker, 1574) + gg.OwnItemCount(talker, 1575) + gg.OwnItemCount(talker, 1576) + gg.OwnItemCount(talker, 1577) == 1) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1447) == 1) {
myself.ShowPage(talker, "jonas_q0330_06t1.htm");
myself.DeleteItem1(talker, 1447, 1);
myself.GiveItem1(talker, 57, 10000);
myself.RemoveMemo(talker, 330);
gg.AddLog(2, talker, 330);
gg.AddLog(3, talker, 330);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}
if (gg.OwnItemCount(talker, 1574) == 1) {
myself.ShowPage(talker, "jonas_q0330_06t2.htm");
myself.DeleteItem1(talker, 1574, 1);
myself.GiveItem1(talker, 57, 14870);
myself.RemoveMemo(talker, 330);
gg.AddLog(2, talker, 330);
gg.AddLog(3, talker, 330);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}
if (gg.OwnItemCount(talker, 1575) == 1) {
myself.ShowPage(talker, "jonas_q0330_06t3.htm");
myself.DeleteItem1(talker, 1575, 1);
myself.GiveItem1(talker, 57, 6490);
myself.GiveItem1(talker, 1455, 1);
myself.RemoveMemo(talker, 330);
gg.AddLog(2, talker, 330);
gg.AddLog(3, talker, 330);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}
if (gg.OwnItemCount(talker, 1576) == 1) {
myself.ShowPage(talker, "jonas_q0330_06t4.htm");
myself.DeleteItem1(talker, 1576, 1);
myself.GiveItem1(talker, 57, 12220);
myself.GiveItem1(talker, 1456, 1);
myself.RemoveMemo(talker, 330);
gg.AddLog(2, talker, 330);
gg.AddLog(3, talker, 330);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}
if (gg.OwnItemCount(talker, 1577) == 1) {
myself.ShowPage(talker, "jonas_q0330_06t5.htm");
myself.DeleteItem1(talker, 1577, 1);
myself.GiveItem1(talker, 57, 16540);
myself.GiveItem1(talker, 1457, 1);
myself.RemoveMemo(talker, 330);
gg.AddLog(2, talker, 330);
gg.AddLog(3, talker, 330);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 330) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "jonas_q0330_03.htm", 330);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
gg.AddLog(1, talker, 330);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 1420, 1);

}
return;

}
super;
	}


}