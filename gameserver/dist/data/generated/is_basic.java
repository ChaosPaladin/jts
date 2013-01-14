package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class is_basic extends combat_monster {
	protected int type = 0;
	protected int FieldCycle = 3;
	protected int FieldCycle_Quantity = 50;
	protected int attack_x = 0;
	protected int attack_y = 0;
	protected int attack_z = 0;

	protected void MY_DYING(HandlerParam c1, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam target) {
if (target != myself.sm && skill_name_id != 387252225 || skill_name_id != 387317761 || skill_name_id != 387055617) {
if (skill_name_id == 385220609 || skill_name_id == 385286145 || skill_name_id == 385351681 || skill_name_id == 385351682 || skill_name_id == 385417217 || skill_name_id == 385417218 || skill_name_id == 385482753 || skill_name_id == 385482754 || skill_name_id == 385548289 || skill_name_id == 385941505 || skill_name_id == 385941506 || skill_name_id == 385941507 || skill_name_id == 386072577 || skill_name_id == 386138113 || skill_name_id == 386138114) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384696321)) <= 8) {
if (target.max_hp * 0.300000 >= target.hp) {
if (gg.Skill_IsMagic(384696323) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696323) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696323) < myself.sm.mp && myself.Skill_GetConsumeHP(384696323) < myself.sm.hp && myself.Skill_InReuseDelay(384696323) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696323, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.600000 >= target.hp) {
if (gg.Skill_IsMagic(384696322) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696322) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696322) < myself.sm.mp && myself.Skill_GetConsumeHP(384696322) < myself.sm.hp && myself.Skill_InReuseDelay(384696322) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696322, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(384696321) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696321) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696321) < myself.sm.mp && myself.Skill_GetConsumeHP(384696321) < myself.sm.hp && myself.Skill_InReuseDelay(384696321) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696321, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384696321)) <= 9) {
if (target.max_hp * 0.300000 >= target.hp) {
if (gg.Skill_IsMagic(384696327) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696327) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696327) < myself.sm.mp && myself.Skill_GetConsumeHP(384696327) < myself.sm.hp && myself.Skill_InReuseDelay(384696327) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696327, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.600000 >= target.hp) {
if (gg.Skill_IsMagic(384696326) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696326) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696326) < myself.sm.mp && myself.Skill_GetConsumeHP(384696326) < myself.sm.hp && myself.Skill_InReuseDelay(384696326) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696326, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.900000 >= target.hp) {
if (gg.Skill_IsMagic(384696325) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696325) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696325) < myself.sm.mp && myself.Skill_GetConsumeHP(384696325) < myself.sm.hp && myself.Skill_InReuseDelay(384696325) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696325, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(384696324) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696324) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696324) < myself.sm.mp && myself.Skill_GetConsumeHP(384696324) < myself.sm.hp && myself.Skill_InReuseDelay(384696324) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696324, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384696321)) <= 10) {
if (target.max_hp * 0.300000 >= target.hp) {
if (gg.Skill_IsMagic(384696330) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696330) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696330) < myself.sm.mp && myself.Skill_GetConsumeHP(384696330) < myself.sm.hp && myself.Skill_InReuseDelay(384696330) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696330, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.600000 >= target.hp) {
if (gg.Skill_IsMagic(384696329) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696329) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696329) < myself.sm.mp && myself.Skill_GetConsumeHP(384696329) < myself.sm.hp && myself.Skill_InReuseDelay(384696329) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696329, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(384696328) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384696328) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384696328) < myself.sm.mp && myself.Skill_GetConsumeHP(384696328) < myself.sm.hp && myself.Skill_InReuseDelay(384696328) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384696328, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 385613825 || skill_name_id == 385613826 || skill_name_id == 385679361 || skill_name_id == 383713282 || skill_name_id == 385875969 || skill_name_id == 385875970 || skill_name_id == 388759553 || skill_name_id == 388825089) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384761859)) < 8) {
if (gg.Skill_IsMagic(384761859) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384761859) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384761859) < myself.sm.mp && myself.Skill_GetConsumeHP(384761859) < myself.sm.hp && myself.Skill_InReuseDelay(384761859) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384761859, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384761859)) < 9) {
if (gg.Skill_IsMagic(384761863) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384761863) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384761863) < myself.sm.mp && myself.Skill_GetConsumeHP(384761863) < myself.sm.hp && myself.Skill_InReuseDelay(384761863) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384761863, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384761859)) < 10) {
if (gg.Skill_IsMagic(384761866) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384761866) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384761866) < myself.sm.mp && myself.Skill_GetConsumeHP(384761866) < myself.sm.hp && myself.Skill_InReuseDelay(384761866) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384761866, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 385744897 || skill_name_id == 385810433 || skill_name_id == 386007041 || skill_name_id == 386007042 || skill_name_id == 386007043) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384827395)) < 8) {
if (gg.Skill_IsMagic(384827395) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384827395) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384827395) < myself.sm.mp && myself.Skill_GetConsumeHP(384827395) < myself.sm.hp && myself.Skill_InReuseDelay(384827395) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384827395, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384827395)) < 9) {
if (gg.Skill_IsMagic(384827399) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384827399) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384827399) < myself.sm.mp && myself.Skill_GetConsumeHP(384827399) < myself.sm.hp && myself.Skill_InReuseDelay(384827399) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384827399, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384827395)) < 10) {
if (gg.Skill_IsMagic(384827402) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384827402) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384827402) < myself.sm.mp && myself.Skill_GetConsumeHP(384827402) < myself.sm.hp && myself.Skill_InReuseDelay(384827402) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384827402, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 386269185 || skill_name_id == 386334721 || skill_name_id == 386400257 || skill_name_id == 386400258) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384434177)) <= 8) {
if (target.max_hp * 0.300000 >= target.hp) {
if (gg.Skill_IsMagic(384434179) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434179) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434179) < myself.sm.mp && myself.Skill_GetConsumeHP(384434179) < myself.sm.hp && myself.Skill_InReuseDelay(384434179) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434179, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.600000 >= target.hp) {
if (gg.Skill_IsMagic(384434178) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434178) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434178) < myself.sm.mp && myself.Skill_GetConsumeHP(384434178) < myself.sm.hp && myself.Skill_InReuseDelay(384434178) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434178, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(384434177) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434177) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434177) < myself.sm.mp && myself.Skill_GetConsumeHP(384434177) < myself.sm.hp && myself.Skill_InReuseDelay(384434177) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434177, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384434177)) <= 9) {
if (target.max_hp * 0.300000 >= target.hp) {
if (gg.Skill_IsMagic(384434183) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434183) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434183) < myself.sm.mp && myself.Skill_GetConsumeHP(384434183) < myself.sm.hp && myself.Skill_InReuseDelay(384434183) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434183, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.600000 >= target.hp) {
if (gg.Skill_IsMagic(384434182) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434182) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434182) < myself.sm.mp && myself.Skill_GetConsumeHP(384434182) < myself.sm.hp && myself.Skill_InReuseDelay(384434182) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434182, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.900000 >= target.hp) {
if (gg.Skill_IsMagic(384434181) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434181) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434181) < myself.sm.mp && myself.Skill_GetConsumeHP(384434181) < myself.sm.hp && myself.Skill_InReuseDelay(384434181) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434181, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(384434180) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434180) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434180) < myself.sm.mp && myself.Skill_GetConsumeHP(384434180) < myself.sm.hp && myself.Skill_InReuseDelay(384434180) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434180, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384434177)) <= 10) {
if (target.max_hp * 0.300000 >= target.hp) {
if (gg.Skill_IsMagic(384434186) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434186) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434186) < myself.sm.mp && myself.Skill_GetConsumeHP(384434186) < myself.sm.hp && myself.Skill_InReuseDelay(384434186) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434186, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (target.max_hp * 0.600000 >= target.hp) {
if (gg.Skill_IsMagic(384434185) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434185) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434185) < myself.sm.mp && myself.Skill_GetConsumeHP(384434185) < myself.sm.hp && myself.Skill_InReuseDelay(384434185) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434185, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(384434184) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384434184) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384434184) < myself.sm.mp && myself.Skill_GetConsumeHP(384434184) < myself.sm.hp && myself.Skill_InReuseDelay(384434184) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384434184, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 386531329 || skill_name_id == 386531330 || skill_name_id == 387121153 || skill_name_id == 387121154 || skill_name_id == 387186689 || skill_name_id == 387186690) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384565251)) < 8) {
if (gg.Skill_IsMagic(384565251) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384565251) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384565251) < myself.sm.mp && myself.Skill_GetConsumeHP(384565251) < myself.sm.hp && myself.Skill_InReuseDelay(384565251) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384565251, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384565251)) < 9) {
if (gg.Skill_IsMagic(384565255) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384565255) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384565255) < myself.sm.mp && myself.Skill_GetConsumeHP(384565255) < myself.sm.hp && myself.Skill_InReuseDelay(384565255) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384565255, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384565251)) < 10) {
if (gg.Skill_IsMagic(384565258) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384565258) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384565258) < myself.sm.mp && myself.Skill_GetConsumeHP(384565258) < myself.sm.hp && myself.Skill_InReuseDelay(384565258) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384565258, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 386727937 || skill_name_id == 386727938 || skill_name_id == 386924545 || skill_name_id == 386924546 || skill_name_id == 386924547 || skill_name_id == 386990081) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384630787)) < 8) {
if (gg.Skill_IsMagic(384630787) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384630787) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384630787) < myself.sm.mp && myself.Skill_GetConsumeHP(384630787) < myself.sm.hp && myself.Skill_InReuseDelay(384630787) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384630787, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384630787)) < 9) {
if (gg.Skill_IsMagic(384630791) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384630791) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384630791) < myself.sm.mp && myself.Skill_GetConsumeHP(384630791) < myself.sm.hp && myself.Skill_InReuseDelay(384630791) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384630791, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384630787)) < 10) {
if (gg.Skill_IsMagic(384630794) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384630794) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384630794) < myself.sm.mp && myself.Skill_GetConsumeHP(384630794) < myself.sm.hp && myself.Skill_InReuseDelay(384630794) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384630794, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 386596865 || skill_name_id == 386596866 || skill_name_id == 386662401 || skill_name_id == 386859009) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384499715)) < 8) {
if (gg.Skill_IsMagic(384499715) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384499715) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384499715) < myself.sm.mp && myself.Skill_GetConsumeHP(384499715) < myself.sm.hp && myself.Skill_InReuseDelay(384499715) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384499715, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384499715)) < 9) {
if (gg.Skill_IsMagic(384499715) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384499715) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384499715) < myself.sm.mp && myself.Skill_GetConsumeHP(384499715) < myself.sm.hp && myself.Skill_InReuseDelay(384499715) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384499715, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384499715)) < 10) {
if (gg.Skill_IsMagic(384499722) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384499722) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384499722) < myself.sm.mp && myself.Skill_GetConsumeHP(384499722) < myself.sm.hp && myself.Skill_InReuseDelay(384499722) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384499722, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 388235265 || skill_name_id == 388300801) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384892929)) < 1) {
if (gg.Skill_IsMagic(384892929) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384892929) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384892929) < myself.sm.mp && myself.Skill_GetConsumeHP(384892929) < myself.sm.hp && myself.Skill_InReuseDelay(384892929) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384892929, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384892929)) < 2) {
if (gg.Skill_IsMagic(384892930) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384892930) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384892930) < myself.sm.mp && myself.Skill_GetConsumeHP(384892930) < myself.sm.hp && myself.Skill_InReuseDelay(384892930) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384892930, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384892929)) < 3) {
if (gg.Skill_IsMagic(384892931) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384892931) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384892931) < myself.sm.mp && myself.Skill_GetConsumeHP(384892931) < myself.sm.hp && myself.Skill_InReuseDelay(384892931) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384892931, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384892929)) < 4) {
if (gg.Skill_IsMagic(384892932) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384892932) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384892932) < myself.sm.mp && myself.Skill_GetConsumeHP(384892932) < myself.sm.hp && myself.Skill_InReuseDelay(384892932) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384892932, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384892929)) < 5) {
if (gg.Skill_IsMagic(384892933) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384892933) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384892933) < myself.sm.mp && myself.Skill_GetConsumeHP(384892933) < myself.sm.hp && myself.Skill_InReuseDelay(384892933) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384892933, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}
if (skill_name_id == 388366337) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384958465)) < 1) {
if (gg.Skill_IsMagic(384958465) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384958465) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384958465) < myself.sm.mp && myself.Skill_GetConsumeHP(384958465) < myself.sm.hp && myself.Skill_InReuseDelay(384958465) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384958465, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384958465)) < 2) {
if (gg.Skill_IsMagic(384958466) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384958466) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384958466) < myself.sm.mp && myself.Skill_GetConsumeHP(384958466) < myself.sm.hp && myself.Skill_InReuseDelay(384958466) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384958466, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384958465)) < 3) {
if (gg.Skill_IsMagic(384958467) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384958467) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384958467) < myself.sm.mp && myself.Skill_GetConsumeHP(384958467) < myself.sm.hp && myself.Skill_InReuseDelay(384958467) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384958467, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384958465)) < 4) {
if (gg.Skill_IsMagic(384958468) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384958468) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384958468) < myself.sm.mp && myself.Skill_GetConsumeHP(384958468) < myself.sm.hp && myself.Skill_InReuseDelay(384958468) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384958468, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(384958465)) < 5) {
if (gg.Skill_IsMagic(384958469) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(384958469) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(384958469) < myself.sm.mp && myself.Skill_GetConsumeHP(384958469) < myself.sm.hp && myself.Skill_InReuseDelay(384958469) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(target, 384958469, 0, 1, 1000000 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

}

}
super;
	}

	protected void CREATED(HandlerParam c0, HandlerParam i0) {
if (type == 1) {
myself.AddMoveToDesire(attack_x + gg.Rand(100), attack_y + gg.Rand(100), attack_z, 1);

}
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (gg.IsNull(c0) == 0) {
myself.AddMoveToDesire(gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z), 1);

}
myself.AddTimerEx(7777, 5000);
myself.AddTimerEx(7787, 60 * 15 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 7777 && type == 1) {
myself.RenewSpawnedPos(gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z));

}
if (timer_id == 7787) {
myself.Despawn();

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i10) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;

}
if (attacker.is_pc == 1) {
myself.AddHateInfo(attacker, 1, 0, 1, 1);

} else if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 1) {
if (attacker.master.alive == 1) {
if (babble_mode == 1) {
myself.Say("솬수한테 맞았습니다. 주인이 살아 있어 주인 헤이트값을 쌓습니다.");

}
myself.AddHateInfo(attacker, 2, 0, 1, 1);
myself.AddHateInfo(attacker.master, 1, 0, 1, 1);
i10 = myself.GetHateInfoCount();
if (babble_mode == 1) {
myself.Say("헤이트 인포에 있는 값들은 총 " + i10 + "개 입니다.");

}

} else if (attacker.master.alive == 0) {
myself.AddAttackDesire(attacker, 1, 100);

}

}
super;
	}


}