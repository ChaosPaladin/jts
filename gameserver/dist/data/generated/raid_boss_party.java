package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_party extends raid_boss_standard {
	protected String Privates = "orc:party_private:1:20sec";

	protected void CREATED() {
myself.sm.weight_point = 10;
myself.CreatePrivates(Privates);
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam i0, HandlerParam c0, HandlerParam i1) {
c0 = attacker;
if (private != myself.sm) {
if (attacker.level > myself.sm.level + 8) {
i1 = 0;
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(different_level_9_attacked)) == -1) {
if (different_level_9_attacked == 295895041) {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);
myself.RemoveAttackDesire(attacker.id);
return;

} else {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);

}

}

}
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(295895041)) == -1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 20000);

}

}
i0 = 8 + gg.Rand(13);
if (myself.GetPathfindFailCount() > i0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.DistFromMe(myself.top_desire_target) < 1000) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.top_desire_target.x), gg.FloatToInt(myself.top_desire_target.y), gg.FloatToInt(myself.top_desire_target.z));

} else {
myself.RemoveAllAttackDesire();
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 20000);

}
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));

}

}

}

}
if (myself.sm.in_peacezone != 0) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllAttackDesire();

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, 100 + gg.Rand(50));

}
	}


}