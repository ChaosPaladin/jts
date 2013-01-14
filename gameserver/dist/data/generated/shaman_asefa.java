package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class shaman_asefa extends shaman_for_friend {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 609) == 1 && gg.GetMemoState(talker, 609) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Magical Power of Water - Part 1 (In Progress)");

}
if (gg.HaveMemo(talker, 609) == 1 && gg.GetMemoState(talker, 609) == 2) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Magical Power of Water - Part 1 (In Progress)");

}
if (gg.HaveMemo(talker, 609) == 1 && gg.GetMemoState(talker, 609) == 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Magical Power of Water - Part 1 (In Progress)");

}
if (gg.HaveMemo(talker, 609) == 1 && gg.GetMemoState(talker, 609) == 4) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Magical Power of Water - Part 1 (In Progress)");

}
if (talker.level >= 75 && gg.HaveMemo(talker, 610) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Magical Power of Water - Part 2");

}
if (talker.level < 75 && gg.HaveMemo(talker, 610) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Magical Power of Water - Part 2");

}
if (gg.HaveMemo(talker, 610) == 1 && gg.GetMemoState(talker, 610) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Magical Power of Water - Part 2 (In Progress)");

}
if (gg.HaveMemo(talker, 610) == 1 && gg.GetMemoState(talker, 610) >= 2 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Magical Power of Water - Part 2 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 609) == 1 && gg.GetMemoState(talker, 609) == 1) {
myself.SetCurrentQuestID(609);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shaman_asefa_q0609_01.htm");
myself.SetMemoState(talker, 609, 2);
myself.SetFlagJournal(talker, 609, 2);
myself.ShowQuestMark(talker, 609);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 609) == 1 && gg.GetMemoState(talker, 609) == 2) {
myself.SetCurrentQuestID(609);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shaman_asefa_q0609_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 609) == 1 && gg.GetMemoState(talker, 609) == 3) {
myself.SetCurrentQuestID(609);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shaman_asefa_q0609_03.htm");
if (myself.Skill_GetConsumeMP(298057729) < myself.sm.mp && myself.Skill_GetConsumeHP(298057729) < myself.sm.hp && myself.Skill_InReuseDelay(298057729) == 0) {
myself.AddUseSkillDesire(talker, 298057729, 1, 0, 1000000);

}
myself.SetMemoState(talker, 609, 2);

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 609) == 1 && gg.GetMemoState(talker, 609) == 4) {
myself.SetCurrentQuestID(609);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shaman_asefa_q0609_04.htm");
myself.GiveItem1(talker, 7238, 1);
myself.GiveItem1(talker, 7081, 1);
myself.DeleteItem1(talker, 7237, gg.OwnItemCount(talker, 7237));
myself.RemoveMemo(talker, 609);
gg.AddLog(2, talker, 609);
gg.AddLog(3, talker, 609);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}
break;

}
case 4: {
if (_from_choice == 0 || talker.level >= 75 && gg.HaveMemo(talker, 610) == 0) {
myself.SetCurrentQuestID(610);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 7238) >= 1) {
myself.FHTML_SetFileName(fhtml0, "shaman_asefa_q0610_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 610);
myself.ShowQuestFHTML(talker, fhtml0, 610);

} else {
myself.ShowPage(talker, "shaman_asefa_q0610_0102.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || talker.level < 75 && gg.HaveMemo(talker, 610) == 0) {
myself.SetCurrentQuestID(610);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "shaman_asefa_q0610_0103.htm", 610);

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 610) == 1 && gg.GetMemoState(talker, 610) == 1 * 10 + 1) {
myself.SetCurrentQuestID(610);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "shaman_asefa_q0610_0105.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 610) == 1 && gg.GetMemoState(talker, 610) >= 2 * 10 + 2) {
myself.SetCurrentQuestID(610);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7239) >= 1) {
myself.SetHTMLCookie(talker, 610, 2);
myself.ShowPage(talker, "shaman_asefa_q0610_0201.htm");

} else {
myself.ShowPage(talker, "shaman_asefa_q0610_0202.htm");

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
if (quest_id == 610) {
myself.SetCurrentQuestID(610);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 610);
myself.ShowQuestMark(talker, 610);
myself.SetMemoState(talker, 610, 1 * 10 + 1);
gg.AddLog(1, talker, 610);
myself.SetFlagJournal(talker, 610, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "shaman_asefa_q0610_0104.htm", 610);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 610) {
myself.SetCurrentQuestID(610);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 610) {
i0 = myself.GetHTMLCookie(talker, 610, 3 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 610) == 1) {
if (gg.OwnItemCount(talker, 7239) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7239, gg.OwnItemCount(talker, 7239));
myself.IncrementParam(talker, 0, 10000);

}
gg.AddLog(2, talker, 610);
gg.AddLog(3, talker, 610);
myself.RemoveMemo(talker, 610);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "shaman_asefa_q0610_0301.htm");

} else {
myself.ShowPage(talker, "shaman_asefa_q0610_0302.htm");

}

}

}

}
super;
	}


}