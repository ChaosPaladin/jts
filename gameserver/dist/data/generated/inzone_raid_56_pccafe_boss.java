package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_56_pccafe_boss extends inzone_raid_boss_standard {
	protected int Skill01 = 273219589;
	protected int Skill01_Probablity = 10;
	protected int Skill01_Target_Type = 0;
	protected int Skill02 = 274399237;
	protected int Skill02_Probablity = 5;
	protected int Skill02_Target_Type = 2;
	protected String private_spawn_maker = "obelisk_territory_am1";

	protected void CREATED() {
myself.i_ai2 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam skill_name_id) {
if (myself.i_ai2 == 0) {
myself.i_ai2 = 1;
myself.AddTimerEx(8002, 10 * 1000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam i0) {
if (timer_id == 8002 && myself.sm.alive == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, private_spawn_maker);
gg.SendMakerScriptEvent(maker0, 5, gg.GetIndexFromCreature(myself.sm), 0);
myself.AddTimerEx(8002, 35 * 1000);

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