package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_couple_captain extends party_leader {
	protected int SummonMagic = 458752001;
	protected int silhouette = 1020130;
	protected String ai_type = "warrior";

	protected void ATTACKED(HandlerParam attacker, HandlerParam i6) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.c_ai0 = attacker;
i6 = gg.Rand(100);
if (myself.DistFromMe(attacker) > 300 && i6 < 20) {
if (myself.Skill_GetConsumeMP(SummonMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SummonMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SummonMagic) == 0) {
myself.AddUseSkillDesire(attacker, SummonMagic, 0, 1, 1000000);

}

} else if (myself.DistFromMe(attacker) > 100 && i6 < 50) {
if (myself.Skill_GetConsumeMP(SummonMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SummonMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SummonMagic) == 0) {
myself.AddUseSkillDesire(attacker, SummonMagic, 0, 1, 1000000);

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam success, HandlerParam skill_name_id) {
if (skill_name_id == SummonMagic && success == 1) {
myself.InstantTeleport(myself.c_ai0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z));
myself.AddAttackDesire(myself.c_ai0, 1, 100000);

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (myself.sm != private) {
if (myself.sm.hp > myself.sm.max_hp * 0.700000) {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(myself.top_desire_target), myself.GetLifeTime());
myself.Despawn();

}

}
	}


}