package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pet_manager_rood extends pet_manager {
protected Object[][] SellList0 = {
{"iron_canine";20;0.000000;0}, {"shining_canine";20;0.000000;0}, {"ghost_canine";20;0.000000;0}, {"mithril_canine";20;0.000000;0}, {"sylvan_canine";20;0.000000;0}, {"orikarukon_canine";20;0.000000;0}, {"fang_of_saltydog";20;0.000000;0}, {"wolve's_leather_mail";20;0.000000;0}, {"wolves_hide_armor";20;0.000000;0}, {"wolves_hard_leather_mail";20;0.000000;0}, {"wolves_wooden_armor";20;0.000000;0}, {"wolves_ring_mail";20;0.000000;0}, {"wolves_bone_armor";20;0.000000;0}, {"wolves_scale_mail";20;0.000000;0}, {"food_for_wolves";20;0.000000;0}, {"greater_food_of_pet";20;0.000000;0}, {"viperbite";20;0.000000;0}, {"shadow_fang";20;0.000000;0}, {"alya_fang";20;0.000000;0}, {"torturer";20;0.000000;0}, {"serpentine_grinder";20;0.000000;0}, {"fang_of_dahak";20;0.000000;0}, {"crimson_bloodfang";20;0.000000;0}, {"draconic_chopper";20;0.000000;0}, {"diabolic_grinder";20;0.000000;0}, {"hatchlings_scale_mail";20;0.000000;0}, {"hatchlings_brigandine";20;0.000000;0}, {"hatchlings_bronze_coat";20;0.000000;0}, {"hatchlings_steel_coat";20;0.000000;0}, {"hatchlings_gorgon_coat";20;0.000000;0}, {"hatchlings_ophidian_plate";20;0.000000;0}, {"hatchlings_crimson_plate";20;0.000000;0}, {"hatchlings_draconic_plate";20;0.000000;0}, {"hatchlings_inferno_plate";20;0.000000;0}, {"food_for_hatchling";20;0.000000;0}, {"serpentine_spike";20;0.000000;0}, {"drake_horn";20;0.000000;0}, {"assault_alicorn";20;0.000000;0}, {"draconic_slicer";20;0.000000;0}, {"ophidian_lancer";20;0.000000;0}, {"diamond_drill";20;0.000000;0}, {"mithril_panzer_coat";20;0.000000;0}, {"brigandine_panzer_coat";20;0.000000;0}, {"draconic_panzer_coat";20;0.000000;0}, {"blood_panzer_coat";20;0.000000;0}, {"ophidian_panzer_coat";20;0.000000;0}, {"inferno_panzer_coat";20;0.000000;0}, {"food_for_strider";20;0.000000;0}, {"beast_soul_shot";20;0.000000;0}, {"beast_spirit_shot";20;0.000000;0}, {"blessed_beast_spirit_shot";20;0.000000;0}, {"pet_food_baby_spice";20;0.000000;0}, {"pet_armor_little_harness";20;0.000000;0}, {"enchanted_wolf_canine";20;0.000000;0}, {"enchanted_coyote_canine";20;0.000000;0}, {"revolution_salty_dog_canine";20;0.000000;0}, {"enchanted_ceruberus_canine";20;0.000000;0}, {"oricalcum_canine";20;0.000000;0}, {"enchanted_fenril_canine";20;0.000000;0}, {"black_mane_wolf_scale_armor";20;0.000000;0}, {"black_mane_wolf_bronze_armor";20;0.000000;0}, {"black_mane_wolf_plate_armor";20;0.000000;0}, {"black_mane_wolf_mithril_armor";20;0.000000;0}, {"black_mane_wolf_oriharukon_armor";20;0.000000;0}, {"black_mane_wolf_oricalcum_armor";20;0.000000;0}, {"revolution_wolf_food";20;0.000000;0}, {"beast_soul_shot_capsule";20;0.000000;0}, {"beast_spirit_shot_capsule";20;0.000000;0}, {"blessed_beast_spirit_shot_capsule";20;0.000000;0}, {"food_for_upgrade_baby_pet";20;0.000000;0}, {"baby_pet_scale_armor";20;0.000000;0}, {"baby_pet_bronze_armor";20;0.000000;0}, {"baby_pet_plate_armor";20;0.000000;0}, {"baby_pet_mithril_armor";20;0.000000;0}, {"baby_pet_oriharukon_armor";20;0.000000;0}, {"baby_pet_oricalcum_armor";20;0.000000;0}, {"pet_crystal_pandent";20;0.000000;0}, {"pet_rubi_pendant";20;0.000000;0}, {"pet_sapphire_pendant";20;0.000000;0}, {"pet_diamond_pendant";20;0.000000;0}, {"pet_enria_pendant";20;0.000000;0}, {"pet_thons_pendant";20;0.000000;0}, {"pet_asofe_pendant";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 352) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Help Rood Raise A New Pet!");

}
if (gg.HaveMemo(talker, 352) == 1 && gg.OwnItemCount(talker, 5860) < 1 && gg.OwnItemCount(talker, 5861) < 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Help Rood Raise A New Pet! (In Progress)");

}
if (gg.HaveMemo(talker, 352) == 1 && gg.OwnItemCount(talker, 5860) >= 1 && gg.OwnItemCount(talker, 5861) < 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Help Rood Raise A New Pet! (In Progress)");

}
if (gg.HaveMemo(talker, 352) == 1 && gg.OwnItemCount(talker, 5861) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Help Rood Raise A New Pet! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 352) == 0) {
myself.SetCurrentQuestID(352);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level < 39) {
myself.ShowPage(talker, "pet_manager_rood_q0352_01.htm");

} else {
myself.ShowQuestPage(talker, "pet_manager_rood_q0352_02.htm", 352);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 352) == 1 && gg.OwnItemCount(talker, 5860) < 1 && gg.OwnItemCount(talker, 5861) < 1) {
myself.SetCurrentQuestID(352);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pet_manager_rood_q0352_06.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 352) == 1 && gg.OwnItemCount(talker, 5860) >= 1 && gg.OwnItemCount(talker, 5861) < 1) {
myself.SetCurrentQuestID(352);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 5860) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5860) * 34 + 4000);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5860) * 34 + 2000);

}
myself.DeleteItem1(talker, 5860, gg.OwnItemCount(talker, 5860));
myself.ShowPage(talker, "pet_manager_rood_q0352_07.htm");
gg.AddLog(3, talker, 352);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 352) == 1 && gg.OwnItemCount(talker, 5861) >= 1) {
myself.SetCurrentQuestID(352);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 4000 + gg.OwnItemCount(talker, 5860) * 34 + gg.OwnItemCount(talker, 5861) * 1025);
myself.DeleteItem1(talker, 5861, gg.OwnItemCount(talker, 5861));
myself.DeleteItem1(talker, 5860, gg.OwnItemCount(talker, 5860));
myself.ShowPage(talker, "pet_manager_rood_q0352_08.htm");
gg.AddLog(3, talker, 352);

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 352) {
myself.SetCurrentQuestID(352);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 352);
myself.SetJournal(talker, 352, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "pet_manager_rood_q0352_05.htm", 352);
gg.AddLog(1, talker, quest_id);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 352) {
myself.SetCurrentQuestID(352);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 352) {
if (reply == 1) {
myself.ShowQuestPage(talker, "pet_manager_rood_q0352_09.htm", 352);

}
if (reply == 2) {
myself.ShowQuestPage(talker, "pet_manager_rood_q0352_10.htm", 352);

}
if (reply == 3) {
myself.RemoveMemo(talker, 352);
gg.AddLog(2, talker, 352);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowQuestPage(talker, "pet_manager_rood_q0352_11.htm", 352);

}
if (reply == 4) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_rood_q0352_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 352);
myself.ShowQuestFHTML(talker, fhtml0, 352);

}

}
super;
	}


}