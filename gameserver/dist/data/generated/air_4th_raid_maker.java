package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class air_4th_raid_maker extends default_air_maker {
	protected int DS_fieldCycle_ID = 2;
	protected String NormalMakerName = "default_maker_name_4";
	protected String RaidSummonMakerName = "default_maker_name";

	protected void ON_START() {
myself.AddTimerEx(2000, 1000);
	}

	protected void ON_ALL_NPC_DELETED(HandlerParam maker0) {
maker0 = gg.GetNpcMaker(RaidSummonMakerName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1225001, 0, 0);

}
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0) {
if (timer_id == 2000) {
i0 = gg.GetStep_FieldCycle(DS_fieldCycle_ID);
if (i0 != 2) {
maker0 = gg.GetNpcMaker(myself.name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10025, 0, 0);

}

} else {
myself.AddTimerEx(2000, 1000);

}

}
	}


}