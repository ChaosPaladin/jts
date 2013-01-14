package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ssq_ritual_inzone_enter extends default_npc {
	protected int quest_name = 195;
	protected int ITEM_ID_CARD = 13822;
	protected int zone_type = 111;
	protected int enter_type = 0;
	protected String fnHi = "chi.htm";
	protected String fnSuccess = "light_of_dawn_q0195_03.htm";
	protected String fnFailed = "light_of_dawn_q0195_04.htm";
	protected int debug_mode = 0;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == 195) {
if (reply == 1) {
if (gg.HaveMemo(talker, quest_name) == 1 && gg.GetMemoState(talker, quest_name) == 3 && talker.transformID == 113 && gg.OwnItemCount(talker, ITEM_ID_CARD) > 0) {
if (debug_mode) {
myself.Say("입장");

}
myself.ShowPage(talker, fnSuccess);
myself.InstantZone_Enter(talker, zone_type, enter_type);

} else {
if (debug_mode) {
myself.Say("입장 실패");
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