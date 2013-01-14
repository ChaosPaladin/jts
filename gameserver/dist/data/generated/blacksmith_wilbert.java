package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blacksmith_wilbert extends blacksmith {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 663) == 0 && talker.level >= 50) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Seductive Whispers");

}
if (gg.HaveMemo(talker, 663) == 0 && talker.level < 50) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Seductive Whispers (In Progress)");

}
if (gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) < 4 && gg.GetMemoState(talker, 663) >= 1 && gg.OwnItemCount(talker, 8766) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Seductive Whispers (In Progress)");

}
if (gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) < 4 && gg.GetMemoState(talker, 663) >= 1 && gg.OwnItemCount(talker, 8766) > 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Seductive Whispers (In Progress)");

}
if (gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) % 10 == 4 && gg.GetMemoState(talker, 663) / 1000 == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Seductive Whispers (In Progress)");

}
if (gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) % 10 == 5 && gg.GetMemoState(talker, 663) / 1000 == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Seductive Whispers (In Progress)");

}
if (gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) % 10 == 6 && gg.GetMemoState(talker, 663) / 1000 == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Seductive Whispers (In Progress)");

}
if (gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) % 10 == 7 && gg.GetMemoState(talker, 663) / 1000 == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Seductive Whispers (In Progress)");

}
if (gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) == 1005) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Seductive Whispers (In Progress)");

}
if (gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) == 1006) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Seductive Whispers (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 663) == 0 && talker.level >= 50) {
myself.SetCurrentQuestID(663);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "blacksmith_wilbert_q0663_01.htm", 663);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 663) == 0 && talker.level < 50) {
myself.SetCurrentQuestID(663);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_wilbert_q0663_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) < 4 && gg.GetMemoState(talker, 663) >= 1 && gg.OwnItemCount(talker, 8766) == 0) {
myself.SetCurrentQuestID(663);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_wilbert_q0663_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) < 4 && gg.GetMemoState(talker, 663) >= 1 && gg.OwnItemCount(talker, 8766) > 0) {
myself.SetCurrentQuestID(663);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_wilbert_q0663_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) % 10 == 4 && gg.GetMemoState(talker, 663) / 1000 == 0) {
myself.SetCurrentQuestID(663);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_wilbert_q0663_05a.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) % 10 == 5 && gg.GetMemoState(talker, 663) / 1000 == 0) {
myself.SetCurrentQuestID(663);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_wilbert_q0663_11.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) % 10 == 6 && gg.GetMemoState(talker, 663) / 1000 == 0) {
myself.SetCurrentQuestID(663);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_wilbert_q0663_15.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) % 10 == 7 && gg.GetMemoState(talker, 663) / 1000 == 0) {
myself.SetCurrentQuestID(663);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.GetMemoState(talker, 663) % 100;
if (i0 / 10 >= 7) {
myself.ShowPage(talker, "blacksmith_wilbert_q0663_17.htm");
myself.SetMemoState(talker, 663, 1);
myself.GiveItem1(talker, 57, 2384000);
myself.GiveItem1(talker, 729, 1);
myself.GiveItem1(talker, 730, 2);
gg.AddLog(3, talker, 663);

} else {
i5 = gg.GetMemoState(talker, 663) / 10;
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_16.htm");
myself.FHTML_SetInt(fhtml0, "wincount", i5 + 1);
myself.ShowQuestFHTML(talker, fhtml0, 663);

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) == 1005) {
myself.SetCurrentQuestID(663);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_wilbert_q0663_23.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) == 1006) {
myself.SetCurrentQuestID(663);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_wilbert_q0663_26.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 663) {
myself.SetCurrentQuestID(663);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 663) == 0 && talker.level >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 663);
myself.ShowQuestPage(talker, "blacksmith_wilbert_q0663_03.htm", 663);
gg.AddLog(1, talker, quest_id);
myself.SetFlagJournal(talker, 663, 1);
myself.SetMemoState(talker, 663, 1);
myself.ShowQuestMark(talker, 663);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i_quest1, HandlerParam i_quest2, HandlerParam reply, HandlerParam talker) {
if (ask == 663) {
myself.SetCurrentQuestID(663);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 663) {
i0 = 0;
i1 = 0;
i2 = 0;
i3 = 0;
i4 = 0;
i5 = 0;
if (reply == 1 && gg.HaveMemo(talker, 663) == 0 && talker.level >= 50) {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_01a.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 663);
myself.ShowQuestFHTML(talker, fhtml0, 663);

}
if (reply == 4 && gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) % 10 <= 4) {
if (gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) / 10 < 1) {
if (gg.OwnItemCount(talker, 8766) >= 50) {
myself.DeleteItem1(talker, 8766, 50);
myself.SetMemoState(talker, 663, 5);
myself.SetMemoStateEx(talker, 663, 1, 0);
myself.ShowPage(talker, "blacksmith_wilbert_q0663_09.htm");

} else {
myself.ShowPage(talker, "blacksmith_wilbert_q0663_10.htm");

}

} else {
i0 = gg.GetMemoState(talker, 663) / 10;
i1 = i0 * 10 + 5;
myself.SetMemoState(talker, 663, i1);
myself.SetMemoStateEx(talker, 663, 1, 0);
myself.ShowPage(talker, "blacksmith_wilbert_q0663_09a.htm");

}

}
if (reply == 5 && gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) % 10 == 5 && gg.GetMemoState(talker, 663) / 1000 == 0) {
i0 = gg.GetMemoStateEx(talker, 663, 1);
if (i0 < 0) {
i0 = 0;

}
i1 = i0 % 10;
i2 = i0 - i1 / 10;
talker.param1 = gg.Rand(2) + 1;
talker.param2 = gg.Rand(5) + 1;
i5 = gg.GetMemoState(talker, 663) / 10;
talker.param3 = talker.param1 * 10 + talker.param2;
if (talker.param1 == i2) {
i3 = talker.param2 + i1;
if (i3 % 5 == 0 && i3 != 10) {
if (gg.GetMemoState(talker, 663) % 100 / 10 >= 7) {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_14.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
myself.GiveItem1(talker, 57, 2384000);
myself.GiveItem1(talker, 729, 1);
myself.GiveItem1(talker, 730, 2);
myself.SetMemoState(talker, 663, 4);
gg.AddLog(3, talker, 663);

} else {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_13.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.FHTML_SetInt(fhtml0, "wincount", i5 + 1);
myself.ShowFHTML(talker, fhtml0);
i4 = gg.GetMemoState(talker, 663) / 10 * 10 + 7;
myself.SetMemoState(talker, 663, i4);

}

} else {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_12.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
myself.SetMemoStateEx(talker, 663, 1, talker.param3);
i4 = gg.GetMemoState(talker, 663) / 10 * 10 + 6;
myself.SetMemoState(talker, 663, i4);

}

} else if (talker.param1 != i2) {
if (talker.param2 == 5 || i1 == 5) {
if (gg.GetMemoState(talker, 663) % 100 / 10 >= 7) {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_14.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
myself.GiveItem1(talker, 57, 2384000);
myself.GiveItem1(talker, 729, 1);
myself.GiveItem1(talker, 730, 2);
myself.SetMemoState(talker, 663, 4);
gg.AddLog(3, talker, 663);

} else {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_13.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.FHTML_SetInt(fhtml0, "wincount", i5 + 1);
myself.ShowFHTML(talker, fhtml0);
i4 = gg.GetMemoState(talker, 663) / 10 * 10 + 7;
myself.SetMemoState(talker, 663, i4);

}

} else {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_12.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
talker.param3 = talker.param1 * 10 + talker.param2;
myself.SetMemoStateEx(talker, 663, 1, talker.param3);
i4 = gg.GetMemoState(talker, 663) / 10 * 10 + 6;
myself.SetMemoState(talker, 663, i4);

}

}

}
if (reply == 6 && gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) % 10 == 6 && gg.GetMemoState(talker, 663) / 1000 == 0) {
i0 = gg.GetMemoStateEx(talker, 663, 1);
if (i0 < 0) {
i0 = 0;

}
i1 = i0 % 10;
i2 = i0 - i1 / 10;
talker.param1 = gg.Rand(2) + 1;
talker.param2 = gg.Rand(5) + 1;
talker.param3 = talker.param1 * 10 + talker.param2;
if (talker.param1 == i2) {
i3 = talker.param2 + i1;
if (i3 % 5 == 0 && i3 != 10) {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_19.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
myself.SetMemoState(talker, 663, 1);
myself.SetMemoStateEx(talker, 663, 1, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_18.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
talker.param3 = talker.param1 * 10 + talker.param2;
myself.SetMemoStateEx(talker, 663, 1, talker.param3);
i4 = gg.GetMemoState(talker, 663) / 10 * 10 + 5;
myself.SetMemoState(talker, 663, i4);

}

} else if (talker.param1 != i2) {
i3 = talker.param1 + i1;
i4 = 66310 + i2;
i5 = 66310 + talker.param1;
if (talker.param2 == 5 || i1 == 5) {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_19.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
myself.SetMemoState(talker, 663, 1);

} else {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_18.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
talker.param3 = talker.param1 * 10 + talker.param2;
myself.SetMemoStateEx(talker, 663, 1, talker.param3);
i4 = gg.GetMemoState(talker, 663) / 10 * 10 + 5;
myself.SetMemoState(talker, 663, i4);

}

}

}
if (reply == 8 && gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) % 10 == 7 && gg.GetMemoState(talker, 663) / 1000 == 0) {
i0 = gg.GetMemoState(talker, 663) / 10;
i1 = i0 + 1 * 10 + 4;
myself.SetMemoState(talker, 663, i1);
myself.SetMemoStateEx(talker, 663, 1, 0);
myself.ShowPage(talker, "blacksmith_wilbert_q0663_20.htm");

}
if (reply == 9 && gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) % 10 == 7 && gg.GetMemoState(talker, 663) / 1000 == 0) {
i0 = gg.GetMemoState(talker, 663) / 10;
if (i0 == 0) {
myself.GiveItem1(talker, 57, 40000);

} else if (i0 == 1) {
myself.GiveItem1(talker, 57, 80000);

} else if (i0 == 2) {
myself.GiveItem1(talker, 57, 110000);
myself.GiveItem1(talker, 955, 1);

} else if (i0 == 3) {
myself.GiveItem1(talker, 57, 199000);
myself.GiveItem1(talker, 951, 1);

} else if (i0 == 4) {
myself.GiveItem1(talker, 57, 388000);
i1 = gg.Rand(18) + 1;
if (i1 == 1) {
myself.GiveItem1(talker, 4963, 1);

} else if (i1 == 2) {
myself.GiveItem1(talker, 4964, 1);

} else if (i1 == 3) {
myself.GiveItem1(talker, 4965, 1);

} else if (i1 == 4) {
myself.GiveItem1(talker, 4966, 1);

} else if (i1 == 5) {
myself.GiveItem1(talker, 4967, 1);

} else if (i1 == 6) {
myself.GiveItem1(talker, 4968, 1);

} else if (i1 == 7) {
myself.GiveItem1(talker, 4969, 1);

} else if (i1 == 8) {
myself.GiveItem1(talker, 4970, 1);

} else if (i1 == 9) {
myself.GiveItem1(talker, 4971, 1);

} else if (i1 == 10) {
myself.GiveItem1(talker, 4972, 1);

} else if (i1 == 11) {
myself.GiveItem1(talker, 5000, 1);

} else if (i1 == 12) {
myself.GiveItem1(talker, 5001, 1);

} else if (i1 == 13) {
myself.GiveItem1(talker, 5002, 1);

} else if (i1 == 14) {
myself.GiveItem1(talker, 5003, 1);

} else if (i1 == 15) {
myself.GiveItem1(talker, 5004, 1);

} else if (i1 == 16) {
myself.GiveItem1(talker, 5005, 1);

} else if (i1 == 17) {
myself.GiveItem1(talker, 5006, 1);

} else if (i1 == 18) {
myself.GiveItem1(talker, 5007, 1);

}

} else if (i0 == 5) {
myself.GiveItem1(talker, 57, 675000);
i1 = gg.Rand(18) + 1;
if (i1 == 1) {
myself.GiveItem1(talker, 4104, 12);

} else if (i1 == 2) {
myself.GiveItem1(talker, 4113, 12);

} else if (i1 == 3) {
myself.GiveItem1(talker, 4112, 12);

} else if (i1 == 4) {
myself.GiveItem1(talker, 4108, 12);

} else if (i1 == 5) {
myself.GiveItem1(talker, 4111, 12);

} else if (i1 == 6) {
myself.GiveItem1(talker, 4106, 12);

} else if (i1 == 7) {
myself.GiveItem1(talker, 4109, 12);

} else if (i1 == 8) {
myself.GiveItem1(talker, 4107, 12);

} else if (i1 == 9) {
myself.GiveItem1(talker, 4105, 12);

} else if (i1 == 10) {
myself.GiveItem1(talker, 4110, 12);

} else if (i1 == 11) {
myself.GiveItem1(talker, 4114, 13);

} else if (i1 == 12) {
myself.GiveItem1(talker, 4115, 13);

} else if (i1 == 13) {
myself.GiveItem1(talker, 4120, 13);

} else if (i1 == 14) {
myself.GiveItem1(talker, 4118, 13);

} else if (i1 == 15) {
myself.GiveItem1(talker, 4116, 13);

} else if (i1 == 16) {
myself.GiveItem1(talker, 4117, 13);

} else if (i1 == 17) {
myself.GiveItem1(talker, 4119, 13);

} else if (i1 == 18) {
myself.GiveItem1(talker, 4121, 13);

}

} else if (i0 == 6) {
myself.GiveItem1(talker, 57, 1284000);
myself.GiveItem1(talker, 947, 2);
myself.GiveItem1(talker, 948, 2);

}
myself.SetMemoState(talker, 663, 1);
myself.SetMemoStateEx(talker, 663, 1, 0);
myself.ShowPage(talker, "blacksmith_wilbert_q0663_21.htm");
gg.AddLog(3, talker, 663);

}
if (reply == 10 && gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) == 1 && gg.GetMemoState(talker, 663) / 1000 == 0) {
myself.ShowPage(talker, "blacksmith_wilbert_q0663_21a.htm");

}
if (reply == 14 && gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) % 10 == 1) {
if (gg.OwnItemCount(talker, 8766) >= 1) {
myself.DeleteItem1(talker, 8766, 1);
myself.SetMemoState(talker, 663, 1005);
myself.ShowPage(talker, "blacksmith_wilbert_q0663_22.htm");

} else {
myself.ShowPage(talker, "blacksmith_wilbert_q0663_22a.htm");

}

}
if (reply == 15 && gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) == 1005) {
i0 = gg.GetMemoStateEx(talker, 663, 1);
if (i0 < 0) {
i0 = 0;

}
i1 = i0 % 10;
i2 = i0 - i1 / 10;
talker.param1 = gg.Rand(2) + 1;
talker.param2 = gg.Rand(5) + 1;
talker.param3 = talker.param1 * 10 + talker.param2;
if (talker.param1 == i2) {
i3 = talker.param2 + i1;
i4 = 66310 + i2;
i5 = 66310 + talker.param1;
if (i3 % 5 == 0 && i3 != 10) {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_25.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.FHTML_SetInt(fhtml0, "card1", i1);
myself.ShowFHTML(talker, fhtml0);
myself.SetMemoState(talker, 663, 1);
myself.GiveItem1(talker, 57, 800);
gg.AddLog(3, talker, 663);
myself.SetMemoStateEx(talker, 663, 1, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_24.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
myself.SetMemoStateEx(talker, 663, 1, talker.param3);
myself.SetMemoState(talker, 663, 1006);

}

} else if (talker.param1 != i2) {
if (talker.param2 == 5 || i1 == 5) {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_25.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
myself.GiveItem1(talker, 57, 800);
gg.AddLog(3, talker, 663);
myself.SetMemoState(talker, 663, 1);
myself.SetMemoStateEx(talker, 663, 1, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_24.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
myself.SetMemoStateEx(talker, 663, 1, talker.param3);
myself.SetMemoState(talker, 663, 1006);

}

}

}
if (reply == 16 && gg.HaveMemo(talker, 663) == 1 && gg.GetMemoState(talker, 663) == 1006) {
i0 = gg.GetMemoStateEx(talker, 663, 1);
if (i0 < 0) {
i0 = 0;

}
i1 = i0 % 10;
i2 = i0 - i1 / 10;
talker.param1 = gg.Rand(2) + 1;
talker.param2 = gg.Rand(5) + 1;
talker.param3 = talker.param1 * 10 + talker.param2;
if (talker.param1 == i2) {
i3 = talker.param2 + i1;
if (i3 % 5 == 0 && i3 != 10) {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_29.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
myself.SetMemoState(talker, 663, 1);
myself.SetMemoStateEx(talker, 663, 1, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_28.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
talker.param3 = talker.param1 * 10 + talker.param2;
myself.SetMemoStateEx(talker, 663, 1, talker.param3);
myself.SetMemoState(talker, 663, 1005);

}

} else if (talker.param1 != i2) {
i3 = talker.param1 + i1;
i4 = 66310 + i2;
i5 = 66310 + talker.param1;
if (talker.param2 == 5 || i1 == 5) {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_29.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
myself.SetMemoState(talker, 663, 1);
myself.SetMemoStateEx(talker, 663, 1, 0);

} else {
myself.FHTML_SetFileName(fhtml0, "blacksmith_wilbert_q0663_28.htm");
myself.FHTML_SetStr(fhtml0, "card1pic", gg.MakeFString(MakeFString + i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "card2pic", gg.MakeFString(MakeFString + talker.param3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "name", talker.name);
myself.ShowFHTML(talker, fhtml0);
talker.param3 = talker.param1 * 10 + talker.param2;
myself.SetMemoStateEx(talker, 663, 1, talker.param3);
myself.SetMemoState(talker, 663, 1005);

}

}

}
if (reply == 20 && gg.HaveMemo(talker, 663) == 1) {
myself.RemoveMemo(talker, 663);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "blacksmith_wilbert_q0663_30.htm");
gg.AddLog(2, talker, 663);

}
if (reply == 21 && gg.HaveMemo(talker, 663) == 1) {
myself.ShowPage(talker, "blacksmith_wilbert_q0663_31.htm");

}
if (reply == 22 && gg.HaveMemo(talker, 663) == 1) {
myself.ShowPage(talker, "blacksmith_wilbert_q0663_32.htm");

}

}
super;
	}


}