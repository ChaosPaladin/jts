package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class morgan extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hunt of the Black Lion (In Progress)");

}
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Hunt of the Black Lion (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) == 0) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "morgan_q0333_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) >= 1) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "morgan_q0333_02.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 333) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 333) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 3440) >= 1) {
myself.DeleteItem1(talker, 3440, 1);

} else if (gg.OwnItemCount(talker, 3441) >= 1) {
myself.DeleteItem1(talker, 3441, 1);

} else if (gg.OwnItemCount(talker, 3442) >= 1) {
myself.DeleteItem1(talker, 3442, 1);

} else if (gg.OwnItemCount(talker, 3443) >= 1) {
myself.DeleteItem1(talker, 3443, 1);

}
if (gg.OwnItemCount(talker, 3677) < 80) {
myself.GiveItem1(talker, 3677, 1);

} else if (gg.OwnItemCount(talker, 3677) > 80) {
myself.DeleteItem1(talker, 3677, gg.OwnItemCount(talker, 3677) - 80);

}
if (gg.OwnItemCount(talker, 3677) < 40) {
myself.GiveItem1(talker, 57, 100);
myself.ShowPage(talker, "morgan_q0333_03.htm");
gg.AddLog(3, talker, 333);

} else if (gg.OwnItemCount(talker, 3677) >= 40 && gg.OwnItemCount(talker, 3677) < 80) {
myself.GiveItem1(talker, 57, 200);
myself.ShowPage(talker, "morgan_q0333_04.htm");
gg.AddLog(3, talker, 333);

} else {
myself.GiveItem1(talker, 57, 300);
myself.ShowPage(talker, "morgan_q0333_05.htm");
gg.AddLog(3, talker, 333);

}

}

} else {
myself.ShowPage(talker, "morgan_q0333_06.htm");

}

}
if (reply == 2) {
myself.ShowPage(talker, "morgan_q0333_07.htm");

}

}
super;
	}


}