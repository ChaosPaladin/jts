package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cob extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 964) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Sea of Spores Fever (In Progress)");

}
if (gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 965) > 0 && gg.OwnItemCount(talker, 966) < 10) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Sea of Spores Fever (In Progress)");

}
if (gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 746) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Sea of Spores Fever (In Progress)");

}
if (gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 965) > 0 && gg.OwnItemCount(talker, 966) >= 10) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Sea of Spores Fever (In Progress)");

}
if (gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 746) == 0 && gg.OwnItemCount(talker, 1130) == 1 || gg.OwnItemCount(talker, 1131) == 1 || gg.OwnItemCount(talker, 1132) == 1 || gg.OwnItemCount(talker, 1133) == 1 || gg.OwnItemCount(talker, 1134) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Sea of Spores Fever (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 964) == 1) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 964) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 965, 1);
myself.DeleteItem1(talker, 964, 1);
myself.ShowPage(talker, "cob_q0102_03.htm");
myself.SetFlagJournal(talker, 102, 2);
myself.ShowQuestMark(talker, 102);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 965) > 0 && gg.OwnItemCount(talker, 966) < 10) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cob_q0102_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 746) > 0) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cob_q0102_07.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 965) > 0 && gg.OwnItemCount(talker, 966) >= 10) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 965, 1);
myself.DeleteItem1(talker, 966, gg.OwnItemCount(talker, 966));
myself.GiveItem1(talker, 1130, 1);
myself.GiveItem1(talker, 1131, 1);
myself.GiveItem1(talker, 1132, 1);
myself.GiveItem1(talker, 1133, 1);
myself.GiveItem1(talker, 1134, 1);
myself.ShowPage(talker, "cob_q0102_05.htm");
myself.SetFlagJournal(talker, 102, 4);
myself.ShowQuestMark(talker, 102);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 746) == 0 && gg.OwnItemCount(talker, 1130) == 1 || gg.OwnItemCount(talker, 1131) == 1 || gg.OwnItemCount(talker, 1132) == 1 || gg.OwnItemCount(talker, 1133) == 1 || gg.OwnItemCount(talker, 1134) == 1) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cob_q0102_06.htm");

}
break;

}

}
return;

}
super;
	}


}