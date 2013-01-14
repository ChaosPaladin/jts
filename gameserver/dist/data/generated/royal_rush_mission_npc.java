package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_mission_npc extends default_npc {
	protected int KeyBox = 1020130;
	protected int KeyBox_X = 0;
	protected int KeyBox_Y = 0;
	protected int KeyBox_Z = 0;
	protected int StrongNPC = 1020130;
	protected String StrongNPC_AI = "royal_rush_strong_man_1";
	protected int MobHate = 262209537;

	protected void CREATED() {
myself.AddTimerEx(3000, 1000 * 60 * 5);
myself.AddTimerEx(3001, 1000 * 5);
myself.LookNeighbor(300);
myself.i_ai0 = 0;
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(5, 5);
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0) {
if (creature.is_pc == 0) {
if (gg.Rand(100) < 80) {
gg.SendScriptEvent(creature, 1234, gg.GetIndexFromCreature(myself.sm));

}

} else {
myself.AddFollowDesire(creature, 100);
if (myself.i_ai0 == 0) {
myself.Say(gg.MakeFString(1010483, creature.name, "", "", "", ""));

} else {
i0 = gg.Rand(4);
switch (i0) {
case 0: {
if (myself.Skill_GetConsumeMP(287309825) < myself.sm.mp && myself.Skill_GetConsumeHP(287309825) < myself.sm.hp && myself.Skill_InReuseDelay(287309825) == 0) {
myself.AddUseSkillDesire(creature, 287309825, 0, 1, 1000000);

}
break;

}
case 1: {
if (myself.Skill_GetConsumeMP(287375361) < myself.sm.mp && myself.Skill_GetConsumeHP(287375361) < myself.sm.hp && myself.Skill_InReuseDelay(287375361) == 0) {
myself.AddUseSkillDesire(creature, 287375361, 0, 1, 1000000);

}
break;

}
case 2: {
if (myself.Skill_GetConsumeMP(287440897) < myself.sm.mp && myself.Skill_GetConsumeHP(287440897) < myself.sm.hp && myself.Skill_InReuseDelay(287440897) == 0) {
myself.AddUseSkillDesire(creature, 287440897, 0, 1, 1000000);

}
break;

}
case 3: {
if (myself.Skill_GetConsumeMP(287506433) < myself.sm.mp && myself.Skill_GetConsumeHP(287506433) < myself.sm.hp && myself.Skill_InReuseDelay(287506433) == 0) {
myself.AddUseSkillDesire(creature, 287506433, 0, 1, 1000000);

}
break;

}

}

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.AddFleeDesire(attacker, 100);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3000) {
if (myself.sm.alive == 1) {
if (KeyBox_X != 0 && KeyBox_Y != 0 && KeyBox_Z != 0) {
myself.CreateOnePrivateEx(KeyBox, "royal_rush_keybox", 0, 0, gg.FloatToInt(KeyBox_X), gg.FloatToInt(KeyBox_Y), gg.FloatToInt(KeyBox_Z), 0, 0, 0, 0);
myself.i_ai0 = 1;

} else {
myself.CreateOnePrivateEx(KeyBox, "royal_rush_keybox", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.i_ai0 = 1;

}
myself.Say(gg.MakeFString(1000503, "", "", "", "", ""));
myself.LookNeighbor(300);

}

}
if (timer_id == 3001) {
myself.LookNeighbor(300);
myself.AddTimerEx(3001, 1000 * 5);
if (myself.i_ai0 == 0) {
myself.Say(gg.MakeFString(1010484, "", "", "", "", ""));

}

}
	}

	protected void MY_DYING() {
if (myself.i_ai0 == 0) {
myself.CreateOnePrivateEx(StrongNPC, StrongNPC_AI, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
	}


}