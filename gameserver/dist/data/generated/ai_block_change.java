package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_block_change extends abstract_npc {
	protected int Skill_Bond = 171442177;
	protected int Skill_Trap = 171507713;
	protected int Skill_TrapAtk1 = 383713281;
	protected int Skill_TrapAtk2 = 383647745;
	protected int GroundID = -1;
	protected int BlockUpsetPoint = 1;
	protected int ColorID = -1;
	protected int DropItem1 = 13787;
	protected int DropItem2 = 13788;

	protected void CREATED() {
myself.BlockUpsetRegisterMe(GroundID);
myself.BlockUpsetChangeColor(GroundID, ColorID);
	}

	protected void NO_DESIRE(HandlerParam i0) {
myself.AddMoveAroundDesire(5, 5);
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1) {
i0 = myself.GetEvolutionId();
i1 = 0;
if (i0 == 0 && skill_name_id == 383516673) {
i1 = 1;

}
if (i0 == 1 && skill_name_id == 383582209) {
i1 = 1;

}
if (i1 == 1) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_Bond)) > 0) {
return;

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill_Trap)) > 0) {
switch (gg.Rand(2)) {
case 0: {
myself.AddUseSkillDesire(speller, Skill_TrapAtk1, 0, 0, 100000000);
break;

}
case 1: {
myself.AddUseSkillDesire(speller, Skill_TrapAtk2, 0, 0, 100000000);
break;

}

}

}
if (i0 == 0) {
myself.BlockUpsetChangeColor(GroundID, 1);

}
if (i0 == 1) {
myself.BlockUpsetChangeColor(GroundID, 0);

}
if (gg.Rand(100) < 20) {
if (gg.Rand(2)) {
myself.DropItem1(myself.sm, DropItem1, 1);

} else {
myself.DropItem1(myself.sm, DropItem2, 1);

}

}
myself.BlockUpset(GroundID, 0, speller, BlockUpsetPoint);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam private, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam s1) {
if (script_event_arg1 == 9999) {
myself.BlockUpset(GroundID, 0, gg.GetCreatureFromIndex(script_event_arg2), BlockUpsetPoint);
myself.SetVisible(0);
myself.AddTimerEx(1000, 3000);

}
	}


}