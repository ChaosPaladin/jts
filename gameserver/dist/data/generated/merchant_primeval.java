package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class merchant_primeval extends merchant {
	protected void TALKED(HandlerParam talker) {
if (myself.GetOneTimeQuestFlag(talker, 111) == 0) {
myself.ShowPage(talker, "Asama001.htm");

} else {
myself.ShowPage(talker, "Asama002.htm");

}
	}


}