package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class collector extends merchant {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam fhtml0) {
super;
	}

	protected void LEARN_SKILL_REQUESTED(HandlerParam talker) {
myself.ShowEtcSkillList(talker, 6, "");
	}

	protected void ONE_SKILL_SELECTED(HandlerParam talker, HandlerParam skill_name_id, HandlerParam need_quest) {
myself.ShowGrowEtcSkillMessage(talker, skill_name_id, 6, "");
	}


}