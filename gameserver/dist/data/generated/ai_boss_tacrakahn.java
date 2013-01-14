package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss_tacrakahn extends combat_monster {
	protected int Dispel_Debuff = 1;
	protected int TOTEM_TIMER = 3334;
	protected int CHECK_TIMER = 3112;
	protected int TIME_EXPIRED_TIMER = 3113;
	protected int HURRY_UP_TIMER = 3114;
	protected int ROAR_TIMER = 3115;
	protected int BUFF_TIMER = 3116;
	protected int PRIVATE_SPAWN_TIMER = 3117;
	protected String private_spawn_maker = "";
	protected int Skill01_ID = 418054145;
	protected int Skill01_Probability = 20;
	protected int Skill01_Target_Type = 0;
	protected int Skill02_ID = 417988609;
	protected int Skill02_Probability = 20;
	protected int Skill02_Target_Type = 1;
	protected int SpecialSkill01_ID = 418119681;
	protected int SpecialSkill02_ID = 418185218;
	protected int CurseOfTacrakhan = 435814401;
	protected int PowerUpSkill01_ID = 417595393;
	protected int PowerUpSkill02_ID = 417595394;
	protected int PowerUpSkill03_ID = 417595395;
	protected int PowerUpSkill04_ID = 417595396;
	protected int PowerUpSkill05_ID = 417595397;
	protected int PowerUpSkill06_ID = 417595398;
	protected int PowerUpSkill07_ID = 417595399;
	protected int PowerUpSkill08_ID = 417595400;
	protected int PowerUpSkill09_ID = 417595401;
	protected int PowerUpSkill10_ID = 417595402;
	protected String private_spawn_maker = "kadif02_1423_raidm2";
	protected int max_desire = 10000000;
	protected int Totem_Count = 5;
	protected int TotemSkill = 417464321;

	protected void CREATED() {
myself.c_ai0 = gg.GetNullCreature();
myself.AddTimerEx(CHECK_TIMER, 5 * 1000);
myself.CreateOnePrivateEx(1018845, "ai_a_seed_boss_helper", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, gg.GetIndexFromCreature(myself.sm));
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam party0) {
if (myself.sm.param1 == 0) {
party0 = gg.GetParty(speller);
if (myself.IsNullParty(party0) == 0) {

} else {
if (myself.i_quest9) {
myself.Say(speller.name + " 은 파티가 아닌 PC라 소외!");

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 20091021, gg.GetIndexFromCreature(speller));
return;

}

}

} else if (myself.sm.param1 != 0) {
party0 = gg.GetParty(speller);
if (myself.IsNullParty(party0) == 0) {
if (myself.sm.param1 == party0.id) {

} else {
if (myself.i_quest9) {
myself.Say(speller.name + " 은 선점한 파티원이 아닌 개인이므로 소외!!");

}
gg.SendScriptEvent(myself.c_ai0, 20091021, gg.GetIndexFromCreature(speller));
return;

}

} else {
if (myself.i_quest9) {
myself.Say(speller.name + " 은 선점한 파티원이 아니라 소외!!");

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 20091021, gg.GetIndexFromCreature(speller));
return;

}

}

}
	}

	protected void NO_DESIRE() {
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 0) {
myself.Whisper(creature, "myself.i_ai0 : " + myself.i_ai0 + " ");
myself.Whisper(creature, "myself.i_ai1 : " + myself.i_ai1 + " ");
myself.Whisper(creature, "myself.i_ai2 : " + myself.i_ai2 + " ");

} else if (reply == 1) {
myself.AddTimerEx(TIME_EXPIRED_TIMER, 1 * 1000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam party0, HandlerParam damage, HandlerParam i10, HandlerParam skill_name_id) {
if (myself.sm.param1 == 0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
myself.AddTimerEx(TOTEM_TIMER, 10 * 1000);
myself.AddTimerEx(HURRY_UP_TIMER, 9 * 60 * 1000);
myself.AddTimerEx(BUFF_TIMER, 100 * 1000);
myself.AddTimerEx(PRIVATE_SPAWN_TIMER, 30 * 1000);
myself.i_ai0 = 1;
myself.sm.param1 = party0.id;
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801126, "", "", "", "", ""));
myself.AddAttackDesire(attacker, 1, damage);

} else {
if (myself.i_quest9) {
myself.Say("파티 아닌 놈이 때렸다");

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 20091021, gg.GetIndexFromCreature(attacker));
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
gg.SendScriptEvent(myself.c_ai0, 20091021, gg.GetIndexFromCreature(attacker));
return;

}

} else {
if (myself.i_quest9) {
myself.Say("다른 파티놈이 날 때렸다.");

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 20091021, gg.GetIndexFromCreature(attacker));
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
if (skill_name_id == TotemSkill) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801127, "", "", "", "", ""));

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam i2, HandlerParam i0, HandlerParam i1) {
if (timer_id == TOTEM_TIMER) {
if (myself.i_ai0 == 1 && myself.sm.alive == 1 && myself.sm.param1 != 0) {
maker0 = gg.GetNpcMaker(private_spawn_maker);
if (gg.IsNull(maker0) == 0) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801128, "", "", "", "", ""));
gg.SendMakerScriptEvent(maker0, 5, gg.GetIndexFromCreature(myself.sm), Totem_Count);

}

}
myself.AddTimerEx(TOTEM_TIMER, 60 * 1000);

} else if (timer_id == CHECK_TIMER) {
if (myself.sm.param1 != 0) {
if (myself.InMyTerritory(myself.sm) == 0) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801129, "", "", "", "", ""));
myself.AddTimerEx(TIME_EXPIRED_TIMER, 5 * 1000);

}

}
myself.AddTimerEx(CHECK_TIMER, 5 * 1000);

} else if (timer_id == HURRY_UP_TIMER) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801129, "", "", "", "", ""));
myself.AddTimerEx(TIME_EXPIRED_TIMER, 60 * 1000);

} else if (timer_id == TIME_EXPIRED_TIMER) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801130, "", "", "", "", ""));
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 20091019, 0, 0);

}

} else if (timer_id == ROAR_TIMER) {
myself.AddUseSkillDesire(myself.sm, SpecialSkill01_ID, 0, 1, max_desire);
myself.AddTimerEx(ROAR_TIMER, 40 * 1000);

} else if (timer_id == BUFF_TIMER) {
if (myself.i_ai1 == 1) {
myself.AddUseSkillDesire(myself.sm, PowerUpSkill01_ID, 0, 1, max_desire * max_desire);

} else if (myself.i_ai1 == 2) {
myself.AddUseSkillDesire(myself.sm, PowerUpSkill02_ID, 0, 1, max_desire * max_desire);

} else if (myself.i_ai1 == 3) {
myself.AddUseSkillDesire(myself.sm, PowerUpSkill03_ID, 0, 1, max_desire * max_desire);

} else if (myself.i_ai1 == 4) {
myself.AddUseSkillDesire(myself.sm, PowerUpSkill04_ID, 0, 1, max_desire * max_desire);

} else if (myself.i_ai1 == 5) {
myself.AddUseSkillDesire(myself.sm, PowerUpSkill05_ID, 0, 1, max_desire * max_desire);

} else if (myself.i_ai1 == 6) {
myself.AddUseSkillDesire(myself.sm, PowerUpSkill06_ID, 0, 1, max_desire * max_desire);

} else if (myself.i_ai1 == 7) {
myself.AddUseSkillDesire(myself.sm, PowerUpSkill07_ID, 0, 1, max_desire * max_desire);

} else if (myself.i_ai1 == 8) {
myself.AddUseSkillDesire(myself.sm, PowerUpSkill08_ID, 0, 1, max_desire * max_desire);

} else if (myself.i_ai1 == 9) {
myself.AddUseSkillDesire(myself.sm, PowerUpSkill09_ID, 0, 1, max_desire * max_desire);

} else if (myself.i_ai1 == 10) {
myself.AddUseSkillDesire(myself.sm, PowerUpSkill10_ID, 0, 1, max_desire * max_desire);

}
if (myself.i_ai1 < 10) {
myself.i_ai1 = myself.i_ai1 + 1;

}
myself.AddTimerEx(BUFF_TIMER, 100 * 1000);

} else if (timer_id == PRIVATE_SPAWN_TIMER) {
if (myself.sm.alive == 1) {
i1 = gg.Rand(3);
switch (i1) {
case 0: {
myself.CreateOnePrivateEx(1022747, "brakian", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 1: {
myself.CreateOnePrivateEx(1022748, "groykhan", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(1022749, "traikhan", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}

}

}
myself.AddTimerEx(PRIVATE_SPAWN_TIMER, 30 * 1000);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 20091017) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);

}
	}


}