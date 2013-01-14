package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class unique_npc_kill_event extends default_maker {
	protected int unique_npc = 1020130;
	protected int event = 0;
	protected String maker_name = "unique_npc_kill_event_default";

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam deleted_npc, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (deleted_npc.sm.class_id == unique_npc) {
if (event == 0) {
if (gg.IsSameString(maker_name, "unique_npc_kill_event_default") == 1) {
maker0 = gg.GetNpcMaker(myself.name);

} else {
maker0 = gg.GetNpcMaker(maker_name);

}
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (event == 1) {
maker0 = gg.GetNpcMaker(maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
super;

} else {
super;

}
	}


}