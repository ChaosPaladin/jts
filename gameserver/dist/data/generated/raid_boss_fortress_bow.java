package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_fortress_bow extends warrior_fortress_officer {
	protected int skill00_id = 458752001;
	protected int skill00_prob = 33;
	protected int focus_group = 3;
	protected int msg_see_creature = -1;
	protected int msg_see_spell = -1;

	protected void SEE_CREATURE(HandlerParam creature) {
super;
if (creature.is_pc != 0 && gg.Rand(100) < skill00_prob && myself.IsInCategory(focus_group, creature.occupation) == 1) {
if (msg_see_creature > 0) {
myself.Shout(gg.MakeFString(msg_see_creature, "", "", "", "", ""));

}
myself.RemoveAllAttackDesire();
if (myself.Skill_GetConsumeMP(skill00_id) < myself.sm.mp && myself.Skill_GetConsumeHP(skill00_id) < myself.sm.hp && myself.Skill_InReuseDelay(skill00_id) == 0) {
myself.AddUseSkillDesire(creature, skill00_id, 0, 1, 1000000);

}

}
	}

	protected void SEE_SPELL(HandlerParam speller) {
super;
if (speller.is_pc != 0 && gg.Rand(100) < skill00_prob && myself.IsInCategory(focus_group, speller.occupation) == 1) {
if (msg_see_spell > 0) {
myself.Shout(gg.MakeFString(msg_see_spell, "", "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(skill00_id) < myself.sm.mp && myself.Skill_GetConsumeHP(skill00_id) < myself.sm.hp && myself.Skill_InReuseDelay(skill00_id) == 0) {
myself.AddUseSkillDesire(speller, skill00_id, 0, 1, 1000000);

}

}
	}


}