package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_party_leader_named_monster extends party_leader_wizard {
	protected int W_SelfRangeDDMagic = 458752001;
	protected int W_LongRangeDDMagic = 458752001;
	protected int W_ShortRangeDDMagic = 458752001;
	protected String maker_name = "innadril22_2422_024m3";
	protected String DoorName = "cyratal_cave_a_e";

	protected void CREATED() {
myself.BroadcastScriptEvent(12557, 0, 4000);
myself.CreateOnePrivateEx(1022291, "wizard_use_skill", 0, 0, gg.FloatToInt(myself.sm.x + 20), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1022291, "wizard_use_skill", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 20), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.DistFromMe(attacker) > 200) {
if (gg.Rand(100) < 33) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else if (gg.Rand(100) < 33) {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 1, 1000000);

} else if (gg.Rand(100) < 33) {
myself.AddUseSkillDesire(attacker, W_SelfRangeDDMagic, 0, 1, 1000000);

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i6, HandlerParam i0) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
super;
return;

}
if (myself.GetHateInfoCount() == 0) {
if (myself.DistFromMe(creature) > 200) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(creature, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(creature, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(creature, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(creature, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(creature, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(creature, 1, 1000);

}
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
i0 = 0;
if (SeeCreatureAttackerTime == -1) {
if (SetAggressiveTime == -1) {
if (myself.GetLifeTime() >= gg.Rand(5) + 3 && myself.InMyTerritory(myself.sm)) {
i0 = 1;

}

} else if (SetAggressiveTime == 0) {
if (myself.InMyTerritory(myself.sm)) {
i0 = 1;

}

} else if (myself.GetLifeTime() > SetAggressiveTime + gg.Rand(4) && myself.InMyTerritory(myself.sm)) {
i0 = 1;

}

} else if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
i0 = 1;

}
if (myself.GetHateInfoCount() == 0 && i0 == 1) {
myself.AddHateInfo(creature, 300, 0, 1, 1);

} else {
myself.AddHateInfo(creature, 100, 0, 1, 1);

}
super;

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam i0, HandlerParam skill_name_id) {
if (myself.i_ai0 == 0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.DistFromMe(h0.creature) > 200) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

}

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam maker0) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12546, 0, 0);

}
super;
	}


}