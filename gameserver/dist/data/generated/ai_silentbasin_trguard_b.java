package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_silentbasin_trguard_b extends default_npc {
	protected int IsAggressive = 1;
	protected int AttackRange = 2;
	protected int MovingAttack = 0;
	protected int Skill01_MainAttack = 1;
	protected int Skill01_ID = 272433162;
	protected int drop_item = 13799;

	protected void CREATED(HandlerParam creature) {
myself.AddTimerEx(2519002, 10 * 1000);
	}

	protected void CLAN_ATTACKED(HandlerParam attacker) {
if (attacker.summon_type == 1 || attacker.summon_type == 2) {
myself.AddAttackDesire(attacker.master, 0, 20000);
myself.AddUseSkillDesire(attacker.master, Skill01_ID, 0, 0, 50000000);

} else {
myself.AddAttackDesire(attacker, 0, 20000);
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, 50000000);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.summon_type == 1 || creature.summon_type == 2) {
myself.AddAttackDesire(creature.master, 0, 20000);
myself.AddUseSkillDesire(creature.master, Skill01_ID, 0, 0, 50000000);

} else {
myself.AddAttackDesire(creature, 0, 20000);
myself.AddUseSkillDesire(creature, Skill01_ID, 0, 0, 50000000);

}
	}

	protected void ATTACKED(HandlerParam attacker) {
if (attacker.summon_type == 1 || attacker.summon_type == 2) {
myself.AddAttackDesire(attacker.master, 0, 20000);
myself.AddUseSkillDesire(attacker.master, Skill01_ID, 0, 0, 50000000);

} else {
myself.AddAttackDesire(attacker, 0, 20000);
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, 50000000);

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (attacker.summon_type == 1 || attacker.summon_type == 2) {
myself.AddAttackDesire(attacker.master, 0, 20000);
myself.AddUseSkillDesire(attacker.master, Skill01_ID, 0, 0, 50000000);

} else {
myself.AddAttackDesire(attacker, 0, 20000);
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, 50000000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2519001) {
myself.SetVisible(0);
myself.Suicide();

}
if (timer_id == 2519002) {
myself.CreateOnePrivateEx(1018693, "ai_silentbasin_treasure", 0, 0, myself.sm.param1, myself.sm.param2, myself.sm.param3, 0, 0, 0, 0);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 10101010) {
if (script_event_arg2 == 5) {
myself.SetVisible(0);
myself.Suicide();

}
if (script_event_arg2 == 1) {
myself.AddTimerEx(2519001, 60 * 1000);

}

}
	}


}