package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_downtown_native extends default_npc {
	protected String fnHi = "downtown_native001.htm";
	protected String fnHi2 = "downtown_native002.htm";
	protected int Skill01_ID = 302514177;
	protected int FieldCycle = 1;
	protected int FieldCycle_Condition = 104;
	protected int FieldCycle_Quantity = 10;
	protected int Threshold_Level_Min = 10;
	protected int Threshold_Level_Max = 10;
	protected int Threshold_Point_Min = -1;
	protected int Threshold_Point_Max = 1000000000;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, 10000000000);
myself.AddTimerEx(78002, 357 * 1000);
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (myself.i_ai0 == 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnHi2);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam maker0, HandlerParam i0, HandlerParam i1) {
if (ask == -7801) {
if (reply == 1) {
if (myself.i_ai0 == 0) {
myself.Say(gg.MakeFString(1000503, "", "", "", "", "") + " " + gg.MakeFString(1800120, "", "", "", "", ""));
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID));
myself.BroadcastScriptEvent(78010001, gg.GetIndexFromCreature(myself.sm), 5000);
myself.AddTimerEx(78001, 3 * 1000);
myself.i_ai0 = 1;
if (FieldCycle != -1 && FieldCycle_Condition == 104) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = gg.GetPoint_FieldCycle(FieldCycle);
if (i0 >= Threshold_Level_Min && i0 <= Threshold_Level_Max) {
if (i1 >= Threshold_Point_Min && i1 <= Threshold_Point_Max) {
gg.AddPoint_FieldCycle(FieldCycle, FieldCycle_Quantity, 1, talker);

}

}

}

} else {
myself.Say(gg.MakeFString(1000503, "", "", "", "", "") + " " + gg.MakeFString(1800121, "", "", "", "", ""));

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 78010029) {
myself.i_ai0 = 1;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 78001) {
myself.Despawn();

} else if (timer_id == 78002) {
if (myself.i_ai0 == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, 10000000);

}

}
	}


}