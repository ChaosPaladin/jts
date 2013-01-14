package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pet_manager_cooper extends pet_manager {
protected Object[][] SellList0 = {
{"iron_canine";20;0.000000;0}, {"shining_canine";20;0.000000;0}, {"ghost_canine";20;0.000000;0}, {"mithril_canine";20;0.000000;0}, {"sylvan_canine";20;0.000000;0}, {"orikarukon_canine";20;0.000000;0}, {"fang_of_saltydog";20;0.000000;0}, {"wolve's_leather_mail";20;0.000000;0}, {"wolves_hide_armor";20;0.000000;0}, {"wolves_hard_leather_mail";20;0.000000;0}, {"wolves_wooden_armor";20;0.000000;0}, {"wolves_ring_mail";20;0.000000;0}, {"wolves_bone_armor";20;0.000000;0}, {"wolves_scale_mail";20;0.000000;0}, {"food_for_wolves";20;0.000000;0}, {"greater_food_of_pet";20;0.000000;0}, {"viperbite";20;0.000000;0}, {"shadow_fang";20;0.000000;0}, {"alya_fang";20;0.000000;0}, {"torturer";20;0.000000;0}, {"serpentine_grinder";20;0.000000;0}, {"fang_of_dahak";20;0.000000;0}, {"crimson_bloodfang";20;0.000000;0}, {"draconic_chopper";20;0.000000;0}, {"diabolic_grinder";20;0.000000;0}, {"hatchlings_scale_mail";20;0.000000;0}, {"hatchlings_brigandine";20;0.000000;0}, {"hatchlings_bronze_coat";20;0.000000;0}, {"hatchlings_steel_coat";20;0.000000;0}, {"hatchlings_gorgon_coat";20;0.000000;0}, {"hatchlings_ophidian_plate";20;0.000000;0}, {"hatchlings_crimson_plate";20;0.000000;0}, {"hatchlings_draconic_plate";20;0.000000;0}, {"hatchlings_inferno_plate";20;0.000000;0}, {"food_for_hatchling";20;0.000000;0}, {"serpentine_spike";20;0.000000;0}, {"drake_horn";20;0.000000;0}, {"assault_alicorn";20;0.000000;0}, {"draconic_slicer";20;0.000000;0}, {"ophidian_lancer";20;0.000000;0}, {"diamond_drill";20;0.000000;0}, {"mithril_panzer_coat";20;0.000000;0}, {"brigandine_panzer_coat";20;0.000000;0}, {"draconic_panzer_coat";20;0.000000;0}, {"blood_panzer_coat";20;0.000000;0}, {"ophidian_panzer_coat";20;0.000000;0}, {"inferno_panzer_coat";20;0.000000;0}, {"food_for_strider";20;0.000000;0}, {"beast_soul_shot";20;0.000000;0}, {"beast_spirit_shot";20;0.000000;0}, {"blessed_beast_spirit_shot";20;0.000000;0}, {"pet_food_baby_spice";20;0.000000;0}, {"pet_armor_little_harness";20;0.000000;0}, {"enchanted_wolf_canine";20;0.000000;0}, {"enchanted_coyote_canine";20;0.000000;0}, {"revolution_salty_dog_canine";20;0.000000;0}, {"enchanted_ceruberus_canine";20;0.000000;0}, {"oricalcum_canine";20;0.000000;0}, {"enchanted_fenril_canine";20;0.000000;0}, {"black_mane_wolf_scale_armor";20;0.000000;0}, {"black_mane_wolf_bronze_armor";20;0.000000;0}, {"black_mane_wolf_plate_armor";20;0.000000;0}, {"black_mane_wolf_mithril_armor";20;0.000000;0}, {"black_mane_wolf_oriharukon_armor";20;0.000000;0}, {"black_mane_wolf_oricalcum_armor";20;0.000000;0}, {"revolution_wolf_food";20;0.000000;0}, {"beast_soul_shot_capsule";20;0.000000;0}, {"beast_spirit_shot_capsule";20;0.000000;0}, {"blessed_beast_spirit_shot_capsule";20;0.000000;0}, {"food_for_upgrade_baby_pet";20;0.000000;0}, {"baby_pet_scale_armor";20;0.000000;0}, {"baby_pet_bronze_armor";20;0.000000;0}, {"baby_pet_plate_armor";20;0.000000;0}, {"baby_pet_mithril_armor";20;0.000000;0}, {"baby_pet_oriharukon_armor";20;0.000000;0}, {"baby_pet_oricalcum_armor";20;0.000000;0}, {"pet_crystal_pandent";20;0.000000;0}, {"pet_rubi_pendant";20;0.000000;0}, {"pet_sapphire_pendant";20;0.000000;0}, {"pet_diamond_pendant";20;0.000000;0}, {"pet_enria_pendant";20;0.000000;0}, {"pet_thons_pendant";20;0.000000;0}, {"pet_asofe_pendant";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 420) == 0 && talker.level >= 35) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Little Wing");

}
if (gg.HaveMemo(talker, 420) == 0 && talker.level < 35) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Little Wing");

}
if (gg.HaveMemo(talker, 420) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Little Wing (In Progress)");

}
if (talker.level >= 26 && gg.HaveMemo(talker, 43) == 0 && myself.GetOneTimeQuestFlag(talker, 43) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Help the Sister!");

}
if (talker.level < 26 && gg.HaveMemo(talker, 43) == 0 && myself.GetOneTimeQuestFlag(talker, 43) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Help the Sister!");

}
if (gg.HaveMemo(talker, 43) == 0 && myself.GetOneTimeQuestFlag(talker, 43) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Help the Sister! (Done)");

}
if (gg.HaveMemo(talker, 43) == 1 && myself.GetOneTimeQuestFlag(talker, 43) == 0 && gg.GetMemoState(talker, 43) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Help the Sister! (In Progress)");

}
if (gg.HaveMemo(talker, 43) == 1 && gg.GetMemoState(talker, 43) <= 2 * 10 + 2 && gg.GetMemoState(talker, 43) >= 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Help the Sister! (In Progress)");

}
if (gg.HaveMemo(talker, 43) == 1 && gg.GetMemoState(talker, 43) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Help the Sister! (In Progress)");

}
if (gg.HaveMemo(talker, 43) == 1 && gg.GetMemoState(talker, 43) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Help the Sister! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 0 && talker.level >= 35) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_cooper_q0420_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 420);
myself.ShowQuestFHTML(talker, fhtml0, 420);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 0 && talker.level < 35) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pet_manager_cooper_q0420_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pet_manager_cooper_q0420_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || talker.level >= 26 && gg.HaveMemo(talker, 43) == 0 && myself.GetOneTimeQuestFlag(talker, 43) == 0) {
myself.SetCurrentQuestID(43);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_cooper_q0043_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 43);
myself.ShowQuestFHTML(talker, fhtml0, 43);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || talker.level < 26 && gg.HaveMemo(talker, 43) == 0 && myself.GetOneTimeQuestFlag(talker, 43) == 0) {
myself.SetCurrentQuestID(43);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pet_manager_cooper_q0043_0103.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 43) == 0 && myself.GetOneTimeQuestFlag(talker, 43) == 1) {
myself.SetCurrentQuestID(43);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 43) == 1 && myself.GetOneTimeQuestFlag(talker, 43) == 0 && gg.GetMemoState(talker, 43) == 1 * 10 + 1) {
myself.SetCurrentQuestID(43);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 220) >= 1) {
myself.SetHTMLCookie(talker, 43, 1);
myself.ShowPage(talker, "pet_manager_cooper_q0043_0105.htm");

} else {
myself.ShowPage(talker, "pet_manager_cooper_q0043_0106.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 43) == 1 && gg.GetMemoState(talker, 43) <= 2 * 10 + 2 && gg.GetMemoState(talker, 43) >= 2 * 10 + 1) {
myself.SetCurrentQuestID(43);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 43) == 2 * 10 + 2 && gg.OwnItemCount(talker, 7550) >= 30) {
myself.SetHTMLCookie(talker, 43, 2);
myself.ShowPage(talker, "pet_manager_cooper_q0043_0203.htm");

} else {
myself.ShowPage(talker, "pet_manager_cooper_q0043_0204.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 43) == 1 && gg.GetMemoState(talker, 43) == 3 * 10 + 1) {
myself.SetCurrentQuestID(43);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pet_manager_cooper_q0043_0303.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 43) == 1 && gg.GetMemoState(talker, 43) == 4 * 10 + 1) {
myself.SetCurrentQuestID(43);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 43, 4);
myself.ShowPage(talker, "pet_manager_cooper_q0043_0401.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 420) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 420);
gg.AddLog(1, talker, 420);
myself.SetJournal(talker, 420, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "pet_manager_cooper_q0420_02.htm", 420);
myself.SetMemoState(talker, 420, 1);

}
return;

}
if (quest_id == 43) {
myself.SetCurrentQuestID(43);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 43);
myself.ShowQuestMark(talker, 43);
myself.SetMemoState(talker, 43, 1 * 10 + 1);
gg.AddLog(1, talker, 43);
myself.SetFlagJournal(talker, 43, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "pet_manager_cooper_q0043_0104.htm", 43);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 420) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 420) {

}
if (ask == 43) {
myself.SetCurrentQuestID(43);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 43) {
i0 = myself.GetHTMLCookie(talker, 43, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 43) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 220, 1);
myself.ShowPage(talker, "pet_manager_cooper_q0043_0201.htm");
myself.SetMemoState(talker, 43, 2 * 10 + 1);
myself.SetFlagJournal(talker, 43, 2);
myself.ShowQuestMark(talker, 43);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 43) {
myself.SetCurrentQuestID(43);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 43) {
i0 = myself.GetHTMLCookie(talker, 43, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 43) == 1) {
if (gg.OwnItemCount(talker, 7550) >= 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7550, 30);
myself.GiveItem1(talker, 7551, 1);
myself.ShowPage(talker, "pet_manager_cooper_q0043_0301.htm");
myself.SetMemoState(talker, 43, 3 * 10 + 1);
myself.SetFlagJournal(talker, 43, 4);
myself.ShowQuestMark(talker, 43);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pet_manager_cooper_q0043_0302.htm");

}

}

}

}
if (ask == 43) {
myself.SetCurrentQuestID(43);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 43 && myself.GetOneTimeQuestFlag(talker, 43) == 0) {
i0 = myself.GetHTMLCookie(talker, 43, 5 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 43) == 1 && myself.GetOneTimeQuestFlag(talker, 43) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7584, 1);

}
gg.AddLog(2, talker, 43);
myself.RemoveMemo(talker, 43);
myself.SetOneTimeQuestFlag(talker, 43, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "pet_manager_cooper_q0043_0501.htm");

}

}

}
super;
	}


}