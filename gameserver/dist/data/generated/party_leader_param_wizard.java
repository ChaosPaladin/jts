package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_param_wizard extends wizard_parameter {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected String Privates = "orc:party_private:1:20sec";
	protected int AttackLowHP = 0;
	protected int ShoutTarget = 0;
	protected int SummonPrivateRate = 0;

	protected void CREATED() {
if (SummonPrivateRate == 0) {
myself.CreatePrivates(Privates);
myself.i_ai2 = 1;

} else {
myself.i_ai2 = 0;

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam f0, HandlerParam i0, HandlerParam skill_name_id) {
if (myself.i_ai2 == 0) {
if (gg.Rand(100) < SummonPrivateRate) {
myself.CreatePrivates(Privates);
switch (gg.Rand(4)) {
case 0: {
myself.Say(gg.MakeFString(1000294, "", "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000403, "", "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000404, "", "", "", "", ""));
break;

}
case 3: {
myself.Say(gg.MakeFString(1000405, "", "", "", "", ""));
break;

}

}
myself.i_ai2 = 1;

}

}
if (ShoutTarget == 1) {
if (gg.Rand(100) < 50 && attacker.hp / attacker.max_hp * 100 < 40) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.IsNullCreature(h0.creature) == 0 && attacker.is_pc == 1) {
if (h0.creature == attacker) {
switch (gg.Rand(3)) {
case 0: {
myself.Say(gg.MakeFString(1000291, attacker.name, "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000398, attacker.name, "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000399, attacker.name, "", "", "", ""));
break;

}

}
myself.RemoveAllHateInfoIF(0, 0);
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
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 1000 + 300), 0, 1, 1);

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
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 1000), 0, 1, 1);

}

}
myself.sm.flag = gg.GetIndexFromCreature(attacker);
myself.BroadcastScriptEvent(10002, gg.GetIndexFromCreature(myself.sm), 300);

}

}

}

}

}
super;
	}


}