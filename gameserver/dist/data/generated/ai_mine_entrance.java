package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_mine_entrance extends citizen {
	protected int Pos_X1 = -1;
	protected int Pos_Y1 = -1;
	protected int Pos_Z1 = -1;
	protected int Pos_X2 = -1;
	protected int Pos_Y2 = -1;
	protected int Pos_Z2 = -1;
	protected int my_position = -1;
	protected String fnHi = "";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == -2512) {
if (reply == 1) {
myself.InstantTeleport(talker, Pos_X1, Pos_Y1, Pos_Z1);

}

} else if (ask == 10284) {
if (reply == 2) {
myself.InstantZone_Enter(talker, 138, 0);

}

}
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam i2) {
if (reply == 0) {
if (gg.HaveMemo(talker, 10284) == 1 && gg.GetMemoState(talker, 10284) == 2) {
if (myself.sm.npc_class_id == 1032653) {
myself.ShowPage(talker, "kroon_q10284_07.htm");

} else if (myself.sm.npc_class_id == 1032654) {
myself.ShowPage(talker, "taroon_q10284_07.htm");

}

}

} else if (reply == 1) {
if (gg.HaveMemo(talker, 10284) == 1 && gg.GetMemoState(talker, 10284) == 2) {
if (gg.OwnItemCount(talker, 15514) < 1) {
myself.GiveItem1(talker, 15514, 1);

}
myself.SetFlagJournal(talker, 10284, 4);
myself.ShowQuestMark(talker, 10284);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
	}


}