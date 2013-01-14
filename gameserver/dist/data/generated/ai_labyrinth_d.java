package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_labyrinth_d extends raid_boss_type2 {
	protected int Debuff1 = 268042241;
	protected int Debuff2 = 268107777;
	protected int Debuff3 = 268173313;
	protected int PCCafe_Reward = 13002;
	protected int PCCafe_Number = -1;
	protected int Dispel_Debuff = 1;
	protected int Dispel_Debuff_Prob = 0;

	protected void CREATED() {
myself.i_ai4 = 0;
myself.AddTimerEx(8255, 3 * 1000);
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 1624002) {
if (myself.Skill_GetConsumeMP(Debuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(Debuff1) < myself.sm.hp && myself.Skill_InReuseDelay(Debuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, Debuff1, 1, 1, 1000000);

}

} else if (script_event_arg1 == 1624003) {
if (myself.Skill_GetConsumeMP(Debuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(Debuff2) < myself.sm.hp && myself.Skill_InReuseDelay(Debuff2) == 0) {
myself.AddUseSkillDesire(myself.sm, Debuff2, 1, 1, 1000000);

}

} else if (script_event_arg1 == 1624004) {
if (myself.Skill_GetConsumeMP(Debuff3) < myself.sm.mp && myself.Skill_GetConsumeHP(Debuff3) < myself.sm.hp && myself.Skill_InReuseDelay(Debuff3) == 0) {
myself.AddUseSkillDesire(myself.sm, Debuff3, 1, 1, 1000000);

}

}
	}

	protected void MY_DYING(HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam party0, HandlerParam i0, HandlerParam i1) {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0) {
if (c0.master) {
c0 = c0.master;

}
if (c0.is_pc == 1) {
party0 = gg.GetParty(c0);
if (myself.IsNullParty(party0) == 0) {
i0 = party0.member_count;
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
if (myself.IsPCCafeUser(c1) == 1) {
if (myself.DistFromMe(c1) < 2500) {
myself.GiveItem1(c1, PCCafe_Reward, PCCafe_Number);

}

}

}

}

}

}

}
myself.InstantZone_MarkRestriction();
myself.InstantZone_Finish(10);
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, private.respawn_time);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 8255) {
if (myself.start_z - gg.FloatToInt(myself.sm.z) > 500 || myself.start_z - gg.FloatToInt(myself.sm.z) < -500) {
myself.RemoveAllAttackDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}
myself.AddTimerEx(8255, 3000);

}
super;
	}


}