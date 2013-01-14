package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class azit_messenger_yetti extends default_npc {
	protected String szName = "messenger_yetti";
	protected String fnHi = "messenger_yetti001.htm";
	protected String fnNoFeudInfo = "messenger_yetti001a.htm";

	protected void CREATED(HandlerParam reply) {
myself.sm.residence_id = 62;
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (myself.sm.residence_id > 0) {
if (gg.IsSameString(myself.Castle_GetSiegeTime(), "") == 0) {
if (myself.Castle_GetPledgeId()) {
myself.FHTML_SetFileName(fhtml0, fnHi);
myself.FHTML_SetStr(fhtml0, "next_siege", myself.Castle_GetSiegeTime());
myself.FHTML_SetStr(fhtml0, "my_pledge_name", myself.Castle_GetPledgeName());
myself.FHTML_SetStr(fhtml0, "my_owner_name", myself.Castle_GetOwnerName());
myself.ShowFHTML(talker, fhtml0);

} else {
myself.FHTML_SetFileName(fhtml0, fnNoFeudInfo);
myself.FHTML_SetStr(fhtml0, "next_siege", myself.Castle_GetSiegeTime());

}

}

}
myself.ShowFHTML(talker, fhtml0);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == -200) {
myself.ShowPage(talker, "messenger_yetti002.htm");

}
if (ask == -210) {
i0 = gg.OwnItemCount(talker, 8034);
myself.sm.residence_id = 62;
myself.MG_RegisterPledge(talker, i0);

} else if (ask == -220) {
myself.sm.residence_id = 62;
myself.MG_UnregisterPledge(talker);

} else if (ask == -230) {
myself.sm.residence_id = 62;
myself.MG_GetUnreturnedPoint(talker);

}
	}

	protected void MG_UNREGISTER_PLEDGE_RETURNED(HandlerParam talker, HandlerParam reply, HandlerParam i0) {
if (reply > 0) {
myself.ShowPage(talker, "messenger_yetti005.htm");
myself.GiveItem1(talker, 8034, reply / 2);

}
switch (reply) {
case -2: {
myself.ShowPage(talker, "messenger_yetti010.htm");
break;

}
case -11: {
myself.ShowPage(talker, "messenger_yetti016.htm");
break;

}
case -12: {
myself.ShowPage(talker, "messenger_yetti017.htm");
break;

}

}
	}

	protected void MG_GET_UNRETURNED_POINT_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply > 0) {
myself.ShowPage(talker, "messenger_yetti019.htm");
myself.GiveItem1(talker, 8034, reply);

} else {
myself.ShowPage(talker, "messenger_yetti020.htm");

}
	}

	protected void MG_REGISTER_PLEDGE_RETURNED(HandlerParam talker, HandlerParam reply, HandlerParam i0) {
switch (reply) {
case 0: {
i0 = gg.OwnItemCount(talker, 8034);
myself.DeleteItem1(talker, 8034, i0);
myself.ShowPage(talker, "messenger_yetti009.htm");
break;

}
case -1: {
myself.ShowPage(talker, "messenger_yetti010.htm");
break;

}
case -2: {
myself.ShowPage(talker, "messenger_yetti010.htm");
break;

}
case -7: {
myself.ShowPage(talker, "messenger_yetti011.htm");
break;

}
case -8: {
myself.ShowPage(talker, "messenger_yetti012.htm");
break;

}
case -9: {
myself.ShowPage(talker, "messenger_yetti011.htm");
break;

}
case -10: {
myself.ShowPage(talker, "messenger_yetti011.htm");
break;

}
case -11: {
myself.ShowPage(talker, "messenger_yetti013.htm");
break;

}
case -12: {
myself.ShowPage(talker, "messenger_yetti014.htm");
break;

}
case -13: {
myself.ShowPage(talker, "messenger_yetti008.htm");
break;

}

}
	}


}