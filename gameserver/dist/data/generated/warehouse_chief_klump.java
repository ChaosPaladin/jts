package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_chief_klump extends master_lv3_ware {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 662) == 0 && talker.level >= 61) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "A Game of Cards");

}
if (gg.HaveMemo(talker, 662) == 0 && talker.level < 61) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "A Game of Cards");

}
if (gg.HaveMemo(talker, 662) == 1 && gg.GetMemoState(talker, 662) == 0 && gg.GetMemoStateEx(talker, 662, 1) == 0 && gg.OwnItemCount(talker, 8765) < 50) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "A Game of Cards (In Progress)");

}
if (gg.HaveMemo(talker, 662) == 1 && gg.GetMemoState(talker, 662) == 0 && gg.GetMemoStateEx(talker, 662, 1) == 0 && gg.OwnItemCount(talker, 8765) >= 50) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "A Game of Cards (In Progress)");

}
if (gg.HaveMemo(talker, 662) == 1 && gg.GetMemoState(talker, 662) != 0 || gg.GetMemoStateEx(talker, 662, 1) != 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "A Game of Cards (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 662) == 0 && talker.level >= 61) {
myself.SetCurrentQuestID(662);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_klump_q0662_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 662);
myself.ShowQuestFHTML(talker, fhtml0, 662);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 662) == 0 && talker.level < 61) {
myself.SetCurrentQuestID(662);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_klump_q0662_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 662) == 1 && gg.GetMemoState(talker, 662) == 0 && gg.GetMemoStateEx(talker, 662, 1) == 0 && gg.OwnItemCount(talker, 8765) < 50) {
myself.SetCurrentQuestID(662);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_klump_q0662_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 662) == 1 && gg.GetMemoState(talker, 662) == 0 && gg.GetMemoStateEx(talker, 662, 1) == 0 && gg.OwnItemCount(talker, 8765) >= 50) {
myself.SetCurrentQuestID(662);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_chief_klump_q0662_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 662) == 1 && gg.GetMemoState(talker, 662) != 0 || gg.GetMemoStateEx(talker, 662, 1) != 0) {
myself.SetCurrentQuestID(662);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.GetMemoState(talker, 662);
i1 = gg.GetMemoStateEx(talker, 662, 1);
i5 = i1 % 100;
i9 = i1 / 100;
i1 = i0 % 100;
i2 = i0 % 10000 / 100;
i3 = i0 % 1000000 / 10000;
i4 = i0 % 100000000 / 1000000;
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_klump_q0662_11a.htm");
if (i9 % 2 < 1) {
myself.FHTML_SetStr(fhtml0, "FontColor1", "ffff00");
myself.FHTML_SetStr(fhtml0, "Cell1", "?");

} else {
myself.FHTML_SetStr(fhtml0, "FontColor1", "ff6f6f");
if (i1 == 1) {
myself.FHTML_SetStr(fhtml0, "Cell1", "!");

} else if (i1 == 2) {
myself.FHTML_SetStr(fhtml0, "Cell1", "=");

} else if (i1 == 3) {
myself.FHTML_SetStr(fhtml0, "Cell1", "T");

} else if (i1 == 4) {
myself.FHTML_SetStr(fhtml0, "Cell1", "V");

} else if (i1 == 5) {
myself.FHTML_SetStr(fhtml0, "Cell1", "O");

} else if (i1 == 6) {
myself.FHTML_SetStr(fhtml0, "Cell1", "P");

} else if (i1 == 7) {
myself.FHTML_SetStr(fhtml0, "Cell1", "S");

} else if (i1 == 8) {
myself.FHTML_SetStr(fhtml0, "Cell1", "E");

} else if (i1 == 9) {
myself.FHTML_SetStr(fhtml0, "Cell1", "H");

} else if (i1 == 10) {
myself.FHTML_SetStr(fhtml0, "Cell1", "A");

} else if (i1 == 11) {
myself.FHTML_SetStr(fhtml0, "Cell1", "R");

} else if (i1 == 12) {
myself.FHTML_SetStr(fhtml0, "Cell1", "D");

} else if (i1 == 13) {
myself.FHTML_SetStr(fhtml0, "Cell1", "I");

} else if (i1 == 14) {
myself.FHTML_SetStr(fhtml0, "Cell1", "N");

}

}
if (i9 % 4 < 2) {
myself.FHTML_SetStr(fhtml0, "FontColor2", "ffff00");
myself.FHTML_SetStr(fhtml0, "Cell2", "?");

} else {
myself.FHTML_SetStr(fhtml0, "FontColor2", "ff6f6f");
if (i2 == 1) {
myself.FHTML_SetStr(fhtml0, "Cell2", "!");

} else if (i2 == 2) {
myself.FHTML_SetStr(fhtml0, "Cell2", "=");

} else if (i2 == 3) {
myself.FHTML_SetStr(fhtml0, "Cell2", "T");

} else if (i2 == 4) {
myself.FHTML_SetStr(fhtml0, "Cell2", "V");

} else if (i2 == 5) {
myself.FHTML_SetStr(fhtml0, "Cell2", "O");

} else if (i2 == 6) {
myself.FHTML_SetStr(fhtml0, "Cell2", "P");

} else if (i2 == 7) {
myself.FHTML_SetStr(fhtml0, "Cell2", "S");

} else if (i2 == 8) {
myself.FHTML_SetStr(fhtml0, "Cell2", "E");

} else if (i2 == 9) {
myself.FHTML_SetStr(fhtml0, "Cell2", "H");

} else if (i2 == 10) {
myself.FHTML_SetStr(fhtml0, "Cell2", "A");

} else if (i2 == 11) {
myself.FHTML_SetStr(fhtml0, "Cell2", "R");

} else if (i2 == 12) {
myself.FHTML_SetStr(fhtml0, "Cell2", "D");

} else if (i2 == 13) {
myself.FHTML_SetStr(fhtml0, "Cell2", "I");

} else if (i2 == 14) {
myself.FHTML_SetStr(fhtml0, "Cell2", "N");

}

}
if (i9 % 8 < 4) {
myself.FHTML_SetStr(fhtml0, "FontColor3", "ffff00");
myself.FHTML_SetStr(fhtml0, "Cell3", "?");

} else {
myself.FHTML_SetStr(fhtml0, "FontColor3", "ff6f6f");
if (i3 == 1) {
myself.FHTML_SetStr(fhtml0, "Cell3", "!");

} else if (i3 == 2) {
myself.FHTML_SetStr(fhtml0, "Cell3", "=");

} else if (i3 == 3) {
myself.FHTML_SetStr(fhtml0, "Cell3", "T");

} else if (i3 == 4) {
myself.FHTML_SetStr(fhtml0, "Cell3", "V");

} else if (i3 == 5) {
myself.FHTML_SetStr(fhtml0, "Cell3", "O");

} else if (i3 == 6) {
myself.FHTML_SetStr(fhtml0, "Cell3", "P");

} else if (i3 == 7) {
myself.FHTML_SetStr(fhtml0, "Cell3", "S");

} else if (i3 == 8) {
myself.FHTML_SetStr(fhtml0, "Cell3", "E");

} else if (i3 == 9) {
myself.FHTML_SetStr(fhtml0, "Cell3", "H");

} else if (i3 == 10) {
myself.FHTML_SetStr(fhtml0, "Cell3", "A");

} else if (i3 == 11) {
myself.FHTML_SetStr(fhtml0, "Cell3", "R");

} else if (i3 == 12) {
myself.FHTML_SetStr(fhtml0, "Cell3", "D");

} else if (i3 == 13) {
myself.FHTML_SetStr(fhtml0, "Cell3", "I");

} else if (i3 == 14) {
myself.FHTML_SetStr(fhtml0, "Cell3", "N");

}

}
if (i9 % 16 < 8) {
myself.FHTML_SetStr(fhtml0, "FontColor4", "ffff00");
myself.FHTML_SetStr(fhtml0, "Cell4", "?");

} else {
myself.FHTML_SetStr(fhtml0, "FontColor4", "ff6f6f");
if (i4 == 1) {
myself.FHTML_SetStr(fhtml0, "Cell4", "!");

} else if (i4 == 2) {
myself.FHTML_SetStr(fhtml0, "Cell4", "=");

} else if (i4 == 3) {
myself.FHTML_SetStr(fhtml0, "Cell4", "T");

} else if (i4 == 4) {
myself.FHTML_SetStr(fhtml0, "Cell4", "V");

} else if (i4 == 5) {
myself.FHTML_SetStr(fhtml0, "Cell4", "O");

} else if (i4 == 6) {
myself.FHTML_SetStr(fhtml0, "Cell4", "P");

} else if (i4 == 7) {
myself.FHTML_SetStr(fhtml0, "Cell4", "S");

} else if (i4 == 8) {
myself.FHTML_SetStr(fhtml0, "Cell4", "E");

} else if (i4 == 9) {
myself.FHTML_SetStr(fhtml0, "Cell4", "H");

} else if (i4 == 10) {
myself.FHTML_SetStr(fhtml0, "Cell4", "A");

} else if (i4 == 11) {
myself.FHTML_SetStr(fhtml0, "Cell4", "R");

} else if (i4 == 12) {
myself.FHTML_SetStr(fhtml0, "Cell4", "D");

} else if (i4 == 13) {
myself.FHTML_SetStr(fhtml0, "Cell4", "I");

} else if (i4 == 14) {
myself.FHTML_SetStr(fhtml0, "Cell4", "N");

}

}
if (i9 % 32 < 16) {
myself.FHTML_SetStr(fhtml0, "FontColor5", "ffff00");
myself.FHTML_SetStr(fhtml0, "Cell5", "?");

} else {
myself.FHTML_SetStr(fhtml0, "FontColor5", "ff6f6f");
if (i5 == 1) {
myself.FHTML_SetStr(fhtml0, "Cell5", "!");

} else if (i5 == 2) {
myself.FHTML_SetStr(fhtml0, "Cell5", "=");

} else if (i5 == 3) {
myself.FHTML_SetStr(fhtml0, "Cell5", "T");

} else if (i5 == 4) {
myself.FHTML_SetStr(fhtml0, "Cell5", "V");

} else if (i5 == 5) {
myself.FHTML_SetStr(fhtml0, "Cell5", "O");

} else if (i5 == 6) {
myself.FHTML_SetStr(fhtml0, "Cell5", "P");

} else if (i5 == 7) {
myself.FHTML_SetStr(fhtml0, "Cell5", "S");

} else if (i5 == 8) {
myself.FHTML_SetStr(fhtml0, "Cell5", "E");

} else if (i5 == 9) {
myself.FHTML_SetStr(fhtml0, "Cell5", "H");

} else if (i5 == 10) {
myself.FHTML_SetStr(fhtml0, "Cell5", "A");

} else if (i5 == 11) {
myself.FHTML_SetStr(fhtml0, "Cell5", "R");

} else if (i5 == 12) {
myself.FHTML_SetStr(fhtml0, "Cell5", "D");

} else if (i5 == 13) {
myself.FHTML_SetStr(fhtml0, "Cell5", "I");

} else if (i5 == 14) {
myself.FHTML_SetStr(fhtml0, "Cell5", "N");

}

}
myself.ShowFHTML(talker, fhtml0);

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 662) {
myself.SetCurrentQuestID(662);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 662) == 0 && talker.level >= 61) {
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "warehouse_chief_klump_q0662_03.htm", 662);
gg.AddLog(1, talker, quest_id);
myself.ShowQuestMark(talker, quest_id);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam reply, HandlerParam talker) {
if (ask == 662) {
myself.SetCurrentQuestID(662);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 662) {
if (reply == 1) {
myself.ShowPage(talker, "warehouse_chief_klump_q0662_06.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "warehouse_chief_klump_q0662_07.htm");
myself.RemoveMemo(talker, 662);
gg.AddLog(2, talker, 662);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}
if (reply == 3) {
myself.ShowPage(talker, "warehouse_chief_klump_q0662_08.htm");

}
if (reply == 4) {
myself.ShowPage(talker, "warehouse_chief_klump_q0662_09.htm");

}
if (reply == 6) {
myself.ShowPage(talker, "warehouse_chief_klump_q0662_09a.htm");

}
if (reply == 8) {
myself.ShowPage(talker, "warehouse_chief_klump_q0662_09b.htm");

}
if (reply == 7) {
if (gg.HaveMemo(talker, 662) == 1 && gg.GetMemoState(talker, 662) == 0 && gg.GetMemoStateEx(talker, 662, 1) == 0 && gg.OwnItemCount(talker, 8765) < 50) {
myself.ShowPage(talker, "warehouse_chief_klump_q0662_04.htm");

} else if (gg.HaveMemo(talker, 662) == 1 && gg.GetMemoState(talker, 662) == 0 && gg.GetMemoStateEx(talker, 662, 1) == 0 && gg.OwnItemCount(talker, 8765) >= 50) {
myself.ShowPage(talker, "warehouse_chief_klump_q0662_05.htm");

}

}
if (reply == 5) {
myself.ShowPage(talker, "warehouse_chief_klump_q0662_10.htm");

}
if (reply == 10) {
if (gg.HaveMemo(talker, 662) == 1 && gg.GetMemoState(talker, 662) == 0 && gg.GetMemoStateEx(talker, 662, 1) == 0 && gg.OwnItemCount(talker, 8765) >= 50) {
i1 = 0;
i2 = 0;
i3 = 0;
i4 = 0;
i5 = 0;
while (i1 == i2 || i1 == i3 || i1 == i4 || i1 == i5 || i2 == i3 || i2 == i4 || i2 == i5 || i3 == i4 || i3 == i5 || i4 == i5) {
i1 = gg.Rand(70) + 1;
i2 = gg.Rand(70) + 1;
i3 = gg.Rand(70) + 1;
i4 = gg.Rand(70) + 1;
i5 = gg.Rand(70) + 1;

}
if (i1 >= 57) {
i1 = i1 - 56;

} else if (i1 >= 43) {
i1 = i1 - 42;

} else if (i1 >= 29) {
i1 = i1 - 28;

} else if (i1 >= 15) {
i1 = i1 - 14;

}
if (i2 >= 57) {
i2 = i2 - 56;

} else if (i2 >= 43) {
i2 = i2 - 42;

} else if (i2 >= 29) {
i2 = i2 - 28;

} else if (i2 >= 15) {
i2 = i2 - 14;

}
if (i3 >= 57) {
i3 = i3 - 56;

} else if (i3 >= 43) {
i3 = i3 - 42;

} else if (i3 >= 29) {
i3 = i3 - 28;

} else if (i3 >= 15) {
i3 = i3 - 14;

}
if (i4 >= 57) {
i4 = i4 - 56;

} else if (i4 >= 43) {
i4 = i4 - 42;

} else if (i4 >= 29) {
i4 = i4 - 28;

} else if (i4 >= 15) {
i4 = i4 - 14;

}
if (i5 >= 57) {
i5 = i5 - 56;

} else if (i5 >= 43) {
i5 = i5 - 42;

} else if (i5 >= 29) {
i5 = i5 - 28;

} else if (i5 >= 15) {
i5 = i5 - 14;

}
gg.AddLog(325, talker, i1 * 65536 + i2 * 4096 + i3 * 256 + i4 * 16 + i5);
myself.SetMemoState(talker, 662, i4 * 1000000 + i3 * 10000 + i2 * 100 + i1);
myself.SetMemoStateEx(talker, 662, 1, i5);
myself.DeleteItem1(talker, 8765, 50);
myself.ShowPage(talker, "warehouse_chief_klump_q0662_11.htm");

}

}
if (reply == 11 || reply == 12 || reply == 13 || reply == 14 || reply == 15) {
i0 = gg.GetMemoState(talker, 662);
i1 = gg.GetMemoStateEx(talker, 662, 1);
i5 = i1 % 100;
i9 = i1 / 100;
i1 = i0 % 100;
i2 = i0 % 10000 / 100;
i3 = i0 % 1000000 / 10000;
i4 = i0 % 100000000 / 1000000;
if (reply == 11) {
if (i9 % 2 < 1) {
i9 = i9 + 1;

}
if (i9 % 32 < 31) {
myself.SetMemoStateEx(talker, 662, 1, i9 * 100 + i5);

}

} else if (reply == 12) {
if (i9 % 4 < 2) {
i9 = i9 + 2;

}
if (i9 % 32 < 31) {
myself.SetMemoStateEx(talker, 662, 1, i9 * 100 + i5);

}

} else if (reply == 13) {
if (i9 % 8 < 4) {
i9 = i9 + 4;

}
if (i9 % 32 < 31) {
myself.SetMemoStateEx(talker, 662, 1, i9 * 100 + i5);

}

} else if (reply == 14) {
if (i9 % 16 < 8) {
i9 = i9 + 8;

}
if (i9 % 32 < 31) {
myself.SetMemoStateEx(talker, 662, 1, i9 * 100 + i5);

}

} else if (reply == 15) {
if (i9 % 32 < 16) {
i9 = i9 + 16;

}
if (i9 % 32 < 31) {
myself.SetMemoStateEx(talker, 662, 1, i9 * 100 + i5);

}

}
if (i9 % 32 < 31) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_klump_q0662_12.htm");
i7 = 1;

} else if (i9 % 32 == 31) {
i6 = 0;
i8 = 0;
if (i1 >= 1 && i1 <= 14 && i2 >= 1 && i2 <= 14 && i3 >= 1 && i3 <= 14 && i4 >= 1 && i4 <= 14 && i5 >= 1 && i5 <= 14) {
if (i1 == i2) {
i6 = i6 + 10;
i8 = i8 + 8;

}
if (i1 == i3) {
i6 = i6 + 10;
i8 = i8 + 4;

}
if (i1 == i4) {
i6 = i6 + 10;
i8 = i8 + 2;

}
if (i1 == i5) {
i6 = i6 + 10;
i8 = i8 + 1;

}
if (i6 % 100 < 10) {
if (i8 % 16 < 8) {
if (i8 % 8 < 4) {
if (i2 == i3) {
i6 = i6 + 10;
i8 = i8 + 4;

}

}
if (i8 % 4 < 2) {
if (i2 == i4) {
i6 = i6 + 10;
i8 = i8 + 2;

}

}
if (i8 % 2 < 1) {
if (i2 == i5) {
i6 = i6 + 10;
i8 = i8 + 1;

}

}

}

} else if (i6 % 10 == 0) {
if (i8 % 16 < 8) {
if (i8 % 8 < 4) {
if (i2 == i3) {
i6 = i6 + 1;
i8 = i8 + 4;

}

}
if (i8 % 4 < 2) {
if (i2 == i4) {
i6 = i6 + 1;
i8 = i8 + 2;

}

}
if (i8 % 2 < 1) {
if (i2 == i5) {
i6 = i6 + 1;
i8 = i8 + 1;

}

}

}

}
if (i6 % 100 < 10) {
if (i8 % 8 < 4) {
if (i8 % 4 < 2) {
if (i3 == i4) {
i6 = i6 + 10;
i8 = i8 + 2;

}

}
if (i8 % 2 < 1) {
if (i3 == i5) {
i6 = i6 + 10;
i8 = i8 + 1;

}

}

}

} else if (i6 % 10 == 0) {
if (i8 % 8 < 4) {
if (i8 % 4 < 2) {
if (i3 == i4) {
i6 = i6 + 1;
i8 = i8 + 2;

}

}
if (i8 % 2 < 1) {
if (i3 == i5) {
i6 = i6 + 1;
i8 = i8 + 1;

}

}

}

}
if (i6 % 100 < 10) {
if (i8 % 4 < 2) {
if (i8 % 2 < 1) {
if (i4 == i5) {
i6 = i6 + 10;
i8 = i8 + 1;

}

}

}

} else if (i6 % 10 == 0) {
if (i8 % 4 < 2) {
if (i8 % 2 < 1) {
if (i4 == i5) {
i6 = i6 + 1;
i8 = i8 + 1;

}

}

}

}

}
if (i6 == 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_klump_q0662_13.htm");
myself.GiveItem1(talker, 8868, 43);
myself.GiveItem1(talker, 959, 3);
myself.GiveItem1(talker, 729, 1);
myself.SetMemoState(talker, 662, 0);
myself.SetMemoStateEx(talker, 662, 1, 0);
gg.AddLog(3, talker, 662);
i7 = 1;

}

} else if (i6 == 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_klump_q0662_14.htm");
myself.GiveItem1(talker, 959, 2);
myself.GiveItem1(talker, 951, 2);
myself.SetMemoState(talker, 662, 0);
myself.SetMemoStateEx(talker, 662, 1, 0);
gg.AddLog(3, talker, 662);
i7 = 1;

}

} else if (i6 == 21 || i6 == 12) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_klump_q0662_15.htm");
myself.GiveItem1(talker, 729, 1);
myself.GiveItem1(talker, 947, 2);
myself.GiveItem1(talker, 955, 1);
myself.SetMemoState(talker, 662, 0);
myself.SetMemoStateEx(talker, 662, 1, 0);
gg.AddLog(3, talker, 662);
i7 = 1;

}

} else if (i6 == 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_klump_q0662_16.htm");
myself.GiveItem1(talker, 951, 2);
myself.SetMemoState(talker, 662, 0);
myself.SetMemoStateEx(talker, 662, 1, 0);
gg.AddLog(3, talker, 662);
i7 = 1;

}

} else if (i6 == 11) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_klump_q0662_17.htm");
myself.GiveItem1(talker, 951, 1);
myself.SetMemoState(talker, 662, 0);
myself.SetMemoStateEx(talker, 662, 1, 0);
gg.AddLog(3, talker, 662);
i7 = 1;

}

} else if (i6 == 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_klump_q0662_18.htm");
myself.GiveItem1(talker, 956, 2);
myself.SetMemoState(talker, 662, 0);
myself.SetMemoStateEx(talker, 662, 1, 0);
gg.AddLog(3, talker, 662);
i7 = 1;

}

} else if (i6 == 0) {
myself.FHTML_SetFileName(fhtml0, "warehouse_chief_klump_q0662_19.htm");
myself.SetMemoState(talker, 662, 0);
myself.SetMemoStateEx(talker, 662, 1, 0);
gg.AddLog(3, talker, 662);
i7 = 1;

}

}
if (i7 == 1) {
if (i9 % 2 < 1) {
myself.FHTML_SetStr(fhtml0, "FontColor1", "ffff00");
myself.FHTML_SetStr(fhtml0, "Cell1", "?");

} else {
myself.FHTML_SetStr(fhtml0, "FontColor1", "ff6f6f");
if (i1 == 1) {
myself.FHTML_SetStr(fhtml0, "Cell1", "!");

} else if (i1 == 2) {
myself.FHTML_SetStr(fhtml0, "Cell1", "=");

} else if (i1 == 3) {
myself.FHTML_SetStr(fhtml0, "Cell1", "T");

} else if (i1 == 4) {
myself.FHTML_SetStr(fhtml0, "Cell1", "V");

} else if (i1 == 5) {
myself.FHTML_SetStr(fhtml0, "Cell1", "O");

} else if (i1 == 6) {
myself.FHTML_SetStr(fhtml0, "Cell1", "P");

} else if (i1 == 7) {
myself.FHTML_SetStr(fhtml0, "Cell1", "S");

} else if (i1 == 8) {
myself.FHTML_SetStr(fhtml0, "Cell1", "E");

} else if (i1 == 9) {
myself.FHTML_SetStr(fhtml0, "Cell1", "H");

} else if (i1 == 10) {
myself.FHTML_SetStr(fhtml0, "Cell1", "A");

} else if (i1 == 11) {
myself.FHTML_SetStr(fhtml0, "Cell1", "R");

} else if (i1 == 12) {
myself.FHTML_SetStr(fhtml0, "Cell1", "D");

} else if (i1 == 13) {
myself.FHTML_SetStr(fhtml0, "Cell1", "I");

} else if (i1 == 14) {
myself.FHTML_SetStr(fhtml0, "Cell1", "N");

}

}
if (i9 % 4 < 2) {
myself.FHTML_SetStr(fhtml0, "FontColor2", "ffff00");
myself.FHTML_SetStr(fhtml0, "Cell2", "?");

} else {
myself.FHTML_SetStr(fhtml0, "FontColor2", "ff6f6f");
if (i2 == 1) {
myself.FHTML_SetStr(fhtml0, "Cell2", "!");

} else if (i2 == 2) {
myself.FHTML_SetStr(fhtml0, "Cell2", "=");

} else if (i2 == 3) {
myself.FHTML_SetStr(fhtml0, "Cell2", "T");

} else if (i2 == 4) {
myself.FHTML_SetStr(fhtml0, "Cell2", "V");

} else if (i2 == 5) {
myself.FHTML_SetStr(fhtml0, "Cell2", "O");

} else if (i2 == 6) {
myself.FHTML_SetStr(fhtml0, "Cell2", "P");

} else if (i2 == 7) {
myself.FHTML_SetStr(fhtml0, "Cell2", "S");

} else if (i2 == 8) {
myself.FHTML_SetStr(fhtml0, "Cell2", "E");

} else if (i2 == 9) {
myself.FHTML_SetStr(fhtml0, "Cell2", "H");

} else if (i2 == 10) {
myself.FHTML_SetStr(fhtml0, "Cell2", "A");

} else if (i2 == 11) {
myself.FHTML_SetStr(fhtml0, "Cell2", "R");

} else if (i2 == 12) {
myself.FHTML_SetStr(fhtml0, "Cell2", "D");

} else if (i2 == 13) {
myself.FHTML_SetStr(fhtml0, "Cell2", "I");

} else if (i2 == 14) {
myself.FHTML_SetStr(fhtml0, "Cell2", "N");

}

}
if (i9 % 8 < 4) {
myself.FHTML_SetStr(fhtml0, "FontColor3", "ffff00");
myself.FHTML_SetStr(fhtml0, "Cell3", "?");

} else {
myself.FHTML_SetStr(fhtml0, "FontColor3", "ff6f6f");
if (i3 == 1) {
myself.FHTML_SetStr(fhtml0, "Cell3", "!");

} else if (i3 == 2) {
myself.FHTML_SetStr(fhtml0, "Cell3", "=");

} else if (i3 == 3) {
myself.FHTML_SetStr(fhtml0, "Cell3", "T");

} else if (i3 == 4) {
myself.FHTML_SetStr(fhtml0, "Cell3", "V");

} else if (i3 == 5) {
myself.FHTML_SetStr(fhtml0, "Cell3", "O");

} else if (i3 == 6) {
myself.FHTML_SetStr(fhtml0, "Cell3", "P");

} else if (i3 == 7) {
myself.FHTML_SetStr(fhtml0, "Cell3", "S");

} else if (i3 == 8) {
myself.FHTML_SetStr(fhtml0, "Cell3", "E");

} else if (i3 == 9) {
myself.FHTML_SetStr(fhtml0, "Cell3", "H");

} else if (i3 == 10) {
myself.FHTML_SetStr(fhtml0, "Cell3", "A");

} else if (i3 == 11) {
myself.FHTML_SetStr(fhtml0, "Cell3", "R");

} else if (i3 == 12) {
myself.FHTML_SetStr(fhtml0, "Cell3", "D");

} else if (i3 == 13) {
myself.FHTML_SetStr(fhtml0, "Cell3", "I");

} else if (i3 == 14) {
myself.FHTML_SetStr(fhtml0, "Cell3", "N");

}

}
if (i9 % 16 < 8) {
myself.FHTML_SetStr(fhtml0, "FontColor4", "ffff00");
myself.FHTML_SetStr(fhtml0, "Cell4", "?");

} else {
myself.FHTML_SetStr(fhtml0, "FontColor4", "ff6f6f");
if (i4 == 1) {
myself.FHTML_SetStr(fhtml0, "Cell4", "!");

} else if (i4 == 2) {
myself.FHTML_SetStr(fhtml0, "Cell4", "=");

} else if (i4 == 3) {
myself.FHTML_SetStr(fhtml0, "Cell4", "T");

} else if (i4 == 4) {
myself.FHTML_SetStr(fhtml0, "Cell4", "V");

} else if (i4 == 5) {
myself.FHTML_SetStr(fhtml0, "Cell4", "O");

} else if (i4 == 6) {
myself.FHTML_SetStr(fhtml0, "Cell4", "P");

} else if (i4 == 7) {
myself.FHTML_SetStr(fhtml0, "Cell4", "S");

} else if (i4 == 8) {
myself.FHTML_SetStr(fhtml0, "Cell4", "E");

} else if (i4 == 9) {
myself.FHTML_SetStr(fhtml0, "Cell4", "H");

} else if (i4 == 10) {
myself.FHTML_SetStr(fhtml0, "Cell4", "A");

} else if (i4 == 11) {
myself.FHTML_SetStr(fhtml0, "Cell4", "R");

} else if (i4 == 12) {
myself.FHTML_SetStr(fhtml0, "Cell4", "D");

} else if (i4 == 13) {
myself.FHTML_SetStr(fhtml0, "Cell4", "I");

} else if (i4 == 14) {
myself.FHTML_SetStr(fhtml0, "Cell4", "N");

}

}
if (i9 % 32 < 16) {
myself.FHTML_SetStr(fhtml0, "FontColor5", "ffff00");
myself.FHTML_SetStr(fhtml0, "Cell5", "?");

} else {
myself.FHTML_SetStr(fhtml0, "FontColor5", "ff6f6f");
if (i5 == 1) {
myself.FHTML_SetStr(fhtml0, "Cell5", "!");

} else if (i5 == 2) {
myself.FHTML_SetStr(fhtml0, "Cell5", "=");

} else if (i5 == 3) {
myself.FHTML_SetStr(fhtml0, "Cell5", "T");

} else if (i5 == 4) {
myself.FHTML_SetStr(fhtml0, "Cell5", "V");

} else if (i5 == 5) {
myself.FHTML_SetStr(fhtml0, "Cell5", "O");

} else if (i5 == 6) {
myself.FHTML_SetStr(fhtml0, "Cell5", "P");

} else if (i5 == 7) {
myself.FHTML_SetStr(fhtml0, "Cell5", "S");

} else if (i5 == 8) {
myself.FHTML_SetStr(fhtml0, "Cell5", "E");

} else if (i5 == 9) {
myself.FHTML_SetStr(fhtml0, "Cell5", "H");

} else if (i5 == 10) {
myself.FHTML_SetStr(fhtml0, "Cell5", "A");

} else if (i5 == 11) {
myself.FHTML_SetStr(fhtml0, "Cell5", "R");

} else if (i5 == 12) {
myself.FHTML_SetStr(fhtml0, "Cell5", "D");

} else if (i5 == 13) {
myself.FHTML_SetStr(fhtml0, "Cell5", "I");

} else if (i5 == 14) {
myself.FHTML_SetStr(fhtml0, "Cell5", "N");

}

}
myself.ShowFHTML(talker, fhtml0);

}

}
if (reply == 20) {
if (gg.HaveMemo(talker, 662) == 1 && gg.OwnItemCount(talker, 8765) >= 50) {
myself.ShowPage(talker, "warehouse_chief_klump_q0662_20.htm");

} else if (gg.HaveMemo(talker, 662) == 1 && gg.OwnItemCount(talker, 8765) < 50) {
myself.ShowPage(talker, "warehouse_chief_klump_q0662_21.htm");

}

}

}
super;
	}


}