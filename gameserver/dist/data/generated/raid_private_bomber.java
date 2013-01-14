package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_private_bomber extends default_npc {
	protected int DDMagic1 = 352321540;
	protected int DDMagic2 = 352321541;
	protected int DDMagic3 = 352321542;

	protected void CREATED() {
myself.AddTimerEx(5001, 15000);
myself.AddMoveAroundDesire(1000, 1000);
super;
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(1000, 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 5001) {
i0 = gg.Rand(3);
if (i0 == 0) {
myself.AddUseSkillDesire(myself.sm, DDMagic1, 0, 1, 1000000);

} else if (i0 == 1) {
myself.AddUseSkillDesire(myself.sm, DDMagic2, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(myself.sm, DDMagic3, 0, 1, 1000000);

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success) {
if (success == 1) {
myself.Despawn();

}
	}


}