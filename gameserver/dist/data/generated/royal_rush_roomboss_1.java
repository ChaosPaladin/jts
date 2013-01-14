package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_roomboss_1 extends royal_rush_roomboss_basic {
	protected int RangeDDMagic1 = 264241153;
	protected int SelfDeBuff1 = 266403841;
	protected int SelfDeBuff2 = 266403841;
	protected int SelfDeBuff3 = 266403841;

	protected void CREATED() {
myself.i_ai0 = 0;
if (myself.Skill_GetConsumeMP(SelfDeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfDeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfDeBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfDeBuff1, 1, 1, 1000000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(RangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(RangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, RangeDDMagic1, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void CLAN_DIED(HandlerParam victim, HandlerParam i0) {
if (victim != myself.sm) {
switch (myself.i_ai0) {
case 2: {
if (myself.Skill_GetConsumeMP(SelfDeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfDeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfDeBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfDeBuff1, 0, 1, 1000000);

}
break;

}
case 4: {
if (myself.Skill_GetConsumeMP(SelfDeBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfDeBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(SelfDeBuff2) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfDeBuff2, 0, 1, 1000000);

}
break;

}
case 6: {
if (myself.Skill_GetConsumeMP(SelfDeBuff3) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfDeBuff3) < myself.sm.hp && myself.Skill_InReuseDelay(SelfDeBuff3) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfDeBuff3, 0, 1, 1000000);

}
break;

}

}
myself.i_ai0 = myself.i_ai0 + 1;

}
super;
	}


}