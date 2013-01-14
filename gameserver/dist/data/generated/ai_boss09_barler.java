package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss09_barler extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected int selfbuff1 = 458752001;
	protected int selfbuff2 = 458752001;
	protected int selfbuff3 = 458752001;
	protected int selfbuff4 = 263979009;
	protected int selfbuff5 = 458752001;
	protected int selfbuff6 = 458752001;
	protected int PhysicalSpecial1 = 458752001;
	protected int PhysicalSpecial2 = 458752001;
	protected int PhysicalSpecial3 = 458752001;
	protected int PhysicalSpecial4 = 458752001;
	protected int d_skill1 = 458752001;
	protected int d_skill2 = 458752001;
	protected int d_skill3 = 458752001;
	protected int attack_weight_value = 50;
	protected String gopcjail_makername = "innadril22_2422_014m1";
	protected int DropItem = 10015;

	protected void CREATED(HandlerParam i0, HandlerParam maker0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;
myself.i_quest4 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.c_ai4 = gg.GetNullCreature();
myself.int_list.Clear();
myself.int_list.Add(-1);
myself.AddTimerEx(1003, 1000);
	}

	protected void NO_DESIRE() {
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i2 = myself.int_list.Get(0);
if (i2 == -1) {
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
myself.int_list.Clear();
myself.int_list.Add(i1);

} else {
myself.int_list.Clear();
myself.int_list.Add(0);

}

} else if (i2 != 0) {
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
if (party0.member_count == i2) {

} else {
myself.int_list.Clear();
myself.int_list.Add(0);

}

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam c0, HandlerParam maker0) {
myself.c_ai1 = attacker;
if (myself.i_ai1 == 0) {
i5 = 0;
i6 = 0;
i7 = 0;
myself.i_ai2 = myself.GetTick();
myself.i_ai1 = 1;
if (myself.IsNullCreature(myself.c_ai1) == 0) {
party0 = gg.GetParty(myself.c_ai1);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = myself.GetMemberOfParty(party0, i0);
if (myself.IsNullCreature(c0) == 0) {
myself.int_list.Add(c0.id);

}

}

}

}
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
i3 = party0.member_count;
for (i4 = 0; i4 < i3; i4 = i4 + 1) {
c0 = myself.GetMemberOfParty(party0, i4);
if (myself.IsNullCreature(c0) == 0) {
if (myself.IsInCategory(70, c0.occupation)) {
i5 = i5 + 1;

} else if (myself.IsInCategory(2, c0.occupation)) {
i6 = i6 + 1;

} else if (myself.IsInCategory(0, c0.occupation)) {
i6 = i6 + 1;

}

}

}

}
if (i5 >= 3) {
myself.AddUseSkillDesire(myself.sm, selfbuff1, 1, 1, 1000000);
myself.i_quest3 = 1;

} else if (i6 >= 3) {
myself.AddUseSkillDesire(myself.sm, selfbuff2, 1, 1, 1000000);
myself.i_quest3 = 2;

} else if (i7 >= 3) {
myself.AddUseSkillDesire(myself.sm, selfbuff3, 1, 1, 1000000);
myself.i_quest3 = 3;

} else {
i3 = gg.Rand(100);
if (i3 < 40) {
myself.AddUseSkillDesire(myself.sm, selfbuff1, 1, 1, 1000000);
myself.i_quest3 = 1;

} else if (i3 < 80) {
myself.AddUseSkillDesire(myself.sm, selfbuff2, 1, 1, 1000000);
myself.i_quest3 = 2;

} else {
myself.AddUseSkillDesire(myself.sm, selfbuff3, 1, 1, 1000000);
myself.i_quest3 = 3;

}

}

}
if (myself.sm.hp >= myself.sm.max_hp * 0.700000 && myself.i_ai1 == 1) {
if (myself.sm.hp <= myself.sm.max_hp * 0.950000 && gg.Rand(20) < 1 && myself.i_quest1 == 0) {
i0 = gg.Rand(100);
if (i0 >= 75) {
myself.CreateOnePrivateEx(1018474, "barler_annoying_pillar", 0, 0, 153565, 141290, -12736, 0, 0, 0, 0);

} else if (i0 >= 50) {
myself.CreateOnePrivateEx(1018474, "barler_annoying_pillar", 0, 0, 153570, 142853, -12736, 0, 0, 0, 0);

} else if (i0 >= 25) {
myself.CreateOnePrivateEx(1018474, "barler_annoying_pillar", 0, 0, 152793, 142080, -12736, 0, 0, 0, 0);

} else {
myself.CreateOnePrivateEx(1018474, "barler_annoying_pillar", 0, 0, 154359, 142077, -12736, 0, 0, 0, 0);

}
myself.i_quest1 = 1;
myself.AddTimerEx(1002, 40 * 1000);

}
if (myself.i_ai0 == 1) {
if (gg.Rand(75) < 1) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial1, 0, 1, 1000000);

} else if (gg.Rand(32) < 1) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000000);

}

} else if (gg.Rand(75) < 1) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000000);

}

} else if (myself.sm.hp >= myself.sm.max_hp * 0.200000 && myself.i_ai1 != 3) {
if (myself.i_ai1 == 1) {
if (myself.GetTick() - myself.i_ai2 <= 3 * 60 * 1000) {
myself.i_ai3 = 90;

} else if (myself.GetTick() - myself.i_ai2 <= 5 * 60 * 1000) {
myself.i_ai3 = 80;

} else if (myself.GetTick() - myself.i_ai2 <= 7 * 60 * 1000) {
myself.i_ai3 = 70;

} else {
myself.i_ai3 = 50;

}
myself.i_ai2 = myself.GetTick();
myself.i_ai1 = 2;
myself.AddTimerEx(2001, 1000);
if (myself.i_quest3 == 1) {
myself.AddUseSkillDesire(myself.sm, selfbuff1, 1, 1, 1000000);

} else if (myself.i_quest3 == 2) {
myself.AddUseSkillDesire(myself.sm, selfbuff2, 1, 1, 1000000);

} else if (myself.i_quest3 == 3) {
myself.AddUseSkillDesire(myself.sm, selfbuff3, 1, 1, 1000000);

}

}
if (myself.i_ai0 == 1) {
if (gg.Rand(75) < 1) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial1, 0, 1, 1000000);

} else if (gg.Rand(32) < 1) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, PhysicalSpecial3, 0, 1, 1000000);

}

}

} else if (gg.Rand(75) < 1) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, PhysicalSpecial3, 0, 1, 1000000);

}

}

} else {
if (myself.i_ai1 == 2) {
myself.AddTimerEx(3001, 1000);
myself.AddTimerEx(3004, 5000);
if (myself.GetTick() - myself.i_ai2 <= 5 * 60 * 1000) {
myself.i_ai3 = 2;

} else {
myself.i_ai3 = 3;

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, gopcjail_makername);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai1 = 3;

}
if (myself.IsInCategory(3, attacker.occupation) == 0) {
i0 = gg.Rand(1000);
if (i0 < 80 && myself.i_ai3 == 2 && myself.i_quest2 == 0) {
myself.c_ai2 = myself.top_desire_target;
if (myself.c_ai2.is_pc == 0) {
myself.c_ai2 = attacker;

}
if (myself.IsNullCreature(myself.c_ai2) == 0) {
myself.AddUseSkillDesire(myself.c_ai2, 342491137, 0, 1, 1000000);
myself.BroadcastScriptEventEx(13026, gg.GetIndexFromCreature(myself.c_ai2), 0, 3000);
myself.i_quest2 = 1;

}

}
if (i0 < 50 && myself.i_ai3 == 3 && myself.i_quest2 == 0) {
if (myself.IsNullCreature(myself.c_ai2) == 0) {
myself.AddUseSkillDesire(myself.c_ai2, 342491137, 0, 1, 1000000);
myself.BroadcastScriptEventEx(13026, gg.GetIndexFromCreature(myself.c_ai2), 0, 3000);
myself.i_quest2 = 1;

}

}

}
if (gg.Rand(60) < 1) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, PhysicalSpecial3, 0, 1, 1000000);

}

}

}
if (myself.sm.hp <= myself.sm.max_hp * 0.300000 && myself.i_ai4 == 0) {
if (myself.Skill_GetConsumeMP(selfbuff5) < myself.sm.mp && myself.Skill_GetConsumeHP(selfbuff5) < myself.sm.hp && myself.Skill_InReuseDelay(selfbuff5) == 0) {
myself.AddUseSkillDesire(myself.sm, selfbuff5, 1, 0, 1000000);

}
myself.AddTimerEx(1004, 35 * 1000);
myself.i_ai4 = 1;

}
if (skill_name_id == 154664961 && myself.i_ai4 == 1) {
if (attacker.is_pc == 1) {
myself.c_ai0 = attacker;

}
if (myself.i_quest0 == 0) {
myself.AddTimerEx(3002, 3000);

}
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
myself.int_list.Add(party0.id);

} else {
myself.int_list.Add(0);

}
myself.i_quest0 = myself.i_quest0 + 1;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * attack_weight_value);

}
	}

	protected void SEE_ITEM(HandlerParam item_index_list, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0) {
i0 = item_index_list.GetSize();
if (myself.IsNullCreature(myself.c_ai3) == 0) {
myself.BroadcastScriptEventEx(13024, i0, gg.GetIndexFromCreature(myself.c_ai3), 3000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam c1, HandlerParam f0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam maker0) {
if (script_event_arg1 == 13000) {
if (myself.Skill_GetConsumeMP(selfbuff4) < myself.sm.mp && myself.Skill_GetConsumeHP(selfbuff4) < myself.sm.hp && myself.Skill_InReuseDelay(selfbuff4) == 0) {
myself.AddUseSkillDesire(myself.sm, selfbuff4, 1, 0, 1000000);

}
myself.i_ai0 = 1;

} else if (script_event_arg1 == 13004) {

} else if (script_event_arg1 == 13009) {
myself.AddTimerEx(4002, 100);

} else if (script_event_arg1 == 13010) {
myself.AddTimerEx(4008, 14 * 1000);
myself.AddEffectActionDesire(myself.sm, 1, 18000, 10000);

} else if (script_event_arg1 == 13011) {
gg.InstantTeleportEx(myself.sm, 153568, 142080, -12704, 60000);

} else if (script_event_arg1 == 13013) {
myself.RemoveAllDesire();
if (myself.i_quest4 == 0) {
myself.Suicide();
myself.i_quest4 = 1;
myself.AddTimerEx(1005, 1000);
c1 = myself.GetLastAttacker();
if (myself.IsNullCreature(c1)) {
return;

}
if (c1.master) {
c1 = c1.master;

}
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
i1 = gg.Party_GetCount(c1);
if (i1 == 0) {
if (gg.HaveMemo(c1, 350)) {
if (gg.OwnItemCount(c1, 4651) + gg.OwnItemCount(c1, 4652) + gg.OwnItemCount(c1, 4653) + gg.OwnItemCount(c1, 4654) + gg.OwnItemCount(c1, 4655) + gg.OwnItemCount(c1, 4656) + gg.OwnItemCount(c1, 4657) + gg.OwnItemCount(c1, 4658) + gg.OwnItemCount(c1, 4659) + gg.OwnItemCount(c1, 4660) + gg.OwnItemCount(c1, 4661) + gg.OwnItemCount(c1, 5579) + gg.OwnItemCount(c1, 5582) + gg.OwnItemCount(c1, 5914) + gg.OwnItemCount(c1, 4629) + gg.OwnItemCount(c1, 4630) + gg.OwnItemCount(c1, 4631) + gg.OwnItemCount(c1, 4632) + gg.OwnItemCount(c1, 4633) + gg.OwnItemCount(c1, 4634) + gg.OwnItemCount(c1, 4635) + gg.OwnItemCount(c1, 4636) + gg.OwnItemCount(c1, 4637) + gg.OwnItemCount(c1, 4638) + gg.OwnItemCount(c1, 4639) + gg.OwnItemCount(c1, 5577) + gg.OwnItemCount(c1, 5580) + gg.OwnItemCount(c1, 5908) + gg.OwnItemCount(c1, 4640) + gg.OwnItemCount(c1, 4641) + gg.OwnItemCount(c1, 4642) + gg.OwnItemCount(c1, 4643) + gg.OwnItemCount(c1, 4644) + gg.OwnItemCount(c1, 4645) + gg.OwnItemCount(c1, 4646) + gg.OwnItemCount(c1, 4647) + gg.OwnItemCount(c1, 4648) + gg.OwnItemCount(c1, 4649) + gg.OwnItemCount(c1, 4650) + gg.OwnItemCount(c1, 5578) + gg.OwnItemCount(c1, 5581) + gg.OwnItemCount(c1, 5911) + gg.OwnItemCount(c1, 9571) + gg.OwnItemCount(c1, 10161) + gg.OwnItemCount(c1, 9570) + gg.OwnItemCount(c1, 10160) + gg.OwnItemCount(c1, 9572) + gg.OwnItemCount(c1, 10162) + gg.OwnItemCount(c1, 10482) + gg.OwnItemCount(c1, 10481) + gg.OwnItemCount(c1, 10480) + gg.OwnItemCount(c1, 13072) + gg.OwnItemCount(c1, 13073) + gg.OwnItemCount(c1, 13071) + gg.OwnItemCount(c1, 15542) + gg.OwnItemCount(c1, 15543) + gg.OwnItemCount(c1, 15541) == 1) {
i3 = gg.Rand(1000);
if (i3 < 2) {
if (gg.OwnItemCount(c1, 5914) == 1) {
myself.DeleteItem1(c1, 5914, 1);
myself.GiveItem1(c1, 9571, 1);
gg.AddLog(6, c1, 9571);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c1, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, c1.name, gg.IntToStr(14), "", "", ""));

} else if (gg.OwnItemCount(c1, 5911) == 1) {
myself.DeleteItem1(c1, 5911, 1);
myself.GiveItem1(c1, 9572, 1);
gg.AddLog(6, c1, 9572);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c1, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, c1.name, gg.IntToStr(14), "", "", ""));

} else if (gg.OwnItemCount(c1, 5908) == 1) {
myself.DeleteItem1(c1, 5908, 1);
myself.GiveItem1(c1, 9570, 1);
gg.AddLog(6, c1, 9570);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c1, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, c1.name, gg.IntToStr(14), "", "", ""));

} else if (gg.OwnItemCount(c1, 9571) >= 1 || gg.OwnItemCount(c1, 10161) >= 1 || gg.OwnItemCount(c1, 9570) >= 1 || gg.OwnItemCount(c1, 10160) >= 1 || gg.OwnItemCount(c1, 9572) >= 1 || gg.OwnItemCount(c1, 10162) >= 1 || gg.OwnItemCount(c1, 10481) >= 1 || gg.OwnItemCount(c1, 10480) >= 1 || gg.OwnItemCount(c1, 10482) >= 1) {
myself.ShowSystemMessage(c1, 978);

} else {
myself.ShowSystemMessage(c1, 1264);

}

} else if (gg.OwnItemCount(c1, 5914) == 1) {
myself.DeleteItem1(c1, 5914, 1);
myself.GiveItem1(c1, 10161, 1);
gg.AddLog(6, c1, 10161);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c1, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35054, c1.name, gg.IntToStr(14), "", "", ""));

} else if (gg.OwnItemCount(c1, 5911) == 1) {
myself.DeleteItem1(c1, 5911, 1);
myself.GiveItem1(c1, 10162, 1);
gg.AddLog(6, c1, 10162);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c1, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35056, c1.name, gg.IntToStr(14), "", "", ""));

} else if (gg.OwnItemCount(c1, 5908) == 1) {
myself.DeleteItem1(c1, 5908, 1);
myself.GiveItem1(c1, 10160, 1);
gg.AddLog(6, c1, 10160);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c1, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35055, c1.name, gg.IntToStr(14), "", "", ""));

} else if (gg.OwnItemCount(c1, 9571) >= 1 || gg.OwnItemCount(c1, 10161) >= 1 || gg.OwnItemCount(c1, 9570) >= 1 || gg.OwnItemCount(c1, 10160) >= 1 || gg.OwnItemCount(c1, 9572) >= 1 || gg.OwnItemCount(c1, 10162) >= 1 || gg.OwnItemCount(c1, 10481) >= 1 || gg.OwnItemCount(c1, 10480) >= 1 || gg.OwnItemCount(c1, 10482) >= 1) {
myself.ShowSystemMessage(c1, 978);

} else {
myself.ShowSystemMessage(c1, 1264);

}

} else if (gg.OwnItemCount(c1, 4651) + gg.OwnItemCount(c1, 4652) + gg.OwnItemCount(c1, 4653) + gg.OwnItemCount(c1, 4654) + gg.OwnItemCount(c1, 4655) + gg.OwnItemCount(c1, 4656) + gg.OwnItemCount(c1, 4657) + gg.OwnItemCount(c1, 4658) + gg.OwnItemCount(c1, 4659) + gg.OwnItemCount(c1, 4660) + gg.OwnItemCount(c1, 4661) + gg.OwnItemCount(c1, 5579) + gg.OwnItemCount(c1, 5582) + gg.OwnItemCount(c1, 5914) + gg.OwnItemCount(c1, 4629) + gg.OwnItemCount(c1, 4630) + gg.OwnItemCount(c1, 4631) + gg.OwnItemCount(c1, 4632) + gg.OwnItemCount(c1, 4633) + gg.OwnItemCount(c1, 4634) + gg.OwnItemCount(c1, 4635) + gg.OwnItemCount(c1, 4636) + gg.OwnItemCount(c1, 4637) + gg.OwnItemCount(c1, 4638) + gg.OwnItemCount(c1, 4639) + gg.OwnItemCount(c1, 5577) + gg.OwnItemCount(c1, 5580) + gg.OwnItemCount(c1, 5908) + gg.OwnItemCount(c1, 4640) + gg.OwnItemCount(c1, 4641) + gg.OwnItemCount(c1, 4642) + gg.OwnItemCount(c1, 4643) + gg.OwnItemCount(c1, 4644) + gg.OwnItemCount(c1, 4645) + gg.OwnItemCount(c1, 4646) + gg.OwnItemCount(c1, 4647) + gg.OwnItemCount(c1, 4648) + gg.OwnItemCount(c1, 4649) + gg.OwnItemCount(c1, 4650) + gg.OwnItemCount(c1, 5578) + gg.OwnItemCount(c1, 5581) + gg.OwnItemCount(c1, 5911) + gg.OwnItemCount(c1, 9571) + gg.OwnItemCount(c1, 10161) + gg.OwnItemCount(c1, 9570) + gg.OwnItemCount(c1, 10160) + gg.OwnItemCount(c1, 9572) + gg.OwnItemCount(c1, 10162) + gg.OwnItemCount(c1, 10481) + gg.OwnItemCount(c1, 10482) + gg.OwnItemCount(c1, 10480) + gg.OwnItemCount(c1, 13072) + gg.OwnItemCount(c1, 13073) + gg.OwnItemCount(c1, 13071) + gg.OwnItemCount(c1, 15542) + gg.OwnItemCount(c1, 15543) + gg.OwnItemCount(c1, 15541) >= 2) {
myself.ShowSystemMessage(c1, 977);

} else {
myself.ShowSystemMessage(c1, 1265);

}

}

} else {
i3 = gg.Rand(1000);
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = gg.Party_GetCreature(c1, i0);
if (gg.HaveMemo(c0, 350) && myself.DistFromMe(c0) <= 1500) {
if (gg.OwnItemCount(c0, 4651) + gg.OwnItemCount(c0, 4652) + gg.OwnItemCount(c0, 4653) + gg.OwnItemCount(c0, 4654) + gg.OwnItemCount(c0, 4655) + gg.OwnItemCount(c0, 4656) + gg.OwnItemCount(c0, 4657) + gg.OwnItemCount(c0, 4658) + gg.OwnItemCount(c0, 4659) + gg.OwnItemCount(c0, 4660) + gg.OwnItemCount(c0, 4661) + gg.OwnItemCount(c0, 5579) + gg.OwnItemCount(c0, 5582) + gg.OwnItemCount(c0, 5914) + gg.OwnItemCount(c0, 4629) + gg.OwnItemCount(c0, 4630) + gg.OwnItemCount(c0, 4631) + gg.OwnItemCount(c0, 4632) + gg.OwnItemCount(c0, 4633) + gg.OwnItemCount(c0, 4634) + gg.OwnItemCount(c0, 4635) + gg.OwnItemCount(c0, 4636) + gg.OwnItemCount(c0, 4637) + gg.OwnItemCount(c0, 4638) + gg.OwnItemCount(c0, 4639) + gg.OwnItemCount(c0, 5577) + gg.OwnItemCount(c0, 5580) + gg.OwnItemCount(c0, 5908) + gg.OwnItemCount(c0, 4640) + gg.OwnItemCount(c0, 4641) + gg.OwnItemCount(c0, 4642) + gg.OwnItemCount(c0, 4643) + gg.OwnItemCount(c0, 4644) + gg.OwnItemCount(c0, 4645) + gg.OwnItemCount(c0, 4646) + gg.OwnItemCount(c0, 4647) + gg.OwnItemCount(c0, 4648) + gg.OwnItemCount(c0, 4649) + gg.OwnItemCount(c0, 4650) + gg.OwnItemCount(c0, 5578) + gg.OwnItemCount(c0, 5581) + gg.OwnItemCount(c0, 5911) + gg.OwnItemCount(c0, 9571) + gg.OwnItemCount(c0, 10161) + gg.OwnItemCount(c0, 9570) + gg.OwnItemCount(c0, 10160) + gg.OwnItemCount(c0, 9572) + gg.OwnItemCount(c0, 10162) + gg.OwnItemCount(c0, 10482) + gg.OwnItemCount(c0, 10481) + gg.OwnItemCount(c0, 10480) + gg.OwnItemCount(c0, 13072) + gg.OwnItemCount(c0, 13073) + gg.OwnItemCount(c0, 13071) + gg.OwnItemCount(c0, 15542) + gg.OwnItemCount(c0, 15543) + gg.OwnItemCount(c0, 15541) == 1) {
if (i3 < 2) {
if (gg.OwnItemCount(c0, 5914) == 1) {
myself.DeleteItem1(c0, 5914, 1);
myself.GiveItem1(c0, 9571, 1);
gg.AddLog(6, c0, 9571);
myself.SoundEffect(c0, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c0, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, c0.name, gg.IntToStr(14), "", "", ""));

} else if (gg.OwnItemCount(c0, 5911) == 1) {
myself.DeleteItem1(c0, 5911, 1);
myself.GiveItem1(c0, 9572, 1);
gg.AddLog(6, c0, 9572);
myself.SoundEffect(c0, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c0, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, c0.name, gg.IntToStr(14), "", "", ""));

} else if (gg.OwnItemCount(c0, 5908) == 1) {
myself.DeleteItem1(c0, 5908, 1);
myself.GiveItem1(c0, 9570, 1);
gg.AddLog(6, c0, 9570);
myself.SoundEffect(c0, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c0, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, c0.name, gg.IntToStr(14), "", "", ""));

} else if (gg.OwnItemCount(c0, 9571) >= 1 || gg.OwnItemCount(c0, 10161) >= 1 || gg.OwnItemCount(c0, 9570) >= 1 || gg.OwnItemCount(c0, 10160) >= 1 || gg.OwnItemCount(c0, 9572) >= 1 || gg.OwnItemCount(c0, 10162) >= 1 || gg.OwnItemCount(c0, 10481) >= 1 || gg.OwnItemCount(c0, 10480) >= 1 || gg.OwnItemCount(c0, 10482) >= 1) {

} else {
myself.ShowSystemMessage(c0, 1264);

}

} else if (gg.OwnItemCount(c0, 5914) == 1) {
myself.DeleteItem1(c0, 5914, 1);
myself.GiveItem1(c0, 10161, 1);
gg.AddLog(6, c0, 10161);
myself.SoundEffect(c0, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c0, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35054, c0.name, gg.IntToStr(14), "", "", ""));

} else if (gg.OwnItemCount(c0, 5911) == 1) {
myself.DeleteItem1(c0, 5911, 1);
myself.GiveItem1(c0, 10162, 1);
gg.AddLog(6, c0, 10162);
myself.SoundEffect(c0, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c0, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35056, c0.name, gg.IntToStr(14), "", "", ""));

} else if (gg.OwnItemCount(c0, 5908) == 1) {
myself.DeleteItem1(c0, 5908, 1);
myself.GiveItem1(c0, 10160, 1);
gg.AddLog(6, c0, 10160);
myself.SoundEffect(c0, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c0, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35055, c0.name, gg.IntToStr(14), "", "", ""));

} else if (gg.OwnItemCount(c0, 9571) >= 1 || gg.OwnItemCount(c0, 10161) >= 1 || gg.OwnItemCount(c0, 9570) >= 1 || gg.OwnItemCount(c0, 10160) >= 1 || gg.OwnItemCount(c0, 9572) >= 1 || gg.OwnItemCount(c0, 10162) >= 1 || gg.OwnItemCount(c0, 10481) >= 1 || gg.OwnItemCount(c0, 10480) >= 1 || gg.OwnItemCount(c0, 10482) >= 1) {

} else {
myself.ShowSystemMessage(c0, 1264);

}

} else if (gg.OwnItemCount(c0, 4651) + gg.OwnItemCount(c0, 4652) + gg.OwnItemCount(c0, 4653) + gg.OwnItemCount(c0, 4654) + gg.OwnItemCount(c0, 4655) + gg.OwnItemCount(c0, 4656) + gg.OwnItemCount(c0, 4657) + gg.OwnItemCount(c0, 4658) + gg.OwnItemCount(c0, 4659) + gg.OwnItemCount(c0, 4660) + gg.OwnItemCount(c0, 4661) + gg.OwnItemCount(c0, 5579) + gg.OwnItemCount(c0, 5582) + gg.OwnItemCount(c0, 5914) + gg.OwnItemCount(c0, 4629) + gg.OwnItemCount(c0, 4630) + gg.OwnItemCount(c0, 4631) + gg.OwnItemCount(c0, 4632) + gg.OwnItemCount(c0, 4633) + gg.OwnItemCount(c0, 4634) + gg.OwnItemCount(c0, 4635) + gg.OwnItemCount(c0, 4636) + gg.OwnItemCount(c0, 4637) + gg.OwnItemCount(c0, 4638) + gg.OwnItemCount(c0, 4639) + gg.OwnItemCount(c0, 5577) + gg.OwnItemCount(c0, 5580) + gg.OwnItemCount(c0, 5908) + gg.OwnItemCount(c0, 4640) + gg.OwnItemCount(c0, 4641) + gg.OwnItemCount(c0, 4642) + gg.OwnItemCount(c0, 4643) + gg.OwnItemCount(c0, 4644) + gg.OwnItemCount(c0, 4645) + gg.OwnItemCount(c0, 4646) + gg.OwnItemCount(c0, 4647) + gg.OwnItemCount(c0, 4648) + gg.OwnItemCount(c0, 4649) + gg.OwnItemCount(c0, 4650) + gg.OwnItemCount(c0, 5578) + gg.OwnItemCount(c0, 5581) + gg.OwnItemCount(c0, 5911) + gg.OwnItemCount(c0, 9571) + gg.OwnItemCount(c0, 10161) + gg.OwnItemCount(c0, 9570) + gg.OwnItemCount(c0, 10160) + gg.OwnItemCount(c0, 9572) + gg.OwnItemCount(c0, 10162) + gg.OwnItemCount(c0, 10481) + gg.OwnItemCount(c0, 10482) + gg.OwnItemCount(c0, 10480) + gg.OwnItemCount(c0, 13072) + gg.OwnItemCount(c0, 13073) + gg.OwnItemCount(c0, 13071) + gg.OwnItemCount(c0, 15542) + gg.OwnItemCount(c0, 15543) + gg.OwnItemCount(c0, 15541) >= 2) {
myself.ShowSystemMessage(c0, 977);

} else {
myself.ShowSystemMessage(c0, 1265);

}

}

}

}

}

}

} else if (script_event_arg1 == 13021) {
if (myself.i_quest2 == 1) {
myself.i_quest2 = 2;
myself.AddTimerEx(3003, 10 * 1000);

}

} else if (script_event_arg1 == 13023) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.c_ai3 = c0;
myself.LookItem(2000, 1, DropItem);

}
for (i1 = 0; i1 < myself.int_list.GetSize(); i1 = i1 + 1) {
c1 = gg.GetCreatureFromID(myself.int_list.Get(i1));
if (myself.IsNullCreature(c1) == 0) {
if (c1.instant_zone_id == myself.InstantZone_GetId()) {
if (gg.OwnItemCount(c1, DropItem) >= 1) {
myself.BroadcastScriptEventEx(13027, 0, gg.GetIndexFromCreature(myself.c_ai3), 3000);

}

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam maker0) {
if (timer_id == 1001) {
myself.i_ai0 = 0;

} else if (timer_id == 1002) {
myself.i_quest1 = 0;

} else if (timer_id == 1003) {
i0 = gg.Rand(100);
if (i0 > 88) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 152064, 141190, -12688, 7000, 1, 1, 0);
i1 = 1;

} else if (i0 > 76) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 151805, 142085, -12688, 0, 1, 2, 0);
i1 = 2;

} else if (i0 > 64) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 153584, 140349, -12688, 16384, 1, 3, 0);
i1 = 3;

} else if (i0 > 52) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 154435, 140601, -12688, 20480, 1, 4, 0);
i1 = 4;

} else if (i0 > 40) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 155084, 141214, -12688, 28672, 1, 5, 0);
i1 = 5;

} else if (i0 > 28) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 152704, 143600, -12688, 53248, 1, 6, 0);
i1 = 6;

} else if (i0 > 16) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 154448, 143584, -12688, 45056, 1, 7, 0);
i1 = 7;

} else {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 155312, 142080, -12688, 32768, 1, 8, 0);
i1 = 8;

}
if (i1 != 1) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 152064, 141190, -12688, 7000, 0, 1, 0);

}
if (i1 != 2) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 151805, 142085, -12688, 0, 0, 2, 0);

}
if (i1 != 3) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 153584, 140349, -12688, 16384, 0, 3, 0);

}
if (i1 != 4) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 154435, 140601, -12688, 20480, 0, 4, 0);

}
if (i1 != 5) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 155084, 141214, -12688, 28672, 0, 5, 0);

}
if (i1 != 6) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 152704, 143600, -12688, 53248, 0, 6, 0);

}
if (i1 != 7) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 154448, 143584, -12688, 45056, 0, 7, 0);

}
if (i1 != 8) {
myself.CreateOnePrivateEx(1029101, "barler_private_crystal_golem", 0, 0, 155312, 142080, -12688, 32768, 0, 8, 0);

}

} else if (timer_id == 1004) {
if (myself.i_ai4 == 1) {
myself.RemoveAllDesire();
if (myself.Skill_GetConsumeMP(selfbuff5) < myself.sm.mp && myself.Skill_GetConsumeHP(selfbuff5) < myself.sm.hp && myself.Skill_InReuseDelay(selfbuff5) == 0) {
myself.AddUseSkillDesire(myself.sm, selfbuff5, 1, 0, 1000000);

}
myself.AddTimerEx(1004, 33 * 1000);

}

} else if (timer_id == 1005) {
myself.SetVisible(0);

} else if (timer_id == 2001) {
if (myself.sm.hp >= myself.sm.max_hp * 0.400000) {
if (gg.Rand(100) <= myself.i_ai3) {
if (myself.Skill_GetConsumeMP(selfbuff4) < myself.sm.mp && myself.Skill_GetConsumeHP(selfbuff4) < myself.sm.hp && myself.Skill_InReuseDelay(selfbuff4) == 0) {
myself.AddUseSkillDesire(myself.sm, selfbuff4, 1, 0, 1000000);

}
myself.i_ai0 = 1;

}
myself.AddTimerEx(2001, 40 * 1000);

}

} else if (timer_id == 3001) {
if (myself.i_quest4 == 0) {
myself.CreateOnePrivateEx(1029100, "barler_private_demonic", 0, 0, 153565, 141290, -12736, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 1);
myself.CreateOnePrivateEx(1029100, "barler_private_demonic", 0, 0, 153570, 142853, -12736, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 2);
myself.CreateOnePrivateEx(1029100, "barler_private_demonic", 0, 0, 152793, 142080, -12736, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 3);
myself.CreateOnePrivateEx(1029100, "barler_private_demonic", 0, 0, 154359, 142077, -12736, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 4);
if (myself.i_ai3 != 0) {
myself.AddTimerEx(3001, myself.i_ai3 * 60 * 1000);

} else {
myself.AddTimerEx(3001, 3 * 60 * 1000);

}

}

} else if (timer_id == 3002) {
i5 = 0;
for (i4 = 1; i4 < myself.int_list.GetSize(); i4 = i4 + 1) {
if (i5 == 0) {
i5 = myself.int_list.Get(i4);

} else if (i5 == myself.int_list.Get(i4) && i5 != 0) {

} else {
myself.int_list.Clear();
myself.i_quest0 = 0;
myself.AddTimerEx(3009, 100);
return;

}

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i2 = party0.member_count;
i6 = myself.int_list.Get(0);
if (i2 != i6 || i6 == 0) {
myself.int_list.Clear();
myself.i_quest0 = 0;
myself.AddTimerEx(3009, 100);
return;

}
if (i2 == myself.i_quest0) {
myself.RemoveAllDesire();
myself.i_ai4 = 2;
myself.AddUseSkillDesire(myself.sm, 359137281, 1, 0, 1000000);
myself.Shout(gg.MakeFString(1800068, "", "", "", "", ""));
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.AddAttackDesire(myself.c_ai0, 1, attack_weight_value);

}

}
myself.i_quest0 = 0;
myself.int_list.Clear();

}

}

} else if (timer_id == 3003) {
myself.i_quest2 = 0;
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, gopcjail_makername);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else if (timer_id == 3004) {
myself.BroadcastScriptEvent(13029, 0, 3000);

} else if (timer_id == 4001) {

} else if (timer_id == 4002) {
myself.CreateOnePrivateEx(1029104, "barler_private_demonic_d", 0, 0, 153360, 141936, -12736, 8192, 0, 0, 0);
myself.CreateOnePrivateEx(1029104, "barler_private_demonic_d", 0, 0, 153312, 142048, -12736, 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029104, "barler_private_demonic_d", 0, 0, 153333, 142176, -12736, 61439, 0, 0, 0);
myself.AddTimerEx(4003, 2000);

} else if (timer_id == 4003) {
myself.CreateOnePrivateEx(1029104, "barler_private_demonic_d", 0, 0, 153727, 141875, -12736, 24500, 0, 0, 0);
myself.CreateOnePrivateEx(1029104, "barler_private_demonic_d", 0, 0, 153600, 141824, -12736, 16384, 0, 0, 0);
myself.CreateOnePrivateEx(1029104, "barler_private_demonic_d", 0, 0, 153472, 141840, -12736, 12288, 0, 0, 0);
myself.AddTimerEx(4004, 2000);

} else if (timer_id == 4004) {
myself.CreateOnePrivateEx(1029104, "barler_private_demonic_d", 0, 0, 153776, 142224, -12736, 40960, 0, 0, 0);
myself.CreateOnePrivateEx(1029104, "barler_private_demonic_d", 0, 0, 153824, 142112, -12736, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1029104, "barler_private_demonic_d", 0, 0, 153808, 141984, -12736, 28672, 0, 0, 0);
myself.AddTimerEx(4005, 2000);

} else if (timer_id == 4005) {
myself.CreateOnePrivateEx(1029104, "barler_private_demonic_d", 0, 0, 153424, 142288, -12736, 57344, 0, 0, 0);
myself.CreateOnePrivateEx(1029104, "barler_private_demonic_d", 0, 0, 153520, 142336, -12736, 49152, 0, 0, 0);
myself.CreateOnePrivateEx(1029104, "barler_private_demonic_d", 0, 0, 153666, 142312, -12736, 45055, 0, 0, 0);

} else if (timer_id == 4007) {
myself.BroadcastScriptEvent(13008, 0, 3000);

} else if (timer_id == 4008) {
if (myself.Skill_GetConsumeMP(354025473) < myself.sm.mp && myself.Skill_GetConsumeHP(354025473) < myself.sm.hp && myself.Skill_InReuseDelay(354025473) == 0) {
myself.AddUseSkillDesire(myself.sm, 354025473, 1, 0, 1000000);

}
myself.BroadcastScriptEvent(13022, 0, 1000);

} else if (timer_id == 3009) {
myself.int_list.Clear();
myself.int_list.Add(-1);
myself.LookNeighbor(2000);
myself.AddTimerEx(3009, 40 * 1000);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam c0, HandlerParam c1) {
if (skill_name_id == selfbuff4) {
i0 = gg.Rand(100);
if (i0 < 33) {
myself.Shout(gg.MakeFString(1800058, "", "", "", "", ""));

} else if (i0 < 66) {
myself.Shout(gg.MakeFString(1800059, "", "", "", "", ""));

} else {
myself.Shout(gg.MakeFString(1800060, "", "", "", "", ""));

}
myself.AddTimerEx(1001, 30 * 1000);
if (gg.Rand(100) < 50) {
myself.RandomizeAttackDesire();

}

} else if (skill_name_id == selfbuff5) {
myself.Shout(gg.MakeFString(1800067, "", "", "", "", ""));
i0 = gg.Rand(myself.int_list.GetSize());
c0 = gg.GetCreatureFromID(myself.int_list.Get(i0));
if (myself.IsNullCreature(c0) == 0) {
if (c0.instant_zone_id == myself.InstantZone_GetId() && c0 != myself.c_ai2) {
myself.AddAttackDesire(c0, 1, 10000);
return;

}

}
for (i1 = 0; i1 < myself.int_list.GetSize(); i1 = i1 + 1) {
c1 = gg.GetCreatureFromID(myself.int_list.Get(i1));
if (myself.IsNullCreature(c1) == 0) {
if (c1.instant_zone_id == myself.InstantZone_GetId() && c1 != myself.c_ai2) {
myself.AddAttackDesire(c1, 1, 10000);

}

}

}

} else if (skill_name_id == 342491137) {
i0 = gg.Rand(100);
if (i0 < 33) {
myself.Shout(gg.MakeFString(1800061, "", "", "", "", ""));

} else if (i0 < 66) {
myself.Shout(gg.MakeFString(1800062, "", "", "", "", ""));

} else {
myself.Shout(gg.MakeFString(1800063, "", "", "", "", ""));

}
if (myself.IsNullCreature(myself.c_ai2) == 0) {
myself.InstantTeleport(myself.c_ai2, 155097, 142934, -12704);
myself.RemoveAttackDesire(myself.c_ai2.id);

}

} else if (skill_name_id == 354025473) {

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 20);

}
	}

	protected void MY_DYING() {
if (myself.i_quest4 == 0) {
myself.CreateOnePrivateEx(1032279, "ai_telecube_balor", 0, 0, 153575, 142075, -12736, 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029116, "default_npc", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
myself.BroadcastScriptEvent(13030, 0, 5000);
myself.BroadcastScriptEvent(13013, 0, 5000);
if (myself.i_ai4 == 1) {
myself.AddUseSkillDesire(myself.sm, 359137281, 1, 0, 1000000);

}
myself.InstantZone_MarkRestriction();
myself.InstantZone_Finish(5);
super;
	}


}