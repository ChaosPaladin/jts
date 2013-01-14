package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_summoner extends default_npc {
	protected int Summon_raid = 1025512;
	protected int Pos_machin_x = 96320;
	protected int Pos_machin_y = -110912;
	protected int Pos_machin_z = -3328;
	protected int Pos_rboss_x = 94640;
	protected int Pos_rboss_y = -112496;
	protected int Pos_rboss_z = -3360;
	protected int Pos_door_x = 96016;
	protected int Pos_door_y = -110736;
	protected int Pos_door_z = -3312;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
if (gg.FloatToInt(myself.sm.z) == -15536) {
myself.CreateOnePrivateEx(Summon_raid, "raid_boss_ag_type1_doc_chaos", 0, 0, Pos_rboss_x, Pos_rboss_y, Pos_rboss_z, 0, 0, 0, 0);

}
super;
	}

	protected void TALKED(HandlerParam talker) {
myself.c_ai1 = talker;
myself.Say(gg.MakeFString(1010578, "", "", "", "", ""));
myself.AddTimerEx(1001, 2000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0) {
if (timer_id == 1001) {
myself.LookNeighbor(300);
myself.AddMoveToDesire(Pos_machin_x, Pos_machin_y, Pos_machin_z, 1000);

}
if (timer_id == 1002) {
myself.SpecialCamera3(myself.sm, 1, -150, 10, 3000, 1000, 20000, 0, 0, 0, 0, 0);
myself.AddMoveToDesire(Pos_door_x, Pos_door_y, Pos_door_z, 1000);

}
if (timer_id == 2001) {
if (myself.IsNullCreature(myself.c_ai1) == 0 && myself.DistFromMe(myself.c_ai1) < 600) {
myself.i_ai1 = 1;
myself.Say(gg.MakeFString(1010579, "", "", "", "", ""));
myself.AddTimerEx(2002, 2000);
myself.AddTimerEx(1002, 11000);

} else {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 1000);
myself.c_ai1 = gg.GetNullCreature();

}

}
if (timer_id == 2002) {
if (myself.IsNullCreature(myself.c_ai2) != 0) {
myself.c_ai2 = myself.sm;

}
myself.SpecialCamera3(myself.c_ai2, 1, -200, 15, 10000, 1000, 20000, 0, 0, 0, 0, 0);
myself.AddEffectActionDesire(myself.sm, 3, 5000, 1000000);

}
if (timer_id == 3001) {
myself.CreateOnePrivateEx(Summon_raid, "raid_boss_ag_type1_doc_chaos", 0, 0, Pos_rboss_x, Pos_rboss_y, Pos_rboss_z, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 0);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && creature.class_id == 1032032) {
myself.c_ai2 = creature;

}
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z, HandlerParam party0, HandlerParam c0, HandlerParam i1, HandlerParam i2) {
if (x == myself.start_x && y == myself.start_y && z == myself.start_z) {
myself.RemoveAllDesire();

}
if (x == Pos_machin_x && y == Pos_machin_y && z == Pos_machin_z) {
myself.AddAttackDesire(myself.c_ai2, 1, 10);
myself.AddTimerEx(2001, 3000);

}
if (x == Pos_door_x && y == Pos_door_y && z == Pos_door_z) {
myself.Say(gg.MakeFString(1010580, "", "", "", "", ""));
party0 = gg.GetParty(myself.c_ai1);
if (myself.IsNullParty(party0)) {
myself.InstantTeleport(myself.c_ai1, 94832, -112624, -3328);

} else {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) < 2000) {
myself.InstantTeleport(c0, 94832, -112624, -3328);

}

}

}
myself.AddTimerEx(3001, 3000);
myself.InstantTeleport(myself.sm, -113091, -243942, -15536);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 10029) {
myself.Despawn();

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (myself.sm != private) {
myself.Despawn();

}
	}


}