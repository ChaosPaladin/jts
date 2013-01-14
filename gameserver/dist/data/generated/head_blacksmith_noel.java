package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class head_blacksmith_noel extends master_lv3_black {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 16 * 10 + 1 && talker.subjob_id != 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 16 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && myself.GetOneTimeQuestFlag(talker, 241) == 0 && gg.GetMemoState(talker, 241) == 17 * 10 + 1 && talker.subjob_id != 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && myself.GetOneTimeQuestFlag(talker, 241) == 0 && gg.GetMemoState(talker, 241) == 17 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 18 * 10 + 1 && talker.subjob_id != 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 18 * 10 + 1 && talker.subjob_id == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 2) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Soul Hound (In Progress)");

}
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 3) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Soul Hound (In Progress)");

}
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 4) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Soul Hound (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 16 * 10 + 1 && talker.subjob_id != 0) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 241, 16);
myself.ShowPage(talker, "head_blacksmith_noel_q0241_1601.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 16 * 10 + 1) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quest_not_subclass001.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && myself.GetOneTimeQuestFlag(talker, 241) == 0 && gg.GetMemoState(talker, 241) == 17 * 10 + 1 && talker.subjob_id != 0) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 6029) >= 5 && gg.OwnItemCount(talker, 6033) >= 1) {
myself.SetHTMLCookie(talker, 241, 17);
myself.ShowPage(talker, "head_blacksmith_noel_q0241_1702.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_noel_q0241_1703.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && myself.GetOneTimeQuestFlag(talker, 241) == 0 && gg.GetMemoState(talker, 241) == 17 * 10 + 1) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quest_not_subclass001.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 18 * 10 + 1 && talker.subjob_id != 0) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_noel_q0241_1803.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 18 * 10 + 1 && talker.subjob_id == 0) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quest_not_subclass001.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 2) {
myself.SetCurrentQuestID(68);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_noel_q0068_0111.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 3) {
myself.SetCurrentQuestID(68);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "head_blacksmith_noel_q0068_0113.htm");

} else {
myself.ShowPage(talker, "head_blacksmith_noel_q0068_0112.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 4) {
myself.SetCurrentQuestID(68);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_noel_q0068_0114.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 241) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 241) {
i0 = myself.GetHTMLCookie(talker, 241, 17 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 241) == 1 && myself.GetOneTimeQuestFlag(talker, 241) == 0 && talker.subjob_id != 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "head_blacksmith_noel_q0241_1701.htm");
myself.SetMemoState(talker, 241, 17 * 10 + 1);
myself.SetFlagJournal(talker, 241, 20);
myself.ShowQuestMark(talker, 241);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 241) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 241) {
i0 = myself.GetHTMLCookie(talker, 241, 18 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 241) == 1 && talker.subjob_id != 0) {
if (gg.OwnItemCount(talker, 6029) >= 5 && gg.OwnItemCount(talker, 6033) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6029, 5);
myself.DeleteItem1(talker, 6033, 1);
myself.ShowPage(talker, "head_blacksmith_noel_q0241_1801.htm");
myself.SetMemoState(talker, 241, 18 * 10 + 1);
myself.SetFlagJournal(talker, 241, 21);
myself.ShowQuestMark(talker, 241);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "head_blacksmith_noel_q0241_1802.htm");

}

}

}

}
if (ask == 68) {
myself.SetCurrentQuestID(68);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 68) {
if (reply == 3) {
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 2) {
myself.SetMemoState(talker, 68, 3);
myself.ShowPage(talker, "head_blacksmith_noel_q0068_0115.htm");
myself.SetFlagJournal(talker, 68, 3);
myself.ShowQuestMark(talker, 68);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 9802, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 68, 4);
myself.ShowPage(talker, "head_blacksmith_noel_q0068_0116.htm");
myself.SetFlagJournal(talker, 68, 4);
myself.ShowQuestMark(talker, 68);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}