package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class isael_silvershadow extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 8) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 9) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 10) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of Duty (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3147) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3156) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3026) >= 1 && gg.OwnItemCount(talker, 3157) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3158) >= 1 || gg.OwnItemCount(talker, 3160) >= 1 || gg.OwnItemCount(talker, 3142) >= 1 && gg.OwnItemCount(talker, 3144) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Life (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 8) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 0) {
myself.ShowPage(talker, "isael_silvershadow_q0212_02.htm");
myself.SetMemoState(talker, 212, 9);
myself.SetFlagJournal(talker, 212, 11);
myself.ShowQuestMark(talker, 212);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowPage(talker, "isael_silvershadow_q0212_01.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 9) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2641) < 20) {
myself.ShowPage(talker, "isael_silvershadow_q0212_03.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "isael_silvershadow_q0212_04.htm");
myself.GiveItem1(talker, 2640, 1);
myself.DeleteItem1(talker, 2641, gg.OwnItemCount(talker, 2641));
myself.SetMemoState(talker, 212, 10);
myself.SetFlagJournal(talker, 212, 13);
myself.ShowQuestMark(talker, 212);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 10) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "isael_silvershadow_q0212_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3147) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "isael_silvershadow_q0218_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3156) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3166) >= 1 && gg.OwnItemCount(talker, 3167) >= 1 && gg.OwnItemCount(talker, 3168) >= 1 && gg.OwnItemCount(talker, 3169) >= 1 && gg.OwnItemCount(talker, 3170) >= 1 && gg.OwnItemCount(talker, 3171) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "isael_silvershadow_q0218_04.htm");
myself.DeleteItem1(talker, 3166, gg.OwnItemCount(talker, 3166));
myself.DeleteItem1(talker, 3167, gg.OwnItemCount(talker, 3167));
myself.DeleteItem1(talker, 3168, gg.OwnItemCount(talker, 3168));
myself.DeleteItem1(talker, 3169, gg.OwnItemCount(talker, 3169));
myself.DeleteItem1(talker, 3170, gg.OwnItemCount(talker, 3170));
myself.DeleteItem1(talker, 3171, gg.OwnItemCount(talker, 3171));
myself.DeleteItem1(talker, 3156, 1);
myself.GiveItem1(talker, 3157, 1);
myself.GiveItem1(talker, 3026, 1);
myself.SetFlagJournal(talker, 218, 17);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "isael_silvershadow_q0218_03.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3026) >= 1 && gg.OwnItemCount(talker, 3157) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "isael_silvershadow_q0218_05.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3158) >= 1 || gg.OwnItemCount(talker, 3160) >= 1 || gg.OwnItemCount(talker, 3142) >= 1 && gg.OwnItemCount(talker, 3144) == 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "isael_silvershadow_q0218_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 218) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 218) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 3147) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "isael_silvershadow_q0218_02.htm");
myself.DeleteItem1(talker, 3147, 1);
myself.GiveItem1(talker, 3156, 1);
myself.SetFlagJournal(talker, 218, 15);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}