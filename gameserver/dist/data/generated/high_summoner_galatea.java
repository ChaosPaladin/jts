package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class high_summoner_galatea extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 230) == 0 && myself.GetOneTimeQuestFlag(talker, 230) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Summoner");

}
if (gg.HaveMemo(talker, 230) == 0 && myself.GetOneTimeQuestFlag(talker, 230) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Summoner (Done)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3354) == 0 || gg.OwnItemCount(talker, 3357) == 0 || gg.OwnItemCount(talker, 3355) == 0 || gg.OwnItemCount(talker, 3358) == 0 || gg.OwnItemCount(talker, 3356) == 0 || gg.OwnItemCount(talker, 3359) == 0 && gg.OwnItemCount(talker, 3353) < 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3354) == 0 || gg.OwnItemCount(talker, 3357) == 0 || gg.OwnItemCount(talker, 3355) == 0 || gg.OwnItemCount(talker, 3358) == 0 || gg.OwnItemCount(talker, 3356) == 0 || gg.OwnItemCount(talker, 3359) == 0 && gg.OwnItemCount(talker, 3353) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3354) >= 1 && gg.OwnItemCount(talker, 3357) >= 1 && gg.OwnItemCount(talker, 3355) >= 1 && gg.OwnItemCount(talker, 3358) >= 1 && gg.OwnItemCount(talker, 3356) >= 1 && gg.OwnItemCount(talker, 3359) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of the Summoner (In Progress)");

}
if (talker.level >= 26 && gg.HaveMemo(talker, 659) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "I'd Rather Be Collecting Fairy Breath");

}
if (talker.level < 26 && gg.HaveMemo(talker, 659) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "I'd Rather Be Collecting Fairy Breath");

}
if (gg.HaveMemo(talker, 659) == 1 && gg.GetMemoState(talker, 659) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "I'd Rather Be Collecting Fairy Breath (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 0 && myself.GetOneTimeQuestFlag(talker, 230) == 0) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.occupation == 11 || talker.occupation == 26 || talker.occupation == 39 && talker.level >= 39) {
myself.ShowQuestPage(talker, "high_summoner_galatea_q0230_03.htm", 230);

} else if (talker.occupation == 11 || talker.occupation == 26 || talker.occupation == 39) {
myself.ShowPage(talker, "high_summoner_galatea_q0230_02.htm");

} else {
myself.ShowPage(talker, "high_summoner_galatea_q0230_01.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 0 && myself.GetOneTimeQuestFlag(talker, 230) == 1) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352)) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "high_summoner_galatea_q0230_09.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3354) == 0 || gg.OwnItemCount(talker, 3357) == 0 || gg.OwnItemCount(talker, 3355) == 0 || gg.OwnItemCount(talker, 3358) == 0 || gg.OwnItemCount(talker, 3356) == 0 || gg.OwnItemCount(talker, 3359) == 0 && gg.OwnItemCount(talker, 3353) < 1) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "high_summoner_galatea_q0230_10.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3354) == 0 || gg.OwnItemCount(talker, 3357) == 0 || gg.OwnItemCount(talker, 3355) == 0 || gg.OwnItemCount(talker, 3358) == 0 || gg.OwnItemCount(talker, 3356) == 0 || gg.OwnItemCount(talker, 3359) == 0 && gg.OwnItemCount(talker, 3353) >= 1) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "high_summoner_galatea_q0230_11.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3352) == 0 && gg.OwnItemCount(talker, 3354) >= 1 && gg.OwnItemCount(talker, 3357) >= 1 && gg.OwnItemCount(talker, 3355) >= 1 && gg.OwnItemCount(talker, 3358) >= 1 && gg.OwnItemCount(talker, 3356) >= 1 && gg.OwnItemCount(talker, 3359) >= 1) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 1664494);
myself.IncrementParam(talker, 1, 114220);
myself.GiveItem1(talker, 57, 300960);
myself.ShowPage(talker, "high_summoner_galatea_q0230_12.htm");
myself.RemoveMemo(talker, 230);
gg.AddLog(2, talker, 230);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 230, 1);
myself.GiveItem1(talker, 3336, 1);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.DeleteItem1(talker, 3347, gg.OwnItemCount(talker, 3347));
myself.DeleteItem1(talker, 3348, gg.OwnItemCount(talker, 3348));
myself.DeleteItem1(talker, 3349, gg.OwnItemCount(talker, 3349));
myself.DeleteItem1(talker, 3350, gg.OwnItemCount(talker, 3350));
myself.DeleteItem1(talker, 3351, gg.OwnItemCount(talker, 3351));
myself.DeleteItem1(talker, 3354, gg.OwnItemCount(talker, 3354));
myself.DeleteItem1(talker, 3357, gg.OwnItemCount(talker, 3357));
myself.DeleteItem1(talker, 3355, gg.OwnItemCount(talker, 3355));
myself.DeleteItem1(talker, 3358, gg.OwnItemCount(talker, 3358));
myself.DeleteItem1(talker, 3356, gg.OwnItemCount(talker, 3356));
myself.DeleteItem1(talker, 3359, gg.OwnItemCount(talker, 3359));
if (myself.GetOneTimeQuestFlag(talker, 56) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 64);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 92);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 82);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 23);

}
myself.SetOneTimeQuestFlag(talker, 56, 1);

}

}

}
break;

}
case 6: {
if (_from_choice == 0 || talker.level >= 26 && gg.HaveMemo(talker, 659) == 0) {
myself.SetCurrentQuestID(659);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "high_summoner_galatea_q0659_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 659);
myself.ShowQuestFHTML(talker, fhtml0, 659);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || talker.level < 26 && gg.HaveMemo(talker, 659) == 0) {
myself.SetCurrentQuestID(659);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "high_summoner_galatea_q0659_0102.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 659) == 1 && gg.GetMemoState(talker, 659) == 1 * 10 + 1) {
myself.SetCurrentQuestID(659);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 8286) == 0) {
myself.ShowPage(talker, "high_summoner_galatea_q0659_0106.htm");

} else {
myself.SetHTMLCookie(talker, 659, 1);
myself.ShowPage(talker, "high_summoner_galatea_q0659_0105.htm");

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
if (quest_id == 230) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 230) == 0 && myself.GetOneTimeQuestFlag(talker, 230) == 0 && myself.GetMemoCount(talker) < 41 && talker.occupation == 11 || talker.occupation == 26 || talker.occupation == 39 && talker.level >= 39) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 230);
myself.GiveItem1(talker, 3352, 1);
myself.SetFlagJournal(talker, 230, 1);
myself.ShowQuestMark(talker, 230);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (myself.GetOneTimeQuestFlag(talker, 56) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 64);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 92);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 82);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 23);

}
myself.SetOneTimeQuestFlag(talker, 56, 1);
myself.ShowQuestPage(talker, "high_summoner_galatea_q0230_08a.htm", 230);

} else {
myself.ShowQuestPage(talker, "high_summoner_galatea_q0230_08.htm", 230);

}

}

}
return;

}
if (quest_id == 659) {
myself.SetCurrentQuestID(659);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && talker.level >= 26) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 659);
myself.SetMemoState(talker, 659, 1 * 10 + 1);
gg.AddLog(1, talker, 659);
myself.SetFlagJournal(talker, 659, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "high_summoner_galatea_q0659_0103.htm", 659);
myself.ShowQuestMark(talker, 659);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 230) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 230) {
if (reply == 1) {
myself.ShowQuestPage(talker, "high_summoner_galatea_q0230_04.htm", 230);

} else if (reply == 2) {
myself.ShowQuestPage(talker, "high_summoner_galatea_q0230_05.htm", 230);

} else if (reply == 3) {
myself.ShowQuestPage(talker, "high_summoner_galatea_q0230_06.htm", 230);

} else if (reply == 4) {
myself.FHTML_SetFileName(fhtml0, "high_summoner_galatea_q0230_07.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 230);
myself.ShowQuestFHTML(talker, fhtml0, 230);

}

}
if (ask == 659) {
myself.SetCurrentQuestID(659);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 659) {
i0 = myself.GetHTMLCookie(talker, 659, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 659) == 1) {
myself.ShowPage(talker, "high_summoner_galatea_q0659_0201.htm");

}
if (reply == 3 && gg.HaveMemo(talker, 659) == 1) {
if (gg.OwnItemCount(talker, 8286) == 0) {
myself.ShowPage(talker, "high_summoner_galatea_q0659_0202.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 8286, gg.OwnItemCount(talker, 8286));
if (gg.OwnItemCount(talker, 8286) >= 10) {
myself.GiveItem1(talker, 57, 5365 + 50 * gg.OwnItemCount(talker, 8286));

} else {
myself.GiveItem1(talker, 57, 50 * gg.OwnItemCount(talker, 8286));

}
gg.AddLog(3, talker, 659);
myself.ShowPage(talker, "high_summoner_galatea_q0659_0203.htm");

}

}
if (reply == 4 && gg.HaveMemo(talker, 659) == 1) {
myself.ShowPage(talker, "high_summoner_galatea_q0659_0204.htm");
myself.RemoveMemo(talker, 659);
gg.AddLog(2, talker, 659);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}

}
super;
	}


}