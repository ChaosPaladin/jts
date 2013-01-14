package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_rolento extends merchant_for_chaotic {
protected Object[][] SellList0 = {
{"soulshot_none";50;0.000000;0}, {"spiritshot_none";50;0.000000;0}, {"blessed_spiritshot_none";50;0.000000;0}, {"soulshot_d";50;0.000000;0}, {"soulshot_c";50;0.000000;0}, {"blessed_spiritshot_d";50;0.000000;0}, {"blessed_spiritshot_c";50;0.000000;0}, {"comp_bspiritshot_none";50;0.000000;0}, {"comp_spiritshot_none";50;0.000000;0}, {"comp_soulshot_none";50;0.000000;0}, {"adv_comp_bspiritshot_none";50;0.000000;0}, {"adv_comp_spiritshot_none";50;0.000000;0}, {"adv_comp_soulshot_none";50;0.000000;0}, {"wooden_arrow";50;0.000000;0}, {"bone_arrow";50;0.000000;0}, {"fine_steel_arrow";50;0.000000;0}, {"lesser_healing_potion";50;0.000000;0}, {"healing_potion";50;0.000000;0}, {"antidote";50;0.000000;0}, {"advanced_antidote";50;0.000000;0}, {"bandage";50;0.000000;0}, {"emergency_dressing";50;0.000000;0}, {"quick_step_potion";50;0.000000;0}, {"swift_attack_potion";50;0.000000;0}, {"potion_of_acumen2";50;0.000000;0}, {"scroll_of_awake";50;0.000000;0}, {"scroll_of_escape";50;0.000000;0}, {"scroll_of_resurrection";50;0.000000;0}, {"scroll_of_escape_to_agit";50;0.000000;0}, {"spirit_ore";50;0.000000;0}, {"soul_ore";50;0.000000;0}, {"energy_stone";50;0.000000;0}, {"key_of_thief";50;0.000000;0}, {"rope_of_magic_d";50;0.000000;0}, {"rope_of_magic_c";50;0.000000;0}, {"rope_of_magic_b";50;0.000000;0}, {"gemstone_d";50;0.000000;0}, {"bone_bolt";50;0.000000;0}, {"fine_steel_bolt";50;0.000000;0}, {"recovery_scroll_none";50;0.000000;0}, {"recovery_scroll_d";50;0.000000;0}, {"recovery_scroll_c";50;0.000000;0}, {"recovery_scroll_b";50;0.000000;0}, {"elixir_of_life_none";50;0.000000;0}, {"elixir_of_life_d";50;0.000000;0}, {"elixir_of_life_c";50;0.000000;0}, {"elixir_of_mental_d";50;0.000000;0}, {"elixir_of_combative_none";50;0.000000;0}, {"elixir_of_combative_d";50;0.000000;0}, {"elixir_of_combative_c";50;0.000000;0}, {"elixir_of_combative_b";50;0.000000;0}, {"crystal_of_summon";50;0.000000;0}, {"blank_soul_bottle_5";50;0.000000;0}, {"dice_heart";50;0.000000;0}, {"dice_spade";50;0.000000;0}, {"dice_clover";50;0.000000;0}, {"dice_diamond";50;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 329) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Curiosity of a Dwarf");

}
if (gg.HaveMemo(talker, 329) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Curiosity of a Dwarf (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 8 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Acts of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 9 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Acts of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) >= 10 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Acts of Evil (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 329) == 0) {
myself.SetCurrentQuestID(329);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 33) {
myself.FHTML_SetFileName(fhtml0, "trader_rolento_q0329_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 329);
myself.ShowQuestFHTML(talker, fhtml0, 329);

} else {
myself.ShowQuestPage(talker, "trader_rolento_q0329_01.htm", 329);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 329) == 1) {
myself.SetCurrentQuestID(329);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1365) + gg.OwnItemCount(talker, 1346) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1365) + gg.OwnItemCount(talker, 1346) >= 10) {
myself.GiveItem1(talker, 57, 1183 + 50 * gg.OwnItemCount(talker, 1365) + 1000 * gg.OwnItemCount(talker, 1346));

} else {
myself.GiveItem1(talker, 57, 50 * gg.OwnItemCount(talker, 1365) + 1000 * gg.OwnItemCount(talker, 1346));

}
myself.DeleteItem1(talker, 1365, gg.OwnItemCount(talker, 1365));
myself.DeleteItem1(talker, 1346, gg.OwnItemCount(talker, 1346));
myself.ShowPage(talker, "trader_rolento_q0329_05.htm");
gg.AddLog(3, talker, 329);

}

} else {
myself.ShowPage(talker, "trader_rolento_q0329_04.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 8 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_rolento_q0171_02.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 9 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_rolento_q0171_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) >= 10 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_rolento_q0171_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 329) {
myself.SetCurrentQuestID(329);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
gg.AddLog(1, talker, 329);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "trader_rolento_q0329_03.htm", 329);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 329) {
myself.SetCurrentQuestID(329);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 329) {
if (reply == 1) {
myself.ShowPage(talker, "trader_rolento_q0329_06.htm");
myself.RemoveMemo(talker, 329);
gg.AddLog(2, talker, 329);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (reply == 2) {
myself.ShowPage(talker, "trader_rolento_q0329_07.htm");

}

}
if (ask == 171) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 171) {
if (reply == 1) {
myself.ShowPage(talker, "trader_rolento_q0171_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "trader_rolento_q0171_03.htm");

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4247, 1);
myself.GiveItem1(talker, 4248, 1);
myself.DeleteItem1(talker, 4245, gg.OwnItemCount(talker, 4245));
myself.SetMemoState(talker, 171, 9);
myself.SetFlagJournal(talker, 171, 9);
myself.ShowQuestMark(talker, 171);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "trader_rolento_q0171_04.htm");

}

}

}
super;
	}


}