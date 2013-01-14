package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_chief_croop extends master_lv3_ware {
	protected void TALK_SELECTED(HandlerParam c0, HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 3 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path to Becoming a Lord - Oren (In progress)");

}
if (gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 4 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path to Becoming a Lord - Oren (In progress)");

}
if (gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 5 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path to Becoming a Lord - Oren (In progress)");

}
if (gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 6 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path to Becoming a Lord - Oren (In progress)");

}
if (gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 7 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path to Becoming a Lord - Oren (In progress)");

}
if (gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 8 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path to Becoming a Lord - Oren (In progress)");

}
if (gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 9 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path to Becoming a Lord - Oren (In progress)");

}
if (gg.HaveMemo(talker, 192) == 0 && myself.GetOneTimeQuestFlag(talker, 192) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Seven Signs, Series of Doubt");

}
if (gg.HaveMemo(talker, 192) == 0 && myself.GetOneTimeQuestFlag(talker, 192) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Seven Signs, Series of Doubt (Done)");

}
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Seven Signs, Series of Doubt (In progress)");

}
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 2) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Seven Signs, Series of Doubt (In progress)");

}
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) > 2 && gg.GetMemoState(talker, 192) < 6) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Seven Signs, Series of Doubt (In progress)");

}
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 6) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Seven Signs, Series of Doubt (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 3 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(712);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_croop_q0712_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 4 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(712);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_croop_q0712_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 5 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(712);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_croop_q0712_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 6 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(712);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_croop_q0712_08.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 7 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(712);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13851) == 0) {
myself.GiveItem1(talker, 13851, 1);
myself.ShowPage(talker, "warehouse_chief_croop_q0712_10.htm");

} else {
myself.ShowPage(talker, "warehouse_chief_croop_q0712_11.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 8 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(712);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_croop_q0712_12.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 9 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(712);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_croop_q0712_14.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 192) == 0 && myself.GetOneTimeQuestFlag(talker, 192) == 0) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 79) {
myself.ShowQuestPage(talker, "warehouse_chief_croop_q0192_01.htm", 192);

} else {
myself.ShowQuestPage(talker, "warehouse_chief_croop_q0192_03.htm", 192);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 192) == 0 && myself.GetOneTimeQuestFlag(talker, 192) == 1) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_croop_q0192_02.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 1) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_croop_q0192_16.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 2) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 13813, 1);
myself.SetMemoState(talker, 192, 3);
myself.ShowPage(talker, "warehouse_chief_croop_q0192_07.htm");
myself.SetFlagJournal(talker, 192, 3);
myself.ShowQuestMark(talker, 192);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) > 2 && gg.GetMemoState(talker, 192) < 6) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_croop_q0192_09.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 6) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13814) >= 1) {
myself.ShowPage(talker, "warehouse_chief_croop_q0192_10.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam i0, HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 192) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 79 && gg.HaveMemo(talker, 192) == 0 && myself.GetOneTimeQuestFlag(talker, 192) == 0) {
myself.SetMemoState(talker, 192, 1);
myself.SetMemo(talker, quest_id);
myself.ShowPage(talker, "warehouse_chief_croop_q0192_05.htm");
myself.SetFlagJournal(talker, 192, 1);
myself.ShowQuestMark(talker, 192);
myself.SoundEffect(talker, "ItemSound.quest_middle");
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam c0, HandlerParam fhtml0, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 712) {
myself.SetCurrentQuestID(712);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 712) {
if (reply == 1) {
if (gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 3 && myself.IsMyLord(talker) == 1) {
myself.ShowPage(talker, "warehouse_chief_croop_q0712_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 3 && myself.IsMyLord(talker) == 1) {
myself.SetMemoState(talker, 712, 4);
myself.ShowPage(talker, "warehouse_chief_croop_q0712_03.htm");
myself.SetFlagJournal(talker, 712, 3);
myself.ShowQuestMark(talker, 712);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 6 && myself.IsMyLord(talker) == 1) {
myself.GiveItem1(talker, 13851, 1);
myself.SetMemoState(talker, 712, 7);
myself.ShowPage(talker, "warehouse_chief_croop_q0712_09.htm");
myself.SetFlagJournal(talker, 712, 6);
myself.ShowQuestMark(talker, 712);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 712) == 1 && gg.GetMemoState(talker, 712) == 8) {
myself.DeleteItem1(talker, 13851, gg.OwnItemCount(talker, 13851));
myself.SetMemoState(talker, 712, 9);
myself.ShowPage(talker, "warehouse_chief_croop_q0712_13.htm");
myself.SetFlagJournal(talker, 712, 8);
myself.ShowQuestMark(talker, 712);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 192) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 192) {
if (reply == 1) {
if (gg.HaveMemo(talker, 192) == 0 && myself.GetOneTimeQuestFlag(talker, 192) == 0) {
if (talker.level >= 79) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_croop_q0192_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 192);
myself.ShowQuestFHTML(talker, fhtml0, 192);

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 1) {
myself.SetMemoState(talker, 192, 2);
myself.SetFlagJournal(talker, 192, 2);
myself.ShowQuestMark(talker, 192);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.StartScenePlayer(talker, 8);

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 6) {
if (gg.OwnItemCount(talker, 13814) >= 1) {
myself.ShowPage(talker, "warehouse_chief_croop_q0192_11.htm");

}

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 6) {
if (gg.OwnItemCount(talker, 13814) >= 1) {
myself.ShowPage(talker, "warehouse_chief_croop_q0192_12.htm");

}

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 6) {
if (gg.OwnItemCount(talker, 13814) >= 1) {
myself.ShowPage(talker, "warehouse_chief_croop_q0192_13.htm");

}

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 6) {
if (gg.OwnItemCount(talker, 13814) >= 1) {
myself.ShowPage(talker, "warehouse_chief_croop_q0192_14.htm");

}

}

}
if (reply == 7) {
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 6) {
if (gg.OwnItemCount(talker, 13814) >= 1) {
myself.GiveItem1(talker, 13815, 1);
myself.DeleteItem1(talker, 13814, gg.OwnItemCount(talker, 13814));
myself.ShowPage(talker, "warehouse_chief_croop_q0192_15.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 192, 7);
myself.SetFlagJournal(talker, 192, 7);
myself.ShowQuestMark(talker, 192);

}

}

}

}
super;
	}


}