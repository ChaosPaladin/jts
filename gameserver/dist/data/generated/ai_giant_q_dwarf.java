package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_giant_q_dwarf extends citizen {
	protected int GlobalMap_ID = 39;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam c0, HandlerParam i0, HandlerParam i1) {
if (ask == 307) {
if (reply == 40) {
if (gg.HaveMemo(talker, 307) == 1 && gg.GetMemoState(talker, 307) == 1 && gg.OwnItemCount(talker, 14851) >= 1 && gg.OwnItemCount(talker, 14852) >= 1 && gg.OwnItemCount(talker, 14853) >= 1) {
if (myself.GetGlobalMap(GlobalMap_ID) == 1) {
myself.ShowPage(talker, "giant_q_dwarf_q0307_09.htm");
myself.DeleteItem1(talker, 14851, 1);
myself.DeleteItem1(talker, 14852, 1);
myself.DeleteItem1(talker, 14853, 1);
myself.BroadcastScriptEvent(2519001, 0, 5000);
myself.AddMoveToDesire(192062, 57357, -7650, 1000);
myself.AddTimerEx(2519007, 5000);

} else {
myself.ShowPage(talker, "giant_q_dwarf_q0307_09a.htm");

}

}

}

}
if (ask == -2519003) {
if (reply == 1) {
myself.InstantTeleport(talker, 183985, 61424, -3992);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2519007) {
myself.SetVisible(0);
myself.AddTimerEx(2519008, 60 * 1000);

}
if (timer_id == 2519008) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.SetVisible(1);

}
	}


}