package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_party_leader_named_monster extends party_leader_aggressive {
	protected int PhysicalSpecial1 = 458752001;
	protected int PhysicalSpecial2 = 458752001;
	protected int PhysicalSpecial3 = 458752001;
	protected String maker_name = "innadril22_2422_024m3";

	protected void CREATED() {
myself.CreateOnePrivateEx(1022300, "warrior_use_skill", 0, 0, gg.FloatToInt(myself.sm.x + 20), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1022300, "warrior_use_skill", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 20), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.DistFromMe(attacker) > 200) {
if (gg.Rand(100) > 33) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000000);

}

} else if (gg.Rand(100) < 33) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial1, 0, 1, 1000000);

} else if (gg.Rand(100) < 33) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial3, 0, 1, 1000000);

}
super;
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam maker0) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12547, 0, 0);

}
super;
	}


}