package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_cleft_gate extends citizen {
	protected String fnHi = "cleft_gate001.htm";
	protected String fnNoEnter = "cleft_gate002.htm";
	protected String fnInfo = "cleft_gate003.htm";
	protected String fnNotEnoughLevel = "cleft_gate0004.htm";
	protected String fnNotActivated = "cleft_inner_gate005.htm";
	protected String fnTimeLimit = "cleft_inner_gate006.htm";
	protected String CleftMakerName0 = "default_cleft_maker_name";
	protected String CleftMakerName1 = "default_cleft_maker_name";
	protected String CleftMakerName2 = "default_cleft_maker_name";
	protected String CleftMakerName3 = "default_cleft_maker_name";
	protected String StarStoneMakerName0 = "rumwarsha16_1325_100m1";
	protected String StarStoneMakerName1 = "rumwarsha16_1325_101m1";
	protected String StarStoneMakerName2 = "rumwarsha16_1325_102m1";
	protected String StarStoneMakerName3 = "rumwarsha16_1325_103m1";
	protected String StarStoneMakerName4 = "rumwarsha16_1325_104m1";
	protected String StarStoneMakerName5 = "rumwarsha16_1325_05m2";
	protected String StarStoneMakerName0_n = "rumwarsha16_1325_100m2";
	protected String StarStoneMakerName1_n = "rumwarsha16_1325_101m2";
	protected String StarStoneMakerName2_n = "rumwarsha16_1325_102m2";
	protected String StarStoneMakerName3_n = "rumwarsha16_1325_103m2";
	protected String StarStoneMakerName4_n = "rumwarsha16_1325_104m2";
	protected int DS_fieldCycle_ID = 2;
	protected int IM_fieldCycle_ID = 3;
	protected int tel_x = -1;
	protected int tel_y = -1;
	protected int tel_z = -1;
	protected int GM_ID = 1325002;

	protected void CREATED() {
myself.CleftManagerEnter();
myself.RegisterGlobalMap(GM_ID, 0);
	}

	protected void TALKED(HandlerParam talker) {
if (NoFnHi == 1) {
return;

}
if (talker.level < 75) {
myself.ShowPage(talker, fnNotEnoughLevel);

} else {
myself.ShowPage(talker, fnHi);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i0 = gg.GetStep_FieldCycle(DS_fieldCycle_ID);
i1 = gg.GetStep_FieldCycle(IM_fieldCycle_ID);
i2 = myself.GetGlobalMap(GM_ID);
if (ask == -200) {
switch (reply) {
case 1: {
if (i0 == 2 || i1 == 3 || i1 == 4 || i1 == 5 && i2 == 0) {
i0 = myself.GetCleftState();
switch (i0) {
case 1: {

}
case 2: {
myself.InstantTeleport(talker, tel_x, tel_y, tel_z);
break;

}
case 3: {
myself.ShowPage(talker, fnNoEnter);
break;

}

}

} else if (i2) {
myself.ShowPage(talker, fnTimeLimit);

} else {
myself.ShowPage(talker, fnNotActivated);

}
break;

}
case 2: {
if (i0 == 2 || i1 == 3 || i1 == 4 || i1 == 5 && i2 == 0) {
i0 = myself.GetCleftState();
switch (i0) {
case 1: {

}
case 2: {
if (myself.IsCleftUser(talker) == 0) {
myself.CleftUserEnter(talker);

} else {
myself.ShowPage(talker, fnNoEnter);

}
break;

}
case 3: {
myself.ShowPage(talker, fnNoEnter);
break;

}

}

} else if (i2) {
myself.ShowPage(talker, fnTimeLimit);

} else {
myself.ShowPage(talker, fnNotActivated);

}
break;

}

}

}
	}

	protected void CLEFT_STATE_CHANGED(HandlerParam maker0, HandlerParam i0, HandlerParam i1) {
switch (myself.GetCleftState()) {
case 1: {
maker0 = gg.GetNpcMaker(StarStoneMakerName0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName0_n);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName1_n);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName2_n);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName3_n);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName4_n);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
break;

}
case 2: {
maker0 = gg.GetNpcMaker(CleftMakerName0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.GetNpcMaker(CleftMakerName1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.GetNpcMaker(CleftMakerName2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.GetNpcMaker(CleftMakerName3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
break;

}
case 3: {
if (myself.GetGlobalMap(GM_ID) == 0) {
myself.RegisterGlobalMap(GM_ID, 1);
myself.AddTimerEx(1325001, 60 * 60 * 1000);

}
maker0 = gg.GetNpcMaker(CleftMakerName0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
maker0 = gg.GetNpcMaker(CleftMakerName1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
maker0 = gg.GetNpcMaker(CleftMakerName2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
maker0 = gg.GetNpcMaker(CleftMakerName3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1325001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName0_n);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName1_n);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName2_n);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName3_n);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.GetNpcMaker(StarStoneMakerName4_n);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
break;

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1325001) {
if (myself.GetGlobalMap(GM_ID) == 1) {
myself.RegisterGlobalMap(GM_ID, 0);

}

}
	}

	protected void MY_DYING() {
myself.UnregisterGlobalMap(GM_ID);
	}


}