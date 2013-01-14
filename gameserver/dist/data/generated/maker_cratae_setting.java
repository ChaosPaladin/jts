package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_cratae_setting extends default_maker {
	protected String maker_monster_set_1 = "maker_monster_set_1";
	protected String maker_monster_set_2 = "maker_monster_set_2";
	protected String maker_monster_set_3 = "maker_monster_set_3";
	protected String maker_monster_set_4 = "maker_monster_set_4";
	protected String maker_near_room_1 = "maker_near_room_1";
	protected String maker_near_room_2 = "maker_near_room_2";
	protected String maker_near_room_3 = "maker_near_room_3";
	protected String maker_near_room_4 = "maker_near_room_4";
	protected String AreaName1 = "";
	protected String AreaName2 = "";
	protected String AreaName3 = "";
	protected String AreaName4 = "";
	protected String AreaName5 = "";
	protected String AreaName6 = "";

	protected void ON_START(HandlerParam i0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
switch (script_event_arg1) {
case 2114002: {
myself.i_ai0 = gg.Rand(4) + 1;
switch (myself.i_ai0) {
case 1: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_monster_set_1), 1717008, 0, 0);
break;

}
case 2: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_monster_set_2), 1717008, 0, 0);
break;

}
case 3: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_monster_set_3), 1717008, 0, 0);
break;

}
case 4: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_monster_set_4), 1717008, 0, 0);
break;

}

}
i0 = gg.Rand(2);
myself.i_ai1 = i0;
def0 = myself.GetSpawnDefine(myself.i_ai1);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 1, 1)) {
def0.Spawn2(1, 0, 0);

}

}
gg.Area_SetOnOff(AreaName1, 0);
gg.Area_SetOnOff(AreaName2, 0);
gg.Area_SetOnOff(AreaName3, 0);
gg.Area_SetOnOff(AreaName4, 0);
gg.Area_SetOnOff(AreaName5, 0);
gg.Area_SetOnOff(AreaName6, 0);
if (myself.i_ai1 == 0) {
myself.i_ai2 = gg.Rand(3) + 1;
if (myself.i_ai2 == 1) {
gg.Area_SetOnOff(AreaName1, 1);

} else if (myself.i_ai2 == 2) {
gg.Area_SetOnOff(AreaName2, 1);

} else if (myself.i_ai2 == 3) {
gg.Area_SetOnOff(AreaName3, 1);

}

} else if (myself.i_ai1 == 1) {
myself.i_ai2 = gg.Rand(5) + 1;
if (myself.i_ai2 == 1 || myself.i_ai2 == 2) {
gg.Area_SetOnOff(AreaName4, 1);

} else if (myself.i_ai2 == 3) {
gg.Area_SetOnOff(AreaName5, 1);

} else if (myself.i_ai2 == 4 || myself.i_ai2 == 5) {
gg.Area_SetOnOff(AreaName6, 1);

}

}
break;

}
case 1717006: {
switch (myself.i_ai0) {
case 1: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_monster_set_1), 1717009, 0, 0);
break;

}
case 2: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_monster_set_2), 1717009, 0, 0);
break;

}
case 3: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_monster_set_3), 1717009, 0, 0);
break;

}
case 4: {
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_monster_set_4), 1717009, 0, 0);
break;

}

}
gg.SendMakerScriptEvent(myself, 1000, 0, 0);
gg.Area_SetOnOff(AreaName1, 0);
gg.Area_SetOnOff(AreaName2, 0);
gg.Area_SetOnOff(AreaName3, 0);
gg.Area_SetOnOff(AreaName4, 0);
gg.Area_SetOnOff(AreaName5, 0);
gg.Area_SetOnOff(AreaName6, 0);
break;

}
case 1717010: {
if (myself.i_ai1 == 0) {
if (myself.i_ai2 == 1) {
gg.Area_SetOnOff(AreaName1, 0);

} else if (myself.i_ai2 == 2) {
gg.Area_SetOnOff(AreaName2, 0);

} else if (myself.i_ai2 == 3) {
gg.Area_SetOnOff(AreaName3, 0);

}
myself.i_ai1 = 1;
def0 = myself.GetSpawnDefine(1);
myself.i_ai2 = gg.Rand(5) + 1;
if (myself.i_ai2 == 1 || myself.i_ai2 == 2) {
gg.Area_SetOnOff(AreaName4, 1);

} else if (myself.i_ai2 == 3) {
gg.Area_SetOnOff(AreaName5, 1);

} else if (myself.i_ai2 == 4 || myself.i_ai2 == 5) {
gg.Area_SetOnOff(AreaName6, 1);

}

} else if (myself.i_ai1 == 1) {
if (myself.i_ai2 == 1 || myself.i_ai2 == 2) {
gg.Area_SetOnOff(AreaName4, 0);

} else if (myself.i_ai2 == 3) {
gg.Area_SetOnOff(AreaName5, 0);

} else if (myself.i_ai2 == 4 || myself.i_ai2 == 5) {
gg.Area_SetOnOff(AreaName6, 0);

}
myself.i_ai1 = 0;
def0 = myself.GetSpawnDefine(0);
myself.i_ai2 = gg.Rand(3) + 1;
if (myself.i_ai2 == 1) {
gg.Area_SetOnOff(AreaName1, 1);

} else if (myself.i_ai2 == 2) {
gg.Area_SetOnOff(AreaName2, 1);

} else if (myself.i_ai2 == 3) {
gg.Area_SetOnOff(AreaName3, 1);

}

}
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, def0.total, 1)) {
def0.Spawn2(1, 0, 0);

}

}
break;

}

}
super;
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam died) {
if (died == 0) {

} else if (died == 1) {
gg.SendMakerScriptEvent(myself, 1717010, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_near_room_1), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_near_room_1), 1717010, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_near_room_2), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_near_room_2), 1717010, 0, 0);
if (gg.IsNull(gg.GetNpcMaker(maker_near_room_3)) == 0) {
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_near_room_3), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_near_room_3), 1717010, 0, 0);

}
if (gg.IsNull(gg.GetNpcMaker(maker_near_room_4)) == 0) {
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_near_room_4), 1000, 0, 0);
gg.SendMakerScriptEvent(gg.GetNpcMaker(maker_near_room_4), 1717010, 0, 0);

}

}
	}

	protected void ON_ALL_NPC_DELETED() {
	}


}