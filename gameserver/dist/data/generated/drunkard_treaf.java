package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class drunkard_treaf extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2706) >= 1 && gg.OwnItemCount(talker, 2713) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) >= 1 || gg.OwnItemCount(talker, 2720) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Scholar (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2706) >= 1 && gg.OwnItemCount(talker, 2713) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "drunkard_treaf_q0214_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) >= 1 || gg.OwnItemCount(talker, 2720) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "drunkard_treaf_q0214_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 214) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 214) {
if (reply == 1) {
myself.ShowPage(talker, "drunkard_treaf_q0214_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "drunkard_treaf_q0214_03.htm");

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 2713) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "drunkard_treaf_q0214_04.htm");
myself.SetFlagJournal(talker, 214, 26);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2713, 1);
myself.GiveItem1(talker, 2705, 1);

}

}

}

}
super;
	}


}