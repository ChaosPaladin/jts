package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_solina_knight extends warrior_physicalspecial_buff {
	protected int Buff = 413728769;
	protected int PhysicalSpecial = 413663233;
	protected int TIMER = 555;

	protected void CREATED() {
myself.i_ai3 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam i1, HandlerParam h0, HandlerParam c0) {
if (gg.Rand(100) < 20 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 50 && myself.i_ai4 == 0) {
myself.i_ai4 = 1;
c0 = attacker;
if (myself.IsNullCreature(c0) == 0) {
myself.CreateOnePrivateEx(1018909, "ai_solina_warrior", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(c0), 0);
myself.Say(gg.MakeFString(60013, "", "", "", "", ""));
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 1000000);

}

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0) {
if (script_event_arg1 == 21140014 && gg.Rand(100) < 10 && myself.i_ai3 == 0) {
switch (gg.Rand(3)) {
case 0: {
myself.Say(gg.MakeFString(60014, "", "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(60015, "", "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(60016, "", "", "", "", ""));
break;

}

}
myself.i_ai3 = 1;
myself.AddTimerEx(TIMER, 10 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIMER) {
myself.i_ai3 = 0;

}
	}


}