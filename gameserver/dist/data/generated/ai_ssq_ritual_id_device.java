package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ssq_ritual_id_device extends default_npc {
	protected String fnHi = "chi.htm";
	protected String fnSuccess = "chi.htm";
	protected String fnFailed = "chi.htm";
	protected int quest_name = 195;
	protected int ITEM_ID_CARD = 13822;
	protected int TIMER_ssq_camera = 27334;
	protected int TIMER_ssq_camera_after = 27335;
	protected int TIMER_msg2 = 27336;
	protected int TIMER_msg3 = 27337;
	protected String DoorName = "";
	protected String DoorName2 = "";
	protected String maker_6priest = "iz111_npc1724_06m1";
	protected int scene_num = -1;
	protected int scene_sec = -1;
	protected int Penalty_X = -78240;
	protected int Penalty_Y = 205858;
	protected int Penalty_Z = -7856;
	protected int debug_mode = 0;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == 195) {
if (reply == 1) {
if (gg.HaveMemo(talker, quest_name) == 1 && gg.GetMemoState(talker, quest_name) == 3 && talker.transformID == 113 && gg.OwnItemCount(talker, ITEM_ID_CARD) > 0) {
if (debug_mode) {
myself.Say("조건에 맞음. 문 연다");

}
gg.Castle_GateOpenCloseEx(DoorName, 0, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(DoorName2, 0, myself.InstantZone_GetId());
myself.c_ai0 = talker;
myself.AddTimerEx(TIMER_ssq_camera, 1000);
if (gg.IsSameString(fnSuccess, "chi.htm") == 0) {
myself.ShowPage(talker, fnSuccess);

}

} else {
if (debug_mode) {
myself.Say("입장 실패");
myself.Say("have memo : " + gg.HaveMemo(talker, quest_name));
myself.Say("memostate : " + gg.GetMemoState(talker, quest_name));
myself.Say("TransformID : " + talker.transformID);
myself.Say("ItemCount : " + gg.OwnItemCount(talker, ITEM_ID_CARD));

}
if (gg.IsSameString(fnFailed, "chi.htm") == 0) {
myself.ShowPage(talker, fnFailed);

}

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, quest_name) == 1 && gg.GetMemoState(talker, quest_name) == 3 && talker.transformID == 113 && gg.OwnItemCount(talker, ITEM_ID_CARD) > 0) {
if (debug_mode) {
myself.Say("조건에 맞음. 문 연다");

}
gg.Castle_GateOpenCloseEx(DoorName, 0, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(DoorName2, 0, myself.InstantZone_GetId());
myself.AddTimerEx(TIMER_ssq_camera, 1000);
myself.ShowPage(talker, fnSuccess);

} else {
if (debug_mode) {
myself.Say("암호는 맞지만 조건에 맞지 않는다.");

}
myself.ShowPage(talker, fnFailed);

}

} else if (reply == 3) {
myself.ShowPage(talker, fnFailed);
myself.InstantTeleport(talker, Penalty_X, Penalty_Y, Penalty_Z);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam i0) {
if (timer_id == TIMER_ssq_camera) {
if (debug_mode) {
myself.Say("TIMER_ssq_camera");

}
if (scene_num > 0) {
myself.AddTimerEx(TIMER_ssq_camera_after, scene_sec);
myself.StartScenePlayerAround(myself.sm, scene_num, 2000, gg.FloatToInt(myself.sm.z - 1000), gg.FloatToInt(myself.sm.z + 1000));

} else {
myself.ShowSystemMessage(myself.c_ai0, 3033);
myself.AddTimerEx(TIMER_msg2, 100);

}

} else if (timer_id == TIMER_ssq_camera_after) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_6priest);
if (gg.IsNull(maker0) == 0) {
if (debug_mode) {
myself.Say("카메라 종료 후 사제들 스폰");

}
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.ShowSystemMessage(myself.c_ai0, 3034);

} else if (timer_id == TIMER_msg2) {
myself.ShowSystemMessage(myself.c_ai0, 3037);
myself.AddTimerEx(TIMER_msg3, 100);

} else if (timer_id == TIMER_msg3) {
myself.ShowSystemMessage(myself.c_ai0, 3038);

}
	}


}