package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class statue_of_offering extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 501) == 1 && gg.GetMemoState(myself.Pledge_GetLeader(talker), 501) == 2) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Proof of Clan Alliance (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 501) != 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Proof of Clan Alliance (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 501) == 1 && gg.GetMemoState(myself.Pledge_GetLeader(talker), 501) == 2) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.is_pledge_master == 0) {
if (talker.level >= 40) {
if (talker.flag != 2501) {
myself.ShowPage(talker, "statue_of_offering_q0501_01.htm");

} else {
myself.ShowPage(talker, "statue_of_offering_q0501_01b.htm");

}

} else {
myself.ShowPage(talker, "statue_of_offering_q0501_02.htm");

}

} else {
myself.ShowPage(talker, "statue_of_offering_q0501_01a.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 501) != 1) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "statue_of_offering_q0501_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(501);
if (timer_id == 2501010) {
if (myself.c_quest0.alive == 0) {
if (myself.GetCurrentTick() - myself.c_quest0.quest_last_reward_time > 1 && myself.c_quest0.flag != 2501) {
myself.c_quest0.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(myself.c_quest0, 3837, 1);
myself.c_quest0.flag = 2501;

}

}

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 501) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 501) {
if (reply == 1) {
if (gg.Rand(10) > 5) {
myself.ShowPage(talker, "statue_of_offering_q0501_04.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && talker.flag != 2501) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3837, 1);
talker.flag = 2501;

}

} else {
myself.c_quest0 = talker;
myself.AddUseSkillDesire(talker, 267583489, 0, 0, 100000);
myself.ShowPage(talker, "statue_of_offering_q0501_03.htm");
myself.AddTimerEx(2501010, 4 * 1000);

}

} else if (reply == 2) {
myself.ShowPage(talker, "statue_of_offering_q0501_05.htm");

}

}
super;
	}


}