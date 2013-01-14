package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kamael_coach extends guild_coach {
	protected int gender = 1;

	protected void LEARN_SKILL_REQUESTED(HandlerParam talker) {
if (myself.sm.race == 5) {
if (gender == 1 && myself.IsInCategory(68, talker.occupation)) {
myself.ShowSkillList(talker, "");

} else if (gender == 2 && myself.IsInCategory(69, talker.occupation)) {
myself.ShowSkillList(talker, "");

} else {
myself.ShowPage(talker, fnClassMismatch);

}

} else {
myself.ShowPage(talker, fnClassMismatch);

}
	}

	protected void ONE_SKILL_SELECTED(HandlerParam talker, HandlerParam skill_name_id, HandlerParam need_quest) {
myself.ShowGrowSkillMessage(talker, skill_name_id, "");
	}

	protected void ENCHANT_SKILL_REQUESTED(HandlerParam talker, HandlerParam action_id) {
if (myself.IsInCategory(61, talker.occupation)) {
if (myself.IsInCategory(65, talker.occupation)) {
if (gender == 1 && myself.IsInCategory(68, talker.occupation)) {
if (talker.level > 75) {
if (talker.transformID == 312 || talker.transformID == 313 || talker.transformID == 314 || talker.transformID == 315 || talker.transformID == 316 || talker.transformID == 317 || talker.transformID == 318) {
myself.ShowPage(talker, "skillenchant_notvang.htm");

} else {
myself.ShowEnchantSkillList(talker, action_id);

}

} else {
myself.ShowPage(talker, fnLevelMismatch);

}

} else if (gender == 2 && myself.IsInCategory(69, talker.occupation)) {
if (talker.level > 75) {
if (talker.transformID == 312 || talker.transformID == 313 || talker.transformID == 314 || talker.transformID == 315 || talker.transformID == 316 || talker.transformID == 317 || talker.transformID == 318) {
myself.ShowPage(talker, "skillenchant_notvang.htm");

} else {
myself.ShowEnchantSkillList(talker, action_id);

}

} else {
myself.ShowPage(talker, fnLevelMismatch);

}

} else {
myself.ShowPage(talker, fnClassMismatch);

}

} else {
myself.ShowPage(talker, fnNotFourthClass);

}

} else {
myself.ShowPage(talker, fnClassMismatch);

}
	}

	protected void SHOW_ENCHANT_SKILL_DRAWER(HandlerParam talker, HandlerParam skill_name_id, HandlerParam action_id) {
myself.ShowEnchantSkillListDrawer(talker, skill_name_id, action_id);
	}

	protected void ONE_ENCHANT_SKILL_SELECTED(HandlerParam talker, HandlerParam skill_name_id, HandlerParam action_id) {
myself.ShowEnchantSkillMessage(talker, skill_name_id, action_id);
	}


}