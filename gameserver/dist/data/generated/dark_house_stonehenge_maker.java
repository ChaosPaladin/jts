package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dark_house_stonehenge_maker extends inzone_maker {
	protected int inzone_type_param = 0;
	protected int spawn_event_id = -2;
	protected int despawn_event_id = -1;
	protected int on_start_spawn = 1;
	protected int script_event_enable = 1;
	protected int IncreaseTotal = 0;
	protected String maker_name = "innadril19_2423_008m2";
	protected String DoorName = "island_of_oracle_c";

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam def0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
super;
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9) {
switch (script_event_arg1) {
case 12509: {
myself.i_ai4 = myself.i_ai4 + 1;
if (myself.i_ai4 == IncreaseTotal) {
myself.AddTimerEx(3000, 3000);

}
break;

}

}
super;
	}

	protected void ON_TIMER(HandlerParam timer_id, HandlerParam def0, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam i10, HandlerParam i11) {
if (timer_id == 3000) {
i2 = 0;
i3 = 0;
i4 = 0;
i5 = 0;
i6 = 0;
i7 = 0;
i8 = IncreaseTotal;
i9 = 0;
i10 = 0;
i11 = 0;
for (i0 = 1; i0 < IncreaseTotal + 1; i0 = i0 + 1) {
i1 = gg.Rand(96);
if (IncreaseTotal >= 1 && i1 <= gg.FloatToInt(FloatToInt / i8) && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(12508, i0, 0);

}
i2 = 1;

} else if (IncreaseTotal >= 2 && i1 <= gg.FloatToInt(FloatToInt / i8 * 2 - i2) && myself.i_ai1 == 0) {
myself.i_ai1 = 1;
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(12508, i0, 0);

}
i3 = 1;

} else if (IncreaseTotal >= 3 && i1 <= gg.FloatToInt(FloatToInt / i8 * 3 - i2 - i3) && myself.i_ai2 == 0) {
myself.i_ai2 = 1;
def0 = myself.GetSpawnDefine(2);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(12508, i0, 0);

}
i4 = 1;

} else if (IncreaseTotal >= 4 && i1 <= gg.FloatToInt(FloatToInt / i8 * 4 - i2 - i3 - i4) && myself.i_ai3 == 0) {
myself.i_ai3 = 1;
def0 = myself.GetSpawnDefine(3);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(12508, i0, 0);

}
i5 = 1;

} else if (IncreaseTotal >= 5 && i1 <= gg.FloatToInt(FloatToInt / i8 * 5 - i2 - i3 - i4 - i5) && i9 == 0) {
i9 = 1;
def0 = myself.GetSpawnDefine(4);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(12508, i0, 0);

}
i6 = 1;

} else if (IncreaseTotal >= 6 && i1 <= gg.FloatToInt(FloatToInt / i8 * 6 - i2 - i3 - i4 - i5 - i6) && i7 == 0) {
i7 = 1;
def0 = myself.GetSpawnDefine(5);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(12508, i0, 0);

}
i11 = 1;

} else if (IncreaseTotal >= 7 && i1 <= gg.FloatToInt(FloatToInt / i8 * 7 - i2 - i3 - i4 - i5 - i6 - i11) && i10 == 0) {
i10 = 1;
def0 = myself.GetSpawnDefine(6);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(12508, i0, 0);

}

}
i8 = IncreaseTotal - i0;

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam maker0, HandlerParam maker1, HandlerParam def0, HandlerParam reply) {
	}

	protected void ON_ALL_NPC_DELETED(HandlerParam i0, HandlerParam def0, HandlerParam maker0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
	}


}