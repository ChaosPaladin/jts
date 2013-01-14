package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_pa73_intro extends zone_controller {
	protected int inzone_id = 45;
	protected int enter_type = 0;
	protected String fnHi = "npc_pa_maker001.htm";

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0, HandlerParam s0, HandlerParam party0, HandlerParam c0) {
myself.ShowPage(talker, fnHi);
return;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 144) {
if (reply == 3) {
if (zone_type > -1 && enter_type > -1) {
if (myself.GetOneTimeQuestFlag(talker, 144) == 0) {
myself.InstantZone_Enter(talker, zone_type, enter_type);

}

}

}

}
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == 0) {
myself.ShowPage(talker, fnEnterFailed);

} else if (reply == 1) {
if (gg.HaveMemo(talker, 144) == 1 && myself.GetOneTimeQuestFlag(talker, 144) == 0) {
if (gg.GetMemoState(talker, 144) == 1) {
myself.SetMemoState(talker, 144, 2);
myself.ShowPage(talker, "pa73_intro_npc_q0144_09.htm");
myself.SetFlagJournal(talker, 144, 2);
myself.ShowQuestMark(talker, 144);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowPage(talker, "pa73_intro_npc_q0144_11.htm");

}

} else {
return;

}

}
	}


}