package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hitsran extends guard_stand {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 379) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Fantasy Wine");

}
if (gg.HaveMemo(talker, 379) == 1 && gg.OwnItemCount(talker, 5893) < 80 && gg.OwnItemCount(talker, 5894) < 100) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Fantasy Wine (In Progress)");

}
if (gg.HaveMemo(talker, 379) == 1 && gg.OwnItemCount(talker, 5893) >= 80 && gg.OwnItemCount(talker, 5894) < 100) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Fantasy Wine (In Progress)");

}
if (gg.HaveMemo(talker, 379) == 1 && gg.OwnItemCount(talker, 5893) < 80 && gg.OwnItemCount(talker, 5894) >= 100) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Fantasy Wine (In Progress)");

}
if (gg.HaveMemo(talker, 379) == 1 && gg.OwnItemCount(talker, 5893) >= 80 && gg.OwnItemCount(talker, 5894) >= 100) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Fantasy Wine (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 6 && gg.GetMemoStateEx(talker, 65, 1) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Certified Soul Breaker (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 6 && gg.GetMemoStateEx(talker, 65, 1) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Certified Soul Breaker (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 6 && gg.GetMemoStateEx(talker, 65, 1) == 10) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Certified Soul Breaker (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 7) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Certified Soul Breaker (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 379) == 0) {
myself.SetCurrentQuestID(379);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 20) {
myself.ShowPage(talker, "hitsran_q0379_01.htm");

} else if (talker.level >= 20) {
myself.ShowQuestPage(talker, "hitsran_q0379_02.htm", 379);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 379) == 1 && gg.OwnItemCount(talker, 5893) < 80 && gg.OwnItemCount(talker, 5894) < 100) {
myself.SetCurrentQuestID(379);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hitsran_q0379_07.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 379) == 1 && gg.OwnItemCount(talker, 5893) >= 80 && gg.OwnItemCount(talker, 5894) < 100) {
myself.SetCurrentQuestID(379);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hitsran_q0379_08.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 379) == 1 && gg.OwnItemCount(talker, 5893) < 80 && gg.OwnItemCount(talker, 5894) >= 100) {
myself.SetCurrentQuestID(379);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hitsran_q0379_09.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 379) == 1 && gg.OwnItemCount(talker, 5893) >= 80 && gg.OwnItemCount(talker, 5894) >= 100) {
myself.SetCurrentQuestID(379);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hitsran_q0379_10.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 6 && gg.GetMemoStateEx(talker, 65, 1) == 0) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoStateEx(talker, 65, 1, 1);
myself.ShowPage(talker, "hitsran_q0065_01.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 6 && gg.GetMemoStateEx(talker, 65, 1) == 1) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hitsran_q0065_01a.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 6 && gg.GetMemoStateEx(talker, 65, 1) == 10) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 65, 7);
myself.SetMemoStateEx(talker, 65, 1, 0);
myself.ShowPage(talker, "hitsran_q0065_02.htm");
myself.SetFlagJournal(talker, 65, 7);
myself.ShowQuestMark(talker, 65);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 7) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hitsran_q0065_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 379) {
myself.SetCurrentQuestID(379);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 379);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 379, 1);
myself.ShowQuestPage(talker, "hitsran_q0379_06.htm", 379);
gg.AddLog(1, talker, 379);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 379) {
myself.SetCurrentQuestID(379);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 379) {
if (reply == 1) {
myself.ShowQuestPage(talker, "hitsran_q0379_03.htm", 379);

}
if (reply == 2) {
myself.FHTML_SetFileName(fhtml0, "hitsran_q0379_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 379);
myself.ShowQuestFHTML(talker, fhtml0, 379);

}
if (reply == 3) {
myself.ShowPage(talker, "hitsran_q0379_05.htm");

}
if (reply == 4 && gg.OwnItemCount(talker, 5893) >= 80 && gg.OwnItemCount(talker, 5894) >= 100) {
i0 = gg.Rand(10);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (i0 < 3) {
myself.GiveItem1(talker, 5956, 1);
myself.DeleteItem1(talker, 5893, gg.OwnItemCount(talker, 5893));
myself.DeleteItem1(talker, 5894, gg.OwnItemCount(talker, 5894));
myself.RemoveMemo(talker, 379);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "hitsran_q0379_11.htm");
gg.AddLog(2, talker, 379);
gg.AddLog(3, talker, 379);

} else if (i0 < 9) {
myself.GiveItem1(talker, 5957, 1);
myself.DeleteItem1(talker, 5893, gg.OwnItemCount(talker, 5893));
myself.DeleteItem1(talker, 5894, gg.OwnItemCount(talker, 5894));
myself.RemoveMemo(talker, 379);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "hitsran_q0379_12.htm");
gg.AddLog(2, talker, 379);
gg.AddLog(3, talker, 379);

} else {
myself.GiveItem1(talker, 5958, 1);
myself.DeleteItem1(talker, 5893, gg.OwnItemCount(talker, 5893));
myself.DeleteItem1(talker, 5894, gg.OwnItemCount(talker, 5894));
myself.RemoveMemo(talker, 379);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "hitsran_q0379_13.htm");
gg.AddLog(2, talker, 379);
gg.AddLog(3, talker, 379);

}

}

}

}
super;
	}


}