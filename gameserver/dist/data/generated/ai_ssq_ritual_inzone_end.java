package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ssq_ritual_inzone_end extends default_npc {
	protected int quest_name = 195;
	protected int ITEM_ID_CARD = 13822;
	protected int zone_type = 111;
	protected int enter_type = 0;
	protected String fnHi = "chi.htm";
	protected String fnSuccess = "darkness_of_dawn_q0195_02.htm";
	protected String fnFailed = "darkness_of_dawn_q0195_03.htm";
	protected int debug_mode = 0;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == 195) {
if (reply == 2) {
if (gg.HaveMemo(talker, quest_name) == 1 && gg.GetMemoState(talker, quest_name) == 3 && talker.transformID == 113 && gg.OwnItemCount(talker, ITEM_ID_CARD) > 0) {
if (debug_mode) {
myself.Say("조건 만족. 인존 종료");

}
myself.ShowPage(talker, fnSuccess);
myself.InstantZone_Leave(talker);

} else {
if (debug_mode) {
myself.Say("조건 불만족");
myself.Say("have memo : " + gg.HaveMemo(talker, quest_name));
myself.Say("memostate : " + gg.GetMemoState(talker, quest_name));
myself.Say("TransformID : " + talker.transformID);
myself.Say("ItemCount : " + gg.OwnItemCount(talker, ITEM_ID_CARD));

}
myself.ShowPage(talker, fnFailed);

}

}

}
	}


}