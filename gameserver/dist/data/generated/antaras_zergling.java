package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class antaras_zergling extends warrior {
	protected int SelfRangeDDMagic = 330432513;
	protected int Dispel_Debuff = 1;

	protected void CREATED() {
myself.AddMoveToDesire(gg.FloatToInt(myself.sm.param1), gg.FloatToInt(myself.sm.param2), -7704, 1000000);
	}

	protected void MOVE_TO_FINISHED(HandlerParam i1, HandlerParam i2, HandlerParam c2) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 2000000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.DistFromMe(attacker) < 230) {
if (attacker.alive == 1) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 2000000);

}

} else {
myself.RemoveAllDesire();
myself.AddAttackDesire(attacker, 1, 200);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
myself.AddTimerEx(1100, 1000);
if (creature.is_pc == 1 && creature.alive == 1) {
if (myself.DistFromMe(creature) < 230) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 2000000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 1100) {
myself.LookNeighbor(200);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 12013) {
myself.Despawn();

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam success, HandlerParam skill_name_id) {
if (SelfRangeDDMagic != 0) {
if (skill_name_id == SelfRangeDDMagic) {
if (success == 1) {
myself.Suicide();

}

}

}
super;
	}


}