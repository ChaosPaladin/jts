package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_xmas_turkey extends default_npc {
	protected int PHASE_START_ID = 3301;
	protected int PHASE_RESULT_ID = 3302;
	protected int PHASE_WAIT_ID1 = 3303;
	protected int PHASE_WAIT_ID2 = 3304;
	protected int PHASE_DESPAWN = 3305;
	protected int PHASE_DESPAWN_READY = 3306;
	protected int PHASE_COUNT = 3307;
	protected int PHASE_ANI = 3308;
	protected int PHASE_READY_END = 3309;
	protected int PHASE_DEFEAT = 3310;
	protected int event_stop = 0;

	protected void CREATED() {
myself.Shout(gg.MakeFString(1900000, "", "", "", "", ""));
myself.BroadcastSystemMessage(myself.sm, 0, 6503);
myself.AddTimerEx(PHASE_WAIT_ID1, 10000);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = -1;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.AddTimerEx(PHASE_COUNT, 60000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == PHASE_DESPAWN) {
myself.BroadcastSystemMessage(myself.sm, 0, 6505);
myself.Despawn();

}
if (timer_id == PHASE_COUNT && myself.i_ai3 >= 0) {
myself.i_ai3 = myself.i_ai3 + 1;
if (myself.i_ai3 < myself.sm.param3) {
myself.AddTimerEx(PHASE_COUNT, 60000);

}

}
if (timer_id == PHASE_DEFEAT) {
gg.SendScriptEvent(myself.boss, 1, 0);
myself.BroadcastSystemMessage(myself.sm, 0, 6504);
myself.Suicide();

}
if (myself.i_ai3 == -1) {
return;

}
if (myself.GetGlobalMap(100) == event_stop) {
myself.i_ai3 = myself.sm.param3;

}
if (timer_id == PHASE_START_ID) {
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(1900001, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1900002, "", "", "", "", ""));

}
myself.AddUseSkillDesire(myself.sm, 1508638721, 1, 0, 1000000);
myself.AddTimerEx(PHASE_ANI, 6000);
myself.AddTimerEx(PHASE_READY_END, 8500);
myself.i_ai1 = 1;
myself.i_ai4 = 0;

}
if (timer_id == PHASE_RESULT_ID) {
if (myself.i_ai0 == 2) {
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(1900011, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1900012, "", "", "", "", ""));

}
myself.AddUseSkillDesire(myself.sm, 223150081, 1, 0, 1000000);
myself.AddTimerEx(PHASE_DEFEAT, 3000);

} else {
if (myself.i_ai0 == 1) {
if (gg.Rand(100) < 50) {
if (gg.Rand(100) < 30) {
myself.Say(gg.MakeFString(1900007, "", "", "", "", ""));
myself.PlayAnimation(0, 600);

} else if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(1900010, "", "", "", "", ""));
myself.PlayAnimation(2, 600);

} else {
myself.Say(gg.MakeFString(1900008, "", "", "", "", ""));
myself.PlayAnimation(2, 600);

}

} else {
myself.Say(gg.MakeFString(1900009, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, 1508507649, 1, 0, 1000000);

}

} else {
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(1900005, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1900006, "", "", "", "", ""));

}
myself.PlayAnimation(0, 600);

}
myself.i_ai1 = 0;
myself.AddTimerEx(PHASE_WAIT_ID1, 8000);

}

}
if (timer_id == PHASE_WAIT_ID1) {
i0 = gg.Rand(100);
if (myself.i_ai3 >= myself.sm.param3) {
myself.Say(gg.MakeFString(1900025, "", "", "", "", ""));
myself.PlayAnimation(1, 600);
myself.AddTimerEx(PHASE_DESPAWN, 5000);
myself.i_ai3 = -1;
return;

} else if (myself.i_ai3 >= myself.sm.param3 - 2) {
myself.Say(gg.MakeFString(1900026, "", "", "", "", ""));
myself.PlayAnimation(3, 600);

} else if (i0 < 40) {
myself.Say(gg.MakeFString(1900013, "", "", "", "", ""));

} else if (i0 < 70) {
myself.Say(gg.MakeFString(1900014, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1900015, "", "", "", "", ""));
myself.PlayAnimation(3, 600);

}
myself.AddTimerEx(PHASE_WAIT_ID2, 6000);

}
if (timer_id == PHASE_WAIT_ID2) {
myself.PlayAnimation(0, 600);
myself.AddTimerEx(PHASE_START_ID, 5000);

}
if (timer_id == PHASE_ANI) {
myself.PlayAnimation(4, 600);

}
if (timer_id == PHASE_READY_END) {
if (myself.i_ai1 == 1) {
myself.i_ai1 = 2;
myself.i_ai2 = gg.Rand(30) % 3 + 1;
if (myself.i_ai2 == 1) {
myself.AddUseSkillDesire(myself.sm, 1508704257, 1, 0, 1000000);

} else if (myself.i_ai2 == 2) {
myself.AddUseSkillDesire(myself.sm, 1508704258, 1, 0, 1000000);

} else if (myself.i_ai2 == 3) {
myself.AddUseSkillDesire(myself.sm, 1508704259, 1, 0, 1000000);

}
if (gg.Rand(2) < 1) {
myself.Say(gg.MakeFString(1900003, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1900004, "", "", "", "", ""));

}
myself.i_ai0 = 0;
myself.LookNeighbor(600);
myself.AddTimerEx(PHASE_RESULT_ID, 10000);

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id) {
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id, HandlerParam damage) {
if (myself.i_ai1 == 1 && myself.i_ai4 < 30) {
if (skill_name_id == 1377173505) {
myself.CastBuffForQuestReward(attacker, 1508573185);
myself.i_ai4 = myself.i_ai4 + 1;

} else if (skill_name_id == 1377239041) {
myself.CastBuffForQuestReward(attacker, 1508573186);
myself.i_ai4 = myself.i_ai4 + 1;

} else if (skill_name_id == 1377304577) {
myself.CastBuffForQuestReward(attacker, 1508573187);
myself.i_ai4 = myself.i_ai4 + 1;

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i2 = 0;
i0 = gg.GetAbnormalMagicLevel(creature, myself.Skill_GetAbnormalType(1508573185));
if (i0 > 0) {
myself.Dispel(creature, myself.Skill_GetAbnormalType(1508573185));
if (i0 == 1) {
if (myself.i_ai2 == 1) {
i2 = 0;

} else if (myself.i_ai2 == 2) {
i2 = 1;

} else if (myself.i_ai2 == 3) {
i2 = -1;

}

} else if (i0 == 2) {
if (myself.i_ai2 == 1) {
i2 = -1;

} else if (myself.i_ai2 == 2) {
i2 = 0;

} else if (myself.i_ai2 == 3) {
i2 = 1;

}

} else if (i0 == 3) {
if (myself.i_ai2 == 1) {
i2 = 1;

} else if (myself.i_ai2 == 2) {
i2 = -1;

} else if (myself.i_ai2 == 3) {
i2 = 0;

}

}

}
i1 = gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(1508769793));
if (i2 == 1) {
i1 = 0;
myself.CastBuffForQuestReward(creature, 1508835329);
if (gg.Rand(100) < 30) {
myself.CastBuffForQuestReward(creature, 300023809);

}

} else if (i2 == -1) {
if (i1 <= 0) {
myself.CastBuffForQuestReward(creature, 1508769793);
i1 = 1;

} else {
myself.CastBuffForQuestReward(creature, 1508769793 + i1);
i1 = i1 + 1;

}

}
if (myself.i_ai0 < 1 && i1 >= myself.sm.param1) {
myself.i_ai0 = 1;

}
if (myself.i_ai0 < 2 && i1 >= myself.sm.param2) {
myself.i_ai0 = 2;
myself.RegisterGlobalMap(101, creature.id);

}
	}


}