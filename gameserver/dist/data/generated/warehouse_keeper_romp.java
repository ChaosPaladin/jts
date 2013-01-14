package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_keeper_romp extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 386) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Stolen Dignity");

}
if (gg.HaveMemo(talker, 386) == 1 && gg.OwnItemCount(talker, 6363) < 100) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Stolen Dignity (In Progress)");

}
if (gg.HaveMemo(talker, 386) == 1 && gg.OwnItemCount(talker, 6363) >= 100) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Stolen Dignity (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 386) == 0) {
myself.SetCurrentQuestID(386);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 58) {
myself.ShowQuestPage(talker, "warehouse_keeper_romp_q0386_01.htm", 386);

} else {
myself.ShowPage(talker, "warehouse_keeper_romp_q0386_04.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 386) == 1 && gg.OwnItemCount(talker, 6363) < 100) {
myself.SetCurrentQuestID(386);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_romp_q0386_06.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 386) == 1 && gg.OwnItemCount(talker, 6363) >= 100) {
myself.SetCurrentQuestID(386);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_romp_q0386_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 386) {
myself.SetCurrentQuestID(386);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
gg.AddLog(1, talker, 386);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "warehouse_keeper_romp_q0386_05.htm", 386);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam reply, HandlerParam talker) {
if (ask == 386) {
myself.SetCurrentQuestID(386);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 386) {
if (reply == 3) {
myself.ShowQuestPage(talker, "warehouse_keeper_romp_q0386_09a.htm", 386);

}
if (reply == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 386);
myself.ShowQuestFHTML(talker, fhtml0, 386);

}
if (reply == 6) {
myself.RemoveMemo(talker, 386);
gg.AddLog(2, talker, 386);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "warehouse_keeper_romp_q0386_08.htm");

}
if (reply == 9) {
myself.ShowPage(talker, "warehouse_keeper_romp_q0386_09.htm");

}
if (reply == 8) {
if (gg.HaveMemo(talker, 386) == 1 && gg.OwnItemCount(talker, 6363) >= 100) {
myself.DeleteItem1(talker, 6363, 100);
gg.AddLog(3, talker, 386);
myself.ClearBingoBoard(talker);
myself.CreateBingoBoard(talker, 3);
myself.ShowPage(talker, "warehouse_keeper_romp_q0386_12.htm");

} else if (gg.HaveMemo(talker, 386) == 1 && gg.OwnItemCount(talker, 6363) < 100) {
myself.ShowPage(talker, "warehouse_keeper_romp_q0386_11.htm");

}

}
if (reply == 10) {
myself.SelectBingoNumber(talker, 1);
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_13.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}
if (reply == 11) {
myself.SelectBingoNumber(talker, 2);
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_13.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}
if (reply == 12) {
myself.SelectBingoNumber(talker, 3);
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_13.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}
if (reply == 13) {
myself.SelectBingoNumber(talker, 4);
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_13.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}
if (reply == 14) {
myself.SelectBingoNumber(talker, 5);
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_13.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}
if (reply == 15) {
myself.SelectBingoNumber(talker, 6);
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_13.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}
if (reply == 16) {
myself.SelectBingoNumber(talker, 7);
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_13.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}
if (reply == 17) {
myself.SelectBingoNumber(talker, 8);
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_13.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}
if (reply == 18) {
myself.SelectBingoNumber(talker, 9);
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_13.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}
if (reply == 19) {
if (myself.IsSelectedBingoNumber(talker, 1) != 1) {
myself.SelectBingoNumber(talker, 1);
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_20.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

} else {
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 1) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_21.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 20) {
if (myself.IsSelectedBingoNumber(talker, 2) != 1) {
myself.SelectBingoNumber(talker, 2);
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_20.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

} else {
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 1) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_21.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 21) {
if (myself.IsSelectedBingoNumber(talker, 3) != 1) {
myself.SelectBingoNumber(talker, 3);
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_20.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

} else {
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 1) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_21.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 22) {
if (myself.IsSelectedBingoNumber(talker, 4) != 1) {
myself.SelectBingoNumber(talker, 4);
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_20.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

} else {
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 1) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_21.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 23) {
if (myself.IsSelectedBingoNumber(talker, 5) != 1) {
myself.SelectBingoNumber(talker, 5);
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_20.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

} else {
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 1) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_21.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 24) {
if (myself.IsSelectedBingoNumber(talker, 6) != 1) {
myself.SelectBingoNumber(talker, 6);
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_20.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

} else {
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 1) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_21.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 25) {
if (myself.IsSelectedBingoNumber(talker, 7) != 1) {
myself.SelectBingoNumber(talker, 7);
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_20.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

} else {
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 1) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_21.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 26) {
if (myself.IsSelectedBingoNumber(talker, 8) != 1) {
myself.SelectBingoNumber(talker, 8);
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_20.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

} else {
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 1) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_21.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 27) {
if (myself.IsSelectedBingoNumber(talker, 9) != 1) {
myself.SelectBingoNumber(talker, 9);
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_20.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

} else {
i3 = myself.GetBingoSelectCount(talker);
if (i3 == 1) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_21.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 55) {
if (myself.IsSelectedBingoNumber(talker, 1) != 1) {
myself.SelectBingoNumber(talker, 1);
i3 = myself.GetMatchedBingoLineCount(talker);
if (i3 == 3 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 4);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 4);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 4);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 4);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 4);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 4);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 4);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 4);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 4);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 4);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 4);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 4);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 4);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 4);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 4);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 4);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 4);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 4);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 4);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 4);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 4);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 4);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 4);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 4);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 4);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 4);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 4);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 4);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 4);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 4);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 4);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 4);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 4);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 10);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 10);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 10);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 10);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 10);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 10);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 10);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 10);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 10);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 10);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 10);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 10);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 10);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 10);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 10);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 10);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 10);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 10);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 10);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 10);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 10);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 10);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 10);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 10);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 10);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 10);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 10);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 10);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 10);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 10);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 10);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 10);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 10);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_23.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ff0000");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ffffff");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

}

}
myself.ShowFHTML(talker, fhtml0);
myself.ClearBingoBoard(talker);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_25.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 56) {
if (myself.IsSelectedBingoNumber(talker, 2) != 1) {
myself.SelectBingoNumber(talker, 2);
i3 = myself.GetMatchedBingoLineCount(talker);
if (i3 == 3 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 4);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 4);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 4);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 4);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 4);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 4);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 4);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 4);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 4);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 4);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 4);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 4);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 4);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 4);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 4);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 4);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 4);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 4);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 4);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 4);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 4);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 4);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 4);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 4);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 4);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 4);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 4);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 4);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 4);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 4);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 4);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 4);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 4);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 10);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 10);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 10);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 10);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 10);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 10);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 10);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 10);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 10);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 10);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 10);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 10);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 10);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 10);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 10);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 10);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 10);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 10);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 10);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 10);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 10);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 10);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 10);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 10);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 10);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 10);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 10);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 10);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 10);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 10);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 10);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 10);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 10);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_23.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ff0000");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ffffff");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

}

}
myself.ShowFHTML(talker, fhtml0);
myself.ClearBingoBoard(talker);
myself.SetMemoState(talker, 386, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_25.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 57) {
if (myself.IsSelectedBingoNumber(talker, 3) != 1) {
myself.SelectBingoNumber(talker, 3);
i3 = myself.GetMatchedBingoLineCount(talker);
if (i3 == 3 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 4);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 4);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 4);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 4);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 4);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 4);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 4);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 4);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 4);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 4);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 4);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 4);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 4);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 4);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 4);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 4);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 4);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 4);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 4);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 4);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 4);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 4);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 4);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 4);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 4);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 4);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 4);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 4);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 4);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 4);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 4);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 4);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 4);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 10);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 10);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 10);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 10);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 10);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 10);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 10);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 10);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 10);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 10);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 10);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 10);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 10);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 10);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 10);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 10);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 10);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 10);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 10);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 10);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 10);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 10);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 10);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 10);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 10);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 10);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 10);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 10);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 10);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 10);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 10);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 10);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 10);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 4);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 4);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 4);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 4);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 4);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 4);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 4);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 4);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 4);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 4);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 4);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_23.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ff0000");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ffffff");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

}

}
myself.ShowFHTML(talker, fhtml0);
myself.ClearBingoBoard(talker);
myself.SetMemoState(talker, 386, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_25.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 58) {
if (myself.IsSelectedBingoNumber(talker, 4) != 1) {
myself.SelectBingoNumber(talker, 4);
i3 = myself.GetMatchedBingoLineCount(talker);
if (i3 == 3 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 4);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 4);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 4);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 4);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 4);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 4);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 4);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 4);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 4);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 4);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 4);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 4);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 4);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 4);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 4);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 4);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 4);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 4);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 4);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 4);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 4);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 4);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 4);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 4);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 4);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 4);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 4);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 4);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 4);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 4);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 4);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 4);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 4);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 10);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 10);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 10);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 10);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 10);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 10);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 10);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 10);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 10);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 10);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 10);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 10);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 10);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 10);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 10);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 10);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 10);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 10);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 10);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 10);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 10);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 10);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 10);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 10);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 10);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 10);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 10);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 10);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 10);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 10);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 10);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 10);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 10);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_23.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ff0000");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ffffff");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

}

}
myself.ShowFHTML(talker, fhtml0);
myself.ClearBingoBoard(talker);
myself.SetMemoState(talker, 386, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_25.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 59) {
if (myself.IsSelectedBingoNumber(talker, 5) != 1) {
myself.SelectBingoNumber(talker, 5);
i3 = myself.GetMatchedBingoLineCount(talker);
if (i3 == 3 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 4);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 4);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 4);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 4);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 4);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 4);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 4);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 4);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 4);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 4);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 4);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 4);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 4);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 4);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 4);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 4);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 4);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 4);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 4);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 4);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 4);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 4);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 4);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 4);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 4);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 4);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 4);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 4);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 4);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 4);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 4);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 4);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 4);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 10);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 10);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 10);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 10);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 10);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 10);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 10);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 10);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 10);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 10);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 10);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 10);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 10);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 10);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 10);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 10);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 10);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 10);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 10);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 10);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 10);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 10);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 10);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 10);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 10);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 10);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 10);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 10);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 10);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 10);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 10);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 10);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 10);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_23.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ff0000");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ffffff");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

}

}
myself.ShowFHTML(talker, fhtml0);
myself.ClearBingoBoard(talker);
myself.SetMemoState(talker, 386, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_25.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 60) {
if (myself.IsSelectedBingoNumber(talker, 6) != 1) {
myself.SelectBingoNumber(talker, 6);
i3 = myself.GetMatchedBingoLineCount(talker);
if (i3 == 3 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 4);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 4);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 4);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 4);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 4);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 4);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 4);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 4);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 4);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 4);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 4);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 4);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 4);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 4);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 4);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 4);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 4);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 4);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 4);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 4);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 4);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 4);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 4);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 4);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 4);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 4);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 4);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 4);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 4);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 4);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 4);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 4);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 4);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 10);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 10);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 10);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 10);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 10);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 10);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 10);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 10);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 10);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 10);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 10);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 10);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 10);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 10);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 10);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 10);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 10);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 10);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 10);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 10);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 10);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 10);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 10);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 10);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 10);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 10);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 10);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 10);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 10);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 10);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 10);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 10);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 10);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_23.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ff0000");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ffffff");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

}

}
myself.ShowFHTML(talker, fhtml0);
myself.ClearBingoBoard(talker);
myself.SetMemoState(talker, 386, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_25.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 61) {
if (myself.IsSelectedBingoNumber(talker, 7) != 1) {
myself.SelectBingoNumber(talker, 7);
i3 = myself.GetMatchedBingoLineCount(talker);
if (i3 == 3 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 4);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 4);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 4);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 4);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 4);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 4);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 4);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 4);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 4);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 4);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 4);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 4);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 4);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 4);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 4);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 4);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 4);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 4);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 4);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 4);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 4);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 4);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 4);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 4);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 4);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 4);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 4);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 4);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 4);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 4);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 4);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 4);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 4);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 10);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 10);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 10);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 10);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 10);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 10);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 10);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 10);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 10);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 10);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 10);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 10);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 10);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 10);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 10);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 10);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 10);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 10);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 10);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 10);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 10);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 10);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 10);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 10);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 10);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 10);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 10);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 10);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 10);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 10);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 10);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 10);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 10);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_23.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ff0000");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ffffff");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

}

}
myself.ShowFHTML(talker, fhtml0);
myself.ClearBingoBoard(talker);
myself.SetMemoState(talker, 386, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_25.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 62) {
if (myself.IsSelectedBingoNumber(talker, 8) != 1) {
myself.SelectBingoNumber(talker, 8);
i3 = myself.GetMatchedBingoLineCount(talker);
if (i3 == 3 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 4);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 4);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 4);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 4);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 4);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 4);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 4);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 4);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 4);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 4);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 4);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 4);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 4);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 4);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 4);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 4);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 4);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 4);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 4);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 4);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 4);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 4);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 4);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 4);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 4);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 4);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 4);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 4);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 4);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 4);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 4);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 4);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 4);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 10);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 10);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 10);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 10);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 10);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 10);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 10);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 10);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 10);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 10);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 10);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 10);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 10);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 10);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 10);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 10);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 10);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 10);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 10);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 10);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 10);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 10);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 10);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 10);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 10);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 10);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 10);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 10);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 10);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 10);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 10);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 10);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 10);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_23.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ff0000");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ffffff");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

}

}
myself.ShowFHTML(talker, fhtml0);
myself.ClearBingoBoard(talker);
myself.SetMemoState(talker, 386, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_25.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 63) {
if (myself.IsSelectedBingoNumber(talker, 9) != 1) {
myself.SelectBingoNumber(talker, 9);
i3 = myself.GetMatchedBingoLineCount(talker);
if (i3 == 3 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 4);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 4);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 4);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 4);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 4);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 4);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 4);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 4);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 4);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 4);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 4);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 4);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 4);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 4);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 4);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 4);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 4);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 4);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 4);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 4);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 4);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 4);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 4);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 4);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 4);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 4);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 4);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 4);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 4);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 4);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 4);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 4);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 4);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
i4 = gg.Rand(33);
if (i4 == 0) {
myself.GiveItem1(talker, 5529, 10);

} else if (i4 == 1) {
myself.GiveItem1(talker, 5532, 10);

} else if (i4 == 2) {
myself.GiveItem1(talker, 5533, 10);

} else if (i4 == 3) {
myself.GiveItem1(talker, 5534, 10);

} else if (i4 == 4) {
myself.GiveItem1(talker, 5535, 10);

} else if (i4 == 5) {
myself.GiveItem1(talker, 5536, 10);

} else if (i4 == 6) {
myself.GiveItem1(talker, 5537, 10);

} else if (i4 == 7) {
myself.GiveItem1(talker, 5538, 10);

} else if (i4 == 8) {
myself.GiveItem1(talker, 5539, 10);

} else if (i4 == 9) {
myself.GiveItem1(talker, 5541, 10);

} else if (i4 == 10) {
myself.GiveItem1(talker, 5542, 10);

} else if (i4 == 11) {
myself.GiveItem1(talker, 5543, 10);

} else if (i4 == 12) {
myself.GiveItem1(talker, 5544, 10);

} else if (i4 == 13) {
myself.GiveItem1(talker, 5545, 10);

} else if (i4 == 14) {
myself.GiveItem1(talker, 5546, 10);

} else if (i4 == 15) {
myself.GiveItem1(talker, 5547, 10);

} else if (i4 == 16) {
myself.GiveItem1(talker, 5548, 10);

} else if (i4 == 17) {
myself.GiveItem1(talker, 8331, 10);

} else if (i4 == 18) {
myself.GiveItem1(talker, 8341, 10);

} else if (i4 == 19) {
myself.GiveItem1(talker, 8342, 10);

} else if (i4 == 20) {
myself.GiveItem1(talker, 8349, 10);

} else if (i4 == 21) {
myself.GiveItem1(talker, 8346, 10);

} else if (i4 == 22) {
myself.GiveItem1(talker, 8712, 10);

} else if (i4 == 23) {
myself.GiveItem1(talker, 8713, 10);

} else if (i4 == 24) {
myself.GiveItem1(talker, 8714, 10);

} else if (i4 == 25) {
myself.GiveItem1(talker, 8715, 10);

} else if (i4 == 26) {
myself.GiveItem1(talker, 8716, 10);

} else if (i4 == 27) {
myself.GiveItem1(talker, 8717, 10);

} else if (i4 == 28) {
myself.GiveItem1(talker, 8718, 10);

} else if (i4 == 29) {
myself.GiveItem1(talker, 8719, 10);

} else if (i4 == 30) {
myself.GiveItem1(talker, 8720, 10);

} else if (i4 == 31) {
myself.GiveItem1(talker, 8721, 10);

} else if (i4 == 32) {
myself.GiveItem1(talker, 8722, 10);

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_23.htm");

}
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ff0000");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "FontColor" + i0 + 1, "ffffff");
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

}

}
myself.ShowFHTML(talker, fhtml0);
myself.ClearBingoBoard(talker);
myself.SetMemoState(talker, 386, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_romp_q0386_25.htm");
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
i1 = myself.GetNumberFromBingoBoard(talker, i0);
if (myself.IsSelectedBingoNumber(talker, i1) == 1) {
myself.FHTML_SetInt(fhtml0, "Cell" + i0 + 1, i1);

} else {
myself.FHTML_SetStr(fhtml0, "Cell" + i0 + 1, "?");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}

}
super;
	}


}