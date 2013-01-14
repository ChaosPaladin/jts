package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_santa extends citizen {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (reply == 1) {
myself.ShowPage(talker, "event_wannabe_santa1_q0998_01.htm");

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 57) >= 1000) {
myself.ShowPage(talker, "event_wannabe_santa1_q0998_01a.htm");
myself.GiveItem1(talker, 5555, 1);
myself.DeleteItem1(talker, 57, 1000);

} else {
myself.ShowPage(talker, "event_wannabe_santa1_q0998_01b.htm");

}

} else if (reply == 3) {
myself.ShowPage(talker, "event_wannabe_santa1_q0998_02.htm");

} else if (reply == 4) {
if (gg.OwnItemCount(talker, 5556) >= 4 && gg.OwnItemCount(talker, 5557) >= 4 && gg.OwnItemCount(talker, 5558) >= 10 && gg.OwnItemCount(talker, 5559) >= 1) {
myself.ShowPage(talker, "event_wannabe_santa1_q0998_03.htm");
myself.DeleteItem1(talker, 5556, 4);
myself.DeleteItem1(talker, 5557, 4);
myself.DeleteItem1(talker, 5558, 10);
myself.DeleteItem1(talker, 5559, 1);
myself.GiveItem1(talker, 5560, 1);

} else {
myself.ShowPage(talker, "event_wannabe_santa1_q0998_03a.htm");

}

} else if (reply == 5) {
if (gg.OwnItemCount(talker, 5560) >= 10) {
myself.DeleteItem1(talker, 5560, 10);
myself.GiveItem1(talker, 5561, 1);
myself.ShowPage(talker, "event_wannabe_santa1_q0998_04.htm");

} else {
myself.ShowPage(talker, "event_wannabe_santa1_q0998_04a.htm");

}

} else if (reply == 6) {
myself.ShowPage(talker, "event_wannabe_santa1_q0998_05.htm");

} else if (reply == 11) {
myself.CastBuffForQuestReward(talker, 279314434);
myself.ShowPage(talker, "event_wannabe_santa1_q0998_06.htm");

} else if (reply == 12) {
myself.CastBuffForQuestReward(talker, 279379969);
myself.ShowPage(talker, "event_wannabe_santa1_q0998_07.htm");

} else if (reply == 13) {
myself.CastBuffForQuestReward(talker, 279445505);
myself.ShowPage(talker, "event_wannabe_santa1_q0998_08.htm");

} else if (reply == 14) {
myself.CastBuffForQuestReward(talker, 279511043);
myself.ShowPage(talker, "event_wannabe_santa1_q0998_09.htm");

} else if (reply == 15) {
myself.CastBuffForQuestReward(talker, 279576579);
myself.ShowPage(talker, "event_wannabe_santa1_q0998_10.htm");

} else if (reply == 21) {
myself.ShowPage(talker, "event_wannabe_santa1_q0998_11.htm");

} else if (reply == 22) {
if (gg.OwnItemCount(talker, 5560) >= 10) {
myself.DeleteItem1(talker, 5560, 10);
myself.GiveItem1(talker, 10606, 1);
myself.ShowPage(talker, "event_wannabe_santa1_q0998_12.htm");

} else {
myself.ShowPage(talker, "event_wannabe_santa1_q0998_13.htm");

}

}
	}


}