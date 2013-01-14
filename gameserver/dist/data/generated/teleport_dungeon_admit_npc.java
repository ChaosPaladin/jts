package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class teleport_dungeon_admit_npc extends citizen {
	protected String LevelName = "TeleportDungeon1";
	protected String fnHi = "rift_watcher_1001.htm";
	protected int LevelNumber = 1;
	protected int PosX0 = 1;
	protected int PosY0 = 1;
	protected int PosX1 = 1;
	protected int PosY1 = 1;
	protected int PosX2 = 1;
	protected int PosY2 = 1;
	protected int PosX3 = 1;
	protected int PosY3 = 1;
	protected int PosX4 = 1;
	protected int PosY4 = 1;
	protected int PosX5 = 1;
	protected int PosY5 = 1;
	protected int PosX6 = 1;
	protected int PosY6 = 1;
	protected int PosX7 = 1;
	protected int PosY7 = 1;
	protected int PosX8 = 1;
	protected int PosY8 = 1;

	protected void CREATED(HandlerParam i0, HandlerParam rlist0, HandlerParam room0) {
i0 = gg.CreateRoomInfoList(LevelName, 9);
if (i0 == 0) {

}
rlist0 = gg.GetRoomInfoList(LevelName);
if (gg.IsNull(rlist0)) {

} else {
for (i0 = 0; i0 < 9; i0 = i0 + 1) {
room0 = rlist0.GetRoomInfo(i0);
room0.status.Exchange(0);

}

}
super;
	}


}