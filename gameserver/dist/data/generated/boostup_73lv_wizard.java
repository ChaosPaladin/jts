package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class boostup_73lv_wizard extends wizard_use_skill {
	protected int NextSpawn_Time = 0;
	protected int PC_Invisible_Time = 60000;
	protected int Skill01_id = 266403847;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.SetVisible(0);
myself.AddTimerEx(1000, 1 * 1000);
	}

	protected void CLAN_ATTACKED(HandlerParam attacker) {
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_id, HandlerParam i11) {
i11 = gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(330563587));
if (LongRangeGuardRate == -1 || skill_id == 28 || skill_id == 680 || skill_id == 51 || skill_id == 511 || skill_id == 15 || skill_id == 254 || skill_id == 1069 || skill_id == 1097 || skill_id == 1042 || skill_id == 1072 || skill_id == 1170 || skill_id == 352 || skill_id == 358 || skill_id == 1394 || skill_id == 695 || skill_id == 115 || skill_id == 1083 || skill_id == 1160 || skill_id == 1164 || skill_id == 1201 || skill_id == 1206 || skill_id == 1222 || skill_id == 1223 || skill_id == 1224 || skill_id == 1092 || skill_id == 65 || skill_id == 106 || skill_id == 122 || skill_id == 127 || skill_id == 1049 || skill_id == 1064 || skill_id == 1071 || skill_id == 1074 || skill_id == 1169 || skill_id == 1263 || skill_id == 1269 || skill_id == 352 || skill_id == 353 || skill_id == 1336 || skill_id == 1337 || skill_id == 1338 || skill_id == 1358 || skill_id == 1359 || skill_id == 402 || skill_id == 403 || skill_id == 412 || skill_id == 1386 || skill_id == 1394 || skill_id == 1396 || skill_id == 485 || skill_id == 501 || skill_id == 1445 || skill_id == 1446 || skill_id == 1447 || skill_id == 522 || skill_id == 531 || skill_id == 1481 || skill_id == 1482 || skill_id == 1483 || skill_id == 1484 || skill_id == 1485 || skill_id == 1486 || skill_id == 695 || skill_id == 696 || skill_id == 716 || skill_id == 775 || skill_id == 1511 || skill_id == 792 || skill_id == 1524 || skill_id == 1529) {

} else if (LongRangeGuardRate > 0) {
if (myself.DistFromMe(attacker) > 150) {
if (i11 <= 0 && gg.Rand(100) < LongRangeGuardRate) {
myself.AddUseSkillDesire(myself.sm, 330563587, 1, 1, 10000000000);

}

} else if (i11 <= 0) {

} else {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(330563587));

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.IsNullCreature(creature) == 1) {
return;

}
if (creature.is_pc == 1 && myself.i_ai0 == 0) {
myself.c_ai0 = creature;
myself.i_ai2 = myself.GetTick();
myself.i_ai0 = 1;
myself.AddTimerEx(2000, 1 * 1000);

}
if (creature.is_pc == 0 && creature.max_hp * 0.700000 > creature.hp) {
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(creature, Skill01_id, 1, 0, 1000000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
c0 = myself.c_ai0;
if (timer_id == 1000) {
myself.LookNeighbor(1000);
myself.AddTimerEx(1000, 5 * 1000);

}
if (timer_id == 2000) {
i0 = gg.Rand(3) + 1;
i1 = gg.Rand(6) + 1;
if (myself.GetTick() - myself.i_ai2 > i0 * i1 * 5000 && myself.i_ai3 == 0) {
myself.SetVisible(1);
myself.i_ai3 = 1;
myself.AddTimerEx(3000, 5000);
return;

}
myself.AddTimerEx(2000, 5 * 1000);

}
if (timer_id == 3000) {
if (gg.Rand(2) < 1) {
myself.AddUseSkillDesire(c0, Skill01_ID, 0, 0, 500000);

} else {
myself.AddUseSkillDesire(c0, Skill02_ID, 0, 0, 500000);

}
myself.AddTimerEx(3000, 10 * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 2316001) {

}
	}


}