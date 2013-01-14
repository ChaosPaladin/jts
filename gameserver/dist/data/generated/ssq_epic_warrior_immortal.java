package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_epic_warrior_immortal extends warrior_basic {
	protected String SuperPointName = "-1";
	protected int SuperPointMethod = 0;
	protected int SuperPointDesire = 2000;
	protected int IsAggressive = 0;
	protected double Aggressive_Time = 7.000000;
	protected int MovingAttack = 0;
	protected int MoveArounding = 0;
	protected int one_kill_skill = 458752001;

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id)) {
if (one_kill_skill == 458752001) {
myself.InstantTeleport(creature, 0, 0, 0);

} else {
myself.AddUseSkillDesire(creature, one_kill_skill, 0, 0, 1000000);

}

}
super;
	}


}