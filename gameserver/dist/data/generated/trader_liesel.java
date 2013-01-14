package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_liesel extends merchant {
protected Object[][] SellList0 = {
{"dye_s1c3_d";20;0.000000;0}, {"dye_s1d3_d";20;0.000000;0}, {"dye_c1s3_d";20;0.000000;0}, {"dye_c1d3_d";20;0.000000;0}, {"dye_d1s3_d";20;0.000000;0}, {"dye_d1c3_d";20;0.000000;0}, {"dye_i1m3_d";20;0.000000;0}, {"dye_i1w3_d";20;0.000000;0}, {"dye_m1i3_d";20;0.000000;0}, {"dye_m1w3_d";20;0.000000;0}, {"dye_w1i3_d";20;0.000000;0}, {"dye_w1m3_d";20;0.000000;0}, {"dye_s1c2_d";20;0.000000;0}, {"dye_s1d2_d";20;0.000000;0}, {"dye_c1s2_d";20;0.000000;0}, {"dye_c1d2_d";20;0.000000;0}, {"dye_d1s2_d";20;0.000000;0}, {"dye_d1c2_d";20;0.000000;0}, {"dye_i1m2_d";20;0.000000;0}, {"dye_i1w2_d";20;0.000000;0}, {"dye_m1i2_d";20;0.000000;0}, {"dye_m1w2_d";20;0.000000;0}, {"dye_w1i2_d";20;0.000000;0}, {"dye_w1m2_d";20;0.000000;0}, {"dye_s1c3_c";20;0.000000;0}, {"dye_s1d3_c";20;0.000000;0}, {"dye_c1s3_c";20;0.000000;0}, {"dye_c1c3_c";20;0.000000;0}, {"dye_d1s3_c";20;0.000000;0}, {"dye_d1c3_c";20;0.000000;0}, {"dye_i1m3_c";20;0.000000;0}, {"dye_i1w3_c";20;0.000000;0}, {"dye_m1i3_c";20;0.000000;0}, {"dye_m1w3_c";20;0.000000;0}, {"dye_w1i3_c";20;0.000000;0}, {"dye_w1m3_c";20;0.000000;0}, {"dye_s1c2_c";20;0.000000;0}, {"dye_s1d2_c";20;0.000000;0}, {"dye_c1s2_c";20;0.000000;0}, {"dye_c1c2_c";20;0.000000;0}, {"dye_d1s2_c";20;0.000000;0}, {"dye_d1c2_c";20;0.000000;0}, {"dye_i1m2_c";20;0.000000;0}, {"dye_i1w2_c";20;0.000000;0}, {"dye_m1i2_c";20;0.000000;0}, {"dye_m1w2_c";20;0.000000;0}, {"dye_w1i2_c";20;0.000000;0}, {"dye_w1m2_c";20;0.000000;0}, {"dye_s2c4_c";20;0.000000;0}, {"dye_s2d4_c";20;0.000000;0}, {"dye_c2s4_c";20;0.000000;0}, {"dye_c2c4_c";20;0.000000;0}, {"dye_d2s4_c";20;0.000000;0}, {"dye_d2c4_c";20;0.000000;0}, {"dye_i2m4_c";20;0.000000;0}, {"dye_i2w4_c";20;0.000000;0}, {"dye_m2i4_c";20;0.000000;0}, {"dye_m2w4_c";20;0.000000;0}, {"dye_w2i4_c";20;0.000000;0}, {"dye_w2m4_c";20;0.000000;0}, {"dye_s2c3_c";20;0.000000;0}, {"dye_s2d3_c";20;0.000000;0}, {"dye_c2s3_c";20;0.000000;0}, {"dye_c2c3_c";20;0.000000;0}, {"dye_d2s3_c";20;0.000000;0}, {"dye_d2c3_c";20;0.000000;0}, {"dye_i2m3_c";20;0.000000;0}, {"dye_i2w3_c";20;0.000000;0}, {"dye_m2i3_c";20;0.000000;0}, {"dye_m2w3_c";20;0.000000;0}, {"dye_w2i3_c";20;0.000000;0}, {"dye_w2m3_c";20;0.000000;0}, {"dye_s3c5_c";20;0.000000;0}, {"dye_s3d5_c";20;0.000000;0}, {"dye_c3s5_c";20;0.000000;0}, {"dye_c3c5_c";20;0.000000;0}, {"dye_d3s5_c";20;0.000000;0}, {"dye_d3c5_c";20;0.000000;0}, {"dye_i3m5_c";20;0.000000;0}, {"dye_i3w5_c";20;0.000000;0}, {"dye_m3i5_c";20;0.000000;0}, {"dye_m3w5_c";20;0.000000;0}, {"dye_w3i5_c";20;0.000000;0}, {"dye_w3m5_c";20;0.000000;0}, {"dye_s3c4_c";20;0.000000;0}, {"dye_s3d4_c";20;0.000000;0}, {"dye_c3s4_c";20;0.000000;0}, {"dye_c3c4_c";20;0.000000;0}, {"dye_d3s4_c";20;0.000000;0}, {"dye_d3c4_c";20;0.000000;0}, {"dye_i3m4_c";20;0.000000;0}, {"dye_i3w4_c";20;0.000000;0}, {"dye_m3i4_c";20;0.000000;0}, {"dye_m3w4_c";20;0.000000;0}, {"dye_w3i4_c";20;0.000000;0}, {"dye_w3m4_c";20;0.000000;0}, {"dye_s4c6_c";20;0.000000;0}, {"dye_s4d6_c";20;0.000000;0}, {"dye_c4s6_c";20;0.000000;0}, {"dye_c4c6_c";20;0.000000;0}, {"dye_d4s6_c";20;0.000000;0}, {"dye_d4c6_c";20;0.000000;0}, {"dye_i4m6_c";20;0.000000;0}, {"dye_i4w6_c";20;0.000000;0}, {"dye_m4i6_c";20;0.000000;0}, {"dye_m4w6_c";20;0.000000;0}, {"dye_w4i6_c";20;0.000000;0}, {"dye_w4m6_c";20;0.000000;0}, {"dye_s4c5_c";20;0.000000;0}, {"dye_s4d5_c";20;0.000000;0}, {"dye_c4s5_c";20;0.000000;0}, {"dye_c4c5_c";20;0.000000;0}, {"dye_d4s5_c";20;0.000000;0}, {"dye_d4c5_c";20;0.000000;0}, {"dye_i4m5_c";20;0.000000;0}, {"dye_i4w5_c";20;0.000000;0}, {"dye_m4i5_c";20;0.000000;0}, {"dye_m4w5_c";20;0.000000;0}, {"dye_w4i5_c";20;0.000000;0}, {"dye_w4m5_c";20;0.000000;0}
};
protected Object[][] SellList1 = {
{"soulshot_none";20;0.000000;0}, {"spiritshot_none";20;0.000000;0}, {"blessed_spiritshot_none";20;0.000000;0}, {"soulshot_d";20;0.000000;0}, {"soulshot_c";20;0.000000;0}, {"blessed_spiritshot_d";20;0.000000;0}, {"blessed_spiritshot_c";20;0.000000;0}, {"comp_bspiritshot_none";20;0.000000;0}, {"comp_spiritshot_none";20;0.000000;0}, {"comp_soulshot_none";20;0.000000;0}, {"adv_comp_bspiritshot_none";20;0.000000;0}, {"adv_comp_spiritshot_none";20;0.000000;0}, {"adv_comp_soulshot_none";20;0.000000;0}, {"wooden_arrow";20;0.000000;0}, {"bone_arrow";20;0.000000;0}, {"fine_steel_arrow";20;0.000000;0}, {"lesser_healing_potion";20;0.000000;0}, {"healing_potion";20;0.000000;0}, {"antidote";20;0.000000;0}, {"advanced_antidote";20;0.000000;0}, {"bandage";20;0.000000;0}, {"emergency_dressing";20;0.000000;0}, {"quick_step_potion";20;0.000000;0}, {"swift_attack_potion";20;0.000000;0}, {"potion_of_acumen2";20;0.000000;0}, {"scroll_of_awake";20;0.000000;0}, {"scroll_of_escape";20;0.000000;0}, {"scroll_of_resurrection";20;0.000000;0}, {"scroll_of_escape_to_agit";20;0.000000;0}, {"scroll_of_escape_to_castle";20;0.000000;0}, {"spirit_ore";20;0.000000;0}, {"soul_ore";20;0.000000;0}, {"energy_stone";20;0.000000;0}, {"key_of_thief";20;0.000000;0}, {"rope_of_magic_d";20;0.000000;0}, {"rope_of_magic_c";20;0.000000;0}, {"rope_of_magic_b";20;0.000000;0}, {"rope_of_magic_a";20;0.000000;0}, {"gemstone_d";20;0.000000;0}, {"gemstone_c";20;0.000000;0}, {"gemstone_b";20;0.000000;0}, {"bone_bolt";20;0.000000;0}, {"fine_steel_bolt";20;0.000000;0}, {"recovery_scroll_none";20;0.000000;0}, {"recovery_scroll_d";20;0.000000;0}, {"recovery_scroll_c";20;0.000000;0}, {"recovery_scroll_b";20;0.000000;0}, {"recovery_scroll_a";20;0.000000;0}, {"elixir_of_life_none";20;0.000000;0}, {"elixir_of_life_d";20;0.000000;0}, {"elixir_of_life_c";20;0.000000;0}, {"elixir_of_combative_none";20;0.000000;0}, {"elixir_of_combative_d";20;0.000000;0}, {"elixir_of_combative_c";20;0.000000;0}, {"elixir_of_combative_b";20;0.000000;0}, {"elixir_of_combative_a";20;0.000000;0}, {"crystal_of_summon";20;0.000000;0}, {"mystery_solvent";20;0.000000;0}, {"blank_soul_bottle_5";20;0.000000;0}, {"dice_heart";20;0.000000;0}, {"dice_spade";20;0.000000;0}, {"dice_clover";20;0.000000;0}, {"dice_diamond";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 74 && gg.HaveMemo(talker, 14) == 0 && myself.GetOneTimeQuestFlag(talker, 14) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Whereabouts of the Archaeologist");

}
if (talker.level < 74 && gg.HaveMemo(talker, 14) == 0 && myself.GetOneTimeQuestFlag(talker, 14) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Whereabouts of the Archaeologist");

}
if (gg.HaveMemo(talker, 14) == 0 && myself.GetOneTimeQuestFlag(talker, 14) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Whereabouts of the Archaeologist (Done)");

}
if (gg.HaveMemo(talker, 14) == 1 && myself.GetOneTimeQuestFlag(talker, 14) == 0 && gg.GetMemoState(talker, 14) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Whereabouts of the Archaeologist (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 74 && gg.HaveMemo(talker, 14) == 0 && myself.GetOneTimeQuestFlag(talker, 14) == 0) {
myself.SetCurrentQuestID(14);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "trader_liesel_q0014_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 14);
myself.ShowQuestFHTML(talker, fhtml0, 14);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 74 && gg.HaveMemo(talker, 14) == 0 && myself.GetOneTimeQuestFlag(talker, 14) == 0) {
myself.SetCurrentQuestID(14);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_liesel_q0014_0103.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 14) == 0 && myself.GetOneTimeQuestFlag(talker, 14) == 1) {
myself.SetCurrentQuestID(14);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 14) == 1 && myself.GetOneTimeQuestFlag(talker, 14) == 0 && gg.GetMemoState(talker, 14) == 1 * 10 + 1) {
myself.SetCurrentQuestID(14);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_liesel_q0014_0105.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 14) {
myself.SetCurrentQuestID(14);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 14);
myself.ShowQuestMark(talker, 14);
myself.SetMemoState(talker, 14, 1 * 10 + 1);
gg.AddLog(1, talker, 14);
myself.SetFlagJournal(talker, 14, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "trader_liesel_q0014_0104.htm", 14);
myself.GiveItem1(talker, 7253, 1);

}
return;

}
super;
	}


}