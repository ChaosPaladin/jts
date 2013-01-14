package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class redfoot extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hunt of the Black Lion (In Progress)");

}
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Hunt of the Black Lion (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) == 0) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "redfoot_q0333_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) >= 1) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "redfoot_q0333_02.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam reply, HandlerParam talker) {
if (ask == 333) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 333) {
i0 = gg.Rand(100);
i1 = gg.Rand(100);
if (reply == 1) {
if (gg.OwnItemCount(talker, 57) < 650 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) >= 1) {
myself.ShowPage(talker, "redfoot_q0333_03.htm");

} else if (gg.OwnItemCount(talker, 57) >= 650 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (i0 < 40) {
if (i1 < 33) {
myself.GiveItem1(talker, 3444, 1);
myself.ShowPage(talker, "redfoot_q0333_04a.htm");

} else if (i1 < 66) {
myself.GiveItem1(talker, 3445, 1);
myself.ShowPage(talker, "redfoot_q0333_04b.htm");

} else {
myself.GiveItem1(talker, 3446, 1);
myself.ShowPage(talker, "redfoot_q0333_04c.htm");

}

} else if (i0 < 60) {
if (i1 < 33) {
myself.GiveItem1(talker, 3447, 1);
myself.ShowPage(talker, "redfoot_q0333_04d.htm");

} else if (i1 < 66) {
myself.GiveItem1(talker, 3448, 1);
myself.ShowPage(talker, "redfoot_q0333_04e.htm");

} else {
myself.GiveItem1(talker, 3449, 1);
myself.ShowPage(talker, "redfoot_q0333_04f.htm");

}

} else if (i0 < 70) {
if (i1 < 33) {
myself.GiveItem1(talker, 3450, 1);
myself.ShowPage(talker, "redfoot_q0333_04g.htm");

} else if (i1 < 66) {
myself.GiveItem1(talker, 3451, 1);
myself.ShowPage(talker, "redfoot_q0333_04h.htm");

} else {
myself.GiveItem1(talker, 3452, 1);
myself.ShowPage(talker, "redfoot_q0333_04i.htm");

}

} else if (i0 < 75) {
if (i1 < 33) {
myself.GiveItem1(talker, 3453, 1);
myself.ShowPage(talker, "redfoot_q0333_04j.htm");

} else if (i1 < 66) {
myself.GiveItem1(talker, 3454, 1);
myself.ShowPage(talker, "redfoot_q0333_04k.htm");

} else {
myself.GiveItem1(talker, 3455, 1);
myself.ShowPage(talker, "redfoot_q0333_04l.htm");

}

} else if (i0 < 76) {
myself.GiveItem1(talker, 3456, 1);
myself.ShowPage(talker, "redfoot_q0333_04m.htm");

} else if (gg.Rand(100) < 50) {
if (i1 < 25) {
myself.GiveItem1(talker, 3457, 1);

} else if (i1 < 50) {
myself.GiveItem1(talker, 3458, 1);

} else if (i1 < 75) {
myself.GiveItem1(talker, 3459, 1);

} else {
myself.GiveItem1(talker, 3460, 1);

}
myself.ShowPage(talker, "redfoot_q0333_04n.htm");

} else {
if (i1 < 25) {
myself.GiveItem1(talker, 3462, 1);

} else if (i1 < 50) {
myself.GiveItem1(talker, 3463, 1);

} else if (i1 < 75) {
myself.GiveItem1(talker, 3464, 1);

} else {
myself.GiveItem1(talker, 3465, 1);

}
myself.ShowPage(talker, "redfoot_q0333_04o.htm");

}
myself.DeleteItem1(talker, 57, 650);
if (gg.OwnItemCount(talker, 3440) >= 1) {
myself.DeleteItem1(talker, 3440, 1);

} else if (gg.OwnItemCount(talker, 3441) >= 1) {
myself.DeleteItem1(talker, 3441, 1);

} else if (gg.OwnItemCount(talker, 3442) >= 1) {
myself.DeleteItem1(talker, 3442, 1);

} else if (gg.OwnItemCount(talker, 3443) >= 1) {
myself.DeleteItem1(talker, 3443, 1);

}

}

} else if (gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) < 1) {
myself.ShowPage(talker, "redfoot_q0333_05.htm");

}

}
if (reply == 2) {
myself.ShowPage(talker, "redfoot_q0333_06.htm");

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 57) < 200 + gg.GetMemoState(talker, 333) * 200) {
myself.ShowPage(talker, "redfoot_q0333_07.htm");

} else if (gg.GetMemoState(talker, 333) * 100 > 200) {
myself.ShowPage(talker, "redfoot_q0333_08.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (i0 < 5) {
myself.ShowPage(talker, "redfoot_q0333_08a.htm");

} else if (i0 < 10) {
myself.ShowPage(talker, "redfoot_q0333_08b.htm");

} else if (i0 < 15) {
myself.ShowPage(talker, "redfoot_q0333_08c.htm");

} else if (i0 < 20) {
myself.ShowPage(talker, "redfoot_q0333_08d.htm");

} else if (i0 < 25) {
myself.ShowPage(talker, "redfoot_q0333_08e.htm");

} else if (i0 < 30) {
myself.ShowPage(talker, "redfoot_q0333_08f.htm");

} else if (i0 < 35) {
myself.ShowPage(talker, "redfoot_q0333_08g.htm");

} else if (i0 < 40) {
myself.ShowPage(talker, "redfoot_q0333_08h.htm");

} else if (i0 < 45) {
myself.ShowPage(talker, "redfoot_q0333_08i.htm");

} else if (i0 < 50) {
myself.ShowPage(talker, "redfoot_q0333_08j.htm");

} else if (i0 < 55) {
myself.ShowPage(talker, "redfoot_q0333_08k.htm");

} else if (i0 < 60) {
myself.ShowPage(talker, "redfoot_q0333_08l.htm");

} else if (i0 < 65) {
myself.ShowPage(talker, "redfoot_q0333_08m.htm");

} else if (i0 < 70) {
myself.ShowPage(talker, "redfoot_q0333_08n.htm");

} else if (i0 < 75) {
myself.ShowPage(talker, "redfoot_q0333_08o.htm");

} else if (i0 < 80) {
myself.ShowPage(talker, "redfoot_q0333_08p.htm");

} else if (i0 < 85) {
myself.ShowPage(talker, "redfoot_q0333_08q.htm");

} else if (i0 < 90) {
myself.ShowPage(talker, "redfoot_q0333_08r.htm");

} else if (i0 < 95) {
myself.ShowPage(talker, "redfoot_q0333_08s.htm");

} else {
myself.ShowPage(talker, "redfoot_q0333_08t.htm");

}
myself.DeleteItem1(talker, 57, 200 + gg.GetMemoState(talker, 333) * 200);
myself.SetMemoState(talker, 333, gg.GetMemoState(talker, 333) + 1);

}

}
if (reply == 4) {
myself.ShowPage(talker, "redfoot_q0333_09.htm");

}

}
super;
	}


}