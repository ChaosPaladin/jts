package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_basic extends default_npc {
	protected int Breath = 458752001;
	protected int Breath_Prob = 0;
	protected int Buff = 458752001;
	protected int Pos_X = -1;
	protected int Pos_Y = -1;
	protected int Pos_Z = -1;
	protected int my_role_flag = -1;
	protected int my_indure_point = -1;
	protected int used_by_camera = 0;
	protected String SuperPointName1 = "defence_left";
	protected String SuperPointName2 = "defence_right";
	protected String SuperPointName3 = "invasion_left";
	protected String SuperPointName4 = "invasion_center";
	protected String SuperPointName5 = "invasion_right";
	protected int SearchType = 0;
	protected int String_Num1 = 1800273;

	protected void CREATED() {
myself.i_ai0 = 100;
myself.c_ai1 = gg.GetNullCreature();
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
if (myself.sm.param3 == 1224016 || myself.sm.param3 == 1224017) {
if (script_event_arg1 == 10) {
myself.RemoveAllDesire();

}

}
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

	protected void SEE_CREATURE(HandlerParam creature) {
if (my_role_flag == 5) {
myself.MakeAttackEvent(creature, 100, 0);

}
	}

	protected void MY_DYING(HandlerParam last_attacker) {
if (my_role_flag == 1) {
myself.BroadcastScriptEvent(1224001, gg.GetIndexFromCreature(last_attacker), 1500);
if (String_Num1 > 0) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 5, 0, 1, 1, 1, 1, 5000, 0, gg.MakeFString(String_Num1, "", "", "", "", ""));

}

}
if (my_role_flag == 5) {
myself.BroadcastScriptEvent(1224005, gg.GetIndexFromCreature(last_attacker), 4000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0, HandlerParam c1, HandlerParam party0) {
if (script_event_arg1 == 1224001 && my_role_flag == 2) {
myself.MakeAttackEvent(gg.GetCreatureFromIndex(script_event_arg2), 200, 0);

}
if (script_event_arg1 == 1224003 && my_role_flag == 3) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
if (myself.IsNullParty(party0) == 0) {
for (i0 = 0; i0 < party0.member_count; i0 = i0 + 1) {
c1 = myself.GetMemberOfParty(party0, i0);
myself.MakeAttackEvent(c1, 100, 0);

}

} else {
myself.MakeAttackEvent(c0, 100, 0);

}

}

}
if (script_event_arg1 == 1224005 && my_role_flag == 5) {
myself.i_ai0 = myself.i_ai0 + 100;
if (myself.i_ai0 >= my_indure_point) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.MakeAttackEvent(c0, 1000, 0);

}

}

}
if (script_event_arg1 == 1224006) {
if (script_event_arg2 != 0) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.MakeAttackEvent(c0, 1000, 0);

}

}

}
if (script_event_arg1 == 1224008) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (myself.sm.npc_class_id == 1029162 || myself.sm.npc_class_id == 1022569) {
myself.MakeAttackEvent(c0, 1000, 0);

} else {
myself.MakeAttackEvent(c0, 100, 0);

}

}

}
if (script_event_arg1 == 1224009 || script_event_arg1 == 1224014 || script_event_arg1 == 1224013) {
myself.Despawn();

}
	}


}