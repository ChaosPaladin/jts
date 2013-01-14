package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_66_pccafe_boss extends inzone_raid_boss_standard {
	protected int Skill01 = 274464775;
	protected int Skill01_Probablity = 5;
	protected int Skill01_Target_Type = 0;
	protected int Skill02 = 310509574;
	protected int Skill02_Probablity = 5;
	protected int Skill02_Target_Type = 0;
	protected String private_spawn_maker = "66_pccafe_buham1";

	protected void CREATED() {
myself.AddTimerEx(9984, 30 * 1000);
myself.i_ai2 = 30;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam i0) {
if (timer_id == 9984) {
if (myself.i_ai0 == 1 && myself.sm.alive == 1) {
if (myself.i_ai2 > 2) {
myself.i_ai2 = myself.i_ai2 - 2;
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, private_spawn_maker);
gg.SendMakerScriptEvent(maker0, 5, 0, 0);

} else {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, private_spawn_maker);
gg.SendMakerScriptEvent(maker0, 5, 0, 0);

}

}
myself.AddTimerEx(9984, myself.i_ai2 * 1000);

}
super;
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam maker0) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, private_spawn_maker);
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);
super;
	}


}