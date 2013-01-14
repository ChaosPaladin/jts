package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class teleport_air_monster extends default_air_monster {
	protected int TeleportEffect = 379125761;

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam f0, HandlerParam f1, HandlerParam f2, HandlerParam f3, HandlerParam h0) {
if (timer_id == 1002) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullCreature(myself.c_ai0) || myself.IsNullHateInfo(h0)) {
myself.i_ai0 = MoveTo;
myself.AddTimerEx(9000, 5000);
return;

}
i0 = gg.FloatToInt(myself.c_ai0.x);
i1 = gg.FloatToInt(myself.c_ai0.y);
i2 = gg.FloatToInt(myself.c_ai0.z);
f0 = myself.c_ai0.x - dist - myself.sm.x * myself.c_ai0.x - dist - myself.sm.x + myself.c_ai0.y - myself.sm.y * myself.c_ai0.y - myself.sm.y + myself.c_ai0.z - myself.sm.z * myself.c_ai0.z - myself.sm.z;
f1 = myself.c_ai0.x + dist - myself.sm.x * myself.c_ai0.x + dist - myself.sm.x + myself.c_ai0.y - myself.sm.y * myself.c_ai0.y - myself.sm.y + myself.c_ai0.z - myself.sm.z * myself.c_ai0.z - myself.sm.z;
f2 = myself.c_ai0.x - myself.sm.x * myself.c_ai0.x - myself.sm.x + myself.c_ai0.y - dist - myself.sm.y * myself.c_ai0.y - dist - myself.sm.y + myself.c_ai0.z - myself.sm.z * myself.c_ai0.z - myself.sm.z;
f3 = myself.c_ai0.x - myself.sm.x * myself.c_ai0.x - myself.sm.x + myself.c_ai0.y + dist - myself.sm.y * myself.c_ai0.y + dist - myself.sm.y + myself.c_ai0.z - myself.sm.z * myself.c_ai0.z - myself.sm.z;
if (gg.Rand(2)) {
if (f0 > f1) {
i0 = i0 - dist;

} else {
i0 = i0 + dist;

}
if (f2 > f3) {
i3 = gg.FloatToInt(myself.c_ai0.x) - gg.FloatToInt(myself.sm.x);
i4 = gg.FloatToInt(myself.c_ai0.y - dist) - gg.FloatToInt(myself.sm.y);

} else {
i3 = gg.FloatToInt(myself.c_ai0.x) - gg.FloatToInt(myself.sm.x);
i4 = gg.FloatToInt(myself.c_ai0.y + dist) - gg.FloatToInt(myself.sm.y);

}

} else {
if (f2 > f3) {
i1 = i1 - dist;

} else {
i1 = i1 + dist;

}
if (f0 > f1) {
i3 = gg.FloatToInt(myself.c_ai0.x - dist) - gg.FloatToInt(myself.sm.x);
i4 = gg.FloatToInt(myself.c_ai0.y) - gg.FloatToInt(myself.sm.y);

} else {
i3 = gg.FloatToInt(myself.c_ai0.x + dist) - gg.FloatToInt(myself.sm.x);
i4 = gg.FloatToInt(myself.c_ai0.y) - gg.FloatToInt(myself.sm.y);

}

}
myself.i_ai4 = 1;
myself.int_list.Clear();
myself.int_list.Add(gg.FloatToInt(i0 + i3));
myself.int_list.Add(gg.FloatToInt(i1 + i4));
myself.int_list.Add(gg.FloatToInt(i2));
myself.RemoveAllDesire();
if (myself.Skill_GetConsumeMP(TeleportEffect) < myself.sm.mp && myself.Skill_GetConsumeHP(TeleportEffect) < myself.sm.hp && myself.Skill_InReuseDelay(TeleportEffect) == 0) {
myself.AddUseSkillDesire(myself.sm, TeleportEffect, 1, 1, 1000000);

}
myself.AddTimerEx(9003, 3000);
return;

}
if (timer_id == 9003) {
i0 = myself.int_list.Get(0);
i1 = myself.int_list.Get(1);
i2 = myself.int_list.Get(2);
myself.InstantTeleport(myself.sm, i0, i1, i2);
myself.int_list.Clear();
myself.i_ai0 = Detect;
myself.i_ai4 = 0;
myself.AddTimerEx(9000, 100);
return;

}
super;
	}


}