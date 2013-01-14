package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_looser_of_gracia extends citizen {
	protected String fnHi = "looser_of_gracia001.htm";
	protected String fnAdenFort = "looser_of_gracia002.htm";
	protected String fnSeedState = "looser_of_gracia003.htm";
	protected String fnNotHaveAdena = "looser_of_gracia004.htm";
	protected String fnLowLevel = "looser_of_gracia005.htm";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1) {
if (ask == -1425) {
switch (reply) {
case 1: {
if (talker.level < 75) {
myself.ShowPage(talker, fnLowLevel);
return;

}
if (gg.OwnItemCount(talker, 57) >= 150000) {
myself.InstantTeleportWithItem(talker, -149406, 255247, -85, 57, 150000);

} else {
myself.ShowPage(talker, fnNotHaveAdena);

}
break;

}
case 2: {
myself.FHTML_SetFileName(fhtml0, fnSeedState);
i0 = gg.GetStep_FieldCycle(3);
if (i0 <= 1) {
i1 = 1800711;

} else if (i0 == 2) {
i1 = 1800712;

} else if (i0 == 3) {
i1 = 1800713;

} else if (i0 == 4) {
i1 = 1800714;

} else if (i0 == 5) {
i1 = 1800715;

} else if (i0 >= 6) {
i1 = 1800716;

}
myself.FHTML_SetStr(fhtml0, "stat_unde", gg.MakeFString(i1, "", "", "", "", ""));
i0 = gg.GetStep_FieldCycle(2);
if (i0 <= 1) {
i1 = 1800708;

} else if (i0 == 2) {
i1 = 1800709;

} else if (i0 >= 3) {
i1 = 1800710;

}
myself.FHTML_SetStr(fhtml0, "stat_dest", gg.MakeFString(i1, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);

}

}

}
super;
	}


}