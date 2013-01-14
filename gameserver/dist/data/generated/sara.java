package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sara extends merchant {
protected Object[][] SellList0 = {
{"soulshot_none";15;0.000000;0}, {"spiritshot_none";15;0.000000;0}, {"blessed_spiritshot_none";15;0.000000;0}, {"soulshot_d";15;0.000000;0}, {"soulshot_c";15;0.000000;0}, {"blessed_spiritshot_d";15;0.000000;0}, {"blessed_spiritshot_c";15;0.000000;0}, {"comp_bspiritshot_none";15;0.000000;0}, {"comp_spiritshot_none";15;0.000000;0}, {"comp_soulshot_none";15;0.000000;0}, {"adv_comp_bspiritshot_none";15;0.000000;0}, {"adv_comp_spiritshot_none";15;0.000000;0}, {"adv_comp_soulshot_none";15;0.000000;0}, {"wooden_arrow";15;0.000000;0}, {"bone_arrow";15;0.000000;0}, {"fine_steel_arrow";15;0.000000;0}, {"lesser_healing_potion";15;0.000000;0}, {"healing_potion";15;0.000000;0}, {"antidote";15;0.000000;0}, {"advanced_antidote";15;0.000000;0}, {"bandage";15;0.000000;0}, {"emergency_dressing";15;0.000000;0}, {"quick_step_potion";15;0.000000;0}, {"swift_attack_potion";15;0.000000;0}, {"potion_of_acumen2";15;0.000000;0}, {"scroll_of_awake";15;0.000000;0}, {"scroll_of_escape";15;0.000000;0}, {"scroll_of_resurrection";15;0.000000;0}, {"scroll_of_escape_to_agit";15;0.000000;0}, {"spirit_ore";15;0.000000;0}, {"soul_ore";15;0.000000;0}, {"energy_stone";15;0.000000;0}, {"key_of_thief";15;0.000000;0}, {"rope_of_magic_d";15;0.000000;0}, {"rope_of_magic_c";15;0.000000;0}, {"rope_of_magic_b";15;0.000000;0}, {"gemstone_d";15;0.000000;0}, {"bone_bolt";15;0.000000;0}, {"fine_steel_bolt";15;0.000000;0}, {"recovery_scroll_none";15;0.000000;0}, {"recovery_scroll_d";15;0.000000;0}, {"recovery_scroll_c";15;0.000000;0}, {"recovery_scroll_b";15;0.000000;0}, {"elixir_of_life_none";15;0.000000;0}, {"elixir_of_life_d";15;0.000000;0}, {"elixir_of_life_c";15;0.000000;0}, {"elixir_of_mental_d";15;0.000000;0}, {"elixir_of_combative_none";15;0.000000;0}, {"elixir_of_combative_d";15;0.000000;0}, {"elixir_of_combative_c";15;0.000000;0}, {"elixir_of_combative_b";15;0.000000;0}, {"crystal_of_summon";15;0.000000;0}, {"blank_soul_bottle_5";15;0.000000;0}, {"dice_heart";15;0.000000;0}, {"dice_spade";15;0.000000;0}, {"dice_clover";15;0.000000;0}, {"dice_diamond";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"dye_s1c3_d";15;0.000000;0}, {"dye_s1d3_d";15;0.000000;0}, {"dye_c1s3_d";15;0.000000;0}, {"dye_c1d3_d";15;0.000000;0}, {"dye_d1s3_d";15;0.000000;0}, {"dye_d1c3_d";15;0.000000;0}, {"dye_i1m3_d";15;0.000000;0}, {"dye_i1w3_d";15;0.000000;0}, {"dye_m1i3_d";15;0.000000;0}, {"dye_m1w3_d";15;0.000000;0}, {"dye_w1i3_d";15;0.000000;0}, {"dye_w1m3_d";15;0.000000;0}, {"dye_s1c2_d";15;0.000000;0}, {"dye_s1d2_d";15;0.000000;0}, {"dye_c1s2_d";15;0.000000;0}, {"dye_c1d2_d";15;0.000000;0}, {"dye_d1s2_d";15;0.000000;0}, {"dye_d1c2_d";15;0.000000;0}, {"dye_i1m2_d";15;0.000000;0}, {"dye_i1w2_d";15;0.000000;0}, {"dye_m1i2_d";15;0.000000;0}, {"dye_m1w2_d";15;0.000000;0}, {"dye_w1i2_d";15;0.000000;0}, {"dye_w1m2_d";15;0.000000;0}, {"dye_s1c3_c";15;0.000000;0}, {"dye_s1d3_c";15;0.000000;0}, {"dye_c1s3_c";15;0.000000;0}, {"dye_c1c3_c";15;0.000000;0}, {"dye_d1s3_c";15;0.000000;0}, {"dye_d1c3_c";15;0.000000;0}, {"dye_i1m3_c";15;0.000000;0}, {"dye_i1w3_c";15;0.000000;0}, {"dye_m1i3_c";15;0.000000;0}, {"dye_m1w3_c";15;0.000000;0}, {"dye_w1i3_c";15;0.000000;0}, {"dye_w1m3_c";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 652) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "An Aged Ex-Adventurer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 652) == 1) {
myself.SetCurrentQuestID(652);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(10);
if (i0 <= 4) {
myself.GiveItem1(talker, 956, 1);
myself.GiveItem1(talker, 57, 5026);

} else {
myself.GiveItem1(talker, 57, 10000);

}
myself.RemoveMemo(talker, 652);
myself.SoundEffect(talker, "ItemSound.quest_finish");
if (i0 <= 4) {
myself.ShowPage(talker, "sara_q0652_01.htm");

} else {
myself.ShowPage(talker, "sara_q0652_02.htm");

}
gg.AddLog(2, talker, 652);
gg.AddLog(3, talker, 652);

}

}
break;

}

}
return;

}
super;
	}


}