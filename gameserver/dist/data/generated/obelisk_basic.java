package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class obelisk_basic extends citizen {
	protected void TALKED(HandlerParam talker) {
if (talker.nobless_type == 1) {
myself.ShowPage(talker, "obelisk001.htm");

} else {
myself.ShowPage(talker, "obelisk001a.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (ask == -50) {
if (talker.nobless_type == 1) {
myself.ShowPage(talker, "obelisk001.htm");

} else {
myself.ShowPage(talker, "obelisk001a.htm");

}

}
if (ask == -51) {
if (reply == 1) {
if (talker.hero_type == 1) {
if (gg.GetDateTime(0, 2) == 1) {
if (gg.GetDateTime(0, 3) >= 12 && gg.GetDateTime(0, 4) >= 0) {
myself.ShowPage(talker, "obelisk010.htm");

} else {
myself.ShowPage(talker, "obelisk010c.htm");

}

} else {
myself.ShowPage(talker, "obelisk010.htm");

}

} else if (talker.hero_type == 2) {
myself.ShowPage(talker, "obelisk010b.htm");

} else {
myself.ShowPage(talker, "obelisk010a.htm");

}

} else if (reply == 2) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 6611) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");

} else if (gg.OwnItemCount(talker, 6612) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");

} else if (gg.OwnItemCount(talker, 6613) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");

} else if (gg.OwnItemCount(talker, 6614) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");

} else if (gg.OwnItemCount(talker, 6615) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");

} else if (gg.OwnItemCount(talker, 6616) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");

} else if (gg.OwnItemCount(talker, 6617) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");

} else if (gg.OwnItemCount(talker, 6618) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");

} else if (gg.OwnItemCount(talker, 6619) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");

} else if (gg.OwnItemCount(talker, 6620) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");

} else if (gg.OwnItemCount(talker, 6621) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");

} else if (gg.OwnItemCount(talker, 9388) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");

} else if (gg.OwnItemCount(talker, 9389) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");

} else if (gg.OwnItemCount(talker, 9390) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");

} else {
myself.ShowPage(talker, "obelisk020.htm");

}

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 3) {

} else if (reply == 4) {
if (talker.hero_type == 2) {
if (gg.OwnItemCount(talker, 6842) >= 1) {
myself.ShowPage(talker, "obelisk020c.htm");

} else if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 6842, 1);

} else {
myself.ShowPage(talker, "obelisk020c.htm");

}

} else {
myself.ShowPage(talker, "obelisk020d.htm");

}

}

} else if (ask == -52) {
if (reply == 1) {
if (talker.hero_type == 1) {
if (myself.IsMainClass(talker) == 1) {
if (talker.level >= 75) {
myself.SetHero(talker);

} else {
myself.ShowPage(talker, "obelisk010d.htm");

}

} else {
myself.ShowPage(talker, "obelisk010e.htm");

}

} else {
myself.ShowPage(talker, "obelisk010a.htm");

}

}

} else if (ask == -53) {

} else if (ask == -54) {

} else if (ask == -60) {
if (gg.OwnItemCount(talker, 6611) >= 1 || gg.OwnItemCount(talker, 6612) >= 1 || gg.OwnItemCount(talker, 6613) >= 1 || gg.OwnItemCount(talker, 6614) >= 1 || gg.OwnItemCount(talker, 6615) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");
return;

}
if (gg.OwnItemCount(talker, 6616) >= 1 || gg.OwnItemCount(talker, 6617) >= 1 || gg.OwnItemCount(talker, 6618) >= 1 || gg.OwnItemCount(talker, 6619) >= 1 || gg.OwnItemCount(talker, 6620) >= 1 || gg.OwnItemCount(talker, 6621) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");
return;

}
if (gg.OwnItemCount(talker, 9388) >= 1 || gg.OwnItemCount(talker, 9389) >= 1 || gg.OwnItemCount(talker, 9390) >= 1) {
myself.ShowPage(talker, "obelisk020b.htm");
return;

}
if (talker.race != 5) {
if (reply == 1) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 6611, 1);

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 2) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 6612, 1);

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 3) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 6613, 1);

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 4) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 6614, 1);

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 5) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 6615, 1);

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 6) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 6616, 1);

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 7) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 6617, 1);

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 8) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 6618, 1);

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 9) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 6619, 1);

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 10) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 6620, 1);

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 11) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 6621, 1);

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 0) {
if (talker.nobless_type == 1) {
myself.ShowPage(talker, "obelisk001.htm");

} else {
myself.ShowPage(talker, "obelisk001a.htm");

}

}

} else if (reply == 12) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 9388, 1);

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 13) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 9389, 1);

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 14) {
if (talker.hero_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 9390, 1);

} else {
myself.ShowPage(talker, "obelisk020a.htm");

}

} else if (reply == 0) {
if (talker.nobless_type == 1) {
myself.ShowPage(talker, "obelisk001.htm");

} else {
myself.ShowPage(talker, "obelisk001a.htm");

}

}

} else if (ask == -61) {
if (reply == 0) {
if (talker.nobless_type == 1) {
myself.ShowPage(talker, "obelisk001.htm");

} else {
myself.ShowPage(talker, "obelisk001a.htm");

}

}

} else if (ask == -62) {
if (reply == 0) {
if (talker.nobless_type == 1) {
myself.ShowPage(talker, "obelisk001.htm");

} else {
myself.ShowPage(talker, "obelisk001a.htm");

}

}

} else if (ask == -70) {

}
	}

	protected void SET_HERO_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == 2) {
if (talker.race != 5) {
gg.Announce(gg.MakeFString(MakeFString + talker.subjob0_class, talker.name, "", "", "", ""));
myself.EffectMusic(myself.sm, 5000, "ns01_f");

} else {
gg.Announce(gg.MakeFString(MakeFString + talker.subjob0_class, talker.name, "", "", "", ""));
myself.EffectMusic(myself.sm, 5000, "ns01_f");

}

}
	}


}