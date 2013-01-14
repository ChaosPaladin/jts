package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_birthday_cake_npc extends default_npc {
	protected void CREATED() {
myself.AddTimerEx(5001, 1000 * 60 * 20);
if (myself.sm.in_peacezone == 0) {
myself.AddTimerEx(5002, 1000 * 1);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam c0, HandlerParam party0) {
if (timer_id == 5001) {
myself.Despawn();

} else if (timer_id == 5002) {
c0 = myself.GetMasterUser();
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
if (myself.IsNullParty(party0) == 1) {
if (myself.Skill_GetConsumeMP(1444085761) < myself.sm.mp && myself.Skill_GetConsumeHP(1444085761) < myself.sm.hp && myself.Skill_InReuseDelay(1444085761) == 0) {
myself.AddUseSkillDesire(c0, 1444085761, 1, 1, 1000000);

}
return;

}
for (i0 = 0; i0 < party0.member_count; i0 = i0 + 1) {
gg.SetAsNull(c0);
c0 = myself.GetMemberOfParty(party0, i0);
if (myself.IsNullCreature(c0) == 0) {
if (myself.Skill_GetConsumeMP(1444085761) < myself.sm.mp && myself.Skill_GetConsumeHP(1444085761) < myself.sm.hp && myself.Skill_InReuseDelay(1444085761) == 0) {
myself.AddUseSkillDesire(c0, 1444085761, 1, 1, 1000000);

}

}

}
myself.AddTimerEx(5002, 1000 * 60);

}

}
super;
	}


}