package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_immo_sboss_argekhunte extends ai_immo_sboss_basic {
	protected String type = "duo_boss_melee";
	protected double Aggressive_Time = 3.000000;
	protected double ATTACKED_Weight_Point = 0.000000;
	protected int Party_Type = 1;
	protected int Skill_sbossdef = 388562945;
	protected int Skill_Invin = 355008513;
	protected int TM_Invincibility = 78008;
	protected int TIME_Invincibility = 60;
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
	protected String mark_maker_01 = "rumwarsha14_1424_a_sb1m1";
	protected String mark_maker_02 = "rumwarsha14_1424_a_sb2m1";
	protected String mark_maker_03 = "rumwarsha14_1424_a_sb3m1";
	protected String mark_maker_04 = "rumwarsha14_1424_a_sb4m1";
	protected int babble_mode = 0;

	protected void CREATED() {
myself.i_quest1 = 0;
myself.i_quest2 = myself.sm.param1;
if (babble_mode == 1) {
myself.Shout("방번호:" + gg.IntToStr(myself.sm.param1));

}
myself.Shout(gg.MakeFString(1800238, "", "", "", "", ""));
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam h0, HandlerParam i0) {
if (timer_id == TM_ATTACK_COOLDOWN) {
if (myself.IsMyBossAlive() == 0) {
if (babble_mode == 1) {
myself.Shout("아르제쿤테 디스폰!");

}
myself.Suicide();
return;

}
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
if (i0 <= Skillchance_Dim && h0.creature.is_pc != 0 && myself.IsInCategory(88, h0.creature.occupation) == 1 || myself.IsInCategory(91, h0.creature.occupation) == 1 || myself.IsInCategory(93, h0.creature.occupation) == 1) {
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
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (i0 <= Skillchance_Low) {
if (h0.creature.is_pc != 0 && myself.IsInCategory(89, h0.creature.occupation) == 1 || myself.IsInCategory(86, h0.creature.occupation) == 1 || myself.IsInCategory(87, h0.creature.occupation) == 1) {
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
myself.AddUseSkillDesire(h0.creature, Skill04_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else if (gg.Skill_IsMagic(Skill02_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
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

} else if (i0 <= Skillchance_High) {
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
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, h0.hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

} else {
myself.AddAttackDesire(h0.creature, 1, h0.hate);

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

} else if (timer_id == TM_Invincibility) {
myself.Shout(gg.MakeFString(7865, "", "", "", "", ""));
myself.Suicide();

}
super;
	}

	protected void DIE_SET(HandlerParam talker) {
if (myself.IsNullCreature(talker) == 0 && talker.alive == 0 && talker.is_pc == 1) {
if (babble_mode == 1) {
myself.Say("사망 이벤트: " + talker.name);

}
if (myself.sm.hp <= myself.sm.max_hp * 0.200000) {
if (gg.Skill_IsMagic(386203649) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("물리차단!");

}

} else if (gg.Skill_IsMagic(386203649) == 1 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
if (babble_mode == 1) {
myself.Say("마법차단!");

}

} else if (myself.Skill_GetConsumeMP(386203649) < myself.sm.mp && myself.Skill_GetConsumeHP(386203649) < myself.sm.hp && myself.Skill_InReuseDelay(386203649) <= 0) {
if (babble_mode == 1) {
myself.Say("스킬" + gg.IntToStr(gg.FloatToInt(FloatToInt / 65536)) + "사용");

}
myself.AddUseSkillDesire(talker, 386203649, 0, 1, Maximum_Hate * UseSkill_BoostValue);

} else if (babble_mode == 1) {
myself.Say("스킬 조건 부족!");

}

}

} else if (babble_mode == 1) {
myself.Say("올바르지 않은 사망 대상");

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam private, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam s0) {
if (script_event_arg1 == 78010062) {
if (script_event_arg2 == 212) {
if (babble_mode == 1) {
myself.Shout("1번 방으로 도망");

}
myself.Shout(gg.MakeFString(1800889, "", "", "", "", ""));
myself.i_quest2 = 212;
myself.InstantTeleport(myself.boss, z2_sb1_x, z2_sb1_y, z2_sb1_z);
myself.InstantTeleport(myself.sm, z2_sb1_x, z2_sb1_y, z2_sb1_z);

} else if (script_event_arg2 == 222) {
if (babble_mode == 1) {
myself.Shout("2번 방으로 도망");

}
myself.Shout(gg.MakeFString(1800889, "", "", "", "", ""));
myself.i_quest2 = 222;
myself.InstantTeleport(myself.boss, z2_sb2_x, z2_sb2_y, z2_sb2_z);
myself.InstantTeleport(myself.sm, z2_sb2_x, z2_sb2_y, z2_sb2_z);

} else if (script_event_arg2 == 232) {
if (babble_mode == 1) {
myself.Shout("3번 방으로 도망");

}
myself.Shout(gg.MakeFString(1800889, "", "", "", "", ""));
myself.i_quest2 = 232;
myself.InstantTeleport(myself.boss, z2_sb3_x, z2_sb3_y, z2_sb3_z);
myself.InstantTeleport(myself.sm, z2_sb3_x, z2_sb3_y, z2_sb3_z);

} else if (script_event_arg2 == 242) {
if (babble_mode == 1) {
myself.Shout("4번 방으로 도망");

}
myself.Shout(gg.MakeFString(1800889, "", "", "", "", ""));
myself.i_quest2 = 242;
myself.InstantTeleport(myself.boss, z2_sb4_x, z2_sb4_y, z2_sb4_z);
myself.InstantTeleport(myself.sm, z2_sb4_x, z2_sb4_y, z2_sb4_z);

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam i0, HandlerParam f0, HandlerParam f1, HandlerParam maker0) {
if (private == myself.boss && private.hp <= private.max_hp * 0.250000 && myself.i_quest1 == 0) {
myself.Shout(gg.MakeFString(1800239, "", "", "", "", ""));
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_AntiParty_atk01)) < 1 && myself.sm.hp <= myself.sm.max_hp * 0.600000) {
if (myself.Skill_GetConsumeMP(Skill_AntiParty_atk01) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, Skill_AntiParty_atk01, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("버프 MP부족!");

}

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_AntiParty_atk01)) < 2 && myself.sm.hp <= myself.sm.max_hp * 0.300000) {
if (myself.Skill_GetConsumeMP(Skill_AntiParty_atk02) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, Skill_AntiParty_atk02, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("버프 MP부족!");

}

}
myself.i_quest1 = 1;

} else if (private == myself.boss && gg.Rand(150) == 0 && myself.i_quest2 != 0) {
i0 = gg.Rand(4);
if (myself.IsNullCreature(private) == 0) {
gg.SendScriptEvent(private, 78010064, i0);

}
switch (i0) {
case 0: {
if (myself.i_quest2 == 212) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_02);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

} else if (myself.i_quest2 == 222) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_03);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

} else if (myself.i_quest2 == 232) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_04);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

} else if (myself.i_quest2 == 242) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_01);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

}
break;

}
case 1: {
if (myself.i_quest2 == 212) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_03);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

} else if (myself.i_quest2 == 222) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_04);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

} else if (myself.i_quest2 == 232) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_01);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

} else if (myself.i_quest2 == 242) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_02);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

}
break;

}
case 2: {
if (myself.i_quest2 == 212) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_04);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

} else if (myself.i_quest2 == 222) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_03);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

} else if (myself.i_quest2 == 232) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_02);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

} else if (myself.i_quest2 == 242) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_01);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

}
break;

}
case 3: {
if (myself.i_quest2 == 212) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_03);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

} else if (myself.i_quest2 == 222) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_04);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

} else if (myself.i_quest2 == 232) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_01);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

} else if (myself.i_quest2 == 242) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), mark_maker_02);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010061, myself.sm.id, 0);

}

}
break;

}

}

}
super;
	}

	protected void PARTY_DIED(HandlerParam private, HandlerParam attacker, HandlerParam f0, HandlerParam f1) {
if (private == myself.boss) {
if (babble_mode == 1) {
myself.Shout("동료 사망 - 무적 시작");

}
myself.Shout(gg.MakeFString(7164, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, Skill_Invin, 1, 1, Maximum_Hate);
myself.AddTimerEx(TM_Invincibility, TIME_Invincibility * 1000);
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_AntiParty_atk01)) < 1 && myself.sm.hp <= myself.sm.max_hp * 0.600000) {
if (myself.Skill_GetConsumeMP(Skill_AntiParty_atk01) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, Skill_AntiParty_atk01, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("버프 MP부족!");

}

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_AntiParty_atk01)) < 2 && myself.sm.hp <= myself.sm.max_hp * 0.300000) {
if (myself.Skill_GetConsumeMP(Skill_AntiParty_atk02) < myself.sm.mp) {
myself.AddUseSkillDesire(myself.sm, Skill_AntiParty_atk02, 1, 1, Maximum_Hate);

} else if (babble_mode == 1) {
myself.Say("버프 MP부족!");

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = Maximum_Hate * f0 + 1;

}
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * PARTY_ATTACKED_Weight_Point + Attack_BoostValue), 0, 1, 1);

} else {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = Maximum_Hate * f0 + 1;

}
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * PARTY_ATTACKED_Weight_Point), 0, 1, 1);

}

}
if (myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.master.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.master.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.master.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = Maximum_Hate * f0 + 1;

}
myself.AddHateInfo(attacker.master, gg.FloatToInt(f0 * PARTY_ATTACKED_Weight_Point), 0, 1, 1);

}

}
	}


}