package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_immo_trap extends default_npc {
	protected int FieldCycle = 3;
	protected int tide = 0;
	protected int zone = 0;
	protected int room = 2;
	protected String type = "trap";
	protected String my_trap_spawner = "";
	protected String dispatcher_maker = "";
	protected int trap_skill01 = 355401737;
	protected int trap_skill02 = 355467273;
	protected int trap_skill_display = 341966849;
	protected int babble_mode = 0;

	protected void CREATED(HandlerParam maker0) {
if (babble_mode == 1) {
myself.Say("트랩 -  스폰!");

}
myself.i_ai0 = 0;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam maker0, HandlerParam i0) {
if (gg.IsSameString(type, "spawn") == 1 || gg.IsSameString(type, "skill") == 1) {
if (babble_mode == 1) {
myself.Say("트랩 -  봤음!");

}
myself.AddUseSkillDesire(creature, trap_skill_display, 0, 1, 1000000);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success, HandlerParam maker0) {
if (skill_name_id == trap_skill01 || skill_name_id == trap_skill02 && success == 1) {
myself.Despawn();

} else if (skill_name_id == trap_skill_display && success == 1) {
if (gg.IsSameString(type, "spawn") == 1) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), my_trap_spawner);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010059, 0, 0);

}
myself.Despawn();

} else if (gg.IsSameString(type, "skill") == 1) {
switch (gg.Rand(2)) {
case 0: {
myself.AddUseSkillDesire(myself.sm, trap_skill01, 0, 0, 1000000);
break;

}
case 1: {
myself.AddUseSkillDesire(myself.sm, trap_skill02, 0, 0, 1000000);
break;

}

}

}

}
	}

	protected void TRAP_DEFUSED() {
if (babble_mode == 1) {
myself.Say("트랩 -  해제!");

}
myself.Despawn();
	}


}