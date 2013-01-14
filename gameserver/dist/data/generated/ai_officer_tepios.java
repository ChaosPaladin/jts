package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_officer_tepios extends citizen {
	protected int FieldCycle = 3;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam fhtml0) {
if (reply == 1) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (ask == 694) {
if (i0 == 1 || i0 == 2) {
myself.ShowPage(talker, "officer_tepios_q0694_04.htm");

} else {
myself.ShowPage(talker, "officer_tepios_q0694_03.htm");

}

} else if (ask == 695) {
if (i0 == 4 || i0 == 5) {
myself.FHTML_SetFileName(fhtml0, "officer_tepios_q0695_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 695);
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, "officer_tepios_q0695_03.htm");

}

} else if (ask == 696) {
if (gg.OwnItemCount(talker, 13691) == 1) {
if (i0 == 1) {
myself.FHTML_SetFileName(fhtml0, "officer_tepios_q0696_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 696);
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, "officer_tepios_q0696_03.htm");

}

} else {
myself.ShowPage(talker, "officer_tepios_q0696_02a.htm");

}

} else if (ask == 697) {
if (i0 == 4) {
myself.FHTML_SetFileName(fhtml0, "officer_tepios_q0697_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 697);
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, "officer_tepios_q0697_03.htm");

}

} else if (ask == 698) {
if (i0 == 5) {
myself.FHTML_SetFileName(fhtml0, "officer_tepios_q0698_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 698);
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, "officer_tepios_q0698_03.htm");

}

}

} else if (reply == 2) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (ask == 694) {
if (i0 == 1 || i0 == 2) {
myself.FHTML_SetFileName(fhtml0, "officer_tepios_q0694_04a.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 694);
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, "officer_tepios_q0694_03.htm");

}

}

}
	}


}