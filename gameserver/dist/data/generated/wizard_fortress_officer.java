package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_fortress_officer extends wizard_basic {
	protected int fortress_id = 0;
	protected int barrack_id = 0;
	protected int toggle_buff = 0;
	protected int msg_dying = -1;
	protected int out_of_territory_use = 1;
	protected int comeback_timer = 5;
	protected int selfheal_skill = 458752001;
	protected String maker_name1 = "wizard_fortress_officer_maker_default_1";
	protected String maker_name2 = "wizard_fortress_officer_maker_default_2";
	protected String maker_name3 = "wizard_fortress_officer_maker_default_3";
	protected String maker_name4 = "wizard_fortress_officer_maker_default_4";
	protected String maker_name5 = "wizard_fortress_officer_maker_default_5";

	protected void MY_DYING(HandlerParam maker0) {
if (msg_dying > 0) {
myself.Shout(gg.MakeFString(msg_dying, "", "", "", "", ""));

}
myself.Fortress_BarrackCaptured(myself.sm.id, fortress_id, barrack_id);
super;
	}

	protected void CREATED(HandlerParam i0, HandlerParam i1) {
i0 = gg.Fortress_GetFacilityLevel(fortress_id, 1);
if (i0 > 0) {
i1 = toggle_buff + i0 - 1;
if (myself.Skill_GetConsumeMP(i1) < myself.sm.mp && myself.Skill_GetConsumeHP(i1) < myself.sm.hp && myself.Skill_InReuseDelay(i1) == 0) {
myself.AddUseSkillDesire(myself.sm, i1, 1, 0, 1000000);

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.Fortress_GetPledgeSiegeState(creature) == 2 || myself.IsNullCreature(creature.master) == 0 && myself.Fortress_GetPledgeSiegeState(creature.master) == 2) {
return;

}
super;
	}

	protected void OUT_OF_TERRITORY() {
if (out_of_territory_use == 0) {
return;

}
if (comeback_timer > 0) {
myself.AddTimerEx(3079, comeback_timer * 1000);

} else if (myself.InMyTerritory(myself.sm) != 1) {
myself.RemoveAllAttackDesire();
if (myself.Skill_GetConsumeMP(selfheal_skill) < myself.sm.mp && myself.Skill_GetConsumeHP(selfheal_skill) < myself.sm.hp && myself.Skill_InReuseDelay(selfheal_skill) == 0) {
myself.AddUseSkillDesire(myself.sm, selfheal_skill, 1, 1, 1000000);

}
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 1000000);
return;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3079) {
if (out_of_territory_use == 0) {
return;

}
if (myself.InMyTerritory(myself.sm) != 1) {
myself.RemoveAllAttackDesire();
if (myself.Skill_GetConsumeMP(selfheal_skill) < myself.sm.mp && myself.Skill_GetConsumeHP(selfheal_skill) < myself.sm.hp && myself.Skill_InReuseDelay(selfheal_skill) == 0) {
myself.AddUseSkillDesire(myself.sm, selfheal_skill, 1, 1, 1000000);

}
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 1000000);
return;

}

}
	}


}