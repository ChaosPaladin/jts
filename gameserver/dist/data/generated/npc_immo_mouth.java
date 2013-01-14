package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_immo_mouth extends default_npc {
	protected int type = 0;
	protected int inzone_id1 = 115;
	protected int inzone_id2 = 116;
	protected int inzone_id3 = 119;
	protected int inzone_id4 = 120;
	protected int FieldCycle = 3;
	protected String fnHi = "mouth_immortality001.htm";
	protected String fnHiEnter1 = "mouth_immortality002a.htm";
	protected String fnHiEnter2 = "mouth_immortality002b.htm";
	protected String fnHiEnterFail = "vigil_immortality003.htm";

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1) {
gg.SendUIEvent(creature, 1, 0, 0, "1", "1", "1", "경과 시간 : ", "60", "0");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == -1000 && reply == 1001) {
if (type == 0) {
myself.ShowPage(talker, fnHiEnter1);

} else if (type == 1) {
myself.ShowPage(talker, fnHiEnter2);

}

} else if (ask == -1100 && reply == 1101) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 == 1 || i0 == 2) {
myself.InstantZone_Enter(talker, inzone_id1, 1);

} else if (i0 == 4 || i0 == 5) {
myself.InstantZone_Enter(talker, inzone_id2, 1);

} else {
myself.ShowPage(talker, fnHiEnterFail);

}

} else if (ask == -1200 && reply == 1201) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 == 1) {
myself.InstantZone_Enter(talker, inzone_id3, 2);

} else if (i0 == 4) {
myself.InstantZone_Enter(talker, inzone_id4, 2);

} else {
myself.ShowPage(talker, fnHiEnterFail);

}

}
	}


}