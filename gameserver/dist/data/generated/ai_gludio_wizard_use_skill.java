package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_gludio_wizard_use_skill extends ai_gludio_wizard {
	protected int Hold = 458752001;

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(40, 20);
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0) {
if (myself.IsInCategory(12, creature.npc_class_id) != 0 && myself.Castle_GetPledgeState(creature.master) == 2) {

} else if (myself.Castle_GetPledgeState(creature) != 2) {
i0 = gg.Rand(10000);
if (i0 < 1) {
myself.Shout(gg.MakeFString(1800012, "", "", "", "", ""));

} else if (i0 < 2) {
myself.Shout(gg.MakeFString(1800013, "", "", "", "", ""));

}
myself.AddAttackDesire(creature, 1, 200);
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(creature, DDMagic, 0, 1, 1000000);

}

}
if (myself.sm.in_peacezone != 0) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllAttackDesire();

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.IsInCategory(12, attacker.npc_class_id) != 0 && myself.Castle_GetPledgeState(attacker.master) == 2) {

} else if (myself.Castle_GetPledgeState(attacker) != 2) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && gg.Rand(100) < 50) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && gg.Rand(100) < 25) {
if (myself.Skill_GetConsumeMP(Hold) < myself.sm.mp && myself.Skill_GetConsumeHP(Hold) < myself.sm.hp && myself.Skill_InReuseDelay(Hold) == 0) {
myself.AddUseSkillDesire(attacker, Hold, 0, 1, 1000000);

}

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.IsInCategory(12, attacker.npc_class_id) != 0 && myself.Castle_GetPledgeState(attacker.master) == 2) {

} else if (myself.Castle_GetPledgeState(attacker) != 2) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && gg.Rand(100) < 50) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && gg.Rand(100) < 25) {
if (myself.Skill_GetConsumeMP(Hold) < myself.sm.mp && myself.Skill_GetConsumeHP(Hold) < myself.sm.hp && myself.Skill_InReuseDelay(Hold) == 0) {
myself.AddUseSkillDesire(attacker, Hold, 0, 1, 1000000);

}

}

}
	}


}