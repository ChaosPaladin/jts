package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pet_wizard_use_2skill extends default_npc {
	protected int DDMagic = 262209537;
	protected int Heal = 263979009;

	protected void CREATED() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam action_id, HandlerParam i0, HandlerParam c0, HandlerParam so0) {
switch (action_id) {
case 1005: {
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
break;

}
case 1006: {
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
i0 = i0 + Heal;
if (myself.Skill_GetConsumeMP(i0) < myself.sm.mp && myself.Skill_GetConsumeHP(i0) < myself.sm.hp && myself.Skill_InReuseDelay(i0) == 0) {
myself.AddUseSkillDesireEx(myself.sm.id, i0, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(i0) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(i0) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(i0) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}
break;

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam i0, HandlerParam reply, HandlerParam ask) {
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
i0 = i0 + Heal;
if (skill_name_id == i0) {
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