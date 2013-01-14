package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boom_eye extends default_air_monster {
	protected int Skill01_Target = 3;
	protected int Skill01_AttackSplash = 1;
	protected int Skill01_ID = 381026305;

	protected void CREATED(HandlerParam i0, HandlerParam c0) {
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
myself.c_ai0 = c0;
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 2000);
myself.AddTimerEx(2000, 10000);

} else {
return;

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam i0, HandlerParam f0, HandlerParam i1, HandlerParam c0) {
if (myself.i_ai0 == 1) {
myself.Suicide();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2000) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.RemoveAllDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.i_ai0 = 1;
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, 100000000);

}
if (myself.DistFromMe(myself.c_ai0) > 2000) {
myself.Suicide();

}
if (myself.DistFromMe(myself.c_ai0) < 400) {
myself.i_ai0 = 1;
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, 100000000);

}

}
myself.AddTimerEx(2000, 500);
	}


}