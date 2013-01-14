package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_46_normal_boss extends inzone_raid_boss_standard {
	protected int Skill01 = 343998468;
	protected int Skill01_Probablity = 5;
	protected int Skill01_Target_Type = 1;
	protected int Skill02 = 271122436;
	protected int Skill02_Probablity = 20;
	protected int Skill02_Target_Type = 2;
	protected int soul_skill = 368640001;

	protected void CREATED() {
myself.AddTimerEx(9004, 20 * 1000);
super;
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
myself.RemoveAllDesire();
myself.AddUseSkillDesire(h0.creature, soul_skill, 0, 1, 999999999999999999);

}

}
myself.AddTimerEx(9004, 21 * 1000);

}
super;
	}


}