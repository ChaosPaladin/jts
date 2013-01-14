package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_npc_orator_of_revelations extends default_npc {
	protected int Buff1 = 285999105;
	protected int Buff2 = 285999106;
	protected int Buff3 = 286064641;
	protected int Buff4 = 286064642;
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
myself.AddTimerEx(5097, 60 * 1000);
myself.AddTimerEx(5099, 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 5097) {
switch (gg.Rand(4)) {
case 0: {
myself.Say(gg.MakeFString(1000305, "", "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000421, "", "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000422, "", "", "", "", ""));
break;

}
case 3: {
myself.Say(gg.MakeFString(1000423, "", "", "", "", ""));
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

} else if (timer_id == 5099) {
myself.LookNeighbor(300);
myself.AddTimerEx(5099, 1000);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1) {
if (myself.GetSSQStatus() == 3) {
if (creature.is_pc == 1 && gg.GetSSQPart(creature) != 0 && gg.GetSSQPart(creature) == myself.GetSSQWinner() || myself.IsInCategory(12, creature.npc_class_id) && myself.IsInCategory(35, creature.npc_class_id) == 0 && gg.GetSSQPart(creature.master) != 0 && gg.GetSSQPart(creature.master) == myself.GetSSQWinner()) {
i0 = gg.Rand(100);
i1 = gg.Rand(10000);
if (myself.IsInCategory(0, creature.occupation) || myself.IsInCategory(12, creature.npc_class_id) && myself.IsInCategory(35, creature.npc_class_id) == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Buff1)) <= 0) {
if (i1 < 1) {
myself.Say(gg.MakeFString(1000306, "", "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(Buff1) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff1) < myself.sm.hp && myself.Skill_InReuseDelay(Buff1) == 0) {
myself.AddUseSkillDesire(creature, Buff1, 0, 0, 1000000);

}

} else if (i0 < 5) {
if (i1 < 500) {
myself.Say(gg.MakeFString(1000424, creature.name, "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(Buff2) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff2) < myself.sm.hp && myself.Skill_InReuseDelay(Buff2) == 0) {
myself.AddUseSkillDesire(creature, Buff2, 0, 0, 1000000);

}

}

} else if (myself.IsInCategory(1, creature.occupation)) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Buff3)) <= 0) {
if (i1 < 1) {
myself.Say(gg.MakeFString(1000426, "", "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(Buff3) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff3) < myself.sm.hp && myself.Skill_InReuseDelay(Buff3) == 0) {
myself.AddUseSkillDesire(creature, Buff3, 0, 0, 1000000);

}

} else if (i0 < 5) {
if (i1 < 500) {
myself.Say(gg.MakeFString(1000425, creature.name, "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(Buff4) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff4) < myself.sm.hp && myself.Skill_InReuseDelay(Buff4) == 0) {
myself.AddUseSkillDesire(creature, Buff4, 0, 0, 1000000);

}

}

}

}

}
	}


}