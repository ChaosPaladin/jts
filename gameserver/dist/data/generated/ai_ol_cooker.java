package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ol_cooker extends warrior_basic {
	protected int mobile_type = 1;
	protected int SuperPointMethod = 0;
	protected int SuperPointDesire = 50;
	protected String SuperPointName = "";
	protected int Skill01_ID = 414842881;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.CreateOnePrivateEx(1022779, "ai_ol_cooker_guard", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z) + 100, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1022779, "ai_ol_cooker_guard", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z) + 100, 0, 0, 0, 0);
if (myself.IsNullString(SuperPointName) != 1) {
if (mobile_type == 1) {
myself.i_ai0 = 1;
myself.ChangeMoveType(0);
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMethod, SuperPointDesire);

}

} else {
myself.i_ai0 = 0;

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply, HandlerParam s0) {
if (reply == 1) {
switch (myself.i_ai0) {
case 0: {
s0 = "[0] 기본";
break;

}
case 1: {
s0 = "[1] 이동 중";
break;

}
case 2: {
s0 = "[2] 밥놓고 있는 중";
break;

}
case 3: {
s0 = "[3] HP+ 스킬 사용";
break;

}
case 4: {
s0 = "[4] 공격상태";
break;

}

}
myself.Whisper(creature, "status " + s0);

}
	}

	protected void NO_DESIRE() {
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 2119019) {
myself.i_ai1 = 1;
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (myself.p_state != 3) {

}

}

}
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam s0) {
myself.BroadcastScriptEvent(2219017, 0, 300);
myself.AddTimerEx(2219002, 2000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2219001) {
myself.ChangeMoveType(0);
if (myself.p_state != 3) {

}

}
if (timer_id == 2219002) {
if (myself.i_ai1 == 1) {
if (gg.Rand(2) < 1) {
myself.Say(gg.MakeFString(1801116, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1801117, "", "", "", "", ""));

}
myself.i_ai0 = 2;
myself.AddTimerEx(2219001, 6000);
myself.i_ai1 = 0;

} else {
myself.i_ai0 = 1;
myself.AddTimerEx(2219001, 100);

}

}
if (timer_id == 2019003) {
if (myself.c_ai0.alive && myself.p_state == 3 || myself.p_state == 10 && myself.i_ai5 == 1) {
myself.AddUseSkillDesire(myself.c_ai0, Skill01_ID, 0, 1, 10000);

} else {
myself.i_ai0 = 1;
myself.i_ai2 = 0;
myself.ChangeMoveType(0);

}

}
if (timer_id == 2019004) {
myself.i_ai5 = 0;
myself.AddUseSkillDesire(myself.sm, 435552257, 1, 0, 9999999999);
if (myself.IsNullCreature(myself.c_ai0) != 1) {
myself.AddAttackDesire(myself.c_ai0, 1, 5000);

}

}
if (timer_id == 2019005) {
myself.i_ai6 = 1;

}
if (timer_id == 2019006) {
myself.AddUseSkillDesire(myself.sm, 435486721, 1, 0, 90000000);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == Skill01_ID) {
if (myself.c_ai0.alive && myself.p_state == 3 || myself.p_state == 10 && myself.i_ai5 == 1) {
myself.AddUseSkillDesire(myself.c_ai0, Skill01_ID, 0, 1, 10000000);

}

}
if (target.alive == 0 && target.is_pc == 0) {
myself.RemoveAttackDesire(myself.top_desire_target.id);
myself.c_ai0 = gg.GetNullCreature();
myself.i_ai0 = 1;
myself.i_ai2 = 0;
myself.i_ai5 = 0;

}
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.i_ai2 == 0) {
if (myself.i_ai5 == 0) {
myself.AddTimerEx(2019004, 3 * 60 * 1000);
myself.AddTimerEx(2019005, 60 * 1000);
myself.i_ai5 = 1;
myself.i_ai0 = 4;

}
myself.c_ai0 = attacker;
myself.AddTimerEx(2019003, 1000);
myself.AddTimerEx(2019006, 60 * 1000);
myself.i_ai2 = 1;

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker) {
if (myself.i_ai2 == 0) {
if (myself.i_ai5 == 0) {
myself.AddTimerEx(2019004, 3 * 60 * 1000);
myself.AddTimerEx(2019005, 60 * 1000);
myself.i_ai5 = 1;
myself.i_ai0 = 4;

}
myself.c_ai0 = attacker;
myself.AddTimerEx(2019003, 1000);
myself.AddTimerEx(2019006, 60 * 1000);
myself.i_ai2 = 1;

}
super;
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam i0) {
if (myself.i_ai6 != 1) {
if (gg.Rand(10) < 2) {
myself.DropItem1(myself.sm, 15492, 1);

}

}
if (gg.HaveMemo(last_attacker, 252) == 1 && gg.GetMemoState(last_attacker, 252) == 1 && gg.OwnItemCount(last_attacker, 15501) <= 4) {
i0 = gg.Rand(1000);
if (i0 < 360) {
myself.GiveItem1(last_attacker, 15501, 1);
myself.SoundEffect(last_attacker, "ItemSound.quest_itemget");
if (gg.OwnItemCount(last_attacker, 15501) == 4) {
if (gg.OwnItemCount(last_attacker, 15500) >= 10) {
myself.SetFlagJournal(last_attacker, 252, 2);
myself.ShowQuestMark(last_attacker, 252);
myself.SoundEffect(last_attacker, "ItemSound.quest_middle");

}

}

}

}
if (gg.HaveMemo(last_attacker, 289) == 1 && gg.GetMemoState(last_attacker, 289) == 1) {
i0 = gg.Rand(1000);
if (i0 < 853) {
myself.GiveItem1(last_attacker, 15712, 1);
myself.SoundEffect(last_attacker, "ItemSound.quest_itemget");

}

}
if (gg.HaveMemo(last_attacker, 461) == 1 && gg.GetMemoState(last_attacker, 461) == 1 && gg.OwnItemCount(last_attacker, 15503) <= 4) {
i0 = gg.Rand(1000);
if (i0 < 782) {
myself.GiveItem1(last_attacker, 15503, 1);
myself.SoundEffect(last_attacker, "ItemSound.quest_itemget");
if (gg.OwnItemCount(last_attacker, 15503) == 4) {
if (gg.OwnItemCount(last_attacker, 16382) >= 10) {
myself.SetFlagJournal(last_attacker, 461, 2);
myself.ShowQuestMark(last_attacker, 461);
myself.SoundEffect(last_attacker, "ItemSound.quest_middle");

}

}

}

}
	}


}