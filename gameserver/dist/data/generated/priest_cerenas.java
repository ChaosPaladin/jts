package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class priest_cerenas extends cleric_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 11) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 12) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 11) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 12) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 2) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Elemental Master (In Progress)");

}
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 3) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Elemental Master (In Progress)");

}
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 4) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Elemental Master (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 11) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_cerenas_q0071_0131.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 12) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_cerenas_q0071_0132.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 11) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_cerenas_q0072_0131.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 12) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_cerenas_q0072_0132.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 2) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_cerenas_q0092_0111.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 3) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "priest_cerenas_q0092_0113.htm");

} else {
myself.ShowPage(talker, "priest_cerenas_q0092_0112.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 4) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_cerenas_q0092_0114.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 71) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 71) {
if (reply == 9) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 11) {
myself.SetMemoState(talker, 71, 12);
myself.ShowPage(talker, "priest_cerenas_q0071_0133.htm");
myself.SetFlagJournal(talker, 71, 15);
myself.ShowQuestMark(talker, 71);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 72) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 72) {
if (reply == 9) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 11) {
myself.SetMemoState(talker, 72, 12);
myself.ShowPage(talker, "priest_cerenas_q0072_0133.htm");
myself.SetFlagJournal(talker, 72, 15);
myself.ShowQuestMark(talker, 72);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 92) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 92) {
if (reply == 3) {
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 2) {
myself.SetMemoState(talker, 92, 3);
myself.ShowPage(talker, "priest_cerenas_q0092_0115.htm");
myself.SetFlagJournal(talker, 92, 3);
myself.ShowQuestMark(talker, 92);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7605, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 92, 4);
myself.ShowPage(talker, "priest_cerenas_q0092_0116.htm");
myself.SetFlagJournal(talker, 92, 4);
myself.ShowQuestMark(talker, 92);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}