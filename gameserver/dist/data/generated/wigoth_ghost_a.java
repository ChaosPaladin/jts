package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wigoth_ghost_a extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 620) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Four Goblets (In Progress)");

}
if (gg.HaveMemo(talker, 620) == 1 && gg.OwnItemCount(talker, 7262) == 0 && gg.OwnItemCount(talker, 7256) == 0 || gg.OwnItemCount(talker, 7257) == 0 || gg.OwnItemCount(talker, 7258) == 0 || gg.OwnItemCount(talker, 7259) == 0 && gg.OwnItemCount(talker, 7256) + gg.OwnItemCount(talker, 7257) + gg.OwnItemCount(talker, 7258) + gg.OwnItemCount(talker, 7259) < 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Four Goblets (In Progress)");

}
if (gg.HaveMemo(talker, 620) == 1 && gg.OwnItemCount(talker, 7262) == 0 && gg.OwnItemCount(talker, 7256) == 0 || gg.OwnItemCount(talker, 7257) == 0 || gg.OwnItemCount(talker, 7258) == 0 || gg.OwnItemCount(talker, 7259) == 0 && gg.OwnItemCount(talker, 7256) + gg.OwnItemCount(talker, 7257) + gg.OwnItemCount(talker, 7258) + gg.OwnItemCount(talker, 7259) >= 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Four Goblets (In Progress)");

}
if (gg.HaveMemo(talker, 620) == 1 && gg.OwnItemCount(talker, 7262) == 0 && gg.OwnItemCount(talker, 7256) >= 1 && gg.OwnItemCount(talker, 7257) >= 1 && gg.OwnItemCount(talker, 7258) >= 1 && gg.OwnItemCount(talker, 7259) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Four Goblets (In Progress)");

}
if (gg.HaveMemo(talker, 620) == 1 && gg.OwnItemCount(talker, 7262) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Four Goblets (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 620) == 0) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wigoth_ghost_a_q0620_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 620) == 1 && gg.OwnItemCount(talker, 7262) == 0 && gg.OwnItemCount(talker, 7256) == 0 || gg.OwnItemCount(talker, 7257) == 0 || gg.OwnItemCount(talker, 7258) == 0 || gg.OwnItemCount(talker, 7259) == 0 && gg.OwnItemCount(talker, 7256) + gg.OwnItemCount(talker, 7257) + gg.OwnItemCount(talker, 7258) + gg.OwnItemCount(talker, 7259) < 3) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wigoth_ghost_a_q0620_01.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 620) == 1 && gg.OwnItemCount(talker, 7262) == 0 && gg.OwnItemCount(talker, 7256) == 0 || gg.OwnItemCount(talker, 7257) == 0 || gg.OwnItemCount(talker, 7258) == 0 || gg.OwnItemCount(talker, 7259) == 0 && gg.OwnItemCount(talker, 7256) + gg.OwnItemCount(talker, 7257) + gg.OwnItemCount(talker, 7258) + gg.OwnItemCount(talker, 7259) >= 3) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wigoth_ghost_a_q0620_02.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 620) == 1 && gg.OwnItemCount(talker, 7262) == 0 && gg.OwnItemCount(talker, 7256) >= 1 && gg.OwnItemCount(talker, 7257) >= 1 && gg.OwnItemCount(talker, 7258) >= 1 && gg.OwnItemCount(talker, 7259) >= 1) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wigoth_ghost_a_q0620_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 620) == 1 && gg.OwnItemCount(talker, 7262) >= 1) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wigoth_ghost_a_q0620_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam i0, HandlerParam timer_id) {
myself.SetCurrentQuestID(620);
if (timer_id == 62001) {
i0 = gg.GetDateTime(0, 4);
if (i0 >= 54) {
myself.Despawn();

} else {
myself.AddTimerEx(62001, 1000);

}

}
super;
	}

	protected void CREATED() {
myself.SetCurrentQuestID(620);
myself.AddTimerEx(62001, 1000);
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 620) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 620) {
if (reply == 1) {
myself.ShowPage(talker, "wigoth_ghost_a_q0620_03.htm");

}
if (reply == 2) {
myself.DeleteItem1(talker, 7260, gg.OwnItemCount(talker, 7260));
myself.InstantTeleport(talker, 169584, -91008, -2912);

}

}
super;
	}


}