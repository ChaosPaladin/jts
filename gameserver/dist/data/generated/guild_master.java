package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guild_master extends citizen {
	protected String fnHi = "gmhi.htm";
	protected String fnClassMismatch = "gmhi.htm";
	protected String fnClassList1 = "gmhi.htm";
	protected String fnClassList2 = "gmhi.htm";
	protected String fnClassList3 = "gmhi.htm";
	protected String fnClassList4 = "gmhi.htm";
	protected String fnClassList5 = "gmhi.htm";
	protected String fnYouAreSecondClass = "gmhi.htm";
	protected String fnYouAreThirdClass = "gmhi.htm";
	protected String fnYouAreFourthClass = "master_lv3_hef005.htm";
	protected String fnLowLevelNoProof11 = "gmhi.htm";
	protected String fnLowLevelNoProof12 = "gmhi.htm";
	protected String fnLowLevelNoProof13 = "gmhi.htm";
	protected String fnLowLevelNoProof21 = "gmhi.htm";
	protected String fnLowLevelNoProof22 = "gmhi.htm";
	protected String fnLowLevelNoProof23 = "gmhi.htm";
	protected String fnLowLevelNoProof31 = "gmhi.htm";
	protected String fnLowLevelNoProof32 = "gmhi.htm";
	protected String fnLowLevelNoProof33 = "gmhi.htm";
	protected String fnLowLevelNoProof41 = "gmhi.htm";
	protected String fnLowLevelNoProof42 = "gmhi.htm";
	protected String fnLowLevelNoProof43 = "gmhi.htm";
	protected String fnLowLevelNoProof51 = "gmhi.htm";
	protected String fnLowLevelNoProof52 = "gmhi.htm";
	protected String fnLowLevelNoProof53 = "gmhi.htm";
	protected String fnLowLevel11 = "gmhi.htm";
	protected String fnLowLevel12 = "gmhi.htm";
	protected String fnLowLevel13 = "gmhi.htm";
	protected String fnLowLevel21 = "gmhi.htm";
	protected String fnLowLevel22 = "gmhi.htm";
	protected String fnLowLevel23 = "gmhi.htm";
	protected String fnLowLevel31 = "gmhi.htm";
	protected String fnLowLevel32 = "gmhi.htm";
	protected String fnLowLevel33 = "gmhi.htm";
	protected String fnLowLevel41 = "gmhi.htm";
	protected String fnLowLevel42 = "gmhi.htm";
	protected String fnLowLevel43 = "gmhi.htm";
	protected String fnLowLevel51 = "gmhi.htm";
	protected String fnLowLevel52 = "gmhi.htm";
	protected String fnLowLevel53 = "gmhi.htm";
	protected String fnNoProof11 = "gmhi.htm";
	protected String fnNoProof12 = "gmhi.htm";
	protected String fnNoProof13 = "gmhi.htm";
	protected String fnNoProof21 = "gmhi.htm";
	protected String fnNoProof22 = "gmhi.htm";
	protected String fnNoProof23 = "gmhi.htm";
	protected String fnNoProof31 = "gmhi.htm";
	protected String fnNoProof32 = "gmhi.htm";
	protected String fnNoProof33 = "gmhi.htm";
	protected String fnNoProof41 = "gmhi.htm";
	protected String fnNoProof42 = "gmhi.htm";
	protected String fnNoProof43 = "gmhi.htm";
	protected String fnNoProof51 = "gmhi.htm";
	protected String fnNoProof52 = "gmhi.htm";
	protected String fnNoProof53 = "gmhi.htm";
	protected String fnAfterClassChange11 = "gmhi.htm";
	protected String fnAfterClassChange12 = "gmhi.htm";
	protected String fnAfterClassChange13 = "gmhi.htm";
	protected String fnAfterClassChange21 = "gmhi.htm";
	protected String fnAfterClassChange22 = "gmhi.htm";
	protected String fnAfterClassChange23 = "gmhi.htm";
	protected String fnAfterClassChange31 = "gmhi.htm";
	protected String fnAfterClassChange32 = "gmhi.htm";
	protected String fnAfterClassChange33 = "gmhi.htm";
	protected String fnAfterClassChange41 = "gmhi.htm";
	protected String fnAfterClassChange42 = "gmhi.htm";
	protected String fnAfterClassChange43 = "gmhi.htm";
	protected String fnAfterClassChange51 = "gmhi.htm";
	protected String fnAfterClassChange52 = "gmhi.htm";
	protected String fnAfterClassChange53 = "gmhi.htm";
	protected String fnYouAreFirstClass = "gmhi.htm";
	protected int royalGuard = 2;
	protected int knights = 4;
	protected int item_lvup9 = 9910;
	protected int num_item_lvup9 = 150;
	protected int item_lvup10 = 9911;
	protected int num_item_lvup10 = 5;
	protected int EffectSkill1 = 334430209;
	protected String fnLowSkillLvForUpgrade = "pl_need_plv_sub2.htm";
	protected String fnHalfUpgrade = "pl_sub2_upgrade1001.htm";
	protected String fnFullUpgrade = "pl_sub2_upgrade2001.htm";
	protected String fnLowSkillLvForUpgradeSub = "pl_need_plv_sub1.htm";
	protected String fnFullUpgradeSub = "pl_sub_upgrade201.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void CREATE_PLEDGE(HandlerParam talker, HandlerParam reply) {
if (reply == 1) {
myself.ShowPage(talker, "pl006.htm");

}
	}

	protected void CREATE_ALLIANCE(HandlerParam talker, HandlerParam reply) {
if (reply == 1) {
myself.ShowPage(talker, "al006.htm");

}
	}

	protected void DISMISS_PLEDGE(HandlerParam talker, HandlerParam reply) {
if (reply == 1) {
myself.ShowPage(talker, "pl009.htm");

}
	}

	protected void REVIVE_PLEDGE(HandlerParam talker, HandlerParam reply) {
if (reply == 1) {
myself.ShowPage(talker, "pl012.htm");

}
	}

	protected void LEVEL_UP_PLEDGE(HandlerParam talker, HandlerParam reply, HandlerParam i0, HandlerParam i1) {
i0 = myself.GetPledgeMemberCount(talker);
i1 = myself.IsLordOfCastle(talker);
if (reply == 0) {
if (talker.sp >= 20000 && gg.OwnItemCount(talker, 57) >= 650000) {
if (myself.DeleteItem1(talker, 57, 650000)) {
myself.IncrementParam(talker, 1, -20000);
myself.PledgeLevelUp(talker, 1);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}

}

} else {
myself.ShowPage(talker, "pl016.htm");

}

} else if (reply == 1) {
if (talker.sp >= 100000 && gg.OwnItemCount(talker, 57) >= 2500000) {
if (myself.DeleteItem1(talker, 57, 2500000)) {
myself.IncrementParam(talker, 1, -100000);
myself.PledgeLevelUp(talker, 2);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}

}

} else {
myself.ShowPage(talker, "pl016.htm");

}

} else if (reply == 2) {
if (talker.sp >= 350000 && gg.OwnItemCount(talker, 1419) >= 1) {
if (myself.DeleteItem1(talker, 1419, 1)) {
myself.IncrementParam(talker, 1, -350000);
myself.PledgeLevelUp(talker, 3);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}

}

} else {
myself.ShowPage(talker, "pl016.htm");

}

} else if (reply == 3) {
if (talker.sp >= 1000000 && gg.OwnItemCount(talker, 3874) >= 1) {
if (myself.DeleteItem1(talker, 3874, 1)) {
myself.IncrementParam(talker, 1, -1000000);
myself.PledgeLevelUp(talker, 4);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}

}

} else {
myself.ShowPage(talker, "pl016.htm");

}

} else if (reply == 4) {
if (talker.sp >= 2500000 && gg.OwnItemCount(talker, 3870) >= 1) {
if (myself.DeleteItem1(talker, 3870, 1)) {
myself.IncrementParam(talker, 1, -2500000);
myself.PledgeLevelUp(talker, 5);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}

}

} else {
myself.ShowPage(talker, "pl016.htm");

}

} else if (reply == 5) {
if (myself.OwnPledgeNameValue(talker) >= 10000) {
if (i0 >= 30) {
myself.UpdatePledgeNameValue(talker, -10000);
myself.PledgeLevelUp(talker, 6);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}

} else {
myself.ShowPage(talker, "pl_err_total_member.htm");

}

} else {
myself.ShowPage(talker, "pl_err_fame.htm");

}

} else if (reply == 6) {
if (myself.OwnPledgeNameValue(talker) >= 20000) {
if (i0 >= 80) {
myself.UpdatePledgeNameValue(talker, -20000);
myself.PledgeLevelUp(talker, 7);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}

} else {
myself.ShowPage(talker, "pl_err_total_member.htm");

}

} else {
myself.ShowPage(talker, "pl_err_fame.htm");

}

} else if (reply == 7) {
if (myself.OwnPledgeNameValue(talker) >= 40000) {
if (i0 >= 120) {
myself.UpdatePledgeNameValue(talker, -40000);
myself.PledgeLevelUp(talker, 8);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}

} else {
myself.ShowPage(talker, "pl_err_total_member.htm");

}

} else {
myself.ShowPage(talker, "pl_err_fame.htm");

}

} else if (reply == 8) {
if (myself.OwnPledgeNameValue(talker) >= 40000) {
if (gg.OwnItemCount(talker, item_lvup9) >= num_item_lvup9) {
if (i0 >= 120) {
myself.UpdatePledgeNameValue(talker, -40000);
myself.DeleteItem1(talker, item_lvup9, num_item_lvup9);
myself.PledgeLevelUp(talker, 9);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}

} else {
myself.ShowPage(talker, "pl_err_total_member.htm");

}

} else {
myself.ShowPage(talker, "pl_err_not_enough_items.htm");

}

} else {
myself.ShowPage(talker, "pl_err_fame.htm");

}

} else if (reply == 9) {
if (myself.OwnPledgeNameValue(talker) >= 40000) {
if (gg.OwnItemCount(talker, item_lvup10) >= num_item_lvup10) {
if (i0 >= 140) {
myself.UpdatePledgeNameValue(talker, -40000);
myself.DeleteItem1(talker, item_lvup10, num_item_lvup10);
myself.PledgeLevelUp(talker, 10);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}

} else {
myself.ShowPage(talker, "pl_err_total_member.htm");

}

} else {
myself.ShowPage(talker, "pl_err_not_enough_items.htm");

}

} else {
myself.ShowPage(talker, "pl_err_fame.htm");

}

} else if (reply == 10) {
if (myself.OwnPledgeNameValue(talker) >= 75000) {
if (i1 != 0 && myself.IsDominionOfLord(IsDominionOfLord + i1) != 0) {
if (i0 >= 170) {
myself.UpdatePledgeNameValue(talker, -75000);
myself.PledgeLevelUp(talker, 11);
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(talker, EffectSkill1, 1, 0, 1000000);

}

} else {
myself.ShowPage(talker, "pl_err_total_member.htm");

}

} else {
myself.ShowPage(talker, "pl_err_not_lord_yet.htm");

}

} else {
myself.ShowPage(talker, "pl_err_fame.htm");

}

}
	}

	protected void CREATE_ACADEMY(HandlerParam talker, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam s0, HandlerParam s1, HandlerParam pledge0) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
