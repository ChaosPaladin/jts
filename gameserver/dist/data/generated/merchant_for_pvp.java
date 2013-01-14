package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class merchant_for_pvp extends merchant {
	protected String fnNoPvpPoint = "pvp_merchant_lepidus002.htm";
	protected String fnNoPledge = "pvp_merchant_lepidus004.htm";
	protected String fnFameUpSuccess = "pvp_merchant_lepidus005.htm";
	protected String fnNoPkCount = "pvp_merchant_lepidus006.htm";
	protected String fnPkDownSuccess = "pvp_merchant_lepidus007.htm";

	protected void TALKED(HandlerParam talker) {
if (myself.GetPVPPoint(talker) > 0) {
if (myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation) && talker.level >= 40) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnNoPvpPoint);

}

} else {
myself.ShowPage(talker, fnNoPvpPoint);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == -3001) {
switch (reply) {
case 1: {
if (myself.GetPVPPoint(talker) < 0) {
myself.ShowPage(talker, fnNoPvpPoint);
break;

}
myself.ShowMultisell(638, talker);
break;

}
case 2: {
if (myself.GetPVPPoint(talker) < 0) {
myself.ShowPage(talker, fnNoPvpPoint);
break;

}
myself.ShowMultisell(639, talker);
break;

}
case 3: {
if (myself.GetPVPPoint(talker) < 0) {
myself.ShowPage(talker, fnNoPvpPoint);
break;

}
myself.ShowMultisell(640, talker);
break;

}

}

} else if (ask == -4001) {
if (reply == 1) {
if (talker.pk_count > 0) {
if (myself.GetPVPPoint(talker) >= 5000) {
if (myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation) && talker.level >= 40) {
myself.UpdatePVPPoint(talker, -5000);
myself.IncrementParam(talker, 9, -1);
myself.ShowPage(talker, fnPkDownSuccess);

} else {
myself.ShowPage(talker, fnNoPvpPoint);

}

} else {
myself.ShowPage(talker, fnNoPvpPoint);

}

} else {
myself.ShowPage(talker, fnNoPkCount);

}

}
if (reply == 2) {
if (talker.pledge_id > 0 && myself.GetPledgeSkillLevel(talker) >= 5) {
if (myself.GetPVPPoint(talker) >= 1000) {
if (myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation) && talker.level >= 40) {
myself.UpdatePVPPoint(talker, -1000);
myself.UpdatePledgeNameValue(talker, 50);
myself.ShowSystemMessage(talker, 2326);
myself.ShowPage(talker, fnFameUpSuccess);

} else {
myself.ShowPage(talker, fnNoPvpPoint);

}

} else {
myself.ShowPage(talker, fnNoPvpPoint);

}

} else {
myself.ShowPage(talker, fnNoPledge);

}

}

}
super;
	}


}