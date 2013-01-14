package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mage_coach extends guild_coach {
	protected int skill_sharing_item = -1;
	protected int token_num = 0;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == -707) {
if (reply == 1) {
if (myself.sm.race == 0 && myself.IsInCategory(47, talker.occupation) || myself.sm.race == 1 && myself.IsInCategory(51, talker.occupation) || myself.sm.race == 2 && myself.IsInCategory(55, talker.occupation)) {
if (myself.IsInCategory(9, talker.occupation)) {
if (talker.level > 75) {
if (talker.transformID == 312 || talker.transformID == 313 || talker.transformID == 314 || talker.transformID == 315 || talker.transformID == 316 || talker.transformID == 317 || talker.transformID == 318) {
myself.ShowPage(talker, "skillenchant_notvang.htm");

} else if (talker.occupation == 97) {
myself.ShowEtcSkillList(talker, 7, "");

} else if (talker.occupation == 105) {
myself.ShowEtcSkillList(talker, 8, "");

} else if (talker.occupation == 112) {
myself.ShowEtcSkillList(talker, 9, "");

} else {
myself.ShowPage(talker, "skill_share_healer_fail.htm");

}

} else {
myself.ShowPage(talker, "skill_share_level_fail.htm");

}

} else {
myself.ShowPage(talker, "skill_share_level_fail.htm");

}

} else {
myself.ShowPage(talker, fnClassMismatch);

}

} else if (reply == 2) {
if (myself.sm.race == 0 && talker.occupation == 97) {
if (gg.OwnItemCount(talker, skill_sharing_item) >= 1) {
myself.ShowPage(talker, "skill_share_healer_have.htm");

} else if (gg.OwnItemCount(talker, 57) < 10000000) {
myself.ShowSystemMessage(talker, 3080);

} else {
myself.DeleteAcquireSkills(talker, 7);
myself.DeleteItem1(talker, skill_sharing_item, gg.OwnItemCount(talker, skill_sharing_item));
myself.DeleteItem1(talker, 57, 10000000);
myself.AddLogByNpc(8057, talker, 10000000, 0);
myself.GiveItem1(talker, skill_sharing_item, token_num);

}

} else if (myself.sm.race == 1 && talker.occupation == 105) {
if (gg.OwnItemCount(talker, skill_sharing_item) >= 1) {
myself.ShowPage(talker, "skill_share_healer_have.htm");

} else if (gg.OwnItemCount(talker, 57) < 10000000) {
myself.ShowSystemMessage(talker, 3080);

} else {
myself.DeleteAcquireSkills(talker, 8);
myself.DeleteItem1(talker, skill_sharing_item, gg.OwnItemCount(talker, skill_sharing_item));
myself.DeleteItem1(talker, 57, 10000000);
myself.AddLogByNpc(8057, talker, 10000000, 0);
myself.GiveItem1(talker, skill_sharing_item, token_num);

}

} else if (myself.sm.race == 2 && talker.occupation == 112) {
if (gg.OwnItemCount(talker, skill_sharing_item) >= 1) {
myself.ShowPage(talker, "skill_share_healer_have.htm");

} else if (gg.OwnItemCount(talker, 57) < 10000000) {
myself.ShowSystemMessage(talker, 3080);

} else {
myself.DeleteAcquireSkills(talker, 9);
myself.DeleteItem1(talker, skill_sharing_item, gg.OwnItemCount(talker, skill_sharing_item));
myself.DeleteItem1(talker, 57, 10000000);
myself.AddLogByNpc(8057, talker, 10000000, 0);
myself.GiveItem1(talker, skill_sharing_item, token_num);

}

} else {
myself.ShowPage(talker, "skill_share_reset_fail.htm");

}

}

}
super;
	}

	protected void LEARN_SKILL_REQUESTED(HandlerParam talker) {
if (myself.sm.race == 0 && myself.IsInCategory(46, talker.occupation) || myself.sm.race == 1 && myself.IsInCategory(49, talker.occupation) || myself.sm.race == 2 && myself.IsInCategory(53, talker.occupation) || myself.sm.race == 3 && myself.IsInCategory(57, talker.occupation)) {
myself.ShowSkillList(talker, "");

} else {
myself.ShowPage(talker, fnClassMismatch);

}
	}

	protected void ENCHANT_SKILL_REQUESTED(HandlerParam talker, HandlerParam action_id) {
if (myself.sm.race == 0 && myself.IsInCategory(46, talker.occupation) || myself.sm.race == 1 && myself.IsInCategory(49, talker.occupation) || myself.sm.race == 2 && myself.IsInCategory(53, talker.occupation) || myself.sm.race == 3 && myself.IsInCategory(57, talker.occupation)) {
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