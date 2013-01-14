package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_chief_baxt extends master_lv3_ware {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 384) == 1 && gg.OwnItemCount(talker, 5964) < 10) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Warehouse Keeper's Pastime (In Progress)");

}
if (gg.HaveMemo(talker, 384) == 1 && gg.OwnItemCount(talker, 5964) >= 10) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Warehouse Keeper's Pastime (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 384) == 1 && gg.OwnItemCount(talker, 5964) < 10) {
myself.SetCurrentQuestID(384);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_baxt_q0384_06.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 384) == 1 && gg.OwnItemCount(talker, 5964) >= 10) {
myself.SetCurrentQuestID(384);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_baxt_q0384_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam reply, HandlerParam talker) {
if (ask == 384) {
myself.SetCurrentQuestID(384);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 384) {
if (reply == 3) {
myself.ShowPage(talker, "warehouse_chief_baxt_q0384_09a.htm");

}
if (reply == 6) {
myself.DeleteItem1(talker, 5964, gg.OwnItemCount(talker, 5964));
myself.RemoveMemo(talker, 384);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "warehouse_chief_baxt_q0384_08.htm");

}
if (reply == 9) {
myself.ShowPage(talker, "warehouse_chief_baxt_q0384_09.htm");

}
if (reply == 7) {
if (gg.HaveMemo(talker, 384) == 1 && gg.OwnItemCount(talker, 5964) >= 10) {
myself.DeleteItem1(talker, 5964, 10);
myself.SetMemoState(talker, 384, 10);
myself.ClearBingoBoard(talker);
myself.CreateBingoBoard(talker, 3);
myself.ShowPage(talker, "warehouse_chief_baxt_q0384_10.htm");

} else if (gg.HaveMemo(talker, 384) == 1 && gg.OwnItemCount(talker, 5964) < 10) {
myself.ShowPage(talker, "warehouse_chief_baxt_q0384_11.htm");

}

}
if (reply == 8) {
if (gg.HaveMemo(talker, 384) == 1 && gg.OwnItemCount(talker, 5964) >= 100) {
myself.DeleteItem1(talker, 5964, 100);
myself.SetMemoState(talker, 384, 20);
myself.ClearBingoBoard(talker);
myself.CreateBingoBoard(talker, 3);
myself.ShowPage(talker, "warehouse_chief_baxt_q0384_12.htm");

} else if (gg.HaveMemo(talker, 384) == 1 && gg.OwnItemCount(talker, 5964) < 100) {
myself.ShowPage(talker, "warehouse_chief_baxt_q0384_11.htm");

}

}
if (reply == 10) {
myself.SelectBingoNumber(talker, 1);
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_13.htm");
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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_13.htm");
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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_13.htm");
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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_13.htm");
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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_13.htm");
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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_13.htm");
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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_13.htm");
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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_13.htm");
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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_13.htm");
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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_20.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_21.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_20.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_21.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_20.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_21.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_20.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_21.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_20.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_21.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_20.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_21.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_20.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_21.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_20.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_21.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_14.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_16.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_18.htm");

} else if (i3 == 5) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_20.htm");

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
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_15.htm");

} else if (i3 == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_17.htm");

} else if (i3 == 3) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_19.htm");

} else if (i3 == 4) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_21.htm");

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
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 16) {
myself.GiveItem1(talker, 1888, 1);

} else if (i4 < 32) {
myself.GiveItem1(talker, 1887, 1);

} else if (i4 < 50) {
myself.GiveItem1(talker, 1894, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 89) {
myself.GiveItem1(talker, 1890, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1893, 1);

} else {
myself.GiveItem1(talker, 951, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 883, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 852, 1);

} else {
myself.GiveItem1(talker, 401, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 4041, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1892, 1);

} else {
myself.GiveItem1(talker, 917, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 500, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 2437, 1);
myself.GiveItem1(talker, 2463, 1);

} else {
myself.GiveItem1(talker, 135, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_23.htm");

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
myself.SetMemoState(talker, 384, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_25.htm");
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
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 16) {
myself.GiveItem1(talker, 1888, 1);

} else if (i4 < 32) {
myself.GiveItem1(talker, 1887, 1);

} else if (i4 < 50) {
myself.GiveItem1(talker, 1894, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 89) {
myself.GiveItem1(talker, 1890, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1893, 1);

} else {
myself.GiveItem1(talker, 951, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 883, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 852, 1);

} else {
myself.GiveItem1(talker, 401, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 4041, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1892, 1);

} else {
myself.GiveItem1(talker, 917, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 500, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 2437, 1);
myself.GiveItem1(talker, 2463, 1);

} else {
myself.GiveItem1(talker, 135, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_23.htm");

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
myself.SetMemoState(talker, 384, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_25.htm");
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
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 16) {
myself.GiveItem1(talker, 1888, 1);

} else if (i4 < 32) {
myself.GiveItem1(talker, 1887, 1);

} else if (i4 < 50) {
myself.GiveItem1(talker, 1894, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 89) {
myself.GiveItem1(talker, 1890, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1893, 1);

} else {
myself.GiveItem1(talker, 951, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 883, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 852, 1);

} else {
myself.GiveItem1(talker, 401, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 4041, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1892, 1);

} else {
myself.GiveItem1(talker, 917, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 500, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 2437, 1);
myself.GiveItem1(talker, 2463, 1);

} else {
myself.GiveItem1(talker, 135, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_23.htm");

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
myself.SetMemoState(talker, 384, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_25.htm");
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
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 16) {
myself.GiveItem1(talker, 1888, 1);

} else if (i4 < 32) {
myself.GiveItem1(talker, 1887, 1);

} else if (i4 < 50) {
myself.GiveItem1(talker, 1894, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 89) {
myself.GiveItem1(talker, 1890, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1893, 1);

} else {
myself.GiveItem1(talker, 951, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 883, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 852, 1);

} else {
myself.GiveItem1(talker, 401, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 4041, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1892, 1);

} else {
myself.GiveItem1(talker, 917, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 500, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 2437, 1);
myself.GiveItem1(talker, 2463, 1);

} else {
myself.GiveItem1(talker, 135, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_23.htm");

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
myself.SetMemoState(talker, 384, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_25.htm");
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
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 16) {
myself.GiveItem1(talker, 1888, 1);

} else if (i4 < 32) {
myself.GiveItem1(talker, 1887, 1);

} else if (i4 < 50) {
myself.GiveItem1(talker, 1894, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 89) {
myself.GiveItem1(talker, 1890, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1893, 1);

} else {
myself.GiveItem1(talker, 951, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 883, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 852, 1);

} else {
myself.GiveItem1(talker, 401, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 4041, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1892, 1);

} else {
myself.GiveItem1(talker, 917, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 500, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 2437, 1);
myself.GiveItem1(talker, 2463, 1);

} else {
myself.GiveItem1(talker, 135, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_23.htm");

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
myself.SetMemoState(talker, 384, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_25.htm");
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
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 16) {
myself.GiveItem1(talker, 1888, 1);

} else if (i4 < 32) {
myself.GiveItem1(talker, 1887, 1);

} else if (i4 < 50) {
myself.GiveItem1(talker, 1894, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 89) {
myself.GiveItem1(talker, 1890, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1893, 1);

} else {
myself.GiveItem1(talker, 951, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 883, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 852, 1);

} else {
myself.GiveItem1(talker, 401, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 4041, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1892, 1);

} else {
myself.GiveItem1(talker, 917, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 500, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 2437, 1);
myself.GiveItem1(talker, 2463, 1);

} else {
myself.GiveItem1(talker, 135, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_23.htm");

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
myself.SetMemoState(talker, 384, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_25.htm");
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
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 16) {
myself.GiveItem1(talker, 1888, 1);

} else if (i4 < 32) {
myself.GiveItem1(talker, 1887, 1);

} else if (i4 < 50) {
myself.GiveItem1(talker, 1894, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 89) {
myself.GiveItem1(talker, 1890, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1893, 1);

} else {
myself.GiveItem1(talker, 951, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 883, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 852, 1);

} else {
myself.GiveItem1(talker, 401, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 4041, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1892, 1);

} else {
myself.GiveItem1(talker, 917, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 500, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 2437, 1);
myself.GiveItem1(talker, 2463, 1);

} else {
myself.GiveItem1(talker, 135, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_23.htm");

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
myself.SetMemoState(talker, 384, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_25.htm");
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
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 16) {
myself.GiveItem1(talker, 1888, 1);

} else if (i4 < 32) {
myself.GiveItem1(talker, 1887, 1);

} else if (i4 < 50) {
myself.GiveItem1(talker, 1894, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 89) {
myself.GiveItem1(talker, 1890, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1893, 1);

} else {
myself.GiveItem1(talker, 951, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 883, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 852, 1);

} else {
myself.GiveItem1(talker, 401, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 4041, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1892, 1);

} else {
myself.GiveItem1(talker, 917, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 500, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 2437, 1);
myself.GiveItem1(talker, 2463, 1);

} else {
myself.GiveItem1(talker, 135, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_23.htm");

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
myself.SetMemoState(talker, 384, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_25.htm");
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
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 16) {
myself.GiveItem1(talker, 1888, 1);

} else if (i4 < 32) {
myself.GiveItem1(talker, 1887, 1);

} else if (i4 < 50) {
myself.GiveItem1(talker, 1894, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 89) {
myself.GiveItem1(talker, 1890, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1893, 1);

} else {
myself.GiveItem1(talker, 951, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 883, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 852, 1);

} else {
myself.GiveItem1(talker, 401, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_22.htm");

} else if (i3 == 0 && myself.GetBingoSelectCount(talker) == 6) {
if (gg.GetMemoState(talker, 384) == 10) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 4041, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 952, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 1892, 1);

} else {
myself.GiveItem1(talker, 917, 1);

}

} else if (gg.GetMemoState(talker, 384) == 20) {
i4 = gg.Rand(100);
if (i4 < 50) {
myself.GiveItem1(talker, 951, 1);

} else if (i4 < 80) {
myself.GiveItem1(talker, 500, 1);

} else if (i4 < 98) {
myself.GiveItem1(talker, 2437, 1);
myself.GiveItem1(talker, 2463, 1);

} else {
myself.GiveItem1(talker, 135, 1);

}

}
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_24.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_23.htm");

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
myself.SetMemoState(talker, 384, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_baxt_q0384_25.htm");
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