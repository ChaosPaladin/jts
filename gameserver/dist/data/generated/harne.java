package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class harne extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 969) >= 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Spirit of Craftsman (In Progress)");

}
if (gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 970) >= 1 && gg.OwnItemCount(talker, 1107) < 10 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Spirit of Craftsman (In Progress)");

}
if (gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 970) == 1 && gg.OwnItemCount(talker, 1107) >= 10 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Spirit of Craftsman (In Progress)");

}
if (gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 971) == 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Spirit of Craftsman (In Progress)");

}
if (gg.HaveMemo(talker, 8) == 1 && gg.OwnItemCount(talker, 7573) >= 1 && myself.GetOneTimeQuestFlag(talker, 8) == 0 && gg.GetMemoState(talker, 8) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "An Adventure Begins (In Progress)");

}
if (gg.HaveMemo(talker, 8) == 1 && gg.GetMemoState(talker, 8) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "An Adventure Begins (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4288) > 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) < 8 && gg.GetMemoStateEx(talker, 348, 1) % 100 / 10 == 1 && gg.OwnItemCount(talker, 4291) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4291) > 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4398) > 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "An Arrogant Search (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 969) >= 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
myself.SetCurrentQuestID(103);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "harne_q0103_01.htm");
myself.DeleteItem1(talker, 969, 1);
myself.GiveItem1(talker, 970, 1);
myself.SetFlagJournal(talker, 103, 3);
myself.ShowQuestMark(talker, 103);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 970) >= 1 && gg.OwnItemCount(talker, 1107) < 10 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
myself.SetCurrentQuestID(103);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "harne_q0103_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 970) == 1 && gg.OwnItemCount(talker, 1107) >= 10 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
myself.SetCurrentQuestID(103);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "harne_q0103_03.htm");
myself.DeleteItem1(talker, 970, 1);
myself.DeleteItem1(talker, 1107, 10);
myself.GiveItem1(talker, 971, 1);
myself.SetFlagJournal(talker, 103, 5);
myself.ShowQuestMark(talker, 103);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 971) == 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
myself.SetCurrentQuestID(103);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "harne_q0103_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 8) == 1 && gg.OwnItemCount(talker, 7573) >= 1 && myself.GetOneTimeQuestFlag(talker, 8) == 0 && gg.GetMemoState(talker, 8) == 2 * 10 + 1) {
myself.SetCurrentQuestID(8);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 8, 2);
myself.ShowPage(talker, "harne_q0008_0201.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 8) == 1 && gg.GetMemoState(talker, 8) == 3 * 10 + 1) {
myself.SetCurrentQuestID(8);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "harne_q0008_0303.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4288) > 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.GetMemoStateEx(talker, 348, 1);
i0 = i0 + 10;
if (gg.GetMemoStateEx(talker, 348, 1) % 10 == 0) {
myself.ShowRadar(talker, 2908, 44128, -2712, 1);

} else {
myself.SetFlagJournal(talker, 348, 17);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
myself.SetMemoStateEx(talker, 348, 1, i0);
myself.DeleteItem1(talker, 4288, 1);
myself.ShowPage(talker, "harne_q0348_01.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) < 8 && gg.GetMemoStateEx(talker, 348, 1) % 100 / 10 == 1 && gg.OwnItemCount(talker, 4291) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoStateEx(talker, 348, 1) % 10 == 0) {
myself.ShowRadar(talker, 2908, 44128, -2712, 1);

}
myself.ShowPage(talker, "harne_q0348_03.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4291) > 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoStateEx(talker, 348, 1) % 10 == 0) {
myself.ShowRadar(talker, 2908, 44128, -2712, 1);

}
myself.ShowPage(talker, "harne_q0348_04.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4398) > 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "harne_q0348_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 8) {
myself.SetCurrentQuestID(8);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 8) {
i0 = myself.GetHTMLCookie(talker, 8, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 8) == 1) {
if (gg.OwnItemCount(talker, 7573) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7573, 1);
myself.ShowPage(talker, "harne_q0008_0301.htm");
myself.SetMemoState(talker, 8, 3 * 10 + 1);
myself.SetFlagJournal(talker, 8, 3);
myself.ShowQuestMark(talker, 8);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "harne_q0008_0302.htm");

}

}

}

}
if (ask == 348) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 348) {
if (reply == 1) {
myself.ShowPage(talker, "harne_q0348_02.htm");

}

}
super;
	}


}