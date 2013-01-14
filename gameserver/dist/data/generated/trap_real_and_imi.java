package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trap_real_and_imi extends default_trap {
	protected String DoorName = "trap_real_and_imi_door_default";
	protected int IsDetected = 0;
	protected int IsDefused = 0;
	protected int IsItemCheck = 0;
	protected String maker_name = "innadril22_2422_036m1";
	protected String b_time_maker_name1 = "innadril22_2422_036m3";
	protected String b_time_maker_name2 = "innadril22_2422_037m3";
	protected String b_time_maker_name3 = "innadril22_2422_038m3";
	protected String b_time_maker_name4 = "innadril22_2422_039m2";

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
super;
	}

	protected void TRAP_STEP_IN(HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam c1, HandlerParam maker0) {
c0 = gg.GetCreatureFromID(i0);
if (myself.i_ai0 == 0) {
party0 = gg.GetParty(c0);
if (myself.IsNullParty(party0) == 0) {
myself.i_ai1 = party0.member_count;
myself.i_ai0 = 1;
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}

}
if (myself.i_ai1 >= myself.i_ai2) {
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343105)) <= 0) {
myself.i_ai2 = myself.i_ai2 + 1;
myself.CastBuffForQuestReward(c0, 343343105);

}

}
if (myself.i_ai1 == myself.i_ai2) {
myself.DefuseWorldTrapByClassId(myself.sm.id, myself.sm.class_id);

}
	}


}