package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_wanderingghost_kendal extends citizen {
	protected void TALKED(HandlerParam talker) {
if (talker.occupation == 6 || talker.occupation == 91 || talker.occupation == 13 || talker.occupation == 95) {
myself.ShowPage(talker, "wanderingghost_kendal002.htm");

} else {
myself.ShowPage(talker, "wanderingghost_kendal001.htm");

}
	}


}