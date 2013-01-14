package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class immo_basic_maker extends inzone_maker {
	protected int inzone_type_param = 0;
	protected int spawn_event_id = -2;
	protected int despawn_event_id = -1;
	protected int on_start_spawn = 1;
	protected int script_event_enable = 1;
	protected int inzone_cluster_id = 0;
	protected int tide = 0;
	protected int zone = 0;
	protected int room = 0;
	protected int seq = 0;
	protected String z2_a_dispatcher_maker = "rumwarsha14_1424_a_dispm1";
	protected String z2_d_dispatcher_maker = "rumwarsha14_1424_d_dispm1";
	protected String z3_a_dispatcher_maker = "rumwarsha15_1424_a_dispm1";
	protected String z3_d_dispatcher_maker = "rumwarsha15_1424_d_dispm1";
	protected int TACT_AGGRESIVE = 0;
	protected int TACT_INTERCEPT = 1;
	protected int TACT_DEFENSIVE = 2;
	protected int babble_mode = 0;

	protected void ON_START() {
super;
	}

	protected void ON_INSTANT_ZONE_EVENT(HandlerParam inzone_type_id, HandlerParam inzone_id, HandlerParam event_id, HandlerParam reply, HandlerParam i0, HandlerParam def0) {
myself.enabled = reply;
	}

	protected void ON_NPC_DELETED() {
	}

	protected void ON_ALL_NPC_DELETED() {
	}

	protected void ON_TIMER() {
	}


}