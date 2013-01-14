package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_raid_baranka_protector extends warrior_use_skill {
	protected int DeBuff = 458752001;
	protected int DeBuffProb = 2000;
	protected int debug_mode = 0;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (myself.IsNullCreature(attacker) == 0) {
if (gg.Rand(10000) < DeBuffProb) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

}

}

}
	}

	protected void NO_DESIRE() {
if (myself.IsMyBossAlive()) {
myself.AddFollowDesire(myself.boss, 5);

} else {
myself.Despawn();

}
	}

	protected void CLAN_ATTACKED(HandlerParam victim, HandlerParam attacker, HandlerParam damage) {
super;
if (victim == myself.boss) {
myself.MakeAttackEvent(attacker, 500, 0);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
super;
if (script_event_arg1 == 2214005) {
if (debug_mode) {
myself.Say("SCRIPT_EVNET : BARANKA_INIT!!");

}
myself.Despawn();

} else if (script_event_arg1 == 2214007) {
if (debug_mode) {
myself.Say("SCRIPT_EVENT : BARANKA_DIED!!");

}
myself.Despawn();

} else if (script_event_arg1 == 2214008) {
if (myself.IsMyBossAlive()) {
if (myself.boss == gg.GetCreatureFromIndex(script_event_arg2)) {
myself.MakeAttackEvent(gg.GetCreatureFromIndex(script_event_arg3), 500, 0);

}

}

}
	}


}