package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fisher_perelin extends fisher {
protected Object[][] SellList0 = {
{"green_lure_easy";20;0.000000;0}, {"violet_lure_easy";20;0.000000;0}, {"yellow_lure_easy";20;0.000000;0}, {"green_lure_average";20;0.000000;0}, {"violet_lure_average";20;0.000000;0}, {"yellow_lure_average";20;0.000000;0}, {"green_night_lure_average";20;0.000000;0}, {"violet_night_lure_average";20;0.000000;0}, {"yellow_night_lure_average";20;0.000000;0}, {"big_fish_lure_normal";20;0.000000;0}, {"big_fish_lure_night";20;0.000000;0}, {"big_fish_lure_easy";20;0.000000;0}, {"fp_babyduck_rod";20;0.000000;0}, {"fp_albatros_rod";20;0.000000;0}, {"fp_pelican_rod";20;0.000000;0}, {"fp_kingfisher_rod";20;0.000000;0}, {"fp_cygnus_pole";20;0.000000;0}, {"fp_triton_pole";20;0.000000;0}, {"fishing_manual";20;0.000000;0}, {"oblivion_green";20;0.000000;0}, {"oblivion_jade";20;0.000000;0}, {"oblivion_blue";20;0.000000;0}, {"oblivion_yellow";20;0.000000;0}, {"oblivion_orange";20;0.000000;0}, {"oblivion_violet";20;0.000000;0}, {"oblivion_red";20;0.000000;0}, {"oblivion_white";20;0.000000;0}, {"oblivion_recovery";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 426) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Quest for Fishing shot");

}
if (gg.HaveMemo(talker, 426) == 1 && gg.OwnItemCount(talker, 7586) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Quest for Fishing shot (In Progress)");

}
if (gg.HaveMemo(talker, 426) == 1 && gg.OwnItemCount(talker, 7586) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Quest for Fishing shot (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 426) == 0) {
myself.SetCurrentQuestID(426);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "fisher_berix_q0426_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 426);
myself.ShowQuestFHTML(talker, fhtml0, 426);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 426) == 1 && gg.OwnItemCount(talker, 7586) == 0) {
myself.SetCurrentQuestID(426);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fisher_berix_q0426_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 426) == 1 && gg.OwnItemCount(talker, 7586) >= 1) {
myself.SetCurrentQuestID(426);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fisher_berix_q0426_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 426) {
myself.SetCurrentQuestID(426);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "fisher_berix_q0426_03.htm", 426);
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 426) {
myself.SetCurrentQuestID(426);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 426) {
if (reply == 1) {
myself.ShowPage(talker, "fisher_berix_q0426_06.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "fisher_berix_q0426_07.htm");

}
if (reply == 3) {
myself.RemoveMemo(talker, 426);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "fisher_berix_q0426_08.htm");

}

}
super;
	}


}