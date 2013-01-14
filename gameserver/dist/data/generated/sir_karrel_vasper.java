package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sir_karrel_vasper extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 402) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Human Knight");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1271) > 0 && gg.OwnItemCount(talker, 1162) + gg.OwnItemCount(talker, 1163) + gg.OwnItemCount(talker, 1164) + gg.OwnItemCount(talker, 1165) + gg.OwnItemCount(talker, 1166) + gg.OwnItemCount(talker, 1167) < 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1271) > 0 && gg.OwnItemCount(talker, 1162) + gg.OwnItemCount(talker, 1163) + gg.OwnItemCount(talker, 1164) + gg.OwnItemCount(talker, 1165) + gg.OwnItemCount(talker, 1166) + gg.OwnItemCount(talker, 1167) == 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1271) > 0 && gg.OwnItemCount(talker, 1162) + gg.OwnItemCount(talker, 1163) + gg.OwnItemCount(talker, 1164) + gg.OwnItemCount(talker, 1165) + gg.OwnItemCount(talker, 1166) + gg.OwnItemCount(talker, 1167) > 3 && gg.OwnItemCount(talker, 1162) + gg.OwnItemCount(talker, 1163) + gg.OwnItemCount(talker, 1164) + gg.OwnItemCount(talker, 1165) + gg.OwnItemCount(talker, 1166) + gg.OwnItemCount(talker, 1167) < 6) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1271) > 0 && gg.OwnItemCount(talker, 1162) + gg.OwnItemCount(talker, 1163) + gg.OwnItemCount(talker, 1164) + gg.OwnItemCount(talker, 1165) + gg.OwnItemCount(talker, 1166) + gg.OwnItemCount(talker, 1167) == 6) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3324) >= 1 && gg.OwnItemCount(talker, 3325) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3324) >= 1 && gg.OwnItemCount(talker, 3327) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3324) >= 1 && gg.OwnItemCount(talker, 3330) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3324) >= 1 && gg.OwnItemCount(talker, 3029) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Test of Witchcraft (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "sir_karrel_vasper_q0402_01.htm", 402);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1271) > 0 && gg.OwnItemCount(talker, 1162) + gg.OwnItemCount(talker, 1163) + gg.OwnItemCount(talker, 1164) + gg.OwnItemCount(talker, 1165) + gg.OwnItemCount(talker, 1166) + gg.OwnItemCount(talker, 1167) < 3) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_karrel_vasper_q0402_09.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1271) > 0 && gg.OwnItemCount(talker, 1162) + gg.OwnItemCount(talker, 1163) + gg.OwnItemCount(talker, 1164) + gg.OwnItemCount(talker, 1165) + gg.OwnItemCount(talker, 1166) + gg.OwnItemCount(talker, 1167) == 3) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_karrel_vasper_q0402_10.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1271) > 0 && gg.OwnItemCount(talker, 1162) + gg.OwnItemCount(talker, 1163) + gg.OwnItemCount(talker, 1164) + gg.OwnItemCount(talker, 1165) + gg.OwnItemCount(talker, 1166) + gg.OwnItemCount(talker, 1167) > 3 && gg.OwnItemCount(talker, 1162) + gg.OwnItemCount(talker, 1163) + gg.OwnItemCount(talker, 1164) + gg.OwnItemCount(talker, 1165) + gg.OwnItemCount(talker, 1166) + gg.OwnItemCount(talker, 1167) < 6) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_karrel_vasper_q0402_11.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1271) > 0 && gg.OwnItemCount(talker, 1162) + gg.OwnItemCount(talker, 1163) + gg.OwnItemCount(talker, 1164) + gg.OwnItemCount(talker, 1165) + gg.OwnItemCount(talker, 1166) + gg.OwnItemCount(talker, 1167) == 6) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sir_karrel_vasper_q0402_12.htm");
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 23152);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 29850);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 36542);

}
myself.GiveItem1(talker, 57, 163800);

}
myself.DeleteItem1(talker, 1162, gg.OwnItemCount(talker, 1162));
myself.DeleteItem1(talker, 1163, gg.OwnItemCount(talker, 1163));
myself.DeleteItem1(talker, 1164, gg.OwnItemCount(talker, 1164));
myself.DeleteItem1(talker, 1165, gg.OwnItemCount(talker, 1165));
myself.DeleteItem1(talker, 1166, gg.OwnItemCount(talker, 1166));
myself.DeleteItem1(talker, 1167, gg.OwnItemCount(talker, 1167));
myself.DeleteItem1(talker, 1168, gg.OwnItemCount(talker, 1168));
myself.DeleteItem1(talker, 1172, gg.OwnItemCount(talker, 1172));
myself.DeleteItem1(talker, 1176, gg.OwnItemCount(talker, 1176));
myself.DeleteItem1(talker, 1170, gg.OwnItemCount(talker, 1170));
myself.DeleteItem1(talker, 1174, gg.OwnItemCount(talker, 1174));
myself.DeleteItem1(talker, 1178, gg.OwnItemCount(talker, 1178));
myself.DeleteItem1(talker, 1169, gg.OwnItemCount(talker, 1169));
myself.DeleteItem1(talker, 1171, gg.OwnItemCount(talker, 1171));
myself.DeleteItem1(talker, 1173, gg.OwnItemCount(talker, 1173));
myself.DeleteItem1(talker, 1175, gg.OwnItemCount(talker, 1175));
myself.DeleteItem1(talker, 1177, gg.OwnItemCount(talker, 1177));
myself.DeleteItem1(talker, 1179, gg.OwnItemCount(talker, 1179));
myself.DeleteItem1(talker, 1271, gg.OwnItemCount(talker, 1271));
myself.GiveItem1(talker, 1161, 1);
myself.RemoveMemo(talker, 402);
gg.AddLog(2, talker, 402);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3324) >= 1 && gg.OwnItemCount(talker, 3325) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "sir_karrel_vasper_q0229_01.htm", 229);

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3324) >= 1 && gg.OwnItemCount(talker, 3327) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "sir_karrel_vasper_q0229_04.htm", 229);

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3324) >= 1 && gg.OwnItemCount(talker, 3330) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "sir_karrel_vasper_q0229_05.htm", 229);
myself.DeleteItem1(talker, 3330, 1);
myself.GiveItem1(talker, 3029, 1);
if (gg.OwnItemCount(talker, 3332) >= 1) {
myself.SetFlagJournal(talker, 229, 7);
myself.ShowQuestMark(talker, 229);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3324) >= 1 && gg.OwnItemCount(talker, 3029) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "sir_karrel_vasper_q0229_06.htm", 229);

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 402) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 402);
gg.AddLog(1, talker, 402);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 1271, 1);
myself.ShowQuestPage(talker, "sir_karrel_vasper_q0402_08.htm", 402);
myself.SetFlagJournal(talker, 402, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 402) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 402) {
if (reply == 1) {
if (talker.occupation == 0) {
if (talker.level >= 18) {
if (gg.OwnItemCount(talker, 1161) > 0) {
myself.ShowQuestPage(talker, "sir_karrel_vasper_q0402_04.htm", 402);

} else {
myself.ShowQuestPage(talker, "sir_karrel_vasper_q0402_05.htm", 402);

}

} else {
myself.ShowQuestPage(talker, "sir_karrel_vasper_q0402_02.htm", 402);

}

} else if (talker.occupation == 4) {
myself.ShowQuestPage(talker, "sir_karrel_vasper_q0402_02a.htm", 402);

} else {
myself.ShowQuestPage(talker, "sir_karrel_vasper_q0402_03.htm", 402);

}

}

}
if (ask == 402) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 402) {
if (reply == 2) {
myself.FHTML_SetFileName(fhtml0, "sir_karrel_vasper_q0402_07.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 402);
myself.ShowQuestFHTML(talker, fhtml0, 402);

}

}
if (ask == 402) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 402) {
if (reply == 3) {
myself.ShowPage(talker, "sir_karrel_vasper_q0402_15.htm");

}

}
if (ask == 402) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 402) {
if (reply == 4 && gg.OwnItemCount(talker, 1271) > 0 && gg.OwnItemCount(talker, 1162) + gg.OwnItemCount(talker, 1163) + gg.OwnItemCount(talker, 1164) + gg.OwnItemCount(talker, 1165) + gg.OwnItemCount(talker, 1166) + gg.OwnItemCount(talker, 1167) == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sir_karrel_vasper_q0402_13.htm");
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 160267);
myself.IncrementParam(talker, 1, 11576);
myself.GiveItem1(talker, 57, 81900);

} else if (talker.level >= 19) {
myself.IncrementParam(talker, 0, 228064);
myself.IncrementParam(talker, 1, 14925);
myself.GiveItem1(talker, 57, 81900);

} else {
myself.IncrementParam(talker, 0, 295862);
myself.IncrementParam(talker, 1, 18274);
myself.GiveItem1(talker, 57, 81900);

}

}
myself.DeleteItem1(talker, 1162, gg.OwnItemCount(talker, 1162));
myself.DeleteItem1(talker, 1163, gg.OwnItemCount(talker, 1163));
myself.DeleteItem1(talker, 1164, gg.OwnItemCount(talker, 1164));
myself.DeleteItem1(talker, 1165, gg.OwnItemCount(talker, 1165));
myself.DeleteItem1(talker, 1166, gg.OwnItemCount(talker, 1166));
myself.DeleteItem1(talker, 1167, gg.OwnItemCount(talker, 1167));
myself.DeleteItem1(talker, 1168, gg.OwnItemCount(talker, 1168));
myself.DeleteItem1(talker, 1172, gg.OwnItemCount(talker, 1172));
myself.DeleteItem1(talker, 1176, gg.OwnItemCount(talker, 1176));
myself.DeleteItem1(talker, 1170, gg.OwnItemCount(talker, 1170));
myself.DeleteItem1(talker, 1174, gg.OwnItemCount(talker, 1174));
myself.DeleteItem1(talker, 1178, gg.OwnItemCount(talker, 1178));
myself.DeleteItem1(talker, 1169, gg.OwnItemCount(talker, 1169));
myself.DeleteItem1(talker, 1171, gg.OwnItemCount(talker, 1171));
myself.DeleteItem1(talker, 1173, gg.OwnItemCount(talker, 1173));
myself.DeleteItem1(talker, 1175, gg.OwnItemCount(talker, 1175));
myself.DeleteItem1(talker, 1177, gg.OwnItemCount(talker, 1177));
myself.DeleteItem1(talker, 1179, gg.OwnItemCount(talker, 1179));
myself.DeleteItem1(talker, 1271, gg.OwnItemCount(talker, 1271));
myself.GiveItem1(talker, 1161, 1);
myself.RemoveMemo(talker, 402);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
gg.AddLog(2, talker, 402);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}

}
if (ask == 402) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 402) {
if (reply == 5 && gg.OwnItemCount(talker, 1271) > 0 && gg.OwnItemCount(talker, 1162) + gg.OwnItemCount(talker, 1163) + gg.OwnItemCount(talker, 1164) + gg.OwnItemCount(talker, 1165) + gg.OwnItemCount(talker, 1166) + gg.OwnItemCount(talker, 1167) > 3 && gg.OwnItemCount(talker, 1162) + gg.OwnItemCount(talker, 1163) + gg.OwnItemCount(talker, 1164) + gg.OwnItemCount(talker, 1165) + gg.OwnItemCount(talker, 1166) + gg.OwnItemCount(talker, 1167) < 6) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sir_karrel_vasper_q0402_14.htm");
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 160267);
myself.IncrementParam(talker, 1, 11576);
myself.GiveItem1(talker, 57, 81900);

} else if (talker.level >= 19) {
myself.IncrementParam(talker, 0, 228064);
myself.IncrementParam(talker, 1, 14925);
myself.GiveItem1(talker, 57, 81900);

} else {
myself.IncrementParam(talker, 0, 295862);
myself.IncrementParam(talker, 1, 18274);
myself.GiveItem1(talker, 57, 81900);

}

}
myself.DeleteItem1(talker, 1162, gg.OwnItemCount(talker, 1162));
myself.DeleteItem1(talker, 1163, gg.OwnItemCount(talker, 1163));
myself.DeleteItem1(talker, 1164, gg.OwnItemCount(talker, 1164));
myself.DeleteItem1(talker, 1165, gg.OwnItemCount(talker, 1165));
myself.DeleteItem1(talker, 1166, gg.OwnItemCount(talker, 1166));
myself.DeleteItem1(talker, 1167, gg.OwnItemCount(talker, 1167));
myself.DeleteItem1(talker, 1168, gg.OwnItemCount(talker, 1168));
myself.DeleteItem1(talker, 1172, gg.OwnItemCount(talker, 1172));
myself.DeleteItem1(talker, 1176, gg.OwnItemCount(talker, 1176));
myself.DeleteItem1(talker, 1170, gg.OwnItemCount(talker, 1170));
myself.DeleteItem1(talker, 1174, gg.OwnItemCount(talker, 1174));
myself.DeleteItem1(talker, 1178, gg.OwnItemCount(talker, 1178));
myself.DeleteItem1(talker, 1169, gg.OwnItemCount(talker, 1169));
myself.DeleteItem1(talker, 1171, gg.OwnItemCount(talker, 1171));
myself.DeleteItem1(talker, 1173, gg.OwnItemCount(talker, 1173));
myself.DeleteItem1(talker, 1175, gg.OwnItemCount(talker, 1175));
myself.DeleteItem1(talker, 1177, gg.OwnItemCount(talker, 1177));
myself.DeleteItem1(talker, 1179, gg.OwnItemCount(talker, 1179));
myself.DeleteItem1(talker, 1271, gg.OwnItemCount(talker, 1271));
myself.GiveItem1(talker, 1161, 1);
myself.RemoveMemo(talker, 402);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
gg.AddLog(2, talker, 402);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}

}
if (ask == 229) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 229) {
if (reply == 1) {
myself.ShowQuestPage(talker, "sir_karrel_vasper_q0229_02.htm", 229);

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 3325) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "sir_karrel_vasper_q0229_03.htm", 229);
myself.DeleteItem1(talker, 3325, 1);
myself.GiveItem1(talker, 3327, 1);

}

}

}

}
super;
	}


}