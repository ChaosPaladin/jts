package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tweety extends merchant_for_newbie {
protected Object[][] SellList0 = {
{"soulshot_none";50;0.000000;0}, {"spiritshot_none";50;0.000000;0}, {"blessed_spiritshot_none";50;0.000000;0}, {"soulshot_d";50;0.000000;0}, {"soulshot_c";50;0.000000;0}, {"blessed_spiritshot_d";50;0.000000;0}, {"blessed_spiritshot_c";50;0.000000;0}, {"comp_bspiritshot_none";50;0.000000;0}, {"comp_spiritshot_none";50;0.000000;0}, {"comp_soulshot_none";50;0.000000;0}, {"adv_comp_bspiritshot_none";50;0.000000;0}, {"adv_comp_spiritshot_none";50;0.000000;0}, {"adv_comp_soulshot_none";50;0.000000;0}, {"wooden_arrow";50;0.000000;0}, {"bone_arrow";50;0.000000;0}, {"fine_steel_arrow";50;0.000000;0}, {"lesser_healing_potion";50;0.000000;0}, {"healing_potion";50;0.000000;0}, {"antidote";50;0.000000;0}, {"advanced_antidote";50;0.000000;0}, {"bandage";50;0.000000;0}, {"emergency_dressing";50;0.000000;0}, {"quick_step_potion";50;0.000000;0}, {"swift_attack_potion";50;0.000000;0}, {"potion_of_acumen2";50;0.000000;0}, {"scroll_of_awake";50;0.000000;0}, {"scroll_of_escape";50;0.000000;0}, {"scroll_of_resurrection";50;0.000000;0}, {"scroll_of_escape_to_agit";50;0.000000;0}, {"spirit_ore";50;0.000000;0}, {"soul_ore";50;0.000000;0}, {"energy_stone";50;0.000000;0}, {"key_of_thief";50;0.000000;0}, {"rope_of_magic_d";50;0.000000;0}, {"rope_of_magic_c";50;0.000000;0}, {"rope_of_magic_b";50;0.000000;0}, {"gemstone_d";50;0.000000;0}, {"bone_bolt";50;0.000000;0}, {"fine_steel_bolt";50;0.000000;0}, {"recovery_scroll_none";50;0.000000;0}, {"recovery_scroll_d";50;0.000000;0}, {"recovery_scroll_c";50;0.000000;0}, {"recovery_scroll_b";50;0.000000;0}, {"elixir_of_life_none";50;0.000000;0}, {"elixir_of_life_d";50;0.000000;0}, {"elixir_of_life_c";50;0.000000;0}, {"elixir_of_mental_d";50;0.000000;0}, {"elixir_of_combative_none";50;0.000000;0}, {"elixir_of_combative_d";50;0.000000;0}, {"elixir_of_combative_c";50;0.000000;0}, {"elixir_of_combative_b";50;0.000000;0}, {"crystal_of_summon";50;0.000000;0}, {"blank_soul_bottle_5";50;0.000000;0}, {"dice_heart";50;0.000000;0}, {"dice_spade";50;0.000000;0}, {"dice_clover";50;0.000000;0}, {"dice_diamond";50;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2795) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2796) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2800) == 1 || gg.OwnItemCount(talker, 2799) == 1 || gg.OwnItemCount(talker, 2805) == 1 || gg.OwnItemCount(talker, 2808) == 1 || gg.OwnItemCount(talker, 2798) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 2 && gg.OwnItemCount(talker, 4239) < 20 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Acts of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 2 && gg.OwnItemCount(talker, 4239) >= 20 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Acts of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 3 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Acts of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) >= 4 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Acts of Evil (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2795) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tweety_q0225_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2796) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2797) < 10) {
myself.ShowPage(talker, "tweety_q0225_02.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tweety_q0225_03.htm");
myself.DeleteItem1(talker, 2796, 1);
myself.GiveItem1(talker, 2798, 1);
myself.DeleteItem1(talker, 2797, gg.OwnItemCount(talker, 2797));
myself.SetFlagJournal(talker, 225, 12);
myself.ShowQuestMark(talker, 225);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2800) == 1 || gg.OwnItemCount(talker, 2799) == 1 || gg.OwnItemCount(talker, 2805) == 1 || gg.OwnItemCount(talker, 2808) == 1 || gg.OwnItemCount(talker, 2798) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tweety_q0225_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 2 && gg.OwnItemCount(talker, 4239) < 20 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tweety_q0171_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 2 && gg.OwnItemCount(talker, 4239) >= 20 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4240, 1);
myself.DeleteItem1(talker, 4239, gg.OwnItemCount(talker, 4239));
myself.SetMemoState(talker, 171, 3);
myself.SetFlagJournal(talker, 171, 3);
myself.ShowQuestMark(talker, 171);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "tweety_q0171_02.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 3 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tweety_q0171_03.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) >= 4 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tweety_q0171_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 225) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 225) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 2795) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tweety_q0225_01a.htm");
myself.DeleteItem1(talker, 2795, 1);
myself.GiveItem1(talker, 2796, 1);
myself.SetFlagJournal(talker, 225, 10);
myself.ShowQuestMark(talker, 225);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}