package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_ag_shout_target extends party_leader_aggressive {
	protected int selfbuff = 458752001;

	protected void CREATED() {
myself.c_ai0 = gg.GetCreatureFromIndex(0);
myself.c_ai1 = gg.GetCreatureFromIndex(0);
myself.c_ai2 = gg.GetCreatureFromIndex(0);
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc != 0 && myself.IsInCategory(3, creature.occupation) != 0) {
if (myself.c_ai0 == gg.GetCreatureFromIndex(0)) {
myself.c_ai0 = creature;

} else if (myself.c_ai1 == gg.GetCreatureFromIndex(0)) {
myself.c_ai1 = creature;

} else if (myself.c_ai2 == gg.GetCreatureFromIndex(0)) {
myself.c_ai2 = creature;

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (gg.Rand(100) < 5) {
if (myself.Skill_GetConsumeMP(selfbuff) < myself.sm.mp && myself.Skill_GetConsumeHP(selfbuff) < myself.sm.hp && myself.Skill_InReuseDelay(selfbuff) == 0) {
myself.AddUseSkillDesire(myself.sm, selfbuff, 1, 1, 1000000);

}

}
if (gg.Rand(100) < 3) {
if (myself.top_desire_target == attacker) {
myself.Say(gg.MakeFString(1000399, attacker.name, "", "", "", ""));

}
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(attacker, 1, 1000000);
myself.sm.flag = gg.GetIndexFromCreature(attacker);
myself.BroadcastScriptEvent(10002, gg.GetIndexFromCreature(myself.sm), 2000);

}
if (myself.sm.hp < myself.sm.max_hp * 0.800000) {
myself.BroadcastScriptEvent(10034, 0, 2000);

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (myself.sm != private) {
myself.LookNeighbor(1000);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.c_ai0.hp > 1 && myself.c_ai0 != myself.sm) {
myself.Say(gg.MakeFString(1000399, myself.c_ai0.name, "", "", "", ""));
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(myself.c_ai0, 1, 1000000);
myself.sm.flag = gg.GetIndexFromCreature(myself.c_ai0);
myself.BroadcastScriptEvent(10002, gg.GetIndexFromCreature(myself.sm), 500);

}

}
if (myself.IsNullCreature(myself.c_ai1) == 0) {
if (myself.c_ai1.hp > 1 && myself.c_ai1 != myself.sm) {
myself.Say(gg.MakeFString(1000399, myself.c_ai1.name, "", "", "", ""));
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(myself.c_ai1, 1, 1000000);
myself.sm.flag = gg.GetIndexFromCreature(myself.c_ai1);
myself.BroadcastScriptEvent(10002, gg.GetIndexFromCreature(myself.sm), 500);

}

}
if (myself.IsNullCreature(myself.c_ai2) == 0) {
if (myself.c_ai2.hp > 1 && myself.c_ai2 != myself.sm) {
myself.Say(gg.MakeFString(1000399, myself.c_ai2.name, "", "", "", ""));
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(myself.c_ai2, 1, 1000000);
myself.sm.flag = gg.GetIndexFromCreature(myself.c_ai2);
myself.BroadcastScriptEvent(10002, gg.GetIndexFromCreature(myself.sm), 500);

}

}

}
	}

	protected void MY_DYING(HandlerParam maker0) {
maker0 = gg.GetNpcMaker("schuttgart13_mb2314_05m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10005, 0, 0);

}
myself.BroadcastScriptEvent(11036, 2, 7000);
	}


}