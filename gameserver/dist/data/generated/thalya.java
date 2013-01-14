package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class thalya extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 161) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Fruit of the Mother Tree (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1222) != 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1273) != 0 && gg.OwnItemCount(talker, 1223) < 5) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1273) != 0 && gg.OwnItemCount(talker, 1223) >= 5) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3143) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3145) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3149) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3150) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3146) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3151) >= 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3155) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3148) >= 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3147) >= 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3156) >= 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3026) >= 1 && gg.OwnItemCount(talker, 3157) >= 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3026) >= 1 && gg.OwnItemCount(talker, 3158) >= 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3159) >= 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3142) >= 1 || gg.OwnItemCount(talker, 3160) >= 1 && gg.OwnItemCount(talker, 3144) == 1) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Testimony of Life (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 161) == 1) {
myself.SetCurrentQuestID(161);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1036) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "thalya_q0312_01.htm");
myself.GiveItem1(talker, 1037, 1);
myself.DeleteItem1(talker, 1036, 1);
myself.SetFlagJournal(talker, 161, 2);
myself.ShowQuestMark(talker, 161);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (gg.OwnItemCount(talker, 1037) == 1) {
myself.ShowPage(talker, "thalya_q0312_02.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1222) != 0) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "thalya_q0408_01.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1273) != 0 && gg.OwnItemCount(talker, 1223) < 5) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "thalya_q0408_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1273) != 0 && gg.OwnItemCount(talker, 1223) >= 5) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1223, gg.OwnItemCount(talker, 1223));
myself.DeleteItem1(talker, 1273, gg.OwnItemCount(talker, 1273));
if (gg.OwnItemCount(talker, 1221) == 0) {
myself.GiveItem1(talker, 1221, 1);

}
myself.ShowPage(talker, "thalya_q0408_04.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3143) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "thalya_q0218_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3145) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "thalya_q0218_04.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3149) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "thalya_q0218_05.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3150) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "thalya_q0218_06.htm");
myself.DeleteItem1(talker, 3150, 1);
myself.GiveItem1(talker, 3146, 1);
myself.SetFlagJournal(talker, 218, 7);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3146) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "thalya_q0218_07.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3151) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "thalya_q0218_08.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3155) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "thalya_q0218_09.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3148) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level < 38) {
myself.ShowPage(talker, "thalya_q0218_12.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "thalya_q0218_13.htm");
myself.DeleteItem1(talker, 3148, 1);
myself.GiveItem1(talker, 3147, 1);
myself.SetFlagJournal(talker, 218, 14);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3147) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "thalya_q0218_14.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3156) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "thalya_q0218_15.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3026) >= 1 && gg.OwnItemCount(talker, 3157) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "thalya_q0218_16.htm");
myself.DeleteItem1(talker, 3157, 1);
myself.GiveItem1(talker, 3158, 1);
myself.SetFlagJournal(talker, 218, 18);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3026) >= 1 && gg.OwnItemCount(talker, 3158) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "thalya_q0218_17.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3159) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "thalya_q0218_18.htm");
myself.DeleteItem1(talker, 3159, 1);
myself.GiveItem1(talker, 3160, 1);
myself.SetFlagJournal(talker, 218, 20);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3142) >= 1 || gg.OwnItemCount(talker, 3160) >= 1 && gg.OwnItemCount(talker, 3144) == 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "thalya_q0218_19.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 408) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 408 && reply == 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1222) != 0) {
myself.DeleteItem1(talker, 1222, gg.OwnItemCount(talker, 1222));
if (gg.OwnItemCount(talker, 1273) == 0) {
myself.GiveItem1(talker, 1273, 1);

}
myself.ShowPage(talker, "thalya_q0408_02.htm");

}

}

}
if (ask == 218) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 218) {
if (reply == 1) {
myself.ShowPage(talker, "thalya_q0218_02.htm");

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 3143) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "thalya_q0218_03.htm");
myself.DeleteItem1(talker, 3143, 1);
myself.GiveItem1(talker, 3145, 1);
myself.SetFlagJournal(talker, 218, 3);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 3155) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "thalya_q0218_11.htm");
myself.DeleteItem1(talker, 3155, 1);
myself.GiveItem1(talker, 3147, 1);
myself.SetFlagJournal(talker, 218, 14);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}