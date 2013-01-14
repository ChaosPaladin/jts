package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ordery extends citizen {
	protected String fnHi = "partisan_ordery_brakel001.htm";

	protected void TALKED(HandlerParam talker, HandlerParam fhtml0) {
if (gg.IsSameString(myself.Castle_GetSiegeTime(), "") == 0) {
myself.FHTML_SetFileName(fhtml0, fnHi);
myself.FHTML_SetStr(fhtml0, "next_siege", myself.Castle_GetSiegeTime());
myself.ShowFHTML(talker, fhtml0);

}
	}


}