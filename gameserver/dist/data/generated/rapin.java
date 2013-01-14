package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rapin extends merchant {
protected Object[][] SellList0 = {
{"necklace_of_wisdom";15;0.000000;0}, {"blue_diamond_necklace";15;0.000000;0}, {"necklace_of_devotion";15;0.000000;0}, {"enchanted_necklace";15;0.000000;0}, {"near_forest_necklace";15;0.000000;0}, {"elven_necklace";15;0.000000;0}, {"cat'seye_earing";15;0.000000;0}, {"coral_earing";15;0.000000;0}, {"red_cresent_earing";15;0.000000;0}, {"enchanted_earing";15;0.000000;0}, {"tiger'seye_earing";15;0.000000;0}, {"elven_earing";15;0.000000;0}, {"ring_of_wisdom";15;0.000000;0}, {"blue_coral_ring";15;0.000000;0}, {"ring_of_devotion";15;0.000000;0}, {"enchanted_ring";15;0.000000;0}, {"black_pearl_ring";15;0.000000;0}, {"elven_ring";15;0.000000;0}, {"onyxbeast'seye_earing";15;0.000000;0}, {"mithril_ring";15;0.000000;0}, {"necklace_of_darkness";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"soulshot_none";15;0.000000;0}, {"spiritshot_none";15;0.000000;0}, {"blessed_spiritshot_none";15;0.000000;0}, {"comp_bspiritshot_none";15;0.000000;0}, {"comp_spiritshot_none";15;0.000000;0}, {"comp_soulshot_none";15;0.000000;0}, {"adv_comp_bspiritshot_none";15;0.000000;0}, {"adv_comp_spiritshot_none";15;0.000000;0}, {"adv_comp_soulshot_none";15;0.000000;0}, {"wooden_arrow";15;0.000000;0}, {"bone_arrow";15;0.000000;0}, {"fine_steel_arrow";15;0.000000;0}, {"lesser_healing_potion";15;0.000000;0}, {"healing_potion";15;0.000000;0}, {"antidote";15;0.000000;0}, {"advanced_antidote";15;0.000000;0}, {"bandage";15;0.000000;0}, {"emergency_dressing";15;0.000000;0}, {"quick_step_potion";15;0.000000;0}, {"swift_attack_potion";15;0.000000;0}, {"potion_of_acumen2";15;0.000000;0}, {"scroll_of_awake";15;0.000000;0}, {"scroll_of_escape";15;0.000000;0}, {"scroll_of_resurrection";15;0.000000;0}, {"scroll_of_escape_to_agit";15;0.000000;0}, {"scroll_of_escape_to_castle";15;0.000000;0}, {"energy_stone";15;0.000000;0}, {"key_of_thief";15;0.000000;0}, {"charm_of_courage_none";15;0.000000;0}, {"charm_of_courage_d";15;0.000000;0}, {"charm_of_courage_c";15;0.000000;0}, {"charm_of_courage_b";15;0.000000;0}, {"charm_of_courage_a";15;0.000000;0}, {"charm_of_courage_s";15;0.000000;0}, {"blood_of_phoenix";15;0.000000;0}, {"holywater_einhasad";15;0.000000;0}, {"battle_symbol";15;0.000000;0}, {"magic_symbol";15;0.000000;0}, {"bone_bolt";15;0.000000;0}, {"fine_steel_bolt";15;0.000000;0}, {"dice_heart";15;0.000000;0}, {"dice_spade";15;0.000000;0}, {"dice_clover";15;0.000000;0}, {"dice_diamond";15;0.000000;0}
};
protected Object[][] SellList4 = {
{"necklace_of_devotion_low";15;0.000000;0}, {"enchanted_necklace_low";15;0.000000;0}, {"near_forest_necklace_low";15;0.000000;0}, {"elven_necklace_low";15;0.000000;0}, {"red_cresent_earing_low";15;0.000000;0}, {"enchanted_earing_low";15;0.000000;0}, {"tiger'seye_earing_low";15;0.000000;0}, {"elven_earing_low";15;0.000000;0}, {"ring_of_devotion_low";15;0.000000;0}, {"enchanted_ring_low";15;0.000000;0}, {"black_pearl_ring_low";15;0.000000;0}, {"elven_ring_low";15;0.000000;0}, {"onyxbeast'seye_earing_low";15;0.000000;0}, {"mithril_ring_low";15;0.000000;0}, {"necklace_of_darkness_low";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3814) == 1 || gg.OwnItemCount(talker, 3813) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3815) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 34) == 1 && myself.GetOneTimeQuestFlag(talker, 34) == 0 && gg.GetMemoState(talker, 34) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "In Search of Cloth (In Progress)");

}
if (gg.HaveMemo(talker, 34) == 1 && gg.GetMemoState(talker, 34) <= 4 * 10 + 2 && gg.GetMemoState(talker, 34) >= 4 * 10 + 1 && myself.GetOneTimeQuestFlag(talker, 34) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "In Search of Cloth (In Progress)");

}
if (gg.HaveMemo(talker, 34) == 1 && myself.GetOneTimeQuestFlag(talker, 34) == 0 && gg.GetMemoState(talker, 34) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "In Search of Cloth (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3814) == 1 || gg.OwnItemCount(talker, 3813) == 1) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
talker.weight_point = 0;
talker.param1 = 0;
talker.param2 = 0;
talker.param3 = 0;
talker.flag = 0;
myself.ShowPage(talker, "rapin_q0336_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3815) == 1) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rapin_q0336_54.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 34) == 1 && myself.GetOneTimeQuestFlag(talker, 34) == 0 && gg.GetMemoState(talker, 34) == 3 * 10 + 1) {
myself.SetCurrentQuestID(34);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 34, 3);
myself.ShowPage(talker, "rapin_q0034_0301.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 34) == 1 && gg.GetMemoState(talker, 34) <= 4 * 10 + 2 && gg.GetMemoState(talker, 34) >= 4 * 10 + 1 && myself.GetOneTimeQuestFlag(talker, 34) == 0) {
myself.SetCurrentQuestID(34);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 34) == 4 * 10 + 2 && gg.OwnItemCount(talker, 7528) >= 10) {
myself.SetHTMLCookie(talker, 34, 4);
myself.ShowPage(talker, "rapin_q0034_0402.htm");

} else {
myself.ShowPage(talker, "rapin_q0034_0403.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 34) == 1 && myself.GetOneTimeQuestFlag(talker, 34) == 0 && gg.GetMemoState(talker, 34) == 5 * 10 + 1) {
myself.SetCurrentQuestID(34);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rapin_q0034_0503.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 336) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
i0 = 0;
i1 = 0;
i2 = 0;
i3 = 0;
i4 = 0;
i5 = 0;
if (ask == 336) {
if (reply == 1) {
myself.ShowPage(talker, "rapin_q0336_02.htm");
talker.param2 = 11;

} else if (reply == 2) {
myself.ShowPage(talker, "rapin_q0336_03.htm");
talker.param2 = 21;

} else if (reply == 3) {
myself.ShowPage(talker, "rapin_q0336_04.htm");
talker.param2 = 31;

} else if (reply == 4) {
myself.ShowPage(talker, "rapin_q0336_05.htm");
talker.param2 = 42;

} else if (reply == 5) {
myself.ShowPage(talker, "rapin_q0336_06.htm");

} else if (reply == 6) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3473) >= 3 && gg.OwnItemCount(talker, 3475) >= 3) {
talker.flag = 1;
myself.DeleteItem1(talker, 3473, 3);
myself.DeleteItem1(talker, 3475, 3);
myself.ShowPage(talker, "rapin_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3494) >= 3 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3494, 3 * 1);
myself.ShowPage(talker, "rapin_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3491) >= 3 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3491, 3 * 1);
myself.ShowPage(talker, "rapin_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3485) >= 3 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3485, 3 * 1);
myself.ShowPage(talker, "rapin_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

}

} else if (reply == 7) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3473) >= 7 && gg.OwnItemCount(talker, 3475) >= 7) {
talker.flag = 1;
myself.DeleteItem1(talker, 3473, 7);
myself.DeleteItem1(talker, 3475, 7);
myself.ShowPage(talker, "rapin_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3494) >= 7 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3494, 7 * 1);
myself.ShowPage(talker, "rapin_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3491) >= 7 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3491, 7 * 1);
myself.ShowPage(talker, "rapin_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3485) >= 7 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3485, 7 * 1);
myself.ShowPage(talker, "rapin_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

}

} else if (reply == 8) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3473) >= 9 && gg.OwnItemCount(talker, 3475) >= 9) {
talker.flag = 1;
myself.DeleteItem1(talker, 3473, 9);
myself.DeleteItem1(talker, 3475, 9);
myself.ShowPage(talker, "rapin_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3494) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3494, 9 * 1);
myself.ShowPage(talker, "rapin_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3491) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3491, 9 * 1);
myself.ShowPage(talker, "rapin_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3485) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3485, 9 * 1);
myself.ShowPage(talker, "rapin_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

}

} else if (reply == 9) {
myself.ShowPage(talker, "rapin_q0336_53.htm");

} else if (reply == 10) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3473) >= 5 * 2 && gg.OwnItemCount(talker, 3475) >= 5 * 2) {
myself.ShowPage(talker, "rapin_q0336_07.htm");
myself.DeleteItem1(talker, 3473, 5 * 2);
myself.DeleteItem1(talker, 3475, 5 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3479, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3494) >= 5 * 1 && gg.OwnItemCount(talker, 3491) >= 5 * 1) {
myself.ShowPage(talker, "rapin_q0336_07.htm");
myself.DeleteItem1(talker, 3494, 5 * 1);
myself.DeleteItem1(talker, 3491, 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3495, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3494) >= 5 * 1 && gg.OwnItemCount(talker, 3491) >= 5 * 1) {
myself.ShowPage(talker, "rapin_q0336_07.htm");
myself.DeleteItem1(talker, 3494, 5 * talker.param2 % 10);
myself.DeleteItem1(talker, 3491, 5 * talker.param2 % 10);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3492, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3485) >= 5 * 1 && gg.OwnItemCount(talker, 3483) >= 5 * 1) {
myself.ShowPage(talker, "rapin_q0336_07.htm");
myself.DeleteItem1(talker, 3485, 5 * 1);
myself.DeleteItem1(talker, 3483, 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3486, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

}

} else if (reply == 11) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3473) >= 5 * 5 * 2 && gg.OwnItemCount(talker, 3475) >= 5 * 5 * 2) {
myself.ShowPage(talker, "rapin_q0336_07.htm");
myself.DeleteItem1(talker, 3473, 5 * 5 * 2);
myself.DeleteItem1(talker, 3475, 5 * 5 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3479, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3494) >= 5 * 5 * 1 && gg.OwnItemCount(talker, 3491) >= 5 * 5 * 1) {
myself.ShowPage(talker, "rapin_q0336_07.htm");
myself.DeleteItem1(talker, 3494, 5 * 5 * 1);
myself.DeleteItem1(talker, 3491, 5 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3495, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3494) >= 5 * 5 * 1 && gg.OwnItemCount(talker, 3491) >= 5 * 5 * 1) {
myself.ShowPage(talker, "rapin_q0336_07.htm");
myself.DeleteItem1(talker, 3494, 5 * 5 * 1);
myself.DeleteItem1(talker, 3491, 5 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3492, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3485) >= 5 * 5 * 1 && gg.OwnItemCount(talker, 3483) >= 5 * 5 * 1) {
myself.ShowPage(talker, "rapin_q0336_07.htm");
myself.DeleteItem1(talker, 3485, 5 * 5 * 1);
myself.DeleteItem1(talker, 3483, 5 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3486, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

}

} else if (reply == 12) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3473) >= 5 * 10 * 2 && gg.OwnItemCount(talker, 3475) >= 5 * 10 * 2) {
myself.ShowPage(talker, "rapin_q0336_07.htm");
myself.DeleteItem1(talker, 3473, 5 * 10 * 2);
myself.DeleteItem1(talker, 3475, 5 * 10 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3479, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3494) >= 5 * 10 * 1 && gg.OwnItemCount(talker, 3491) >= 5 * 10 * 1) {
myself.ShowPage(talker, "rapin_q0336_07.htm");
myself.DeleteItem1(talker, 3494, 5 * 10 * 1);
myself.DeleteItem1(talker, 3491, 5 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3495, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3494) >= 5 * 10 * 1 && gg.OwnItemCount(talker, 3491) >= 5 * 10 * 1) {
myself.ShowPage(talker, "rapin_q0336_07.htm");
myself.DeleteItem1(talker, 3494, 5 * 10 * 1);
myself.DeleteItem1(talker, 3491, 5 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3492, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3485) >= 5 * 10 * 1 && gg.OwnItemCount(talker, 3483) >= 5 * 10 * 1) {
myself.ShowPage(talker, "rapin_q0336_07.htm");
myself.DeleteItem1(talker, 3485, 5 * 10 * 1);
myself.DeleteItem1(talker, 3483, 5 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3486, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "rapin_q0336_10.htm");

}

}

} else if (reply == 13 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "rapin_q0336_14.htm");
talker.flag = talker.flag + 4 * 4 * 1;

} else if (reply == 14 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "rapin_q0336_15.htm");
talker.flag = talker.flag + 4 * 4 * 2;

} else if (reply == 15 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "rapin_q0336_16.htm");
talker.flag = talker.flag + 4 * 4 * 3;

} else if (reply == 16) {
myself.ShowPage(talker, "rapin_q0336_17.htm");
talker.flag = talker.flag + 4 * 1 * 1;

} else if (reply == 17) {
myself.ShowPage(talker, "rapin_q0336_18.htm");
talker.flag = talker.flag + 4 * 1 * 2;

} else if (reply == 18) {
myself.ShowPage(talker, "rapin_q0336_19.htm");
talker.flag = talker.flag + 4 * 1 * 3;

} else if (reply == 19) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 1;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "rapin_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3479, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3495, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3492, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3486, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "rapin_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "rapin_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "rapin_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "rapin_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "rapin_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "rapin_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "rapin_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "rapin_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "rapin_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "rapin_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "rapin_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "rapin_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "rapin_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "rapin_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "rapin_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "rapin_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "rapin_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "rapin_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "rapin_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "rapin_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "rapin_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "rapin_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "rapin_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "rapin_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "rapin_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "rapin_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "rapin_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "rapin_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "rapin_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "rapin_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 20) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 2;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "rapin_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3479, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3495, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3492, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3486, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "rapin_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "rapin_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "rapin_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "rapin_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "rapin_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "rapin_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "rapin_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "rapin_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "rapin_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "rapin_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "rapin_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "rapin_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "rapin_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "rapin_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "rapin_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "rapin_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "rapin_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "rapin_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "rapin_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "rapin_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "rapin_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "rapin_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "rapin_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "rapin_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "rapin_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "rapin_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "rapin_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "rapin_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "rapin_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "rapin_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 21) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 3;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "rapin_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3479, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3495, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3492, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3486, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "rapin_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "rapin_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "rapin_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "rapin_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "rapin_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "rapin_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "rapin_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "rapin_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "rapin_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "rapin_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "rapin_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "rapin_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "rapin_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "rapin_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "rapin_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "rapin_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "rapin_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "rapin_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "rapin_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "rapin_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "rapin_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "rapin_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "rapin_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "rapin_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "rapin_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "rapin_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "rapin_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "rapin_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "rapin_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "rapin_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 22) {
myself.ShowPage(talker, "rapin_q0336_01.htm");

}

}
if (ask == 34) {
myself.SetCurrentQuestID(34);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 34) {
i0 = myself.GetHTMLCookie(talker, 34, 4 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 34) == 1 && myself.GetOneTimeQuestFlag(talker, 34) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "rapin_q0034_0401.htm");
myself.SetMemoState(talker, 34, 4 * 10 + 1);
myself.SetFlagJournal(talker, 34, 4);
myself.ShowQuestMark(talker, 34);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 34) {
myself.SetCurrentQuestID(34);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 34) {
i0 = myself.GetHTMLCookie(talker, 34, 5 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 34) == 1 && myself.GetOneTimeQuestFlag(talker, 34) == 0) {
if (gg.OwnItemCount(talker, 7528) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7528, 10);
myself.GiveItem1(talker, 7161, 1);
myself.ShowPage(talker, "rapin_q0034_0501.htm");
myself.SetMemoState(talker, 34, 5 * 10 + 1);
myself.SetFlagJournal(talker, 34, 6);
myself.ShowQuestMark(talker, 34);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "rapin_q0034_0502.htm");

}

}

}

}
super;
	}


}