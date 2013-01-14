package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_soldier_tomaris extends citizen {
	protected String my_maker_name = "rumwarsha02_npc1425_lc01m1";
	protected int TM_LINDVIOR_SCENE_CHECK = 78003;
	protected int TIME_LINDVIOR_SCENE_CHECK = 30;
	protected int TM_LINDVIOR_SCENE_1 = 78001;
	protected int TIME_LINDVIOR_SCENE_1 = 60;
	protected int TM_LINDVIOR_SCENE_2 = 78002;
	protected int TIME_LINDVIOR_SCENE_2 = 30;
	protected int babble_mode = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.AddTimerEx(TM_LINDVIOR_SCENE_CHECK, 1000);
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 78010057 && script_event_arg2 == 2 && myself.i_ai0 == 1) {
myself.Shout(gg.MakeFString(1800227, "", "", "", "", ""));
myself.i_ai0 = 2;
myself.AddTimerEx(TM_LINDVIOR_SCENE_2, TIME_LINDVIOR_SCENE_2 * 1000);

} else if (script_event_arg1 == 78010057 && script_event_arg2 == 2 && myself.i_ai0 == 2) {
myself.i_ai0 = 0;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == TM_LINDVIOR_SCENE_1) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010057, 3, 0);

}

} else if (timer_id == TM_LINDVIOR_SCENE_2) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010057, 1, 0);

}

} else if (timer_id == TM_LINDVIOR_SCENE_CHECK) {
if (gg.GetDateTime(0, 4) == 58 && gg.GetDateTime(0, 3) == 18 && gg.GetDateTime(0, 6) == 3 || gg.GetDateTime(0, 6) == 6 && myself.i_ai0 == 0) {
myself.Shout(gg.MakeFString(1800225, "", "", "", "", ""));
myself.i_ai0 = 1;
myself.AddTimerEx(TM_LINDVIOR_SCENE_1, TIME_LINDVIOR_SCENE_1 * 1000);

}
myself.AddTimerEx(TM_LINDVIOR_SCENE_CHECK, TIME_LINDVIOR_SCENE_CHECK * 1000);

}
super;
	}


}