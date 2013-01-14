package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_param_warrior extends warrior {
	protected int AttackLowHP = 0;
	protected String Privates = "";
	protected int ShoutTarget = 0;
	protected int SummonPrivateRate = 0;

	protected void CREATED() {
if (SummonPrivateRate == 0) {
if (myself.IsNullString(Privates) == 0) {
myself.CreatePrivates(Privates);

}
myself.i_ai2 = 1;

} else {
myself.i_ai2 = 0;

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
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
if (myself.IsNullCreature(myself.top_desire_target) == 0 && attacker.is_pc == 1) {
if (myself.top_desire_target == attacker) {
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
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(attacker, 1, 1000);
myself.sm.flag = gg.GetIndexFromCreature(attacker);
myself.BroadcastScriptEvent(10002, gg.GetIndexFromCreature(myself.sm), 300);

}

}

}

}
super;
	}


}