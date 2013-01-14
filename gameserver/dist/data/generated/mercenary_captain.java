package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mercenary_captain extends citizen {
	protected int dominion_id = 81;
	protected int item_feud_badge = 13757;
	protected int item_merc_certification_a = 13767;
	protected int item_merc_certification_b = 13768;
	protected String fnHi = "gludio_merc_captain001.htm";
	protected String fnMyLord = "gludio_merc_captain007.htm";
	protected String fnDominionMyLord = "gludio_merc_captain021.htm";
	protected String fnDominionAnother = "gludio_merc_captain022.htm";
	protected String fnNotEnoughBadge = "gludio_merc_captain023.htm";
	protected String fnTradeDone = "gludio_merc_captain024.htm";
	protected String fnNocertification = "gludio_merc_captain025.htm";
	protected String fnLowLevel = "gludio_merc_captain026.htm";

	protected void CREATED(HandlerParam talker) {
myself.AddTimerEx(1000, 60 * 60 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
if (gg.GetDominionWarState(dominion_id) == 5) {
myself.Shout(gg.MakeFString(1300165, "", "", "", "", ""));

} else if (gg.Rand(2) < 1) {
myself.Shout(gg.MakeFString(1300163, "", "", "", "", ""));

} else {
myself.Shout(gg.MakeFString(1300164, "", "", "", "", ""));

}
myself.AddTimerEx(1000, 60 * 60 * 1000);

}
	}

	protected void TALKED(HandlerParam talker) {
if (myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation) && talker.level >= 40) {
if (myself.IsMyLord(talker) && myself.IsDominionOfLord(dominion_id)) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnDominionMyLord);

} else {
myself.ShowPage(talker, fnMyLord);

}

} else if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnDominionAnother);

} else {
myself.ShowPage(talker, fnHi);

}

} else {
myself.ShowPage(talker, fnLowLevel);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == 23040) {
myself.RegisterDominion(dominion_id, talker);

} else if (ask == 23010) {
if (reply == 677 || reply == 678 || reply == 679 || reply == 680 || reply == 681 || reply == 682 || reply == 683 || reply == 684 || reply == 685) {
if (gg.OwnItemCount(talker, item_merc_certification_a) > 0) {
myself.ShowMultisell(reply, talker);

} else {
myself.ShowPage(talker, fnNocertification);

}

} else if (reply == 686 || reply == 687 || reply == 688 || reply == 689 || reply == 690 || reply == 691 || reply == 692 || reply == 693 || reply == 694) {
if (gg.OwnItemCount(talker, item_merc_certification_b) > 0) {
myself.ShowMultisell(reply, talker);

} else {
myself.ShowPage(talker, fnNocertification);

}

} else {
myself.ShowMultisell(reply, talker);

}

} else if (ask == 23050) {
switch (reply) {
case 0: {
if (gg.OwnItemCount(talker, item_feud_badge) > 49) {
myself.DeleteItem1(talker, item_feud_badge, 50);
myself.CreatePet(talker, 4422, 1012526, 55);
myself.ShowPage(talker, fnTradeDone);

} else {
myself.ShowPage(talker, fnNotEnoughBadge);

}
break;

}
case 1: {
if (gg.OwnItemCount(talker, item_feud_badge) > 49) {
myself.DeleteItem1(talker, item_feud_badge, 50);
myself.CreatePet(talker, 4423, 1012527, 55);
myself.ShowPage(talker, fnTradeDone);

} else {
myself.ShowPage(talker, fnNotEnoughBadge);

}
break;

}
case 2: {
if (gg.OwnItemCount(talker, item_feud_badge) > 49) {
myself.DeleteItem1(talker, item_feud_badge, 50);
myself.CreatePet(talker, 4424, 1012528, 55);
myself.ShowPage(talker, fnTradeDone);

} else {
myself.ShowPage(talker, fnNotEnoughBadge);

}
break;

}
case 3: {
if (gg.OwnItemCount(talker, item_feud_badge) > 79) {
myself.DeleteItem1(talker, item_feud_badge, 80);
myself.CreatePet(talker, 14819, 1016068, 55);
myself.ShowPage(talker, fnTradeDone);

} else {
myself.ShowPage(talker, fnNotEnoughBadge);

}
break;

}

}

}
	}


}