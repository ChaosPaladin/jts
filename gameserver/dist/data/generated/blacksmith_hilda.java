package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blacksmith_hilda extends blacksmith {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 618) == 1 && gg.GetMemoState(talker, 618) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Into the Flames (In Progress)");

}
if (gg.HaveMemo(talker, 618) == 1 && gg.GetMemoState(talker, 618) <= 2 * 10 + 2 && gg.GetMemoState(talker, 618) >= 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Into the Flames (In Progress)");

}
if (gg.HaveMemo(talker, 618) == 1 && gg.GetMemoState(talker, 618) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Into the Flames (In Progress)");

}
if (gg.HaveMemo(talker, 617) == 0 && talker.level >= 74) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Gather the Flames");

}
if (gg.HaveMemo(talker, 617) == 0 && talker.level < 74) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Gather the Flames");

}
if (gg.HaveMemo(talker, 617) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Gather the Flames (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 618) == 1 && gg.GetMemoState(talker, 618) == 1 * 10 + 1) {
myself.SetCurrentQuestID(618);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 618, 1);
myself.ShowPage(talker, "blacksmith_hilda_q0618_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 618) == 1 && gg.GetMemoState(talker, 618) <= 2 * 10 + 2 && gg.GetMemoState(talker, 618) >= 2 * 10 + 1) {
myself.SetCurrentQuestID(618);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 618) == 2 * 10 + 2 && gg.OwnItemCount(talker, 7265) >= 50) {
myself.SetHTMLCookie(talker, 618, 2);
myself.ShowPage(talker, "blacksmith_hilda_q0618_0202.htm");

} else {
myself.ShowPage(talker, "blacksmith_hilda_q0618_0203.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 618) == 1 && gg.GetMemoState(talker, 618) == 3 * 10 + 1) {
myself.SetCurrentQuestID(618);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_hilda_q0618_0303.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 617) == 0 && talker.level >= 74) {
myself.SetCurrentQuestID(617);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "blacksmith_hilda_q0617_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 617);
myself.ShowQuestFHTML(talker, fhtml0, 617);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 617) == 0 && talker.level < 74) {
myself.SetCurrentQuestID(617);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "blacksmith_hilda_q0617_02.htm", 617);

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 617) == 1) {
myself.SetCurrentQuestID(617);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_hilda_q0617_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 617) {
myself.SetCurrentQuestID(617);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "blacksmith_hilda_q0617_03.htm", 617);
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 618) {
myself.SetCurrentQuestID(618);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 618) {
i0 = myself.GetHTMLCookie(talker, 618, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 618) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_hilda_q0618_0201.htm");
myself.SetMemoState(talker, 618, 2 * 10 + 1);
myself.SetFlagJournal(talker, 618, 2);
myself.ShowQuestMark(talker, 618);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 618) {
myself.SetCurrentQuestID(618);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 618) {
i0 = myself.GetHTMLCookie(talker, 618, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 618) == 1) {
if (gg.OwnItemCount(talker, 7265) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7265, 50);
myself.GiveItem1(talker, 7266, 1);
myself.ShowPage(talker, "blacksmith_hilda_q0618_0301.htm");
myself.SetMemoState(talker, 618, 3 * 10 + 1);
myself.SetFlagJournal(talker, 618, 4);
myself.ShowQuestMark(talker, 618);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "blacksmith_hilda_q0618_0302.htm");

}

}

}

}
super;
	}


}