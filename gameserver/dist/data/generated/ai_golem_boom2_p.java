package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_golem_boom2_p extends default_npc {
	protected int HateClassGroup1 = 100;
	protected double HateClassGroup1Boost = 80.000000;
	protected int Skill01_ID = 0;
	protected int Skill02_ID = 0;

	protected void CREATED() {
myself.AddTimerEx(1000, 1000);
myself.i_ai9 = 0;
myself.i_ai0 = 0;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, 1000000);
myself.AddTimerEx(1000, 3000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam party0, HandlerParam c0, HandlerParam i0) {
if (myself.DistFromMe(attacker) > 50 && myself.DistFromMe(attacker) < 2000 && myself.sm.alive == 1) {
myself.AddFollowDesire2(attacker, 100, 0, 0, 0);

} else if (myself.DistFromMe(attacker) <= 50 && attacker.alive == 1) {
if (myself.i_ai0 == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, 1000000);
myself.i_ai0 = 1;

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.DistFromMe(creature) > 50 && myself.DistFromMe(creature) < 2000 && myself.sm.alive == 1) {
if (myself.i_ai9 == 1) {
myself.Say("가자!!");

}
myself.AddFollowDesire2(creature, 100, 0, 0, 0);

} else if (myself.DistFromMe(creature) <= 50) {
if (myself.i_ai9 == 1) {
myself.Say("자폭!!");

}
if (myself.i_ai0 == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, 1000000);
myself.i_ai0 = 1;

}

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private) {
if (private == myself.boss) {
if (myself.DistFromMe(attacker) > 50 && myself.DistFromMe(attacker) < 2000 && myself.sm.alive == 1) {
if (myself.i_ai9 == 1) {
myself.Say("가자!!");

}
myself.AddFollowDesire2(attacker, 100, 0, 0, 0);

} else if (myself.DistFromMe(attacker) <= 50 && attacker.alive == 1) {
if (myself.i_ai9 == 1) {
myself.Say("연막!!");

}
if (myself.i_ai0 == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, 1000000);
myself.i_ai0 = 1;

}

}

} else if (private.npc_class_id != myself.sm.npc_class_id) {
if (myself.DistFromMe(attacker) > 50 && myself.DistFromMe(attacker) < 2000 && myself.sm.alive == 1) {
if (myself.i_ai9 == 1) {
myself.Say("가자!!");

}
myself.AddFollowDesire2(attacker, 100, 0, 0, 0);

} else if (myself.DistFromMe(attacker) <= 50) {
if (myself.i_ai9 == 1) {
myself.Say("연막!!");

}
if (myself.i_ai0 == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, 1000000);
myself.i_ai0 = 1;

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 10029) {
myself.Despawn();

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam success) {
myself.i_ai0 = 0;
	}

	protected void DEBUG_AI(HandlerParam reply) {
myself.i_ai9 = reply;
	}


}