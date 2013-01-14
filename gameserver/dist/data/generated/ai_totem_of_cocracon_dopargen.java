package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_totem_of_cocracon_dopargen extends default_npc {
	protected int type = 0;
	protected int S_TIMER = 1114;
	protected int WEAK_SKILL_TIMER = 1115;
	protected int WEAK_SKILL_CHECK_TIMER = 1116;
	protected int display_skill = 417792001;
	protected int weak_skill = 417660929;
	protected int max_desire = 10000000;
	protected int item_2hs = 15281;
	protected int item_1hs = 15280;
	protected int CHANGE_TIMER = 1117;

	protected void CREATED() {
if (type == 1) {
myself.AddTimerEx(S_TIMER, 5 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == S_TIMER) {
i0 = gg.Rand(2);
if (i0 == 0) {
myself.BroadcastScriptEvent(20091016, i0, 1500);

} else if (i0 == 1) {
myself.BroadcastScriptEvent(20091016, i0, 1500);

}
myself.AddTimerEx(S_TIMER, 30 * 1000);

} else if (timer_id == WEAK_SKILL_TIMER) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
if (myself.DistFromMe(myself.c_ai4) <= 150) {
myself.AddUseSkillDesire(myself.c_ai4, weak_skill, 0, 1, max_desire);

} else {
myself.AddTimerEx(WEAK_SKILL_CHECK_TIMER, 1 * 1000);

}

}

} else if (timer_id == WEAK_SKILL_CHECK_TIMER) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
i0 = gg.GetAbnormalLevel(myself.c_ai4, myself.Skill_GetAbnormalType(weak_skill));
if (myself.i_quest9) {
myself.Say("약화스킬 레벨" + i0 + "");

}
if (gg.GetAbnormalLevel(myself.c_ai4, myself.Skill_GetAbnormalType(weak_skill)) < 0) {
gg.SendScriptEvent(myself.c_ai4, 20091024, 0);

}
i1 = gg.Rand(3);
switch (i1) {
case 0: {
myself.CreateOnePrivateEx(1022760, "karnibi", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 1: {
myself.CreateOnePrivateEx(1022761, "kiriona", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(1022762, "caiona", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}

}

}

} else if (timer_id == CHANGE_TIMER) {
myself.UnequipWeapon();

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 20091016 && script_event_arg2 == type) {
myself.EquipItem(item_1hs);
myself.AddUseSkillDesire(myself.sm, display_skill, 0, 1, max_desire);
if (myself.i_quest9) {
myself.Shout(type + " 번 토템 차례");

}
myself.AddTimerEx(CHANGE_TIMER, 10 * 1000);

} else if (script_event_arg1 == 8) {
myself.c_ai4 = gg.GetCreatureFromIndex(script_event_arg2);

} else if (script_event_arg1 == 4) {
myself.Suicide();

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success, HandlerParam i1) {
if (skill_name_id == display_skill) {
myself.AddTimerEx(WEAK_SKILL_TIMER, 5 * 1000);

} else if (skill_name_id == weak_skill) {
myself.AddTimerEx(WEAK_SKILL_CHECK_TIMER, 1 * 1000);

}
super;
	}


}