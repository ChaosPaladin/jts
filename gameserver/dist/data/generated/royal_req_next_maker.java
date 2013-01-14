package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_req_next_maker extends royal_rush_maker {
	protected String next_maker_name = "royal_req_next_maker_default";
	protected int req_count = 0;
	protected int BossMaker = 0;

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam deleted_npc, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply) {
if (BossMaker == 1) {
if (deleted_npc.sm.class_id == 1025339 || deleted_npc.sm.class_id == 1025342 || deleted_npc.sm.class_id == 1025346 || deleted_npc.sm.class_id == 1025349) {
maker0 = gg.GetNpcMaker(next_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1002, 0, 0);

}

}

} else if (reply == req_count) {
i1 = gg.GetDateTime(0, 4);
if (i1 >= 0 && i1 <= 50) {
maker0 = gg.GetNpcMaker(next_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1) {
super;
	}


}