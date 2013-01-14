package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_lock extends default_npc {
	protected String fnHi = "black001.htm";
	protected String fnNoItem = "";
	protected int RoomIDX = 1;
	protected String DoorName = "royal_rush_door_1a";
	protected int AfflictMonster = 1020130;
	protected int SpawnX1 = 0;
	protected int SpawnY1 = 0;
	protected int SpawnZ1 = 0;
	protected int SpawnX2 = 0;
	protected int SpawnY2 = 0;
	protected int SpawnZ2 = 0;
	protected int SpawnX3 = 0;
	protected int SpawnY3 = 0;
	protected int SpawnZ3 = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
gg.Castle_GateOpenClose2(DoorName, 1);
myself.AddTimerEx(3000, 1000);
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (gg.OwnItemCount(talker, 7260) != 0) {
myself.DeleteItem1(talker, 7260, 1);
gg.Castle_GateOpenClose2(DoorName, 0);
if (myself.i_ai0 == 0) {
myself.AddTimerEx(3001, 1000 * 15);
myself.i_ai0 = 1;

}
if (SpawnX1 != 0) {
gg.SendScriptEvent(myself.boss, 1000 + RoomIDX, 0);
i0 = gg.Rand(3);
switch (i0) {
case 0: {
myself.CreateOnePrivateEx(1018244, "d1_afflict_bomb", 10, 5, SpawnX1, SpawnY1, SpawnZ1, 32768, 1, 0, 0);
myself.CreateOnePrivateEx(1018245, "d1_afflict_heal", 10, 5, SpawnX2, SpawnY2, SpawnZ2, 32768, 2, 0, 0);
myself.CreateOnePrivateEx(1018246, "d1_afflict_debuff", 10, 5, SpawnX3, SpawnY2, SpawnZ3, 32768, 3, 0, 0);
break;

}
case 1: {
myself.CreateOnePrivateEx(1018244, "d1_afflict_bomb", 10, 5, SpawnX2, SpawnY2, SpawnZ2, 32768, 1, 0, 0);
myself.CreateOnePrivateEx(1018245, "d1_afflict_heal", 10, 5, SpawnX3, SpawnY3, SpawnZ3, 32768, 2, 0, 0);
myself.CreateOnePrivateEx(1018246, "d1_afflict_debuff", 10, 5, SpawnX1, SpawnY1, SpawnZ1, 32768, 3, 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(1018244, "d1_afflict_bomb", 10, 5, SpawnX3, SpawnY3, SpawnZ3, 32768, 1, 0, 0);
myself.CreateOnePrivateEx(1018245, "d1_afflict_heal", 10, 5, SpawnX1, SpawnY1, SpawnZ1, 32768, 2, 0, 0);
myself.CreateOnePrivateEx(1018246, "d1_afflict_debuff", 10, 5, SpawnX2, SpawnY2, SpawnZ2, 32768, 3, 0, 0);
break;

}

}
myself.Shout(gg.MakeFString(1000502, "", "", "", "", ""));

} else {
gg.SendScriptEvent(myself.boss, 1000 + myself.sm.param1, 0);

}

} else {
myself.ShowPage(talker, fnNoItem);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 3000) {
i0 = gg.GetDateTime(0, 4);
i1 = gg.GetDateTime(0, 5);
if (i0 == 55 && i1 == 0) {
myself.i_ai0 = 0;
gg.Castle_GateOpenClose2(DoorName, 1);

}
myself.AddTimerEx(3000, 1000);

}
if (timer_id == 3001) {
gg.Castle_GateOpenClose2(DoorName, 1);
myself.i_ai0 = 0;

}
	}


}