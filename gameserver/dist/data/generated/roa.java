package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class roa extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3185)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3186)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3187) || gg.OwnItemCount(talker, 3188) || gg.OwnItemCount(talker, 3189)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Fate (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3185)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "roa_q0219_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3186)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "roa_q0219_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3187) || gg.OwnItemCount(talker, 3188) || gg.OwnItemCount(talker, 3189)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "roa_q0219_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 219) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 219) {
if (reply == 1) {
myself.ShowPage(talker, "roa_q0219_02.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "roa_q0219_03.htm");

} else if (reply == 3 && gg.OwnItemCount(talker, 3185) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "roa_q0219_04.htm");
myself.GiveItem1(talker, 3186, 1);
myself.DeleteItem1(talker, 3185, 1);
myself.SetFlagJournal(talker, 219, 12);
myself.ShowQuestMark(talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}