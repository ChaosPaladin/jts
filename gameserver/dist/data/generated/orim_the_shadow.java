package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class orim_the_shadow extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 229) == 0 && myself.GetOneTimeQuestFlag(talker, 229) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of Witchcraft");

}
if (gg.HaveMemo(talker, 229) == 0 && myself.GetOneTimeQuestFlag(talker, 229) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of Witchcraft (Done)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3308) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3309) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3323) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3324) == 1 && gg.OwnItemCount(talker, 3029) == 0 && gg.OwnItemCount(talker, 3332) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3029) >= 1 && gg.OwnItemCount(talker, 3332) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3029) >= 1 && gg.OwnItemCount(talker, 3334) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2883) == 0 && gg.OwnItemCount(talker, 2887) == 0 && gg.OwnItemCount(talker, 2911) == 0 && gg.OwnItemCount(talker, 2880) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Test of the War Spirit (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2883) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Test of the War Spirit (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2883) == 0 && gg.OwnItemCount(talker, 2887) >= 1 || gg.OwnItemCount(talker, 2911) >= 1 || gg.OwnItemCount(talker, 2880) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Test of the War Spirit (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 0 && myself.GetOneTimeQuestFlag(talker, 229) == 0) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.occupation == 11 || talker.occupation == 4 || talker.occupation == 32) {
if (talker.level < 39) {
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_02.htm", 229);

} else if (talker.occupation == 11) {
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_03.htm", 229);

} else {
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_05.htm", 229);

}

} else {
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_01.htm", 229);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 0 && myself.GetOneTimeQuestFlag(talker, 229) == 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "finishedquest.htm", 229);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3308) == 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_09.htm", 229);

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3309) == 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3317) >= 1 && gg.OwnItemCount(talker, 3318) >= 1 && gg.OwnItemCount(talker, 3319) >= 1 && gg.OwnItemCount(talker, 3320) >= 1 && gg.OwnItemCount(talker, 3321) >= 1 && gg.OwnItemCount(talker, 3322) >= 1) {
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_11.htm", 229);

} else {
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_10.htm", 229);

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3323) == 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_15.htm", 229);

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3324) == 1 && gg.OwnItemCount(talker, 3029) == 0 && gg.OwnItemCount(talker, 3332) == 0) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_17.htm", 229);

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3029) >= 1 && gg.OwnItemCount(talker, 3332) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_18.htm", 229);
myself.SetFlagJournal(talker, 229, 8);
myself.ShowQuestMark(talker, 229);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3029) >= 1 && gg.OwnItemCount(talker, 3334) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_19.htm", 229);

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2883) == 0 && gg.OwnItemCount(talker, 2887) == 0 && gg.OwnItemCount(talker, 2911) == 0 && gg.OwnItemCount(talker, 2880) == 0) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "orim_the_shadow_q0233_01.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2883) == 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2884) + gg.OwnItemCount(talker, 2885) + gg.OwnItemCount(talker, 2886) < 30) {
myself.ShowPage(talker, "orim_the_shadow_q0233_05.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "orim_the_shadow_q0233_06.htm");
myself.DeleteItem1(talker, 2883, gg.OwnItemCount(talker, 2883));
myself.DeleteItem1(talker, 2884, gg.OwnItemCount(talker, 2884));
myself.DeleteItem1(talker, 2885, gg.OwnItemCount(talker, 2885));
myself.DeleteItem1(talker, 2886, gg.OwnItemCount(talker, 2886));
myself.GiveItem1(talker, 2887, 1);
myself.SetFlagJournal(talker, 233, 2);
myself.ShowQuestMark(talker, 233);

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2883) == 0 && gg.OwnItemCount(talker, 2887) >= 1 || gg.OwnItemCount(talker, 2911) >= 1 || gg.OwnItemCount(talker, 2880) >= 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "orim_the_shadow_q0233_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 229) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 229) == 0 && myself.GetOneTimeQuestFlag(talker, 229) == 0 && myself.GetMemoCount(talker) < 41 && talker.occupation == 11 || talker.occupation == 4 || talker.occupation == 32 && talker.level >= 39) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 3308, 1);
myself.SetFlagJournal(talker, 229, 1);
myself.ShowQuestMark(talker, 229);
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
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_08a.htm", 229);

} else {
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_08.htm", 229);

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 229) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 229) {
if (reply == 1) {
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_04.htm", 229);

}
if (reply == 2) {
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_06.htm", 229);

}
if (reply == 3) {
myself.FHTML_SetFileName(fhtml0, "orim_the_shadow_q0229_07.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 229);
myself.ShowQuestFHTML(talker, fhtml0, 229);

}
if (reply == 4) {
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_12.htm", 229);

}
if (reply == 5) {
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_13.htm", 229);

}
if (reply == 6) {
if (gg.OwnItemCount(talker, 3309) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_14.htm", 229);
myself.DeleteItem1(talker, 3309, 1);
myself.GiveItem1(talker, 3323, 1);
myself.DeleteItem1(talker, 3317, gg.OwnItemCount(talker, 3317));
myself.DeleteItem1(talker, 3318, gg.OwnItemCount(talker, 3318));
myself.DeleteItem1(talker, 3319, gg.OwnItemCount(talker, 3319));
myself.DeleteItem1(talker, 3320, gg.OwnItemCount(talker, 3320));
myself.DeleteItem1(talker, 3321, gg.OwnItemCount(talker, 3321));
myself.DeleteItem1(talker, 3322, gg.OwnItemCount(talker, 3322));
myself.CreateOnePrivate(1027101, "drevanul_prince_zeruel", 0, 1);
myself.SetFlagJournal(talker, 229, 4);
myself.ShowQuestMark(talker, 229);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (reply == 7) {
if (gg.OwnItemCount(talker, 3323) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_16.htm", 229);
myself.DeleteItem1(talker, 3323, 1);
myself.GiveItem1(talker, 3324, 1);
myself.GiveItem1(talker, 3325, 1);
myself.GiveItem1(talker, 3326, 1);
myself.SetFlagJournal(talker, 229, 6);
myself.ShowQuestMark(talker, 229);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (reply == 8) {
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_20.htm", 229);

}
if (reply == 9) {
myself.ShowQuestPage(talker, "orim_the_shadow_q0229_21.htm", 229);

}
if (reply == 10) {
if (gg.OwnItemCount(talker, 3334) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 3333, gg.OwnItemCount(talker, 3333));
myself.DeleteItem1(talker, 3029, gg.OwnItemCount(talker, 3029));
myself.DeleteItem1(talker, 3331, gg.OwnItemCount(talker, 3331));
myself.DeleteItem1(talker, 3324, gg.OwnItemCount(talker, 3324));
myself.IncrementParam(talker, 0, 2058244);
myself.IncrementParam(talker, 1, 141240);
myself.GiveItem1(talker, 57, 372154);
myself.DeleteItem1(talker, 3334, 1);
myself.GiveItem1(talker, 3307, 1);
myself.ShowPage(talker, "orim_the_shadow_q0229_22.htm");
myself.RemoveMemo(talker, 229);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 229, 1);
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

}
if (ask == 233) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 233) {
if (reply == 1) {
myself.ShowPage(talker, "orim_the_shadow_q0233_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "orim_the_shadow_q0233_03.htm");

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "orim_the_shadow_q0233_04.htm");
myself.GiveItem1(talker, 2883, 1);

}

}

}
super;
	}


}