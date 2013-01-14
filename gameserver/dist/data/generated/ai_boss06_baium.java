package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss06_baium extends default_npc {
	protected int GM_ID = 2;
	protected int pos_x = -105200;
	protected int pos_y = -253104;
	protected int pos_z = -15264;
	protected int TIMER_INTRO_STANBY = 2001;
	protected int TIMER_IDLE_COMBAT = 2002;
	protected int TIMER_CHECK_DMG_SOURCE = 2003;
	protected int TIMER_CHECK_POS_RESET = 9989;
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;

	protected void NO_DESIRE() {
if (myself.GetLifeTime() > 9 && myself.i_ai3 == 1) {
myself.AddMoveAroundDesire(5, 5);
myself.LookNeighbor(300);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0) {
if (script_event_arg1 == 99999999) {
myself.MPCC_SetMasterPartyRouting(script_event_arg2, myself.sm, 1);
myself.int_list.Add(script_event_arg2);

} else {
myself.i_quest3 = 1;
myself.sm.flag = 1;
gg.InstantTeleportEx(myself.sm, 116033, 17447, 10107, -25348);
myself.SetDBValue(myself.sm, 1);
myself.sm.param1 = script_event_arg2;
myself.AddTimerEx(2004, 11500);
myself.AddTimerEx(2006, 2000);
myself.AddTimerEx(TIMER_IDLE_COMBAT, 60000);
myself.i_ai2 = myself.GetCurrentTick();
i0 = gg.Rand(3) + 2 + 60 * 1000;
myself.AddTimerEx(TIMER_CHECK_DMG_SOURCE, i0);
myself.i_ai3 = 0;

}
	}

	protected void CREATED(HandlerParam i0, HandlerParam reply) {
myself.i_quest3 = 0;
if (GM_ID != 0) {
myself.RegisterGlobalMap(GM_ID, gg.GetIndexFromCreature(myself.sm));
myself.SetDBValue(myself.sm, 0);

}
if (reply == 0) {
myself.CreateOnePrivateEx(1029025, "ai_boss06_baium_stone", 0, 0, 116033, 17447, 10107, -25348, 0, 0, 0);

} else if (myself.InMyTerritory(myself.sm)) {
myself.AddTimerEx(TIMER_INTRO_STANBY, 5000);
myself.i_quest3 = 1;
myself.SetDBValue(myself.sm, 1);
myself.AddTimerEx(TIMER_IDLE_COMBAT, 60000);
myself.i_ai2 = myself.GetCurrentTick();
i0 = gg.Rand(3) + 2 + 60 * 1000;
myself.AddTimerEx(TIMER_CHECK_DMG_SOURCE, i0);

} else {
myself.CreateOnePrivateEx(1029025, "ai_boss06_baium_stone", 0, 0, 116033, 17447, 10107, -25348, 0, 0, 0);

}
myself.sm.flag = 1;
myself.i_ai0 = 1;
myself.i_ai1 = 1;
myself.i_ai3 = 0;
	}

	protected void MY_DYING() {
myself.CreateOnePrivateEx(1031842, "ai_boss06_cube", 0, 0, 115017, 15549, 10090, 0, 0, 0, 0);
myself.EffectMusic(myself.sm, 6000, "BS01_D");
myself.UnregisterGlobalMap(GM_ID);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i1, HandlerParam i2, HandlerParam c2) {
if (myself.i_ai3 != 1) {
return;

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

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (attacker.is_pc == 1) {
myself.i_ai0 = myself.i_ai0 + damage;
myself.i_ai2 = myself.GetCurrentTick();
if (skill_name_id == 0) {
if (attacker == myself.c_quest0) {
if (myself.i_quest0 < damage * 1000 + 1000) {
myself.i_quest0 = gg.FloatToInt(damage * 1000 + gg.Rand(3000));

}

} else if (attacker == myself.c_quest1) {
if (myself.i_quest1 < damage * 1000 + 1000) {
myself.i_quest1 = gg.FloatToInt(damage * 1000 + gg.Rand(3000));

}

} else if (attacker == myself.c_quest2) {
if (myself.i_quest2 < damage * 1000 + 1000) {
myself.i_quest2 = gg.FloatToInt(damage * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_quest0 > myself.i_quest1) {
i1 = 3;

} else if (myself.i_quest0 == myself.i_quest1) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_quest0 < myself.i_quest1) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_quest0 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest0 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_quest0 < myself.i_quest2) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_quest1 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest1 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_quest1 < myself.i_quest2) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_quest0 = gg.FloatToInt(damage * 1000 + gg.Rand(3000));
myself.c_quest0 = attacker;
break;

}
case 3: {
myself.i_quest1 = gg.FloatToInt(damage * 1000 + gg.Rand(3000));
myself.c_quest1 = attacker;
break;

}
case 4: {
myself.i_quest2 = gg.FloatToInt(damage * 1000 + gg.Rand(3000));
myself.c_quest2 = attacker;
break;

}

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 1.000000 / 4.000000) {
if (attacker == myself.c_quest0) {
if (myself.i_quest0 < damage / 30.000000 * 1000 + 1000) {
myself.i_quest0 = gg.FloatToInt(damage / 30.000000 * 1000 + gg.Rand(3000));

}

} else if (attacker == myself.c_quest1) {
if (myself.i_quest1 < damage / 30.000000 * 1000 + 1000) {
myself.i_quest1 = gg.FloatToInt(damage / 30.000000 * 1000 + gg.Rand(3000));

}

} else if (attacker == myself.c_quest2) {
if (myself.i_quest2 < damage / 30.000000 * 1000 + 1000) {
myself.i_quest2 = gg.FloatToInt(damage / 30.000000 * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_quest0 > myself.i_quest1) {
i1 = 3;

} else if (myself.i_quest0 == myself.i_quest1) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_quest0 < myself.i_quest1) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_quest0 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest0 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_quest0 < myself.i_quest2) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_quest1 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest1 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_quest1 < myself.i_quest2) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_quest0 = gg.FloatToInt(damage / 30.000000 * 1000 + gg.Rand(3000));
myself.c_quest0 = attacker;
break;

}
case 3: {
myself.i_quest1 = gg.FloatToInt(damage / 30.000000 * 1000 + gg.Rand(3000));
myself.c_quest1 = attacker;
break;

}
case 4: {
myself.i_quest2 = gg.FloatToInt(damage / 30.000000 * 1000 + gg.Rand(3000));
myself.c_quest2 = attacker;
break;

}

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 2.000000 / 4.000000) {
if (attacker == myself.c_quest0) {
if (myself.i_quest0 < damage / 50.000000 * 1000 + 1000) {
myself.i_quest0 = gg.FloatToInt(damage / 50.000000 * 1000 + gg.Rand(3000));

}

} else if (attacker == myself.c_quest1) {
if (myself.i_quest1 < damage / 50.000000 * 1000 + 1000) {
myself.i_quest1 = gg.FloatToInt(damage / 50.000000 * 1000 + gg.Rand(3000));

}

} else if (attacker == myself.c_quest2) {
if (myself.i_quest2 < damage / 50.000000 * 1000 + 1000) {
myself.i_quest2 = gg.FloatToInt(damage / 50.000000 * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_quest0 > myself.i_quest1) {
i1 = 3;

} else if (myself.i_quest0 == myself.i_quest1) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_quest0 < myself.i_quest1) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_quest0 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest0 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_quest0 < myself.i_quest2) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_quest1 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest1 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_quest1 < myself.i_quest2) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_quest0 = gg.FloatToInt(damage / 50.000000 * 1000 + gg.Rand(3000));
myself.c_quest0 = attacker;
break;

}
case 3: {
myself.i_quest1 = gg.FloatToInt(damage / 50.000000 * 1000 + gg.Rand(3000));
myself.c_quest1 = attacker;
break;

}
case 4: {
myself.i_quest2 = gg.FloatToInt(damage / 50.000000 * 1000 + gg.Rand(3000));
myself.c_quest2 = attacker;
break;

}

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 3.000000 / 4.000000) {
if (attacker == myself.c_quest0) {
if (myself.i_quest0 < damage / 100.000000 * 1000 + 1000) {
myself.i_quest0 = gg.FloatToInt(damage / 100.000000 * 1000 + gg.Rand(3000));

}

} else if (attacker == myself.c_quest1) {
if (myself.i_quest1 < damage / 100.000000 * 1000 + 1000) {
myself.i_quest1 = gg.FloatToInt(damage / 100.000000 * 1000 + gg.Rand(3000));

}

} else if (attacker == myself.c_quest2) {
if (myself.i_quest2 < damage / 100.000000 * 1000 + 1000) {
myself.i_quest2 = gg.FloatToInt(damage / 100.000000 * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_quest0 > myself.i_quest1) {
i1 = 3;

} else if (myself.i_quest0 == myself.i_quest1) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_quest0 < myself.i_quest1) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_quest0 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest0 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_quest0 < myself.i_quest2) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_quest1 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest1 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_quest1 < myself.i_quest2) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_quest0 = gg.FloatToInt(damage / 100.000000 * 1000 + gg.Rand(3000));
myself.c_quest0 = attacker;
break;

}
case 3: {
myself.i_quest1 = gg.FloatToInt(damage / 100.000000 * 1000 + gg.Rand(3000));
myself.c_quest1 = attacker;
break;

}
case 4: {
myself.i_quest2 = gg.FloatToInt(damage / 100.000000 * 1000 + gg.Rand(3000));
myself.c_quest2 = attacker;
break;

}

}

}

} else if (attacker == myself.c_quest0) {
if (myself.i_quest0 < damage / 150.000000 * 1000 + 1000) {
myself.i_quest0 = gg.FloatToInt(damage / 150.000000 * 1000 + gg.Rand(3000));

}

} else if (attacker == myself.c_quest1) {
if (myself.i_quest1 < damage / 150.000000 * 1000 + 1000) {
myself.i_quest1 = gg.FloatToInt(damage / 150.000000 * 1000 + gg.Rand(3000));

}

} else if (attacker == myself.c_quest2) {
if (myself.i_quest2 < damage / 150.000000 * 1000 + 1000) {
myself.i_quest2 = gg.FloatToInt(damage / 150.000000 * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_quest0 > myself.i_quest1) {
i1 = 3;

} else if (myself.i_quest0 == myself.i_quest1) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_quest0 < myself.i_quest1) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_quest0 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest0 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_quest0 < myself.i_quest2) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_quest1 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest1 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_quest1 < myself.i_quest2) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_quest0 = gg.FloatToInt(damage / 150.000000 * 1000 + gg.Rand(3000));
myself.c_quest0 = attacker;
break;

}
case 3: {
myself.i_quest1 = gg.FloatToInt(damage / 150.000000 * 1000 + gg.Rand(3000));
myself.c_quest1 = attacker;
break;

}
case 4: {
myself.i_quest2 = gg.FloatToInt(damage / 150.000000 * 1000 + gg.Rand(3000));
myself.c_quest2 = attacker;
break;

}

}

}

}

} else {
myself.c_ai3 = attacker;

}
if (myself.i_ai3 != 0) {
if (gg.Rand(100) < 10 && myself.IsNullCreature(myself.c_ai3) == 0 && myself.sm.flag == 0) {
c2 = myself.c_ai3;

} else {
if (myself.IsNullCreature(myself.c_quest0) == 0) {
if (myself.DistFromMe(myself.c_quest0) > 9000 || myself.c_quest0.alive == 0) {
myself.i_quest0 = 0;

}

} else {
myself.i_quest0 = 0;

}
if (myself.IsNullCreature(myself.c_quest1) == 0) {
if (myself.DistFromMe(myself.c_quest1) > 9000 || myself.c_quest1.alive == 0) {
myself.i_quest1 = 0;

}

} else {
myself.i_quest1 = 0;

}
if (myself.IsNullCreature(myself.c_quest2) == 0) {
if (myself.DistFromMe(myself.c_quest2) > 9000 || myself.c_quest2.alive == 0) {
myself.i_quest2 = 0;

}

} else {
myself.i_quest2 = 0;

}
if (myself.i_quest0 > myself.i_quest1) {
i1 = 0;
i2 = myself.i_quest0;
c2 = myself.c_quest0;

} else {
i1 = 1;
i2 = myself.i_quest1;
c2 = myself.c_quest1;

}
if (myself.i_quest2 > i2) {
i1 = 2;
i2 = myself.i_quest2;
c2 = myself.c_quest2;

}
if (i2 > 0) {
if (gg.Rand(100) < 70) {
switch (i1) {
case 0: {
myself.i_quest0 = 500;
break;

}
case 1: {
myself.i_quest1 = 500;
break;

}
case 2: {
myself.i_quest2 = 500;
break;

}

}

}

}

}
if (myself.IsNullCreature(c2) != 0 || i2 == 0) {
c2 = myself.c_ai3;

}
if (myself.IsNullCreature(c2) == 0 && c2.alive) {
if (myself.sm.hp > myself.sm.max_hp * 3.000000 / 4.000000) {
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 2.000000 / 4.000000) {
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270729217, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 1.000000 / 4.000000) {
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270663681, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270729217, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270663681, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270729217, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

}

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (private != myself.sm && attacker != myself.sm) {
myself.i_ai1 = myself.i_ai1 + damage;

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i1, HandlerParam i2, HandlerParam c2) {
if (myself.InMyTerritory(creature) == 0) {
return;

}
if (creature.is_pc && myself.GetLifeTime() < 10) {
myself.c_ai1 = creature;

}
if (myself.IsInCategory(3, creature.occupation)) {
if (myself.sm.hp < myself.sm.max_hp * 1.000000 / 4.000000) {
if (creature == myself.c_quest0) {
if (myself.i_quest0 < 10 * 1000 + 1000) {
myself.i_quest0 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (creature == myself.c_quest1) {
if (myself.i_quest1 < 10 * 1000 + 1000) {
myself.i_quest1 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (creature == myself.c_quest2) {
if (myself.i_quest2 < 10 * 1000 + 1000) {
myself.i_quest2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_quest0 > myself.i_quest1) {
i1 = 3;

} else if (myself.i_quest0 == myself.i_quest1) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_quest0 < myself.i_quest1) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_quest0 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest0 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_quest0 < myself.i_quest2) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_quest1 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest1 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_quest1 < myself.i_quest2) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_quest0 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest0 = creature;
break;

}
case 3: {
myself.i_quest1 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest1 = creature;
break;

}
case 4: {
myself.i_quest2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest2 = creature;
break;

}

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 2.000000 / 4.000000) {
if (creature == myself.c_quest0) {
if (myself.i_quest0 < 6 * 1000 + 1000) {
myself.i_quest0 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (creature == myself.c_quest1) {
if (myself.i_quest1 < 6 * 1000 + 1000) {
myself.i_quest1 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (creature == myself.c_quest2) {
if (myself.i_quest2 < 6 * 1000 + 1000) {
myself.i_quest2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_quest0 > myself.i_quest1) {
i1 = 3;

} else if (myself.i_quest0 == myself.i_quest1) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_quest0 < myself.i_quest1) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_quest0 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest0 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_quest0 < myself.i_quest2) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_quest1 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest1 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_quest1 < myself.i_quest2) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_quest0 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest0 = creature;
break;

}
case 3: {
myself.i_quest1 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest1 = creature;
break;

}
case 4: {
myself.i_quest2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest2 = creature;
break;

}

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 3.000000 / 4.000000) {
if (creature == myself.c_quest0) {
if (myself.i_quest0 < 3 * 1000 + 1000) {
myself.i_quest0 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (creature == myself.c_quest1) {
if (myself.i_quest1 < 3 * 1000 + 1000) {
myself.i_quest1 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (creature == myself.c_quest2) {
if (myself.i_quest2 < 3 * 1000 + 1000) {
myself.i_quest2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_quest0 > myself.i_quest1) {
i1 = 3;

} else if (myself.i_quest0 == myself.i_quest1) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_quest0 < myself.i_quest1) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_quest0 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest0 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_quest0 < myself.i_quest2) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_quest1 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest1 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_quest1 < myself.i_quest2) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_quest0 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest0 = creature;
break;

}
case 3: {
myself.i_quest1 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest1 = creature;
break;

}
case 4: {
myself.i_quest2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest2 = creature;
break;

}

}

}

} else if (creature == myself.c_quest0) {
if (myself.i_quest0 < 2 * 1000 + 1000) {
myself.i_quest0 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (creature == myself.c_quest1) {
if (myself.i_quest1 < 2 * 1000 + 1000) {
myself.i_quest1 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (creature == myself.c_quest2) {
if (myself.i_quest2 < 2 * 1000 + 1000) {
myself.i_quest2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_quest0 > myself.i_quest1) {
i1 = 3;

} else if (myself.i_quest0 == myself.i_quest1) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_quest0 < myself.i_quest1) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_quest0 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest0 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_quest0 < myself.i_quest2) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_quest1 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest1 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_quest1 < myself.i_quest2) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_quest0 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest0 = creature;
break;

}
case 3: {
myself.i_quest1 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest1 = creature;
break;

}
case 4: {
myself.i_quest2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest2 = creature;
break;

}

}

}

} else if (creature == myself.c_quest0) {
if (myself.i_quest0 < 1 * 1000 + 1000) {
myself.i_quest0 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (creature == myself.c_quest1) {
if (myself.i_quest1 < 1 * 1000 + 1000) {
myself.i_quest1 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else if (creature == myself.c_quest2) {
if (myself.i_quest2 < 1 * 1000 + 1000) {
myself.i_quest2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));

}

} else {
if (myself.i_quest0 > myself.i_quest1) {
i1 = 3;

} else if (myself.i_quest0 == myself.i_quest1) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 3;

}

} else if (myself.i_quest0 < myself.i_quest1) {
i1 = 2;

}
if (i1 == 2) {
if (myself.i_quest0 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest0 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 2;

} else {
i1 = 4;

}

} else if (myself.i_quest0 < myself.i_quest2) {
i1 = 2;

}

} else if (i1 == 3) {
if (myself.i_quest1 > myself.i_quest2) {
i1 = 4;

} else if (myself.i_quest1 == myself.i_quest2) {
if (gg.Rand(100) < 50) {
i1 = 3;

} else {
i1 = 4;

}

} else if (myself.i_quest1 < myself.i_quest2) {
i1 = 3;

}

}
switch (i1) {
case 2: {
myself.i_quest0 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest0 = creature;
break;

}
case 3: {
myself.i_quest1 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest1 = creature;
break;

}
case 4: {
myself.i_quest2 = gg.FloatToInt(FloatToInt * 1000 + gg.Rand(3000));
myself.c_quest2 = creature;
break;

}

}

}
if (myself.i_ai3 != 0) {
if (gg.Rand(100) < 10 && myself.IsNullCreature(myself.c_ai3) == 0 && myself.sm.flag == 0) {
c2 = myself.c_ai3;

} else {
if (myself.IsNullCreature(myself.c_quest0) == 0) {
if (myself.DistFromMe(myself.c_quest0) > 9000 || myself.c_quest0.alive == 0) {
myself.i_quest0 = 0;

}

} else {
myself.i_quest0 = 0;

}
if (myself.IsNullCreature(myself.c_quest1) == 0) {
if (myself.DistFromMe(myself.c_quest1) > 9000 || myself.c_quest1.alive == 0) {
myself.i_quest1 = 0;

}

} else {
myself.i_quest1 = 0;

}
if (myself.IsNullCreature(myself.c_quest2) == 0) {
if (myself.DistFromMe(myself.c_quest2) > 9000 || myself.c_quest2.alive == 0) {
myself.i_quest2 = 0;

}

} else {
myself.i_quest2 = 0;

}
if (myself.i_quest0 > myself.i_quest1) {
i1 = 0;
i2 = myself.i_quest0;
c2 = myself.c_quest0;

} else {
i1 = 1;
i2 = myself.i_quest1;
c2 = myself.c_quest1;

}
if (myself.i_quest2 > i2) {
i1 = 2;
i2 = myself.i_quest2;
c2 = myself.c_quest2;

}
if (i2 > 0) {
if (gg.Rand(100) < 70) {
switch (i1) {
case 0: {
myself.i_quest0 = 500;
break;

}
case 1: {
myself.i_quest1 = 500;
break;

}
case 2: {
myself.i_quest2 = 500;
break;

}

}

}

}

}
if (myself.IsNullCreature(c2) != 0 || i2 == 0) {
c2 = myself.c_ai3;

}
if (myself.IsNullCreature(c2) == 0 && c2.alive) {
if (myself.sm.hp > myself.sm.max_hp * 3.000000 / 4.000000) {
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 2.000000 / 4.000000) {
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270729217, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 1.000000 / 4.000000) {
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270663681, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270729217, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270663681, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270729217, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam i1, HandlerParam i2, HandlerParam c2) {
if (myself.i_ai3 == 0) {
return;

}
if (gg.Rand(100) < 10 && myself.IsNullCreature(myself.c_ai3) == 0 && myself.sm.flag == 0) {
c2 = myself.c_ai3;

} else {
if (myself.IsNullCreature(myself.c_quest0) == 0) {
if (myself.DistFromMe(myself.c_quest0) > 9000 || myself.c_quest0.alive == 0) {
myself.i_quest0 = 0;

}

} else {
myself.i_quest0 = 0;

}
if (myself.IsNullCreature(myself.c_quest1) == 0) {
if (myself.DistFromMe(myself.c_quest1) > 9000 || myself.c_quest1.alive == 0) {
myself.i_quest1 = 0;

}

} else {
myself.i_quest1 = 0;

}
if (myself.IsNullCreature(myself.c_quest2) == 0) {
if (myself.DistFromMe(myself.c_quest2) > 9000 || myself.c_quest2.alive == 0) {
myself.i_quest2 = 0;

}

} else {
myself.i_quest2 = 0;

}
if (myself.i_quest0 > myself.i_quest1) {
i1 = 0;
i2 = myself.i_quest0;
c2 = myself.c_quest0;

} else {
i1 = 1;
i2 = myself.i_quest1;
c2 = myself.c_quest1;

}
if (myself.i_quest2 > i2) {
i1 = 2;
i2 = myself.i_quest2;
c2 = myself.c_quest2;

}
if (i2 > 0) {
if (gg.Rand(100) < 70) {
switch (i1) {
case 0: {
myself.i_quest0 = 500;
break;

}
case 1: {
myself.i_quest1 = 500;
break;

}
case 2: {
myself.i_quest2 = 500;
break;

}

}

}

}

}
if (myself.IsNullCreature(c2) != 0 || i2 == 0) {
c2 = myself.c_ai3;

}
if (myself.IsNullCreature(c2) == 0 && c2.alive) {
if (myself.sm.hp > myself.sm.max_hp * 3.000000 / 4.000000) {
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 2.000000 / 4.000000) {
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270729217, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 1.000000 / 4.000000) {
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270663681, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270729217, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270663681, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270729217, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0, HandlerParam c0, HandlerParam i1, HandlerParam i2) {
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
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam i2, HandlerParam c2, HandlerParam c3) {
if (timer_id == TIMER_CHECK_POS_RESET) {
if (myself.i_ai4 == 0) {
if (gg.FloatToInt(myself.sm.x) == pos_x && gg.FloatToInt(myself.sm.y) == pos_y) {
myself.CreateOnePrivateEx(1029025, "ai_boss06_baium_stone", 0, 0, 116026, 17435, 10107, -25348, 0, 0, 0);
myself.i_ai4 = 1;
myself.AddLogByNpc2(127, myself.sm, "ai_boss06_baium_TIMER_FIRED_EX", "CreateOnePrivateEx_Stone", 0, 0, 0, 0, 0, 0);

} else {
myself.RemoveAllDesire();
myself.StopMove();
gg.InstantTeleportEx(myself.sm, -105200, -253104, -15264, 0);
myself.AddTimerEx(TIMER_CHECK_POS_RESET, 6000);

}

}

}
if (myself.i_quest3 == 0) {
return;

}
if (timer_id == 2006) {
myself.EarthQuakeByNPC(myself.sm, 40, 10, 1, 0, 0, 0);
myself.EffectMusic(myself.sm, 6000, "BS02_A");

}
if (timer_id == 2004) {
myself.AddEffectActionDesire(myself.sm, 3, 7300, 10000000);
myself.AddTimerEx(2005, 7300);

}
if (timer_id == 2005) {
myself.AddEffectActionDesire(myself.sm, 1, 8000, 1000000);
if (myself.sm.param1 != 0) {
c0 = gg.GetCreatureFromIndex(myself.sm.param1);

}
if (myself.IsNullCreature(c0) == 0 && myself.sm.param1 != 0) {
if (myself.DistFromMe(c0) < 16000) {
myself.Say(c0.name + ", " + gg.MakeFString(22937, "", "", "", "", ""));
myself.InstantTeleport(c0, 115910, 17337, 10105);
if (myself.Skill_GetConsumeMP(271056897) < myself.sm.mp && myself.Skill_GetConsumeHP(271056897) < myself.sm.hp && myself.Skill_InReuseDelay(271056897) == 0) {
myself.AddUseSkillDesire(c0, 271056897, 0, 1, 2000000);

}

}

} else if (myself.IsNullCreature(myself.c_ai1) == 0) {
myself.Say(myself.c_ai1.name + ", " + gg.MakeFString(22937, "", "", "", "", ""));
myself.InstantTeleport(myself.c_ai1, 115910, 17337, 10105);
if (myself.Skill_GetConsumeMP(271056897) < myself.sm.mp && myself.Skill_GetConsumeHP(271056897) < myself.sm.hp && myself.Skill_InReuseDelay(271056897) == 0) {
myself.AddUseSkillDesire(myself.c_ai1, 271056897, 0, 1, 2000000);

}

}
c3 = myself.FindNeighborHero(4000);
if (myself.IsNullCreature(c3) == 0) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 1, 0, 0, 0, 0, 0, 3000, 0, gg.MakeFString(1000521, c3.name, "", "", "", ""));

}
myself.AddTimerEx(TIMER_INTRO_STANBY, 8000);

}
if (timer_id == TIMER_INTRO_STANBY) {
myself.CreateOnePrivateEx(1029021, "ai_boss06_angel", 0, 0, 115792, 16608, 10136, 0, 1, 0, 0);
myself.CreateOnePrivateEx(1029021, "ai_boss06_angel", 0, 0, 115168, 17200, 10136, 0, 2, 0, 0);
myself.CreateOnePrivateEx(1029021, "ai_boss06_angel", 0, 0, 115780, 15564, 10136, 13620, 3, 0, 0);
myself.CreateOnePrivateEx(1029021, "ai_boss06_angel", 0, 0, 114880, 16236, 10136, 5400, 4, 0, 0);
myself.CreateOnePrivateEx(1029021, "ai_boss06_angel", 0, 0, 114239, 17168, 10136, -1992, 5, 0, 0);
myself.i_ai3 = 1;
if (gg.Rand(100) < 10 && myself.IsNullCreature(myself.c_ai3) == 0 && myself.sm.flag == 0) {
c2 = myself.c_ai3;

} else {
if (myself.IsNullCreature(myself.c_quest0) == 0) {
if (myself.DistFromMe(myself.c_quest0) > 9000 || myself.c_quest0.alive == 0) {
myself.i_quest0 = 0;

}

} else {
myself.i_quest0 = 0;

}
if (myself.IsNullCreature(myself.c_quest1) == 0) {
if (myself.DistFromMe(myself.c_quest1) > 9000 || myself.c_quest1.alive == 0) {
myself.i_quest1 = 0;

}

} else {
myself.i_quest1 = 0;

}
if (myself.IsNullCreature(myself.c_quest2) == 0) {
if (myself.DistFromMe(myself.c_quest2) > 9000 || myself.c_quest2.alive == 0) {
myself.i_quest2 = 0;

}

} else {
myself.i_quest2 = 0;

}
if (myself.i_quest0 > myself.i_quest1) {
i1 = 0;
i2 = myself.i_quest0;
c2 = myself.c_quest0;

} else {
i1 = 1;
i2 = myself.i_quest1;
c2 = myself.c_quest1;

}
if (myself.i_quest2 > i2) {
i1 = 2;
i2 = myself.i_quest2;
c2 = myself.c_quest2;

}
if (i2 > 0) {
if (gg.Rand(100) < 70) {
switch (i1) {
case 0: {
myself.i_quest0 = 500;
break;

}
case 1: {
myself.i_quest1 = 500;
break;

}
case 2: {
myself.i_quest2 = 500;
break;

}

}

}

}

}
if (myself.IsNullCreature(c2) != 0 || i2 == 0) {
c2 = myself.c_ai3;

}
if (myself.IsNullCreature(c2) == 0 && c2.alive) {
if (myself.sm.hp > myself.sm.max_hp * 3.000000 / 4.000000) {
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 2.000000 / 4.000000) {
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270729217, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 1.000000 / 4.000000) {
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270663681, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270729217, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270663681, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270729217, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270532609, 0, 1, 10000);

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(c2, 270598145, 0, 1, 10000);

} else {
myself.AddUseSkillDesire(c2, 270467073, 0, 1, 10000);

}

}

}
if (timer_id == TIMER_IDLE_COMBAT) {
i0 = myself.GetCurrentTick() - myself.i_ai2;
if (i0 > 30 * 60) {
myself.MPCC_SetMasterPartyRouting(myself.int_list.Get(0), myself.sm, 0);
myself.int_list.Clear();
myself.RemoveAllDesire();
myself.StopMove();
myself.SetDBValue(myself.sm, 0);
myself.InstantTeleportInMyTerritory(120112, 18208, -5152, 900);
gg.InstantTeleportEx(myself.sm, -105200, -253104, -15264, 0);
myself.AddTimerEx(TIMER_CHECK_POS_RESET, 6000);
myself.i_quest3 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.sm.flag = 6;

} else if (i0 > 5 * 60 && myself.sm.hp < myself.sm.max_hp * 3.000000 / 4.000000) {
myself.AddTimerEx(TIMER_IDLE_COMBAT, 60000);
if (myself.Skill_GetConsumeMP(270991361) < myself.sm.mp && myself.Skill_GetConsumeHP(270991361) < myself.sm.hp && myself.Skill_InReuseDelay(270991361) == 0) {
myself.AddUseSkillDesire(myself.sm, 270991361, 1, 1, 1000000);

}

} else {
myself.AddTimerEx(TIMER_IDLE_COMBAT, 60000);

}

}
if (timer_id == TIMER_CHECK_DMG_SOURCE) {
myself.i_ai1 = gg.FloatToInt(myself.i_ai1 * 2.730000);
i0 = myself.i_ai0 + myself.i_ai1;
if (myself.i_ai0 > myself.i_ai1) {
i1 = myself.i_ai0 - myself.i_ai1;

} else {
i1 = myself.i_ai1 - myself.i_ai0;

}
if (i1 * 10 > 3 * i0) {
myself.sm.flag = 0;

} else {
myself.sm.flag = 1 + gg.Rand(4);

}
i0 = gg.Rand(3) + 2 + 60 * 1000;
myself.AddTimerEx(TIMER_CHECK_DMG_SOURCE, 30000);
myself.i_ai0 = 1;
myself.i_ai1 = 1;

}
	}


}