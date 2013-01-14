package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_stone_coffin extends default_npc {
	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0) {
myself.ShowPage(talker, "stone_coffin001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0) {
if (ask == -1006) {
if (reply == 1) {
i0 = myself.MPCC_GetMPCCId(talker);
c0 = myself.MPCC_GetMaster(i0);
if (talker != c0) {
myself.ShowPage(talker, "stone_coffin001b.htm");

} else {
myself.CreateOnePrivateEx(1032731, "hardin_bereth", 0, 0, 12147, 215613, -9478, 32767, 0, 0, 0);
myself.ShowPage(talker, "stone_coffin001a.htm");
myself.GiveItem1(talker, 10314, 1);
myself.BroadcastSystemMessageStr(myself.sm, 8000, gg.MakeFString(1801004, talker.name, "", "", "", ""));
myself.Despawn();

}

}

}
	}


}