package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class harprock extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 167) == 1 && gg.OwnItemCount(talker, 1076) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Dwarven Kinship (In Progress)");

}
if (gg.HaveMemo(talker, 167) == 1 && gg.OwnItemCount(talker, 1106) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Dwarven Kinship (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 167) == 1 && gg.OwnItemCount(talker, 1076) == 1) {
myself.SetCurrentQuestID(167);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "harprock_q0323_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 167) == 1 && gg.OwnItemCount(talker, 1106) == 1) {
myself.SetCurrentQuestID(167);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "harprock_q0323_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 167) {
myself.SetCurrentQuestID(167);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 167) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 1076) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "harprock_q0323_03.htm");
myself.DeleteItem1(talker, 1076, 1);
myself.GiveItem1(talker, 1106, 1);
myself.GiveItem1(talker, 57, 2000);
myself.SetFlagJournal(talker, 167, 2);
myself.ShowQuestMark(talker, 167);

}

}

} else if (reply == 2 && myself.GetOneTimeQuestFlag(talker, 167) == 0 && gg.OwnItemCount(talker, 1076) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1076, 1);
myself.ShowPage(talker, "harprock_q0323_04.htm");
myself.GiveItem1(talker, 57, 15000);
myself.RemoveMemo(talker, 167);
gg.AddLog(2, talker, 167);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 167, 1);

}

}

}
super;
	}


}