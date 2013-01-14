package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv3_party_private_monster extends lv3_monster {
	protected void CREATED() {
myself.sm.param1 = myself.boss.param1;
myself.sm.param2 = myself.boss.param2;
myself.sm.param3 = myself.boss.param3;
myself.AddTimerEx(3007, 5000);
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 50);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam f0) {
if (myself.IsMyBossAlive() == 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}

} else if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * damage * myself.sm.weight_point * 10);

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam f0) {
if (myself.IsMyBossAlive() == 0 && myself.GetLifeTime() > 7) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 30);

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0) {
if (myself.IsMyBossAlive() == 0) {
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
if (myself.p_state == 3 && myself.top_desire_target == target) {
i0 = myself.Skill_GetEffectPoint(skill_name_id);
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, speller.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (speller.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == speller.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * i0 / myself.sm.level + 7 + f0 / 100 * 1.000000 * i0 / myself.sm.level + 7;
myself.AddAttackDesire(speller, 1, f0 * 150);

}

}
if (myself.GetPathfindFailCount() > 10 && speller == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(speller.x), gg.FloatToInt(speller.y), gg.FloatToInt(speller.z));

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private == myself.boss) {
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1005) {
if (myself.InMyTerritory(myself.sm) == 0 && myself.IsMyBossAlive() != 0 && myself.p_state != 3) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z));
myself.RemoveAllAttackDesire();

}
myself.AddTimerEx(1005, 120 * 1000);

}
if (timer_id == 3007) {
if (myself.IsMyBossAlive() == 0) {
myself.Despawn();

} else {
myself.AddTimerEx(3007, 5000);

}

}
super;
	}


}