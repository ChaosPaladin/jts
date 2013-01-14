package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class e_big_pig_leader extends default_npc {
	protected int event_animal = 12;
	protected int event_coin = 9142;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
if (event_animal == 1) {
myself.CreateOnePrivateEx(1013122, "e_big_pig_private", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1013122, "e_big_pig_private", 0, 0, gg.FloatToInt(myself.sm.x + 20), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1013122, "e_big_pig_private", 0, 0, gg.FloatToInt(myself.sm.x + 40), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1013122, "e_big_pig_private", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 20), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else {
myself.CreateOnePrivateEx(1013033, "e_big_pig_private", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1013033, "e_big_pig_private", 0, 0, gg.FloatToInt(myself.sm.x + 20), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1013033, "e_big_pig_private", 0, 0, gg.FloatToInt(myself.sm.x + 40), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1013033, "e_big_pig_private", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 20), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
myself.AddMoveAroundDesire(40, 20);
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(40, 20);
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (myself.i_ai1 == 0) {
if (event_animal == 1) {
myself.Say(gg.MakeFString(MakeFString + 124, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800017, "", "", "", "", ""));

}
myself.i_ai1 = 1;

}
myself.StopMove();
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 12501) {
myself.i_ai0 = myself.i_ai0 + 1;
if (myself.i_ai0 == 4) {
if (myself.Skill_GetConsumeMP(341049345) < myself.sm.mp && myself.Skill_GetConsumeHP(341049345) < myself.sm.hp && myself.Skill_InReuseDelay(341049345) == 0) {
myself.AddUseSkillDesire(myself.sm, 341049345, 1, 1, 1000000);

}
myself.AddTimerEx(1001, 2000);
myself.AddTimerEx(1002, 1000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.Despawn();

}
if (timer_id == 1002) {
if (event_animal == 1) {
myself.CreateOnePrivateEx(1013123, "e_super_big_pig", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else {
myself.CreateOnePrivateEx(1013034, "e_super_big_pig", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

}
	}


}