package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_giron extends citizen {
	protected int FieldCycle = 1;

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 == 0) {
myself.ShowPage(talker, "giron001.htm");

} else if (i0 == 1) {
myself.ShowPage(talker, "giron001a.htm");

} else if (i0 == 2) {
myself.ShowPage(talker, "giron001b.htm");

} else if (i0 == 3) {
myself.ShowPage(talker, "giron001c.htm");

} else if (i0 == 4) {
myself.ShowPage(talker, "giron001h.htm");

} else if (i0 == 5) {
myself.ShowPage(talker, "giron001d.htm");

} else if (i0 == 6) {
myself.ShowPage(talker, "giron001i.htm");

} else if (i0 == 7) {
myself.ShowPage(talker, "giron001e.htm");

} else if (i0 == 8) {
myself.ShowPage(talker, "giron001f.htm");

} else if (i0 == 9) {
myself.ShowPage(talker, "giron001g.htm");

} else if (i0 == 10) {
myself.ShowPage(talker, "giron001j.htm");

} else if (i0 == 11) {
myself.ShowPage(talker, "giron001k.htm");

}
	}


}