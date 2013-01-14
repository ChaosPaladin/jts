package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_azit_farm_messenger extends citizen {
	protected String fnHi = "farm_messenger001.htm";
	protected String fnNoFeudInfo = "farm_messenger002.htm";
	protected String fnBRList = "farm_messenger003.htm";

	protected void TALKED(HandlerParam talker, HandlerParam fhtml0) {
if (myself.sm.residence_id > 0) {
if (myself.Castle_GetPledgeId()) {
myself.FHTML_SetFileName(fhtml0, fnHi);
myself.FHTML_SetStr(fhtml0, "my_pledge_name", myself.Castle_GetPledgeName());
myself.FHTML_SetStr(fhtml0, "my_owner_name", myself.Castle_GetOwnerName());

} else {
myself.FHTML_SetFileName(fhtml0, fnNoFeudInfo);

}

}
myself.ShowFHTML(talker, fhtml0);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam pledge0) {
if (ask == 655) {
if (reply == 1) {
if (myself.Castle_GetRawSiegeTime() - myself.Castle_GetRawSystemTime() < 3600 && myself.Castle_GetRawSiegeTime() - myself.Castle_GetRawSystemTime() > 0) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_1.htm");

} else if (gg.IsSameString(myself.Castle_GetSiegeTime(), "") == 0) {
myself.FHTML_SetFileName(fhtml0, "farm_messenger_q0655_11.htm");
myself.FHTML_SetStr(fhtml0, "next_siege", myself.Castle_GetSiegeTime());
myself.ShowFHTML(talker, fhtml0);

}

}

}
if (ask == 1) {
if (reply == 1) {
if (myself.IsMyLord(talker)) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_22.htm");

} else {
myself.TB_GetPledgeRegisterStatus(talker, 1);

}

} else if (reply == 2) {
if (talker.is_pledge_master != 1) {
myself.TB_RegisterMember(talker);

} else {
myself.ShowPage(talker, "farm_kel_mahum_messenger_5.htm");

}

} else if (reply == 3) {
myself.TB_GetNpcType(talker);

} else if (reply == 4) {
myself.TB_SetNpcType(talker, 2);

} else if (reply == 5) {
myself.TB_SetNpcType(talker, 1);

} else if (reply == 6) {
myself.TB_SetNpcType(talker, 3);

} else if (reply == 7) {
myself.TB_SetNpcType(talker, 4);

} else if (reply == 8) {
myself.TB_SetNpcType(talker, 5);

} else if (reply == 9) {
myself.TB_GetNpcType(talker);

}

}
if (ask == 101) {
myself.TB_GetBattleRoyalPledgeList(talker);

}
	}

	protected void TB_REGISTER_PLEDGE_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply < 0) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_3.htm");

} else if (reply == 0) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_4a.htm");

} else if (reply == 1) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_4b.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_4c.htm");

} else if (reply == 3) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_4d.htm");

} else if (reply == 4) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_4e.htm");

}
	}

	protected void TB_GET_PLEDGE_REGISTER_STATUS_INFORMED(HandlerParam talker, HandlerParam reply, HandlerParam pledge0) {
if (reply == -2) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_21.htm");

} else if (reply == -1) {
if (myself.IsMyLord(talker)) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_22.htm");

} else if (gg.OwnItemCount(talker, 8293) > 0 && gg.HaveMemo(talker, 655) == 1) {
if (myself.Castle_GetRawSiegeTime() - gg.GetMemoState(talker, 655) < 3600 || myself.Castle_GetRawSiegeTime() - gg.GetMemoState(talker, 655) > 0) {
myself.DeleteItem1(talker, 8293, gg.OwnItemCount(talker, 8293));
myself.RemoveMemo(talker, 655);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.TB_RegisterPledge(talker);

}

} else {
myself.ShowPage(talker, "farm_kel_mahum_messenger_27.htm");

}

} else if (reply == 0) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_4a.htm");

} else if (reply == 1) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_4b.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_4c.htm");

} else if (reply == 3) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_4d.htm");

} else if (reply == 4) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_4e.htm");

}
	}

	protected void TB_REGISTER_MEMBER_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == 0) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_7.htm");

} else if (reply == 1) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_8.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_9.htm");

}
	}

	protected void TB_SET_NPC_TYPE_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == -1) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_7.htm");

} else if (reply >= 1 && reply <= 5) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_9.htm");

}
	}

	protected void TB_GET_NPC_TYPE_INFORMED(HandlerParam talker, HandlerParam reply) {
if (myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_25.htm");
return;

}
if (reply == -1) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_7.htm");

} else if (reply == 0) {
if (talker.is_pledge_master == 1) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_6.htm");

} else {
myself.ShowPage(talker, "farm_kel_mahum_messenger_10.htm");

}

} else if (reply == 1) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_18.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_17.htm");

} else if (reply == 3) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_19.htm");

} else if (reply == 4) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_20.htm");

} else if (reply == 5) {
myself.ShowPage(talker, "farm_kel_mahum_messenger_23.htm");

}
	}

	protected void TB_GET_BATTLE_ROYAL_PLEDGE_LIST_INFORMED(HandlerParam talker, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam pledge0) {
myself.FHTML_SetFileName(fhtml0, fnBRList);
if (i0 >= 0) {
pledge0 = myself.GetPledgeByIndex(i0);
if (gg.IsNull(pledge0) == 0) {
myself.FHTML_SetStr(fhtml0, "pledge0", pledge0.name);
myself.FHTML_SetStr(fhtml0, "p_member_count0", gg.IntToStr(i1));

}

} else {
myself.FHTML_SetStr(fhtml0, "pledge0", gg.MakeFString(1000495, "", "", "", "", ""));

}
if (i2 >= 0) {
pledge0 = myself.GetPledgeByIndex(i2);
if (gg.IsNull(pledge0) == 0) {
myself.FHTML_SetStr(fhtml0, "pledge1", pledge0.name);
myself.FHTML_SetStr(fhtml0, "p_member_count1", gg.IntToStr(i3));

}

} else {
myself.FHTML_SetStr(fhtml0, "pledge1", gg.MakeFString(1000495, "", "", "", "", ""));

}
if (i4 >= 0) {
pledge0 = myself.GetPledgeByIndex(i4);
if (gg.IsNull(pledge0) == 0) {
myself.FHTML_SetStr(fhtml0, "pledge2", pledge0.name);
myself.FHTML_SetStr(fhtml0, "p_member_count2", gg.IntToStr(i5));

}

} else {
myself.FHTML_SetStr(fhtml0, "pledge2", gg.MakeFString(1000495, "", "", "", "", ""));

}
if (i6 >= 0) {
pledge0 = myself.GetPledgeByIndex(i6);
if (gg.IsNull(pledge0) == 0) {
myself.FHTML_SetStr(fhtml0, "pledge3", pledge0.name);
myself.FHTML_SetStr(fhtml0, "p_member_count3", gg.IntToStr(i7));

}

} else {
myself.FHTML_SetStr(fhtml0, "pledge3", gg.MakeFString(1000495, "", "", "", "", ""));

}
if (i8 >= 0) {
pledge0 = myself.GetPledgeByIndex(i8);
if (gg.IsNull(pledge0) == 0) {
myself.FHTML_SetStr(fhtml0, "pledge4", pledge0.name);
myself.FHTML_SetStr(fhtml0, "p_member_count4", gg.IntToStr(i9));

}

} else {
myself.FHTML_SetStr(fhtml0, "pledge4", gg.MakeFString(1000495, "", "", "", "", ""));

}
myself.ShowFHTML(talker, fhtml0);
	}


}