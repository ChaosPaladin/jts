package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ordery_fortress extends citizen {
	protected int fortress_id = 0;
	protected int commission = 0;
	protected String fnHi1 = "";
	protected String fnHi2 = "";
	protected String fnHi3 = "";
	protected int pledge_lv_req = 1;
	protected String fnHi4 = "";
	protected String fnRegisterSuccess = "";
	protected String fnRegisterFail = "";
	protected String fnAlreadyRegistered = "";
	protected String fnNoRegisterPeriod = "";
	protected String fnCancelSuccess = "";
	protected String fnCancelFail = "";
	protected String fnNotARegistered = "";
	protected String fnNoAuthority = "noauthority.htm";
	protected String fnAlreadyOwner = "";
	protected String fnAlreadyCastleContract = "";
	protected int ppRegisterWar = 18;
	protected String fnFortressState0 = "";
	protected String fnFortressState1 = "";
	protected int castle_id1 = -1;
	protected int castle_id2 = -1;
	protected int castle_id3 = -1;
	protected int castle_id4 = -1;
	protected int castle_id5 = -1;
	protected String fnHi5 = "";
	protected String fnHi6 = "";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam pledge0, HandlerParam i1, HandlerParam fhtml0) {
if (ask == 504) {
if (talker.pledge_id > 0) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 1) {
myself.ShowPage(talker, fnHi2);
return;

}
if (pledge0.fortress_id == fortress_id) {
myself.FHTML_SetFileName(fhtml0, fnAlreadyOwner);
myself.FHTML_SetStr(fhtml0, "my_pledge_name", myself.Castle_GetPledgeName());
myself.ShowFHTML(talker, fhtml0);
return;

}
if (talker.is_pledge_master == 1 || myself.HavePledgePower(talker, ppRegisterWar)) {

} else {
myself.ShowPage(talker, fnNoAuthority);
return;

}
if (myself.GetPledgeSkillLevel(talker) < pledge_lv_req) {
myself.ShowPage(talker, fnHi4);
return;

}
if (pledge0.castle_id > 0) {
if (castle_id1 > 0 && castle_id1 == pledge0.castle_id || castle_id2 > 0 && castle_id2 == pledge0.castle_id || castle_id3 > 0 && castle_id3 == pledge0.castle_id || castle_id4 > 0 && castle_id4 == pledge0.castle_id || castle_id5 > 0 && castle_id5 == pledge0.castle_id) {
if (gg.Fortress_GetContractStatus(fortress_id) == 1) {
myself.ShowPage(talker, fnAlreadyCastleContract);
return;

}

} else {
myself.ShowPage(talker, fnHi5);
return;

}

}

} else {
myself.ShowPage(talker, fnHi2);
return;

}
if (reply == 1) {
if (gg.Fortress_GetAvailableOwnMinutes(fortress_id) <= 120 && gg.Fortress_GetOwnerPledgeId(fortress_id) > 0) {
myself.ShowPage(talker, fnHi6);
return;

}
if (myself.Fortress_GetState(fortress_id) == 0) {
if (gg.OwnItemCount(talker, 57) >= commission) {
myself.SetCookie(talker, "commission", commission);

} else {
myself.ShowPage(talker, fnHi3);
return;

}

} else {
myself.SetCookie(talker, "commission", -1);

}
myself.Fortress_PledgeRegister(myself.sm.id, talker.id, fortress_id);

} else if (reply == 0) {
myself.Fortress_PledgeUnregister(myself.sm.id, talker.id, fortress_id);

} else if (reply == 2) {
myself.ShowMultisell(614, talker);

}

} else if (ask == 503) {
if (reply == 2) {
myself.ShowMultisell(614, talker);

} else if (reply == 3) {
i1 = myself.Fortress_GetState(fortress_id);
if (i1 == 0) {
myself.ShowPage(talker, fnFortressState0);
return;

} else if (i1 == 1) {
myself.ShowPage(talker, fnFortressState1);
return;

}

}

}
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam pledge0, HandlerParam i0, HandlerParam fhtml0) {
if (gg.Fortress_GetOwnerPledgeId(fortress_id) <= 0) {
myself.ShowPage(talker, fnHi);
return;

} else {
myself.FHTML_SetFileName(fhtml0, fnHi1);
myself.FHTML_SetStr(fhtml0, "my_pledge_name", myself.Castle_GetPledgeName());
myself.ShowFHTML(talker, fhtml0);
return;

}
	}

	protected void FORTRESS_SIEGE_REGISTER_RETURNED(HandlerParam talker, HandlerParam reply, HandlerParam i0) {
if (reply == -1) {
i0 = myself.GetCookie(talker, "commission");
if (i0 == commission) {
if (gg.OwnItemCount(talker, 57) >= i0) {
myself.DeleteItem1(talker, 57, i0);

} else {
myself.ShowPage(talker, fnHi3);
return;

}

}
myself.ShowPage(talker, fnRegisterSuccess);

} else if (reply == 3) {
myself.ShowPage(talker, fnNoRegisterPeriod);

} else if (reply == 4) {
myself.ShowPage(talker, fnAlreadyRegistered);

} else {
myself.ShowPage(talker, fnRegisterFail);

}
	}

	protected void FORTRESS_SIEGE_UNREGISTER_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == -1) {
myself.ShowPage(talker, fnCancelSuccess);

} else if (reply == 3) {
myself.ShowPage(talker, fnNoRegisterPeriod);

} else if (reply == 4) {
myself.ShowPage(talker, fnNotARegistered);

} else {
myself.ShowPage(talker, fnCancelFail);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 0) {
myself.Despawn();

}
super;
	}


}