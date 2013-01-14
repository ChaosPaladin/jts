package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_rosalia extends default_npc {
	protected void CREATED() {
super;
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "br_val_rosalia001.htm");
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 50020) {
switch (reply) {
case 1: {
if (gg.OwnItemCount(talker, 20921) >= 1) {
myself.ShowPage(talker, "br_val_rosalia010.htm");

} else {
myself.ShowPage(talker, "br_val_rosalia002.htm");

}
break;

}
case 2: {

}
case 3: {

}
case 4: {
if (gg.OwnItemCount(talker, 57) < 500) {
myself.ShowPage(talker, "br_val_rosalia024.htm");

} else {
myself.DeleteItem1(talker, 57, 500);
if (reply == 2) {
myself.GiveItem1(talker, 20905, 1);

} else if (reply == 3) {
myself.GiveItem1(talker, 20906, 1);

} else if (reply == 4) {
myself.GiveItem1(talker, 20907, 1);

}
myself.ShowPage(talker, "br_val_rosalia023.htm");

}
break;

}
case 5: {

}
case 6: {

}
case 7: {
if (gg.OwnItemCount(talker, 57) < 5000) {
myself.ShowPage(talker, "br_val_rosalia024.htm");

} else {
myself.DeleteItem1(talker, 57, 5000);
if (reply == 5) {
myself.GiveItem1(talker, 20905, 10);

} else if (reply == 6) {
myself.GiveItem1(talker, 20906, 10);

} else if (reply == 7) {
myself.GiveItem1(talker, 20907, 10);

}
myself.ShowPage(talker, "br_val_rosalia023.htm");

}
break;

}
case 8: {
if (gg.OwnItemCount(talker, 20914) >= 1) {
myself.ShowPage(talker, "br_val_rosalia007.htm");

} else {
myself.ShowPage(talker, "br_val_rosalia008.htm");

}
break;

}
case 9: {

}
case 10: {

}
case 11: {

}
case 12: {

}
case 13: {

}
case 14: {
if (myself.GetInventoryInfo(talker, 1) - myself.GetInventoryInfo(talker, 0) >= 2) {
myself.GiveItem1(talker, 20921, 1);
if (reply == 9) {
myself.CreatePet(talker, 20908, 1001562, 1);

} else if (reply == 10) {
myself.CreatePet(talker, 20909, 1001563, 1);

} else if (reply == 11) {
myself.CreatePet(talker, 20910, 1001564, 1);

} else if (reply == 12) {
myself.CreatePet(talker, 20911, 1001565, 1);

} else if (reply == 13) {
myself.CreatePet(talker, 20912, 1001566, 1);

} else if (reply == 14) {
myself.CreatePet(talker, 20913, 1001567, 1);

}
myself.ShowPage(talker, "br_val_rosalia025.htm");

} else {
myself.ShowSystemMessage(talker, 6006);

}
break;

}
case 15: {

}
case 16: {

}
case 17: {

}
case 18: {

}
case 19: {

}
case 20: {
if (myself.GetInventoryInfo(talker, 1) - myself.GetInventoryInfo(talker, 0) >= 1) {
myself.DeleteItem1(talker, 20914, 1);
if (reply == 15) {
myself.CreatePet(talker, 20915, 1001568, 1);

} else if (reply == 16) {
myself.CreatePet(talker, 20916, 1001569, 1);

} else if (reply == 17) {
myself.CreatePet(talker, 20917, 1001570, 1);

} else if (reply == 18) {
myself.CreatePet(talker, 20918, 1001571, 1);

} else if (reply == 19) {
myself.CreatePet(talker, 20919, 1001572, 1);

} else if (reply == 20) {
myself.CreatePet(talker, 20920, 1001573, 1);

}
myself.ShowPage(talker, "br_val_rosalia026.htm");

} else {
myself.ShowSystemMessage(talker, 6006);

}
break;

}

}

}
	}


}