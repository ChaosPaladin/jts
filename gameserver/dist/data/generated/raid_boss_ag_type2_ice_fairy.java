package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_ag_type2_ice_fairy extends raid_boss_ag_type2 {
	protected int RangeDDMagic_a = 458752001;
	protected int DeBuff1 = 293601281;
	protected int DeBuff2 = 293666817;
	protected int DeBuff3 = 293732353;

	protected void CREATED() {
myself.AddTimerEx(1005, 34 * 60 * 1000 + 30000);
myself.c_ai0 = gg.GetNullCreature();
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam maker0, HandlerParam party0) {
if (timer_id == 1005) {
maker0 = gg.GetNpcMaker("schuttgart13_npc2314_1m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10005, 0, 0);

}
myself.Despawn();

}
if (timer_id == 2003) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1010643, gg.IntToStr(30), "", "", "", ""));

}

}
myself.AddTimerEx(2004, 10 * 60 * 1000);

}
if (timer_id == 2004) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1010643, gg.IntToStr(20), "", "", "", ""));

}

}
myself.AddTimerEx(1012, 15 * 60 * 1000);

}
if (timer_id == 1012) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 10000, 0, gg.MakeFString(1121002, "", "", "", "", ""));

}

}

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (gg.Rand(Rand * 5) < 1) {
if (myself.Skill_GetConsumeMP(RangeDDMagic_a) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeDDMagic_a) < myself.sm.hp && myself.Skill_InReuseDelay(RangeDDMagic_a) == 0) {
myself.AddUseSkillDesire(attacker, RangeDDMagic_a, 0, 1, 1000000);

}

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (gg.Rand(Rand * 5) < 1) {
if (myself.Skill_GetConsumeMP(RangeDDMagic_a) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeDDMagic_a) < myself.sm.hp && myself.Skill_InReuseDelay(RangeDDMagic_a) == 0) {
myself.AddUseSkillDesire(speller, RangeDDMagic_a, 0, 1, 1000000);

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
if (script_event_arg1 == 11036) {
if (script_event_arg2 == 1) {
myself.i_ai0 = 1;
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, DeBuff1, 1, 1, 1000000);

}

} else if (script_event_arg2 == 2) {
myself.i_ai0 = 2;
if (myself.Skill_GetConsumeMP(DeBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff2) == 0) {
myself.AddUseSkillDesire(myself.sm, DeBuff2, 1, 1, 1000000);

}

} else if (script_event_arg2 == 3) {
myself.i_ai0 = 3;
myself.LookNeighbor(600);

} else if (script_event_arg2 == 0) {
myself.i_ai0 = 0;

}

}
if (script_event_arg1 == 11040) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);
myself.AddTimerEx(2003, 5 * 60 * 1000);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam private) {
if (myself.i_ai0 == 3 && creature.is_pc == 0 && myself.sm != private && gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(DeBuff3)) <= 0) {
if (creature.class_id == 1029057) {
if (myself.Skill_GetConsumeMP(DeBuff3) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff3) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff3) == 0) {
myself.AddUseSkillDesire(creature, DeBuff3, 0, 1, 1000000);

}

}

}
super;
	}

	protected void MY_DYING(HandlerParam maker0) {
maker0 = gg.GetNpcMaker("schuttgart13_npc2314_1m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10025, 0, 0);

}
maker0 = gg.GetNpcMaker("schuttgart13_npc2314_3m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10025, 0, 0);

}
	}


}