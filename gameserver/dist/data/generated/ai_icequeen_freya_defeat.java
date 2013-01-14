package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_freya_defeat extends default_npc {
	protected int Skill01_ID = 411435009;
	protected int Skill01_Prob = 1500;
	protected int Eternal_Blizzard = 411303937;
	protected int TIMER_SCENE_21 = 2314507;
	protected int TIMER_SCENE_21_END = 2314517;
	protected int scene_num_21 = 21;
	protected int TIMER_moving = 2314303;
	protected int TIMER_Blizzard = 2314304;
	protected int debug_mode = 0;

	protected void CREATED() {
myself.CreateOnePrivateEx(1018919, "ai_icequeen_entrance_defeated", 0, 0, 114394, -112383, -11200, 0, 0, 0, 0);
myself.AddTimerEx(TIMER_moving, 1 * 60 * 1000);
myself.AddTimerEx(TIMER_Blizzard, 3 * 60 * 1000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai0 == 0) {
myself.AddAttackDesire(attacker, 1, damage);
if (attacker.is_pc == 1) {
myself.BroadcastScriptEvent(23140043, gg.GetIndexFromCreature(myself.sm), 1500);

}
if (Skill01_ID != 458752001) {
if (gg.Rand(10000) < Skill01_Prob) {
if (gg.Rand(2) == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, 1000000);

}

} else if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, 1000000);

}

}

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai0 == 0) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1 || myself.IsInCategory(123, creature.npc_class_id) == 1) {
myself.MakeAttackEvent(creature, 200, 0);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
if (timer_id == TIMER_SCENE_21) {
myself.StartScenePlayerAround(myself.sm, 21, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));
gg.SendScriptEvent(myself.c_ai0, 231400001, 0);
myself.Despawn();

} else if (timer_id == TIMER_moving) {
if (debug_mode) {
myself.Shout("프레야 움직임 시작 타이머");

}
myself.AddMoveToDesire(114730, -114805, -11200, 50);

} else if (timer_id == TIMER_Blizzard) {
if (debug_mode) {
myself.Say("TIMER_Blizzard");

}
myself.Shout(gg.MakeFString(1801125, "", "", "", "", ""));
myself.StopMove();
myself.RemoveAllDesire();
myself.sm.absolute_defence = 1;
myself.sm.no_attack_damage = 1;
myself.i_ai0 = 1;
myself.AddUseSkillDesire(myself.sm, Eternal_Blizzard, 0, 1, 1000000000);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == Eternal_Blizzard) {
myself.BroadcastScriptEvent(23140020, 0, 4000);
if (debug_mode) {
myself.Shout("UseSkillFinished - Blizzard");

}
myself.AddTimerEx(TIMER_SCENE_21, 1 * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 23140101) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.i_ai9 = script_event_arg2;

}

} else if (script_event_arg1 == 23140043) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 50);

}

} else if (script_event_arg1 == 23140022) {
if (script_event_arg2 != 0) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);

}

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 1) {
myself.AddTimerEx(TIMER_Blizzard, 1000);

}
	}

	protected void MY_DYING(HandlerParam last_attacker) {
if (debug_mode) {
myself.Say("실제라면 있을 수 없는 일!. my_dying.");
myself.Say("어쨌든 Scene 보여줌. 인존 종료는 시키지 않음");
myself.StartScenePlayerAround(myself.sm, 21, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));

}
	}


}