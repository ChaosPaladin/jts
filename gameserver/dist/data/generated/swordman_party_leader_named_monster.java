package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class swordman_party_leader_named_monster extends party_leader_aggressive {
	protected int PhysicalSpecial = 458752001;
	protected int W_ShortRangeDDMagic = 458752001;
	protected int W_LongRangeDDMagic = 458752001;
	protected int debuff = 458752001;
	protected String maker_name = "innadril22_2422_024m3";

	protected void CREATED() {
myself.CreateOnePrivateEx(1022290, "warrior_use_skill", 0, 0, gg.FloatToInt(myself.sm.x + 20), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1022290, "warrior_use_skill", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 20), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.DistFromMe(attacker) > 200) {
if (gg.Rand(100) < 33) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else if (gg.Rand(100) < 33) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

} else if (gg.Rand(100) < 33) {
myself.AddUseSkillDesire(attacker, debuff, 0, 1, 1000000);

}
super;
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam maker0) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12548, 0, 0);

}
super;
	}


}