package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class summon_bomb extends default_npc {
	protected int DDMagic = 262209537;
	protected int step1_action01 = -1;

	protected void CREATED() {
myself.Summon_SetOption(3, 1);
myself.Summon_SetOption(2, 1);
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam action_id, HandlerParam i0, HandlerParam c0, HandlerParam so0) {
if (action_id == 22) {
i0 = myself.master.target_id;
if (i0 <= 0) {
return;

}
myself.AddMoveToTargetDesire(i0, 150, 0, 10000);

} else if (action_id == step1_action01) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesireEx(myself.sm.id, DDMagic, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(DDMagic) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(DDMagic) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(DDMagic) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam success) {
if (success == 1) {
myself.Suicide();

}
	}


}