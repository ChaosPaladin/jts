package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hermit_santiago extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 215) == 0 && myself.GetOneTimeQuestFlag(talker, 215) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Pilgrim");

}
if (gg.HaveMemo(talker, 215) == 0 && myself.GetOneTimeQuestFlag(talker, 215) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Pilgrim (Done)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) >= 1 && gg.OwnItemCount(talker, 2722) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.OwnItemCount(talker, 2722)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Pilgrim (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 0 && myself.GetOneTimeQuestFlag(talker, 215) == 0) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.IsInCategory(15, talker.occupation) && talker.level >= 35) {
myself.FHTML_SetFileName(fhtml0, "hermit_santiago_q0215_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 215);
myself.ShowQuestFHTML(talker, fhtml0, 215);

} else if (myself.IsInCategory(15, talker.occupation)) {
myself.ShowPage(talker, "hermit_santiago_q0215_01.htm");

} else {
myself.ShowPage(talker, "hermit_santiago_q0215_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 0 && myself.GetOneTimeQuestFlag(talker, 215) == 1) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) >= 1 && gg.OwnItemCount(talker, 2722) == 0) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_santiago_q0215_09.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.OwnItemCount(talker, 2722)) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 1258250);
myself.IncrementParam(talker, 1, 81606);
myself.GiveItem1(talker, 57, 229298);
myself.ShowPage(talker, "hermit_santiago_q0215_10.htm");
myself.GiveItem1(talker, 2721, 1);
myself.DeleteItem1(talker, 2722, 1);
myself.DeleteItem1(talker, 2726, gg.OwnItemCount(talker, 2726));
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 215, 1);
myself.RemoveMemo(talker, 215);
gg.AddLog(2, talker, 215);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
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

}

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
if (quest_id == 215) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 215) == 0 && myself.GetOneTimeQuestFlag(talker, 215) == 0 && myself.GetMemoCount(talker) < 41 && myself.IsInCategory(15, talker.occupation) && talker.level >= 35) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 215, 1);
myself.ShowQuestMark(talker, 215);
myself.SoundEffect(talker, "ItemSound.quest_middle");
gg.AddLog(1, talker, 215);
myself.SetMemoState(talker, 215, 1);
myself.GiveItem1(talker, 2723, 1);
talker.flag = 0;
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
myself.ShowQuestPage(talker, "hermit_santiago_q0215_04a.htm", 215);

} else {
myself.ShowQuestPage(talker, "hermit_santiago_q0215_04.htm", 215);

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 215) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 215) {
if (reply == 1) {
myself.ShowPage(talker, "hermit_santiago_q0215_05.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "hermit_santiago_q0215_06.htm");

} else if (reply == 3) {
myself.ShowPage(talker, "hermit_santiago_q0215_07.htm");

} else if (reply == 4) {
myself.ShowPage(talker, "hermit_santiago_q0215_08.htm");

} else if (reply == 5) {
myself.ShowPage(talker, "hermit_santiago_q0215_05.htm");

}

}
super;
	}


}