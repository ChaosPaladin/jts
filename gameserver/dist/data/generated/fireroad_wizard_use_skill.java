package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fireroad_wizard_use_skill extends wizard_use_skill {
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
super;
	}


}