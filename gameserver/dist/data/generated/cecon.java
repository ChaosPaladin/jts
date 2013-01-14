package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cecon extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 968) == 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Spirit of Craftsman (In Progress)");

}
if (gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 969) >= 1 || gg.OwnItemCount(talker, 970) >= 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Spirit of Craftsman (In Progress)");

}
if (gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 971) == 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Spirit of Craftsman (In Progress)");

}
if (gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 972) == 1 && gg.OwnItemCount(talker, 973) == 0 && gg.OwnItemCount(talker, 974) == 0 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Spirit of Craftsman (In Progress)");

}
if (gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 973) == 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Spirit of Craftsman (In Progress)");

}
if (gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 974) == 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Spirit of Craftsman (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 968) == 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
myself.SetCurrentQuestID(103);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "cecon_q0103_01.htm");
myself.DeleteItem1(talker, 968, 1);
myself.GiveItem1(talker, 969, 1);
myself.SetFlagJournal(talker, 103, 2);
myself.ShowQuestMark(talker, 103);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 969) >= 1 || gg.OwnItemCount(talker, 970) >= 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
myself.SetCurrentQuestID(103);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cecon_q0103_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 971) == 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
myself.SetCurrentQuestID(103);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "cecon_q0103_03.htm");
myself.DeleteItem1(talker, 971, 1);
myself.GiveItem1(talker, 972, 1);
myself.SetFlagJournal(talker, 103, 6);
myself.ShowQuestMark(talker, 103);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 972) == 1 && gg.OwnItemCount(talker, 973) == 0 && gg.OwnItemCount(talker, 974) == 0 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
myself.SetCurrentQuestID(103);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cecon_q0103_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 973) == 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
myself.SetCurrentQuestID(103);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "cecon_q0103_05.htm");
myself.DeleteItem1(talker, 973, 1);
myself.GiveItem1(talker, 974, 1);
myself.SetFlagJournal(talker, 103, 8);
myself.ShowQuestMark(talker, 103);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 974) == 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
myself.SetCurrentQuestID(103);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cecon_q0103_06.htm");

}
break;

}

}
return;

}
super;
	}


}