package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fairy_rupina extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 334) == 1 && talker.flag == 1) {
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
if (_from_choice == 0 || gg.HaveMemo(talker, 334) == 1 && talker.flag == 1) {
myself.SetCurrentQuestID(334);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.Rand(100) < 4) {
myself.ShowPage(talker, "fairy_rupina_q0334_01.htm");
myself.GiveItem1(talker, 931, 1);
talker.flag = 0;

} else {
myself.ShowPage(talker, "fairy_rupina_q0334_02.htm");
i0 = gg.Rand(4);
if (i0 == 0) {
myself.GiveItem1(talker, 1979, 1);

} else if (i0 == 1) {
myself.GiveItem1(talker, 1980, 1);

} else if (i0 == 2) {
myself.GiveItem1(talker, 2952, 1);

} else if (i0 == 3) {
myself.GiveItem1(talker, 2953, 1);

}
talker.flag = 0;

}
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
if (timer_id == 2336001) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(334);
myself.AddTimerEx(2336001, 120 * 1000);
myself.Say(gg.MakeFString(33420, "", "", "", "", ""));
super;
	}


}