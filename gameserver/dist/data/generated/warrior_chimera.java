package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_chimera extends warrior_basic {
	protected int GiveItem1 = -1;
	protected int GiveItem2 = -1;
	protected int GiveItem1_Rate = 80;
	protected int FieldCycle = 1;
	protected int FieldCycle_Condition = 102;
	protected int FieldCycle_Quantity = 3;
	protected int Threshold_Level_Min = 7;
	protected int Threshold_Level_Max = 7;
	protected int Threshold_Point_Min = -1;
	protected int Threshold_Point_Max = 1000000000;

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id, HandlerParam i0, HandlerParam party0, HandlerParam c0, HandlerParam i1) {
if (skill_name_id == 154599425) {
if (myself.sm.hp < myself.sm.max_hp * 0.100000) {
i0 = gg.Rand(100);
if (i0 < GiveItem1_Rate) {
if (GiveItem1 == -1) {

} else {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 >= Threshold_Level_Min && i0 <= Threshold_Level_Max) {
gg.AddPoint_FieldCycle(FieldCycle, FieldCycle_Quantity, 2, attacker);

}
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
i1 = gg.Rand(party0.member_count);
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c0) == 0) {
myself.DropItem2(myself.sm, GiveItem1, 1, c0.id);

} else {
myself.DropItem2(myself.sm, GiveItem1, 1, attacker.id);

}

} else {
myself.DropItem2(myself.sm, GiveItem1, 1, attacker.id);

}
myself.Despawn();

}

} else if (GiveItem2 == -1) {

} else {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 >= Threshold_Level_Min && i0 <= Threshold_Level_Max) {
gg.AddPoint_FieldCycle(FieldCycle, FieldCycle_Quantity, 2, attacker);

}
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
i1 = gg.Rand(party0.member_count);
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c0) == 0) {
myself.DropItem2(myself.sm, GiveItem2, 1, c0.id);

} else {
myself.DropItem2(myself.sm, GiveItem2, 1, attacker.id);

}

} else {
myself.DropItem2(myself.sm, GiveItem2, 1, attacker.id);

}
myself.Despawn();

}

}

}
super;
	}


}