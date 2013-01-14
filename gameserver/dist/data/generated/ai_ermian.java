package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ermian extends citizen {
	protected int ERMIAN_TIMER = 1111;
	protected int QUEST_TIMER = 1112;

	protected void CREATED() {
myself.AddTimerEx(ERMIAN_TIMER, 10 * 1000);
myself.AddTimerEx(QUEST_TIMER, 1 * 1000);
myself.i_quest9 = 0;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == ERMIAN_TIMER) {
myself.BroadcastScriptEventEx(20091023, gg.GetIndexFromCreature(myself.sm), 0, 1000);
if (myself.i_quest9) {
myself.Say("나를 보아라!!!");

}
myself.AddTimerEx(ERMIAN_TIMER, 60 * 1000);

} else if (timer_id == QUEST_TIMER) {
myself.BroadcastScriptEvent(20091031, gg.GetIndexFromCreature(myself.sm), 300);
if (myself.i_quest9) {
myself.Say("병사 거기 있느냐?");

}
myself.AddTimerEx(QUEST_TIMER, 1 * 100);

}
super;
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 1) {
myself.BroadcastScriptEventEx(20091023, gg.GetIndexFromCreature(myself.sm), 0, 1000);

} else if (reply == 2) {
myself.ChangeDir(myself.sm, creature.id, 0);

}
	}


}