package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rizraell extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 317) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Catch the Wind");

}
if (gg.HaveMemo(talker, 317) != 0 && gg.OwnItemCount(talker, 1078) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Catch the Wind (In Progress)");

}
if (gg.HaveMemo(talker, 317) != 0 && gg.OwnItemCount(talker, 1078) != 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Catch the Wind (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 317) == 0) {
myself.SetCurrentQuestID(317);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 18) {
myself.FHTML_SetFileName(fhtml0, "rizraell_q0317_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 317);
myself.ShowQuestFHTML(talker, fhtml0, 317);

} else {
myself.ShowQuestPage(talker, "rizraell_q0317_02.htm", 317);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 317) != 0 && gg.OwnItemCount(talker, 1078) == 0) {
myself.SetCurrentQuestID(317);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rizraell_q0317_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 317) != 0 && gg.OwnItemCount(talker, 1078) != 0) {
myself.SetCurrentQuestID(317);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rizraell_q0317_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 317) {
myself.SetCurrentQuestID(317);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 317);
gg.AddLog(1, talker, 317);
myself.SetFlagJournal(talker, 317, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "rizraell_q0317_04.htm", 317);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 317) {
myself.SetCurrentQuestID(317);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 317) {
if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1078) > 0) {
if (gg.OwnItemCount(talker, 1078) >= 10) {
myself.GiveItem1(talker, 57, 2988 + 40 * gg.OwnItemCount(talker, 1078));

} else {
myself.GiveItem1(talker, 57, 40 * gg.OwnItemCount(talker, 1078));

}

}
i0 = gg.OwnItemCount(talker, 1078);
myself.DeleteItem1(talker, 1078, gg.OwnItemCount(talker, 1078));
myself.RemoveMemo(talker, 317);
gg.AddLog(2, talker, 317);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "rizraell_q0317_08.htm");

}

} else if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1078) > 0) {
if (gg.OwnItemCount(talker, 1078) >= 10) {
myself.GiveItem1(talker, 57, 2988 + 40 * gg.OwnItemCount(talker, 1078));

} else {
myself.GiveItem1(talker, 57, 40 * gg.OwnItemCount(talker, 1078));

}

}
i0 = gg.OwnItemCount(talker, 1078);
myself.DeleteItem1(talker, 1078, gg.OwnItemCount(talker, 1078));
myself.ShowPage(talker, "rizraell_q0317_09.htm");
gg.AddLog(3, talker, 317);

}

}

}
super;
	}


}