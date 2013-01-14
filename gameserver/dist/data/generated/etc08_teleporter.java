package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class etc08_teleporter extends teleporter {
	protected String fnHi = "tp_teleporter001.htm";
	protected int isThemePark = 1;
	protected String show_makeName = "etc08_npc1816_01m1";
	protected String parade_makeName_A = "etc08_npc1816_02m";
	protected String parade_makeName_B = "etc08_npc1816_03m";
	protected String parade_makeName_C = "etc08_npc1816_04m";
	protected String parade_makeName_D = "etc08_npc1816_05m";
	protected String parade_makeName_E = "etc08_npc1816_06m";
	protected String paradeMusic_makeName_A = "etc08_npc1816_07m1";
	protected String paradeMusic_makeName_B = "etc08_npc1816_08m1";
	protected String paradeMusic_makeName_C = "etc08_npc1816_09m1";
	protected String paradeMusic_makeName_D = "etc08_npc1816_10m1";
	protected String paradeMusic_makeName_E = "etc08_npc1816_11m1";

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.AddTimerEx(1111, 1000);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam quest_id) {
if (ask == -1816) {
if (reply == 1) {
i0 = gg.GetMemoStateEx(talker, 255, 1);
i1 = i0 / 1000000;
if (i1 >= 100) {
i1 = i1 % 100;

}
if (i1 < 0) {
i1 = 0;

}
if (i1 == 0) {
myself.InstantTeleport(talker, 43835, -47749, -792);

}
if (i1 == 1) {
myself.InstantTeleport(talker, -12787, 122779, -3114);

} else if (i1 == 2) {
myself.InstantTeleport(talker, -80684, 149770, -3043);

} else if (i1 == 3) {
myself.InstantTeleport(talker, 15472, 142880, -2699);

} else if (i1 == 4) {
myself.InstantTeleport(talker, 83551, 147945, -3400);

} else if (i1 == 5) {
myself.InstantTeleport(talker, 82971, 53207, -1470);

} else if (i1 == 6) {
myself.InstantTeleport(talker, 117088, 76931, -2670);

} else if (i1 == 7) {
myself.InstantTeleport(talker, 146783, 25808, -2000);

} else if (i1 == 8) {
myself.InstantTeleport(talker, 111455, 219400, -3546);

} else if (i1 == 9) {
myself.InstantTeleport(talker, 46911, 49441, -3056);

} else if (i1 == 10) {
myself.InstantTeleport(talker, 148024, -55281, -2728);

} else if (i1 == 11) {
myself.InstantTeleport(talker, 43835, -47749, -792);

} else if (i1 == 12) {
myself.InstantTeleport(talker, 87126, -143520, -1288);

} else if (i1 == 13) {
myself.InstantTeleport(talker, -84752, 243122, -3728);

} else if (i1 == 14) {
myself.InstantTeleport(talker, 11179, 15848, -4584);

} else if (i1 == 15) {
myself.InstantTeleport(talker, 17441, 170434, -3504);

} else if (i1 == 16) {
myself.InstantTeleport(talker, -44132, -113766, -240);

} else if (i1 == 17) {
myself.InstantTeleport(talker, 114976, -178774, -856);

} else if (i1 == 18) {
myself.InstantTeleport(talker, -119377, 47000, 360);

} else {
myself.Say(gg.MakeFString(1600019, "", "", "", "", ""));

}
i1 = i1 * 1000000;
myself.SetMemoStateEx(talker, 255, 1, i0 - i1);

}
if (reply == 2) {
if (gg.Rand(4) < 1) {
myself.InstantTeleport(talker, -81896, -49589, -10352);

} else if (gg.Rand(3) < 1) {
myself.InstantTeleport(talker, -82271, -49196, -10352);

} else if (gg.Rand(2) < 1) {
myself.InstantTeleport(talker, -81886, -48784, -10352);

} else {
myself.InstantTeleport(talker, -81490, -49167, -10352);

}

}
if (reply == 3) {
i3 = gg.Rand(3) + 1;
if (i3 == 1) {
myself.InstantTeleport(talker, -70411, -70958, -1416);

} else if (i3 == 2) {
myself.InstantTeleport(talker, -70522, -71026, -1416);

} else {
myself.InstantTeleport(talker, -70293, -71029, -1416);

}

}
if (reply == 4) {
myself.ShowMultisell(643, talker);

}
if (reply == 5) {
myself.InstantTeleport(talker, -57328, -60566, -2320);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam i0) {
if (timer_id == 1111) {

}
if (timer_id == 2222) {
for (i0 = 1; i0 <= 150; i0 = i0 + 1) {
maker0 = gg.GetNpcMaker(parade_makeName_A + gg.IntToStr(i0));
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 101010, 0, 0);

}

}
maker0 = gg.GetNpcMaker(paradeMusic_makeName_A);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 101010, 0, 0);

}
myself.AddTimerEx(3333, 20 * 1000);

}
if (timer_id == 3333) {
for (i0 = 1; i0 <= 150; i0 = i0 + 1) {
maker0 = gg.GetNpcMaker(parade_makeName_B + gg.IntToStr(i0));
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 101010, 0, 0);

}

}
maker0 = gg.GetNpcMaker(paradeMusic_makeName_B);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 101010, 0, 0);

}
myself.AddTimerEx(4444, 20 * 1000);

}
if (timer_id == 4444) {
for (i0 = 1; i0 <= 150; i0 = i0 + 1) {
maker0 = gg.GetNpcMaker(parade_makeName_C + gg.IntToStr(i0));
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 101010, 0, 0);

}

}
maker0 = gg.GetNpcMaker(paradeMusic_makeName_C);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 101010, 0, 0);

}
myself.AddTimerEx(5555, 20 * 1000);

}
if (timer_id == 5555) {
for (i0 = 1; i0 <= 150; i0 = i0 + 1) {
maker0 = gg.GetNpcMaker(parade_makeName_D + gg.IntToStr(i0));
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 101010, 0, 0);

}

}
maker0 = gg.GetNpcMaker(paradeMusic_makeName_D);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 101010, 0, 0);

}
myself.AddTimerEx(6666, 20 * 1000);

}
if (timer_id == 6666) {
for (i0 = 1; i0 <= 150; i0 = i0 + 1) {
maker0 = gg.GetNpcMaker(parade_makeName_E + gg.IntToStr(i0));
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 101010, 0, 0);

}

}
maker0 = gg.GetNpcMaker(paradeMusic_makeName_E);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 101010, 0, 0);

}
myself.AddTimerEx(7777, 60 * 1000);

}
if (timer_id == 7777) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam maker0, HandlerParam i0) {
	}


}