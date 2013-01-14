package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_bomona extends citizen {
	protected int CHECK_SKILL = 419954689;
	protected int TRANSFORM_SKILL = 435748865;
	protected String fnHi = "bomona001.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "bomona001.htm");
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -415 && reply == 1) {
if (gg.GetAbnormalLevel(talker, myself.Skill_GetAbnormalType(CHECK_SKILL)) == 1) {
myself.ShowPage(talker, "bomona003a.htm");

} else {
myself.CastBuffForQuestReward(talker, TRANSFORM_SKILL);
myself.CastBuffForQuestReward(talker, CHECK_SKILL);
myself.ShowPage(talker, "bomona003b.htm");

}

}
super;
	}


}