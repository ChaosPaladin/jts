package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_cratae_npc3 extends citizen {
	protected String cratae_enter_name = "etc10_1715_029m1";
	protected String maker_name_70 = "etc10_1717_026m1";
	protected String maker_name_75 = "etc10_1715_026m1";
	protected String maker_name_80 = "etc10_1815_026m1";
	protected int nType = 0;
	protected int cratae_reward = 13067;
	protected int pc_point = 10;
	protected int minimum_point = 10;
	protected int pos_x01 = 0;
	protected int pos_y01 = 0;
	protected int pos_z01 = 0;
	protected int pos_x02 = 0;
	protected int pos_y02 = 0;
	protected int pos_z02 = 0;
	protected int pos_x03 = 0;
	protected int pos_y03 = 0;
	protected int pos_z03 = 0;
	protected int pos_x04 = 0;
	protected int pos_y04 = 0;
	protected int pos_z04 = 0;
	protected int pos_x05 = 0;
	protected int pos_y05 = 0;
	protected int pos_z05 = 0;
	protected int pos_x06 = 0;
	protected int pos_y06 = 0;
	protected int pos_z06 = 0;
	protected int pos_x07 = 0;
	protected int pos_y07 = 0;
	protected int pos_z07 = 0;
	protected int pos_x08 = 0;
	protected int pos_y08 = 0;
	protected int pos_z08 = 0;
	protected int pos_x09 = 0;
	protected int pos_y09 = 0;
	protected int pos_z09 = 0;
	protected int pos_x10 = 0;
	protected int pos_y10 = 0;
	protected int pos_z10 = 0;
	protected int pos_x11 = 0;
	protected int pos_y11 = 0;
	protected int pos_z11 = 0;
	protected int pos_x12 = 0;
	protected int pos_y12 = 0;
	protected int pos_z12 = 0;
	protected int pos_x13 = 0;
	protected int pos_y13 = 0;
	protected int pos_z13 = 0;
	protected int pos_x14 = 0;
	protected int pos_y14 = 0;
	protected int pos_z14 = 0;
	protected int pos_x15 = 0;
	protected int pos_y15 = 0;
	protected int pos_z15 = 0;
	protected int pos_x16 = 0;
	protected int pos_y16 = 0;
	protected int pos_z16 = 0;
	protected int pos_x17 = 0;
	protected int pos_y17 = 0;
	protected int pos_z17 = 0;
	protected int pos_x18 = 0;
	protected int pos_y18 = 0;
	protected int pos_z18 = 0;
	protected int pos_x19 = 0;
	protected int pos_y19 = 0;
	protected int pos_z19 = 0;
	protected int pos_x20 = 0;
	protected int pos_y20 = 0;
	protected int pos_z20 = 0;
	protected int pos_x21 = 0;
	protected int pos_y21 = 0;
	protected int pos_z21 = 0;
	protected int pos_x22 = 0;
	protected int pos_y22 = 0;
	protected int pos_z22 = 0;
	protected int pos_x23 = 0;
	protected int pos_y23 = 0;
	protected int pos_z23 = 0;
	protected int pos_x24 = 0;
	protected int pos_y24 = 0;
	protected int pos_z24 = 0;
	protected int pos_x25 = 0;
	protected int pos_y25 = 0;
	protected int pos_z25 = 0;

	protected void CREATED(HandlerParam maker0, HandlerParam i0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
gg.SetAsNull(myself.c_ai0);
gg.SetAsNull(myself.c_ai1);
gg.SetAsNull(myself.c_ai2);
myself.RemoveAllHateInfoIF(0, 0);
myself.SetMaxHateListSize(25);
if (nType == 70) {
i0 = 5;

} else if (nType == 75) {
i0 = 6;

} else if (nType == 80) {
i0 = 7;

}
myself.CreatePVPMatch(i0);
myself.RegisterUserResurrectionTower(myself.sm.id);
super;
	}

	protected void REGISTER_USER_RESURRECTION_TOWER_RESULT(HandlerParam reply, HandlerParam i0) {
if (reply == 0) {

} else if (reply == 1) {

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam h0, HandlerParam party0) {
if (creature.is_pc == 1) {
if (myself.IsNullParty(party0) == 0) {
myself.ShowPage(creature, "cratae_teleport_npc007.htm");
myself.UnregisterUserPVPMatch(creature);

} else {
myself.IsUserPVPMatching(creature);

}

}
	}

	protected void IS_USER_PVPMATCHING_RESULT(HandlerParam reply, HandlerParam i0, HandlerParam c0) {
if (reply == 0) {
c0 = gg.GetCreatureFromID(i0);
myself.InstantTeleport(c0, -70411, -70958, -1416);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam h0, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam maker0) {
if (script_event_arg1 == 1717002) {
myself.AddHateInfo(gg.GetCreatureFromID(script_event_arg2), 0, 0, 0, 0);
myself.i_ai3 = myself.GetHateInfoCount();
if (gg.IsNull(myself.c_ai0) == 0) {
if (nType == 70) {
gg.SendScriptEvent(myself.c_ai0, 1717170, myself.i_ai3);

} else if (nType == 75) {
gg.SendScriptEvent(myself.c_ai0, 1717175, myself.i_ai3);

} else if (nType == 80) {
gg.SendScriptEvent(myself.c_ai0, 1717180, myself.i_ai3);

}

}

} else if (script_event_arg1 == 1717001) {
myself.c_ai0 = gg.GetCreatureFromID(script_event_arg2);
if (nType == 70) {
gg.SendScriptEvent(myself.c_ai0, 1717070, myself.sm.id);

} else if (nType == 75) {
gg.SendScriptEvent(myself.c_ai0, 1717075, myself.sm.id);

} else if (nType == 80) {
gg.SendScriptEvent(myself.c_ai0, 1717080, myself.sm.id);

}

} else if (script_event_arg1 == 1717011) {
c0 = gg.GetCreatureFromID(script_event_arg2);
myself.CastBuffForQuestReward(c0, 458817537);
myself.CastBuffForQuestReward(c0, 71172098);
myself.CastBuffForQuestReward(c0, 78905346);
myself.CastBuffForQuestReward(c0, 69402627);
myself.CastBuffForQuestReward(c0, 71106563);
myself.CastBuffForQuestReward(c0, 70647814);
myself.CastBuffForQuestReward(c0, 69992451);
myself.CastBuffForQuestReward(c0, 81264643);
myself.CastBuffForQuestReward(c0, 70582275);
myself.CastBuffForQuestReward(c0, 81395715);
myself.CastBuffForQuestReward(c0, 69599234);
myself.CastBuffForQuestReward(c0, 376176641);
myself.CastBuffForQuestReward(c0, 376111105);

} else if (script_event_arg1 == 1717003) {
c0 = gg.GetCreatureFromID(script_event_arg2);
i0 = gg.Rand(25) + 1;
i1 = gg.Rand(600) - 300;
i2 = gg.Rand(600) - 300;
switch (i0) {
case 1: {
myself.InstantTeleport(c0, pos_x01 + i1, pos_y01 + i2, pos_z01);
break;

}
case 2: {
myself.InstantTeleport(c0, pos_x02 + i1, pos_y02 + i2, pos_z02);
break;

}
case 3: {
myself.InstantTeleport(c0, pos_x03 + i1, pos_y03 + i2, pos_z03);
break;

}
case 4: {
myself.InstantTeleport(c0, pos_x04 + i1, pos_y04 + i2, pos_z04);
break;

}
case 5: {
myself.InstantTeleport(c0, pos_x05 + i1, pos_y05 + i2, pos_z05);
break;

}
case 6: {
myself.InstantTeleport(c0, pos_x06 + i1, pos_y06 + i2, pos_z06);
break;

}
case 7: {
myself.InstantTeleport(c0, pos_x07 + i1, pos_y07 + i2, pos_z07);
break;

}
case 8: {
myself.InstantTeleport(c0, pos_x08 + i1, pos_y08 + i2, pos_z08);
break;

}
case 9: {
myself.InstantTeleport(c0, pos_x09 + i1, pos_y09 + i2, pos_z09);
break;

}
case 10: {
myself.InstantTeleport(c0, pos_x10 + i1, pos_y10 + i2, pos_z10);
break;

}
case 11: {
myself.InstantTeleport(c0, pos_x11 + i1, pos_y11 + i2, pos_z11);
break;

}
case 12: {
myself.InstantTeleport(c0, pos_x12 + i1, pos_y12 + i2, pos_z12);
break;

}
case 13: {
myself.InstantTeleport(c0, pos_x13 + i1, pos_y13 + i2, pos_z13);
break;

}
case 14: {
myself.InstantTeleport(c0, pos_x14 + i1, pos_y14 + i2, pos_z14);
break;

}
case 15: {
myself.InstantTeleport(c0, pos_x15 + i1, pos_y15 + i2, pos_z15);
break;

}
case 16: {
myself.InstantTeleport(c0, pos_x16 + i1, pos_y16 + i2, pos_z16);
break;

}
case 17: {
myself.InstantTeleport(c0, pos_x17 + i1, pos_y17 + i2, pos_z17);
break;

}
case 18: {
myself.InstantTeleport(c0, pos_x18 + i1, pos_y18 + i2, pos_z18);
break;

}
case 19: {
myself.InstantTeleport(c0, pos_x19 + i1, pos_y19 + i2, pos_z19);
break;

}
case 20: {
myself.InstantTeleport(c0, pos_x20 + i1, pos_y20 + i2, pos_z20);
break;

}
case 21: {
myself.InstantTeleport(c0, pos_x21 + i1, pos_y21 + i2, pos_z21);
break;

}
case 22: {
myself.InstantTeleport(c0, pos_x22 + i1, pos_y22 + i2, pos_z22);
break;

}
case 23: {
myself.InstantTeleport(c0, pos_x23 + i1, pos_y23 + i2, pos_z23);
break;

}
case 24: {
myself.InstantTeleport(c0, pos_x24 + i1, pos_y24 + i2, pos_z24);
break;

}
case 25: {
myself.InstantTeleport(c0, pos_x25 + i1, pos_y25 + i2, pos_z25);
break;

}

}
if (nType == 70) {
gg.SendScriptEvent(myself.c_ai0, 1717170, myself.GetHateInfoCount());

} else if (nType == 75) {
gg.SendScriptEvent(myself.c_ai0, 1717175, myself.GetHateInfoCount());

} else if (nType == 80) {
gg.SendScriptEvent(myself.c_ai0, 1717180, myself.GetHateInfoCount());

}

} else if (script_event_arg1 == 1717004) {
c0 = gg.GetCreatureFromID(script_event_arg2);
i3 = gg.Rand(3) + 1;
if (i3 == 1) {
myself.InstantTeleport(c0, -70411, -70958, -1416);

} else if (i3 == 2) {
myself.InstantTeleport(c0, -70522, -71026, -1416);

} else {
myself.InstantTeleport(c0, -70293, -71029, -1416);

}
if (nType == 70) {
gg.SendScriptEvent(myself.c_ai0, 1717170, myself.GetHateInfoCount());

} else if (nType == 75) {
gg.SendScriptEvent(myself.c_ai0, 1717175, myself.GetHateInfoCount());

} else if (nType == 80) {
gg.SendScriptEvent(myself.c_ai0, 1717180, myself.GetHateInfoCount());

}

} else if (script_event_arg1 == 2114002) {
myself.AddTimerEx(3426, 100);

} else if (script_event_arg1 == 1717006) {
myself.AddTimerEx(3430, 100);

} else if (script_event_arg1 == 1717012) {
c0 = gg.GetCreatureFromID(script_event_arg2);
myself.AddHateInfo(c0, script_event_arg3, 0, 1, 1);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i10, HandlerParam h0, HandlerParam c0) {
if (timer_id == 3421) {
for (i5 = 0; i5 < myself.GetHateInfoCount(); i5 = i5 + 1) {
h0 = myself.GetHateInfoByIndex(i3);
c0 = h0.creature;
if (myself.IsNullCreature(c0) == 0) {
if (myself.InMyTerritory(c0) == 0) {
myself.UnregisterUserPVPMatch(c0);

}

}

}
if (myself.i_ai0 == 1) {
myself.AddTimerEx(3421, 1000);

}

} else if (timer_id == 3426) {
for (i3 = 0; i3 < myself.GetHateInfoCount(); i3 = i3 + 1) {
h0 = myself.GetHateInfoByIndex(i3);
c0 = h0.creature;
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(myself.sm, 1717011, c0.id);

}

}
myself.AddTimerEx(3427, 1000);

} else if (timer_id == 3427) {
for (i3 = 0; i3 < myself.GetHateInfoCount(); i3 = i3 + 1) {
h0 = myself.GetHateInfoByIndex(i3);
c0 = h0.creature;
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(myself.sm, 1717003, c0.id);

}

}

} else if (timer_id == 3430) {
for (i3 = 0; i3 < myself.GetHateInfoCount(); i3 = i3 + 1) {
h0 = myself.GetHateInfoByIndex(i3);
c0 = h0.creature;
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) > 12000) {
myself.RemoveHateInfoByCreature(c0);

}

}
myself.AddTimerEx(3431, 100);

} else if (timer_id == 3431) {
for (i3 = 0; i3 < myself.GetHateInfoCount(); i3 = i3 + 1) {
h0 = myself.GetHateInfoByIndex(i3);
c0 = h0.creature;
if (myself.IsNullCreature(c0) == 0) {
myself.CastBuffForQuestReward(c0, 458817537);

}

}
myself.AddTimerEx(3432, 1000);

} else if (timer_id == 3432) {
for (i3 = 0; i3 < myself.GetHateInfoCount(); i3 = i3 + 1) {
h0 = myself.GetHateInfoByIndex(i3);
c0 = h0.creature;
if (myself.IsNullCreature(c0) == 0) {
myself.GetRankUserPVPMatch(c0);

}

}
myself.AddTimerEx(3433, 1000);

} else if (timer_id == 3433) {
for (i3 = 0; i3 < myself.GetHateInfoCount(); i3 = i3 + 1) {
h0 = myself.GetHateInfoByIndex(i3);
c0 = h0.creature;
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(myself.sm, 1717004, c0.id);

}

}
myself.AddTimerEx(3434, 1000);

} else if (timer_id == 3434) {
myself.RemoveAllHateInfoIF(0, 0);

} else if (timer_id == 3450) {
gg.SendScriptEvent(myself.sm, 1717011, myself.c_ai1.id);
myself.AddTimerEx(3451, 100);

} else if (timer_id == 3451) {
gg.SendScriptEvent(myself.sm, 1717003, myself.c_ai1.id);
myself.i_ai1 = 0;

} else if (timer_id == 3460) {
myself.CastBuffForQuestReward(myself.c_ai2, 458817537);
myself.AddTimerEx(3461, 100);

} else if (timer_id == 3461) {
gg.SendScriptEvent(myself.sm, 1717004, myself.c_ai2.id);
myself.RemoveHateInfoByCreature(myself.c_ai2);
myself.i_ai2 = 0;

}
	}

	protected void GET_RANK_USER_PVP_MATCH_RESULT(HandlerParam talker, HandlerParam reply, HandlerParam i4, HandlerParam i5, HandlerParam c0, HandlerParam h0, HandlerParam i0) {
if (myself.i_ai3 <= 25 && myself.i_ai3 >= 21) {
if (reply == 1) {
i4 = 100;

} else if (reply == 2) {
i4 = 80;

} else if (reply == 3) {
i4 = 60;

} else if (reply == 4) {
i4 = 40;

} else if (reply == 5) {
i4 = 20;

} else if (reply > 5) {
i4 = 10;

}

} else if (myself.i_ai3 <= 20 && myself.i_ai3 >= 16) {
if (reply == 1) {
i4 = 80;

} else if (reply == 2) {
i4 = 60;

} else if (reply == 3) {
i4 = 40;

} else if (reply == 4) {
i4 = 20;

} else if (reply > 4) {
i4 = 10;

}

} else if (myself.i_ai3 <= 15 && myself.i_ai3 >= 11) {
if (reply == 1) {
i4 = 60;

} else if (reply == 2) {
i4 = 40;

} else if (reply == 3) {
i4 = 20;

} else if (reply > 3) {
i4 = 10;

}

} else if (myself.i_ai3 <= 10 && myself.i_ai3 >= 6) {
if (reply == 1) {
i4 = 40;

} else if (reply == 2) {
i4 = 20;

} else if (reply > 2) {
i4 = 10;

}

} else if (myself.i_ai3 <= 5 && myself.i_ai3 >= 1) {
if (reply == 1) {
i4 = 10;

} else if (reply > 1) {
i4 = 10;

}

} else {
i4 = 0;

}
h0 = myself.GetHateInfoByCreature(talker);
i0 = h0.hate;
if (i0 < minimum_point) {
i4 = 0;

} else {
myself.GiveItem1(talker, cratae_reward, i4);
if (myself.IsPCCafeUser(talker) == 1) {
myself.GiveItem1(talker, cratae_reward, 5);

}
if (nType == 70) {
i5 = 1800;

} else if (nType == 75) {
i5 = 2100;

} else if (nType == 80) {
i5 = 2400;

}
myself.IncrementParam(talker, 0, i5 * i0);
myself.IncrementParam(talker, 1, i5 / 10 * i0);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam i3) {
if (ask == -1300) {
switch (reply) {
case -3001: {
if (myself.i_ai1 == 1) {
if (nType == 70) {
myself.ShowPage(talker, "cratae_teleport_npc_70002.htm");

} else if (nType == 75) {
myself.ShowPage(talker, "cratae_teleport_npc_75002.htm");

} else if (nType == 80) {
myself.ShowPage(talker, "cratae_teleport_npc_80002.htm");

}

} else if (myself.i_ai0 == 0) {
if (nType == 70) {
myself.ShowPage(talker, "cratae_teleport_npc_70003.htm");

} else if (nType == 75) {
myself.ShowPage(talker, "cratae_teleport_npc_75003.htm");

} else if (nType == 80) {
myself.ShowPage(talker, "cratae_teleport_npc_80003.htm");

}

} else if (myself.i_ai0 == 1) {
myself.i_ai1 = 1;
myself.c_ai1 = talker;
myself.AddTimerEx(3450, 1);

}
break;

}
case -3003: {
if (myself.i_ai2 == 1) {
if (nType == 70) {
myself.ShowPage(talker, "cratae_teleport_npc_70002.htm");

} else if (nType == 75) {
myself.ShowPage(talker, "cratae_teleport_npc_75002.htm");

} else if (nType == 80) {
myself.ShowPage(talker, "cratae_teleport_npc_80002.htm");

}

} else {
myself.i_ai2 = 1;
myself.c_ai2 = talker;
myself.UnregisterUserPVPMatch(talker);

}
break;

}

}

}
	}

	protected void UNREGISTER_USER_PVP_MATCH_RESULT(HandlerParam talker, HandlerParam reply) {
myself.AddTimerEx(3460, 1);
	}

	protected void KILLED_USER_PVP_MATCH_RESULT(HandlerParam talker, HandlerParam attacker, HandlerParam c0, HandlerParam h0, HandlerParam i0, HandlerParam reply) {
gg.SetAsNull(c0);
if (reply == 0) {
i0 = pc_point;

} else if (reply == 1) {
i0 = 1;

}
if (talker.is_pc == 1) {
if (attacker.is_pc == 1) {
c0 = attacker;

} else if (attacker.summon_type == 1) {
c0 = attacker.master;

}
if (myself.IsNullCreature(c0) == 0) {
myself.AddKillPointUserPVPMatch(c0, i0);
myself.AddHateInfo(c0, i0, 0, 1, 1);

}

}
	}

	protected void START_USER_PVP_MATCH_RESULT(HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (myself.i_ai0 == 1) {

} else {
myself.i_ai0 = 1;
maker0 = gg.GetNpcMaker(cratae_enter_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2114002, 0, 0);

}
if (nType == 70) {
maker0 = gg.GetNpcMaker(maker_name_70);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2114002, 0, 0);

}

} else if (nType == 75) {
maker0 = gg.GetNpcMaker(maker_name_75);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2114002, 0, 0);

}

} else if (nType == 80) {
maker0 = gg.GetNpcMaker(maker_name_80);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2114002, 0, 0);

}

}

}
	}

	protected void END_USER_PVP_MATCH_RESULT(HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (myself.i_ai0 == 0) {

} else {
myself.i_ai0 = 0;
maker0 = gg.GetNpcMaker(cratae_enter_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1717006, 0, 0);

}
if (nType == 70) {
maker0 = gg.GetNpcMaker(maker_name_70);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1717006, 0, 0);

}

} else if (nType == 75) {
maker0 = gg.GetNpcMaker(maker_name_75);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1717006, 0, 0);

}

} else if (nType == 80) {
maker0 = gg.GetNpcMaker(maker_name_80);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1717006, 0, 0);

}

}

}
	}

	protected void WITHDRAW_USER_PVP_MATCH_RESULT(HandlerParam reply, HandlerParam i0, HandlerParam i1) {
	}


}