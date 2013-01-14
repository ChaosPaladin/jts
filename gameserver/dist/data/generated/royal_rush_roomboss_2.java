package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_roomboss_2 extends royal_rush_roomboss_basic {
	protected int RangeDDMagic1 = 264241153;
	protected int SelfBuff1 = 266403841;
	protected int SelfBuff2 = 266403841;
	protected int SelfBuff3 = 266403841;

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target != attacker) {
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
if (myself.Skill_GetConsumeMP(SelfBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff1, 0, 1, 1000000);

}
break;

}
case 4: {
if (myself.Skill_GetConsumeMP(SelfBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff2) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff2, 0, 1, 1000000);

}
break;

}
case 6: {
if (myself.Skill_GetConsumeMP(SelfBuff3) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff3) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff3) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff3, 0, 1, 1000000);

}
break;

}

}
myself.i_ai0 = myself.i_ai0 + 1;

}
super;
	}


}