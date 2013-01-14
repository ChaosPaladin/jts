package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class B_room_stonehenge extends default_npc {
	protected int MagicHeal = 458752001;
	protected String makername1 = "godard32_2515_19m1";
	protected String ai_type = "party_private_warrior_oracle";
	protected int silhouette = 1020116;
	protected String fnHi = "";
	protected String maker_name = "innadril19_2423_008m1";
	protected String gate_maker_name = "innadril19_2423_003m1";
	protected String Privates = "orc:party_private:1:20sec";
	protected String b_doorname = "island_of_oracle_c";

	protected void CREATED(HandlerParam maker0, HandlerParam i0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12509, 0, 0);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 12508) {
myself.i_ai0 = script_event_arg2;

} else if (script_event_arg1 == 12510) {
myself.i_ai1 = 1;

} else if (script_event_arg1 == 12511) {
myself.i_ai1 = 2;

} else if (script_event_arg1 == 12512) {
myself.i_ai1 = 3;

} else if (script_event_arg1 == 12513) {
myself.i_ai1 = 4;

} else if (script_event_arg1 == 12514) {
myself.i_ai1 = 5;

} else if (script_event_arg1 == 12532) {
myself.Despawn();

}
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0, HandlerParam maker0) {
if (myself.i_ai3 == 0) {
myself.i_ai3 = 1;
gg.Castle_GateOpenCloseEx(b_doorname, 1, myself.InstantZone_GetId());

}
if (myself.i_ai0 == 1 && myself.i_ai1 == 0) {
myself.BroadcastScriptEvent(12510, 0, 1000);
myself.i_ai1 = 1;
myself.i_ai2 = 1;
myself.AddUseSkillDesire(myself.sm, 356581377, 1, 0, 100000);

} else if (myself.i_ai0 == 2 && myself.i_ai1 == 1) {
myself.BroadcastScriptEvent(12511, 0, 1000);
myself.i_ai1 = 2;
myself.i_ai2 = 1;
myself.AddUseSkillDesire(myself.sm, 356581377, 1, 0, 100000);

} else if (myself.i_ai0 == 3 && myself.i_ai1 == 2) {
myself.BroadcastScriptEvent(12512, 0, 1000);
myself.i_ai1 = 3;
myself.i_ai2 = 1;
myself.AddUseSkillDesire(myself.sm, 356581377, 1, 0, 100000);

} else if (myself.i_ai0 == 4 && myself.i_ai1 == 3) {
myself.BroadcastScriptEvent(12513, 0, 1000);
myself.i_ai1 = 4;
myself.i_ai2 = 1;
myself.AddUseSkillDesire(myself.sm, 356581377, 1, 0, 100000);

} else if (myself.i_ai0 == 5 && myself.i_ai1 == 4) {
myself.BroadcastScriptEvent(12514, 0, 1000);
myself.i_ai1 = 5;
myself.i_ai2 = 1;
myself.AddUseSkillDesire(myself.sm, 356581377, 1, 0, 100000);

} else if (myself.i_ai0 == 6 && myself.i_ai1 == 5) {
myself.AddUseSkillDesire(myself.sm, 356581377, 1, 0, 100000);
myself.i_ai1 = 6;
myself.i_ai2 = 1;
myself.AddTimerEx(3002, 3000);

} else if (myself.i_ai2 == 0) {
myself.i_ai2 = 1;
myself.CreatePrivates(Privates);
myself.AddTimerEx(3001, 10 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam i0, HandlerParam c0, HandlerParam c1, HandlerParam maker0) {
if (timer_id == 3001) {
myself.i_ai2 = 0;

} else if (timer_id == 3002) {
myself.BroadcastScriptEvent(12532, 0, 3000);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, gate_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 2);

}

}
	}

	protected void MY_DYING() {
myself.InstantZone_MarkRestriction();
	}


}