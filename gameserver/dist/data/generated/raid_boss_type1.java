package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_type1 extends raid_boss_alone {
	protected int PhysicalSpecial_a = -1;
	protected int SelfRangePhysicalSpecial_a = -1;
	protected int SelfBuff_a = -1;
	protected int SelfRangeCancel_a = -1;

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
if (gg.Rand(5) < 1) {
myself.AddUseSkillDesire(myself.sm, SelfBuff_a, 1, 1, 1000000);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(attacker) == 0 && myself.IsNullCreature(myself.top_desire_target) == 0) {
if (attacker == myself.top_desire_target && gg.Rand(15) < 1) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial_a, 0, 1, 1000000);

}
if (attacker != myself.top_desire_target && myself.DistFromMe(attacker) < 150 && gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(myself.sm, SelfRangePhysicalSpecial_a, 0, 1, 1000000);

}
if (myself.DistFromMe(attacker) < 150 && gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(myself.sm, SelfRangeCancel_a, 0, 1, 1000000);

}

}

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (myself.IsNullCreature(speller) == 0 && myself.IsNullCreature(myself.top_desire_target) == 0) {
if (speller == myself.top_desire_target && gg.Rand(15) < 1) {
myself.AddUseSkillDesire(speller, PhysicalSpecial_a, 0, 1, 1000000);

}
if (speller != myself.top_desire_target && myself.DistFromMe(speller) < 150 && gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(myself.sm, SelfRangePhysicalSpecial_a, 0, 1, 1000000);

}
if (myself.DistFromMe(speller) < 150 && gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(myself.sm, SelfRangeCancel_a, 0, 1, 1000000);

}

}
super;
	}


}