package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class nyakuri extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 13 && gg.OwnItemCount(talker, 5567) > 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Reformer (In Progress)");

}
if (gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 14 && gg.OwnItemCount(talker, 5567) > 0 && gg.OwnItemCount(talker, 2828) == 0) {
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
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 13 && gg.OwnItemCount(talker, 5567) > 0) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "nyakuri_q0227_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 14 && gg.OwnItemCount(talker, 5567) > 0 && gg.OwnItemCount(talker, 2828) == 0) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "nyakuri_q0227_04.htm");
myself.SetFlagJournal(talker, 227, 17);
myself.ShowQuestMark(talker, 227);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 227, 15);
myself.GiveItem1(talker, 2828, 1);
myself.DeleteItem1(talker, 5567, gg.OwnItemCount(talker, 5567));

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
myself.ShowPage(talker, "nyakuri_q0227_03.htm");
myself.SetFlagJournal(talker, 227, 15);
myself.ShowQuestMark(talker, 227);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (myself.Maker_GetNpcCount() == 1) {
i0 = myself.CreateOnePrivateEx(1030732, "ol_mahum_pilgrim", 0, 0, 125947, -180049, -1778, 0, 0, 0, 0);
myself.CreateOnePrivateEx(1027132, "krudel_lizardman", 0, 0, 126019, -179983, -1781, 0, i0, 0, 0);

}

}
if (reply == 2) {
myself.ShowPage(talker, "nyakuri_q0227_02.htm");

}

}
super;
	}


}