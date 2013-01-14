package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hp_fill_me_npc extends default_npc {
	protected int time_type = 0;
	protected int buff = 458752001;
	protected String make_name_course2 = "innadril22_2422_037m1";
	protected String make_name_course3 = "innadril22_2422_038m1";
	protected String make_name_course4 = "innadril22_2422_039m1";
	protected String make_name_renew1 = "innadril22_2422_036m2";
	protected String make_name_renew2 = "innadril22_2422_037m2";
	protected String make_name_renew3 = "innadril22_2422_038m2";
	protected int time_item = 9692;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
gg.SetNpcParam(myself.sm, 9, myself.sm.max_hp * 0.001000);
super;
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam c3, HandlerParam c4, HandlerParam c5, HandlerParam c6, HandlerParam c7, HandlerParam c8, HandlerParam c9, HandlerParam maker0) {
if (myself.sm.hp >= myself.sm.max_hp && myself.i_ai2 == 0) {
party0 = gg.GetParty(speller);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
i3 = 0;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (c0.instant_zone_id == myself.InstantZone_GetId()) {
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343105)) > 0 || gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343106)) > 0 || gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343107)) > 0 || gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343108)) > 0) {
i3 = i3 + 1;

}

}

}

}
if (i3 == 0) {
party0 = gg.GetParty(speller);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (c0.instant_zone_id == myself.InstantZone_GetId()) {
myself.InstantZone_Leave(c0);

}

}

}

}

} else {
party0 = gg.GetParty(speller);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (gg.OwnItemCount(c0, time_item) >= 1) {
myself.CastBuffForQuestReward(c0, buff);
if (myself.i_ai0 == 3) {
myself.DeleteItem1(c0, time_item, 1);

}
myself.i_ai2 = 1;

} else if (c0.instant_zone_id == myself.InstantZone_GetId()) {
myself.InstantZone_Leave(c0);

}

}

}

}

}

}
if (myself.i_ai1 == 0) {
if (myself.i_ai0 == 1) {
myself.CreateOnePrivateEx(1032273, "ai_telecube_steam_1", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, make_name_course2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, make_name_renew2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12544, time_type, 0);

}

} else if (myself.i_ai0 == 2) {
myself.CreateOnePrivateEx(1032274, "ai_telecube_steam_2", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, make_name_course3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(i0, make_name_renew3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12544, time_type, 0);

}

} else if (myself.i_ai0 == 3) {
myself.CreateOnePrivateEx(1032275, "ai_telecube_steam_3", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, make_name_course4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
myself.AddTimerEx(2001, 2000);
myself.i_ai1 = 1;

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam f0) {
if (script_event_arg1 == 12542) {
myself.Despawn();

} else if (script_event_arg1 == 12543) {
myself.i_ai0 = script_event_arg2;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
myself.BroadcastScriptEvent(12542, 0, 1000);

}
	}


}