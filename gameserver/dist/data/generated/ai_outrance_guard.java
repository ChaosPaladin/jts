package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_outrance_guard extends warrior_use_skill {
	protected void CREATED() {
myself.AddTimerEx(2001, 30 * 1000);
super;
	}

	protected void NO_DESIRE() {
if (gg.FloatToInt(myself.sm.x) != myself.start_x) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(343343109)) < 0 && myself.InMyTerritory(myself.sm) == 1) {
myself.AddUseSkillDesire(attacker, 300023809, 0, 1, 1000000);
myself.Say(gg.MakeFString(1800108, "", "", "", "", ""));

} else {
super;

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(343343109)) < 0) {
if (myself.InMyTerritory(myself.sm) == 1 && speller.is_pc != 0) {
myself.AddUseSkillDesire(speller, 268566537, 0, 1, 1000000);

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam victim) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(343343109)) > 0) {
myself.AddAttackDesire(attacker, 1, 20000);
super;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.RemoveAllDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}
myself.AddTimerEx(2001, 30 * 1000);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam damage) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(343343109)) > 0) {
super;

}
	}


}