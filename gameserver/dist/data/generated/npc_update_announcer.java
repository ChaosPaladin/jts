package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_update_announcer extends citizen {
	protected int toll_item = 57;
	protected int toll_price10 = 10000;
	protected int toll_price11 = 10000;
	protected int toll_price12 = 10000;
	protected int toll_price13 = 10000;
	protected int toll_price14 = 10000;
	protected int toll_price15 = 10000;
	protected int toll_price16 = 10000;
	protected int toll_price17 = 10000;
	protected int toll_price18 = 10000;
	protected int toll_price19 = 10000;
	protected String fnHTML002 = "update_announcer002.htm";
	protected String fnHTML002a = "update_announcer002a.htm";
	protected String fnHTML002b = "update_announcer002b.htm";
	protected String fnHTML002c = "update_announcer002c.htm";
	protected String fnHTML002d = "update_announcer002d.htm";
	protected String fnHTML002e = "update_announcer002e.htm";
	protected String fnHTML002f = "update_announcer002f.htm";
	protected String fnHTML002g = "update_announcer002g.htm";
	protected String fnHTML002h = "update_announcer002h.htm";
	protected String fnHTML002i = "update_announcer002i.htm";
	protected String fnHTML003 = "update_announcer003.htm";
	protected String fnHTML004 = "update_announcer004.htm";
	protected String fnHTML005 = "update_announcer005.htm";
	protected String fnNotAllowed = "update_announcer006.htm";
	protected String fnUnderSiege = "update_announcer007.htm";
	protected int babble_mode = 0;

protected Object[][] dest10 = {
{"Sel Mahum Training Grounds (West Gate)";76839;63851;-3648;10000;0}, {"Sel Mahum Training Grounds (South Gate)";79414;71496;-3448;10000;0}, {"Sel Mahum Training Grounds (Center)";87448;61460;-3664;10000;0}
};
protected Object[][] dest11 = {
{"Plains of the Lizardmen";87252;85514;-3103;10000;0}
};
protected Object[][] dest12 = {
{"Wild Beast Pastures";43805;-88010;-2780;10000;0}
};
protected Object[][] dest13 = {
{"Pavel Ruins";91280;-117152;-3952;10000;0}
};
protected Object[][] dest14 = {
{"Monastery of Silence";106414;-87799;-2949;10000;0}
};
protected Object[][] dest20 = {
{"Sel Mahum Training Grounds (West Gate)";76839;63851;-3648;10000;0}, {"Sel Mahum Training Grounds (South Gate)";79414;71496;-3448;10000;0}, {"Sel Mahum Training Grounds (Center)";87448;61460;-3664;10000;0}, {"Plains of the Lizardmen";87252;85514;-3103;10000;0}, {"Wild Beast Pastures";43805;-88010;-2780;10000;0}, {"Pavel Ruins";91280;-117152;-3952;10000;0}, {"Monastery of Silence";106414;-87799;-2949;10000;0}
};
protected Object[][] dest21 = {
{"The Town of Giran";83551;147945;-3400;100000;3}, {"Town of Aden";146783;25808;-2000;100000;5}, {"Town of Oren";82971;53207;-1470;100000;4}, {"Rune Township";43835;-47749;-792;100000;8}, {"Town of Goddard";148024;-55281;-2728;100000;7}
};

	protected void CREATED() {
myself.RegisterTeleporterType(1, 0);
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam fhtml0, HandlerParam maker0) {
if (ask == -7801) {
if (reply == 1) {
myself.ShowPage(talker, fnHTML002);

} else if (reply == 2) {
myself.Teleport(talker, dest20, "", "", "", "", toll_item, gg.MakeFString(1000308, "", "", "", "", ""));

} else if (reply == 3) {
myself.Teleport(talker, dest21, "", "", "", "", toll_item, gg.MakeFString(1000308, "", "", "", "", ""));

} else if (reply == 91) {
myself.ShowPage(talker, fnHTML002a);

} else if (reply == 92) {
myself.ShowPage(talker, fnHTML002b);

} else if (reply == 93) {
myself.ShowPage(talker, fnHTML002c);

} else if (reply == 94) {
myself.ShowPage(talker, fnHTML002d);

} else if (reply == 95) {
myself.ShowPage(talker, fnHTML002e);

} else if (reply == 96) {
myself.ShowPage(talker, fnHTML002f);

} else if (reply == 97) {
myself.ShowPage(talker, fnHTML002g);

} else if (reply == 98) {
myself.ShowPage(talker, fnHTML002h);

} else if (reply == 99) {
myself.ShowPage(talker, fnHTML002i);

} else if (reply == 10 && gg.OwnItemCount(talker, toll_item) >= toll_price10) {
myself.Teleport(talker, dest10, "", "", "", "", toll_item, gg.MakeFString(1000308, "", "", "", "", ""));

} else if (reply == 11 && gg.OwnItemCount(talker, toll_item) >= toll_price11) {
myself.Teleport(talker, dest11, "", "", "", "", toll_item, gg.MakeFString(1000308, "", "", "", "", ""));

} else if (reply == 12 && gg.OwnItemCount(talker, toll_item) >= toll_price12) {
myself.Teleport(talker, dest12, "", "", "", "", toll_item, gg.MakeFString(1000308, "", "", "", "", ""));

} else if (reply == 13 && gg.OwnItemCount(talker, toll_item) >= toll_price13) {
myself.Teleport(talker, dest13, "", "", "", "", toll_item, gg.MakeFString(1000308, "", "", "", "", ""));

} else if (reply == 14 && gg.OwnItemCount(talker, toll_item) >= toll_price14) {
myself.Teleport(talker, dest14, "", "", "", "", toll_item, gg.MakeFString(1000308, "", "", "", "", ""));

} else {
myself.ShowPage(talker, fnNotAllowed);

}

}
	}


}