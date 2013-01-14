package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_56_normal_boss extends inzone_raid_boss_standard {
	protected int Skill01 = 344850439;
	protected int Skill01_Probablity = 20;
	protected int Skill01_Target_Type = 2;

	protected void CREATED() {
myself.AddTimerEx(2897, 90 * 1000);
myself.AddTimerEx(9939, 19 * 1000);
myself.i_ai1 = 0;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam h0, HandlerParam private, HandlerParam c0) {
if (timer_id == 2897) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
c0 = h0.creature;

}
if (myself.i_ai1 < 7 && myself.i_ai0 == 1) {
myself.CreateOnePrivateEx(1018569, "inzone_raid_56_normal_private", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(c0), 0);
myself.i_ai1 = myself.i_ai1 + 1;

}
myself.AddTimerEx(2897, 90 * 1000);

} else if (timer_id == 9939) {
if (myself.i_ai1 > 0) {
i0 = myself.GetHateInfoCount();
if (i0 > 0) {
i1 = gg.Rand(i0);
h0 = myself.GetHateInfoByIndex(i1);

}
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
myself.Say(gg.MakeFString(1800182, h0.creature.name, "", "", "", ""));
myself.BroadcastScriptEvent(1, gg.GetIndexFromCreature(h0.creature), 1500);

}

}
myself.AddTimerEx(9939, 24 * 1000);

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.i_ai1 = myself.i_ai1 - 1;

}
super;
	}


}