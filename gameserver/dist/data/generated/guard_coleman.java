package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_coleman extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 360) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Plunder Their Supplies");

}
if (gg.HaveMemo(talker, 360) == 1 && gg.OwnItemCount(talker, 5872) == 0 && gg.OwnItemCount(talker, 5870) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Plunder Their Supplies (In Progress)");

}
if (gg.HaveMemo(talker, 360) == 1 && gg.OwnItemCount(talker, 5872) > 0 && gg.OwnItemCount(talker, 5870) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Plunder Their Supplies (In Progress)");

}
if (gg.HaveMemo(talker, 360) == 1 && gg.OwnItemCount(talker, 5872) > 0 && gg.OwnItemCount(talker, 5870) > 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Plunder Their Supplies (In Progress)");

}
if (gg.HaveMemo(talker, 360) == 1 && gg.OwnItemCount(talker, 5872) == 0 && gg.OwnItemCount(talker, 5870) > 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Plunder Their Supplies (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 360) == 0) {
myself.SetCurrentQuestID(360);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 52) {
myself.ShowPage(talker, "guard_coleman_q0360_01.htm");

} else if (talker.level >= 52) {
myself.ShowQuestPage(talker, "guard_coleman_q0360_02.htm", 360);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 360) == 1 && gg.OwnItemCount(talker, 5872) == 0 && gg.OwnItemCount(talker, 5870) == 0) {
myself.SetCurrentQuestID(360);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_coleman_q0360_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 360) == 1 && gg.OwnItemCount(talker, 5872) > 0 && gg.OwnItemCount(talker, 5870) == 0) {
myself.SetCurrentQuestID(360);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5872) * 100 + 6000);
myself.DeleteItem1(talker, 5872, gg.OwnItemCount(talker, 5872));
myself.ShowPage(talker, "guard_coleman_q0360_06.htm");
gg.AddLog(3, talker, 360);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 360) == 1 && gg.OwnItemCount(talker, 5872) > 0 && gg.OwnItemCount(talker, 5870) > 0) {
myself.SetCurrentQuestID(360);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5872) * 100 + 6000 + gg.OwnItemCount(talker, 5870) * 6000);
myself.DeleteItem1(talker, 5872, gg.OwnItemCount(talker, 5872));
myself.DeleteItem1(talker, 5870, gg.OwnItemCount(talker, 5870));
myself.ShowPage(talker, "guard_coleman_q0360_07.htm");
gg.AddLog(3, talker, 360);

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 360) == 1 && gg.OwnItemCount(talker, 5872) == 0 && gg.OwnItemCount(talker, 5870) > 0) {
myself.SetCurrentQuestID(360);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 6000 * gg.OwnItemCount(talker, 5870) + 6000);
myself.DeleteItem1(talker, 5870, gg.OwnItemCount(talker, 5870));
myself.ShowPage(talker, "guard_coleman_q0360_08.htm");
gg.AddLog(3, talker, 360);

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
if (quest_id == 360) {
myself.SetCurrentQuestID(360);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 360);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 360, 1);
myself.ShowQuestPage(talker, "guard_coleman_q0360_04.htm", 360);
gg.AddLog(1, talker, 360);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 360) {
myself.SetCurrentQuestID(360);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 360) {
if (reply == 1 && gg.HaveMemo(talker, 360) == 0) {
myself.FHTML_SetFileName(fhtml0, "guard_coleman_q0360_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 360);
myself.ShowQuestFHTML(talker, fhtml0, 360);

}
if (reply == 2 && gg.HaveMemo(talker, 360) == 1) {
myself.ShowPage(talker, "guard_coleman_q0360_09.htm");

}
if (reply == 3 && gg.HaveMemo(talker, 360) == 1) {
myself.RemoveMemo(talker, 360);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "guard_coleman_q0360_10.htm");
gg.AddLog(2, talker, 360);

}

}
super;
	}


}