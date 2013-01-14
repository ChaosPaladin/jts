package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_naiazma_key extends default_npc {
	protected String fnHi = "naiazma_key001.htm";
	protected String fnHi2 = "naiazma_key002.htm";
	protected int skill_overflow = 362217473;
	protected String my_maker_name = "gludio59_2025_top01m1";
	protected String fnConfirm = "naiazma_key005.htm";
	protected int c_entrance_x = -47271;
	protected int c_entrance_y = 246098;
	protected int c_entrance_z = -9120;

	protected void CREATED(HandlerParam maker0) {
myself.i_ai0 = 1;
myself.c_ai0 = gg.GetNullCreature();
	}

	protected void TALKED(HandlerParam talker) {
myself.c_ai0 = talker;
if (myself.i_ai0 == 0) {
myself.ShowPage(talker, fnHi2);

} else if (myself.i_ai0 == 1) {
myself.ShowPage(talker, fnHi);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam maker0, HandlerParam party0, HandlerParam c0) {
if (ask == -7801) {
if (reply == 1) {
myself.c_ai0 = talker;
if (myself.IsNullString(my_maker_name) == 0) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010026, 0, 0);

}

}

} else if (reply == 2) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
if (myself.DistFromMe(myself.GetLeaderOfParty(party0)) <= 3000) {
myself.TeleportParty(party0.id, c_entrance_x, c_entrance_y, c_entrance_z, 2000, 0);

} else {
myself.AddUseSkillDesire(myself.c_ai0, skill_overflow, 0, 0, 10000000000);

}

} else {
myself.InstantTeleport(myself.c_ai0, c_entrance_x, c_entrance_y, c_entrance_z);

}
myself.i_ai0 = 0;

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 33033) {
myself.i_ai0 = 1;

} else if (script_event_arg1 == 78010009) {
myself.AddUseSkillDesire(myself.c_ai0, skill_overflow, 0, 0, 10000000000);
myself.i_ai0 = 0;

} else if (script_event_arg1 == 78010008) {
myself.ShowPage(myself.c_ai0, fnConfirm);

} else if (script_event_arg1 == 78010042) {
myself.i_ai0 = 0;

} else if (script_event_arg1 == 78010041) {
if (script_event_arg2 != 0) {
if (myself.IsNullCreature(gg.GetCreatureFromID(script_event_arg2)) == 0) {
myself.c_ai0 = gg.GetCreatureFromID(script_event_arg2);

}

} else if (script_event_arg2 == 0 && script_event_arg3 <= 10 && script_event_arg3 >= 1) {
myself.Say(gg.MakeFString(1800197, "", "", "", "", ""));

}

}
	}


}