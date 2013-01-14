package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pet_manager_martin extends pet_manager {
protected Object[][] SellList0 = {
{"iron_canine";20;0.000000;0}, {"shining_canine";20;0.000000;0}, {"ghost_canine";20;0.000000;0}, {"mithril_canine";20;0.000000;0}, {"sylvan_canine";20;0.000000;0}, {"orikarukon_canine";20;0.000000;0}, {"fang_of_saltydog";20;0.000000;0}, {"wolve's_leather_mail";20;0.000000;0}, {"wolves_hide_armor";20;0.000000;0}, {"wolves_hard_leather_mail";20;0.000000;0}, {"wolves_wooden_armor";20;0.000000;0}, {"wolves_ring_mail";20;0.000000;0}, {"wolves_bone_armor";20;0.000000;0}, {"wolves_scale_mail";20;0.000000;0}, {"food_for_wolves";20;0.000000;0}, {"greater_food_of_pet";20;0.000000;0}, {"viperbite";20;0.000000;0}, {"shadow_fang";20;0.000000;0}, {"alya_fang";20;0.000000;0}, {"torturer";20;0.000000;0}, {"serpentine_grinder";20;0.000000;0}, {"fang_of_dahak";20;0.000000;0}, {"hatchlings_scale_mail";20;0.000000;0}, {"hatchlings_brigandine";20;0.000000;0}, {"hatchlings_bronze_coat";20;0.000000;0}, {"hatchlings_steel_coat";20;0.000000;0}, {"hatchlings_gorgon_coat";20;0.000000;0}, {"hatchlings_ophidian_plate";20;0.000000;0}, {"food_for_hatchling";20;0.000000;0}, {"serpentine_spike";20;0.000000;0}, {"drake_horn";20;0.000000;0}, {"assault_alicorn";20;0.000000;0}, {"mithril_panzer_coat";20;0.000000;0}, {"brigandine_panzer_coat";20;0.000000;0}, {"draconic_panzer_coat";20;0.000000;0}, {"food_for_strider";20;0.000000;0}, {"beast_soul_shot";20;0.000000;0}, {"beast_spirit_shot";20;0.000000;0}, {"blessed_beast_spirit_shot";20;0.000000;0}, {"pet_food_baby_spice";20;0.000000;0}, {"pet_armor_little_harness";20;0.000000;0}, {"enchanted_wolf_canine";20;0.000000;0}, {"enchanted_coyote_canine";20;0.000000;0}, {"revolution_salty_dog_canine";20;0.000000;0}, {"black_mane_wolf_scale_armor";20;0.000000;0}, {"black_mane_wolf_bronze_armor";20;0.000000;0}, {"black_mane_wolf_plate_armor";20;0.000000;0}, {"revolution_wolf_food";20;0.000000;0}, {"beast_soul_shot_capsule";20;0.000000;0}, {"beast_spirit_shot_capsule";20;0.000000;0}, {"blessed_beast_spirit_shot_capsule";20;0.000000;0}, {"food_for_upgrade_baby_pet";20;0.000000;0}, {"baby_pet_scale_armor";20;0.000000;0}, {"baby_pet_bronze_armor";20;0.000000;0}, {"baby_pet_plate_armor";20;0.000000;0}, {"baby_pet_mithril_armor";20;0.000000;0}, {"baby_pet_oriharukon_armor";20;0.000000;0}, {"baby_pet_oricalcum_armor";20;0.000000;0}, {"pet_crystal_pandent";20;0.000000;0}, {"pet_rubi_pendant";20;0.000000;0}, {"pet_sapphire_pendant";20;0.000000;0}, {"pet_diamond_pendant";20;0.000000;0}, {"pet_enria_pendant";20;0.000000;0}, {"pet_thons_pendant";20;0.000000;0}, {"pet_asofe_pendant";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 419) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Get a Pet");

}
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 10164) == 1 && gg.OwnItemCount(talker, 10165) < 50) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Get a Pet (In Progress)");

}
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 10164) == 1 && gg.OwnItemCount(talker, 10165) >= 50) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Get a Pet (In Progress)");

}
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3418) == 1 && gg.OwnItemCount(talker, 3423) < 50) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Get a Pet (In Progress)");

}
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3418) == 1 && gg.OwnItemCount(talker, 3423) >= 50) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Get a Pet (In Progress)");

}
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3419) == 1 && gg.OwnItemCount(talker, 3424) < 50) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Get a Pet (In Progress)");

}
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3419) == 1 && gg.OwnItemCount(talker, 3424) >= 50) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Get a Pet (In Progress)");

}
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3420) == 1 && gg.OwnItemCount(talker, 3425) < 50) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Get a Pet (In Progress)");

}
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3420) == 1 && gg.OwnItemCount(talker, 3425) >= 50) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Get a Pet (In Progress)");

}
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3421) == 1 && gg.OwnItemCount(talker, 3426) < 50) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Get a Pet (In Progress)");

}
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3421) == 1 && gg.OwnItemCount(talker, 3426) >= 50) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Get a Pet (In Progress)");

}
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3422) == 1 && gg.OwnItemCount(talker, 3427) < 50) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Get a Pet (In Progress)");

}
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3422) == 1 && gg.OwnItemCount(talker, 3427) >= 50) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Get a Pet (In Progress)");

}
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3417) == 1 && gg.GetMemoState(talker, 419) & 14 != 14 && gg.GetMemoState(talker, 419) & 1879048192 != 1879048192) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Get a Pet (In Progress)");

}
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3417) == 1 && gg.GetMemoState(talker, 419) & 14 == 14 || gg.GetMemoState(talker, 419) & 1879048192 == 1879048192) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Get a Pet (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) == 0) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 15) {
myself.ShowQuestPage(talker, "pet_manager_martin_q0419_01.htm", 419);

} else {
myself.ShowQuestPage(talker, "pet_manager_martin_q0419_02.htm", 419);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 10164) == 1 && gg.OwnItemCount(talker, 10165) < 50) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 10165) == 0) {
myself.ShowPage(talker, "pet_manager_martin_q0419_09.htm");

} else {
myself.ShowPage(talker, "pet_manager_martin_q0419_10.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 10164) == 1 && gg.OwnItemCount(talker, 10165) >= 50) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pet_manager_martin_q0419_11.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3418) == 1 && gg.OwnItemCount(talker, 3423) < 50) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3423) == 0) {
myself.ShowPage(talker, "pet_manager_martin_q0419_09.htm");

} else {
myself.ShowPage(talker, "pet_manager_martin_q0419_10.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3418) == 1 && gg.OwnItemCount(talker, 3423) >= 50) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pet_manager_martin_q0419_11.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3419) == 1 && gg.OwnItemCount(talker, 3424) < 50) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3424) == 0) {
myself.ShowPage(talker, "pet_manager_martin_q0419_09.htm");

} else {
myself.ShowPage(talker, "pet_manager_martin_q0419_10.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3419) == 1 && gg.OwnItemCount(talker, 3424) >= 50) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pet_manager_martin_q0419_11.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3420) == 1 && gg.OwnItemCount(talker, 3425) < 50) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3425) == 0) {
myself.ShowPage(talker, "pet_manager_martin_q0419_09.htm");

} else {
myself.ShowPage(talker, "pet_manager_martin_q0419_10.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3420) == 1 && gg.OwnItemCount(talker, 3425) >= 50) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pet_manager_martin_q0419_11.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3421) == 1 && gg.OwnItemCount(talker, 3426) < 50) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3426) == 0) {
myself.ShowPage(talker, "pet_manager_martin_q0419_09.htm");

} else {
myself.ShowPage(talker, "pet_manager_martin_q0419_10.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3421) == 1 && gg.OwnItemCount(talker, 3426) >= 50) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pet_manager_martin_q0419_11.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3422) == 1 && gg.OwnItemCount(talker, 3427) < 50) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3427) == 0) {
myself.ShowPage(talker, "pet_manager_martin_q0419_09.htm");

} else {
myself.ShowPage(talker, "pet_manager_martin_q0419_10.htm");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3422) == 1 && gg.OwnItemCount(talker, 3427) >= 50) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pet_manager_martin_q0419_11.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3417) == 1 && gg.GetMemoState(talker, 419) & 14 != 14 && gg.GetMemoState(talker, 419) & 1879048192 != 1879048192) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pet_manager_martin_q0419_16.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3417) == 1 && gg.GetMemoState(talker, 419) & 14 == 14 || gg.GetMemoState(talker, 419) & 1879048192 == 1879048192) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 419, 1879048192);
myself.ShowPage(talker, "pet_manager_martin_q0419_13.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 419) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 419);
myself.ShowQuestMark(talker, 419);
gg.AddLog(1, talker, 419);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (talker.race == 0) {
myself.ShowQuestPage(talker, "pet_manager_martin_q0419_04.htm", 419);
myself.GiveItem1(talker, 3418, 1);

} else if (talker.race == 1) {
myself.ShowQuestPage(talker, "pet_manager_martin_q0419_05.htm", 419);
myself.GiveItem1(talker, 3419, 1);

} else if (talker.race == 2) {
myself.ShowQuestPage(talker, "pet_manager_martin_q0419_06.htm", 419);
myself.GiveItem1(talker, 3420, 1);

} else if (talker.race == 3) {
myself.ShowQuestPage(talker, "pet_manager_martin_q0419_07.htm", 419);
myself.GiveItem1(talker, 3421, 1);

} else if (talker.race == 4) {
myself.ShowQuestPage(talker, "pet_manager_martin_q0419_08.htm", 419);
myself.GiveItem1(talker, 3422, 1);

} else if (talker.race == 5) {
myself.ShowQuestPage(talker, "pet_manager_martin_q0419_08a.htm", 419);
myself.GiveItem1(talker, 10164, 1);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 419) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 419) {
if (reply == 11) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 419);
myself.ShowQuestFHTML(talker, fhtml0, 419);

}

}
if (ask == 419) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 419 && reply == 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.race == 0 && gg.OwnItemCount(talker, 3418) == 1 && gg.OwnItemCount(talker, 3423) >= 50) {
myself.DeleteItem1(talker, 3418, gg.OwnItemCount(talker, 3418));
myself.DeleteItem1(talker, 3423, gg.OwnItemCount(talker, 3423));
myself.GiveItem1(talker, 3417, 1);

} else if (talker.race == 1 && gg.OwnItemCount(talker, 3419) == 1 && gg.OwnItemCount(talker, 3424) >= 50) {
myself.DeleteItem1(talker, 3419, gg.OwnItemCount(talker, 3419));
myself.DeleteItem1(talker, 3424, gg.OwnItemCount(talker, 3424));
myself.GiveItem1(talker, 3417, 1);

} else if (talker.race == 2 && gg.OwnItemCount(talker, 3420) == 1 && gg.OwnItemCount(talker, 3425) >= 50) {
myself.DeleteItem1(talker, 3420, gg.OwnItemCount(talker, 3420));
myself.DeleteItem1(talker, 3425, gg.OwnItemCount(talker, 3425));
myself.GiveItem1(talker, 3417, 1);

} else if (talker.race == 3 && gg.OwnItemCount(talker, 3421) == 1 && gg.OwnItemCount(talker, 3426) >= 50) {
myself.DeleteItem1(talker, 3421, gg.OwnItemCount(talker, 3421));
myself.DeleteItem1(talker, 3426, gg.OwnItemCount(talker, 3426));
myself.GiveItem1(talker, 3417, 1);

} else if (talker.race == 4 && gg.OwnItemCount(talker, 3422) == 1 && gg.OwnItemCount(talker, 3427) >= 50) {
myself.DeleteItem1(talker, 3422, gg.OwnItemCount(talker, 3422));
myself.DeleteItem1(talker, 3427, gg.OwnItemCount(talker, 3427));
myself.GiveItem1(talker, 3417, 1);

} else if (talker.race == 5 && gg.OwnItemCount(talker, 10164) == 1 && gg.OwnItemCount(talker, 10165) >= 50) {
myself.DeleteItem1(talker, 10164, gg.OwnItemCount(talker, 10164));
myself.DeleteItem1(talker, 10165, gg.OwnItemCount(talker, 10165));
myself.GiveItem1(talker, 3417, 1);

}
myself.SetMemoState(talker, 419, 0);
myself.ShowPage(talker, "pet_manager_martin_q0419_12.htm");

}

}
if (ask == 419) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 419 && reply == 1 && gg.GetMemoState(talker, 419) & 15 == 10 && gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3417) == 1 && myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 3417, gg.OwnItemCount(talker, 3417));
myself.SetMemoState(talker, 419, 0);
myself.RemoveMemo(talker, 419);
gg.AddLog(2, talker, 419);
gg.AddLog(3, talker, 419);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.CreatePet(talker, 2375, 1012077, 15);
myself.ShowPage(talker, "pet_manager_martin_q0419_15.htm");

} else if (ask == 419 && reply == 1) {
i8 = gg.GetMemoState(talker, 419);
i8 = i8 + 1;
i9 = 0;
while (i9 == 0) {
i6 = gg.Rand(14) + 4;
i7 = 1;
for (i5 = 1; i5 <= i6; i5 = i5 + 1) {
i7 = i7 * 2;

}
if (i7 & gg.GetMemoState(talker, 419) == 0 && i6 < 18) {
if (i6 == 4) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_20.htm");
i0 = 1110000;

} else if (i6 == 5) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_21.htm");
i0 = 1110005;

} else if (i6 == 6) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_22.htm");
i0 = 1110010;

} else if (i6 == 7) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_23.htm");
i0 = 1110015;

} else if (i6 == 8) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_24.htm");
i0 = 1110020;

} else if (i6 == 9) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_25.htm");
i0 = 1110025;

} else if (i6 == 10) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_26.htm");
i0 = 1110030;

} else if (i6 == 11) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_27.htm");
i0 = 1110035;

} else if (i6 == 12) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_28.htm");
i0 = 1110040;

} else if (i6 == 13) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_29.htm");
i0 = 1110045;

} else if (i6 == 14) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_30.htm");
i0 = 1110050;

} else if (i6 == 15) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_31.htm");
i0 = 1110055;

} else if (i6 == 16) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_32.htm");
i0 = 1110060;

} else if (i6 == 17) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_martin_q0419_33.htm");
i0 = 1110065;

}
i9 = 1;
i8 = i8 | i7;

}

}
myself.SetMemoState(talker, 419, i8);
i9 = 1;
i8 = 0;
while (i9 < 5) {
i6 = gg.Rand(4) + 1;
i7 = 1;
for (i5 = 1; i5 <= i6; i5 = i5 + 1) {
i7 = i7 * 2;

}
if (i7 & i8 == 0 && i6 < 5) {
if (i9 == 1) {
i1 = i6;

} else if (i9 == 2) {
i2 = i6;

} else if (i9 == 3) {
i3 = i6;

} else if (i9 == 4) {
i4 = i6;

}
i9 = i9 + 1;
i8 = i8 | i7;

}

}
myself.FHTML_SetStr(fhtml0, "reply1", gg.MakeFString(i0 + i1, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply2", gg.MakeFString(i0 + i2, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply3", gg.MakeFString(i0 + i3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply4", gg.MakeFString(i0 + i4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply5", gg.MakeFString(i0 + 5, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);

} else if (ask == 419 && reply == 0) {
myself.SetMemoState(talker, 419, 0);
myself.ShowPage(talker, "pet_manager_martin_q0419_14.htm");

}
super;
	}


}