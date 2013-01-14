package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guild_master_kamael extends guild_master_kamael_subjob {
	protected int gender = 1;
	protected int lv1_class1 = 123;
	protected int lv1_class2 = 124;
	protected int lv2_class11 = 125;
	protected int lv2_class21 = 126;
	protected int proof111 = 62;
	protected int proof112 = 9753;
	protected int proof121 = 63;
	protected int proof122 = 9772;
	protected int lv2_class1 = 125;
	protected int lv2_class2 = 126;
	protected int lv3_class11 = 127;
	protected int lv3_class12 = 128;
	protected int lv3_class21 = 129;
	protected int lv3_class22 = 130;
	protected int proof211 = 64;
	protected int proof212 = 9760;
	protected int proof221 = 65;
	protected int proof222 = 9806;
	protected int proof231 = 66;
	protected int proof232 = 9782;
	protected String fnClassList11 = "master_all_kamael003m.htm";
	protected String fnClassList12 = "master_all_kamael003f.htm";
	protected String fnLowLevelNoProof11 = "master_all_kamael008ma.htm";
	protected String fnLowLevelNoProof12 = "master_all_kamael008fa.htm";
	protected String fnLowLevel11 = "master_all_kamael009ma.htm";
	protected String fnLowLevel12 = "master_all_kamael009fa.htm";
	protected String fnNoProof11 = "master_all_kamael010ma.htm";
	protected String fnNoProof12 = "master_all_kamael010fa.htm";
	protected String fnAfterClassChange11 = "master_all_kamael011ma.htm";
	protected String fnAfterClassChange12 = "master_all_kamael011fa.htm";
	protected String fnClassList21 = "";
	protected String fnClassList22 = "";
	protected String fnClassList23 = "";
	protected String fnClassList24 = "";
	protected String fnLowLevelNoProof21 = "master_all_kamael008ta.htm";
	protected String fnLowLevelNoProof22 = "master_all_kamael008msa.htm";
	protected String fnLowLevelNoProof23 = "master_all_kamael008fsa.htm";
	protected String fnLowLevelNoProof24 = "master_all_kamael008wa.htm";
	protected String fnLowLevel21 = "master_all_kamael009ta.htm";
	protected String fnLowLevel22 = "master_all_kamael009msa.htm";
	protected String fnLowLevel23 = "master_all_kamael009fsa.htm";
	protected String fnLowLevel24 = "master_all_kamael009wa.htm";
	protected String fnNoProof21 = "master_all_kamael010ta.htm";
	protected String fnNoProof22 = "master_all_kamael010msa.htm";
	protected String fnNoProof23 = "master_all_kamael010fsa.htm";
	protected String fnNoProof24 = "master_all_kamael010wa.htm";
	protected String fnAfterClassChange21 = "master_all_kamael011ta.htm";
	protected String fnAfterClassChange22 = "master_all_kamael011msa.htm";
	protected String fnAfterClassChange23 = "master_all_kamael011fsa.htm";
	protected String fnAfterClassChange24 = "master_all_kamael011wa.htm";
	protected String fnNotMale = "master_all_kamael002b.htm";
	protected String fnNotFemale = "master_all_kamael002c.htm";
	protected int weapon_ticket = 8869;
	protected int num_of_tickets = 15;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam fhtml0, HandlerParam state) {
if (ask == -2 && reply == 1) {
if (talker.race != 5) {
myself.ShowPage(talker, "master_all_kamael002a.htm");
return;

} else if (myself.IsInCategory(62, talker.occupation)) {
if (talker.occupation == 123) {
myself.ShowPage(talker, fnClassList11);

} else if (talker.occupation == 124) {
myself.ShowPage(talker, fnClassList12);

}

} else if (myself.IsInCategory(63, talker.occupation)) {
myself.ShowPage(talker, "master_all_kamael004a.htm");

} else if (myself.IsInCategory(64, talker.occupation)) {
myself.ShowPage(talker, "master_all_kamael005a.htm");

} else {
myself.ShowPage(talker, "master_all_kamael100a.htm");

}

} else if (ask == -2 && reply == 2) {
if (talker.race != 5) {
myself.ShowPage(talker, "master_all_kamael002a.htm");
return;

} else if (myself.IsInCategory(62, talker.occupation)) {
if (talker.occupation == 123) {
myself.ShowPage(talker, "master_all_kamael012b.htm");

} else if (talker.occupation == 124) {
myself.ShowPage(talker, "master_all_kamael012c.htm");

}

} else if (myself.IsInCategory(63, talker.occupation)) {
if (gender == 1) {
if (myself.IsInCategory(69, talker.occupation)) {
myself.ShowPage(talker, fnNotMale);
return;

}
if (talker.occupation == 125) {
myself.ShowPage(talker, "master_all_kamael003t.htm");

} else if (talker.occupation == 126) {
myself.ShowPage(talker, "master_all_kamael012b.htm");

}

} else if (gender == 2) {
if (myself.IsInCategory(68, talker.occupation)) {
myself.ShowPage(talker, fnNotFemale);
return;

}
if (talker.occupation == 125) {
myself.ShowPage(talker, "master_all_kamael012c.htm");

} else if (talker.occupation == 126) {
myself.ShowPage(talker, "master_all_kamael003w.htm");

}

}

} else if (myself.IsInCategory(64, talker.occupation)) {
if (gender == 1) {
if (myself.IsInCategory(68, talker.occupation)) {
myself.ShowPage(talker, "master_all_kamael005b.htm");

} else {
myself.ShowPage(talker, fnNotMale);

}

} else if (gender == 2) {
if (myself.IsInCategory(69, talker.occupation)) {
myself.ShowPage(talker, "master_all_kamael005c.htm");

} else {
myself.ShowPage(talker, fnNotFemale);

}

}

} else if (myself.IsInCategory(65, talker.occupation)) {
if (gender == 1) {
if (myself.IsInCategory(68, talker.occupation)) {
myself.ShowPage(talker, "master_all_kamael100b.htm");

} else {
myself.ShowPage(talker, fnNotMale);

}

} else if (gender == 2) {
if (myself.IsInCategory(69, talker.occupation)) {
myself.ShowPage(talker, "master_all_kamael100c.htm");

} else {
myself.ShowPage(talker, fnNotFemale);

}

}

}

}
super;
	}

	protected void CLASS_CHANGE_REQUESTED(HandlerParam talker, HandlerParam occupation_name_id) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.IsInCategory(63, occupation_name_id)) {
if (myself.IsInCategory(63, talker.occupation)) {
myself.ShowPage(talker, "master_all_kamael004a.htm");

} else if (myself.IsInCategory(64, talker.occupation)) {
myself.ShowPage(talker, "master_all_kamael005a.htm");

} else if (myself.IsInCategory(65, talker.occupation)) {
myself.ShowPage(talker, "master_all_kamael100a.htm");

} else if (talker.occupation == 123) {
if (lv2_class11 != -1 && occupation_name_id == lv2_class11 && talker.occupation == lv1_class1) {
if (talker.level < 20) {
if (myself.GetOneTimeQuestFlag(talker, proof111) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof11);

} else {
myself.ShowPage(talker, fnLowLevel11);

}

} else if (myself.GetOneTimeQuestFlag(talker, proof111) == 0) {
myself.ShowPage(talker, fnNoProof11);

} else {
myself.DeleteItem1(talker, proof112, gg.OwnItemCount(talker, proof112));
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

} else if (talker.occupation == 124) {
if (lv2_class21 != -1 && occupation_name_id == lv2_class21 && talker.occupation == lv1_class2) {
if (talker.level < 20) {
if (myself.GetOneTimeQuestFlag(talker, proof121) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof12);

} else {
myself.ShowPage(talker, fnLowLevel12);

}

} else if (myself.GetOneTimeQuestFlag(talker, proof121) == 0) {
myself.ShowPage(talker, fnNoProof12);

} else {
myself.DeleteItem1(talker, proof122, gg.OwnItemCount(talker, proof122));
myself.ClassChange(talker, lv2_class21);
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

}

} else if (myself.IsInCategory(64, occupation_name_id)) {
if (myself.IsInCategory(62, talker.occupation)) {
if (gender == 1) {
myself.ShowPage(talker, "master_all_kamael012b.htm");

} else if (gender == 2) {
myself.ShowPage(talker, "master_all_kamael012c.htm");

}

} else if (myself.IsInCategory(64, talker.occupation)) {
if (gender == 1) {
myself.ShowPage(talker, "master_all_kamael005b.htm");

} else if (gender == 2) {
myself.ShowPage(talker, "master_all_kamael005c.htm");

}

} else if (myself.IsInCategory(65, talker.occupation)) {
if (gender == 1) {
myself.ShowPage(talker, "master_all_kamael100b.htm");

} else if (gender == 2) {
myself.ShowPage(talker, "master_all_kamael100c.htm");

}

} else if (talker.occupation == 125) {
if (gender == 1) {
if (occupation_name_id == 127) {
if (lv3_class11 != -1 && occupation_name_id == lv3_class11 && talker.occupation == lv2_class1) {
if (talker.level < 40) {
if (myself.GetOneTimeQuestFlag(talker, proof211) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof21);

} else {
myself.ShowPage(talker, fnLowLevel21);

}

} else if (myself.GetOneTimeQuestFlag(talker, proof211) == 0) {
myself.ShowPage(talker, fnNoProof21);

} else {
myself.DeleteItem1(talker, proof212, gg.OwnItemCount(talker, proof212));
myself.ClassChange(talker, lv3_class11);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket_2 != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket_2, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange21);

}

}

} else if (occupation_name_id == 128) {
if (lv3_class12 != -1 && occupation_name_id == lv3_class12 && talker.occupation == lv2_class1) {
if (talker.level < 40) {
if (myself.GetOneTimeQuestFlag(talker, proof221) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof22);

} else {
myself.ShowPage(talker, fnLowLevel22);

}

} else if (myself.GetOneTimeQuestFlag(talker, proof221) == 0) {
myself.ShowPage(talker, fnNoProof22);

} else {
myself.DeleteItem1(talker, proof222, gg.OwnItemCount(talker, proof222));
myself.ClassChange(talker, lv3_class12);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket_2 != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket_2, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange22);

}

}

}

} else if (gender == 2) {
myself.ShowPage(talker, "master_all_kamael002c.htm");

}

} else if (talker.occupation == 126) {
if (gender == 1) {
myself.ShowPage(talker, "master_all_kamael002b.htm");

} else if (gender == 2) {
if (occupation_name_id == 129) {
if (lv3_class21 != -1 && occupation_name_id == lv3_class21 && talker.occupation == lv2_class2) {
if (talker.level < 40) {
if (myself.GetOneTimeQuestFlag(talker, proof221) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof23);

} else {
myself.ShowPage(talker, fnLowLevel23);

}

} else if (myself.GetOneTimeQuestFlag(talker, proof221) == 0) {
myself.ShowPage(talker, fnNoProof23);

} else {
myself.DeleteItem1(talker, proof222, gg.OwnItemCount(talker, proof222));
myself.ClassChange(talker, lv3_class21);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket_2 != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket_2, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange23);

}

}

} else if (occupation_name_id == 130) {
if (lv3_class22 != -1 && occupation_name_id == lv3_class22 && talker.occupation == lv2_class2) {
if (talker.level < 40) {
if (myself.GetOneTimeQuestFlag(talker, proof231) == 0) {
myself.ShowPage(talker, fnLowLevelNoProof24);

} else {
myself.ShowPage(talker, fnLowLevel24);

}

} else if (myself.GetOneTimeQuestFlag(talker, proof231) == 0) {
myself.ShowPage(talker, fnNoProof24);

} else {
myself.DeleteItem1(talker, proof232, gg.OwnItemCount(talker, proof232));
myself.ClassChange(talker, lv3_class22);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}
myself.ShowSystemMessage(talker, 1308);
if (myself.IsAcademyMember(talker) == 1) {
myself.GiveItem1(talker, 8181, 1);
myself.ShowSystemMessage(talker, 1749);

}
if (weapon_ticket_2 != 0 && num_of_tickets != 0) {
myself.GiveItem1(talker, weapon_ticket_2, num_of_tickets);

}
myself.ShowPage(talker, fnAfterClassChange24);

}

}

}

}

}

}
	}


}