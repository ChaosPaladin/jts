package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_lindvior_camera_01 extends default_npc {
	protected String my_maker_name = "rumwarsha02_npc1425_lc01m1";
	protected int TM_LINDVIOR_SCENE = 78001;
	protected int TIME_LINDVIOR_SCENE = 46;
	protected int babble_mode = 0;

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 78010057 && script_event_arg2 == 1) {
if (babble_mode == 1) {
myself.Shout("연출 시작!");

}
myself.StartScenePlayerAround(myself.sm, 1, 4000, 1100, 3100);
myself.AddTimerEx(TM_LINDVIOR_SCENE, TIME_LINDVIOR_SCENE * 1000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == TM_LINDVIOR_SCENE) {
if (babble_mode == 1) {
myself.Shout("연출 끝!");

}
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010057, 2, 0);

}

}
super;
	}


}