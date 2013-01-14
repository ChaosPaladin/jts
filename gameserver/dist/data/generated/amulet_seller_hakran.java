package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class amulet_seller_hakran extends merchant {
protected Object[][] SellList0 = {
{"sb_night_murmur1";20;0.000000;0}, {"sb_blood_lust1";20;0.000000;0}, {"sb_pain_thorn1";20;0.000000;0}, {"sb_devotioin_of_shine1";20;0.000000;0}, {"sb_chill_flame1";20;0.000000;0}, {"sb_mass_frenzy1";20;0.000000;0}, {"sb_external_fear1";20;0.000000;0}, {"sb_entice_madness1";20;0.000000;0}, {"sb_pain_edge1";20;0.000000;0}, {"sb_inspire_life_force1";20;0.000000;0}, {"sb_devotioin_of_soul1";20;0.000000;0}, {"sb_burning_spirit1";20;0.000000;0}, {"sb_blaze_quake1";20;0.000000;0}, {"sb_eternal_flame1";20;0.000000;0}, {"sb_bind_will1";20;0.000000;0}, {"sb_aura_sway1";20;0.000000;0}, {"sb_engrave_seal_of_timid1";20;0.000000;0}, {"sb_pure_inspiration1";20;0.000000;0}, {"sb_power_of_paagrio1";20;0.000000;0}, {"sb_blessing_of_paagrio1";20;0.000000;0}, {"sb_engrave_seal_of_lazy1";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 76) == 0 && myself.GetOneTimeQuestFlag(talker, 76) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Grand Khavatari");

}
if (gg.HaveMemo(talker, 76) == 0 && myself.GetOneTimeQuestFlag(talker, 76) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Grand Khavatari (Done)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 15) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 16) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Grand Khavatari (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 0 && myself.GetOneTimeQuestFlag(talker, 76) == 0) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 48) {
myself.ShowQuestPage(talker, "amulet_seller_hakran_q0076_0101.htm", 76);

} else {
myself.ShowQuestPage(talker, "amulet_seller_hakran_q0076_0102.htm", 76);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 0 && myself.GetOneTimeQuestFlag(talker, 76) == 1) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 1) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "amulet_seller_hakran_q0076_0104.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 15) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "amulet_seller_hakran_q0076_0106.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 16) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 114);
myself.SetOneTimeQuestFlag(talker, 76, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 76);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "amulet_seller_hakran_q0076_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "amulet_seller_hakran_q0076_0110.htm");

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
if (quest_id == 76) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 76) == 0 && myself.GetOneTimeQuestFlag(talker, 76) == 0 && talker.level >= 76 && talker.occupation == 48) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7099, 1);
myself.SetMemo(talker, 76);
myself.ShowQuestMark(talker, 76);
myself.SetMemoState(talker, 76, 1);
myself.SetFlagJournal(talker, 76, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "amulet_seller_hakran_q0076_0103.htm", 76);
gg.AddLog(1, talker, 76);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 76) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 76) {
if (reply == 1) {
if (gg.HaveMemo(talker, 76) == 0 && talker.occupation == 48 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 76) == 0) {
myself.FHTML_SetFileName(fhtml0, "amulet_seller_hakran_q0076_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 76);
myself.ShowQuestFHTML(talker, fhtml0, 76);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7099, gg.OwnItemCount(talker, 7099));
myself.ClassChange(talker, 114);
myself.SetOneTimeQuestFlag(talker, 76, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 76);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "amulet_seller_hakran_q0076_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 76, 16);
myself.SetFlagJournal(talker, 76, 20);
myself.ShowQuestMark(talker, 76);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7099, gg.OwnItemCount(talker, 7099));
myself.ShowPage(talker, "amulet_seller_hakran_q0076_0108.htm");

}

}

}

}
super;
	}


}