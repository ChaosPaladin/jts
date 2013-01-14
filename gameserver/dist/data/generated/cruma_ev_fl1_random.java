package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cruma_ev_fl1_random extends cruma_fl1_parameter {
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

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam s0, HandlerParam s1) {
if (script_event_arg1 == 2021001) {
i0 = gg.Rand(22) + 1;
if (i0 == 2 || i0 == 9) {
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
case 14: {
s0 = room_maker14;
break;

}
case 15: {
s0 = room_maker15;
break;

}
case 16: {
s0 = room_maker16;
break;

}
case 17: {
s0 = room_maker17;
break;

}
case 18: {
s0 = room_maker18;
break;

}
case 19: {
s0 = room_maker19;
break;

}
case 20: {
s0 = room_maker20;
break;

}
case 21: {
s0 = room_maker21;
break;

}
case 22: {
s0 = room_maker22;
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
gg.SendMakerScriptEvent(gg.GetNpcMaker(room1_3), 1000, 0, 0);
break;

}
case 2: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room2_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room2_2), 1000, 0, 0);
break;

}
case 3: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room3_1), 1000, 0, 0);
break;

}
case 4: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room4_1), 1000, 0, 0);
break;

}
case 5: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room5_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room5_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room5_3), 1000, 0, 0);
break;

}
case 6: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room6_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room6_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room6_3), 1000, 0, 0);
break;

}
case 7: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room7_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room7_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room7_3), 1000, 0, 0);
break;

}
case 8: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room8_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room8_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room8_3), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room8_4), 1000, 0, 0);
break;

}
case 9: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room9_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room9_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room9_3), 1000, 0, 0);
break;

}
case 10: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room12_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room12_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room12_3), 1000, 0, 0);
break;

}
case 11: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room13_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room13_2), 1000, 0, 0);
break;

}
case 12: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room14_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room14_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room14_3), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room14_4), 1000, 0, 0);
break;

}
case 13: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room15_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room15_2), 1000, 0, 0);
break;

}
case 14: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room16_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room16_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room16_3), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room16_4), 1000, 0, 0);
break;

}
case 15: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room17_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room17_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room17_3), 1000, 0, 0);
break;

}
case 16: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room18_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room18_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room18_3), 1000, 0, 0);
break;

}
case 17: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room19_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room19_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room19_3), 1000, 0, 0);
break;

}
case 18: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room20_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room20_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room20_3), 1000, 0, 0);
break;

}
case 19: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room21_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room21_2), 1000, 0, 0);
break;

}
case 20: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room22_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room22_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room22_3), 1000, 0, 0);
break;

}
case 21: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room23_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room23_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room23_3), 1000, 0, 0);
break;

}
case 22: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(room24_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room24_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(room24_3), 1000, 0, 0);
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