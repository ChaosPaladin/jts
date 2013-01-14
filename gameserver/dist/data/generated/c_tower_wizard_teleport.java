package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_wizard_teleport extends wizard_use_skill {
	protected int MagicAfterTeleport01 = 264241153;
	protected int MagicAfterTeleport02 = 264241153;
	protected int Teleport_Visual = 341966849;

	protected void CREATED() {
myself.AddTimerEx(5088, 15000);
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success, HandlerParam h0, HandlerParam i0, HandlerParam i1) {
if (success == 1) {
if (skill_name_id == Teleport_Visual) {
myself.InstantRandomTeleportInMyTerritory();
myself.RemoveAllDesire();
i0 = myself.GetHateInfoCount();
if (i0 != 0) {
h0 = myself.GetMaxHateInfo(gg.Rand(i0));
i1 = gg.Rand(100);
if (gg.IsNull(h0.creature) == 0) {
if (i1 < 30) {
myself.AddUseSkillDesire(h0.creature, MagicAfterTeleport01, 0, 1, 999999999999999999);

} else {
myself.AddUseSkillDesire(h0.creature, MagicAfterTeleport02, 0, 1, 999999999999999999);

}

}

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 5088) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else {
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, Teleport_Visual, 1, 1, 999999999999999999);

}

}
myself.AddTimerEx(5088, 15000);
	}


}