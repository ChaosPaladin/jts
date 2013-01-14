package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss_dopagen extends combat_monster {
	protected int Dispel_Debuff = 1;
	protected int CHECK_TIMER = 1111;
	protected int TOTEM_TIMER = 1112;
	protected int TIME_EXPIRED_TIMER = 1113;
	protected int HURRY_UP_TIMER = 1114;
	protected int Skill01_ID = 418775041;
	protected int Skill01_Probability = 15;
	protected int Skill01_Target_Type = 0;
	protected int Skill02_ID = 418840577;
	protected int Skill02_Probability = 20;
	protected int Skill02_Target_Type = 1;
	protected int SpecialSkill01_ID = 418906113;
	protected int SpecialSkill02_ID = 417857537;
	protected int SpecialBuff01_ID = 417923073;
	protected int SpecialBuff02_ID = 417923074;
	protected int SpecialBuff03_ID = 417923075;
	protected int SpecialBuff04_ID = 417923076;
	protected int SpecialBuff05_ID = 417923077;
	protected int SpecialBuff06_ID = 417923078;
	protected int SpecialBuff07_ID = 417923079;
	protected int SpecialBuff08_ID = 417923080;
	protected int SpecialBuff09_ID = 417923081;
	protected int SpecialBuff10_ID = 417923082;
	protected int HPMPSKILL01_ID = 417857537;
	protected int HPMPSKILL02_ID = 417857538;
	protected int HPMPSKILL03_ID = 417857539;
	protected int HPMPSKILL04_ID = 417857540;
	protected int HPMPSKILL05_ID = 417857541;
	protected int HPMPSKILL06_ID = 417857542;
	protected int HPMPSKILL07_ID = 417857543;
	protected int HPMPSKILL08_ID = 417857544;
	protected int HPMPSKILL09_ID = 417857545;
	protected int max_desire = 10000000;
	protected int CurseOfDopagen = 435879937;
	protected String totem_spawn_maker = "kadif02_1323_raid2m1";
	protected int TotemSkill = 417660929;

	protected void CREATED() {
myself.c_ai0 = gg.GetNullCreature();
myself.i_ai1 = 0;
myself.AddTimerEx(CHECK_TIMER, 5 * 1000);
myself.CreateOnePrivateEx(1018845, "ai_a_seed_boss_helper", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z + 10), 0, 0, 0, gg.GetIndexFromCreature(myself.sm));
myself.i_quest9 = 0;
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam party0) {
if (myself.sm.param1 == 0) {
party0 = gg.GetParty(speller);
if (myself.IsNullParty(party0) == 0) {

} else {
if (myself.i_quest9) {
myself.Say("파티 아닌 놈이 때림 -> 저주");

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 20091022, gg.GetIndexFromCreature(speller));
return;

}

}

} else if (myself.sm.param1 != 0) {
party0 = gg.GetParty(speller);
if (myself.IsNullParty(party0) == 0) {
if (myself.sm.param1 == party0.id) {

} else {
if (myself.i_quest9) {
myself.Say("다른 파티 놈이 때림 -> 저주");

}
gg.SendScriptEvent(myself.c_ai0, 20091022, gg.GetIndexFromCreature(speller));
return;

}

} else {
if (myself.i_quest9) {
myself.Say("다른 파티놈이 때림 ->  저주");

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 20091022, gg.GetIndexFromCreature(speller));
return;

}

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam party0, HandlerParam damage, HandlerParam i10, HandlerParam maker0) {
if (myself.sm.param1 == 0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
myself.AddTimerEx(TOTEM_TIMER, 10 * 1000);
myself.AddTimerEx(HURRY_UP_TIMER, 9 * 60 * 1000);
myself.sm.param1 = party0.id;
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801144, "", "", "", "", ""));
maker0 = gg.GetNpcMaker(totem_spawn_maker);
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, damage);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else {
if (myself.i_quest9) {
myself.Say("파티 아닌 놈이 때렸다");

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 20091022, gg.GetIndexFromCreature(attacker));
return;

}

}

} else if (myself.sm.param1 != 0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
if (myself.sm.param1 == party0.id) {

} else {
if (myself.i_quest9) {
myself.Say("점령되지 않은 파티원이 날 때렸다.");

}
gg.SendScriptEvent(myself.c_ai0, 20091022, gg.GetIndexFromCreature(attacker));
return;

}

} else {
if (myself.i_quest9) {
myself.Say("다른 파티놈이 날 때렸다.");

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 20091022, gg.GetIndexFromCreature(attacker));
return;

}

}
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;

}
myself.UseSoulShot(SoulShot);
if (attacker.is_pc == 1) {
myself.AddHateInfo(attacker, gg.FloatToInt(damage * 1) + 1, 0, 1, 1);

} else if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 1) {
if (attacker.master.alive == 1) {
myself.AddHateInfo(attacker.master, gg.FloatToInt(damage * 0.500000) + 1, 0, 1, 1);
myself.AddHateInfo(attacker, gg.FloatToInt(damage * 1) + 1, 0, 1, 1);
i10 = myself.GetHateInfoCount();

} else if (attacker.master.alive == 0) {
myself.AddAttackDesire(attacker, 1, 100);

}

}
if (myself.DistFromMe(attacker) < 250) {
if (myself.IsInCategory(70, attacker.occupation) == 1 || myself.IsInCategory(2, attacker.occupation) == 1) {
if (gg.Rand(100) < 5) {
myself.AddUseSkillDesire(attacker, SpecialSkill02_ID, 0, 1, max_desire * max_desire);

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == TOTEM_TIMER) {
maker0 = gg.GetNpcMaker(totem_spawn_maker);
if (gg.IsNull(maker0) == 0) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801145, "", "", "", "", ""));
gg.SendMakerScriptEvent(maker0, 1001, gg.GetIndexFromCreature(myself.sm), 0);

}

} else if (timer_id == CHECK_TIMER) {
if (myself.sm.param1 != 0) {
if (myself.InMyTerritory(myself.sm) == 0) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801146, "", "", "", "", ""));
myself.AddTimerEx(TIME_EXPIRED_TIMER, 60 * 1000);

}

}
myself.BroadcastScriptEvent(8, gg.GetIndexFromCreature(myself.sm), 2000);
myself.AddTimerEx(CHECK_TIMER, 1 * 1000);

} else if (timer_id == HURRY_UP_TIMER) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801147, "", "", "", "", ""));
myself.AddTimerEx(TIME_EXPIRED_TIMER, 60 * 1000);

} else if (timer_id == TIME_EXPIRED_TIMER) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801148, "", "", "", "", ""));
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 20091019, 0, 0);

}
maker0 = gg.GetNpcMaker(totem_spawn_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
super;
	}

	protected void NO_DESIRE() {
	}

	protected void MY_DYING(HandlerParam maker0) {
maker0 = gg.GetNpcMaker(totem_spawn_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 20091017) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);

} else if (script_event_arg1 == 20091024) {
switch (myself.i_ai1) {
case 0: {
myself.AddUseSkillDesire(myself.sm, SpecialBuff01_ID, 0, 1, max_desire * max_desire);
break;

}
case 1: {
myself.AddUseSkillDesire(myself.sm, SpecialBuff02_ID, 0, 1, max_desire * max_desire);
break;

}
case 2: {
myself.AddUseSkillDesire(myself.sm, SpecialBuff03_ID, 0, 1, max_desire * max_desire);
break;

}
case 3: {
myself.AddUseSkillDesire(myself.sm, SpecialBuff04_ID, 0, 1, max_desire * max_desire);
break;

}
case 4: {
myself.AddUseSkillDesire(myself.sm, SpecialBuff05_ID, 0, 1, max_desire * max_desire);
break;

}
case 5: {
myself.AddUseSkillDesire(myself.sm, SpecialBuff06_ID, 0, 1, max_desire * max_desire);
break;

}
case 6: {
myself.AddUseSkillDesire(myself.sm, SpecialBuff07_ID, 0, 1, max_desire * max_desire);
break;

}
case 7: {
myself.AddUseSkillDesire(myself.sm, SpecialBuff08_ID, 0, 1, max_desire * max_desire);
break;

}
case 8: {
myself.AddUseSkillDesire(myself.sm, SpecialBuff09_ID, 0, 1, max_desire * max_desire);
break;

}
case 9: {
myself.AddUseSkillDesire(myself.sm, SpecialBuff10_ID, 0, 1, max_desire * max_desire);
break;

}

}
if (myself.i_ai1 < 9) {
myself.i_ai1 = myself.i_ai1 + 1;

}
if (myself.i_quest9) {
myself.Say("다음에 받은 버프는 " + myself.i_ai1 + " 레벨");

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam h0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam c0, HandlerParam party0) {
if (skill_name_id == SpecialBuff01_ID || skill_name_id == SpecialBuff02_ID || skill_name_id == SpecialBuff03_ID || skill_name_id == SpecialBuff04_ID || skill_name_id == SpecialBuff05_ID || skill_name_id == SpecialBuff06_ID || skill_name_id == SpecialBuff07_ID || skill_name_id == SpecialBuff08_ID || skill_name_id == SpecialBuff09_ID || skill_name_id == SpecialBuff10_ID) {
party0 = gg.GetPartyFromID(myself.sm.param1);
i3 = party0.member_count;
for (i2 = 0; i2 < i3; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (myself.i_quest9) {
myself.Say("" + c0.name + "한테 쏘도록 신호 날림");

}
gg.SendScriptEvent(myself.c_ai0, 20091025, gg.GetIndexFromCreature(c0));

}

}

}
super;
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 2) {
myself.AddTimerEx(TIME_EXPIRED_TIMER, 1 * 1000);

}
super;
	}

	protected void SPELLED(HandlerParam skill_name_id, HandlerParam speller) {
if (skill_name_id = TotemSkill) {
if (myself.i_quest9) {
myself.Say("토템 스킬 맞음");

}

}
super;
	}


}