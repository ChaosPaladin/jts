package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rust_box1 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 11 && gg.OwnItemCount(talker, 7149) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 11 && gg.OwnItemCount(talker, 7150) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Lidia's Heart (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 11 && gg.OwnItemCount(talker, 7149) >= 1) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rust_box1_q0023_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 11 && gg.OwnItemCount(talker, 7150) >= 1) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rust_box1_q0023_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 23) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 23) {
if (reply == 27) {
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 11 && gg.OwnItemCount(talker, 7149) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7150, 1);
myself.DeleteItem1(talker, 7149, gg.OwnItemCount(talker, 7149));
myself.ShowPage(talker, "rust_box1_q0023_02.htm");
myself.SoundEffect(talker, "ItemSound.itemdrop_weapon_spear");
myself.SetFlagJournal(talker, 23, 10);
myself.ShowQuestMark(talker, 23);

}

}

}

}
super;
	}


}