package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class egg_primeval extends warrior_hold {
	protected int BroadCastRange = 500;
	protected int ProbBroadCast = 80;
	protected String Privates = "";

	protected void CREATED() {
myself.CreatePrivates(Privates);
	}

	protected void ATTACKED(HandlerParam attacker) {
if (gg.Rand(100) <= ProbBroadCast) {
myself.BroadcastScriptEvent(10016, gg.GetIndexFromCreature(attacker), BroadCastRange);

}
	}

	protected void MY_DYING(HandlerParam last_attacker) {
if (gg.Rand(100) < 3) {
if (myself.IsNullCreature(last_attacker) == 0) {
if (myself.GetInventoryInfo(last_attacker, 0) >= myself.GetInventoryInfo(last_attacker, 1) * 0.800000 || myself.GetInventoryInfo(last_attacker, 2) >= myself.GetInventoryInfo(last_attacker, 3) * 0.800000) {
myself.ShowSystemMessageStr(last_attacker, gg.MakeFString(1800879, "", "", "", "", ""));
return;

}
myself.GetItemData(last_attacker, 14828);
myself.CreatePet(last_attacker, 14828, 1016067, 55);
myself.ShowSystemMessageStr(last_attacker, gg.MakeFString(1800878, "", "", "", "", ""));

}

}
super;
	}

	protected void SCRIPT_EVENT() {
	}


}