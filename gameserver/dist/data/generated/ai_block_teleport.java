package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_block_teleport extends default_npc {
	protected String MotherBlockMaker = "default_block_maker";
	protected int GroundID = -1;

	protected void CREATED() {
myself.BlockUpsetManagerEnter(GroundID);
	}

	protected void TALKED(HandlerParam talker) {
myself.BlockUpsetUserEnter(GroundID, talker);
	}

	protected void BLOCK_UPSET_STARTED() {
myself.i_ai0 = 0;
myself.BlockUpsetChangeAmount(GroundID, 16);
myself.AddTimerEx(999, 57 * 1000);
	}

	protected void BLOCK_UPSET_FINISHED() {
myself.i_ai0 = 1;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (myself.i_ai0 == 1) {
return;

}
if (timer_id == 999) {
maker0 = gg.GetNpcMaker(MotherBlockMaker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.AddTimerEx(1000, 5000);

}
if (timer_id == 1000) {
myself.BlockUpsetChangeAmount(GroundID, 20);
myself.AddTimerEx(1999, 57 * 1000);

}
if (timer_id == 1999) {
maker0 = gg.GetNpcMaker(MotherBlockMaker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.AddTimerEx(2000, 5000);

}
if (timer_id == 2000) {
myself.BlockUpsetChangeAmount(GroundID, 14);

}
	}


}