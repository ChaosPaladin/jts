package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kakan extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 11 && gg.OwnItemCount(talker, 2825) > 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Reformer (In Progress)");

}
if (gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 12 && gg.OwnItemCount(talker, 3037) == 0 && gg.OwnItemCount(talker, 2825) > 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Reformer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 11 && gg.OwnItemCount(talker, 2825) > 0) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "kakan_q0227_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 12 && gg.OwnItemCount(talker, 3037) == 0 && gg.OwnItemCount(talker, 2825) > 0) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2825) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "kakan_q0227_04.htm");
myself.SetMemoState(talker, 227, 13);
myself.GiveItem1(talker, 3037, 1);
myself.DeleteItem1(talker, 2825, gg.OwnItemCount(talker, 2825));
myself.SetFlagJournal(talker, 227, 14);
myself.ShowQuestMark(talker, 227);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 227) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 227) {
if (reply == 1) {
myself.ShowPage(talker, "kakan_q0227_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "kakan_q0227_03.htm");
myself.SetFlagJournal(talker, 227, 12);
myself.ShowQuestMark(talker, 227);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (myself.Maker_GetNpcCount() == 1) {
i0 = myself.CreateOnePrivateEx(1030732, "ol_mahum_pilgrim", 0, 0, -9282, -89975, -2331, 0, 0, 0, 0);
myself.CreateOnePrivateEx(1027131, "crimsha_werewolf", 0, 0, -9382, -89852, -2333, 0, i0, 0, 0);

}

}
if (reply == 3) {
myself.ShowPage(talker, "kakan_q0227_05.htm");

}

}
super;
	}


}