package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class immo_mob_maker extends immo_basic_maker {
	protected int FieldCycle = 3;
	protected int FieldCycle_Quantity = 100;
	protected int supply_lv0_2nd_def = 5;
	protected int supply_lv1_2nd_def = 10;
	protected int supply_lv0 = 10;
	protected int supply_lv1 = 5;
	protected int TM_mob_increase = 78002;
	protected int TIME_mob_increase = 240;
	protected int supply_increase = 3;
	protected int supply_decrease = 1;
	protected String z2_a_sb01_mob_maker = "rumwarsha14_1424_a_sb1m2";
	protected String z2_a_sb02_mob_maker = "rumwarsha14_1424_a_sb2m2";
	protected String z2_a_sb03_mob_maker = "rumwarsha14_1424_a_sb3m2";
	protected String z2_a_sb04_mob_maker = "rumwarsha14_1424_a_sb4m2";
	protected String z2_a_tm01_mob_maker = "rumwarsha14_1424_a_t1m2";
	protected String z2_a_tm02_mob_maker = "rumwarsha14_1424_a_t2m2";
	protected String z2_a_tm03_mob_maker = "rumwarsha14_1424_a_t3m2";
	protected String z2_a_tm04_mob_maker = "rumwarsha14_1424_a_t4m2";
	protected String z2_d_sb01_mob_maker = "rumwarsha14_1424_d_sb1m2";
	protected String z2_d_sb02_mob_maker = "rumwarsha14_1424_d_sb2m2";
	protected String z2_d_sb03_mob_maker = "rumwarsha14_1424_d_sb3m2";
	protected String z2_d_sb04_mob_maker = "rumwarsha14_1424_d_sb4m2";
	protected String z2_d_tm01_mob_maker = "rumwarsha14_1424_d_t1m2";
	protected String z2_d_tm02_mob_maker = "rumwarsha14_1424_d_t2m2";
	protected String z2_d_tm03_mob_maker = "rumwarsha14_1424_d_t3m2";
	protected String z2_d_tm04_mob_maker = "rumwarsha14_1424_d_t4m2";
	protected String z3_a_tm01_mob_maker = "rumwarsha15_1424_a_t1m2";
	protected String z3_a_tm02_mob_maker = "rumwarsha15_1424_a_t2m2";
	protected String z3_a_tm03_mob_maker = "rumwarsha15_1424_a_t3m2";
	protected String z3_a_tm04_mob_maker = "rumwarsha15_1424_a_t4m2";
	protected String z3_a_tm05_mob_maker = "rumwarsha15_1424_a_t5m2";
	protected String z3_a_tm06_mob_maker = "rumwarsha15_1424_a_t6m2";
	protected String z3_d_tm01_mob_maker = "rumwarsha15_1424_d_t1m2";
	protected String z3_d_tm02_mob_maker = "rumwarsha15_1424_d_t2m2";
	protected String z3_d_tm03_mob_maker = "rumwarsha15_1424_d_t3m2";
	protected String z3_d_tm04_mob_maker = "rumwarsha15_1424_d_t4m2";
	protected String z3_d_tm05_mob_maker = "rumwarsha15_1424_d_t5m2";
	protected String z3_d_tm06_mob_maker = "rumwarsha15_1424_d_t6m2";

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam reply, HandlerParam i0, HandlerParam def0) {
myself.enabled = reply;
if (myself.enabled == 1) {
if (zone == 2 && room == 212 || room == 222 || room == 232 || room == 242) {
myself.i_ai0 = supply_lv0_2nd_def;

} else {
myself.i_ai0 = supply_lv0;

}
myself.i_ai1 = TACT_AGGRESIVE;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
if (babble_mode == 1) {
gg.Announce("#" + gg.IntToStr(room) + "created: " + gg.IntToStr(myself.i_ai0) + "/" + gg.IntToStr(myself.i_ai4) + "/" + gg.IntToStr(myself.npc_count) + "/" + gg.IntToStr(myself.maximum_npc));

}

} else {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0 && def0.npc_count > 0) {
def0.Despawn();

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (script_event_arg1 == 78010067 && myself.enabled == 1) {
if (babble_mode == 1) {
gg.Announce("#" + gg.IntToStr(room) + "mob_increase_begin");

}
gg.SendMakerScriptEvent(myself, 78010072, 0, 0);
myself.AddTimerEx(TM_mob_increase, TIME_mob_increase * 1000);

} else if (script_event_arg1 == 78010065 && myself.enabled == 1) {
if (zone == 2 && room == 212 || room == 222 || room == 232 || room == 242) {
switch (script_event_arg2) {
case 0: {
myself.i_ai0 = supply_lv0_2nd_def;
break;

}
case 1: {
myself.i_ai0 = supply_lv1_2nd_def;
break;

}
case 2: {
myself.i_ai0 = supply_lv0_2nd_def;
break;

}

}

} else {
switch (script_event_arg2) {
case 0: {
myself.i_ai0 = supply_lv1;
break;

}
case 1: {
myself.i_ai0 = supply_lv0;
break;

}

}

}
myself.i_ai1 = script_event_arg3;
if (babble_mode == 1) {
gg.Announce("#" + gg.IntToStr(room) + "renew: " + gg.IntToStr(myself.i_ai0) + "/" + gg.IntToStr(myself.i_ai4) + "/" + gg.IntToStr(myself.npc_count) + "/" + gg.IntToStr(myself.maximum_npc));

}
gg.SendMakerScriptEvent(myself, 78010072, 0, 0);

} else if (script_event_arg1 == 78010072 && myself.enabled == 1) {
if (script_event_arg2 == 0) {
i0 = myself.i_ai0 + myself.i_ai4 - myself.npc_count;

} else {
i0 = script_event_arg2;

}
if (i0 > 0 && myself.maximum_npc >= myself.npc_count + i0) {
for (i1 = 1; i1 <= i0; i1 = i1 + 1) {
if (myself.i_ai1 == TACT_AGGRESIVE) {
def0 = myself.GetSpawnDefine(gg.Rand(6));

} else if (myself.i_ai1 == TACT_DEFENSIVE) {
def0 = myself.GetSpawnDefine(gg.Rand(6) + 6);

} else if (myself.i_ai1 == TACT_INTERCEPT) {
def0 = myself.GetSpawnDefine(gg.Rand(3) + 12);

}
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, def0.respawn_rand);

}

} else if (babble_mode == 1) {
gg.Announce("올바르지 않은 def선택");

}

}
if (babble_mode == 1) {
gg.Announce("#" + gg.IntToStr(room) + "deploy(" + gg.IntToStr(i0) + "): " + gg.IntToStr(myself.i_ai0) + "/" + gg.IntToStr(myself.i_ai4) + "/" + gg.IntToStr(myself.npc_count) + "/" + gg.IntToStr(myself.maximum_npc));

}

}

} else if (script_event_arg1 == 78010060 && myself.enabled == 1) {
if (myself.maximum_npc >= myself.i_ai0 + myself.i_ai4 + myself.npc_count + supply_decrease) {
myself.i_ai4 = myself.i_ai4 + supply_decrease;
if (babble_mode == 1) {
gg.Announce("#" + gg.IntToStr(room) + "receive_supply: " + gg.IntToStr(myself.i_ai0) + "/" + gg.IntToStr(myself.i_ai4) + "/" + gg.IntToStr(myself.npc_count) + "/" + gg.IntToStr(myself.maximum_npc));

}
gg.SendMakerScriptEvent(myself, 78010072, supply_decrease, 0);

}

} else if (script_event_arg1 == 1000) {
myself.enabled = 0;
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0 && def0.npc_count > 0) {
def0.Despawn();

}

}

} else if (script_event_arg1 == 78010051 && myself.npc_count > myself.i_ai0 + myself.i_ai4) {
i1 = myself.npc_count - myself.i_ai0 + myself.i_ai4;
i2 = 0;
for (i0 = 0; i0 <= i1; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(gg.Rand(myself.def_count));
if (gg.IsNull(def0) == 0 && def0.npc_count > 0) {
i2 = i2 + def0.npc_count;
if (i2 <= i1) {
def0.Despawn();

}

}

}

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam maker0, HandlerParam def0) {
if (timer_id == TM_mob_increase && myself.enabled == 1) {
if (myself.maximum_npc >= myself.i_ai0 + myself.i_ai4 + myself.npc_count + supply_increase) {
myself.i_ai4 = myself.i_ai4 + supply_increase;
myself.i_ai3 = myself.i_ai3 + 1;
if (babble_mode == 1) {
gg.Announce("#" + gg.IntToStr(room) + "mob_increase(" + gg.IntToStr(myself.i_ai3) + "): " + gg.IntToStr(myself.i_ai0) + "/" + gg.IntToStr(myself.i_ai4) + "/" + gg.IntToStr(myself.npc_count) + "/" + gg.IntToStr(myself.maximum_npc));

}
gg.SendMakerScriptEvent(myself, 78010072, supply_increase, 0);

}
myself.AddTimerEx(TM_mob_increase, TIME_mob_increase * 1000);

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam died, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam def0, HandlerParam maker0, HandlerParam reply) {
if (died == 0 && myself.enabled == 1) {
if (myself.i_ai0 > myself.i_ai4 * -1) {
myself.i_ai4 = myself.i_ai4 - supply_decrease;
if (gg.IsSameString(myself.name, z2_a_sb01_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb02_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb03_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb04_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm01_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm02_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm03_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm04_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_a_sb02_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb03_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb04_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm01_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm02_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm03_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm04_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_a_sb03_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb04_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm01_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm02_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm03_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm04_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_a_sb04_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm01_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm02_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm03_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm04_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_a_tm01_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb04_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm02_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm03_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm04_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_a_tm02_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb04_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm01_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm03_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm04_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_a_tm03_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb04_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm01_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm02_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm04_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_a_tm04_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_sb04_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm01_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm02_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_a_tm03_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_d_sb01_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb02_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb03_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb04_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm01_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm02_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm03_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm04_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_d_sb02_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb03_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb04_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm01_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm02_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm03_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm04_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_d_sb03_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb04_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm01_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm02_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm03_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm04_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_d_sb04_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm01_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm02_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm03_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm04_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_d_tm01_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb04_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm02_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm03_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm04_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_d_tm02_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb04_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm01_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm03_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm04_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_d_tm03_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb04_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm01_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm02_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm04_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z2_d_tm04_mob_maker) == 1) {
switch (gg.Rand(7)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_sb04_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm01_mob_maker);
break;

}
case 5: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm02_mob_maker);
break;

}
case 6: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z2_d_tm03_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z3_a_tm01_mob_maker) == 1) {
switch (gg.Rand(5)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm02_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm03_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm04_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm05_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm06_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z3_a_tm02_mob_maker) == 1) {
switch (gg.Rand(5)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm03_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm04_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm05_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm06_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z3_a_tm03_mob_maker) == 1) {
switch (gg.Rand(5)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm04_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm05_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm06_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z3_a_tm04_mob_maker) == 1) {
switch (gg.Rand(5)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm05_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm06_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z3_a_tm05_mob_maker) == 1) {
switch (gg.Rand(5)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm04_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm06_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z3_a_tm06_mob_maker) == 1) {
switch (gg.Rand(5)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm04_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_a_tm05_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z3_d_tm01_mob_maker) == 1) {
switch (gg.Rand(5)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm02_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm03_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm04_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm05_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm06_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z3_d_tm02_mob_maker) == 1) {
switch (gg.Rand(5)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm03_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm04_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm05_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm06_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z3_d_tm03_mob_maker) == 1) {
switch (gg.Rand(5)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm04_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm05_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm06_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z3_d_tm04_mob_maker) == 1) {
switch (gg.Rand(5)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm05_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm06_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z3_d_tm05_mob_maker) == 1) {
switch (gg.Rand(5)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm04_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm06_mob_maker);
break;

}

}

} else if (gg.IsSameString(myself.name, z3_d_tm06_mob_maker) == 1) {
switch (gg.Rand(5)) {
case 0: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm01_mob_maker);
break;

}
case 1: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm02_mob_maker);
break;

}
case 2: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm03_mob_maker);
break;

}
case 3: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm04_mob_maker);
break;

}
case 4: {
maker0 = gg.InstantZone_GetNpcMaker(myself.GetInZoneID(), z3_d_tm05_mob_maker);
break;

}

}

}
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010060, 0, 0);

} else if (babble_mode == 1) {
gg.Announce("서플 전달 메이커 선택 이상!");

}
if (babble_mode == 1) {
gg.Announce("#" + gg.IntToStr(room) + "mob_decrease: " + gg.IntToStr(myself.i_ai0) + "/" + gg.IntToStr(myself.i_ai4) + "/" + gg.IntToStr(myself.npc_count) + "/" + gg.IntToStr(myself.maximum_npc));

}

}

} else if (myself.enabled == 1) {
if (myself.i_ai1 == TACT_AGGRESIVE) {
def0 = myself.GetSpawnDefine(gg.Rand(6));

} else if (myself.i_ai1 == TACT_DEFENSIVE) {
def0 = myself.GetSpawnDefine(gg.Rand(6) + 6);

} else if (myself.i_ai1 == TACT_INTERCEPT) {
def0 = myself.GetSpawnDefine(gg.Rand(3) + 12);

}
if (def0.respawn_time != 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, def0.respawn_time, def0.respawn_rand);

}

}

}
	}


}