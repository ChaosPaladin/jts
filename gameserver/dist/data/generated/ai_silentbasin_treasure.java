package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_silentbasin_treasure extends default_npc {
	protected int SkillStigma = 395378689;
	protected int DropItem = 13799;

	protected void CREATED() {
myself.AddTimerEx(2519001, 5 * 60 * 1000);
	}

	protected void ATTACKED(HandlerParam attacker) {
if (attacker.is_pc == 1) {
if (myself.i_ai0 == 0) {
myself.Say(gg.MakeFString(1800218, "", "", "", "", ""));
myself.AddUseSkillDesire(attacker, SkillStigma, 1, 0, 500000000);
myself.i_ai0 = 1;

}
if (gg.Rand(100) < 5) {
myself.DropItem1(myself.sm, DropItem, 1);
myself.BroadcastScriptEvent(10101010, 1, 2000);
myself.Suicide();

}

}
if (attacker.summon_type == 1 || attacker.summon_type == 2) {
myself.DropItem1(myself.sm, DropItem, 1);
myself.BroadcastScriptEvent(10101010, 1, 2000);
myself.Suicide();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2519001) {
myself.BroadcastScriptEvent(10101010, 5, 2000);
myself.SetVisible(0);
myself.Suicide();

}
	}


}