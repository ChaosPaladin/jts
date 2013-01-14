package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_salient extends merchant_for_chaotic {
protected Object[][] SellList0 = {
{"soulshot_none";50;0.000000;0}, {"spiritshot_none";50;0.000000;0}, {"blessed_spiritshot_none";50;0.000000;0}, {"soulshot_d";50;0.000000;0}, {"soulshot_c";50;0.000000;0}, {"blessed_spiritshot_d";50;0.000000;0}, {"blessed_spiritshot_c";50;0.000000;0}, {"comp_bspiritshot_none";50;0.000000;0}, {"comp_spiritshot_none";50;0.000000;0}, {"comp_soulshot_none";50;0.000000;0}, {"adv_comp_bspiritshot_none";50;0.000000;0}, {"adv_comp_spiritshot_none";50;0.000000;0}, {"adv_comp_soulshot_none";50;0.000000;0}, {"wooden_arrow";50;0.000000;0}, {"bone_arrow";50;0.000000;0}, {"fine_steel_arrow";50;0.000000;0}, {"lesser_healing_potion";50;0.000000;0}, {"healing_potion";50;0.000000;0}, {"antidote";50;0.000000;0}, {"advanced_antidote";50;0.000000;0}, {"bandage";50;0.000000;0}, {"emergency_dressing";50;0.000000;0}, {"quick_step_potion";50;0.000000;0}, {"swift_attack_potion";50;0.000000;0}, {"potion_of_acumen2";50;0.000000;0}, {"scroll_of_awake";50;0.000000;0}, {"scroll_of_escape";50;0.000000;0}, {"scroll_of_resurrection";50;0.000000;0}, {"scroll_of_escape_to_agit";50;0.000000;0}, {"spirit_ore";50;0.000000;0}, {"soul_ore";50;0.000000;0}, {"energy_stone";50;0.000000;0}, {"key_of_thief";50;0.000000;0}, {"rope_of_magic_d";50;0.000000;0}, {"rope_of_magic_c";50;0.000000;0}, {"rope_of_magic_b";50;0.000000;0}, {"gemstone_d";50;0.000000;0}, {"bone_bolt";50;0.000000;0}, {"fine_steel_bolt";50;0.000000;0}, {"recovery_scroll_none";50;0.000000;0}, {"recovery_scroll_d";50;0.000000;0}, {"recovery_scroll_c";50;0.000000;0}, {"recovery_scroll_b";50;0.000000;0}, {"elixir_of_life_none";50;0.000000;0}, {"elixir_of_life_d";50;0.000000;0}, {"elixir_of_life_c";50;0.000000;0}, {"elixir_of_mental_d";50;0.000000;0}, {"elixir_of_combative_none";50;0.000000;0}, {"elixir_of_combative_d";50;0.000000;0}, {"elixir_of_combative_c";50;0.000000;0}, {"elixir_of_combative_b";50;0.000000;0}, {"crystal_of_summon";50;0.000000;0}, {"blank_soul_bottle_5";50;0.000000;0}, {"dice_heart";50;0.000000;0}, {"dice_spade";50;0.000000;0}, {"dice_clover";50;0.000000;0}, {"dice_diamond";50;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 328) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Sense for Business");

}
if (gg.HaveMemo(talker, 328) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Sense for Business (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2904) == 0 && gg.OwnItemCount(talker, 2902) >= 1 && gg.OwnItemCount(talker, 2903) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the War Spirit (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2903) == 0 && gg.OwnItemCount(talker, 2902) >= 1 && gg.OwnItemCount(talker, 2904) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the War Spirit (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2902) == 0 && gg.OwnItemCount(talker, 2910) >= 1 || gg.OwnItemCount(talker, 2914) >= 1 || gg.OwnItemCount(talker, 2880) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the War Spirit (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 328) == 0) {
myself.SetCurrentQuestID(328);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 21) {
myself.FHTML_SetFileName(fhtml0, "trader_salient_q0328_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 328);
myself.ShowQuestFHTML(talker, fhtml0, 328);

} else {
myself.ShowQuestPage(talker, "trader_salient_q0328_01.htm", 328);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 328) == 1) {
myself.SetCurrentQuestID(328);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1347) + gg.OwnItemCount(talker, 1366) + gg.OwnItemCount(talker, 1348) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1347) + gg.OwnItemCount(talker, 1366) + gg.OwnItemCount(talker, 1348) >= 10) {
myself.GiveItem1(talker, 57, 618 + 25 * gg.OwnItemCount(talker, 1347) + 1000 * gg.OwnItemCount(talker, 1366) + 60 * gg.OwnItemCount(talker, 1348));

} else {
myself.GiveItem1(talker, 57, 25 * gg.OwnItemCount(talker, 1347) + 1000 * gg.OwnItemCount(talker, 1366) + 60 * gg.OwnItemCount(talker, 1348));

}
myself.DeleteItem1(talker, 1347, gg.OwnItemCount(talker, 1347));
myself.DeleteItem1(talker, 1366, gg.OwnItemCount(talker, 1366));
myself.DeleteItem1(talker, 1348, gg.OwnItemCount(talker, 1348));
myself.ShowPage(talker, "trader_salient_q0328_05.htm");
gg.AddLog(3, talker, 328);

}

} else {
myself.ShowPage(talker, "trader_salient_q0328_04.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2904) == 0 && gg.OwnItemCount(talker, 2902) >= 1 && gg.OwnItemCount(talker, 2903) >= 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_salient_q0233_01.htm");
myself.DeleteItem1(talker, 2903, 1);
myself.GiveItem1(talker, 2904, 1);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2903) == 0 && gg.OwnItemCount(talker, 2902) >= 1 && gg.OwnItemCount(talker, 2904) >= 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_salient_q0233_02.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2902) == 0 && gg.OwnItemCount(talker, 2910) >= 1 || gg.OwnItemCount(talker, 2914) >= 1 || gg.OwnItemCount(talker, 2880) >= 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_salient_q0233_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 328) {
myself.SetCurrentQuestID(328);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
gg.AddLog(1, talker, 328);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "trader_salient_q0328_03.htm", 328);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 328) {
myself.SetCurrentQuestID(328);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 328) {
if (reply == 1) {
myself.ShowPage(talker, "trader_salient_q0328_06.htm");
myself.RemoveMemo(talker, 328);
gg.AddLog(2, talker, 328);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (reply == 2) {
myself.ShowPage(talker, "trader_salient_q0328_07.htm");

}

}
super;
	}


}