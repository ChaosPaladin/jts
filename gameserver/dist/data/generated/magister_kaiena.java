package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_kaiena extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 20111 || gg.GetMemoState(talker, 337) == 20110 || gg.GetMemoState(talker, 337) == 20101 || gg.GetMemoState(talker, 337) == 20100 || gg.GetMemoState(talker, 337) == 20010 || gg.GetMemoState(talker, 337) == 20011 || gg.GetMemoState(talker, 337) == 20001 || gg.GetMemoState(talker, 337) == 20000 && gg.OwnItemCount(talker, 3853) == 0 || gg.OwnItemCount(talker, 3854) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 20111 || gg.GetMemoState(talker, 337) == 20110 || gg.GetMemoState(talker, 337) == 20101 || gg.GetMemoState(talker, 337) == 20100 || gg.GetMemoState(talker, 337) == 20011 || gg.GetMemoState(talker, 337) == 20010 || gg.GetMemoState(talker, 337) == 20001 || gg.GetMemoState(talker, 337) == 20000 && gg.OwnItemCount(talker, 3853) == 1 && gg.OwnItemCount(talker, 3854) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 21110 || gg.GetMemoState(talker, 337) == 21101 || gg.GetMemoState(talker, 337) == 21100 || gg.GetMemoState(talker, 337) == 21011 || gg.GetMemoState(talker, 337) == 21010 || gg.GetMemoState(talker, 337) == 21001 || gg.GetMemoState(talker, 337) == 21000) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) >= 30000) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) < 29) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 29) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) >= 30) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Certified Arbalester (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 20111 || gg.GetMemoState(talker, 337) == 20110 || gg.GetMemoState(talker, 337) == 20101 || gg.GetMemoState(talker, 337) == 20100 || gg.GetMemoState(talker, 337) == 20010 || gg.GetMemoState(talker, 337) == 20011 || gg.GetMemoState(talker, 337) == 20001 || gg.GetMemoState(talker, 337) == 20000 && gg.OwnItemCount(talker, 3853) == 0 || gg.OwnItemCount(talker, 3854) == 0) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kaiena_q0337_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 20111 || gg.GetMemoState(talker, 337) == 20110 || gg.GetMemoState(talker, 337) == 20101 || gg.GetMemoState(talker, 337) == 20100 || gg.GetMemoState(talker, 337) == 20011 || gg.GetMemoState(talker, 337) == 20010 || gg.GetMemoState(talker, 337) == 20001 || gg.GetMemoState(talker, 337) == 20000 && gg.OwnItemCount(talker, 3853) == 1 && gg.OwnItemCount(talker, 3854) == 1) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3864, 1);
myself.DeleteItem1(talker, 3853, gg.OwnItemCount(talker, 3853));
myself.DeleteItem1(talker, 3854, gg.OwnItemCount(talker, 3854));
if (gg.GetMemoState(talker, 337) + 1000 == 21111) {
myself.SetMemoState(talker, 337, 30000);

} else {
myself.SetMemoState(talker, 337, gg.GetMemoState(talker, 337) + 1000);

}
myself.ShowPage(talker, "magister_kaiena_q0337_02.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 21110 || gg.GetMemoState(talker, 337) == 21101 || gg.GetMemoState(talker, 337) == 21100 || gg.GetMemoState(talker, 337) == 21011 || gg.GetMemoState(talker, 337) == 21010 || gg.GetMemoState(talker, 337) == 21001 || gg.GetMemoState(talker, 337) == 21000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kaiena_q0337_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) >= 30000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kaiena_q0337_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) < 29) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kaiena_q0066_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 29) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kaiena_q0066_02.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) >= 30) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kaiena_q0066_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 337) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 337) {

}
if (ask == 66) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 66) {
if (reply == 1) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 29) {
myself.ShowPage(talker, "magister_kaiena_q0066_03.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 29) {
myself.SetMemoState(talker, 66, 30);
myself.ShowPage(talker, "magister_kaiena_q0066_04.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 66, 18);
myself.ShowQuestMark(talker, 66);

}

}

}
super;
	}


}