package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class day_kurstin extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 11) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Seeds of Chaos (In Progress)");

}
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 12) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Seeds of Chaos (In Progress)");

}
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 20 && gg.GetMemoStateEx(talker, 236, 1) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Seeds of Chaos (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 11) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "day_kurstin_q0236_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 12) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "day_kurstin_q0236_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 20 && gg.GetMemoStateEx(talker, 236, 1) == 1) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "day_kurstin_q0236_11.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 236) {
myself.SetCurrentQuestID(236);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 236) {
if (reply == 1) {
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 11) {
myself.DeleteItem1(talker, 9744, gg.OwnItemCount(talker, 9744));
myself.SetMemoState(talker, 236, 12);
myself.ShowPage(talker, "day_kurstin_q0236_03.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 12) {
if (myself.GetOneTimeQuestFlag(talker, 25) == 1) {
myself.ShowPage(talker, "day_kurstin_q0236_05a.htm");

} else {
myself.ShowPage(talker, "day_kurstin_q0236_05b.htm");

}

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 12) {
myself.SetMemoState(talker, 236, 20);
myself.ShowPage(talker, "day_kurstin_q0236_10.htm");
myself.SetFlagJournal(talker, 236, 11);
myself.ShowQuestMark(talker, 236);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoStateEx(talker, 236, 1, 1);

} else if (gg.HaveMemo(talker, 236) == 1 && gg.GetMemoState(talker, 236) == 20 && gg.GetMemoStateEx(talker, 236, 1) == 1) {
myself.ShowPage(talker, "day_kurstin_q0236_10.htm");

}

}

}
super;
	}


}