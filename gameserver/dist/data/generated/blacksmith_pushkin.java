package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blacksmith_pushkin extends blacksmith {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3145) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3149) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3150) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3145) == 0 && gg.OwnItemCount(talker, 3149) == 0 && gg.OwnItemCount(talker, 3150) == 0 && gg.OwnItemCount(talker, 3144) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 422) && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4331) >= 1 && gg.OwnItemCount(talker, 1892) > 0 && gg.OwnItemCount(talker, 1880) >= 5 && gg.OwnItemCount(talker, 1877) >= 2 && gg.OwnItemCount(talker, 1873) >= 10 && gg.OwnItemCount(talker, 1879) >= 10 && gg.OwnItemCount(talker, 4330) == 0 && gg.OwnItemCount(talker, 4425) == 0 && gg.OwnItemCount(talker, 4426) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Repent Your Sins (In Progress)");

}
if (gg.HaveMemo(talker, 422) && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4331) >= 1 && gg.OwnItemCount(talker, 1892) == 0 || gg.OwnItemCount(talker, 1880) < 5 || gg.OwnItemCount(talker, 1877) < 2 || gg.OwnItemCount(talker, 1873) < 10 || gg.OwnItemCount(talker, 1879) < 10 && gg.OwnItemCount(talker, 4330) == 0 && gg.OwnItemCount(talker, 4425) == 0 && gg.OwnItemCount(talker, 4426) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Repent Your Sins (In Progress)");

}
if (gg.HaveMemo(talker, 422) && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4330) == 1 || gg.OwnItemCount(talker, 4425) == 1 || gg.OwnItemCount(talker, 4426) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Repent Your Sins (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3145) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pushkin_q0218_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3149) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3161) >= 10 && gg.OwnItemCount(talker, 3162) >= 20 && gg.OwnItemCount(talker, 3163) >= 20) {
myself.ShowPage(talker, "blacksmith_pushkin_q0218_08.htm");

} else {
myself.ShowPage(talker, "blacksmith_pushkin_q0218_07.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3150) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pushkin_q0218_11.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3145) == 0 && gg.OwnItemCount(talker, 3149) == 0 && gg.OwnItemCount(talker, 3150) == 0 && gg.OwnItemCount(talker, 3144) == 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pushkin_q0218_12.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4331) >= 1 && gg.OwnItemCount(talker, 1892) > 0 && gg.OwnItemCount(talker, 1880) >= 5 && gg.OwnItemCount(talker, 1877) >= 2 && gg.OwnItemCount(talker, 1873) >= 10 && gg.OwnItemCount(talker, 1879) >= 10 && gg.OwnItemCount(talker, 4330) == 0 && gg.OwnItemCount(talker, 4425) == 0 && gg.OwnItemCount(talker, 4426) == 0) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4330, 1);
myself.DeleteItem1(talker, 4331, 1);
myself.DeleteItem1(talker, 1892, 1);
myself.DeleteItem1(talker, 1880, 5);
myself.DeleteItem1(talker, 1877, 2);
myself.DeleteItem1(talker, 1873, 10);
myself.DeleteItem1(talker, 1879, 10);
myself.ShowPage(talker, "blacksmith_pushkin_q0422_01.htm");
myself.SetFlagJournal(talker, 422, 15);
myself.ShowQuestMark(talker, 422);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4331) >= 1 && gg.OwnItemCount(talker, 1892) == 0 || gg.OwnItemCount(talker, 1880) < 5 || gg.OwnItemCount(talker, 1877) < 2 || gg.OwnItemCount(talker, 1873) < 10 || gg.OwnItemCount(talker, 1879) < 10 && gg.OwnItemCount(talker, 4330) == 0 && gg.OwnItemCount(talker, 4425) == 0 && gg.OwnItemCount(talker, 4426) == 0) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pushkin_q0422_02.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4330) == 1 || gg.OwnItemCount(talker, 4425) == 1 || gg.OwnItemCount(talker, 4426) == 1) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_pushkin_q0422_03.htm");

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
myself.ShowPage(talker, "blacksmith_pushkin_q0218_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "blacksmith_pushkin_q0218_03.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "blacksmith_pushkin_q0218_04.htm");

}
if (reply == 4) {
myself.ShowPage(talker, "blacksmith_pushkin_q0218_05.htm");

}
if (reply == 5) {
if (gg.OwnItemCount(talker, 3145) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_pushkin_q0218_06.htm");
myself.DeleteItem1(talker, 3145, 1);
myself.GiveItem1(talker, 3149, 1);
myself.SetFlagJournal(talker, 218, 4);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (reply == 6) {
myself.ShowPage(talker, "blacksmith_pushkin_q0218_09.htm");

}
if (reply == 7) {
if (gg.OwnItemCount(talker, 3149) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_pushkin_q0218_10.htm");
myself.SetFlagJournal(talker, 218, 6);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 3161, gg.OwnItemCount(talker, 3161));
myself.DeleteItem1(talker, 3162, gg.OwnItemCount(talker, 3162));
myself.DeleteItem1(talker, 3163, gg.OwnItemCount(talker, 3163));
myself.DeleteItem1(talker, 3149, 1);
myself.GiveItem1(talker, 3150, 1);

}

}

}

}
super;
	}


}