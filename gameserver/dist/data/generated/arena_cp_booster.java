package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class arena_cp_booster extends warehouse_keeper {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -1000) {
if (reply == 0) {
if (gg.OwnItemCount(talker, 57) > 99) {
if (myself.Skill_GetConsumeMP(287047681) < myself.sm.mp && myself.Skill_GetConsumeHP(287047681) < myself.sm.hp && myself.Skill_InReuseDelay(287047681) == 0) {
myself.AddUseSkillDesire(talker, 287047681, 0, 0, 1000000);

}
myself.DeleteItem1(talker, 57, 100);

} else {
myself.ShowSystemMessage(talker, 279);

}

}

}
	}


}