package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_kegor extends ai_icequeen_help_pc {
	protected int TIMER_SCENE_20 = 2314506;
	protected int TIMER_SCENE_20_END = 2314516;
	protected int scene_num_20 = 20;
	protected int scene_sec_20 = 58000;
	protected int TIMER_despawn = 2314040;
	protected int position = -1;
	protected String MAKER_controller = "schuttgart29_2314_01m1";
	protected String fnHi = "kegor001.htm";
	protected String fnYouAreNotLeader = "kegor002.htm";
	protected int debug_mode = 0;

	protected void CREATED(HandlerParam i0, HandlerParam maker0) {
super;
if (position == 2) {
myself.CreateOnePrivateEx(1029179, "ai_icequeen_freya_defeated", 0, 0, 114767, -114795, -11200, 0, 0, 0, 0);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140058, 0, 0);

}

}
	}

	protected void TALKED(HandlerParam talker) {
if (position == 2) {
if (debug_mode) {
myself.Say("debug_ai로 1을 입력하면 무조건 엔딩 시작");

}
myself.ShowPage(talker, fnHi);

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 1) {
myself.Say("1 : start ending");
myself.AddTimerEx(TIMER_SCENE_20, 1000);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam maker0, HandlerParam party0, HandlerParam c0, HandlerParam c1) {
if (ask == -2318) {
if (reply == 1) {
i0 = myself.MPCC_GetMPCCId(talker);
c0 = myself.MPCC_GetMaster(i0);
if (talker == c0) {
if (debug_mode) {
myself.Say("start ending");

}
myself.AddTimerEx(TIMER_SCENE_20, 1000);

} else {
myself.ShowPage(talker, fnYouAreNotLeader);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam maker0) {
super;
if (timer_id == TIMER_SCENE_20) {
if (debug_mode) {
myself.Say("TIMER_SCENE_20");

}
myself.StartScenePlayerAround(myself.sm, scene_num_20, 4000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));
myself.AddTimerEx(TIMER_SCENE_20_END, scene_sec_20);

} else if (timer_id == TIMER_SCENE_20_END) {
myself.InstantZone_Finish(10);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_controller);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140059, 0, 0);

}
myself.AddTimerEx(TIMER_despawn, 2 * 1000);

} else if (timer_id == TIMER_despawn) {
myself.BroadcastScriptEvent(23140020, 0, 4000);
myself.Despawn();

}
	}


}