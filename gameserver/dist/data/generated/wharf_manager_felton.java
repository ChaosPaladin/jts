package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wharf_manager_felton extends wharf_keeper {
protected Object[][] SellList0 = {
{"boat_ticket_kiran_talk";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 35) == 1 && myself.GetOneTimeQuestFlag(talker, 35) == 0 && gg.GetMemoState(talker, 35) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Find Glittering Jewelry (In Progress)");

}
if (gg.HaveMemo(talker, 35) == 1 && gg.GetMemoState(talker, 35) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Find Glittering Jewelry (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 11) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Certified Soul Breaker (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 12) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Certified Soul Breaker (In Progress)");

}
if (gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) == 4 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path to Becoming a Lord - Giran (In progress)");

}
if (gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) == 5 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path to Becoming a Lord - Giran (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 35) == 1 && myself.GetOneTimeQuestFlag(talker, 35) == 0 && gg.GetMemoState(talker, 35) == 1 * 10 + 1) {
myself.SetCurrentQuestID(35);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 35, 1);
myself.ShowPage(talker, "wharf_manager_felton_q0035_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 35) == 1 && gg.GetMemoState(talker, 35) == 2 * 10 + 1) {
myself.SetCurrentQuestID(35);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wharf_manager_felton_q0035_0202.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 11) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wharf_manager_felton_q0065_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 12) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wharf_manager_felton_q0065_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) == 4 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(710);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wharf_manager_felton_q0710_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) == 5 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(710);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wharf_manager_felton_q0710_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 35) {
myself.SetCurrentQuestID(35);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 35) {
i0 = myself.GetHTMLCookie(talker, 35, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 35) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "wharf_manager_felton_q0035_0201.htm");
myself.SetMemoState(talker, 35, 2 * 10 + 1);
myself.SetFlagJournal(talker, 35, 2);
myself.ShowQuestMark(talker, 35);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 65) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 65) {
if (reply == 1 && gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 11) {
myself.ShowPage(talker, "wharf_manager_felton_q0065_02.htm");

}
if (reply == 2 && gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 11) {
myself.SetMemoState(talker, 65, 12);
myself.ShowPage(talker, "wharf_manager_felton_q0065_03.htm");
myself.SetFlagJournal(talker, 65, 12);
myself.ShowQuestMark(talker, 65);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 710) {
myself.SetCurrentQuestID(710);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 710) {
if (reply == 1) {
if (gg.HaveMemo(talker, 710) == 1 && gg.GetMemoState(talker, 710) == 4 && myself.IsMyLord(talker) == 1) {
myself.SetMemoState(talker, 710, 5);
myself.ShowPage(talker, "wharf_manager_felton_q0710_02.htm");
myself.SetFlagJournal(talker, 710, 4);
myself.ShowQuestMark(talker, 710);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}