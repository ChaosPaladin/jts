package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class broken_desk4 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) % 100 == 7) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) % 100 >= 9) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Hiding Behind the Truth (In Progress)");

}
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 8) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Hiding Behind the Truth (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) % 100 == 7) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "broken_desk4_q0025_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) % 100 >= 9) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "broken_desk4_q0025_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 8) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "broken_desk4_q0025_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam reply, HandlerParam talker) {
if (ask == 25) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 25) {
if (reply == 8) {
i0 = gg.GetMemoState(talker, 25);
if (i0 >= 10000) {
myself.ShowPage(talker, "broken_desk4_q0025_03.htm");

} else if (gg.Rand(60) > gg.GetMemoStateEx(talker, 25, 1)) {
myself.SetMemoStateEx(talker, 25, 1, gg.GetMemoStateEx(talker, 25, 1) + 20);
myself.SetMemoState(talker, 25, gg.GetMemoState(talker, 25) + 10000);
myself.ShowPage(talker, "broken_desk4_q0025_04.htm");

} else {
myself.SetMemoState(talker, 25, 8);
myself.ShowPage(talker, "broken_desk4_q0025_05.htm");
myself.SoundEffect(talker, "AmdSound.dd_horror_02");

}

}
if (reply == 9) {
if (gg.GetMemoState(talker, 25) == 8 && gg.OwnItemCount(talker, 7158) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.CreateOnePrivateEx(1027218, "triyol_zzolda", 0, 0, 59712, -47568, -2720, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);
myself.ShowPage(talker, "broken_desk4_q0025_07.htm");
myself.SetFlagJournal(talker, 25, 7);
myself.ShowQuestMark(talker, 25);

} else if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "broken_desk4_q0025_08.htm");

} else {
myself.ShowPage(talker, "broken_desk4_q0025_09.htm");

}

}
if (gg.GetMemoState(talker, 25) == 8 && gg.OwnItemCount(talker, 7158) >= 1) {
myself.ShowPage(talker, "broken_desk4_q0025_10.htm");

}

}
if (reply == 10) {
if (gg.GetMemoState(talker, 25) == 8 && gg.OwnItemCount(talker, 7158) >= 1 && gg.OwnItemCount(talker, 7157) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7066, 1);
myself.DeleteItem1(talker, 7157, gg.OwnItemCount(talker, 7157));
myself.SetMemoState(talker, 25, 9);
myself.ShowPage(talker, "broken_desk4_q0025_11.htm");
myself.SetFlagJournal(talker, 25, 9);
myself.ShowQuestMark(talker, 25);

}

}

}

}
super;
	}


}