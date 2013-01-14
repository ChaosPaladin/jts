package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class shaman_for_friend extends citizen {
	protected String fnBuffList = "";
	protected String fnNoItem = "";
	protected int Buff1 = 0;
	protected int Buff2 = 0;
	protected int Buff3 = 0;
	protected int Buff4 = 0;
	protected int Buff5 = 0;
	protected int Buff6 = 0;
	protected int Buff7 = 0;
	protected int Buff8 = 0;
	protected int BuffForItem = 0;
	protected int BuffPrices1 = 0;
	protected int BuffPrices2 = 0;
	protected int BuffPrices3 = 0;
	protected int BuffPrices4 = 0;
	protected int BuffPrices5 = 0;
	protected int BuffPrices6 = 0;
	protected int BuffPrices7 = 0;
	protected int BuffPrices8 = 0;

	protected void CREATED() {
myself.AddTimerEx(6013, 10000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 6013) {
if (myself.InMyTerritory(myself.sm)) {

} else {
myself.InstantRandomTeleportInMyTerritory();

}
myself.AddTimerEx(6013, 10000);

}
super;
	}

	protected void TALKED(HandlerParam talker) {
if (FriendShip1 == 0) {
myself.ShowPage(talker, fnHi);

} else if (gg.OwnItemCount(talker, FriendShip3) > 0 || gg.OwnItemCount(talker, FriendShip4) > 0 || gg.OwnItemCount(talker, FriendShip5) > 0) {
myself.ShowPage(talker, fnBuffList);

} else if (gg.OwnItemCount(talker, FriendShip1) > 0 || gg.OwnItemCount(talker, FriendShip2) > 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnNoFriend);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0) {
if (ask == -34) {
if (reply == 1) {
if (gg.OwnItemCount(talker, BuffForItem) >= BuffPrices1) {
myself.AddUseSkillDesire(talker, Buff1, 1, 0, 1000000);

} else {
myself.ShowPage(talker, fnNoItem);

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, BuffForItem) >= BuffPrices2) {
myself.AddUseSkillDesire(talker, Buff2, 1, 0, 1000000);

} else {
myself.ShowPage(talker, fnNoItem);

}

} else if (reply == 3) {
if (gg.OwnItemCount(talker, BuffForItem) >= BuffPrices3) {
myself.AddUseSkillDesire(talker, Buff3, 1, 0, 1000000);

} else {
myself.ShowPage(talker, fnNoItem);

}

} else if (reply == 4) {
if (gg.OwnItemCount(talker, BuffForItem) >= BuffPrices4) {
myself.AddUseSkillDesire(talker, Buff4, 1, 0, 1000000);

} else {
myself.ShowPage(talker, fnNoItem);

}

} else if (reply == 5) {
if (gg.OwnItemCount(talker, BuffForItem) >= BuffPrices5) {
myself.AddUseSkillDesire(talker, Buff5, 1, 0, 1000000);

} else {
myself.ShowPage(talker, fnNoItem);

}

} else if (reply == 6) {
if (gg.OwnItemCount(talker, BuffForItem) >= BuffPrices6) {
myself.AddUseSkillDesire(talker, Buff6, 1, 0, 1000000);

} else {
myself.ShowPage(talker, fnNoItem);

}

} else if (reply == 7) {
if (gg.OwnItemCount(talker, BuffForItem) >= BuffPrices7) {
myself.AddUseSkillDesire(talker, Buff7, 1, 0, 1000000);

} else {
myself.ShowPage(talker, fnNoItem);

}

} else if (reply == 8) {
if (gg.OwnItemCount(talker, BuffForItem) >= BuffPrices8) {
myself.AddUseSkillDesire(talker, Buff8, 1, 0, 1000000);

} else {
myself.ShowPage(talker, fnNoItem);

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam success, HandlerParam skill_name_id) {
if (success == 1) {
if (skill_name_id == 285671426) {
myself.DeleteItem1(target, BuffForItem, BuffPrices1);

} else if (skill_name_id == 285736962) {
myself.DeleteItem1(target, BuffForItem, BuffPrices2);

} else if (skill_name_id == 284753923) {
myself.DeleteItem1(target, BuffForItem, BuffPrices3);

} else if (skill_name_id == 285409282) {
myself.DeleteItem1(target, BuffForItem, BuffPrices4);

} else if (skill_name_id == 285212673) {
myself.DeleteItem1(target, BuffForItem, BuffPrices5);

} else if (skill_name_id == 285343746) {
myself.DeleteItem1(target, BuffForItem, BuffPrices6);

} else if (skill_name_id == 285474817) {
myself.DeleteItem1(target, BuffForItem, BuffPrices7);

} else if (skill_name_id == 285540354) {
myself.DeleteItem1(target, BuffForItem, BuffPrices8);

}

}
	}


}