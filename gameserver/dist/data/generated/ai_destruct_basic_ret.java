package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_basic_ret extends default_npc {
	protected int Breath = 458752001;
	protected int Breath_Prob = 0;
	protected int Buff = 458752001;
	protected String SuperPointName1 = "defence_left";
	protected String SuperPointName2 = "defence_right";
	protected String SuperPointName3 = "invasion_left";
	protected String SuperPointName4 = "invasion_center";
	protected String SuperPointName5 = "invasion_right";
	protected int SearchType = 0;

	protected void CREATED() {
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
if (myself.sm.param1 == 1224010) {
if (myself.sm.param2 == 0 && myself.sm.param3 == 0) {
myself.AddMoveAroundDesire(5, 5);

} else if (myself.sm.param2 == 1224015) {
if (myself.sm.param3 == 1224016) {
myself.AddMoveSuperPointDesire(SuperPointName1, SearchType, 10000);

} else if (myself.sm.param3 == 1224017) {
myself.AddMoveSuperPointDesire(SuperPointName2, SearchType, 10000);

} else if (myself.sm.param3 == 1224018) {
myself.AddMoveSuperPointDesire(SuperPointName3, SearchType, 10000);

} else if (myself.sm.param3 == 1224019) {
myself.AddMoveSuperPointDesire(SuperPointName4, SearchType, 10000);

} else if (myself.sm.param3 == 1224020) {
myself.AddMoveSuperPointDesire(SuperPointName5, SearchType, 10000);

}

} else {
myself.AddMoveToDesire(myself.sm.param2, myself.sm.param3, gg.FloatToInt(myself.sm.z), 50);

}

} else if (myself.sm.param1 == 1224011) {
myself.Shout(gg.MakeFString(1800296, "", "", "", "", ""));
if (myself.sm.param3 == 1224016) {
myself.AddMoveSuperPointDesire(SuperPointName1, SearchType, 10000);

} else if (myself.sm.param3 == 1224017) {
myself.AddMoveSuperPointDesire(SuperPointName2, SearchType, 10000);

}

}
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 20) {
myself.RemoveAllDesire();

}
	}

	protected void NO_DESIRE() {
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (Breath != 458752001) {
if (gg.Rand(10000) < Breath_Prob) {
if (myself.Skill_GetConsumeMP(Breath) < myself.sm.mp && myself.Skill_GetConsumeHP(Breath) < myself.sm.hp && myself.Skill_InReuseDelay(Breath) == 0) {
myself.AddUseSkillDesire(attacker, Breath, 0, 1, 1000000);

}

}

}
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire * 2.000000, 0);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0, HandlerParam c1, HandlerParam party0) {
if (script_event_arg1 == 1224006) {
if (script_event_arg2 != 0) {
if (myself.IsNullCreature(myself.c_ai2) == 1) {
myself.RemoveAllDesire();

}
myself.c_ai2 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(myself.c_ai2) == 0) {
myself.MakeAttackEvent(myself.c_ai2, 1000, 0);

}

}

}
if (script_event_arg1 == 1224009 || script_event_arg1 == 1224014 || script_event_arg1 == 1224013) {
myself.Despawn();

}
	}


}