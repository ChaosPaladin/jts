package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_chaos_gigantic_golem extends warrior_basic {
	protected String Privates = "";
	protected String Privates2 = "";

	protected void CREATED() {
myself.i_ai7 = myself.GetCurrentTick();
myself.i_ai8 = 0;
myself.i_ai9 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.i_ai8 == 0) {
myself.AddTimerEx(7801, 30000);
myself.i_ai8 = 1;
if (myself.i_ai9 == 1) {
myself.Say("공격 시작");

}
myself.i_ai7 = myself.GetCurrentTick();
if (myself.sm.hp * 100 / myself.sm.max_hp > 70) {
if (myself.i_ai9 == 1) {
myself.Say("자폭병 스폰");

}
myself.CreatePrivates(Privates2);

}

}
if (myself.sm.hp * 100 / myself.sm.max_hp < 30 && gg.Rand(100) < 5) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, 10000000000);

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private.npc_class_id == 1025705) {
if (myself.sm.hp * 100 / myself.sm.max_hp > 70) {
if (private != myself.sm && private.respawn_time != 0) {
if (myself.i_ai9 == 1) {
myself.Say("자폭병 부활");

}
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, private.respawn_time);

}

}
return;

}
super;
	}

	protected void DEBUG_AI(HandlerParam reply) {
myself.i_ai9 = reply;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 7801) {
if (myself.i_ai7 + 3 * 60 <= myself.GetCurrentTick()) {
myself.i_ai8 = 0;
myself.BroadcastScriptEvent(10029, 0, 6000);

} else {
myself.AddTimerEx(7801, 30000);

}

}
super;
	}


}