package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_pa61_intro extends zone_controller {
	protected int inzone_id = 44;
	protected int enter_type = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0, HandlerParam s0, HandlerParam party0, HandlerParam c0) {
myself.ShowPage(talker, fnHi);
return;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 129) {
if (reply == 3) {
if (zone_type > -1 && enter_type > -1) {
if (myself.GetOneTimeQuestFlag(talker, 129) == 0) {
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
if (gg.HaveMemo(talker, 129) == 1 && myself.GetOneTimeQuestFlag(talker, 129) == 0) {
if (gg.GetMemoState(talker, 129) <= 1) {
myself.SetMemoState(talker, 129, 2);
myself.ShowPage(talker, "pa61_intro_npc_q0129_09.htm");
myself.SetFlagJournal(talker, 129, 2);
myself.ShowQuestMark(talker, 129);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowPage(talker, "pa61_intro_npc_q0129_11.htm");

}

} else {
return;

}

}
	}


}