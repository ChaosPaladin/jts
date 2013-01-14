package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class summon_magical_tanker_use_3skill extends default_npc {
	protected int DeBuff1 = 285868034;
	protected int DeBuff2 = 285868034;
	protected int Heal = 263979009;
	protected int buff3 = 458752001;
	protected int buff4 = 458752001;
	protected int buff5 = 458752001;
	protected int buff_target3 = 0;
	protected int buff_target4 = 0;
	protected int buff_target5 = 0;
	protected int buff_action3 = -1;
	protected int buff_action4 = -1;
	protected int buff_action5 = -1;

	protected void CREATED() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam action_id, HandlerParam i0, HandlerParam c0, HandlerParam so0) {
if (action_id == 1013) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, DeBuff1, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(DeBuff1) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(DeBuff1) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(DeBuff1) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

} else if (action_id == 1014) {
if (myself.Skill_GetConsumeMP(DeBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff2) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, DeBuff2, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(DeBuff2) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(DeBuff2) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(DeBuff2) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

} else if (action_id == 1015) {
if (myself.Skill_GetConsumeMP(Heal) < myself.sm.mp && myself.Skill_GetConsumeHP(Heal) < myself.sm.hp && myself.Skill_InReuseDelay(Heal) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, Heal, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(Heal) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(Heal) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(Heal) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

} else {
if (buff3 != 458752001 && buff_action3 != -1) {
if (action_id == buff_action3) {
if (myself.Skill_GetConsumeMP(buff3) < myself.sm.mp && myself.Skill_GetConsumeHP(buff3) < myself.sm.hp && myself.Skill_InReuseDelay(buff3) == 0) {
if (buff_target3 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, buff3, 0, reply, ask, 1000000, 0);

} else if (buff_target3 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, buff3, 0, reply, ask, 1000000, 0);

} else if (buff_target3 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, buff3, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(buff3) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(buff3) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(buff3) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (buff4 != 458752001 && buff_action4 != -1) {
if (action_id == buff_action4) {
if (myself.Skill_GetConsumeMP(buff4) < myself.sm.mp && myself.Skill_GetConsumeHP(buff4) < myself.sm.hp && myself.Skill_InReuseDelay(buff4) == 0) {
if (buff_target4 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, buff4, 0, reply, ask, 1000000, 0);

} else if (buff_target4 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, buff4, 0, reply, ask, 1000000, 0);

} else if (buff_target4 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, buff4, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(buff4) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(buff4) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(buff4) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (buff5 != 458752001 && buff_action5 != -1) {
if (action_id == buff_action5) {
if (myself.Skill_GetConsumeMP(buff5) < myself.sm.mp && myself.Skill_GetConsumeHP(buff5) < myself.sm.hp && myself.Skill_InReuseDelay(buff5) == 0) {
if (buff_target5 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, buff5, 0, reply, ask, 1000000, 0);

} else if (buff_target5 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, buff5, 0, reply, ask, 1000000, 0);

} else if (buff_target5 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, buff5, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(buff5) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(buff5) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(buff5) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

}
	}


}