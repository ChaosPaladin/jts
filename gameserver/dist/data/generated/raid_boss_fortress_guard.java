package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_fortress_guard extends warrior_fortress_officer {
	protected int clanbuff = 264110083;
	protected int silhouette = 33;
	protected String ai_type = "wolf";
	protected int max_spawn = 20;
	protected int spawn_prob = 5;
	protected int one_point_prob = 20;
	protected int msg_one_point = -1;
	protected int spawn_x = 30;
	protected int spawn_y = 30;

	protected void CREATED() {
myself.i_ai2 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam i1) {
super;
if (myself.i_ai2 < max_spawn && gg.Rand(100) < spawn_prob) {
i0 = myself.GetDirection(myself.sm);
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
i1 = gg.GetIndexFromCreature(myself.top_desire_target);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x + gg.Rand(spawn_x)), gg.FloatToInt(myself.sm.y + gg.Rand(spawn_y)), gg.FloatToInt(myself.sm.z), i0, 1000, i1, 0);

} else {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x + gg.Rand(spawn_x)), gg.FloatToInt(myself.sm.y + gg.Rand(spawn_y)), gg.FloatToInt(myself.sm.z), i0, 0, 0, 0);

}
myself.i_ai2 = myself.i_ai2 + 1;

}
if (gg.Rand(100) < 1) {
if (myself.Skill_GetConsumeMP(clanbuff) < myself.sm.mp && myself.Skill_GetConsumeHP(clanbuff) < myself.sm.hp && myself.Skill_InReuseDelay(clanbuff) == 0) {
myself.AddUseSkillDesire(myself.sm, clanbuff, 1, 1, 1000000);

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0, HandlerParam c0, HandlerParam i1) {
super;
if (gg.Rand(100) < one_point_prob && speller.is_pc != 0 && myself.IsInCategory(3, speller.occupation) != 0) {
if (msg_one_point > 0) {
myself.Shout(gg.MakeFString(msg_one_point, speller.name, "", "", "", ""));

}
myself.RemoveAllAttackDesire();
myself.MakeAttackEvent(speller, 100, 0);
if (myself.IsNullCreature(speller) == 0) {
i0 = gg.GetIndexFromCreature(speller);
myself.BroadcastScriptEvent(15000001, i0, 2000);

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (myself.sm != private) {
myself.i_ai2 = myself.i_ai2 - 1;

}
	}

	protected void MY_DYING() {
myself.BroadcastScriptEvent(11039, gg.GetIndexFromCreature(myself.sm), 2000);
super;
	}


}