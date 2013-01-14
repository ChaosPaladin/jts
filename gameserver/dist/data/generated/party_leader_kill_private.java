package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_kill_private extends party_leader {
	protected int DDMagic = 264241164;
	protected int SelfBuff = 263979009;
	protected int RespawnTime = 2;
	protected int KillPrivateHPRatio = 50;

	protected void CREATED(HandlerParam c0) {
myself.i_ai0 = 0;
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (private != myself.sm) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(SelfBuff)) <= 0 && gg.FloatToInt(private.hp / private.max_hp * 100) <= KillPrivateHPRatio && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(private, DDMagic, 0, 1, 1000000);

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == DDMagic) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm && private.respawn_time != 0) {
if (myself.i_ai0 == 1) {
myself.i_ai0 = 0;
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, RespawnTime);

} else {
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, private.respawn_time);

}

}
	}


}