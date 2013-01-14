package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class broken_desk1 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 3) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 5) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 6) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 7) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 2 && gg.OwnItemCount(talker, 7149) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 3) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 4 && gg.OwnItemCount(talker, 7148) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 4 && gg.OwnItemCount(talker, 7064) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 5 && gg.OwnItemCount(talker, 7148) >= 1 && gg.OwnItemCount(talker, 7064) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Lidia's Heart (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 3) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "broken_desk1_q0021_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 5) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 21, 6);
myself.ShowPage(talker, "broken_desk1_q0021_10.htm");
myself.SoundEffect(talker, "AmdSound.ed_chimes_05");
myself.SetFlagJournal(talker, 21, 5);
myself.ShowQuestMark(talker, 21);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 6) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "broken_desk1_q0021_11.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 7) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "broken_desk1_q0021_15.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 2 && gg.OwnItemCount(talker, 7149) >= 1) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "broken_desk1_q0023_01.htm");
myself.SetFlagJournal(talker, 23, 3);
myself.ShowQuestMark(talker, 23);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 3) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "broken_desk1_q0023_03.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 4 && gg.OwnItemCount(talker, 7148) >= 1) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "broken_desk1_q0023_07.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 4 && gg.OwnItemCount(talker, 7064) >= 1) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "broken_desk1_q0023_12.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 5 && gg.OwnItemCount(talker, 7148) >= 1 && gg.OwnItemCount(talker, 7064) >= 1) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "broken_desk1_q0023_13.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 21) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 21) {
if (reply == 4) {
myself.SoundEffect(talker, "ItemSound.item_drop_equip_armor_cloth");
myself.ShowPage(talker, "broken_desk1_q0021_03.htm");

}
if (reply == 5) {
myself.ShowPage(talker, "broken_desk1_q0021_04.htm");

}
if (reply == 6) {
myself.ShowPage(talker, "broken_desk1_q0021_05.htm");

}
if (reply == 7) {
myself.SetMemoState(talker, 21, 5);
myself.ShowPage(talker, "broken_desk1_q0021_07.htm");

}
if (reply == 8) {
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 5) {
myself.SetMemoState(talker, 21, 6);
myself.ShowPage(talker, "broken_desk1_q0021_08.htm");
myself.SoundEffect(talker, "AmdSound.ed_chimes_05");
myself.SetFlagJournal(talker, 21, 5);
myself.ShowQuestMark(talker, 21);

} else if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 6) {
myself.ShowPage(talker, "broken_desk1_q0021_09.htm");

}

}
if (reply == 9) {
myself.ShowPage(talker, "broken_desk1_q0021_12.htm");

}
if (reply == 11) {
myself.ShowPage(talker, "broken_desk1_q0021_13.htm");

}
if (reply == 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7140, 1);
myself.SetMemoState(talker, 21, 7);
myself.SetMemoStateEx(talker, 21, 1, 0);
myself.ShowPage(talker, "broken_desk1_q0021_14.htm");
myself.SetFlagJournal(talker, 21, 6);
myself.ShowQuestMark(talker, 21);

}

}

}
if (ask == 23) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 23) {
if (reply == 4) {
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 2 && gg.OwnItemCount(talker, 7149) >= 1) {
myself.DeleteItem1(talker, 7149, gg.OwnItemCount(talker, 7149));
myself.SetMemoState(talker, 23, 3);
myself.ShowPage(talker, "broken_desk1_q0023_02.htm");

}

}
if (reply == 5) {
myself.ShowPage(talker, "broken_desk1_q0023_04.htm");

}
if (reply == 7) {
myself.ShowPage(talker, "broken_desk1_q0023_05.htm");

}
if (reply == 8) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7148, 1);
myself.SetMemoState(talker, 23, gg.GetMemoState(talker, 23) + 1);
myself.ShowPage(talker, "broken_desk1_q0023_06.htm");
if (gg.OwnItemCount(talker, 7064) >= 1) {
myself.SetFlagJournal(talker, 23, 4);

}
myself.ShowQuestMark(talker, 23);

}

}
if (reply == 6) {
myself.ShowPage(talker, "broken_desk1_q0023_07a.htm");

}
if (reply == 9) {
myself.ShowPage(talker, "broken_desk1_q0023_08.htm");
myself.SoundEffect(talker, "ItemSound.itemdrop_armor_leather");

}
if (reply == 10) {
myself.ShowPage(talker, "broken_desk1_q0023_09.htm");

}
if (reply == 11) {
myself.ShowPage(talker, "broken_desk1_q0023_10.htm");
myself.SoundEffect(talker, "AmbSound.eg_dron_02");

}
if (reply == 12) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7064, 1);
myself.SetMemoState(talker, 23, gg.GetMemoState(talker, 23) + 1);
myself.ShowPage(talker, "broken_desk1_q0023_11.htm");
if (gg.OwnItemCount(talker, 7148) >= 1) {
myself.SetFlagJournal(talker, 23, 4);

}
myself.ShowQuestMark(talker, 23);

}

}

}
super;
	}


}