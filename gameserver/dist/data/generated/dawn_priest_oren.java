package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dawn_priest_oren extends ssq_npc_priest {
protected Object[][] Position = {
{"Catacomb of the Apostate";74672;78032;-3398;3000;0}
};
protected Object[][] PositionCompetition = {
{"Catacomb of the Apostate";74672;78032;-3398;5000;0}
};

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 507) {
myself.SetCurrentQuestID(507);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 507) {
if (reply == 1) {
myself.ShowPage(talker, "ssq_npc_priest_q507_01.htm");

}
if (reply == 2) {
i0 = gg.GetMemoStateEx(talker, 255, 1);
i0 = i0 % 100;
if (i0 >= 95 || i0 < 0) {
i0 = 0;

}
myself.SetMemoStateEx(talker, 255, 1, i0 + 600);
if (gg.HaveMemo(talker, 505)) {
myself.RemoveMemo(talker, 505);

}
myself.DeleteItem1(talker, 5901, gg.OwnItemCount(talker, 5901));
switch (gg.Rand(3)) {
case 0: {
myself.InstantTeleport(talker, -80316, 111356, -4896);
break;

}
case 1: {
myself.InstantTeleport(talker, -80226, 111290, -4896);
break;

}
case 2: {
myself.InstantTeleport(talker, -80217, 111435, -4896);
break;

}

}
gg.AddLog(1, talker, 507);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}

}
super;
	}


}