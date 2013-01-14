package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guild_coach extends citizen {
	protected String fnHi = "master_aiken001.htm";
	protected String fnClassMismatch = "gcm.htm";
	protected String fnNotFourthClass = "skillenchant_notfourthclass.htm";
	protected String fnLevelMismatch = "skillenchant_levelmismatch.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void LEARN_SKILL_REQUESTED(HandlerParam talker) {
myself.ShowSkillList(talker, "");
	}

	protected void ONE_SKILL_SELECTED(HandlerParam talker, HandlerParam skill_name_id, HandlerParam need_quest, HandlerParam i0) {
if (i0 == 0) {
myself.ShowGrowSkillMessage(talker, skill_name_id, "");

} else if (i0 >= 1) {
myself.ShowGrowEtcSkillMessage(talker, skill_name_id, i0, "");

}
	}

	protected void ENCHANT_SKILL_REQUESTED(HandlerParam talker, HandlerParam action_id) {
if (talker.transformID == 312 || talker.transformID == 313 || talker.transformID == 314 || talker.transformID == 315 || talker.transformID == 316 || talker.transformID == 317 || talker.transformID == 318) {
myself.ShowPage(talker, "skillenchant_notvang.htm");

} else {
myself.ShowEnchantSkillList(talker, action_id);

}
	}

	protected void SHOW_ENCHANT_SKILL_DRAWER(HandlerParam talker, HandlerParam skill_name_id, HandlerParam action_id) {
if (talker.transformID == 312 || talker.transformID == 313 || talker.transformID == 314 || talker.transformID == 315 || talker.transformID == 316 || talker.transformID == 317 || talker.transformID == 318) {
myself.Say("당신은 현재 변신체임");

} else {
myself.ShowEnchantSkillListDrawer(talker, skill_name_id, action_id);

}
	}

	protected void ONE_ENCHANT_SKILL_SELECTED(HandlerParam talker, HandlerParam skill_name_id, HandlerParam action_id) {
myself.ShowEnchantSkillMessage(talker, skill_name_id, action_id);
	}


}