package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class citizen extends default_npc {
	protected String fnHi = "chi.htm";
	protected String fnFeudInfo = "defaultfeudinfo.htm";
	protected String fnNoFeudInfo = "nofeudinfo.htm";
	protected String fnBracketL = "[";
	protected String fnBracketR = "]";
	protected String fnFlagMan = "flagman.htm";
	protected int MoveAroundSocial = 0;
	protected int MoveAroundSocial1 = 0;
	protected String ai_type = "pet_around_pet_manager";
	protected int HavePet = 0;
	protected int silhouette = 1020130;
	protected int FriendShip1 = 0;
	protected int FriendShip2 = 0;
	protected int FriendShip3 = 0;
	protected int FriendShip4 = 0;
	protected int FriendShip5 = 0;
	protected String fnNoFriend = "citizen_html";
	protected int NoFnHi = 0;

	protected void TALKED(HandlerParam talker) {
if (NoFnHi == 1) {
return;

}
if (FriendShip1 == 0) {
myself.ShowPage(talker, fnHi);

} else if (gg.OwnItemCount(talker, 13560) > 0 || gg.OwnItemCount(talker, 13561) > 0 || gg.OwnItemCount(talker, 13562) > 0 || gg.OwnItemCount(talker, 13563) > 0 || gg.OwnItemCount(talker, 13564) > 0 || gg.OwnItemCount(talker, 13565) > 0 || gg.OwnItemCount(talker, 13566) > 0 || gg.OwnItemCount(talker, 13567) > 0 || gg.OwnItemCount(talker, 13568) > 0) {
myself.ShowPage(talker, fnFlagMan);

} else if (gg.OwnItemCount(talker, FriendShip1) > 0 || gg.OwnItemCount(talker, FriendShip2) > 0 || gg.OwnItemCount(talker, FriendShip3) > 0 || gg.OwnItemCount(talker, FriendShip4) > 0 || gg.OwnItemCount(talker, FriendShip5) > 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnNoFriend);

}
	}

	protected void CREATED() {
if (MoveAroundSocial > 0 || MoveAroundSocial1 > 0) {
myself.AddTimerEx(1671, 10000);

}
if (HavePet == 1) {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x + 10), gg.FloatToInt(myself.sm.y + 10), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1671) {
if (myself.sm.hp > myself.sm.max_hp * 0.400000 && myself.sm.alive != 0 && myself.p_state != 3) {
if (MoveAroundSocial > 0 || MoveAroundSocial1 > 0) {
if (MoveAroundSocial > 0 && gg.Rand(100) < 40) {
myself.AddEffectActionDesire(myself.sm, 3, MoveAroundSocial * 1000 / 30, 50);

} else if (MoveAroundSocial1 > 0 && gg.Rand(100) < 40) {
myself.AddEffectActionDesire(myself.sm, 2, MoveAroundSocial1 * 1000 / 30, 50);

}

}

}
myself.AddTimerEx(1671, 10000);

}
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == -1000) {
switch (reply) {
case 0: {
myself.ShowPage(talker, fnHi);
break;

}
case 1: {
if (myself.sm.residence_id > 0) {
if (myself.Castle_GetPledgeId()) {
myself.FHTML_SetFileName(fhtml0, fnFeudInfo);
myself.FHTML_SetStr(fhtml0, "my_pledge_name", myself.Castle_GetPledgeName());
myself.FHTML_SetStr(fhtml0, "my_owner_name", myself.Castle_GetOwnerName());
myself.FHTML_SetInt(fhtml0, "current_tax_rate", myself.Residence_GetTaxRateCurrent());

} else {
myself.FHTML_SetFileName(fhtml0, fnNoFeudInfo);

}
if (myself.sm.residence_id < 7) {
myself.FHTML_SetStr(fhtml0, "kingdom_name", gg.MakeFString(1001000, "", "", "", "", ""));

} else {
myself.FHTML_SetStr(fhtml0, "kingdom_name", gg.MakeFString(1001100, "", "", "", "", ""));

}
myself.FHTML_SetStr(fhtml0, "feud_name", gg.MakeFString(MakeFString + myself.sm.residence_id, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);

}
break;

}

}

} else if (ask == -303) {
if (reply == 579) {
if (talker.level >= 40 && talker.level < 46) {
if (talker.race == 5) {
myself.ShowMultisell(603, talker);

} else {
myself.ShowMultisell(reply, talker);

}

}

} else if (reply == 580) {
if (talker.level >= 46 && talker.level < 52) {
if (talker.race == 5) {
myself.ShowMultisell(604, talker);

} else {
myself.ShowMultisell(reply, talker);

}

}

} else if (reply == 581) {
if (talker.level >= 52) {
if (talker.race == 5) {
myself.ShowMultisell(605, talker);

} else {
myself.ShowMultisell(reply, talker);

}

}

} else {
myself.ShowMultisell(reply, talker);

}

} else if (ask == -503) {
if (reply == 100) {
myself.ShowVariationMakeWindow(talker);

} else if (reply == 200) {
myself.ShowVariationCancelWindow(talker);

}

} else if (ask == -601) {
if (reply == 0) {
if (gg.OwnItemCount(talker, 8957) <= 0 && gg.OwnItemCount(talker, 8958) <= 0 && gg.OwnItemCount(talker, 8959) <= 0) {
myself.ShowPage(talker, "welcomeback003.htm");

} else {
myself.ShowPage(talker, "welcomeback004.htm");

}

} else if (reply == 1) {
if (gg.OwnItemCount(talker, 8957) <= 0 && gg.OwnItemCount(talker, 8958) <= 0 && gg.OwnItemCount(talker, 8959) <= 0) {
myself.ShowPage(talker, "welcome_lin2_cat002.htm");

} else {
myself.ShowPage(talker, "welcome_lin2_cat004.htm");

}

} else if (reply == 2) {
if (talker.level < 20) {
myself.ShowMultisell(583, talker);

} else if (talker.level >= 20 && talker.level < 40) {
myself.ShowMultisell(584, talker);

} else if (talker.level >= 40 && talker.level < 52) {
myself.ShowMultisell(585, talker);

} else if (talker.level >= 52 && talker.level < 61) {
myself.ShowMultisell(586, talker);

} else if (talker.level >= 61 && talker.level < 76) {
myself.ShowMultisell(587, talker);

} else if (talker.level >= 76) {
myself.ShowMultisell(588, talker);

}

} else if (reply == 3) {
if (talker.level < 20) {
myself.ShowMultisell(589, talker);

} else if (talker.level >= 20 && talker.level < 40) {
myself.ShowMultisell(590, talker);

} else if (talker.level >= 40 && talker.level < 52) {
myself.ShowMultisell(591, talker);

} else if (talker.level >= 52 && talker.level < 61) {
myself.ShowMultisell(592, talker);

} else if (talker.level >= 61 && talker.level < 76) {
myself.ShowMultisell(593, talker);

} else if (talker.level >= 76) {
myself.ShowMultisell(594, talker);

}

} else if (reply == 4) {
if (talker.level < 20) {
myself.ShowMultisell(595, talker);

} else if (talker.level >= 20 && talker.level < 40) {
myself.ShowMultisell(596, talker);

} else if (talker.level >= 40 && talker.level < 52) {
myself.ShowMultisell(597, talker);

} else if (talker.level >= 52 && talker.level < 61) {
myself.ShowMultisell(598, talker);

} else if (talker.level >= 61 && talker.level < 76) {
myself.ShowMultisell(601, talker);

} else if (talker.level >= 76) {
myself.ShowMultisell(600, talker);

}

}

}
	}


}