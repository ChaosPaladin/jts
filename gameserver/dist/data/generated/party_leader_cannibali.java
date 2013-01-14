package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_cannibali extends party_leader {
	protected int PhysicalSpecial1 = 458752001;
	protected int EffectSkill2 = 458752001;
	protected int EffectSkill = 458752001;
	protected int SummonMagic = 458752001;
	protected int buff = 458752001;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai3 = 0;
myself.c_ai0 = myself.sm;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam private, HandlerParam i6) {
myself.c_ai0 = attacker;
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 1000);

}
if (myself.sm.hp < myself.sm.max_hp * 0.500000 && myself.i_ai1 == 0) {
if (myself.Skill_GetConsumeMP(buff) < myself.sm.mp && myself.Skill_GetConsumeHP(buff) < myself.sm.hp && myself.Skill_InReuseDelay(buff) == 0) {
myself.AddUseSkillDesire(myself.sm, buff, 1, 0, 1000000);

}
myself.i_ai1 = 1;

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial1, 0, 1, 1000000);

}

}
if (myself.DistFromMe(attacker) > 300 && myself.DistFromMe(attacker) < 1000 && gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(SummonMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SummonMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SummonMagic) == 0) {
myself.AddUseSkillDesire(attacker, SummonMagic, 0, 1, 1000000);

}

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam i0) {
if (private != myself.sm) {
if (private.hp < private.max_hp / 3) {
myself.i_ai3 = 1;
myself.c_ai1 = private;

}

}
if (private == myself.sm) {
if (myself.sm.hp < myself.sm.max_hp * 0.700000 && myself.i_ai3 == 1 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
if (myself.Skill_GetConsumeMP(EffectSkill) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill) == 0) {
myself.AddUseSkillDesire(myself.c_ai1, EffectSkill, 1, 1, 1000000);

}

}
if (myself.sm.hp < myself.sm.max_hp / 3 && private.alive && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
if (myself.Skill_GetConsumeMP(EffectSkill2) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill2) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill2) == 0) {
myself.AddUseSkillDesire(myself.sm, EffectSkill2, 1, 0, 1000000);

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == SummonMagic && myself.IsNullCreature(myself.c_ai0) == 0 && myself.DistFromMe(myself.c_ai0) < 1000 && gg.Rand(100) < 10) {
myself.InstantTeleport(myself.c_ai0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z));
myself.AddAttackDesire(myself.c_ai0, 1, 100000);

}
if (skill_name_id == EffectSkill) {
myself.CreateOnePrivateEx(1022626, "warrior_ag_casting_3skill_approach", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(myself.c_ai0), myself.GetLifeTime());
myself.Despawn();
myself.BroadcastScriptEvent(10028, gg.GetIndexFromCreature(myself.sm), 500);

}
if (skill_name_id == EffectSkill2) {
myself.BroadcastScriptEvent(10028, gg.GetIndexFromCreature(myself.sm), 500);

}
	}


}