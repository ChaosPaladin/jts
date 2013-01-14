package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_wizard_clanbuff extends royal_rush_wizard_ddmagic2 {
	protected int W_ClanBuff = 272039937;

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage, HandlerParam i6, HandlerParam h0) {
myself.RemoveAllHateInfoIF(1, 0);
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.GetHateInfoCount() == 0) {
if (myself.Skill_GetConsumeMP(W_ClanBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ClanBuff) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ClanBuff) == 0) {
myself.AddUseSkillDesire(attacker, W_ClanBuff, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_ClanBuff, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}
super;
	}


}