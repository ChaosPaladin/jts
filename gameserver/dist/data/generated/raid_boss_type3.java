package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_type3 extends raid_boss_party {
	protected int PhysicalSpecial_b = -1;

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && attacker == myself.top_desire_target && gg.Rand(15) < 1) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial_b, 0, 1, 1000000);

}

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (speller == myself.top_desire_target && gg.Rand(15) < 1) {
myself.AddUseSkillDesire(speller, PhysicalSpecial_b, 0, 1, 1000000);

}

}
super;
	}


}