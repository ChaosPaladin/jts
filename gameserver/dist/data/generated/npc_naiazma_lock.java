package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_naiazma_lock extends default_npc {
	protected String my_maker_name = "gludio59_2025_top01m1";
	protected String Privates = "naiazma_keeper:naiazma_keeper:1:0sec";
	protected String Privates2 = "naiazma_keeper:naiazma_keeper:1:0sec";
	protected String Privates3 = "naiazma_keeper:naiazma_keeper:1:0sec;naiazma_keeper:naiazma_keeper:1:0sec";

	protected void CREATED(HandlerParam i0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.CreatePrivates(Privates);
myself.BroadcastScriptEventEx(33033, 0, 0, 5000);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam maker0) {
if (script_event_arg1 == 78010026) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
if (myself.sm.hp > 0 && myself.sm.hp <= myself.sm.max_hp / 10) {
gg.SendMakerScriptEvent(maker0, 78010008, 0, 0);

} else if (myself.sm.hp > myself.sm.max_hp / 10) {
gg.SendMakerScriptEvent(maker0, 78010009, 0, 0);

} else {
gg.SendMakerScriptEvent(maker0, 78010009, 0, 0);

}

}

}
	}

	protected void ATTACKED(HandlerParam maker0, HandlerParam attacker) {
if (myself.i_ai0 == 0) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0 && myself.IsNullCreature(attacker) == 0) {
gg.SendMakerScriptEvent(maker0, 78010041, attacker.id, 0);

}
myself.i_ai0 = 1;

}
if (myself.i_ai3 == 0 && myself.sm.hp > 0 && myself.sm.hp < myself.sm.max_hp) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010041, 0, 10);

}
myself.i_ai3 = 1;

} else if (myself.i_ai3 == 1 && myself.sm.hp > 0 && myself.sm.hp < myself.sm.max_hp / 10 * 9) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010041, 0, 9);

}
myself.i_ai3 = 2;

} else if (myself.i_ai3 == 2 && myself.sm.hp > 0 && myself.sm.hp < myself.sm.max_hp / 10 * 8) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010041, 0, 8);

}
myself.i_ai3 = 3;

} else if (myself.i_ai3 == 3 && myself.sm.hp > 0 && myself.sm.hp < myself.sm.max_hp / 10 * 7) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010041, 0, 7);

}
myself.i_ai3 = 4;

} else if (myself.i_ai3 == 4 && myself.sm.hp > 0 && myself.sm.hp < myself.sm.max_hp / 10 * 6) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010041, 0, 6);

}
myself.i_ai3 = 5;

} else if (myself.i_ai3 == 5 && myself.sm.hp > 0 && myself.sm.hp < myself.sm.max_hp / 10 * 5) {
myself.CreatePrivates(Privates2);
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010041, 0, 5);

}
myself.i_ai3 = 6;

} else if (myself.i_ai3 == 6 && myself.sm.hp > 0 && myself.sm.hp < myself.sm.max_hp / 10 * 4) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010041, 0, 4);

}
myself.i_ai3 = 7;

} else if (myself.i_ai3 == 7 && myself.sm.hp > 0 && myself.sm.hp < myself.sm.max_hp / 10 * 3) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010041, 0, 3);

}
myself.i_ai3 = 8;

} else if (myself.i_ai3 == 8 && myself.sm.hp > 0 && myself.sm.hp < myself.sm.max_hp / 10 * 2) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010041, 0, 2);

}
myself.i_ai3 = 9;

} else if (myself.i_ai3 == 9 && myself.sm.hp > 0 && myself.sm.hp < myself.sm.max_hp / 10 * 1) {
myself.CreatePrivates(Privates3);
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010041, 0, 1);

}
myself.i_ai3 = 10;

}
super;
	}

	protected void MY_DYING(HandlerParam private) {
myself.BroadcastScriptEventEx(78010042, 0, 0, 5000);
	}


}