package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pailaka_pet_ai extends abstract_npc {
	protected int DDMagic = 377552897;
	protected int DDMagic2 = 377552898;
	protected int step_action_id = 1071;

	protected void CREATED() {
myself.AddPetDefaultDesire_Follow(20.000000);
myself.AddTimerEx(1000, 1000);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam action_id, HandlerParam i0, HandlerParam c0) {
if (DDMagic == 0) {
return;

}
i0 = myself.master.target_index;
if (i0 <= 0) {
return;

}
c0 = gg.GetCreatureFromIndex(i0);
if (myself.IsNullCreature(c0) == 0) {
if (action_id == step_action_id) {
myself.RemoveAllAttackDesire();
if (gg.IsSameString(myself.sm.name, "pailaka_summon_01") == 1) {
myself.AddUseSkillDesireEx(myself.master.target_id, DDMagic, 0, reply, ask, 1000000, 0);

} else {
myself.AddUseSkillDesireEx(myself.master.target_id, DDMagic2, 0, reply, ask, 1000000, 0);

}
myself.AddAttackDesireEx(myself.master.target_id, 1, 0, 50000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
if (myself.sm.instant_zone_id == 0) {
myself.Despawn();

}

}
myself.AddTimerEx(1000, 2000);
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam maker0, HandlerParam attacker) {
if (myself.IsNullCreature(attacker) == 0) {
myself.BroadcastScriptEvent(2316003, gg.GetIndexFromCreature(attacker), 2000);

}
	}


}