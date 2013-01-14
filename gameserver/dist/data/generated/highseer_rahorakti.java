package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class highseer_rahorakti extends master_lv3_orc {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 77) == 0 && myself.GetOneTimeQuestFlag(talker, 77) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Dominator");

}
if (gg.HaveMemo(talker, 77) == 0 && myself.GetOneTimeQuestFlag(talker, 77) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Dominator (Done)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 15) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 16) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 0 && myself.GetOneTimeQuestFlag(talker, 78) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Doomcryer");

}
if (gg.HaveMemo(talker, 78) == 0 && myself.GetOneTimeQuestFlag(talker, 78) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Doomcryer (Done)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 15) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 16) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 11 * 10 + 1 && talker.subjob_id != 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 11 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) <= 12 * 10 + 2 && gg.GetMemoState(talker, 241) >= 12 * 10 + 1 && talker.subjob_id != 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) <= 12 * 10 + 2 && gg.GetMemoState(talker, 241) >= 12 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 13 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 13 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 0 && myself.GetOneTimeQuestFlag(talker, 77) == 0) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 51) {
myself.ShowQuestPage(talker, "highseer_rahorakti_q0077_0101.htm", 77);

} else {
myself.ShowQuestPage(talker, "highseer_rahorakti_q0077_0102.htm", 77);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 0 && myself.GetOneTimeQuestFlag(talker, 77) == 1) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 1) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highseer_rahorakti_q0077_0104.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 15) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highseer_rahorakti_q0077_0106.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 16) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 115);
myself.SetOneTimeQuestFlag(talker, 77, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 77);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "highseer_rahorakti_q0077_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "highseer_rahorakti_q0077_0110.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 0 && myself.GetOneTimeQuestFlag(talker, 78) == 0) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 52) {
myself.ShowQuestPage(talker, "highseer_rahorakti_q0078_0101.htm", 78);

} else {
myself.ShowQuestPage(talker, "highseer_rahorakti_q0078_0102.htm", 78);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 0 && myself.GetOneTimeQuestFlag(talker, 78) == 1) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 1) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highseer_rahorakti_q0078_0104.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 15) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highseer_rahorakti_q0078_0106.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 16) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 116);
myself.SetOneTimeQuestFlag(talker, 78, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 78);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "highseer_rahorakti_q0078_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "highseer_rahorakti_q0078_0110.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 11 * 10 + 1 && talker.subjob_id != 0) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 241, 11);
myself.ShowPage(talker, "highseer_rahorakti_q0241_1101.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 11 * 10 + 1) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quest_not_subclass001.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) <= 12 * 10 + 2 && gg.GetMemoState(talker, 241) >= 12 * 10 + 1 && talker.subjob_id != 0) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 241) == 12 * 10 + 2 && gg.OwnItemCount(talker, 7598) >= 5) {
myself.SetHTMLCookie(talker, 241, 12);
myself.ShowPage(talker, "highseer_rahorakti_q0241_1202.htm");

} else {
myself.ShowPage(talker, "highseer_rahorakti_q0241_1203.htm");

}

}
break;

}
case 13: {
if (_from_choice == 0 || talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) <= 12 * 10 + 2 && gg.GetMemoState(talker, 241) >= 12 * 10 + 1) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quest_not_subclass001.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 13 * 10 + 1) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highseer_rahorakti_q0241_1303.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 13 * 10 + 1) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quest_not_subclass001.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 77) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 77) == 0 && myself.GetOneTimeQuestFlag(talker, 77) == 0 && talker.level >= 76 && talker.occupation == 51) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7100, 1);
myself.SetMemo(talker, 77);
myself.ShowQuestMark(talker, 77);
myself.SetMemoState(talker, 77, 1);
myself.SetFlagJournal(talker, 77, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "highseer_rahorakti_q0077_0103.htm", 77);
gg.AddLog(1, talker, 77);

}

}
return;

}
if (quest_id == 78) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 78) == 0 && myself.GetOneTimeQuestFlag(talker, 78) == 0 && talker.level >= 76 && talker.occupation == 52) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7101, 1);
myself.SetMemo(talker, 78);
myself.ShowQuestMark(talker, 78);
myself.SetMemoState(talker, 78, 1);
myself.SetFlagJournal(talker, 78, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "highseer_rahorakti_q0078_0103.htm", 78);
gg.AddLog(1, talker, 78);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 77) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 77) {
if (reply == 1) {
if (gg.HaveMemo(talker, 77) == 0 && talker.occupation == 51 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 77) == 0) {
myself.FHTML_SetFileName(fhtml0, "highseer_rahorakti_q0077_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 77);
myself.ShowQuestFHTML(talker, fhtml0, 77);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7100, gg.OwnItemCount(talker, 7100));
myself.ClassChange(talker, 115);
myself.SetOneTimeQuestFlag(talker, 77, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 77);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "highseer_rahorakti_q0077_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 77, 16);
myself.SetFlagJournal(talker, 77, 20);
myself.ShowQuestMark(talker, 77);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7100, gg.OwnItemCount(talker, 7100));
myself.ShowPage(talker, "highseer_rahorakti_q0077_0108.htm");

}

}

}

}
if (ask == 78) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 78) {
if (reply == 1) {
if (gg.HaveMemo(talker, 78) == 0 && talker.occupation == 52 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 78) == 0) {
myself.FHTML_SetFileName(fhtml0, "highseer_rahorakti_q0078_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 78);
myself.ShowQuestFHTML(talker, fhtml0, 78);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7101, gg.OwnItemCount(talker, 7101));
myself.ClassChange(talker, 116);
myself.SetOneTimeQuestFlag(talker, 78, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 78);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "highseer_rahorakti_q0078_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 78, 16);
myself.SetFlagJournal(talker, 78, 20);
myself.ShowQuestMark(talker, 78);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7101, gg.OwnItemCount(talker, 7101));
myself.ShowPage(talker, "highseer_rahorakti_q0078_0108.htm");

}

}

}

}
if (ask == 241) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 241) {
i0 = myself.GetHTMLCookie(talker, 241, 12 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 241) == 1 && talker.subjob_id != 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "highseer_rahorakti_q0241_1201.htm");
myself.SetMemoState(talker, 241, 12 * 10 + 1);
myself.SetFlagJournal(talker, 241, 14);
myself.ShowQuestMark(talker, 241);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 241) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 241) {
i0 = myself.GetHTMLCookie(talker, 241, 13 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 241) == 1 && talker.subjob_id != 0) {
if (gg.OwnItemCount(talker, 7598) >= 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7598, 5);
myself.GiveItem1(talker, 7599, 1);
myself.ShowPage(talker, "highseer_rahorakti_q0241_1301.htm");
myself.SetMemoState(talker, 241, 13 * 10 + 1);
myself.SetFlagJournal(talker, 241, 16);
myself.ShowQuestMark(talker, 241);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "highseer_rahorakti_q0241_1302.htm");

}

}

}

}
super;
	}


}