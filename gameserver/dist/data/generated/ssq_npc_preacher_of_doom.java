package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_npc_preacher_of_doom extends default_npc {
	protected int DeBuff1 = 285802497;
	protected int DeBuff2 = 285802498;
	protected int DeBuff3 = 285868033;
	protected int DeBuff4 = 285868034;
	protected int PosX1 = 0;
	protected int PosY1 = 0;
	protected int PosZ1 = 0;
	protected int PosX2 = 0;
	protected int PosY2 = 0;
	protected int PosZ2 = 0;
	protected int PosX3 = 0;
	protected int PosY3 = 0;
	protected int PosZ3 = 0;
	protected int PosX4 = 0;
	protected int PosY4 = 0;
	protected int PosZ4 = 0;
	protected int PosX5 = 0;
	protected int PosY5 = 0;
	protected int PosZ5 = 0;

	protected void CREATED() {
myself.AddTimerEx(5097, 120 * 1000);
myself.AddTimerEx(5099, 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 5097) {
switch (gg.Rand(4)) {
case 0: {
myself.Say(gg.MakeFString(1000303, "", "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000415, "", "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000416, "", "", "", "", ""));
break;

}
case 3: {
myself.Say(gg.MakeFString(1000417, "", "", "", "", ""));
break;

}

}
if (myself.InMyTerritory(myself.sm)) {

} else {
myself.InstantRandomTeleportInMyTerritory();

}
myself.AddTimerEx(5097, 60 * 1000);

} else if (timer_id == 5098) {
i0 = gg.Rand(50);
if (i0 < 10 && PosX1 != 0) {
myself.InstantTeleport(myself.sm, PosX1, PosY1, PosZ1);

} else if (i0 > 10 && i0 <= 20 && PosX2 != 0) {
myself.InstantTeleport(myself.sm, PosX2, PosY2, PosZ2);

} else if (i0 > 20 && i0 < 30 && PosX3 != 0) {
myself.InstantTeleport(myself.sm, PosX3, PosY3, PosZ3);

} else if (i0 > 30 && i0 < 40 && PosX4 != 0) {
myself.InstantTeleport(myself.sm, PosX4, PosY4, PosZ4);

} else if (PosX5 != 0) {
myself.InstantTeleport(myself.sm, PosX5, PosY5, PosZ5);

}
myself.AddTimerEx(5098, 30 * 60 * 1000);

} else if (timer_id == 5099) {
myself.LookNeighbor(300);
myself.AddTimerEx(5099, 1000);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1) {
if (myself.GetSSQStatus() == 3) {
if (creature.is_pc == 1 && gg.GetSSQPart(creature) != 0 && gg.GetSSQPart(creature) != myself.GetSSQWinner() || myself.IsInCategory(12, creature.npc_class_id) && myself.IsInCategory(35, creature.npc_class_id) == 0 && gg.GetSSQPart(creature.master) != 0 && gg.GetSSQPart(creature.master) != myself.GetSSQWinner()) {
i0 = gg.Rand(100);
i1 = gg.Rand(10000);
if (myself.IsInCategory(0, creature.occupation) || myself.IsInCategory(12, creature.npc_class_id) && myself.IsInCategory(35, creature.npc_class_id) == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(DeBuff1)) <= 0) {
if (i1 < 1) {
myself.Say(gg.MakeFString(1000420, "", "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(creature, DeBuff1, 0, 0, 1000000);

}

} else if (i0 < 5) {
if (i1 < 500) {
myself.Say(gg.MakeFString(1000304, "", "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(DeBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff2) == 0) {
myself.AddUseSkillDesire(creature, DeBuff2, 0, 0, 1000000);

}

}

} else if (myself.IsInCategory(1, creature.occupation)) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(DeBuff3)) <= 0) {
if (i1 < 1) {
myself.Say(gg.MakeFString(1000418, creature.name, "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(DeBuff3) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff3) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff3) == 0) {
myself.AddUseSkillDesire(creature, DeBuff3, 0, 0, 1000000);

}

} else if (i0 < 5) {
if (i1 < 500) {
myself.Say(gg.MakeFString(1000419, creature.name, "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(DeBuff4) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff4) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff4) == 0) {
myself.AddUseSkillDesire(creature, DeBuff4, 0, 0, 1000000);

}

}

}

}

}
	}


}