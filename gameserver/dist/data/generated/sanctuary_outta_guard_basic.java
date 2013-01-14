package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sanctuary_outta_guard_basic extends citizen {
	protected int ChangeItem = 8064;
	protected int ChangedItem = 8065;
	protected String DoorName = "sanctuary_outta_guard_basic_default";
	protected String GateOpenHTML = "sanctuary_outta_guard002.htm";
	protected String GateOpenFailHTML = "sanctuary_outta_guard003.htm";

	protected void CREATED() {
myself.AddTimerEx(3456, 15 * 1000);
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 502 && reply == 2) {
gg.Castle_GateOpenClose2(DoorName, 0);
myself.ShowPage(talker, GateOpenHTML);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3456) {
myself.LookNeighbor(300);
myself.AddTimerEx(3456, 15 * 1000);

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.sm.alive == 0) {
return;

}
if (gg.OwnItemCount(creature, ChangeItem) >= 1) {
myself.DeleteItem1(creature, ChangeItem, 1);
myself.GiveItem1(creature, ChangedItem, 1);

}
	}


}