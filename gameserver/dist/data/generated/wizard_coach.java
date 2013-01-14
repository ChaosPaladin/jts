package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_coach extends guild_coach {
	protected void LEARN_SKILL_REQUESTED(HandlerParam talker) {
if (myself.sm.race == 0 && myself.IsInCategory(45, talker.occupation) || myself.sm.race == 1 && myself.IsInCategory(50, talker.occupation) || myself.sm.race == 2 && myself.IsInCategory(54, talker.occupation)) {
myself.ShowSkillList(talker, "");

} else {
myself.ShowPage(talker, fnClassMismatch);

}
	}

	protected void ENCHANT_SKILL_REQUESTED(HandlerParam talker, HandlerParam action_id) {
if (myself.sm.race == 0 && myself.IsInCategory(45, talker.occupation) || myself.sm.race == 1 && myself.IsInCategory(50, talker.occupation) || myself.sm.race == 2 && myself.IsInCategory(54, talker.occupation)) {
if (myself.IsInCategory(9, talker.occupation)) {
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
myself.ShowPage(talker, fnNotFourthClass);

}

} else {
myself.ShowPage(talker, fnClassMismatch);

}
	}


}