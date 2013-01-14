package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class test_agit_messenger extends citizen {
	protected String fnHi = "agit_oel_mahum_messeger_1.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 1) {
if (reply == 1) {
myself.TB_GetPledgeRegisterStatus(talker, 0);

} else if (reply == 2) {
if (talker.is_pledge_master != 1) {
myself.TB_RegisterMember(talker);

} else {
myself.ShowPage(talker, "agit_oel_mahum_messeger_5.htm");

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
	}

	protected void TB_REGISTER_PLEDGE_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply < 0) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_3.htm");

} else if (reply == 0) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_4a.htm");

} else if (reply == 1) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_4b.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_4c.htm");

} else if (reply == 3) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_4d.htm");

} else if (reply == 4) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_4e.htm");

}
	}

	protected void TB_GET_PLEDGE_REGISTER_STATUS_INFORMED(HandlerParam talker, HandlerParam reply) {
if (reply == -2) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_21.htm");

} else if (reply == -1) {
if (myself.IsMyLord(talker)) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_22.htm");

} else {
myself.TB_RegisterPledge(talker);

}

} else if (reply == 0) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_4a.htm");

} else if (reply == 1) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_4b.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_4c.htm");

} else if (reply == 3) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_4d.htm");

} else if (reply == 4) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_4e.htm");

}
	}

	protected void TB_REGISTER_MEMBER_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == 0) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_7.htm");

} else if (reply == 1) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_8.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_9.htm");

}
	}

	protected void TB_SET_NPC_TYPE_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == -1) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_7.htm");

} else if (reply >= 1 && reply <= 5) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_9.htm");

}
	}

	protected void TB_GET_NPC_TYPE_INFORMED(HandlerParam talker, HandlerParam reply) {
if (reply == -1) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_7.htm");

} else if (reply == 0) {
if (talker.is_pledge_master == 1) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_6.htm");

} else {
myself.ShowPage(talker, "agit_oel_mahum_messeger_10.htm");

}

} else if (reply == 1) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_16.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_17.htm");

} else if (reply == 3) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_18.htm");

} else if (reply == 4) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_19.htm");

} else if (reply == 5) {
myself.ShowPage(talker, "agit_oel_mahum_messeger_23.htm");

}
	}


}