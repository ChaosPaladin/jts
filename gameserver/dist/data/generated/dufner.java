package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dufner extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 213) == 0 && myself.GetOneTimeQuestFlag(talker, 213) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Seeker");

}
if (gg.HaveMemo(talker, 213) == 0 && myself.GetOneTimeQuestFlag(talker, 213) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Seeker (Done)");

}
if (gg.HaveMemo(talker, 213) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Seeker (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 0 && myself.GetOneTimeQuestFlag(talker, 213) == 0) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.occupation == 7 || talker.occupation == 22 || talker.occupation == 35 == 0) {
myself.ShowPage(talker, "dufner_q0213_00.htm");

} else if (talker.occupation == 7 || talker.occupation == 22 || talker.occupation == 35 && talker.level < 35) {
myself.ShowPage(talker, "dufner_q0213_02.htm");

} else {
myself.ShowQuestPage(talker, "dufner_q0213_03.htm", 213);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 0 && myself.GetOneTimeQuestFlag(talker, 213) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2647) == 1 && gg.OwnItemCount(talker, 2672) == 0) {
myself.ShowPage(talker, "dufner_q0213_06.htm");

} else if (gg.OwnItemCount(talker, 2647) == 0 && gg.OwnItemCount(talker, 2672) == 0) {
myself.ShowPage(talker, "dufner_q0213_07.htm");

} else if (gg.OwnItemCount(talker, 2647) == 0 && gg.OwnItemCount(talker, 2672) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 1029478);
myself.IncrementParam(talker, 1, 66768);
myself.GiveItem1(talker, 57, 187606);
myself.ShowPage(talker, "dufner_q0213_08.htm");
myself.RemoveMemo(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 213, 1);
myself.DeleteItem1(talker, 2672, gg.OwnItemCount(talker, 2672));
myself.GiveItem1(talker, 2673, 1);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (myself.GetOneTimeQuestFlag(talker, 54) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 85);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 85);

}
myself.SetOneTimeQuestFlag(talker, 54, 1);

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
if (quest_id == 213) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 213) == 0 && myself.GetOneTimeQuestFlag(talker, 213) == 0 && myself.GetMemoCount(talker) < 41 && talker.occupation == 7 || talker.occupation == 22 || talker.occupation == 35 && talker.level >= 35) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 2647) == 0) {
myself.GiveItem1(talker, 2647, 1);

}
myself.SetFlagJournal(talker, 213, 1);
myself.ShowQuestMark(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (myself.GetOneTimeQuestFlag(talker, 54) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 85);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 85);

}
myself.SetOneTimeQuestFlag(talker, 54, 1);
myself.ShowQuestPage(talker, "dufner_q0213_05a.htm", 213);

} else {
myself.ShowQuestPage(talker, "dufner_q0213_05.htm", 213);

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 213) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 213) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "dufner_q0213_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 213);
myself.ShowQuestFHTML(talker, fhtml0, 213);

}

}
super;
	}


}