package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pet_cute_baby_use_2skill extends default_npc {
	protected int Heal1 = 263979009;
	protected int Heal2 = 263979009;

	protected void CREATED() {
myself.AddPetDefaultDesire_Follow(20.000000);
myself.AddTimerEx(3000, 1000);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 3000) {
if (gg.Rand(100) <= 25) {
if (myself.sm.level < 70) {
i0 = myself.sm.level / 10;
if (i0 < 0) {
i0 = 1;

}

} else {
i0 = 7 + myself.sm.level - 70 / 5;

}
if (i0 > 12) {
i0 = 12;

}
i0 = i0 + Heal1;
if (myself.Skill_GetConsumeMP(i0) < myself.sm.mp && myself.Skill_GetConsumeHP(i0) < myself.sm.hp && myself.Skill_InReuseDelay(i0) == 0) {
i1 = gg.FloatToInt(myself.master.hp / myself.master.max_hp * 100);
if (i1 < 80 && i1 > 0) {
myself.AddUseSkillDesire(myself.master, i0, 0, 1, 1000000);

}

} else if (myself.Skill_InReuseDelay(i0) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(i0) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(i0) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}
if (gg.Rand(100) <= 75) {
if (myself.sm.level < 70) {
i0 = myself.sm.level / 10;
if (i0 < 0) {
i0 = 1;

}

} else {
i0 = 7 + myself.sm.level - 70 / 5;

}
if (i0 > 12) {
i0 = 12;

}
i0 = i0 + Heal2;
if (myself.Skill_GetConsumeMP(i0) < myself.sm.mp && myself.Skill_GetConsumeHP(i0) < myself.sm.hp && myself.Skill_InReuseDelay(i0) == 0) {
i1 = gg.FloatToInt(myself.master.hp / myself.master.max_hp * 100);
if (i1 < 15 && i1 > 0) {
myself.AddUseSkillDesire(myself.master, i0, 0, 1, 1000000);

}

} else if (myself.Skill_InReuseDelay(i0) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(i0) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(i0) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}
myself.AddTimerEx(3000, 1000);

}
	}


}