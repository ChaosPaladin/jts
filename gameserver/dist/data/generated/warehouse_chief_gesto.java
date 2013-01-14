package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_chief_gesto extends master_lv3_ware {
	protected void TALK_SELECTED(HandlerParam c0, HandlerParam c1, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) == 10 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "A Special Order (In Progress)");

}
if (gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) == 11 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "A Special Order (In Progress)");

}
if (gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) == 12 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "A Special Order (In Progress)");

}
if (gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) == 3 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path to Becoming a Lord - Giran (In progress)");

}
if (gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) > 3 && gg.GetMemoState(talker, 710) < 6 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path to Becoming a Lord - Giran (In progress)");

}
if (gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) > 5 && gg.GetMemoState(talker, 710) < 9 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path to Becoming a Lord - Giran (In progress)");

}
if (gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) == 9 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path to Becoming a Lord - Giran (In progress)");

}
if (myself.IsMyLord(talker) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Path to Becoming a Lord - Giran (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) == 10 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
myself.SetCurrentQuestID(40);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_gesto_q0040_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) == 11 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
myself.SetCurrentQuestID(40);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 5079) >= 10 && gg.OwnItemCount(talker, 5082) >= 10 && gg.OwnItemCount(talker, 5084) >= 10) {
myself.GiveItem1(talker, 12765, 1);
myself.DeleteItem1(talker, 5079, 40);
myself.DeleteItem1(talker, 5082, 40);
myself.DeleteItem1(talker, 5084, 40);
myself.SetMemoState(talker, 40, 12);
myself.ShowPage(talker, "warehouse_chief_gesto_q0040_05.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 40, 7);
myself.ShowQuestMark(talker, 40);

} else {
myself.ShowPage(talker, "warehouse_chief_gesto_q0040_04.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) == 12 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
myself.SetCurrentQuestID(40);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_gesto_q0040_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) == 3 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(710);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_gesto_q0710_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) > 3 && gg.GetMemoState(talker, 710) < 6 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(710);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_gesto_q0710_04.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) > 5 && gg.GetMemoState(talker, 710) < 9 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(710);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_gesto_q0710_05.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) == 9 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(710);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13013) >= 300) {
myself.DeleteItem1(talker, 13013, gg.OwnItemCount(talker, 13013));
myself.ShowPage(talker, "warehouse_chief_gesto_q0710_08.htm");
myself.SetFlagJournal(talker, 710, 9);
myself.ShowQuestMark(talker, 710);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 710, 10);

} else {
myself.ShowPage(talker, "warehouse_chief_gesto_q0710_09.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || myself.IsMyLord(talker) == 0) {
myself.SetCurrentQuestID(710);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (myself.IsMyLord(c0) == 1) {
if (gg.HaveMemo(c0, 710) == 1 && gg.GetMemoState(c0, 710) == 6) {
if (gg.OwnItemCount(talker, 13014) >= 1) {
i1 = talker.dbid;
myself.SetMemoState(c0, 710, 7);
myself.SetMemoStateEx(c0, 710, 1, i1);
myself.SetFlagJournal(c0, 710, 6);
myself.ShowQuestMark(c0, 710);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.ShowPage(talker, "warehouse_chief_gesto_q0710_06.htm");
myself.DeleteItem1(talker, 13014, gg.OwnItemCount(talker, 13014));

} else {
myself.ShowPage(talker, "warehouse_chief_gesto_q0710_06a.htm");

}

} else if (gg.HaveMemo(c0, 710) == 1 && gg.GetMemoState(c0, 710) > 6 && gg.GetMemoState(c0, 710) <= 8) {
myself.ShowPage(talker, "warehouse_chief_gesto_q0710_07.htm");

}

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

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 40) {
myself.SetCurrentQuestID(40);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 40) {
if (reply == 1) {
if (gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) == 10 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
myself.ShowPage(talker, "warehouse_chief_gesto_q0040_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) == 10 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
myself.SetMemoState(talker, 40, 11);
myself.ShowPage(talker, "warehouse_chief_gesto_q0040_03.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 40, 6);
myself.ShowQuestMark(talker, 40);

}

}

}
if (ask == 710) {
myself.SetCurrentQuestID(710);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 710) {
if (reply == 1) {
if (gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) == 3 && myself.IsMyLord(talker) == 1) {
myself.ShowPage(talker, "warehouse_chief_gesto_q0710_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) == 3 && myself.IsMyLord(talker) == 1) {
myself.SetMemoState(talker, 710, 4);
myself.ShowPage(talker, "warehouse_chief_gesto_q0710_03.htm");
myself.SetFlagJournal(talker, 710, 3);
myself.ShowQuestMark(talker, 710);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}