i0 = pledge0.skill_level;
i1 = 0;
i2 = 0;
s1 = "";
if (reply == 0) {
if (myself.HasAcademy(talker) == 1) {
myself.ShowPage(talker, "pl_err_aca.htm");

} else {
myself.ShowPage(talker, "pl_err_aca.htm");

}

} else if (reply == 1) {
if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0 && i0 >= 5) {
myself.CreateAcademy(talker, s0);

} else if (i0 < 5) {
myself.ShowPage(talker, "pl_err_plv.htm");

} else if (talker.is_pledge_master != 1 || myself.HavePledgePower(talker, 8) == 0) {
myself.ShowPage(talker, "pl_err_master.htm");

} else {
myself.ShowPage(talker, "pl_err_aca.htm");

}

} else if (reply == 2) {
myself.ShowPage(talker, "pl_create_ok_aca.htm");

} else if (reply == -2) {
myself.ShowPage(talker, "pl_already_subname.htm");

}

}
	}

	protected void CREATE_SUBPLEDGE(HandlerParam talker, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam s0, HandlerParam s1, HandlerParam pledge0) {
if (reply == -1) {
myself.ShowPage(talker, "pl_err_man.htm");

} else if (reply == 0) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
i2 = pledge0.skill_level;
if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0 && i1 > 0) {
if (i0 < 1000 && i0 >= 100) {
if (i2 > 5) {
myself.UpdatePledgeNameValue(talker, 5000);

}

} else if (i0 > 1000 && i0 <= 2002) {
if (i2 > 6) {
myself.UpdatePledgeNameValue(talker, 10000);

} else if (i2 == 9) {

} else if (i2 == 10) {

}

}

} else {
myself.ShowPage(talker, "pl_err_master.htm");

}
myself.ShowPage(talker, "pl_err_subname.htm");

}

} else if (reply == 1) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
i2 = pledge0.skill_level;
if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
if (i0 < 1000 && i0 >= 100) {
if (myself.HasSubPledge(talker, i0) == 1) {
myself.ShowPage(talker, "pl_err_fame.htm");
return;

}
if (i2 > 5) {
if (myself.OwnPledgeNameValue(talker) >= 5000) {
myself.UpdatePledgeNameValue(talker, -5000);
myself.CreateSubPledge(talker, i0, i1, s0);

} else {
myself.ShowPage(talker, "pl_err_fame.htm");

}

} else {
myself.ShowPage(talker, "pl_err_plv.htm");

}

} else if (i0 > 1000 && i0 <= 2002) {
if (myself.HasSubPledge(talker, i0) == 1) {
myself.ShowPage(talker, "pl_err_fame.htm");
return;

}
if (i2 > 6) {
if (myself.OwnPledgeNameValue(talker) >= 10000) {
myself.UpdatePledgeNameValue(talker, -10000);
myself.CreateSubPledge(talker, i0, i1, s0);

} else {
myself.ShowPage(talker, "pl_err_fame.htm");

}

} else {
myself.ShowPage(talker, "pl_err_plv.htm");

}

} else {
myself.ShowPage(talker, "pl_err_sub.htm");

}

} else {
myself.ShowPage(talker, "pl_err_master.htm");

}

}

} else if (reply == 2) {
if (i0 < 1000) {
myself.ShowPage(talker, "pl_create_ok_sub1.htm");

} else {
myself.ShowPage(talker, "pl_create_ok_sub2.htm");

}

} else if (reply == -2) {
myself.ShowPage(talker, "pl_already_subname.htm");

}
	}

	protected void UPDATE_SUBPLEDGE_MASTER(HandlerParam talker, HandlerParam reply, HandlerParam i0) {
if (reply == -1) {
if (i0 < 1000) {
myself.ShowPage(talker, "pl_err_sm3.htm");

} else {
myself.ShowPage(talker, "pl_err_sm4.htm");

}

} else if (reply == 0) {
if (i0 < 1000) {
myself.ShowPage(talker, "pl_err_sm3.htm");

} else {
myself.ShowPage(talker, "pl_err_sm4.htm");

}

} else if (reply == 1) {
myself.ShowPage(talker, "pl_create_ok_submaster.htm");

}
	}

	protected void ONE_SKILL_SELECTED(HandlerParam talker, HandlerParam skill_name_id, HandlerParam need_quest) {
myself.ShowGrowEtcSkillMessage(talker, skill_name_id, 2, "");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i2, HandlerParam pledge0, HandlerParam fhtml0, HandlerParam s0, HandlerParam s1, HandlerParam i0) {
if (ask == -3) {
if (talker.pledge_id > 0) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
i2 = pledge0.skill_level;

}

}
if (reply == 0) {
if (talker.level < 10) {
myself.ShowPage(talker, "pl002.htm");

} else if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
myself.ShowPage(talker, "pl003.htm");

} else if (talker.pledge_id != 0) {
myself.ShowPage(talker, "pl004.htm");

} else {
myself.ShowPage(talker, "pl005.htm");

}

} else if (reply == 2) {
if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
myself.ShowPage(talker, "pl007.htm");

} else {
myself.ShowPage(talker, "pl008.htm");

}

} else if (reply == 3) {
if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
myself.ShowPage(talker, "pl010.htm");

} else {
myself.ShowPage(talker, "pl011.htm");

}

} else if (reply == 1) {
if (talker.is_pledge_master == 1) {
myself.ShowPage(talker, "pl013.htm");

} else {
myself.ShowPage(talker, "pl014.htm");

}

} else if (reply == 4) {
if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
myself.ShowEtcSkillList(talker, 2, "");

} else {
myself.ShowPage(talker, "pl017.htm");

}

} else if (reply == 5) {
myself.ShowPage(talker, "pl_aca_help.htm");

} else if (reply == 6) {
myself.ShowPage(talker, "pl_sub_help.htm");

} else if (reply == 7) {
if (talker.pledge_id <= 0) {
myself.ShowPage(talker, "pl_no_pledgeman.htm");

} else if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
if (i2 > 5) {
if (myself.HasSubPledge(talker, 100) == 1) {
if (myself.HasSubPledge(talker, 200) == 1) {
myself.ShowPage(talker, "pl_err_more_sub.htm");

} else {
myself.ShowPage(talker, "pl_create_sub200.htm");

}

} else {
myself.ShowPage(talker, "pl_create_sub100.htm");

}

} else {
myself.ShowPage(talker, "pl_err_plv.htm");

}

} else {
myself.ShowPage(talker, "pl_err_master.htm");

}

} else if (reply == 8) {
if (talker.pledge_id <= 0) {
myself.ShowPage(talker, "pl_no_pledgeman.htm");

} else if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
if (i2 > 5) {
if (myself.HasSubPledge(talker, 100) == 1) {
myself.ShowPage(talker, "pl_submaster.htm");

} else {
myself.ShowPage(talker, "pl_err_more_sm.htm");

}

} else {
myself.ShowPage(talker, "pl_err_plv.htm");

}

} else {
myself.ShowPage(talker, "pl_err_master.htm");

}

} else if (reply == 9) {
myself.ShowPage(talker, "pl_sub2_help.htm");

} else if (reply == 10) {
if (talker.pledge_id <= 0) {
myself.ShowPage(talker, "pl_no_pledgeman.htm");

} else if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
if (i2 > 6) {
if (myself.HasSubPledge(talker, 100) == 1) {
if (myself.HasSubPledge(talker, 1001) == 1) {
if (myself.HasSubPledge(talker, 1002) == 1) {
if (myself.HasSubPledge(talker, 200) == 1) {
if (myself.HasSubPledge(talker, 2001) == 1) {
if (myself.HasSubPledge(talker, 2002) == 1) {
myself.ShowPage(talker, "pl_err_more_sub2.htm");

} else {
myself.ShowPage(talker, "pl_create_sub2002.htm");

}

} else {
myself.ShowPage(talker, "pl_create_sub2001.htm");

}

} else {
myself.ShowPage(talker, "pl_need_high_lv_sub.htm");

}

} else {
myself.ShowPage(talker, "pl_create_sub1002.htm");

}

} else {
myself.ShowPage(talker, "pl_create_sub1001.htm");

}

} else {
myself.ShowPage(talker, "pl_need_high_lv_sub.htm");

}

} else {
myself.ShowPage(talker, "pl_err_plv.htm");

}

} else {
myself.ShowPage(talker, "pl_err_master.htm");

}

} else if (reply == 11) {
if (talker.pledge_id <= 0) {
myself.ShowPage(talker, "pl_no_pledgeman.htm");

} else if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
if (i2 > 6) {
if (myself.HasSubPledge(talker, 100) == 1) {
if (myself.HasSubPledge(talker, 1001) == 1) {
myself.ShowPage(talker, "pl_submaster2.htm");

} else {
myself.ShowPage(talker, "pl_err_more_sm2.htm");

}

} else {
myself.ShowPage(talker, "pl_need_high_lv_sub.htm");

}

} else {
myself.ShowPage(talker, "pl_err_plv.htm");

}

} else {
myself.ShowPage(talker, "pl_err_master.htm");

}

} else if (reply == 12) {
if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
if (i2 > 4) {
myself.ShowPage(talker, "pl_create_aca.htm");

} else {
myself.ShowPage(talker, "pl_err_plv.htm");

}

} else {
myself.ShowPage(talker, "pl_err_master.htm");

}

} else if (reply == 13) {
myself.ShowPage(talker, "pl_master.htm");

} else if (reply == 14) {
if (talker.is_pledge_master == 1) {
myself.ShowPage(talker, "pl_transfer_master.htm");

} else {
myself.ShowPage(talker, "pl_err_master.htm");

}

} else if (reply == 15) {
if (talker.is_pledge_master == 1) {
myself.ShowPage(talker, "pl_cancel_master.htm");

} else {
myself.ShowPage(talker, "pl_err_master.htm");

}

} else if (reply == 16) {
if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
myself.ShowPage(talker, "pl_rename.htm");

} else {
myself.ShowPage(talker, "pl_err_master.htm");

}

} else if (reply == 17) {
if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
myself.ShowPage(talker, "pl_rename2.htm");

} else {
myself.ShowPage(talker, "pl_err_master.htm");

}

} else if (reply == 100) {
if (talker.pledge_id > 0) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
if (pledge0.prev_server > 0) {
myself.ShowPage(talker, "pl018.htm");

} else {
myself.ShowPage(talker, "pl001.htm");

}

}

} else {
myself.ShowPage(talker, "pl001.htm");

}

} else if (reply == 101) {
if (talker.is_pledge_master == 1) {
myself.ShowChangePledgeNameUI(talker);

} else {
myself.ShowPage(talker, "pl_err_master.htm");

}

}

} else if (ask == -111) {
if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
if (reply < 1000) {
if (reply < 100) {
myself.ShowPage(talker, "pl_err_rename_aca.htm");

} else if (reply / 100 > royalGuard) {
myself.ShowPage(talker, "pl_err_more_sub.htm");

} else if (myself.HasSubPledge(talker, reply) == 0) {
myself.ShowPage(talker, "pl_err_more_sm.htm");

} else if (myself.HasSubPledge(talker, reply) == 1) {
s0 = "";
s1 = "";
s0 = "pl_ch_submaster" + gg.IntToStr(reply) + ".htm";
myself.FHTML_SetFileName(fhtml0, s0);
s1 = gg.IntToStr(reply) + "submaster";
s0 = "";
s0 = gg.GetSubpledgeMasterName(talker, reply);
if (myself.IsNullString(s0) == 1) {
s0 = "";
s0 = gg.MakeFString(1010642, "", "", "", "", "");

}
myself.FHTML_SetStr(fhtml0, s1, s0);
myself.ShowFHTML(talker, fhtml0);

}

} else if (reply < 10000) {
if (reply <= 1000 && reply % 1000 == 0) {
myself.ShowPage(talker, "pl_err_more_sm2.htm");

} else if (reply % 1000 > knights / royalGuard) {
myself.ShowPage(talker, "pl_err_more_sub2.htm");

} else if (myself.HasSubPledge(talker, reply) == 0) {
myself.ShowPage(talker, "pl_err_more_sm2.htm");

} else if (myself.HasSubPledge(talker, reply) == 1) {
s0 = "";
s1 = "";
s0 = "pl_ch_submaster" + gg.IntToStr(reply) + ".htm";
myself.FHTML_SetFileName(fhtml0, s0);
s1 = gg.IntToStr(reply) + "submaster";
s0 = "";
s0 = gg.GetSubpledgeMasterName(talker, reply);
if (myself.IsNullString(s0) == 1) {
s0 = "";
s0 = gg.MakeFString(1010642, "", "", "", "", "");

}
myself.FHTML_SetStr(fhtml0, s1, s0);
myself.ShowFHTML(talker, fhtml0);

}

}

} else {
myself.ShowPage(talker, "pl_err_master.htm");

}

} else if (ask == -222) {
if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, 9) && talker.pledge_id != 0) {
if (reply == -1) {
if (myself.HasSubPledge(talker, reply) == 0) {
myself.ShowPage(talker, "pl_err_rename_aca.htm");

} else if (myself.HasSubPledge(talker, reply) == 1) {
s0 = "";
s1 = "";
s0 = "pl_ch_rename_aca" + ".htm";
myself.FHTML_SetFileName(fhtml0, s0);
myself.ShowFHTML(talker, fhtml0);

}

} else if (reply < 1000) {
if (reply / 100 > royalGuard) {
myself.ShowPage(talker, "pl_err_more_sub.htm");

} else if (myself.HasSubPledge(talker, reply) == 0) {
myself.ShowPage(talker, "pl_err_rename_sub.htm");

} else if (myself.HasSubPledge(talker, reply) == 1) {
s0 = "";
s1 = "";
s0 = "pl_ch_rename" + gg.IntToStr(reply) + ".htm";
myself.FHTML_SetFileName(fhtml0, s0);
myself.ShowFHTML(talker, fhtml0);

}

} else if (reply < 10000) {
if (reply % 1000 > knights / royalGuard) {
myself.ShowPage(talker, "pl_err_more_sub2.htm");

} else if (myself.HasSubPledge(talker, reply) == 0) {
myself.ShowPage(talker, "pl_err_rename_sub2.htm");

} else if (myself.HasSubPledge(talker, reply) == 1) {
s0 = "";
s1 = "";
s0 = "pl_ch_rename" + gg.IntToStr(reply) + ".htm";
myself.FHTML_SetFileName(fhtml0, s0);
myself.ShowFHTML(talker, fhtml0);

}

}

} else {
myself.ShowPage(talker, "pl_err_master.htm");

}

} else if (ask == -223) {
i0 = myself.GetPledgeSkillLevel(talker);
if (reply == 0) {
if (i0 <= 8) {
myself.ShowPage(talker, fnLowSkillLvForUpgrade);
return;

} else if (i0 == 9) {
myself.ShowPage(talker, fnHalfUpgrade);
return;

} else if (i0 == 10) {
myself.ShowPage(talker, fnFullUpgrade);
return;

} else if (i0 == 11) {
myself.ShowPage(talker, fnFullUpgrade);
return;

}

}
if (reply == 1) {
if (i0 <= 10) {
myself.ShowPage(talker, fnLowSkillLvForUpgradeSub);
return;

} else if (i0 == 11) {
myself.ShowPage(talker, fnFullUpgradeSub);
return;

}

}

} else if (ask == -4) {
if (reply == 0) {
myself.ShowPage(talker, "al005.htm");

}

}
super;
	}

	protected void PLEDGE_MASTER_TRANSFER(HandlerParam talker, HandlerParam reply, HandlerParam s0) {
if (reply == 1) {
myself.ShowPage(talker, "pl_transfer_success.htm");

} else if (reply == 0) {
myself.ShowPage(talker, "pl_err_sm2.htm");

} else if (reply == -1) {
myself.ShowPage(talker, "pl_err_master.htm");

} else if (reply == -2) {
myself.ShowPage(talker, "pl_transfer_already.htm");

} else if (reply == -4) {
myself.ShowPage(talker, "pl_err_agit_owner.htm");

} else if (reply == -8) {
myself.ShowPage(talker, "pl_already_transfer.htm");

} else if (reply <= -3) {
myself.ShowPage(talker, "pl_err_master_transfer.htm");

}
	}

	protected void PLEDGE_MASTER_TRANSFER_CANCEL(HandlerParam talker, HandlerParam reply) {
if (reply == 1) {
myself.ShowPage(talker, "pl_cancel_success.htm");

} else if (reply == -1) {
myself.ShowPage(talker, "pl_err_master.htm");

} else if (reply == -2) {
myself.ShowPage(talker, "pl_transfer_already.htm");

} else if (reply == -4) {
myself.ShowPage(talker, "pl_not_transfer.htm");

} else if (reply <= -3) {
myself.ShowPage(talker, "pl_err_master_transfer.htm");

}
	}

	protected void RENAME_SUBPLEDGE(HandlerParam talker, HandlerParam reply, HandlerParam i0, HandlerParam s0) {
if (reply == 1) {
if (i0 == -1) {
myself.ShowPage(talker, "pl_rename_ok_aca.htm");

} else if (i0 < 1000) {
myself.ShowPage(talker, "pl_rename_ok_sub1.htm");

} else {
myself.ShowPage(talker, "pl_rename_ok_sub2.htm");

}

} else if (reply == -1) {
myself.ShowPage(talker, "pl_err_master.htm");

} else if (reply == -2) {
myself.ShowPage(talker, "pl_err_rename_disband.htm");

} else if (reply == -3) {
myself.ShowPage(talker, "pl_err_rename_main.htm");

} else if (reply == -4) {
if (i0 == -1) {
myself.ShowPage(talker, "pl_err_rename_aca.htm");

} else if (i0 < 1000) {
myself.ShowPage(talker, "pl_err_rename_sub.htm");

} else {
myself.ShowPage(talker, "pl_err_rename_sub2.htm");

}

} else if (reply == -5) {
myself.ShowSystemMessage(talker, 204);

} else if (reply == -6) {
myself.ShowSystemMessage(talker, 204);

} else if (reply == -7) {
myself.ShowPage(talker, "pl_already_subname.htm");

} else if (reply == -8) {
myself.ShowSystemMessage(talker, 213);

} else if (reply == -9) {
myself.ShowSystemMessage(talker, 213);

}
	}

	protected void UPGRADE_SUBPLEDGE_MEMBER_COUNT(HandlerParam talker, HandlerParam reply, HandlerParam i0) {
if (reply == 0) {
myself.ShowPage(talker, "pl_upgrade_err_sub2.htm");

} else if (reply == 1) {
myself.ShowPage(talker, "pl_upgrade_ok_sub2.htm");

}
	}


}