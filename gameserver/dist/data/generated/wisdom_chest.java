package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wisdom_chest extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 334) == 1 && talker.flag == 4) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "The Wishing Potion (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 334) == 1 && talker.flag == 4) {
myself.SetCurrentQuestID(334);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.Rand(100);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (i0 < 10) {
myself.GiveItem1(talker, 3683, 1);
myself.ShowPage(talker, "wisdom_chest_q0334_02.htm");

} else if (i0 >= 10 && i0 < 50) {
myself.ShowPage(talker, "wisdom_chest_q0334_03.htm");
i1 = gg.Rand(4);
if (i1 == 0) {
myself.GiveItem1(talker, 1979, 1);

} else if (i1 == 1) {
myself.GiveItem1(talker, 1980, 1);

} else if (i1 == 2) {
myself.GiveItem1(talker, 2952, 1);

} else {
myself.GiveItem1(talker, 2953, 1);

}

} else if (i0 >= 50 && i0 < 85) {
myself.ShowPage(talker, "wisdom_chest_q0334_04.htm");
i1 = gg.Rand(2);
if (i1 == 0) {
myself.GiveItem1(talker, 4408, 1);

} else {
myself.GiveItem1(talker, 4409, 1);

}

} else if (i0 >= 85 && i0 < 95) {
myself.ShowPage(talker, "wisdom_chest_q0334_05.htm");
i1 = gg.Rand(4);
if (i1 == 0) {
myself.GiveItem1(talker, 441, 1);

} else if (i1 == 1) {
myself.GiveItem1(talker, 472, 1);

} else if (i1 == 2) {
myself.GiveItem1(talker, 2435, 1);

} else {
myself.GiveItem1(talker, 2459, 1);

}

} else if (i0 >= 95) {
myself.ShowPage(talker, "wisdom_chest_q0334_06.htm");
i1 = gg.Rand(2);
if (i1 == 0) {
myself.GiveItem1(talker, 12766, 1);

} else {
myself.GiveItem1(talker, 12767, 1);

}

}
talker.flag = 0;
myself.Despawn();

}

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(334);
if (timer_id == 2336007) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(334);
myself.AddTimerEx(2336007, 120 * 1000);
myself.Say(gg.MakeFString(33421, "", "", "", "", ""));
super;
	}


}