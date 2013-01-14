package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_33_normal_boss extends inzone_raid_boss_standard {
	protected int aoe_skill = 310444035;
	protected int haste_skill = 273612803;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.AddTimerEx(9004, 40 * 1000);
super;
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
myself.i_ai1 = 1;
myself.AddUseSkillDesire(myself.sm, aoe_skill, 1, 0, 500000000);
	}

	protected void ATTACKED() {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) <= 20 && myself.i_ai2 == 0) {
myself.AddUseSkillDesire(myself.sm, haste_skill, 1, 0, 500000000);
myself.Say(gg.MakeFString(1800178, "", "", "", "", ""));
myself.i_ai2 = 1;

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id) {
if (skill_name_id == aoe_skill) {
if (myself.i_ai1 < 5) {
myself.AddUseSkillDesire(myself.sm, aoe_skill, 1, 0, 500000000);
myself.i_ai1 = myself.i_ai1 + 1;

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam party0, HandlerParam h0) {
if (timer_id == 9004) {
if (myself.i_ai0 == 1) {
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
myself.RemoveAllDesire();
c0 = h0.creature;
i2 = myself.InstantZone_GetId();
if (c0.instant_zone_id == i2) {
myself.AddMoveToDesire(gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z), 100000000);

}

}

}
myself.AddTimerEx(9004, 45 * 1000);

}
super;
	}


}