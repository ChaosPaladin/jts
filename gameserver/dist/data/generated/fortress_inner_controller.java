package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_inner_controller extends citizen {
	protected String fnHi2 = "";
	protected String fnHi3 = "";
	protected int secret_number = 1;
	protected int broadcast_range = 1000;
	protected String fnGetPasswd = "fortress_inner_controller004.htm";
	protected int fstr_1stpasswd = 1300125;
	protected int fstr_2ndpasswd = 1300126;
	protected int fstr_nopasswd = 1300127;
	protected int fstr_try_limit = 1300128;
	protected int try_limit = 3;
	protected int try_delay = 30;
	protected int puzzle_range = 10;

	protected void CREATED() {
myself.i_ai0 = gg.Rand(puzzle_range);
myself.i_ai1 = gg.Rand(puzzle_range);
myself.i_ai2 = gg.Rand(puzzle_range);
myself.i_ai3 = 0;
super;
	}

	protected void TALKED(HandlerParam talker) {
if (myself.i_ai3 >= try_limit) {
myself.ShowPage(talker, fnHi3);
return;

}
if (myself.i_ai0 == -1 && myself.i_ai1 == -1 && myself.i_ai2 == -1) {
myself.ShowPage(talker, fnHi2);
return;

} else {
myself.ShowPage(talker, fnHi);
return;

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam fhtml0) {
if (myself.i_ai3 >= try_limit) {
myself.ShowPage(talker, fnHi3);
return;

}
if (ask == 505) {
if (talker.occupation == 57 || talker.occupation == 118) {
if (myself.i_ai0 > -1) {
i0 = myself.i_ai0 % 2;

} else if (myself.i_ai1 > -1) {
i0 = myself.i_ai1 % 2;

} else if (myself.i_ai2 > -1) {
i0 = myself.i_ai2 % 2;

}
i1 = reply % 2;

} else {
if (myself.i_ai0 > -1) {
i0 = myself.i_ai0;

} else if (myself.i_ai1 > -1) {
i0 = myself.i_ai1;

} else if (myself.i_ai2 > -1) {
i0 = myself.i_ai2;

}
i1 = reply;

}
if (myself.i_ai0 > -1) {
myself.FHTML_SetFileName(fhtml0, fnGetPasswd);
if (i0 == i1) {
myself.i_ai0 = -1;
myself.FHTML_SetStr(fhtml0, "passwd_status", gg.MakeFString(fstr_1stpasswd, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "try_limit", gg.MakeFString(fstr_try_limit, gg.IntToStr(myself.i_ai3), "", "", "", ""));

} else {
myself.i_ai3 = myself.i_ai3 + 1;
myself.FHTML_SetStr(fhtml0, "passwd_status", gg.MakeFString(fstr_nopasswd, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "try_limit", gg.MakeFString(fstr_try_limit, gg.IntToStr(myself.i_ai3), "", "", "", ""));
if (myself.i_ai3 >= try_limit) {
myself.AddTimerEx(1995, try_delay * 1000);

}

}
myself.ShowFHTML(talker, fhtml0);
return;

} else if (myself.i_ai1 > -1) {
myself.FHTML_SetFileName(fhtml0, fnGetPasswd);
if (i0 == i1) {
myself.i_ai1 = -1;
myself.FHTML_SetStr(fhtml0, "passwd_status", gg.MakeFString(fstr_2ndpasswd, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "try_limit", gg.MakeFString(fstr_try_limit, gg.IntToStr(myself.i_ai3), "", "", "", ""));

} else {
myself.i_ai3 = myself.i_ai3 + 1;
myself.FHTML_SetStr(fhtml0, "passwd_status", gg.MakeFString(fstr_1stpasswd, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "try_limit", gg.MakeFString(fstr_try_limit, gg.IntToStr(myself.i_ai3), "", "", "", ""));
if (myself.i_ai3 >= try_limit) {
myself.AddTimerEx(1995, try_delay * 1000);

}

}
myself.ShowFHTML(talker, fhtml0);
return;

} else if (myself.i_ai2 > -1) {
if (i0 == i1) {
myself.i_ai2 = -1;

} else {
myself.FHTML_SetFileName(fhtml0, fnGetPasswd);
myself.i_ai3 = myself.i_ai3 + 1;
myself.FHTML_SetStr(fhtml0, "passwd_status", gg.MakeFString(fstr_2ndpasswd, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "try_limit", gg.MakeFString(fstr_try_limit, gg.IntToStr(myself.i_ai3), "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);
if (myself.i_ai3 >= try_limit) {
myself.AddTimerEx(1995, try_delay * 1000);

}
return;

}

}
if (myself.i_ai0 == -1 && myself.i_ai1 == -1 && myself.i_ai2 == -1) {
myself.BroadcastScriptEvent(1006, secret_number, broadcast_range);
myself.ShowPage(talker, fnHi2);
myself.AddTimerEx(2913, 5 * 1000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1995) {
myself.i_ai0 = gg.Rand(puzzle_range);
myself.i_ai1 = gg.Rand(puzzle_range);
myself.i_ai2 = gg.Rand(puzzle_range);
myself.i_ai3 = 0;

} else if (timer_id == 2913) {
myself.Despawn();
return;

}
	}


}