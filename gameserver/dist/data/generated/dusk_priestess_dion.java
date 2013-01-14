package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dusk_priestess_dion extends ssq_npc_priest {
protected Object[][] Position = {
{"The Pilgrim's Necropolis";45600;126944;-3686;2300;0}, {"The Catacomb of the Heretic";39232;143568;-3651;1500;0}, {"Catacomb of the Branded";43200;170688;-3251;3500;0}, {"Necropolis of Worship";107514;174329;-3704;6800;0}
};
protected Object[][] PositionCompetition = {
{"The Pilgrim's Necropolis";45600;126944;-3686;3900;0}, {"The Catacomb of the Heretic";39232;143568;-3651;2600;0}, {"Catacomb of the Branded";43200;170688;-3251;5900;0}, {"Necropolis of Worship";107514;174329;-3704;11000;0}
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
myself.ShowPage(talker, "ssq_npc_priest_q507_02.htm");

}
if (reply == 2) {
i0 = gg.GetMemoStateEx(talker, 255, 1);
i0 = i0 % 100;
if (i0 >= 95 || i0 < 0) {
i0 = 0;

}
myself.SetMemoStateEx(talker, 255, 1, i0 + 300);
if (gg.HaveMemo(talker, 505)) {
myself.RemoveMemo(talker, 505);

}
myself.DeleteItem1(talker, 5901, gg.OwnItemCount(talker, 5901));
switch (gg.Rand(3)) {
case 0: {
myself.InstantTeleport(talker, -81328, 86536, -5152);
break;

}
case 1: {
myself.InstantTeleport(talker, -81262, 86468, -5152);
break;

}
case 2: {
myself.InstantTeleport(talker, -81248, 86582, -5152);
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