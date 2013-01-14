package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss_torumba extends default_npc {
	protected int Dispel_Debuff = 1;
	protected int SpecialSkill01_ID = 419627009;
	protected int SpecialSkill02_ID = 419692545;
	protected int SpecialSkill03_ID = 419758081;
	protected int SpecialSkill04_ID = 458752001;
	protected int max_desire = 10000000;
	protected int TARGET_CHECK_TIMER = 1111;
	protected int TIME_EXPIRED_TIMER = 1112;
	protected int HURRY_UP_TIMER = 1113;
	protected int SWING_SKILL_TIMER = 1114;
	protected int BULLET_SKILL_TIMER = 1115;
	protected int TRR_CHECK_TIMER = 1116;
	protected int bomona_x = -174654;
	protected int bomona_y = 184277;
	protected int bomona_z = -15408;
	protected String my_maker = "";

	protected void CREATED() {
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.CreateOnePrivateEx(1018845, "boss_torumba_helper", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, gg.GetIndexFromCreature(myself.sm));
myself.CreateOnePrivateEx(1032739, "ai_bomona", 0, 0, bomona_x, bomona_y, bomona_z, 0, 0, 0, 0);
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest9 = 0;
myself.AddTimerEx(TRR_CHECK_TIMER, 5 * 1000);
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam party0) {
if (speller.transformID != 126) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 20091020, gg.GetIndexFromCreature(speller));
return;

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id, HandlerParam party0, HandlerParam c0, HandlerParam h0) {
if (attacker.transformID != 126) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 20091020, gg.GetIndexFromCreature(attacker));
return;

}

}
if (myself.sm.param1 == 0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
myself.AddTimerEx(HURRY_UP_TIMER, 9 * 60 * 1000);
myself.AddTimerEx(SWING_SKILL_TIMER, 10 * 1000);
myself.AddTimerEx(TARGET_CHECK_TIMER, 7 * 1000);
myself.sm.param1 = party0.id;
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801131, "", "", "", "", ""));
myself.i_ai3 = myself.GetCurrentTick();
myself.c_ai1 = attacker;

} else {
if (myself.i_quest9) {
myself.Say("비선점 노파티 인원의 공격 -> 소외!");

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 20091020, gg.GetIndexFromCreature(attacker));
return;

}

}

} else if (myself.sm.param1 != 0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
if (myself.sm.param1 == party0.id) {

} else {
if (myself.i_quest9) {
myself.Say("선점중 다른 파티원의 공격 -> 소외!");

}
gg.SendScriptEvent(myself.c_ai0, 20091020, gg.GetIndexFromCreature(attacker));
return;

}

} else {
if (myself.i_quest9) {
myself.Say("선점중, 노파티 인원의 공격 -> 소외!");

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 20091021, gg.GetIndexFromCreature(attacker));
return;

}

}

}
if (skill_name_id == 63438849) {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(attacker, 1, 100);
if (myself.GetCurrentTick() - myself.i_ai3 < 8) {
myself.i_ai2 = myself.i_ai2 + 1;
if (myself.i_quest9) {
myself.Shout("중첩 횟수 : " + myself.i_ai2 + "");

}
if (myself.i_ai2 == 10) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801132, "", "", "", "", ""));
myself.ChangeNPCState(myself.sm, 1);

} else if (myself.i_ai2 == 20) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801133, "", "", "", "", ""));
myself.ChangeNPCState(myself.sm, 2);

} else if (myself.i_ai2 == 30) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801134, "", "", "", "", ""));
myself.ChangeNPCState(myself.sm, 3);

} else if (myself.i_ai2 == 40) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801135, "", "", "", "", ""));
myself.ChangeNPCState(myself.sm, 4);

} else if (myself.i_ai2 == 50) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801136, "", "", "", "", ""));
myself.ChangeNPCState(myself.sm, 5);

} else if (myself.i_ai2 == 60) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801137, "", "", "", "", ""));
myself.ChangeNPCState(myself.sm, 6);

} else if (myself.i_ai2 == 70) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801138, "", "", "", "", ""));
myself.ChangeNPCState(myself.sm, 7);

} else if (myself.i_ai2 == 80) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801139, "", "", "", "", ""));
myself.ChangeNPCState(myself.sm, 8);

} else if (myself.i_ai2 == 90) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801140, "", "", "", "", ""));
myself.ChangeNPCState(myself.sm, 9);

} else if (myself.i_ai2 == 100) {
myself.Suicide();
myself.ChangeNPCState(myself.sm, 10);

}

} else {
myself.i_ai2 = 1;
if (myself.i_quest9) {
myself.Shout("시간 초과 -> 중첩 횟수 1로 초기화!");

}
myself.ChangeNPCState(myself.sm, 0);

}
myself.i_ai3 = myself.GetCurrentTick();

} else {
myself.AddAttackDesire(attacker, 1, 1);

}
	}

	protected void SPELL_SUCCESSED(HandlerParam skill_name_id, HandlerParam target) {
if (skill_name_id == 419692545 || skill_name_id == 419627009) {
gg.SendScriptEvent(myself.c_ai0, 20091018, gg.GetIndexFromCreature(target));

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 20091017) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == HURRY_UP_TIMER) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801141, "", "", "", "", ""));
myself.AddTimerEx(TIME_EXPIRED_TIMER, 60 * 1000);

} else if (timer_id == TIME_EXPIRED_TIMER) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801142, "", "", "", "", ""));
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 20091019, gg.GetIndexFromCreature(myself.sm), 0);

}

} else if (timer_id == SWING_SKILL_TIMER) {
myself.AddUseSkillDesire(myself.sm, SpecialSkill02_ID, 0, 1, max_desire);
myself.AddTimerEx(SWING_SKILL_TIMER, 7 * 1000);

} else if (timer_id == TARGET_CHECK_TIMER) {
if (myself.c_ai1 == myself.top_desire_target) {
myself.AddUseSkillDesire(myself.top_desire_target, SpecialSkill01_ID, 0, 1, max_desire);

}
myself.c_ai1 = myself.top_desire_target;
myself.AddTimerEx(TARGET_CHECK_TIMER, 6 * 1000);

} else if (timer_id == TRR_CHECK_TIMER) {
if (myself.sm.param1 != 0) {
if (myself.InMyTerritory(myself.sm) == 0) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 7, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801143, "", "", "", "", ""));
myself.AddTimerEx(TIME_EXPIRED_TIMER, 4 * 1000);

}

}
myself.AddTimerEx(TRR_CHECK_TIMER, 5 * 1000);

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 0) {
myself.AddUseSkillDesire(myself.sm, SpecialSkill02_ID, 0, 1, max_desire);

} else if (reply == 1) {
myself.AddUseSkillDesire(creature, SpecialSkill01_ID, 0, 1, max_desire);

} else if (reply == 2) {
myself.AddTimerEx(TIME_EXPIRED_TIMER, 1 * 1000);

}
	}


}