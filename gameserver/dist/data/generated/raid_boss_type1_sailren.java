package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_type1_sailren extends raid_boss_type1 {
	protected void CREATED(HandlerParam maker0) {
myself.i_ai1 = myself.GetCurrentTick();
myself.i_ai2 = 0;
myself.i_ai3 = 0;
maker0 = gg.GetNpcMaker("rune16_npc2017_01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11041, 0, 0);

}
myself.AddTimerEx(3003, 5 * 60 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 1001) {
if (gg.Rand(5) < 1) {
myself.RandomizeAttackDesire();

}
if (RootingManage == 1) {
if (myself.i_quest3 == 1 && myself.GetCurrentTick() > myself.i_quest4 + 60 * 5) {
myself.MPCC_SetMasterPartyRouting(myself.int_list.Get(0), myself.sm, 0);
myself.int_list.Clear();
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800010, "", "", "", "", ""));
myself.i_quest3 = 0;

}

}
if (gg.Rand(5) < 1) {
myself.AddUseSkillDesire(myself.sm, SelfBuff_a, 1, 1, 1000000);

}
myself.AddTimerEx(1001, 60 * 1000);

}
if (timer_id == 3000) {
myself.AddEffectActionDesire(myself.sm, 2, 3000, 50);

}
if (timer_id == 3001) {
myself.AddEffectActionDesire(myself.sm, 2, 3000, 50);
myself.AddTimerEx(3002, 5100);

}
if (timer_id == 3002) {

}
if (timer_id == 3003) {
if (myself.GetLifeTime() > 7 && myself.InMyTerritory(myself.sm)) {
if (myself.GetCurrentTick() - myself.i_ai1 > 60 * 10) {
myself.RemoveAllHateInfoIF(0, 0);
maker0 = gg.GetNpcMaker("rune16_npc2017_13m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11046, 0, 0);

}
myself.InstantTeleport(myself.sm, -113091, -243942, -15536);
myself.i_ai2 = 0;
myself.i_ai3 = 0;
maker0 = gg.GetNpcMaker("rune16_npc2017_01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11043, 0, 0);

}

}

}
myself.AddTimerEx(3003, 5 * 60 * 1000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam party0, HandlerParam party1) {
if (attacker.is_pc == 1) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
if (myself.i_ai2 == 0) {
myself.i_ai2 = party0.id;

}

}
party1 = gg.GetParty(attacker);
if (myself.IsNullParty(party1) == 0) {
if (myself.i_ai2 != party1.id) {
myself.InstantTeleport(attacker, 23575, -7727, -1272);

}

}

}
myself.i_ai1 = myself.GetCurrentTick();
super;
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id, HandlerParam party1) {
if (speller.is_pc == 1) {
party1 = gg.GetParty(speller);
if (myself.IsNullParty(party1) == 0) {
if (myself.i_ai2 != party1.id) {
myself.InstantTeleport(speller, 23575, -7727, -1272);

}

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0, HandlerParam c0, HandlerParam i1) {
myself.i_ai1 = myself.GetCurrentTick();
c0 = speller;
if (myself.sm.in_peacezone != 1) {
if (SSQLoserTeleport != 0) {
if (c0.builder_level == 0) {
if (SSQLoserTeleport != 1 && SSQLoserTeleport != 2) {
myself.Say("버그:SSQLoserTeleport에 잘못된 값이 들어갔습니다. 값 = " + SSQLoserTeleport);

} else if (myself.GetSSQStatus() == 3) {
i1 = myself.GetSSQSealOwner(SSQLoserTeleport);
if (c0.is_pc == 1) {
if (i1 == 0 && gg.GetSSQPart(c0) == 0) {
myself.RemoveAttackDesire(c0.id);
myself.InstantTeleport(c0, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i1 == 1 && gg.GetSSQPart(c0) != 1) {
myself.RemoveAttackDesire(c0.id);
myself.InstantTeleport(c0, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i1 == 2 && gg.GetSSQPart(c0) != 2) {
myself.RemoveAttackDesire(c0.id);
myself.InstantTeleport(c0, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

} else if (myself.IsInCategory(12, c0.npc_class_id) == 1) {
if (i1 == 0 && gg.GetSSQPart(c0.master) == 0) {
myself.RemoveAttackDesire(c0.master.id);
myself.InstantTeleport(c0.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i1 == 1 && gg.GetSSQPart(c0.master) != 1) {
myself.RemoveAttackDesire(c0.master.id);
myself.InstantTeleport(c0.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i1 == 2 && gg.GetSSQPart(c0.master) != 2) {
myself.RemoveAttackDesire(c0.master.id);
myself.InstantTeleport(c0.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

}

} else if (myself.GetSSQStatus() == 1) {
i1 = myself.GetSSQSealOwner(SSQLoserTeleport);
if (c0.is_pc == 1) {
if (gg.GetSSQPart(c0) == 0) {
myself.RemoveAttackDesire(c0.id);
myself.InstantTeleport(c0, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

} else if (myself.IsInCategory(12, c0.npc_class_id) == 1) {
if (gg.GetSSQPart(c0.master) == 0) {
myself.RemoveAttackDesire(c0.master.id);
myself.InstantTeleport(c0.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

}

}

}

}

}
if (speller.level > myself.sm.level + 8 && gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(276234241)) == -1) {
myself.AddUseSkillDesire(speller, 276234241, 0, 1, 1000000);
return;

}
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.p_state == 3 && myself.top_desire_target != speller && myself.sm.z + 200 > speller.z) {
myself.AddAttackDesire(speller, 1, myself.Skill_GetEffectPoint(skill_name_id) / myself.sm.max_hp * 4000 * 150);

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
myself.i_ai1 = myself.GetCurrentTick();
if (myself.i_ai3 == 1) {
myself.AddAttackDesire(creature, 1, 200);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam maker0) {
if (script_event_arg1 == 11042) {
myself.i_ai1 = myself.GetCurrentTick();
myself.InstantTeleport(myself.sm, 27549, -6638, -2008);
myself.AddTimerEx(3000, 18000);
myself.AddTimerEx(1001, 60 * 1000);

}
if (script_event_arg1 == 11055) {
myself.i_ai3 = 1;
i0 = script_event_arg2;
party0 = gg.GetPartyFromID(i0);
if (myself.IsNullParty(party0) == 0) {
c0 = myself.GetLeaderOfParty(party0);
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (myself.InMyTerritory(c0) == 1 && myself.DistFromMe(c0) < 3000) {
myself.AddAttackDesire(c0, 1, 200);

}

}

}

}

}
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam maker0, HandlerParam party0, HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
myself.BroadcastScriptEvent(11054, 0, 8000);
maker0 = gg.GetNpcMaker("rune16_npc2017_01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11045, 0, 0);

}
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
if (myself.IsNullCreature(c1) == 0 && myself.DistFromMe(c1) < 1000) {
if (myself.GetInventoryInfo(c1, 0) >= myself.GetInventoryInfo(c1, 1) * 0.800000 || myself.GetInventoryInfo(c1, 2) >= myself.GetInventoryInfo(c1, 3) * 0.800000) {
myself.ShowSystemMessageStr(c1, gg.MakeFString(1800879, "", "", "", "", ""));

}
myself.GetItemData(c1, 14828);
myself.CreatePet(c1, 14828, 1016067, 70);
myself.ShowSystemMessageStr(c1, gg.MakeFString(1800878, "", "", "", "", ""));

}

}

}

}

} else {
party0 = gg.GetParty(c0);
if (gg.IsNull(party0) == 0) {
for (i3 = 0; i3 < party0.member_count; i3 = i3 + 1) {
c1 = myself.GetMemberOfParty(party0, i3);
if (myself.IsNullCreature(c1) == 0 && myself.DistFromMe(c1) < 1000) {
if (myself.GetInventoryInfo(c1, 0) >= myself.GetInventoryInfo(c1, 1) * 0.800000 || myself.GetInventoryInfo(c1, 2) >= myself.GetInventoryInfo(c1, 3) * 0.800000) {
myself.ShowSystemMessageStr(c1, gg.MakeFString(1800879, "", "", "", "", ""));

}
myself.GetItemData(c1, 14828);
myself.CreatePet(c1, 14828, 1016067, 70);
myself.ShowSystemMessageStr(c1, gg.MakeFString(1800878, "", "", "", "", ""));

}

}

}

}

}
	}


}