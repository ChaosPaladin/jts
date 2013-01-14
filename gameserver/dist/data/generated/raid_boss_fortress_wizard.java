package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_fortress_wizard extends wizard_fortress_officer {
	protected int final_skill_id = 267255809;
	protected int final_skill_prob = 2;
	protected int Buff = 264110083;
	protected int send_zen_id = 0;
	protected int zen_skill_interval = 15;
	protected int spawn_interval = 0;
	protected int max_spawn = 0;
	protected int spawn_prob = 5;
	protected int spawn_x = 50;
	protected int spawn_y = 50;
	protected int silhouette = 33;
	protected String ai_type = "wolf";
	protected int msg_final_skill = -1;

	protected void CREATED() {
myself.BroadcastScriptEvent(1009, gg.GetIndexFromCreature(myself.sm), 2000);
myself.AddTimerEx(2001, 30 * 1000);
if (spawn_interval > 0) {
myself.AddTimerEx(2099, spawn_interval * 1000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
super;
if (gg.Rand(100) < final_skill_prob) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
myself.RemoveAllAttackDesire();
if (msg_final_skill > -1) {
myself.Shout(gg.MakeFString(msg_final_skill, "", "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(final_skill_id) < myself.sm.mp && myself.Skill_GetConsumeHP(final_skill_id) < myself.sm.hp && myself.Skill_InReuseDelay(final_skill_id) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, final_skill_id, 0, 1, 1000000);

}

}

}
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_level, HandlerParam skill_name_id, HandlerParam s0, HandlerParam i0) {
if (myself.IsInCombatMode(myself.sm) == 0) {
return;

}
if (skill_id == 5397) {
if (skill_level > 1) {
myself.RemoveAllAttackDesire();
if (msg_final_skill > -1) {
myself.Shout(gg.MakeFString(msg_final_skill, "", "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(final_skill_id) < myself.sm.mp && myself.Skill_GetConsumeHP(final_skill_id) < myself.sm.hp && myself.Skill_InReuseDelay(final_skill_id) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, final_skill_id, 0, 1, 1000000);

}

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
if (myself.IsInCombatMode(myself.sm) == 1 && myself.i_ai2 < max_spawn) {
myself.i_ai2 = myself.i_ai2 - 1;

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 2001) {
myself.BroadcastScriptEvent(1009, gg.GetIndexFromCreature(myself.sm), 2000);
myself.AddTimerEx(2001, 10 * 1000);

} else if (timer_id == 2099) {
if (myself.IsInCombatMode(myself.sm) == 1) {
if (myself.i_ai2 < max_spawn && gg.Rand(100) < spawn_prob) {
i0 = myself.GetDirection(myself.sm);
i1 = gg.GetIndexFromCreature(myself.top_desire_target);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x - gg.Rand(spawn_x)), gg.FloatToInt(myself.sm.y - gg.Rand(spawn_y)), gg.FloatToInt(myself.sm.z), i0, 1000, i1, 0);
myself.i_ai2 = myself.i_ai2 + 1;

}

} else {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;

}
myself.AddTimerEx(2099, spawn_interval * 1000);

}
super;
	}


}