package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_baenedes extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 156) != 0 && gg.OwnItemCount(talker, 1022) != 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Millennium Love (In Progress)");

}
if (gg.HaveMemo(talker, 156) != 0 && gg.OwnItemCount(talker, 1023) != 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Millennium Love (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 156) != 0 && gg.OwnItemCount(talker, 1022) != 0) {
myself.SetCurrentQuestID(156);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_baenedes_q0307_02.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 156) != 0 && gg.OwnItemCount(talker, 1023) != 0) {
myself.SetCurrentQuestID(156);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_baenedes_q0307_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 156) {
myself.SetCurrentQuestID(156);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 156) {
if (reply == 1 && gg.OwnItemCount(talker, 1022) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1022, gg.OwnItemCount(talker, 1022));
if (gg.OwnItemCount(talker, 1023) == 0) {
myself.GiveItem1(talker, 1023, 1);

}
myself.ShowPage(talker, "master_baenedes_q0307_03.htm");
myself.SetFlagJournal(talker, 156, 2);
myself.ShowQuestMark(talker, 156);

}

} else if (reply == 2 && myself.GetOneTimeQuestFlag(talker, 156) == 0 && gg.OwnItemCount(talker, 1022) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1022, gg.OwnItemCount(talker, 1022));
myself.RemoveMemo(talker, 156);
gg.AddLog(2, talker, 156);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 156, 1);
myself.IncrementParam(talker, 0, 3000);
myself.ShowPage(talker, "master_baenedes_q0307_04.htm");

}

}

}
super;
	}


}