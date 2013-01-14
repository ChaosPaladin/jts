package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ct3_fc_manager extends default_npc {
	protected int RaceCycleID = 0;

	protected void CREATED(HandlerParam i0) {
myself.i_quest9 = 0;
myself.RegisterAsFieldCycleManager();
i0 = gg.GetStep_FieldCycle(RaceCycleID);
if (i0 == 0) {
gg.SetStep_FieldCycle(RaceCycleID, 1, 8, myself.sm);

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply, HandlerParam i0, HandlerParam i1) {
if (reply == 10) {
i0 = gg.GetStep_FieldCycle(RaceCycleID);
i1 = gg.GetPoint_FieldCycle(RaceCycleID);
myself.Whisper(creature, "Field Cycle ID : " + RaceCycleID + " / Step : " + i0 + " / Point : " + i1);

} else if (reply == 11) {
myself.Whisper(creature, "Field Cycle ID : " + RaceCycleID + " set Step 1");
gg.SetStep_FieldCycle(RaceCycleID, 1, 8, myself.sm);

} else if (reply == 12) {
myself.Whisper(creature, "Field Cycle ID : " + RaceCycleID + " set Step 2");
gg.SetStep_FieldCycle(RaceCycleID, 2, 8, myself.sm);

} else if (reply >= 1000) {
gg.AddPoint_FieldCycle(RaceCycleID, reply, 8, myself.sm);
i0 = gg.GetStep_FieldCycle(RaceCycleID);
i1 = gg.GetPoint_FieldCycle(RaceCycleID);
myself.Whisper(creature, "Field Cycle ID : " + RaceCycleID + " / Step : " + i0 + " / Point : " + i1);

} else if (reply == 14) {
if (creature.is_pc == 1) {
gg.SendUIEvent(creature, 1, 0, 0, "1", "1", "1", "남은 시간 : ", "60", "0");

}

}
	}

	protected void FIELD_CYCLE_STEP_EXPIRED(HandlerParam event_id, HandlerParam i0, HandlerParam i1) {
if (myself.i_quest9) {
gg.Announce("FIELD_CYCLE_STEP_EXPIRED 이벤트 FieldCycle_ID : " + event_id + " step " + i0 + " 종류" + i1 + " ");

}
if (event_id == RaceCycleID) {
if (i0 == 2) {
if (i1 == 0) {
gg.SetStep_FieldCycle(RaceCycleID, 1, 8, myself.sm);

}

} else if (i0 == 1) {
if (i1 == 0) {
gg.SetStep_FieldCycle(RaceCycleID, 2, 8, myself.sm);

}

}

}
	}


}