package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class allana extends citizen {
	protected String Privates = "";

	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 409) == 1 && gg.OwnItemCount(talker, 1231)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Elven Oracle (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Healer (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 4) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Healer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 409) == 1 && gg.OwnItemCount(talker, 1231)) {
myself.SetCurrentQuestID(409);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1232) == 0 && gg.OwnItemCount(talker, 1233) == 0 && gg.OwnItemCount(talker, 1234) == 0 && gg.OwnItemCount(talker, 1236) == 0) {
if (gg.GetMemoState(talker, 409) == 2) {
myself.ShowPage(talker, "allana_q0409_05.htm");

} else if (gg.GetMemoState(talker, 409) == 1) {
myself.ShowPage(talker, "allana_q0409_01.htm");
myself.SetFlagJournal(talker, 409, 2);
myself.ShowQuestMark(talker, 409);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (gg.OwnItemCount(talker, 1232) == 0 && gg.OwnItemCount(talker, 1233) == 0 && gg.OwnItemCount(talker, 1234) == 1 && gg.OwnItemCount(talker, 1236) == 0) {
myself.SetMemoState(talker, 409, 2);
myself.ShowPage(talker, "allana_q0409_02.htm");
myself.GiveItem1(talker, 1236, 1);
myself.SetFlagJournal(talker, 409, 4);
myself.ShowQuestMark(talker, 409);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(talker, 1232) == 0 && gg.OwnItemCount(talker, 1233) == 0 && gg.OwnItemCount(talker, 1234) == 1 && gg.OwnItemCount(talker, 1236) == 1) {
if (gg.GetMemoState(talker, 409) == 3 && gg.OwnItemCount(talker, 1275) == 0) {
myself.SetMemoState(talker, 409, 2);
myself.ShowPage(talker, "allana_q0409_06.htm");
myself.SetFlagJournal(talker, 409, 4);
myself.ShowQuestMark(talker, 409);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowPage(talker, "allana_q0409_03.htm");

}

} else if (gg.OwnItemCount(talker, 1232) == 1 && gg.OwnItemCount(talker, 1233) == 0 && gg.OwnItemCount(talker, 1234) == 1 && gg.OwnItemCount(talker, 1236) == 1) {
myself.ShowPage(talker, "allana_q0409_04.htm");
myself.DeleteItem1(talker, 1236, 1);
myself.GiveItem1(talker, 1233, 1);
myself.SetFlagJournal(talker, 409, 9);
myself.ShowQuestMark(talker, 409);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(talker, 1232) == 1 && gg.OwnItemCount(talker, 1234) == 1 && gg.OwnItemCount(talker, 1236) == 0 && gg.OwnItemCount(talker, 1233)) {
myself.ShowPage(talker, "allana_q0409_05.htm");
myself.SetFlagJournal(talker, 409, 7);
myself.ShowQuestMark(talker, 409);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 3) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "allana_q0226_01.htm");
myself.SetMemoState(talker, 226, 4);
myself.SetFlagJournal(talker, 226, 5);
myself.ShowQuestMark(talker, 226);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 4) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "allana_q0226_02.htm");
myself.SetMemoState(talker, 226, 4);

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 409) {
myself.SetCurrentQuestID(409);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 409) {
if (reply == 1) {
if (gg.GetMemoState(talker, 409) == 1) {
myself.ShowPage(talker, "allana_q0409_07.htm");

}

} else if (reply == 2) {
myself.ShowPage(talker, "allana_q0409_08.htm");

} else if (reply == 3) {
myself.ShowPage(talker, "allana_q0409_09.htm");

} else if (reply == 4) {
myself.CreateOnePrivate(1027032, "q409_lizardman_warrior", 0, 1);
myself.CreateOnePrivate(1027033, "q409_lizardman_scout", 0, 1);
myself.CreateOnePrivate(1027034, "q409_lizardman", 0, 1);
myself.SetMemoState(talker, 409, 2);

}

}
super;
	}


}