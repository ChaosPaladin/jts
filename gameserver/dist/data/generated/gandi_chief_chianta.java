package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gandi_chief_chianta extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3208)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3211) + gg.OwnItemCount(talker, 3213) + gg.OwnItemCount(talker, 3214) + gg.OwnItemCount(talker, 3215) + gg.OwnItemCount(talker, 3212) < 5) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3211) && gg.OwnItemCount(talker, 3213) && gg.OwnItemCount(talker, 3214) && gg.OwnItemCount(talker, 3215) && gg.OwnItemCount(talker, 3212)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3216)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3217) && gg.OwnItemCount(talker, 3218) < 20 || gg.OwnItemCount(talker, 3219) < 20) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3217) && gg.OwnItemCount(talker, 3218) >= 20 && gg.OwnItemCount(talker, 3219) >= 20) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3220)) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3235) || gg.OwnItemCount(talker, 3237)) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3411) == 0 && gg.OwnItemCount(talker, 3396) == 0 && gg.OwnItemCount(talker, 3391) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3396) >= 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3411) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3411) >= 1 && gg.OwnItemCount(talker, 3396) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Test of the Lord (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3208)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gandi_chief_chianta_q0220_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3211) + gg.OwnItemCount(talker, 3213) + gg.OwnItemCount(talker, 3214) + gg.OwnItemCount(talker, 3215) + gg.OwnItemCount(talker, 3212) < 5) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gandi_chief_chianta_q0220_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3211) && gg.OwnItemCount(talker, 3213) && gg.OwnItemCount(talker, 3214) && gg.OwnItemCount(talker, 3215) && gg.OwnItemCount(talker, 3212)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gandi_chief_chianta_q0220_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3216)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gandi_chief_chianta_q0220_09.htm");
myself.GiveItem1(talker, 3217, 1);
myself.DeleteItem1(talker, 3216, 1);

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3217) && gg.OwnItemCount(talker, 3218) < 20 || gg.OwnItemCount(talker, 3219) < 20) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gandi_chief_chianta_q0220_10.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3217) && gg.OwnItemCount(talker, 3218) >= 20 && gg.OwnItemCount(talker, 3219) >= 20) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3220, 1);
myself.DeleteItem1(talker, 3209, 1);
myself.DeleteItem1(talker, 3217, 1);
myself.DeleteItem1(talker, 3218, gg.OwnItemCount(talker, 3218));
myself.DeleteItem1(talker, 3219, gg.OwnItemCount(talker, 3219));
myself.ShowPage(talker, "gandi_chief_chianta_q0220_11.htm");
myself.SetFlagJournal(talker, 220, 8);
myself.ShowQuestMark(talker, 220);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3220)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gandi_chief_chianta_q0220_12.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3235) || gg.OwnItemCount(talker, 3237)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gandi_chief_chianta_q0220_13.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3411) == 0 && gg.OwnItemCount(talker, 3396) == 0 && gg.OwnItemCount(talker, 3391) == 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gandi_chief_chianta_q0232_01.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3396) >= 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3411) == 0) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3410) < 20) {
myself.ShowPage(talker, "gandi_chief_chianta_q0232_03.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gandi_chief_chianta_q0232_04.htm");
myself.DeleteItem1(talker, 3410, gg.OwnItemCount(talker, 3410));
myself.DeleteItem1(talker, 3396, 1);
myself.GiveItem1(talker, 3411, 1);
if (gg.OwnItemCount(talker, 3400) == 1 && gg.OwnItemCount(talker, 3406) == 1 && gg.OwnItemCount(talker, 3404) == 1 && gg.OwnItemCount(talker, 3409) == 1) {
myself.SetFlagJournal(talker, 232, 2);
myself.ShowQuestMark(talker, 232);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3411) >= 1 && gg.OwnItemCount(talker, 3396) == 0) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gandi_chief_chianta_q0232_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 220) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 220) {
if (reply == 1) {
myself.ShowPage(talker, "gandi_chief_chianta_q0220_02.htm");

} else if (reply == 2 && gg.OwnItemCount(talker, 3208) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gandi_chief_chianta_q0220_03.htm");
myself.GiveItem1(talker, 3210, 1);
myself.DeleteItem1(talker, 3208, 1);
myself.SetFlagJournal(talker, 220, 4);
myself.ShowQuestMark(talker, 220);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 3 && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3211) && gg.OwnItemCount(talker, 3213) && gg.OwnItemCount(talker, 3214) && gg.OwnItemCount(talker, 3215) && gg.OwnItemCount(talker, 3212)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetFlagJournal(talker, 220, 6);
myself.ShowQuestMark(talker, 220);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "gandi_chief_chianta_q0220_07.htm");
myself.GiveItem1(talker, 3217, 1);
myself.DeleteItem1(talker, 3211, 1);
myself.DeleteItem1(talker, 3212, 1);
myself.DeleteItem1(talker, 3213, 1);
myself.DeleteItem1(talker, 3214, 1);
myself.DeleteItem1(talker, 3215, 1);
myself.DeleteItem1(talker, 3210, 1);
myself.DeleteItem1(talker, 3228, gg.OwnItemCount(talker, 3228));
myself.DeleteItem1(talker, 3229, gg.OwnItemCount(talker, 3229));
myself.DeleteItem1(talker, 3230, gg.OwnItemCount(talker, 3230));

}

}

}
if (ask == 232) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 232) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gandi_chief_chianta_q0232_02.htm");
myself.GiveItem1(talker, 3396, 1);

}

}

}
super;
	}


}