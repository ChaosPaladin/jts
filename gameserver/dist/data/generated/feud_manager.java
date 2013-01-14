package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class feud_manager extends merchant {
	protected String fnNoBadge = "gludio_feud_manager002.htm";
	protected String fnAlreadyNoble = "gludio_feud_manager005.htm";
	protected String fnNotEnoughLv = "gludio_feud_manager006.htm";
	protected String fnNobleDone = "gludio_feud_manager007.htm";
	protected String fnLowLevel = "gludio_feud_manager008.htm";
	protected int item_feud_badge = 13757;

	protected void TALKED(HandlerParam talker) {
if (myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation) && talker.level >= 40) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnLowLevel);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 23000) {
if (gg.OwnItemCount(talker, item_feud_badge) > 0) {
myself.ShowMultisell(reply, talker);

} else {
myself.ShowPage(talker, fnNoBadge);

}

} else if (ask == 23060) {
if (gg.OwnItemCount(talker, item_feud_badge) > 99) {
if (talker.nobless_type == 1) {
myself.ShowPage(talker, fnAlreadyNoble);

} else if (talker.level < 75) {
myself.ShowPage(talker, fnNotEnoughLv);

} else if (talker.race == 5) {
if (gg.HaveMemo(talker, 241) == 1) {
myself.DeleteItem1(talker, 7587, gg.OwnItemCount(talker, 7587));
myself.DeleteItem1(talker, 7589, gg.OwnItemCount(talker, 7589));
myself.DeleteItem1(talker, 7588, gg.OwnItemCount(talker, 7588));
myself.DeleteItem1(talker, 7597, gg.OwnItemCount(talker, 7597));
myself.DeleteItem1(talker, 7598, gg.OwnItemCount(talker, 7598));
myself.DeleteItem1(talker, 7599, gg.OwnItemCount(talker, 7599));
myself.RemoveMemo(talker, 241);
myself.SetOneTimeQuestFlag(talker, 241, 1);
myself.SetOneTimeQuestFlag(talker, 242, 1);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SetOneTimeQuestFlag(talker, 247, 1);

} else if (gg.HaveMemo(talker, 242) == 1) {
myself.DeleteItem1(talker, 7595, gg.OwnItemCount(talker, 7595));
myself.DeleteItem1(talker, 7596, gg.OwnItemCount(talker, 7596));
myself.RemoveMemo(talker, 242);
myself.SetOneTimeQuestFlag(talker, 242, 1);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SetOneTimeQuestFlag(talker, 247, 1);

} else if (gg.HaveMemo(talker, 246) == 1) {
myself.DeleteItem1(talker, 7678, gg.OwnItemCount(talker, 7678));
myself.DeleteItem1(talker, 7591, gg.OwnItemCount(talker, 7591));
myself.DeleteItem1(talker, 7592, gg.OwnItemCount(talker, 7592));
myself.DeleteItem1(talker, 7593, gg.OwnItemCount(talker, 7593));
myself.RemoveMemo(talker, 246);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SetOneTimeQuestFlag(talker, 247, 1);

} else if (gg.HaveMemo(talker, 247) == 1) {
myself.RemoveMemo(talker, 247);
myself.SetOneTimeQuestFlag(talker, 247, 1);

} else {
if (myself.GetOneTimeQuestFlag(talker, 241) == 0) {
myself.SetOneTimeQuestFlag(talker, 241, 1);
myself.SetOneTimeQuestFlag(talker, 242, 1);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SetOneTimeQuestFlag(talker, 247, 1);

}
if (myself.GetOneTimeQuestFlag(talker, 242) == 0) {
myself.SetOneTimeQuestFlag(talker, 241, 1);
myself.SetOneTimeQuestFlag(talker, 242, 1);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SetOneTimeQuestFlag(talker, 247, 1);

}
if (myself.GetOneTimeQuestFlag(talker, 246) == 0) {
myself.SetOneTimeQuestFlag(talker, 241, 1);
myself.SetOneTimeQuestFlag(talker, 242, 1);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SetOneTimeQuestFlag(talker, 247, 1);

}
if (myself.GetOneTimeQuestFlag(talker, 247) == 0) {
myself.SetOneTimeQuestFlag(talker, 241, 1);
myself.SetOneTimeQuestFlag(talker, 242, 1);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SetOneTimeQuestFlag(talker, 247, 1);

}

}
myself.DeleteItem1(talker, item_feud_badge, 100);
myself.DeleteItem1(talker, 7678, gg.OwnItemCount(talker, 7678));
myself.DeleteItem1(talker, 7679, gg.OwnItemCount(talker, 7679));
myself.DeleteItem1(talker, 5011, gg.OwnItemCount(talker, 5011));
myself.DeleteItem1(talker, 1239, gg.OwnItemCount(talker, 1239));
myself.DeleteItem1(talker, 1246, gg.OwnItemCount(talker, 1246));
myself.GiveItem1(talker, 7694, 1);
myself.SetNobless(talker);
myself.SetOneTimeQuestFlag(talker, 236, 1);
myself.RemoveMemo(talker, 236);
myself.ShowPage(talker, fnNobleDone);

} else {
if (gg.HaveMemo(talker, 241) == 1) {
myself.DeleteItem1(talker, 7587, gg.OwnItemCount(talker, 7587));
myself.DeleteItem1(talker, 7589, gg.OwnItemCount(talker, 7589));
myself.DeleteItem1(talker, 7588, gg.OwnItemCount(talker, 7588));
myself.DeleteItem1(talker, 7597, gg.OwnItemCount(talker, 7597));
myself.DeleteItem1(talker, 7598, gg.OwnItemCount(talker, 7598));
myself.DeleteItem1(talker, 7599, gg.OwnItemCount(talker, 7599));
myself.RemoveMemo(talker, 241);
myself.SetOneTimeQuestFlag(talker, 241, 1);
myself.SetOneTimeQuestFlag(talker, 242, 1);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SetOneTimeQuestFlag(talker, 247, 1);

} else if (gg.HaveMemo(talker, 242) == 1) {
myself.DeleteItem1(talker, 7595, gg.OwnItemCount(talker, 7595));
myself.DeleteItem1(talker, 7596, gg.OwnItemCount(talker, 7596));
myself.RemoveMemo(talker, 242);
myself.SetOneTimeQuestFlag(talker, 242, 1);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SetOneTimeQuestFlag(talker, 247, 1);

} else if (gg.HaveMemo(talker, 246) == 1) {
myself.DeleteItem1(talker, 7678, gg.OwnItemCount(talker, 7678));
myself.DeleteItem1(talker, 7591, gg.OwnItemCount(talker, 7591));
myself.DeleteItem1(talker, 7592, gg.OwnItemCount(talker, 7592));
myself.DeleteItem1(talker, 7593, gg.OwnItemCount(talker, 7593));
myself.RemoveMemo(talker, 246);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SetOneTimeQuestFlag(talker, 247, 1);

} else if (gg.HaveMemo(talker, 247) == 1) {
myself.RemoveMemo(talker, 247);
myself.SetOneTimeQuestFlag(talker, 247, 1);

} else {
if (myself.GetOneTimeQuestFlag(talker, 241) == 0) {
myself.SetOneTimeQuestFlag(talker, 241, 1);
myself.SetOneTimeQuestFlag(talker, 242, 1);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SetOneTimeQuestFlag(talker, 247, 1);

}
if (myself.GetOneTimeQuestFlag(talker, 242) == 0) {
myself.SetOneTimeQuestFlag(talker, 241, 1);
myself.SetOneTimeQuestFlag(talker, 242, 1);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SetOneTimeQuestFlag(talker, 247, 1);

}
if (myself.GetOneTimeQuestFlag(talker, 246) == 0) {
myself.SetOneTimeQuestFlag(talker, 241, 1);
myself.SetOneTimeQuestFlag(talker, 242, 1);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SetOneTimeQuestFlag(talker, 247, 1);

}
if (myself.GetOneTimeQuestFlag(talker, 247) == 0) {
myself.SetOneTimeQuestFlag(talker, 241, 1);
myself.SetOneTimeQuestFlag(talker, 242, 1);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SetOneTimeQuestFlag(talker, 247, 1);

}

}
myself.DeleteItem1(talker, item_feud_badge, 100);
myself.DeleteItem1(talker, 7678, gg.OwnItemCount(talker, 7678));
myself.DeleteItem1(talker, 7679, gg.OwnItemCount(talker, 7679));
myself.DeleteItem1(talker, 5011, gg.OwnItemCount(talker, 5011));
myself.DeleteItem1(talker, 1239, gg.OwnItemCount(talker, 1239));
myself.DeleteItem1(talker, 1246, gg.OwnItemCount(talker, 1246));
myself.GiveItem1(talker, 7694, 1);
myself.SetNobless(talker);
myself.SetOneTimeQuestFlag(talker, 235, 1);
myself.RemoveMemo(talker, 235);
myself.ShowPage(talker, fnNobleDone);

}

} else {
myself.ShowPage(talker, fnNoBadge);

}

}
super;
	}


}