package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class leopold extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 326) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Vanquish Remnants");

}
if (gg.HaveMemo(talker, 326) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Vanquish Remnants (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3316) == 0 && gg.OwnItemCount(talker, 3309) >= 1 && gg.OwnItemCount(talker, 3315) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3315) == 0 && gg.OwnItemCount(talker, 3309) >= 1 && gg.OwnItemCount(talker, 3316) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3309) == 1 && gg.OwnItemCount(talker, 3320) >= 1 && gg.OwnItemCount(talker, 3321) >= 1 && gg.OwnItemCount(talker, 3322) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3323) >= 1 || gg.OwnItemCount(talker, 3324) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of Witchcraft (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 326) == 0) {
myself.SetCurrentQuestID(326);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 21) {
myself.FHTML_SetFileName(fhtml0, "leopold_q0326_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 326);
myself.ShowQuestFHTML(talker, fhtml0, 326);

} else {
myself.ShowQuestPage(talker, "leopold_q0326_01.htm", 326);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 326) == 1) {
myself.SetCurrentQuestID(326);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1359) + gg.OwnItemCount(talker, 1360) + gg.OwnItemCount(talker, 1361) == 0) {
myself.ShowPage(talker, "leopold_q0326_04.htm");

} else if (gg.OwnItemCount(talker, 1359) + gg.OwnItemCount(talker, 1360) + gg.OwnItemCount(talker, 1361) < 100 && gg.OwnItemCount(talker, 1359) + gg.OwnItemCount(talker, 1360) + gg.OwnItemCount(talker, 1361) > 0) {
if (gg.OwnItemCount(talker, 1359) + gg.OwnItemCount(talker, 1360) + gg.OwnItemCount(talker, 1361) >= 10) {
myself.GiveItem1(talker, 57, 4320 + 46 * gg.OwnItemCount(talker, 1359) + 52 * gg.OwnItemCount(talker, 1360) + 58 * gg.OwnItemCount(talker, 1361));

} else {
myself.GiveItem1(talker, 57, 46 * gg.OwnItemCount(talker, 1359) + 52 * gg.OwnItemCount(talker, 1360) + 58 * gg.OwnItemCount(talker, 1361));

}
myself.DeleteItem1(talker, 1359, gg.OwnItemCount(talker, 1359));
myself.DeleteItem1(talker, 1360, gg.OwnItemCount(talker, 1360));
myself.DeleteItem1(talker, 1361, gg.OwnItemCount(talker, 1361));
myself.ShowPage(talker, "leopold_q0326_05.htm");
gg.AddLog(3, talker, 326);

} else if (gg.OwnItemCount(talker, 1359) + gg.OwnItemCount(talker, 1360) + gg.OwnItemCount(talker, 1361) >= 100 && gg.OwnItemCount(talker, 1369) == 0) {
myself.GiveItem1(talker, 1369, 1);
myself.GiveItem1(talker, 57, 4320 + 46 * gg.OwnItemCount(talker, 1359) + 52 * gg.OwnItemCount(talker, 1360) + 58 * gg.OwnItemCount(talker, 1361));
myself.DeleteItem1(talker, 1359, gg.OwnItemCount(talker, 1359));
myself.DeleteItem1(talker, 1360, gg.OwnItemCount(talker, 1360));
myself.DeleteItem1(talker, 1361, gg.OwnItemCount(talker, 1361));
myself.ShowPage(talker, "leopold_q0326_06.htm");
gg.AddLog(3, talker, 326);

} else if (gg.OwnItemCount(talker, 1359) + gg.OwnItemCount(talker, 1360) + gg.OwnItemCount(talker, 1361) >= 100 && gg.OwnItemCount(talker, 1369) > 0) {
myself.GiveItem1(talker, 57, 4320 + 46 * gg.OwnItemCount(talker, 1359) + 52 * gg.OwnItemCount(talker, 1360) + 58 * gg.OwnItemCount(talker, 1361));
myself.DeleteItem1(talker, 1359, gg.OwnItemCount(talker, 1359));
myself.DeleteItem1(talker, 1360, gg.OwnItemCount(talker, 1360));
myself.DeleteItem1(talker, 1361, gg.OwnItemCount(talker, 1361));
myself.ShowPage(talker, "leopold_q0326_09.htm");
gg.AddLog(3, talker, 326);

}

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3316) == 0 && gg.OwnItemCount(talker, 3309) >= 1 && gg.OwnItemCount(talker, 3315) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "leopold_q0229_01.htm", 229);

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3315) == 0 && gg.OwnItemCount(talker, 3309) >= 1 && gg.OwnItemCount(talker, 3316) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "leopold_q0229_03.htm", 229);

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3309) == 1 && gg.OwnItemCount(talker, 3320) >= 1 && gg.OwnItemCount(talker, 3321) >= 1 && gg.OwnItemCount(talker, 3322) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "leopold_q0229_04.htm", 229);

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3323) >= 1 || gg.OwnItemCount(talker, 3324) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "leopold_q0229_05.htm", 229);

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 326) {
myself.SetCurrentQuestID(326);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
gg.AddLog(1, talker, 326);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "leopold_q0326_03.htm", 326);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 326) {
myself.SetCurrentQuestID(326);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 326) {
if (reply == 1) {
myself.ShowPage(talker, "leopold_q0326_07.htm");
myself.RemoveMemo(talker, 326);
gg.AddLog(2, talker, 326);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (reply == 2) {
myself.ShowPage(talker, "leopold_q0326_08.htm");

}

}
if (ask == 229) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 229) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 3315) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "leopold_q0229_02.htm", 229);
myself.DeleteItem1(talker, 3315, 1);
myself.GiveItem1(talker, 3316, 1);

}

}

}

}
super;
	}


}