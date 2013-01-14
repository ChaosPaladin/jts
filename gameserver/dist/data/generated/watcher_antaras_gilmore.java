package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class watcher_antaras_gilmore extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) < 60000) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 60000) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 70000) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 344) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "1000 Years, the End of Lamentation");

}
if (gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "1000 Years, the End of Lamentation (In Progress)");

}
if (gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 1 || gg.GetMemoState(talker, 344) == 2 && gg.OwnItemCount(talker, 4269) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "1000 Years, the End of Lamentation (In Progress)");

}
if (gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 2 && gg.OwnItemCount(talker, 4269) > 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "1000 Years, the End of Lamentation (In Progress)");

}
if (gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 3) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "1000 Years, the End of Lamentation (In Progress)");

}
if (gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 4) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "1000 Years, the End of Lamentation (In Progress)");

}
if (gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) >= 5 && gg.GetMemoState(talker, 344) <= 8) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "1000 Years, the End of Lamentation (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 2 * 10 + 1 && talker.subjob_id != 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 3 * 10 + 1 && talker.subjob_id != 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 3 * 10 + 1 && talker.subjob_id == 0) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) < 60000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_antaras_gilmore_q0337_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 60000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_antaras_gilmore_q0337_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 70000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3861) >= 1) {
myself.ShowPage(talker, "watcher_antaras_gilmore_q0337_05.htm");

} else {
myself.ShowPage(talker, "watcher_antaras_gilmore_q0337_04.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 0) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 48) {
myself.ShowQuestPage(talker, "watcher_antaras_gilmore_q0344_01.htm", 344);

} else if (talker.level >= 48) {
myself.FHTML_SetFileName(fhtml0, "watcher_antaras_gilmore_q0344_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 344);
myself.ShowQuestFHTML(talker, fhtml0, 344);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 0) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 344, 1);
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_04.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 1 || gg.GetMemoState(talker, 344) == 2 && gg.OwnItemCount(talker, 4269) == 0) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_05.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 2 && gg.OwnItemCount(talker, 4269) > 0) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_06.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 3) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 <= 24) {
myself.GiveItem1(talker, 4270, 1);
myself.SetMemoState(talker, 344, 4);
myself.SetFlagJournal(talker, 344, 2);
myself.ShowQuestMark(talker, 344);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_09.htm");

} else if (i0 <= 49) {
myself.GiveItem1(talker, 4271, 1);
myself.SetMemoState(talker, 344, 4);
myself.SetFlagJournal(talker, 344, 2);
myself.ShowQuestMark(talker, 344);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_10.htm");

} else if (i0 <= 74) {
myself.GiveItem1(talker, 4272, 1);
myself.SetMemoState(talker, 344, 4);
myself.SetFlagJournal(talker, 344, 2);
myself.ShowQuestMark(talker, 344);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_11.htm");

} else {
myself.GiveItem1(talker, 4273, 1);
myself.SetMemoState(talker, 344, 4);
myself.SetFlagJournal(talker, 344, 2);
myself.ShowQuestMark(talker, 344);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_12.htm");

}

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 4) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_13.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) >= 5 && gg.GetMemoState(talker, 344) <= 8) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.GetMemoState(talker, 344) == 5) {
myself.GiveItem1(talker, 57, gg.GetMemoStateEx(talker, 344, 1) * 50 + 1500);

} else if (gg.GetMemoState(talker, 344) == 6) {
myself.GiveItem1(talker, 57, gg.GetMemoStateEx(talker, 344, 1) * 50);
myself.GiveItem1(talker, 4044, 1);

} else if (gg.GetMemoState(talker, 344) == 7) {
myself.GiveItem1(talker, 57, gg.GetMemoStateEx(talker, 344, 1) * 50);
myself.GiveItem1(talker, 4043, 1);

} else if (gg.GetMemoState(talker, 344) == 8) {
myself.GiveItem1(talker, 57, gg.GetMemoStateEx(talker, 344, 1) * 50);
myself.GiveItem1(talker, 4042, 1);

}
myself.SetMemoStateEx(talker, 344, 1, 0);
myself.SetMemoState(talker, 344, 1);
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_14.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 2 * 10 + 1 && talker.subjob_id != 0) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 241, 2);
myself.ShowPage(talker, "watcher_antaras_gilmore_q0241_0201.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 2 * 10 + 1) {
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
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 3 * 10 + 1 && talker.subjob_id != 0) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_antaras_gilmore_q0241_0302.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 3 * 10 + 1 && talker.subjob_id == 0) {
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
if (quest_id == 344) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 344);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetMemoState(talker, 344, 0);
gg.AddLog(1, talker, 344);
myself.SetFlagJournal(talker, 344, 1);
myself.ShowQuestPage(talker, "watcher_antaras_gilmore_q0344_03.htm", 344);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 337) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 337) {
if (reply == 1) {
myself.SetMemoState(talker, 337, 70000);
myself.SetJournal(talker, 337, 4);
myself.ShowQuestMark(talker, 337);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "watcher_antaras_gilmore_q0337_03.htm");

}

}
if (ask == 344) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 344) {
if (reply == 1) {
myself.SetMemoState(talker, 344, 1);
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_04.htm");

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 4269) > 0) {
if (gg.Rand(1000) >= gg.OwnItemCount(talker, 4269)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 4269) * 60);
myself.DeleteItem1(talker, 4269, gg.OwnItemCount(talker, 4269));
gg.AddLog(3, talker, 344);
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_07.htm");

}

} else {
myself.SetMemoStateEx(talker, 344, 1, gg.OwnItemCount(talker, 4269));
myself.DeleteItem1(talker, 4269, gg.OwnItemCount(talker, 4269));
myself.SetMemoState(talker, 344, 3);
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_08.htm");

}

} else {
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_06t.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 <= 24) {
myself.GiveItem1(talker, 4270, 1);
myself.SetMemoState(talker, 344, 4);
myself.SetFlagJournal(talker, 344, 2);
myself.ShowQuestMark(talker, 344);
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_09.htm");

} else if (i0 <= 49) {
myself.GiveItem1(talker, 4271, 1);
myself.SetMemoState(talker, 344, 4);
myself.SetFlagJournal(talker, 344, 2);
myself.ShowQuestMark(talker, 344);
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_10.htm");

} else if (i0 <= 74) {
myself.GiveItem1(talker, 4272, 1);
myself.SetMemoState(talker, 344, 4);
myself.SetFlagJournal(talker, 344, 2);
myself.ShowQuestMark(talker, 344);
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_11.htm");

} else {
myself.GiveItem1(talker, 4273, 1);
myself.SetMemoState(talker, 344, 4);
myself.SetFlagJournal(talker, 344, 2);
myself.ShowQuestMark(talker, 344);
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_12.htm");

}

}

}

}
if (reply == 3) {
myself.SetMemoState(talker, 344, 1);
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_15.htm");

}
if (reply == 4) {
myself.ShowPage(talker, "watcher_antaras_gilmore_q0344_16.htm");
myself.RemoveMemo(talker, 344);
gg.AddLog(2, talker, 344);
myself.SoundEffect(talker, "ItemSound.quest_finish");

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
i0 = myself.GetHTMLCookie(talker, 241, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 241) == 1 && talker.subjob_id != 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "watcher_antaras_gilmore_q0241_0301.htm");
myself.SetMemoState(talker, 241, 3 * 10 + 1);
myself.SetFlagJournal(talker, 241, 3);
myself.ShowQuestMark(talker, 241);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}