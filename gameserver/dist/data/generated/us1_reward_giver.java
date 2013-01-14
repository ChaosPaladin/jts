package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class us1_reward_giver extends default_npc {
	protected int type = 0;
	protected String fnHi = "ai_is_time_attack_reward001.htm";

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = myself.sm.param1;
myself.i_ai2 = myself.sm.param2;
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (myself.i_ai2 == 0) {
if (gg.HaveMemo(talker, 694) == 1 && gg.GetMemoState(talker, 694) == 2 && myself.i_quest0 != 1) {
if (myself.i_ai1 < 22 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0694_01.htm");
myself.SetMemoStateEx(talker, 694, 1, 11);

} else if (myself.i_ai1 <= 23 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0694_02.htm");
myself.SetMemoStateEx(talker, 694, 1, 12);

} else if (myself.i_ai1 <= 24 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0694_03.htm");
myself.SetMemoStateEx(talker, 694, 1, 13);

} else if (myself.i_ai1 <= 25 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0694_04.htm");
myself.SetMemoStateEx(talker, 694, 1, 14);

} else if (myself.i_ai1 <= 26 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0694_05.htm");
myself.SetMemoStateEx(talker, 694, 1, 15);

} else if (myself.i_ai1 <= 27 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0694_06.htm");
myself.SetMemoStateEx(talker, 694, 1, 16);

} else if (myself.i_ai1 <= 28 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0694_07.htm");
myself.SetMemoStateEx(talker, 694, 1, 17);

} else if (myself.i_ai1 <= 29 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0694_08.htm");
myself.SetMemoStateEx(talker, 694, 1, 18);

} else if (myself.i_ai1 <= 30 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0694_09.htm");
myself.SetMemoStateEx(talker, 694, 1, 19);

} else if (myself.i_ai1 > 30 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0694_10.htm");
myself.SetMemoStateEx(talker, 694, 1, 20);

}

} else if (myself.i_quest0 == 1) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0694_13.htm");

}

} else if (myself.i_ai2 == 1) {
if (gg.HaveMemo(talker, 695) == 1 && gg.GetMemoState(talker, 695) == 2 && myself.i_quest0 != 1) {
if (myself.i_ai1 < 20 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0695_01.htm");
myself.SetMemoStateEx(talker, 695, 1, 11);

} else if (myself.i_ai1 <= 21 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0695_02.htm");
myself.SetMemoStateEx(talker, 695, 1, 12);

} else if (myself.i_ai1 <= 22 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0695_03.htm");
myself.SetMemoStateEx(talker, 695, 1, 13);

} else if (myself.i_ai1 <= 23 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0695_04.htm");
myself.SetMemoStateEx(talker, 695, 1, 14);

} else if (myself.i_ai1 <= 24 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0695_05.htm");
myself.SetMemoStateEx(talker, 695, 1, 15);

} else if (myself.i_ai1 <= 25 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0695_06.htm");
myself.SetMemoStateEx(talker, 695, 1, 16);

} else if (myself.i_ai1 <= 26 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0695_07.htm");
myself.SetMemoStateEx(talker, 695, 1, 17);

} else if (myself.i_ai1 <= 27 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0695_08.htm");
myself.SetMemoStateEx(talker, 695, 1, 18);

} else if (myself.i_ai1 <= 28 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0695_09.htm");
myself.SetMemoStateEx(talker, 695, 1, 19);

} else if (myself.i_ai1 > 28 * 60) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0695_10.htm");
myself.SetMemoStateEx(talker, 695, 1, 20);

}

} else if (myself.i_quest0 == 1) {
myself.ShowPage(talker, "ai_is_time_attack_reward_q0695_13.htm");

}

}
if (talker.master) {
c1 = talker.master;

}
i1 = gg.Party_GetCount(talker);
i2 = myself.InstantZone_GetId();
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = gg.Party_GetCreature(talker, i0);
gg.SendUIEvent(c0, 1, 0, 0, "1", "1", "1", "경과 시간 : ", "60", "0");

}
	}


}