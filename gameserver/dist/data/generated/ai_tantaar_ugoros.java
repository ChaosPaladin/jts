package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_tantaar_ugoros extends wizard_basic {
	protected int Normal_Desire = 1000000;
	protected int Max_Desire = 1000000000000000000;
	protected int AttackRange = 2;
	protected int Skill01_ID = 421134337;
	protected int Skill01_Check_Dist = 0;
	protected int Skill02_Check_Dist = 0;
	protected int MoveArounding = 0;
	protected int TID_HERB_CHECK = 780001;
	protected int TIME_HERB_CHECK = 2;
	protected int TID_VACANCY_CHECK = 780002;
	protected int TIME_VACANCY_CHECK = 5;
	protected int TID_EXILE_DELAY = 780003;
	protected int TIME_EXILE_DELAY = 3;
	protected int GM_UGOROS = 37;
	protected int SID_DEFAULT = 0;
	protected int SID_ENGAGING = 1;
	protected int SID_NO_NEED_KOMODO = 0;
	protected int SID_SEARCHING_KOMODO = 1;
	protected int SID_GOING_KOMODO = 2;
	protected int clearer_mode = 79;
	protected int babble_mode = 0;

	protected void CREATED() {
myself.RegisterGlobalMap(GM_UGOROS, myself.sm.id);
myself.Shout(gg.MakeFString(1801077, "", "", "", "", ""));
gg.SetAsNull(myself.c_ai1);
gg.SetAsNull(myself.c_ai2);
myself.i_ai3 = SID_DEFAULT;
myself.i_ai1 = SID_NO_NEED_KOMODO;
myself.i_ai2 = 0;
myself.i_quest4 = 0;
myself.AddTimerEx(TID_VACANCY_CHECK, TIME_VACANCY_CHECK * 60 * 1000);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id) {
if (myself.IsNullCreature(attacker) == 0) {
myself.c_ai0 = attacker;

}
super;
if (babble_mode) {
myself.Say("state:" + myself.i_ai1);

}
if (myself.i_ai3 == SID_ENGAGING && myself.sm.hp <= myself.sm.max_hp * 0.800000 && myself.i_ai1 == SID_NO_NEED_KOMODO) {
if (babble_mode) {
myself.Say("finding komodo");

}
myself.BroadcastScriptEvent(78010080, myself.sm.id, 5000);
myself.i_ai1 = SID_SEARCHING_KOMODO;
myself.i_ai2 = 0;
gg.SetAsNull(myself.c_ai2);
myself.AddTimerEx(TID_HERB_CHECK, TIME_HERB_CHECK * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
super;
if (babble_mode) {
myself.Say("state:" + myself.i_ai1);

}
if (script_event_arg1 == 78010080 && script_event_arg2 != 0) {
if (myself.i_ai1 == SID_SEARCHING_KOMODO && myself.IsNullCreature(gg.GetCreatureFromID(script_event_arg2)) == 0 && gg.GetCreatureFromID(script_event_arg2) != myself.sm) {
if (myself.i_ai2 == 0 || myself.i_ai2 >= myself.DistFromMe(gg.GetCreatureFromID(script_event_arg2))) {
myself.c_ai2 = gg.GetCreatureFromID(script_event_arg2);
myself.i_ai2 = gg.FloatToInt(myself.DistFromMe(myself.c_ai2));

}

}

} else if (script_event_arg1 == 78010084 && myself.IsNullCreature(gg.GetCreatureFromID(script_event_arg2)) == 0) {
if (babble_mode) {
myself.Say("ugoros engaged");

}
myself.c_ai0 = gg.GetCreatureFromID(script_event_arg2);
if (myself.i_ai3 == SID_DEFAULT) {
myself.Shout(gg.MakeFString(1801078, myself.c_ai0.name, "", "", "", ""));
myself.RegisterGlobalMap(GM_UGOROS, -2);
myself.i_ai3 = SID_ENGAGING;
myself.AddHateInfo(myself.c_ai0, Normal_Desire, 0, 1, 1);
myself.MakeAttackEvent(myself.c_ai0, Normal_Desire, 0);

}

} else if (script_event_arg1 == 78010085) {
if (myself.i_ai1 == SID_GOING_KOMODO) {
myself.Say(gg.MakeFString(1801081, "", "", "", "", ""));
myself.RemoveAttackDesire(myself.c_ai2.id);
myself.i_ai1 = SID_NO_NEED_KOMODO;
myself.i_ai2 = 0;
gg.SetAsNull(myself.c_ai2);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.MakeAttackEvent(myself.c_ai0, Normal_Desire, 0);

}

} else if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (babble_mode) {
myself.Say("komodo attacked");

}
myself.AddHateInfo(myself.c_ai0, Normal_Desire, 0, 1, 1);
myself.MakeAttackEvent(myself.c_ai0, Normal_Desire, 0);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (babble_mode) {
myself.Say("state:" + myself.i_ai1);

}
if (timer_id == TID_HERB_CHECK) {
if (myself.IsNullCreature(myself.c_ai2) == 0 && myself.i_ai2 > 0) {
myself.i_ai1 = SID_GOING_KOMODO;
myself.AddAttackDesire(myself.c_ai2, 1, Max_Desire);
myself.Say(gg.MakeFString(1801079, "", "", "", "", ""));

} else {
myself.i_ai1 = SID_NO_NEED_KOMODO;

}

} else if (timer_id == TID_VACANCY_CHECK) {
myself.AddTimerEx(TID_VACANCY_CHECK, TIME_VACANCY_CHECK * 60 * 1000);
if (myself.GetGlobalMap(GM_UGOROS) == -2 && myself.IsInCombatMode(myself.sm) != 1 && myself.i_ai3 == SID_ENGAGING) {
myself.Shout(gg.MakeFString(1801082, "", "", "", "", ""));
myself.CreateOnePrivateEx(1018919, "ai_ugoros_keeper", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, clearer_mode, 0, 0);
myself.AddTimerEx(TID_EXILE_DELAY, TIME_EXILE_DELAY * 60 * 1000);

} else if (myself.i_ai3 == SID_DEFAULT) {
myself.Shout(gg.MakeFString(1801083, "", "", "", "", ""));

}

} else if (timer_id == TID_EXILE_DELAY) {
myself.RemoveAllDesire();
myself.RegisterGlobalMap(GM_UGOROS, myself.sm.id);
gg.SetAsNull(myself.c_ai1);
myself.i_ai3 = SID_DEFAULT;
myself.i_ai1 = SID_NO_NEED_KOMODO;
myself.i_ai2 = 0;
gg.SetAsNull(myself.c_ai2);

}
super;
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id) {
super;
if (babble_mode) {
myself.Say("state:" + myself.i_ai1);

}
if (skill_name_id == 435683329 && myself.i_ai1 == SID_GOING_KOMODO) {
myself.RemoveAllAttackDesire();
myself.Say(gg.MakeFString(1801080, "", "", "", "", ""));
myself.i_ai1 = SID_NO_NEED_KOMODO;
myself.i_ai2 = 0;
gg.SetAsNull(myself.c_ai2);
if (myself.i_quest4 == 0) {
myself.i_quest4 = 1;

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.MakeAttackEvent(myself.c_ai0, Normal_Desire, 0);

}

}
	}

	protected void NO_DESIRE() {
super;
if (babble_mode) {
myself.Say("state:" + myself.i_ai1);

}
if (myself.IsNullCreature(myself.c_ai0) == 0 && myself.i_ai3 == SID_ENGAGING) {
myself.MakeAttackEvent(myself.c_ai0, Normal_Desire, 0);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id) {
if (babble_mode) {
myself.Say("USE_SKILL_FINISHED:" + skill_name_id / 256 * 256);

}
	}

	protected void MY_DYING(HandlerParam last_attacker) {
super;
myself.Shout(gg.MakeFString(1801084, "", "", "", "", ""));
myself.RegisterGlobalMap(GM_UGOROS, -1);
myself.CreateOnePrivateEx(1032740, "ai_ugoros_keeper", 0, 0, gg.FloatToInt(myself.sm.x) + gg.Rand(300) - gg.Rand(300), gg.FloatToInt(myself.sm.y) + gg.Rand(300) - gg.Rand(300), gg.FloatToInt(myself.sm.z), 0, clearer_mode, 0, 0);
	}


}