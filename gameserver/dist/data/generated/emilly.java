package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class emilly extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3267) >= 1 && gg.OwnItemCount(talker, 3243) == 0 && gg.OwnItemCount(talker, 3264) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3243) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Prosperity (In Progress)");

}
if (talker.level >= 34 && gg.HaveMemo(talker, 299) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Gather Ingredients for Pie");

}
if (talker.level < 34 && gg.HaveMemo(talker, 299) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Gather Ingredients for Pie");

}
if (gg.HaveMemo(talker, 299) == 1 && gg.GetMemoState(talker, 299) >= 1 * 10 + 1 && gg.GetMemoState(talker, 299) <= 1 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Gather Ingredients for Pie (In Progress)");

}
if (gg.HaveMemo(talker, 299) == 1 && gg.GetMemoState(talker, 299) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Gather Ingredients for Pie (In Progress)");

}
if (gg.HaveMemo(talker, 299) == 1 && gg.OwnItemCount(talker, 7137) >= 1 && gg.GetMemoState(talker, 299) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Gather Ingredients for Pie (In Progress)");

}
if (gg.HaveMemo(talker, 299) == 1 && gg.GetMemoState(talker, 299) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Gather Ingredients for Pie (In Progress)");

}
if (gg.HaveMemo(talker, 299) == 1 && gg.OwnItemCount(talker, 7136) >= 1 && gg.GetMemoState(talker, 299) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Gather Ingredients for Pie (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3267) >= 1 && gg.OwnItemCount(talker, 3243) == 0 && gg.OwnItemCount(talker, 3264) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "emilly_q0221_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3243) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "emilly_q0221_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) == 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "emilly_q0221_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || talker.level >= 34 && gg.HaveMemo(talker, 299) == 0) {
myself.SetCurrentQuestID(299);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "emilly_q0299_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 299);
myself.ShowQuestFHTML(talker, fhtml0, 299);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || talker.level < 34 && gg.HaveMemo(talker, 299) == 0) {
myself.SetCurrentQuestID(299);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "emilly_q0299_0103.htm", 299);

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 299) == 1 && gg.GetMemoState(talker, 299) >= 1 * 10 + 1 && gg.GetMemoState(talker, 299) <= 1 * 10 + 2) {
myself.SetCurrentQuestID(299);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 299) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7138) >= 100) {
myself.SetHTMLCookie(talker, 299, 1);
myself.ShowPage(talker, "emilly_q0299_0105.htm");

} else {
myself.ShowPage(talker, "emilly_q0299_0106.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 299) == 1 && gg.GetMemoState(talker, 299) == 2 * 10 + 1) {
myself.SetCurrentQuestID(299);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "emilly_q0299_0203.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 299) == 1 && gg.OwnItemCount(talker, 7137) >= 1 && gg.GetMemoState(talker, 299) == 3 * 10 + 1) {
myself.SetCurrentQuestID(299);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 299, 3);
myself.ShowPage(talker, "emilly_q0299_0301.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 299) == 1 && gg.GetMemoState(talker, 299) == 4 * 10 + 1) {
myself.SetCurrentQuestID(299);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "emilly_q0299_0403.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 299) == 1 && gg.OwnItemCount(talker, 7136) >= 1 && gg.GetMemoState(talker, 299) == 5 * 10 + 1) {
myself.SetCurrentQuestID(299);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 299, 5);
myself.ShowPage(talker, "emilly_q0299_0501.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 299) {
myself.SetCurrentQuestID(299);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 299);
myself.ShowQuestMark(talker, 299);
myself.SetMemoState(talker, 299, 1 * 10 + 1);
gg.AddLog(1, talker, 299);
myself.SetFlagJournal(talker, 299, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "emilly_q0299_0104.htm", 299);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 221) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 221) {
if (reply == 1) {
myself.ShowPage(talker, "emilly_q0221_02.htm");

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 3267) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "emilly_q0221_03.htm");
myself.DeleteItem1(talker, 3267, 1);
myself.GiveItem1(talker, 3243, 1);
if (gg.OwnItemCount(talker, 3241) >= 1 && gg.OwnItemCount(talker, 3242) >= 1 && gg.OwnItemCount(talker, 3244) >= 1) {
myself.SetFlagJournal(talker, 221, 2);
myself.ShowQuestMark(talker, 221);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}

}
if (ask == 299) {
myself.SetCurrentQuestID(299);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 299) {
i0 = myself.GetHTMLCookie(talker, 299, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 299) == 1) {
if (gg.OwnItemCount(talker, 7138) >= 100) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7138, 100);
myself.ShowPage(talker, "emilly_q0299_0201.htm");
myself.SetMemoState(talker, 299, 2 * 10 + 1);
myself.SetFlagJournal(talker, 299, 3);
myself.ShowQuestMark(talker, 299);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "emilly_q0299_0202.htm");

}

}

}

}
if (ask == 299) {
myself.SetCurrentQuestID(299);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 299) {
i0 = myself.GetHTMLCookie(talker, 299, 4 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 299) == 1) {
if (gg.OwnItemCount(talker, 7137) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7137, 1);
myself.ShowPage(talker, "emilly_q0299_0401.htm");
myself.SetMemoState(talker, 299, 4 * 10 + 1);
myself.SetFlagJournal(talker, 299, 5);
myself.ShowQuestMark(talker, 299);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "emilly_q0299_0402.htm");

}

}

}

}
if (ask == 299) {
myself.SetCurrentQuestID(299);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 299) {
i0 = myself.GetHTMLCookie(talker, 299, 6 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 299) == 1) {
if (gg.OwnItemCount(talker, 7136) >= 1) {
i1 = gg.Rand(1000);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7136, gg.OwnItemCount(talker, 7136));
if (i1 < 400) {
myself.GiveItem1(talker, 57, 25000);

} else if (i1 < 400 + 150) {
myself.GiveItem1(talker, 1865, 50);

} else if (i1 < 400 + 150 + 150) {
myself.GiveItem1(talker, 1870, 50);

} else if (i1 < 400 + 150 + 150 + 150) {
myself.GiveItem1(talker, 1869, 50);

} else if (i1 < 400 + 150 + 150 + 150 + 150) {
myself.GiveItem1(talker, 1871, 50);

}

}
gg.AddLog(2, talker, 299);
gg.AddLog(3, talker, 299);
myself.RemoveMemo(talker, 299);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "emilly_q0299_0601.htm");

} else {
myself.ShowPage(talker, "emilly_q0299_0602.htm");

}

}

}

}
super;
	}


}