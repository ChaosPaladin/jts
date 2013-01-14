package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_gathered_npc_for_a_seed extends ai_gathered_npc {
	protected int FieldCycleID = 0;

	protected void CREATED() {
myself.i_quest9 = 0;
	}

	protected void WAS_COLLECTED(HandlerParam attacker, HandlerParam i0, HandlerParam i1) {
if (myself.i_quest9) {
myself.Say("채집!");

}
i0 = gg.Rand(100);
if (i0 > 50) {
if (myself.i_quest9) {
myself.Say("몬스터 스폰 확률!");

}
if (FieldCycleID == 4) {
i1 = gg.Rand(4);
switch (i1) {
case 0: {
myself.CreateOnePrivateEx(1022747, "brakian", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 1: {
myself.CreateOnePrivateEx(1022748, "groykhan", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(1022749, "traikhan", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 3: {
myself.CreateOnePrivateEx(1022746, "bgurent", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}

}

} else if (FieldCycleID == 5) {
i1 = gg.Rand(3);
switch (i1) {
case 0: {
myself.CreateOnePrivateEx(1022754, "turtlian", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 1: {
myself.CreateOnePrivateEx(1022756, "tardion", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(1022755, "krakian", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}

}

} else if (FieldCycleID == 6) {
i1 = gg.Rand(3);
switch (i1) {
case 0: {
myself.CreateOnePrivateEx(1022760, "karnibi", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 1: {
myself.CreateOnePrivateEx(1022761, "kiriona", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(1022762, "caiona", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}

}

}

}
super;
	}


}