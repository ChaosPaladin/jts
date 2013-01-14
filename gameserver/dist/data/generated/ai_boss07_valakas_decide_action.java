package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss07_valakas_decide_action extends ai_boss07_valakas_set_db {
	protected String FleePoints = "" ;
	protected String PrivatePosList1 = "" ;
	protected String PrivatePosList2 = "" ;
	protected int TID_ARMOUR_BREAKING = 78002;
	protected int TIME_ARMOUR_BREAKING = 2;
	protected int TID_BERSERK = 78003;
	protected int TIME_BERSERK = 2;
	protected int ARMOUR_BREAKING_STANBY_MODE = 1;
	protected int ARMOUR_BREAKING_MODE = 2;
	protected int BERSERK_STANBY_MODE = -1;
	protected int BERSERK_MODE = -2;

	protected void CREATED(HandlerParam reply) {
super;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = myself.GetCurrentTick();
myself.i_quest4 = 0;
if (myself.sm.db_value == 3) {
myself.AddMoveAroundDesire(5, 5);
myself.AddTimerEx(1002, 60 * 1000);
myself.AddTimerEx(TID_TANKER_HATE_CHECK, TIME_TANKER_HATE_CHECK * 60 * 1000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam i1, HandlerParam plist0, HandlerParam pos0) {
super;
if (myself.sm.db_value == 0 && myself.sm.alive == 1 && attacker.is_pc == 1) {
myself.InstantTeleport(attacker, 150037, -57255, -2976);

}
myself.i_quest1 = myself.GetCurrentTick();
myself.i_ai4 = myself.i_ai4 + damage;
if (myself.GetDirection(attacker) > 180 - 30 && myself.GetDirection(attacker) < 180 + 30) {
if (myself.i_quest0 == 0) {
myself.i_ai3 = myself.i_ai3 + damage;

}

}
if (myself.i_quest0 == 0) {
if (gg.FloatToInt(myself.i_ai4 / myself.sm.max_hp * 100) > 1) {
if (myself.i_ai3 > myself.i_ai4 / 2) {
myself.i_ai3 = 0;
myself.i_ai4 = 0;
if (myself.Skill_GetConsumeMP(ReadyRearAttack) < myself.sm.mp && myself.Skill_GetConsumeHP(ReadyRearAttack) < myself.sm.hp && myself.Skill_InReuseDelay(ReadyRearAttack) == 0) {
myself.AddUseSkillDesire(myself.sm, ReadyRearAttack, 1, 1, 1000000);

}
myself.i_quest0 = 1;

}

}

}
if (myself.IsNullCreature(attacker) == 0) {
if (myself.IsInCategory(112, attacker.occupation) != 1 && gg.Rand(10000) == 0 || babble_mode && gg.Rand(10) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(384368641)) <= 0) {
if (myself.i_quest4 == BERSERK_MODE || myself.i_quest4 == BERSERK_STANBY_MODE || myself.i_quest4 == ARMOUR_BREAKING_MODE) {
return;

} else if (myself.i_quest4 == ARMOUR_BREAKING_STANBY_MODE) {
myself.i_quest4 = 0;
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1801076, "", "", "", "", ""));
if (babble_mode) {
myself.Shout("아머브레이킹 취소:" + myself.i_quest4);

}

} else {
myself.i_quest4 = BERSERK_STANBY_MODE;
myself.AddTimerEx(TID_BERSERK, TIME_BERSERK + gg.Rand(TIME_BERSERK) * 60 * 1000);
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1801074, "", "", "", "", ""));
if (babble_mode) {
myself.Shout("광폭화 대기:" + myself.i_quest4);

}

}

} else if (myself.IsInCategory(112, attacker.occupation) == 1 && gg.Rand(1000) == 0 || babble_mode && gg.Rand(5) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(384303105)) <= 0) {
if (myself.i_quest4 == ARMOUR_BREAKING_MODE || myself.i_quest4 == ARMOUR_BREAKING_STANBY_MODE || myself.i_quest4 == BERSERK_MODE) {
return;

} else if (myself.i_quest4 == BERSERK_STANBY_MODE) {
myself.i_quest4 = 0;
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1801073, "", "", "", "", ""));
if (babble_mode) {
myself.Shout("광폭화 취소:" + myself.i_quest4);

}

} else {
myself.i_quest4 = ARMOUR_BREAKING_STANBY_MODE;
myself.AddTimerEx(TID_ARMOUR_BREAKING, TIME_ARMOUR_BREAKING + gg.Rand(TIME_ARMOUR_BREAKING) * 60 * 1000);
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1801071, "", "", "", "", ""));
if (babble_mode) {
myself.Shout("아머브레이킹 대기:" + myself.i_quest4);

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam h0) {
super;
if (timer_id == 1002) {
if (myself.sm.db_value == 3) {
if (myself.GetCurrentTick() - myself.i_quest1 > 15 * 60) {
myself.MPCC_SetMasterPartyRouting(myself.int_list.Get(0), myself.sm, 0);
myself.int_list.Clear();
myself.SetDBValue(myself.sm, 0);
myself.RemoveAllDesire();
myself.StopMove();
myself.InstantTeleportInMyTerritory(150037, -57255, -2976, 150);
myself.InstantTeleport(myself.sm, -105200, -253104, -15264);

} else {
if (myself.sm.hp < myself.sm.max_hp * 1.000000 / 5.000000) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(307429381)) < 15) {
myself.AddUseSkillDesire(myself.sm, 307429381, 0, 1, 100000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 2.000000 / 5.000000) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(307429380)) < 14) {
myself.AddUseSkillDesire(myself.sm, 307429380, 0, 1, 100000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 3.000000 / 5.000000) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(307429379)) < 13) {
myself.AddUseSkillDesire(myself.sm, 307429379, 0, 1, 100000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 4.000000 / 5.000000) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(307429378)) < 12) {
myself.AddUseSkillDesire(myself.sm, 307429378, 0, 1, 100000000);

}

} else if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(307429377)) < 11) {
myself.AddUseSkillDesire(myself.sm, 307429377, 0, 1, 100000000);

}
myself.AddTimerEx(1002, 60 * 1000);

}

}

} else if (timer_id == TID_TANKER_HATE_CHECK && myself.sm.db_value == 3) {
if (babble_mode) {
myself.Shout("퍼스트본 체크!:" + myself.Maker_GetNpcCount());

}
if (myself.GetHateInfoCount() >= 5 || babble_mode) {
if (myself.GetHateInfoCount() < 5 && babble_mode) {
i1 = myself.GetHateInfoCount();

} else {
i1 = 5;

}
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.IsInCategory(5, h0.creature.occupation) != 1 && myself.Maker_GetNpcCount() < 100 && myself.DistFromMe(h0.creature) <= 8000) {
if (babble_mode) {
myself.Shout("퍼스트본 스폰!:" + myself.Maker_GetNpcCount());

}
myself.CreateOnePrivateEx(1029029, "ai_boss07_cannon", 0, 0, gg.FloatToInt(h0.creature.x) + gg.Rand(100), gg.FloatToInt(h0.creature.y) + gg.Rand(100), gg.FloatToInt(h0.creature.z), 0, h0.creature.id, 0, 0);

}

}

}
myself.AddTimerEx(TID_TANKER_HATE_CHECK, TIME_TANKER_HATE_CHECK * 60 * 1000);

} else if (timer_id == TID_BERSERK && myself.sm.db_value == 3 && myself.i_quest4 == BERSERK_STANBY_MODE && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(384368641)) <= 0) {
myself.i_quest4 = 0;
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1801075, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, 384368641, 0, 1, 1000000000000);
if (babble_mode) {
myself.Shout("광폭화 실행:" + myself.i_quest4);

}

} else if (timer_id == TID_ARMOUR_BREAKING && myself.sm.db_value == 3 && myself.i_quest4 == ARMOUR_BREAKING_STANBY_MODE && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(384303105)) <= 0) {
myself.i_quest4 = 0;
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1801072, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, 384303105, 0, 1, 1000000000000);
if (babble_mode) {
myself.Shout("아머브레이킹 실행:" + myself.i_quest4);

}

}
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam skill_id, HandlerParam skill_name_id, HandlerParam skill_level) {
super;
if (babble_mode) {
myself.Shout("이상상태 변경:" + skill_id + "/" + skill_level);

}
if (myself.sm.db_value == 3 && myself.i_quest4 == ARMOUR_BREAKING_MODE && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(384303105)) <= 0 || myself.i_quest4 == BERSERK_MODE && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(384368641)) <= 0) {
if (babble_mode) {
myself.Shout("이상상태 종료!" + skill_id + "/" + skill_level);

}
myself.i_quest4 = 0;

}
	}

	protected void NO_DESIRE() {
if (myself.sm.db_value == 3) {
if (myself.GetCurrentTick() - myself.i_quest1 > 20) {
myself.AddMoveAroundDesire(5, 5);

}

} else if (myself.sm.db_value == 0) {
myself.RemoveAllDesire();

}
	}


}