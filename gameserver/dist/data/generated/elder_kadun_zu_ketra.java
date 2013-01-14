package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class elder_kadun_zu_ketra extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 74 && gg.HaveMemo(talker, 606) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Battle against Varka Silenos");

}
if (talker.level < 74 && gg.HaveMemo(talker, 606) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Battle against Varka Silenos");

}
if (gg.HaveMemo(talker, 606) == 1 && gg.GetMemoState(talker, 606) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Battle against Varka Silenos (In Progress)");

}
if (talker.level >= 75 && gg.HaveMemo(talker, 607) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Prove Your Courage! (Ketra)");

}
if (talker.level < 75 && gg.HaveMemo(talker, 607) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Prove Your Courage! (Ketra)");

}
if (gg.HaveMemo(talker, 607) == 1 && gg.GetMemoState(talker, 607) >= 1 * 10 + 1 && gg.GetMemoState(talker, 607) <= 1 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Prove Your Courage! (Ketra) (In Progress)");

}
if (talker.level >= 75 && gg.HaveMemo(talker, 608) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Slay the Enemy Commander! (Ketra)");

}
if (talker.level < 75 && gg.HaveMemo(talker, 608) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Slay the Enemy Commander! (Ketra)");

}
if (gg.HaveMemo(talker, 608) == 1 && gg.GetMemoState(talker, 608) >= 1 * 10 + 1 && gg.GetMemoState(talker, 608) <= 1 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Slay the Enemy Commander! (Ketra) (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 74 && gg.HaveMemo(talker, 606) == 0) {
myself.SetCurrentQuestID(606);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "elder_kadun_zu_ketra_q0606_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 606);
myself.ShowQuestFHTML(talker, fhtml0, 606);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 74 && gg.HaveMemo(talker, 606) == 0) {
myself.SetCurrentQuestID(606);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "elder_kadun_zu_ketra_q0606_0103.htm", 606);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 606) == 1 && gg.GetMemoState(talker, 606) == 1 * 10 + 1) {
myself.SetCurrentQuestID(606);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7233) == 0) {
myself.ShowPage(talker, "elder_kadun_zu_ketra_q0606_0106.htm");

} else {
myself.SetHTMLCookie(talker, 606, 1);
myself.ShowPage(talker, "elder_kadun_zu_ketra_q0606_0105.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || talker.level >= 75 && gg.HaveMemo(talker, 607) == 0) {
myself.SetCurrentQuestID(607);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 7213) >= 1) {
myself.FHTML_SetFileName(fhtml0, "elder_kadun_zu_ketra_q0607_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 607);
myself.ShowQuestFHTML(talker, fhtml0, 607);

} else {
myself.ShowQuestPage(talker, "elder_kadun_zu_ketra_q0607_0102.htm", 607);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || talker.level < 75 && gg.HaveMemo(talker, 607) == 0) {
myself.SetCurrentQuestID(607);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "elder_kadun_zu_ketra_q0607_0103.htm", 607);

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 607) == 1 && gg.GetMemoState(talker, 607) >= 1 * 10 + 1 && gg.GetMemoState(talker, 607) <= 1 * 10 + 2) {
myself.SetCurrentQuestID(607);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 607) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7235) >= 1) {
myself.SetHTMLCookie(talker, 607, 1);
myself.ShowPage(talker, "elder_kadun_zu_ketra_q0607_0105.htm");

} else {
myself.ShowPage(talker, "elder_kadun_zu_ketra_q0607_0106.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || talker.level >= 75 && gg.HaveMemo(talker, 608) == 0) {
myself.SetCurrentQuestID(608);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 7214) >= 1) {
myself.FHTML_SetFileName(fhtml0, "elder_kadun_zu_ketra_q0608_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 608);
myself.ShowQuestFHTML(talker, fhtml0, 608);

} else {
myself.ShowQuestPage(talker, "elder_kadun_zu_ketra_q0608_0102.htm", 608);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || talker.level < 75 && gg.HaveMemo(talker, 608) == 0) {
myself.SetCurrentQuestID(608);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "elder_kadun_zu_ketra_q0608_0103.htm", 608);

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 608) == 1 && gg.GetMemoState(talker, 608) >= 1 * 10 + 1 && gg.GetMemoState(talker, 608) <= 1 * 10 + 2) {
myself.SetCurrentQuestID(608);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 608) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7236) >= 1) {
myself.SetHTMLCookie(talker, 608, 1);
myself.ShowPage(talker, "elder_kadun_zu_ketra_q0608_0105.htm");

} else {
myself.ShowPage(talker, "elder_kadun_zu_ketra_q0608_0106.htm");

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
if (quest_id == 606) {
myself.SetCurrentQuestID(606);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 606);
myself.ShowQuestMark(talker, 606);
myself.SetMemoState(talker, 606, 1 * 10 + 1);
gg.AddLog(1, talker, 606);
myself.SetFlagJournal(talker, 606, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "elder_kadun_zu_ketra_q0606_0104.htm", 606);

}
return;

}
if (quest_id == 607) {
myself.SetCurrentQuestID(607);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 607);
myself.ShowQuestMark(talker, 607);
myself.SetMemoState(talker, 607, 1 * 10 + 1);
gg.AddLog(1, talker, 607);
myself.SetFlagJournal(talker, 607, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "elder_kadun_zu_ketra_q0607_0104.htm", 607);

}
return;

}
if (quest_id == 608) {
myself.SetCurrentQuestID(608);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 608);
myself.ShowQuestMark(talker, 608);
myself.SetMemoState(talker, 608, 1 * 10 + 1);
gg.AddLog(1, talker, 608);
myself.SetFlagJournal(talker, 608, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "elder_kadun_zu_ketra_q0608_0104.htm", 608);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 606) {
myself.SetCurrentQuestID(606);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 606) {
i0 = myself.GetHTMLCookie(talker, 606, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 606) == 1) {
myself.ShowPage(talker, "elder_kadun_zu_ketra_q0606_0201.htm");

}
if (reply == 3 && gg.HaveMemo(talker, 606) == 1) {
if (gg.OwnItemCount(talker, 7233) >= 100) {
i1 = gg.Rand(1000);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7233, 100);
if (i1 < 1000 && 1000 != 0) {
myself.GiveItem1(talker, 7186, 20);

}

}
gg.AddLog(3, talker, 606);
myself.ShowPage(talker, "elder_kadun_zu_ketra_q0606_0202.htm");

} else {
myself.ShowPage(talker, "elder_kadun_zu_ketra_q0606_0203.htm");

}

}
if (reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7233, gg.OwnItemCount(talker, 7233));
myself.DeleteItem1(talker, 0, gg.OwnItemCount(talker, 0));
myself.DeleteItem1(talker, 0, gg.OwnItemCount(talker, 0));
gg.AddLog(2, talker, 606);
myself.RemoveMemo(talker, 606);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "elder_kadun_zu_ketra_q0606_0204.htm");

}

}

}

}
if (ask == 607) {
myself.SetCurrentQuestID(607);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 607) {
i0 = myself.GetHTMLCookie(talker, 607, 2 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 607) == 1) {
if (gg.OwnItemCount(talker, 7235) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7235, gg.OwnItemCount(talker, 7235));
myself.GiveItem1(talker, 7219, 1);
myself.IncrementParam(talker, 0, 10000);

}
gg.AddLog(2, talker, 607);
gg.AddLog(3, talker, 607);
myself.RemoveMemo(talker, 607);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "elder_kadun_zu_ketra_q0607_0201.htm");

} else {
myself.ShowPage(talker, "elder_kadun_zu_ketra_q0607_0202.htm");

}

}

}

}
if (ask == 608) {
myself.SetCurrentQuestID(608);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 608) {
i0 = myself.GetHTMLCookie(talker, 608, 2 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 608) == 1) {
if (gg.OwnItemCount(talker, 7236) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7236, gg.OwnItemCount(talker, 7236));
myself.GiveItem1(talker, 7220, 1);
myself.IncrementParam(talker, 0, 10000);

}
gg.AddLog(2, talker, 608);
gg.AddLog(3, talker, 608);
myself.RemoveMemo(talker, 608);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "elder_kadun_zu_ketra_q0608_0201.htm");

} else {
myself.ShowPage(talker, "elder_kadun_zu_ketra_q0608_0202.htm");

}

}

}

}
super;
	}


}