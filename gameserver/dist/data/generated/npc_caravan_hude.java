package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_caravan_hude extends citizen {
	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (gg.OwnItemCount(talker, 9850) < 1 && gg.OwnItemCount(talker, 9851) < 1 && gg.OwnItemCount(talker, 9852) < 1) {
myself.ShowPage(talker, "caravan_hude001.htm");

} else if (gg.OwnItemCount(talker, 9850) >= 1 && gg.OwnItemCount(talker, 9851) < 1 && gg.OwnItemCount(talker, 9852) < 1) {
myself.ShowPage(talker, "caravan_hude003.htm");

} else if (gg.OwnItemCount(talker, 9851) >= 1 && gg.OwnItemCount(talker, 9852) < 1) {
myself.ShowPage(talker, "caravan_hude005.htm");

} else if (gg.OwnItemCount(talker, 9852) >= 1) {
myself.ShowPage(talker, "caravan_hude007.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -1006) {
if (reply == 2) {
if (gg.OwnItemCount(talker, 9850) >= 1 && gg.OwnItemCount(talker, 9851) < 1 && gg.OwnItemCount(talker, 9852) < 1) {
if (gg.OwnItemCount(talker, 10012) >= 60 && gg.OwnItemCount(talker, 9676) >= 30) {
myself.GiveItem1(talker, 9851, 1);
myself.DeleteItem1(talker, 9850, 1);
myself.DeleteItem1(talker, 10012, 60);
myself.DeleteItem1(talker, 9676, 30);
myself.ShowPage(talker, "caravan_hude004a.htm");

} else {
myself.ShowPage(talker, "caravan_hude004b.htm");

}

}

} else if (reply == 3) {
if (gg.OwnItemCount(talker, 9851) >= 1 && gg.OwnItemCount(talker, 9852) < 1) {
if (gg.OwnItemCount(talker, 9681) >= 56 && gg.OwnItemCount(talker, 9682) >= 14) {
myself.GiveItem1(talker, 9852, 1);
myself.GiveItem1(talker, 9994, 1);
myself.DeleteItem1(talker, 9851, 1);
myself.DeleteItem1(talker, 9681, 56);
myself.DeleteItem1(talker, 9682, 14);
myself.ShowPage(talker, "caravan_hude006a.htm");

} else {
myself.ShowPage(talker, "caravan_hude006b.htm");

}

}

} else if (reply == 4) {
if (gg.OwnItemCount(talker, 9852) >= 1) {

}

}

} else if (ask == -303) {
if (reply == 612) {
if (gg.OwnItemCount(talker, 9851) >= 1 || gg.OwnItemCount(talker, 9852) >= 1) {
myself.ShowMultisell(612, talker);

}

} else if (reply == 622 || reply == 644) {
if (myself.sm.class_id == 1031756 || myself.sm.class_id == 1031757) {
myself.ShowMultisell(reply, talker);

}

} else if (reply == 623) {
if (gg.OwnItemCount(talker, 9852) >= 1) {
myself.ShowMultisell(623, talker);

}

}

}
	}


}