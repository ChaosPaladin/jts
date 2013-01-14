package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class chest_of_shyslassys extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 211) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Challenger (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "chest_of_shyslassys_q0211_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(211);
if (timer_id == 21121) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(211);
myself.AddTimerEx(21121, 1000 * 200);
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam reply, HandlerParam talker) {
if (ask == 211) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 211) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 2632) == 1) {
if (gg.Rand(10) < 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "chest_of_shyslassys_q0211_03.htm");
myself.DeleteItem1(talker, 2632, 1);
myself.SoundEffect(talker, "ItemSound.quest_jackpot");
i0 = gg.Rand(100);
if (i0 > 90) {
myself.GiveItem1(talker, 2918, 1);
myself.GiveItem1(talker, 2927, 1);
myself.GiveItem1(talker, 1943, 1);
myself.GiveItem1(talker, 1946, 1);
myself.GiveItem1(talker, 1940, 1);

} else if (i0 > 70) {
myself.GiveItem1(talker, 2030, 1);
myself.GiveItem1(talker, 1904, 1);

} else if (i0 > 40) {
myself.GiveItem1(talker, 1936, 1);

} else {
myself.GiveItem1(talker, 1940, 1);

}

}

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "chest_of_shyslassys_q0211_02.htm");
i1 = gg.Rand(1000) + 1;
myself.GiveItem1(talker, 57, i1);
myself.DeleteItem1(talker, 2632, 1);

}

} else {
myself.ShowPage(talker, "chest_of_shyslassys_q0211_04.htm");

}

}

}
super;
	}


}