package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class captain_mathias extends inzone_raid_controller {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 10281) == 0 && myself.GetOneTimeQuestFlag(talker, 10281) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Mutated Kaneus - Rune");

}
if (gg.HaveMemo(talker, 10281) == 0 && myself.GetOneTimeQuestFlag(talker, 10281) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Mutated Kaneus - Rune (Done)");

}
if (gg.HaveMemo(talker, 10281) == 1 && gg.GetMemoState(talker, 10281) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Mutated Kaneus - Rune (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10281) == 0 && myself.GetOneTimeQuestFlag(talker, 10281) == 0) {
myself.SetCurrentQuestID(10281);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 68) {
myself.ShowQuestPage(talker, "captain_mathias_q10281_01.htm", 10281);

} else {
myself.ShowQuestPage(talker, "captain_mathias_q10281_04.htm", 10281);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10281) == 0 && myself.GetOneTimeQuestFlag(talker, 10281) == 1) {
myself.SetCurrentQuestID(10281);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_mathias_q10281_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10281) == 1 && gg.GetMemoState(talker, 10281) == 1) {
myself.SetCurrentQuestID(10281);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13840) >= 1) {
myself.ShowPage(talker, "captain_mathias_q10281_07.htm");

} else {
myself.ShowPage(talker, "captain_mathias_q10281_06.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam i0, HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 10281) {
myself.SetCurrentQuestID(10281);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 68 && gg.HaveMemo(talker, 10281) == 0 && myself.GetOneTimeQuestFlag(talker, 10281) == 0) {
myself.SetMemoState(talker, 10281, 1);
myself.SetMemo(talker, 10281);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "captain_mathias_q10281_05.htm", 10281);
myself.SetFlagJournal(talker, 10281, 1);
myself.ShowQuestMark(talker, 10281);
gg.AddLog(1, talker, 10281);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 10281) {
myself.SetCurrentQuestID(10281);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10281) {
if (reply == 1) {
if (gg.HaveMemo(talker, 10281) == 0 && myself.GetOneTimeQuestFlag(talker, 10281) == 0) {
if (talker.level >= 68) {
myself.FHTML_SetFileName(fhtml0, "captain_mathias_q10281_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 10281);
myself.ShowQuestFHTML(talker, fhtml0, 10281);

}

}

}

}
super;
	}


}