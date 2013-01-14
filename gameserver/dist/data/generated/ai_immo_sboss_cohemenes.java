package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_immo_sboss_cohemenes extends ai_immo_sboss_basic {
	protected String type = "duo_boss_caster";
	protected int Party_Type = 2;
	protected int Skill_sbossdef = 388628481;
	protected int Skill_sbossdef2 = 388562945;
	protected int my_private = 1025635;
	protected String my_private_class = "sboss_argekhunte";
	protected int TM_DEFENSE_CHANGE = 780009;
	protected int TIME_DEFENSE_CHANGE = 60;
	protected int z2_sb1_x = -178418;
	protected int z2_sb1_y = 211653;
	protected int z2_sb1_z = -12029;
	protected int z2_sb2_x = -178417;
	protected int z2_sb2_y = 206558;
	protected int z2_sb2_z = -12032;
	protected int z2_sb3_x = -180911;
	protected int z2_sb3_y = 206551;
	protected int z2_sb3_z = -12028;
	protected int z2_sb4_x = -180911;
	protected int z2_sb4_y = 211652;
	protected int z2_sb4_z = -12028;
	protected int babble_mode = 0;

	protected void CREATED() {
myself.i_quest2 = 0;
myself.i_quest3 = 0;
myself.i_quest4 = 0;
myself.AddTimerEx(TM_DEFENSE_CHANGE, TIME_DEFENSE_CHANGE * 1000);
myself.Shout(gg.MakeFString(1800233, "", "", "", "", ""));
myself.CreateOnePrivateEx(my_private, my_private_class, 0, 0, gg.FloatToInt(myself.sm.x) + gg.Rand(50) - gg.Rand(50), gg.FloatToInt(myself.sm.y) + gg.Rand(50) - gg.Rand(50), gg.FloatToInt(myself.sm.z), gg.Rand(61440), room, 0, 0);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam h0, HandlerParam i0) {
if (timer_id == TM_ATTACK_COOLDOWN) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
i0 = gg.Rand(100);
if (i0 <= Skillchance_High && myself.DistFromMe(h0.creature) <= 200) {
if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill02_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill02_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill01_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);
if (gg.IsSameString(type, "dot") == 1 || gg.IsSameString(type, "cc") == 1 || gg.IsSameString(type, "con") == 1 || gg.IsSameString(type, "ambush_dc_kamikaze") == 1 || gg.IsSameString(type, "solo_boss_caster") == 1 || gg.IsSameString(type, "duo_boss_caster") == 1 || gg.IsSameString(type, "echmus") == 1) {
if (myself.GetHateInfoCount() != 0 && myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0 || gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) <= 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
if (gg.Skill_IsMagic(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill01_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill01_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, 100 * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else {
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

}
myself.AddTimerEx(TM_ATTACK_COOLDOWN, TIME_ATTACK_COOLDOWN_CASTER + gg.Rand(TIME_ATTACK_COOLDOWN_CASTER) * 1000);

} else {
if (myself.GetHateInfoCount() != 0 && myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
myself.AddAttackDesire(h0.creature, 1, 100);

}

}
myself.AddTimerEx(TM_ATTACK_COOLDOWN, TIME_ATTACK_COOLDOWN_MELEE + gg.Rand(TIME_ATTACK_COOLDOWN_MELEE) * 1000);

}

} else if (timer_id == TM_DEFENSE_CHANGE) {
if (myself.i_quest2 == 1) {
myself.Shout(gg.MakeFString(1800237, "", "", "", "", ""));
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(Skill_sbossdef));
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(Skill_sbossdef2));
myself.CreateOnePrivateEx(my_private, my_private_class, 0, 0, gg.FloatToInt(myself.sm.x) + gg.Rand(50) - gg.Rand(50), gg.FloatToInt(myself.sm.y) + gg.Rand(50) - gg.Rand(50), gg.FloatToInt(myself.sm.z), gg.Rand(61440), room, 0, 0);
myself.i_quest2 = 0;

} else if (myself.i_quest3 > 100 && myself.i_quest3 > myself.i_quest4 * 4) {
myself.Shout(gg.MakeFString(1800254, "", "", "", "", ""));
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(Skill_sbossdef));
myself.AddUseSkillDesire(myself.sm, Skill_sbossdef2, 1, 1, Maximum_Hate);

} else if (myself.i_quest4 > 50 && myself.i_quest4 > myself.i_quest3 * 2) {
myself.Shout(gg.MakeFString(1800255, "", "", "", "", ""));
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(Skill_sbossdef2));
myself.AddUseSkillDesire(myself.sm, Skill_sbossdef, 1, 1, Maximum_Hate);

}
myself.i_quest3 = 0;
myself.i_quest4 = 0;
myself.AddTimerEx(TM_DEFENSE_CHANGE, TIME_DEFENSE_CHANGE * 1000);

}
super;
	}

	protected void DIE_SET(HandlerParam talker) {
if (myself.IsNullCreature(talker) == 0 && talker.alive == 0 && talker.is_pc == 1) {
if (babble_mode == 1) {
myself.Say("사망 이벤트: " + talker.name);

}
if (gg.Skill_IsMagic(Skill03_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill03_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill03_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(talker, Skill03_ID, 0, 1, Maximum_Hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (babble_mode == 1) {
myself.Say("올바르지 않은 사망 대상");

}
	}

	protected void CLAN_DIED(HandlerParam victim) {
if (myself.IsNullCreature(victim) == 0 && victim.npc_class_id != my_private) {
if (babble_mode == 1) {
myself.Say("NPC사망 이벤트: " + victim.name);

}
if (gg.Skill_IsMagic(Skill04_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(Skill04_ID) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(Skill04_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill04_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill04_ID) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(Skill04_ID / 65536)) + "사용");

}
myself.AddUseSkillDesire(victim, Skill04_ID, 0, 1, Maximum_Hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
if (babble_mode == 1) {
myself.Say("아르제쿤테 사망 했음 - 부활 예약");

}
myself.i_quest2 = 1;

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam private, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam s0) {
if (script_event_arg1 == 78010064) {
myself.Shout(gg.MakeFString(1800234, "", "", "", "", ""));
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(Skill_sbossdef));
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(Skill_sbossdef2));

} else if (script_event_arg1 == 78010070) {
myself.Shout(gg.MakeFString(1800235, "", "", "", "", ""));
myself.Despawn();

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam f0, HandlerParam h0, HandlerParam i0, HandlerParam c0, HandlerParam party0) {
if (myself.DistFromMe(attacker) > 200 || gg.Skill_IsMagic(skill_name_id) == 1) {
myself.i_quest4 = myself.i_quest4 + 1;
myself.i_quest3 = myself.i_quest3 - 1;
if (babble_mode == 1) {
myself.Say("원거리 공격 맞음");

}

} else {
myself.i_quest3 = myself.i_quest3 + 1;
myself.i_quest4 = myself.i_quest4 - 1;
if (babble_mode == 1) {
myself.Say("근거리 공격 맞음");

}

}
super;
	}

	protected void MY_DYING(HandlerParam maker0) {
myself.Shout(gg.MakeFString(1800236, "", "", "", "", ""));
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), z2_a_dispatcher_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010071, 0, 0);

}
	}


}