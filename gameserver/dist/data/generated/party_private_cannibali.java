package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_cannibali extends party_private {
	protected int PhysicalSpecial1 = 458752001;
	protected int PhysicalSpecial2 = 458752001;

	protected void CREATED() {
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam i6) {
if (myself.IsMyBossAlive() && myself.DistFromMe(myself.boss) > 200) {
myself.AddMoveToDesire(gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z), 1000);

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial1, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000000);

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 10028) {
myself.Despawn();

}
	}


}