package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_frintesa_set_db extends default_npc {
	protected int music = 328073217;
	protected int music_of_heal = 328138753;
	protected int music_of_rampage = 328138754;
	protected int music_of_power = 328138755;
	protected int music_of_plague = 328138756;
	protected int music_of_psycho = 328138757;
	protected String areadata_heal1 = "17_13_frintessa_01_01";
	protected String areadata_heal2 = "17_13_frintessa_02_01";
	protected String areadata_power1 = "17_13_frintessa_01_02";
	protected String areadata_power2 = "17_13_frintessa_02_02";
	protected String areadata_psycho1 = "17_13_frintessa_01_03";
	protected String areadata_psycho2 = "17_13_frintessa_02_03";
	protected String areadata_rampage1 = "17_13_frintessa_01_04";
	protected String areadata_rampage2 = "17_13_frintessa_02_04";
	protected String areadata_plague1 = "17_13_frintessa_01_05";
	protected String areadata_plague2 = "17_13_frintessa_02_05";
	protected int GM_ID = 4;
	protected String TDoorName1 = "frintessa_new_door_151";
	protected String TDoorName2 = "frintessa_new_door_251";
	protected String TDoorName3 = "frintessa_new_door_252";
	protected String TDoorName4 = "frintessa_new_door_351";
	protected String WallDoorName1A = "frintessa_new_door_101";
	protected String WallDoorName2A = "frintessa_new_door_102";
	protected String WallDoorName3A = "frintessa_new_door_103";
	protected String WallDoorName4A = "frintessa_new_door_104";
	protected String WallDoorName5A = "frintessa_new_door_105";
	protected String WallDoorName6A = "frintessa_new_door_106";
	protected String WallDoorName7A = "frintessa_new_door_107";
	protected String WallDoorName8A = "frintessa_new_door_108";
	protected String WallDoorName1B = "frintessa_new_door_201";
	protected String WallDoorName2B = "frintessa_new_door_202";
	protected String WallDoorName3B = "frintessa_new_door_203";
	protected String WallDoorName4B = "frintessa_new_door_204";
	protected String WallDoorName5B = "frintessa_new_door_205";
	protected String WallDoorName6B = "frintessa_new_door_206";
	protected String WallDoorName7B = "frintessa_new_door_207";
	protected String WallDoorName8B = "frintessa_new_door_208";
	protected String WallDoorName9B = "frintessa_new_door_209";
	protected String WallDoorName10B = "frintessa_new_door_210";
	protected String maker_frintessa_manager = "godard32_1713_102m1";

	protected void CREATED(HandlerParam reply, HandlerParam i0, HandlerParam maker0, HandlerParam i1, HandlerParam c1) {
gg.Area_SetOnOff(areadata_heal1, 0);
gg.Area_SetOnOff(areadata_heal2, 0);
gg.Area_SetOnOff(areadata_power1, 0);
gg.Area_SetOnOff(areadata_power2, 0);
gg.Area_SetOnOff(areadata_psycho1, 0);
gg.Area_SetOnOff(areadata_psycho2, 0);
gg.Area_SetOnOff(areadata_rampage1, 0);
gg.Area_SetOnOff(areadata_rampage2, 0);
gg.Area_SetOnOff(areadata_plague1, 0);
gg.Area_SetOnOff(areadata_plague2, 0);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_ai9 = 0;
myself.i_ai7 = 0;
myself.i_ai8 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;
super;
myself.AddTimerEx(1, 35 * 60 * 1000);
myself.AddTimerEx(2, 3 * 1000);
myself.AddTimerEx(3, 6 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam c2, HandlerParam maker0, HandlerParam c4) {
if (timer_id == 1) {
if (myself.i_ai0 >= 2) {

} else {
myself.InstantZone_Finish(0);

}

} else if (timer_id == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, "godard32_1713_102m1");
if (gg.IsNull(maker0) == 0) {
if (myself.i_ai9 == 1) {
myself.Shout("내 아이디 줌");

}
gg.SendMakerScriptEvent(maker0, 10001011, myself.sm.id, 0);

} else if (myself.i_ai9 == 1) {
myself.Shout("메이커가 머머라니~");

}

} else if (timer_id == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, "godard32_1713_102m1");
if (gg.IsNull(maker0) == 0) {
if (myself.i_ai9 == 1) {
myself.Shout("ID 내놔");

}
gg.SendMakerScriptEvent(maker0, 10001022, myself.sm.id, 0);
gg.SendMakerScriptEvent(maker0, 10001023, myself.sm.id, 0);

} else if (myself.i_ai9 == 1) {
myself.Shout("메이커가 머머라니~");

}

} else if (timer_id == 1000) {
myself.CreateOnePrivateInzoneEx(1029052, "ai_boss08_organ_dummy", 0, 0, -87780, -155087, -9080, 16384, myself.sm.id, 0, 0, myself.InstantZone_GetId());
myself.AddTimerEx(1001, 4000);

} else if (timer_id == 1001) {
gg.InstantTeleportEx(myself.sm, -87780, -155086, -9080, 16384);
gg.Castle_GateOpenCloseEx(TDoorName1, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(TDoorName2, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(TDoorName3, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(TDoorName4, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName1A, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName2A, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName3A, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName4A, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName5A, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName6A, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName7A, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName8A, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName1B, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName2B, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName3B, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName4B, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName5B, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName6B, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName7B, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName8B, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName9B, 1, myself.InstantZone_GetId());
gg.Castle_GateOpenCloseEx(WallDoorName10B, 1, myself.InstantZone_GetId());
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), "godard32_1713_105m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_quest1 = myself.GetCurrentTick();
myself.AddTimerEx(1002, 6000);

} else if (timer_id == 1002) {
myself.AddTimerEx(1003, 2000);

} else if (timer_id == 1003) {
myself.AddEffectActionDesire(myself.sm, 1, 7000, 1000);
myself.AddTimerEx(1004, 7000);

} else if (timer_id == 1004) {
myself.AddTimerEx(1005, 1500);

} else if (timer_id == 1005) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), "godard32_1713_103m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.AddTimerEx(1006, 500);

} else if (timer_id == 1006) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), "godard32_1713_104m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.AddTimerEx(1007, 500);

} else if (timer_id == 1007) {
myself.AddEffectActionDesire(myself.sm, 3, 6600, 1000);
myself.AddTimerEx(1008, 6600);

} else if (timer_id == 1008) {
myself.AddTimerEx(1009, 1000);

} else if (timer_id == 1009) {
if (myself.i_ai0 < 39999) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 39999) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30000) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30020) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2500) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30021) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30022) {
if (myself.GetCurrentTick() - myself.i_quest2 > 15 * 60) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

} else if (myself.i_ai0 == 30023) {
if (myself.GetCurrentTick() - myself.i_quest2 > 15 * 60) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

} else if (myself.i_ai0 == 30024) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30025) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}
myself.AddTimerEx(1010, 10000);

} else if (timer_id == 1010) {
myself.AddTimerEx(1011, 3500);

} else if (timer_id == 1011) {
c0 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 4, 0);

} else {
gg.Announce("앙마는 이미 죽어이따.");

}
myself.AddTimerEx(1012, 1000);

} else if (timer_id == 1012) {
myself.i_ai0 = 39999;
if (myself.i_ai0 < 39999) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 39999) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30000) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30020) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2500) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30021) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30022) {
if (myself.GetCurrentTick() - myself.i_quest2 > 15 * 60) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

} else if (myself.i_ai0 == 30023) {
if (myself.GetCurrentTick() - myself.i_quest2 > 15 * 60) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

} else if (myself.i_ai0 == 30024) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30025) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}
myself.AddTimerEx(3000, 35000);

} else if (timer_id == 1500) {
i0 = myself.InstantZone_GetId();
gg.Castle_GateOpenCloseEx(TDoorName1, 1, i0);
gg.Castle_GateOpenCloseEx(TDoorName2, 1, i0);
gg.Castle_GateOpenCloseEx(TDoorName3, 1, i0);
gg.Castle_GateOpenCloseEx(TDoorName4, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName1A, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName2A, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName3A, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName4A, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName5A, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName6A, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName7A, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName8A, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName1B, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName2B, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName3B, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName4B, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName5B, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName6B, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName7B, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName8B, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName9B, 1, i0);
gg.Castle_GateOpenCloseEx(WallDoorName10B, 1, i0);
myself.AddTimerEx(1000, 4000);

} else if (timer_id == 2000) {
myself.RemoveAllDesire();
myself.AddEffectActionDesire(myself.sm, 4, 7000, 10000000);
myself.AddTimerEx(2001, 7000);

} else if (timer_id == 2001) {
myself.AddTimerEx(2002, 1000);

} else if (timer_id == 2002) {
myself.RemoveAllDesire();
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 10000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}
myself.AddTimerEx(2003, 4000);

} else if (timer_id == 5000) {
myself.AddEffectActionDesire(myself.sm, 3, 3 * 1000 / 30, 50);

} else if (timer_id == 6000) {
gg.SendScriptEvent(myself.sm, 3, 0);

} else if (timer_id == 7000) {
myself.Suicide();

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0, HandlerParam maker0, HandlerParam c2, HandlerParam i2, HandlerParam c3, HandlerParam i3) {
if (script_event_arg1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, "godard32_1713_101m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
if (script_event_arg2 <= 0) {

} else {
myself.i_ai3 = script_event_arg2;

}
myself.i_ai0 = script_event_arg1;
if (myself.i_ai9 == 1) {
myself.AddTimerEx(1500, 30 * 1000);

} else {
myself.AddTimerEx(1500, 10 * 60 * 1000);

}

} else if (script_event_arg2 == 8) {
myself.AddTimerEx(7000, 7500);

} else if (script_event_arg2 == 50000) {
myself.AddTimerEx(2000, 500);

} else if (script_event_arg1 == 99999999) {
myself.i_ai3 = script_event_arg2;

} else if (script_event_arg1 == 10001032) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, "godard32_1713_102m1");
if (gg.IsNull(maker0) == 0) {
if (myself.i_ai9 == 1) {
myself.Shout("스칼렛 반 할리샤 ID 셑잉");
if (script_event_arg2 <= 0) {
myself.Shout("ID가 머머라니~");

}

}
myself.i_ai7 = script_event_arg2;

}

} else if (script_event_arg1 == 10001033) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, "godard32_1713_102m1");
if (gg.IsNull(maker0) == 0) {
if (myself.i_ai9 == 1) {
myself.Shout("스칼렛 반 할리샤 최종형 ID 셑잉");
if (script_event_arg2 <= 0) {
myself.Shout("ID가 머머라니~");

}

}
myself.i_ai8 = script_event_arg2;

}

}
super;
	}

	protected void DEBUG_AI(HandlerParam reply) {
myself.i_ai9 = reply;
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam maker0) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), "godard32_1713_105m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
	}


}