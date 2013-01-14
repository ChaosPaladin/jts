package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class whouse_keeper_walderal extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 372) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Legacy of Insolence");

}
if (gg.HaveMemo(talker, 372) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Legacy of Insolence (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 372) == 0) {
myself.SetCurrentQuestID(372);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 59) {
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_01.htm");

} else if (talker.level >= 59) {
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 372) == 1) {
myself.SetCurrentQuestID(372);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 372) {
myself.SetCurrentQuestID(372);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 372);
myself.SetFlagJournal(talker, 372, 1);
gg.AddLog(1, talker, 372);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "whouse_keeper_walderal_q0372_04.htm", 372);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam reply, HandlerParam talker) {
if (ask == 372) {
myself.SetCurrentQuestID(372);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 372) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "whouse_keeper_walderal_q0372_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 372);
myself.ShowQuestFHTML(talker, fhtml0, 372);

}
if (reply == 3 && gg.HaveMemo(talker, 372) == 1) {
if (gg.OwnItemCount(talker, 5989) < 1 || gg.OwnItemCount(talker, 5990) < 1 || gg.OwnItemCount(talker, 5991) < 1 || gg.OwnItemCount(talker, 5992) < 1 || gg.OwnItemCount(talker, 5993) < 1 || gg.OwnItemCount(talker, 5994) < 1 || gg.OwnItemCount(talker, 5995) < 1 || gg.OwnItemCount(talker, 5996) < 1 || gg.OwnItemCount(talker, 5997) < 1 || gg.OwnItemCount(talker, 5998) < 1 || gg.OwnItemCount(talker, 5999) < 1 || gg.OwnItemCount(talker, 6000) < 1 || gg.OwnItemCount(talker, 6001) < 1) {
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_06.htm");

} else if (gg.OwnItemCount(talker, 5989) >= 1 && gg.OwnItemCount(talker, 5990) >= 1 && gg.OwnItemCount(talker, 5991) >= 1 && gg.OwnItemCount(talker, 5992) >= 1 && gg.OwnItemCount(talker, 5993) >= 1 && gg.OwnItemCount(talker, 5994) >= 1 && gg.OwnItemCount(talker, 5995) >= 1 && gg.OwnItemCount(talker, 5996) >= 1 && gg.OwnItemCount(talker, 5997) >= 1 && gg.OwnItemCount(talker, 5998) >= 1 && gg.OwnItemCount(talker, 5999) >= 1 && gg.OwnItemCount(talker, 6000) >= 1 && gg.OwnItemCount(talker, 6001) >= 1) {
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_07.htm");

}

}
if (reply == 4) {
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_08.htm");

}
if (reply == 5 && gg.HaveMemo(talker, 372) == 1) {
myself.RemoveMemo(talker, 372);
gg.AddLog(2, talker, 372);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_09.htm");

}
if (reply == 6) {
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_11.htm");

}
if (reply == 7 && gg.HaveMemo(talker, 372) == 1) {
if (gg.OwnItemCount(talker, 5989) < 1 || gg.OwnItemCount(talker, 5990) < 1 || gg.OwnItemCount(talker, 5991) < 1 || gg.OwnItemCount(talker, 5992) < 1 || gg.OwnItemCount(talker, 5993) < 1 || gg.OwnItemCount(talker, 5994) < 1 || gg.OwnItemCount(talker, 5995) < 1 || gg.OwnItemCount(talker, 5996) < 1 || gg.OwnItemCount(talker, 5997) < 1 || gg.OwnItemCount(talker, 5998) < 1 || gg.OwnItemCount(talker, 5999) < 1 || gg.OwnItemCount(talker, 6000) < 1 || gg.OwnItemCount(talker, 6001) < 1) {
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_07e.htm");

} else if (gg.OwnItemCount(talker, 5989) >= 1 && gg.OwnItemCount(talker, 5990) >= 1 && gg.OwnItemCount(talker, 5991) >= 1 && gg.OwnItemCount(talker, 5992) >= 1 && gg.OwnItemCount(talker, 5993) >= 1 && gg.OwnItemCount(talker, 5994) >= 1 && gg.OwnItemCount(talker, 5995) >= 1 && gg.OwnItemCount(talker, 5996) >= 1 && gg.OwnItemCount(talker, 5997) >= 1 && gg.OwnItemCount(talker, 5998) >= 1 && gg.OwnItemCount(talker, 5999) >= 1 && gg.OwnItemCount(talker, 6000) >= 1 && gg.OwnItemCount(talker, 6001) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 5989, 1);
myself.DeleteItem1(talker, 5990, 1);
myself.DeleteItem1(talker, 5991, 1);
myself.DeleteItem1(talker, 5992, 1);
myself.DeleteItem1(talker, 5993, 1);
myself.DeleteItem1(talker, 5994, 1);
myself.DeleteItem1(talker, 5995, 1);
myself.DeleteItem1(talker, 5996, 1);
myself.DeleteItem1(talker, 5997, 1);
myself.DeleteItem1(talker, 5998, 1);
myself.DeleteItem1(talker, 5999, 1);
myself.DeleteItem1(talker, 6000, 1);
myself.DeleteItem1(talker, 6001, 1);
i1 = gg.Rand(100);
if (i1 < 10) {
myself.GiveItem1(talker, 5496, 1);

} else if (i1 < 20) {
myself.GiveItem1(talker, 5508, 1);

} else if (i1 < 30) {
myself.GiveItem1(talker, 5525, 1);

} else if (i1 < 40) {
myself.GiveItem1(talker, 5496, 1);
myself.GiveItem1(talker, 5508, 1);
myself.GiveItem1(talker, 5525, 1);

} else if (i1 < 51) {
myself.GiveItem1(talker, 5368, 1);

} else if (i1 < 62) {
myself.GiveItem1(talker, 5392, 1);

} else if (i1 < 79) {
myself.GiveItem1(talker, 5426, 1);

} else if (i1 < 100) {
myself.GiveItem1(talker, 5368, 1);
myself.GiveItem1(talker, 5392, 1);
myself.GiveItem1(talker, 5426, 1);

}
talker.quest_last_reward_time = myself.GetCurrentTick();
gg.AddLog(3, talker, 372);
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_07a.htm");

}

}

}
if (reply == 8 && gg.HaveMemo(talker, 372) == 1) {
if (gg.OwnItemCount(talker, 5989) < 1 || gg.OwnItemCount(talker, 5990) < 1 || gg.OwnItemCount(talker, 5991) < 1 || gg.OwnItemCount(talker, 5992) < 1 || gg.OwnItemCount(talker, 5993) < 1 || gg.OwnItemCount(talker, 5994) < 1 || gg.OwnItemCount(talker, 5995) < 1 || gg.OwnItemCount(talker, 5996) < 1 || gg.OwnItemCount(talker, 5997) < 1 || gg.OwnItemCount(talker, 5998) < 1 || gg.OwnItemCount(talker, 5999) < 1 || gg.OwnItemCount(talker, 6000) < 1 || gg.OwnItemCount(talker, 6001) < 1) {
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_07e.htm");

} else if (gg.OwnItemCount(talker, 5989) >= 1 && gg.OwnItemCount(talker, 5990) >= 1 && gg.OwnItemCount(talker, 5991) >= 1 && gg.OwnItemCount(talker, 5992) >= 1 && gg.OwnItemCount(talker, 5993) >= 1 && gg.OwnItemCount(talker, 5994) >= 1 && gg.OwnItemCount(talker, 5995) >= 1 && gg.OwnItemCount(talker, 5996) >= 1 && gg.OwnItemCount(talker, 5997) >= 1 && gg.OwnItemCount(talker, 5998) >= 1 && gg.OwnItemCount(talker, 5999) >= 1 && gg.OwnItemCount(talker, 6000) >= 1 && gg.OwnItemCount(talker, 6001) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 5989, 1);
myself.DeleteItem1(talker, 5990, 1);
myself.DeleteItem1(talker, 5991, 1);
myself.DeleteItem1(talker, 5992, 1);
myself.DeleteItem1(talker, 5993, 1);
myself.DeleteItem1(talker, 5994, 1);
myself.DeleteItem1(talker, 5995, 1);
myself.DeleteItem1(talker, 5996, 1);
myself.DeleteItem1(talker, 5997, 1);
myself.DeleteItem1(talker, 5998, 1);
myself.DeleteItem1(talker, 5999, 1);
myself.DeleteItem1(talker, 6000, 1);
myself.DeleteItem1(talker, 6001, 1);
i1 = gg.Rand(100);
if (i1 < 10) {
myself.GiveItem1(talker, 5497, 1);

} else if (i1 < 20) {
myself.GiveItem1(talker, 5509, 1);

} else if (i1 < 30) {
myself.GiveItem1(talker, 5526, 1);

} else if (i1 < 40) {
myself.GiveItem1(talker, 5497, 1);
myself.GiveItem1(talker, 5509, 1);
myself.GiveItem1(talker, 5526, 1);

} else if (i1 < 51) {
myself.GiveItem1(talker, 5370, 1);

} else if (i1 < 62) {
myself.GiveItem1(talker, 5394, 1);

} else if (i1 < 79) {
myself.GiveItem1(talker, 5428, 1);

} else if (i1 < 100) {
myself.GiveItem1(talker, 5370, 1);
myself.GiveItem1(talker, 5394, 1);
myself.GiveItem1(talker, 5428, 1);

}
talker.quest_last_reward_time = myself.GetCurrentTick();
gg.AddLog(3, talker, 372);
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_07b.htm");

}

}

}
if (reply == 9 && gg.HaveMemo(talker, 372) == 1) {
if (gg.OwnItemCount(talker, 5989) < 1 || gg.OwnItemCount(talker, 5990) < 1 || gg.OwnItemCount(talker, 5991) < 1 || gg.OwnItemCount(talker, 5992) < 1 || gg.OwnItemCount(talker, 5993) < 1 || gg.OwnItemCount(talker, 5994) < 1 || gg.OwnItemCount(talker, 5995) < 1 || gg.OwnItemCount(talker, 5996) < 1 || gg.OwnItemCount(talker, 5997) < 1 || gg.OwnItemCount(talker, 5998) < 1 || gg.OwnItemCount(talker, 5999) < 1 || gg.OwnItemCount(talker, 6000) < 1 || gg.OwnItemCount(talker, 6001) < 1) {
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_07e.htm");

} else if (gg.OwnItemCount(talker, 5989) >= 1 && gg.OwnItemCount(talker, 5990) >= 1 && gg.OwnItemCount(talker, 5991) >= 1 && gg.OwnItemCount(talker, 5992) >= 1 && gg.OwnItemCount(talker, 5993) >= 1 && gg.OwnItemCount(talker, 5994) >= 1 && gg.OwnItemCount(talker, 5995) >= 1 && gg.OwnItemCount(talker, 5996) >= 1 && gg.OwnItemCount(talker, 5997) >= 1 && gg.OwnItemCount(talker, 5998) >= 1 && gg.OwnItemCount(talker, 5999) >= 1 && gg.OwnItemCount(talker, 6000) >= 1 && gg.OwnItemCount(talker, 6001) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 5989, 1);
myself.DeleteItem1(talker, 5990, 1);
myself.DeleteItem1(talker, 5991, 1);
myself.DeleteItem1(talker, 5992, 1);
myself.DeleteItem1(talker, 5993, 1);
myself.DeleteItem1(talker, 5994, 1);
myself.DeleteItem1(talker, 5995, 1);
myself.DeleteItem1(talker, 5996, 1);
myself.DeleteItem1(talker, 5997, 1);
myself.DeleteItem1(talker, 5998, 1);
myself.DeleteItem1(talker, 5999, 1);
myself.DeleteItem1(talker, 6000, 1);
myself.DeleteItem1(talker, 6001, 1);
i1 = gg.Rand(100);
if (i1 < 17) {
myself.GiveItem1(talker, 5502, 1);

} else if (i1 < 34) {
myself.GiveItem1(talker, 5514, 1);

} else if (i1 < 49) {
myself.GiveItem1(talker, 5527, 1);

} else if (i1 < 58) {
myself.GiveItem1(talker, 5502, 1);
myself.GiveItem1(talker, 5514, 1);
myself.GiveItem1(talker, 5527, 1);

} else if (i1 < 70) {
myself.GiveItem1(talker, 5380, 1);

} else if (i1 < 82) {
myself.GiveItem1(talker, 5404, 1);

} else if (i1 < 92) {
myself.GiveItem1(talker, 5430, 1);

} else if (i1 < 100) {
myself.GiveItem1(talker, 5380, 1);
myself.GiveItem1(talker, 5404, 1);
myself.GiveItem1(talker, 5430, 1);

}
talker.quest_last_reward_time = myself.GetCurrentTick();
gg.AddLog(3, talker, 372);
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_07c.htm");

}

}

}
if (reply == 10 && gg.HaveMemo(talker, 372) == 1) {
if (gg.OwnItemCount(talker, 5989) < 1 || gg.OwnItemCount(talker, 5990) < 1 || gg.OwnItemCount(talker, 5991) < 1 || gg.OwnItemCount(talker, 5992) < 1 || gg.OwnItemCount(talker, 5993) < 1 || gg.OwnItemCount(talker, 5994) < 1 || gg.OwnItemCount(talker, 5995) < 1 || gg.OwnItemCount(talker, 5996) < 1 || gg.OwnItemCount(talker, 5997) < 1 || gg.OwnItemCount(talker, 5998) < 1 || gg.OwnItemCount(talker, 5999) < 1 || gg.OwnItemCount(talker, 6000) < 1 || gg.OwnItemCount(talker, 6001) < 1) {
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_07e.htm");

} else if (gg.OwnItemCount(talker, 5989) >= 1 && gg.OwnItemCount(talker, 5990) >= 1 && gg.OwnItemCount(talker, 5991) >= 1 && gg.OwnItemCount(talker, 5992) >= 1 && gg.OwnItemCount(talker, 5993) >= 1 && gg.OwnItemCount(talker, 5994) >= 1 && gg.OwnItemCount(talker, 5995) >= 1 && gg.OwnItemCount(talker, 5996) >= 1 && gg.OwnItemCount(talker, 5997) >= 1 && gg.OwnItemCount(talker, 5998) >= 1 && gg.OwnItemCount(talker, 5999) >= 1 && gg.OwnItemCount(talker, 6000) >= 1 && gg.OwnItemCount(talker, 6001) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 5989, 1);
myself.DeleteItem1(talker, 5990, 1);
myself.DeleteItem1(talker, 5991, 1);
myself.DeleteItem1(talker, 5992, 1);
myself.DeleteItem1(talker, 5993, 1);
myself.DeleteItem1(talker, 5994, 1);
myself.DeleteItem1(talker, 5995, 1);
myself.DeleteItem1(talker, 5996, 1);
myself.DeleteItem1(talker, 5997, 1);
myself.DeleteItem1(talker, 5998, 1);
myself.DeleteItem1(talker, 5999, 1);
myself.DeleteItem1(talker, 6000, 1);
myself.DeleteItem1(talker, 6001, 1);
i1 = gg.Rand(100);
if (i1 < 17) {
myself.GiveItem1(talker, 5503, 1);

} else if (i1 < 34) {
myself.GiveItem1(talker, 5515, 1);

} else if (i1 < 49) {
myself.GiveItem1(talker, 5528, 1);

} else if (i1 < 58) {
myself.GiveItem1(talker, 5503, 1);
myself.GiveItem1(talker, 5515, 1);
myself.GiveItem1(talker, 5528, 1);

} else if (i1 < 70) {
myself.GiveItem1(talker, 5382, 1);

} else if (i1 < 82) {
myself.GiveItem1(talker, 5406, 1);

} else if (i1 < 92) {
myself.GiveItem1(talker, 5432, 1);

} else if (i1 < 100) {
myself.GiveItem1(talker, 5382, 1);
myself.GiveItem1(talker, 5406, 1);
myself.GiveItem1(talker, 5432, 1);

}
talker.quest_last_reward_time = myself.GetCurrentTick();
gg.AddLog(3, talker, 372);
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_07d.htm");

}

}

}
if (reply == 99 && gg.HaveMemo(talker, 372) == 1) {
myself.ShowPage(talker, "whouse_keeper_walderal_q0372_05b.htm");
myself.SetFlagJournal(talker, 372, 2);
myself.ShowQuestMark(talker, 372);

}

}
super;
	}


}