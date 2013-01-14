package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_treasure_box extends default_npc {
	protected int CreviceOfDiminsion = 0;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
if (CreviceOfDiminsion != 0) {
if (myself.InMyTerritory(attacker) == 0) {
myself.RemoveAttackDesire(attacker.id);
return;

}

}
if (skill_name_id / 256 * 256 == 27) {
i1 = skill_name_id & 255;
if (i1 == 1) {
i0 = 98;

} else if (i1 == 2) {
i0 = 84;

} else if (i1 == 3) {
i0 = 99;

} else if (i1 == 4) {
i0 = 84;

} else if (i1 == 5) {
i0 = 88;

} else if (i1 == 6) {
i0 = 90;

} else if (i1 == 7) {
i0 = 89;

} else if (i1 == 8) {
i0 = 88;

} else if (i1 == 9) {
i0 = 86;

} else if (i1 == 10) {
i0 = 90;

} else if (i1 == 11) {
i0 = 87;

} else if (i1 == 12) {
i0 = 89;

} else if (i1 == 13) {
i0 = 89;

} else if (i1 == 14) {
i0 = 89;

} else if (i1 == 15) {
i0 = 89;

}
i2 = i0 - myself.sm.level - i1 * 4 - 16 * 6;
if (i2 > i0) {
i2 = i0;

}

} else if (skill_name_id / 256 * 256 == 2065) {
i1 = skill_name_id & 255;
i2 = gg.FloatToInt(FloatToInt - myself.sm.level - i1 - 1 * 10 * 1.500000);
if (i2 > 60) {
i2 = 60;

}

} else if (skill_name_id / 256 * 256 == 2229) {
i1 = skill_name_id & 255;
if (i1 == 1) {
i3 = myself.sm.level - 19;
if (i3 <= 0) {
i2 = 100;

} else {
i2 = gg.FloatToInt(0.000200 * i3 * i3 - 0.026400 * i3 + 0.769500 * 100);

}

} else if (i1 == 2) {
i3 = myself.sm.level - 29;
if (i3 <= 0) {
i2 = 100;

} else {
i2 = gg.FloatToInt(0.000300 * i3 * i3 - 0.027900 * i3 + 0.756800 * 100);

}

} else if (i1 == 3) {
i3 = myself.sm.level - 39;
if (i3 <= 0) {
i2 = 100;

} else {
i2 = gg.FloatToInt(0.000300 * i3 * i3 - 0.026900 * i3 + 0.733400 * 100);

}

} else if (i1 == 4) {
i3 = myself.sm.level - 49;
if (i3 <= 0) {
i2 = 100;

} else {
i2 = gg.FloatToInt(0.000300 * i3 * i3 - 0.028400 * i3 + 0.803400 * 100);

}

} else if (i1 == 5) {
i3 = myself.sm.level - 59;
if (i3 <= 0) {
i2 = 100;

} else {
i2 = gg.FloatToInt(0.000500 * i3 * i3 - 0.035600 * i3 + 0.906500 * 100);

}

} else if (i1 == 6) {
i3 = myself.sm.level - 69;
if (i3 <= 0) {
i2 = 100;

} else {
i2 = gg.FloatToInt(0.000900 * i3 * i3 - 0.037300 * i3 + 0.857200 * 100);

}

} else if (i1 == 7) {
i3 = myself.sm.level - 79;
if (i3 <= 0) {
i2 = 100;

} else {
i2 = gg.FloatToInt(0.004300 * i3 * i3 - 0.067100 * i3 + 0.959300 * 100);

}

} else if (i1 == 8) {
i2 = 100;

}

} else {
i0 = myself.sm.level / 10;
i0 = i0 + 271515649;
if (myself.Skill_GetConsumeMP(i0) < myself.sm.mp && myself.Skill_GetConsumeHP(i0) < myself.sm.hp && myself.Skill_InReuseDelay(i0) == 0) {
myself.AddUseSkillDesire(myself.sm, i0, 0, 1, 1000000);

}
return;

}
if (gg.Rand(100) < i2) {
myself.Suicide();

} else {
myself.Despawn();
myself.SoundEffect(attacker, "ItemSound2.broken_key");

}
	}

	protected void USE_SKILL_FINISHED() {
myself.Despawn();
	}


}