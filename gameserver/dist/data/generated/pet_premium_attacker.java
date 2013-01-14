package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pet_premium_attacker extends default_npc {
	protected int lv_step1 = 10;
	protected int lv_step2 = 20;
	protected int lv_step3 = 30;
	protected int lv_step4 = 40;
	protected int lv_step5 = 50;
	protected int lv_step6 = 60;
	protected int lv_step7 = 70;
	protected int step0_skill01 = 458752001;
	protected int step0_skill02 = 458752001;
	protected int step0_skill03 = 458752001;
	protected int step0_skill04 = 458752001;
	protected int step0_skill05 = 458752001;
	protected int step0_skill_target01 = 0;
	protected int step0_skill_target02 = 0;
	protected int step0_skill_target03 = 0;
	protected int step0_skill_target04 = 0;
	protected int step0_skill_target05 = 0;
	protected int step0_action01 = -1;
	protected int step0_action02 = -1;
	protected int step0_action03 = -1;
	protected int step0_action04 = -1;
	protected int step0_action05 = -1;
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
	protected int step2_skill_target01 = 0;
	protected int step2_skill_target02 = 0;
	protected int step2_skill_target03 = 0;
	protected int step2_skill_target04 = 0;
	protected int step2_action01 = -1;
	protected int step2_action02 = -1;
	protected int step2_action03 = -1;
	protected int step2_action04 = -1;
	protected int step3_skill01 = 458752001;
	protected int step3_skill02 = 458752001;
	protected int step3_skill03 = 458752001;
	protected int step3_skill04 = 458752001;
	protected int step3_skill_target01 = 0;
	protected int step3_skill_target02 = 0;
	protected int step3_skill_target03 = 0;
	protected int step3_skill_target04 = 0;
	protected int step3_action01 = -1;
	protected int step3_action02 = -1;
	protected int step3_action03 = -1;
	protected int step3_action04 = -1;
	protected int step4_skill01 = 458752001;
	protected int step4_skill02 = 458752001;
	protected int step4_skill03 = 458752001;
	protected int step4_skill04 = 458752001;
	protected int step4_skill_target01 = 0;
	protected int step4_skill_target02 = 0;
	protected int step4_skill_target03 = 0;
	protected int step4_skill_target04 = 0;
	protected int step4_action01 = -1;
	protected int step4_action02 = -1;
	protected int step4_action03 = -1;
	protected int step4_action04 = -1;
	protected int step5_skill01 = 458752001;
	protected int step5_skill02 = 458752001;
	protected int step5_skill03 = 458752001;
	protected int step5_skill04 = 458752001;
	protected int step5_skill_target01 = 0;
	protected int step5_skill_target02 = 0;
	protected int step5_skill_target03 = 0;
	protected int step5_skill_target04 = 0;
	protected int step5_action01 = -1;
	protected int step5_action02 = -1;
	protected int step5_action03 = -1;
	protected int step5_action04 = -1;
	protected int step6_skill01 = 458752001;
	protected int step6_skill02 = 458752001;
	protected int step6_skill03 = 458752001;
	protected int step6_skill04 = 458752001;
	protected int step6_skill_target01 = 0;
	protected int step6_skill_target02 = 0;
	protected int step6_skill_target03 = 0;
	protected int step6_skill_target04 = 0;
	protected int step6_action01 = -1;
	protected int step6_action02 = -1;
	protected int step6_action03 = -1;
	protected int step6_action04 = -1;
	protected int step7_skill01 = 458752001;
	protected int step7_skill02 = 458752001;
	protected int step7_skill03 = 458752001;
	protected int step7_skill04 = 458752001;
	protected int step7_skill_target01 = 0;
	protected int step7_skill_target02 = 0;
	protected int step7_skill_target03 = 0;
	protected int step7_skill_target04 = 0;
	protected int step7_action01 = -1;
	protected int step7_action02 = -1;
	protected int step7_action03 = -1;
	protected int step7_action04 = -1;
	protected int master_transform_id = -1;
	protected int chk_timer = 2;
	protected int MoveAroundSocial = 0;

	protected void CREATED() {
myself.AddPetDefaultDesire_Follow(20.000000);
myself.AddTimerEx(1131, chk_timer * 1000);
myself.AddTimerEx(1671, 10000);
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
if (step4_skill01 != 458752001 && step4_action01 != -1) {
if (action_id == step4_action01) {
if (myself.Skill_GetConsumeMP(step4_skill01) < myself.sm.mp && myself.Skill_GetConsumeHP(step4_skill01) < myself.sm.hp && myself.Skill_InReuseDelay(step4_skill01) == 0) {
if (step4_skill_target01 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step4_skill01, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step4_skill01, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step4_skill01, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step4_skill01) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step4_skill01) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step4_skill01) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step4_skill02 != 458752001 && step4_action02 != -1) {
if (action_id == step4_action02) {
if (myself.Skill_GetConsumeMP(step4_skill02) < myself.sm.mp && myself.Skill_GetConsumeHP(step4_skill02) < myself.sm.hp && myself.Skill_InReuseDelay(step4_skill02) == 0) {
if (step4_skill_target02 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step4_skill02, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step4_skill02, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step4_skill02, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step4_skill02) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step4_skill02) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step4_skill02) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step4_skill03 != 458752001 && step4_action03 != -1) {
if (action_id == step4_action03) {
if (myself.Skill_GetConsumeMP(step4_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step4_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step4_skill03) == 0) {
if (step4_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step4_skill03, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step4_skill03, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step4_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step4_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step4_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step4_skill03) >= myself.sm.hp) {
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
if (step5_skill01 != 458752001 && step5_action01 != -1) {
if (action_id == step5_action01) {
if (myself.Skill_GetConsumeMP(step5_skill01) < myself.sm.mp && myself.Skill_GetConsumeHP(step5_skill01) < myself.sm.hp && myself.Skill_InReuseDelay(step5_skill01) == 0) {
if (step5_skill_target01 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step5_skill01, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step5_skill01, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step5_skill01, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step5_skill01) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step5_skill01) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step5_skill01) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step5_skill02 != 458752001 && step5_action02 != -1) {
if (action_id == step5_action02) {
if (myself.Skill_GetConsumeMP(step5_skill02) < myself.sm.mp && myself.Skill_GetConsumeHP(step5_skill02) < myself.sm.hp && myself.Skill_InReuseDelay(step5_skill02) == 0) {
if (step5_skill_target02 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step5_skill02, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step5_skill02, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step5_skill02, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step5_skill02) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step5_skill02) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step5_skill02) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step5_skill03 != 458752001 && step5_action03 != -1) {
if (action_id == step5_action03) {
if (myself.Skill_GetConsumeMP(step5_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step5_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step5_skill03) == 0) {
if (step5_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step5_skill03, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step5_skill03, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step5_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step5_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step5_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step5_skill03) >= myself.sm.hp) {
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
if (step6_skill01 != 458752001 && step6_action01 != -1) {
if (action_id == step6_action01) {
if (myself.Skill_GetConsumeMP(step6_skill01) < myself.sm.mp && myself.Skill_GetConsumeHP(step6_skill01) < myself.sm.hp && myself.Skill_InReuseDelay(step6_skill01) == 0) {
if (step6_skill_target01 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step6_skill01, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step6_skill01, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step6_skill01, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step6_skill01) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step6_skill01) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step6_skill01) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step6_skill02 != 458752001 && step6_action02 != -1) {
if (action_id == step6_action02) {
if (myself.Skill_GetConsumeMP(step6_skill02) < myself.sm.mp && myself.Skill_GetConsumeHP(step6_skill02) < myself.sm.hp && myself.Skill_InReuseDelay(step6_skill02) == 0) {
if (step6_skill_target02 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step6_skill02, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step6_skill02, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step6_skill02, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step6_skill02) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step6_skill02) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step6_skill02) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step6_skill03 != 458752001 && step6_action03 != -1) {
if (action_id == step6_action03) {
if (myself.Skill_GetConsumeMP(step6_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step6_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step6_skill03) == 0) {
if (step6_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step6_skill03, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step6_skill03, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step6_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step6_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step6_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step6_skill03) >= myself.sm.hp) {
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
if (step7_skill01 != 458752001 && step7_action01 != -1) {
if (action_id == step7_action01) {
if (myself.Skill_GetConsumeMP(step7_skill01) < myself.sm.mp && myself.Skill_GetConsumeHP(step7_skill01) < myself.sm.hp && myself.Skill_InReuseDelay(step7_skill01) == 0) {
if (step7_skill_target01 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step7_skill01, 0, reply, ask, 1000000, 0);

} else if (step7_skill_target01 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step7_skill01, 0, reply, ask, 1000000, 0);

} else if (step7_skill_target01 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step7_skill01, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step7_skill01) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step7_skill01) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step7_skill01) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step7_skill02 != 458752001 && step7_action02 != -1) {
if (action_id == step7_action02) {
if (myself.Skill_GetConsumeMP(step7_skill02) < myself.sm.mp && myself.Skill_GetConsumeHP(step7_skill02) < myself.sm.hp && myself.Skill_InReuseDelay(step7_skill02) == 0) {
if (step7_skill_target02 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step7_skill02, 0, reply, ask, 1000000, 0);

} else if (step7_skill_target02 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step7_skill02, 0, reply, ask, 1000000, 0);

} else if (step7_skill_target02 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step7_skill02, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step7_skill02) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step7_skill02) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step7_skill02) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step7_skill03 != 458752001 && step7_action03 != -1) {
if (action_id == step7_action03) {
if (myself.Skill_GetConsumeMP(step7_skill03) < myself.sm.mp && myself.Skill_GetConsumeHP(step7_skill03) < myself.sm.hp && myself.Skill_InReuseDelay(step7_skill03) == 0) {
if (step7_skill_target03 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step7_skill03, 0, reply, ask, 1000000, 0);

} else if (step7_skill_target03 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step7_skill03, 0, reply, ask, 1000000, 0);

} else if (step7_skill_target03 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step7_skill03, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step7_skill03) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step7_skill03) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step7_skill03) >= myself.sm.hp) {
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
if (timer_id == 1131) {
if (master_transform_id != -1 && master_transform_id != myself.master.transformID) {
myself.Despawn();

}
myself.AddTimerEx(1131, chk_timer * 1000);

}
	}


}