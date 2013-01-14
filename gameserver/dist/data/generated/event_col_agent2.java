package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_col_agent2 extends citizen {
	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 996) {
myself.SetCurrentQuestID(996);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 996) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 6402)) {
myself.ShowPage(talker, "event_col_agent2_q0996_05.htm");

} else if (gg.OwnItemCount(talker, 6401)) {
myself.ShowPage(talker, "event_col_agent2_q0996_04.htm");

} else if (gg.OwnItemCount(talker, 6400)) {
myself.ShowPage(talker, "event_col_agent2_q0996_03.htm");

} else if (gg.OwnItemCount(talker, 6399)) {
myself.ShowPage(talker, "event_col_agent2_q0996_02.htm");

} else {
myself.ShowPage(talker, "event_col_agent2_q0996_01.htm");

}

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 6401)) {
if (gg.OwnItemCount(talker, 6393) >= 40) {
myself.ShowPage(talker, "event_col_agent2_q0996_11.htm");
talker.flag = gg.Rand(2) + 1;

} else {
myself.ShowPage(talker, "event_col_agent2_q0996_12.htm");

}

} else if (gg.OwnItemCount(talker, 6400)) {
if (gg.OwnItemCount(talker, 6393) >= 20) {
myself.ShowPage(talker, "event_col_agent2_q0996_11.htm");
talker.flag = gg.Rand(2) + 1;

} else {
myself.ShowPage(talker, "event_col_agent2_q0996_12.htm");

}

} else if (gg.OwnItemCount(talker, 6399)) {
if (gg.OwnItemCount(talker, 6393) >= 10) {
myself.ShowPage(talker, "event_col_agent2_q0996_11.htm");
talker.flag = gg.Rand(2) + 1;

} else {
myself.ShowPage(talker, "event_col_agent2_q0996_12.htm");

}

} else if (gg.OwnItemCount(talker, 6393) >= 5) {
myself.ShowPage(talker, "event_col_agent2_q0996_11.htm");
talker.flag = gg.Rand(2) + 1;

} else {
myself.ShowPage(talker, "event_col_agent2_q0996_12.htm");

}

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 6401)) {
if (gg.OwnItemCount(talker, 6393) >= 40) {
if (talker.flag == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6402, 1);
myself.DeleteItem1(talker, 6401, 1);
myself.DeleteItem1(talker, 6393, 40);
myself.ShowPage(talker, "event_col_agent2_q0996_24.htm");

}

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6393, 40);
myself.ShowPage(talker, "event_col_agent2_q0996_25.htm");

}

} else {
myself.ShowPage(talker, "event_col_agent2_q0996_26.htm");

}
talker.flag = 0;

} else if (gg.OwnItemCount(talker, 6400)) {
if (gg.OwnItemCount(talker, 6393) >= 20) {
if (talker.flag == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6401, 1);
myself.DeleteItem1(talker, 6400, 1);
myself.DeleteItem1(talker, 6393, 20);
myself.ShowPage(talker, "event_col_agent2_q0996_23.htm");

}

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6393, 20);
myself.ShowPage(talker, "event_col_agent2_q0996_25.htm");

}

} else {
myself.ShowPage(talker, "event_col_agent2_q0996_26.htm");

}
talker.flag = 0;

} else if (gg.OwnItemCount(talker, 6399)) {
if (gg.OwnItemCount(talker, 6393) >= 10) {
if (talker.flag == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6400, 1);
myself.DeleteItem1(talker, 6399, 1);
myself.DeleteItem1(talker, 6393, 10);
myself.ShowPage(talker, "event_col_agent2_q0996_22.htm");

}

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6393, 10);
myself.ShowPage(talker, "event_col_agent2_q0996_25.htm");

}

} else {
myself.ShowPage(talker, "event_col_agent2_q0996_26.htm");

}
talker.flag = 0;

} else {
if (gg.OwnItemCount(talker, 6393) >= 5) {
if (talker.flag == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6399, 1);
myself.DeleteItem1(talker, 6393, 5);
myself.ShowPage(talker, "event_col_agent2_q0996_21.htm");

}

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6393, 5);
myself.ShowPage(talker, "event_col_agent2_q0996_25.htm");

}

} else {
myself.ShowPage(talker, "event_col_agent2_q0996_26.htm");

}
talker.flag = 0;

}

}
if (reply == 4) {
if (gg.OwnItemCount(talker, 6401)) {
if (gg.OwnItemCount(talker, 6393) >= 40) {
if (talker.flag == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6402, 1);
myself.DeleteItem1(talker, 6401, 1);
myself.DeleteItem1(talker, 6393, 40);
myself.ShowPage(talker, "event_col_agent2_q0996_34.htm");

}

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6393, 40);
myself.ShowPage(talker, "event_col_agent2_q0996_35.htm");

}

} else {
myself.ShowPage(talker, "event_col_agent2_q0996_26.htm");

}
talker.flag = 0;

} else if (gg.OwnItemCount(talker, 6400)) {
if (gg.OwnItemCount(talker, 6393) >= 20) {
if (talker.flag == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6401, 1);
myself.DeleteItem1(talker, 6400, 1);
myself.DeleteItem1(talker, 6393, 20);
myself.ShowPage(talker, "event_col_agent2_q0996_33.htm");

}

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6393, 20);
myself.ShowPage(talker, "event_col_agent2_q0996_35.htm");

}

} else {
myself.ShowPage(talker, "event_col_agent2_q0996_26.htm");

}
talker.flag = 0;

} else if (gg.OwnItemCount(talker, 6399)) {
if (gg.OwnItemCount(talker, 6393) >= 10) {
if (talker.flag == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6400, 1);
myself.DeleteItem1(talker, 6399, 1);
myself.DeleteItem1(talker, 6393, 10);
myself.ShowPage(talker, "event_col_agent2_q0996_32.htm");

}

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6393, 10);
myself.ShowPage(talker, "event_col_agent2_q0996_35.htm");

}

} else {
myself.ShowPage(talker, "event_col_agent2_q0996_26.htm");

}
talker.flag = 0;

} else {
if (gg.OwnItemCount(talker, 6393) >= 5) {
if (talker.flag == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6399, 1);
myself.DeleteItem1(talker, 6393, 5);
myself.ShowPage(talker, "event_col_agent2_q0996_31.htm");

}

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6393, 5);
myself.ShowPage(talker, "event_col_agent2_q0996_35.htm");

}

} else {
myself.ShowPage(talker, "event_col_agent2_q0996_26.htm");

}
talker.flag = 0;

}

}

}
super;
	}


}