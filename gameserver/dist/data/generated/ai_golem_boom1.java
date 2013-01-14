package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_golem_boom1 extends default_npc {
	protected int Skill01_ID = 0;

	protected void CREATED() {
myself.i_ai9 = 0;
myself.i_ai8 = 0;
	}

	protected void NO_DESIRE(HandlerParam c0, HandlerParam i0) {
c0 = gg.GetCreatureFromID(myself.i_ai8);
if (myself.IsNullCreature(c0) == 0 && c0.alive == 1) {
if (myself.DistFromMe(c0) > 50 && myself.DistFromMe(c0) < 2000 && myself.sm.alive == 1) {
if (myself.i_ai9 == 1) {
myself.Say("가자!!");

}
myself.InstantTeleport(myself.sm, gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z));

} else if (myself.DistFromMe(c0) <= 50) {
if (myself.i_ai9 == 1) {
myself.Say("자폭!!");

}
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, 10000000000);

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam party0, HandlerParam c0, HandlerParam i0) {
myself.i_ai8 = attacker.id;
if (myself.DistFromMe(attacker) > 50 && myself.DistFromMe(attacker) < 2000 && myself.sm.alive == 1) {
if (myself.i_ai9 == 1) {
myself.Say("가자!!");

}
if (myself.GetPathfindFailCount() > 3) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));

} else {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));

}

} else if (myself.DistFromMe(attacker) <= 50 && attacker.alive == 1) {
if (myself.i_ai9 == 1) {
myself.Say("자폭!!");

}
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, 10000000000);

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam c0, HandlerParam i0) {
myself.i_ai8 = attacker.id;
if (myself.DistFromMe(attacker) > 50 && myself.DistFromMe(attacker) < 2000 && myself.sm.alive == 1) {
if (myself.i_ai9 == 1) {
myself.Say("가자!!");

}
if (myself.GetPathfindFailCount() > 3) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));

} else {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));

}

} else if (myself.DistFromMe(attacker) <= 50 && attacker.alive == 1) {
if (myself.i_ai9 == 1) {
myself.Say("자폭!!");

}
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, 10000000000);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
myself.i_ai8 = creature.id;
if (myself.DistFromMe(creature) > 50 && myself.DistFromMe(creature) < 2000 && myself.sm.alive == 1) {
if (myself.i_ai9 == 1) {
myself.Say("가자!!");

}
if (myself.GetPathfindFailCount() > 3) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(creature.x), gg.FloatToInt(creature.y), gg.FloatToInt(creature.z));

} else {
myself.InstantTeleport(myself.sm, gg.FloatToInt(creature.x), gg.FloatToInt(creature.y), gg.FloatToInt(creature.z));

}

} else if (myself.DistFromMe(creature) <= 50) {
if (myself.i_ai9 == 1) {
myself.Say("자폭!!");

}
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, 10000000000);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam c0) {
c0 = gg.GetCreatureFromID(myself.i_ai8);
if (myself.IsNullCreature(c0) == 0) {
if (myself.DistFromMe(c0) > 50 && myself.DistFromMe(c0) < 2000 && myself.sm.alive == 1) {
if (myself.i_ai9 == 1) {
myself.Say("가자!!");

}
myself.InstantTeleport(myself.sm, gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z));

} else if (myself.DistFromMe(c0) <= 50 && c0.alive == 1) {
if (myself.i_ai9 == 1) {
myself.Say("자폭!!");

}
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 1, 10000000000);

}

}
	}

	protected void DEBUG_AI(HandlerParam reply) {
myself.i_ai9 = reply;
	}


}