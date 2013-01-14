package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class watcher_valakas_klein extends ai_boss07_teleporter {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 60 && gg.HaveMemo(talker, 618) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Into the Flames");

}
if (talker.level < 60 && gg.HaveMemo(talker, 618) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Into the Flames");

}
if (gg.HaveMemo(talker, 618) == 1 && gg.GetMemoState(talker, 618) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Into the Flames (In Progress)");

}
if (gg.HaveMemo(talker, 618) == 1 && gg.OwnItemCount(talker, 7266) >= 1 && gg.GetMemoState(talker, 618) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Into the Flames (In Progress)");

}
if (gg.HaveMemo(talker, 10291) == 0 && myself.GetOneTimeQuestFlag(talker, 10291) == 0 && gg.OwnItemCount(talker, 7267) >= 1 && talker.level >= 83) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Fire Dragon Destroyer");

}
if (gg.HaveMemo(talker, 10291) == 0 && myself.GetOneTimeQuestFlag(talker, 10291) == 0 && talker.level < 83) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Fire Dragon Destroyer");

}
if (myself.GetOneTimeQuestFlag(talker, 10291) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Fire Dragon Destroyer (Done)");

}
if (gg.HaveMemo(talker, 10291) == 0 && myself.GetOneTimeQuestFlag(talker, 10291) == 0 && gg.OwnItemCount(talker, 7267) < 1 && talker.level >= 83) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Fire Dragon Destroyer");

}
if (gg.HaveMemo(talker, 10291) == 1 && gg.GetMemoState(talker, 10291) == 1 && gg.OwnItemCount(talker, 15524) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Fire Dragon Destroyer (In progress)");

}
if (gg.HaveMemo(talker, 10291) == 1 && gg.GetMemoState(talker, 10291) == 1 && gg.OwnItemCount(talker, 15524) == 0 && gg.OwnItemCount(talker, 15525) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Fire Dragon Destroyer (In progress)");

}
if (gg.HaveMemo(talker, 10291) == 1 && gg.GetMemoState(talker, 10291) == 2) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Fire Dragon Destroyer (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 60 && gg.HaveMemo(talker, 618) == 0) {
myself.SetCurrentQuestID(618);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "watcher_valakas_klein_q0618_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 618);
myself.ShowQuestFHTML(talker, fhtml0, 618);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 60 && gg.HaveMemo(talker, 618) == 0) {
myself.SetCurrentQuestID(618);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "watcher_valakas_klein_q0618_0103.htm", 618);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 618) == 1 && gg.GetMemoState(talker, 618) == 1 * 10 + 1) {
myself.SetCurrentQuestID(618);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_valakas_klein_q0618_0105.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 618) == 1 && gg.OwnItemCount(talker, 7266) >= 1 && gg.GetMemoState(talker, 618) == 3 * 10 + 1) {
myself.SetCurrentQuestID(618);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 618, 3);
myself.ShowPage(talker, "watcher_valakas_klein_q0618_0301.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10291) == 0 && myself.GetOneTimeQuestFlag(talker, 10291) == 0 && gg.OwnItemCount(talker, 7267) >= 1 && talker.level >= 83) {
myself.SetCurrentQuestID(10291);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "watcher_valakas_klein_q10291_01.htm", 10291);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10291) == 0 && myself.GetOneTimeQuestFlag(talker, 10291) == 0 && talker.level < 83) {
myself.SetCurrentQuestID(10291);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "watcher_valakas_klein_q10291_02.htm", 10291);

}
break;

}
case 6: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 10291) == 1) {
myself.SetCurrentQuestID(10291);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_valakas_klein_q10291_03.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10291) == 0 && myself.GetOneTimeQuestFlag(talker, 10291) == 0 && gg.OwnItemCount(talker, 7267) < 1 && talker.level >= 83) {
myself.SetCurrentQuestID(10291);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "watcher_valakas_klein_q10291_04.htm", 10291);

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10291) == 1 && gg.GetMemoState(talker, 10291) == 1 && gg.OwnItemCount(talker, 15524) >= 1) {
myself.SetCurrentQuestID(10291);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "watcher_valakas_klein_q10291_08.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10291) == 1 && gg.GetMemoState(talker, 10291) == 1 && gg.OwnItemCount(talker, 15524) == 0 && gg.OwnItemCount(talker, 15525) == 0) {
myself.SetCurrentQuestID(10291);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 15524, 1);
myself.ShowPage(talker, "watcher_valakas_klein_q10291_09.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10291) == 1 && gg.GetMemoState(talker, 10291) == 2) {
myself.SetCurrentQuestID(10291);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 15525, gg.OwnItemCount(talker, 15525));
myself.GiveItem1(talker, 57, 126549);
myself.IncrementParam(talker, 0, 717291);
myself.IncrementParam(talker, 1, 77397);
myself.GiveItem1(talker, 8567, 1);
myself.RemoveMemo(talker, 10291);
myself.SetOneTimeQuestFlag(talker, 10291, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 10291);
gg.AddLog(3, talker, 10291);
myself.ShowPage(talker, "watcher_valakas_klein_q10291_10.htm");

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
if (quest_id == 618) {
myself.SetCurrentQuestID(618);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 618);
myself.ShowQuestMark(talker, 618);
myself.SetMemoState(talker, 618, 1 * 10 + 1);
gg.AddLog(1, talker, 618);
myself.SetFlagJournal(talker, 618, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "watcher_valakas_klein_q0618_0104.htm", 618);

}
return;

}
if (quest_id == 10291) {
myself.SetCurrentQuestID(10291);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 10291) == 0 && myself.GetOneTimeQuestFlag(talker, 10291) == 0 && gg.OwnItemCount(talker, 7267) >= 1 && talker.level >= 83) {
myself.GiveItem1(talker, 15524, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 10291);
myself.SetMemoState(talker, 10291, 1);
myself.ShowQuestPage(talker, "watcher_valakas_klein_q10291_07.htm", 10291);
myself.SetFlagJournal(talker, 10291, 1);
myself.ShowQuestMark(talker, 10291);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 618) {
myself.SetCurrentQuestID(618);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 618) {
i0 = myself.GetHTMLCookie(talker, 618, 4 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 618) == 1) {
if (gg.OwnItemCount(talker, 7266) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7266, gg.OwnItemCount(talker, 7266));
myself.GiveItem1(talker, 7267, 1);

}
gg.AddLog(2, talker, 618);
gg.AddLog(3, talker, 618);
myself.RemoveMemo(talker, 618);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "watcher_valakas_klein_q0618_0401.htm");

} else {
myself.ShowPage(talker, "watcher_valakas_klein_q0618_0402.htm");

}

}

}

}
if (ask == 617) {
myself.SetCurrentQuestID(617);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 618) {
if (reply == 101) {
i0 = 0;
i0 = myself.i_ai3 + myself.i_ai2 + myself.i_ai1 + myself.i_ai0;
if (i0 < 50) {
myself.ShowPage(talker, "watcher_valakas_klein003.htm");

} else if (i0 < 100) {
myself.ShowPage(talker, "watcher_valakas_klein004.htm");

} else if (i0 < 150) {
myself.ShowPage(talker, "watcher_valakas_klein005.htm");

} else if (i0 < 200) {
myself.ShowPage(talker, "watcher_valakas_klein006.htm");

} else {
myself.ShowPage(talker, "watcher_valakas_klein007.htm");

}

}

}
if (ask == 10291) {
myself.SetCurrentQuestID(10291);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10291) {
if (reply == 1) {
if (gg.HaveMemo(talker, 10291) == 0 && myself.GetOneTimeQuestFlag(talker, 10291) == 0 && gg.OwnItemCount(talker, 7267) >= 1 && talker.level >= 83) {
myself.ShowPage(talker, "watcher_valakas_klein_q10291_05.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 10291) == 0 && myself.GetOneTimeQuestFlag(talker, 10291) == 0 && gg.OwnItemCount(talker, 7267) >= 1 && talker.level >= 83) {
myself.FHTML_SetFileName(fhtml0, "watcher_valakas_klein_q10291_06.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 10291);
myself.ShowQuestFHTML(talker, fhtml0, 10291);

}

}

}
super;
	}


}