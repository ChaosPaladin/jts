package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class landolf extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 365) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Devil's Legacy");

}
if (gg.HaveMemo(talker, 365) == 1 && gg.OwnItemCount(talker, 5873) < 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Devil's Legacy (In Progress)");

}
if (gg.HaveMemo(talker, 365) == 1 && gg.OwnItemCount(talker, 5873) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Devil's Legacy (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 365) == 0) {
myself.SetCurrentQuestID(365);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 39) {
myself.FHTML_SetFileName(fhtml0, "landolf_q0365_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 365);
myself.ShowQuestFHTML(talker, fhtml0, 365);

} else if (talker.level < 39) {
myself.ShowPage(talker, "landolf_q0365_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 365) == 1 && gg.OwnItemCount(talker, 5873) < 1) {
myself.SetCurrentQuestID(365);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "landolf_q0365_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 365) == 1 && gg.OwnItemCount(talker, 5873) >= 1) {
myself.SetCurrentQuestID(365);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5873) * 400 + 19800);
myself.DeleteItem1(talker, 5873, gg.OwnItemCount(talker, 5873));
gg.AddLog(3, talker, 365);
myself.ShowPage(talker, "landolf_q0365_05.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 365) {
myself.SetCurrentQuestID(365);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SetMemoState(talker, 365, 0);
gg.AddLog(1, talker, 365);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "landolf_q0365_03.htm", 365);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 365) {
myself.SetCurrentQuestID(365);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 365) {
if (reply == 1) {
myself.RemoveMemo(talker, 365);
gg.AddLog(2, talker, 365);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "landolf_q0365_06.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "landolf_q0365_07.htm");

}

}
super;
	}


}