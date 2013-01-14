package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_archbishop_of_eva extends default_npc {
	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "br_fire_elemental_archbishop001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0) {
if (ask == 50000) {
switch (reply) {
case 1: {
if (myself.GetGlobalMap(103) != 6) {
myself.ShowPage(talker, "br_fire_elemental_archbishop008.htm");

} else if (gg.OwnItemCount(talker, 20573) > 0 || gg.OwnItemCount(talker, 20604) > 0) {
myself.ShowPage(talker, "br_fire_elemental_archbishop007.htm");

} else {
myself.GiveItem1(talker, 20573, 1);
myself.GiveItem1(talker, 20604, 1);
myself.ShowPage(talker, "br_fire_elemental_archbishop009.htm");

}
break;

}
case 2: {
if (myself.GetGlobalMap(103) != 10) {
myself.ShowPage(talker, "br_fire_elemental_archbishop008.htm");

} else if (gg.OwnItemCount(talker, 20574) > 0 || gg.OwnItemCount(talker, 20605) > 0) {
myself.ShowPage(talker, "br_fire_elemental_archbishop007.htm");

} else {
i0 = gg.OwnItemCount(talker, 20604);
if (i0 > 0) {
myself.DeleteItem1(talker, 20604, i0);

}
myself.GiveItem1(talker, 20574, 1);
myself.GiveItem1(talker, 20605, 1);
myself.ShowPage(talker, "br_fire_elemental_archbishop010.htm");

}
break;

}
case 3: {
if (myself.GetGlobalMap(103) != 14) {
myself.ShowPage(talker, "br_fire_elemental_archbishop008.htm");

} else if (gg.OwnItemCount(talker, 20575) > 0 || gg.OwnItemCount(talker, 20606) > 0) {
myself.ShowPage(talker, "br_fire_elemental_archbishop007.htm");

} else {
i0 = gg.OwnItemCount(talker, 20604);
if (i0 > 0) {
myself.DeleteItem1(talker, 20604, i0);

}
i0 = gg.OwnItemCount(talker, 20605);
if (i0 > 0) {
myself.DeleteItem1(talker, 20605, i0);

}
myself.GiveItem1(talker, 20575, 1);
myself.GiveItem1(talker, 20606, 1);
myself.ShowPage(talker, "br_fire_elemental_archbishop011.htm");

}
break;

}

}

}
	}


}