package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blacksmith_rupio extends blacksmith {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3457) + gg.OwnItemCount(talker, 3458) + gg.OwnItemCount(talker, 3459) + gg.OwnItemCount(talker, 3460) < 1 && gg.OwnItemCount(talker, 3462) + gg.OwnItemCount(talker, 3463) + gg.OwnItemCount(talker, 3464) + gg.OwnItemCount(talker, 3465) < 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hunt of the Black Lion (In Progress)");

}
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3457) + gg.OwnItemCount(talker, 3458) + gg.OwnItemCount(talker, 3459) + gg.OwnItemCount(talker, 3460) >= 1 || gg.OwnItemCount(talker, 3462) + gg.OwnItemCount(talker, 3463) + gg.OwnItemCount(talker, 3464) + gg.OwnItemCount(talker, 3465) >= 1) {
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
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3457) + gg.OwnItemCount(talker, 3458) + gg.OwnItemCount(talker, 3459) + gg.OwnItemCount(talker, 3460) < 1 && gg.OwnItemCount(talker, 3462) + gg.OwnItemCount(talker, 3463) + gg.OwnItemCount(talker, 3464) + gg.OwnItemCount(talker, 3465) < 1) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_rupio_q0333_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3457) + gg.OwnItemCount(talker, 3458) + gg.OwnItemCount(talker, 3459) + gg.OwnItemCount(talker, 3460) >= 1 || gg.OwnItemCount(talker, 3462) + gg.OwnItemCount(talker, 3463) + gg.OwnItemCount(talker, 3464) + gg.OwnItemCount(talker, 3465) >= 1) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_rupio_q0333_02.htm");

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
if (gg.OwnItemCount(talker, 3457) == 0 || gg.OwnItemCount(talker, 3458) == 0 || gg.OwnItemCount(talker, 3459) == 0 || gg.OwnItemCount(talker, 3460) == 0) {
myself.ShowPage(talker, "blacksmith_rupio_q0333_03.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.Rand(100) < 50) {
myself.GiveItem1(talker, 3461, 1);
myself.DeleteItem1(talker, 3457, 1);
myself.DeleteItem1(talker, 3458, 1);
myself.DeleteItem1(talker, 3459, 1);
myself.DeleteItem1(talker, 3460, 1);
myself.ShowPage(talker, "blacksmith_rupio_q0333_04.htm");

} else {
myself.DeleteItem1(talker, 3457, 1);
myself.DeleteItem1(talker, 3458, 1);
myself.DeleteItem1(talker, 3459, 1);
myself.DeleteItem1(talker, 3460, 1);
myself.ShowPage(talker, "blacksmith_rupio_q0333_05.htm");

}

}

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 3462) == 0 || gg.OwnItemCount(talker, 3463) == 0 || gg.OwnItemCount(talker, 3464) == 0 || gg.OwnItemCount(talker, 3465) == 0) {
myself.ShowPage(talker, "blacksmith_rupio_q0333_06.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.Rand(100) < 50) {
myself.GiveItem1(talker, 3466, 1);
myself.DeleteItem1(talker, 3462, 1);
myself.DeleteItem1(talker, 3463, 1);
myself.DeleteItem1(talker, 3464, 1);
myself.DeleteItem1(talker, 3465, 1);
myself.ShowPage(talker, "blacksmith_rupio_q0333_07.htm");

} else {
myself.DeleteItem1(talker, 3462, 1);
myself.DeleteItem1(talker, 3463, 1);
myself.DeleteItem1(talker, 3464, 1);
myself.DeleteItem1(talker, 3465, 1);
myself.ShowPage(talker, "blacksmith_rupio_q0333_08.htm");

}

}

}

}
super;
	}


}