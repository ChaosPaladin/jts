package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_unknown_agent extends default_npc {
	protected int mode = 0;
	protected int skill_buff = 362151937;
	protected int skill_buff_range = 400;
	protected String f6_maker_name = "gludio58_1926_600m1";
	protected String f8_maker_name = "gludio58_1926_801m1";
	protected String challanger_maker_name = "gludio58_1926_700m1";
	protected int id_globalmap = 13;
	protected String fnHi = "unknown_agent001.htm";
	protected String fnHi2 = "unknown_agent002.htm";
	protected String fnHi3 = "unknown_agent003.htm";
	protected String fnHi4 = "unknown_agent001a.htm";
	protected String fnHi5 = "unknown_agent001b.htm";
	protected int f6_x = -12176;
	protected int f6_y = 279696;
	protected int f6_z = -13596;
	protected int f7_x = -12501;
	protected int f7_y = 281397;
	protected int f7_z = -11936;
	protected int f8_x = -12176;
	protected int f8_y = 279696;
	protected int f8_z = -10492;
	protected int f_top_x = 21935;
	protected int f_top_y = 243923;
	protected int f_top_z = 11088;
	protected int test_mode = 0;

	protected void CREATED(HandlerParam c0) {
if (myself.GetGlobalMap(12) == -1 || myself.GetGlobalMap(id_globalmap) != -1 && mode == 0) {
myself.AddTimerEx(78003, 1 * 1000);

} else if (myself.GetGlobalMap(12) != -1 && myself.GetGlobalMap(id_globalmap) == -1 && mode == 0) {
c0 = gg.GetCreatureFromID(myself.GetGlobalMap(12));
if (myself.IsNullCreature(c0) == 0 && c0.db_value == 0) {
myself.RegisterGlobalMap(id_globalmap, myself.sm.id);
myself.AddTimerEx(78001, 3 * 60 * 1000);

} else {
myself.AddTimerEx(78003, 1 * 1000);

}

}
myself.c_ai0 = gg.GetNullCreature();
myself.i_ai0 = 0;
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam c0, HandlerParam party0) {
party0 = gg.GetParty(talker);
c0 = myself.GetLeaderOfParty(party0);
if (myself.IsNullParty(party0) == 0 || test_mode == 1) {
if (myself.IsNullCreature(c0) == 0 && talker == c0 || test_mode == 1) {
myself.i_ai0 = gg.Party_GetCount(talker);
if (mode == 1) {
myself.ShowPage(talker, fnHi2);

} else {
myself.ShowPage(talker, fnHi);

}

} else {
myself.ShowPage(talker, fnHi4);

}

} else {
myself.ShowPage(talker, fnHi4);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam maker0, HandlerParam party0, HandlerParam c0, HandlerParam i0) {
if (ask == -7801) {
if (reply == 1) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
myself.TeleportParty(party0.id, f7_x, f7_y, f7_z, 6000, 0);

} else {
myself.InstantTeleport(talker, f7_x, f7_y, f7_z);

}
maker0 = gg.GetNpcMaker(challanger_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010034, 7, 0);

}

} else if (reply == 2) {
myself.AddTimerEx(78001, 1 * 1000);

} else if (reply == 3) {
if (myself.IsNullCreature(talker) == 0) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
for (i0 = 0; i0 < gg.Party_GetCount(talker); i0 = i0 + 1) {
c0 = gg.Party_GetCreature(talker, i0);
if (myself.DistFromMe(c0) > skill_buff_range) {
myself.ShowPage(talker, fnHi5);
return;

}

}
for (i0 = 0; i0 < gg.Party_GetCount(talker); i0 = i0 + 1) {
c0 = gg.Party_GetCreature(talker, i0);
myself.AddUseSkillDesire(c0, skill_buff, 1, 1, 10000000000);
myself.i_ai0 = myself.i_ai0 + 1;

}

} else {
if (myself.DistFromMe(talker) > skill_buff_range) {
myself.ShowPage(talker, fnHi5);
return;

}
myself.AddUseSkillDesire(talker, skill_buff, 1, 1, 10000000000);

}

}

} else {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(gg.GetParty(talker)) == 0) {
c0 = myself.GetMemberOfParty(party0, gg.Rand(party0.member_count) + 1);
if (myself.IsNullCreature(c0) == 0) {
myself.c_ai0 = c0;

}

} else {
myself.c_ai0 = talker;

}
myself.AddTimerEx(78002, 3 * 1000);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam target, HandlerParam party0, HandlerParam maker0) {
if (skill_name_id == skill_buff && myself.i_ai0 > 0) {
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(skill_buff)) <= 0) {
myself.AddUseSkillDesire(target, skill_buff, 1, 1, 10000000000);

} else {
myself.InstantTeleport(target, f_top_x, f_top_y, f_top_z);
myself.i_ai0 = myself.i_ai0 - 1;

}

}
if (myself.i_ai0 <= 0) {
myself.i_ai0 = 0;
myself.AddTimerEx(78001, 60 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (mode == 1) {
if (timer_id == 78001) {
myself.InstantTeleportInMyTerritory(f8_x, f8_y, f8_z, 300);
maker0 = gg.GetNpcMaker(challanger_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010004, 1, 0);

}

}
if (timer_id == 78002) {
maker0 = gg.GetNpcMaker(challanger_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010005, gg.GetIndexFromCreature(myself.c_ai0), 0);
gg.SendMakerScriptEvent(maker0, 78010004, 1, gg.GetIndexFromCreature(myself.c_ai0));

}

}

} else if (mode == 0) {
if (timer_id == 78001) {
maker0 = gg.GetNpcMaker(challanger_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010004, 0, 0);

}
myself.RegisterGlobalMap(id_globalmap, -1);
myself.Despawn();

} else if (timer_id == 78003) {
maker0 = gg.GetNpcMaker(challanger_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010004, 0, 1);

}
myself.Despawn();

}

}
	}


}