package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_keeper extends citizen {
	protected String ShopName = "지옥의 창고";
	protected String fnHi = "whi.htm";
	protected String fnBye = "wbye.htm";
	protected String fnYouAreChaotic = "wyac.htm";
	protected String fnClassMismatch = "";
	protected String fnEmpty = "we.htm";
	protected String fnNowSiege = "";
	protected String fnNotFourthClass = "skillenchant_notfourthclass.htm";
	protected String fnLevelMismatch = "skillenchant_levelmismatch.htm";

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(-AddDoNothingDesire, 9999);
	}

	protected void TALKED(HandlerParam talker) {
if (talker.karma > 0) {
myself.ShowPage(talker, fnYouAreChaotic);

} else {
myself.ShowPage(talker, fnHi);

}
	}

	protected void LEARN_SKILL_REQUESTED(HandlerParam talker) {
if (myself.IsInCategory(59, talker.occupation)) {
myself.ShowSkillList(talker, "");

} else {
myself.ShowPage(talker, fnClassMismatch);

}
	}

	protected void ONE_SKILL_SELECTED(HandlerParam talker, HandlerParam skill_name_id, HandlerParam need_quest) {
myself.ShowGrowSkillMessage(talker, skill_name_id, "");
	}

	protected void ENCHANT_SKILL_REQUESTED(HandlerParam talker, HandlerParam action_id) {
if (myself.IsInCategory(59, talker.occupation)) {
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

	protected void SHOW_ENCHANT_SKILL_DRAWER(HandlerParam talker, HandlerParam skill_name_id, HandlerParam action_id) {
myself.ShowEnchantSkillListDrawer(talker, skill_name_id, action_id);
	}

	protected void ONE_ENCHANT_SKILL_SELECTED(HandlerParam talker, HandlerParam skill_name_id, HandlerParam action_id) {
myself.ShowEnchantSkillMessage(talker, skill_name_id, action_id);
	}


}