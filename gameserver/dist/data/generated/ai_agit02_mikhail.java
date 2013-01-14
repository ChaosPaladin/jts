package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_agit02_mikhail extends default_npc {
	protected void NO_DESIRE() {
myself.AddDoNothingDesire(5, 5);
	}

	protected void CREATED() {
myself.Shout(gg.MakeFString(1000276, "", "", "", "", ""));
myself.i_ai0 = 0;
myself.AddTimerEx(1001, 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
if (myself.InMyTerritory(myself.sm) == 0 && gg.Rand(3) < 1) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z));
myself.RemoveAllAttackDesire();

}
if (gg.Rand(5) < 1) {
myself.RandomizeAttackDesire();

}
myself.AddTimerEx(1001, 60 * 1000);

}
if (timer_id == 1002) {

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (gg.Rand(3) < 1 && myself.Skill_InReuseDelay(277676033) == 0) {
if (myself.Skill_GetConsumeMP(277676033) < myself.sm.mp && myself.Skill_GetConsumeHP(277676033) < myself.sm.hp && myself.Skill_InReuseDelay(277676033) == 0) {
myself.AddUseSkillDesire(attacker, 277676033, 0, 1, 1000000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * damage * private.weight_point / 1000000);

}
if (myself.boss.hp < myself.boss.max_hp / 20 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.AddUseSkillDesire(myself.sm, 277544961, 1, 1, 10000000000);
myself.Say(gg.MakeFString(1000279, "", "", "", "", ""));

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == 277544961) {
myself.InstantTeleport(myself.sm, 177134, -18807, -2263);
myself.RemoveAllAttackDesire();
myself.AddTimerEx(1002, 3000);

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target) {
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
if (myself.p_state == 3 && myself.top_desire_target == target) {
myself.AddAttackDesire(speller, 1, myself.Skill_GetEffectPoint(skill_name_id) / myself.sm.max_hp / 0.050000 * 150);

}

}
if (myself.GetPathfindFailCount() > 10 && speller == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(speller.x), gg.FloatToInt(speller.y), gg.FloatToInt(speller.z));

}
	}


}