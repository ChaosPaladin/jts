package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_legend_orc_ev_leader extends wizard_basic {
	protected void CREATED(HandlerParam c0) {
myself.Shout(gg.MakeFString(1800863, "", "", "", "", ""));
myself.AddTimerEx(2114001, 2 * 60 * 1000);
myself.LookNeighbor(500);
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
myself.AddAttackDesire(creature, 0, 20000);
myself.AddUseSkillDesire(creature, Skill01_ID, 0, 0, 5000000);
myself.c_ai0 = creature;
myself.AddTimerEx(2114009, 1000);
	}

	protected void ATTACKED(HandlerParam attacker) {
myself.AddAttackDesire(attacker, 0, 20000);
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, 5000000);
myself.c_ai0 = attacker;
myself.AddTimerEx(2114009, 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2114001) {
myself.CreateOnePrivateEx(1018816, "ai_legend_orc_treasure", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.SetVisible(0);
myself.Suicide();

}
if (timer_id == 2114009) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.IsNullCreature(myself.c_ai0) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, Skill01_ID, 0, 0, 5000000);
myself.AddTimerEx(2114009, 3500);

}

}
	}

	protected void MY_DYING() {
myself.Shout(gg.MakeFString(1800864, "", "", "", "", ""));
	}


}