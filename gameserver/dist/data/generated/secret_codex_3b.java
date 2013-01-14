package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class secret_codex_3b extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 7 && gg.OwnItemCount(talker, 7331) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 7 && gg.OwnItemCount(talker, 7331) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 8) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 7 && gg.OwnItemCount(talker, 7335) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 7 && gg.OwnItemCount(talker, 7335) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 8) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 7 && gg.OwnItemCount(talker, 7339) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 7 && gg.OwnItemCount(talker, 7339) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 8) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 7 && gg.OwnItemCount(talker, 7345) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 7 && gg.OwnItemCount(talker, 7345) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 8) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 7 && gg.OwnItemCount(talker, 7349) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Mystic Muse (In Progress)");

}
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 7 && gg.OwnItemCount(talker, 7349) >= 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Mystic Muse (In Progress)");

}
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 8) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of the Mystic Muse (In Progress)");

}
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 7 && gg.OwnItemCount(talker, 7351) == 0) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Saga of the Arcana Lord (In Progress)");

}
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 7 && gg.OwnItemCount(talker, 7351) >= 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Saga of the Arcana Lord (In Progress)");

}
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 8) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of the Arcana Lord (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 7 && gg.OwnItemCount(talker, 7358) == 0) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of the Shillien Saint (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 7 && gg.OwnItemCount(talker, 7358) >= 1) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Saga of the Shillien Saint (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 8) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Saga of the Shillien Saint (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 7 && gg.OwnItemCount(talker, 7331) == 0) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0071_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 7 && gg.OwnItemCount(talker, 7331) >= 1) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0071_0105.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 8) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0071_0107.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 7 && gg.OwnItemCount(talker, 7335) == 0) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0075_0101.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 7 && gg.OwnItemCount(talker, 7335) >= 1) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0075_0105.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 8) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0075_0107.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 7 && gg.OwnItemCount(talker, 7339) == 0) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0079_0101.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 7 && gg.OwnItemCount(talker, 7339) >= 1) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0079_0105.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 8) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0079_0107.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 7 && gg.OwnItemCount(talker, 7345) == 0) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0085_0101.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 7 && gg.OwnItemCount(talker, 7345) >= 1) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0085_0105.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 8) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0085_0107.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 7 && gg.OwnItemCount(talker, 7349) == 0) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0089_0101.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 7 && gg.OwnItemCount(talker, 7349) >= 1) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0089_0105.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 8) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0089_0107.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 7 && gg.OwnItemCount(talker, 7351) == 0) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0091_0101.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 7 && gg.OwnItemCount(talker, 7351) >= 1) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0091_0105.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 8) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0091_0107.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 7 && gg.OwnItemCount(talker, 7358) == 0) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0098_0101.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 7 && gg.OwnItemCount(talker, 7358) >= 1) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0098_0105.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 8) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_3b_q0098_0107.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 71) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 71) {
if (reply == 1) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 7 && gg.OwnItemCount(talker, 7331) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3b_q0071_0102.htm");
myself.CreateOnePrivateEx(1027287, "binding_elf_panacea", 0, 0, 119518, -28658, -3811, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3b_q0071_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3b_q0071_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 7 && gg.OwnItemCount(talker, 7331) >= 1) {
myself.DeleteItem1(talker, 7331, gg.OwnItemCount(talker, 7331));
myself.SetMemoState(talker, 71, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3b_q0071_0106.htm");
myself.SetFlagJournal(talker, 71, 10);
myself.ShowQuestMark(talker, 71);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 75) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 75) {
if (reply == 1) {
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 7 && gg.OwnItemCount(talker, 7335) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3b_q0075_0102.htm");
myself.CreateOnePrivateEx(1027292, "fallen_orc_muhark", 0, 0, 119518, -28658, -3811, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3b_q0075_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3b_q0075_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 7 && gg.OwnItemCount(talker, 7335) >= 1) {
myself.DeleteItem1(talker, 7335, gg.OwnItemCount(talker, 7335));
myself.SetMemoState(talker, 75, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3b_q0075_0106.htm");
myself.SetFlagJournal(talker, 75, 10);
myself.ShowQuestMark(talker, 75);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 79) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 79) {
if (reply == 1) {
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 7 && gg.OwnItemCount(talker, 7339) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3b_q0079_0102.htm");
myself.CreateOnePrivateEx(1027299, "guardian_ejekiel4", 0, 0, 119518, -28658, -3811, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3b_q0079_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3b_q0079_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 7 && gg.OwnItemCount(talker, 7339) >= 1) {
myself.DeleteItem1(talker, 7339, gg.OwnItemCount(talker, 7339));
myself.SetMemoState(talker, 79, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3b_q0079_0106.htm");
myself.SetFlagJournal(talker, 79, 10);
myself.ShowQuestMark(talker, 79);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 85) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 85) {
if (reply == 1) {
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 7 && gg.OwnItemCount(talker, 7345) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3b_q0085_0102.htm");
myself.CreateOnePrivateEx(1027267, "fallenangel_haures_2", 0, 0, 119518, -28658, -3811, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3b_q0085_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3b_q0085_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 7 && gg.OwnItemCount(talker, 7345) >= 1) {
myself.DeleteItem1(talker, 7345, gg.OwnItemCount(talker, 7345));
myself.SetMemoState(talker, 85, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3b_q0085_0106.htm");
myself.SetFlagJournal(talker, 85, 10);
myself.ShowQuestMark(talker, 85);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 89) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 89) {
if (reply == 1) {
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 7 && gg.OwnItemCount(talker, 7349) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3b_q0089_0102.htm");
myself.CreateOnePrivateEx(1027251, "fallenangel_allector_2", 0, 0, 119518, -28658, -3811, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3b_q0089_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3b_q0089_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 7 && gg.OwnItemCount(talker, 7349) >= 1) {
myself.DeleteItem1(talker, 7349, gg.OwnItemCount(talker, 7349));
myself.SetMemoState(talker, 89, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3b_q0089_0106.htm");
myself.SetFlagJournal(talker, 89, 10);
myself.ShowQuestMark(talker, 89);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 91) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 91) {
if (reply == 1) {
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 7 && gg.OwnItemCount(talker, 7351) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3b_q0091_0102.htm");
myself.CreateOnePrivateEx(1027313, "secret_keeper_shakiel1", 0, 0, 119518, -28658, -3811, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3b_q0091_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3b_q0091_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 7 && gg.OwnItemCount(talker, 7351) >= 1) {
myself.DeleteItem1(talker, 7351, gg.OwnItemCount(talker, 7351));
myself.SetMemoState(talker, 91, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3b_q0091_0106.htm");
myself.SetFlagJournal(talker, 91, 10);
myself.ShowQuestMark(talker, 91);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 98) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 98) {
if (reply == 1) {
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 7 && gg.OwnItemCount(talker, 7358) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.ShowPage(talker, "secret_codex_3b_q0098_0102.htm");
myself.CreateOnePrivateEx(1027270, "fallenangel_naverius_2", 0, 0, 119518, -28658, -3811, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "secret_codex_3b_q0098_0103.htm");

} else {
myself.ShowPage(talker, "secret_codex_3b_q0098_0104.htm");

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 7 && gg.OwnItemCount(talker, 7358) >= 1) {
myself.DeleteItem1(talker, 7358, gg.OwnItemCount(talker, 7358));
myself.SetMemoState(talker, 98, 8);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_3b_q0098_0106.htm");
myself.SetFlagJournal(talker, 98, 10);
myself.ShowQuestMark(talker, 98);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}