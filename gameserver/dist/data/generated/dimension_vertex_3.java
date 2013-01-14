package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dimension_vertex_3 extends teleporter_need_item {
protected Object[][] Position = {
{"Tower of Insolence - 1st Floor";110896;16000;-4384;0;0}, {"Tower of Insolence - 5th Floor";114176;19920;935;0;0}
};

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -6) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 4401) != 0) {
myself.DeleteItem1(talker, 4401, 1);
myself.InstantTeleport(talker, 110896, 16000, -4384);

} else {
myself.ShowPage(talker, fnNoItem);

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 4402) != 0) {
myself.DeleteItem1(talker, 4402, 1);
myself.InstantTeleport(talker, 114176, 19920, 935);

} else {
myself.ShowPage(talker, fnNoItem);

}

}

}
	}


}