package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pet_use_one_skill extends default_npc {
	protected int DDMagic = 458752001;

	protected void CREATED() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0) {
if (DDMagic == 0) {
return;

}
i0 = myself.master.target_index;
if (i0 <= 0) {
return;

}
c0 = gg.GetCreatureFromIndex(i0);
if (myself.IsNullCreature(c0) == 0) {
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
i0 = i0 + DDMagic;
if (myself.Skill_GetConsumeMP(i0) < myself.sm.mp && myself.Skill_GetConsumeHP(i0) < myself.sm.hp && myself.Skill_InReuseDelay(i0) == 0) {
myself.RemoveAllAttackDesire();
myself.AddUseSkillDesireEx(myself.master.target_id, i0, 0, reply, ask, 1000000, 0);
myself.AddAttackDesireEx(myself.master.target_id, 1, 0, 50000);

} else if (myself.Skill_InReuseDelay(i0) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(i0) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(i0) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}
	}


}