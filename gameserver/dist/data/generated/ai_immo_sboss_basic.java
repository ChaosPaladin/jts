package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_immo_sboss_basic extends ai_immo_basic {
	protected String type = "solo_boss_default";
	protected int TM_WORMWAKE = 78009;
	protected int TIME_WORMWAKE = 30;
	protected int Skill_sbossdef = 388628481;
	protected int reward_sboss = 13797;
	protected int reward_quantity_sboss = 20;

	protected void CREATED(HandlerParam c0) {
myself.AddTimerEx(TM_WORMWAKE, TIME_WORMWAKE * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam h0, HandlerParam i0) {
if (timer_id == TM_WORMWAKE) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
if (h0.creature != myself.sm) {
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384696321)) <= 8 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384761859)) <= 8 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384827395)) <= 8 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384434177)) <= 8 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384565251)) <= 8 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384630787)) <= 8 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384499715)) <= 8 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384892929)) <= 2 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384958465)) <= 2) {
if (gg.Skill_IsMagic(385155074) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(385155074) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(385155074) < myself.sm.mp && myself.Skill_GetConsumeHP(385155074) < myself.sm.hp && myself.Skill_InReuseDelay(385155074) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, 385155074, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384696321)) <= 9 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384761859)) <= 9 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384827395)) <= 9 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384434177)) <= 9 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384565251)) <= 9 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384630787)) <= 9 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384499715)) <= 10 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384892929)) <= 4 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384958465)) <= 4) {
if (gg.Skill_IsMagic(385155075) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(385155075) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(385155075) < myself.sm.mp && myself.Skill_GetConsumeHP(385155075) < myself.sm.hp && myself.Skill_InReuseDelay(385155075) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, 385155075, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384696321)) <= 10 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384761859)) <= 10 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384827395)) <= 10 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384434177)) <= 10 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384565251)) <= 10 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384630787)) <= 10 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384499715)) <= 10 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384892929)) <= 5 || gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(384958465)) <= 5) {
if (gg.Skill_IsMagic(385155076) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(385155076) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(385155076) < myself.sm.mp && myself.Skill_GetConsumeHP(385155076) < myself.sm.hp && myself.Skill_InReuseDelay(385155076) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, 385155076, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(385155073) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(385155073) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(385155073) < myself.sm.mp && myself.Skill_GetConsumeHP(385155073) < myself.sm.hp && myself.Skill_InReuseDelay(385155073) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, 385155073, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
myself.AddTimerEx(TM_WORMWAKE, TIME_WORMWAKE * 1000);

}
super;
	}

	protected void MY_DYING(HandlerParam i0) {
i0 = gg.FloatToInt(reward_quantity_sboss / 2);
myself.DropItem1(myself.sm, reward_sboss, i0 + gg.Rand(i0) + 1);
super;
	}


}