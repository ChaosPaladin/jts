package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_pylon extends default_npc {
	protected int beam_of_fix = 359989249;
	protected int FieldCycle = 1;
	protected int FieldCycle_Condition = 0;
	protected int FieldCycle_Quantity = 7;
	protected int Threshold_Level_Min = 6;
	protected int Threshold_Level_Max = 6;
	protected int Threshold_Point_Min = 1400000;
	protected int Threshold_Point_Max = 1490000;
	protected String Privates = "";

	protected void CREATED() {
myself.CreatePrivates(Privates);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0) {
if (script_event_arg1 == 2245587) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddUseSkillDesire(c0, beam_of_fix, 1, 0, 1000000);

}

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam c0) {
if (FieldCycle != -1 && FieldCycle_Condition == 0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
i1 = gg.GetPoint_FieldCycle(FieldCycle);
c0 = myself.GetLastAttacker();
if (Threshold_Level_Min >= i0 && Threshold_Level_Max <= i0) {
if (Threshold_Point_Min <= i1 && Threshold_Point_Max >= i1) {
if (myself.IsNullCreature(c0) == 0) {
gg.AddPoint_FieldCycle(FieldCycle, FieldCycle_Quantity, 1, c0);

} else {
gg.AddPoint_FieldCycle(FieldCycle, FieldCycle_Quantity, 1, myself.sm);

}

}

}

}
	}


}