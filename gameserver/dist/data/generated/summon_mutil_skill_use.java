package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class summon_mutil_skill_use extends default_npc {
	protected int step_skill01 = 458752001;
	protected int step_skill02 = 458752001;
	protected int step_skill03 = 458752001;
	protected int step_skill04 = 458752001;
	protected int step_skill05 = 458752001;
	protected int step_skill06 = 458752001;
	protected int step_skill07 = 458752001;
	protected int step_skill08 = 458752001;
	protected int step_skill_target01 = 0;
	protected int step_skill_target02 = 0;
	protected int step_skill_target03 = 0;
	protected int step_skill_target04 = 0;
	protected int step_skill_target05 = 0;
	protected int step_skill_target06 = 0;
	protected int step_skill_target07 = 0;
	protected int step_skill_target08 = 0;
	protected int step_action01 = -1;
	protected int step_action02 = -1;
	protected int step_action03 = -1;
	protected int step_action04 = -1;
	protected int step_action05 = -1;
	protected int step_action06 = -1;
	protected int step_action07 = -1;
	protected int step_action08 = -1;

	protected void CREATED() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0, HandlerParam action_id) {
if (step_skill01 != 458752001 && step_action01 != -1) {
if (action_id == step_action01) {
if (myself.Skill_GetConsumeMP(step_skill01) < myself.sm.mp && myself.Skill_GetConsumeHP(step_skill01) < myself.sm.hp && myself.Skill_InReuseDelay(step_skill01) == 0) {
if (step_skill_target01 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step_skill01, 0, reply, ask, 1000000, 0);

} else if (step_skill_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step_skill01, 0, reply, ask, 1000000, 0);

} else if (step_skill_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step_skill01, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step_skill01) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step_skill01) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step_skill01) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step_skill02 != 458752001 && step_action02 != -1) {
if (action_id == step_action02) {
if (myself.Skill_GetConsumeMP(step_skill02) < myself.sm.mp && myself.Skill_GetConsumeHP(step_skill02) < myself.sm.hp && myself.Skill_InReuseDelay(step_skill02) == 0) {
if (step_skill_target02 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step_skill02, 0, reply, ask, 1000000, 0);

} else if (step_skill_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step_skill02, 0, reply, ask, 1000000, 0);

} else if (step_skill_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step_skill02, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step_skill02) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step_skill02) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step_skill02) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step_skill03 != 458752001 && step_action03 != -1) {
if (action_id == step_action03) {
if (myself.Skill_GetConsumeMP(step_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step_skill03) == 0) {
if (step_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step_skill03, 0, reply, ask, 1000000, 0);

} else if (step_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step_skill03, 0, reply, ask, 1000000, 0);

} else if (step_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step_skill03) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step_skill04 != 458752001 && step_action04 != -1) {
if (action_id == step_action04) {
if (myself.Skill_GetConsumeMP(step_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step_skill04) == 0) {
if (step_skill_target04 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step_skill04, 0, reply, ask, 1000000, 0);

} else if (step_skill_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step_skill04, 0, reply, ask, 1000000, 0);

} else if (step_skill_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step_skill04, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step_skill04) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step_skill04) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step_skill04) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step_skill05 != 458752001 && step_action05 != -1) {
if (action_id == step_action05) {
if (myself.Skill_GetConsumeMP(step_skill05) < myself.sm.mp && myself.Skill_GetConsumeHP(step_skill05) < myself.sm.hp && myself.Skill_InReuseDelay(step_skill05) == 0) {
if (step_skill_target05 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step_skill05, 0, reply, ask, 1000000, 0);

} else if (step_skill_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step_skill05, 0, reply, ask, 1000000, 0);

} else if (step_skill_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step_skill05, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step_skill05) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step_skill05) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step_skill05) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step_skill06 != 458752001 && step_action06 != -1) {
if (action_id == step_action06) {
if (myself.Skill_GetConsumeMP(step_skill06) < myself.sm.mp && myself.Skill_GetConsumeHP(step_skill06) < myself.sm.hp && myself.Skill_InReuseDelay(step_skill06) == 0) {
if (step_skill_target06 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step_skill06, 0, reply, ask, 1000000, 0);

} else if (step_skill_target06 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step_skill06, 0, reply, ask, 1000000, 0);

} else if (step_skill_target06 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step_skill06, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step_skill06) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step_skill06) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step_skill06) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step_skill07 != 458752001 && step_action07 != -1) {
if (action_id == step_action07) {
if (myself.Skill_GetConsumeMP(step_skill07) < myself.sm.mp && myself.Skill_GetConsumeHP(step_skill07) < myself.sm.hp && myself.Skill_InReuseDelay(step_skill07) == 0) {
if (step_skill_target07 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step_skill07, 0, reply, ask, 1000000, 0);

} else if (step_skill_target07 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step_skill07, 0, reply, ask, 1000000, 0);

} else if (step_skill_target07 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step_skill07, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step_skill07) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step_skill07) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step_skill07) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step_skill08 != 458752001 && step_action08 != -1) {
if (action_id == step_action08) {
if (myself.Skill_GetConsumeMP(step_skill08) < myself.sm.mp && myself.Skill_GetConsumeHP(step_skill08) < myself.sm.hp && myself.Skill_InReuseDelay(step_skill08) == 0) {
if (step_skill_target08 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step_skill08, 0, reply, ask, 1000000, 0);

} else if (step_skill_target08 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step_skill08, 0, reply, ask, 1000000, 0);

} else if (step_skill_target08 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step_skill08, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step_skill08) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step_skill08) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step_skill08) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
	}


}