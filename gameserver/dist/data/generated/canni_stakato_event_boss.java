package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class canni_stakato_event_boss extends combat_monster {
	protected int poor_box = 14833;
	protected int rich_box = 14834;
	protected int SPECIAL_BEHAVIOR_TIMER_1 = 4444;
	protected int SPECIAL_BEHAVIOR_TIMER_2 = 4400;
	protected int SPECIAL_BEHAVIOR_TIMER_3 = 4446;
	protected int DESPAWN_TIMER = 4448;
	protected int summon_display_skill = 272695297;
	protected int teleport_display_skill = 341966849;
	protected int special_aoe_skill = 277348359;
	protected int normal_aoe_skill = 277348364;
	protected int long_distance_stun = 270008330;
	protected int mass_slow = 408748033;
	protected int mass_slow_damage = 408813569;
	protected int party_recall_display = 408682497;
	protected int Max_Skill_Desire = 10000000;
	protected int Skill01_ID = 350617601;
	protected int Skill01_Probability = 20;
	protected int Skill01_Target_Type = 0;
	protected int Skill02_ID = 350748673;
	protected int Skill02_Probability = 10;
	protected int Skill02_Target_Type = 1;

	protected void CREATED(HandlerParam c0) {
c0 = gg.GetCreatureFromIndex(myself.sm.param3);
myself.i_quest9 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
if (myself.IsNullCreature(c0) == 0) {
if (myself.i_quest9) {
myself.Say("공격할 대상은 " + c0.name + " 입니다");

}
myself.c_ai4 = c0;
myself.AddTimerEx(2009, 1);

}
myself.AddTimerEx(SPECIAL_BEHAVIOR_TIMER_1, 30 * 1000);
myself.AddTimerEx(SPECIAL_BEHAVIOR_TIMER_2, 25 * 1000);
myself.AddTimerEx(DESPAWN_TIMER, 15 * 60 * 1000);
super;
	}

	protected void DEBUG_AI(HandlerParam reply) {
if (reply == 0) {
if (myself.i_quest9) {
myself.Say("Debug Mode : Off");

}
myself.i_quest9 = reply;

} else if (reply == 1) {
myself.Say("Debug Mode : On");
myself.i_quest9 = reply;

} else if (reply == 2) {

}
	}

	protected void ATTACKED(HandlerParam h0, HandlerParam i0) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) <= 66 && myself.i_ai1 == 0) {
myself.i_ai1 = 1;
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
myself.CreateOnePrivateEx(1022624, "canni_stakato_event_private", 0, 0, gg.FloatToInt(myself.sm.x) + 50 + gg.Rand(20) + gg.Rand(20), gg.FloatToInt(myself.sm.y) + 50 + gg.Rand(40), gg.FloatToInt(myself.sm.z), 0, 0, 0, gg.GetIndexFromCreature(h0.creature));
myself.CreateOnePrivateEx(1022624, "canni_stakato_event_private", 0, 0, gg.FloatToInt(myself.sm.x) - 50 - gg.Rand(40), gg.FloatToInt(myself.sm.y) - 50 - gg.Rand(20) - gg.Rand(20), gg.FloatToInt(myself.sm.z), 0, 0, 0, gg.GetIndexFromCreature(h0.creature));

}

}
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) <= 33 && myself.i_ai2 == 0) {
myself.AddTimerEx(SPECIAL_BEHAVIOR_TIMER_3, 1 * 1000);
myself.i_ai2 = 1;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam h0, HandlerParam c0, HandlerParam party0) {
if (timer_id == SPECIAL_BEHAVIOR_TIMER_1) {
if (myself.i_quest9) {
myself.Say("타이머 1 도달");

}
if (myself.i_ai0 == 1) {
i0 = myself.GetHateInfoCount();
if (i0 > 0) {
i1 = gg.Rand(i0);
h0 = myself.GetHateInfoByIndex(i1);

}
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.i_quest9) {
myself.Say("타이머 1 스킬 " + h0.creature.name + "! 니가 타겟이다.");

}
c0 = h0.creature;
myself.c_ai0 = c0;
if (myself.DistFromMe(c0) > 300) {
i0 = gg.Rand(100);
if (i0 < 70) {
if (myself.i_quest9) {
myself.Say("70% 확률 발동 소환 스킬 사용 ");

}
myself.AddUseSkillDesire(c0, summon_display_skill, 0, 1, Max_Skill_Desire);

} else {
if (myself.i_quest9) {
myself.Say("30% 확률 발동 텔레포트 스킬 사용 ");

}
myself.AddUseSkillDesire(myself.sm, teleport_display_skill, 0, 1, Max_Skill_Desire);

}

} else if (myself.i_quest9) {
myself.Say("잡은 타겟이 300 그리드 이내에 있어 타이머1을 건너뜁니다.");

}

}

}
myself.AddTimerEx(SPECIAL_BEHAVIOR_TIMER_1, 30 * 1000 + gg.Rand(5000));

} else if (timer_id == SPECIAL_BEHAVIOR_TIMER_2) {
if (myself.i_quest9) {
myself.Say("타이머 2 도달");

}
if (myself.i_ai0 == 1) {
i0 = myself.GetHateInfoCount();
if (i0 > 0) {
i1 = gg.Rand(i0);
h0 = myself.GetHateInfoByIndex(i1);

}
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.i_quest9) {
myself.Say("타이머 2 스킬 " + h0.creature.name + "! 니가 타겟이다.");

}
c0 = h0.creature;
if (myself.DistFromMe(c0) > 300) {
if (myself.i_quest9) {
myself.Say("거리가 300 그리드 이내라 타이머2 스킬 발사! ");

}
myself.AddUseSkillDesire(c0, long_distance_stun, 0, 1, Max_Skill_Desire);

}

}

}
myself.AddTimerEx(SPECIAL_BEHAVIOR_TIMER_2, 25 * 1000 + gg.Rand(3000));

} else if (timer_id == SPECIAL_BEHAVIOR_TIMER_3) {
if (myself.i_ai0 == 1) {
myself.Say(gg.MakeFString(1800880, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, party_recall_display, 0, 1, Max_Skill_Desire * 1000);

}
myself.AddTimerEx(SPECIAL_BEHAVIOR_TIMER_3, 45 * 1000 + gg.Rand(10000));

} else if (timer_id == 2009) {
myself.MakeAttackEvent(myself.c_ai4, basic_hate, 0);

} else if (timer_id == 9937) {
myself.AddUseSkillDesire(myself.sm, mass_slow, 0, 1, Max_Skill_Desire * 1000);

} else if (timer_id == DESPAWN_TIMER) {
myself.Say(gg.MakeFString(1800887, "", "", "", "", ""));
myself.AddTimerEx(9338, 60 * 1000);

} else if (timer_id == 9338) {
myself.Say(gg.MakeFString(1800888, "", "", "", "", ""));
myself.Despawn();

} else if (timer_id == 4498) {
myself.AddUseSkillDesire(myself.sm, mass_slow_damage, 0, 1, Max_Skill_Desire * 1000);

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam h0, HandlerParam i0, HandlerParam i10, HandlerParam i11) {
if (skill_name_id == summon_display_skill) {
myself.InstantTeleport(myself.c_ai0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z));
myself.AddUseSkillDesire(myself.sm, normal_aoe_skill, 0, 1, Max_Skill_Desire);

} else if (skill_name_id == teleport_display_skill) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.c_ai0.x), gg.FloatToInt(myself.c_ai0.y), gg.FloatToInt(myself.c_ai0.z));
myself.AddUseSkillDesire(myself.sm, special_aoe_skill, 0, 1, Max_Skill_Desire);

} else if (skill_name_id == party_recall_display) {
if (myself.i_quest9) {
myself.Say("파티 리콜 연출 완료");

}
i10 = myself.GetHateInfoCount();
if (i10 > 0) {
for (i11 = 0; i11 < i10; i11 = i11 + 1) {
h0 = myself.GetHateInfoByIndex(i11);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 > 0) {
if (myself.DistFromMe(h0.creature) < 2000) {
myself.InstantTeleport(h0.creature, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z));

}

}

}
myself.AddTimerEx(9937, 1 * 10);

}

} else if (skill_name_id == mass_slow) {
if (myself.i_quest9) {
myself.Say("매스 슬로우 사용 완료");

}
myself.AddTimerEx(4498, gg.Rand(1000) + 1);

} else if (skill_name_id == mass_slow_damage) {
if (myself.i_quest9) {
myself.Say("매스 슬로우 어스 퀘이크 사용 완료");

}

}
super;
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam maker0) {
c1 = myself.GetLastAttacker();
if (myself.IsNullCreature(c1)) {

} else {
if (c1.master) {
c1 = c1.master;

}
i1 = gg.Party_GetCount(c1);
if (i1 > 1) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = gg.Party_GetCreature(c1, i0);
if (myself.DistFromMe(c0) <= 1500) {
if (myself.sm.param2 == 0) {
myself.GiveItem1(c0, poor_box, 1);

} else if (myself.sm.param2 == 1) {
myself.GiveItem1(c0, rich_box, 1);

}

}

}

} else if (myself.DistFromMe(c1) <= 1500) {
if (myself.sm.param2 == 0) {
myself.GiveItem1(c1, poor_box, 1);

} else if (myself.sm.param2 == 1) {
myself.GiveItem1(c1, rich_box, 1);

}

}

}
super;
	}


}