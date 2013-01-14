package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class default_npc extends abstract_npc {
	protected int DesirePqSize = 50;
	protected int FavorListSize = 30;
	protected double IdleDesire_DecayRatio = 0.000000;
	protected double MoveAround_DecayRatio = 0.000000;
	protected double DoNothing_DecayRatio = 0.000000;
	protected double Attack_DecayRatio = 0.000000;
	protected double Chase_DecayRatio = 0.000000;
	protected double Flee_DecayRatio = 0.000000;
	protected double GetItem_DecayRatio = 0.000000;
	protected double Follow_DecayRatio = 0.000000;
	protected double Decaying_DecayRatio = 0.000000;
	protected double MoveToWayPoint_DecayRatio = 0.000000;
	protected double UseSkill_DecayRatio = 0.000000;
	protected double MoveTo_DecayRatio = 0.000000;
	protected double EffectAction_DecayRatio = 0.000000;
	protected double MoveToTarget_DecayRatio = 0.000000;
	protected double IdleDesire_BoostValue = 0.000000;
	protected double MoveAround_BoostValue = 0.000000;
	protected double DoNothing_BoostValue = 0.000000;
	protected double Attack_BoostValue = 0.000000;
	protected double Chase_BoostValue = 0.000000;
	protected double Flee_BoostValue = 0.000000;
	protected double GetItem_BoostValue = 0.000000;
	protected double Follow_BoostValue = 0.000000;
	protected double Decaying_BoostValue = 0.000000;
	protected double MoveToWayPoint_BoostValue = 0.000000;
	protected double UseSkill_BoostValue = 0.000000;
	protected double MoveTo_BoostValue = 0.000000;
	protected double EffectAction_BoostValue = 0.000000;
	protected double MoveToTarget_BoostValue = 0.000000;
	protected int Dispel_Debuff = 0;
	protected int Dispel_Debuff_Prob = 0;

	protected void NO_DESIRE() {
	}

	protected void TALK_SELECTED(HandlerParam talker) {
myself.ShowPage(talker, "noquest.htm");
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 101) {
myself.Whisper(creature, "** Direction : " + myself.GetDirectionToTarget(creature) * 182 + "  ");

}
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_level, HandlerParam skill_name_id, HandlerParam s0, HandlerParam i0) {
if (Dispel_Debuff == 1) {
if (skill_level > 0) {
if (myself.Skill_GetAbnormalType(6029313) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(6029313)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(6029313));

} else if (myself.Skill_GetAbnormalType(91357185) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(91357185)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(91357185));

} else if (myself.Skill_GetAbnormalType(18284545) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(18284545)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(18284545));

} else if (myself.Skill_GetAbnormalType(24051713) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(24051713)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(24051713));

} else if (myself.Skill_GetAbnormalType(76611585) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(76611585)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(76611585));

} else if (myself.Skill_GetAbnormalType(78708737) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(78708737));

} else if (myself.Skill_GetAbnormalType(26411009) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(26411009)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(26411009));

}

}

} else if (Dispel_Debuff == 2) {
if (skill_level > 0) {
if (myself.Skill_GetAbnormalType(6029313) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(6029313)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(6029313));

}

} else if (myself.Skill_GetAbnormalType(91357185) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(91357185)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(91357185));

}

} else if (myself.Skill_GetAbnormalType(18284545) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(18284545)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(18284545));

}

} else if (myself.Skill_GetAbnormalType(24051713) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(24051713)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(24051713));

}

} else if (myself.Skill_GetAbnormalType(76611585) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(76611585)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(76611585));

}

} else if (myself.Skill_GetAbnormalType(78708737) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(78708737));

}

} else if (myself.Skill_GetAbnormalType(26411009) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(26411009)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(26411009));

}

}

}

}
	}


}