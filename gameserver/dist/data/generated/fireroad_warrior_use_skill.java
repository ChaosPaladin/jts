package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fireroad_warrior_use_skill extends warrior_use_skill {
	protected void ATTACKED(HandlerParam damage, HandlerParam attacker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam c0, HandlerParam party0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
i3 = 0;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343105)) > 0 || gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343106)) > 0 || gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343107)) > 0 || gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343108)) > 0) {
i3 = i3 + 1;

}

}

}
if (i3 == 0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (c0.instant_zone_id == myself.InstantZone_GetId()) {
myself.InstantZone_Leave(c0);

}

}

}

}

}
if (Skill01_ID == 302383114) {
myself.AddMoveToDesire(gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z), 300000);
return;

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam damage, HandlerParam attacker, HandlerParam victim, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam c0, HandlerParam party0) {
if (Skill01_ID == 302383114) {
myself.AddMoveToDesire(gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z), 300000);
return;

}
super;
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, 1000000);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == 302383114) {
myself.Despawn();

}
super;
	}


}