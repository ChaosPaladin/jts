package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss05_zaken extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected int SeeCreatureAttackerTime = -1;
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(5, 5);
	}

	protected void CREATED(HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
myself.EffectMusic(myself.sm, 10000, "BS01_A");
myself.i_ai0 = 0;
myself.i_ai1 = gg.FloatToInt(myself.sm.x);
myself.i_ai2 = gg.FloatToInt(myself.sm.y);
myself.i_ai3 = gg.FloatToInt(myself.sm.z);
myself.i_quest0 = 0;
if (reply == 0) {
myself.i_quest2 = 3;

}
myself.i_quest1 = 0;
if (myself.InMyTerritory(myself.sm)) {
myself.i_ai4 = 1;
myself.AddTimerEx(1003, 1700);

}
myself.AddTimerEx(1001, 1 * 1000);
myself.i_quest3 = 0;
myself.i_quest4 = 0;
myself.AddTimerEx(9999, 1000);
myself.i_ai1 = gg.FloatToInt(myself.sm.x);
myself.i_ai2 = gg.FloatToInt(myself.sm.y);
myself.i_ai3 = gg.FloatToInt(myself.sm.z);
myself.AddTimerEx(1051, 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5) {
if (timer_id == 1051) {
if (myself.start_x - myself.sm.x * myself.start_x - myself.sm.x + myself.start_y - myself.sm.y * myself.start_y - myself.sm.y > 1500 * 1500) {
i5 = 1;

} else {
i5 = 0;

}
if (i5 == 1) {
myself.RemoveAllDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.AddTimerEx(1052, 3000);

}
myself.AddTimerEx(1051, 10 * 1000);

}
if (timer_id == 1052) {
myself.LookNeighbor(1000);

}
if (timer_id == 9999) {
myself.AddTimerEx(9999, 120 * 1000);

}
if (timer_id == 1001) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(277020673)) == 11) {
myself.AddUseSkillDesire(myself.sm, 278003713, 1, 1, 10000000);

}
if (gg.Rand(40) < 1) {
i2 = gg.Rand(14) + 1;
if (i2 == 1) {
myself.i_ai1 = 53950;
myself.i_ai2 = 219860;
myself.i_ai3 = -3488;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

} else if (i2 == 2) {
myself.i_ai1 = 55980;
myself.i_ai2 = 219820;
myself.i_ai3 = -3488;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

} else if (i2 == 3) {
myself.i_ai1 = 54950;
myself.i_ai2 = 218790;
myself.i_ai3 = -3488;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

} else if (i2 == 4) {
myself.i_ai1 = 55970;
myself.i_ai2 = 217770;
myself.i_ai3 = -3488;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

} else if (i2 == 5) {
myself.i_ai1 = 53930;
myself.i_ai2 = 217760;
myself.i_ai3 = -3488;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

} else if (i2 == 6) {
myself.i_ai1 = 55970;
myself.i_ai2 = 217770;
myself.i_ai3 = -3216;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

} else if (i2 == 7) {
myself.i_ai1 = 55980;
myself.i_ai2 = 219920;
myself.i_ai3 = -3216;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

} else if (i2 == 8) {
myself.i_ai1 = 54960;
myself.i_ai2 = 218790;
myself.i_ai3 = -3216;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

} else if (i2 == 9) {
myself.i_ai1 = 53950;
myself.i_ai2 = 219860;
myself.i_ai3 = -3216;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

} else if (i2 == 10) {
myself.i_ai1 = 53930;
myself.i_ai2 = 217760;
myself.i_ai3 = -3216;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

} else if (i2 == 11) {
myself.i_ai1 = 55970;
myself.i_ai2 = 217770;
myself.i_ai3 = -2944;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

} else if (i2 == 12) {
myself.i_ai1 = 55980;
myself.i_ai2 = 219920;
myself.i_ai3 = -2944;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

} else if (i2 == 13) {
myself.i_ai1 = 54960;
myself.i_ai2 = 218790;
myself.i_ai3 = -2944;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

} else if (i2 == 14) {
myself.i_ai1 = 53950;
myself.i_ai2 = 219860;
myself.i_ai3 = -2944;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

} else if (i2 == 15) {
myself.i_ai1 = 53930;
myself.i_ai2 = 217760;
myself.i_ai3 = -2944;
myself.i_ai1 = myself.i_ai1 + gg.Rand(650);
myself.i_ai2 = myself.i_ai2 + gg.Rand(650);

}
myself.AddUseSkillDesire(myself.sm, 276692993, 1, 1, 10000000);

}
if (myself.i_quest3 == 1 && myself.GetCurrentTick() > myself.i_quest4 + 60 * 5) {
myself.MPCC_SetMasterPartyRouting(myself.int_list.Get(0), myself.sm, 0);
myself.int_list.Clear();
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800008, "", "", "", "", ""));
myself.i_quest3 = 0;

}
myself.AddTimerEx(1001, 30 * 1000);

}
if (timer_id == 1002) {
myself.i_quest0 = 0;
myself.AddUseSkillDesire(myself.sm, 276692993, 1, 1, 10000000);
myself.i_ai0 = 0;

}
if (timer_id == 1003) {
if (myself.i_ai4 == 1) {
for (i0 = 2; i0 <= 15; i0 = i0 + 1) {
for (i1 = 1; i1 <= 1; i1 = i1 + 1) {
if (i0 == 1) {
i2 = 53950;
i3 = 219860;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 2) {
i2 = 55980;
i3 = 219820;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 3) {
i2 = 54950;
i3 = 218790;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 4) {
i2 = 55970;
i3 = 217770;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 5) {
i2 = 53930;
i3 = 217760;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 6) {
i2 = 55970;
i3 = 217770;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 7) {
i2 = 55980;
i3 = 219920;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 8) {
i2 = 54960;
i3 = 218790;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 9) {
i2 = 53950;
i3 = 219860;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 10) {
i2 = 53930;
i3 = 217760;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 11) {
i2 = 55970;
i3 = 217770;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 12) {
i2 = 55980;
i3 = 219920;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 13) {
i2 = 54960;
i3 = 218790;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 14) {
i2 = 53950;
i3 = 219860;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 15) {
i2 = 53930;
i3 = 217760;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

}
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, i2, i3, i4, gg.Rand(360), 0, 0, 0);

}

}
myself.i_ai4 = 2;
myself.AddTimerEx(1003, 1700);

} else if (myself.i_ai4 == 2) {
for (i0 = 2; i0 <= 15; i0 = i0 + 1) {
for (i1 = 1; i1 <= 1; i1 = i1 + 1) {
if (i0 == 1) {
i2 = 53950;
i3 = 219860;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 2) {
i2 = 55980;
i3 = 219820;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 3) {
i2 = 54950;
i3 = 218790;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 4) {
i2 = 55970;
i3 = 217770;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 5) {
i2 = 53930;
i3 = 217760;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 6) {
i2 = 55970;
i3 = 217770;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 7) {
i2 = 55980;
i3 = 219920;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 8) {
i2 = 54960;
i3 = 218790;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 9) {
i2 = 53950;
i3 = 219860;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 10) {
i2 = 53930;
i3 = 217760;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 11) {
i2 = 55970;
i3 = 217770;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 12) {
i2 = 55980;
i3 = 219920;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 13) {
i2 = 54960;
i3 = 218790;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 14) {
i2 = 53950;
i3 = 219860;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 15) {
i2 = 53930;
i3 = 217760;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

}
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, i2, i3, i4, gg.Rand(360), 0, 0, 0);

}

}
myself.i_ai4 = 3;
myself.AddTimerEx(1003, 1700);

} else if (myself.i_ai4 == 3) {
for (i0 = 2; i0 <= 15; i0 = i0 + 1) {
for (i1 = 1; i1 <= 2; i1 = i1 + 1) {
if (i0 == 1) {
i2 = 53950;
i3 = 219860;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 2) {
i2 = 55980;
i3 = 219820;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 3) {
i2 = 54950;
i3 = 218790;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 4) {
i2 = 55970;
i3 = 217770;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 5) {
i2 = 53930;
i3 = 217760;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 6) {
i2 = 55970;
i3 = 217770;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 7) {
i2 = 55980;
i3 = 219920;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 8) {
i2 = 54960;
i3 = 218790;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 9) {
i2 = 53950;
i3 = 219860;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 10) {
i2 = 53930;
i3 = 217760;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 11) {
i2 = 55970;
i3 = 217770;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 12) {
i2 = 55980;
i3 = 219920;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 13) {
i2 = 54960;
i3 = 218790;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 14) {
i2 = 53950;
i3 = 219860;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 15) {
i2 = 53930;
i3 = 217760;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

}
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, i2, i3, i4, gg.Rand(360), 0, 0, 0);

}

}
myself.i_ai4 = 4;
myself.AddTimerEx(1003, 1700);

} else if (myself.i_ai4 == 4) {
for (i0 = 2; i0 <= 15; i0 = i0 + 1) {
for (i1 = 1; i1 <= 5; i1 = i1 + 1) {
if (i0 == 1) {
i2 = 53950;
i3 = 219860;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 2) {
i2 = 55980;
i3 = 219820;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 3) {
i2 = 54950;
i3 = 218790;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 4) {
i2 = 55970;
i3 = 217770;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 5) {
i2 = 53930;
i3 = 217760;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 6) {
i2 = 55970;
i3 = 217770;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 7) {
i2 = 55980;
i3 = 219920;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 8) {
i2 = 54960;
i3 = 218790;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 9) {
i2 = 53950;
i3 = 219860;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 10) {
i2 = 53930;
i3 = 217760;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 11) {
i2 = 55970;
i3 = 217770;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 12) {
i2 = 55980;
i3 = 219920;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 13) {
i2 = 54960;
i3 = 218790;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 14) {
i2 = 53950;
i3 = 219860;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i0 == 15) {
i2 = 53930;
i3 = 217760;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

}
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, i2, i3, i4, gg.Rand(360), 0, 0, 0);

}

}
myself.i_ai4 = 5;
myself.AddTimerEx(1003, 1700);

} else if (myself.i_ai4 == 5) {
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 52675, 219371, -3290, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 52687, 219596, -3368, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 52672, 219740, -3418, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 52857, 219992, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 52959, 219997, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 53381, 220151, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 54236, 220948, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 54885, 220144, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 55264, 219860, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 55399, 220263, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 55679, 220129, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 56276, 220783, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 57173, 220234, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 56267, 218826, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 56294, 219482, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 56094, 219113, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 56364, 218967, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 57113, 218079, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 56186, 217153, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 55440, 218081, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 55202, 217940, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 55225, 218236, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 54973, 218075, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 53412, 218077, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 54226, 218797, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 54394, 219067, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 54139, 219253, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 54262, 219480, -3488, gg.Rand(360), 0, 0, 0);
myself.i_ai4 = 6;
myself.AddTimerEx(1003, 1700);

} else if (myself.i_ai4 == 6) {
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 53412, 218077, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 54413, 217132, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 54841, 217132, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 55372, 217128, -3343, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 55893, 217122, -3488, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 56282, 217237, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 56963, 218080, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 56267, 218826, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 56294, 219482, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 56094, 219113, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 56364, 218967, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 56276, 220783, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 57173, 220234, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 54885, 220144, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 55264, 219860, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 55399, 220263, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 55679, 220129, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 54236, 220948, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 54464, 219095, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 54226, 218797, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 54394, 219067, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 54139, 219253, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 54262, 219480, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 53412, 218077, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 55440, 218081, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 55202, 217940, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 55225, 218236, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 54973, 218075, -3216, gg.Rand(360), 0, 0, 0);
myself.i_ai4 = 7;
myself.AddTimerEx(1003, 1700);

} else if (myself.i_ai4 == 7) {
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 54228, 217504, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 54181, 217168, -3216, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 54714, 217123, -3168, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 55298, 217127, -3073, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 55787, 217130, -2993, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 56284, 217216, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 56963, 218080, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 56267, 218826, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 56294, 219482, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 56094, 219113, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 56364, 218967, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 56276, 220783, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 57173, 220234, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 54885, 220144, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 55264, 219860, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 55399, 220263, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 55679, 220129, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 54236, 220948, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 54464, 219095, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 54226, 218797, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029024, "vale_master_b", 0, 0, 54394, 219067, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 54139, 219253, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029023, "doll_blader_b", 0, 0, 54262, 219480, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 53412, 218077, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 54280, 217200, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 55440, 218081, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029026, "pirates_zombie_captain_b", 0, 0, 55202, 217940, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 55225, 218236, -2944, gg.Rand(360), 0, 0, 0);
myself.CreateOnePrivateEx(1029027, "pirates_zombie_b", 0, 0, 54973, 218075, -2944, gg.Rand(360), 0, 0, 0);
myself.i_ai4 = 8;

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
if (skill_name_id == 276692993) {
myself.InstantTeleport(myself.sm, myself.i_ai1, myself.i_ai2, myself.i_ai3);
myself.RemoveAllAttackDesire();

} else if (skill_name_id == 276299777) {
i1 = gg.Rand(14) + 1;
if (i1 == 1) {
i2 = 53950;
i3 = 219860;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 2) {
i2 = 55980;
i3 = 219820;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 3) {
i2 = 54950;
i3 = 218790;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 4) {
i2 = 55970;
i3 = 217770;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 5) {
i2 = 53930;
i3 = 217760;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 6) {
i2 = 55970;
i3 = 217770;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 7) {
i2 = 55980;
i3 = 219920;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 8) {
i2 = 54960;
i3 = 218790;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 9) {
i2 = 53950;
i3 = 219860;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 10) {
i2 = 53930;
i3 = 217760;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 11) {
i2 = 55970;
i3 = 217770;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 12) {
i2 = 55980;
i3 = 219920;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 13) {
i2 = 54960;
i3 = 218790;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 14) {
i2 = 53950;
i3 = 219860;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 15) {
i2 = 53930;
i3 = 217760;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

}
myself.InstantTeleport(target, i2, i3, i4);
myself.RemoveAttackDesire(target.id);

} else if (skill_name_id == 276365313) {
i1 = gg.Rand(14) + 1;
if (i1 == 1) {
i2 = 53950;
i3 = 219860;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 2) {
i2 = 55980;
i3 = 219820;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 3) {
i2 = 54950;
i3 = 218790;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 4) {
i2 = 55970;
i3 = 217770;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 5) {
i2 = 53930;
i3 = 217760;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 6) {
i2 = 55970;
i3 = 217770;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 7) {
i2 = 55980;
i3 = 219920;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 8) {
i2 = 54960;
i3 = 218790;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 9) {
i2 = 53950;
i3 = 219860;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 10) {
i2 = 53930;
i3 = 217760;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 11) {
i2 = 55970;
i3 = 217770;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 12) {
i2 = 55980;
i3 = 219920;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 13) {
i2 = 54960;
i3 = 218790;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 14) {
i2 = 53950;
i3 = 219860;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 15) {
i2 = 53930;
i3 = 217760;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

}
myself.InstantTeleport(target, i2, i3, i4);
myself.RemoveAttackDesire(target.id);
if (myself.i_quest0 > 0 && myself.c_quest0 != target && myself.c_quest0.z > target.z - 100 && myself.c_quest0.z < target.z + 100) {
if (myself.c_quest0.x - target.x * myself.c_quest0.x - target.x + myself.c_quest0.y - target.y * myself.c_quest0.y - target.y > 250 * 250) {
i0 = 1;

} else {
i0 = 0;

}
if (i0 == 0) {
i1 = gg.Rand(14) + 1;
if (i1 == 1) {
i2 = 53950;
i3 = 219860;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 2) {
i2 = 55980;
i3 = 219820;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 3) {
i2 = 54950;
i3 = 218790;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 4) {
i2 = 55970;
i3 = 217770;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 5) {
i2 = 53930;
i3 = 217760;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 6) {
i2 = 55970;
i3 = 217770;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 7) {
i2 = 55980;
i3 = 219920;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 8) {
i2 = 54960;
i3 = 218790;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 9) {
i2 = 53950;
i3 = 219860;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 10) {
i2 = 53930;
i3 = 217760;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 11) {
i2 = 55970;
i3 = 217770;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 12) {
i2 = 55980;
i3 = 219920;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 13) {
i2 = 54960;
i3 = 218790;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 14) {
i2 = 53950;
i3 = 219860;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 15) {
i2 = 53930;
i3 = 217760;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

}
myself.InstantTeleport(myself.c_quest0, i2, i3, i4);
myself.RemoveAttackDesire(myself.c_quest0.id);

}

}
if (myself.i_quest0 > 1 && myself.c_quest1 != target && myself.c_quest1.z > target.z - 100 && myself.c_quest1.z < target.z + 100) {
if (myself.c_quest1.x - target.x * myself.c_quest1.x - target.x + myself.c_quest1.y - target.y * myself.c_quest1.y - target.y > 250 * 250) {
i0 = 1;

} else {
i0 = 0;

}
if (i0 == 0) {
i1 = gg.Rand(14) + 1;
if (i1 == 1) {
i2 = 53950;
i3 = 219860;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 2) {
i2 = 55980;
i3 = 219820;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 3) {
i2 = 54950;
i3 = 218790;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 4) {
i2 = 55970;
i3 = 217770;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 5) {
i2 = 53930;
i3 = 217760;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 6) {
i2 = 55970;
i3 = 217770;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 7) {
i2 = 55980;
i3 = 219920;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 8) {
i2 = 54960;
i3 = 218790;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 9) {
i2 = 53950;
i3 = 219860;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 10) {
i2 = 53930;
i3 = 217760;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 11) {
i2 = 55970;
i3 = 217770;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 12) {
i2 = 55980;
i3 = 219920;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 13) {
i2 = 54960;
i3 = 218790;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 14) {
i2 = 53950;
i3 = 219860;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 15) {
i2 = 53930;
i3 = 217760;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

}
myself.InstantTeleport(myself.c_quest1, i2, i3, i4);
myself.RemoveAttackDesire(myself.c_quest1.id);

}

}
if (myself.i_quest0 > 2 && myself.c_quest2 != target && myself.c_quest2.z > target.z - 100 && myself.c_quest2.z < target.z + 100) {
if (myself.c_quest2.x - target.x * myself.c_quest2.x - target.x + myself.c_quest2.y - target.y * myself.c_quest2.y - target.y > 250 * 250) {
i0 = 1;

} else {
i0 = 0;

}
if (i0 == 0) {
i1 = gg.Rand(14) + 1;
if (i1 == 1) {
i2 = 53950;
i3 = 219860;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 2) {
i2 = 55980;
i3 = 219820;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 3) {
i2 = 54950;
i3 = 218790;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 4) {
i2 = 55970;
i3 = 217770;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 5) {
i2 = 53930;
i3 = 217760;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 6) {
i2 = 55970;
i3 = 217770;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 7) {
i2 = 55980;
i3 = 219920;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 8) {
i2 = 54960;
i3 = 218790;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 9) {
i2 = 53950;
i3 = 219860;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 10) {
i2 = 53930;
i3 = 217760;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 11) {
i2 = 55970;
i3 = 217770;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 12) {
i2 = 55980;
i3 = 219920;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 13) {
i2 = 54960;
i3 = 218790;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 14) {
i2 = 53950;
i3 = 219860;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 15) {
i2 = 53930;
i3 = 217760;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

}
myself.InstantTeleport(myself.c_quest2, i2, i3, i4);
myself.RemoveAttackDesire(myself.c_quest2.id);

}

}
if (myself.i_quest0 > 3 && myself.c_quest3 != target && myself.c_quest3.z > target.z - 100 && myself.c_quest3.z < target.z + 100) {
if (myself.c_quest3.x - target.x * myself.c_quest3.x - target.x + myself.c_quest3.y - target.y * myself.c_quest3.y - target.y > 250 * 250) {
i0 = 1;

} else {
i0 = 0;

}
if (i0 == 0) {
i1 = gg.Rand(14) + 1;
if (i1 == 1) {
i2 = 53950;
i3 = 219860;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 2) {
i2 = 55980;
i3 = 219820;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 3) {
i2 = 54950;
i3 = 218790;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 4) {
i2 = 55970;
i3 = 217770;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 5) {
i2 = 53930;
i3 = 217760;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 6) {
i2 = 55970;
i3 = 217770;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 7) {
i2 = 55980;
i3 = 219920;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 8) {
i2 = 54960;
i3 = 218790;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 9) {
i2 = 53950;
i3 = 219860;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 10) {
i2 = 53930;
i3 = 217760;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 11) {
i2 = 55970;
i3 = 217770;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 12) {
i2 = 55980;
i3 = 219920;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 13) {
i2 = 54960;
i3 = 218790;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 14) {
i2 = 53950;
i3 = 219860;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 15) {
i2 = 53930;
i3 = 217760;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

}
myself.InstantTeleport(myself.c_quest3, i2, i3, i4);
myself.RemoveAttackDesire(myself.c_quest3.id);

}

}
if (myself.i_quest0 > 4 && myself.c_quest4 != target && myself.c_quest4.z > target.z - 100 && myself.c_quest4.z < target.z + 100) {
if (myself.c_quest4.x - target.x * myself.c_quest4.x - target.x + myself.c_quest4.y - target.y * myself.c_quest4.y - target.y > 250 * 250) {
i0 = 1;

} else {
i0 = 0;

}
if (i0 == 0) {
i1 = gg.Rand(14) + 1;
if (i1 == 1) {
i2 = 53950;
i3 = 219860;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 2) {
i2 = 55980;
i3 = 219820;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 3) {
i2 = 54950;
i3 = 218790;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 4) {
i2 = 55970;
i3 = 217770;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 5) {
i2 = 53930;
i3 = 217760;
i4 = -3488;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 6) {
i2 = 55970;
i3 = 217770;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 7) {
i2 = 55980;
i3 = 219920;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 8) {
i2 = 54960;
i3 = 218790;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 9) {
i2 = 53950;
i3 = 219860;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 10) {
i2 = 53930;
i3 = 217760;
i4 = -3216;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 11) {
i2 = 55970;
i3 = 217770;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 12) {
i2 = 55980;
i3 = 219920;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 13) {
i2 = 54960;
i3 = 218790;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 14) {
i2 = 53950;
i3 = 219860;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 15) {
i2 = 53930;
i3 = 217760;
i4 = -2944;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

}
myself.InstantTeleport(myself.c_quest4, i2, i3, i4);
myself.RemoveAttackDesire(myself.c_quest4.id);

}

}

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (attacker.level <= myself.sm.level + 8) {
if (myself.GetTimeHour() < 5) {
if (myself.p_state == 1 && myself.i_ai0 == 0 && damage < 10 && gg.Rand(Rand * 15) < 1) {
myself.i_ai0 = 1;
myself.i_ai1 = gg.FloatToInt(private.x);
myself.i_ai2 = gg.FloatToInt(private.y);
myself.i_ai3 = gg.FloatToInt(private.z);
myself.AddTimerEx(1002, 300);

}

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.CreateOnePrivateEx(private.npc_class_id, private.ai, 0, 30 + gg.Rand(60), private.weight_point, private.respawn_time, private.flag, gg.Rand(360), 0, 0, 0);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0) {
if (creature.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(different_level_9_attacked)) == -1) {
if (different_level_9_attacked == 295895041) {
myself.CastBuffForQuestReward(creature, different_level_9_attacked);
myself.RemoveAttackDesire(creature.id);
return;

} else {
myself.CastBuffForQuestReward(creature, different_level_9_attacked);

}

}

}
if (creature.z > myself.sm.z - 100 && creature.z < myself.sm.z + 100) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}
if (myself.i_quest0 < 5 && gg.Rand(3) < 1) {
if (myself.i_quest0 == 0) {
myself.c_quest0 = creature;

} else if (myself.i_quest0 == 1) {
myself.c_quest1 = creature;

} else if (myself.i_quest0 == 2) {
myself.c_quest2 = creature;

} else if (myself.i_quest0 == 3) {
myself.c_quest3 = creature;

} else if (myself.i_quest0 == 4) {
myself.c_quest4 = creature;

}
myself.i_quest0 = myself.i_quest0 + 1;

}
if (gg.Rand(15) < 1) {
if (gg.Rand(3) < 2) {
if (creature == myself.top_desire_target) {
myself.AddUseSkillDesire(creature, 276561921, 0, 1, 1000000);

}

} else {
i0 = gg.Rand(Rand * 3);
if (i0 < 1) {
myself.AddUseSkillDesire(creature, 276299777, 0, 1, 1000000);

} else if (i0 < 2) {
myself.AddUseSkillDesire(creature, 276365313, 0, 1, 1000000);

} else if (i0 < 12) {
myself.AddUseSkillDesire(creature, 276496385, 0, 1, 1000000);

} else if (i0 < 18) {
myself.AddUseSkillDesire(creature, 276430849, 0, 1, 1000000);

} else if (i0 < 45) {
if (creature != myself.top_desire_target && myself.DistFromMe(creature) < 100) {
myself.AddUseSkillDesire(myself.sm, 276627457, 0, 1, 1000000);

}

}

}

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i2, HandlerParam i0, HandlerParam c1, HandlerParam i1) {
myself.i_quest4 = myself.GetCurrentTick();
if (myself.i_quest3 == 0) {
i1 = myself.MPCC_GetMPCCId(attacker);
c1 = myself.MPCC_GetMaster(i1);
if (myself.IsNullCreature(c1) == 0 && attacker.builder_level > 0 && attacker.builder_level <= 3 && myself.MPCC_GetMemberCount(i1) >= 1) {
myself.MPCC_SetMasterPartyRouting(i1, myself.sm, 1);
myself.int_list.Add(i1);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800004, c1.name, "", "", "", ""));

} else if (myself.IsNullCreature(c1) == 0 && myself.MPCC_GetMemberCount(i1) >= 36) {
myself.MPCC_SetMasterPartyRouting(i1, myself.sm, 1);
myself.int_list.Add(i0);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800004, c1.name, "", "", "", ""));

}
myself.i_quest3 = 1;

}
if (attacker.yongma_type == 1 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(279052289)) <= 0) {
if (myself.Skill_GetConsumeMP(279052289) < myself.sm.mp && myself.Skill_GetConsumeHP(279052289) < myself.sm.hp && myself.Skill_InReuseDelay(279052289) == 0) {
myself.AddUseSkillDesire(attacker, 279052289, 0, 1, 1000000);

}

}
if (attacker.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(different_level_9_attacked)) == -1) {
if (different_level_9_attacked == 295895041) {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);
myself.RemoveAttackDesire(attacker.id);
return;

} else {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);

}

}

} else {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 20000);

}
if (gg.Rand(10) < 1 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Rand(3) < 2) {
if (attacker == myself.top_desire_target) {
myself.AddUseSkillDesire(attacker, 276561921, 0, 1, 1000000);

}

} else {
i0 = gg.Rand(Rand * 3);
if (i0 < 1) {
myself.AddUseSkillDesire(attacker, 276299777, 0, 1, 1000000);

} else if (i0 < 2) {
myself.AddUseSkillDesire(attacker, 276365313, 0, 1, 1000000);

} else if (i0 < 12) {
myself.AddUseSkillDesire(attacker, 276496385, 0, 1, 1000000);

} else if (i0 < 18) {
myself.AddUseSkillDesire(attacker, 276430849, 0, 1, 1000000);

} else if (i0 < 45) {
if (attacker != myself.top_desire_target && myself.DistFromMe(attacker) < 100) {
myself.AddUseSkillDesire(myself.sm, 276627457, 0, 1, 1000000);

}

}

}

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0) {
if (speller.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(different_level_9_see_spelled)) == -1) {
if (different_level_9_see_spelled == 295895041) {
myself.CastBuffForQuestReward(speller, different_level_9_see_spelled);
myself.RemoveAttackDesire(speller.id);
return;

} else {
myself.CastBuffForQuestReward(speller, different_level_9_see_spelled);

}

}

}
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
myself.AddAttackDesire(speller, 1, myself.Skill_GetEffectPoint(skill_name_id) / myself.sm.max_hp * 10 * 150);

}
if (gg.Rand(12) < 1) {
if (gg.Rand(3) < 2) {
if (speller == myself.top_desire_target) {
myself.AddUseSkillDesire(speller, 276561921, 0, 1, 1000000);

}

} else {
i0 = gg.Rand(Rand * 3);
if (i0 < 1) {
myself.AddUseSkillDesire(speller, 276299777, 0, 1, 1000000);

} else if (i0 < 2) {
myself.AddUseSkillDesire(speller, 276365313, 0, 1, 1000000);

} else if (i0 < 12) {
myself.AddUseSkillDesire(speller, 276496385, 0, 1, 1000000);

} else if (i0 < 18) {
myself.AddUseSkillDesire(speller, 276430849, 0, 1, 1000000);

} else if (i0 < 45) {
if (speller != myself.top_desire_target && myself.DistFromMe(speller) < 100) {
myself.AddUseSkillDesire(myself.sm, 276627457, 0, 1, 1000000);

}

}

}

}
	}

	protected void MY_DYING() {
myself.EffectMusic(myself.sm, 10000, "BS02_D");
myself.InstantZone_MarkRestriction();
myself.InstantZone_Finish(5);
	}


}