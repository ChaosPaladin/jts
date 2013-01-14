package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class summon_magicalattack2 extends default_npc {
	protected int RangeDD = 262209537;
	protected int RangeDebuff = 262209537;

	protected void CREATED() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam action_id, HandlerParam i0, HandlerParam c0) {
if (action_id == 36) {
if (myself.Skill_GetConsumeMP(RangeDebuff) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeDebuff) < myself.sm.hp && myself.Skill_InReuseDelay(RangeDebuff) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, RangeDebuff, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(RangeDebuff) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(RangeDebuff) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(RangeDebuff) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

} else if (action_id == 39) {
if (myself.Skill_GetConsumeMP(RangeDD) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeDD) < myself.sm.hp && myself.Skill_InReuseDelay(RangeDD) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, RangeDD, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(RangeDD) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(RangeDD) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(RangeDD) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}
	}


}