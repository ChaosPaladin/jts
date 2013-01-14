package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class agit_warrior extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 500.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected int Dest_X = 83311;
	protected int Dest_Y = -16331;
	protected int Dest_Z = -1840;
	protected int Use_Privates = 0;
	protected String Privates = "orc;party_private;1;10sec";

	protected void CREATED() {
myself.AddTimerEx(2001, gg.Rand(6) + 5 * 1000);
if (Use_Privates == 1) {
myself.sm.weight_point = 10;
myself.CreatePrivates(Privates);

}
myself.i_ai0 = 0;
myself.AddTimerEx(2002, 5000);
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
myself.LookNeighbor(300);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
myself.AddMoveToDesire(Dest_X + gg.Rand(400), Dest_Y + gg.Rand(400), Dest_Z, 5);

}
if (timer_id == 2002 && myself.i_ai0 == 0) {
myself.AddTimerEx(2002, 5000);

}
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(5, 5);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0) {
if (attacker.level > myself.sm.level + 8 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(357564417)) == -1) {
myself.AddUseSkillDesire(attacker, 357564417, 0, 1, 1000000);
myself.RemoveAttackDesire(attacker.id);

}
if (myself.IsInCategory(12, attacker.npc_class_id) != 0 && attacker.master.pledge_id == myself.sm.pledge_id) {

} else if (attacker.pledge_id != myself.sm.pledge_id || attacker.pledge_id == 0) {
if (attacker.is_pc == 1) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 100);

} else {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 10);

}
if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(264241158) < myself.sm.mp && myself.Skill_GetConsumeHP(264241158) < myself.sm.hp && myself.Skill_InReuseDelay(264241158) == 0) {
myself.AddUseSkillDesire(attacker, 264241158, 0, 1, 1000000);

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (Use_Privates == 0) {
if (myself.IsInCategory(12, creature.npc_class_id) != 0 && creature.master.pledge_id == myself.sm.pledge_id) {

} else if (creature.pledge_id != myself.sm.pledge_id || creature.pledge_id == 0) {
myself.AddAttackDesire(creature, 1, 200);
myself.i_ai0 = 1;

}

}
	}


}