package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class elder_ashas_barka_durai extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 74 && gg.HaveMemo(talker, 612) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Battle against Ketra Orcs");

}
if (talker.level < 74 && gg.HaveMemo(talker, 612) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Battle against Ketra Orcs");

}
if (gg.HaveMemo(talker, 612) == 1 && gg.GetMemoState(talker, 612) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Battle against Ketra Orcs (In Progress)");

}
if (talker.level >= 75 && gg.HaveMemo(talker, 613) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Prove Your Courage! (Varka)");

}
if (talker.level < 75 && gg.HaveMemo(talker, 613) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Prove Your Courage! (Varka)");

}
if (gg.HaveMemo(talker, 613) == 1 && gg.GetMemoState(talker, 613) >= 1 * 10 + 1 && gg.GetMemoState(talker, 613) <= 1 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Prove Your Courage! (Varka) (In Progress)");

}
if (talker.level >= 75 && gg.HaveMemo(talker, 614) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Slay the Enemy Commander! (Varka)");

}
if (talker.level < 75 && gg.HaveMemo(talker, 614) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Slay the Enemy Commander! (Varka)");

}
if (gg.HaveMemo(talker, 614) == 1 && gg.GetMemoState(talker, 614) >= 1 * 10 + 1 && gg.GetMemoState(talker, 614) <= 1 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Slay the Enemy Commander! (Varka) (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 74 && gg.HaveMemo(talker, 612) == 0) {
myself.SetCurrentQuestID(612);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "elder_ashas_barka_durai_q0612_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 612);
myself.ShowQuestFHTML(talker, fhtml0, 612);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 74 && gg.HaveMemo(talker, 612) == 0) {
myself.SetCurrentQuestID(612);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "elder_ashas_barka_durai_q0612_0103.htm", 612);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 612) == 1 && gg.GetMemoState(talker, 612) == 1 * 10 + 1) {
myself.SetCurrentQuestID(612);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7234) == 0) {
myself.ShowPage(talker, "elder_ashas_barka_durai_q0612_0106.htm");

} else {
myself.SetHTMLCookie(talker, 612, 1);
myself.ShowPage(talker, "elder_ashas_barka_durai_q0612_0105.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || talker.level >= 75 && gg.HaveMemo(talker, 613) == 0) {
myself.SetCurrentQuestID(613);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 7223) >= 1) {
myself.FHTML_SetFileName(fhtml0, "elder_ashas_barka_durai_q0613_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 613);
myself.ShowQuestFHTML(talker, fhtml0, 613);

} else {
myself.ShowQuestPage(talker, "elder_ashas_barka_durai_q0613_0102.htm", 613);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || talker.level < 75 && gg.HaveMemo(talker, 613) == 0) {
myself.SetCurrentQuestID(613);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "elder_ashas_barka_durai_q0613_0103.htm", 613);

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 613) == 1 && gg.GetMemoState(talker, 613) >= 1 * 10 + 1 && gg.GetMemoState(talker, 613) <= 1 * 10 + 2) {
myself.SetCurrentQuestID(613);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 613) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7240) >= 1) {
myself.SetHTMLCookie(talker, 613, 1);
myself.ShowPage(talker, "elder_ashas_barka_durai_q0613_0105.htm");

} else {
myself.ShowPage(talker, "elder_ashas_barka_durai_q0613_0106.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || talker.level >= 75 && gg.HaveMemo(talker, 614) == 0) {
myself.SetCurrentQuestID(614);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 7224) >= 1) {
myself.FHTML_SetFileName(fhtml0, "elder_ashas_barka_durai_q0614_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 614);
myself.ShowQuestFHTML(talker, fhtml0, 614);

} else {
myself.ShowQuestPage(talker, "elder_ashas_barka_durai_q0614_0102.htm", 614);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || talker.level < 75 && gg.HaveMemo(talker, 614) == 0) {
myself.SetCurrentQuestID(614);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "elder_ashas_barka_durai_q0614_0103.htm", 614);

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 614) == 1 && gg.GetMemoState(talker, 614) >= 1 * 10 + 1 && gg.GetMemoState(talker, 614) <= 1 * 10 + 2) {
myself.SetCurrentQuestID(614);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 614) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7241) >= 1) {
myself.SetHTMLCookie(talker, 614, 1);
myself.ShowPage(talker, "elder_ashas_barka_durai_q0614_0105.htm");

} else {
myself.ShowPage(talker, "elder_ashas_barka_durai_q0614_0106.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 612) {
myself.SetCurrentQuestID(612);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 612);
myself.ShowQuestMark(talker, 612);
myself.SetMemoState(talker, 612, 1 * 10 + 1);
gg.AddLog(1, talker, 612);
myself.SetFlagJournal(talker, 612, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "elder_ashas_barka_durai_q0612_0104.htm", 612);

}
return;

}
if (quest_id == 613) {
myself.SetCurrentQuestID(613);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 613);
myself.ShowQuestMark(talker, 613);
myself.SetMemoState(talker, 613, 1 * 10 + 1);
gg.AddLog(1, talker, 613);
myself.SetFlagJournal(talker, 613, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "elder_ashas_barka_durai_q0613_0104.htm", 613);

}
return;

}
if (quest_id == 614) {
myself.SetCurrentQuestID(614);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 614);
myself.ShowQuestMark(talker, 614);
myself.SetMemoState(talker, 614, 1 * 10 + 1);
gg.AddLog(1, talker, 614);
myself.SetFlagJournal(talker, 614, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "elder_ashas_barka_durai_q0614_0104.htm", 614);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 612) {
myself.SetCurrentQuestID(612);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 612) {
i0 = myself.GetHTMLCookie(talker, 612, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 612) == 1) {
myself.ShowPage(talker, "elder_ashas_barka_durai_q0612_0201.htm");

}
if (reply == 3 && gg.HaveMemo(talker, 612) == 1) {
if (gg.OwnItemCount(talker, 7234) >= 100) {
i1 = gg.Rand(1000);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7234, 100);
myself.GiveItem1(talker, 7187, 20);

}
gg.AddLog(3, talker, 612);
myself.ShowPage(talker, "elder_ashas_barka_durai_q0612_0202.htm");

} else {
myself.ShowPage(talker, "elder_ashas_barka_durai_q0612_0203.htm");

}

}
if (reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7234, gg.OwnItemCount(talker, 7234));
gg.AddLog(2, talker, 612);
myself.RemoveMemo(talker, 612);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "elder_ashas_barka_durai_q0612_0204.htm");

}

}

}

}
if (ask == 613) {
myself.SetCurrentQuestID(613);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 613) {
i0 = myself.GetHTMLCookie(talker, 613, 2 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 613) == 1) {
if (gg.OwnItemCount(talker, 7240) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7240, gg.OwnItemCount(talker, 7240));
myself.GiveItem1(talker, 7229, 1);
myself.IncrementParam(talker, 0, 10000);

}
gg.AddLog(2, talker, 613);
myself.RemoveMemo(talker, 613);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "elder_ashas_barka_durai_q0613_0201.htm");

} else {
myself.ShowPage(talker, "elder_ashas_barka_durai_q0613_0202.htm");

}

}

}

}
if (ask == 614) {
myself.SetCurrentQuestID(614);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 614) {
i0 = myself.GetHTMLCookie(talker, 614, 2 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 614) == 1) {
if (gg.OwnItemCount(talker, 7241) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7241, gg.OwnItemCount(talker, 7241));
myself.GiveItem1(talker, 7230, 1);
myself.IncrementParam(talker, 0, 10000);

}
gg.AddLog(2, talker, 614);
myself.RemoveMemo(talker, 614);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "elder_ashas_barka_durai_q0614_0201.htm");

} else {
myself.ShowPage(talker, "elder_ashas_barka_durai_q0614_0202.htm");

}

}

}

}
super;
	}


}