package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_castle_pailaka_invader_basic extends default_npc {
	protected int String_Num1 = -1;
	protected int String_Num2 = -1;
	protected int String_Num3 = -1;
	protected int SelfBuff = 458752001;
	protected int DDSkill_01 = 458752001;
	protected int DDSkill_02 = 458752001;
	protected int DDSkill_01_Prob = 20;
	protected int DDSkill_02_Prob = 20;
	protected int Pos_X = 0;
	protected int Pos_Y = 0;
	protected int Pos_Z = 0;
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;

	protected void NO_DESIRE() {
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;

}
if (attacker.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(different_level_9_attacked)) == -1) {
if (different_level_9_attacked == 295895041) {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);
myself.RemoveAttackDesire(attacker.id);
return;

} else {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);

}

}

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0, HandlerParam c0, HandlerParam i1) {
if (speller.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(different_level_9_see_spelled)) == -1) {
if (different_level_9_see_spelled == 295895041) {
myself.CastBuffForQuestReward(speller, different_level_9_see_spelled);
myself.RemoveAttackDesire(speller.id);
return;

} else {
myself.CastBuffForQuestReward(speller, different_level_9_see_spelled);

}

}

}
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
if (desire > 0) {
myself.MakeAttackEvent(speller, desire * 10, 0);

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.MakeAttackEvent(attacker, damage / 10, 0);
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.MakeAttackEvent(myself.c_ai0, 100, 0);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;

}
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1) {
myself.MakeAttackEvent(creature, 200, 0);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam h0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 2117001) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddHateInfo(c0, 10, 0, 1, 1);

}
i0 = myself.GetHateInfoCount();
if (i0 == 4) {
i1 = gg.Rand(4);
h0 = myself.GetHateInfoByIndex(i1);
myself.c_ai0 = h0.creature;
if (myself.i_ai0 == 1) {
if (myself.DistFromMe(myself.c_ai0) <= 700) {
myself.MakeAttackEvent(myself.c_ai0, 1000, 0);

} else {
myself.MakeAttackEvent(myself.c_ai0, 500, 0);

}

}

}

}
	}


}