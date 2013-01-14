package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv3_wizard_private extends lv3_party_private_monster {
	protected int SelfRangeDDMagic1 = 271253505;
	protected int SelfRangeDDMagic2 = 271253505;
	protected int SelfRangeDDMagic3 = 271253505;

	protected void CREATED(HandlerParam c0) {
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.DistFromMe(myself.c_ai0) < 100 && myself.GetLifeTime() > 3) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddAttackDesire(myself.c_ai0, 1, 300);

}

}
gg.SendScriptEvent(myself.boss, 1000, gg.GetIndexFromCreature(myself.sm));
myself.AddTimerEx(4000, 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 4000) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.DistFromMe(myself.c_ai0) < 100) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic1, 0, 1, 1000000);

}
myself.AddAttackDesire(myself.c_ai0, 1, 50);

}
myself.AddTimerEx(4000, 1000);

}
super;
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
return;
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.DistFromMe(myself.c_ai0) < 100) {
myself.AddUseSkillDesire(myself.c_ai0, SelfRangeDDMagic1, 0, 1, 1000000);

} else {
myself.AddFollowDesire(myself.c_ai0, 1000);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == SelfRangeDDMagic1) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (gg.Rand(100) < 50 && myself.DistFromMe(myself.c_ai0) < 200) {
myself.AddUseSkillDesire(myself.c_ai0, SelfRangeDDMagic2, 0, 1, 3000);

} else {
myself.AddUseSkillDesire(myself.c_ai0, SelfRangeDDMagic3, 0, 1, 3000);

}

}
myself.RemoveAllAttackDesire();

} else {
myself.Suicide();

}
	}


}