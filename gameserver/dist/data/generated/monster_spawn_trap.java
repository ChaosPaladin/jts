package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class monster_spawn_trap extends default_trap {
	protected int show_created = 1;
	protected int show_detected = 0;
	protected int show_activated = 0;
	protected int show_step_in = 0;
	protected int show_step_out = 0;
	protected int show_defused = 1;
	protected String Privates = "";

	protected void TRAP_STEP_IN(HandlerParam i0, HandlerParam i1, HandlerParam c0) {
if (myself.m_WorldTrapState == 1) {
myself.CreatePrivates(Privates);
myself.DefuseWorldTrapByClassId(myself.sm.id, myself.sm.class_id);

}
super;
	}


}