package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_castle_pailaka_invader_boss extends ai_castle_pailaka_invader_warrior {
	protected int is_restrict_npc = 0;
	protected int is_last_invader = 0;
	protected int Spawn_String_Num = -1;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.AddTimerEx(1514, 10 * 1000);
myself.AddTimerEx(1212, 5 * 1000);
myself.AddTimerEx(1401, 25 * 1000);
myself.AddTimerEx(1601, 10 * 1000);
if (String_Num1 > 0) {
myself.Say(gg.MakeFString(String_Num1, "", "", "", "", ""));

}
if (Spawn_String_Num > 0) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(Spawn_String_Num, "", "", "", "", ""));

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam maker0) {
if (timer_id == 1212) {
myself.AddTimerEx(1213, 3 * 1000);

} else if (timer_id == 1213) {
if (myself.i_ai0 == 0) {
myself.AddTimerEx(1214, 10 * 1000);

}

} else if (timer_id == 1214) {
if (myself.i_ai0 == 0) {
myself.AddTimerEx(1215, 10 * 1000);

}

} else if (timer_id == 1215) {
if (myself.i_ai0 == 0) {
myself.AddTimerEx(1216, 3 * 1000);

}

} else if (timer_id == 1216) {
if (myself.i_ai0 == 0) {
if (String_Num2 > 0) {
myself.Say(gg.MakeFString(String_Num2, "", "", "", "", ""));

}
myself.AddMoveToDesire(Pos_X, Pos_Y, Pos_Z, 10);
myself.i_ai0 = 1;

}

} else if (timer_id == 1401) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 10000000);

}
myself.AddTimerEx(1401, 30 * 1000);

} else if (timer_id == 1601) {
myself.BroadcastScriptEvent(2117006, gg.GetIndexFromCreature(myself.sm), 2000);
myself.AddTimerEx(1601, 10 * 1000);

} else if (timer_id == 1514) {
if (is_restrict_npc == 1) {
if (myself.i_ai1 == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
myself.i_ai1 = 1;
myself.InstantZone_MarkRestriction();

} else {
myself.AddTimerEx(1514, 10 * 1000);

}

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
super;
if (script_event_arg1 == 2117010) {
if (myself.i_ai3 == 1) {
myself.InstantZone_Finish(5);

} else {
myself.i_ai3 = 1;

}

}
	}

	protected void MY_DYING() {
if (is_restrict_npc == 1) {
myself.InstantZone_MarkRestriction();

}
if (String_Num3 > 0) {
myself.Say(gg.MakeFString(String_Num3, "", "", "", "", ""));

}
myself.BroadcastScriptEvent(2117008, 0, 3000);
if (is_last_invader == 1) {
myself.BroadcastScriptEvent(2117010, 0, 3000);

}
	}


}