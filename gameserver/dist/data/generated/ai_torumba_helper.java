package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_torumba_helper extends default_npc {
	protected int POISON_SLASH1 = 419561473;
	protected int POISON_SLASH2 = 419561474;
	protected int POISON_SLASH3 = 419561475;
	protected int POISON_SLASH4 = 419561476;
	protected int POISON_SLASH5 = 419561477;
	protected int TORUMBA_CURSE = 419823617;
	protected int max_desire = 10000000;

	protected void CREATED(HandlerParam c0) {
c0 = gg.GetCreatureFromIndex(myself.sm.param3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 20091017, gg.GetIndexFromCreature(myself.sm));

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 20091018) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
i0 = gg.GetAbnormalLevel(gg.GetCreatureFromIndex(script_event_arg2), myself.Skill_GetAbnormalType(POISON_SLASH1));
switch (i0) {
case -1: {
myself.AddUseSkillDesire(c0, POISON_SLASH1, 0, 1, max_desire);
break;

}
case 11: {
myself.AddUseSkillDesire(c0, POISON_SLASH2, 0, 1, max_desire);
break;

}
case 12: {
myself.AddUseSkillDesire(c0, POISON_SLASH3, 0, 1, max_desire);
break;

}
case 13: {
myself.AddUseSkillDesire(c0, POISON_SLASH4, 0, 1, max_desire);
break;

}
case 14: {
myself.AddUseSkillDesire(c0, POISON_SLASH5, 0, 1, max_desire);
break;

}
case 15: {
myself.AddUseSkillDesire(c0, POISON_SLASH5, 0, 1, max_desire);
break;

}

}

} else if (script_event_arg1 == 20091020) {
if (myself.i_quest9) {
myself.Say("석화 신호 받음");

}
myself.AddUseSkillDesire(gg.GetCreatureFromIndex(script_event_arg2), 419823617, 0, 1, max_desire);

}
	}

	protected void NO_DESIRE() {
if (myself.DistFromMe(myself.boss) > 500) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z + 10));

}
if (myself.IsMyBossAlive()) {

} else {
myself.Despawn();

}
	}


}