package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_mine_robber_summoner extends wizard_use_skill {
	protected int Skill01_ID = 458752001;
	protected int SelfBuff = 458752001;
	protected int SelfDeBuff1 = 458752001;
	protected int SelfDeBuff2 = 458752001;
	protected int private_spawn_sec = 10;
	protected int TIMER_PRIVATE_SPAWN = 33101;
	protected int TIMER_PRIVATE_DESIRE = 33102;
	protected int TIMER_ALL_RESET = 33103;
	protected int TIMER_MP_CHECK = 33104;
	protected int debug_mode = 0;
	protected String Privates1 = "";
	protected String Privates2 = "";
	protected double Aggressive_Time = 7.000000;

	protected void CREATED(HandlerParam maker0) {
super;
myself.i_ai5 = 0;
myself.i_ai6 = 1;
myself.i_ai7 = 0;
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
if (maker0.maximum_npc - maker0.npc_count >= 1) {
if (gg.Rand(2) == 0) {
myself.CreatePrivates(Privates1);

} else {
myself.CreatePrivates(Privates2);

}

}

} else if (debug_mode) {
if (gg.Rand(2) == 0) {
myself.CreatePrivates(Privates1);

} else {
myself.CreatePrivates(Privates2);

}

}
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 10000000);

}
	}

	protected void NO_DESIRE() {
if (myself.IsMyBossAlive()) {
myself.AddFollowDesire(myself.boss, 5);

} else {
myself.AddMoveAroundDesire(5, 5);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0) {
super;
if (myself.i_ai4 == 0) {
if (attacker.is_pc == 1) {
myself.AddHateInfo(attacker, gg.FloatToInt(damage), 0, 1, 1);

} else if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 1) {
if (attacker.master.alive == 1) {
myself.AddHateInfo(attacker.master, gg.FloatToInt(damage), 0, 1, 1);

}

}
if (myself.GetHateInfoCount() > 0) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (Skill01_ID != 458752001) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 1, 1000000);

}

}

}

}

}

}

} else if (myself.i_ai4 == 1) {
myself.AddAttackDesire(attacker, 1, damage);

}
if (myself.i_ai5 == 0) {
if (debug_mode) {
myself.Say("전투 시작!");

}
myself.i_ai5 = 1;
myself.AddTimerEx(TIMER_PRIVATE_DESIRE, 3 * 1000);
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.BroadcastScriptEventEx(2512001, gg.GetIndexFromCreature(myself.sm), gg.GetIndexFromCreature(h0.creature), 1500);

}

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam i0, HandlerParam f0, HandlerParam i1, HandlerParam c0) {
if (myself.i_ai4 == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) > myself.sm.mp || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
myself.RemoveAllDesire();
h0 = myself.GetMaxHateInfo(0);
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.i_ai4 = 1;
myself.AddTimerEx(TIMER_MP_CHECK, 10 * 1000);

} else {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
c0 = h0.creature;
if (Skill01_ID != 458752001) {
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(c0, Skill01_ID, 0, 1, 1000000);

}

}

}

}

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
super;
if (myself.GetLifeTime() >= Aggressive_Time) {
myself.MakeAttackEvent(creature, 100, 0);

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (private != myself.sm) {
if (myself.IsNullCreature(attacker) == 0) {
myself.MakeAttackEvent(attacker, damage, 0);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam h0) {
super;
if (timer_id == TIMER_PRIVATE_SPAWN) {
if (myself.i_ai7 == 0) {
i0 = gg.Rand(2) + 1;
if (i0 == 1) {
myself.CreatePrivates(Privates1);

} else if (i0 == 2) {
myself.CreatePrivates(Privates2);

}
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.BroadcastScriptEventEx(2512001, gg.GetIndexFromCreature(myself.sm), gg.GetIndexFromCreature(h0.creature), 1500);

}

}
myself.i_ai6 = myself.i_ai6 + 1;
if (debug_mode) {
myself.Say("PRIVATE_SPAWN! " + myself.i_ai6 + "마리째");

}
if (myself.i_ai6 == 3) {
myself.AddTimerEx(TIMER_ALL_RESET, 15 * 60 * 1000);

} else {
myself.AddTimerEx(TIMER_PRIVATE_SPAWN, private_spawn_sec * 1000);

}

} else if (myself.i_ai7 == 1) {
if (debug_mode) {
myself.Say("MY DYING 상태에서 쫄스폰 타이머.");

}

}

} else if (timer_id == TIMER_PRIVATE_DESIRE) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.BroadcastScriptEventEx(2512001, gg.GetIndexFromCreature(myself.sm), gg.GetIndexFromCreature(h0.creature), 1500);

}

}
myself.AddTimerEx(TIMER_PRIVATE_DESIRE, 3 * 1000);

} else if (timer_id == TIMER_ALL_RESET) {
myself.i_ai5 = 0;
myself.i_ai6 = 1;

} else if (timer_id == TIMER_MP_CHECK) {
if (myself.Skill_GetConsumeMP(Skill01_ID) > myself.sm.mp || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
myself.AddTimerEx(TIMER_MP_CHECK, 10 * 1000);

} else {
myself.RemoveAllDesire();
myself.i_ai4 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.MakeAttackEvent(h0.creature, 100, 0);

}

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1) {
super;
if (script_event_arg1 == 2512002) {
if (debug_mode) {
myself.Say("SCRIPT_EVENT : Private Died");

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(SelfDeBuff1)) > 0) {

} else if (myself.Skill_GetConsumeMP(SelfDeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfDeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfDeBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfDeBuff1, 1, 1, 1000000);

}

}
	}

	protected void MY_DYING() {
if (myself.i_ai7 == 0) {
myself.i_ai7 = 1;

}
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_level, HandlerParam skill_name_id, HandlerParam s0, HandlerParam i0) {
super;
if (skill_id == 6145 && skill_level == 0) {
if (myself.p_state != 3) {
if (debug_mode) {
myself.Say("전투중이 아닐 때 어스웜의 마기가 해제되었음. 재버프");

}
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 10000000);

}

}

}
	}


}