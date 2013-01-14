package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class noctisse extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) >= 2 && gg.GetMemoState(talker, 93) <= 4 && gg.OwnItemCount(talker, 7606) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) >= 2 && gg.GetMemoState(talker, 93) <= 4 && gg.OwnItemCount(talker, 7606) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 5) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 11) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 12) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Spectral Master (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 1) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "noctisse_q0093_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) >= 2 && gg.GetMemoState(talker, 93) <= 4 && gg.OwnItemCount(talker, 7606) == 0) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "noctisse_q0093_0102.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) >= 2 && gg.GetMemoState(talker, 93) <= 4 && gg.OwnItemCount(talker, 7606) >= 1) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "noctisse_q0093_0103.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 5) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "noctisse_q0093_0104.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 11) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "noctisse_q0093_0131.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 12) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "noctisse_q0093_0132.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 93) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 93) {
if (reply == 1) {
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 1) {
myself.SetMemoState(talker, 93, 2);
myself.ShowPage(talker, "noctisse_q0093_0105.htm");
myself.SetFlagJournal(talker, 93, 2);
myself.ShowQuestMark(talker, 93);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) >= 2 && gg.GetMemoState(talker, 93) <= 4 && gg.OwnItemCount(talker, 7606) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7291, 1);
myself.DeleteItem1(talker, 7606, gg.OwnItemCount(talker, 7606));
myself.SetMemoState(talker, 93, 5);
myself.ShowPage(talker, "noctisse_q0093_0106.htm");
myself.SetFlagJournal(talker, 93, 5);
myself.ShowQuestMark(talker, 93);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 93) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 93) {
if (reply == 9) {
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 11) {
myself.SetMemoState(talker, 93, 12);
myself.ShowPage(talker, "noctisse_q0093_0133.htm");
myself.SetFlagJournal(talker, 93, 15);
myself.ShowQuestMark(talker, 93);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}