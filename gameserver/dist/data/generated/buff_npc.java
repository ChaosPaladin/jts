package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class buff_npc extends default_npc {
	protected int buff1 = 458752001;
	protected int buff2 = 458752001;
	protected int buff3 = 458752001;
	protected int buff4 = 458752001;
	protected int buff5 = 458752001;
	protected int reactivate_timer = -1;

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void TALKED(HandlerParam talker) {
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc != 0 && myself.i_ai0 == 0) {
if (buff1 != 458752001) {
myself.CastBuffForQuestReward(creature, buff1);

}
if (buff2 != 458752001) {
myself.CastBuffForQuestReward(creature, buff2);

}
if (buff3 != 458752001) {
myself.CastBuffForQuestReward(creature, buff3);

}
if (buff4 != 458752001) {
myself.CastBuffForQuestReward(creature, buff4);

}
if (buff5 != 458752001) {
myself.CastBuffForQuestReward(creature, buff5);

}
if (reactivate_timer > 0) {
myself.i_ai0 = 1;
myself.AddTimerEx(999, reactivate_timer * 1000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 999) {
myself.i_ai0 = 0;
myself.AddTimerEx(999, reactivate_timer * 1000);

}
	}


}