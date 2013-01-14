package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pet_active_grow extends default_npc {
	protected int lv_step1 = 60;
	protected int lv_step2 = 65;
	protected int lv_step3 = 70;
	protected int lv_step4 = 75;
	protected int lv_step5 = 80;
	protected int lv_step6 = 85;
	protected int step0_skill01 = 458752001;
	protected int step0_skill02 = 458752001;
	protected int step0_skill03 = 458752001;
	protected int step0_skill_target01 = 0;
	protected int step0_skill_target02 = 0;
	protected int step0_skill_target03 = 0;
	protected int step0_action01 = -1;
	protected int step0_action02 = -1;
	protected int step0_action03 = -1;
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
	protected int step4_skill01 = 458752001;
	protected int step4_skill02 = 458752001;
	protected int step4_skill03 = 458752001;
	protected int step4_skill04 = 458752001;
	protected int step4_skill05 = 458752001;
	protected int step4_skill06 = 458752001;
	protected int step4_skill07 = 458752001;
	protected int step4_skill08 = 458752001;
	protected int step4_skill_target01 = 0;
	protected int step4_skill_target02 = 0;
	protected int step4_skill_target03 = 0;
	protected int step4_skill_target04 = 0;
	protected int step4_skill_target05 = 0;
	protected int step4_skill_target06 = 0;
	protected int step4_skill_target07 = 0;
	protected int step4_skill_target08 = 0;
	protected int step4_action01 = -1;
	protected int step4_action02 = -1;
	protected int step4_action03 = -1;
	protected int step4_action04 = -1;
	protected int step4_action05 = -1;
	protected int step4_action06 = -1;
	protected int step4_action07 = -1;
	protected int step4_action08 = -1;
	protected int step5_skill01 = 458752001;
	protected int step5_skill02 = 458752001;
	protected int step5_skill03 = 458752001;
	protected int step5_skill04 = 458752001;
	protected int step5_skill05 = 458752001;
	protected int step5_skill06 = 458752001;
	protected int step5_skill07 = 458752001;
	protected int step5_skill08 = 458752001;
	protected int step5_skill_target01 = 0;
	protected int step5_skill_target02 = 0;
	protected int step5_skill_target03 = 0;
	protected int step5_skill_target04 = 0;
	protected int step5_skill_target05 = 0;
	protected int step5_skill_target06 = 0;
	protected int step5_skill_target07 = 0;
	protected int step5_skill_target08 = 0;
	protected int step5_action01 = -1;
	protected int step5_action02 = -1;
	protected int step5_action03 = -1;
	protected int step5_action04 = -1;
	protected int step5_action05 = -1;
	protected int step5_action06 = -1;
	protected int step5_action07 = -1;
	protected int step5_action08 = -1;
	protected int step6_skill01 = 458752001;
	protected int step6_skill02 = 458752001;
	protected int step6_skill03 = 458752001;
	protected int step6_skill04 = 458752001;
	protected int step6_skill05 = 458752001;
	protected int step6_skill06 = 458752001;
	protected int step6_skill07 = 458752001;
	protected int step6_skill08 = 458752001;
	protected int step6_skill_target01 = 0;
	protected int step6_skill_target02 = 0;
	protected int step6_skill_target03 = 0;
	protected int step6_skill_target04 = 0;
	protected int step6_skill_target05 = 0;
	protected int step6_skill_target06 = 0;
	protected int step6_skill_target07 = 0;
	protected int step6_skill_target08 = 0;
	protected int step6_action01 = -1;
	protected int step6_action02 = -1;
	protected int step6_action03 = -1;
	protected int step6_action04 = -1;
	protected int step6_action05 = -1;
	protected int step6_action06 = -1;
	protected int step6_action07 = -1;
	protected int step6_action08 = -1;
	protected int master_transform_id = -1;
	protected int chk_timer = 2;

	protected void CREATED() {
myself.AddPetDefaultDesire_Follow(20.000000);
myself.AddTimerEx(1131, chk_timer * 1000);
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
if (myself.Skill_GetConsumeMP(step4_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step4_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step4_skill04) == 0) {
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
if (step4_skill05 != 458752001 && step4_action05 != -1) {
if (action_id == step4_action05) {
if (myself.Skill_GetConsumeMP(step4_skill05) < myself.sm.mp && myself.Skill_GetConsumeHP(step4_skill05) < myself.sm.hp && myself.Skill_InReuseDelay(step4_skill05) == 0) {
if (step4_skill_target05 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step4_skill05, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step4_skill05, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step4_skill05, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step4_skill05) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step4_skill05) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step4_skill05) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step4_skill06 != 458752001 && step4_action06 != -1) {
if (action_id == step4_action06) {
if (myself.Skill_GetConsumeMP(step4_skill06) < myself.sm.mp && myself.Skill_GetConsumeHP(step4_skill06) < myself.sm.hp && myself.Skill_InReuseDelay(step4_skill06) == 0) {
if (step4_skill_target06 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step4_skill06, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target06 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step4_skill06, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target06 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step4_skill06, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step4_skill06) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step4_skill06) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step4_skill06) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step4_skill07 != 458752001 && step4_action07 != -1) {
if (action_id == step4_action07) {
if (myself.Skill_GetConsumeMP(step4_skill07) < myself.sm.mp && myself.Skill_GetConsumeHP(step4_skill07) < myself.sm.hp && myself.Skill_InReuseDelay(step4_skill07) == 0) {
if (step4_skill_target07 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step4_skill07, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target07 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step4_skill07, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target07 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step4_skill07, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step4_skill07) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step4_skill07) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step4_skill07) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step4_skill08 != 458752001 && step4_action08 != -1) {
if (action_id == step4_action08) {
if (myself.Skill_GetConsumeMP(step4_skill08) < myself.sm.mp && myself.Skill_GetConsumeHP(step4_skill08) < myself.sm.hp && myself.Skill_InReuseDelay(step4_skill08) == 0) {
if (step4_skill_target08 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step4_skill08, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target08 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step4_skill08, 0, reply, ask, 1000000, 0);

} else if (step4_skill_target08 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step4_skill08, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step4_skill08) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step4_skill08) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step4_skill08) >= myself.sm.hp) {
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
if (myself.Skill_GetConsumeMP(step5_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step5_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step5_skill04) == 0) {
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
if (step5_skill05 != 458752001 && step5_action05 != -1) {
if (action_id == step5_action05) {
if (myself.Skill_GetConsumeMP(step5_skill05) < myself.sm.mp && myself.Skill_GetConsumeHP(step5_skill05) < myself.sm.hp && myself.Skill_InReuseDelay(step5_skill05) == 0) {
if (step5_skill_target05 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step5_skill05, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step5_skill05, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step5_skill05, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step5_skill05) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step5_skill05) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step5_skill05) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step5_skill06 != 458752001 && step5_action06 != -1) {
if (action_id == step5_action06) {
if (myself.Skill_GetConsumeMP(step5_skill06) < myself.sm.mp && myself.Skill_GetConsumeHP(step5_skill06) < myself.sm.hp && myself.Skill_InReuseDelay(step5_skill06) == 0) {
if (step5_skill_target06 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step5_skill06, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target06 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step5_skill06, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target06 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step5_skill06, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step5_skill06) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step5_skill06) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step5_skill06) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step5_skill07 != 458752001 && step5_action07 != -1) {
if (action_id == step5_action07) {
if (myself.Skill_GetConsumeMP(step5_skill07) < myself.sm.mp && myself.Skill_GetConsumeHP(step5_skill07) < myself.sm.hp && myself.Skill_InReuseDelay(step5_skill07) == 0) {
if (step5_skill_target07 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step5_skill07, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target07 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step5_skill07, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target07 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step5_skill07, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step5_skill07) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step5_skill07) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step5_skill07) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step5_skill08 != 458752001 && step5_action08 != -1) {
if (action_id == step5_action08) {
if (myself.Skill_GetConsumeMP(step5_skill08) < myself.sm.mp && myself.Skill_GetConsumeHP(step5_skill08) < myself.sm.hp && myself.Skill_InReuseDelay(step5_skill08) == 0) {
if (step5_skill_target08 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step5_skill08, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target08 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step5_skill08, 0, reply, ask, 1000000, 0);

} else if (step5_skill_target08 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step5_skill08, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step5_skill08) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step5_skill08) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step5_skill08) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

} else if (myself.sm.level >= lv_step6) {
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
if (myself.Skill_GetConsumeMP(step6_skill04) < myself.sm.mp && myself.Skill_GetConsumeHP(step6_skill04) < myself.sm.hp && myself.Skill_InReuseDelay(step6_skill04) == 0) {
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
if (step6_skill05 != 458752001 && step6_action05 != -1) {
if (action_id == step6_action05) {
if (myself.Skill_GetConsumeMP(step6_skill05) < myself.sm.mp && myself.Skill_GetConsumeHP(step6_skill05) < myself.sm.hp && myself.Skill_InReuseDelay(step6_skill05) == 0) {
if (step6_skill_target05 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step6_skill05, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target05 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step6_skill05, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target05 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step6_skill05, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step6_skill05) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step6_skill05) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step6_skill05) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step6_skill06 != 458752001 && step6_action06 != -1) {
if (action_id == step6_action06) {
if (myself.Skill_GetConsumeMP(step6_skill06) < myself.sm.mp && myself.Skill_GetConsumeHP(step6_skill06) < myself.sm.hp && myself.Skill_InReuseDelay(step6_skill06) == 0) {
if (step6_skill_target06 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step6_skill06, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target06 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step6_skill06, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target06 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step6_skill06, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step6_skill06) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step6_skill06) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step6_skill06) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step6_skill07 != 458752001 && step6_action07 != -1) {
if (action_id == step6_action07) {
if (myself.Skill_GetConsumeMP(step6_skill07) < myself.sm.mp && myself.Skill_GetConsumeHP(step6_skill07) < myself.sm.hp && myself.Skill_InReuseDelay(step6_skill07) == 0) {
if (step6_skill_target07 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step6_skill07, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target07 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step6_skill07, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target07 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step6_skill07, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step6_skill07) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step6_skill07) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step6_skill07) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}
if (step6_skill08 != 458752001 && step6_action08 != -1) {
if (action_id == step6_action08) {
if (myself.Skill_GetConsumeMP(step6_skill08) < myself.sm.mp && myself.Skill_GetConsumeHP(step6_skill08) < myself.sm.hp && myself.Skill_InReuseDelay(step6_skill08) == 0) {
if (step6_skill_target08 == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, step6_skill08, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target08 == 1 && myself.sm.alive > 0) {
myself.AddUseSkillDesireEx(myself.sm.id, step6_skill08, 0, reply, ask, 1000000, 0);

} else if (step6_skill_target08 == 2 && myself.master.alive > 0) {
myself.AddUseSkillDesireEx(myself.master.id, step6_skill08, 0, reply, ask, 1000000, 0);

}

} else if (myself.Skill_InReuseDelay(step6_skill08) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(step6_skill08) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(step6_skill08) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1131) {
if (master_transform_id != -1 && master_transform_id != myself.master.transformID) {
myself.Despawn();

}
myself.AddTimerEx(1131, chk_timer * 1000);

}
	}


}