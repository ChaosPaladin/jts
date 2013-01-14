package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_race_event extends warrior_physicalspecial {
	protected int stamp_item = 10013;

	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void ATTACKED(HandlerParam damage, HandlerParam attacker) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(343343109)) > 0) {
if (myself.DistFromMe(attacker) < 100 && gg.Rand(100) < 10) {
if (gg.OwnItemCount(attacker, stamp_item) == 0 && myself.i_ai0 == 0) {
myself.GiveItem1(attacker, stamp_item, 1);
myself.i_ai0 = 1;
myself.AddTimerEx(2001, 30 * 60 * 1000);

} else if (gg.OwnItemCount(attacker, stamp_item) == 1 && myself.i_ai0 == 0) {
myself.GiveItem1(attacker, stamp_item, 1);
myself.i_ai0 = 2;
myself.AddTimerEx(2001, 30 * 60 * 1000);

} else if (gg.OwnItemCount(attacker, stamp_item) == 2 && myself.i_ai0 == 0) {
myself.GiveItem1(attacker, stamp_item, 1);
myself.i_ai0 = 3;
myself.AddTimerEx(2001, 30 * 60 * 1000);

} else if (gg.OwnItemCount(attacker, stamp_item) == 3 && myself.i_ai0 == 0) {
myself.GiveItem1(attacker, stamp_item, 1);
myself.i_ai0 = 4;
myself.AddTimerEx(2001, 30 * 60 * 1000);

}

}

} else {
myself.AddUseSkillDesire(attacker, 300023809, 0, 1, 1000000);
myself.Say(gg.MakeFString(1800107, "", "", "", "", ""));

}
	}

	protected void CLAN_ATTACKED(HandlerParam damage, HandlerParam attacker) {
	}

	protected void NO_DESIRE() {
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
myself.i_ai0 = 0;

}
	}


}