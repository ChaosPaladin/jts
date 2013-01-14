package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lich_king_icarus extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 343) == 1 && myself.IsInCategory(2, talker.occupation)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Under the Shadow of the Ivory Tower (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 343) == 1 && myself.IsInCategory(2, talker.occupation)) {
myself.SetCurrentQuestID(343);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lich_king_icarus_q0343_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 343) {
myself.SetCurrentQuestID(343);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 343 && gg.HaveMemo(talker, 343) == 1 && myself.IsInCategory(2, talker.occupation)) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 4365) < 1) {
myself.ShowPage(talker, "lich_king_icarus_q0343_02.htm");

} else if (gg.OwnItemCount(talker, 4365) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(1000);
if (i0 <= 119) {
myself.GiveItem1(talker, 955, 1);

} else if (i0 <= 169) {
myself.GiveItem1(talker, 951, 1);

} else if (i0 <= 329) {
myself.GiveItem1(talker, 2511, gg.Rand(200) + 401);

} else if (i0 <= 559) {
myself.GiveItem1(talker, 2510, gg.Rand(200) + 401);

} else if (i0 <= 561) {
myself.GiveItem1(talker, 316, 1);

} else if (i0 <= 578) {
myself.GiveItem1(talker, 630, 1);

} else if (i0 <= 579) {
myself.GiveItem1(talker, 188, 1);

} else if (i0 <= 581) {
myself.GiveItem1(talker, 885, 1);

} else if (i0 <= 582) {
myself.GiveItem1(talker, 103, 1);

} else if (i0 <= 584) {
myself.GiveItem1(talker, 917, 1);

} else {
myself.GiveItem1(talker, 736, 1);

}
myself.DeleteItem1(talker, 4365, 1);
gg.AddLog(3, talker, 343);
myself.ShowPage(talker, "lich_king_icarus_q0343_03.htm");

}

}

}
if (reply == 2) {
myself.ShowPage(talker, "lich_king_icarus_q0343_04.htm");

}

}
super;
	}


}