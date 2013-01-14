package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pet_premium_buffer extends default_npc {
	protected int lv_step1 = 10;
	protected int lv_step2 = 20;
	protected int lv_step3 = 30;
	protected int lv_step4 = 40;
	protected int lv_step5 = 50;
	protected int lv_step6 = 60;
	protected int lv_step7 = 70;
	protected int step0_buff01 = 458752001;
	protected int step0_buff02 = 458752001;
	protected int step0_buff03 = 458752001;
	protected int step0_buff04 = 458752001;
	protected int step0_buff05 = 458752001;
	protected int step0_buff06 = 458752001;
	protected int step0_buff07 = 458752001;
	protected int step0_buff08 = 458752001;
	protected int step0_merged_buff01 = 458752001;
	protected int step0_merged_buff02 = 458752001;
	protected int step0_merged_buff03 = 458752001;
	protected int step0_merged_buff04 = 458752001;
	protected int step0_merged_buff05 = 458752001;
	protected int step0_merged_buff06 = 458752001;
	protected int step0_merged_buff07 = 458752001;
	protected int step0_merged_buff08 = 458752001;
	protected int step0_buff_target01 = 2;
	protected int step0_buff_target02 = 2;
	protected int step0_buff_target03 = 2;
	protected int step0_buff_target04 = 2;
	protected int step0_buff_target05 = 2;
	protected int step0_buff_target06 = 2;
	protected int step0_buff_target07 = 2;
	protected int step0_buff_target08 = 2;
	protected int heal_type = 1;
	protected int step0_heal01 = 458752001;
	protected int step0_heal02 = 458752001;
	protected int step1_heal01 = 458752001;
	protected int step1_heal02 = 458752001;
	protected int step2_heal01 = 458752001;
	protected int step2_heal02 = 458752001;
	protected int step3_heal01 = 458752001;
	protected int step3_heal02 = 458752001;
	protected int step4_heal01 = 458752001;
	protected int step4_heal02 = 458752001;
	protected int step5_heal01 = 458752001;
	protected int step5_heal02 = 458752001;
	protected int step6_heal01 = 458752001;
	protected int step6_heal02 = 458752001;
	protected int step7_heal01 = 458752001;
	protected int step7_heal02 = 458752001;
	protected int step8_heal01 = 458752001;
	protected int step8_heal02 = 458752001;
	protected int step0_heal_target01 = 2;
	protected int step0_heal_target02 = 2;
	protected int step1_heal_target01 = 2;
	protected int step1_heal_target02 = 2;
	protected int step2_heal_target01 = 2;
	protected int step2_heal_target02 = 2;
	protected int step3_heal_target01 = 2;
	protected int step3_heal_target02 = 2;
	protected int step4_heal_target01 = 2;
	protected int step4_heal_target02 = 2;
	protected int step5_heal_target01 = 2;
	protected int step5_heal_target02 = 2;
	protected int step6_heal_target01 = 2;
	protected int step6_heal_target02 = 2;
	protected int step7_heal_target01 = 2;
	protected int step7_heal_target02 = 2;
	protected int step8_heal_target01 = 2;
	protected int step8_heal_target02 = 2;
	protected int step0_skill03 = 458752001;
	protected int step0_skill04 = 458752001;
	protected int step0_skill05 = 458752001;
	protected int step0_skill_target03 = 0;
	protected int step0_skill_target04 = 0;
	protected int step0_skill_target05 = 0;
	protected int step0_action03 = -1;
	protected int step0_action04 = -1;
	protected int step0_action05 = -1;
	protected int step1_skill04 = 458752001;
	protected int step1_skill_target04 = 0;
	protected int step1_action04 = -1;
	protected int step2_skill04 = 458752001;
	protected int step2_skill_target04 = 0;
	protected int step2_action04 = -1;
	protected int step3_skill04 = 458752001;
	protected int step3_skill_target04 = 0;
	protected int step3_action04 = -1;
	protected int step4_skill04 = 458752001;
	protected int step4_skill_target04 = 0;
	protected int step4_action04 = -1;
	protected int step5_skill04 = 458752001;
	protected int step5_skill_target04 = 0;
	protected int step5_action04 = -1;
	protected int step6_skill04 = 458752001;
	protected int step6_skill_target04 = 0;
	protected int step6_action04 = -1;
	protected int step7_skill04 = 458752001;
	protected int step7_skill_target04 = 0;
	protected int step7_action04 = -1;
	protected int buff_time = 10;
	protected int heal_delay = 3;
	protected int MoveAroundSocial = 0;

	protected void CREATED() {
myself.AddTimerEx(2001, buff_time);
myself.AddTimerEx(2002, heal_delay * 1000);
myself.AddTimerEx(1671, 10000);
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0, HandlerParam action_id) {
if (myself.sm.level < lv_step1) {
if (step0_skill03 != 458752001 && step0_action03 != -1) {
if (action_id == step0_action03) {
if (myself.Skill_GetConsumeMP(step0_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill03) == 0) {
if (step0_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill03) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step0_skill04 != 458752001 && step0_action04 != -1) {
if (action_id == step0_action04) {
if (myself.Skill_GetConsumeMP(step0_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill04) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(step0_skill05)) > 0) {
if (step0_skill_target04 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill04, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill04, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill04, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill04) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill04) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill04) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step0_skill05 != 458752001 && step0_action05 != -1) {
if (action_id == step0_action05) {
if (myself.Skill_GetConsumeMP(step0_skill05) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill05) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill05) == 0) {
if (step0_skill_target05 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill05, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill05) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill05) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill05) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

} else if (myself.sm.level < lv_step2) {
if (step0_skill03 != 458752001 && step0_action03 != -1) {
if (action_id == step0_action03) {
if (myself.Skill_GetConsumeMP(step0_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill03) == 0) {
if (step0_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill03) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step1_skill04 != 458752001 && step1_action04 != -1) {
if (action_id == step1_action04) {
if (myself.Skill_GetConsumeMP(step1_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step1_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step1_skill04) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(step0_skill05)) > 0) {
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
if (step0_skill05 != 458752001 && step0_action05 != -1) {
if (action_id == step0_action05) {
if (myself.Skill_GetConsumeMP(step0_skill05) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill05) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill05) == 0) {
if (step0_skill_target05 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill05, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill05) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill05) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill05) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

} else if (myself.sm.level < lv_step3) {
if (step0_skill03 != 458752001 && step0_action03 != -1) {
if (action_id == step0_action03) {
if (myself.Skill_GetConsumeMP(step0_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill03) == 0) {
if (step0_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill03) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step2_skill04 != 458752001 && step2_action04 != -1) {
if (action_id == step2_action04) {
if (myself.Skill_GetConsumeMP(step2_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step2_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step2_skill04) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(step0_skill05)) > 0) {
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
if (step0_skill05 != 458752001 && step0_action05 != -1) {
if (action_id == step0_action05) {
if (myself.Skill_GetConsumeMP(step0_skill05) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill05) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill05) == 0) {
if (step0_skill_target05 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill05, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill05) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill05) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill05) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

} else if (myself.sm.level < lv_step4) {
if (step0_skill03 != 458752001 && step0_action03 != -1) {
if (action_id == step0_action03) {
if (myself.Skill_GetConsumeMP(step0_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill03) == 0) {
if (step0_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill03) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step3_skill04 != 458752001 && step3_action04 != -1) {
if (action_id == step3_action04) {
if (myself.Skill_GetConsumeMP(step3_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step3_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step3_skill04) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(step0_skill05)) > 0) {
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
if (step0_skill05 != 458752001 && step0_action05 != -1) {
if (action_id == step0_action05) {
if (myself.Skill_GetConsumeMP(step0_skill05) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill05) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill05) == 0) {
if (step0_skill_target05 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill05, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill05) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill05) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill05) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

} else if (myself.sm.level < lv_step5) {
if (step0_skill03 != 458752001 && step0_action03 != -1) {
if (action_id == step0_action03) {
if (myself.Skill_GetConsumeMP(step0_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill03) == 0) {
if (step0_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill03) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step4_skill04 != 458752001 && step4_action04 != -1) {
if (action_id == step4_action04) {
if (myself.Skill_GetConsumeMP(step4_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step4_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step4_skill04) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(step0_skill05)) > 0) {
if (step4_skill_target04 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step4_skill04, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step4_skill04, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step4_skill04, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step4_skill04) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step4_skill04) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step4_skill04) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step0_skill05 != 458752001 && step0_action05 != -1) {
if (action_id == step0_action05) {
if (myself.Skill_GetConsumeMP(step0_skill05) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill05) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill05) == 0) {
if (step0_skill_target05 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill05, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill05) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill05) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill05) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

} else if (myself.sm.level < lv_step6) {
if (step0_skill03 != 458752001 && step0_action03 != -1) {
if (action_id == step0_action03) {
if (myself.Skill_GetConsumeMP(step0_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill03) == 0) {
if (step0_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill03) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step5_skill04 != 458752001 && step5_action04 != -1) {
if (action_id == step5_action04) {
if (myself.Skill_GetConsumeMP(step5_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step5_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step5_skill04) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(step0_skill05)) > 0) {
if (step5_skill_target04 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step5_skill04, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step5_skill04, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step5_skill04, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step5_skill04) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step5_skill04) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step5_skill04) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step0_skill05 != 458752001 && step0_action05 != -1) {
if (action_id == step0_action05) {
if (myself.Skill_GetConsumeMP(step0_skill05) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill05) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill05) == 0) {
if (step0_skill_target05 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill05, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill05) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill05) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill05) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

} else if (myself.sm.level < lv_step7) {
if (step0_skill03 != 458752001 && step0_action03 != -1) {
if (action_id == step0_action03) {
if (myself.Skill_GetConsumeMP(step0_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill03) == 0) {
if (step0_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill03) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step6_skill04 != 458752001 && step6_action04 != -1) {
if (action_id == step6_action04) {
if (myself.Skill_GetConsumeMP(step6_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step6_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step6_skill04) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(step0_skill05)) > 0) {
if (step6_skill_target04 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step6_skill04, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step6_skill04, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step6_skill04, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step6_skill04) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step6_skill04) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step6_skill04) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step0_skill05 != 458752001 && step0_action05 != -1) {
if (action_id == step0_action05) {
if (myself.Skill_GetConsumeMP(step0_skill05) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill05) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill05) == 0) {
if (step0_skill_target05 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill05, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill05) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill05) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill05) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

} else if (myself.sm.level >= lv_step7) {
if (step0_skill03 != 458752001 && step0_action03 != -1) {
if (action_id == step0_action03) {
if (myself.Skill_GetConsumeMP(step0_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill03) == 0) {
if (step0_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill03, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill03) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step7_skill04 != 458752001 && step7_action04 != -1) {
if (action_id == step7_action04) {
if (myself.Skill_GetConsumeMP(step7_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step7_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step7_skill04) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(step0_skill05)) > 0) {
if (step7_skill_target04 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step7_skill04, 0, reply, ask, 1000000, 0);

} else if (step7_skill_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step7_skill04, 0, reply, ask, 1000000, 0);

} else if (step7_skill_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step7_skill04, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step7_skill04) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step7_skill04) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step7_skill04) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step0_skill05 != 458752001 && step0_action05 != -1) {
if (action_id == step0_action05) {
if (myself.Skill_GetConsumeMP(step0_skill05) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_skill05) < myself.sm.hp && myself.Skill_InReuseDelay(step0_skill05) == 0) {
if (step0_skill_target05 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step0_skill05, 0, reply, ask, 1000000, 0);

} else if (step0_skill_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step0_skill05, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step0_skill05) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step0_skill05) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step0_skill05) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1671) {
if (MoveAroundSocial > 0) {
if (myself.sm.hp > myself.sm.max_hp * 0.400000 && myself.sm.alive != 0 && myself.p_state != 3) {
myself.AddEffectActionDesire(myself.sm, 1, MoveAroundSocial * 1000 / 30, 50);

}

}
myself.AddTimerEx(1671, 10000);

}
if (timer_id == 2001) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(378208257)) < 1) {
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
if (step0_buff03 != 458752001) {
if (myself.Skill_GetConsumeMP(step0_buff03) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_buff03) < myself.sm.hp && myself.Skill_InReuseDelay(step0_buff03) == 0) {
if (step0_merged_buff03 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff03)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_merged_buff03)) < 1) {
if (step0_buff_target03 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff03, 1, 1, 1000000);

} else if (step0_buff_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff03, 1, 1, 1000000);

} else if (step0_buff_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff03, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff03)) < 1) {
if (step0_buff_target03 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff03, 1, 1, 1000000);

} else if (step0_buff_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff03, 1, 1, 1000000);

} else if (step0_buff_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff03, 1, 1, 1000000);

}

}

}

}
if (step0_buff04 != 458752001) {
if (myself.Skill_GetConsumeMP(step0_buff04) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_buff04) < myself.sm.hp && myself.Skill_InReuseDelay(step0_buff04) == 0) {
if (step0_merged_buff04 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff04)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_merged_buff04)) < 1) {
if (step0_buff_target04 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff04, 1, 1, 1000000);

} else if (step0_buff_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff04, 1, 1, 1000000);

} else if (step0_buff_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff04, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff04)) < 1) {
if (step0_buff_target04 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff04, 1, 1, 1000000);

} else if (step0_buff_target04 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff04, 1, 1, 1000000);

} else if (step0_buff_target04 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff04, 1, 1, 1000000);

}

}

}

}
if (step0_buff05 != 458752001) {
if (myself.Skill_GetConsumeMP(step0_buff05) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_buff05) < myself.sm.hp && myself.Skill_InReuseDelay(step0_buff05) == 0) {
if (step0_merged_buff05 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff05)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_merged_buff05)) < 1) {
if (step0_buff_target05 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff05, 1, 1, 1000000);

} else if (step0_buff_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff05, 1, 1, 1000000);

} else if (step0_buff_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff05, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff05)) < 1) {
if (step0_buff_target05 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff05, 1, 1, 1000000);

} else if (step0_buff_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff05, 1, 1, 1000000);

} else if (step0_buff_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff05, 1, 1, 1000000);

}

}

}

}
if (step0_buff06 != 458752001) {
if (myself.Skill_GetConsumeMP(step0_buff06) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_buff06) < myself.sm.hp && myself.Skill_InReuseDelay(step0_buff06) == 0) {
if (step0_merged_buff06 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff06)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_merged_buff06)) < 1) {
if (step0_buff_target06 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff06, 1, 1, 1000000);

} else if (step0_buff_target06 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff06, 1, 1, 1000000);

} else if (step0_buff_target06 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff06, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff06)) < 1) {
if (step0_buff_target06 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff06, 1, 1, 1000000);

} else if (step0_buff_target06 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff06, 1, 1, 1000000);

} else if (step0_buff_target06 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff06, 1, 1, 1000000);

}

}

}

}
if (step0_buff07 != 458752001) {
if (myself.Skill_GetConsumeMP(step0_buff07) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_buff07) < myself.sm.hp && myself.Skill_InReuseDelay(step0_buff07) == 0) {
if (step0_merged_buff07 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff07)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_merged_buff07)) < 1) {
if (step0_buff_target07 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff07, 1, 1, 1000000);

} else if (step0_buff_target07 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff07, 1, 1, 1000000);

} else if (step0_buff_target07 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff07, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff07)) < 1) {
if (step0_buff_target07 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff07, 1, 1, 1000000);

} else if (step0_buff_target07 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff07, 1, 1, 1000000);

} else if (step0_buff_target07 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff07, 1, 1, 1000000);

}

}

}

}
if (step0_buff08 != 458752001) {
if (myself.Skill_GetConsumeMP(step0_buff08) < myself.sm.mp && myself.Skill_GetConsumeHP(step0_buff08) < myself.sm.hp && myself.Skill_InReuseDelay(step0_buff08) == 0) {
if (step0_merged_buff08 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff08)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_merged_buff08)) < 1) {
if (step0_buff_target08 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff08, 1, 1, 1000000);

} else if (step0_buff_target08 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff08, 1, 1, 1000000);

} else if (step0_buff_target08 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff08, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step0_buff08)) < 1) {
if (step0_buff_target08 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff08, 1, 1, 1000000);

} else if (step0_buff_target08 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step0_buff08, 1, 1, 1000000);

} else if (step0_buff_target08 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step0_buff08, 1, 1, 1000000);

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

} else if (myself.sm.level < lv_step4) {
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

} else if (myself.sm.level < lv_step5) {
if (step4_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step4_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step4_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step4_heal01) == 0) {
if (step4_heal01 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step4_heal01)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step4_heal01)) < 1) {
if (step4_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step4_heal01, 1, 1, 1000000);

} else if (step4_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step4_heal01, 1, 1, 1000000);

} else if (step4_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step4_heal01, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step4_heal01)) < 1) {
if (step4_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step4_heal01, 1, 1, 1000000);

} else if (step4_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step4_heal01, 1, 1, 1000000);

} else if (step4_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step4_heal01, 1, 1, 1000000);

}

}

}

}

} else if (myself.sm.level < lv_step6) {
if (step5_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step5_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step5_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step5_heal01) == 0) {
if (step5_heal01 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step5_heal01)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step5_heal01)) < 1) {
if (step5_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step5_heal01, 1, 1, 1000000);

} else if (step5_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step5_heal01, 1, 1, 1000000);

} else if (step5_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step5_heal01, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step5_heal01)) < 1) {
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

} else if (myself.sm.level < lv_step7) {
if (step6_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step6_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step6_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step6_heal01) == 0) {
if (step6_heal01 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step6_heal01)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step6_heal01)) < 1) {
if (step6_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step6_heal01, 1, 1, 1000000);

} else if (step6_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step6_heal01, 1, 1, 1000000);

} else if (step6_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step6_heal01, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step6_heal01)) < 1) {
if (step6_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step6_heal01, 1, 1, 1000000);

} else if (step6_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step6_heal01, 1, 1, 1000000);

} else if (step6_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step6_heal01, 1, 1, 1000000);

}

}

}

}

} else if (myself.sm.level >= lv_step7) {
if (step7_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step7_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step7_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step7_heal01) == 0) {
if (step7_heal01 != 458752001) {
if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step7_heal01)) < 1 && gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step7_heal01)) < 1) {
if (step7_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step7_heal01, 1, 1, 1000000);

} else if (step7_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step7_heal01, 1, 1, 1000000);

} else if (step7_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step7_heal01, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.master, myself.Skill_GetAbnormalType(step7_heal01)) < 1) {
if (step7_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step7_heal01, 1, 1, 1000000);

} else if (step7_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step7_heal01, 1, 1, 1000000);

} else if (step7_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step7_heal01, 1, 1, 1000000);

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

} else if (myself.sm.level < lv_step4) {
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

} else if (myself.sm.level < lv_step5) {
if (step4_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step4_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step4_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step4_heal02) == 0) {
if (step4_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step4_heal02, 1, 1, 1000000);

} else if (step4_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step4_heal02, 1, 1, 1000000);

} else if (step4_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step4_heal02, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level < lv_step6) {
if (step5_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step5_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step5_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step5_heal02) == 0) {
if (step5_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step5_heal02, 1, 1, 1000000);

} else if (step5_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step5_heal02, 1, 1, 1000000);

} else if (step5_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step5_heal02, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level < lv_step7) {
if (step6_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step6_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step6_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step6_heal02) == 0) {
if (step6_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step6_heal02, 1, 1, 1000000);

} else if (step6_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step6_heal02, 1, 1, 1000000);

} else if (step6_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step6_heal02, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level >= lv_step7) {
if (step7_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step7_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step7_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step7_heal02) == 0) {
if (step7_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step7_heal02, 1, 1, 1000000);

} else if (step7_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step7_heal02, 1, 1, 1000000);

} else if (step7_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step7_heal02, 1, 1, 1000000);

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

} else if (myself.sm.level < lv_step4) {
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

} else if (myself.sm.level < lv_step5) {
if (step4_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step4_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step4_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step4_heal02) == 0) {
if (step4_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step4_heal02, 1, 1, 1000000);

} else if (step4_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step4_heal02, 1, 1, 1000000);

} else if (step4_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step4_heal02, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level < lv_step6) {
if (step5_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step5_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step5_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step5_heal02) == 0) {
if (step5_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step5_heal02, 1, 1, 1000000);

} else if (step5_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step5_heal02, 1, 1, 1000000);

} else if (step5_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step5_heal02, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level < lv_step7) {
if (step6_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step6_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step6_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step6_heal02) == 0) {
if (step6_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step6_heal02, 1, 1, 1000000);

} else if (step6_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step6_heal02, 1, 1, 1000000);

} else if (step6_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step6_heal02, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level >= lv_step7) {
if (step7_heal02 != 458752001) {
if (myself.Skill_GetConsumeMP(step7_heal02) < myself.sm.mp && myself.Skill_GetConsumeHP(step7_heal02) < myself.sm.hp && myself.Skill_InReuseDelay(step7_heal02) == 0) {
if (step7_heal_target02 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step7_heal02, 1, 1, 1000000);

} else if (step7_heal_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step7_heal02, 1, 1, 1000000);

} else if (step7_heal_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step7_heal02, 1, 1, 1000000);

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

} else if (myself.sm.level < lv_step6) {
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

} else if (myself.sm.level < lv_step7) {
if (step6_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step6_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step6_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step6_heal01) == 0) {
if (step6_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step6_heal01, 1, 1, 1000000);

} else if (step6_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step6_heal01, 1, 1, 1000000);

} else if (step6_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step6_heal01, 1, 1, 1000000);

}

}

}

} else if (myself.sm.level >= lv_step7) {
if (step7_heal01 != 458752001) {
if (myself.Skill_GetConsumeMP(step7_heal01) < myself.sm.mp && myself.Skill_GetConsumeHP(step7_heal01) < myself.sm.hp && myself.Skill_InReuseDelay(step7_heal01) == 0) {
if (step7_heal_target01 == 0 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step7_heal01, 1, 1, 1000000);

} else if (step7_heal_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesire(myself.sm, step7_heal01, 1, 1, 1000000);

} else if (step7_heal_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesire(myself.master, step7_heal01, 1, 1, 1000000);

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