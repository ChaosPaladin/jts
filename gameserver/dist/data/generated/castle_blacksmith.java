package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class castle_blacksmith extends citizen {
	protected String fnMyLord = "gludio_smith001.htm";
	protected String fnHi = "gludio_smith002.htm";

	protected void TALKED(HandlerParam talker) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 17) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.ShowPage(talker, fnMyLord);

} else {
myself.ShowPage(talker, fnHi);

}
	}


}