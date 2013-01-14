package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_pet_for_pc extends default_npc {
	protected int Buff1 = 264110083;
	protected int Buff2 = 264110083;
	protected int Buff3 = 264110083;
	protected int Buff4 = 264110083;
	protected int Buff5 = 264110083;
	protected int DeBuff1 = 264568833;
	protected int DeBuff2 = 264568833;
	protected int Heal = 263782401;
	protected int FeedID = 57;
	protected int ConsumeFeedNum = 1;
	protected int TakeSocial = 0;

	protected void CREATED(HandlerParam i0, HandlerParam pledge0, HandlerParam c0) {
if (myself.sm.param2 == 2188) {
myself.i_ai3 = 6643;

} else {
myself.i_ai3 = 6644;

}
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (myself.IsNullCreature(myself.c_ai0) != 0) {
return;

}
if (gg.Rand(100) < 5) {
i0 = gg.Rand(Rand - 2024 + 1);
i0 = i0 + 2024;
myself.Say(gg.MakeFString(i0, myself.c_ai0.name, "", "", "", ""));

}
myself.AddTimerEx(2001, 5000);
if (gg.HaveMemo(myself.c_ai0, 20)) {
if (gg.Rand(100) <= 5 && gg.OwnItemCount(myself.c_ai0, 7185) == 0) {
myself.GiveItem1(myself.c_ai0, 7185, 1);
myself.SetFlagJournal(myself.c_ai0, 20, 2);

}

}
c0 = myself.Pledge_GetLeader(myself.c_ai0);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 655)) {
if (gg.OwnItemCount(c0, 8084) < 10 && myself.DistFromMe(c0) < 2000) {
if (myself.GetPledgeSkillLevel(myself.c_ai0) >= 4) {
myself.GiveItem1(c0, 8084, 1);

}
if (gg.OwnItemCount(c0, 8084) >= 9) {
myself.SetFlagJournal(c0, 655, 2);
myself.ShowQuestMark(c0, 655);
myself.SoundEffect(c0, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c0, "ItemSound.quest_itemget");

}

}

}

}
myself.i_ai1 = myself.GetCurrentTick();
myself.BroadcastScriptEventEx(10022, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai1, 1500);
myself.AddTimerEx(2002, 15000);
myself.AddTimerEx(2003, 60 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 2001) {
if (myself.sm.alive != 0) {
i0 = 5;
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(Buff1)) <= 0) {
i0 = i0 - 1;

}
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(Buff2)) <= 0) {
i0 = i0 - 1;

}
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(Buff3)) <= 0) {
i0 = i0 - 1;

}
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(Buff4)) <= 0) {
i0 = i0 - 1;

}
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(Buff5)) <= 0) {
i0 = i0 - 1;

}
if (myself.IsNullCreature(myself.c_ai0) != 0) {
return;

}
if (i0 < 3) {
i1 = gg.Rand(100);
if (i1 < 20) {
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(Buff1)) <= 0) {
if (myself.Skill_GetConsumeMP(Buff1) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff1) < myself.sm.hp && myself.Skill_InReuseDelay(Buff1) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, Buff1, 1, 1, 1000000);

}

}

} else if (i1 < 40) {
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(Buff2)) <= 0) {
if (myself.Skill_GetConsumeMP(Buff2) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff2) < myself.sm.hp && myself.Skill_InReuseDelay(Buff2) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, Buff2, 1, 1, 1000000);

}

}

} else if (i1 < 60) {
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(Buff3)) <= 0) {
if (myself.Skill_GetConsumeMP(Buff3) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff3) < myself.sm.hp && myself.Skill_InReuseDelay(Buff3) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, Buff3, 1, 1, 1000000);

}

}

} else if (i1 < 80) {
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(Buff4)) <= 0) {
if (myself.Skill_GetConsumeMP(Buff4) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff4) < myself.sm.hp && myself.Skill_InReuseDelay(Buff4) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, Buff4, 1, 1, 1000000);

}

}

} else if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(Buff5)) <= 0) {
if (myself.Skill_GetConsumeMP(Buff5) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff5) < myself.sm.hp && myself.Skill_InReuseDelay(Buff5) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, Buff5, 1, 1, 1000000);

}

}

}

}
myself.BroadcastScriptEvent(10017, gg.GetIndexFromCreature(myself.sm), 700);
if (myself.DistFromMe(myself.c_ai0) > 2000) {
myself.Despawn();

}
myself.AddTimerEx(2001, 5000);

}
if (timer_id == 2002) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.BroadcastScriptEventEx(10022, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai1, 500);

}
myself.AddTimerEx(2002, 15000);

}
if (timer_id == 2003) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (gg.OwnItemCount(myself.c_ai0, myself.i_ai3) >= ConsumeFeedNum && myself.c_ai0.alive == 1) {
myself.DeleteItem1(myself.c_ai0, myself.i_ai3, ConsumeFeedNum);
if (TakeSocial != 0) {
myself.AddEffectActionDesire(myself.sm, 1, TakeSocial * 1000 / 30, 200);

}
i0 = gg.Rand(Rand - 2029 + 1);
i0 = i0 + 2029;
myself.Say(gg.MakeFString(i0, "", "", "", "", ""));

} else {
myself.Despawn();

}

}
myself.AddTimerEx(2003, 60 * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0) {
if (script_event_arg1 == 10022) {
if (myself.IsNullCreature(myself.c_ai0) != 0) {
return;

}
i0 = gg.GetIndexFromCreature(myself.c_ai0);
if (script_event_arg2 == i0) {
if (script_event_arg3 > myself.i_ai1) {
myself.Despawn();

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam i0) {
i0 = 2;
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(DeBuff1)) <= 0) {
i0 = i0 - 1;

}
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(DeBuff2)) <= 0) {
i0 = i0 - 1;

}
if (i0 < 1 && gg.FloatToInt(victim.hp / victim.max_hp * 100) >= 80) {
if (gg.Rand(100) < 33) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(DeBuff1)) <= 0) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(victim, DeBuff1, 0, 1, 1000000);

}

}

}
if (gg.Rand(100) < 33) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(DeBuff2)) <= 0) {
if (myself.Skill_GetConsumeMP(DeBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff2) == 0) {
myself.AddUseSkillDesire(victim, DeBuff2, 0, 1, 1000000);

}

}

}

}
if (myself.IsNullCreature(myself.c_ai0) != 0) {
return;

}
if (myself.IsInCategory(0, myself.c_ai0.occupation)) {
if (myself.c_ai0.hp < myself.c_ai0.max_hp * 0.250000) {
if (gg.Rand(100) < 40) {
if (myself.Skill_GetConsumeMP(Heal) < myself.sm.mp && myself.Skill_GetConsumeHP(Heal) < myself.sm.hp && myself.Skill_InReuseDelay(Heal) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, Heal, 1, 1, 1000000);

}

}

} else if (myself.c_ai0.hp < myself.c_ai0.max_hp * 0.500000) {
if (gg.Rand(100) < 20) {
if (myself.Skill_GetConsumeMP(Heal) < myself.sm.mp && myself.Skill_GetConsumeHP(Heal) < myself.sm.hp && myself.Skill_InReuseDelay(Heal) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, Heal, 1, 1, 1000000);

}

}

}

} else if (myself.IsInCategory(1, myself.c_ai0.occupation) || myself.IsInCategory(2, myself.c_ai0.occupation) || myself.IsInCategory(3, myself.c_ai0.occupation)) {
if (myself.c_ai0.mp < myself.c_ai0.max_mp * 0.250000) {
if (gg.Rand(100) < 40) {
if (myself.Skill_GetConsumeMP(Heal) < myself.sm.mp && myself.Skill_GetConsumeHP(Heal) < myself.sm.hp && myself.Skill_InReuseDelay(Heal) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, Heal, 1, 1, 1000000);

}

}

} else if (myself.c_ai0.mp < myself.c_ai0.max_mp * 0.500000) {
if (gg.Rand(100) < 20) {
if (myself.Skill_GetConsumeMP(Heal) < myself.sm.mp && myself.Skill_GetConsumeHP(Heal) < myself.sm.hp && myself.Skill_InReuseDelay(Heal) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, Heal, 1, 1, 1000000);

}

}

}

}
	}

	protected void NO_DESIRE() {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.AddMoveToTargetDesire(myself.c_ai0.id, 150, 0, 10000);

}
	}


}