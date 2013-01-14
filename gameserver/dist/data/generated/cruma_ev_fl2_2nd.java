package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cruma_ev_fl2_2nd extends cruma_fl2_parameter {
	protected int respawn_time = 0;
	protected String random_maker_name = "dion19_2021_14m1";

	protected void ON_START() {
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
myself.i_ai0 = script_event_arg2;
switch (script_event_arg1) {
case 1000: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
break;

}
case 1001: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
i1 = def0.total - def0.npc_count;
if (i1 > 0) {
if (myself.AtomicIncreaseTotal(def0, i1, 1)) {
def0.Spawn2(i1, 0, 0);

}

}

}

}
break;

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam c0) {
maker0 = gg.GetNpcMaker(random_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2021002, deleted_def.respawn_time, deleted_def.respawn_rand);

}
switch (myself.i_ai0) {
case 1: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room1_1), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room1_2), 2021003, 0, 0);
break;

}
case 2: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room2_1), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room2_2), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room2_3), 2021003, 0, 0);
break;

}
case 3: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room3_1), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room3_2), 2021003, 0, 0);
break;

}
case 4: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room4_1), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room4_2), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room4_3), 2021003, 0, 0);
break;

}
case 5: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room5_1), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room5_2), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room5_3), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room5_4), 2021003, 0, 0);
break;

}
case 6: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room6_1), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room6_2), 2021003, 0, 0);
break;

}
case 7: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room7_1), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room7_2), 2021003, 0, 0);
break;

}
case 8: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room8_1), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room8_2), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room8_3), 2021003, 0, 0);
break;

}
case 9: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room9_1), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room9_2), 2021003, 0, 0);
break;

}
case 10: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room10_1), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room10_2), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room10_3), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room10_4), 2021003, 0, 0);
break;

}
case 11: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room11_1), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room11_2), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room11_3), 2021003, 0, 0);
break;

}
case 12: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room12_1), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room12_2), 2021003, 0, 0);
break;

}
case 13: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room13_1), 2021003, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room13_2), 2021003, 0, 0);
break;

}

}
	}


}