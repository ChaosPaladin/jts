package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_uska extends merchant_for_newbie {
protected Object[][] SellList0 = {
{"necklace_of_magic";15;0.000000;0}, {"necklace_of_knowledge";15;0.000000;0}, {"necklace_of_anguish";15;0.000000;0}, {"necklace_of_wisdom";15;0.000000;0}, {"apprentice's_earing";15;0.000000;0}, {"mage_earing";15;0.000000;0}, {"earing_of_strength";15;0.000000;0}, {"earing_of_wisdom";15;0.000000;0}, {"cat'seye_earing";15;0.000000;0}, {"magic_ring";15;0.000000;0}, {"ring_of_knowledge";15;0.000000;0}, {"ring_of_anguish";15;0.000000;0}, {"ring_of_wisdom";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"sb_night_murmur1";15;0.000000;0}, {"sb_blood_lust1";15;0.000000;0}, {"sb_pain_thorn1";15;0.000000;0}, {"sb_devotioin_of_shine1";15;0.000000;0}, {"sb_chill_flame1";15;0.000000;0}, {"sb_mass_frenzy1";15;0.000000;0}, {"sb_external_fear1";15;0.000000;0}, {"sb_entice_madness1";15;0.000000;0}, {"sb_pain_edge1";15;0.000000;0}, {"sb_inspire_life_force1";15;0.000000;0}, {"sb_devotioin_of_soul1";15;0.000000;0}, {"sb_burning_spirit1";15;0.000000;0}, {"sb_blaze_quake1";15;0.000000;0}, {"sb_glory_of_paagrio1";15;0.000000;0}, {"sb_steal_essence1";15;0.000000;0}, {"sb_seal_of_scourge1";15;0.000000;0}, {"sb_seal_of_winter1";15;0.000000;0}, {"sb_shield_of_paagrio1";15;0.000000;0}, {"sb_wisdom_of_paagrio1";15;0.000000;0}, {"sb_chant_of_evasion1";15;0.000000;0}, {"sb_tact_of_paagrio";15;0.000000;0}, {"sb_freezing_flame1";15;0.000000;0}, {"sb_rage_of_paagrio";15;0.000000;0}, {"sb_sight_of_paagrio1";15;0.000000;0}, {"sb_soul_guard1";15;0.000000;0}, {"sb_seal_of_gloom1";15;0.000000;0}, {"sb_seal_of_mirage1";15;0.000000;0}, {"sb_chant_of_rage1";15;0.000000;0}, {"sb_chant_of_vampire1-4";15;0.000000;0}, {"sb_heart_of_paagrio1";15;0.000000;0}, {"sb_seal_of_silence1";15;0.000000;0}, {"sb_seal_of_suspension1";15;0.000000;0}, {"sb_seal_of_flame1";15;0.000000;0}, {"sb_chant_of_eagle1-3";15;0.000000;0}, {"sb_chant_of_fury1";15;0.000000;0}, {"sb_chant_of_predator1-3";15;0.000000;0}, {"sb_speed_of_paagrio1";15;0.000000;0}, {"sb_chant_of_earth";15;0.000000;0}, {"sb_chant_of_war";15;0.000000;0}, {"sb_chant_of_revenge1";15;0.000000;0}, {"sb_ritual_of_life1";15;0.000000;0}, {"sb_honor_of_paagrio1";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 4) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Long Live the Pa'agrio Lord (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 4) == 1) {
myself.SetCurrentQuestID(4);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1544) < 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_uska_q0004_01.htm");
myself.GiveItem1(talker, 1544, 1);
if (gg.OwnItemCount(talker, 1541) + gg.OwnItemCount(talker, 1542) + gg.OwnItemCount(talker, 1543) + gg.OwnItemCount(talker, 1544) + gg.OwnItemCount(talker, 1545) + gg.OwnItemCount(talker, 1546) >= 5) {
myself.SetFlagJournal(talker, 4, 2);
myself.ShowQuestMark(talker, 4);

}
myself.SoundEffect(talker, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(talker, 1544) >= 1) {
myself.ShowPage(talker, "trader_uska_q0004_02.htm");

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