package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_agit02_doom_servant_agit extends warrior_aggressive_casting_ddmagic {
	protected int Unit = 0;

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(5, 5);
	}

	protected void CREATED() {
myself.AddTimerEx(3001, 1000);
myself.sm.flag = Unit;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3001) {
if (myself.InMyTerritory(myself.sm) == 0 && gg.Rand(3) < 1) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllAttackDesire();

}
if (gg.Rand(5) < 1) {
myself.RandomizeAttackDesire();

}
myself.AddTimerEx(3001, 60 * 1000);

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage, HandlerParam i6) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3 && myself.sm.flag == victim.flag) {
i6 = gg.Rand(100);
if (myself.DistFromMe(attacker) > 100 && i6 < 10) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}

}
if (myself.sm.flag == victim.flag) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 100);

}

}
	}


}