package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guild_master_lv3 extends subjob_comp {
	protected int lv2_class1 = -1;
	protected int lv2_class2 = -1;
	protected int lv2_class3 = -1;
	protected int lv2_class4 = -1;
	protected int lv2_class5 = -1;
	protected int lv3_class11 = -1;
	protected int lv3_class12 = -1;
	protected int lv3_class13 = -1;
	protected int lv3_class21 = -1;
	protected int lv3_class22 = -1;
	protected int lv3_class23 = -1;
	protected int lv3_class31 = -1;
	protected int lv3_class32 = -1;
	protected int lv3_class33 = -1;
	protected int lv3_class41 = -1;
	protected int lv3_class42 = -1;
	protected int lv3_class43 = -1;
	protected int lv3_class51 = -1;
	protected int lv3_class52 = -1;
	protected int lv3_class53 = -1;
	protected int proof11x = 0;
	protected int proof11y = 0;
	protected int proof11z = 0;
	protected int proof12x = 0;
	protected int proof12y = 0;
	protected int proof12z = 0;
	protected int proof13x = 0;
	protected int proof13y = 0;
	protected int proof13z = 0;
	protected int proof21x = 0;
	protected int proof21y = 0;
	protected int proof21z = 0;
	protected int proof22x = 0;
	protected int proof22y = 0;
	protected int proof22z = 0;
	protected int proof23x = 0;
	protected int proof23y = 0;
	protected int proof23z = 0;
	protected int proof31x = 0;
	protected int proof31y = 0;
	protected int proof31z = 0;
	protected int proof32x = 0;
	protected int proof32y = 0;
	protected int proof32z = 0;
	protected int proof33x = 0;
	protected int proof33y = 0;
	protected int proof33z = 0;
	protected int proof41x = 0;
	protected int proof41y = 0;
	protected int proof41z = 0;
	protected int proof42x = 0;
	protected int proof42y = 0;
	protected int proof42z = 0;
	protected int proof43x = 0;
	protected int proof43y = 0;
	protected int proof43z = 0;
	protected int proof51x = 0;
	protected int proof51y = 0;
	protected int proof51z = 0;
	protected int proof52x = 0;
	protected int proof52y = 0;
	protected int proof52z = 0;
	protected int proof53x = 0;
	protected int proof53y = 0;
	protected int proof53z = 0;
	protected int weapon_ticket = 8870;
	protected int num_of_tickets = 15;

	protected void CLASS_CHANGE_REQUESTED(HandlerParam talker, HandlerParam occupation_name_id) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.IsInCategory(8, talker.occupation)) {
myself.ShowPage(talker, fnYouAreThirdClass);

} else {
if (lv3_class11 != -1 && occupation_name_id == lv3_class11 && talker.occupation == lv2_class1) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof11x) == 0 || gg.OwnItemCount(talker, proof11y) == 0 || gg.OwnItemCount(talker, proof11z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof11);

} else {
myself.ShowPage(talker, fnLowLevel11);

}

} else if (gg.OwnItemCount(talker, proof11x) == 0 || gg.OwnItemCount(talker, proof11y) == 0 || gg.OwnItemCount(talker, proof11z) == 0) {
myself.ShowPage(talker, fnNoProof11);

} else {
myself.DeleteItem1(talker, proof11x, gg.OwnItemCount(talker, proof11x));
myself.DeleteItem1(talker, proof11y, gg.OwnItemCount(talker, proof11y));
myself.DeleteItem1(talker, proof11z, gg.OwnItemCount(talker, proof11z));
myself.ClassChange(talker, lv3_class11);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange11);

}

}
if (lv3_class12 != -1 && occupation_name_id == lv3_class12 && talker.occupation == lv2_class1) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof12x) == 0 || gg.OwnItemCount(talker, proof12y) == 0 || gg.OwnItemCount(talker, proof12z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof12);

} else {
myself.ShowPage(talker, fnLowLevel12);

}

} else if (gg.OwnItemCount(talker, proof12x) == 0 || gg.OwnItemCount(talker, proof12y) == 0 || gg.OwnItemCount(talker, proof12z) == 0) {
myself.ShowPage(talker, fnNoProof12);

} else {
myself.DeleteItem1(talker, proof12x, gg.OwnItemCount(talker, proof12x));
myself.DeleteItem1(talker, proof12y, gg.OwnItemCount(talker, proof12y));
myself.DeleteItem1(talker, proof12z, gg.OwnItemCount(talker, proof12z));
myself.ClassChange(talker, lv3_class12);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange12);

}

}
if (lv3_class13 != -1 && occupation_name_id == lv3_class13 && talker.occupation == lv2_class1) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof13x) == 0 || gg.OwnItemCount(talker, proof13y) == 0 || gg.OwnItemCount(talker, proof13z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof13);

} else {
myself.ShowPage(talker, fnLowLevel13);

}

} else if (gg.OwnItemCount(talker, proof13x) == 0 || gg.OwnItemCount(talker, proof13y) == 0 || gg.OwnItemCount(talker, proof13z) == 0) {
myself.ShowPage(talker, fnNoProof13);

} else {
myself.DeleteItem1(talker, proof13x, gg.OwnItemCount(talker, proof13x));
myself.DeleteItem1(talker, proof13y, gg.OwnItemCount(talker, proof13y));
myself.DeleteItem1(talker, proof13z, gg.OwnItemCount(talker, proof13z));
myself.ClassChange(talker, lv3_class13);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange13);

}

}
if (lv3_class21 != -1 && occupation_name_id == lv3_class21 && talker.occupation == lv2_class2) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof21x) == 0 || gg.OwnItemCount(talker, proof21y) == 0 || gg.OwnItemCount(talker, proof21z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof21);

} else {
myself.ShowPage(talker, fnLowLevel21);

}

} else if (gg.OwnItemCount(talker, proof21x) == 0 || gg.OwnItemCount(talker, proof21y) == 0 || gg.OwnItemCount(talker, proof21z) == 0) {
myself.ShowPage(talker, fnNoProof21);

} else {
myself.DeleteItem1(talker, proof21x, gg.OwnItemCount(talker, proof21x));
myself.DeleteItem1(talker, proof21y, gg.OwnItemCount(talker, proof21y));
myself.DeleteItem1(talker, proof21z, gg.OwnItemCount(talker, proof21z));
myself.ClassChange(talker, lv3_class21);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange21);

}

}
if (lv3_class22 != -1 && occupation_name_id == lv3_class22 && talker.occupation == lv2_class2) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof22x) == 0 || gg.OwnItemCount(talker, proof22y) == 0 || gg.OwnItemCount(talker, proof22z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof22);

} else {
myself.ShowPage(talker, fnLowLevel22);

}

} else if (gg.OwnItemCount(talker, proof22x) == 0 || gg.OwnItemCount(talker, proof22y) == 0 || gg.OwnItemCount(talker, proof22z) == 0) {
myself.ShowPage(talker, fnNoProof22);

} else {
myself.DeleteItem1(talker, proof22x, gg.OwnItemCount(talker, proof22x));
myself.DeleteItem1(talker, proof22y, gg.OwnItemCount(talker, proof22y));
myself.DeleteItem1(talker, proof22z, gg.OwnItemCount(talker, proof22z));
myself.ClassChange(talker, lv3_class22);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange22);

}

}
if (lv3_class23 != -1 && occupation_name_id == lv3_class23 && talker.occupation == lv2_class2) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof23x) == 0 || gg.OwnItemCount(talker, proof23y) == 0 || gg.OwnItemCount(talker, proof23z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof23);

} else {
myself.ShowPage(talker, fnLowLevel23);

}

} else if (gg.OwnItemCount(talker, proof23x) == 0 || gg.OwnItemCount(talker, proof23y) == 0 || gg.OwnItemCount(talker, proof23z) == 0) {
myself.ShowPage(talker, fnNoProof23);

} else {
myself.DeleteItem1(talker, proof23x, gg.OwnItemCount(talker, proof23x));
myself.DeleteItem1(talker, proof23y, gg.OwnItemCount(talker, proof23y));
myself.DeleteItem1(talker, proof23z, gg.OwnItemCount(talker, proof23z));
myself.ClassChange(talker, lv3_class23);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange23);

}

}
if (lv3_class31 != -1 && occupation_name_id == lv3_class31 && talker.occupation == lv2_class3) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof31x) == 0 || gg.OwnItemCount(talker, proof31y) == 0 || gg.OwnItemCount(talker, proof31z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof31);

} else {
myself.ShowPage(talker, fnLowLevel31);

}

} else if (gg.OwnItemCount(talker, proof31x) == 0 || gg.OwnItemCount(talker, proof31y) == 0 || gg.OwnItemCount(talker, proof31z) == 0) {
myself.ShowPage(talker, fnNoProof31);

} else {
myself.DeleteItem1(talker, proof31x, gg.OwnItemCount(talker, proof31x));
myself.DeleteItem1(talker, proof31y, gg.OwnItemCount(talker, proof31y));
myself.DeleteItem1(talker, proof31z, gg.OwnItemCount(talker, proof31z));
myself.ClassChange(talker, lv3_class31);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange31);

}

}
if (lv3_class32 != -1 && occupation_name_id == lv3_class32 && talker.occupation == lv2_class3) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof32x) == 0 || gg.OwnItemCount(talker, proof32y) == 0 || gg.OwnItemCount(talker, proof32z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof32);

} else {
myself.ShowPage(talker, fnLowLevel32);

}

} else if (gg.OwnItemCount(talker, proof32x) == 0 || gg.OwnItemCount(talker, proof32y) == 0 || gg.OwnItemCount(talker, proof32z) == 0) {
myself.ShowPage(talker, fnNoProof32);

} else {
myself.DeleteItem1(talker, proof32x, gg.OwnItemCount(talker, proof32x));
myself.DeleteItem1(talker, proof32y, gg.OwnItemCount(talker, proof32y));
myself.DeleteItem1(talker, proof32z, gg.OwnItemCount(talker, proof32z));
myself.ClassChange(talker, lv3_class32);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange32);

}

}
if (lv3_class33 != -1 && occupation_name_id == lv3_class33 && talker.occupation == lv2_class3) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof33x) == 0 || gg.OwnItemCount(talker, proof33y) == 0 || gg.OwnItemCount(talker, proof33z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof33);

} else {
myself.ShowPage(talker, fnLowLevel33);

}

} else if (gg.OwnItemCount(talker, proof33x) == 0 || gg.OwnItemCount(talker, proof33y) == 0 || gg.OwnItemCount(talker, proof33z) == 0) {
myself.ShowPage(talker, fnNoProof33);

} else {
myself.DeleteItem1(talker, proof33x, gg.OwnItemCount(talker, proof33x));
myself.DeleteItem1(talker, proof33y, gg.OwnItemCount(talker, proof33y));
myself.DeleteItem1(talker, proof33z, gg.OwnItemCount(talker, proof33z));
myself.ClassChange(talker, lv3_class33);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange33);

}

}
if (lv3_class41 != -1 && occupation_name_id == lv3_class41 && talker.occupation == lv2_class4) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof41x) == 0 || gg.OwnItemCount(talker, proof41y) == 0 || gg.OwnItemCount(talker, proof41z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof41);

} else {
myself.ShowPage(talker, fnLowLevel41);

}

} else if (gg.OwnItemCount(talker, proof41x) == 0 || gg.OwnItemCount(talker, proof41y) == 0 || gg.OwnItemCount(talker, proof41z) == 0) {
myself.ShowPage(talker, fnNoProof41);

} else {
myself.DeleteItem1(talker, proof41x, gg.OwnItemCount(talker, proof41x));
myself.DeleteItem1(talker, proof41y, gg.OwnItemCount(talker, proof41y));
myself.DeleteItem1(talker, proof41z, gg.OwnItemCount(talker, proof41z));
myself.ClassChange(talker, lv3_class41);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange41);

}

}
if (lv3_class42 != -1 && occupation_name_id == lv3_class42 && talker.occupation == lv2_class4) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof42x) == 0 || gg.OwnItemCount(talker, proof42y) == 0 || gg.OwnItemCount(talker, proof42z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof42);

} else {
myself.ShowPage(talker, fnLowLevel42);

}

} else if (gg.OwnItemCount(talker, proof42x) == 0 || gg.OwnItemCount(talker, proof42y) == 0 || gg.OwnItemCount(talker, proof42z) == 0) {
myself.ShowPage(talker, fnNoProof42);

} else {
myself.DeleteItem1(talker, proof42x, gg.OwnItemCount(talker, proof42x));
myself.DeleteItem1(talker, proof42y, gg.OwnItemCount(talker, proof42y));
myself.DeleteItem1(talker, proof42z, gg.OwnItemCount(talker, proof42z));
myself.ClassChange(talker, lv3_class42);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange42);

}

}
if (lv3_class43 != -1 && occupation_name_id == lv3_class43 && talker.occupation == lv2_class4) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof43x) == 0 || gg.OwnItemCount(talker, proof43y) == 0 || gg.OwnItemCount(talker, proof43z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof43);

} else {
myself.ShowPage(talker, fnLowLevel43);

}

} else if (gg.OwnItemCount(talker, proof43x) == 0 || gg.OwnItemCount(talker, proof43y) == 0 || gg.OwnItemCount(talker, proof43z) == 0) {
myself.ShowPage(talker, fnNoProof43);

} else {
myself.DeleteItem1(talker, proof43x, gg.OwnItemCount(talker, proof43x));
myself.DeleteItem1(talker, proof43y, gg.OwnItemCount(talker, proof43y));
myself.DeleteItem1(talker, proof43z, gg.OwnItemCount(talker, proof43z));
myself.ClassChange(talker, lv3_class43);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange43);

}

}
if (lv3_class51 != -1 && occupation_name_id == lv3_class51 && talker.occupation == lv2_class5) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof51x) == 0 || gg.OwnItemCount(talker, proof51y) == 0 || gg.OwnItemCount(talker, proof51z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof51);

} else {
myself.ShowPage(talker, fnLowLevel51);

}

} else if (gg.OwnItemCount(talker, proof51x) == 0 || gg.OwnItemCount(talker, proof51y) == 0 || gg.OwnItemCount(talker, proof51z) == 0) {
myself.ShowPage(talker, fnNoProof51);

} else {
myself.DeleteItem1(talker, proof51x, gg.OwnItemCount(talker, proof51x));
myself.DeleteItem1(talker, proof51y, gg.OwnItemCount(talker, proof51y));
myself.DeleteItem1(talker, proof51z, gg.OwnItemCount(talker, proof51z));
myself.ClassChange(talker, lv3_class51);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange51);

}

}
if (lv3_class52 != -1 && occupation_name_id == lv3_class52 && talker.occupation == lv2_class5) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof52x) == 0 || gg.OwnItemCount(talker, proof52y) == 0 || gg.OwnItemCount(talker, proof52z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof52);

} else {
myself.ShowPage(talker, fnLowLevel52);

}

} else if (gg.OwnItemCount(talker, proof52x) == 0 || gg.OwnItemCount(talker, proof52y) == 0 || gg.OwnItemCount(talker, proof52z) == 0) {
myself.ShowPage(talker, fnNoProof52);

} else {
myself.DeleteItem1(talker, proof52x, gg.OwnItemCount(talker, proof52x));
myself.DeleteItem1(talker, proof52y, gg.OwnItemCount(talker, proof52y));
myself.DeleteItem1(talker, proof52z, gg.OwnItemCount(talker, proof52z));
myself.ClassChange(talker, lv3_class52);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange52);

}

}
if (lv3_class53 != -1 && occupation_name_id == lv3_class53 && talker.occupation == lv2_class5) {
if (talker.level < 40) {
if (gg.OwnItemCount(talker, proof53x) == 0 || gg.OwnItemCount(talker, proof53y) == 0 || gg.OwnItemCount(talker, proof53z) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof53);

} else {
myself.ShowPage(talker, fnLowLevel53);

}

} else if (gg.OwnItemCount(talker, proof53x) == 0 || gg.OwnItemCount(talker, proof53y) == 0 || gg.OwnItemCount(talker, proof53z) == 0) {
myself.ShowPage(talker, fnNoProof53);

} else {
myself.DeleteItem1(talker, proof53x, gg.OwnItemCount(talker, proof53x));
myself.DeleteItem1(talker, proof53y, gg.OwnItemCount(talker, proof53y));
myself.DeleteItem1(talker, proof53z, gg.OwnItemCount(talker, proof53z));
myself.ClassChange(talker, lv3_class53);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange53);

}

}

}
	}


}