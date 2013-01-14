package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_healer extends wizard_ddmagic2 {
	protected int Heal = 66519055;
	protected int Buff = 263979009;
	protected int DeBuff = 265748488;

	protected void CREATED() {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 1000000);

}
myself.i_ai1 = 0;
myself.i_ai2 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0) {
i0 = gg.Rand(100);
if (i0 < 33 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 50) {
if (myself.i_ai2 == 0) {
myself.AddFleeDesireEx(attacker, 500, 1000000);
if (myself.GetPathfindFailCount() > 3 && attacker == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.i_ai2 = 1;

}

} else {
super;

}

} else {
super;

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam i0) {
i0 = gg.Rand(100);
if (victim.hp > victim.max_hp / 2) {
if (i0 < 33) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(victim, Buff, 1, 1, 1000000);

}
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

}

}

} else if (i0 < 50) {
if (myself.Skill_GetConsumeMP(Heal) < myself.sm.mp && myself.Skill_GetConsumeHP(Heal) < myself.sm.hp && myself.Skill_InReuseDelay(Heal) == 0) {
myself.AddUseSkillDesire(victim, Heal, 1, 1, 1000000);

}

}
super;
	}

	protected void CLAN_DIED(HandlerParam attacker) {
myself.AddFleeDesireEx(attacker, 500, 1000000);
	}


}