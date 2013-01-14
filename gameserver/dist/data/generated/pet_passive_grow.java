package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pet_passive_grow extends default_npc {
	protected int lv_step1 = 60;
	protected int lv_step2 = 65;
	protected int lv_step3 = 70;
	protected int lv_step4 = 75;
	protected int lv_step5 = 80;
	protected int heal_type = 1;
	protected int step0_buff01 = 458752001;
	protected int step0_buff02 = 458752001;
	protected int step1_buff01 = 458752001;
	protected int step1_buff02 = 458752001;
	protected int step1_buff03 = 458752001;
	protected int step1_buff04 = 458752001;
	protected int step2_buff01 = 458752001;
	protected int step2_buff02 = 458752001;
	protected int step2_buff03 = 458752001;
	protected int step2_buff04 = 458752001;
	protected int step2_buff05 = 458752001;
	protected int step2_buff06 = 458752001;
	protected int step3_buff01 = 458752001;
	protected int step3_buff02 = 458752001;
	protected int step3_buff03 = 458752001;
	protected int step3_buff04 = 458752001;
	protected int step3_buff05 = 458752001;
	protected int step3_buff06 = 458752001;
	protected int step3_buff07 = 458752001;
	protected int step3_buff08 = 458752001;
	protected int step0_merged_buff01 = 458752001;
	protected int step0_merged_buff02 = 458752001;
	protected int step1_merged_buff01 = 458752001;
	protected int step1_merged_buff02 = 458752001;
	protected int step1_merged_buff03 = 458752001;
	protected int step1_merged_buff04 = 458752001;
	protected int step2_merged_buff01 = 458752001;
	protected int step2_merged_buff02 = 458752001;
	protected int step2_merged_buff03 = 458752001;
	protected int step2_merged_buff04 = 458752001;
	protected int step2_merged_buff05 = 458752001;
	protected int step2_merged_buff06 = 458752001;
	protected int step3_merged_buff01 = 458752001;
	protected int step3_merged_buff02 = 458752001;
	protected int step3_merged_buff03 = 458752001;
	protected int step3_merged_buff04 = 458752001;
	protected int step3_merged_buff05 = 458752001;
	protected int step3_merged_buff06 = 458752001;
	protected int step3_merged_buff07 = 458752001;
	protected int step3_merged_buff08 = 458752001;
	protected int step0_buff_target01 = 0;
	protected int step0_buff_target02 = 0;
	protected int step1_buff_target01 = 0;
	protected int step1_buff_target02 = 0;
	protected int step1_buff_target03 = 0;
	protected int step1_buff_target04 = 0;
	protected int step2_buff_target01 = 0;
	protected int step2_buff_target02 = 0;
	protected int step2_buff_target03 = 0;
	protected int step2_buff_target04 = 0;
	protected int step2_buff_target05 = 0;
	protected int step2_buff_target06 = 0;
	protected int step3_buff_target01 = 0;
	protected int step3_buff_target02 = 0;
	protected int step3_buff_target03 = 0;
	protected int step3_buff_target04 = 0;
	protected int step3_buff_target05 = 0;
	protected int step3_buff_target06 = 0;
	protected int step3_buff_target07 = 0;
	protected int step3_buff_target08 = 0;
	protected int step0_heal01 = 458752001;
	protected int step0_heal02 = 458752001;
	protected int step1_heal01 = 458752001;
	protected int step1_heal02 = 458752001;
	protected int step2_heal01 = 458752001;
	protected int step2_heal02 = 458752001;
	protected int step3_heal01 = 458752001;
	protected int step3_heal02 = 458752001;
	protected int step4_heal01 = 458752001;
	protected int step5_heal01 = 458752001;
	protected int step0_heal_target01 = 0;
	protected int step0_heal_target02 = 0;
	protected int step1_heal_target01 = 0;
	protected int step1_heal_target02 = 0;
	protected int step2_heal_target01 = 0;
	protected int step2_heal_target02 = 0;
	protected int step3_heal_target01 = 0;
	protected int step3_heal_target02 = 0;
	protected int step4_heal_target01 = 0;
	protected int step5_heal_target01 = 0;
	protected int step0_skill01 = 458752001;
	protected int step0_skill02 = 458752001;
	protected int step0_skill_target01 = 0;
	protected int step0_skill_target02 = 0;
	protected int step0_action01 = -1;
	protected int step0_action02 = -1;
	protected int step1_skill01 = 458752001;
	protected int step1_skill02 = 458752001;
	protected int step1_skill03 = 458752001;
	protected int step1_skill04 = 458752001;
	protected int step1_skill_target01 = 0;
	protected int step1_skill_target02 = 0;
	protected int step1_skill_target03 = 0;
	protected int step1_skill_target04 = 0;
	protected int step1_action01 = -1;
	protected int step1_action02 = -1;
	protected int step1_action03 = -1;
	protected int step1_action04 = -1;
	protected int step2_skill01 = 458752001;
	protected int step2_skill02 = 458752001;
	protected int step2_skill03 = 458752001;
	protected int step2_skill04 = 458752001;
	protected int step2_skill05 = 458752001;
	protected int step2_skill06 = 458752001;
	protected int step2_skill_target01 = 0;
	protected int step2_skill_target02 = 0;
	protected int step2_skill_target03 = 0;
	protected int step2_skill_target04 = 0;
	protected int step2_skill_target05 = 0;
	protected int step2_skill_target06 = 0;
	protected int step2_action01 = -1;
	protected int step2_action02 = -1;
	protected int step2_action03 = -1;
	protected int step2_action04 = -1;
	protected int step2_action05 = -1;
	protected int step2_action06 = -1;
	protected int step3_skill01 = 458752001;
	protected int step3_skill02 = 458752001;
	protected int step3_skill03 = 458752001;
	protected int step3_skill04 = 458752001;
	protected int step3_skill05 = 458752001;
	protected int step3_skill06 = 458752001;
	protected int step3_skill07 = 458752001;
	protected int step3_skill08 = 458752001;
	protected int step3_skill_target01 = 0;
	protected int step3_skill_target02 = 0;
	protected int step3_skill_target03 = 0;
	protected int step3_skill_target04 = 0;
	protected int step3_skill_target05 = 0;
	protected int step3_skill_target06 = 0;
	protected int step3_skill_target07 = 0;
	protected int step3_skill_target08 = 0;
	protected int step3_action01 = -1;
	protected int step3_action02 = -1;
	protected int step3_action03 = -1;
	protected int step3_action04 = -1;
	protected int step3_action05 = -1;
	protected int step3_action06 = -1;
	protected int step3_action07 = -1;
	protected int step3_action08 = -1;
	protected int buff_time = 10;
	protected int heal_delay = 3;

	protected void CREATED() {
myself.AddTimerEx(2001, buff_time);
myself.AddTimerEx(2002, heal_delay * 1000);
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0, HandlerParam action_id) {
if (myself.sm.level < lv_step1) {
if (step0_skill01 != 458752001 && step0_action01 != -1) {
if (action_id == step0_action01) {
if (myself.Skill_GetConsumeMP(step0_skill01) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill01) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill01) == 0) {
if (step0_skill_target01 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill01, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill01, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill01, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill01) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill01) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill01) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step0_skill02 != 458752001 && step0_action02 != -1) {
if (action_id == step0_action02) {
if (myself.Skill_GetConsumeMP(step0_skill02) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill02) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill02) == 0) {
if (step0_skill_target02 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill02, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill02, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill02, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill02) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill02) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill02) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

} else if (myself.sm.level < lv_step2) {
if (step1_skill01 != 458752001 && step1_action01 != -1) {
if (action_id == step1_action01) {
if (myself.Skill_GetConsumeMP(step1_skill01) < myself.sm.mp && myself.Skill_GetConsumeHP(step1_skill01) < myself.sm.hp && myself.Skill_InReuseDelay(step1_skill01) == 0) {
if (step1_skill_target01 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step1_skill01, 0, reply, ask, 1000000, 0);

} else if (step1_skill_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step1_skill01, 0, reply, ask, 1000000, 0);

} else if (step1_skill_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step1_skill01, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step1_skill01) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step1_skill01) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step1_skill01) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step1_skill02 != 458752001 && step1_action02 != -1) {
if (action_id == step1_action02) {
if (myself.Skill_GetConsumeMP(step1_skill02) < myself.sm.mp && myself.Skill_GetConsumeHP(step1_skill02) < myself.sm.hp && myself.Skill_InReuseDelay(step1_skill02) == 0) {
if (step1_skill_target02 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step1_skill02, 0, reply, ask, 1000000, 0);

} else if (step1_skill_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step1_skill02, 0, reply, ask, 1000000, 0);

} else if (step1_skill_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step1_skill02, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step1_skill02) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step1_skill02) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step1_skill02) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step1_skill03 != 458752001 && step1_action03 != -1) {
if (action_id == step1_action03) {
if (myself.Skill_GetConsumeMP(step1_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step1_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step1_skill03) == 0) {
if (step1_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step1_skill03, 0, reply, ask, 1000000, 0);

} else if (step1_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step1_skill03, 0, reply, ask, 1000000, 0);

} else if (step1_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step1_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step1_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step1_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step1_skill03) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step1_skill04 != 458752001 && step1_action04 != -1) {
if (action_id == step1_action04) {
if (myself.Skill_GetConsumeMP(step1_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step1_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step1_skill04) == 0) {
if (step1_skill_target04 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step1_skill04, 0, reply, ask, 1000000, 0);

} else if (step1_skill_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step1_skill04, 0, reply, ask, 1000000, 0);

} else if (step1_skill_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step1_skill04, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step1_skill04) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step1_skill04) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step1_skill04) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

} else if (myself.sm.level < lv_step3) {
if (step2_skill01 != 458752001 && step2_action01 != -1) {
if (action_id == step2_action01) {
if (myself.Skill_GetConsumeMP(step2_skill01) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_skill01) < myself.sm.hp && myself.Skill_InReuseDelay(step2_skill01) == 0) {
if (step2_skill_target01 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step2_skill01, 0, reply, ask, 1000000, 0);

} else if (step2_skill_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step2_skill01, 0, reply, ask, 1000000, 0);

} else if (step2_skill_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step2_skill01, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step2_skill01) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step2_skill01) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step2_skill01) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step2_skill02 != 458752001 && step2_action02 != -1) {
if (action_id == step2_action02) {
if (myself.Skill_GetConsumeMP(step2_skill02) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_skill02) < myself.sm.hp && myself.Skill_InReuseDelay(step2_skill02) == 0) {
if (step2_skill_target02 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step2_skill02, 0, reply, ask, 1000000, 0);

} else if (step2_skill_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step2_skill02, 0, reply, ask, 1000000, 0);

} else if (step2_skill_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step2_skill02, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step2_skill02) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step2_skill02) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step2_skill02) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step2_skill03 != 458752001 && step2_action03 != -1) {
if (action_id == step2_action03) {
if (myself.Skill_GetConsumeMP(step2_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step2_skill03) == 0) {
if (step2_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step2_skill03, 0, reply, ask, 1000000, 0);

} else if (step2_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step2_skill03, 0, reply, ask, 1000000, 0);

} else if (step2_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step2_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step2_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step2_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step2_skill03) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step2_skill04 != 458752001 && step2_action04 != -1) {
if (action_id == step2_action04) {
if (myself.Skill_GetConsumeMP(step2_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step2_skill04) == 0) {
if (step2_skill_target04 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step2_skill04, 0, reply, ask, 1000000, 0);

} else if (step2_skill_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step2_skill04, 0, reply, ask, 1000000, 0);

} else if (step2_skill_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step2_skill04, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step2_skill04) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step2_skill04) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step2_skill04) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step2_skill05 != 458752001 && step2_action05 != -1) {
if (action_id == step2_action05) {
if (myself.Skill_GetConsumeMP(step2_skill05) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_skill05) < myself.sm.hp && myself.Skill_InReuseDelay(step2_skill05) == 0) {
if (step2_skill_target05 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step2_skill05, 0, reply, ask, 1000000, 0);

} else if (step2_skill_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step2_skill05, 0, reply, ask, 1000000, 0);

} else if (step2_skill_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step2_skill05, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step2_skill05) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step2_skill05) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step2_skill05) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step2_skill06 != 458752001 && step2_action06 != -1) {
if (action_id == step2_action06) {
if (myself.Skill_GetConsumeMP(step2_skill06) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_skill06) < myself.sm.hp && myself.Skill_InReuseDelay(step2_skill06) == 0) {
if (step2_skill_target06 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step2_skill06, 0, reply, ask, 1000000, 0);

} else if (step2_skill_target06 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step2_skill06, 0, reply, ask, 1000000, 0);

} else if (step2_skill_target06 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step2_skill06, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step2_skill06) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step2_skill06) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step2_skill06) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

} else if (myself.sm.level >= lv_step3) {
if (step3_skill01 != 458752001 && step3_action01 != -1) {
if (action_id == step3_action01) {
if (myself.Skill_GetConsumeMP(step3_skill01) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_skill01) < myself.sm.hp && myself.Skill_InReuseDelay(step3_skill01) == 0) {
if (step3_skill_target01 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step3_skill01, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step3_skill01, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step3_skill01, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step3_skill01) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step3_skill01) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step3_skill01) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step3_skill02 != 458752001 && step3_action02 != -1) {
if (action_id == step3_action02) {
if (myself.Skill_GetConsumeMP(step3_skill02) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_skill02) < myself.sm.hp && myself.Skill_InReuseDelay(step3_skill02) == 0) {
if (step3_skill_target02 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step3_skill02, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step3_skill02, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step3_skill02, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step3_skill02) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step3_skill02) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step3_skill02) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step3_skill03 != 458752001 && step3_action03 != -1) {
if (action_id == step3_action03) {
if (myself.Skill_GetConsumeMP(step3_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step3_skill03) == 0) {
if (step3_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step3_skill03, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step3_skill03, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step3_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step3_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step3_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step3_skill03) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step3_skill04 != 458752001 && step3_action04 != -1) {
if (action_id == step3_action04) {
if (myself.Skill_GetConsumeMP(step3_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step3_skill04) == 0) {
if (step3_skill_target04 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step3_skill04, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step3_skill04, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step3_skill04, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step3_skill04) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step3_skill04) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step3_skill04) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step3_skill05 != 458752001 && step3_action05 != -1) {
if (action_id == step3_action05) {
if (myself.Skill_GetConsumeMP(step3_skill05) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_skill05) < myself.sm.hp && myself.Skill_InReuseDelay(step3_skill05) == 0) {
if (step3_skill_target05 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step3_skill05, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step3_skill05, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step3_skill05, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step3_skill05) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step3_skill05) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step3_skill05) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step3_skill06 != 458752001 && step3_action06 != -1) {
if (action_id == step3_action06) {
if (myself.Skill_GetConsumeMP(step3_skill06) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_skill06) < myself.sm.hp && myself.Skill_InReuseDelay(step3_skill06) == 0) {
if (step3_skill_target06 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step3_skill06, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target06 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step3_skill06, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target06 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step3_skill06, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step3_skill06) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step3_skill06) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step3_skill06) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step3_skill07 != 458752001 && step3_action07 != -1) {
if (action_id == step3_action07) {
if (myself.Skill_GetConsumeMP(step3_skill07) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_skill07) < myself.sm.hp && myself.Skill_InReuseDelay(step3_skill07) == 0) {
if (step3_skill_target07 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step3_skill07, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target07 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step3_skill07, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target07 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step3_skill07, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step3_skill07) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step3_skill07) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step3_skill07) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step3_skill08 != 458752001 && step3_action08 != -1) {
if (action_id == step3_action08) {
if (myself.Skill_GetConsumeMP(step3_skill08) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_skill08) < myself.sm.hp && myself.Skill_InReuseDelay(step3_skill08) == 0) {
if (step3_skill_target08 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step3_skill08, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target08 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step3_skill08, 0, reply, ask, 1000000, 0);

} else if (step3_skill_target08 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step3_skill08, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step3_skill08) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step3_skill08) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step3_skill08) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(378208257)) < 1) {
if (myself.sm.level < lv_step1) {
if (step0_buff01 != 458752001) {
if (myself.Skill_GetConsumeMP(step0_buff01) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_buff01) < myself.sm.hp && myself.Skill_InReuseDelay(step0_buff01) == 0) {
if (step0_merged_buff01 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff01)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_merged_buff01)) < 1) {
if (step0_buff_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff01, 1, 1, 1000000);

} else if (step0_buff_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff01, 1, 1, 1000000);

} else if (step0_buff_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff01, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff01)) < 1) {
if (step0_buff_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff01, 1, 1, 1000000);

} else if (step0_buff_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff01, 1, 1, 1000000);

} else if (step0_buff_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff01, 1, 1, 1000000);

}

}

}

}
if (step0_buff02 != 458752001) {
if (myself.Skill_GetConsumeMP(step0_buff02) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_buff02) < myself.sm.hp && myself.Skill_InReuseDelay(step0_buff02) == 0) {
if (step0_merged_buff02 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff02)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_merged_buff02)) < 1) {
if (step0_buff_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff02, 1, 1, 1000000);

} else if (step0_buff_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff02, 1, 1, 1000000);

} else if (step0_buff_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff02, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff02)) < 1) {
if (step0_buff_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff02, 1, 1, 1000000);

} else if (step0_buff_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff02, 1, 1, 1000000);

} else if (step0_buff_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff02, 1, 1, 1000000);

}

}

}

}

} else if (myself.sm.level < lv_step2) {
if (step1_buff01 != 458752001) {
if (myself.Skill_GetConsumeMP(step1_buff01) < myself.sm.mp && myself.Skill_GetConsumeHP(step1_buff01) < myself.sm.hp && myself.Skill_InReuseDelay(step1_buff01) == 0) {
if (step1_merged_buff01 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_buff01)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_merged_buff01)) < 1) {
if (step1_buff_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff01, 1, 1, 1000000);

} else if (step1_buff_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step1_buff01, 1, 1, 1000000);

} else if (step1_buff_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff01, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_buff01)) < 1) {
if (step1_buff_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff01, 1, 1, 1000000);

} else if (step1_buff_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step1_buff01, 1, 1, 1000000);

} else if (step1_buff_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff01, 1, 1, 1000000);

}

}

}

}
if (step1_buff02 != 458752001) {
if (myself.Skill_GetConsumeMP(step1_buff02) < myself.sm.mp && myself.Skill_GetConsumeHP(step1_buff02) < myself.sm.hp && myself.Skill_InReuseDelay(step1_buff02) == 0) {
if (step1_merged_buff02 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_buff02)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_merged_buff02)) < 1) {
if (step1_buff_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff02, 1, 1, 1000000);

} else if (step1_buff_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step1_buff02, 1, 1, 1000000);

} else if (step1_buff_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff02, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_buff02)) < 1) {
if (step1_buff_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff02, 1, 1, 1000000);

} else if (step1_buff_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step1_buff02, 1, 1, 1000000);

} else if (step1_buff_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff02, 1, 1, 1000000);

}

}

}

}
if (step1_buff03 != 458752001) {
if (myself.Skill_GetConsumeMP(step1_buff03) < myself.sm.mp && myself.Skill_GetConsumeHP(step1_buff03) < myself.sm.hp && myself.Skill_InReuseDelay(step1_buff03) == 0) {
if (step1_merged_buff03 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_buff03)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_merged_buff03)) < 1) {
if (step1_buff_target03 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff03, 1, 1, 1000000);

} else if (step1_buff_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step1_buff03, 1, 1, 1000000);

} else if (step1_buff_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff03, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_buff03)) < 1) {
if (step1_buff_target03 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff03, 1, 1, 1000000);

} else if (step1_buff_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step1_buff03, 1, 1, 1000000);

} else if (step1_buff_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff03, 1, 1, 1000000);

}

}

}

}
if (step1_buff04 != 458752001) {
if (myself.Skill_GetConsumeMP(step1_buff04) < myself.sm.mp && myself.Skill_GetConsumeHP(step1_buff04) < myself.sm.hp && myself.Skill_InReuseDelay(step1_buff04) == 0) {
if (step1_merged_buff04 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_buff04)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_merged_buff04)) < 1) {
if (step1_buff_target04 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff04, 1, 1, 1000000);

} else if (step1_buff_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step1_buff04, 1, 1, 1000000);

} else if (step1_buff_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff04, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_buff04)) < 1) {
if (step1_buff_target04 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff04, 1, 1, 1000000);

} else if (step1_buff_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step1_buff04, 1, 1, 1000000);

} else if (step1_buff_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_buff04, 1, 1, 1000000);

}

}

}

}

} else if (myself.sm.level < lv_step3) {
if (step2_buff01 != 458752001) {
if (myself.Skill_GetConsumeMP(step2_buff01) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_buff01) < myself.sm.hp && myself.Skill_InReuseDelay(step2_buff01) == 0) {
if (step2_merged_buff01 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_buff01)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_merged_buff01)) < 1) {
if (step2_buff_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff01, 1, 1, 1000000);

} else if (step2_buff_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_buff01, 1, 1, 1000000);

} else if (step2_buff_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff01, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_buff01)) < 1) {
if (step2_buff_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff01, 1, 1, 1000000);

} else if (step2_buff_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_buff01, 1, 1, 1000000);

} else if (step2_buff_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff01, 1, 1, 1000000);

}

}

}

}
if (step2_buff02 != 458752001) {
if (myself.Skill_GetConsumeMP(step2_buff02) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_buff02) < myself.sm.hp && myself.Skill_InReuseDelay(step2_buff02) == 0) {
if (step2_merged_buff02 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_buff02)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_merged_buff02)) < 1) {
if (step2_buff_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff02, 1, 1, 1000000);

} else if (step2_buff_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_buff02, 1, 1, 1000000);

} else if (step2_buff_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff02, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_buff02)) < 1) {
if (step2_buff_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff02, 1, 1, 1000000);

} else if (step2_buff_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_buff02, 1, 1, 1000000);

} else if (step2_buff_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff02, 1, 1, 1000000);

}

}

}

}
if (step2_buff03 != 458752001) {
if (myself.Skill_GetConsumeMP(step2_buff03) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_buff03) < myself.sm.hp && myself.Skill_InReuseDelay(step2_buff03) == 0) {
if (step2_merged_buff03 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_buff03)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_merged_buff03)) < 1) {
if (step2_buff_target03 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff03, 1, 1, 1000000);

} else if (step2_buff_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_buff03, 1, 1, 1000000);

} else if (step2_buff_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff03, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_buff03)) < 1) {
if (step2_buff_target03 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff03, 1, 1, 1000000);

} else if (step2_buff_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_buff03, 1, 1, 1000000);

} else if (step2_buff_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff03, 1, 1, 1000000);

}

}

}

}
if (step2_buff04 != 458752001) {
if (myself.Skill_GetConsumeMP(step2_buff04) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_buff04) < myself.sm.hp && myself.Skill_InReuseDelay(step2_buff04) == 0) {
if (step2_merged_buff04 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_buff04)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_merged_buff04)) < 1) {
if (step2_buff_target04 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff04, 1, 1, 1000000);

} else if (step2_buff_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_buff04, 1, 1, 1000000);

} else if (step2_buff_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff04, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_buff04)) < 1) {
if (step2_buff_target04 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff04, 1, 1, 1000000);

} else if (step2_buff_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_buff04, 1, 1, 1000000);

} else if (step2_buff_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff04, 1, 1, 1000000);

}

}

}

}
if (step2_buff05 != 458752001) {
if (myself.Skill_GetConsumeMP(step2_buff05) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_buff05) < myself.sm.hp && myself.Skill_InReuseDelay(step2_buff05) == 0) {
if (step2_merged_buff05 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_buff05)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_merged_buff05)) < 1) {
if (step2_buff_target05 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff05, 1, 1, 1000000);

} else if (step2_buff_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_buff05, 1, 1, 1000000);

} else if (step2_buff_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff05, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_buff05)) < 1) {
if (step2_buff_target05 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff05, 1, 1, 1000000);

} else if (step2_buff_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_buff05, 1, 1, 1000000);

} else if (step2_buff_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff05, 1, 1, 1000000);

}

}

}

}
if (step2_buff06 != 458752001) {
if (myself.Skill_GetConsumeMP(step2_buff06) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_buff06) < myself.sm.hp && myself.Skill_InReuseDelay(step2_buff06) == 0) {
if (step2_merged_buff06 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_buff06)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_merged_buff06)) < 1) {
if (step2_buff_target06 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff06, 1, 1, 1000000);

} else if (step2_buff_target06 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_buff06, 1, 1, 1000000);

} else if (step2_buff_target06 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff06, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_buff06)) < 1) {
if (step2_buff_target06 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff06, 1, 1, 1000000);

} else if (step2_buff_target06 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_buff06, 1, 1, 1000000);

} else if (step2_buff_target06 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_buff06, 1, 1, 1000000);

}

}

}

}

} else if (myself.sm.level >= lv_step3) {
if (step3_buff01 != 458752001) {
if (myself.Skill_GetConsumeMP(step3_buff01) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_buff01) < myself.sm.hp && myself.Skill_InReuseDelay(step3_buff01) == 0) {
if (step3_merged_buff01 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff01)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_merged_buff01)) < 1) {
if (step3_buff_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff01, 1, 1, 1000000);

} else if (step3_buff_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff01, 1, 1, 1000000);

} else if (step3_buff_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff01, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff01)) < 1) {
if (step3_buff_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff01, 1, 1, 1000000);

} else if (step3_buff_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff01, 1, 1, 1000000);

} else if (step3_buff_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff01, 1, 1, 1000000);

}

}

}

}
if (step3_buff02 != 458752001) {
if (myself.Skill_GetConsumeMP(step3_buff02) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_buff02) < myself.sm.hp && myself.Skill_InReuseDelay(step3_buff02) == 0) {
if (step3_merged_buff02 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff02)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_merged_buff02)) < 1) {
if (step3_buff_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff02, 1, 1, 1000000);

} else if (step3_buff_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff02, 1, 1, 1000000);

} else if (step3_buff_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff02, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff02)) < 1) {
if (step3_buff_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff02, 1, 1, 1000000);

} else if (step3_buff_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff02, 1, 1, 1000000);

} else if (step3_buff_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff02, 1, 1, 1000000);

}

}

}

}
if (step3_buff03 != 458752001) {
if (myself.Skill_GetConsumeMP(step3_buff03) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_buff03) < myself.sm.hp && myself.Skill_InReuseDelay(step3_buff03) == 0) {
if (step3_merged_buff03 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff03)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_merged_buff03)) < 1) {
if (step3_buff_target03 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff03, 1, 1, 1000000);

} else if (step3_buff_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff03, 1, 1, 1000000);

} else if (step3_buff_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff03, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff03)) < 1) {
if (step3_buff_target03 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff03, 1, 1, 1000000);

} else if (step3_buff_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff03, 1, 1, 1000000);

} else if (step3_buff_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff03, 1, 1, 1000000);

}

}

}

}
if (step3_buff04 != 458752001) {
if (myself.Skill_GetConsumeMP(step3_buff04) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_buff04) < myself.sm.hp && myself.Skill_InReuseDelay(step3_buff04) == 0) {
if (step3_merged_buff04 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff04)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_merged_buff04)) < 1) {
if (step3_buff_target04 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff04, 1, 1, 1000000);

} else if (step3_buff_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff04, 1, 1, 1000000);

} else if (step3_buff_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff04, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff04)) < 1) {
if (step3_buff_target04 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff04, 1, 1, 1000000);

} else if (step3_buff_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff04, 1, 1, 1000000);

} else if (step3_buff_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff04, 1, 1, 1000000);

}

}

}

}
if (step3_buff05 != 458752001) {
if (myself.Skill_GetConsumeMP(step3_buff05) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_buff05) < myself.sm.hp && myself.Skill_InReuseDelay(step3_buff05) == 0) {
if (step3_merged_buff05 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff05)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_merged_buff05)) < 1) {
if (step3_buff_target05 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff05, 1, 1, 1000000);

} else if (step3_buff_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff05, 1, 1, 1000000);

} else if (step3_buff_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff05, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff05)) < 1) {
if (step3_buff_target05 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff05, 1, 1, 1000000);

} else if (step3_buff_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff05, 1, 1, 1000000);

} else if (step3_buff_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff05, 1, 1, 1000000);

}

}

}

}
if (step3_buff06 != 458752001) {
if (myself.Skill_GetConsumeMP(step3_buff06) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_buff06) < myself.sm.hp && myself.Skill_InReuseDelay(step3_buff06) == 0) {
if (step3_merged_buff06 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff06)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_merged_buff06)) < 1) {
if (step3_buff_target06 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff06, 1, 1, 1000000);

} else if (step3_buff_target06 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff06, 1, 1, 1000000);

} else if (step3_buff_target06 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff06, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff06)) < 1) {
if (step3_buff_target06 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff06, 1, 1, 1000000);

} else if (step3_buff_target06 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff06, 1, 1, 1000000);

} else if (step3_buff_target06 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff06, 1, 1, 1000000);

}

}

}

}
if (step3_buff07 != 458752001) {
if (myself.Skill_GetConsumeMP(step3_buff07) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_buff07) < myself.sm.hp && myself.Skill_InReuseDelay(step3_buff07) == 0) {
if (step3_merged_buff07 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff07)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_merged_buff07)) < 1) {
if (step3_buff_target07 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff07, 1, 1, 1000000);

} else if (step3_buff_target07 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff07, 1, 1, 1000000);

} else if (step3_buff_target07 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff07, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff07)) < 1) {
if (step3_buff_target07 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff07, 1, 1, 1000000);

} else if (step3_buff_target07 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff07, 1, 1, 1000000);

} else if (step3_buff_target07 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff07, 1, 1, 1000000);

}

}

}

}
if (step3_buff08 != 458752001) {
if (myself.Skill_GetConsumeMP(step3_buff08) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_buff08) < myself.sm.hp && myself.Skill_InReuseDelay(step3_buff08) == 0) {
if (step3_merged_buff08 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff08)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_merged_buff08)) < 1) {
if (step3_buff_target08 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff08, 1, 1, 1000000);

} else if (step3_buff_target08 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff08, 1, 1, 1000000);

} else if (step3_buff_target08 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff08, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_buff08)) < 1) {
if (step3_buff_target08 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff08, 1, 1, 1000000);

} else if (step3_buff_target08 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_buff08, 1, 1, 1000000);

} else if (step3_buff_target08 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_buff08, 1, 1, 1000000);

}

}

}

}

}

}
myself.AddTimerEx(2001, buff_time * 1000);

}
if (timer_id == 2002) {
if (heal_type == 1) {
if (myself.IsInCombatMode(myself.master) == 0) {
myself.AddTimerEx(2002, heal_delay * 1000);
return;

}
if (gg.FloatToInt(myself.master.hp / myself.master.max_hp * 100) < 70 && gg.FloatToInt(myself.master.hp / myself.master.max_hp * 100) >= 30) {
if (myself.sm.level < lv_step1) {
if (step0_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step0_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step0_heal01) == 0) {
if (step0_heal01 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_heal01)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_heal01)) < 1) {
if (step0_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_heal01, 1, 1, 1000000);

} else if (step0_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_heal01, 1, 1, 1000000);

} else if (step0_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_heal01, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_heal01)) < 1) {
if (step0_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_heal01, 1, 1, 1000000);

} else if (step0_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_heal01, 1, 1, 1000000);

} else if (step0_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_heal01, 1, 1, 1000000);

}

}

}

}

} else if (myself.sm.level < lv_step2) {
if (step1_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step1_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step1_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step1_heal01) == 0) {
if (step1_heal01 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_heal01)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_heal01)) < 1) {
if (step1_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_heal01, 1, 1, 1000000);

} else if (step1_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step1_heal01, 1, 1, 1000000);

} else if (step1_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_heal01, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step1_heal01)) < 1) {
if (step1_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_heal01, 1, 1, 1000000);

} else if (step1_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step1_heal01, 1, 1, 1000000);

} else if (step1_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_heal01, 1, 1, 1000000);

}

}

}

}

} else if (myself.sm.level < lv_step3) {
if (step2_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step2_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step2_heal01) == 0) {
if (step2_heal01 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_heal01)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_heal01)) < 1) {
if (step2_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_heal01, 1, 1, 1000000);

} else if (step2_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_heal01, 1, 1, 1000000);

} else if (step2_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_heal01, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step2_heal01)) < 1) {
if (step2_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_heal01, 1, 1, 1000000);

} else if (step2_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_heal01, 1, 1, 1000000);

} else if (step2_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_heal01, 1, 1, 1000000);

}

}

}

}

} else if (myself.sm.level >= lv_step3) {
if (step3_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step3_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step3_heal01) == 0) {
if (step3_heal01 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_heal01)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_heal01)) < 1) {
if (step3_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_heal01, 1, 1, 1000000);

} else if (step3_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_heal01, 1, 1, 1000000);

} else if (step3_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_heal01, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step3_heal01)) < 1) {
if (step3_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_heal01, 1, 1, 1000000);

} else if (step3_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_heal01, 1, 1, 1000000);

} else if (step3_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_heal01, 1, 1, 1000000);

}

}

}

}

}

} else if (gg.FloatToInt(myself.master.hp / myself.master.max_hp * 100) < 30) {
if (myself.sm.level < lv_step1) {
if (step0_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step0_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step0_heal02) == 0) {
if (step0_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_heal02, 1, 1, 1000000);

} else if (step0_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_heal02, 1, 1, 1000000);

} else if (step0_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_heal02, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level < lv_step2) {
if (step1_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step1_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step1_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step1_heal02) == 0) {
if (step1_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_heal02, 1, 1, 1000000);

} else if (step1_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step1_heal02, 1, 1, 1000000);

} else if (step1_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_heal02, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level < lv_step3) {
if (step2_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step2_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step2_heal02) == 0) {
if (step2_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_heal02, 1, 1, 1000000);

} else if (step2_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_heal02, 1, 1, 1000000);

} else if (step2_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_heal02, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level >= lv_step3) {
if (step3_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step3_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step3_heal02) == 0) {
if (step3_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_heal02, 1, 1, 1000000);

} else if (step3_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_heal02, 1, 1, 1000000);

} else if (step3_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_heal02, 1, 1, 1000000);

}

}

}

}

}

} else if (heal_type == 0) {
if (myself.IsInCombatMode(myself.master) == 0) {
myself.AddTimerEx(2002, heal_delay * 1000);
return;

}
if (gg.FloatToInt(myself.master.hp / myself.master.max_hp * 100) < 30) {
if (myself.sm.level < lv_step1) {
if (step0_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step0_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step0_heal02) == 0) {
if (step0_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_heal02, 1, 1, 1000000);

} else if (step0_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_heal02, 1, 1, 1000000);

} else if (step0_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_heal02, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level < lv_step2) {
if (step1_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step1_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step1_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step1_heal02) == 0) {
if (step1_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_heal02, 1, 1, 1000000);

} else if (step1_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step1_heal02, 1, 1, 1000000);

} else if (step1_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_heal02, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level < lv_step3) {
if (step2_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step2_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step2_heal02) == 0) {
if (step2_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_heal02, 1, 1, 1000000);

} else if (step2_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_heal02, 1, 1, 1000000);

} else if (step2_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_heal02, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level >= lv_step3) {
if (step3_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step3_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step3_heal02) == 0) {
if (step3_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_heal02, 1, 1, 1000000);

} else if (step3_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_heal02, 1, 1, 1000000);

} else if (step3_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_heal02, 1, 1, 1000000);

}

}

}

}

} else if (gg.FloatToInt(myself.master.mp / myself.master.max_mp * 100) < 60) {
if (myself.sm.level < lv_step1) {
if (step0_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step0_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step0_heal01) == 0) {
if (step0_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_heal01, 1, 1, 1000000);

} else if (step0_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_heal01, 1, 1, 1000000);

} else if (step0_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_heal01, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level < lv_step2) {
if (step1_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step1_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step1_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step1_heal01) == 0) {
if (step1_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_heal01, 1, 1, 1000000);

} else if (step1_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step1_heal01, 1, 1, 1000000);

} else if (step1_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step1_heal01, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level < lv_step3) {
if (step2_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step2_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step2_heal01) == 0) {
if (step2_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_heal01, 1, 1, 1000000);

} else if (step2_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step2_heal01, 1, 1, 1000000);

} else if (step2_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step2_heal01, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level < lv_step4) {
if (step3_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step3_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step3_heal01) == 0) {
if (step3_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_heal01, 1, 1, 1000000);

} else if (step3_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step3_heal01, 1, 1, 1000000);

} else if (step3_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step3_heal01, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level < lv_step5) {
if (step4_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step4_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step4_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step4_heal01) == 0) {
if (step4_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step4_heal01, 1, 1, 1000000);

} else if (step4_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step4_heal01, 1, 1, 1000000);

} else if (step4_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step4_heal01, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level >= lv_step5) {
if (step5_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step5_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step5_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step5_heal01) == 0) {
if (step5_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step5_heal01, 1, 1, 1000000);

} else if (step5_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step5_heal01, 1, 1, 1000000);

} else if (step5_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step5_heal01, 1, 1, 1000000);

}

}

}

}

}

}
myself.AddTimerEx(2002, heal_delay * 1000);

}
	}


}