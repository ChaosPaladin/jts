package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_is_tumor_active extends default_npc {
	protected int type = 0;
	protected int start_hp_rate = 59;
	protected int regen_value = 5;
	protected int FieldCycle = 3;
	protected int FieldCycle_Quantity = 750;
	protected int room_number = 0;
	protected String AreaName01 = "is1_attack_room1_mob_buff1";
	protected String AreaName02 = "is1_attack_room1_mob_buff2";
	protected String AreaName03 = "is1_attack_room1_mob_buff3";
	protected String AreaName04 = "is1_attack_room1_mob_buff4";
	protected String AreaName05 = "is1_attack_room1_mob_buff5";
	protected String AreaName11 = "is1_defence_room1_mob_buff1";
	protected String AreaName12 = "is1_defence_room1_mob_buff2";
	protected String AreaName13 = "is1_defence_room1_mob_buff3";
	protected String AreaName14 = "is1_defence_room1_mob_buff4";
	protected String AreaName15 = "is1_defence_room1_mob_buff5";
	protected String unactive_tumor_maker = "room1_mobm2";
	protected int babble_mode = 0;

	protected void CREATED(HandlerParam i0, HandlerParam maker0, HandlerParam f0) {
myself.i_ai0 = 0;
if (type == 1) {
gg.SetNpcParam(myself.sm, 9, myself.sm.max_hp / 100 * 39);
myself.BroadcastScriptEvent(998917, 0, 6000);

} else if (type == 0) {
gg.SetNpcParam(myself.sm, 9, myself.sm.max_hp / 100 * start_hp_rate);

}
myself.AddTimerEx(1001, 10 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam maker0) {
if (timer_id == 1001) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 80) {
gg.Area_SetOnOffEx(AreaName01, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName02, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName03, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName04, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName05, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName11, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName12, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName13, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName14, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName15, 1, myself.InstantZone_GetId());
if (babble_mode == 1) {
myself.Say("80% > areadata 작동");

}

} else if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 60) {
gg.Area_SetOnOffEx(AreaName01, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName02, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName03, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName04, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName05, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName11, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName12, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName13, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName14, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName15, 0, myself.InstantZone_GetId());
if (babble_mode == 1) {
myself.Say("60% > areadata 작동");

}

} else if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 40) {
gg.Area_SetOnOffEx(AreaName01, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName02, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName03, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName04, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName05, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName11, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName12, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName13, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName14, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName15, 0, myself.InstantZone_GetId());
if (babble_mode == 1) {
myself.Say("40% > areadata 작동");

}

} else if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 20) {
gg.Area_SetOnOffEx(AreaName01, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName02, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName03, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName04, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName05, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName11, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName12, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName13, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName14, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName15, 0, myself.InstantZone_GetId());
if (babble_mode == 1) {
myself.Say("20% > areadata 작동");

}

} else if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 0) {
gg.Area_SetOnOffEx(AreaName01, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName02, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName03, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName04, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName05, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName11, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName12, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName13, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName14, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName15, 0, myself.InstantZone_GetId());
if (babble_mode == 1) {
myself.Say("0% > areadata 작동");

}

}
myself.AddTimerEx(1001, 10 * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0, HandlerParam f0, HandlerParam f1) {
if (script_event_arg1 == 98914) {
c0 = gg.GetCreatureFromIndex(script_event_arg3);
gg.SetNpcParam(myself.sm, 35, myself.sm.hp_regen + regen_value);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 998915, 0);

}

} else if (script_event_arg1 == 9898903) {
i0 = script_event_arg2;
gg.SetNpcParam(myself.sm, 35, myself.sm.hp_regen - i0 * regen_value);

} else if (script_event_arg1 == 998916 && type == 1) {
myself.BroadcastScriptEvent(998916, 0, 6000);
myself.Despawn();

}
	}

	protected void MY_DYING(HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, unactive_tumor_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.BroadcastScriptEvent(989812, 0, 600);
gg.Area_SetOnOffEx(AreaName01, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName02, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName03, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName04, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName05, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName11, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName12, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName13, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName14, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(AreaName15, 0, myself.InstantZone_GetId());
	}


}