package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_xel_campfire_dummy extends abstract_npc {
	protected void CREATED() {
gg.SendScriptEvent(myself.boss, 2219022, gg.GetIndexFromCreature(myself.sm));
	}

	protected void SPELLED(HandlerParam skill_name_id, HandlerParam speller) {
if (skill_name_id == 594739201) {
myself.AddUseSkillDesire(myself.sm, 438304769, 0, 0, 100000);
myself.BroadcastScriptEvent(2219024, gg.GetIndexFromCreature(speller), 600);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 2219022) {
myself.Suicide();

}
	}


}