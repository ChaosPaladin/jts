package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_wizard extends party_private_param_wizard {
	protected void CREATED() {
myself.AddTimerEx(1002, 10000);
myself.AddTimerEx(1006, 20000);
myself.i_ai0 = 0;
super;
	}

	protected void NO_DESIRE() {
if (myself.IsMyBossAlive()) {
myself.AddFollowDesire(myself.boss, 5);

} else {
myself.AddMoveAroundDesire(5, 5);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam h0, HandlerParam i0) {
if (timer_id == 1002) {
myself.AddTimerEx(1002, 10000);
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 1000);

}
if (timer_id == 1003) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
myself.AddTimerEx(1003, 10000);

} else {
myself.RemoveAllAttackDesire();
myself.i_ai0 = 0;
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
myself.MakeAttackEvent(h0.creature, 100, 0);

}

}

}
if (timer_id == 1006) {
if (myself.IsMyBossAlive() == 0) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.Despawn();
return;

}

}
myself.AddTimerEx(1006, 20000);

}
if (timer_id == 1004) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.Despawn();

} else {
myself.AddTimerEx(1004, 20000);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam f0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
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
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 100 + 300), 0, 1, 1);

} else {
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
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 100), 0, 1, 1);

}

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
myself.i_ai0 = 1;
myself.AddTimerEx(1003, 10000);

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0, HandlerParam skill_name_id) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
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
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * damage * private.weight_point * 10 + 300), 0, 1, 1);

} else {
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
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * damage * private.weight_point * 10), 0, 1, 1);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam f0, HandlerParam skill_name_id) {
if (myself.IsMyBossAlive() == 0 && myself.GetLifeTime() > 7) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
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
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 30 + 300), 0, 1, 1);

} else {
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
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 30), 0, 1, 1);

}

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0) {
if (myself.IsMyBossAlive() == 0) {
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
if (myself.p_state == 3 && myself.top_desire_target == speller) {
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
myself.AddHateInfo(speller, gg.FloatToInt(f0 * 150), 0, 1, 1);

} else {
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
myself.AddHateInfo(speller, gg.FloatToInt(f0 * 75), 0, 1, 1);

}

}

}
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire, 0);
	}

	protected void MY_DYING() {
if (ShoutMsg4 > 0 && gg.Rand(100) < 30) {
myself.Shout(gg.MakeFString(ShoutMsg4, "", "", "", "", ""));

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private == myself.boss) {
myself.AddTimerEx(1004, 20000);

}
	}


}