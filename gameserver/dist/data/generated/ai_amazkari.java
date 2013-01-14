package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_amazkari extends wizard_basic {
	protected int FieldCycle = 1;
	protected int FieldCycle_Condition = 0;
	protected int FieldCycle_Quantity = 50;
	protected int Threshold_Level_Min = 10;
	protected int Threshold_Level_Max = 100;
	protected int BUFF01_ID = 303562753;
	protected int BUFF02_ID = 303562754;
	protected int BUFF03_ID = 303562755;
	protected int INVIN01_ID = 355008513;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 1;
myself.i_ai2 = 0;
myself.c_ai0 = gg.GetNullCreature();
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.Say(gg.MakeFString(1800124, "", "", "", "", ""));
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(BUFF01_ID)) >= 3 && myself.i_ai1 == 1) {
myself.Say(gg.MakeFString(1800127, "", "", "", "", ""));
myself.i_ai1 = 0;
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, INVIN01_ID, 1, 1, 10000000000);
myself.AddTimerEx(78001, 10 * 1000);

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(BUFF01_ID)) == 2) {
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, BUFF03_ID, 1, 1, 10000000000);

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(BUFF01_ID)) == 1) {
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, BUFF02_ID, 1, 1, 10000000000);

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(BUFF01_ID)) <= 0) {
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, BUFF01_ID, 1, 1, 10000000000);

} else {
gg.SetNpcParam(myself.sm, 9, myself.sm.hp + myself.sm.hp / 5);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
if (timer_id == 78001) {
if (myself.i_ai1 == 0) {
myself.Say(gg.MakeFString(1800125, "", "", "", "", ""));
myself.i_ai1 = 1;
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, INVIN01_ID, 1, 1, 10000000000);

}

} else if (timer_id == 78002) {
c0 = myself.c_ai0;
if (myself.IsNullCreature(c0) == 0) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z));
myself.Say(gg.MakeFString(1000152, "", "", "", "", ""));

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
if (gg.Rand(1000) < 25) {
myself.Say(gg.MakeFString(1000105, "", "", "", "", ""));
myself.BroadcastScriptEventEx(78010028, gg.GetIndexFromCreature(attacker), gg.GetIndexFromCreature(attacker), 600);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 78010001) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);
myself.AddTimerEx(78002, 25 * 1000);

}
super;
	}

	protected void MY_DYING(HandlerParam attacker) {
if (myself.IsNullCreature(attacker) == 0) {
myself.BroadcastScriptEventEx(78010029, gg.GetIndexFromCreature(attacker), gg.GetIndexFromCreature(attacker), 1500);

}
super;
	}


}