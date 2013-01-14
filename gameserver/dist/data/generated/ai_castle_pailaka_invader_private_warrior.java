package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_castle_pailaka_invader_private_warrior extends ai_castle_pailaka_invader_warrior {
	protected void CREATED() {
myself.i_ai0 = 0;
myself.AddTimerEx(1312, 3 * 1000);
myself.AddTimerEx(1401, 9 * 1000);
myself.AddTimerEx(1601, 10 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 1312) {
if (myself.i_ai0 == 0) {
myself.AddTimerEx(1313, 3 * 1000);

}

} else if (timer_id == 1313) {
if (myself.i_ai0 == 0) {
myself.AddTimerEx(1314, 3 * 1000);

}

} else if (timer_id == 1314) {
if (myself.i_ai0 == 0) {
if (String_Num1 > 0) {
myself.Say(gg.MakeFString(String_Num1, "", "", "", "", ""));

}
myself.AddMoveToDesire(Pos_X, Pos_Y, Pos_Z, 10);

}

} else if (timer_id == 1401) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 10000000);

}
myself.AddTimerEx(1401, 30 * 1000);

} else if (timer_id == 1601) {
myself.BroadcastScriptEvent(2117006, gg.GetIndexFromCreature(myself.sm), 2000);
myself.AddTimerEx(1601, 10 * 1000);

}
	}

	protected void MY_DYING() {
	}


}