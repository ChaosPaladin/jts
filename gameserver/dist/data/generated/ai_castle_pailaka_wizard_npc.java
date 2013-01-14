package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_castle_pailaka_wizard_npc extends ai_castle_pailaka_npc {
	protected void CREATED() {
super;
myself.SetMaxHateListSize(50);
	}

	protected void NO_DESIRE(HandlerParam i0, HandlerParam h0) {
i0 = myself.GetHateInfoCount();
if (i0 > 0) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.MakeAttackEvent(h0.creature, 100, 0);

}

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0) {
super;
if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 0) {
myself.AddHateInfo(attacker, gg.FloatToInt(damage), 0, 1, 1);
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullCreature(h0.creature) == 0) {
if (myself.DistFromMe(h0.creature) <= 750) {
if (Skill01_ID != 458752001) {
if (gg.Rand(100) < Skill01_Prob) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 0, 1000000);

}

}

}

}

}
if (myself.DistFromMe(h0.creature) <= 150) {
if (Skill02_ID != 458752001) {
if (gg.Rand(100) < Skill02_Prob) {
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 0, 1000000);

}

}

}

}

}
if (myself.DistFromMe(h0.creature) > 750) {
i0 = h0.hate / 2;
myself.AddHateInfo(h0.creature, i0, 0, 1, 0);

}
if (myself.sm.hp < myself.sm.max_hp / 2.000000) {
myself.BroadcastScriptEvent(2117005, gg.GetIndexFromCreature(attacker), 1000);

}

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam i0, HandlerParam f0, HandlerParam i1, HandlerParam c0) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.MakeAttackEvent(h0.creature, 100, 0);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 0) {
myself.MakeAttackEvent(attacker, damage / 2, 0);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam h0) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
if (myself.GetHateInfoCount() == 0) {
myself.AddHateInfo(creature, 500, 0, 1, 1);

} else {
myself.AddHateInfo(creature, 100, 0, 1, 1);

}
myself.MakeAttackEvent(creature, 100, 0);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam h0) {
if (script_event_arg1 == 2117004) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (myself.DistFromMe(c0) < 750) {
if (Skill01_ID != 458752001) {
if (gg.Rand(100) < Skill01_Prob) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(c0, Skill01_ID, 0, 0, 1000000);

}

}

}

}

}

}
if (script_event_arg1 == 2117006) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.MakeAttackEvent(c0, 100, 0);

}

}
super;
	}


}