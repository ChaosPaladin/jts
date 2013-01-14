package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_dwyllios extends citizen {
	protected int TM_announcement = 780001;
	protected int TIME_announcement = 300;

	protected void CREATED() {
myself.AddTimerEx(TM_announcement, TIME_announcement * 1000);
myself.AddTimerEx(1525002, 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam i0, HandlerParam i1) {
if (timer_id == 1525002) {
myself.BroadcastScriptEvent(1525010, 0, 2000);
myself.Say(gg.MakeFString(1800704, "", "", "", "", ""));
myself.AddTimerEx(1525002, 60 * 1000);

}
if (timer_id == TM_announcement) {
i0 = gg.Rand(2);
if (i0 == 0) {
i1 = gg.GetStep_FieldCycle(3);
if (i1 <= 1) {
myself.Shout(gg.MakeFString(1800698, "", "", "", "", ""));

} else if (i1 == 2) {
myself.Shout(gg.MakeFString(1800699, "", "", "", "", ""));

} else if (i1 == 3) {
myself.Shout(gg.MakeFString(1800700, "", "", "", "", ""));

} else if (i1 == 4) {
myself.Shout(gg.MakeFString(1800702, "", "", "", "", ""));

} else if (i1 == 5) {
myself.Shout(gg.MakeFString(1800703, "", "", "", "", ""));

}

} else {
i1 = gg.GetStep_FieldCycle(2);
if (i1 <= 1) {
myself.Shout(gg.MakeFString(1800695, "", "", "", "", ""));

} else if (i1 == 2) {
myself.Shout(gg.MakeFString(1800696, "", "", "", "", ""));

} else if (i1 >= 3) {
myself.Shout(gg.MakeFString(1800697, "", "", "", "", ""));

}

}
myself.AddTimerEx(TM_announcement, TIME_announcement * 1000);

}
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1) {
if (ask == -1101) {
if (reply == 1) {
i0 = gg.GetStep_FieldCycle(2);
if (i0 == 1) {
myself.ShowPage(talker, "dwyllios005a.htm");

} else if (i0 == 2) {
myself.ShowPage(talker, "dwyllios005b.htm");

} else if (i0 >= 3) {
myself.ShowPage(talker, "dwyllios005c.htm");

}

} else if (reply == 2) {
i0 = gg.GetStep_FieldCycle(3);
if (i0 == 1) {
myself.ShowPage(talker, "dwyllios006a.htm");

} else if (i0 == 2) {
myself.ShowPage(talker, "dwyllios006b.htm");

} else if (i0 == 3) {
myself.ShowPage(talker, "dwyllios006c.htm");

} else if (i0 == 4) {
myself.ShowPage(talker, "dwyllios006e.htm");

} else if (i0 == 5) {
myself.ShowPage(talker, "dwyllios006f.htm");

}

}

}
super;
	}


}