package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_dream_box extends default_npc {
	protected int Rate = 25;

	protected void CREATED() {
myself.i_ai8 = 0;
myself.i_ai7 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0) {
if (myself.sm.hp <= 10) {
i0 = gg.Rand(100);
if (i0 < Rate) {
if (myself.i_ai8 == 0) {
i0 = gg.Rand(100);
if (i0 < 33) {
myself.DropItem1(myself.sm, 4042, 3);

}
i0 = gg.Rand(100);
if (i0 < 50) {
myself.DropItem1(myself.sm, 4044, 4);

}
i0 = gg.Rand(100);
if (i0 < 50) {
myself.DropItem1(myself.sm, 4043, 4);

}
i0 = gg.Rand(100);
if (i0 < 16) {
myself.DropItem1(myself.sm, 9628, 2);

}
myself.BroadcastScriptEvent(9274149, 0, 2000);
myself.AddUseSkillDesire(myself.sm, 377356289, 1, 1, 1000000);
myself.i_ai8 = 1;

}

} else {
myself.BroadcastScriptEvent(9274150, 0, 2000);
myself.i_ai8 = 1;

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0) {
if (script_event_arg1 == 9274149) {
myself.AddUseSkillDesire(myself.sm, 377356289, 1, 1, 1000000);
myself.i_ai8 = 1;

} else if (script_event_arg1 == 9274150) {
myself.AddUseSkillDesire(myself.sm, 352321540, 0, 1, 1000000);
myself.i_ai8 = 1;

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam success, HandlerParam skill_name_id) {
if (success == 1) {
gg.SetNpcParam(myself.sm, 9, 0);
myself.Suicide();

}
super;
	}


}