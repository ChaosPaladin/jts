package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_ag_teleport_bomb extends warrior_bomb {
	protected int TeleportEffect = 306118657;
	protected int SelfRangeDDMagic = 0;
	protected int SelfRangeDDMagic2 = 0;
	protected int SelfRangeDDMagic3 = 0;

	protected void CREATED() {
myself.i_ai0 = myself.GetCurrentTick();
myself.i_ai1 = 0;
super;
	}

	protected void NO_DESIRE(HandlerParam i0) {
i0 = myself.GetCurrentTick() - myself.i_ai0;
if (i0 >= 10 && myself.i_ai1 == 0) {
myself.InstantRandomTeleportInMyTerritory();
if (myself.Skill_GetConsumeMP(TeleportEffect) < myself.sm.mp && myself.Skill_GetConsumeHP(TeleportEffect) < myself.sm.hp && myself.Skill_InReuseDelay(TeleportEffect) == 0) {
myself.AddUseSkillDesire(myself.sm, TeleportEffect, 1, 1, 1000000);

}
myself.i_ai0 = myself.GetCurrentTick();

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai1 == 0 && creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
myself.i_ai1 = 1;
myself.InstantTeleport(myself.sm, gg.FloatToInt(creature.x), gg.FloatToInt(creature.y), gg.FloatToInt(creature.z));
if (myself.Skill_GetConsumeMP(TeleportEffect) < myself.sm.mp && myself.Skill_GetConsumeHP(TeleportEffect) < myself.sm.hp && myself.Skill_InReuseDelay(TeleportEffect) == 0) {
myself.AddUseSkillDesire(myself.sm, TeleportEffect, 1, 1, 1000000);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai1 == 0 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.i_ai1 = 1;
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));
if (myself.Skill_GetConsumeMP(TeleportEffect) < myself.sm.mp && myself.Skill_GetConsumeHP(TeleportEffect) < myself.sm.hp && myself.Skill_InReuseDelay(TeleportEffect) == 0) {
myself.AddUseSkillDesire(myself.sm, TeleportEffect, 1, 1, 1000000);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == TeleportEffect) {
if (myself.i_ai1 == 1) {
myself.i_ai1 = 2;
myself.AddTimerEx(1001, 5000);

}

} else if (skill_name_id == SelfRangeDDMagic2) {
if (SelfRangeDDMagic2 != 0) {
if (success == 1) {
myself.Suicide();

}

}

} else if (skill_name_id == SelfRangeDDMagic3) {
if (SelfRangeDDMagic3 != 0) {
if (success == 1) {
myself.Suicide();

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 1001) {
i0 = gg.Rand(100);
if (i0 < 33) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 1000000);

}

} else if (i0 < 66) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic2) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic2) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic2) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic2, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(SelfRangeDDMagic3) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic3) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic3) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic3, 0, 1, 1000000);

}

}
	}


}