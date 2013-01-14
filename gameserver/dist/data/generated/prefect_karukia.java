package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class prefect_karukia extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 414) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Orc Raider");

}
if (gg.HaveMemo(talker, 414) == 1 && gg.OwnItemCount(talker, 1579) == 1 && gg.OwnItemCount(talker, 1580) < 10) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Orc Raider (In Progress)");

}
if (gg.HaveMemo(talker, 414) == 1 && gg.OwnItemCount(talker, 1579) == 1 && gg.OwnItemCount(talker, 1580) >= 10 && gg.OwnItemCount(talker, 1581) + gg.OwnItemCount(talker, 1583) + gg.OwnItemCount(talker, 1582) + gg.OwnItemCount(talker, 1584) + gg.OwnItemCount(talker, 1585) + gg.OwnItemCount(talker, 1586) + gg.OwnItemCount(talker, 1587) + gg.OwnItemCount(talker, 1588) + gg.OwnItemCount(talker, 1589) + gg.OwnItemCount(talker, 1590) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Orc Raider (In Progress)");

}
if (gg.HaveMemo(talker, 414) == 1 && gg.OwnItemCount(talker, 1581) + gg.OwnItemCount(talker, 1583) + gg.OwnItemCount(talker, 1582) + gg.OwnItemCount(talker, 1584) + gg.OwnItemCount(talker, 1585) + gg.OwnItemCount(talker, 1586) + gg.OwnItemCount(talker, 1587) + gg.OwnItemCount(talker, 1588) + gg.OwnItemCount(talker, 1589) + gg.OwnItemCount(talker, 1590) > 0 || gg.OwnItemCount(talker, 1591) > 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Orc Raider (In Progress)");

}
if (gg.HaveMemo(talker, 414) == 1 && gg.GetMemoState(talker, 414) == 2) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Orc Raider (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 414) == 0) {
myself.SetCurrentQuestID(414);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "prefect_karukia_q0414_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 414);
myself.ShowQuestFHTML(talker, fhtml0, 414);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 414) == 1 && gg.OwnItemCount(talker, 1579) == 1 && gg.OwnItemCount(talker, 1580) < 10) {
myself.SetCurrentQuestID(414);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_karukia_q0414_06.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 414) == 1 && gg.OwnItemCount(talker, 1579) == 1 && gg.OwnItemCount(talker, 1580) >= 10 && gg.OwnItemCount(talker, 1581) + gg.OwnItemCount(talker, 1583) + gg.OwnItemCount(talker, 1582) + gg.OwnItemCount(talker, 1584) + gg.OwnItemCount(talker, 1585) + gg.OwnItemCount(talker, 1586) + gg.OwnItemCount(talker, 1587) + gg.OwnItemCount(talker, 1588) + gg.OwnItemCount(talker, 1589) + gg.OwnItemCount(talker, 1590) == 0) {
myself.SetCurrentQuestID(414);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_karukia_q0414_07.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 414) == 1 && gg.OwnItemCount(talker, 1581) + gg.OwnItemCount(talker, 1583) + gg.OwnItemCount(talker, 1582) + gg.OwnItemCount(talker, 1584) + gg.OwnItemCount(talker, 1585) + gg.OwnItemCount(talker, 1586) + gg.OwnItemCount(talker, 1587) + gg.OwnItemCount(talker, 1588) + gg.OwnItemCount(talker, 1589) + gg.OwnItemCount(talker, 1590) > 0 || gg.OwnItemCount(talker, 1591) > 0) {
myself.SetCurrentQuestID(414);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_karukia_q0414_08.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 414) == 1 && gg.GetMemoState(talker, 414) == 2) {
myself.SetCurrentQuestID(414);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_karukia_q0414_07b.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 414) {
myself.SetCurrentQuestID(414);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 18 && talker.occupation == 44 && gg.OwnItemCount(talker, 1592) == 0 && gg.OwnItemCount(talker, 1579) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 414);
gg.AddLog(1, talker, 414);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 1579, 1);
myself.SetFlagJournal(talker, 414, 1);
myself.ShowQuestPage(talker, "prefect_karukia_q0414_05.htm", 414);

}

} else if (talker.occupation != 44) {
if (talker.occupation == 45) {
myself.ShowQuestPage(talker, "prefect_karukia_q0414_02a.htm", 414);

} else {
myself.ShowQuestPage(talker, "prefect_karukia_q0414_03.htm", 414);

}

} else if (talker.level < 18 && talker.occupation == 44) {
myself.ShowQuestPage(talker, "prefect_karukia_q0414_02.htm", 414);

} else if (talker.level >= 18 && talker.occupation == 44 && gg.OwnItemCount(talker, 1592) == 1) {
myself.ShowQuestPage(talker, "prefect_karukia_q0414_04.htm", 414);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 414) {
myself.SetCurrentQuestID(414);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 414) {
if (reply == 1 && gg.HaveMemo(talker, 414) == 1 && gg.OwnItemCount(talker, 1579) == 1 && gg.OwnItemCount(talker, 1580) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "prefect_karukia_q0414_07a.htm");
myself.DeleteItem1(talker, 1580, gg.OwnItemCount(talker, 1580));
myself.DeleteItem1(talker, 1579, 1);
myself.SetFlagJournal(talker, 414, 3);
myself.ShowQuestMark(talker, 414);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 1589, 1);
myself.GiveItem1(talker, 1590, 1);

}

}
if (reply == 2 && gg.HaveMemo(talker, 414) == 1 && gg.OwnItemCount(talker, 1579) == 1 && gg.OwnItemCount(talker, 1580) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "prefect_karukia_q0414_07b.htm");
myself.DeleteItem1(talker, 1580, gg.OwnItemCount(talker, 1580));
myself.DeleteItem1(talker, 1579, 1);
myself.SetFlagJournal(talker, 414, 5);
myself.ShowQuestMark(talker, 414);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 414, 2);

}

}

}
super;
	}


}