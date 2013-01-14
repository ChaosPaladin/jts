package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kash extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 211) == 0 && myself.GetOneTimeQuestFlag(talker, 211) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Challenger");

}
if (gg.HaveMemo(talker, 211) == 0 && myself.GetOneTimeQuestFlag(talker, 211) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Challenger (Done)");

}
if (gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Challenger (In Progress)");

}
if (gg.HaveMemo(talker, 211) == 1 && gg.OwnItemCount(talker, 2631) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Challenger (In Progress)");

}
if (gg.HaveMemo(talker, 211) == 1 && gg.OwnItemCount(talker, 2628) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Challenger (In Progress)");

}
if (gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) >= 7) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of the Challenger (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 0 && myself.GetOneTimeQuestFlag(talker, 211) == 0) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.IsInCategory(17, talker.occupation) && talker.level >= 35) {
myself.ShowQuestPage(talker, "kash_q0211_03.htm", 211);

} else if (myself.IsInCategory(17, talker.occupation)) {
myself.ShowPage(talker, "kash_q0211_01.htm");

} else {
myself.ShowPage(talker, "kash_q0211_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 0 && myself.GetOneTimeQuestFlag(talker, 211) == 1) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 1) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "kash_q0211_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.OwnItemCount(talker, 2631) == 1) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "kash_q0211_07.htm");
myself.SetFlagJournal(talker, 211, 3);
myself.ShowQuestMark(talker, 211);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 2628, 1);
myself.DeleteItem1(talker, 2631, 1);
myself.SetMemoState(talker, 211, 3);

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.OwnItemCount(talker, 2628) == 1) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "kash_q0211_08.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) >= 7) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "kash_q0211_09.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 211) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 211) == 0 && myself.GetOneTimeQuestFlag(talker, 211) == 0 && myself.GetMemoCount(talker) < 41 && myself.IsInCategory(17, talker.occupation) && talker.level >= 35) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 211);
myself.SetFlagJournal(talker, 211, 1);
myself.SetMemoState(talker, 211, 1);
myself.ShowQuestMark(talker, 211);
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
myself.ShowQuestPage(talker, "kash_q0211_05a.htm", 211);

} else {
myself.ShowQuestPage(talker, "kash_q0211_05.htm", 211);

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 211) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 211) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "kash_q0211_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 211);
myself.ShowQuestFHTML(talker, fhtml0, 211);

}

}
super;
	}


}