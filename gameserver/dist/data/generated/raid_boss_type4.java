package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_type4 extends raid_boss_party {
	protected int SelfRangeDebuff_a = -1;
	protected int SelfRangeDebuffAnother_a = -1;
	protected int DDMagic_a = -1;

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(attacker) == 0) {
if (myself.IsNullCreature(attacker) == 0 && myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.DistFromMe(attacker) < 150 && myself.DistFromMe(myself.top_desire_target) < 150 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(SelfRangeDebuff_a)) == -1 && gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(SelfRangeDebuff_a)) == -1 && attacker != myself.top_desire_target && gg.Rand(2) < 1) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDebuff_a, 0, 1, 1000000);

}
if (myself.DistFromMe(attacker) < 150 && myself.DistFromMe(myself.top_desire_target) < 150 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(SelfRangeDebuffAnother_a)) == -1 && gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(SelfRangeDebuffAnother_a)) == -1 && attacker != myself.top_desire_target && gg.Rand(5) < 1) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDebuffAnother_a, 0, 1, 1000000);

}

}

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(attacker, DDMagic_a, 0, 1, 1000000);

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (myself.IsNullCreature(speller) == 0) {
if (myself.IsNullCreature(speller) == 0 && myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.DistFromMe(speller) < 150 && myself.DistFromMe(myself.top_desire_target) < 150 && gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(SelfRangeDebuff_a)) == -1 && gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(SelfRangeDebuff_a)) == -1 && speller != myself.top_desire_target && gg.Rand(2) < 1) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDebuff_a, 0, 1, 1000000);

}
if (myself.DistFromMe(speller) < 150 && myself.DistFromMe(myself.top_desire_target) < 150 && gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(SelfRangeDebuffAnother_a)) == -1 && gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(SelfRangeDebuffAnother_a)) == -1 && speller != myself.top_desire_target && gg.Rand(5) < 1) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDebuffAnother_a, 0, 1, 1000000);

}

}

}
if (gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(speller, DDMagic_a, 0, 1, 1000000);

}
super;
	}


}