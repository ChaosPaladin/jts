package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss07_cannon extends warrior_ag_hold_ddmagic {
	protected int DDMagic = 436207617;
	protected int DDMagic2 = 458752001;
	protected int Skill_Heal = 436273153;
	protected int SkillRange = 1000;
	protected int babble_mode = 0;

	protected void CREATED(HandlerParam c0) {
myself.c_ai0 = gg.GetCreatureFromID(myself.sm.param1);
myself.AddTimerEx(3001, 15 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3001) {
if (myself.boss.alive == 1 && myself.boss.db_value == 3) {
myself.AddTimerEx(3001, 60 * 1000);
if (myself.DistFromMe(myself.boss) <= SkillRange) {
if (babble_mode) {
myself.Shout("발라카스 힐!");

}
if (myself.Skill_GetConsumeMP(Skill_Heal) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill_Heal) < myself.sm.hp && myself.Skill_InReuseDelay(Skill_Heal) == 0) {
myself.AddUseSkillDesire(myself.boss, Skill_Heal, 1, 1, 1000000);

}

} else if (myself.IsNullCreature(myself.c_ai0) == 0 && myself.DistFromMe(myself.c_ai0) <= SkillRange) {
if (babble_mode) {
myself.Shout("PC 공격!");

}
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, DDMagic, 0, 1, 1000000);

}

} else {
if (babble_mode) {
myself.Shout("범위 공격!");

}
if (myself.Skill_GetConsumeMP(DDMagic2) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic2) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic2) == 0) {
myself.AddUseSkillDesire(myself.sm, DDMagic2, 0, 1, 1000000);

}

}

} else {
myself.Despawn();

}

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private) {
super;
if (private == myself.boss && myself.IsNullCreature(attacker) == 0) {
if (babble_mode) {
myself.Shout("타겟변경:" + attacker.name);

}
myself.c_ai0 = attacker;

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
super;
if (myself.IsNullCreature(creature) == 0 && myself.DistFromMe(creature) <= SkillRange) {
myself.c_ai0 = creature;
if (babble_mode) {
myself.Shout("발견:" + creature.name);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id) {
super;
if (babble_mode) {
myself.Shout("skillfinished:" + skill_name_id / 256 * 256);

}
	}


}