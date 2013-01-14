package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lars extends merchant {
protected Object[][] SellList0 = {
{"soulshot_none";20;0.000000;0}, {"spiritshot_none";20;0.000000;0}, {"blessed_spiritshot_none";20;0.000000;0}, {"soulshot_d";20;0.000000;0}, {"soulshot_c";20;0.000000;0}, {"blessed_spiritshot_d";20;0.000000;0}, {"blessed_spiritshot_c";20;0.000000;0}, {"comp_bspiritshot_none";20;0.000000;0}, {"comp_spiritshot_none";20;0.000000;0}, {"comp_soulshot_none";20;0.000000;0}, {"adv_comp_bspiritshot_none";20;0.000000;0}, {"adv_comp_spiritshot_none";20;0.000000;0}, {"adv_comp_soulshot_none";20;0.000000;0}, {"wooden_arrow";20;0.000000;0}, {"bone_arrow";20;0.000000;0}, {"fine_steel_arrow";20;0.000000;0}, {"lesser_healing_potion";20;0.000000;0}, {"healing_potion";20;0.000000;0}, {"antidote";20;0.000000;0}, {"advanced_antidote";20;0.000000;0}, {"bandage";20;0.000000;0}, {"emergency_dressing";20;0.000000;0}, {"quick_step_potion";20;0.000000;0}, {"swift_attack_potion";20;0.000000;0}, {"potion_of_acumen2";20;0.000000;0}, {"scroll_of_awake";20;0.000000;0}, {"scroll_of_escape";20;0.000000;0}, {"scroll_of_resurrection";20;0.000000;0}, {"scroll_of_escape_to_agit";20;0.000000;0}, {"spirit_ore";20;0.000000;0}, {"soul_ore";20;0.000000;0}, {"energy_stone";20;0.000000;0}, {"key_of_thief";20;0.000000;0}, {"rope_of_magic_d";20;0.000000;0}, {"rope_of_magic_c";20;0.000000;0}, {"rope_of_magic_b";20;0.000000;0}, {"gemstone_d";20;0.000000;0}, {"bone_bolt";20;0.000000;0}, {"fine_steel_bolt";20;0.000000;0}, {"recovery_scroll_none";20;0.000000;0}, {"recovery_scroll_d";20;0.000000;0}, {"recovery_scroll_c";20;0.000000;0}, {"recovery_scroll_b";20;0.000000;0}, {"elixir_of_life_none";20;0.000000;0}, {"elixir_of_life_d";20;0.000000;0}, {"elixir_of_life_c";20;0.000000;0}, {"elixir_of_mental_d";20;0.000000;0}, {"elixir_of_combative_none";20;0.000000;0}, {"elixir_of_combative_d";20;0.000000;0}, {"elixir_of_combative_c";20;0.000000;0}, {"elixir_of_combative_b";20;0.000000;0}, {"crystal_of_summon";20;0.000000;0}, {"blank_soul_bottle_5";20;0.000000;0}, {"dice_heart";20;0.000000;0}, {"dice_spade";20;0.000000;0}, {"dice_clover";20;0.000000;0}, {"dice_diamond";20;0.000000;0}
};
protected Object[][] SellList1 = {
{"dye_s1c3_d";20;0.000000;0}, {"dye_s1d3_d";20;0.000000;0}, {"dye_c1s3_d";20;0.000000;0}, {"dye_c1d3_d";20;0.000000;0}, {"dye_d1s3_d";20;0.000000;0}, {"dye_d1c3_d";20;0.000000;0}, {"dye_i1m3_d";20;0.000000;0}, {"dye_i1w3_d";20;0.000000;0}, {"dye_m1i3_d";20;0.000000;0}, {"dye_m1w3_d";20;0.000000;0}, {"dye_w1i3_d";20;0.000000;0}, {"dye_w1m3_d";20;0.000000;0}, {"dye_s1c2_d";20;0.000000;0}, {"dye_s1d2_d";20;0.000000;0}, {"dye_c1s2_d";20;0.000000;0}, {"dye_c1d2_d";20;0.000000;0}, {"dye_d1s2_d";20;0.000000;0}, {"dye_d1c2_d";20;0.000000;0}, {"dye_i1m2_d";20;0.000000;0}, {"dye_i1w2_d";20;0.000000;0}, {"dye_m1i2_d";20;0.000000;0}, {"dye_m1w2_d";20;0.000000;0}, {"dye_w1i2_d";20;0.000000;0}, {"dye_w1m2_d";20;0.000000;0}, {"dye_s1c3_c";20;0.000000;0}, {"dye_s1d3_c";20;0.000000;0}, {"dye_c1s3_c";20;0.000000;0}, {"dye_c1c3_c";20;0.000000;0}, {"dye_d1s3_c";20;0.000000;0}, {"dye_d1c3_c";20;0.000000;0}, {"dye_i1m3_c";20;0.000000;0}, {"dye_i1w3_c";20;0.000000;0}, {"dye_m1i3_c";20;0.000000;0}, {"dye_m1w3_c";20;0.000000;0}, {"dye_w1i3_c";20;0.000000;0}, {"dye_w1m3_c";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3347) == 0 && gg.OwnItemCount(talker, 3348) == 0 && gg.OwnItemCount(talker, 3349) == 0 && gg.OwnItemCount(talker, 3350) == 0 && gg.OwnItemCount(talker, 3351) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3347) && gg.OwnItemCount(talker, 3337) < 30 || gg.OwnItemCount(talker, 3338) < 30) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3347) && gg.OwnItemCount(talker, 3337) >= 30 && gg.OwnItemCount(talker, 3338) >= 30) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3348) && gg.OwnItemCount(talker, 3339) < 30 || gg.OwnItemCount(talker, 3340) < 30) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3348) && gg.OwnItemCount(talker, 3339) >= 30 && gg.OwnItemCount(talker, 3340) >= 30) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3349) && gg.OwnItemCount(talker, 3341) < 30 || gg.OwnItemCount(talker, 3342) < 30) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3349) && gg.OwnItemCount(talker, 3341) >= 30 && gg.OwnItemCount(talker, 3342) >= 30) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3350) && gg.OwnItemCount(talker, 3343) < 30 || gg.OwnItemCount(talker, 3345) < 30) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3350) && gg.OwnItemCount(talker, 3343) >= 30 && gg.OwnItemCount(talker, 3345) >= 30) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3351) && gg.OwnItemCount(talker, 3344) < 30 || gg.OwnItemCount(talker, 3346) < 30) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3351) && gg.OwnItemCount(talker, 3344) >= 30 && gg.OwnItemCount(talker, 3346) >= 30) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3309) == 1 && gg.OwnItemCount(talker, 3314) == 0 && gg.OwnItemCount(talker, 3319) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3319) == 0 && gg.OwnItemCount(talker, 3309) >= 1 && gg.OwnItemCount(talker, 3314) >= 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3314) == 0 && gg.OwnItemCount(talker, 3309) >= 1 && gg.OwnItemCount(talker, 3319) >= 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3323) >= 1 || gg.OwnItemCount(talker, 3324) >= 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 299) == 1 && gg.GetMemoState(talker, 299) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Gather Ingredients for Pie (In Progress)");

}
if (gg.HaveMemo(talker, 299) == 1 && gg.GetMemoState(talker, 299) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Gather Ingredients for Pie (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352)) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lars_q0230_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3347) == 0 && gg.OwnItemCount(talker, 3348) == 0 && gg.OwnItemCount(talker, 3349) == 0 && gg.OwnItemCount(talker, 3350) == 0 && gg.OwnItemCount(talker, 3351) == 0) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lars_q0230_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3347) && gg.OwnItemCount(talker, 3337) < 30 || gg.OwnItemCount(talker, 3338) < 30) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lars_q0230_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3347) && gg.OwnItemCount(talker, 3337) >= 30 && gg.OwnItemCount(talker, 3338) >= 30) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "lars_q0230_06.htm");
myself.GiveItem1(talker, 3353, 2);
myself.DeleteItem1(talker, 3347, gg.OwnItemCount(talker, 3347));
myself.DeleteItem1(talker, 3337, gg.OwnItemCount(talker, 3337));
myself.DeleteItem1(talker, 3338, gg.OwnItemCount(talker, 3338));
myself.SetFlagJournal(talker, 230, 3);
myself.ShowQuestMark(talker, 230);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3348) && gg.OwnItemCount(talker, 3339) < 30 || gg.OwnItemCount(talker, 3340) < 30) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lars_q0230_07.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3348) && gg.OwnItemCount(talker, 3339) >= 30 && gg.OwnItemCount(talker, 3340) >= 30) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "lars_q0230_08.htm");
myself.GiveItem1(talker, 3353, 2);
myself.DeleteItem1(talker, 3348, gg.OwnItemCount(talker, 3348));
myself.DeleteItem1(talker, 3339, gg.OwnItemCount(talker, 3339));
myself.DeleteItem1(talker, 3340, gg.OwnItemCount(talker, 3340));
myself.SetFlagJournal(talker, 230, 3);
myself.ShowQuestMark(talker, 230);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3349) && gg.OwnItemCount(talker, 3341) < 30 || gg.OwnItemCount(talker, 3342) < 30) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lars_q0230_09.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3349) && gg.OwnItemCount(talker, 3341) >= 30 && gg.OwnItemCount(talker, 3342) >= 30) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "lars_q0230_10.htm");
myself.GiveItem1(talker, 3353, 2);
myself.DeleteItem1(talker, 3349, gg.OwnItemCount(talker, 3349));
myself.DeleteItem1(talker, 3341, gg.OwnItemCount(talker, 3341));
myself.DeleteItem1(talker, 3342, gg.OwnItemCount(talker, 3342));
myself.SetFlagJournal(talker, 230, 3);
myself.ShowQuestMark(talker, 230);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3350) && gg.OwnItemCount(talker, 3343) < 30 || gg.OwnItemCount(talker, 3345) < 30) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lars_q0230_11.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3350) && gg.OwnItemCount(talker, 3343) >= 30 && gg.OwnItemCount(talker, 3345) >= 30) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "lars_q0230_12.htm");
myself.GiveItem1(talker, 3353, 2);
myself.DeleteItem1(talker, 3350, gg.OwnItemCount(talker, 3350));
myself.DeleteItem1(talker, 3343, gg.OwnItemCount(talker, 3343));
myself.DeleteItem1(talker, 3345, gg.OwnItemCount(talker, 3345));
myself.SetFlagJournal(talker, 230, 3);
myself.ShowQuestMark(talker, 230);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3351) && gg.OwnItemCount(talker, 3344) < 30 || gg.OwnItemCount(talker, 3346) < 30) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lars_q0230_13.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3351) && gg.OwnItemCount(talker, 3344) >= 30 && gg.OwnItemCount(talker, 3346) >= 30) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "lars_q0230_14.htm");
myself.GiveItem1(talker, 3353, 2);
myself.DeleteItem1(talker, 3351, gg.OwnItemCount(talker, 3351));
myself.DeleteItem1(talker, 3344, gg.OwnItemCount(talker, 3344));
myself.DeleteItem1(talker, 3346, gg.OwnItemCount(talker, 3346));
myself.SetFlagJournal(talker, 230, 3);
myself.ShowQuestMark(talker, 230);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3309) == 1 && gg.OwnItemCount(talker, 3314) == 0 && gg.OwnItemCount(talker, 3319) == 0) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "lars_q0229_01.htm", 229);

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3319) == 0 && gg.OwnItemCount(talker, 3309) >= 1 && gg.OwnItemCount(talker, 3314) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "lars_q0229_03.htm", 229);

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3314) == 0 && gg.OwnItemCount(talker, 3309) >= 1 && gg.OwnItemCount(talker, 3319) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "lars_q0229_04.htm", 229);

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3323) >= 1 || gg.OwnItemCount(talker, 3324) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "lars_q0229_05.htm", 229);

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 299) == 1 && gg.GetMemoState(talker, 299) == 2 * 10 + 1) {
myself.SetCurrentQuestID(299);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 299, 2);
myself.ShowPage(talker, "lars_q0299_0201.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 299) == 1 && gg.GetMemoState(talker, 299) == 3 * 10 + 1) {
myself.SetCurrentQuestID(299);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lars_q0299_0302.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 230) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 230) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetFlagJournal(talker, 230, 2);
myself.ShowQuestMark(talker, 230);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "lars_q0230_02.htm");
switch (gg.Rand(5)) {
case 0: {
myself.GiveItem1(talker, 3347, 1);
break;

}
case 1: {
myself.GiveItem1(talker, 3348, 1);
break;

}
case 2: {
myself.GiveItem1(talker, 3349, 1);
break;

}
case 3: {
myself.GiveItem1(talker, 3350, 1);
break;

}
case 4: {
myself.GiveItem1(talker, 3351, 1);
break;

}

}
myself.DeleteItem1(talker, 3352, gg.OwnItemCount(talker, 3352));

}

} else if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "lars_q0230_04.htm");
switch (gg.Rand(5)) {
case 0: {
myself.GiveItem1(talker, 3347, 1);
break;

}
case 1: {
myself.GiveItem1(talker, 3348, 1);
break;

}
case 2: {
myself.GiveItem1(talker, 3349, 1);
break;

}
case 3: {
myself.GiveItem1(talker, 3350, 1);
break;

}
case 4: {
myself.GiveItem1(talker, 3351, 1);
break;

}

}

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
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "lars_q0229_02.htm", 229);
myself.GiveItem1(talker, 3314, 1);

}

}

}
if (ask == 299) {
myself.SetCurrentQuestID(299);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 299) {
i0 = myself.GetHTMLCookie(talker, 299, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 299) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7137, 1);
myself.ShowPage(talker, "lars_q0299_0301.htm");
myself.SetMemoState(talker, 299, 3 * 10 + 1);
myself.SetFlagJournal(talker, 299, 4);
myself.ShowQuestMark(talker, 299);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}