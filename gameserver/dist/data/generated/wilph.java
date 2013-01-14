package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wilph extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 157) == 0 && myself.GetOneTimeQuestFlag(talker, 157) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Recover Smuggled Goods");

}
if (gg.HaveMemo(talker, 157) == 0 && myself.GetOneTimeQuestFlag(talker, 157) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Recover Smuggled Goods (Done)");

}
if (gg.HaveMemo(talker, 157) != 0 && gg.OwnItemCount(talker, 1024) < 20) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Recover Smuggled Goods (In Progress)");

}
if (gg.HaveMemo(talker, 157) != 0 && gg.OwnItemCount(talker, 1024) >= 20 && myself.GetOneTimeQuestFlag(talker, 157) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Recover Smuggled Goods (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) == 1 && gg.OwnItemCount(talker, 3244) == 0 && gg.OwnItemCount(talker, 3428) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3244) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3428) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3244) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Prosperity (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 157) == 0 && myself.GetOneTimeQuestFlag(talker, 157) == 0) {
myself.SetCurrentQuestID(157);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 5) {
myself.ShowQuestPage(talker, "wilph_q0308_03.htm", 157);

} else {
myself.ShowQuestPage(talker, "wilph_q0308_02.htm", 157);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 157) == 0 && myself.GetOneTimeQuestFlag(talker, 157) == 1) {
myself.SetCurrentQuestID(157);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "finishedquest.htm", 157);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 157) != 0 && gg.OwnItemCount(talker, 1024) < 20) {
myself.SetCurrentQuestID(157);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wilph_q0308_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 157) != 0 && gg.OwnItemCount(talker, 1024) >= 20 && myself.GetOneTimeQuestFlag(talker, 157) == 0) {
myself.SetCurrentQuestID(157);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1024, gg.OwnItemCount(talker, 1024));
myself.RemoveMemo(talker, 157);
gg.AddLog(2, talker, 157);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 157, 1);
myself.GiveItem1(talker, 20, 1);
myself.ShowPage(talker, "wilph_q0308_07.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) == 1 && gg.OwnItemCount(talker, 3244) == 0 && gg.OwnItemCount(talker, 3428) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wilph_q0221_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3244) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3428) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wilph_q0221_05.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3244) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wilph_q0221_06.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) == 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "wilph_q0221_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 157) {
myself.SetCurrentQuestID(157);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 157);
gg.AddLog(1, talker, 157);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "wilph_q0308_05.htm", 157);
myself.SetFlagJournal(talker, 157, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 157) {
myself.SetCurrentQuestID(157);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 157) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "wilph_q0308_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 157);
myself.ShowQuestFHTML(talker, fhtml0, 157);

}

}
if (ask == 221) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 221) {
if (reply == 1) {
myself.ShowPage(talker, "wilph_q0221_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "wilph_q0221_03.htm");

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "wilph_q0221_04.htm");
myself.GiveItem1(talker, 3428, 1);

}

}

}
super;
	}


}