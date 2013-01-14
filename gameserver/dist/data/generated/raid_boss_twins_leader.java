package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_twins_leader extends warrior_fortress_officer {
	protected int delay_time = 15;
	protected int msg_help_send = -1;
	protected int msg_help_go = -1;
	protected int msg_help_not_go = -1;

	protected void CREATED() {
myself.i_ai3 = 0;
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage, HandlerParam i0, HandlerParam i1) {
i0 = gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100);
i1 = gg.FloatToInt(victim.hp / victim.max_hp * 100);
if (i1 % 20 < 5 || i1 % 20 > 15 && myself.i_ai3 == 0) {
if (i0 - i1 * i0 - i1 > 25) {
if (msg_help_go > -1) {
myself.Say(gg.MakeFString(msg_help_go, "", "", "", "", ""));

}
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(attacker, 1, 1000000);
myself.i_ai3 = 1;
myself.AddTimerEx(3001, delay_time * 1000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3001) {
myself.i_ai3 = 0;

} else if (timer_id == 3002) {
myself.BroadcastScriptEvent(1003, gg.GetIndexFromCreature(myself.sm), 1000);

}
super;
	}


}