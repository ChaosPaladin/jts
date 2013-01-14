package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cruma_ev_fl2_random extends cruma_fl2_parameter {
	protected void ON_NPC_CREATED(HandlerParam maker0, HandlerParam def0, HandlerParam i0) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2021001, 0, 0);

}
super;
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (timer_id == 2022) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2021001, 0, 0);

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam maker0, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam s0) {
if (script_event_arg1 == 2021001) {
i0 = gg.Rand(13) + 1;
if (i0 == 9) {
i0 = i0 + 1;

}
switch (i0) {
case 1: {
s0 = room_maker1;
break;

}
case 2: {
s0 = room_maker2;
break;

}
case 3: {
s0 = room_maker3;
break;

}
case 4: {
s0 = room_maker4;
break;

}
case 5: {
s0 = room_maker5;
break;

}
case 6: {
s0 = room_maker6;
break;

}
case 7: {
s0 = room_maker7;
break;

}
case 8: {
s0 = room_maker8;
break;

}
case 9: {
s0 = room_maker9;
break;

}
case 10: {
s0 = room_maker10;
break;

}
case 11: {
s0 = room_maker11;
break;

}
case 12: {
s0 = room_maker12;
break;

}
case 13: {
s0 = room_maker13;
break;

}

}
maker0 = gg.GetNpcMaker(s0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, i0, 0);

}
switch (i0) {
case 1: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room1_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room1_2), 1000, 0, 0);
break;

}
case 2: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room2_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room2_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room2_3), 1000, 0, 0);
break;

}
case 3: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room3_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room3_2), 1000, 0, 0);
break;

}
case 4: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room4_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room4_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room4_3), 1000, 0, 0);
break;

}
case 5: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room5_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room5_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room5_3), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room5_4), 1000, 0, 0);
break;

}
case 6: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room6_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room6_2), 1000, 0, 0);
break;

}
case 7: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room7_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room7_2), 1000, 0, 0);
break;

}
case 8: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room8_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room8_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room8_3), 1000, 0, 0);
break;

}
case 9: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room9_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room9_2), 1000, 0, 0);
break;

}
case 10: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room10_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room10_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room10_3), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room10_4), 1000, 0, 0);
break;

}
case 11: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room11_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room11_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room11_3), 1000, 0, 0);
break;

}
case 12: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room12_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room12_2), 1000, 0, 0);
break;

}
case 13: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room13_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room13_2), 1000, 0, 0);
break;

}

}

}
if (script_event_arg1 == 2021002) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
super;
	}


}