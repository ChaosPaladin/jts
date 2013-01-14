package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class arkenia extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 411) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Assassin (In Progress)");

}
if (gg.HaveMemo(talker, 412) == 1 && gg.OwnItemCount(talker, 1256) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Dark Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190) && gg.OwnItemCount(talker, 3191)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190) && gg.OwnItemCount(talker, 3192) && gg.OwnItemCount(talker, 3198) < 1 || gg.OwnItemCount(talker, 3201) < 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190) && gg.OwnItemCount(talker, 3192) && gg.OwnItemCount(talker, 3198) >= 1 && gg.OwnItemCount(talker, 3201) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190) && gg.OwnItemCount(talker, 3202)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3146) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3152) >= 1 || gg.OwnItemCount(talker, 3153) >= 1 && gg.OwnItemCount(talker, 3144) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3154) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3155) >= 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3146) == 0 && gg.OwnItemCount(talker, 3151) == 0 && gg.OwnItemCount(talker, 3154) == 0 && gg.OwnItemCount(talker, 3155) == 0 && gg.OwnItemCount(talker, 3144) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Testimony of Life (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 411) == 1) {
myself.SetCurrentQuestID(411);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 0 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 1) {
myself.ShowPage(talker, "arkenia_q0411_01.htm");

} else if (gg.OwnItemCount(talker, 1246) == 1 && gg.OwnItemCount(talker, 1247) == 0 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0) {
myself.ShowPage(talker, "arkenia_q0411_07.htm");

} else if (gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 0 && gg.OwnItemCount(talker, 1250) == 1 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "arkenia_q0411_08.htm");
myself.GiveItem1(talker, 1251, 1);
myself.DeleteItem1(talker, 1250, 1);
myself.SetFlagJournal(talker, 411, 7);
myself.ShowQuestMark(talker, 411);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 0 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 1 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0) {
myself.ShowPage(talker, "arkenia_q0411_09.htm");

} else if (gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 1 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0) {
myself.ShowPage(talker, "arkenia_q0411_10.htm");

} else if (gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 0 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0) {
myself.ShowPage(talker, "arkenia_q0411_11.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 412) == 1 && gg.OwnItemCount(talker, 1256) == 0) {
myself.SetCurrentQuestID(412);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1279) == 0 && gg.OwnItemCount(talker, 1260) == 0) {
myself.ShowPage(talker, "arkenia_q0412_01.htm");
myself.GiveItem1(talker, 1279, 1);

} else if (gg.OwnItemCount(talker, 1279) && gg.OwnItemCount(talker, 1260) < 3) {
myself.ShowPage(talker, "arkenia_q0412_02.htm");

} else if (gg.OwnItemCount(talker, 1279) && gg.OwnItemCount(talker, 1260) >= 3) {
myself.ShowPage(talker, "arkenia_q0412_03.htm");
myself.GiveItem1(talker, 1256, 1);
myself.DeleteItem1(talker, 1260, 3);
myself.DeleteItem1(talker, 1279, 1);

}

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190) && gg.OwnItemCount(talker, 3191)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "arkenia_q0219_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190) && gg.OwnItemCount(talker, 3192) && gg.OwnItemCount(talker, 3198) < 1 || gg.OwnItemCount(talker, 3201) < 1) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "arkenia_q0219_03.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190) && gg.OwnItemCount(talker, 3192) && gg.OwnItemCount(talker, 3198) >= 1 && gg.OwnItemCount(talker, 3201) >= 1) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "arkenia_q0219_04.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190) && gg.OwnItemCount(talker, 3202)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "arkenia_q0219_06.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3146) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "arkenia_q0218_01.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3152) >= 1 || gg.OwnItemCount(talker, 3153) >= 1 && gg.OwnItemCount(talker, 3144) == 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "arkenia_q0218_05.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3154) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "arkenia_q0218_06.htm");
myself.DeleteItem1(talker, 3151, gg.OwnItemCount(talker, 3151));
myself.DeleteItem1(talker, 3154, 1);
myself.GiveItem1(talker, 3155, 1);
myself.SetFlagJournal(talker, 218, 12);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3155) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "arkenia_q0218_07.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3146) == 0 && gg.OwnItemCount(talker, 3151) == 0 && gg.OwnItemCount(talker, 3154) == 0 && gg.OwnItemCount(talker, 3155) == 0 && gg.OwnItemCount(talker, 3144) == 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "arkenia_q0218_08.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 411) {
myself.SetCurrentQuestID(411);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 411) {
if (reply == 1 && gg.OwnItemCount(talker, 1245) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "arkenia_q0411_05.htm");
myself.GiveItem1(talker, 1246, 1);
myself.DeleteItem1(talker, 1245, 1);
myself.SetFlagJournal(talker, 411, 2);
myself.ShowQuestMark(talker, 411);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 219) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 219) {
if (reply == 1 && gg.OwnItemCount(talker, 3191) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "arkenia_q0219_02.htm");
myself.GiveItem1(talker, 3192, 1);
myself.DeleteItem1(talker, 3191, 1);
myself.SetFlagJournal(talker, 219, 17);
myself.ShowQuestMark(talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 2 && gg.OwnItemCount(talker, 3192) && gg.OwnItemCount(talker, 3198) >= 1 && gg.OwnItemCount(talker, 3201) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "arkenia_q0219_05.htm");
myself.GiveItem1(talker, 3202, 1);
myself.DeleteItem1(talker, 3192, 1);
myself.DeleteItem1(talker, 3198, 1);
myself.DeleteItem1(talker, 3201, 1);
myself.SetFlagJournal(talker, 219, 18);
myself.ShowQuestMark(talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_middle");

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
myself.ShowPage(talker, "arkenia_q0218_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "arkenia_q0218_03.htm");

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 3146) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "arkenia_q0218_04.htm");
myself.DeleteItem1(talker, 3146, 1);
myself.GiveItem1(talker, 3151, 1);
myself.GiveItem1(talker, 3152, 1);
myself.SetFlagJournal(talker, 218, 8);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}