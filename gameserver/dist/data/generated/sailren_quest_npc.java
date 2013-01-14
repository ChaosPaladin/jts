package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sailren_quest_npc extends default_npc {
	protected void CREATED() {
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam party0) {
myself.ShowPage(talker, "statue_of_shilen001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam fhtml0, HandlerParam state, HandlerParam party0, HandlerParam maker0) {
if (ask == 314) {
switch (reply) {
case 1: {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
if (myself.i_ai2 == 1) {
if (myself.i_ai1 == 0) {
if (gg.Party_GetLeader(talker) == talker) {
if (gg.OwnItemCount(talker, 8784) >= 1) {
myself.DeleteItem1(talker, 8784, 1);
myself.i_ai1 = 1;
myself.TeleportParty(party0.id, 27549, -6638, -2008, 1000, 0);
maker0 = gg.GetNpcMaker("rune20_mb2017_01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11053, 0, 0);

}
myself.AddTimerEx(1001, 60 * 1000);
maker0 = gg.GetNpcMaker("rune20_mb2017_02m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11053, 0, 0);

}
maker0 = gg.GetNpcMaker("rune20_mb2017_03m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11053, 0, 0);

}
maker0 = gg.GetNpcMaker("rune16_npc2017_13m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11048, 0, 0);

}

} else {
myself.ShowPage(talker, "statue_of_shilen003.htm");

}

} else {
myself.ShowPage(talker, "statue_of_shilen004.htm");

}

} else {
myself.ShowPage(talker, "statue_of_shilen006.htm");

}

} else {
myself.ShowPage(talker, "statue_of_shilen005.htm");

}

} else {
myself.ShowPage(talker, "statue_of_shilen002.htm");

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 1001) {
maker0 = gg.GetNpcMaker("rune20_mb2017_01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam maker0) {
if (script_event_arg1 == 11045) {
myself.i_ai1 = 0;
myself.i_ai2 = 0;

} else if (script_event_arg1 == 11041) {
myself.i_ai2 = 1;

} else if (script_event_arg1 == 11043) {
myself.i_ai1 = 0;

} else if (script_event_arg1 == 11047) {
myself.i_ai1 = 1;

} else if (script_event_arg1 == 11050) {
myself.i_ai1 = 0;

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id) {
	}


}