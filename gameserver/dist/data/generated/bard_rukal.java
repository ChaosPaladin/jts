package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class bard_rukal extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 228) == 0 && myself.GetOneTimeQuestFlag(talker, 228) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of Magus");

}
if (gg.HaveMemo(talker, 228) == 0 && myself.GetOneTimeQuestFlag(talker, 228) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of Magus (Done)");

}
if (gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2841) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of Magus (In Progress)");

}
if (gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2842) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of Magus (In Progress)");

}
if (gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2843) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of Magus (In Progress)");

}
if (gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2847) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of Magus (In Progress)");

}
if (gg.HaveMemo(talker, 30) == 1 && gg.OwnItemCount(talker, 7628) >= 1 && myself.GetOneTimeQuestFlag(talker, 30) == 0 && gg.GetMemoState(talker, 30) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Chest caught with a Bait of Fire (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 0 && myself.GetOneTimeQuestFlag(talker, 228) == 0) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.occupation == 11 || talker.occupation == 26 || talker.occupation == 39) {
if (talker.level < 39) {
myself.ShowPage(talker, "bard_rukal_q0228_02.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "bard_rukal_q0228_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 228);
myself.ShowQuestFHTML(talker, fhtml0, 228);

}

} else {
myself.ShowPage(talker, "bard_rukal_q0228_01.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 0 && myself.GetOneTimeQuestFlag(talker, 228) == 1) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2841) == 1) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bard_rukal_q0228_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2842) == 1) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bard_rukal_q0228_06.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2843) == 1) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2844) >= 1 && gg.OwnItemCount(talker, 2845) >= 1 && gg.OwnItemCount(talker, 2846) >= 1) {
myself.ShowPage(talker, "bard_rukal_q0228_08.htm");

} else {
myself.ShowPage(talker, "bard_rukal_q0228_07.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2847) == 1) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2856) >= 1 && gg.OwnItemCount(talker, 2857) >= 1 && gg.OwnItemCount(talker, 2858) >= 1 && gg.OwnItemCount(talker, 2859) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 2847, gg.OwnItemCount(talker, 2847));
myself.DeleteItem1(talker, 2856, gg.OwnItemCount(talker, 2856));
myself.DeleteItem1(talker, 2857, gg.OwnItemCount(talker, 2857));
myself.DeleteItem1(talker, 2858, gg.OwnItemCount(talker, 2858));
myself.DeleteItem1(talker, 2859, gg.OwnItemCount(talker, 2859));
myself.GiveItem1(talker, 2840, 1);
myself.IncrementParam(talker, 0, 2058244);
myself.IncrementParam(talker, 1, 141240);
myself.GiveItem1(talker, 57, 372154);
myself.ShowPage(talker, "bard_rukal_q0228_12.htm");
myself.RemoveMemo(talker, 228);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 228, 1);
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

} else {
myself.ShowPage(talker, "bard_rukal_q0228_11.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 30) == 1 && gg.OwnItemCount(talker, 7628) >= 1 && myself.GetOneTimeQuestFlag(talker, 30) == 0 && gg.GetMemoState(talker, 30) == 2 * 10 + 1) {
myself.SetCurrentQuestID(30);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 30, 2);
myself.ShowPage(talker, "bard_rukal_q0030_0201.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 228) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 228) == 0 && myself.GetOneTimeQuestFlag(talker, 228) == 0 && myself.GetMemoCount(talker) < 41 && talker.occupation == 11 || talker.occupation == 26 || talker.occupation == 39 && talker.level >= 39) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 228);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 2841, 1);
myself.SetFlagJournal(talker, 228, 1);
myself.ShowQuestMark(talker, 228);
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
myself.ShowQuestPage(talker, "bard_rukal_q0228_04a.htm", 228);

} else {
myself.ShowQuestPage(talker, "bard_rukal_q0228_04.htm", 228);

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 228) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 228) {
if (reply == 1) {
myself.ShowPage(talker, "bard_rukal_q0228_09.htm");

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 2846) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "bard_rukal_q0228_10.htm");
myself.SetFlagJournal(talker, 228, 5);
myself.ShowQuestMark(talker, 228);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2843, gg.OwnItemCount(talker, 2843));
myself.DeleteItem1(talker, 2844, gg.OwnItemCount(talker, 2844));
myself.DeleteItem1(talker, 2845, gg.OwnItemCount(talker, 2845));
myself.DeleteItem1(talker, 2846, 1);
myself.GiveItem1(talker, 2847, 1);

}

}

}

}
if (ask == 30) {
myself.SetCurrentQuestID(30);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 30 && myself.GetOneTimeQuestFlag(talker, 30) == 0) {
i0 = myself.GetHTMLCookie(talker, 30, 3 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 30) == 1 && myself.GetOneTimeQuestFlag(talker, 30) == 0) {
if (gg.OwnItemCount(talker, 7628) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7628, 1);
myself.GiveItem1(talker, 916, 1);

}
gg.AddLog(2, talker, 30);
myself.RemoveMemo(talker, 30);
myself.SetOneTimeQuestFlag(talker, 30, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "bard_rukal_q0030_0301.htm");

} else {
myself.ShowPage(talker, "bard_rukal_q0030_0302.htm");

}

}

}

}
super;
	}


}