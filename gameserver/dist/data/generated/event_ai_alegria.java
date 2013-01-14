package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_ai_alegria extends citizen {
	protected void CREATED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.c_ai0 = gg.GetCreatureFromID(myself.sm.param3);
myself.EffectMusic(myself.sm, 10000, "HB01");
myself.AddTimerEx(20002, 360000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 20002) {
myself.Despawn();

}
if (timer_id == 20003) {
myself.Suicide();

}
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "event_alegria001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
if (ask == 20001) {
if (reply == 1) {
if (gg.IsCreateDate(talker) == 1) {
if (gg.CanGetBirthdayGift(talker) == 1) {
if (gg.GetBirthdayGiftCount(talker) == 0) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "event_alegria003.htm");
myself.GiveItem1(talker, 13488, 1);
gg.SaveGetBirthdayGiftTime(talker);
myself.CastBuffForQuestReward(talker, 389939201);

} else if (gg.GetBirthdayGiftCount(talker) == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "event_alegria003.htm");
myself.GiveItem1(talker, 13488, 1);
gg.SaveGetBirthdayGiftTime(talker);
myself.CastBuffForQuestReward(talker, 389939201);

} else if (gg.GetBirthdayGiftCount(talker) == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "event_alegria003.htm");
gg.SaveGetBirthdayGiftTime(talker);
myself.CastBuffForQuestReward(talker, 389939201);

} else if (gg.GetBirthdayGiftCount(talker) == 3) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "event_alegria003.htm");
gg.SaveGetBirthdayGiftTime(talker);
myself.CastBuffForQuestReward(talker, 389939201);

} else if (gg.GetBirthdayGiftCount(talker) == 4) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "event_alegria003.htm");
gg.SaveGetBirthdayGiftTime(talker);
myself.CastBuffForQuestReward(talker, 389939201);

} else {
myself.ShowPage(talker, "event_alegria006.htm");

}

} else {
myself.ShowPage(talker, "event_alegria005.htm");

}
myself.AddTimerEx(20003, 1000);

} else {
myself.ShowPage(talker, "event_alegria004.htm");

}

}

}
	}


}