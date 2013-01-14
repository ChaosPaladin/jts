package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_jinia_npc2 extends citizen {
	protected int inzone_id1 = 139;
	protected int inzone_id2 = 144;
	protected int enter_type = 2;
	protected int TIMER_delay = 2314901;
	protected int TIMER_delay2 = 2314902;
	protected int position = -1;
	protected int debug_mode = 0;

	protected void TALKED(HandlerParam talker) {
if (talker.level < 82) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, "jinia_npc2002.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam party0, HandlerParam c0, HandlerParam c1) {
if (ask == -2314) {
switch (reply) {
case 1: {
myself.InstantZone_Enter(talker, inzone_id1, enter_type);
break;

}
case 2: {
myself.i_ai9 = gg.GetIndexFromCreature(talker);
myself.AddTimerEx(TIMER_delay, 2000);
break;

}
case 3: {
if (gg.OwnItemCount(talker, 15469) > 0 || gg.OwnItemCount(talker, 15470) > 0) {
myself.ShowPage(talker, "jinia_npc2009.htm");

} else if (myself.GetOneTimeQuestFlag(talker, 10286) == 1) {
myself.ShowPage(talker, "jinia_npc2008.htm");
myself.GiveItem1(talker, 15469, 1);

} else if (myself.GetOneTimeQuestFlag(talker, 10286) == 0) {
myself.ShowPage(talker, "jinia_npc2008.htm");
myself.GiveItem1(talker, 15470, 1);

}
break;

}

}

} else if (ask == 10285) {
if (reply == 2) {
myself.InstantZone_Enter(talker, 137, 0);

}

} else if (ask == 10286) {
if (reply == 2) {
myself.InstantZone_Enter(talker, inzone_id1, enter_type);

}

}
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply, HandlerParam state, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam c0, HandlerParam c1) {
if (state == 0) {
if (reply == 0) {
if (gg.HaveMemo(talker, 10285) == 1 && gg.GetMemoState(talker, 10285) == 2) {
myself.ShowPage(talker, "jinia_npc2_q10285_10.htm");

} else if (gg.HaveMemo(talker, 10286) == 1 && gg.GetMemoState(talker, 10286) == 2) {
myself.ShowPage(talker, "jinia_npc2_q10286_10.htm");

}

} else if (reply == 1) {
if (gg.HaveMemo(talker, 10285) == 1 && gg.GetMemoState(talker, 10285) == 2) {
myself.SetFlagJournal(talker, 10285, 9);
myself.ShowQuestMark(talker, 10285);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (talker.is_pc == 1 && myself.IsNullCreature(talker) == 0) {
if (talker != myself.GetLeaderOfParty(gg.GetParty(talker))) {
myself.ShowPage(talker, "jinia_npc2007.htm");

} else {
i0 = myself.MPCC_GetMPCCId(talker);
i1 = myself.MPCC_GetPartyCount(i0);
if (i0 > 0) {
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
i6 = myself.MPCC_GetPartyID(i0, i2);
party0 = gg.GetPartyFromID(i6);
i4 = party0.member_count;
for (i5 = 0; i5 < i4; i5 = i5 + 1) {
c1 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c1) == 0) {
if (gg.HaveMemo(c1, 10286) == 1 && gg.GetMemoState(c1, 10286) == 2) {
myself.SetFlagJournal(c1, 10286, 6);
myself.ShowQuestMark(c1, 10286);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}
if (c1.transformID == 260 || c1.transformID == 8 || c1.transformID == 9) {
myself.ShowSystemMessage(talker, 2924);
return;

}

}

}

}

} else if (talker.transformID == 260 || talker.transformID == 8 || talker.transformID == 9) {
myself.ShowSystemMessage(talker, 2924);
return;

}

}

}

}

} else if (state == 1) {

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam party0, HandlerParam c0, HandlerParam c1) {
if (timer_id == TIMER_delay) {
if (debug_mode) {
myself.Say("timer_delay");

}
myself.AddEffectActionDesire(myself.sm, 3, 110, 1000000);
myself.AddTimerEx(TIMER_delay2, 2000);

} else if (timer_id == TIMER_delay2) {
c0 = gg.GetCreatureFromIndex(myself.i_ai9);
if (myself.IsNullCreature(c0) == 0) {
if (c0.is_pc == 1 && myself.IsNullCreature(c0) == 0) {
i0 = myself.MPCC_GetMPCCId(c0);
i1 = myself.MPCC_GetPartyCount(i0);
if (i0 > 0) {
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
i6 = myself.MPCC_GetPartyID(i0, i2);
party0 = gg.GetPartyFromID(i6);
i4 = party0.member_count;
for (i5 = 0; i5 < i4; i5 = i5 + 1) {
c1 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c1) == 0) {
if (c1.transformID == 260 || c1.transformID == 8 || c1.transformID == 9) {
myself.ShowSystemMessage(c0, 2924);
return;

}

}

}

}

} else if (c0.transformID == 260 || c0.transformID == 8 || c0.transformID == 9) {
myself.ShowSystemMessage(c0, 2924);
return;

}
myself.InstantZone_Enter(c0, inzone_id2, enter_type);

}

}

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
myself.Say("reply " + reply);
myself.AddEffectActionDesire(myself.sm, reply, 110, 1000000);
	}


}