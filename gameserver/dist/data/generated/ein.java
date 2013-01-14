package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ein extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 401) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Warrior");

}
if (gg.HaveMemo(talker, 401) == 1 && gg.OwnItemCount(talker, 1138) > 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Warrior (In Progress)");

}
if (gg.HaveMemo(talker, 401) == 1 && gg.OwnItemCount(talker, 1139) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Warrior (In Progress)");

}
if (gg.HaveMemo(talker, 401) == 1 && gg.OwnItemCount(talker, 1143) && gg.OwnItemCount(talker, 1141) && gg.OwnItemCount(talker, 1139) == 0 && gg.OwnItemCount(talker, 1138) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Warrior (In Progress)");

}
if (gg.HaveMemo(talker, 401) == 1 && gg.OwnItemCount(talker, 1142) && gg.OwnItemCount(talker, 1139) == 0 && gg.OwnItemCount(talker, 1138) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Warrior (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 401) == 0) {
myself.SetCurrentQuestID(401);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "ein_q0401_01.htm", 401);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 401) == 1 && gg.OwnItemCount(talker, 1138) > 0) {
myself.SetCurrentQuestID(401);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ein_q0401_07.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 401) == 1 && gg.OwnItemCount(talker, 1139) == 1) {
myself.SetCurrentQuestID(401);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ein_q0401_08.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 401) == 1 && gg.OwnItemCount(talker, 1143) && gg.OwnItemCount(talker, 1141) && gg.OwnItemCount(talker, 1139) == 0 && gg.OwnItemCount(talker, 1138) == 0) {
myself.SetCurrentQuestID(401);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ein_q0401_09.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 401) == 1 && gg.OwnItemCount(talker, 1142) && gg.OwnItemCount(talker, 1139) == 0 && gg.OwnItemCount(talker, 1138) == 0) {
myself.SetCurrentQuestID(401);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1144) < 20) {
myself.ShowPage(talker, "ein_q0401_12.htm");

} else if (gg.OwnItemCount(talker, 1144) > 19) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1144, gg.OwnItemCount(talker, 1144));
myself.DeleteItem1(talker, 1142, 1);
myself.GiveItem1(talker, 1145, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 21012);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 27710);

} else {
myself.IncrementParam(talker, 0, 160267);
myself.IncrementParam(talker, 1, 34408);

}
myself.GiveItem1(talker, 57, 163800);

}

}
myself.ShowPage(talker, "ein_q0401_13.htm");
myself.RemoveMemo(talker, 401);
gg.AddLog(2, talker, 401);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

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
if (quest_id == 401) {
myself.SetCurrentQuestID(401);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1138) == 0) {
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 401);
gg.AddLog(1, talker, 401);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 1138, 1);
myself.ShowQuestPage(talker, "ein_q0401_06.htm", 401);
myself.SetFlagJournal(talker, 401, 1);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 401) {
myself.SetCurrentQuestID(401);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 401) {
if (reply == 1) {
if (talker.occupation == 0) {
if (talker.level >= 18) {
if (gg.OwnItemCount(talker, 1145) > 0) {
myself.ShowQuestPage(talker, "ein_q0401_04.htm", 401);

} else {
myself.FHTML_SetFileName(fhtml0, "ein_q0401_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 401);
myself.ShowQuestFHTML(talker, fhtml0, 401);

}

} else {
myself.ShowQuestPage(talker, "ein_q0401_02.htm", 401);

}

} else if (talker.occupation == 1) {
myself.ShowQuestPage(talker, "ein_q0401_02a.htm", 401);

} else {
myself.ShowQuestPage(talker, "ein_q0401_03.htm", 401);

}

} else if (reply == 2) {
myself.ShowPage(talker, "ein_q0401_10.htm");

} else if (reply == 3 && gg.OwnItemCount(talker, 1143) > 0 && gg.OwnItemCount(talker, 1141) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "ein_q0401_11.htm");
myself.DeleteItem1(talker, 1143, 1);
myself.DeleteItem1(talker, 1141, 1);
myself.GiveItem1(talker, 1142, 1);
myself.SetFlagJournal(talker, 401, 5);
myself.ShowQuestMark(talker, 401);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}