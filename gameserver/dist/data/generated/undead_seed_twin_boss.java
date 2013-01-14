package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class undead_seed_twin_boss extends combat_monster {
	protected int pan_skill = 388759553;
	protected int donut_skill = 388956161;
	protected int pc_buff_skill = 388890625;
	protected int toggle_shield = 388694017;
	protected int boss_type = 0;
	protected int BadgeName = 13868;
	protected int BadgeNumber = 1;
	protected int my_weapon = 13868;
	protected int FieldCycle = 3;
	protected int FieldCycle_Quantity = 2500;
	protected int zone_type = 0;
	protected int babble_mode = 0;
	protected String my_maker = "";

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_ai5 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.AddTimerEx(1000, 3 * 1000);
myself.AddTimerEx(1001, 20 * 1000);
myself.AddTimerEx(1002, 20 * 1000);
myself.AddTimerEx(1003, 20 * 1000);
myself.AddTimerEx(1004, 20 * 1000);
myself.AddTimerEx(1005, 10 * 1000);
myself.AddTimerEx(1006, 60 * 1000);
myself.AddTimerEx(8001, 4 * 1000);
myself.AddTimerEx(8008, 10 * 1000);
myself.AddTimerEx(9903, 10 * 1000);
myself.SetMaxHateListSize(32);
	}

	protected void DEBUG_AI(HandlerParam reply, HandlerParam creature) {
if (reply == 1) {
myself.Whisper(creature, "myself.i_ai0 = " + myself.i_ai0 + ".");
myself.Whisper(creature, "myself.i_ai1 = " + myself.i_ai1 + ".");
myself.Whisper(creature, "myself.i_ai2 = " + myself.i_ai2 + ".");
myself.Whisper(creature, "myself.i_ai3 = " + myself.i_ai3 + ".");
myself.Whisper(creature, "myself.i_ai4 = " + myself.i_ai4 + ".");
myself.Whisper(creature, "myself.i_quest2 = " + myself.i_quest2 + ".");
myself.Whisper(creature, "myself.i_quest3 = " + myself.i_quest3 + ".");
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.Whisper(creature, "Distance = " + myself.DistFromMe(myself.c_ai0) + ".");

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.c_ai1 = attacker;
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;

}
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 1 && myself.i_ai2 == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(29622273)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(45547521)) > 0) {

} else {
myself.RemoveAllDesire();
myself.i_ai2 = 1;
myself.ChangeStatus(2);
myself.AddUseSkillDesire(myself.sm, 381616129, 1, 1, 10000000);
myself.AddTimerEx(2002, 60 * 1000);
if (babble_mode == 1) {
myself.Say("이제 죽음 상태, 소셜 나간다");

}

}

}
if (attacker.is_pc == 1) {
myself.AddHateInfo(attacker, gg.FloatToInt(damage * 1), 0, 1, 1);

} else if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 1) {
if (attacker.master.alive == 1) {
myself.AddHateInfo(attacker.master, gg.FloatToInt(damage * 1), 0, 1, 1);

} else if (attacker.master.alive == 0 && myself.i_ai2 == 0) {
myself.AddAttackDesire(attacker, 1, 100);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i10) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;

}
if (attacker.is_pc == 1) {
myself.AddHateInfo(attacker, 1, 0, 1, 1);

} else if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 1) {
if (attacker.master.alive == 1) {
if (babble_mode == 1) {
myself.Say("솬수한테 맞았습니다. 주인이 살아 있어 주인 헤이트값을 쌓습니다.");

}
myself.AddHateInfo(attacker, 2, 0, 1, 1);
myself.AddHateInfo(attacker.master, 1, 0, 1, 1);
i10 = myself.GetHateInfoCount();
if (babble_mode == 1) {
myself.Say("헤이트 인포에 있는 값들은 총 " + i10 + "개 입니다.");

}

} else if (attacker.master.alive == 0) {
myself.AddAttackDesire(attacker, 1, 100);

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == 381616129) {
myself.UnequipWeapon();
if (babble_mode == 1) {
myself.Say("죽음 소셜 완료");

}
myself.AddTimerEx(3000, 1 * 1000);
myself.AddTimerEx(2001, 10 * 1000);
if (gg.IsNull(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 989808, 0);

}

} else if (skill_name_id == 381681665) {
if (babble_mode == 1) {
myself.Say("일어나는 소셜 완료");

}
myself.EquipItem(my_weapon);
myself.ChangeStatus(3);
myself.i_ai2 = 0;
myself.AddTimerEx(3001, 2 * 1000);
if (gg.IsNull(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 98913, 0);

}
myself.i_ai2 = 0;

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0, HandlerParam i1) {
i0 = myself.Skill_GetEffectPoint(skill_name_id);
if (speller.is_pc == 1) {
if (i0 > 0) {
myself.AddHateInfo(speller, gg.FloatToInt(i0 * 1), 0, 1, 1);

} else if (i0 < 0) {
myself.AddHateInfo(speller, gg.FloatToInt(i0 * -1), 0, 1, 1);

}

} else if (speller.is_pc == 0 && myself.IsInCategory(12, speller.npc_class_id) == 1) {
if (i0 > 0) {
if (speller.master.alive == 1) {
myself.AddHateInfo(speller.master, gg.FloatToInt(i0 * 1), 0, 1, 1);

} else if (speller.master.alive == 0 && myself.i_ai2 == 0) {
myself.AddAttackDesire(speller, 1, 100);

}

} else if (i0 < 0) {
if (speller.master.alive == 1) {
myself.AddHateInfo(speller.master, gg.FloatToInt(i0 * -1), 0, 1, 1);

} else if (speller.master.alive == 0 && myself.i_ai2 == 0) {
myself.AddAttackDesire(speller, 1, 100);

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam party0, HandlerParam i0, HandlerParam c0, HandlerParam i12) {
if (myself.i_ai0 == 0) {
if (creature.is_pc == 1) {
myself.i_ai0 = 1;
if (myself.i_ai2 == 0) {
myself.AddAttackDesire(creature, 1, 10);

}
myself.AddHateInfo(creature, 10, 0, 1, 1);
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
for (i0 = 0; i0 < party0.member_count; i0 = i0 + 1) {
c0 = myself.GetMemberOfParty(party0, i0);
if (gg.IsNull(c0) == 0) {
if (c0.alive == 1) {
myself.AddHateInfo(c0, basic_hate, 0, 1, 1);

} else {
myself.AddHateInfo(c0, -100, 0, 0, 0);

}

}

}

}

}

} else if (myself.i_ai0 == 1) {
if (creature.is_pc == 1) {
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
for (i0 = 0; i0 < party0.member_count; i0 = i0 + 1) {
c0 = myself.GetMemberOfParty(party0, i0);
if (gg.IsNull(c0) == 0) {
myself.AddHateInfo(c0, basic_hate, 0, 1, 1);

}

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam h0, HandlerParam c0, HandlerParam c1, HandlerParam i10, HandlerParam i11, HandlerParam maker0) {
if (timer_id == 2002) {
if (myself.IsNullCreature(myself.c_ai0) == 1 && myself.i_ai2 == 1) {
myself.AddTimerEx(2001, 1000);
myself.i_ai3 = 1;

}

} else if (timer_id == 8001) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 3000);
if (myself.i_ai0 == 1) {
i10 = myself.GetHateInfoCount();
if (i10 > 0) {
for (i11 = 0; i11 < i10; i11 = i11 + 1) {
h0 = myself.GetHateInfoByIndex(i11);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 > 0) {

}

}

}
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0 && myself.i_ai2 == 0) {
i0 = gg.Rand(100);
if (Skill01_ID != 458752001 && i0 < Skill01_Probability) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(29622273)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(45547521)) > 0) {

} else if (Skill01_Target_Type == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, 500000);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(h0.creature, 1, 100);

}

} else if (Skill01_Target_Type == 1) {
if (myself.DistFromMe(h0.creature) < 200) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, 500000);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

} else if (Skill01_Target_Type == 2) {
i0 = myself.GetHateInfoCount();
if (i0 > 0) {
i1 = gg.Rand(i0);
h0 = myself.GetHateInfoByIndex(i1);

}
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, 500000);

} else {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
myself.RemoveAllAttackDesire();

}
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

}

} else if (Skill02_ID != 458752001 && i0 > Skill01_Probability && i0 < Skill01_Probability + Skill02_Probability) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(29622273)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(45547521)) > 0) {

} else if (Skill02_Target_Type == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, 500000);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(h0.creature, 1, 100);

}

} else if (Skill02_Target_Type == 1) {
if (myself.DistFromMe(h0.creature) < 200) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, 500000);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

} else if (Skill02_Target_Type == 2) {
i0 = myself.GetHateInfoCount();
if (i0 > 0) {
i1 = gg.Rand(i0);
h0 = myself.GetHateInfoByIndex(i1);

}
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 1, 500000);

} else {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
myself.RemoveAllAttackDesire();

}
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

}

} else if (Skill03_ID != 458752001 && i0 > Skill01_Probability + Skill02_Probability && i0 < Skill01_Probability + Skill02_Probability + Skill03_Probability) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(29622273)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(45547521)) > 0) {

} else if (Skill03_Target_Type == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, 500000);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(h0.creature, 1, 100);

}

} else if (Skill03_Target_Type == 1) {
if (myself.DistFromMe(h0.creature) < 200) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, 500000);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

} else if (Skill03_Target_Type == 2) {
i0 = myself.GetHateInfoCount();
if (i0 > 0) {
i1 = gg.Rand(i0);
h0 = myself.GetHateInfoByIndex(i1);

}
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill03_ID, 0, 1, 500000);

} else {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
myself.RemoveAllAttackDesire();

}
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

}

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

}
myself.AddTimerEx(8001, 4000 + gg.Rand(1000));

} else if (timer_id == 8008) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 3000);
myself.AddTimerEx(8008, 2 * 1000);

} else if (timer_id == 1000) {
myself.BroadcastScriptEvent(2, gg.GetIndexFromCreature(myself.sm), 2000);
myself.AddTimerEx(1000, 30 * 1000);

} else if (timer_id == 1001) {
if (myself.i_ai0 == 1 && myself.i_ai2 == 0) {
if (babble_mode == 1) {
myself.Say("이동 타이머! ");

}
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
i0 = gg.Rand(100);
if (i0 > 50) {
if (babble_mode == 1) {
myself.Say("이동! " + h0.creature.name);

}
i1 = gg.FloatToInt(h0.creature.x + gg.Rand(50));
i2 = gg.FloatToInt(h0.creature.y + gg.Rand(50));
i3 = gg.FloatToInt(h0.creature.z);
myself.AddMoveToDesire(i1, i2, i3, 100000000);

}

}

}
myself.AddTimerEx(1001, 20 + gg.Rand(5) * 1000);

} else if (timer_id == 1002) {
if (myself.i_ai0 == 1 && myself.i_ai2 == 0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
myself.AddUseSkillDesire(h0.creature, pan_skill, 0, 1, 5000000);

}

}
myself.AddTimerEx(1002, 10 + gg.Rand(5) * 1000);

} else if (timer_id == 1003) {
if (myself.i_ai0 == 1 && myself.i_ai2 == 0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
myself.AddUseSkillDesire(h0.creature, pc_buff_skill, 0, 1, 5000000);

}

}
myself.AddTimerEx(1003, 20 * 1000);

} else if (timer_id == 1004) {
if (myself.i_ai0 == 1 && myself.i_ai2 == 0) {
i0 = myself.GetHateInfoCount();
if (i0 > 0) {
i1 = gg.Rand(i0);
h0 = myself.GetHateInfoByIndex(i1);

}
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.DistFromMe(h0.creature) > 300) {
myself.AddUseSkillDesire(h0.creature, donut_skill, 0, 1, 5000000);
i0 = 0;

} else {
i0 = 1;

}

}

}
if (i0 == 1) {
myself.AddTimerEx(1004, 2 * 1000);

} else {
myself.AddTimerEx(1004, 15 + gg.Rand(10) * 1000);

}

} else if (timer_id == 1005) {
if (myself.i_ai0 == 1 && myself.i_ai2 == 0) {
if (gg.IsNull(myself.c_ai0) == 0) {
if (myself.DistFromMe(myself.c_ai0) > 500) {
if (babble_mode == 1) {
myself.Say("거리 500 이상 ");

}
myself.IsToggleSkillOnOff(myself.sm, 388694017);
if (myself.i_ai1 == 0) {
if (babble_mode == 1) {
myself.Say("꺼져 있네요. 킵니다.");

}
myself.AddTimerEx(1007, 1 * 1000);
myself.Say(gg.MakeFString(1800266, "", "", "", "", ""));

}

} else {
if (babble_mode == 1) {
myself.Say("거리 500 이하 ");

}
myself.IsToggleSkillOnOff(myself.sm, 388694017);
if (myself.i_ai1 == 1) {
if (babble_mode == 1) {
myself.Say("켜져 있네요. 끕니다.");

}
myself.AddTimerEx(1008, 1 * 1000);

}

}

} else {
if (babble_mode == 1) {
myself.Say("짝꿍 죽어서 없음");

}
myself.IsToggleSkillOnOff(myself.sm, 388694017);
if (myself.i_ai1 == 1) {
if (babble_mode == 1) {
myself.Say("짝꿍 죽었는데 켜져 있네요. 끕니다.");

}
myself.AddTimerEx(1008, 1 * 1000);

}

}

}
myself.AddTimerEx(1005, 10 * 1000);

} else if (timer_id == 1006) {
if (myself.i_ai0 == 1 && myself.i_ai2 == 0) {
if (myself.i_ai4 < 4) {
i4 = 1;
myself.i_ai4 = myself.i_ai4 + 1;

} else {
i4 = gg.Rand(2);

}
if (gg.IsNull(maker0) == 0) {
i0 = maker0.npc_count;
if (i0 < maker0.maximum_npc) {
if (zone_type == 0) {
for (i1 = 0; i1 < i4; i1 = i1 + 1) {
i0 = gg.Rand(6);
c0 = myself.c_ai1;
switch (i0) {
case 0: {
myself.CreateOnePrivateEx(1022509, "ai_is_silen_ravager", 0, 0, -173101, 218079, -9581, 0, gg.GetIndexFromCreature(myself.sm), 0, 0);
break;

}
case 1: {
myself.CreateOnePrivateEx(1022510, "ai_is_death_scout", 0, 0, -173312, 217536, -9581, 0, gg.GetIndexFromCreature(myself.sm), 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(1022511, "ai_is_silen_deciple", 0, 0, -173920, 217407, -9581, 0, gg.GetIndexFromCreature(myself.sm), 0, 0);
break;

}
case 3: {
myself.CreateOnePrivateEx(1022512, "ai_is_bone_creeper", 0, 0, -174289, 217734, -9580, 0, gg.GetIndexFromCreature(myself.sm), 0, 0);
break;

}
case 4: {
myself.CreateOnePrivateEx(1022513, "ai_is_corpse_shambler", 0, 0, -174263, 218422, -9579, 0, gg.GetIndexFromCreature(myself.sm), 0, 0);
break;

}
case 5: {
myself.CreateOnePrivateEx(1022514, "ai_is_soul_harvester", 0, 0, -173834, 218762, -9581, 0, gg.GetIndexFromCreature(myself.sm), 0, 0);
break;

}
case 6: {
myself.CreateOnePrivateEx(1022515, "ai_is_soul_wagon", 0, 0, -173300, 218594, -9581, 0, gg.GetIndexFromCreature(myself.sm), 0, 0);
break;

}

}

}

} else if (zone_type == 1) {
for (i1 = 0; i1 < i4; i1 = i1 + 1) {
i0 = gg.Rand(6);
c0 = myself.c_ai1;
switch (i0) {
case 0: {
myself.CreateOnePrivateEx(1022616, "ai_is_death_claw", 0, 0, -173101, 218079, -9581, 0, gg.GetIndexFromCreature(myself.sm), 0, 0);
break;

}
case 1: {
myself.CreateOnePrivateEx(1022616, "ai_is_death_claw", 0, 0, -173312, 217536, -9581, 0, gg.GetIndexFromCreature(myself.sm), 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(1022616, "ai_is_death_claw", 0, 0, -173920, 217407, -9581, 0, gg.GetIndexFromCreature(myself.sm), 0, 0);
break;

}
case 3: {
myself.CreateOnePrivateEx(1022616, "ai_is_death_claw", 0, 0, -174289, 217734, -9580, 0, gg.GetIndexFromCreature(myself.sm), 0, 0);
break;

}
case 4: {
myself.CreateOnePrivateEx(1022616, "ai_is_death_claw", 0, 0, -174263, 218422, -9579, 0, gg.GetIndexFromCreature(myself.sm), 0, 0);
break;

}
case 5: {
myself.CreateOnePrivateEx(1022616, "ai_is_death_claw", 0, 0, -173834, 218762, -9581, 0, gg.GetIndexFromCreature(myself.sm), 0, 0);
break;

}
case 6: {
myself.CreateOnePrivateEx(1022616, "ai_is_death_claw", 0, 0, -173300, 218594, -9581, 0, gg.GetIndexFromCreature(myself.sm), 0, 0);
break;

}

}

}

}

}

}

}
myself.AddTimerEx(1006, 60 * 1000);

} else if (timer_id == 2001) {
if (myself.i_ai3 == 1) {
myself.Suicide();
if (gg.IsNull(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 989808, 0);

}

} else {
if (myself.c_ai0.hp > gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) * 10) {
gg.SetNpcParam(myself.sm, 9, myself.c_ai0.hp - 10);
if (babble_mode == 1) {
myself.Say("짝꿍의 HP 가 10%보다 커서 짝꿍의 HP로 부활합니다.");

}

} else {
gg.SetNpcParam(myself.sm, 9, myself.sm.max_hp * 0.100000);
if (babble_mode == 1) {
myself.Say("짝꿍의 HP 가 10% 보다 작아서 10% 로 부활합니다.");

}

}
if (boss_type == 0) {
myself.Say(gg.MakeFString(1800267, "", "", "", "", ""));

} else if (boss_type == 1) {
myself.Say(gg.MakeFString(1800268, "", "", "", "", ""));

}
if (babble_mode == 1) {
myself.Say("HP는 " + myself.c_ai0.hp + " 이다");

}
myself.AddUseSkillDesire(myself.sm, 381681665, 1, 1, 11000000);
if (babble_mode == 1) {
myself.Say("짝꿍이 안죽어서 부활한다.");

}

}

} else if (timer_id == 3000) {

} else if (timer_id == 3001) {

} else if (timer_id == 8001) {
if (myself.i_ai0 == 1 && myself.i_ai2 == 0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
myself.AddAttackDesire(h0.creature, 1, 100);

}

}

} else if (timer_id == 9903) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.RemoveAllDesire();
myself.i_ai0 = 0;
myself.i_quest2 = myself.i_quest2 + 1;
myself.Shout(gg.MakeFString(1800754, "", "", "", "", ""));
myself.RemoveAllDesire();
myself.StopMove();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.RemoveAllHateInfoIF(0, 0);
myself.i_ai0 = 0;
gg.SetNpcParam(myself.sm, 9, myself.sm.max_hp);
if (babble_mode == 2) {
i10 = myself.GetHateInfoCount();
myself.Say("헤이트 인포에 있는 값들은 총 " + i10 + "개 입니다.");
if (i10 > 0) {
for (i11 = 0; i11 < i10; i11 = i11 + 1) {
h0 = myself.GetHateInfoByIndex(i11);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 > 0) {
myself.Say(h0.creature.name + " 의 헤이트 값은 " + h0.hate + " 입니다.");

}

}

}

}
if (myself.i_quest2 > 10) {
myself.Shout(gg.MakeFString(1800755, "", "", "", "", ""));
myself.InstantZone_Finish(1);

}
if (myself.i_ai1 == 1) {
myself.AddTimerEx(1008, 1 * 1000);

}

}
myself.AddTimerEx(9903, 10 * 1000);

} else if (timer_id == 1007) {
if (myself.i_ai1 == 0) {
myself.AddUseSkillDesire(myself.sm, toggle_shield, 1, 0, 5000000);

}

} else if (timer_id == 1008) {
if (myself.i_ai1 == 1) {
myself.AddUseSkillDesire(myself.sm, toggle_shield, 1, 0, 5000000);

}

}
	}

	protected void IS_TOGGLE_SKILL_ONOFF(HandlerParam target, HandlerParam i0) {
myself.i_ai1 = i0;
if (babble_mode == 1) {
myself.Say("토글 스킬 값 = " + i0 + ". ");

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 2) {
if (script_event_arg2 != gg.GetIndexFromCreature(myself.sm)) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);
if (babble_mode == 1) {
myself.Say("짝꿍 인식 완료.");

}

}

} else if (script_event_arg1 == 989808) {
if (babble_mode == 1) {
myself.Say("어? 짝꿍 죽었네");

}
myself.i_ai3 = 1;

} else if (script_event_arg1 == 98913) {
if (babble_mode == 1) {
myself.Say("어? 짝꿍 살아났다");

}
myself.i_ai3 = 0;

}
super;
	}

	protected void MY_DYING(HandlerParam c1, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
myself.InstantZone_MarkRestriction();
c1 = myself.c_ai1;
if (c1.master) {
c1 = c1.master;

}
i1 = gg.Party_GetCount(c1);
i2 = myself.InstantZone_GetId();
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = gg.Party_GetCreature(c1, i0);
if (c0.instant_zone_id == myself.sm.instant_zone_id) {
if (boss_type == 0) {
if (gg.OwnItemCount(c0, 13868) == 0 && gg.HaveMemo(c0, 10270) == 1 && gg.GetMemoState(c0, 10270) == 2) {
myself.GiveItem1(c0, BadgeName, BadgeNumber);
myself.SoundEffect(c0, "ItemSound.quest_itemget");

}

} else if (boss_type == 1) {
if (gg.OwnItemCount(c0, 13869) == 0 && gg.HaveMemo(c0, 10270) == 1 && gg.GetMemoState(c0, 10270) == 2) {
myself.GiveItem1(c0, BadgeName, BadgeNumber);
myself.SoundEffect(c0, "ItemSound.quest_itemget");

}

}

}

}
	}


}