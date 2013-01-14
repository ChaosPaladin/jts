package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class combat_monster extends default_npc {
	protected int basic_hate = 100;
	protected int Skill01_ID = 458752001;
	protected int Skill01_Probability = 30;
	protected int Skill01_Target_Type = 0;
	protected int Skill02_ID = 458752001;
	protected int Skill02_Probability = 30;
	protected int Skill02_Target_Type = 0;
	protected int Skill03_ID = 458752001;
	protected int Skill03_Probability = 30;
	protected int Skill03_Target_Type = 0;
	protected int SoulShot = 0;
	protected int boss_type = 3;
	protected int babble_mode = 0;

	protected void CREATED() {
myself.AddTimerEx(8001, 4 * 1000);
myself.AddTimerEx(8008, 2 * 1000);
myself.i_ai0 = 0;
myself.SetMaxHateListSize(32);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam skill_name_id, HandlerParam i10) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;

}
myself.UseSoulShot(SoulShot);
if (attacker.is_pc == 1) {
myself.AddHateInfo(attacker, gg.FloatToInt(damage * 1), 0, 1, 1);
if (skill_name_id != 0 && myself.IsInCategory(5, attacker.occupation) == 1) {
if (babble_mode == 1) {
myself.Say("탱커는 스킬 데미지 1.5배 취급합니다.");

}
myself.AddHateInfo(attacker, gg.FloatToInt(damage * 1.500000), 0, 1, 1);

}

} else if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 1) {
if (attacker.master.alive == 1) {
if (babble_mode == 1) {
myself.Say("솬수한테 맞았습니다. 주인이 살아 있어 주인 헤이트값을 쌓습니다.");

}
myself.AddHateInfo(attacker.master, gg.FloatToInt(damage * 0.500000), 0, 1, 1);
myself.AddHateInfo(attacker, gg.FloatToInt(damage * 1), 0, 1, 1);
i10 = myself.GetHateInfoCount();
if (babble_mode == 1) {
myself.Say("헤이트 인포에 있는 값들은 총 " + i10 + "개 입니다.");

}

} else if (attacker.master.alive == 0) {
myself.AddAttackDesire(attacker, 1, 100);

}

}
	}

	protected void NO_DESIRE() {
if (myself.i_ai0 == 1) {
myself.i_ai0 = 0;

}
super;
	}

	protected void ATTACK_FINISHED(HandlerParam target) {
if (target.alive == 0 && target.is_pc == 0) {
if (myself.IsInCategory(12, target.npc_class_id) != 0) {
myself.RemoveHateInfoByCreature(target);

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0, HandlerParam i1) {
i0 = myself.Skill_GetEffectPoint(skill_name_id);
if (babble_mode == 1) {
myself.Say("SEE_SPELL 핸들러입니다. 데미지 환산 점수는 " + i0);

}
if (speller.is_pc == 1) {
if (i0 > 0) {
myself.AddHateInfo(speller, gg.FloatToInt(i0 * 0.700000), 0, 1, 1);

} else if (i0 < 0) {
myself.AddHateInfo(speller, gg.FloatToInt(i0 * -0.700000), 0, 1, 1);

}

} else if (speller.is_pc == 0 && myself.IsInCategory(12, speller.npc_class_id) == 1) {
if (i0 > 0) {
if (speller.master.alive == 1) {
myself.AddHateInfo(speller.master, gg.FloatToInt(i0 * 0.700000), 0, 1, 1);
myself.AddHateInfo(speller, gg.FloatToInt(i0 * 0.300000), 0, 1, 1);

} else if (speller.master.alive == 0) {
myself.AddAttackDesire(speller, 1, 100);

}

} else if (i0 < 0) {
if (speller.master.alive == 1) {
myself.AddHateInfo(speller.master, gg.FloatToInt(i0 * -0.700000), 0, 1, 1);
myself.AddHateInfo(speller.master, gg.FloatToInt(i0 * -0.300000), 0, 1, 1);

} else if (speller.master.alive == 0) {
myself.AddAttackDesire(speller, 1, 100);

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam party0, HandlerParam i0, HandlerParam c0, HandlerParam i12) {
if (myself.i_ai0 == 0) {
if (creature.is_pc == 1) {
myself.i_ai0 = 1;
myself.AddAttackDesire(creature, 1, 10);
myself.AddHateInfo(creature, 10, 0, 1, 1);
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
for (i0 = 0; i0 < party0.member_count; i0 = i0 + 1) {
c0 = myself.GetMemberOfParty(party0, i0);
if (gg.IsNull(c0) == 0) {
if (c0.alive == 1) {
myself.AddHateInfo(c0, basic_hate, 0, 1, 1);

} else {
myself.AddHateInfo(c0, -100, 0, 0, 0);

}

}

}

}

} else if (creature.is_pc == 0) {
myself.AddHateInfo(creature, 1, 0, 1, 1);

}

} else if (myself.i_ai0 == 1) {
if (creature.is_pc == 1) {
myself.AddHateInfo(creature, 1, 0, 1, 1);
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
for (i0 = 0; i0 < party0.member_count; i0 = i0 + 1) {
c0 = myself.GetMemberOfParty(party0, i0);
if (gg.IsNull(c0) == 0) {
myself.AddHateInfo(c0, 1, 0, 1, 1);

}

}

}

} else if (creature.is_pc == 0) {
myself.AddHateInfo(creature, 1, 0, 1, 1);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam h0, HandlerParam i0, HandlerParam i1, HandlerParam i10, HandlerParam i11) {
if (timer_id == 8001) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 3000);
if (myself.i_ai0 == 1) {
i10 = myself.GetHateInfoCount();
if (i10 > 0) {
for (i11 = 0; i11 < i10; i11 = i11 + 1) {
h0 = myself.GetHateInfoByIndex(i11);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 > 0) {
if (babble_mode == 1) {
myself.Say(h0.creature.name + " 의 헤이트 값은 " + h0.hate + " 입니다.");

}

}

}

}
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
i0 = gg.Rand(100);
if (Skill01_ID != 458752001 && i0 < Skill01_Probability) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(29622273)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(45547521)) > 0) {

} else if (Skill01_Target_Type == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, 500000);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(h0.creature, 1, 100);

}

} else if (Skill01_Target_Type == 1) {
if (myself.DistFromMe(h0.creature) < 200) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, 500000);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

} else if (Skill01_Target_Type == 2) {
i0 = myself.GetHateInfoCount();
if (i0 > 0) {
i1 = gg.Rand(i0);
h0 = myself.GetHateInfoByIndex(i1);

}
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, 500000);

} else {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
myself.RemoveAllAttackDesire();

}
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

}

} else if (Skill02_ID != 458752001 && i0 > Skill01_Probability && i0 < Skill01_Probability + Skill02_Probability) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(29622273)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(45547521)) > 0) {

} else if (Skill02_Target_Type == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, 500000);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(h0.creature, 1, 100);

}

} else if (Skill02_Target_Type == 1) {
if (myself.DistFromMe(h0.creature) < 200) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, 500000);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

} else if (Skill02_Target_Type == 2) {
i0 = myself.GetHateInfoCount();
if (i0 > 0) {
i1 = gg.Rand(i0);
h0 = myself.GetHateInfoByIndex(i1);

}
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, 500000);

} else {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
myself.RemoveAllAttackDesire();

}
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

}

} else if (Skill03_ID != 458752001 && i0 > Skill01_Probability + Skill02_Probability && i0 < Skill01_Probability + Skill02_Probability + Skill03_Probability) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(29622273)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(45547521)) > 0) {

} else if (Skill03_Target_Type == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, 500000);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(h0.creature, 1, 100);

}

} else if (Skill03_Target_Type == 1) {
if (myself.DistFromMe(h0.creature) < 200) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, 500000);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

} else if (Skill03_Target_Type == 2) {
i0 = myself.GetHateInfoCount();
if (i0 > 0) {
i1 = gg.Rand(i0);
h0 = myself.GetHateInfoByIndex(i1);

}
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, 500000);

} else {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
myself.RemoveAllAttackDesire();

}
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

}

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

}
myself.AddTimerEx(8001, 4000 + gg.Rand(1000));

} else if (timer_id == 8008) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 3000);
myself.AddTimerEx(8008, 2 * 1000);

}
	}


}