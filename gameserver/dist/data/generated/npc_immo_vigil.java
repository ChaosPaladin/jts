package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_immo_vigil extends default_npc {
	protected int type = 0;
	protected int inzone_id1 = 121;
	protected int inzone_id2 = 122;
	protected int FieldCycle = 3;
	protected int return_x = -212836;
	protected int return_y = 209824;
	protected int return_z = 4288;
	protected String fnHi = "vigil_immortality001.htm";
	protected String fnHiEnter1 = "vigil_immortality002a.htm";
	protected String fnHiEnter2 = "vigil_immortality002b.htm";
	protected String fnHiEnterFail = "vigil_immortality003.htm";
	protected int loc_x01 = -179537;
	protected int loc_y01 = 209551;
	protected int loc_z01 = -15504;
	protected int loc_x02 = -179779;
	protected int loc_y02 = 212540;
	protected int loc_z02 = -15520;
	protected int loc_x03 = -177028;
	protected int loc_y03 = 211135;
	protected int loc_z03 = -15520;
	protected int loc_x04 = -176355;
	protected int loc_y04 = 208043;
	protected int loc_z04 = -15520;
	protected int loc_x05 = -179284;
	protected int loc_y05 = 205990;
	protected int loc_z05 = -15520;
	protected int loc_x06 = -182268;
	protected int loc_y06 = 208218;
	protected int loc_z06 = -15520;
	protected int loc_x07 = -182069;
	protected int loc_y07 = 211140;
	protected int loc_z07 = -15520;
	protected int loc_x08 = -176036;
	protected int loc_y08 = 210002;
	protected int loc_z08 = -11948;
	protected int loc_x09 = -176039;
	protected int loc_y09 = 208203;
	protected int loc_z09 = -11949;
	protected int loc_x10 = -183288;
	protected int loc_y10 = 208205;
	protected int loc_z10 = -11939;
	protected int loc_x11 = -183290;
	protected int loc_y11 = 210004;
	protected int loc_z11 = -11939;
	protected int loc_x12 = -187776;
	protected int loc_y12 = 205696;
	protected int loc_z12 = -9536;
	protected int loc_x13 = -186327;
	protected int loc_y13 = 208286;
	protected int loc_z13 = -9536;
	protected int loc_x14 = -184429;
	protected int loc_y14 = 211155;
	protected int loc_z14 = -9536;
	protected int loc_x15 = -182811;
	protected int loc_y15 = 213871;
	protected int loc_z15 = -9504;
	protected int loc_x16 = -180921;
	protected int loc_y16 = 216789;
	protected int loc_z16 = -9536;
	protected int loc_x17 = -177264;
	protected int loc_y17 = 217760;
	protected int loc_z17 = -9536;
	protected int loc_x18 = -173727;
	protected int loc_y18 = 218169;
	protected int loc_z18 = -9536;

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1) {
gg.SendUIEvent(creature, 1, 0, 0, "1", "1", "1", "경과 시간 : ", "60", "0");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i5, HandlerParam i6, HandlerParam i7) {
if (ask == -1002 && reply == 1003) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 == 1) {
myself.ShowPage(talker, fnHiEnterFail);

} else if (i0 == 2 || i0 == 5) {
myself.ShowPage(talker, fnHiEnter2);

} else {
myself.ShowPage(talker, fnHiEnter1);

}

} else if (ask == -1004 && reply == 1005) {
myself.InstantTeleport(talker, return_x, return_y, return_z);

} else if (ask == -1006 && reply == 1007) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 == 3) {
i1 = gg.Rand(18) + 1;
switch (i1) {
case 1: {
i5 = loc_x01;
i6 = loc_y01;
i7 = loc_z01;
break;

}
case 2: {
i5 = loc_x02;
i6 = loc_y02;
i7 = loc_z02;
break;

}
case 3: {
i5 = loc_x03;
i6 = loc_y03;
i7 = loc_z03;
break;

}
case 4: {
i5 = loc_x04;
i6 = loc_y04;
i7 = loc_z04;
break;

}
case 5: {
i5 = loc_x05;
i6 = loc_y05;
i7 = loc_z05;
break;

}
case 6: {
i5 = loc_x06;
i6 = loc_y06;
i7 = loc_z06;
break;

}
case 7: {
i5 = loc_x07;
i6 = loc_y07;
i7 = loc_z07;
break;

}
case 8: {
i5 = loc_x08;
i6 = loc_y08;
i7 = loc_z08;
break;

}
case 9: {
i5 = loc_x09;
i6 = loc_y09;
i7 = loc_z09;
break;

}
case 10: {
i5 = loc_x10;
i6 = loc_y10;
i7 = loc_z10;
break;

}
case 11: {
i5 = loc_x11;
i6 = loc_y11;
i7 = loc_z11;
break;

}
case 12: {
i5 = loc_x12;
i6 = loc_y12;
i7 = loc_z12;
break;

}
case 13: {
i5 = loc_x13;
i6 = loc_y13;
i7 = loc_z13;
break;

}
case 14: {
i5 = loc_x14;
i6 = loc_y14;
i7 = loc_z14;
break;

}
case 15: {
i5 = loc_x15;
i6 = loc_y15;
i7 = loc_z15;
break;

}
case 16: {
i5 = loc_x16;
i6 = loc_y16;
i7 = loc_z16;
break;

}
case 17: {
i5 = loc_x17;
i6 = loc_y17;
i7 = loc_z17;
break;

}
case 18: {
i5 = loc_x18;
i6 = loc_y18;
i7 = loc_z18;
break;

}

}
myself.InstantTeleport(talker, i5, i6, i7);

} else if (i0 == 4) {
i1 = gg.Rand(7) + 1;
switch (i1) {
case 1: {
i5 = loc_x01;
i6 = loc_y01;
i7 = loc_z01;
break;

}
case 2: {
i5 = loc_x02;
i6 = loc_y02;
i7 = loc_z02;
break;

}
case 3: {
i5 = loc_x03;
i6 = loc_y03;
i7 = loc_z03;
break;

}
case 4: {
i5 = loc_x04;
i6 = loc_y04;
i7 = loc_z04;
break;

}
case 5: {
i5 = loc_x05;
i6 = loc_y05;
i7 = loc_z05;
break;

}
case 6: {
i5 = loc_x06;
i6 = loc_y06;
i7 = loc_z06;
break;

}
case 7: {
i5 = loc_x07;
i6 = loc_y07;
i7 = loc_z07;
break;

}

}
myself.InstantTeleport(talker, i5, i6, i7);

} else {
myself.ShowPage(talker, fnHiEnterFail);

}

} else if (ask == -1008 && reply == 1009) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 == 2) {
myself.InstantZone_Enter(talker, inzone_id1, 2);

} else if (i0 == 5) {
myself.InstantZone_Enter(talker, inzone_id2, 2);

} else {
myself.ShowPage(talker, fnHiEnterFail);

}

}
	}


}