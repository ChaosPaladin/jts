package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_nest_invisible extends default_maker {
	protected String Area_a_pc_lv1 = "";
	protected String Area_a_pc_lv2 = "";
	protected String Area_a_pc_lv3 = "";
	protected String Area_a_pc_lv4 = "";
	protected String Area_b_pc_lv1 = "";
	protected String Area_b_pc_lv2 = "";
	protected String Area_b_pc_lv3 = "";
	protected String Area_b_pc_lv4 = "";
	protected String Area_c_pc_lv1 = "";
	protected String Area_c_pc_lv2 = "";
	protected String Area_c_pc_lv3 = "";
	protected String Area_c_pc_lv4 = "";
	protected String Area_a_npc_lv1 = "";
	protected String Area_a_npc_lv2 = "";
	protected String Area_a_npc_lv3 = "";
	protected String Area_a_npc_lv4 = "";
	protected String Area_b_npc_lv1 = "";
	protected String Area_b_npc_lv2 = "";
	protected String Area_b_npc_lv3 = "";
	protected String Area_b_npc_lv4 = "";
	protected String Area_c_npc_lv1 = "";
	protected String Area_c_npc_lv2 = "";
	protected String Area_c_npc_lv3 = "";
	protected String Area_c_npc_lv4 = "";
	protected int Group_Num = -1;
	protected int debug_mode = 0;

	protected void ON_START() {
super;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;
gg.Area_SetOnOff(Area_a_pc_lv1, 0);
gg.Area_SetOnOff(Area_a_pc_lv2, 0);
gg.Area_SetOnOff(Area_a_pc_lv3, 0);
gg.Area_SetOnOff(Area_a_pc_lv4, 0);
gg.Area_SetOnOff(Area_b_pc_lv1, 0);
gg.Area_SetOnOff(Area_b_pc_lv2, 0);
gg.Area_SetOnOff(Area_b_pc_lv3, 0);
gg.Area_SetOnOff(Area_b_pc_lv4, 0);
gg.Area_SetOnOff(Area_c_pc_lv1, 0);
gg.Area_SetOnOff(Area_c_pc_lv2, 0);
gg.Area_SetOnOff(Area_c_pc_lv3, 0);
gg.Area_SetOnOff(Area_c_pc_lv4, 0);
gg.Area_SetOnOff(Area_a_npc_lv1, 0);
gg.Area_SetOnOff(Area_a_npc_lv2, 0);
gg.Area_SetOnOff(Area_a_npc_lv3, 0);
gg.Area_SetOnOff(Area_a_npc_lv4, 0);
gg.Area_SetOnOff(Area_b_npc_lv1, 0);
gg.Area_SetOnOff(Area_b_npc_lv2, 0);
gg.Area_SetOnOff(Area_b_npc_lv3, 0);
gg.Area_SetOnOff(Area_b_npc_lv4, 0);
gg.Area_SetOnOff(Area_c_npc_lv1, 0);
gg.Area_SetOnOff(Area_c_npc_lv2, 0);
gg.Area_SetOnOff(Area_c_npc_lv3, 0);
gg.Area_SetOnOff(Area_c_npc_lv4, 0);
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0) {
super;
if (script_event_arg1 == 2214010) {
if (debug_mode) {
gg.Announce("OBSERVER_CREATED : " + script_event_arg2);
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(1111, 1, Group_Num);
def0.SendScriptEvent(1111, 2, myself.i_ai1);
def0.SendScriptEvent(1111, 3, myself.i_ai2);
def0.SendScriptEvent(1111, 4, myself.i_ai3);

}

}
switch (script_event_arg2) {
case 1: {
switch (myself.i_quest1) {
case 0: {
gg.Area_SetOnOff(Area_a_pc_lv1, 1);
gg.Area_SetOnOff(Area_a_npc_lv1, 1);
myself.i_quest1 = 1;
break;

}
case 1: {
gg.Area_SetOnOff(Area_a_pc_lv1, 0);
gg.Area_SetOnOff(Area_a_npc_lv1, 0);
gg.Area_SetOnOff(Area_a_pc_lv2, 1);
gg.Area_SetOnOff(Area_a_npc_lv2, 1);
myself.i_quest1 = 2;
break;

}
case 2: {
gg.Area_SetOnOff(Area_a_pc_lv2, 0);
gg.Area_SetOnOff(Area_a_npc_lv2, 0);
gg.Area_SetOnOff(Area_a_pc_lv3, 1);
gg.Area_SetOnOff(Area_a_npc_lv3, 1);
myself.i_quest1 = 3;
break;

}
case 3: {
gg.Area_SetOnOff(Area_a_pc_lv3, 0);
gg.Area_SetOnOff(Area_a_npc_lv3, 0);
gg.Area_SetOnOff(Area_a_pc_lv4, 1);
gg.Area_SetOnOff(Area_a_npc_lv4, 1);
myself.i_quest1 = 4;
break;

}

}
break;

}
case 2: {
switch (myself.i_quest2) {
case 0: {
gg.Area_SetOnOff(Area_b_pc_lv1, 1);
gg.Area_SetOnOff(Area_b_npc_lv1, 1);
myself.i_quest2 = 1;
break;

}
case 1: {
gg.Area_SetOnOff(Area_b_pc_lv1, 0);
gg.Area_SetOnOff(Area_b_npc_lv1, 0);
gg.Area_SetOnOff(Area_b_pc_lv2, 1);
gg.Area_SetOnOff(Area_b_npc_lv2, 1);
myself.i_quest2 = 2;
break;

}
case 2: {
gg.Area_SetOnOff(Area_b_pc_lv2, 0);
gg.Area_SetOnOff(Area_b_npc_lv2, 0);
gg.Area_SetOnOff(Area_b_pc_lv3, 1);
gg.Area_SetOnOff(Area_b_npc_lv3, 1);
myself.i_quest2 = 3;
break;

}
case 3: {
gg.Area_SetOnOff(Area_b_pc_lv3, 0);
gg.Area_SetOnOff(Area_b_npc_lv3, 0);
gg.Area_SetOnOff(Area_b_pc_lv4, 1);
gg.Area_SetOnOff(Area_b_npc_lv4, 1);
myself.i_quest2 = 4;
break;

}

}
break;

}
case 3: {
switch (myself.i_quest3) {
case 0: {
gg.Area_SetOnOff(Area_c_pc_lv1, 1);
gg.Area_SetOnOff(Area_c_npc_lv1, 1);
myself.i_quest3 = 1;
break;

}
case 1: {
gg.Area_SetOnOff(Area_c_pc_lv1, 0);
gg.Area_SetOnOff(Area_c_npc_lv1, 0);
gg.Area_SetOnOff(Area_c_pc_lv2, 1);
gg.Area_SetOnOff(Area_c_npc_lv2, 1);
myself.i_quest3 = 2;
break;

}
case 2: {
gg.Area_SetOnOff(Area_c_pc_lv2, 0);
gg.Area_SetOnOff(Area_c_npc_lv2, 0);
gg.Area_SetOnOff(Area_c_pc_lv3, 1);
gg.Area_SetOnOff(Area_c_npc_lv3, 1);
myself.i_quest3 = 3;
break;

}
case 3: {
gg.Area_SetOnOff(Area_c_pc_lv3, 0);
gg.Area_SetOnOff(Area_c_npc_lv3, 0);
gg.Area_SetOnOff(Area_c_pc_lv4, 1);
gg.Area_SetOnOff(Area_c_npc_lv4, 1);
myself.i_quest3 = 4;
break;

}

}
break;

}

}

}
if (script_event_arg1 == 2214011) {
if (debug_mode) {
gg.Announce("OBSERVER_DYING : " + script_event_arg2);

}
switch (script_event_arg2) {
case 1: {
switch (myself.i_quest1) {
case 1: {
gg.Area_SetOnOff(Area_a_pc_lv1, 0);
gg.Area_SetOnOff(Area_a_npc_lv1, 0);
myself.i_quest1 = 0;
break;

}
case 2: {
gg.Area_SetOnOff(Area_a_pc_lv2, 0);
gg.Area_SetOnOff(Area_a_npc_lv2, 0);
gg.Area_SetOnOff(Area_a_pc_lv1, 1);
gg.Area_SetOnOff(Area_a_npc_lv1, 1);
myself.i_quest1 = 1;
break;

}
case 3: {
gg.Area_SetOnOff(Area_a_pc_lv3, 0);
gg.Area_SetOnOff(Area_a_npc_lv3, 0);
gg.Area_SetOnOff(Area_a_pc_lv2, 1);
gg.Area_SetOnOff(Area_a_npc_lv2, 1);
myself.i_quest1 = 2;
break;

}
case 4: {
gg.Area_SetOnOff(Area_a_pc_lv4, 0);
gg.Area_SetOnOff(Area_a_npc_lv4, 0);
gg.Area_SetOnOff(Area_a_pc_lv3, 1);
gg.Area_SetOnOff(Area_a_npc_lv3, 1);
myself.i_quest1 = 3;
break;

}

}
break;

}
case 2: {
switch (myself.i_quest2) {
case 1: {
gg.Area_SetOnOff(Area_b_pc_lv1, 0);
gg.Area_SetOnOff(Area_b_npc_lv1, 0);
myself.i_quest2 = 0;
break;

}
case 2: {
gg.Area_SetOnOff(Area_b_pc_lv2, 0);
gg.Area_SetOnOff(Area_b_npc_lv2, 0);
gg.Area_SetOnOff(Area_b_pc_lv1, 1);
gg.Area_SetOnOff(Area_b_npc_lv1, 1);
myself.i_quest2 = 1;
break;

}
case 3: {
gg.Area_SetOnOff(Area_b_pc_lv3, 0);
gg.Area_SetOnOff(Area_b_npc_lv3, 0);
gg.Area_SetOnOff(Area_b_pc_lv2, 1);
gg.Area_SetOnOff(Area_b_npc_lv2, 1);
myself.i_quest2 = 2;
break;

}
case 4: {
gg.Area_SetOnOff(Area_b_pc_lv4, 0);
gg.Area_SetOnOff(Area_b_npc_lv4, 0);
gg.Area_SetOnOff(Area_b_pc_lv3, 1);
gg.Area_SetOnOff(Area_b_npc_lv3, 1);
myself.i_quest2 = 3;
break;

}

}
break;

}
case 3: {
switch (myself.i_quest3) {
case 1: {
gg.Area_SetOnOff(Area_c_pc_lv1, 0);
gg.Area_SetOnOff(Area_c_npc_lv1, 0);
myself.i_quest3 = 0;
break;

}
case 2: {
gg.Area_SetOnOff(Area_c_pc_lv2, 0);
gg.Area_SetOnOff(Area_c_npc_lv2, 0);
gg.Area_SetOnOff(Area_c_pc_lv1, 1);
gg.Area_SetOnOff(Area_c_npc_lv1, 1);
myself.i_quest3 = 1;
break;

}
case 3: {
gg.Area_SetOnOff(Area_c_pc_lv3, 0);
gg.Area_SetOnOff(Area_c_npc_lv3, 0);
gg.Area_SetOnOff(Area_c_pc_lv2, 1);
gg.Area_SetOnOff(Area_c_npc_lv2, 1);
myself.i_quest3 = 2;
break;

}
case 4: {
gg.Area_SetOnOff(Area_c_pc_lv4, 0);
gg.Area_SetOnOff(Area_c_npc_lv4, 0);
gg.Area_SetOnOff(Area_c_pc_lv3, 1);
gg.Area_SetOnOff(Area_c_npc_lv3, 1);
myself.i_quest3 = 3;
break;

}

}
break;

}

}

}
	}


}