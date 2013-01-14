package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class iris extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 327)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Recover the Farmland (In Progress)");

}
if (gg.HaveMemo(talker, 38) == 1 && gg.OwnItemCount(talker, 7174) >= 1 && gg.GetMemoState(talker, 38) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Dragon Fangs (In Progress)");

}
if (gg.HaveMemo(talker, 38) == 1 && gg.GetMemoState(talker, 38) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Dragon Fangs (In Progress)");

}
if (gg.HaveMemo(talker, 38) == 1 && gg.OwnItemCount(talker, 7177) >= 1 && gg.GetMemoState(talker, 38) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Dragon Fangs (In Progress)");

}
if (gg.HaveMemo(talker, 38) == 1 && gg.GetMemoState(talker, 38) <= 5 * 10 + 2 && gg.GetMemoState(talker, 38) >= 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Dragon Fangs (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 327)) {
myself.SetCurrentQuestID(327);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iris_q0327_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 38) == 1 && gg.OwnItemCount(talker, 7174) >= 1 && gg.GetMemoState(talker, 38) == 2 * 10 + 1) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 38, 2);
myself.ShowPage(talker, "iris_q0038_0201.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 38) == 1 && gg.GetMemoState(talker, 38) == 3 * 10 + 1) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iris_q0038_0303.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 38) == 1 && gg.OwnItemCount(talker, 7177) >= 1 && gg.GetMemoState(talker, 38) == 4 * 10 + 1) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 38, 4);
myself.ShowPage(talker, "iris_q0038_0401.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 38) == 1 && gg.GetMemoState(talker, 38) <= 5 * 10 + 2 && gg.GetMemoState(talker, 38) >= 5 * 10 + 1) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 38) == 5 * 10 + 2 && gg.OwnItemCount(talker, 7175) >= 50 && gg.OwnItemCount(talker, 0) >= 0) {
myself.SetHTMLCookie(talker, 38, 5);
myself.ShowPage(talker, "iris_q0038_0503.htm");

} else {
myself.ShowPage(talker, "iris_q0038_0504.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 327) {
myself.SetCurrentQuestID(327);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 327) {
if (reply == 1 && myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.OwnItemCount(talker, 1848);
if (i0 < 1) {
myself.ShowPage(talker, "iris_q0327_02.htm");

} else {
myself.ShowPage(talker, "iris_q0327_03.htm");
myself.DeleteItem1(talker, 1848, i0);
myself.IncrementParam(talker, 0, i0 * 307);
myself.SoundEffect(talker, "ItemSound.quest_itemget");

}

} else if (reply == 2 && myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.OwnItemCount(talker, 1849);
if (i0 < 1) {
myself.ShowPage(talker, "iris_q0327_02.htm");

} else {
myself.ShowPage(talker, "iris_q0327_04.htm");
myself.DeleteItem1(talker, 1849, i0);
myself.IncrementParam(talker, 0, i0 * 368);
myself.SoundEffect(talker, "ItemSound.quest_itemget");

}

} else if (reply == 3 && myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.OwnItemCount(talker, 1850);
if (i0 < 1) {
myself.ShowPage(talker, "iris_q0327_02.htm");

} else {
myself.ShowPage(talker, "iris_q0327_05.htm");
myself.DeleteItem1(talker, 1850, i0);
myself.IncrementParam(talker, 0, i0 * 368);
myself.SoundEffect(talker, "ItemSound.quest_itemget");

}

} else if (reply == 4 && myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.OwnItemCount(talker, 1851);
if (i0 < 1) {
myself.ShowPage(talker, "iris_q0327_02.htm");

} else {
myself.ShowPage(talker, "iris_q0327_06.htm");
myself.DeleteItem1(talker, 1851, i0);
myself.IncrementParam(talker, 0, i0 * 430);
myself.SoundEffect(talker, "ItemSound.quest_itemget");

}

} else if (reply == 6 && myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i1 = 0;
if (gg.OwnItemCount(talker, 1852)) {
i0 = gg.OwnItemCount(talker, 1852);
if (i0 > 0) {
myself.DeleteItem1(talker, 1852, i0);
myself.IncrementParam(talker, 0, i0 * 2766);
myself.SoundEffect(talker, "ItemSound.quest_itemget");

}
i1 = 1;

}
if (gg.OwnItemCount(talker, 1853)) {
i0 = gg.OwnItemCount(talker, 1853);
if (i0 > 0) {
myself.DeleteItem1(talker, 1853, i0);
myself.IncrementParam(talker, 0, i0 * 3227);
myself.SoundEffect(talker, "ItemSound.quest_itemget");

}
i1 = 1;

}
if (gg.OwnItemCount(talker, 1854)) {
i0 = gg.OwnItemCount(talker, 1854);
if (i0 > 0) {
myself.DeleteItem1(talker, 1854, i0);
myself.IncrementParam(talker, 0, i0 * 3227);
myself.SoundEffect(talker, "ItemSound.quest_itemget");

}
i1 = 1;

}
if (gg.OwnItemCount(talker, 1855)) {
i0 = gg.OwnItemCount(talker, 1855);
if (i0 > 0) {
myself.DeleteItem1(talker, 1855, i0);
myself.IncrementParam(talker, 0, i0 * 3919);
myself.SoundEffect(talker, "ItemSound.quest_itemget");

}
i1 = 1;

}
if (i1) {
myself.ShowPage(talker, "iris_q0327_07.htm");

} else {
myself.ShowPage(talker, "iris_q0327_02.htm");

}

} else {
myself.ShowPage(talker, "iris_q0327_01.htm");

}

}
if (ask == 38) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 38) {
i0 = myself.GetHTMLCookie(talker, 38, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 38) == 1) {
if (gg.OwnItemCount(talker, 7174) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7174, 1);
myself.GiveItem1(talker, 7176, 1);
myself.ShowPage(talker, "iris_q0038_0301.htm");
myself.SetMemoState(talker, 38, 3 * 10 + 1);
myself.SetFlagJournal(talker, 38, 4);
myself.ShowQuestMark(talker, 38);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "iris_q0038_0302.htm");

}

}

}

}
if (ask == 38) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 38) {
i0 = myself.GetHTMLCookie(talker, 38, 5 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 38) == 1) {
if (gg.OwnItemCount(talker, 7177) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7177, 1);
myself.ShowPage(talker, "iris_q0038_0501.htm");
myself.SetMemoState(talker, 38, 5 * 10 + 1);
myself.SetFlagJournal(talker, 38, 6);
myself.ShowQuestMark(talker, 38);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "iris_q0038_0502.htm");

}

}

}

}
if (ask == 38) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 38 && myself.GetOneTimeQuestFlag(talker, 38) == 0) {
i0 = myself.GetHTMLCookie(talker, 38, 6 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 38) == 1 && myself.GetOneTimeQuestFlag(talker, 38) == 0) {
if (gg.OwnItemCount(talker, 7175) >= 50) {
i1 = gg.Rand(1000);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7175, gg.OwnItemCount(talker, 7175));
myself.IncrementParam(talker, 0, 435117);
myself.IncrementParam(talker, 1, 23977);
if (i1 < 250) {
myself.GiveItem1(talker, 45, 1);
myself.GiveItem1(talker, 57, 5200);

} else if (i1 < 500) {
myself.GiveItem1(talker, 627, 1);
myself.GiveItem1(talker, 57, 1500);

} else if (i1 < 750) {
myself.GiveItem1(talker, 1123, 1);
myself.GiveItem1(talker, 57, 3200);

} else if (i1 < 1000) {
myself.GiveItem1(talker, 605, 1);
myself.GiveItem1(talker, 57, 3200);

}

}
gg.AddLog(2, talker, 38);
myself.RemoveMemo(talker, 38);
myself.SetOneTimeQuestFlag(talker, 38, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "iris_q0038_0601.htm");

} else {
myself.ShowPage(talker, "iris_q0038_0602.htm");

}

}

}

}
super;
	}


}