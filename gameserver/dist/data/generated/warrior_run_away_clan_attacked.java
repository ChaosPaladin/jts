package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_run_away_clan_attacked extends warrior {
	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage, HandlerParam i6, HandlerParam i5, HandlerParam f0) {
if (myself.p_state != 3 && myself.sm.hp > 0) {
i5 = gg.Rand(100);
if (i5 < 50) {
myself.Say(gg.MakeFString(1000009, "", "", "", "", ""));

} else if (i5 < 75) {
myself.Say(gg.MakeFString(1000010, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1000011, "", "", "", "", ""));

}
myself.AddFleeDesire(attacker, 30);

} else if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddAttackDesire(attacker, 1, f0 * 30);

}
	}


}