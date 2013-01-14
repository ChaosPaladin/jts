package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class duelist_kaien extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 222) == 0 && myself.GetOneTimeQuestFlag(talker, 222) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Duelist");

}
if (gg.HaveMemo(talker, 222) == 0 && myself.GetOneTimeQuestFlag(talker, 222) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Duelist (Done)");

}
if (gg.HaveMemo(talker, 222) == 1 && gg.OwnItemCount(talker, 2763) >= 1 && gg.OwnItemCount(talker, 2764) >= 1 && gg.OwnItemCount(talker, 2765) >= 1 && gg.OwnItemCount(talker, 2766) >= 1 && gg.OwnItemCount(talker, 2767) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 222) == 1 && gg.OwnItemCount(talker, 2778) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 344) == 1 && gg.OwnItemCount(talker, 4271) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "1000 Years, the End of Lamentation (In Progress)");

}
if (gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 6) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "1000 Years, the End of Lamentation (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 222) == 0 && myself.GetOneTimeQuestFlag(talker, 222) == 0) {
myself.SetCurrentQuestID(222);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.occupation == 1 || talker.occupation == 47 || talker.occupation == 19 || talker.occupation == 32) {
if (talker.level >= 39) {
myself.ShowQuestPage(talker, "duelist_kaien_q0222_03.htm", 222);

} else {
myself.ShowPage(talker, "duelist_kaien_q0222_01.htm");

}

} else {
myself.ShowPage(talker, "duelist_kaien_q0222_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 222) == 0 && myself.GetOneTimeQuestFlag(talker, 222) == 1) {
myself.SetCurrentQuestID(222);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 222) == 1 && gg.OwnItemCount(talker, 2763) >= 1 && gg.OwnItemCount(talker, 2764) >= 1 && gg.OwnItemCount(talker, 2765) >= 1 && gg.OwnItemCount(talker, 2766) >= 1 && gg.OwnItemCount(talker, 2767) >= 1) {
myself.SetCurrentQuestID(222);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2768) == 10 && gg.OwnItemCount(talker, 2769) == 10 && gg.OwnItemCount(talker, 2770) == 10 && gg.OwnItemCount(talker, 2771) == 10 && gg.OwnItemCount(talker, 2772) == 10 && gg.OwnItemCount(talker, 2773) == 10 && gg.OwnItemCount(talker, 2774) == 10 && gg.OwnItemCount(talker, 2775) == 10 && gg.OwnItemCount(talker, 2776) == 10 && gg.OwnItemCount(talker, 2777) == 10) {
myself.ShowPage(talker, "duelist_kaien_q0222_13.htm");

} else {
myself.ShowPage(talker, "duelist_kaien_q0222_14.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 222) == 1 && gg.OwnItemCount(talker, 2778) == 1) {
myself.SetCurrentQuestID(222);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2779) >= 3 && gg.OwnItemCount(talker, 2780) >= 3 && gg.OwnItemCount(talker, 2783) >= 3 && gg.OwnItemCount(talker, 2781) >= 3 && gg.OwnItemCount(talker, 2782) >= 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 2779, gg.OwnItemCount(talker, 2779));
myself.DeleteItem1(talker, 2780, gg.OwnItemCount(talker, 2780));
myself.DeleteItem1(talker, 2781, gg.OwnItemCount(talker, 2781));
myself.DeleteItem1(talker, 2782, gg.OwnItemCount(talker, 2782));
myself.DeleteItem1(talker, 2783, gg.OwnItemCount(talker, 2783));
myself.IncrementParam(talker, 0, 894888);
myself.IncrementParam(talker, 1, 61408);
myself.GiveItem1(talker, 57, 161806);
myself.DeleteItem1(talker, 2778, 1);
myself.GiveItem1(talker, 2762, 1);
myself.ShowPage(talker, "duelist_kaien_q0222_18.htm");
myself.RemoveMemo(talker, 222);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 222, 1);
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
myself.ShowPage(talker, "duelist_kaien_q0222_17.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 1 && gg.OwnItemCount(talker, 4271) >= 1) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 <= 52) {
myself.GiveItem1(talker, 1874, 25);

} else if (i0 <= 76) {
myself.GiveItem1(talker, 1887, 10);

} else if (i0 <= 98) {
myself.GiveItem1(talker, 951, 1);

} else {
myself.GiveItem1(talker, 133, 1);

}
myself.DeleteItem1(talker, 4271, gg.OwnItemCount(talker, 4271));
myself.SetMemoState(talker, 344, 6);
myself.ShowPage(talker, "duelist_kaien_q0344_01.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 6) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "duelist_kaien_q0344_02.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 222) {
myself.SetCurrentQuestID(222);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 222) == 0 && myself.GetOneTimeQuestFlag(talker, 222) == 0 && myself.GetMemoCount(talker) < 41 && talker.occupation == 1 || talker.occupation == 47 || talker.occupation == 19 || talker.occupation == 32 && talker.level >= 39) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 222);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 2763, 1);
myself.GiveItem1(talker, 2764, 1);
myself.GiveItem1(talker, 2765, 1);
myself.GiveItem1(talker, 2766, 1);
myself.GiveItem1(talker, 2767, 1);
myself.SetMemoState(talker, 222, 1);
myself.SetFlagJournal(talker, 222, 1);
myself.ShowQuestMark(talker, 222);
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
myself.ShowQuestPage(talker, "duelist_kaien_q0222_07a.htm", 222);

} else {
myself.ShowQuestPage(talker, "duelist_kaien_q0222_07.htm", 222);

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 222) {
myself.SetCurrentQuestID(222);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 222) {
if (reply == 1) {
if (talker.race != 3) {
myself.ShowQuestPage(talker, "duelist_kaien_q0222_04.htm", 222);

} else {
myself.ShowQuestPage(talker, "duelist_kaien_q0222_05.htm", 222);

}

}
if (reply == 2) {
myself.FHTML_SetFileName(fhtml0, "duelist_kaien_q0222_06.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 222);
myself.ShowQuestFHTML(talker, fhtml0, 222);

}
if (reply == 3) {
myself.ShowPage(talker, "duelist_kaien_q0222_08.htm");
myself.SetFlagJournal(talker, 222, 2);
myself.ShowQuestMark(talker, 222);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
if (reply == 4) {
myself.ShowPage(talker, "duelist_kaien_q0222_09.htm");

}
if (reply == 5) {
myself.ShowPage(talker, "duelist_kaien_q0222_10.htm");

}
if (reply == 6) {
myself.ShowPage(talker, "duelist_kaien_q0222_11.htm");

}
if (reply == 7) {
myself.ShowPage(talker, "duelist_kaien_q0222_12.htm");

}
if (reply == 8) {
myself.ShowPage(talker, "duelist_kaien_q0222_07.htm");

}
if (reply == 9) {
myself.ShowPage(talker, "duelist_kaien_q0222_15.htm");

}
if (reply == 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "duelist_kaien_q0222_16.htm");
myself.DeleteItem1(talker, 2768, gg.OwnItemCount(talker, 2768));
myself.DeleteItem1(talker, 2769, gg.OwnItemCount(talker, 2769));
myself.DeleteItem1(talker, 2771, gg.OwnItemCount(talker, 2771));
myself.DeleteItem1(talker, 2770, gg.OwnItemCount(talker, 2770));
myself.DeleteItem1(talker, 2772, gg.OwnItemCount(talker, 2772));
myself.DeleteItem1(talker, 2773, gg.OwnItemCount(talker, 2773));
myself.DeleteItem1(talker, 2774, gg.OwnItemCount(talker, 2774));
myself.DeleteItem1(talker, 2775, gg.OwnItemCount(talker, 2775));
myself.DeleteItem1(talker, 2776, gg.OwnItemCount(talker, 2776));
myself.DeleteItem1(talker, 2777, gg.OwnItemCount(talker, 2777));
myself.DeleteItem1(talker, 2763, gg.OwnItemCount(talker, 2763));
myself.DeleteItem1(talker, 2764, gg.OwnItemCount(talker, 2764));
myself.DeleteItem1(talker, 2765, gg.OwnItemCount(talker, 2765));
myself.DeleteItem1(talker, 2766, gg.OwnItemCount(talker, 2766));
myself.DeleteItem1(talker, 2767, gg.OwnItemCount(talker, 2767));
myself.SetMemoState(talker, 222, 2);
myself.GiveItem1(talker, 2778, 1);
myself.SetFlagJournal(talker, 222, 4);
myself.ShowQuestMark(talker, 222);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}