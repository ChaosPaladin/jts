package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss09_bereth_main extends ai_boss09_bereth_behavior {
	protected int GM_ID = 11;
	protected int is_key = 1;
	protected int IsAggressive = 1;
	protected double Aggressive_Time = 0.000000;

	protected void CREATED(HandlerParam reply, HandlerParam i0, HandlerParam maker0, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam i10) {
myself.i_ai3 = 1;
myself.i_ai2 = 11;
myself.i_quest0 = myself.GetCurrentTick();
myself.i_quest5 = 0;
myself.i_ai7 = 0;
myself.i_ai8 = 1;
myself.i_ai9 = 0;
myself.i_quest1 = -1;
if (reply == 0) {
if (GM_ID == -1) {
return;

} else {
myself.SetDBValue(myself.sm, 0);
myself.RegisterGlobalMap(GM_BERETH_HP, 0);
gg.RegisterDBSavingMap(1109244, 0);

}
gg.Castle_GateOpenClose2("beres_door_003", 0);
gg.Castle_GateOpenClose2("beres_door_001", 1);

} else {
if (myself.sm.db_value == 0) {

} else if (myself.sm.db_value == 1) {
myself.AddTimerEx(1000, 10 * 60 * 1000);

} else if (myself.sm.db_value == 2) {
myself.i_quest0 = myself.GetCurrentTick();
myself.AddTimerEx(1999, 1000);

} else if (myself.sm.db_value == 3) {
myself.i_quest0 = myself.GetCurrentTick();
myself.RegisterGlobalMap(GM_BERETH_HP, gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100));
gg.LoadDBSavingMap(myself.sm, 1109244);
if (myself.i_ai9 == 1) {
myself.Shout("복구상황" + gg.IntToStr(myself.i_quest5));

}
if (myself.i_quest5 == 10) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 9) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 8) {
myself.i_quest6 = 1;
myself.i_quest7 = 0;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 7) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 6) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 5) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 4) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 3) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 2) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 1) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);

} else if (myself.i_quest5 == 0) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 0;

}
if (myself.i_quest6 == 1) {
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
if (myself.i_quest5 < 10) {
myself.AddTimerEx(2009, 3000);

}

}

} else {
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1109238, 0, 0);

}

}
if (myself.i_quest7 == 1) {
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else {
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1109238, 0, 0);

}

}
if (myself.i_quest8 == 1) {
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else {
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1109238, 0, 0);

}

}
if (myself.i_quest9 == 1) {
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else {
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1109238, 0, 0);

}

}
if (myself.i_quest5 < 10) {
myself.InstantTeleport(myself.sm, 12834, 215614, -9448);

} else {
myself.InstantRandomTeleportInMyTerritory();

}

}
gg.Castle_GateOpenClose2("beres_door_003", 1);
gg.Castle_GateOpenClose2("beres_door_001", 1);

}
myself.RegisterGlobalMap(GM_ID, myself.sm.id);
myself.AddTimerEx(5101, 60 * 1000);
super;
	}

	protected void NO_DESIRE() {
if (myself.i_ai7 == 0) {

} else {
super;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam i5, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam i10, HandlerParam i11) {
if (timer_id == 1000) {
myself.SetDBValue(myself.sm, 2);
myself.CreateOnePrivateEx(1029120, "ai_boss09_beres_camera01", 0, 0, 16326, 212940, -9352, 0, 0, 0, 0);

} else if (timer_id == 1010) {
gg.InstantTeleportEx(myself.sm, 13500, 213140, -9352, 48384);

} else if (timer_id == 1020) {
gg.InstantTeleportEx(myself.sm, 16321, 214818, -9352, -16384);
myself.AddEffectActionDesire2(myself.sm, 2, 331 * 1000 / 30, 10000000, 6000);

} else if (timer_id == 1030) {
myself.AddUseSkillDesire(myself.sm, display_magic1, 1, 1, 1000000);

} else if (timer_id == 1040) {
gg.InstantTeleportEx(myself.sm, 16326, 212994, -9352, 48384);
myself.AddUseSkillDesire(myself.sm, display_magic2, 1, 1, 1000000);

} else if (timer_id == 1050) {
if (pos_1 == "pos_default") {

} else {
maker0 = gg.GetNpcMaker(pos_5);
if (gg.IsNull(maker0) != 0) {

} else {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}

} else if (timer_id == 1060) {
myself.AddEffectActionDesire2(myself.sm, 3, 106 * 1000 / 30, 10000000, 6000);

} else if (timer_id == 1070) {
myself.AddUseSkillDesire(myself.sm, display_magic3, 1, 1, 1000000);
myself.AddTimerEx(1080, 5000);

} else if (timer_id == 1080) {
myself.SetVisible(0);
myself.InstantTeleport(myself.sm, 12834, 215614, -9448);
myself.i_ai8 = 0;
if (myself.i_quest5 == 10) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 9) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 8) {
myself.i_quest6 = 1;
myself.i_quest7 = 0;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 7) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 6) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 5) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 4) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 3) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 2) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 1) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);

} else if (myself.i_quest5 == 0) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 0;

}
myself.SetDBValue(myself.sm, 3);
myself.i_quest0 = myself.GetCurrentTick();
myself.AddTimerEx(1999, 60 * 1000);
myself.i_ai7 = 1;
if (myself.i_ai9 == 1) {
myself.Shout(gg.IntToStr(myself.i_quest5));

}

} else if (timer_id == 1999) {
myself.SetVisible(1);
myself.i_quest5 = myself.i_quest5 + 1;
if (myself.i_quest6 == 1) {
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
if (myself.i_quest5 < 10) {
myself.AddTimerEx(2009, 3000);

}

}

} else {
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1109238, 0, 0);

}

}
if (myself.i_quest7 == 1) {
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else {
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1109238, 0, 0);

}

}
if (myself.i_quest8 == 1) {
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else {
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1109238, 0, 0);

}

}
if (myself.i_quest9 == 1) {
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else {
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1109238, 0, 0);

}

}
if (myself.i_ai9 == 1) {
myself.Shout("전투시작");

}

} else if (timer_id == 2009) {
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1109241, gg.Rand(16), 0);

}

} else if (timer_id == 8999) {
myself.Suicide();

} else if (timer_id == 9900) {
myself.AddTimerEx(9901, 3000);

} else if (timer_id == 9901) {
myself.AddEffectActionDesire2(myself.sm, 5, 546 * 1000 / 30, 10000000, 6000);

} else if (timer_id == 9910) {
myself.CreateOnePrivateEx(1029128, "ai_boss09_beres_elf_npc", 0, 0, 16325, 213136, -9352 + 100, -16384, 0, 0, 0);
myself.SetVisible(0);

}
if (timer_id == 5100) {
myself.SetVisible(1);
myself.i_ai8 = 1;
if (myself.i_quest6 == 1) {
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
if (myself.i_quest5 < 10) {
myself.AddTimerEx(2009, 3000);

}

}

} else {
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1109238, 0, 0);

}

}
if (myself.i_quest7 == 1) {
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else {
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1109238, 0, 0);

}

}
if (myself.i_quest8 == 1) {
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else {
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1109238, 0, 0);

}

}
if (myself.i_quest9 == 1) {
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

} else {
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1109238, 0, 0);

}

}
myself.BroadcastScriptEventEx(1109240, 0, 0, 8000);
if (myself.i_quest5 == 10) {
myself.InstantRandomTeleportInMyTerritory();

}

}
if (timer_id == 5101) {
if (myself.sm.db_value == 3 && myself.sm.alive != 0) {
if (myself.GetCurrentTick() - myself.i_quest0 > 15 * 60) {
myself.SetDBValue(myself.sm, 0);
myself.RemoveAllDesire();
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.StopMove();
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, 208803, -3691, 150);
myself.InstantTeleport(myself.sm, -105200, -253104, -15264);
gg.Castle_GateOpenClose2("beres_door_003", 0);
gg.Castle_GateOpenClose2("beres_door_001", 1);
myself.i_ai2 = 11;
myself.i_ai7 = 0;
myself.SetDBValue(myself.sm, 0);
gg.RegisterDBSavingMap(1109244, 0);

}

}
myself.AddTimerEx(5101, 60 * 1000);

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id) {
if (skill_name_id == display_magic3) {

} else if (myself.i_ai8 == 0) {
return;

}
super;
	}

	protected void LOAD_DBSAVING_MAP_RETURNED(HandlerParam talker, HandlerParam i0, HandlerParam i1) {
if (i0 == 1109244) {
myself.i_quest5 = i1;

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i5, HandlerParam i6, HandlerParam maker0, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam i10) {
if (myself.sm.db_value == 3) {
myself.i_quest0 = myself.GetCurrentTick();

}
if (is_key == 1) {
if (myself.sm.db_value == 3) {
if (myself.i_ai3 == 1) {
super;

}

}

}
i3 = gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100);
if (i3 > 2 && i3 < 50) {
if (gg.Rand(100) < 2) {
myself.BroadcastScriptEvent(1109239, 0, 1000);

}

} else if (i3 <= 0) {
if (myself.i_ai3 == 1) {
myself.i_ai3 = 0;
myself.i_quest1 = attacker.id;
myself.RemoveAllDesire();
gg.InstantTeleportEx(myself.sm, 16325, 213136, -9352, -16384);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.AddTimerEx(8999, 1000);
return;

}

}
i1 = gg.OwnItemCount(attacker, 57);
i2 = gg.OwnItemCount(attacker, 6651);
if (i1 == 1981 && i2 == 1980) {
if (myself.i_ai3 == 1) {
myself.i_ai3 = 0;
myself.i_quest1 = attacker.id;
myself.RemoveAllDesire();
gg.InstantTeleportEx(myself.sm, 16325, 213136, -9352, -16384);
myself.AddTimerEx(8999, 1000);
return;

}

} else if (i1 == 1979 && i2 == 1980) {
myself.AddEffectActionDesire(myself.sm, 2, 331 * 1000 / 30, 10000000);

} else if (i1 == 1978 && i2 == 1980) {
myself.AddEffectActionDesire(myself.sm, 5, 546 * 1000 / 30, 10000000);

} else if (i1 == 1977 && i2 == 1980) {
myself.AddUseSkillDesire(myself.sm, display_magic1, 1, 0, 1000000);

} else if (i1 == 1976 && i2 == 1980) {
myself.AddUseSkillDesire(myself.sm, display_magic2, 1, 0, 1000000);

} else if (i1 == 1975 && i2 == 1980) {
myself.AddUseSkillDesire(myself.sm, display_magic3, 1, 0, 1000000);

}
if (myself.sm.db_value == 3 && myself.sm.alive != 0) {
if (myself.i_quest5 == 10) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 9) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 8) {
myself.i_quest6 = 1;
myself.i_quest7 = 0;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 7) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 6) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 5) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 4) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 3) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 2) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 1) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);

} else if (myself.i_quest5 == 0) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 0;

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker) {
if (myself.sm.db_value == 3) {
myself.i_quest0 = myself.GetCurrentTick();

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i5, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam i10, HandlerParam maker0) {
if (script_event_arg1 == 1109227) {
myself.AddTimerEx(1000, 1);

} else if (script_event_arg1 == 1109228) {
myself.SetDBValue(myself.sm, 1);
myself.AddTimerEx(1000, 10 * 60 * 1000);

} else if (script_event_arg1 == 1109229) {
myself.AddTimerEx(1010, script_event_arg2);

} else if (script_event_arg1 == 1109230) {
myself.AddTimerEx(1020, script_event_arg2);

} else if (script_event_arg1 == 1109231) {
myself.AddTimerEx(1030, script_event_arg2);

} else if (script_event_arg1 == 1109232) {
myself.AddTimerEx(1040, script_event_arg2);

} else if (script_event_arg1 == 1109233) {
myself.AddTimerEx(1050, script_event_arg2);

} else if (script_event_arg1 == 1109234) {
myself.AddTimerEx(1060, script_event_arg2);

} else if (script_event_arg1 == 1109235) {
myself.AddTimerEx(1070, script_event_arg2);

} else if (script_event_arg1 == 1109236) {
myself.AddTimerEx(9900, script_event_arg2);

} else if (script_event_arg1 == 1109237) {
myself.AddTimerEx(9910, script_event_arg2);

} else if (script_event_arg1 == 1109242) {
if (myself.i_ai9 == 1) {
myself.Shout("현재상태 변화" + gg.IntToStr(myself.i_quest5));

}
myself.i_quest5 = myself.i_quest5 + 1;
if (myself.i_quest5 == 10) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 9) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 8) {
myself.i_quest6 = 1;
myself.i_quest7 = 0;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 7) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 6) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 5) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 4) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 1;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 3) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 1;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 2) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);
myself.i_ai8 = 0;
gg.RegisterDBSavingMap(1109244, 0);
myself.AddTimerEx(5100, 60 * 1000);
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

} else if (myself.i_quest5 == 1) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 0;
gg.RegisterDBSavingMap(1109244, myself.i_quest5);

} else if (myself.i_quest5 == 0) {
myself.i_quest6 = 1;
myself.i_quest7 = 1;
myself.i_quest8 = 0;
myself.i_quest9 = 0;

}
if (myself.i_ai9 == 1) {
myself.Shout("전투패턴 변경 : " + gg.IntToStr(myself.i_quest5));

}

} else if (script_event_arg1 == 1109243) {
if (myself.sm.db_value == 3) {
myself.i_quest0 = myself.GetCurrentTick();

}

}
super;
	}

	protected void DEBUG_AI(HandlerParam talker, HandlerParam reply) {
if (reply == 1) {
myself.i_ai9 = 1;

} else if (reply == 0) {
myself.i_ai9 = 0;

}
	}

	protected void MY_DYING(HandlerParam maker0, HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
myself.SetDBValue(myself.sm, 0);
gg.RegisterDBSavingMap(1109244, 0);
myself.CreateOnePrivateEx(1029123, "ai_boss09_beres_camera04", 0, 0, 16325, 213136, -9352, 0, 0, 0, 0);
myself.EffectMusic(myself.sm, 10000, "BS07_D");
maker0 = gg.GetNpcMaker(pos_1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker(pos_4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio12_2024_002m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
c1 = gg.GetCreatureFromID(myself.i_quest1);
if (myself.IsNullCreature(c1) == 0) {
if (c1.master) {
c1 = c1.master;

}
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
i1 = gg.Party_GetCount(c1);
if (i1 == 0) {
if (gg.HaveMemo(c1, 350) && myself.DistFromMe(c1) <= 1500) {
i3 = gg.Rand(1000);
if (i3 < 100) {
if (gg.OwnItemCount(c1, 4651) + gg.OwnItemCount(c1, 4652) + gg.OwnItemCount(c1, 4653) + gg.OwnItemCount(c1, 4654) + gg.OwnItemCount(c1, 4655) + gg.OwnItemCount(c1, 4656) + gg.OwnItemCount(c1, 4657) + gg.OwnItemCount(c1, 4658) + gg.OwnItemCount(c1, 4659) + gg.OwnItemCount(c1, 4660) + gg.OwnItemCount(c1, 4661) + gg.OwnItemCount(c1, 5579) + gg.OwnItemCount(c1, 5582) + gg.OwnItemCount(c1, 5914) + gg.OwnItemCount(c1, 4629) + gg.OwnItemCount(c1, 4630) + gg.OwnItemCount(c1, 4631) + gg.OwnItemCount(c1, 4632) + gg.OwnItemCount(c1, 4633) + gg.OwnItemCount(c1, 4634) + gg.OwnItemCount(c1, 4635) + gg.OwnItemCount(c1, 4636) + gg.OwnItemCount(c1, 4637) + gg.OwnItemCount(c1, 4638) + gg.OwnItemCount(c1, 4639) + gg.OwnItemCount(c1, 5577) + gg.OwnItemCount(c1, 5580) + gg.OwnItemCount(c1, 5908) + gg.OwnItemCount(c1, 4640) + gg.OwnItemCount(c1, 4641) + gg.OwnItemCount(c1, 4642) + gg.OwnItemCount(c1, 4643) + gg.OwnItemCount(c1, 4644) + gg.OwnItemCount(c1, 4645) + gg.OwnItemCount(c1, 4646) + gg.OwnItemCount(c1, 4647) + gg.OwnItemCount(c1, 4648) + gg.OwnItemCount(c1, 4649) + gg.OwnItemCount(c1, 4650) + gg.OwnItemCount(c1, 5578) + gg.OwnItemCount(c1, 5581) + gg.OwnItemCount(c1, 5911) + gg.OwnItemCount(c1, 9571) + gg.OwnItemCount(c1, 10161) + gg.OwnItemCount(c1, 9570) + gg.OwnItemCount(c1, 10160) + gg.OwnItemCount(c1, 9572) + gg.OwnItemCount(c1, 10162) + gg.OwnItemCount(c1, 10482) + gg.OwnItemCount(c1, 10481) + gg.OwnItemCount(c1, 10480) + gg.OwnItemCount(c1, 13072) + gg.OwnItemCount(c1, 13073) + gg.OwnItemCount(c1, 13071) + gg.OwnItemCount(c1, 15542) + gg.OwnItemCount(c1, 15543) + gg.OwnItemCount(c1, 15541) == 1) {
if (gg.OwnItemCount(c1, 9571) == 1) {
myself.DeleteItem1(c1, 9571, 1);
myself.GiveItem1(c1, 10481, 1);
gg.AddLog(6, c1, 10481);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c1, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, c1.name, gg.IntToStr(15), "", "", ""));

} else if (gg.OwnItemCount(c1, 9572) == 1) {
myself.DeleteItem1(c1, 9572, 1);
myself.GiveItem1(c1, 10482, 1);
gg.AddLog(6, c1, 10482);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c1, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, c1.name, gg.IntToStr(15), "", "", ""));

} else if (gg.OwnItemCount(c1, 9570) == 1) {
myself.DeleteItem1(c1, 9570, 1);
myself.GiveItem1(c1, 10480, 1);
gg.AddLog(6, c1, 10480);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c1, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, c1.name, gg.IntToStr(15), "", "", ""));

} else if (gg.OwnItemCount(c1, 10481) == 1) {
myself.DeleteItem1(c1, 10481, 1);
myself.GiveItem1(c1, 13072, 1);
gg.AddLog(6, c1, 13072);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c1, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, c1.name, gg.IntToStr(16), "", "", ""));

} else if (gg.OwnItemCount(c1, 10482) == 1) {
myself.DeleteItem1(c1, 10482, 1);
myself.GiveItem1(c1, 13073, 1);
gg.AddLog(6, c1, 13073);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c1, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, c1.name, gg.IntToStr(16), "", "", ""));

} else if (gg.OwnItemCount(c1, 10480) == 1) {
myself.DeleteItem1(c1, 10480, 1);
myself.GiveItem1(c1, 13071, 1);
gg.AddLog(6, c1, 13071);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c1, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, c1.name, gg.IntToStr(16), "", "", ""));

} else if (gg.OwnItemCount(c1, 13072) >= 1 || gg.OwnItemCount(c1, 13073) >= 1 || gg.OwnItemCount(c1, 13071) >= 1) {
myself.ShowSystemMessage(c1, 978);

} else {
myself.ShowSystemMessage(c1, 1264);

}

} else if (gg.OwnItemCount(c1, 4651) + gg.OwnItemCount(c1, 4652) + gg.OwnItemCount(c1, 4653) + gg.OwnItemCount(c1, 4654) + gg.OwnItemCount(c1, 4655) + gg.OwnItemCount(c1, 4656) + gg.OwnItemCount(c1, 4657) + gg.OwnItemCount(c1, 4658) + gg.OwnItemCount(c1, 4659) + gg.OwnItemCount(c1, 4660) + gg.OwnItemCount(c1, 4661) + gg.OwnItemCount(c1, 5579) + gg.OwnItemCount(c1, 5582) + gg.OwnItemCount(c1, 5914) + gg.OwnItemCount(c1, 4629) + gg.OwnItemCount(c1, 4630) + gg.OwnItemCount(c1, 4631) + gg.OwnItemCount(c1, 4632) + gg.OwnItemCount(c1, 4633) + gg.OwnItemCount(c1, 4634) + gg.OwnItemCount(c1, 4635) + gg.OwnItemCount(c1, 4636) + gg.OwnItemCount(c1, 4637) + gg.OwnItemCount(c1, 4638) + gg.OwnItemCount(c1, 4639) + gg.OwnItemCount(c1, 5577) + gg.OwnItemCount(c1, 5580) + gg.OwnItemCount(c1, 5908) + gg.OwnItemCount(c1, 4640) + gg.OwnItemCount(c1, 4641) + gg.OwnItemCount(c1, 4642) + gg.OwnItemCount(c1, 4643) + gg.OwnItemCount(c1, 4644) + gg.OwnItemCount(c1, 4645) + gg.OwnItemCount(c1, 4646) + gg.OwnItemCount(c1, 4647) + gg.OwnItemCount(c1, 4648) + gg.OwnItemCount(c1, 4649) + gg.OwnItemCount(c1, 4650) + gg.OwnItemCount(c1, 5578) + gg.OwnItemCount(c1, 5581) + gg.OwnItemCount(c1, 5911) + gg.OwnItemCount(c1, 9571) + gg.OwnItemCount(c1, 10161) + gg.OwnItemCount(c1, 9570) + gg.OwnItemCount(c1, 10160) + gg.OwnItemCount(c1, 9572) + gg.OwnItemCount(c1, 10162) + gg.OwnItemCount(c1, 10481) + gg.OwnItemCount(c1, 10482) + gg.OwnItemCount(c1, 10480) + gg.OwnItemCount(c1, 13072) + gg.OwnItemCount(c1, 13073) + gg.OwnItemCount(c1, 13071) + gg.OwnItemCount(c1, 15542) + gg.OwnItemCount(c1, 15543) + gg.OwnItemCount(c1, 15541) >= 2) {
myself.ShowSystemMessage(c1, 977);

} else {
myself.ShowSystemMessage(c1, 1265);

}

}

}

} else {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = gg.Party_GetCreature(c1, i0);
if (gg.HaveMemo(c0, 350) && myself.DistFromMe(c0) <= 1500) {
i3 = gg.Rand(1000);
if (i3 < 100) {
if (gg.OwnItemCount(c0, 4651) + gg.OwnItemCount(c0, 4652) + gg.OwnItemCount(c0, 4653) + gg.OwnItemCount(c0, 4654) + gg.OwnItemCount(c0, 4655) + gg.OwnItemCount(c0, 4656) + gg.OwnItemCount(c0, 4657) + gg.OwnItemCount(c0, 4658) + gg.OwnItemCount(c0, 4659) + gg.OwnItemCount(c0, 4660) + gg.OwnItemCount(c0, 4661) + gg.OwnItemCount(c0, 5579) + gg.OwnItemCount(c0, 5582) + gg.OwnItemCount(c0, 5914) + gg.OwnItemCount(c0, 4629) + gg.OwnItemCount(c0, 4630) + gg.OwnItemCount(c0, 4631) + gg.OwnItemCount(c0, 4632) + gg.OwnItemCount(c0, 4633) + gg.OwnItemCount(c0, 4634) + gg.OwnItemCount(c0, 4635) + gg.OwnItemCount(c0, 4636) + gg.OwnItemCount(c0, 4637) + gg.OwnItemCount(c0, 4638) + gg.OwnItemCount(c0, 4639) + gg.OwnItemCount(c0, 5577) + gg.OwnItemCount(c0, 5580) + gg.OwnItemCount(c0, 5908) + gg.OwnItemCount(c0, 4640) + gg.OwnItemCount(c0, 4641) + gg.OwnItemCount(c0, 4642) + gg.OwnItemCount(c0, 4643) + gg.OwnItemCount(c0, 4644) + gg.OwnItemCount(c0, 4645) + gg.OwnItemCount(c0, 4646) + gg.OwnItemCount(c0, 4647) + gg.OwnItemCount(c0, 4648) + gg.OwnItemCount(c0, 4649) + gg.OwnItemCount(c0, 4650) + gg.OwnItemCount(c0, 5578) + gg.OwnItemCount(c0, 5581) + gg.OwnItemCount(c0, 5911) + gg.OwnItemCount(c0, 9571) + gg.OwnItemCount(c0, 10161) + gg.OwnItemCount(c0, 9570) + gg.OwnItemCount(c0, 10160) + gg.OwnItemCount(c0, 9572) + gg.OwnItemCount(c0, 10162) + gg.OwnItemCount(c0, 10482) + gg.OwnItemCount(c0, 10481) + gg.OwnItemCount(c0, 10480) + gg.OwnItemCount(c0, 13072) + gg.OwnItemCount(c0, 13073) + gg.OwnItemCount(c0, 13071) + gg.OwnItemCount(c0, 15542) + gg.OwnItemCount(c0, 15543) + gg.OwnItemCount(c0, 15541) == 1) {
if (gg.OwnItemCount(c0, 9571) == 1) {
myself.DeleteItem1(c0, 9571, 1);
myself.GiveItem1(c0, 10481, 1);
gg.AddLog(6, c0, 10481);
myself.SoundEffect(c0, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c0, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, c0.name, gg.IntToStr(15), "", "", ""));

} else if (gg.OwnItemCount(c0, 9572) == 1) {
myself.DeleteItem1(c0, 9572, 1);
myself.GiveItem1(c0, 10482, 1);
gg.AddLog(6, c0, 10482);
myself.SoundEffect(c0, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c0, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, c0.name, gg.IntToStr(15), "", "", ""));

} else if (gg.OwnItemCount(c0, 9570) == 1) {
myself.DeleteItem1(c0, 9570, 1);
myself.GiveItem1(c0, 10480, 1);
gg.AddLog(6, c0, 10480);
myself.SoundEffect(c0, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c0, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, c0.name, gg.IntToStr(15), "", "", ""));

} else if (gg.OwnItemCount(c0, 10481) == 1) {
myself.DeleteItem1(c0, 10481, 1);
myself.GiveItem1(c0, 13072, 1);
gg.AddLog(6, c0, 13072);
myself.SoundEffect(c0, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c0, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, c0.name, gg.IntToStr(16), "", "", ""));

} else if (gg.OwnItemCount(c0, 10482) == 1) {
myself.DeleteItem1(c0, 10482, 1);
myself.GiveItem1(c0, 13073, 1);
gg.AddLog(6, c0, 13073);
myself.SoundEffect(c0, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c0, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, c0.name, gg.IntToStr(16), "", "", ""));

} else if (gg.OwnItemCount(c0, 10480) == 1) {
myself.DeleteItem1(c0, 10480, 1);
myself.GiveItem1(c0, 13071, 1);
gg.AddLog(6, c0, 13071);
myself.SoundEffect(c0, "ItemSound.quest_itemget");
myself.ShowSystemMessage(c0, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, c0.name, gg.IntToStr(16), "", "", ""));

} else if (gg.OwnItemCount(c0, 13072) >= 1 || gg.OwnItemCount(c0, 13073) >= 1 || gg.OwnItemCount(c0, 13071) >= 1) {
myself.ShowSystemMessage(c0, 978);

} else {
myself.ShowSystemMessage(c0, 1264);

}

} else if (gg.OwnItemCount(c0, 4651) + gg.OwnItemCount(c0, 4652) + gg.OwnItemCount(c0, 4653) + gg.OwnItemCount(c0, 4654) + gg.OwnItemCount(c0, 4655) + gg.OwnItemCount(c0, 4656) + gg.OwnItemCount(c0, 4657) + gg.OwnItemCount(c0, 4658) + gg.OwnItemCount(c0, 4659) + gg.OwnItemCount(c0, 4660) + gg.OwnItemCount(c0, 4661) + gg.OwnItemCount(c0, 5579) + gg.OwnItemCount(c0, 5582) + gg.OwnItemCount(c0, 5914) + gg.OwnItemCount(c0, 4629) + gg.OwnItemCount(c0, 4630) + gg.OwnItemCount(c0, 4631) + gg.OwnItemCount(c0, 4632) + gg.OwnItemCount(c0, 4633) + gg.OwnItemCount(c0, 4634) + gg.OwnItemCount(c0, 4635) + gg.OwnItemCount(c0, 4636) + gg.OwnItemCount(c0, 4637) + gg.OwnItemCount(c0, 4638) + gg.OwnItemCount(c0, 4639) + gg.OwnItemCount(c0, 5577) + gg.OwnItemCount(c0, 5580) + gg.OwnItemCount(c0, 5908) + gg.OwnItemCount(c0, 4640) + gg.OwnItemCount(c0, 4641) + gg.OwnItemCount(c0, 4642) + gg.OwnItemCount(c0, 4643) + gg.OwnItemCount(c0, 4644) + gg.OwnItemCount(c0, 4645) + gg.OwnItemCount(c0, 4646) + gg.OwnItemCount(c0, 4647) + gg.OwnItemCount(c0, 4648) + gg.OwnItemCount(c0, 4649) + gg.OwnItemCount(c0, 4650) + gg.OwnItemCount(c0, 5578) + gg.OwnItemCount(c0, 5581) + gg.OwnItemCount(c0, 5911) + gg.OwnItemCount(c0, 9571) + gg.OwnItemCount(c0, 10161) + gg.OwnItemCount(c0, 9570) + gg.OwnItemCount(c0, 10160) + gg.OwnItemCount(c0, 9572) + gg.OwnItemCount(c0, 10162) + gg.OwnItemCount(c0, 10481) + gg.OwnItemCount(c0, 10482) + gg.OwnItemCount(c0, 10480) + gg.OwnItemCount(c0, 13072) + gg.OwnItemCount(c0, 13073) + gg.OwnItemCount(c0, 13071) + gg.OwnItemCount(c0, 15542) + gg.OwnItemCount(c0, 15543) + gg.OwnItemCount(c0, 15541) >= 2) {
myself.ShowSystemMessage(c0, 977);

} else {
myself.ShowSystemMessage(c0, 1265);

}

}

}

}

}

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam f0, HandlerParam i0, HandlerParam h0, HandlerParam i2, HandlerParam c0) {
if (myself.sm.db_value == 3) {
if (myself.i_ai8 == 0) {
return;

} else {
super;

}

} else {
return;

}
	}


}