package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_main_event_acolyte extends citizen {
	protected int ShoutSysMsg = 0;
	protected int RoomIndex = 0;
	protected int part_type = 1;
	protected String SibylName = "";
	protected int SibylSilhouette = 1030956;
	protected int SibylPosX = 0;
	protected int SibylPosY = 0;
	protected int SibylPosZ = 0;
	protected int escape_x = 1;
	protected int escape_y = 1;
	protected int escape_z = 1;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.InstantTeleportInMyTerritory(escape_x, escape_y, gg.FloatToInt(myself.sm.z), 100);
myself.AddTimerEx(3001, 1000);
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam fhtml0, HandlerParam i0, HandlerParam s0, HandlerParam i1) {
myself.FHTML_SetFileName(fhtml0, fnHi);
i0 = gg.GetDateTime(0, 4);
if (i0 == 58 || i0 == 18 || i0 == 38 || i0 == 59 || i0 == 19 || i0 == 39) {
s0 = gg.MakeFString(1000441, "", "", "", "", "");
myself.FHTML_SetStr(fhtml0, "minute", s0);

} else {
if (i0 > 39) {
i1 = 58 - i0;

} else if (i0 > 19) {
i1 = 38 - i0;

} else {
i1 = 18 - i0;

}
s0 = gg.IntToStr(i1);
s0 = s0 + gg.MakeFString(1000442, "", "", "", "", "");
myself.FHTML_SetStr(fhtml0, "minute", s0);

}
myself.ShowFHTML(talker, fhtml0);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam party0) {
if (gg.OwnItemCount(attacker, 57) == 1980) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0)) {
return;

}
myself.CreateOnePrivateEx(SibylSilhouette, SibylName, 0, 0, SibylPosX, SibylPosY, SibylPosZ, 0, 0, 0, 0);
myself.TeleportParty(party0.id, SibylPosX, SibylPosY, SibylPosZ, 300, part_type * RoomIndex);
myself.Despawn();

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam i0, HandlerParam party0) {
party0 = gg.GetParty(target);
if (myself.IsNullParty(party0)) {
return;

} else {
myself.TeleportParty(party0.id, SibylPosX, SibylPosY, SibylPosZ, 300, part_type * RoomIndex);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam s0, HandlerParam s1, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
if (ask == 505) {
if (reply == 3) {
myself.FHTML_SetFileName(fhtml0, "ssq_main_event_acolyte_q0505_14.htm");
for (i0 = 1; i0 < 4; i0 = i0 + 1) {
if (i0 == 1) {
i1 = 2;

} else if (i0 == 2) {
i1 = 1;

} else if (i0 == 3) {
i1 = 0;
s0 = gg.GetTimeAttackRecordInfo(RoomIndex, i1, 1, 0);
if (gg.StrToInt(s0) == 1) {
myself.FHTML_SetStr(fhtml0, "Winner", gg.MakeFString(1000310, "", "", "", "", ""));

} else if (gg.StrToInt(s0) == 2) {
myself.FHTML_SetStr(fhtml0, "Winner", gg.MakeFString(1000311, "", "", "", "", ""));

} else {
myself.FHTML_SetStr(fhtml0, "Winner", "");

}

}
s0 = gg.GetTimeAttackRecordInfo(RoomIndex, i1, 5, 0);
i2 = gg.StrToInt(s0);
if (i2 == 0) {
myself.FHTML_SetStr(fhtml0, "date" + gg.IntToStr(i0), gg.MakeFString(1000322, "", "", "", "", ""));

} else {
s0 = gg.IntToStr(gg.GetDateTime(i2, 0));
s0 = s0 + "/" + gg.IntToStr(gg.GetDateTime(i2, 1));
s0 = s0 + "/" + gg.IntToStr(gg.GetDateTime(i2, 2));
myself.FHTML_SetStr(fhtml0, "date" + gg.IntToStr(i0), s0);

}
s0 = gg.GetTimeAttackRecordInfo(RoomIndex, i1, 4, 0);
myself.FHTML_SetStr(fhtml0, "score" + gg.IntToStr(i0), s0);
s0 = gg.GetTimeAttackRecordInfo(RoomIndex, i1, 2, 0);
i2 = gg.StrToInt(s0);
for (i3 = 1; i3 <= i2; i3 = i3 + 1) {
s0 = gg.GetTimeAttackRecordInfo(RoomIndex, i1, 3, i3 - 1);
if (i3 > 1) {
s0 = ", " + s0;

}
myself.FHTML_SetStr(fhtml0, "player" + gg.IntToStr(i0) + gg.IntToStr(i3), s0);

}

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 4) {
myself.FHTML_SetFileName(fhtml0, "ssq_main_event_acolyte_q0505_15.htm");
for (i0 = 1; i0 < 6; i0 = i0 + 1) {
i1 = 1000311 + i0;
myself.FHTML_SetStr(fhtml0, "Room" + gg.IntToStr(i0), gg.MakeFString(i1, "", "", "", "", ""));
s0 = gg.GetTimeAttackRecordInfo(i0, 1, 4, 0);
myself.FHTML_SetStr(fhtml0, "Score" + gg.IntToStr(i0) + "1", s0);
s1 = gg.GetTimeAttackRecordInfo(i0, 2, 4, 0);
myself.FHTML_SetStr(fhtml0, "Score" + gg.IntToStr(i0) + "2", s1);
i2 = gg.StrToInt(s0);
i3 = gg.StrToInt(s1);
if (i2 > i3) {
myself.FHTML_SetStr(fhtml0, "Winner" + gg.IntToStr(i0), gg.MakeFString(1000310, "", "", "", "", ""));

} else if (i2 < i3) {
myself.FHTML_SetStr(fhtml0, "Winner" + gg.IntToStr(i0), gg.MakeFString(1000311, "", "", "", "", ""));

} else {
myself.FHTML_SetStr(fhtml0, "Winner" + gg.IntToStr(i0), gg.MakeFString(1000430, "", "", "", "", ""));

}

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 10) {
myself.FHTML_SetFileName(fhtml0, fnHi);
i0 = gg.GetDateTime(0, 4);
if (i0 == 58 || i0 == 18 || i0 == 38 || i0 == 59 || i0 == 19 || i0 == 39) {
s0 = gg.MakeFString(1000441, "", "", "", "", "");
myself.FHTML_SetStr(fhtml0, "minute", s0);

} else {
if (i0 > 39) {
i1 = 58 - i0;

} else if (i0 > 19) {
i1 = 38 - i0;

} else {
i1 = 18 - i0;

}
s0 = gg.IntToStr(i1);
s0 = s0 + gg.MakeFString(1000442, "", "", "", "", "");
myself.FHTML_SetStr(fhtml0, "minute", s0);

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 11) {
myself.FHTML_SetFileName(fhtml0, "ssq_main_event_acolyte_q0505_27.htm");
for (i0 = 1; i0 < 6; i0 = i0 + 1) {
i1 = 1000311 + i0;
myself.FHTML_SetStr(fhtml0, "Room" + gg.IntToStr(i0), gg.MakeFString(i1, "", "", "", "", ""));
i1 = myself.GetTimeAttackFee(i0);
myself.FHTML_SetStr(fhtml0, "Money" + gg.IntToStr(i0), gg.IntToStr(i1));

}
myself.ShowFHTML(talker, fhtml0);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 3001) {
if (myself.GetSSQStatus() == 1) {
i0 = gg.GetDateTime(0, 4);
i1 = myself.GetTimeOfSSQ(1) - gg.GetTimeOfDay();
if (i0 == 58 || i0 == 18 || i0 == 38 && i1 >= 18 * 60) {
if (myself.i_ai0 < 1) {
if (ShoutSysMsg == 1) {
myself.Shout(gg.MakeFString(1000317, "", "", "", "", ""));

}
myself.i_ai0 = myself.i_ai0 + 1;

}

} else if (i0 == 0 || i0 == 20 || i0 == 40 && i1 >= 18 * 60) {
if (myself.i_ai0 < 1) {
if (ShoutSysMsg == 1) {
myself.Shout(gg.MakeFString(1000318, "", "", "", "", ""));

}
myself.i_ai0 = myself.i_ai0 + 1;
if (SibylName == "") {
myself.Say("올바른 AI를 지정해 주세요!");

} else {
myself.CreateOnePrivateEx(SibylSilhouette, SibylName, 0, 0, SibylPosX, SibylPosY, SibylPosZ, 0, 0, 0, 0);

}

}

} else if (i0 == 13 || i0 == 33 || i0 == 53) {
if (myself.i_ai0 < 1) {
if (ShoutSysMsg == 1) {
myself.Shout(gg.MakeFString(1000319, "", "", "", "", ""));

}
myself.i_ai0 = myself.i_ai0 + 1;

}

} else if (i0 == 16 || i0 == 36 || i0 == 56) {
if (myself.i_ai0 < 1 && ShoutSysMsg == 1) {
if (i1 >= 20 * 60) {
myself.Shout(gg.MakeFString(1000320, "", "", "", "", ""));

} else {
myself.Shout(gg.MakeFString(1000453, "", "", "", "", ""));

}
myself.i_ai0 = myself.i_ai0 + 1;

}

} else {
myself.i_ai0 = 0;

}

}
myself.AddTimerEx(3001, 7000);

}
	}


}