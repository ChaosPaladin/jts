package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class undead_bandmaster extends default_npc {
	protected String dmgzone1 = "25_15_frintessaE_02";
	protected String dmgzone2 = "25_15_frintessaE_03";
	protected String dmgzone3 = "25_15_frintessaE_04";
	protected int Shoutman = 0;

	protected void CREATED() {
if (Shoutman == 1) {
myself.Shout(gg.MakeFString(1010644, "", "", "", "", ""));

}
myself.AddDoNothingDesire(5, 5);
myself.i_ai0 = 1;
gg.Area_SetOnOff(dmgzone1, 1);
gg.Area_SetOnOff(dmgzone2, 1);
gg.Area_SetOnOff(dmgzone3, 1);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (gg.Rand(100) < 33) {
i0 = gg.GetIndexFromCreature(attacker);
myself.BroadcastScriptEventEx(0, 10033, i0, 1500);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 10032) {
if (script_event_arg2 == 0) {
myself.i_ai0 = script_event_arg2;

} else if (script_event_arg2 == 2) {
myself.i_ai0 = script_event_arg2;

} else if (script_event_arg2 == 4) {
myself.i_ai0 = script_event_arg2;

} else if (script_event_arg2 == 6) {
myself.i_ai0 = script_event_arg2;

}

}
if (script_event_arg2 == 10042) {
if (Shoutman == 1) {
myself.Shout(gg.MakeFString(1010645, "", "", "", "", ""));

}

}
if (script_event_arg2 == 10043) {
if (Shoutman == 1) {
myself.Shout(gg.MakeFString(1010646, "", "", "", "", ""));

}

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam maker0) {
i0 = gg.Rand(100);
if (i0 < 50) {
myself.DropItem1(myself.sm, 8192, 1);

}
	}


}