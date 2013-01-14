package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class summon_siege_tank extends default_npc {
	protected int DDMagic = 277217281;

	protected void CREATED() {
myself.Summon_SetOption(3, 1);
myself.Summon_SetOption(2, 1);
myself.AddPetDefaultDesire_Follow(20.000000);
myself.AddTimerEx(100020, 1000);
myself.AddTimerEx(100021, 1000 * 60);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0, HandlerParam action_id, HandlerParam so0) {
if (action_id == 22) {
i0 = myself.master.target_id;
if (i0 <= 0) {
return;

}
myself.AddMoveToTargetDesire(i0, 600, 0, 10000);

} else if (action_id == 32) {
myself.StopMove();
if (myself.sm.action == 1) {
myself.Say(gg.MakeFString(1110071, "", "", "", "", ""));

} else if (myself.sm.action == 2) {
myself.Say(gg.MakeFString(1110072, "", "", "", "", ""));

} else if (myself.sm.stop_mode == 1) {
myself.ChangeStopType(0, 30000);

} else {
myself.ChangeStopType(1, 30000);

}

} else if (action_id == 41) {
i0 = myself.master.target_id;
if (i0 <= 0) {
return;

}
if (myself.sm.action == 1) {
myself.Say(gg.MakeFString(1110071, "", "", "", "", ""));

} else if (myself.sm.action == 2) {
myself.Say(gg.MakeFString(1110072, "", "", "", "", ""));

} else if (myself.sm.stop_mode == 1) {
myself.Say(gg.MakeFString(1110073, "", "", "", "", ""));

} else if (myself.IsStaticObjectID(i0)) {
so0 = myself.GetStaticObjectFromID(i0);
if (myself.StaticObjectDistFromMe(so0) >= 2500) {
myself.Say(gg.MakeFString(1110074, "", "", "", "", ""));

} else {
if (myself.Skill_InReuseDelay(DDMagic)) {
myself.Say(gg.MakeFString(1010551, "", "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesireEx(i0, DDMagic, 0, reply, ask, 1000000, 0);

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 100020) {
if (myself.master.alive == 0) {
myself.Despawn();

}
myself.AddTimerEx(100020, 1000);

}
if (timer_id == 100021) {
if (myself.IsNullCreature(myself.master) == 0 && gg.OwnItemCount(myself.master, 2132) < 60 && gg.OwnItemCount(myself.master, 2132) >= 30) {
myself.Say(gg.MakeFString(1000169, "", "", "", "", ""));

}
myself.AddTimerEx(100021, 1000 * 60);

}
	}


}