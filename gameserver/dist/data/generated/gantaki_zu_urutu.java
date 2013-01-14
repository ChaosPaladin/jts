package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gantaki_zu_urutu extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 415) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Orc Monk");

}
if (gg.HaveMemo(talker, 415) == 1 && gg.GetMemoState(talker, 415) == 2) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) == 1 && gg.OwnItemCount(talker, 1603) == 0 && gg.OwnItemCount(talker, 1593) == 1 && gg.OwnItemCount(talker, 1605) == 0 && gg.OwnItemCount(talker, 1604) == 0 && gg.OwnItemCount(talker, 1594) + gg.OwnItemCount(talker, 1595) + gg.OwnItemCount(talker, 1596) + gg.OwnItemCount(talker, 1597) + gg.OwnItemCount(talker, 1598) + gg.OwnItemCount(talker, 1599) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) == 1 && gg.OwnItemCount(talker, 1603) == 0 && gg.OwnItemCount(talker, 1593) == 0 && gg.OwnItemCount(talker, 1605) == 0 && gg.OwnItemCount(talker, 1604) == 0 && gg.OwnItemCount(talker, 1594) + gg.OwnItemCount(talker, 1595) + gg.OwnItemCount(talker, 1596) + gg.OwnItemCount(talker, 1597) + gg.OwnItemCount(talker, 1598) + gg.OwnItemCount(talker, 1599) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) == 1 && gg.OwnItemCount(talker, 1603) == 1 && gg.OwnItemCount(talker, 1593) == 0 && gg.OwnItemCount(talker, 1605) == 0 && gg.OwnItemCount(talker, 1604) == 1 && gg.OwnItemCount(talker, 1594) + gg.OwnItemCount(talker, 1595) + gg.OwnItemCount(talker, 1596) + gg.OwnItemCount(talker, 1597) + gg.OwnItemCount(talker, 1598) + gg.OwnItemCount(talker, 1599) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) == 1 && gg.GetMemoState(talker, 415) < 2 && gg.OwnItemCount(talker, 1603) == 1 && gg.OwnItemCount(talker, 1593) == 0 && gg.OwnItemCount(talker, 1605) == 1 && gg.OwnItemCount(talker, 1604) == 0 && gg.OwnItemCount(talker, 1594) + gg.OwnItemCount(talker, 1595) + gg.OwnItemCount(talker, 1596) + gg.OwnItemCount(talker, 1597) + gg.OwnItemCount(talker, 1598) + gg.OwnItemCount(talker, 1599) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) == 1 && gg.GetMemoState(talker, 415) < 2 && gg.OwnItemCount(talker, 1603) == 1 && gg.OwnItemCount(talker, 1593) == 0 && gg.OwnItemCount(talker, 1605) == 0 && gg.OwnItemCount(talker, 1604) == 0 && gg.OwnItemCount(talker, 1594) + gg.OwnItemCount(talker, 1595) + gg.OwnItemCount(talker, 1596) + gg.OwnItemCount(talker, 1597) + gg.OwnItemCount(talker, 1598) + gg.OwnItemCount(talker, 1599) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 4) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Long Live the Pa'agrio Lord (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) == 0) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "gantaki_zu_urutu_q0415_01.htm", 415);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) == 1 && gg.GetMemoState(talker, 415) == 2) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gantaki_zu_urutu_q0415_09c.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) == 1 && gg.OwnItemCount(talker, 1603) == 0 && gg.OwnItemCount(talker, 1593) == 1 && gg.OwnItemCount(talker, 1605) == 0 && gg.OwnItemCount(talker, 1604) == 0 && gg.OwnItemCount(talker, 1594) + gg.OwnItemCount(talker, 1595) + gg.OwnItemCount(talker, 1596) + gg.OwnItemCount(talker, 1597) + gg.OwnItemCount(talker, 1598) + gg.OwnItemCount(talker, 1599) == 0) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gantaki_zu_urutu_q0415_07.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) == 1 && gg.OwnItemCount(talker, 1603) == 0 && gg.OwnItemCount(talker, 1593) == 0 && gg.OwnItemCount(talker, 1605) == 0 && gg.OwnItemCount(talker, 1604) == 0 && gg.OwnItemCount(talker, 1594) + gg.OwnItemCount(talker, 1595) + gg.OwnItemCount(talker, 1596) + gg.OwnItemCount(talker, 1597) + gg.OwnItemCount(talker, 1598) + gg.OwnItemCount(talker, 1599) == 1) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gantaki_zu_urutu_q0415_08.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) == 1 && gg.OwnItemCount(talker, 1603) == 1 && gg.OwnItemCount(talker, 1593) == 0 && gg.OwnItemCount(talker, 1605) == 0 && gg.OwnItemCount(talker, 1604) == 1 && gg.OwnItemCount(talker, 1594) + gg.OwnItemCount(talker, 1595) + gg.OwnItemCount(talker, 1596) + gg.OwnItemCount(talker, 1597) + gg.OwnItemCount(talker, 1598) + gg.OwnItemCount(talker, 1599) == 0) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gantaki_zu_urutu_q0415_09a.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) == 1 && gg.GetMemoState(talker, 415) < 2 && gg.OwnItemCount(talker, 1603) == 1 && gg.OwnItemCount(talker, 1593) == 0 && gg.OwnItemCount(talker, 1605) == 1 && gg.OwnItemCount(talker, 1604) == 0 && gg.OwnItemCount(talker, 1594) + gg.OwnItemCount(talker, 1595) + gg.OwnItemCount(talker, 1596) + gg.OwnItemCount(talker, 1597) + gg.OwnItemCount(talker, 1598) + gg.OwnItemCount(talker, 1599) == 0) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gantaki_zu_urutu_q0415_10.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) == 1 && gg.GetMemoState(talker, 415) < 2 && gg.OwnItemCount(talker, 1603) == 1 && gg.OwnItemCount(talker, 1593) == 0 && gg.OwnItemCount(talker, 1605) == 0 && gg.OwnItemCount(talker, 1604) == 0 && gg.OwnItemCount(talker, 1594) + gg.OwnItemCount(talker, 1595) + gg.OwnItemCount(talker, 1596) + gg.OwnItemCount(talker, 1597) + gg.OwnItemCount(talker, 1598) + gg.OwnItemCount(talker, 1599) == 0) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gantaki_zu_urutu_q0415_11.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 4) == 1) {
myself.SetCurrentQuestID(4);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1546) < 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gantaki_zu_urutu_q0004_01.htm");
myself.GiveItem1(talker, 1546, 1);
if (gg.OwnItemCount(talker, 1541) + gg.OwnItemCount(talker, 1542) + gg.OwnItemCount(talker, 1543) + gg.OwnItemCount(talker, 1544) + gg.OwnItemCount(talker, 1545) + gg.OwnItemCount(talker, 1546) >= 5) {
myself.SetFlagJournal(talker, 4, 2);
myself.ShowQuestMark(talker, 4);

}
myself.SoundEffect(talker, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(talker, 1546) >= 1) {
myself.ShowPage(talker, "gantaki_zu_urutu_q0004_02.htm");

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
if (quest_id == 415) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 415);
gg.AddLog(1, talker, 415);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "gantaki_zu_urutu_q0415_06.htm", 415);
myself.GiveItem1(talker, 1593, 1);
myself.SetFlagJournal(talker, 415, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 415) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 415 && reply == 1) {
if (talker.occupation != 44) {
if (talker.occupation == 47) {
myself.ShowQuestPage(talker, "gantaki_zu_urutu_q0415_02a.htm", 415);

} else {
myself.ShowQuestPage(talker, "gantaki_zu_urutu_q0415_02.htm", 415);

}

} else if (talker.level < 18) {
myself.ShowQuestPage(talker, "gantaki_zu_urutu_q0415_03.htm", 415);

} else if (gg.OwnItemCount(talker, 1615) != 0) {
myself.ShowQuestPage(talker, "gantaki_zu_urutu_q0415_04.htm", 415);

} else {
myself.FHTML_SetFileName(fhtml0, "gantaki_zu_urutu_q0415_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 415);
myself.ShowQuestFHTML(talker, fhtml0, 415);

}

}
if (ask == 415 && reply == 2 && gg.HaveMemo(talker, 415) == 1 && gg.OwnItemCount(talker, 1603) == 1 && gg.OwnItemCount(talker, 1604) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gantaki_zu_urutu_q0415_09b.htm");
myself.DeleteItem1(talker, 1604, 1);
myself.GiveItem1(talker, 1605, 1);
myself.SetFlagJournal(talker, 415, 9);
myself.ShowQuestMark(talker, 415);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 415 && reply == 3 && gg.HaveMemo(talker, 415) == 1 && gg.OwnItemCount(talker, 1603) == 1 && gg.OwnItemCount(talker, 1604) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gantaki_zu_urutu_q0415_09c.htm");
myself.DeleteItem1(talker, 1604, 1);
myself.SetMemoState(talker, 415, 2);
myself.SetFlagJournal(talker, 415, 14);
myself.ShowQuestMark(talker, 415);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
super;
	}


}