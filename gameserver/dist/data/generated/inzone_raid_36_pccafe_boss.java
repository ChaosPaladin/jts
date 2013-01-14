package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_36_pccafe_boss extends inzone_raid_boss_standard {
	protected int Skill01 = 274661379;
	protected int Skill01_Probablity = 20;
	protected int Skill01_Target_Type = 0;
	protected int Skill02 = 274464771;
	protected int Skill02_Probablity = 5;
	protected int Skill02_Target_Type = 1;

	protected void CREATED() {
myself.i_ai3 = 0;
super;
	}

	protected void ATTACKED() {
if (myself.i_ai3 == 0) {
myself.i_ai3 = 1;
myself.AddTimerEx(8787, 60 * 1000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam h0) {
if (timer_id == 8787) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
i0 = h0.hate;
i0 = gg.FloatToInt(i0 * 0.700000);
myself.AddHateInfo(h0.creature, i0, 0, 1, 0);
myself.Say(gg.MakeFString(1800179, "", "", "", "", ""));

}
myself.AddTimerEx(8787, 60 * 1000);

}
super;
	}


}