package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_cratae_npc3 extends default_maker {
	protected String cratae_enter_name = "etc10_1715_029m1";
	protected String maker_room_1 = "cratae_room_1";
	protected String maker_room_2 = "cratae_room_2";
	protected String maker_room_3 = "cratae_room_3";
	protected String maker_room_4 = "cratae_room_4";
	protected String maker_room_5 = "cratae_room_5";
	protected String maker_room_6 = "cratae_room_6";
	protected String maker_room_7 = "cratae_room_7";
	protected String maker_room_8 = "cratae_room_8";
	protected String maker_room_9 = "cratae_room_9";
	protected String maker_room_10 = "cratae_room_10";
	protected String maker_room_11 = "cratae_room_11";
	protected String maker_room_12 = "cratae_room_12";
	protected String maker_room_13 = "cratae_room_13";
	protected String maker_room_14 = "cratae_room_14";
	protected String maker_room_15 = "cratae_room_15";
	protected String maker_room_16 = "cratae_room_16";
	protected String maker_room_17 = "cratae_room_17";
	protected String maker_room_18 = "cratae_room_18";
	protected String maker_room_19 = "cratae_room_19";
	protected String maker_room_20 = "cratae_room_20";
	protected String maker_room_21 = "cratae_room_21";
	protected String maker_room_22 = "cratae_room_22";
	protected String maker_room_23 = "cratae_room_23";
	protected String maker_room_24 = "cratae_room_24";
	protected String maker_room_25 = "cratae_room_25";

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam maker0) {
switch (script_event_arg1) {
case 1717001: {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(1717001, script_event_arg2, 0);

}
break;

}
case 2114002: {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(2114002, script_event_arg2, 0);

}
gg.SendMakerScriptEvent(myself, 1717007, 2114002, 0);
break;

}
case 1717006: {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(1717006, script_event_arg2, 0);

}
gg.SendMakerScriptEvent(myself, 1717007, 1717006, 0);
break;

}
case 1717007: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_1), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_2), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_3), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_4), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_5), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_6), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_7), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_8), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_9), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_10), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_11), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_12), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_13), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_14), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_15), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_16), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_17), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_18), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_19), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_20), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_21), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_22), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_23), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_24), script_event_arg2, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_room_25), script_event_arg2, 0, 0);
break;

}
case 1717012: {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(1717012, script_event_arg2, script_event_arg3);

}
break;

}

}
super;
	}


}