package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_hekaton_prime extends raid_boss_type4 {
	protected int GlobalMap_ID = 39;

	protected void CREATED() {
myself.i_quest3 = 0;
myself.i_quest4 = myself.GetCurrentTick();
myself.AddTimerEx(1001, 1000);
myself.sm.weight_point = 10;
myself.SetVisible(0);
myself.i_ai5 = 0;
myself.RegisterGlobalMap(GlobalMap_ID, 1);
	}

	protected void ATTACKED() {
if (myself.i_ai5 == 0) {
return;

}
super;
	}

	protected void SEE_SPELL() {
if (myself.i_ai5 == 0) {
return;

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (script_event_arg1 == 2519001) {
myself.RegisterGlobalMap(GlobalMap_ID, 0);
myself.SetVisible(1);
myself.i_ai5 = 1;
myself.EffectMusic(myself.sm, 8000, RaidSpawnMusic);
myself.CreatePrivates(Privates);

}
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
c0 = last_attacker;
if (myself.IsNullCreature(c0) == 0) {
i0 = myself.MPCC_GetMPCCId(c0);
if (i0 > 0) {
for (i1 = 0; i1 < myself.MPCC_GetPartyCount(i0); i1 = i1 + 1) {
i2 = myself.MPCC_GetPartyID(i0, i1);
party0 = gg.GetPartyFromID(i2);
if (myself.IsNullParty(party0) == 0) {
for (i3 = 0; i3 < party0.member_count; i3 = i3 + 1) {
c1 = myself.GetMemberOfParty(party0, i3);
if (myself.IsNullCreature(c1) == 0) {
if (gg.HaveMemo(c1, 307) == 1 && gg.GetMemoState(c1, 307) == 1) {
myself.i_ai0 = myself.i_ai0 + 1;
if (myself.i_ai0 <= 18) {
myself.SetMemoState(c1, 307, 2);
myself.SetFlagJournal(c1, 307, 2);
myself.ShowQuestMark(c1, 307);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

}

}

}

}

}

} else {
party0 = gg.GetParty(c0);
if (gg.IsNull(party0) == 0) {
for (i3 = 0; i3 < party0.member_count; i3 = i3 + 1) {
c1 = myself.GetMemberOfParty(party0, i3);
if (myself.IsNullCreature(c1) == 0) {
if (gg.HaveMemo(c1, 307) == 1 && gg.GetMemoState(c1, 307) == 1) {
myself.i_ai0 = myself.i_ai0 + 1;
if (myself.i_ai0 <= 18) {
myself.SetMemoState(c1, 307, 2);
myself.SetFlagJournal(c1, 307, 2);
myself.ShowQuestMark(c1, 307);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

}

}

}

}

}

}
	}


}