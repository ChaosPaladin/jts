package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class castle_keeper extends citizen {
	protected String ShopName = "성 창고";
	protected String fnHi = "castle_keeper001.htm";
	protected String fnBye = "castle_keeper002.htm";
	protected String fnEmpty = "castle_keeper005.htm";
	protected String fnNoAuthority = "";
	protected String fnMedalLevel = "";
	protected String fnGetMedalSuccess = "";
	protected String fnNoReward = "";
	protected int item_medal = 9911;
	protected int num_oath = 1;
	protected int item_proof = 9910;
	protected int num_proof = 30;
	protected String fnChangeItem = "";
	protected String fnDecreaseCountFailed = "";
	protected String fnNotEnoughToChange = "";

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(-AddDoNothingDesire, 9999);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam fhtml0) {
if (ask == 222) {
if (myself.IsMyLord(talker) == 0) {
myself.ShowPage(talker, fnNoAuthority);
return;

}
if (reply == 0) {
i0 = myself.GetPledgeCastleSiegeDefenceCount(talker);
myself.FHTML_SetFileName(fhtml0, fnMedalLevel);
myself.FHTML_SetStr(fhtml0, "medal_level", gg.IntToStr(i0));
myself.ShowFHTML(talker, fhtml0);
return;

} else if (reply == 1) {
i0 = myself.GetPledgeCastleSiegeDefenceCount(talker);
if (i0 == 0) {
myself.ShowPage(talker, fnNoReward);
return;

} else {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItemByCastleSiegeDefence(talker, i0, item_medal, 0, i0);
return;

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, item_medal) >= num_oath) {
myself.DeleteItem1(talker, item_medal, num_oath);
myself.GiveItem1(talker, item_proof, num_proof);
myself.ShowPage(talker, fnChangeItem);

} else {
myself.ShowPage(talker, fnNotEnoughToChange);
return;

}

}

}
	}

	protected void PLEDGE_CASTLE_SIEGE_DEFENCE_COUNT_DECREASE_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == 0) {
myself.ShowPage(talker, fnDecreaseCountFailed);
return;

} else if (reply == 1) {
myself.ShowPage(talker, fnGetMedalSuccess);
return;

}
	}


}