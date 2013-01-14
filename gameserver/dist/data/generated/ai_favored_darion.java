package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_favored_darion extends warrior_basic {
	protected int my_floor = 0;
	protected int my_room = 0;
	protected int my_level = 0;
	protected String challanger_maker_name = "gludio58_1926_700m1";

	protected void CREATED() {
myself.AddTimerEx(78001, 3 * 60 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 78001) {
if (myself.p_state != 3 && myself.p_state != 10 && gg.FloatToInt(myself.sm.hp) == gg.FloatToInt(myself.sm.max_hp)) {
maker0 = gg.GetNpcMaker(challanger_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010039, 0, 0);

}
myself.Despawn();

} else {
myself.AddTimerEx(78001, 3 * 60 * 1000);

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == Skill04_ID && myself.IsNullCreature(target) == 0) {
myself.Say(gg.MakeFString(1800129, target.name, "", "", "", ""));
gg.SetNpcParam(target, 9, target.hp - target.hp / 10 - my_level);
gg.SetNpcParam(myself.sm, 9, myself.sm.hp + 10 - my_level);

}
super;
	}

	protected void MY_DYING(HandlerParam attacker) {
if (my_level == 3 || my_level == 6) {
myself.Shout(gg.MakeFString(1800130, "", "", "", "", ""));

} else if (myself.IsNullCreature(attacker) == 0) {
myself.Shout(gg.MakeFString(1800131, attacker.name, "", "", "", ""));

}
super;
	}


}