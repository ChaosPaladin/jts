package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class boostup_73lv_guard extends warrior_use_skill {
	protected String AreaDataName = "default_area_name";
	protected String Privates = "";

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
if (myself.DistFromMe(attacker) <= 40) {
myself.AddAttackDesire(attacker, 0, 1000);

} else if (gg.Rand(100) < 33) {
if (gg.Rand(2) < 1) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, 500000);

} else {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 0, 500000);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker) {
if (myself.DistFromMe(attacker) <= 40) {
myself.AddAttackDesire(attacker, 0, 100);

} else if (gg.Rand(100) < 33) {
if (gg.Rand(2) < 1) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 0, 500000);

} else {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 0, 500000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
	}


}