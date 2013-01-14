package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class vivi extends cleric_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 405) == 1 && gg.OwnItemCount(talker, 1191) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Cleric (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2902) == 1 && gg.OwnItemCount(talker, 2903) == 0 && gg.OwnItemCount(talker, 2904) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the War Spirit (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2904) == 0 && gg.OwnItemCount(talker, 2902) >= 1 && gg.OwnItemCount(talker, 2903) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the War Spirit (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2903) == 0 && gg.OwnItemCount(talker, 2902) >= 1 && gg.OwnItemCount(talker, 2904) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the War Spirit (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2902) == 0 && gg.OwnItemCount(talker, 2910) >= 1 || gg.OwnItemCount(talker, 2914) >= 1 || gg.OwnItemCount(talker, 2880) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the War Spirit (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 405) == 1 && gg.OwnItemCount(talker, 1191) == 1) {
myself.SetCurrentQuestID(405);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1194) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "vivi_q0405_01.htm");
myself.GiveItem1(talker, 1194, 1);
if (gg.OwnItemCount(talker, 1195) >= 3 && gg.OwnItemCount(talker, 1194) >= 0 && gg.OwnItemCount(talker, 1196) >= 1) {
myself.SetFlagJournal(talker, 405, 2);
myself.ShowQuestMark(talker, 405);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

} else if (gg.OwnItemCount(talker, 1194) == 1) {
myself.ShowPage(talker, "vivi_q0405_02.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2902) == 1 && gg.OwnItemCount(talker, 2903) == 0 && gg.OwnItemCount(talker, 2904) == 0) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "vivi_q0233_01.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2904) == 0 && gg.OwnItemCount(talker, 2902) >= 1 && gg.OwnItemCount(talker, 2903) >= 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "vivi_q0233_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2903) == 0 && gg.OwnItemCount(talker, 2902) >= 1 && gg.OwnItemCount(talker, 2904) >= 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "vivi_q0233_06.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2902) == 0 && gg.OwnItemCount(talker, 2910) >= 1 || gg.OwnItemCount(talker, 2914) >= 1 || gg.OwnItemCount(talker, 2880) >= 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "vivi_q0233_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 233) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 233) {
if (reply == 1) {
myself.ShowPage(talker, "vivi_q0233_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "vivi_q0233_03.htm");

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "vivi_q0233_04.htm");
myself.GiveItem1(talker, 2903, 1);

}

}

}
super;
	}


}