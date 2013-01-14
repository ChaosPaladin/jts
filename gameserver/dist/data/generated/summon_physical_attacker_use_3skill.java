package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class summon_physical_attacker_use_3skill extends default_npc {
	protected int PhysicalSpecial1 = 285868034;
	protected int PhysicalSpecial2 = 285868034;
	protected int PhysicalSpecial3 = 285868034;

	protected void CREATED() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam action_id, HandlerParam i0, HandlerParam c0, HandlerParam so0) {
switch (action_id) {
case 1016: {
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, PhysicalSpecial1, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(PhysicalSpecial1) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(PhysicalSpecial1) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(PhysicalSpecial1) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}
break;

}
case 1017: {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, PhysicalSpecial2, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(PhysicalSpecial2) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(PhysicalSpecial2) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(PhysicalSpecial2) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}
break;

}
case 1018: {
if (myself.Skill_GetConsumeMP(PhysicalSpecial3) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial3) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial3) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, PhysicalSpecial3, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(PhysicalSpecial3) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(PhysicalSpecial3) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(PhysicalSpecial3) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}
break;

}
case 1031: {
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, PhysicalSpecial1, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(PhysicalSpecial1) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(PhysicalSpecial1) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(PhysicalSpecial1) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}
break;

}
case 1032: {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, PhysicalSpecial2, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(PhysicalSpecial2) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(PhysicalSpecial2) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(PhysicalSpecial2) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}
break;

}
case 1033: {
if (myself.Skill_GetConsumeMP(PhysicalSpecial3) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial3) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial3) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, PhysicalSpecial3, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(PhysicalSpecial3) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(PhysicalSpecial3) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(PhysicalSpecial3) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}
break;

}
case 1034: {
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, PhysicalSpecial1, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(PhysicalSpecial1) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(PhysicalSpecial1) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(PhysicalSpecial1) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}
break;

}
case 1035: {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, PhysicalSpecial2, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(PhysicalSpecial2) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(PhysicalSpecial2) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(PhysicalSpecial2) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}
break;

}
case 1036: {
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, PhysicalSpecial1, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(PhysicalSpecial1) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(PhysicalSpecial1) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(PhysicalSpecial1) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}
break;

}
case 1037: {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, PhysicalSpecial2, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(PhysicalSpecial2) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(PhysicalSpecial2) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(PhysicalSpecial2) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}
break;

}
case 1038: {
if (myself.Skill_GetConsumeMP(PhysicalSpecial3) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial3) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial3) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, PhysicalSpecial3, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(PhysicalSpecial3) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(PhysicalSpecial3) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(PhysicalSpecial3) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}
break;

}

}
	}


}