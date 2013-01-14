package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wigoth_ghost_b extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 620) == 1 && gg.GetMemoStateEx(talker, 620, 1) == 2 && gg.OwnItemCount(talker, 7256) >= 1 && gg.OwnItemCount(talker, 7257) >= 1 && gg.OwnItemCount(talker, 7258) >= 1 && gg.OwnItemCount(talker, 7259) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Four Goblets (In Progress)");

}
if (gg.HaveMemo(talker, 620) == 1 && gg.GetMemoStateEx(talker, 620, 1) == 2 && gg.OwnItemCount(talker, 7256) == 0 || gg.OwnItemCount(talker, 7257) == 0 || gg.OwnItemCount(talker, 7258) == 0 || gg.OwnItemCount(talker, 7259) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Four Goblets (In Progress)");

}
if (gg.HaveMemo(talker, 620) == 1 && gg.GetMemoStateEx(talker, 620, 1) == 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Four Goblets (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 620) == 1 && gg.GetMemoStateEx(talker, 620, 1) == 2 && gg.OwnItemCount(talker, 7256) >= 1 && gg.OwnItemCount(talker, 7257) >= 1 && gg.OwnItemCount(talker, 7258) >= 1 && gg.OwnItemCount(talker, 7259) >= 1) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7255) == 0 && gg.OwnItemCount(talker, 7254) < 1000) {
myself.SetMemoStateEx(talker, 620, 1, 3);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_01.htm");

}
if (gg.OwnItemCount(talker, 7255) >= 1 && gg.OwnItemCount(talker, 7254) < 1000) {
myself.SetMemoStateEx(talker, 620, 1, 3);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_02.htm");

}
if (gg.OwnItemCount(talker, 7255) == 0 && gg.OwnItemCount(talker, 7254) >= 1000) {
myself.SetMemoStateEx(talker, 620, 1, 3);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_03.htm");

}
if (gg.OwnItemCount(talker, 7255) >= 1 && gg.OwnItemCount(talker, 7254) >= 1000) {
myself.SetMemoStateEx(talker, 620, 1, 3);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_04.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 620) == 1 && gg.GetMemoStateEx(talker, 620, 1) == 2 && gg.OwnItemCount(talker, 7256) == 0 || gg.OwnItemCount(talker, 7257) == 0 || gg.OwnItemCount(talker, 7258) == 0 || gg.OwnItemCount(talker, 7259) == 0) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7255) == 0 && gg.OwnItemCount(talker, 7254) < 1000) {
myself.SetMemoStateEx(talker, 620, 1, 3);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_05.htm");

}
if (gg.OwnItemCount(talker, 7255) >= 1 && gg.OwnItemCount(talker, 7254) < 1000) {
myself.SetMemoStateEx(talker, 620, 1, 3);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_06.htm");

}
if (gg.OwnItemCount(talker, 7255) == 0 && gg.OwnItemCount(talker, 7254) >= 1000) {
myself.SetMemoStateEx(talker, 620, 1, 3);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_07.htm");

}
if (gg.OwnItemCount(talker, 7255) >= 1 && gg.OwnItemCount(talker, 7254) >= 1000) {
myself.SetMemoStateEx(talker, 620, 1, 3);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_08.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 620) == 1 && gg.GetMemoStateEx(talker, 620, 1) == 3) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7255) == 0 && gg.OwnItemCount(talker, 7254) < 1000) {
myself.ShowPage(talker, "wigoth_ghost_b_q0620_09.htm");

}
if (gg.OwnItemCount(talker, 7255) >= 1 && gg.OwnItemCount(talker, 7254) < 1000) {
myself.ShowPage(talker, "wigoth_ghost_b_q0620_10.htm");

}
if (gg.OwnItemCount(talker, 7255) == 0 && gg.OwnItemCount(talker, 7254) >= 1000) {
myself.ShowPage(talker, "wigoth_ghost_b_q0620_11.htm");

}
if (gg.OwnItemCount(talker, 7255) >= 1 && gg.OwnItemCount(talker, 7254) >= 1000) {
myself.ShowPage(talker, "wigoth_ghost_b_q0620_12.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam reply, HandlerParam talker) {
if (ask == 620) {
myself.SetCurrentQuestID(620);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 620) {
if (reply == 1) {
if (gg.HaveMemo(talker, 620) && gg.GetMemoStateEx(talker, 620, 1) == 2 || gg.GetMemoStateEx(talker, 620, 1) == 3 && gg.OwnItemCount(talker, 7255) >= 1) {
if (gg.Rand(100) < 100) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(5);
i2 = 0;
if (i0 == 0) {
i2 = 1;
myself.GiveItem1(talker, 57, 10000);

} else if (i0 == 1) {
if (gg.Rand(1000) < 848) {
i2 = 1;
i1 = gg.Rand(1000);
if (i1 < 43) {
myself.GiveItem1(talker, 1884, 42);

} else if (i1 < 66) {
myself.GiveItem1(talker, 1895, 36);

} else if (i1 < 184) {
myself.GiveItem1(talker, 1876, 4);

} else if (i1 < 250) {
myself.GiveItem1(talker, 1881, 6);

} else if (i1 < 287) {
myself.GiveItem1(talker, 5549, 8);

} else if (i1 < 484) {
myself.GiveItem1(talker, 1874, 1);

} else if (i1 < 681) {
myself.GiveItem1(talker, 1889, 1);

} else if (i1 < 799) {
myself.GiveItem1(talker, 1877, 1);

} else if (i1 < 902) {
myself.GiveItem1(talker, 1894, 1);

} else {
myself.GiveItem1(talker, 4043, 1);

}

}
if (gg.Rand(1000) < 323) {
i2 = 1;
i1 = gg.Rand(1000);
if (i1 < 335) {
myself.GiveItem1(talker, 1888, 1);

} else if (i1 < 556) {
myself.GiveItem1(talker, 4040, 1);

} else if (i1 < 725) {
myself.GiveItem1(talker, 1890, 1);

} else if (i1 < 872) {
myself.GiveItem1(talker, 5550, 1);

} else if (i1 < 962) {
myself.GiveItem1(talker, 1893, 1);

} else if (i1 < 986) {
myself.GiveItem1(talker, 4046, 1);

} else {
myself.GiveItem1(talker, 4048, 1);

}

}

} else if (i0 == 2) {
if (gg.Rand(1000) < 847) {
i2 = 1;
i1 = gg.Rand(1000);
if (i1 < 148) {
myself.GiveItem1(talker, 1878, 8);

} else if (i1 < 175) {
myself.GiveItem1(talker, 1882, 24);

} else if (i1 < 273) {
myself.GiveItem1(talker, 1879, 4);

} else if (i1 < 322) {
myself.GiveItem1(talker, 1880, 6);

} else if (i1 < 357) {
myself.GiveItem1(talker, 1885, 6);

} else if (i1 < 554) {
myself.GiveItem1(talker, 1875, 1);

} else if (i1 < 685) {
myself.GiveItem1(talker, 1883, 1);

} else if (i1 < 803) {
myself.GiveItem1(talker, 5220, 1);

} else if (i1 < 901) {
myself.GiveItem1(talker, 4039, 1);

} else {
myself.GiveItem1(talker, 4044, 1);

}

}
if (gg.Rand(1000) < 251) {
i2 = 1;
i1 = gg.Rand(1000);
if (i1 < 350) {
myself.GiveItem1(talker, 1887, 1);

} else if (i1 < 587) {
myself.GiveItem1(talker, 4042, 1);

} else if (i1 < 798) {
myself.GiveItem1(talker, 1886, 1);

} else if (i1 < 922) {
myself.GiveItem1(talker, 4041, 1);

} else if (i1 < 966) {
myself.GiveItem1(talker, 1892, 1);

} else if (i1 < 996) {
myself.GiveItem1(talker, 1891, 1);

} else {
myself.GiveItem1(talker, 4047, 1);

}

}

} else if (i0 == 3) {
if (gg.Rand(1000) < 31) {
i2 = 1;
i1 = gg.Rand(1000);
if (i1 < 223) {
myself.GiveItem1(talker, 730, 1);

} else if (i1 < 893) {
myself.GiveItem1(talker, 948, 1);

} else {
myself.GiveItem1(talker, 960, 1);

}

}
if (gg.Rand(1000) < 5) {
i2 = 1;
i1 = gg.Rand(1000);
if (i1 < 202) {
myself.GiveItem1(talker, 729, 1);

} else if (i1 < 928) {
myself.GiveItem1(talker, 947, 1);

} else {
myself.GiveItem1(talker, 959, 1);

}

}

} else if (i0 == 4) {
if (gg.Rand(1000) < 329) {
i2 = 1;
i1 = gg.Rand(1000);
if (i1 < 88) {
myself.GiveItem1(talker, 6698, 1);

} else if (i1 < 185) {
myself.GiveItem1(talker, 6699, 1);

} else if (i1 < 238) {
myself.GiveItem1(talker, 6700, 1);

} else if (i1 < 262) {
myself.GiveItem1(talker, 6701, 1);

} else if (i1 < 292) {
myself.GiveItem1(talker, 6702, 1);

} else if (i1 < 356) {
myself.GiveItem1(talker, 6703, 1);

} else if (i1 < 420) {
myself.GiveItem1(talker, 6704, 1);

} else if (i1 < 482) {
myself.GiveItem1(talker, 6705, 1);

} else if (i1 < 554) {
myself.GiveItem1(talker, 6706, 1);

} else if (i1 < 576) {
myself.GiveItem1(talker, 6707, 1);

} else if (i1 < 640) {
myself.GiveItem1(talker, 6708, 1);

} else if (i1 < 704) {
myself.GiveItem1(talker, 6709, 1);

} else if (i1 < 777) {
myself.GiveItem1(talker, 6710, 1);

} else if (i1 < 799) {
myself.GiveItem1(talker, 6711, 1);

} else if (i1 < 863) {
myself.GiveItem1(talker, 6712, 1);

} else if (i1 < 927) {
myself.GiveItem1(talker, 6713, 1);

} else {
myself.GiveItem1(talker, 6714, 1);

}

}
if (gg.Rand(1000) < 54) {
i2 = 1;
i1 = gg.Rand(1000);
if (i1 < 100) {
myself.GiveItem1(talker, 6688, 1);

} else if (i1 < 198) {
myself.GiveItem1(talker, 6689, 1);

} else if (i1 < 298) {
myself.GiveItem1(talker, 6690, 1);

} else if (i1 < 398) {
myself.GiveItem1(talker, 6691, 1);

} else if (i1 < 499) {
myself.GiveItem1(talker, 7579, 1);

} else if (i1 < 601) {
myself.GiveItem1(talker, 6693, 1);

} else if (i1 < 703) {
myself.GiveItem1(talker, 6694, 1);

} else if (i1 < 801) {
myself.GiveItem1(talker, 6695, 1);

} else if (i1 < 902) {
myself.GiveItem1(talker, 6696, 1);

} else {
myself.GiveItem1(talker, 6697, 1);

}

}

}
myself.DeleteItem1(talker, 7255, 1);
if (i2 == 1) {
myself.ShowPage(talker, "wigoth_ghost_b_q0620_13.htm");

} else if (i2 == 0) {
myself.ShowPage(talker, "wigoth_ghost_b_q0620_14.htm");

}

}

} else {
myself.DeleteItem1(talker, 7255, 1);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_15.htm");

}

}
gg.AddLog(3, talker, 620);

} else if (reply == 2) {
if (gg.HaveMemo(talker, 620) && gg.GetMemoStateEx(talker, 620, 1) == 2 || gg.GetMemoStateEx(talker, 620, 1) == 3 && gg.OwnItemCount(talker, 7254) >= 1000) {
myself.ShowPage(talker, "wigoth_ghost_b_q0620_16.htm");

}

} else if (reply == 3) {
if (gg.HaveMemo(talker, 620) && gg.GetMemoStateEx(talker, 620, 1) == 2 || gg.GetMemoStateEx(talker, 620, 1) == 3 && gg.OwnItemCount(talker, 7254) >= 1000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6881, 1);
myself.DeleteItem1(talker, 7254, 1000);
gg.AddLog(3, talker, 620);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_17.htm");

}

}

} else if (reply == 4) {
if (gg.HaveMemo(talker, 620) && gg.GetMemoStateEx(talker, 620, 1) == 2 || gg.GetMemoStateEx(talker, 620, 1) == 3 && gg.OwnItemCount(talker, 7254) >= 1000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6883, 1);
myself.DeleteItem1(talker, 7254, 1000);
gg.AddLog(3, talker, 620);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_18.htm");

}

}

} else if (reply == 5) {
if (gg.HaveMemo(talker, 620) && gg.GetMemoStateEx(talker, 620, 1) == 2 || gg.GetMemoStateEx(talker, 620, 1) == 3 && gg.OwnItemCount(talker, 7254) >= 1000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6885, 1);
myself.DeleteItem1(talker, 7254, 1000);
gg.AddLog(3, talker, 620);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_19.htm");

}

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 620) && gg.GetMemoStateEx(talker, 620, 1) == 2 || gg.GetMemoStateEx(talker, 620, 1) == 3 && gg.OwnItemCount(talker, 7254) >= 1000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6887, 1);
myself.DeleteItem1(talker, 7254, 1000);
gg.AddLog(3, talker, 620);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_20.htm");

}

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 620) && gg.GetMemoStateEx(talker, 620, 1) == 2 || gg.GetMemoStateEx(talker, 620, 1) == 3 && gg.OwnItemCount(talker, 7254) >= 1000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7580, 1);
myself.DeleteItem1(talker, 7254, 1000);
gg.AddLog(3, talker, 620);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_21.htm");

}

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 620) && gg.GetMemoStateEx(talker, 620, 1) == 2 || gg.GetMemoStateEx(talker, 620, 1) == 3 && gg.OwnItemCount(talker, 7254) >= 1000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6891, 1);
myself.DeleteItem1(talker, 7254, 1000);
gg.AddLog(3, talker, 620);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_22.htm");

}

}

} else if (reply == 9) {
if (gg.HaveMemo(talker, 620) && gg.GetMemoStateEx(talker, 620, 1) == 2 || gg.GetMemoStateEx(talker, 620, 1) == 3 && gg.OwnItemCount(talker, 7254) >= 1000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6893, 1);
myself.DeleteItem1(talker, 7254, 1000);
gg.AddLog(3, talker, 620);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_23.htm");

}

}

} else if (reply == 10) {
if (gg.HaveMemo(talker, 620) && gg.GetMemoStateEx(talker, 620, 1) == 2 || gg.GetMemoStateEx(talker, 620, 1) == 3 && gg.OwnItemCount(talker, 7254) >= 1000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6895, 1);
myself.DeleteItem1(talker, 7254, 1000);
gg.AddLog(3, talker, 620);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_24.htm");

}

}

} else if (reply == 11) {
if (gg.HaveMemo(talker, 620) && gg.GetMemoStateEx(talker, 620, 1) == 2 || gg.GetMemoStateEx(talker, 620, 1) == 3 && gg.OwnItemCount(talker, 7254) >= 1000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6897, 1);
myself.DeleteItem1(talker, 7254, 1000);
gg.AddLog(3, talker, 620);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_25.htm");

}

}

} else if (reply == 12) {
if (gg.HaveMemo(talker, 620) && gg.GetMemoStateEx(talker, 620, 1) == 2 || gg.GetMemoStateEx(talker, 620, 1) == 3 && gg.OwnItemCount(talker, 7254) >= 1000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6899, 1);
myself.DeleteItem1(talker, 7254, 1000);
gg.AddLog(3, talker, 620);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_26.htm");

}

}

} else if (reply == 13) {
if (gg.HaveMemo(talker, 620) == 1) {
myself.InstantTeleport(talker, 170000, -88250, -2912);
myself.ShowPage(talker, "wigoth_ghost_b_q0620_01a.htm");

}

}

}
super;
	}


}