package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_weave extends citizen {
	protected int fee_for_release_pin_c = 3200;
	protected int fee_for_release_pin_b = 11800;
	protected int fee_for_release_pin_a = 26500;
	protected int fee_for_release_pin_s = 136600;
	protected int fee_for_release_pou_c = 3200;
	protected int fee_for_release_pou_b = 11800;
	protected int fee_for_release_pou_a = 26500;
	protected int fee_for_release_pou_s = 136600;
	protected int fee_for_release_rune_a = 26500;
	protected int fee_for_release_rune_s = 136600;
	protected int fee_for_release_deco_a = 26500;
	protected int fee_for_release_deco_s = 136600;
	protected String fnNotHaveItem = "weaver_wolf_adams005.htm";
	protected String fnNotHaveAdena = "weaver_wolf_adams006.htm";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (ask == 23010) {
if (gg.OwnItemCount(talker, 57) > 0) {
if (reply == 1) {
i0 = gg.Rand(200);
if (gg.OwnItemCount(talker, 13898) > 0) {
myself.DeleteItem1(talker, 13898, 1);
myself.DeleteItem1(talker, 57, fee_for_release_pin_c);
if (i0 <= 1) {
myself.GiveItem1(talker, 13905, 1);

} else if (i0 <= 10) {
myself.GiveItem1(talker, 13904, 1);

} else if (i0 <= 40) {
myself.GiveItem1(talker, 13903, 1);

} else if (i0 <= 100) {
myself.GiveItem1(talker, 13902, 1);

} else {
myself.Say(gg.MakeFString(1300162, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNotHaveItem);

}

} else if (reply == 2) {
i0 = gg.Rand(200);
if (gg.OwnItemCount(talker, 13899) > 0) {
myself.DeleteItem1(talker, 13899, 1);
myself.DeleteItem1(talker, 57, fee_for_release_pin_b);
if (i0 <= 1) {
myself.GiveItem1(talker, 13909, 1);

} else if (i0 <= 10) {
myself.GiveItem1(talker, 13908, 1);

} else if (i0 <= 40) {
myself.GiveItem1(talker, 13907, 1);

} else if (i0 <= 100) {
myself.GiveItem1(talker, 13906, 1);

} else {
myself.Say(gg.MakeFString(1300162, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNotHaveItem);

}

} else if (reply == 3) {
i0 = gg.Rand(200);
if (gg.OwnItemCount(talker, 13900) > 0) {
myself.DeleteItem1(talker, 13900, 1);
myself.DeleteItem1(talker, 57, fee_for_release_pin_a);
if (i0 <= 1) {
myself.GiveItem1(talker, 13913, 1);

} else if (i0 <= 10) {
myself.GiveItem1(talker, 13912, 1);

} else if (i0 <= 40) {
myself.GiveItem1(talker, 13911, 1);

} else if (i0 <= 100) {
myself.GiveItem1(talker, 13910, 1);

} else {
myself.Say(gg.MakeFString(1300162, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNotHaveItem);

}

} else if (reply == 4) {
i0 = gg.Rand(200);
if (gg.OwnItemCount(talker, 13901) > 0) {
myself.DeleteItem1(talker, 13901, 1);
myself.DeleteItem1(talker, 57, fee_for_release_pin_s);
if (i0 <= 1) {
myself.GiveItem1(talker, 13917, 1);

} else if (i0 <= 10) {
myself.GiveItem1(talker, 13916, 1);

} else if (i0 <= 40) {
myself.GiveItem1(talker, 13915, 1);

} else if (i0 <= 100) {
myself.GiveItem1(talker, 13914, 1);

} else {
myself.Say(gg.MakeFString(1300162, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNotHaveItem);

}

}

} else {
myself.ShowPage(talker, fnNotHaveAdena);

}

} else if (ask == 23020) {
if (gg.OwnItemCount(talker, 57) > 0) {
if (reply == 1) {
i0 = gg.Rand(200);
if (gg.OwnItemCount(talker, 13918) > 0) {
myself.DeleteItem1(talker, 13918, 1);
myself.DeleteItem1(talker, 57, fee_for_release_pou_c);
if (i0 <= 1) {
myself.GiveItem1(talker, 13925, 1);

} else if (i0 <= 10) {
myself.GiveItem1(talker, 13924, 1);

} else if (i0 <= 40) {
myself.GiveItem1(talker, 13923, 1);

} else if (i0 <= 100) {
myself.GiveItem1(talker, 13922, 1);

} else {
myself.Say(gg.MakeFString(1300162, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNotHaveItem);

}

} else if (reply == 2) {
i0 = gg.Rand(200);
if (gg.OwnItemCount(talker, 13919) > 0) {
myself.DeleteItem1(talker, 13919, 1);
myself.DeleteItem1(talker, 57, fee_for_release_pou_b);
if (i0 <= 1) {
myself.GiveItem1(talker, 13929, 1);

} else if (i0 <= 10) {
myself.GiveItem1(talker, 13928, 1);

} else if (i0 <= 40) {
myself.GiveItem1(talker, 13927, 1);

} else if (i0 <= 100) {
myself.GiveItem1(talker, 13926, 1);

} else {
myself.Say(gg.MakeFString(1300162, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNotHaveItem);

}

} else if (reply == 3) {
i0 = gg.Rand(200);
if (gg.OwnItemCount(talker, 13920) > 0) {
myself.DeleteItem1(talker, 13920, 1);
myself.DeleteItem1(talker, 57, fee_for_release_pou_a);
if (i0 <= 1) {
myself.GiveItem1(talker, 13933, 1);

} else if (i0 <= 10) {
myself.GiveItem1(talker, 13932, 1);

} else if (i0 <= 40) {
myself.GiveItem1(talker, 13931, 1);

} else if (i0 <= 100) {
myself.GiveItem1(talker, 13930, 1);

} else {
myself.Say(gg.MakeFString(1300162, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNotHaveItem);

}

} else if (reply == 4) {
i0 = gg.Rand(200);
if (gg.OwnItemCount(talker, 13921) > 0) {
myself.DeleteItem1(talker, 13921, 1);
myself.DeleteItem1(talker, 57, fee_for_release_pou_s);
if (i0 <= 1) {
myself.GiveItem1(talker, 13937, 1);

} else if (i0 <= 10) {
myself.GiveItem1(talker, 13936, 1);

} else if (i0 <= 40) {
myself.GiveItem1(talker, 13935, 1);

} else if (i0 <= 100) {
myself.GiveItem1(talker, 13934, 1);

} else {
myself.Say(gg.MakeFString(1300162, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNotHaveItem);

}

}

} else {
myself.ShowPage(talker, fnNotHaveAdena);

}

} else if (ask == 23030) {
if (gg.OwnItemCount(talker, 57) > 0) {
if (reply == 1) {
i0 = gg.Rand(200);
if (gg.OwnItemCount(talker, 14902) > 0) {
myself.DeleteItem1(talker, 14902, 1);
myself.DeleteItem1(talker, 57, fee_for_release_rune_a);
if (i0 <= 1) {
myself.GiveItem1(talker, 14909, 1);

} else if (i0 <= 10) {
myself.GiveItem1(talker, 14908, 1);

} else if (i0 <= 40) {
myself.GiveItem1(talker, 14907, 1);

} else if (i0 <= 100) {
myself.GiveItem1(talker, 14906, 1);

} else {
myself.Say(gg.MakeFString(1300162, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNotHaveItem);

}

} else if (reply == 2) {
i0 = gg.Rand(200);
if (gg.OwnItemCount(talker, 14903) > 0) {
myself.DeleteItem1(talker, 14903, 1);
myself.DeleteItem1(talker, 57, fee_for_release_rune_s);
if (i0 <= 1) {
myself.GiveItem1(talker, 14913, 1);

} else if (i0 <= 10) {
myself.GiveItem1(talker, 14912, 1);

} else if (i0 <= 40) {
myself.GiveItem1(talker, 14911, 1);

} else if (i0 <= 100) {
myself.GiveItem1(talker, 14910, 1);

} else {
myself.Say(gg.MakeFString(1300162, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNotHaveItem);

}

}

} else {
myself.ShowPage(talker, fnNotHaveAdena);

}

} else if (ask == 23040) {
if (gg.OwnItemCount(talker, 57) > 0) {
if (reply == 1) {
i0 = gg.Rand(200);
if (gg.OwnItemCount(talker, 14904) > 0) {
myself.DeleteItem1(talker, 14904, 1);
myself.DeleteItem1(talker, 57, fee_for_release_deco_a);
if (i0 <= 1) {
myself.GiveItem1(talker, 14917, 1);

} else if (i0 <= 10) {
myself.GiveItem1(talker, 14916, 1);

} else if (i0 <= 40) {
myself.GiveItem1(talker, 14915, 1);

} else if (i0 <= 100) {
myself.GiveItem1(talker, 14914, 1);

} else {
myself.Say(gg.MakeFString(1300162, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNotHaveItem);

}

} else if (reply == 2) {
i0 = gg.Rand(200);
if (gg.OwnItemCount(talker, 14905) > 0) {
myself.DeleteItem1(talker, 14905, 1);
myself.DeleteItem1(talker, 57, fee_for_release_deco_s);
if (i0 <= 1) {
myself.GiveItem1(talker, 14921, 1);

} else if (i0 <= 10) {
myself.GiveItem1(talker, 14920, 1);

} else if (i0 <= 40) {
myself.GiveItem1(talker, 14919, 1);

} else if (i0 <= 100) {
myself.GiveItem1(talker, 14918, 1);

} else {
myself.Say(gg.MakeFString(1300162, "", "", "", "", ""));

}

} else {
myself.ShowPage(talker, fnNotHaveItem);

}

}

} else {
myself.ShowPage(talker, fnNotHaveAdena);

}

}
super;
	}


}