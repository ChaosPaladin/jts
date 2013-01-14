package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_A_course extends raid_boss_standard {
	protected int trap_skill = 356515841;
	protected int SelfRangeDebuff_a = 274071561;
	protected int debuff = 274530313;
	protected String a_raid_doorname1 = "cyratal_cave_a_f";
	protected String a_raid_doorname2 = "cyratal_cave_a_g";
	protected int attack_weight_value = 100;

	protected void CREATED() {
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (myself.i_quest0 == 0) {
gg.Castle_GateOpenCloseEx(a_raid_doorname1, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(a_raid_doorname2, 1, myself.InstantZone_GetId());
if (gg.Rand(100) < 50) {
myself.BroadcastScriptEvent(12520, 1, 2000);

} else {
myself.BroadcastScriptEvent(12521, 1, 2000);

}
myself.i_quest0 = 1;

}
if (attacker.is_pc == 1) {
myself.c_ai0 = attacker;

}
if (myself.DistFromMe(attacker) > 200) {
myself.i_ai0 = myself.i_ai0 + damage;
myself.c_ai1 = attacker;
if (gg.Rand(33) < 1 && myself.i_ai3 == 0) {
myself.BroadcastScriptEvent(12522, 1, 3000);
if (myself.i_ai0 <= myself.i_ai1) {
myself.BroadcastScriptEvent(12523, 1, 2000);

} else if (gg.Rand(100) < 50) {
myself.BroadcastScriptEvent(12520, 1, 2000);

} else {
myself.BroadcastScriptEvent(12521, 1, 2000);

}
myself.RandomizeAttackDesire();
myself.i_ai3 = 1;
myself.i_quest1 = 1;
myself.AddTimerEx(2001, 60 * 1000);

}
if (gg.Rand(33) < 1 && myself.i_ai4 == 0) {
if (myself.i_ai0 <= myself.i_ai1) {
myself.AddUseSkillDesire(myself.sm, trap_skill, 0, 1, 1000000);
myself.i_ai2 = 1;
myself.i_ai4 = 1;
myself.i_quest1 = 2;
myself.AddTimerEx(2002, 30 * 1000);

}

}
myself.i_ai0 = 0;
myself.i_ai1 = 0;

} else {
myself.c_ai2 = attacker;
if (gg.Rand(75) < 1) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDebuff_a, 0, 1, 1000000);

}
if (gg.Rand(75) < 1 && myself.i_ai4 == 0) {
myself.AddUseSkillDesire(myself.sm, trap_skill, 0, 1, 1000000);
myself.i_ai2 = 2;
myself.i_ai4 = 1;
myself.i_quest1 = 2;
myself.AddTimerEx(2002, 30 * 1000);

}
myself.i_ai1 = myself.i_ai1 + damage;

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (gg.Rand(100) <= 5 && myself.i_ai4 == 0 && speller.is_pc != 0 && myself.IsInCategory(3, speller.occupation) != 0) {
myself.c_ai3 = speller;
myself.AddUseSkillDesire(myself.sm, trap_skill, 0, 1, 1000000);
myself.i_ai2 = 3;
myself.i_ai4 = 1;
myself.i_quest1 = 2;
myself.AddTimerEx(2002, 30 * 1000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam c1) {
if (timer_id == 2001) {
myself.i_ai3 = 0;

}
if (timer_id == 2002) {
myself.i_ai4 = 0;

}
if (timer_id == 2003) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDebuff_a, 0, 1, 1000000);

}

}
if (timer_id == 5001) {
i2 = 0;
if (myself.IsNullCreature(myself.c_ai0) == 0) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i0 = party0.member_count;
for (i1 = 0; i1 <= i0; i1 = i1 + 1) {
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c0) == 0) {
if (i2 <= 1 && gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(SelfRangeDebuff_a)) > 0) {
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(debuff)) < 0) {
myself.AddUseSkillDesire(c0, debuff, 0, 1, 1000000);
myself.RemoveAttackDesire(c0.id);
i2 = i2 + 1;

}

}

}

}

}

}

}
if (timer_id == 9002) {
if (gg.Rand(100) < 50) {
myself.BroadcastScriptEvent(12524, 1, 3000);

} else {
myself.BroadcastScriptEvent(12525, 1, 3000);

}

}
if (timer_id == 9003) {
if (gg.Rand(100) < 50) {
myself.BroadcastScriptEvent(12526, 1, 3000);

} else {
myself.BroadcastScriptEvent(12527, 1, 3000);

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0) {
if (skill_name_id == SelfRangeDebuff_a) {
myself.AddTimerEx(5001, gg.Rand(2) * 1000 + 1000);

}
if (skill_name_id == trap_skill) {
if (myself.i_quest1 == 2) {
if (myself.i_ai2 == 1) {
c0 = myself.c_ai1;

} else if (myself.i_ai2 == 2) {
c0 = myself.c_ai2;

} else if (myself.i_ai2 == 3) {
c0 = myself.c_ai3;

}
if (myself.IsNullCreature(c0) == 0) {
myself.AddTimerEx(2003, 5000);
if (gg.Rand(100) < 50) {
if (c0.x <= 153528 && c0.x >= 153216) {
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153528, 145188, -12584, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153538, 145504, -12584, 0, 2, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153546, 145807, -12584, 0, 3, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153545, 146110, -12584, 0, 4, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153539, 146416, -12584, 0, 5, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153539, 146720, -12584, 0, 6, 0, 0);

} else if (c0.x <= 153216 && c0.x >= 152912) {
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153216, 145188, -12584, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153216, 145504, -12584, 0, 2, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153216, 145807, -12584, 0, 3, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153216, 146110, -12584, 0, 4, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153216, 146416, -12584, 0, 5, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153216, 146720, -12584, 0, 6, 0, 0);

} else if (c0.x <= 152912 && c0.x >= 152608) {
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152912, 145188, -12584, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152912, 145504, -12584, 0, 2, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152912, 145807, -12584, 0, 3, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152912, 146110, -12584, 0, 4, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152912, 146416, -12584, 0, 5, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152912, 146720, -12584, 0, 6, 0, 0);

} else if (c0.x <= 152608 && c0.x >= 152304) {
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152608, 145188, -12584, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152608, 145504, -12584, 0, 2, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152608, 145807, -12584, 0, 3, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152608, 146110, -12584, 0, 4, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152608, 146416, -12584, 0, 5, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152608, 146720, -12584, 0, 6, 0, 0);

} else if (c0.x <= 152304 && c0.x >= 152000) {
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152304, 145188, -12584, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152304, 145504, -12584, 0, 2, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152304, 145807, -12584, 0, 3, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152304, 146110, -12584, 0, 4, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152304, 146416, -12584, 0, 5, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152304, 146720, -12584, 0, 6, 0, 0);

} else if (c0.x <= 152000) {
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152000, 145188, -12584, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152000, 145504, -12584, 0, 2, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152000, 145807, -12584, 0, 3, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152000, 153545, -12584, 0, 4, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152000, 146416, -12584, 0, 5, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152000, 146720, -12584, 0, 6, 0, 0);

}
myself.AddTimerEx(9002, 3000);

} else {
if (c0.y >= 145188 && c0.y <= 145504) {
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153528, 145188, -12584, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153216, 145188, -12584, 0, 2, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152912, 145188, -12584, 0, 3, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152608, 145188, -12584, 0, 4, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152304, 145188, -12584, 0, 5, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152000, 145188, -12584, 0, 6, 0, 0);

} else if (c0.y >= 145504 && c0.y <= 145807) {
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153538, 145504, -12584, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153216, 145504, -12584, 0, 2, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152912, 145504, -12584, 0, 3, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152608, 145504, -12584, 0, 4, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152304, 145504, -12584, 0, 5, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152000, 145504, -12584, 0, 6, 0, 0);

} else if (c0.y >= 145807 && c0.y <= 153545) {
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153546, 145807, -12584, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153216, 145807, -12584, 0, 2, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152912, 145807, -12584, 0, 3, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152608, 145807, -12584, 0, 4, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152304, 145807, -12584, 0, 5, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152000, 145807, -12584, 0, 6, 0, 0);

} else if (c0.y >= 153545 && c0.y <= 146416) {
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153545, 146110, -12584, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153216, 146110, -12584, 0, 2, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152912, 146110, -12584, 0, 3, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152608, 146110, -12584, 0, 4, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152304, 146110, -12584, 0, 5, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152000, 153545, -12584, 0, 6, 0, 0);

} else if (c0.y >= 146416 && c0.y <= 146720) {
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153539, 146416, -12584, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153216, 146416, -12584, 0, 2, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152912, 146416, -12584, 0, 3, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152608, 146416, -12584, 0, 4, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152304, 146416, -12584, 0, 5, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152000, 146416, -12584, 0, 6, 0, 0);

} else if (c0.y >= 146720) {
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153539, 146720, -12584, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 153216, 146720, -12584, 0, 2, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152912, 146720, -12584, 0, 3, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152608, 146720, -12584, 0, 4, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152304, 146720, -12584, 0, 5, 0, 0);
myself.CreateOnePrivateEx(1029112, "lerker_npc", 0, 0, 152000, 146720, -12584, 0, 6, 0, 0);

}
myself.AddTimerEx(9003, 3000);

}

}

}

}
super;
	}

	protected void MY_DYING(HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam party0, HandlerParam c0) {
myself.InstantZone_MarkRestriction();
myself.CreateOnePrivateEx(1032276, "ai_telecube_oracle_raid", 0, 0, 152766, 145951, -12584, 0, 0, 0, 0);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
party0 = gg.GetParty(myself.c_ai0);

}
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (c0.instant_zone_id == myself.InstantZone_GetId()) {
if (gg.OwnItemCount(c0, 9690) >= 1) {
myself.DeleteItem1(c0, 9690, 1);
myself.GiveItem1(c0, 9695, 1);
myself.GiveItem1(c0, 9597, 1);

} else {
myself.InstantZone_Leave(c0);

}

}

}

}

}
super;
	}


}