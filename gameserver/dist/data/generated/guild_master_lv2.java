package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guild_master_lv2 extends guild_master {
	protected int lv1_class1 = -1;
	protected int lv1_class2 = -1;
	protected int lv2_class11 = -1;
	protected int lv2_class12 = -1;
	protected int lv2_class13 = -1;
	protected int lv2_class21 = -1;
	protected int lv2_class22 = -1;
	protected int lv2_class23 = -1;
	protected int proof11 = 0;
	protected int proof12 = 0;
	protected int proof13 = 0;
	protected int proof21 = 0;
	protected int proof22 = 0;
	protected int proof23 = 0;
	protected int weapon_ticket = 8869;
	protected int num_of_tickets = 15;

	protected void CLASS_CHANGE_REQUESTED(HandlerParam talker, HandlerParam occupation_name_id) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.IsInCategory(7, talker.occupation)) {
myself.ShowPage(talker, fnYouAreSecondClass);

} else if (myself.IsInCategory(8, talker.occupation)) {
myself.ShowPage(talker, fnYouAreThirdClass);

} else if (myself.IsInCategory(9, talker.occupation)) {
myself.ShowPage(talker, fnYouAreFourthClass);

} else {
if (lv2_class11 != -1 && occupation_name_id == lv2_class11 && talker.occupation == lv1_class1) {
if (talker.level < 20) {
if (gg.OwnItemCount(talker, proof11) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof11);

} else {
myself.ShowPage(talker, fnLowLevel11);

}

} else if (gg.OwnItemCount(talker, proof11) == 0) {
myself.ShowPage(talker, fnNoProof11);

} else {
myself.DeleteItem1(talker, proof11, gg.OwnItemCount(talker, proof11));
myself.ClassChange(talker, lv2_class11);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange11);

}

}
if (lv2_class12 != -1 && occupation_name_id == lv2_class12 && talker.occupation == lv1_class1) {
if (talker.level < 20) {
if (gg.OwnItemCount(talker, proof12) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof12);

} else {
myself.ShowPage(talker, fnLowLevel12);

}

} else if (gg.OwnItemCount(talker, proof12) == 0) {
myself.ShowPage(talker, fnNoProof12);

} else {
myself.DeleteItem1(talker, proof12, gg.OwnItemCount(talker, proof12));
myself.ClassChange(talker, lv2_class12);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange12);

}

}
if (lv2_class13 != -1 && occupation_name_id == lv2_class13 && talker.occupation == lv1_class1) {
if (talker.level < 20) {
if (gg.OwnItemCount(talker, proof13) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof13);

} else {
myself.ShowPage(talker, fnLowLevel13);

}

} else if (gg.OwnItemCount(talker, proof13) == 0) {
myself.ShowPage(talker, fnNoProof13);

} else {
myself.DeleteItem1(talker, proof13, gg.OwnItemCount(talker, proof13));
myself.ClassChange(talker, lv2_class13);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange13);

}

}
if (lv2_class21 != -1 && occupation_name_id == lv2_class21 && talker.occupation == lv1_class2) {
if (talker.level < 20) {
if (gg.OwnItemCount(talker, proof21) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof21);

} else {
myself.ShowPage(talker, fnLowLevel21);

}

} else if (gg.OwnItemCount(talker, proof21) == 0) {
myself.ShowPage(talker, fnNoProof21);

} else {
myself.DeleteItem1(talker, proof21, gg.OwnItemCount(talker, proof21));
myself.ClassChange(talker, lv2_class21);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange21);

}

}
if (lv2_class22 != -1 && occupation_name_id == lv2_class22 && talker.occupation == lv1_class2) {
if (talker.level < 20) {
if (gg.OwnItemCount(talker, proof22) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof22);

} else {
myself.ShowPage(talker, fnLowLevel22);

}

} else if (gg.OwnItemCount(talker, proof22) == 0) {
myself.ShowPage(talker, fnNoProof22);

} else {
myself.DeleteItem1(talker, proof22, gg.OwnItemCount(talker, proof22));
myself.ClassChange(talker, lv2_class22);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange22);

}

}
if (lv2_class23 != -1 && occupation_name_id == lv2_class23 && talker.occupation == lv1_class2) {
if (talker.level < 20) {
if (gg.OwnItemCount(talker, proof23) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof23);

} else {
myself.ShowPage(talker, fnLowLevel23);

}

} else if (gg.OwnItemCount(talker, proof23) == 0) {
myself.ShowPage(talker, fnNoProof23);

} else {
myself.DeleteItem1(talker, proof23, gg.OwnItemCount(talker, proof23));
myself.ClassChange(talker, lv2_class23);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange23);

}

}

}
	}


}