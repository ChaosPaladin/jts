package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_portarea extends warrior_basic {
	protected int FieldCycle2 = 1;
	protected int FieldCycle2_Condition = 101;
	protected int FieldCycle2_Quantity = 10;
	protected int Threshold_Level_Min2 = 1;
	protected int Threshold_Level_Max2 = 2;
	protected int Threshold_Point_Min2 = -1;
	protected int Threshold_Point_Max2 = 1000000000;

	protected void CREATED() {
myself.AddTimerEx(1300, 10000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 1300) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (myself.IsMyBossAlive() == 0 && i0 < Threshold_Level_Min || i0 > Threshold_Level_Max) {
if (myself.IsInCombatMode(myself.sm) == 0) {
myself.Despawn();

}

}

} else if (timer_id == 1399) {
myself.Despawn();

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == 302383113 && success == 1) {
myself.Despawn();

}
super;
	}

	protected void PARTY_DIED(HandlerParam attacker, HandlerParam private, HandlerParam i0, HandlerParam i1) {
if (private == myself.boss && myself.sm.alive != 0) {
if (FieldCycle2 != -1 && FieldCycle2_Condition == 101) {
i0 = gg.GetStep_FieldCycle(FieldCycle2);
if (i0 >= Threshold_Level_Min2 && i0 <= Threshold_Level_Max2) {
gg.AddPoint_FieldCycle(FieldCycle2, FieldCycle2_Quantity, 3, attacker);

}
myself.RemoveAllDesire();
myself.Say(gg.MakeFString(1800024, "", "", "", "", ""));
myself.AddTimerEx(1399, 1500);

}

}
super;
	}


}