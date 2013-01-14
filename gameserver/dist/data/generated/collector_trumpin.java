package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class collector_trumpin extends citizen {
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
talker.param1 = 0;
myself.ShowPage(talker, "collector_trumpin_q0343_01.htm");
myself.SetHTMLCookie(talker, 343, 2);

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
if (myself.sm.class_id == 1030935) {
if (myself.GetHTMLCookie(talker, 343, 2) != -1) {
if (ask == 343 && gg.HaveMemo(talker, 343) == 1 && myself.IsInCategory(2, talker.occupation)) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 4364) < 10) {
myself.ShowPage(talker, "collector_trumpin_q0343_03.htm");

} else if (gg.OwnItemCount(talker, 4364) >= 10) {
talker.param2 = gg.Rand(2);
myself.ShowPage(talker, "collector_trumpin_q0343_04.htm");

}

}
if (reply == 2) {
if (talker.param2 == 0 && talker.param1 == 0 && gg.OwnItemCount(talker, 4364) >= 10) {
talker.param1 = 1;
talker.param2 = 2;
myself.ShowPage(talker, "collector_trumpin_q0343_05.htm");

} else if (talker.param2 == 0 && talker.param1 == 1 && gg.OwnItemCount(talker, 4364) >= 10) {
talker.param1 = 2;
talker.param2 = 2;
myself.ShowPage(talker, "collector_trumpin_q0343_05a.htm");

} else if (talker.param2 == 0 && talker.param1 == 2 && gg.OwnItemCount(talker, 4364) >= 10) {
talker.param1 = 3;
talker.param2 = 2;
myself.ShowPage(talker, "collector_trumpin_q0343_05b.htm");

} else if (talker.param2 == 0 && talker.param1 == 3 && gg.OwnItemCount(talker, 4364) >= 10) {
talker.param1 = 4;
talker.param2 = 2;
myself.ShowPage(talker, "collector_trumpin_q0343_05c.htm");

} else if (talker.param2 == 0 && talker.param1 == 4 && gg.OwnItemCount(talker, 4364) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4364, 310);
myself.ShowPage(talker, "collector_trumpin_q0343_05d.htm");
talker.param1 = 0;
talker.param2 = 2;

}

} else if (talker.param2 == 1 && gg.OwnItemCount(talker, 4364) >= 10) {
myself.DeleteItem1(talker, 4364, 10);
myself.ShowPage(talker, "collector_trumpin_q0343_06.htm");
talker.param1 = 0;
talker.param2 = 2;

} else if (gg.OwnItemCount(talker, 4364) < 10) {
myself.ShowPage(talker, "collector_trumpin_q0343_03.htm");

}

}
if (reply == 3) {
if (talker.param2 == 0 && gg.OwnItemCount(talker, 4364) >= 10) {
myself.DeleteItem1(talker, 4364, 10);
myself.ShowPage(talker, "collector_trumpin_q0343_07.htm");
talker.param1 = 0;
talker.param2 = 2;

} else if (talker.param2 == 1 && talker.param1 == 0 && gg.OwnItemCount(talker, 4364) >= 10) {
talker.param1 = 1;
talker.param2 = 2;
myself.ShowPage(talker, "collector_trumpin_q0343_08.htm");

} else if (talker.param2 == 1 && talker.param1 == 1 && gg.OwnItemCount(talker, 4364) >= 10) {
talker.param1 = 2;
talker.param2 = 2;
myself.ShowPage(talker, "collector_trumpin_q0343_08a.htm");

} else if (talker.param2 == 1 && talker.param1 == 2 && gg.OwnItemCount(talker, 4364) >= 10) {
talker.param1 = 3;
talker.param2 = 2;
myself.ShowPage(talker, "collector_trumpin_q0343_08b.htm");

} else if (talker.param2 == 1 && talker.param1 == 3 && gg.OwnItemCount(talker, 4364) >= 10) {
talker.param1 = 4;
talker.param2 = 2;
myself.ShowPage(talker, "collector_trumpin_q0343_08c.htm");

} else if (talker.param2 == 1 && talker.param1 == 4 && gg.OwnItemCount(talker, 4364) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4364, 310);
myself.ShowPage(talker, "collector_trumpin_q0343_08d.htm");
talker.param1 = 0;
talker.param2 = 2;

}

} else if (gg.OwnItemCount(talker, 4364) < 10) {
myself.ShowPage(talker, "collector_trumpin_q0343_03.htm");

}

}
if (reply == 4) {
if (talker.param1 == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4364, 10);
myself.ShowPage(talker, "collector_trumpin_q0343_09.htm");
talker.param1 = 0;
talker.param2 = 2;

}

} else if (talker.param1 == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4364, 30);
myself.ShowPage(talker, "collector_trumpin_q0343_09a.htm");
talker.param1 = 0;
talker.param2 = 2;

}

} else if (talker.param1 == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4364, 70);
myself.ShowPage(talker, "collector_trumpin_q0343_09b.htm");
talker.param1 = 0;
talker.param2 = 2;

}

} else if (talker.param1 == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4364, 150);
myself.ShowPage(talker, "collector_trumpin_q0343_09c.htm");
talker.param1 = 0;
talker.param2 = 2;

}

}

}
if (reply == 5) {
talker.param1 = 0;
talker.param2 = 2;
myself.ShowPage(talker, "collector_trumpin_q0343_10.htm");

}

}

}

}
super;
	}


}