package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class reed_event_maker extends default_maker {
	protected int on_start_spawn = 0;
	protected int babble_mode = 0;

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0) {
if (script_event_arg1 == 78010075) {
if (babble_mode == 1) {
gg.Announce("스폰체크:" + myself.npc_count + "/" + myself.maximum_npc);

}
def0 = myself.GetSpawnDefine(0);
if (gg.IsNull(def0) == 0) {
if (myself.maximum_npc >= myself.npc_count + 1 && myself.AtomicIncreaseTotal(def0, 1, 1)) {
if (babble_mode == 1) {
gg.Announce("타락한 머크로키언 스폰");

}
def0.Spawn2(1, 0, 0);

}

}

} else if (script_event_arg1 == 78010076) {
if (babble_mode == 1) {
gg.Announce("스폰체크:" + myself.npc_count + "/" + myself.maximum_npc);

}
def0 = myself.GetSpawnDefine(1);
if (gg.IsNull(def0) == 0) {
if (myself.maximum_npc >= myself.npc_count + 1 && myself.AtomicIncreaseTotal(def0, 1, 1)) {
if (babble_mode == 1) {
gg.Announce("변화된 머크로키언 스폰");

}
def0.Spawn2(1, 0, 0);

}

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def) {
	}


}