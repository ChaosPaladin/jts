package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_spawn_treasurebox extends royal_rush_maker {
	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (script_event_arg1 == 1002) {
i1 = gg.GetDateTime(0, 4);
i2 = gg.Rand(10);
if (i1 < 50 && i1 >= 48) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 10 + i2, 1)) {
def0.Spawn(10 + i2, 0);

}

}

} else if (i1 < 48 && i1 >= 46) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 15 + i2, 1)) {
def0.Spawn(15 + i2, 0);

}

}

} else if (i1 < 46 && i1 >= 44) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 20 + i2, 1)) {
def0.Spawn(20 + i2, 0);

}

}

} else if (i1 < 44 && i1 >= 42) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 26 + i2, 1)) {
def0.Spawn(26 + i2, 0);

}

}

} else if (i1 < 42 && i1 >= 40) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 32 + i2, 1)) {
def0.Spawn(32 + i2, 0);

}

}

} else if (i1 < 40 && i1 >= 38) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 39 + i2, 1)) {
def0.Spawn(39 + i2, 0);

}

}

} else if (i1 < 38 && i1 >= 36) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 45 + i2, 1)) {
def0.Spawn(45 + i2, 0);

}

}

} else if (i1 < 36 && i1 >= 34) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 52 + i2, 1)) {
def0.Spawn(52 + i2, 0);

}

}

} else if (i1 < 34 && i1 >= 32) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 60 + i2, 1)) {
def0.Spawn(60 + i2, 0);

}

}

} else if (i1 < 32 && i1 >= 30) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 68 + i2, 1)) {
def0.Spawn(68 + i2, 0);

}

}

} else if (i1 < 30 && i1 >= 28) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 76 + i2, 1)) {
def0.Spawn(76 + i2, 0);

}

}

} else if (i1 < 28 && i1 >= 26) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 85 + i2, 1)) {
def0.Spawn(85 + i2, 0);

}

}

} else if (i1 < 26 && i1 >= 24) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 94 + i2, 1)) {
def0.Spawn(94 + i2, 0);

}

}

} else if (i1 < 24 && i1 >= 22) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 103 + i2, 1)) {
def0.Spawn(103 + i2, 0);

}

}

} else if (i1 < 22 && i1 >= 20) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 113 + i2, 1)) {
def0.Spawn(113 + i2, 0);

}

}

} else if (i1 < 18 && i1 >= 16) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 123 + i2, 1)) {
def0.Spawn(123 + i2, 0);

}

}

} else if (i1 < 16 && i1 >= 14) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 134 + i2, 1)) {
def0.Spawn(134 + i2, 0);

}

}

} else if (i1 < 14 && i1 >= 12) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 145 + i2, 1)) {
def0.Spawn(145 + i2, 0);

}

}

} else if (i1 < 12) {
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.AtomicIncreaseTotal(def0, 157 + i2, 1)) {
def0.Spawn(157 + i2, 0);

}

}

}

}
	}


}