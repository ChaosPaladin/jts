package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_white_block extends abstract_npc {
	protected int Skill_MassUpset = 383188993;
	protected int GroundID = -1;

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id) {
if (skill_name_id == 383516673 || skill_name_id == 383582209) {
myself.AddUseSkillDesire(myself.sm, Skill_MassUpset, 0, 0, 100000000);
myself.BroadcastScriptEvent(9999, gg.GetIndexFromCreature(speller), 100);

}
	}


}