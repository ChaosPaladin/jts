package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class day_violet extends merchant_for_chaotic {
protected Object[][] SellList0 = {
{"soulshot_none";50;0.000000;0}, {"spiritshot_none";50;0.000000;0}, {"blessed_spiritshot_none";50;0.000000;0}, {"soulshot_d";50;0.000000;0}, {"soulshot_c";50;0.000000;0}, {"blessed_spiritshot_d";50;0.000000;0}, {"blessed_spiritshot_c";50;0.000000;0}, {"comp_bspiritshot_none";50;0.000000;0}, {"comp_spiritshot_none";50;0.000000;0}, {"comp_soulshot_none";50;0.000000;0}, {"adv_comp_bspiritshot_none";50;0.000000;0}, {"adv_comp_spiritshot_none";50;0.000000;0}, {"adv_comp_soulshot_none";50;0.000000;0}, {"wooden_arrow";50;0.000000;0}, {"bone_arrow";50;0.000000;0}, {"fine_steel_arrow";50;0.000000;0}, {"lesser_healing_potion";50;0.000000;0}, {"healing_potion";50;0.000000;0}, {"antidote";50;0.000000;0}, {"advanced_antidote";50;0.000000;0}, {"bandage";50;0.000000;0}, {"emergency_dressing";50;0.000000;0}, {"quick_step_potion";50;0.000000;0}, {"swift_attack_potion";50;0.000000;0}, {"potion_of_acumen2";50;0.000000;0}, {"scroll_of_awake";50;0.000000;0}, {"scroll_of_escape";50;0.000000;0}, {"scroll_of_resurrection";50;0.000000;0}, {"scroll_of_escape_to_agit";50;0.000000;0}, {"spirit_ore";50;0.000000;0}, {"soul_ore";50;0.000000;0}, {"energy_stone";50;0.000000;0}, {"key_of_thief";50;0.000000;0}, {"rope_of_magic_d";50;0.000000;0}, {"rope_of_magic_c";50;0.000000;0}, {"rope_of_magic_b";50;0.000000;0}, {"gemstone_d";50;0.000000;0}, {"bone_bolt";50;0.000000;0}, {"fine_steel_bolt";50;0.000000;0}, {"recovery_scroll_none";50;0.000000;0}, {"recovery_scroll_d";50;0.000000;0}, {"recovery_scroll_c";50;0.000000;0}, {"recovery_scroll_b";50;0.000000;0}, {"elixir_of_life_none";50;0.000000;0}, {"elixir_of_life_d";50;0.000000;0}, {"elixir_of_life_c";50;0.000000;0}, {"elixir_of_mental_d";50;0.000000;0}, {"elixir_of_combative_none";50;0.000000;0}, {"elixir_of_combative_d";50;0.000000;0}, {"elixir_of_combative_c";50;0.000000;0}, {"elixir_of_combative_b";50;0.000000;0}, {"crystal_of_summon";50;0.000000;0}, {"blank_soul_bottle_5";50;0.000000;0}, {"dice_heart";50;0.000000;0}, {"dice_spade";50;0.000000;0}, {"dice_clover";50;0.000000;0}, {"dice_diamond";50;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 10 && gg.OwnItemCount(talker, 7149) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 11 && gg.OwnItemCount(talker, 7150) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 11 && gg.OwnItemCount(talker, 7150) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 0 && myself.GetOneTimeQuestFlag(talker, 23) == 1 && gg.HaveMemo(talker, 24) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Lidia's Heart (Done)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 10 && gg.OwnItemCount(talker, 7149) >= 1) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 23, 11);
myself.ShowPage(talker, "day_violet_q0023_01.htm");
myself.SetFlagJournal(talker, 23, 9);
myself.ShowQuestMark(talker, 23);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 11 && gg.OwnItemCount(talker, 7150) == 0) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "day_violet_q0023_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 11 && gg.OwnItemCount(talker, 7150) >= 1) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 350000);
myself.IncrementParam(talker, 0, 456893);
myself.IncrementParam(talker, 1, 42112);
myself.DeleteItem1(talker, 7150, gg.OwnItemCount(talker, 7150));
myself.RemoveMemo(talker, 23);
gg.AddLog(2, talker, 23);
myself.SetOneTimeQuestFlag(talker, 23, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "day_violet_q0023_03.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 0 && myself.GetOneTimeQuestFlag(talker, 23) == 1 && gg.HaveMemo(talker, 24) == 0 && myself.GetOneTimeQuestFlag(talker, 24) == 0) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "day_violet_q0023_04.htm");

}
break;

}

}
return;

}
super;
	}


}