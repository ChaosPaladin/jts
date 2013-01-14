package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class C_room_pathnode extends default_npc {
	protected int SelfRangeDDmagic = 458752001;
	protected int W_LongRangeDDMagic = 458752001;
	protected int selfbuff = 458752001;
	protected String areadata = "24_23_dark_006_01";
	protected String areadata2 = "24_23_dark_006_02";
	protected String areadata3 = "24_23_dark_006_03";
	protected String areadata4 = "24_23_dark_006_04";
	protected String c_doorname = "island_of_oracle_e";
	protected String maker_name1 = "innadril19_2423_009m1";
	protected String maker_name2 = "innadril19_2423_010m1";
	protected String maker_name3 = "innadril19_2423_011m1";
	protected String maker_name4 = "innadril19_2423_012m1";
	protected String maker_name5 = "innadril19_2423_013m1";
	protected String maker_name6 = "innadril19_2423_014m1";
	protected String maker_name7 = "innadril19_2423_015m1";
	protected String pathnode_doorname1 = "island_of_oracle_1";
	protected String pathnode_doorname2 = "island_of_oracle_2";
	protected String pathnode_doorname3 = "island_of_oracle_3";
	protected String pathnode_doorname4 = "island_of_oracle_4";
	protected String pathnode_doorname5 = "island_of_oracle_5";
	protected String pathnode_doorname6 = "island_of_oracle_6";
	protected String pathnode_doorname7 = "island_of_oracle_7";

	protected void CREATED(HandlerParam maker0, HandlerParam i0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
myself.i_quest2 = 0;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0, HandlerParam maker0) {
if (script_event_arg1 == 12508) {
myself.i_ai0 = script_event_arg2;
if (myself.i_ai0 == 1) {
if (myself.Skill_GetConsumeMP(selfbuff) < myself.sm.mp && myself.Skill_GetConsumeHP(selfbuff) < myself.sm.hp && myself.Skill_InReuseDelay(selfbuff) == 0) {
myself.AddUseSkillDesire(myself.sm, selfbuff, 1, 1, 1000000);

}

} else if (myself.i_ai0 == 2) {
if (gg.Rand(100) <= 90) {
myself.i_ai1 = 1;

}

} else if (myself.i_ai0 == 3) {
if (gg.Rand(100) <= 90) {
myself.i_ai2 = 1;

}

} else if (myself.i_ai0 == 4) {
if (gg.Rand(100) <= 90) {
myself.i_ai3 = 1;

}

} else if (myself.i_ai0 == 4) {
if (gg.Rand(100) < 50) {
if (myself.Skill_GetConsumeMP(selfbuff) < myself.sm.mp && myself.Skill_GetConsumeHP(selfbuff) < myself.sm.hp && myself.Skill_InReuseDelay(selfbuff) == 0) {
myself.AddUseSkillDesire(myself.sm, selfbuff, 1, 1, 1000000);

}

}

}

} else if (script_event_arg1 == 12533) {
i0 = myself.InstantZone_GetId();
if (script_event_arg2 == 1) {
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12509, 0, 0);

}
myself.i_quest1 = script_event_arg2;

} else if (script_event_arg2 == 2) {
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12509, 0, 0);

}
myself.i_quest1 = script_event_arg2;

} else if (script_event_arg2 == 3) {
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12509, 0, 0);

}
myself.i_quest1 = script_event_arg2;

} else if (script_event_arg2 == 4) {
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12509, 0, 0);

}
myself.i_quest1 = script_event_arg2;

} else if (script_event_arg2 == 5) {
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12509, 0, 0);

}
myself.i_quest1 = script_event_arg2;

} else if (script_event_arg2 == 6) {
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name6);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12509, 0, 0);

}
myself.i_quest1 = script_event_arg2;

} else if (script_event_arg2 == 7) {
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name7);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12509, 0, 0);

}
myself.i_quest1 = script_event_arg2;

}

} else if (script_event_arg1 == 12534) {
myself.i_ai4 = 1;

} else if (script_event_arg1 == 12573) {
if (script_event_arg2 == myself.i_quest1) {

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam f0, HandlerParam i0, HandlerParam i1) {
if (myself.i_ai4 == 0) {
myself.i_ai4 = 1;
myself.BroadcastScriptEvent(12534, 0, 3000);
gg.Castle_GateOpenCloseEx(c_doorname, 1, myself.InstantZone_GetId());

}
if (myself.i_ai0 == 2 && myself.i_ai1 == 1) {
myself.i_ai1 = 2;
i1 = gg.Rand(100);
if (i1 < 25) {
gg.Area_SetOnOffEx(areadata, 1, myself.InstantZone_GetId());
myself.i_quest0 = 1;

} else if (i1 < 50) {
gg.Area_SetOnOffEx(areadata2, 1, myself.InstantZone_GetId());
myself.i_quest0 = 2;

} else if (i1 < 75) {
gg.Area_SetOnOffEx(areadata3, 1, myself.InstantZone_GetId());
myself.i_quest0 = 3;

} else {
gg.Area_SetOnOffEx(areadata4, 1, myself.InstantZone_GetId());
myself.i_quest0 = 4;

}

}
if (myself.i_ai0 == 3 && myself.i_ai2 == 1) {
myself.i_ai2 = 2;
if (myself.DistFromMe(attacker) < 200) {
if (myself.Skill_GetConsumeMP(SelfRangeDDmagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDmagic) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDmagic) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDmagic, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

}

}
if (myself.i_ai0 == 4 && myself.i_ai3 == 1) {
myself.i_ai3 = 2;
i0 = gg.Rand(100);
if (i0 < 33) {
myself.CreateOnePrivateEx(1022272, "warrior_use_skill", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y) + 40, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (i0 < 66) {
myself.CreateOnePrivateEx(1022273, "wizard_use_skill", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y) + 40, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else {
myself.CreateOnePrivateEx(1022274, "warrior_use_skill", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y) + 40, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam success, HandlerParam skill_name_id) {
if (SelfRangeDDmagic != 0) {
if (skill_name_id == SelfRangeDDmagic) {
myself.Despawn();

} else if (skill_name_id == W_LongRangeDDMagic) {
myself.Despawn();

}
if (myself.i_quest1 == 1) {
gg.Castle_GateOpenCloseEx(pathnode_doorname1, 0, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(12573, myself.i_quest1, 3000);

} else if (myself.i_quest1 == 2) {
gg.Castle_GateOpenCloseEx(pathnode_doorname2, 0, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(12573, myself.i_quest1, 3000);

} else if (myself.i_quest1 == 3) {
gg.Castle_GateOpenCloseEx(pathnode_doorname3, 0, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(12573, myself.i_quest1, 3000);

} else if (myself.i_quest1 == 4) {
gg.Castle_GateOpenCloseEx(pathnode_doorname4, 0, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(12573, myself.i_quest1, 3000);

} else if (myself.i_quest1 == 5) {
gg.Castle_GateOpenCloseEx(pathnode_doorname5, 0, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(12573, myself.i_quest1, 3000);

} else if (myself.i_quest1 == 6) {
gg.Castle_GateOpenCloseEx(pathnode_doorname6, 0, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(12573, myself.i_quest1, 3000);

} else if (myself.i_quest1 == 7) {
gg.Castle_GateOpenCloseEx(pathnode_doorname7, 0, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(12573, myself.i_quest1, 3000);

}

}
super;
	}

	protected void MY_DYING() {
if (myself.i_quest1 == 1) {
gg.Castle_GateOpenCloseEx(pathnode_doorname1, 0, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(12573, myself.i_quest1, 3000);

} else if (myself.i_quest1 == 2) {
gg.Castle_GateOpenCloseEx(pathnode_doorname2, 0, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(12573, myself.i_quest1, 3000);

} else if (myself.i_quest1 == 3) {
gg.Castle_GateOpenCloseEx(pathnode_doorname3, 0, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(12573, myself.i_quest1, 3000);

} else if (myself.i_quest1 == 4) {
gg.Castle_GateOpenCloseEx(pathnode_doorname4, 0, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(12573, myself.i_quest1, 3000);

} else if (myself.i_quest1 == 5) {
gg.Castle_GateOpenCloseEx(pathnode_doorname5, 0, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(12573, myself.i_quest1, 3000);

} else if (myself.i_quest1 == 6) {
gg.Castle_GateOpenCloseEx(pathnode_doorname6, 0, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(12573, myself.i_quest1, 3000);

} else if (myself.i_quest1 == 7) {
myself.BroadcastScriptEvent(12575, myself.i_quest1, 3000);
gg.Castle_GateOpenCloseEx(pathnode_doorname7, 0, myself.InstantZone_GetId());
myself.BroadcastScriptEvent(12573, myself.i_quest1, 3000);

}
if (myself.i_quest0 == 1) {
gg.Area_SetOnOffEx(areadata, 0, myself.InstantZone_GetId());

} else if (myself.i_quest0 == 2) {
gg.Area_SetOnOffEx(areadata2, 0, myself.InstantZone_GetId());

} else if (myself.i_quest0 == 3) {
gg.Area_SetOnOffEx(areadata3, 0, myself.InstantZone_GetId());

} else if (myself.i_quest0 == 4) {
gg.Area_SetOnOffEx(areadata4, 0, myself.InstantZone_GetId());

}
myself.InstantZone_MarkRestriction();
	}


}