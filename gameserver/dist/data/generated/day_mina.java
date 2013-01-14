package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class day_mina extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 65 && gg.HaveMemo(talker, 633) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "In the Forgotten Village");

}
if (talker.level < 65 && gg.HaveMemo(talker, 633) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "In the Forgotten Village");

}
if (gg.HaveMemo(talker, 633) == 1 && gg.GetMemoState(talker, 633) >= 1 * 10 + 1 && gg.GetMemoState(talker, 633) <= 1 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "In the Forgotten Village (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 65 && gg.HaveMemo(talker, 633) == 0) {
myself.SetCurrentQuestID(633);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "day_mina_q0633_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 633);
myself.ShowQuestFHTML(talker, fhtml0, 633);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 65 && gg.HaveMemo(talker, 633) == 0) {
myself.SetCurrentQuestID(633);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "day_mina_q0633_0103.htm", 633);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 633) == 1 && gg.GetMemoState(talker, 633) >= 1 * 10 + 1 && gg.GetMemoState(talker, 633) <= 1 * 10 + 2) {
myself.SetCurrentQuestID(633);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 633, 1);
if (gg.GetMemoState(talker, 633) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7544) >= 200) {
myself.ShowPage(talker, "day_mina_q0633_0105.htm");

} else {
myself.ShowPage(talker, "day_mina_q0633_0106.htm");

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
if (quest_id == 633) {
myself.SetCurrentQuestID(633);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 633);
myself.ShowQuestMark(talker, 633);
myself.SetMemoState(talker, 633, 1 * 10 + 1);
gg.AddLog(1, talker, 633);
myself.SetFlagJournal(talker, 633, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "day_mina_q0633_0104.htm", 633);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 633) {
myself.SetCurrentQuestID(633);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 633) {
i0 = myself.GetHTMLCookie(talker, 633, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 633) == 1) {
myself.ShowPage(talker, "day_mina_q0633_0201.htm");

}
if (reply == 3 && gg.HaveMemo(talker, 633) == 1) {
if (gg.OwnItemCount(talker, 7544) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7544, gg.OwnItemCount(talker, 7544));
myself.GiveItem1(talker, 57, 25000);
myself.IncrementParam(talker, 0, 305235);

}
myself.SetMemoState(talker, 633, 2 - 1 * 10 + 1);
gg.AddLog(3, talker, 633);
myself.ShowPage(talker, "day_mina_q0633_0202.htm");

} else {
myself.ShowPage(talker, "day_mina_q0633_0203.htm");

}

}
if (reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7544, gg.OwnItemCount(talker, 7544));
gg.AddLog(2, talker, 633);
myself.RemoveMemo(talker, 633);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "day_mina_q0633_0204.htm");

}

}

}

}
super;
	}


}