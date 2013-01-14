package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class golem_crafter_telson extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 100) == 0 && myself.GetOneTimeQuestFlag(talker, 100) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Maestro");

}
if (gg.HaveMemo(talker, 100) == 0 && myself.GetOneTimeQuestFlag(talker, 100) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Maestro (Done)");

}
if (gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 15) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 16) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Maestro (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 100) == 0 && myself.GetOneTimeQuestFlag(talker, 100) == 0) {
myself.SetCurrentQuestID(100);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 57) {
myself.ShowQuestPage(talker, "golem_crafter_telson_q0100_0101.htm", 100);

} else {
myself.ShowQuestPage(talker, "golem_crafter_telson_q0100_0102.htm", 100);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 100) == 0 && myself.GetOneTimeQuestFlag(talker, 100) == 1) {
myself.SetCurrentQuestID(100);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 1) {
myself.SetCurrentQuestID(100);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "golem_crafter_telson_q0100_0104.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 15) {
myself.SetCurrentQuestID(100);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "golem_crafter_telson_q0100_0106.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 16) {
myself.SetCurrentQuestID(100);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 118);
myself.SetOneTimeQuestFlag(talker, 100, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 100);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "golem_crafter_telson_q0100_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "golem_crafter_telson_q0100_0110.htm");

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
if (quest_id == 100) {
myself.SetCurrentQuestID(100);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 100) == 0 && myself.GetOneTimeQuestFlag(talker, 100) == 0 && talker.level >= 76 && talker.occupation == 57) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7108, 1);
myself.SetMemo(talker, 100);
myself.ShowQuestMark(talker, 100);
myself.SetMemoState(talker, 100, 1);
myself.SetFlagJournal(talker, 100, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "golem_crafter_telson_q0100_0103.htm", 100);
gg.AddLog(1, talker, 100);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 100) {
myself.SetCurrentQuestID(100);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 100) {
if (reply == 1) {
if (gg.HaveMemo(talker, 100) == 0 && talker.occupation == 57 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 100) == 0) {
myself.FHTML_SetFileName(fhtml0, "golem_crafter_telson_q0100_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 100);
myself.ShowQuestFHTML(talker, fhtml0, 100);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7108, gg.OwnItemCount(talker, 7108));
myself.ClassChange(talker, 118);
myself.SetOneTimeQuestFlag(talker, 100, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 100);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "golem_crafter_telson_q0100_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 100, 16);
myself.SetFlagJournal(talker, 100, 20);
myself.ShowQuestMark(talker, 100);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7108, gg.OwnItemCount(talker, 7108));
myself.ShowPage(talker, "golem_crafter_telson_q0100_0108.htm");

}

}

}

}
super;
	}


}