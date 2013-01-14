package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class extended_zone_controller extends zone_controller {
	protected int zone_type = 0;
	protected int enter_type = 0;
	protected int zone_type1 = 0;
	protected int enter_type1 = 0;
	protected String fnNotEnoughCondition = "extended_zone_controller_html";
	protected int nornil_condition = 0;
	protected int check_race = 5;
	protected int quest_num = -1;
	protected String fnMakeParty = "extended_zone_controller_fnMakeParty";
	protected String fn2ndGroupUser = "extended_zone_controller_fn2ndGroupUser";
	protected int fortress_condition = 0;
	protected int fortress_id = 0;
	protected int restrict_time = 0;
	protected String fnNoProperPledge = "";
	protected String fnEnterRestricted = "";
	protected String fnNoCastleContract = "";
	protected String fnNotYetContract = "";
	protected String fnNowSiege = "castle_prison_keeper007.htm";

	protected void CREATED() {
myself.i_ai1 = 0;
gg.SetAsNull(myself.c_ai1);
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam s0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam fhtml0, HandlerParam pledge0) {
i1 = 0;
if (ask == -511) {
if (enter_type == 1) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 1) {
myself.ShowPage(talker, fnMakeParty);
return;

}

}
if (nornil_condition == 1) {
for (i0 = 0; i0 < party0.member_count; i0 = i0 + 1) {
gg.SetAsNull(c0);
c0 = myself.GetMemberOfParty(party0, i0);
if (myself.IsInCategory(6, c0.occupation)) {
if (gg.HaveMemo(c0, quest_num) || myself.GetOneTimeQuestFlag(c0, quest_num)) {
if (c0.race == check_race) {
i1 = 1;

}

}

} else {
myself.ShowPage(talker, fn2ndGroupUser);
return;

}

}

} else if (fortress_condition == 1) {
party0 = gg.GetParty(talker);
c0 = gg.Party_GetLeader(talker);
i1 = gg.Party_GetCount(talker);
pledge0 = myself.GetPledge(talker);
if (myself.IsNullParty(party0) == 0) {
if (myself.IsNullCreature(c0) == 0) {
if (talker == c0) {
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c1 = gg.Party_GetCreature(talker, i2);
if (myself.IsNullCreature(c1) == 0) {
if (c1.pledge_id < 0) {
myself.ShowPage(talker, fnNoProperPledge);
return;

} else if (myself.Castle_GetPledgeId() != c1.pledge_id) {
myself.ShowPage(talker, fnNoProperPledge);
return;

}

}

}

}

}

}
if (myself.IsMyLord(talker) || myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id > 0) {
if (fortress_id > 100) {
if (gg.Fortress_GetContractStatus(fortress_id) == 1) {
myself.ShowPage(talker, fnNoCastleContract);
return;

} else if (gg.Fortress_GetContractStatus(fortress_id) == 0) {
myself.ShowPage(talker, fnNotYetContract);
return;

}

} else if (fortress_id > 0 && fortress_id < 10) {
if (gg.Castle_GetDomainFortressContractStatus(fortress_id) == 0) {
myself.ShowPage(talker, fnNoCastleContract);
return;

} else if (myself.Castle_IsUnderSiege() || myself.Castle_GetRawSiegeTime() - myself.Castle_GetRawSystemTime() < 7200) {
myself.ShowPage(talker, fnNowSiege);
return;

}

}
if (myself.i_ai1 == 1) {
gg.SetAsNull(c0);
c0 = myself.GetLeaderOfParty(gg.GetParty(talker));
if (myself.IsNullCreature(myself.c_ai1) == 0 && gg.IsSameString(myself.c_ai1.name, c0.name) == 1) {
i1 = 1;

} else {
myself.ShowPage(talker, fnEnterRestricted);
return;

}

} else {
i1 = 1;

}

} else {
myself.ShowPage(talker, fnNoProperPledge);
return;

}

}
if (i1 == 0) {
myself.ShowPage(talker, fnNotEnoughCondition);
return;

}
if (reply == 1) {
if (zone_type > -1 && enter_type > -1) {
myself.InstantZone_Enter(talker, zone_type, enter_type);

}

} else if (reply == 0) {
myself.InstantZone_Leave(talker);

} else if (reply == -1) {
myself.InstantZone_Finish(5);

}

}
if (ask == 726) {
if (reply == 2) {
if (fortress_id > 100) {
if (gg.Fortress_GetContractStatus(fortress_id) == 1) {
myself.ShowPage(talker, "gludio_fort_a_campkeeper_q0726_13b.htm");
return;

} else if (gg.Fortress_GetContractStatus(fortress_id) == 0) {
myself.ShowPage(talker, "gludio_fort_a_campkeeper_q0726_13a.htm");
return;

} else if (gg.HaveMemo(talker, 726) == 0) {
if (myself.IsMyLord(talker) || myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id > 0) {
if (talker.level >= 75) {
myself.ShowPage(talker, "gludio_fort_a_campkeeper_q0726_06.htm");

} else {
myself.ShowPage(talker, "gludio_fort_a_campkeeper_q0726_07.htm");

}

} else {
myself.ShowPage(talker, "gludio_fort_a_campkeeper_q0726_08.htm");

}

} else {
party0 = gg.GetParty(talker);
c0 = gg.Party_GetLeader(talker);
i1 = gg.Party_GetCount(talker);
pledge0 = myself.GetPledge(talker);
if (myself.IsNullParty(party0) == 0) {
if (myself.IsNullCreature(c0) == 0) {
if (talker == c0) {
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c1 = gg.Party_GetCreature(talker, i2);
if (myself.IsNullCreature(c1) == 0) {
if (gg.HaveMemo(c1, 726) == 0) {
myself.FHTML_SetFileName(fhtml0, "gludio_fort_a_campkeeper_q0726_12.htm");
myself.FHTML_SetStr(fhtml0, "name", c1.name);
myself.ShowFHTML(talker, fhtml0);
return;

} else if (myself.Castle_GetPledgeId() != c1.pledge_id) {
myself.FHTML_SetFileName(fhtml0, "gludio_fort_a_campkeeper_q0726_11.htm");
myself.FHTML_SetStr(fhtml0, "name", c1.name);
myself.ShowFHTML(talker, fhtml0);
return;

}

}

}
if (myself.IsMyLord(talker) || myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id > 0) {
if (gg.HaveMemo(talker, 726) == 1) {
if (myself.i_ai1 == 1) {
gg.SetAsNull(c0);
c0 = myself.GetLeaderOfParty(gg.GetParty(talker));
if (myself.IsNullCreature(myself.c_ai1) == 0 && gg.IsSameString(myself.c_ai1.name, c0.name) == 1) {
if (zone_type1 > -1 && enter_type1 > -1) {
myself.InstantZone_Enter(talker, zone_type1, enter_type1);

}

} else {
myself.ShowPage(talker, fnEnterRestricted);
return;

}

} else {
myself.InstantZone_Enter(talker, zone_type1, enter_type1);
myself.FHTML_SetFileName(fhtml0, "gludio_fort_a_campkeeper_q0726_13.htm");
myself.FHTML_SetStr(fhtml0, "pledgename", pledge0.name);
myself.ShowFHTML(talker, fhtml0);

}

}

}

} else if (myself.i_ai1 == 1) {
gg.SetAsNull(c0);
c0 = myself.GetLeaderOfParty(gg.GetParty(talker));
if (myself.IsNullCreature(myself.c_ai1) == 0 && gg.IsSameString(myself.c_ai1.name, c0.name) == 1) {
myself.InstantZone_Enter(talker, zone_type1, enter_type1);

}

} else {
myself.FHTML_SetFileName(fhtml0, "gludio_fort_a_campkeeper_q0726_10.htm");
myself.FHTML_SetStr(fhtml0, "name", c0.name);
myself.ShowFHTML(talker, fhtml0);

}

}

} else {
myself.ShowPage(talker, "gludio_fort_a_campkeeper_q0726_09.htm");

}

}

}

} else if (reply == 0) {
myself.InstantZone_Leave(talker);

} else if (reply == -1) {
myself.InstantZone_Finish(5);

}

}
if (ask == 727) {
if (reply == 2) {
if (fortress_id > 0 && fortress_id < 10) {
if (gg.Castle_GetDomainFortressContractStatus(fortress_id) == 0) {
myself.ShowPage(talker, "gludio_prison_keeper_q0727_13a.htm");
return;

} else if (gg.HaveMemo(talker, 727) == 0) {
if (myself.IsMyLord(talker) || myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id > 0) {
if (talker.level >= 75) {
myself.ShowPage(talker, "gludio_prison_keeper_q0727_06.htm");

} else {
myself.ShowPage(talker, "gludio_prison_keeper_q0727_07.htm");

}

} else {
myself.ShowPage(talker, "gludio_prison_keeper_q0727_08.htm");

}

} else {
party0 = gg.GetParty(talker);
c0 = gg.Party_GetLeader(talker);
i1 = gg.Party_GetCount(talker);
pledge0 = myself.GetPledge(talker);
if (myself.IsNullParty(party0) == 0) {
if (myself.IsNullCreature(c0) == 0) {
if (talker == c0) {
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c1 = gg.Party_GetCreature(talker, i2);
if (myself.IsNullCreature(c1) == 0) {
if (gg.HaveMemo(c1, 727) == 0) {
myself.FHTML_SetFileName(fhtml0, "gludio_prison_keeper_q0727_12.htm");
myself.FHTML_SetStr(fhtml0, "name", c1.name);
myself.ShowFHTML(talker, fhtml0);
return;

} else if (myself.Castle_GetPledgeId() != c1.pledge_id) {
myself.FHTML_SetFileName(fhtml0, "gludio_prison_keeper_q0727_11.htm");
myself.FHTML_SetStr(fhtml0, "name", c1.name);
myself.ShowFHTML(talker, fhtml0);
return;

}

}

}
if (myself.IsMyLord(talker) || myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id > 0) {
if (gg.HaveMemo(talker, 727) == 1) {
if (myself.i_ai1 == 1) {
gg.SetAsNull(c0);
c0 = myself.GetLeaderOfParty(gg.GetParty(talker));
if (myself.IsNullCreature(myself.c_ai1) == 0 && gg.IsSameString(myself.c_ai1.name, c0.name) == 1) {
if (zone_type1 > -1 && enter_type1 > -1) {
myself.InstantZone_Enter(talker, zone_type1, enter_type1);

}

} else {
myself.ShowPage(talker, fnEnterRestricted);
return;

}

} else {
myself.InstantZone_Enter(talker, zone_type1, enter_type1);
myself.FHTML_SetFileName(fhtml0, "gludio_prison_keeper_q0727_13.htm");
myself.FHTML_SetStr(fhtml0, "pledgename", pledge0.name);
myself.ShowFHTML(talker, fhtml0);

}

}

}

} else if (myself.i_ai1 == 1) {
gg.SetAsNull(c0);
c0 = myself.GetLeaderOfParty(gg.GetParty(talker));
if (myself.IsNullCreature(myself.c_ai1) == 0 && gg.IsSameString(myself.c_ai1.name, c0.name) == 1) {
myself.InstantZone_Enter(talker, zone_type1, enter_type1);

}

} else {
myself.FHTML_SetFileName(fhtml0, "gludio_prison_keeper_q0727_10.htm");
myself.FHTML_SetStr(fhtml0, "name", c0.name);
myself.ShowFHTML(talker, fhtml0);

}

}

} else {
myself.ShowPage(talker, "gludio_prison_keeper_q0727_09.htm");

}

}

}

} else if (reply == 0) {
myself.InstantZone_Leave(talker);

} else if (reply == -1) {
myself.InstantZone_Finish(5);

}

}
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply, HandlerParam party0) {
if (reply == 0) {
myself.ShowPage(talker, fnEnterFailed);

} else if (reply == 1) {
if (fortress_condition == 1) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 1) {
return;

}
if (myself.i_ai1 == 0) {
myself.i_ai1 = 1;
myself.c_ai1 = myself.GetLeaderOfParty(party0);
myself.AddTimerEx(1999, restrict_time * 60 * 1000);

}

} else {
return;

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1999) {
myself.i_ai1 = 0;
gg.SetAsNull(myself.c_ai1);

}
	}


}