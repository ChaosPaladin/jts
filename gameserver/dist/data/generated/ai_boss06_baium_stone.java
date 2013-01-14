package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss06_baium_stone extends default_npc {
	protected int GM_ID = 2;

	protected void CREATED(HandlerParam reply, HandlerParam i0) {
myself.i_ai0 = 0;
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "baium_npc001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0, HandlerParam c3, HandlerParam i3, HandlerParam i4) {
if (ask == 9999) {
if (reply == 1) {
if (myself.i_ai0 == 0) {
i0 = myself.GetGlobalMap(GM_ID);
if (i0 != -1) {
c0 = gg.GetCreatureFromIndex(i0);
if (myself.IsNullCreature(c0) == 0) {
i3 = myself.MPCC_GetMPCCId(talker);
i4 = myself.MPCC_GetMemberCount(i3);
if (talker.builder_level > 0 && talker.builder_level <= 3 && i4 >= 1 || i4 > 54) {
gg.SendScriptEvent(c0, 99999999, i3);

}
gg.SendScriptEvent(c0, 10025, gg.GetIndexFromCreature(talker));
myself.AddLogByNpc2(127, myself.sm, "ai_boss06_baium_stone_MENU_SELECTED", "SendScriptEvent_to_baium_OK", 0, 0, 0, 0, 0, 0);
myself.i_ai0 = 1;
myself.Despawn();
myself.AddLogByNpc2(127, myself.sm, "ai_boss06_baium_stone_MENU_SELECTED", "Despawn_OK", 0, 0, 0, 0, 0, 0);
return;

} else {
myself.AddLogByNpc2(127, myself.sm, "ai_boss06_baium_stone_MENU_SELECTED", "IsNullCreature = TRUE", 0, 0, 0, 0, 0, 0);

}

} else {
myself.AddLogByNpc2(127, myself.sm, "ai_boss06_baium_stone_MENU_SELECTED", "GetGlobalMap = -1", 0, 0, 0, 0, 0, 0);

}

}

}

}
	}


}