package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class flying_npc_party_leader extends default_npc {
	protected String Privates = "";

	protected void CREATED() {
if (gg.IsSameString(Privates, "") == 0) {
myself.CreatePrivates(Privates);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 10002) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddUseSkillDesire(c0, 339804161, 0, 1, 2000000);

}
gg.SendScriptEvent(c0, 10004, gg.GetIndexFromCreature(myself.sm));

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id) {
if (skill_name_id == 339738625) {
myself.Suicide();

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target) {
myself.AddUseSkillDesire(target, 339804161, 0, 1, 2000000);
	}


}