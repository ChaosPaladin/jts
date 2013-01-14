package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class beast_herder_tunatun extends ai_beastfarm_quest {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 8) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 10) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && gg.GetMemoState(talker, 73) == 3 && gg.OwnItemCount(talker, 7546) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && gg.GetMemoState(talker, 73) == 3 && gg.OwnItemCount(talker, 7546) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 20) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Bring Up With Love");

}
if (gg.HaveMemo(talker, 20) == 0 && talker.level < 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Bring Up With Love");

}
if (gg.HaveMemo(talker, 20) == 1 && gg.GetMemoState(talker, 20) == 1 && gg.OwnItemCount(talker, 15533) == 0 && gg.OwnItemCount(talker, 7185) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Bring Up With Love (In Progress)");

}
if (gg.HaveMemo(talker, 20) == 1 && gg.GetMemoState(talker, 20) == 1 && gg.OwnItemCount(talker, 15533) >= 1 || gg.OwnItemCount(talker, 7185) >= 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Bring Up With Love (In Progress)");

}
if (gg.HaveMemo(talker, 631) == 0 && talker.level >= 82) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Delicious Top Choice Meat");

}
if (gg.HaveMemo(talker, 631) == 1 && gg.GetMemoState(talker, 631) == 2 && gg.OwnItemCount(talker, 15534) >= 120) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Delicious Top Choice Meat (In Progress)");

}
if (gg.HaveMemo(talker, 631) == 1 && gg.OwnItemCount(talker, 15534) < 120) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Delicious Top Choice Meat (In Progress)");

}
if (gg.HaveMemo(talker, 278) == 0 && talker.level >= 82) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Home Security");

}
if (gg.HaveMemo(talker, 278) == 1 && gg.GetMemoState(talker, 278) == 2 && gg.OwnItemCount(talker, 15531) >= 300) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Home Security (In progress)");

}
if (gg.HaveMemo(talker, 278) == 1 && gg.GetMemoState(talker, 278) == 1 || gg.OwnItemCount(talker, 15531) < 300) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Home Security (In progress)");

}
if (gg.HaveMemo(talker, 19) == 1 && myself.GetOneTimeQuestFlag(talker, 19) == 0 && gg.GetMemoState(talker, 19) > 0) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Go to the Pastureland (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 8) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "beast_herder_tunatun_q0072_0121.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "beast_herder_tunatun_q0072_0124.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "beast_herder_tunatun_q0072_0125.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 10) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "beast_herder_tunatun_q0072_0126.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && gg.GetMemoState(talker, 73) == 3 && gg.OwnItemCount(talker, 7546) == 0) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 7546, 1);
myself.ShowPage(talker, "beast_herder_tunatun_q0073_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && gg.GetMemoState(talker, 73) == 3 && gg.OwnItemCount(talker, 7546) >= 1) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "beast_herder_tunatun_q0073_02.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 20) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
myself.SetCurrentQuestID(20);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "beast_herder_tunatun_q0020_01.htm", 20);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 20) == 0 && talker.level < 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
myself.SetCurrentQuestID(20);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "beast_herder_tunatun_q0020_02.htm", 20);

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 20) == 1 && gg.GetMemoState(talker, 20) == 1 && gg.OwnItemCount(talker, 15533) == 0 && gg.OwnItemCount(talker, 7185) == 0) {
myself.SetCurrentQuestID(20);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "beast_herder_tunatun_q0020_15.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 20) == 1 && gg.GetMemoState(talker, 20) == 1 && gg.OwnItemCount(talker, 15533) >= 1 || gg.OwnItemCount(talker, 7185) >= 1) {
myself.SetCurrentQuestID(20);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "beast_herder_tunatun_q0020_16.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 631) == 0 && talker.level >= 82) {
myself.SetCurrentQuestID(631);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "beast_herder_tunatun_q0631_101n.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 631);
myself.ShowQuestFHTML(talker, fhtml0, 631);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 631) == 1 && gg.GetMemoState(talker, 631) == 2 && gg.OwnItemCount(talker, 15534) >= 120) {
myself.SetCurrentQuestID(631);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "beast_herder_tunatun_q0631_105n.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 631) == 1 && gg.OwnItemCount(talker, 15534) < 120) {
myself.SetCurrentQuestID(631);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "beast_herder_tunatun_q0631_106n.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 278) == 0 && talker.level >= 82) {
myself.SetCurrentQuestID(278);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "beast_herder_tunatun_q0278_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 278);
myself.ShowQuestFHTML(talker, fhtml0, 278);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 278) == 1 && gg.GetMemoState(talker, 278) == 2 && gg.OwnItemCount(talker, 15531) >= 300) {
myself.SetCurrentQuestID(278);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "beast_herder_tunatun_q0278_05.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 278) == 1 && gg.GetMemoState(talker, 278) == 1 || gg.OwnItemCount(talker, 15531) < 300) {
myself.SetCurrentQuestID(278);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "beast_herder_tunatun_q0278_06.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 19) == 1 && myself.GetOneTimeQuestFlag(talker, 19) == 0 && gg.GetMemoState(talker, 19) > 0) {
myself.SetCurrentQuestID(19);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 19, 1);
myself.ShowPage(talker, "beast_herder_tunatun_q0019_0101.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 20) {
myself.SetCurrentQuestID(20);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 20) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 20);
myself.SetMemoState(talker, 20, 1);
myself.SetMemoStateEx(talker, 20, 1, 1);
myself.ShowQuestPage(talker, "beast_herder_tunatun_q0020_14.htm", 20);
myself.SetFlagJournal(talker, 20, 1);
myself.ShowQuestMark(talker, 20);

}

}
return;

}
if (quest_id == 631) {
myself.SetCurrentQuestID(631);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 631) == 0 && talker.level >= 82) {
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 631);
myself.SetMemoState(talker, 631, 1);
myself.ShowPage(talker, "beast_herder_tunatun_q0631_104n.htm");
myself.SetFlagJournal(talker, 631, 1);
myself.ShowQuestMark(talker, 631);

} else if (gg.HaveMemo(talker, 631) == 0 && talker.level < 82) {
myself.ShowQuestPage(talker, "beast_herder_tunatun_q0631_103n.htm", 631);

}

}
return;

}
if (quest_id == 278) {
myself.SetCurrentQuestID(278);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 278) == 0 && talker.level >= 82) {
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 278);
myself.SetMemoState(talker, 278, 1);
myself.ShowQuestPage(talker, "beast_herder_tunatun_q0278_04.htm", 278);
myself.SetFlagJournal(talker, 278, 1);
myself.ShowQuestMark(talker, 278);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 72) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 72) {
if (reply == 5) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 8) {
myself.ShowPage(talker, "beast_herder_tunatun_q0072_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 8) {
myself.SetMemoState(talker, 72, 9);
myself.ShowPage(talker, "beast_herder_tunatun_q0072_0122.htm");
myself.SetFlagJournal(talker, 72, 11);
myself.ShowQuestMark(talker, 72);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 8) {
myself.SetMemoState(talker, 72, 9);
myself.ShowPage(talker, "beast_herder_tunatun_q0072_0123.htm");
myself.SetFlagJournal(talker, 72, 12);
myself.ShowQuestMark(talker, 72);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7363, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 72, 10);
myself.ShowPage(talker, "beast_herder_tunatun_q0072_0128.htm");
myself.SetFlagJournal(talker, 72, 13);
myself.ShowQuestMark(talker, 72);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 20) {
myself.SetCurrentQuestID(20);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 20) {
if (reply == 1 && gg.HaveMemo(talker, 20) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
myself.ShowPage(talker, "beast_herder_tunatun_q0020_03.htm");

}
if (reply == 12 && gg.HaveMemo(talker, 20) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
myself.ShowPage(talker, "beast_herder_tunatun_q0020_06.htm");

}
if (reply == 13 && gg.HaveMemo(talker, 20) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
myself.ShowPage(talker, "beast_herder_tunatun_q0020_07.htm");

}
if (reply == 14 && gg.HaveMemo(talker, 20) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
myself.ShowPage(talker, "beast_herder_tunatun_q0020_08.htm");

}
if (reply == 11 && gg.HaveMemo(talker, 20) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
myself.ShowPage(talker, "beast_herder_tunatun_q0020_09.htm");

}
if (reply == 4 && gg.HaveMemo(talker, 20) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
myself.ShowPage(talker, "beast_herder_tunatun_q0020_10.htm");

}
if (reply == 3 && gg.HaveMemo(talker, 20) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
myself.ShowPage(talker, "beast_herder_tunatun_q0020_11.htm");

}
if (reply == 7 && gg.HaveMemo(talker, 20) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
myself.ShowPage(talker, "beast_herder_tunatun_q0020_12.htm");

}
if (reply == 2) {
if (gg.HaveMemo(talker, 20) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
if (gg.OwnItemCount(talker, 15473) < 1) {
myself.GiveItem1(talker, 15473, 1);
myself.ShowPage(talker, "beast_herder_tunatun_q0020_04.htm");

} else {
myself.ShowPage(talker, "beast_herder_tunatun_q0020_05.htm");

}

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 20) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 20) == 0) {
myself.FHTML_SetFileName(fhtml0, "beast_herder_tunatun_q0020_13.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 20);
myself.ShowQuestFHTML(talker, fhtml0, 20);

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 20) == 1 && gg.GetMemoState(talker, 20) == 1 && gg.OwnItemCount(talker, 15533) >= 1 || gg.OwnItemCount(talker, 7185) >= 1) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 9553, 1);
myself.DeleteItem1(talker, 7185, gg.OwnItemCount(talker, 7185));
myself.DeleteItem1(talker, 15533, gg.OwnItemCount(talker, 15533));
myself.RemoveMemo(talker, 20);
myself.SetOneTimeQuestFlag(talker, 20, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 20);
gg.AddLog(3, talker, 20);
myself.ShowPage(talker, "beast_herder_tunatun_q0020_17.htm");

}

}

}

}
if (ask == 631) {
myself.SetCurrentQuestID(631);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 631) {
if (reply == 3) {
if (gg.HaveMemo(talker, 631) == 1 && gg.GetMemoState(talker, 631) == 2 && gg.OwnItemCount(talker, 15534) >= 120) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
i0 = gg.Rand(10);
if (i0 == 0) {
i1 = gg.Rand(9);
switch (i1) {
case 0: {
myself.GiveItem1(talker, 10373, 1);
break;

}
case 1: {
myself.GiveItem1(talker, 10374, 1);
break;

}
case 2: {
myself.GiveItem1(talker, 10375, 1);
break;

}
case 3: {
myself.GiveItem1(talker, 10376, 1);
break;

}
case 4: {
myself.GiveItem1(talker, 10377, 1);
break;

}
case 5: {
myself.GiveItem1(talker, 10378, 1);
break;

}
case 6: {
myself.GiveItem1(talker, 10379, 1);
break;

}
case 7: {
myself.GiveItem1(talker, 10380, 1);
break;

}
case 8: {
myself.GiveItem1(talker, 10381, 1);
break;

}

}

} else if (i0 == 1) {
i1 = gg.Rand(9);
switch (i1) {
case 0: {
myself.GiveItem1(talker, 10397, 1);
break;

}
case 1: {
myself.GiveItem1(talker, 10398, 1);
break;

}
case 2: {
myself.GiveItem1(talker, 10399, 1);
break;

}
case 3: {
myself.GiveItem1(talker, 10400, 1);
break;

}
case 4: {
myself.GiveItem1(talker, 10401, 1);
break;

}
case 5: {
myself.GiveItem1(talker, 10402, 1);
break;

}
case 6: {
myself.GiveItem1(talker, 10403, 1);
break;

}
case 7: {
myself.GiveItem1(talker, 10404, 1);
break;

}
case 8: {
myself.GiveItem1(talker, 10405, 1);
break;

}

}

} else if (i0 == 2) {
i1 = gg.Rand(9);
switch (i1) {
case 0: {
myself.GiveItem1(talker, 10397, 2);
break;

}
case 1: {
myself.GiveItem1(talker, 10398, 2);
break;

}
case 2: {
myself.GiveItem1(talker, 10399, 2);
break;

}
case 3: {
myself.GiveItem1(talker, 10400, 2);
break;

}
case 4: {
myself.GiveItem1(talker, 10401, 2);
break;

}
case 5: {
myself.GiveItem1(talker, 10402, 2);
break;

}
case 6: {
myself.GiveItem1(talker, 10403, 2);
break;

}
case 7: {
myself.GiveItem1(talker, 10404, 2);
break;

}
case 8: {
myself.GiveItem1(talker, 10405, 2);
break;

}

}

} else if (i0 == 3) {
i1 = gg.Rand(9);
switch (i1) {
case 0: {
myself.GiveItem1(talker, 10397, 3);
break;

}
case 1: {
myself.GiveItem1(talker, 10398, 3);
break;

}
case 2: {
myself.GiveItem1(talker, 10399, 3);
break;

}
case 3: {
myself.GiveItem1(talker, 10400, 3);
break;

}
case 4: {
myself.GiveItem1(talker, 10401, 3);
break;

}
case 5: {
myself.GiveItem1(talker, 10402, 3);
break;

}
case 6: {
myself.GiveItem1(talker, 10403, 3);
break;

}
case 7: {
myself.GiveItem1(talker, 10404, 3);
break;

}
case 8: {
myself.GiveItem1(talker, 10405, 3);
break;

}

}

} else if (i0 == 4) {
i1 = gg.Rand(9);
switch (i1) {
case 0: {
myself.GiveItem1(talker, 10397, gg.Rand(5) + 2);
break;

}
case 1: {
myself.GiveItem1(talker, 10398, gg.Rand(5) + 2);
break;

}
case 2: {
myself.GiveItem1(talker, 10399, gg.Rand(5) + 2);
break;

}
case 3: {
myself.GiveItem1(talker, 10400, gg.Rand(5) + 2);
break;

}
case 4: {
myself.GiveItem1(talker, 10401, gg.Rand(5) + 2);
break;

}
case 5: {
myself.GiveItem1(talker, 10402, gg.Rand(5) + 2);
break;

}
case 6: {
myself.GiveItem1(talker, 10403, gg.Rand(5) + 2);
break;

}
case 7: {
myself.GiveItem1(talker, 10404, gg.Rand(5) + 2);
break;

}
case 8: {
myself.GiveItem1(talker, 10405, gg.Rand(5) + 2);
break;

}

}

} else if (i0 == 5) {
i1 = gg.Rand(9);
switch (i1) {
case 0: {
myself.GiveItem1(talker, 10397, gg.Rand(7) + 2);
break;

}
case 1: {
myself.GiveItem1(talker, 10398, gg.Rand(7) + 2);
break;

}
case 2: {
myself.GiveItem1(talker, 10399, gg.Rand(7) + 2);
break;

}
case 3: {
myself.GiveItem1(talker, 10400, gg.Rand(7) + 2);
break;

}
case 4: {
myself.GiveItem1(talker, 10401, gg.Rand(7) + 2);
break;

}
case 5: {
myself.GiveItem1(talker, 10402, gg.Rand(7) + 2);
break;

}
case 6: {
myself.GiveItem1(talker, 10403, gg.Rand(7) + 2);
break;

}
case 7: {
myself.GiveItem1(talker, 10404, gg.Rand(7) + 2);
break;

}
case 8: {
myself.GiveItem1(talker, 10405, gg.Rand(7) + 2);
break;

}

}

} else if (i0 == 6) {
myself.GiveItem1(talker, 15482, 1);

} else if (i0 == 7) {
myself.GiveItem1(talker, 15482, 2);

} else if (i0 == 8) {
myself.GiveItem1(talker, 15483, 1);

} else if (i0 == 9) {
myself.GiveItem1(talker, 15483, 2);

}
myself.DeleteItem1(talker, 15534, gg.OwnItemCount(talker, 15534));
myself.RemoveMemo(talker, 631);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 631);
gg.AddLog(3, talker, 631);
myself.ShowPage(talker, "beast_herder_tunatun_q0631_202n.htm");

}

}

}

}
if (ask == 278) {
myself.SetCurrentQuestID(278);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 278) {
if (reply == 1) {
if (gg.HaveMemo(talker, 278) == 0 && talker.level >= 82) {
myself.FHTML_SetFileName(fhtml0, "beast_herder_tunatun_q0278_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 278);
myself.ShowQuestFHTML(talker, fhtml0, 278);

} else if (gg.HaveMemo(talker, 278) == 0 && talker.level < 82) {
myself.ShowPage(talker, "beast_herder_tunatun_q0278_03.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 278) == 1 && gg.GetMemoState(talker, 278) == 2 && gg.OwnItemCount(talker, 15531) >= 300) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
i0 = gg.Rand(100);
if (i0 < 10) {
myself.GiveItem1(talker, 960, 1);

} else if (i0 < 19) {
myself.GiveItem1(talker, 960, 2);

} else if (i0 < 27) {
myself.GiveItem1(talker, 960, 3);

} else if (i0 < 34) {
myself.GiveItem1(talker, 960, 4);

} else if (i0 < 40) {
myself.GiveItem1(talker, 960, 5);

} else if (i0 < 45) {
myself.GiveItem1(talker, 960, 6);

} else if (i0 < 49) {
myself.GiveItem1(talker, 960, 7);

} else if (i0 < 52) {
myself.GiveItem1(talker, 960, 8);

} else if (i0 < 54) {
myself.GiveItem1(talker, 960, 9);

} else if (i0 < 55) {
myself.GiveItem1(talker, 960, 10);

} else if (i0 < 75) {
myself.GiveItem1(talker, 9553, 1);

} else if (i0 < 90) {
myself.GiveItem1(talker, 9553, 2);

} else {
myself.GiveItem1(talker, 959, 1);

}
myself.DeleteItem1(talker, 15531, gg.OwnItemCount(talker, 15531));
myself.RemoveMemo(talker, 278);
myself.SetOneTimeQuestFlag(talker, 278, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 278);
gg.AddLog(3, talker, 278);
myself.ShowPage(talker, "beast_herder_tunatun_q0278_07.htm");

}

}

}

}
if (ask == 19) {
myself.SetCurrentQuestID(19);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 19 && myself.GetOneTimeQuestFlag(talker, 19) == 0) {
i0 = myself.GetHTMLCookie(talker, 19, 2 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 19) == 1 && myself.GetOneTimeQuestFlag(talker, 19) == 0) {
if (gg.OwnItemCount(talker, 7547) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7547, 1);
myself.GiveItem1(talker, 57, 50000);
myself.IncrementParam(talker, 0, 136766);
myself.IncrementParam(talker, 1, 12688);

}
gg.AddLog(2, talker, 19);
gg.AddLog(3, talker, 19);
myself.RemoveMemo(talker, 19);
myself.SetOneTimeQuestFlag(talker, 19, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "beast_herder_tunatun_q0019_0201.htm");

} else if (gg.OwnItemCount(talker, 15532) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 15532, 1);
myself.GiveItem1(talker, 57, 147200);
myself.IncrementParam(talker, 0, 385040);
myself.IncrementParam(talker, 1, 75250);

}
gg.AddLog(2, talker, 19);
gg.AddLog(3, talker, 19);
myself.RemoveMemo(talker, 19);
myself.SetOneTimeQuestFlag(talker, 19, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "beast_herder_tunatun_q0019_0201.htm");

} else {
myself.ShowPage(talker, "beast_herder_tunatun_q0019_0202.htm");

}

}

}

}
super;
	}


}