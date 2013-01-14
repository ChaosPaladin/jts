package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class helvetia extends merchant {
protected Object[][] SellList0 = {
{"soulshot_none";10;0.000000;0}, {"spiritshot_none";10;0.000000;0}, {"blessed_spiritshot_none";10;0.000000;0}, {"soulshot_d";10;0.000000;0}, {"soulshot_c";10;0.000000;0}, {"blessed_spiritshot_d";10;0.000000;0}, {"blessed_spiritshot_c";10;0.000000;0}, {"comp_bspiritshot_none";10;0.000000;0}, {"comp_spiritshot_none";10;0.000000;0}, {"comp_soulshot_none";10;0.000000;0}, {"adv_comp_bspiritshot_none";10;0.000000;0}, {"adv_comp_spiritshot_none";10;0.000000;0}, {"adv_comp_soulshot_none";10;0.000000;0}, {"wooden_arrow";10;0.000000;0}, {"bone_arrow";10;0.000000;0}, {"fine_steel_arrow";10;0.000000;0}, {"lesser_healing_potion";10;0.000000;0}, {"healing_potion";10;0.000000;0}, {"antidote";10;0.000000;0}, {"advanced_antidote";10;0.000000;0}, {"bandage";10;0.000000;0}, {"emergency_dressing";10;0.000000;0}, {"quick_step_potion";10;0.000000;0}, {"swift_attack_potion";10;0.000000;0}, {"potion_of_acumen2";10;0.000000;0}, {"scroll_of_awake";10;0.000000;0}, {"scroll_of_escape";10;0.000000;0}, {"scroll_of_resurrection";10;0.000000;0}, {"scroll_of_escape_to_agit";10;0.000000;0}, {"scroll_of_escape_to_castle";10;0.000000;0}, {"spirit_ore";10;0.000000;0}, {"soul_ore";10;0.000000;0}, {"energy_stone";10;0.000000;0}, {"key_of_thief";10;0.000000;0}, {"rope_of_magic_d";10;0.000000;0}, {"rope_of_magic_c";10;0.000000;0}, {"rope_of_magic_b";10;0.000000;0}, {"rope_of_magic_a";10;0.000000;0}, {"gemstone_d";10;0.000000;0}, {"gemstone_c";10;0.000000;0}, {"gemstone_b";10;0.000000;0}, {"bone_bolt";10;0.000000;0}, {"fine_steel_bolt";10;0.000000;0}, {"recovery_scroll_none";10;0.000000;0}, {"recovery_scroll_d";10;0.000000;0}, {"recovery_scroll_c";10;0.000000;0}, {"recovery_scroll_b";10;0.000000;0}, {"recovery_scroll_a";10;0.000000;0}, {"elixir_of_life_none";10;0.000000;0}, {"elixir_of_life_d";10;0.000000;0}, {"elixir_of_life_c";10;0.000000;0}, {"elixir_of_combative_none";10;0.000000;0}, {"elixir_of_combative_d";10;0.000000;0}, {"elixir_of_combative_c";10;0.000000;0}, {"elixir_of_combative_b";10;0.000000;0}, {"elixir_of_combative_a";10;0.000000;0}, {"crystal_of_summon";10;0.000000;0}, {"mystery_solvent";10;0.000000;0}, {"blank_soul_bottle_5";10;0.000000;0}, {"dice_heart";10;0.000000;0}, {"dice_spade";10;0.000000;0}, {"dice_clover";10;0.000000;0}, {"dice_diamond";10;0.000000;0}
};
protected Object[][] SellList1 = {
{"dye_s1c3_d";10;0.000000;0}, {"dye_s1d3_d";10;0.000000;0}, {"dye_c1s3_d";10;0.000000;0}, {"dye_c1d3_d";10;0.000000;0}, {"dye_d1s3_d";10;0.000000;0}, {"dye_d1c3_d";10;0.000000;0}, {"dye_i1m3_d";10;0.000000;0}, {"dye_i1w3_d";10;0.000000;0}, {"dye_m1i3_d";10;0.000000;0}, {"dye_m1w3_d";10;0.000000;0}, {"dye_w1i3_d";10;0.000000;0}, {"dye_w1m3_d";10;0.000000;0}, {"dye_s1c2_d";10;0.000000;0}, {"dye_s1d2_d";10;0.000000;0}, {"dye_c1s2_d";10;0.000000;0}, {"dye_c1d2_d";10;0.000000;0}, {"dye_d1s2_d";10;0.000000;0}, {"dye_d1c2_d";10;0.000000;0}, {"dye_i1m2_d";10;0.000000;0}, {"dye_i1w2_d";10;0.000000;0}, {"dye_m1i2_d";10;0.000000;0}, {"dye_m1w2_d";10;0.000000;0}, {"dye_w1i2_d";10;0.000000;0}, {"dye_w1m2_d";10;0.000000;0}, {"dye_s1c3_c";10;0.000000;0}, {"dye_s1d3_c";10;0.000000;0}, {"dye_c1s3_c";10;0.000000;0}, {"dye_c1c3_c";10;0.000000;0}, {"dye_d1s3_c";10;0.000000;0}, {"dye_d1c3_c";10;0.000000;0}, {"dye_i1m3_c";10;0.000000;0}, {"dye_i1w3_c";10;0.000000;0}, {"dye_m1i3_c";10;0.000000;0}, {"dye_m1w3_c";10;0.000000;0}, {"dye_w1i3_c";10;0.000000;0}, {"dye_w1m3_c";10;0.000000;0}, {"dye_s1c2_c";10;0.000000;0}, {"dye_s1d2_c";10;0.000000;0}, {"dye_c1s2_c";10;0.000000;0}, {"dye_c1c2_c";10;0.000000;0}, {"dye_d1s2_c";10;0.000000;0}, {"dye_d1c2_c";10;0.000000;0}, {"dye_i1m2_c";10;0.000000;0}, {"dye_i1w2_c";10;0.000000;0}, {"dye_m1i2_c";10;0.000000;0}, {"dye_m1w2_c";10;0.000000;0}, {"dye_w1i2_c";10;0.000000;0}, {"dye_w1m2_c";10;0.000000;0}, {"dye_s2c4_c";10;0.000000;0}, {"dye_s2d4_c";10;0.000000;0}, {"dye_c2s4_c";10;0.000000;0}, {"dye_c2c4_c";10;0.000000;0}, {"dye_d2s4_c";10;0.000000;0}, {"dye_d2c4_c";10;0.000000;0}, {"dye_i2m4_c";10;0.000000;0}, {"dye_i2w4_c";10;0.000000;0}, {"dye_m2i4_c";10;0.000000;0}, {"dye_m2w4_c";10;0.000000;0}, {"dye_w2i4_c";10;0.000000;0}, {"dye_w2m4_c";10;0.000000;0}, {"dye_s2c3_c";10;0.000000;0}, {"dye_s2d3_c";10;0.000000;0}, {"dye_c2s3_c";10;0.000000;0}, {"dye_c2c3_c";10;0.000000;0}, {"dye_d2s3_c";10;0.000000;0}, {"dye_d2c3_c";10;0.000000;0}, {"dye_i2m3_c";10;0.000000;0}, {"dye_i2w3_c";10;0.000000;0}, {"dye_m2i3_c";10;0.000000;0}, {"dye_m2w3_c";10;0.000000;0}, {"dye_w2i3_c";10;0.000000;0}, {"dye_w2m3_c";10;0.000000;0}, {"dye_s3c5_c";10;0.000000;0}, {"dye_s3d5_c";10;0.000000;0}, {"dye_c3s5_c";10;0.000000;0}, {"dye_c3c5_c";10;0.000000;0}, {"dye_d3s5_c";10;0.000000;0}, {"dye_d3c5_c";10;0.000000;0}, {"dye_i3m5_c";10;0.000000;0}, {"dye_i3w5_c";10;0.000000;0}, {"dye_m3i5_c";10;0.000000;0}, {"dye_m3w5_c";10;0.000000;0}, {"dye_w3i5_c";10;0.000000;0}, {"dye_w3m5_c";10;0.000000;0}, {"dye_s3c4_c";10;0.000000;0}, {"dye_s3d4_c";10;0.000000;0}, {"dye_c3s4_c";10;0.000000;0}, {"dye_c3c4_c";10;0.000000;0}, {"dye_d3s4_c";10;0.000000;0}, {"dye_d3c4_c";10;0.000000;0}, {"dye_i3m4_c";10;0.000000;0}, {"dye_i3w4_c";10;0.000000;0}, {"dye_m3i4_c";10;0.000000;0}, {"dye_m3w4_c";10;0.000000;0}, {"dye_w3i4_c";10;0.000000;0}, {"dye_w3m4_c";10;0.000000;0}, {"dye_s4c6_c";10;0.000000;0}, {"dye_s4d6_c";10;0.000000;0}, {"dye_c4s6_c";10;0.000000;0}, {"dye_c4c6_c";10;0.000000;0}, {"dye_d4s6_c";10;0.000000;0}, {"dye_d4c6_c";10;0.000000;0}, {"dye_i4m6_c";10;0.000000;0}, {"dye_i4w6_c";10;0.000000;0}, {"dye_m4i6_c";10;0.000000;0}, {"dye_m4w6_c";10;0.000000;0}, {"dye_w4i6_c";10;0.000000;0}, {"dye_w4m6_c";10;0.000000;0}, {"dye_s4c5_c";10;0.000000;0}, {"dye_s4d5_c";10;0.000000;0}, {"dye_c4s5_c";10;0.000000;0}, {"dye_c4c5_c";10;0.000000;0}, {"dye_d4s5_c";10;0.000000;0}, {"dye_d4c5_c";10;0.000000;0}, {"dye_i4m5_c";10;0.000000;0}, {"dye_i4w5_c";10;0.000000;0}, {"dye_m4i5_c";10;0.000000;0}, {"dye_m4w5_c";10;0.000000;0}, {"dye_w4i5_c";10;0.000000;0}, {"dye_w4m5_c";10;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 4 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Good Work's Reward (In Progress)");

}
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 5 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Good Work's Reward (In Progress)");

}
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 6 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Good Work's Reward (In Progress)");

}
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 7 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Good Work's Reward (In Progress)");

}
if (gg.HaveMemo(talker, 40) == 0 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "A Special Order");

}
if (myself.GetOneTimeQuestFlag(talker, 40) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "A Special Order (Done)");

}
if (gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) <= 2 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "A Special Order (In Progress)");

}
if (gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) == 3 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "A Special Order (In Progress)");

}
if (gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) >= 10 && gg.GetMemoState(talker, 40) <= 11 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "A Special Order (In Progress)");

}
if (gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) == 12 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "A Special Order (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 4 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "helvetia_q0060_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 5 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "helvetia_q0060_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 6 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "helvetia_q0060_08.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 7 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 10868) == 0) {
myself.GiveItem1(talker, 10868, 1);
myself.ShowPage(talker, "helvetia_q0060_09.htm");

} else {
myself.ShowPage(talker, "helvetia_q0060_10.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 40) == 0 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
myself.SetCurrentQuestID(40);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 40) {
myself.FHTML_SetFileName(fhtml0, "helvetia_q0040_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 40);
myself.ShowQuestFHTML(talker, fhtml0, 40);

} else {
myself.ShowQuestPage(talker, "helvetia_q0040_02.htm", 40);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 40) == 1) {
myself.SetCurrentQuestID(40);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) <= 2 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
myself.SetCurrentQuestID(40);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "helvetia_q0040_05.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) == 3 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
myself.SetCurrentQuestID(40);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "helvetia_q0040_06.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) >= 10 && gg.GetMemoState(talker, 40) <= 11 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
myself.SetCurrentQuestID(40);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "helvetia_q0040_08.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) == 12 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
myself.SetCurrentQuestID(40);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "helvetia_q0040_09.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 40) {
myself.SetCurrentQuestID(40);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 40) == 0 && talker.level >= 40 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
myself.SetMemo(talker, quest_id);
if (gg.Rand(2) == 1) {
myself.ShowQuestPage(talker, "helvetia_q0040_03.htm", 40);
myself.SetMemoState(talker, 40, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 40, 2);
myself.ShowQuestMark(talker, 40);

} else {
myself.ShowQuestPage(talker, "helvetia_q0040_04.htm", 40);
myself.SetMemoState(talker, 40, 10);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 40, 5);
myself.ShowQuestMark(talker, 40);

}

}
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 60) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 60) {
if (reply == 1) {
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 4 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.ShowPage(talker, "helvetia_q0060_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 4 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.DeleteItem1(talker, 10867, gg.OwnItemCount(talker, 10867));
myself.SetMemoState(talker, 60, 5);
myself.ShowPage(talker, "helvetia_q0060_03.htm");
myself.SetFlagJournal(talker, 60, 5);
myself.ShowQuestMark(talker, 60);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) >= 5 && gg.GetMemoState(talker, 60) <= 6 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
if (gg.OwnItemCount(talker, 57) >= 3000000) {
myself.GiveItem1(talker, 10868, 1);
myself.DeleteItem1(talker, 57, 3000000);
myself.SetMemoState(talker, 60, 7);
myself.ShowPage(talker, "helvetia_q0060_05.htm");
myself.SetFlagJournal(talker, 60, 7);
myself.ShowQuestMark(talker, 60);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.SetMemoState(talker, 60, 6);
myself.ShowPage(talker, "helvetia_q0060_06.htm");
myself.SetFlagJournal(talker, 60, 6);
myself.ShowQuestMark(talker, 60);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 5 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetMemoState(talker, 60, 6);
myself.ShowPage(talker, "helvetia_q0060_07.htm");
myself.SetFlagJournal(talker, 60, 6);
myself.ShowQuestMark(talker, 60);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 40) {
myself.SetCurrentQuestID(40);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 40) {
if (reply == 1) {
if (gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) == 3 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
myself.GiveItem1(talker, 10632, 1);
myself.DeleteItem1(talker, 12764, gg.OwnItemCount(talker, 12764));
myself.ShowPage(talker, "helvetia_q0040_07.htm");
myself.RemoveMemo(talker, 40);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 40);
myself.SetOneTimeQuestFlag(talker, 40, 1);

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 40) == 1 && gg.GetMemoState(talker, 40) == 12 && myself.GetOneTimeQuestFlag(talker, 40) == 0) {
myself.GiveItem1(talker, 10632, 1);
myself.DeleteItem1(talker, 12765, gg.OwnItemCount(talker, 12765));
myself.ShowPage(talker, "helvetia_q0040_10.htm");
myself.RemoveMemo(talker, 40);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 40);
myself.SetOneTimeQuestFlag(talker, 40, 1);

}

}

}
super;
	}


}