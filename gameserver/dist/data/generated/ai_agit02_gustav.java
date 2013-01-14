package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_agit02_gustav extends default_npc {
	protected void NO_DESIRE() {
myself.AddDoNothingDesire(5, 5);
	}

	protected void CREATED() {
myself.Shout(gg.MakeFString(1000275, "", "", "", "", ""));
myself.sm.weight_point = 100;
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.CreateOnePrivateEx(1035409, "mikhail", 10, 5, 178304, -17712, -2194, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035408, "dietrich", 10, 5, 178306, -17535, -2195, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178178, -17346, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178110, -17768, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178132, -17683, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178180, -17953, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178147, -17172, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178056, -17424, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178120, -17331, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178124, -17577, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178159, -18138, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178396, -18050, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178078, -17917, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178261, -17269, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178152, -18063, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178025, -17541, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035416, "ai_agit02_doom_knight_agit_party", 10, 5, 178285, -18013, -2226, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178112, -17968, -2221, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178079, -18092, -2221, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178039, -17732, -2221, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178224, -18025, -2221, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178111, -17510, -2221, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178088, -17620, -2221, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178059, -17223, -2221, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178043, -17325, -2221, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178311, -17946, -2221, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178170, -17885, -2221, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178317, -18097, -2221, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178099, -17823, -2221, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178290, -17335, -2221, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178116, -17386, -2221, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1035413, "ai_agit02_doom_archer_agit_party", 10, 5, 178169, -17266, -2221, 32768, 0, 0, 0);
myself.AddTimerEx(1001, 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
if (myself.InMyTerritory(myself.sm) == 0 && gg.Rand(3) < 1) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllAttackDesire();

}
if (gg.Rand(5) < 1) {
myself.RandomizeAttackDesire();

}
myself.AddTimerEx(1001, 60 * 1000);

}
if (timer_id == 1002) {
myself.Suicide();
myself.i_ai1 = 1;

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (gg.Rand(3) < 1 && myself.Skill_InReuseDelay(277610497) == 0) {
if (myself.Skill_GetConsumeMP(277610497) < myself.sm.mp && myself.Skill_GetConsumeHP(277610497) < myself.sm.hp && myself.Skill_InReuseDelay(277610497) == 0) {
myself.AddUseSkillDesire(attacker, 277610497, 0, 1, 1000000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * damage * private.weight_point / 10000);

}
if (myself.sm.hp < myself.sm.max_hp / 20 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.AddUseSkillDesire(myself.sm, 277544961, 1, 1, 10000000000);
myself.Say(gg.MakeFString(1000278, "", "", "", "", ""));

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

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm && myself.i_ai1 != 1) {
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, 300);

}
	}


}