package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class great_eye extends citizen {
	protected int WarriorBuff = 71172098;
	protected int WarriorDeBuff = 79036435;
	protected int WizardBuff = 69402627;
	protected int WizardDeBuff = 70975505;

	protected void CREATED() {
myself.AddMoveSuperPointDesire(myself.sm.name, 0, 2000);
myself.i_ai0 = 0;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 6543) {
myself.i_ai0 = 0;

}
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0) {
if (gg.Rand(100) < 50) {
if (myself.i_ai0 == 0) {
i0 = gg.Rand(30);
if (i0 < 10) {
myself.Say(gg.MakeFString(1000458, "", "", "", "", ""));

} else if (i0 < 20) {
myself.Say(gg.MakeFString(1000459, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1000460, "", "", "", "", ""));

}
myself.i_ai0 = 1;
myself.AddTimerEx(6543, 30000);

}
if (myself.IsInCategory(0, talker.occupation)) {
if (myself.Skill_GetConsumeMP(WarriorDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(WarriorDeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(WarriorDeBuff) == 0) {
myself.AddUseSkillDesire(talker, WarriorDeBuff, 0, 1, 1000000);

}

} else if (myself.IsInCategory(1, talker.occupation)) {
if (myself.Skill_GetConsumeMP(WizardDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(WizardDeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(WizardDeBuff) == 0) {
myself.AddUseSkillDesire(talker, WizardDeBuff, 0, 1, 1000000);

}

}

} else {
if (myself.i_ai0 == 0) {
i0 = gg.Rand(30);
if (i0 < 10) {
myself.Say(gg.MakeFString(1000461, "", "", "", "", ""));

} else if (i0 < 20) {
myself.Say(gg.MakeFString(1000462, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1000463, "", "", "", "", ""));

}

}
if (myself.IsInCategory(0, talker.occupation)) {
if (myself.Skill_GetConsumeMP(WarriorBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(WarriorBuff) < myself.sm.hp && myself.Skill_InReuseDelay(WarriorBuff) == 0) {
myself.AddUseSkillDesire(talker, WarriorBuff, 1, 1, 1000000);

}

} else if (myself.IsInCategory(1, talker.occupation)) {
if (myself.Skill_GetConsumeMP(WizardBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(WizardBuff) < myself.sm.hp && myself.Skill_InReuseDelay(WizardBuff) == 0) {
myself.AddUseSkillDesire(talker, WizardBuff, 1, 1, 1000000);

}

}

}
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
myself.AddMoveSuperPointDesire(myself.sm.name, 0, 50);
super;
	}


}