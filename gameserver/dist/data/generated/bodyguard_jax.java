package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class bodyguard_jax extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2799) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2800) == 1 && gg.OwnItemCount(talker, 2803) + gg.OwnItemCount(talker, 2804) < 2) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2800) == 1 && gg.OwnItemCount(talker, 2803) + gg.OwnItemCount(talker, 2804) == 2) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Searcher (In Progress)");

}
if (gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2805) == 1 || gg.OwnItemCount(talker, 2808) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Searcher (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2799) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bodyguard_jax_q0225_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2800) == 1 && gg.OwnItemCount(talker, 2803) + gg.OwnItemCount(talker, 2804) < 2) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bodyguard_jax_q0225_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2800) == 1 && gg.OwnItemCount(talker, 2803) + gg.OwnItemCount(talker, 2804) == 2) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "bodyguard_jax_q0225_03.htm");
myself.DeleteItem1(talker, 2800, gg.OwnItemCount(talker, 2800));
myself.DeleteItem1(talker, 2803, gg.OwnItemCount(talker, 2803));
myself.DeleteItem1(talker, 2792, gg.OwnItemCount(talker, 2792));
myself.DeleteItem1(talker, 2804, 1);
myself.GiveItem1(talker, 2805, 1);
myself.SetFlagJournal(talker, 225, 16);
myself.ShowQuestMark(talker, 225);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 225) == 1 && gg.OwnItemCount(talker, 2805) == 1 || gg.OwnItemCount(talker, 2808) == 1) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bodyguard_jax_q0225_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 225) {
myself.SetCurrentQuestID(225);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 225) {
if (reply == 1) {
myself.ShowPage(talker, "bodyguard_jax_q0225_01a.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "bodyguard_jax_q0225_01b.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "bodyguard_jax_q0225_01c.htm");

}
if (reply == 4) {
if (gg.OwnItemCount(talker, 2799) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "bodyguard_jax_q0225_01d.htm");
myself.DeleteItem1(talker, 2799, 1);
myself.GiveItem1(talker, 2800, 1);
myself.SetFlagJournal(talker, 225, 14);
myself.ShowQuestMark(talker, 225);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}