package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_43_normal_private extends default_npc {
	protected int fake_heal = 266403841;
	protected int real_heal = 275841030;

	protected void CREATED() {
myself.AddTimerEx(1001, 8 * 1000);
myself.AddTimerEx(1002, 40 * 1000);
myself.i_ai1 = 0;
super;
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(2, 5);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam party0, HandlerParam h0) {
if (timer_id == 1001) {
myself.AddUseSkillDesire(myself.boss, fake_heal, 0, 1, 9999999999999999);
myself.AddTimerEx(1001, 8 * 1000);

} else if (timer_id == 1002) {
myself.Say(gg.MakeFString(1800181, "", "", "", "", ""));
myself.AddTimerEx(1003, 5 * 1000);

} else if (timer_id == 1003) {
myself.RemoveAllDesire();
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {

} else {
myself.AddUseSkillDesire(myself.boss, real_heal, 0, 1, 999999999999999999);

}
myself.AddTimerEx(1002, 30 * 1000);

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private == myself.boss) {
myself.Despawn();

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 4) {
myself.Despawn();

}
	}


}