package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_type5 extends raid_boss_party {
	protected int RangeHold_a = -1;

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(RangeHold_a)) == -1 && gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(attacker, RangeHold_a, 0, 1, 1000000);

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(RangeHold_a)) == -1 && gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(speller, RangeHold_a, 0, 1, 1000000);

}
super;
	}


}