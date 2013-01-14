package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class e_super_big_pig extends e_big_pig {
	protected int event_animal = 12;
	protected int Boss_Skill1 = 342032385;
	protected int Boss_Skill2 = 342097921;
	protected int Debuff1 = 341180417;
	protected int Debuff2 = 341245953;
	protected int event_coin = 9142;

	protected void CREATED() {
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.c_ai4 = gg.GetNullCreature();
myself.c_quest0 = gg.GetNullCreature();
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(40, 20);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (myself.sm.hp <= myself.sm.max_hp * 0.500000 && myself.i_ai0 == 0) {
if (gg.Rand(100) < 40 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(267124737)) == -1 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(264634369)) == -1) {
i0 = gg.Rand(100);
if (i0 > 90) {
if (event_animal == 1) {
myself.Say(gg.MakeFString(MakeFString + 124, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800014, "", "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(Boss_Skill1) < myself.sm.mp && myself.Skill_GetConsumeHP(Boss_Skill1) < myself.sm.hp && myself.Skill_InReuseDelay(Boss_Skill1) == 0) {
myself.AddUseSkillDesire(attacker, Boss_Skill1, 0, 1, 1000000);

}
myself.i_ai0 = 1;
myself.AddTimerEx(1001, 15000);

} else if (gg.Rand(100) > 80) {
if (event_animal == 1) {
myself.Say(gg.MakeFString(MakeFString + 124, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800015, "", "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(Boss_Skill2) < myself.sm.mp && myself.Skill_GetConsumeHP(Boss_Skill2) < myself.sm.hp && myself.Skill_InReuseDelay(Boss_Skill2) == 0) {
myself.AddUseSkillDesire(attacker, Boss_Skill2, 0, 1, 1000000);

}
myself.i_ai0 = 1;
myself.AddTimerEx(1001, 15000);

} else if (gg.Rand(100) > 60) {

} else {
if (gg.Rand(100) < 50) {
if (event_animal == 1) {
myself.Say(gg.MakeFString(MakeFString + 124, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800019, "", "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(Debuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(Debuff2) < myself.sm.hp && myself.Skill_InReuseDelay(Debuff2) == 0) {
myself.AddUseSkillDesire(attacker, Debuff2, 0, 1, 1000000);

}

} else {
if (event_animal == 1) {
myself.Say(gg.MakeFString(MakeFString + 124, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800019, "", "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(Debuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(Debuff1) < myself.sm.hp && myself.Skill_InReuseDelay(Debuff1) == 0) {
myself.AddUseSkillDesire(attacker, Debuff1, 0, 1, 1000000);

}

}
myself.i_ai0 = 1;
myself.AddTimerEx(1001, 15000);

}

} else {
myself.AddFleeDesire(attacker, 15);

}

} else {
myself.AddFleeDesire(attacker, 15);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.i_ai0 = 0;

} else if (timer_id == 1002) {
myself.i_ai4 = 0;

} else if (timer_id == 2001) {

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam victim, HandlerParam i0) {
if (victim != myself.sm && myself.i_ai4 == 0) {
myself.i_ai1 = gg.FloatToInt(victim.x);
myself.i_ai2 = gg.FloatToInt(victim.y);
myself.i_ai3 = gg.FloatToInt(victim.z);
myself.i_ai4 = 1;
i0 = gg.Rand(100);
if (i0 < 60) {
i0 = 60;

}
myself.AddTimerEx(1002, i0 * 1000);

}
	}

	protected void CLAN_DIED(HandlerParam victim, HandlerParam i0) {
if (victim != myself.sm) {
myself.i_ai1 = gg.FloatToInt(victim.x);
myself.i_ai2 = gg.FloatToInt(victim.y);
myself.i_ai3 = gg.FloatToInt(victim.z);

}
	}

	protected void MY_DYING() {
if (gg.Rand(100) < 50) {
if (event_animal == 1) {
myself.Say(gg.MakeFString(MakeFString + 124, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800021, "", "", "", "", ""));

}

} else if (event_animal == 1) {
myself.Say(gg.MakeFString(1800018, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800018, "", "", "", "", ""));

}
	}


}