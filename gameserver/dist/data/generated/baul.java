package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class baul extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 1) && myself.GetOneTimeQuestFlag(talker, 1) == 0 && gg.OwnItemCount(talker, 1079) > 0 || gg.OwnItemCount(talker, 1080) > 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Letters of Love (In Progress)");

}
if (gg.HaveMemo(talker, 6) == 1 && myself.GetOneTimeQuestFlag(talker, 6) == 0 && gg.GetMemoState(talker, 6) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Step Into the Future (In Progress)");

}
if (gg.HaveMemo(talker, 6) == 1 && gg.GetMemoState(talker, 6) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Step Into the Future (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 1) && myself.GetOneTimeQuestFlag(talker, 1) == 0 && gg.OwnItemCount(talker, 1079) > 0 || gg.OwnItemCount(talker, 1080) > 0) {
myself.SetCurrentQuestID(1);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1079) > 0) {
myself.ShowPage(talker, "baul_q0001_01.htm");
myself.DeleteItem1(talker, 1079, 1);
myself.GiveItem1(talker, 1080, 1);
myself.SetFlagJournal(talker, 1, 4);
myself.ShowQuestMark(talker, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(talker, 1080) > 0) {
myself.ShowPage(talker, "baul_q0001_02.htm");

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 6) == 1 && myself.GetOneTimeQuestFlag(talker, 6) == 0 && gg.GetMemoState(talker, 6) == 1 * 10 + 1) {
myself.SetCurrentQuestID(6);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 6, 1);
myself.ShowPage(talker, "baul_q0006_0101.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 6) == 1 && gg.GetMemoState(talker, 6) == 2 * 10 + 1) {
myself.SetCurrentQuestID(6);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "baul_q0006_0202.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 6) {
myself.SetCurrentQuestID(6);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 6) {
i0 = myself.GetHTMLCookie(talker, 6, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 6) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7571, 1);
myself.ShowPage(talker, "baul_q0006_0201.htm");
myself.SetMemoState(talker, 6, 2 * 10 + 1);
myself.SetFlagJournal(talker, 6, 2);
myself.ShowQuestMark(talker, 6);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}