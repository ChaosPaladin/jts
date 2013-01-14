package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_luther extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 225) == 0 && myself.GetOneTimeQuestFlag(talker, 225) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Searcher");

}
if (gg.HaveMemo(talker, 225) == 0 && myself.GetOneTimeQuestFlag(talker, 225) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Searcher (Done)");

}
if (gg.HaveMemo(talker, 225) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Searcher (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 0 && myself.GetOneTimeQuestFlag(talker, 225) == 0) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.occupation == 7 || talker.occupation == 22 || talker.occupation == 35 || talker.occupation == 54 == 0) {
myself.ShowPage(talker, "master_luther_q0225_01.htm");

} else if (talker.occupation == 7 || talker.occupation == 22 || talker.occupation == 35 || talker.occupation == 54 && talker.level < 39) {
myself.ShowPage(talker, "master_luther_q0225_02.htm");

} else if (talker.occupation == 7 || talker.occupation == 22 || talker.occupation == 35 || talker.occupation == 54 && talker.level >= 39) {
if (talker.occupation == 54) {
myself.FHTML_SetFileName(fhtml0, "master_luther_q0225_04.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "master_luther_q0225_03.htm");

}
myself.FHTML_SetInt(fhtml0, "quest_id", 225);
myself.ShowQuestFHTML(talker, fhtml0, 225);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 0 && myself.GetOneTimeQuestFlag(talker, 225) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2784) == 1 && gg.OwnItemCount(talker, 2808) == 0) {
myself.ShowPage(talker, "master_luther_q0225_06.htm");

} else if (gg.OwnItemCount(talker, 2784) == 0 && gg.OwnItemCount(talker, 2808) == 0) {
myself.ShowPage(talker, "master_luther_q0225_07.htm");

} else if (gg.OwnItemCount(talker, 2784) == 0 && gg.OwnItemCount(talker, 2808) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 894888);
myself.IncrementParam(talker, 1, 61408);
myself.GiveItem1(talker, 57, 161806);
myself.ShowPage(talker, "master_luther_q0225_08.htm");
myself.RemoveMemo(talker, 225);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 225, 1);
myself.DeleteItem1(talker, 2808, 1);
myself.GiveItem1(talker, 2809, 1);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (myself.GetOneTimeQuestFlag(talker, 56) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 64);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 92);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 82);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 23);

}
myself.SetOneTimeQuestFlag(talker, 56, 1);

}

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
if (quest_id == 225) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 225) == 0 && myself.GetOneTimeQuestFlag(talker, 225) == 0 && myself.GetMemoCount(talker) < 41 && talker.occupation == 7 || talker.occupation == 22 || talker.occupation == 35 || talker.occupation == 54 && talker.level >= 39) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 225);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 2784, 1);
myself.SetFlagJournal(talker, 225, 1);
myself.ShowQuestMark(talker, 225);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (myself.GetOneTimeQuestFlag(talker, 56) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 64);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 92);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 82);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 23);

}
myself.SetOneTimeQuestFlag(talker, 56, 1);
myself.ShowQuestPage(talker, "master_luther_q0225_05a.htm", 225);

} else {
myself.ShowQuestPage(talker, "master_luther_q0225_05.htm", 225);

}

}

}
return;

}
super;
	}


}