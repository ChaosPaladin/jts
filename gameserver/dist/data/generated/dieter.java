package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dieter extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2691) >= 1 && gg.OwnItemCount(talker, 2699) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2691) >= 1 && gg.OwnItemCount(talker, 2700) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2691) >= 1 && gg.OwnItemCount(talker, 2701) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2691) >= 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2702) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2691) >= 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2704) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2691) >= 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2702) == 0 && gg.OwnItemCount(talker, 2704) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2720) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 366) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Silver Haired Shaman");

}
if (gg.HaveMemo(talker, 366) == 1 && gg.OwnItemCount(talker, 5874) < 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Silver Haired Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 366) == 1 && gg.OwnItemCount(talker, 5874) >= 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Silver Haired Shaman (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2691) >= 1 && gg.OwnItemCount(talker, 2699) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dieter_q0214_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2691) >= 1 && gg.OwnItemCount(talker, 2700) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dieter_q0214_06.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2691) >= 1 && gg.OwnItemCount(talker, 2701) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dieter_q0214_07.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2691) >= 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2702) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dieter_q0214_10.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2691) >= 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2704) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dieter_q0214_11.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2691) >= 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2702) == 0 && gg.OwnItemCount(talker, 2704) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2706) >= 1 && gg.OwnItemCount(talker, 2707) >= 1 && gg.OwnItemCount(talker, 2708) >= 1 && gg.OwnItemCount(talker, 2709) >= 1) {
myself.ShowPage(talker, "dieter_q0214_13.htm");

} else {
myself.ShowPage(talker, "dieter_q0214_12.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2720) == 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dieter_q0214_15.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 366) == 0) {
myself.SetCurrentQuestID(366);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 48) {
myself.FHTML_SetFileName(fhtml0, "dieter_q0366_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 366);
myself.ShowQuestFHTML(talker, fhtml0, 366);

} else if (talker.level < 48) {
myself.ShowPage(talker, "dieter_q0366_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 366) == 1 && gg.OwnItemCount(talker, 5874) < 1) {
myself.SetCurrentQuestID(366);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dieter_q0366_04.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 366) == 1 && gg.OwnItemCount(talker, 5874) >= 1) {
myself.SetCurrentQuestID(366);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5874) * 500 + 29000);
myself.DeleteItem1(talker, 5874, gg.OwnItemCount(talker, 5874));
gg.AddLog(3, talker, 366);
myself.ShowPage(talker, "dieter_q0366_05.htm");

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
if (quest_id == 366) {
myself.SetCurrentQuestID(366);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
gg.AddLog(1, talker, 366);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "dieter_q0366_03.htm", 366);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 214) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 214) {
if (reply == 1) {
myself.ShowPage(talker, "dieter_q0214_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "dieter_q0214_03.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "dieter_q0214_04.htm");

}
if (reply == 4) {
if (gg.OwnItemCount(talker, 2699) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "dieter_q0214_05.htm");
myself.SetFlagJournal(talker, 214, 21);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2699, 1);
myself.GiveItem1(talker, 2700, 1);

}

}

}
if (reply == 5) {
myself.ShowPage(talker, "dieter_q0214_08.htm");

}
if (reply == 6) {
if (gg.OwnItemCount(talker, 2701) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "dieter_q0214_09.htm");
myself.SetFlagJournal(talker, 214, 23);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2701, 1);
myself.GiveItem1(talker, 2702, 1);
myself.GiveItem1(talker, 2703, 1);

}

}

}

}
if (ask == 366) {
myself.SetCurrentQuestID(366);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 366) {
if (reply == 1) {
myself.RemoveMemo(talker, 366);
gg.AddLog(2, talker, 366);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dieter_q0366_06.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "dieter_q0366_07.htm");

}

}
super;
	}


}