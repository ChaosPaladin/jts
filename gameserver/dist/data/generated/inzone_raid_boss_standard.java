package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_boss_standard extends inzone_combat_monster {
	protected String AreaName = "";
	protected int near_kamaloka = 0;
	protected int BadgeName = 13002;
	protected int BadgeNumber = 1;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai4 = 0;
myself.i_quest4 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam skill_name_id) {
if (attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id) == 1) {
myself.i_quest4 = myself.GetCurrentTick();

}
if (myself.i_ai4 == 0) {
if (myself.i_ai0 == 0) {
myself.AddAttackDesire(attacker, 1, 10);
myself.AddTimerEx(1001, 60 * 1000);
gg.Area_SetOnOffEx(AreaName, 1, myself.InstantZone_GetId());
myself.i_ai0 = 1;
myself.i_ai4 = 1;

} else if (myself.i_ai0 == 1) {
myself.AddTimerEx(1001, 60 * 1000);
gg.Area_SetOnOffEx(AreaName, 1, myself.InstantZone_GetId());
myself.i_ai4 = 1;

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id) == 0) {
myself.i_quest4 = myself.GetCurrentTick();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i10, HandlerParam i11, HandlerParam c0, HandlerParam party0, HandlerParam h0, HandlerParam private, HandlerParam maker0) {
if (timer_id == 1001) {
i0 = myself.GetCurrentTick() - myself.i_quest4;
if (i0 > 60) {
myself.BroadcastScriptEvent(4, 0, 4000);
myself.InstantZone_Finish(5);
myself.Despawn();

}
myself.AddTimerEx(1001, 60 * 1000);

}
super;
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam c1, HandlerParam party0) {
myself.EffectMusic(myself.sm, 4000, "RM01_S");
myself.InstantZone_MarkRestriction();
myself.InstantZone_Finish(5);
gg.Area_SetOnOffEx(AreaName, 0, myself.InstantZone_GetId());
if (near_kamaloka == 1) {
c1 = myself.GetLastAttacker();
if (myself.IsNullCreature(c1)) {

} else {
if (c1.master) {
c1 = c1.master;

}
i1 = gg.Party_GetCount(c1);
i2 = myself.InstantZone_GetId();
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = gg.Party_GetCreature(c1, i0);
if (c0.instant_zone_id == i2) {
myself.GiveItem1(c0, BadgeName, BadgeNumber);

}

}

}

}
	}


}