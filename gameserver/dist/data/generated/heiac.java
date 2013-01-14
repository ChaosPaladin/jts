package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class heiac extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 3) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Seven Signs, Series of Doubt (In progress)");

}
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) > 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Seven Signs, Series of Doubt (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 3) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13813) >= 1) {
myself.ShowPage(talker, "heiac_q0192_01.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) > 3) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "heiac_q0192_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 192) {
myself.SetCurrentQuestID(192);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 192) {
if (reply == 1) {
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 3) {
if (gg.OwnItemCount(talker, 13813) >= 1) {
myself.ShowPage(talker, "heiac_q0192_02.htm");

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 192) == 1 && gg.GetMemoState(talker, 192) == 3) {
if (gg.OwnItemCount(talker, 13813) >= 1) {
myself.DeleteItem1(talker, 13813, gg.OwnItemCount(talker, 13813));
myself.SetMemoState(talker, 192, 4);
myself.ShowPage(talker, "heiac_q0192_03.htm");
myself.SetFlagJournal(talker, 192, 4);
myself.ShowQuestMark(talker, 192);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}