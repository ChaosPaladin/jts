package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_a_seed_boss_helper extends default_npc {
	protected int max_desire = 10000000;
	protected int CurseOfTacrakhan = 435814401;
	protected int CurseOfDopagen = 435879937;
	protected int HPMPSKILL01_ID = 417857537;
	protected int HPMPSKILL02_ID = 417857538;
	protected int HPMPSKILL03_ID = 417857539;
	protected int HPMPSKILL04_ID = 417857540;
	protected int HPMPSKILL05_ID = 417857541;
	protected int HPMPSKILL06_ID = 417857542;
	protected int HPMPSKILL07_ID = 417857543;
	protected int HPMPSKILL08_ID = 417857544;
	protected int HPMPSKILL09_ID = 417857545;

	protected void CREATED(HandlerParam c0) {
c0 = gg.GetCreatureFromIndex(myself.sm.param3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 20091017, gg.GetIndexFromCreature(myself.sm));

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 20091021) {
myself.AddUseSkillDesire(gg.GetCreatureFromIndex(script_event_arg2), CurseOfTacrakhan, 0, 1, max_desire);

} else if (script_event_arg1 == 20091022) {
myself.AddUseSkillDesire(gg.GetCreatureFromIndex(script_event_arg2), CurseOfDopagen, 0, 1, max_desire);

} else if (script_event_arg1 == 20091025) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
i0 = gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(HPMPSKILL01_ID));
switch (i0) {
case -1: {
myself.AddUseSkillDesire(c0, HPMPSKILL01_ID, 0, 1, max_desire);
break;

}
case 1: {
myself.AddUseSkillDesire(c0, HPMPSKILL02_ID, 0, 1, max_desire);
break;

}
case 2: {
myself.AddUseSkillDesire(c0, HPMPSKILL03_ID, 0, 1, max_desire);
break;

}
case 3: {
myself.AddUseSkillDesire(c0, HPMPSKILL04_ID, 0, 1, max_desire);
break;

}
case 4: {
myself.AddUseSkillDesire(c0, HPMPSKILL05_ID, 0, 1, max_desire);
break;

}
case 5: {
myself.AddUseSkillDesire(c0, HPMPSKILL06_ID, 0, 1, max_desire * max_desire);
break;

}
case 6: {
myself.AddUseSkillDesire(c0, HPMPSKILL07_ID, 0, 1, max_desire * max_desire);
break;

}
case 7: {
myself.AddUseSkillDesire(c0, HPMPSKILL08_ID, 0, 1, max_desire * max_desire);
break;

}
case 8: {
myself.AddUseSkillDesire(c0, HPMPSKILL09_ID, 0, 1, max_desire * max_desire);
break;

}

}

}
	}

	protected void NO_DESIRE() {
if (myself.DistFromMe(myself.boss) > 500) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z));

}
if (myself.IsMyBossAlive()) {

} else {
myself.Despawn();

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 0) {
myself.Shout("x : " + myself.sm.x + " ");
myself.Shout("y : " + myself.sm.y + " ");
myself.Shout("z : " + myself.sm.z + " ");

}
	}


}