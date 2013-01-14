package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_guide_gcol extends teleporter {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam fhtml1, HandlerParam party0, HandlerParam party1, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam c3, HandlerParam c4, HandlerParam i0, HandlerParam i1) {
if (ask == -1020) {
if (reply == 1001) {
myself.ShowPage(talker, "kerthang_manager016.htm");

} else if (reply == 1002) {
myself.ShowPage(talker, "guide_gcol002.htm");

} else if (reply == 1003) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.InstantTeleport(talker, -59161, -56954, -2036);

} else if (i0 < 40) {
myself.InstantTeleport(talker, -59155, -56831, -2036);

} else if (i0 < 60) {
myself.InstantTeleport(talker, -59299, -56955, -2036);

} else if (i0 < 80) {
myself.InstantTeleport(talker, -59224, -56837, -2036);

} else {
myself.InstantTeleport(talker, -59134, -56899, -2036);

}

} else if (reply == 2001) {
i0 = gg.Rand(100);
if (i0 < 50) {
myself.InstantTeleport(talker, -84451, -45452, -10728);

} else {
myself.InstantTeleport(talker, -84580, -45587, -10728);

}

} else if (reply == 2002) {
i0 = gg.Rand(100);
if (i0 < 50) {
myself.InstantTeleport(talker, -86154, -50429, -10728);

} else {
myself.InstantTeleport(talker, -86118, -50624, -10728);

}

} else if (reply == 2003) {
i0 = gg.Rand(100);
if (i0 < 50) {
myself.InstantTeleport(talker, -82009, -53652, -10728);

} else {
myself.InstantTeleport(talker, -81802, -53665, -10728);

}

} else if (reply == 2004) {
i0 = gg.Rand(100);
if (i0 < 50) {
myself.InstantTeleport(talker, -77603, -50673, -10728);

} else {
myself.InstantTeleport(talker, -77586, -50503, -10728);

}

} else if (reply == 2005) {
i0 = gg.Rand(100);
if (i0 < 50) {
myself.InstantTeleport(talker, -79186, -45644, -10728);

} else {
myself.InstantTeleport(talker, -79309, -45561, -10728);

}

}

}
	}


}