package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_rohmer extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 38) == 1 && gg.OwnItemCount(talker, 7176) >= 1 && gg.GetMemoState(talker, 38) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Dragon Fangs (In Progress)");

}
if (gg.HaveMemo(talker, 38) == 1 && gg.GetMemoState(talker, 38) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Dragon Fangs (In Progress)");

}
if (gg.HaveMemo(talker, 298) == 1 && gg.OwnItemCount(talker, 7182) >= 1 && gg.GetMemoState(talker, 298) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "The Lizardmen's Conspiracy (In Progress)");

}
if (gg.HaveMemo(talker, 298) == 1 && gg.GetMemoState(talker, 298) <= 2 * 10 + 2 && gg.GetMemoState(talker, 298) >= 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "The Lizardmen's Conspiracy (In Progress)");

}
if (gg.HaveMemo(talker, 10276) == 1 && gg.GetMemoState(talker, 10276) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Mutated Kaneus - Gludio (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 38) == 1 && gg.OwnItemCount(talker, 7176) >= 1 && gg.GetMemoState(talker, 38) == 3 * 10 + 1) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 38, 3);
myself.ShowPage(talker, "magister_rohmer_q0038_0301.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 38) == 1 && gg.GetMemoState(talker, 38) == 4 * 10 + 1) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_rohmer_q0038_0403.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 298) == 1 && gg.OwnItemCount(talker, 7182) >= 1 && gg.GetMemoState(talker, 298) == 1 * 10 + 1) {
myself.SetCurrentQuestID(298);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 298, 1);
myself.ShowPage(talker, "magister_rohmer_q0298_0101.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 298) == 1 && gg.GetMemoState(talker, 298) <= 2 * 10 + 2 && gg.GetMemoState(talker, 298) >= 2 * 10 + 1) {
myself.SetCurrentQuestID(298);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 298) == 2 * 10 + 2 && gg.OwnItemCount(talker, 7183) >= 50 && gg.OwnItemCount(talker, 7184) >= 50) {
myself.SetHTMLCookie(talker, 298, 2);
myself.ShowPage(talker, "magister_rohmer_q0298_0203.htm");

} else {
myself.ShowPage(talker, "magister_rohmer_q0298_0204.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10276) == 1 && gg.GetMemoState(talker, 10276) == 1) {
myself.SetCurrentQuestID(10276);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13830) >= 1 && gg.OwnItemCount(talker, 13831) >= 1) {
myself.ShowPage(talker, "magister_rohmer_q10276_02.htm");

} else {
myself.ShowPage(talker, "magister_rohmer_q10276_01.htm");

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
if (ask == 38) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 38) {
i0 = myself.GetHTMLCookie(talker, 38, 4 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 38) == 1) {
if (gg.OwnItemCount(talker, 7176) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7176, 1);
myself.GiveItem1(talker, 7177, 1);
myself.ShowPage(talker, "magister_rohmer_q0038_0401.htm");
myself.SetMemoState(talker, 38, 4 * 10 + 1);
myself.SetFlagJournal(talker, 38, 5);
myself.ShowQuestMark(talker, 38);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "magister_rohmer_q0038_0402.htm");

}

}

}

}
if (ask == 298) {
myself.SetCurrentQuestID(298);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 298) {
i0 = myself.GetHTMLCookie(talker, 298, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 298) == 1) {
if (gg.OwnItemCount(talker, 7182) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7182, 1);
myself.ShowPage(talker, "magister_rohmer_q0298_0201.htm");
myself.SetMemoState(talker, 298, 2 * 10 + 1);
myself.SetFlagJournal(talker, 298, 2);
myself.ShowQuestMark(talker, 298);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "magister_rohmer_q0298_0202.htm");

}

}

}

}
if (ask == 298) {
myself.SetCurrentQuestID(298);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 298) {
i0 = myself.GetHTMLCookie(talker, 298, 3 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 298) == 1) {
if (gg.OwnItemCount(talker, 7183) >= 50 && gg.OwnItemCount(talker, 7184) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7183, gg.OwnItemCount(talker, 7183));
myself.DeleteItem1(talker, 7184, gg.OwnItemCount(talker, 7184));
myself.IncrementParam(talker, 1, 42000);

}
gg.AddLog(2, talker, 298);
gg.AddLog(3, talker, 298);
myself.RemoveMemo(talker, 298);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "magister_rohmer_q0298_0301.htm");

} else {
myself.ShowPage(talker, "magister_rohmer_q0298_0302.htm");

}

}

}

}
if (ask == 10276) {
myself.SetCurrentQuestID(10276);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10276) {
if (reply == 1) {
if (gg.HaveMemo(talker, 10276) == 1 && gg.GetMemoState(talker, 10276) == 1) {
if (gg.OwnItemCount(talker, 13830) >= 1 && gg.OwnItemCount(talker, 13831) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 8500);
myself.DeleteItem1(talker, 13830, gg.OwnItemCount(talker, 13830));
myself.DeleteItem1(talker, 13831, gg.OwnItemCount(talker, 13831));
myself.RemoveMemo(talker, 10276);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 10276);
gg.AddLog(3, talker, 10276);
myself.ShowPage(talker, "magister_rohmer_q10276_03.htm");
myself.SetOneTimeQuestFlag(talker, 10276, 1);

}

}

}

}

}
super;
	}


}