package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kegor_savedun extends ai_icequeen_q_kegor {
	protected void TALKED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 10284) == 1 && gg.GetMemoState(talker, 10284) == 3) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Acquisition of Divine Sword (In progress)");

}
if (gg.HaveMemo(talker, 10284) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Acquisition of Divine Sword (Done)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 0);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10284) == 1 && gg.GetMemoState(talker, 10284) == 3) {
myself.SetCurrentQuestID(10284);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.RemoveMemo(talker, 10284);
myself.GiveItem1(talker, 57, 296425);
myself.IncrementParam(talker, 0, 921805);
myself.IncrementParam(talker, 1, 82230);
myself.SetOneTimeQuestFlag(talker, 10284, 1);
gg.SetDailyQuestFlag(talker, 10284);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 10284);
gg.AddLog(3, talker, 10284);
myself.ShowPage(talker, "kegor_savedun_q10284_03.htm");
myself.InstantZone_Finish(2);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10284) == 0) {
myself.SetCurrentQuestID(10284);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.sm.instant_zone_type_id == 138) {
myself.ShowPage(talker, "kegor_savedun_q10284_04.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 10284) {
myself.SetCurrentQuestID(10284);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10284) {
if (reply == 2) {
if (myself.sm.instant_zone_type_id == 138) {
myself.InstantZone_Leave(talker);

}

}

}
super;
	}


}