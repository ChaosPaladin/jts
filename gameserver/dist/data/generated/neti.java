package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class neti extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 403) == 1 && gg.OwnItemCount(talker, 1180) > 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Rogue (In Progress)");

}
if (gg.HaveMemo(talker, 403) == 1 && gg.OwnItemCount(talker, 1184) == 0 && gg.OwnItemCount(talker, 1180) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Rogue (In Progress)");

}
if (gg.HaveMemo(talker, 403) == 1 && gg.OwnItemCount(talker, 1184) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Rogue (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 7 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Acts of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 8 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Acts of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) >= 9 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Acts of Evil (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 403) == 1 && gg.OwnItemCount(talker, 1180) > 0) {
myself.SetCurrentQuestID(403);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "neti_q0403_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 403) == 1 && gg.OwnItemCount(talker, 1184) == 0 && gg.OwnItemCount(talker, 1180) == 0) {
myself.SetCurrentQuestID(403);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1185)) {
myself.ShowPage(talker, "neti_q0403_08.htm");

} else if (gg.OwnItemCount(talker, 1183) < 10) {
myself.ShowPage(talker, "neti_q0403_06.htm");

} else if (gg.OwnItemCount(talker, 1183) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "neti_q0403_07.htm");
myself.DeleteItem1(talker, 1183, gg.OwnItemCount(talker, 1183));
myself.GiveItem1(talker, 1184, 1);
myself.SetFlagJournal(talker, 403, 4);
myself.ShowQuestMark(talker, 403);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 403) == 1 && gg.OwnItemCount(talker, 1184) > 0) {
myself.SetCurrentQuestID(403);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "neti_q0403_08.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 7 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 171, 8);
myself.SetFlagJournal(talker, 171, 8);
myself.ShowQuestMark(talker, 171);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "neti_q0171_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 8 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "neti_q0171_02.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) >= 9 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "neti_q0171_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 403) {
myself.SetCurrentQuestID(403);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 403) {
if (reply == 1 && gg.OwnItemCount(talker, 1180) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1180, 1);
if (gg.OwnItemCount(talker, 1181) == 0) {
myself.GiveItem1(talker, 1181, 1);

}
if (gg.OwnItemCount(talker, 1182) == 0) {
myself.GiveItem1(talker, 1182, 1);

}
myself.ShowPage(talker, "neti_q0403_05.htm");
myself.SetFlagJournal(talker, 403, 2);
myself.ShowQuestMark(talker, 403);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}