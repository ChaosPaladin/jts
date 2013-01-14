package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_wd_corpse_necro extends party_leader_wizard_dd2 {
	protected int SummonPrivate = 1020130;
	protected String SummonPrivateAI = "warrior";
	protected int ClearCorpse = 262209537;
	protected int DDMagic1 = 262209537;
	protected int DDmagic2 = 262209537;

	protected void CREATED() {
myself.AddTimerEx(3456, 5000);
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
super;
return;

}
if (creature.alive == 0) {
if (myself.p_state == 3 && gg.Rand(100) < 50 && myself.DistFromMe(creature) < 100) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
myself.CreateOnePrivateEx(SummonPrivate, SummonPrivateAI, 0, 0, gg.FloatToInt(creature.x), gg.FloatToInt(creature.y), gg.FloatToInt(creature.z), 0, 1000, gg.GetIndexFromCreature(myself.top_desire_target), 0);
if (myself.Skill_GetConsumeMP(ClearCorpse) < myself.sm.mp && myself.Skill_GetConsumeHP(ClearCorpse) < myself.sm.hp && myself.Skill_InReuseDelay(ClearCorpse) == 0) {
myself.AddUseSkillDesire(creature, ClearCorpse, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3456) {
myself.LookNeighbor(200);
myself.AddTimerEx(3456, 5000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam i1, HandlerParam f0) {
super;
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.i_ai0 == 0) {
if (myself.top_desire_target == attacker) {
if (gg.Rand(100) < 33 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 40) {
if (myself.Skill_GetConsumeMP(DDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic1, 0, 1, 1000000);

}

}

}

}

}

}
super;
	}


}