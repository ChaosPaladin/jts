package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blessed_altar3 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 17) == 1 && gg.GetMemoState(talker, 17) == 3 && myself.GetOneTimeQuestFlag(talker, 17) == 0 && gg.OwnItemCount(talker, 7168) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Light and Darkness (In Progress)");

}
if (gg.HaveMemo(talker, 17) == 1 && gg.GetMemoState(talker, 17) == 3 && myself.GetOneTimeQuestFlag(talker, 17) == 0 && gg.OwnItemCount(talker, 7168) < 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Light and Darkness (In Progress)");

}
if (gg.HaveMemo(talker, 17) == 1 && gg.GetMemoState(talker, 17) == 4 && myself.GetOneTimeQuestFlag(talker, 17) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Light and Darkness (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 17) == 1 && gg.GetMemoState(talker, 17) == 3 && myself.GetOneTimeQuestFlag(talker, 17) == 0 && gg.OwnItemCount(talker, 7168) >= 1) {
myself.SetCurrentQuestID(17);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blessed_altar3_q0017_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 17) == 1 && gg.GetMemoState(talker, 17) == 3 && myself.GetOneTimeQuestFlag(talker, 17) == 0 && gg.OwnItemCount(talker, 7168) < 1) {
myself.SetCurrentQuestID(17);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blessed_altar3_q0017_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 17) == 1 && gg.GetMemoState(talker, 17) == 4 && myself.GetOneTimeQuestFlag(talker, 17) == 0) {
myself.SetCurrentQuestID(17);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blessed_altar3_q0017_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 17) {
myself.SetCurrentQuestID(17);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 17) {
if (reply == 1 && gg.HaveMemo(talker, 17) == 1 && gg.GetMemoState(talker, 17) == 3 && myself.GetOneTimeQuestFlag(talker, 17) == 0) {
if (gg.OwnItemCount(talker, 7168) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7168, 1);
myself.SetFlagJournal(talker, 17, 4);
myself.ShowQuestMark(talker, 17);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 17, 4);
myself.AddUseSkillDesire(myself.sm, 298188801, 0, 0, 1000000);
myself.ShowPage(talker, "blessed_altar3_q0017_02.htm");

}

} else {
myself.ShowPage(talker, "blessed_altar3_q0017_03.htm");

}

}

}
super;
	}


}