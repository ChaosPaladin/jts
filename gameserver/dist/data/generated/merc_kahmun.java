package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class merc_kahmun extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 628) == 0 && talker.level >= 66) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hunt of the Golden Ram Mercenary Force");

}
if (gg.HaveMemo(talker, 628) == 0 && talker.level < 66) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Hunt of the Golden Ram Mercenary Force");

}
if (gg.HaveMemo(talker, 628) == 1 && gg.OwnItemCount(talker, 7246) < 1 && gg.OwnItemCount(talker, 7247) < 1 && gg.OwnItemCount(talker, 7248) < 100) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Hunt of the Golden Ram Mercenary Force (In Progress)");

}
if (gg.HaveMemo(talker, 628) == 1 && gg.OwnItemCount(talker, 7246) < 1 && gg.OwnItemCount(talker, 7247) < 1 && gg.OwnItemCount(talker, 7248) >= 100) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Hunt of the Golden Ram Mercenary Force (In Progress)");

}
if (gg.HaveMemo(talker, 628) == 1 && gg.OwnItemCount(talker, 7246) >= 1 && gg.OwnItemCount(talker, 7247) < 1 && gg.OwnItemCount(talker, 7248) < 100 || gg.OwnItemCount(talker, 7249) < 100) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Hunt of the Golden Ram Mercenary Force (In Progress)");

}
if (gg.HaveMemo(talker, 628) == 1 && gg.OwnItemCount(talker, 7246) >= 1 && gg.OwnItemCount(talker, 7247) < 1 && gg.OwnItemCount(talker, 7248) >= 100 && gg.OwnItemCount(talker, 7249) >= 100) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Hunt of the Golden Ram Mercenary Force (In Progress)");

}
if (gg.HaveMemo(talker, 628) == 1 && gg.OwnItemCount(talker, 7247) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Hunt of the Golden Ram Mercenary Force (In Progress)");

}
if (gg.HaveMemo(talker, 640) == 1 && gg.GetMemoState(talker, 640) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "The Zero Hour (In Progress)");

}
if (talker.level >= 81 && gg.HaveMemo(talker, 146) == 0 && myself.GetOneTimeQuestFlag(talker, 146) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "The Zero Hour");

}
if (talker.level >= 81 && gg.HaveMemo(talker, 146) == 0 && myself.GetOneTimeQuestFlag(talker, 146) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "The Zero Hour (Done)");

}
if (talker.level < 81 && gg.HaveMemo(talker, 146) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "The Zero Hour");

}
if (gg.HaveMemo(talker, 146) == 1 && gg.GetMemoState(talker, 146) == 2 && gg.OwnItemCount(talker, 14859) >= 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "The Zero Hour (In Progress)");

}
if (gg.HaveMemo(talker, 146) == 1 && gg.GetMemoState(talker, 146) == 1 && gg.OwnItemCount(talker, 14859) < 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "The Zero Hour (In Progress)");

}
if (gg.HaveMemo(talker, 109) == 1 && gg.GetMemoState(talker, 109) > 30 && myself.GetOneTimeQuestFlag(talker, 109) == 0) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "In Search of the Nest (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 628) == 0 && talker.level >= 66) {
myself.SetCurrentQuestID(628);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "merc_kahmun_q0628_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 628);
myself.ShowQuestFHTML(talker, fhtml0, 628);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 628) == 0 && talker.level < 66) {
myself.SetCurrentQuestID(628);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "merc_kahmun_q0628_02.htm", 628);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 628) == 1 && gg.OwnItemCount(talker, 7246) < 1 && gg.OwnItemCount(talker, 7247) < 1 && gg.OwnItemCount(talker, 7248) < 100) {
myself.SetCurrentQuestID(628);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "merc_kahmun_q0628_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 628) == 1 && gg.OwnItemCount(talker, 7246) < 1 && gg.OwnItemCount(talker, 7247) < 1 && gg.OwnItemCount(talker, 7248) >= 100) {
myself.SetCurrentQuestID(628);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "merc_kahmun_q0628_07.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 628) == 1 && gg.OwnItemCount(talker, 7246) >= 1 && gg.OwnItemCount(talker, 7247) < 1 && gg.OwnItemCount(talker, 7248) < 100 || gg.OwnItemCount(talker, 7249) < 100) {
myself.SetCurrentQuestID(628);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "merc_kahmun_q0628_09.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 628) == 1 && gg.OwnItemCount(talker, 7246) >= 1 && gg.OwnItemCount(talker, 7247) < 1 && gg.OwnItemCount(talker, 7248) >= 100 && gg.OwnItemCount(talker, 7249) >= 100) {
myself.SetCurrentQuestID(628);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7247, 1);
myself.DeleteItem1(talker, 7246, gg.OwnItemCount(talker, 7246));
myself.DeleteItem1(talker, 7248, gg.OwnItemCount(talker, 7248));
myself.DeleteItem1(talker, 7249, gg.OwnItemCount(talker, 7249));
myself.ShowPage(talker, "merc_kahmun_q0628_10.htm");
myself.SetFlagJournal(talker, 628, 3);
myself.ShowQuestMark(talker, 628);
myself.SoundEffect(talker, "ItemSound.quest_middle");
gg.AddLog(3, talker, 628);

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 628) == 1 && gg.OwnItemCount(talker, 7247) >= 1) {
myself.SetCurrentQuestID(628);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "merc_kahmun_q0628_11.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 640) == 1 && gg.GetMemoState(talker, 640) == 1 * 10 + 1) {
myself.SetCurrentQuestID(640);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 8085) == 0) {
myself.ShowPage(talker, "merc_kahmun_q0640_0106.htm");

} else {
myself.SetHTMLCookie(talker, 640, 1);
myself.ShowPage(talker, "merc_kahmun_q0640_0105.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || talker.level >= 81 && gg.HaveMemo(talker, 146) == 0 && myself.GetOneTimeQuestFlag(talker, 146) == 0) {
myself.SetCurrentQuestID(146);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.GetOneTimeQuestFlag(talker, 109) == 1) {
myself.FHTML_SetFileName(fhtml0, "merc_kahmun_q0640_101a.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 146);
myself.ShowQuestFHTML(talker, fhtml0, 146);

} else {
myself.ShowPage(talker, "merc_kahmun_q0640_104a.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 9: {
if (_from_choice == 0 || talker.level >= 81 && gg.HaveMemo(talker, 146) == 0 && myself.GetOneTimeQuestFlag(talker, 146) == 1) {
myself.SetCurrentQuestID(146);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "merc_kahmun_q0640_101b.htm", 146);

}
break;

}
case 10: {
if (_from_choice == 0 || talker.level < 81 && gg.HaveMemo(talker, 146) == 0) {
myself.SetCurrentQuestID(146);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "merc_kahmun_q0640_102a.htm", 146);

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 146) == 1 && gg.GetMemoState(talker, 146) == 2 && gg.OwnItemCount(talker, 14859) >= 1) {
myself.SetCurrentQuestID(146);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 14849, 1);
myself.IncrementParam(talker, 0, 154616);
myself.IncrementParam(talker, 1, 12500);
myself.DeleteItem1(talker, 14859, gg.OwnItemCount(talker, 14859));
myself.RemoveMemo(talker, 146);
myself.SetOneTimeQuestFlag(talker, 146, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 146);
gg.AddLog(3, talker, 146);
myself.ShowPage(talker, "merc_kahmun_q0640_105a.htm");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 146) == 1 && gg.GetMemoState(talker, 146) == 1 && gg.OwnItemCount(talker, 14859) < 1) {
myself.SetCurrentQuestID(146);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "merc_kahmun_q0640_106a.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 109) == 1 && gg.GetMemoState(talker, 109) > 30 && myself.GetOneTimeQuestFlag(talker, 109) == 0) {
myself.SetCurrentQuestID(109);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 109, 3);
myself.ShowPage(talker, "merc_kahmun_q0109_0301.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 628) {
myself.SetCurrentQuestID(628);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 628) == 0 && gg.OwnItemCount(talker, 7246) < 1 && gg.OwnItemCount(talker, 7247) < 1) {
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 628);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 628, 1);
myself.ShowQuestPage(talker, "merc_kahmun_q0628_03.htm", 628);

} else if (gg.HaveMemo(talker, 628) == 0 && gg.OwnItemCount(talker, 7246) >= 1 && gg.OwnItemCount(talker, 7247) < 1) {
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 628);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 628, 2);
myself.ShowQuestMark(talker, 628);
myself.ShowQuestPage(talker, "merc_kahmun_q0628_04.htm", 628);

} else if (gg.HaveMemo(talker, 628) == 0 && gg.OwnItemCount(talker, 7247) >= 1) {
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 628);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "merc_kahmun_q0628_05.htm", 628);
myself.SetFlagJournal(talker, 628, 3);
myself.ShowQuestMark(talker, 628);

}
gg.AddLog(1, talker, quest_id);
return;

}
if (quest_id == 146) {
myself.SetCurrentQuestID(146);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level >= 81 && gg.HaveMemo(talker, 146) == 0 && myself.GetOneTimeQuestFlag(talker, 109) == 1) {
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 146);
myself.SetMemoState(talker, 146, 1);
myself.ShowQuestPage(talker, "merc_kahmun_q0640_103a.htm", 146);
myself.SetFlagJournal(talker, 146, 1);
myself.ShowQuestMark(talker, 146);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 628) {
myself.SetCurrentQuestID(628);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 628) {
if (reply == 1 && gg.HaveMemo(talker, 628) == 1 && gg.OwnItemCount(talker, 7246) < 1 && gg.OwnItemCount(talker, 7247) < 1 && gg.OwnItemCount(talker, 7248) >= 100) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7246, 1);
myself.DeleteItem1(talker, 7248, gg.OwnItemCount(talker, 7248));
myself.ShowPage(talker, "merc_kahmun_q0628_08.htm");
myself.SetFlagJournal(talker, 628, 2);
myself.ShowQuestMark(talker, 628);
gg.AddLog(3, talker, 628);

}

}
if (reply == 2) {
myself.ShowPage(talker, "merc_kahmun_q0628_12.htm");

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7246, gg.OwnItemCount(talker, 7246));
myself.DeleteItem1(talker, 7247, gg.OwnItemCount(talker, 7247));
myself.DeleteItem1(talker, 7248, gg.OwnItemCount(talker, 7248));
myself.DeleteItem1(talker, 7249, gg.OwnItemCount(talker, 7249));
myself.RemoveMemo(talker, 628);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "merc_kahmun_q0628_13.htm");
gg.AddLog(2, talker, 628);

}

}

}
if (ask == 640) {
myself.SetCurrentQuestID(640);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 640) {
if (reply == 1 && gg.HaveMemo(talker, 640) == 1 && gg.GetMemoState(talker, 640) >= 2 - 1 * 10 + 1) {
myself.ShowPage(talker, "merc_kahmun_q0640_0201.htm");

}
if (reply == 3 && gg.HaveMemo(talker, 640) == 1 && gg.GetMemoState(talker, 640) >= 2 - 1 * 10 + 1) {
myself.ShowPage(talker, "merc_kahmun_q0640_0202.htm");

}
if (reply == 11) {
if (gg.HaveMemo(talker, 640) == 1 && gg.GetMemoState(talker, 640) >= 2 - 1 * 10 + 1) {
if (gg.OwnItemCount(talker, 8085) >= 12) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 8085, 12);
myself.GiveItem1(talker, 4042, 1);
gg.AddLog(3, talker, 640);
myself.ShowPage(talker, "merc_kahmun_q0640_0203.htm");

} else {
myself.ShowPage(talker, "merc_kahmun_q0640_0204.htm");

}

}

}

}
if (reply == 12) {
if (gg.HaveMemo(talker, 640) == 1 && gg.GetMemoState(talker, 640) >= 2 - 1 * 10 + 1) {
if (gg.OwnItemCount(talker, 8085) >= 6) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 8085, 6);
myself.GiveItem1(talker, 4043, 1);
gg.AddLog(3, talker, 640);
myself.ShowPage(talker, "merc_kahmun_q0640_0203.htm");

} else {
myself.ShowPage(talker, "merc_kahmun_q0640_0204.htm");

}

}

}

}
if (reply == 13) {
if (gg.HaveMemo(talker, 640) == 1 && gg.GetMemoState(talker, 640) >= 2 - 1 * 10 + 1) {
if (gg.OwnItemCount(talker, 8085) >= 6) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 8085, 6);
myself.GiveItem1(talker, 4044, 1);
gg.AddLog(3, talker, 640);
myself.ShowPage(talker, "merc_kahmun_q0640_0203.htm");

} else {
myself.ShowPage(talker, "merc_kahmun_q0640_0204.htm");

}

}

}

}
if (reply == 14) {
if (gg.HaveMemo(talker, 640) == 1 && gg.GetMemoState(talker, 640) >= 2 - 1 * 10 + 1) {
if (gg.OwnItemCount(talker, 8085) >= 81) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 8085, 81);
myself.GiveItem1(talker, 1887, 10);
gg.AddLog(3, talker, 640);
myself.ShowPage(talker, "merc_kahmun_q0640_0203.htm");

} else {
myself.ShowPage(talker, "merc_kahmun_q0640_0204.htm");

}

}

}

}
if (reply == 15) {
if (gg.HaveMemo(talker, 640) == 1 && gg.GetMemoState(talker, 640) >= 2 - 1 * 10 + 1) {
if (gg.OwnItemCount(talker, 8085) >= 33) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 8085, 33);
myself.GiveItem1(talker, 1888, 5);
gg.AddLog(3, talker, 640);
myself.ShowPage(talker, "merc_kahmun_q0640_0203.htm");

} else {
myself.ShowPage(talker, "merc_kahmun_q0640_0204.htm");

}

}

}

}
if (reply == 16) {
if (gg.HaveMemo(talker, 640) == 1 && gg.GetMemoState(talker, 640) >= 2 - 1 * 10 + 1) {
if (gg.OwnItemCount(talker, 8085) >= 30) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 8085, 30);
myself.GiveItem1(talker, 1889, 10);
gg.AddLog(3, talker, 640);
myself.ShowPage(talker, "merc_kahmun_q0640_0203.htm");

} else {
myself.ShowPage(talker, "merc_kahmun_q0640_0204.htm");

}

}

}

}
if (reply == 17) {
if (gg.HaveMemo(talker, 640) == 1 && gg.GetMemoState(talker, 640) >= 2 - 1 * 10 + 1) {
if (gg.OwnItemCount(talker, 8085) >= 150) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 8085, 150);
myself.GiveItem1(talker, 5550, 10);
gg.AddLog(3, talker, 640);
myself.ShowPage(talker, "merc_kahmun_q0640_0203.htm");

} else {
myself.ShowPage(talker, "merc_kahmun_q0640_0204.htm");

}

}

}

}
if (reply == 18) {
if (gg.HaveMemo(talker, 640) == 1 && gg.GetMemoState(talker, 640) >= 2 - 1 * 10 + 1) {
if (gg.OwnItemCount(talker, 8085) >= 131) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 8085, 131);
myself.GiveItem1(talker, 1890, 10);
gg.AddLog(3, talker, 640);
myself.ShowPage(talker, "merc_kahmun_q0640_0203.htm");

} else {
myself.ShowPage(talker, "merc_kahmun_q0640_0204.htm");

}

}

}

}
if (reply == 19) {
if (gg.HaveMemo(talker, 640) == 1 && gg.GetMemoState(talker, 640) >= 2 - 1 * 10 + 1) {
if (gg.OwnItemCount(talker, 8085) >= 123) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 8085, 123);
myself.GiveItem1(talker, 1893, 5);
gg.AddLog(3, talker, 640);
myself.ShowPage(talker, "merc_kahmun_q0640_0203.htm");

} else {
myself.ShowPage(talker, "merc_kahmun_q0640_0204.htm");

}

}

}

}
if (reply == 4 && gg.HaveMemo(talker, 640) == 1 && gg.GetMemoState(talker, 640) >= 2 - 1 * 10 + 1) {
myself.RemoveMemo(talker, 640);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 640);
myself.ShowPage(talker, "merc_kahmun_q0640_0205.htm");

}

}
if (ask == 109) {
myself.SetCurrentQuestID(109);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 109 && myself.GetOneTimeQuestFlag(talker, 109) == 0) {
i0 = myself.GetHTMLCookie(talker, 109, 4 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 109) == 1 && gg.GetMemoState(talker, 109) > 30) {
if (gg.GetMemoState(talker, 109) == 31) {
myself.SetOneTimeQuestFlag(talker, 109, 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 25461);
myself.IncrementParam(talker, 0, 146113);
myself.IncrementParam(talker, 1, 13723);

}
gg.AddLog(2, talker, 109);
gg.AddLog(3, talker, 109);
myself.RemoveMemo(talker, 109);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "merc_kahmun_q0109_0401.htm");

} else if (gg.GetMemoState(talker, 109) == 35) {
myself.SetOneTimeQuestFlag(talker, 109, 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 161500);
myself.IncrementParam(talker, 0, 701500);
myself.IncrementParam(talker, 1, 50000);

}
gg.AddLog(2, talker, 109);
gg.AddLog(3, talker, 109);
myself.RemoveMemo(talker, 109);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "merc_kahmun_q0109_0401.htm");

}

}

}

}
super;
	}


}