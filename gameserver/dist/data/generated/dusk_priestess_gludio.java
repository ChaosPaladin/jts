package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dusk_priestess_gludio extends ssq_npc_priest {
protected Object[][] Position = {
{"The Patriot's Necropolis";-25472;77728;-3446;5500;0}, {"Necropolis of Devotion";-56064;78720;-3011;8700;0}, {"Necropolis of Sacrifice";-41184;206752;-3357;4200;0}, {"Catacomb of Dark Omens";-22480;13872;-3174;18000;0}
};
protected Object[][] PositionCompetition = {
{"The Patriot's Necropolis";-25472;77728;-3446;9200;0}, {"Necropolis of Devotion";-56064;78720;-3011;14000;0}, {"Necropolis of Sacrifice";-41184;206752;-3357;7000;0}, {"Catacomb of Dark Omens";-22480;13872;-3174;30000;0}
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
myself.SetMemoStateEx(talker, 255, 1, i0 + 200);
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