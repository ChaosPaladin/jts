package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class priest_adonius extends cleric_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 413) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Shillien Oracle (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3152) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3153) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3154) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3152) == 0 && gg.OwnItemCount(talker, 3153) == 0 && gg.OwnItemCount(talker, 3154) == 0 && gg.OwnItemCount(talker, 3144) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 2) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Subjugation of Lizardmen (In Progress)");

}
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 3 && gg.OwnItemCount(talker, 4256) == 0 || gg.OwnItemCount(talker, 4257) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Subjugation of Lizardmen (In Progress)");

}
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 3 && gg.OwnItemCount(talker, 4256) >= 1 && gg.OwnItemCount(talker, 4257) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Subjugation of Lizardmen (In Progress)");

}
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 4) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Subjugation of Lizardmen (In Progress)");

}
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) >= 5) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Subjugation of Lizardmen (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 413) == 1) {
myself.SetCurrentQuestID(413);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1266) == 1) {
myself.ShowPage(talker, "priest_adonius_q0413_01.htm");

} else if (gg.OwnItemCount(talker, 1267) == 1 && gg.OwnItemCount(talker, 1268) == 0 && gg.OwnItemCount(talker, 1269) == 0) {
myself.ShowPage(talker, "priest_adonius_q0413_05.htm");

} else if (gg.OwnItemCount(talker, 1267) == 1 && gg.OwnItemCount(talker, 1268) < 10 && gg.OwnItemCount(talker, 1268) > 0) {
myself.ShowPage(talker, "priest_adonius_q0413_06.htm");

} else if (gg.OwnItemCount(talker, 1267) == 1 && gg.OwnItemCount(talker, 1268) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "priest_adonius_q0413_07.htm");
myself.DeleteItem1(talker, 1268, gg.OwnItemCount(talker, 1268));
myself.DeleteItem1(talker, 1267, gg.OwnItemCount(talker, 1267));
myself.GiveItem1(talker, 1269, 1);
myself.SetFlagJournal(talker, 413, 7);
myself.ShowQuestMark(talker, 413);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (gg.OwnItemCount(talker, 1269) == 1) {
myself.ShowPage(talker, "priest_adonius_q0413_08.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3152) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_adonius_q0218_01.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3153) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3164) >= 20 && gg.OwnItemCount(talker, 3165) >= 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "priest_adonius_q0218_04.htm");
myself.DeleteItem1(talker, 3164, gg.OwnItemCount(talker, 3164));
myself.DeleteItem1(talker, 3165, gg.OwnItemCount(talker, 3165));
myself.DeleteItem1(talker, 3153, 1);
myself.GiveItem1(talker, 3154, 1);
myself.SetFlagJournal(talker, 218, 11);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "priest_adonius_q0218_03.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) >= 1 && gg.OwnItemCount(talker, 3154) >= 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_adonius_q0218_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3152) == 0 && gg.OwnItemCount(talker, 3153) == 0 && gg.OwnItemCount(talker, 3154) == 0 && gg.OwnItemCount(talker, 3144) == 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_adonius_q0218_06.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 2) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_adonius_q0340_01.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 3 && gg.OwnItemCount(talker, 4256) == 0 || gg.OwnItemCount(talker, 4257) == 0) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_adonius_q0340_03.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 3 && gg.OwnItemCount(talker, 4256) >= 1 && gg.OwnItemCount(talker, 4257) >= 1) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 4256, gg.OwnItemCount(talker, 4256));
myself.DeleteItem1(talker, 4257, gg.OwnItemCount(talker, 4257));
myself.SetMemoState(talker, 340, 4);
myself.SetFlagJournal(talker, 340, 4);
myself.ShowQuestMark(talker, 340);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "priest_adonius_q0340_04.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 4) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_adonius_q0340_05.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) >= 5) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_adonius_q0340_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 413) {
myself.SetCurrentQuestID(413);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 413) {
if (reply == 1) {
myself.ShowPage(talker, "priest_adonius_q0413_02.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "priest_adonius_q0413_03.htm");

} else if (reply == 3 && gg.OwnItemCount(talker, 1266) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "priest_adonius_q0413_04.htm");
myself.DeleteItem1(talker, 1266, 1);
myself.GiveItem1(talker, 1267, 1);
myself.SetFlagJournal(talker, 413, 5);
myself.ShowQuestMark(talker, 413);
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
if (gg.OwnItemCount(talker, 3152) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "priest_adonius_q0218_02.htm");
myself.DeleteItem1(talker, 3152, 1);
myself.GiveItem1(talker, 3153, 1);
myself.SetFlagJournal(talker, 218, 9);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 340) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 340) {
if (reply == 1) {
myself.SetMemoState(talker, 340, 3);
myself.SetFlagJournal(talker, 340, 3);
myself.ShowQuestMark(talker, 340);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "priest_adonius_q0340_02.htm");

}

}
super;
	}


}