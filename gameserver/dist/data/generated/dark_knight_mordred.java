package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dark_knight_mordred extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 95) == 0 && myself.GetOneTimeQuestFlag(talker, 95) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Hell Knight");

}
if (gg.HaveMemo(talker, 95) == 0 && myself.GetOneTimeQuestFlag(talker, 95) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Hell Knight (Done)");

}
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Hell Knight (In Progress)");

}
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 15) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Hell Knight (In Progress)");

}
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 16) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Hell Knight (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 0 && myself.GetOneTimeQuestFlag(talker, 96) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Spectral Dancer");

}
if (gg.HaveMemo(talker, 96) == 0 && myself.GetOneTimeQuestFlag(talker, 96) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Spectral Dancer (Done)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 15) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 16) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Spectral Dancer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 95) == 0 && myself.GetOneTimeQuestFlag(talker, 95) == 0) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 6) {
myself.ShowQuestPage(talker, "dark_knight_mordred_q0095_0101.htm", 95);

} else {
myself.ShowQuestPage(talker, "dark_knight_mordred_q0095_0102.htm", 95);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 95) == 0 && myself.GetOneTimeQuestFlag(talker, 95) == 1) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 1) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_knight_mordred_q0095_0104.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 15) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_knight_mordred_q0095_0106.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 16) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 91);
myself.SetOneTimeQuestFlag(talker, 95, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 95);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "dark_knight_mordred_q0095_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "dark_knight_mordred_q0095_0110.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 0 && myself.GetOneTimeQuestFlag(talker, 96) == 0) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 34) {
myself.ShowQuestPage(talker, "dark_knight_mordred_q0096_0101.htm", 96);

} else {
myself.ShowQuestPage(talker, "dark_knight_mordred_q0096_0102.htm", 96);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 0 && myself.GetOneTimeQuestFlag(talker, 96) == 1) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 1) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_knight_mordred_q0096_0104.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 15) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_knight_mordred_q0096_0106.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 16) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 107);
myself.SetOneTimeQuestFlag(talker, 96, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 96);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "dark_knight_mordred_q0096_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "dark_knight_mordred_q0096_0110.htm");

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
if (quest_id == 95) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 95) == 0 && myself.GetOneTimeQuestFlag(talker, 95) == 0 && talker.level >= 76 && talker.occupation == 6) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7086, 1);
myself.SetMemo(talker, 95);
myself.ShowQuestMark(talker, 95);
myself.SetMemoState(talker, 95, 1);
myself.SetFlagJournal(talker, 95, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "dark_knight_mordred_q0095_0103.htm", 95);
gg.AddLog(1, talker, 95);

}

}
return;

}
if (quest_id == 96) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 96) == 0 && myself.GetOneTimeQuestFlag(talker, 96) == 0 && talker.level >= 76 && talker.occupation == 34) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7092, 1);
myself.SetMemo(talker, 96);
myself.ShowQuestMark(talker, 96);
myself.SetMemoState(talker, 96, 1);
myself.SetFlagJournal(talker, 96, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "dark_knight_mordred_q0096_0103.htm", 96);
gg.AddLog(1, talker, 96);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 95) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 95) {
if (reply == 1) {
if (gg.HaveMemo(talker, 95) == 0 && talker.occupation == 6 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 95) == 0) {
myself.FHTML_SetFileName(fhtml0, "dark_knight_mordred_q0095_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 95);
myself.ShowQuestFHTML(talker, fhtml0, 95);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7086, gg.OwnItemCount(talker, 7086));
myself.ClassChange(talker, 91);
myself.SetOneTimeQuestFlag(talker, 95, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 95);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "dark_knight_mordred_q0095_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 95, 16);
myself.SetFlagJournal(talker, 95, 20);
myself.ShowQuestMark(talker, 95);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7086, gg.OwnItemCount(talker, 7086));
myself.ShowPage(talker, "dark_knight_mordred_q0095_0108.htm");

}

}

}

}
if (ask == 96) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 96) {
if (reply == 1) {
if (gg.HaveMemo(talker, 96) == 0 && talker.occupation == 34 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 96) == 0) {
myself.FHTML_SetFileName(fhtml0, "dark_knight_mordred_q0096_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 96);
myself.ShowQuestFHTML(talker, fhtml0, 96);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7092, gg.OwnItemCount(talker, 7092));
myself.ClassChange(talker, 107);
myself.SetOneTimeQuestFlag(talker, 96, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 96);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "dark_knight_mordred_q0096_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 96, 16);
myself.SetFlagJournal(talker, 96, 20);
myself.ShowQuestMark(talker, 96);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7092, gg.OwnItemCount(talker, 7092));
myself.ShowPage(talker, "dark_knight_mordred_q0096_0108.htm");

}

}

}

}
super;
	}


}