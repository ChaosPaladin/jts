package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class astrologer_creta extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2680) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2683) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2682) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2684) >= 1 || gg.OwnItemCount(talker, 2685) >= 1 || gg.OwnItemCount(talker, 2686) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2688) >= 1 || gg.OwnItemCount(talker, 2693) >= 1 || gg.OwnItemCount(talker, 2676) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2700) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) == 1 && gg.OwnItemCount(talker, 2700) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Trial of the Scholar (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2680) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "astrologer_creta_q0214_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2683) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "astrologer_creta_q0214_06.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2682) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "astrologer_creta_q0214_07.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2684) >= 1 || gg.OwnItemCount(talker, 2685) >= 1 || gg.OwnItemCount(talker, 2686) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "astrologer_creta_q0214_10.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2688) >= 1 || gg.OwnItemCount(talker, 2693) >= 1 || gg.OwnItemCount(talker, 2676) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "astrologer_creta_q0214_11.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) >= 1 && gg.OwnItemCount(talker, 2700) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "astrologer_creta_q0214_12.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) == 1 && gg.OwnItemCount(talker, 2700) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "astrologer_creta_q0214_15.htm");

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
myself.ShowPage(talker, "astrologer_creta_q0214_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "astrologer_creta_q0214_03.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "astrologer_creta_q0214_04.htm");

}
if (reply == 4) {
if (gg.OwnItemCount(talker, 2680) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "astrologer_creta_q0214_05.htm");
myself.SetFlagJournal(talker, 214, 6);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2680, 1);
myself.GiveItem1(talker, 2683, 1);

}

}

}
if (reply == 5) {
myself.ShowPage(talker, "astrologer_creta_q0214_08.htm");

}
if (reply == 6) {
if (gg.OwnItemCount(talker, 2682) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "astrologer_creta_q0214_09.htm");
myself.SetFlagJournal(talker, 214, 8);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2682, 1);
myself.GiveItem1(talker, 2684, 1);

}

}

}
if (reply == 7) {
myself.ShowPage(talker, "astrologer_creta_q0214_13.htm");

}
if (reply == 8) {
if (gg.OwnItemCount(talker, 2700) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "astrologer_creta_q0214_14.htm");
myself.SetFlagJournal(talker, 214, 22);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2700, 1);
myself.GiveItem1(talker, 2701, 1);

}

}

}

}
super;
	}


}