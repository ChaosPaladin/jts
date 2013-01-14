package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior extends warrior_parameter {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(5, 5);
	}

	protected void CREATED() {
if (ShoutMsg1 > 0) {
if (IsSay == 0) {
myself.Shout(gg.MakeFString(ShoutMsg1, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(ShoutMsg1, "", "", "", "", ""));

}

}
if (MoveAroundSocial > 0 || ShoutMsg2 > 0 || ShoutMsg3 > 0) {
myself.AddTimerEx(1001, 10000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
if (myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 9 && myself.sm.hp > myself.sm.max_hp * 0.400000 && myself.sm.alive != 0) {
if (MoveAroundSocial > 0 || MoveAroundSocial1 > 0 || MoveAroundSocial2 > 0) {
if (MoveAroundSocial2 > 0 && gg.Rand(100) < 20) {
myself.AddEffectActionDesire(myself.sm, 3, MoveAroundSocial2 * 1000 / 30, 50);

} else if (MoveAroundSocial1 > 0 && gg.Rand(100) < 20) {
myself.AddEffectActionDesire(myself.sm, 2, MoveAroundSocial1 * 1000 / 30, 50);

} else if (MoveAroundSocial > 0 && gg.Rand(100) < 20) {
myself.AddEffectActionDesire(myself.sm, 1, MoveAroundSocial * 1000 / 30, 50);

}

}
if (ShoutMsg2 > 0 && gg.Rand(1000) < 17) {
if (IsSay == 0) {
myself.Shout(gg.MakeFString(ShoutMsg2, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(ShoutMsg2, "", "", "", "", ""));

}

}

} else if (myself.p_state == 3) {
if (ShoutMsg3 > 0 && gg.Rand(100) < 10) {
if (IsSay == 0) {
myself.Shout(gg.MakeFString(ShoutMsg3, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(ShoutMsg3, "", "", "", "", ""));

}

}

}
myself.AddTimerEx(1001, 10000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam f0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddAttackDesire(attacker, 1, f0 * 100);

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.GetPathfindFailCount() > 10 && attacker == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) >= 0 && myself.DistFromMe(myself.top_desire_target) > 40) {
if (myself.CanAttack(myself.top_desire_target) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddAttackDesire(attacker, 1, f0 * 100);

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddAttackDesire(attacker, 1, f0 * 100);

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam f0) {
if (myself.GetLifeTime() > 7) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.GetPathfindFailCount() > 10 && attacker == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddAttackDesire(attacker, 1, f0 * 30);

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0) {
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
if (myself.p_state == 3 && myself.top_desire_target == target) {
i0 = myself.Skill_GetEffectPoint(skill_name_id);
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, speller.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (speller.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == speller.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * i0 / myself.sm.level + 7 + f0 / 100 * 1.000000 * i0 / myself.sm.level + 7;
myself.AddAttackDesire(speller, 1, f0 * 150);

}

}
if (myself.GetPathfindFailCount() > 10 && speller == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(speller.x), gg.FloatToInt(speller.y), gg.FloatToInt(speller.z));

}
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire, 0);
	}

	protected void MY_DYING() {
if (ShoutMsg4 > 0 && gg.Rand(100) < 30) {
if (IsSay == 0) {
myself.Shout(gg.MakeFString(ShoutMsg4, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(ShoutMsg4, "", "", "", "", ""));

}

}
	}


}