package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_46_pccafe_boss extends inzone_raid_boss_standard {
	protected int Skill01 = 274399236;
	protected int Skill01_Probablity = 10;
	protected int Skill01_Target_Type = 1;
	protected int Skill01 = 340983812;
	protected int Skill01_Probablity = 5;
	protected int Skill01_Target_Type = 1;
	protected int teleport_visual = 341966849;
	protected int aoe_skill = 268763146;

	protected void CREATED() {
myself.AddTimerEx(9004, 30 * 1000);
myself.c_ai0 = gg.GetNullCreature();
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == 341966849 && success == 1) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.c_ai0.x), gg.FloatToInt(myself.c_ai0.y), gg.FloatToInt(myself.c_ai0.z));
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, aoe_skill, 0, 1, 999999999999999999);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam party0, HandlerParam h0) {
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
myself.c_ai0 = h0.creature;
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, teleport_visual, 0, 1, 999999999999999999);

}

}
myself.AddTimerEx(9004, 30 * 1000);

}
super;
	}


}