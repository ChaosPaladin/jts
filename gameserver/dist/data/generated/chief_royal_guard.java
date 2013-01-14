package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class chief_royal_guard extends citizen {
	protected String fnHi = "sir_tyron001.htm";
	protected String fnMyLord = "sir_tyron007.htm";
	protected String fnSiegeMyLord = "sir_tyron021.htm";
	protected String fnSiegeAnother = "sir_tyron022.htm";

	protected void TALKED(HandlerParam talker) {
if (myself.IsMyLord(talker)) {
if (myself.Castle_IsUnderSiege()) {
myself.ShowPage(talker, fnSiegeMyLord);

} else {
myself.ShowPage(talker, fnMyLord);

}

} else if (myself.Castle_IsUnderSiege()) {
myself.ShowPage(talker, fnSiegeAnother);

} else {
myself.OpenSiegeInfo(talker);

}
	}


}