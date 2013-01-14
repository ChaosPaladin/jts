package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class bishop_raimund extends human_elf_mage_lv2_master {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1170) == 0 && gg.OwnItemCount(talker, 1163) == 0 && gg.OwnItemCount(talker, 1271)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1170) > 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1163) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) < 2 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Fallen Angel - Request of Dawn (In Progress)");

}
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 2 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Fallen Angel - Request of Dawn (In Progress)");

}
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 3 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Fallen Angel - Request of Dawn (In Progress)");

}
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) >= 4 && gg.GetMemoState(talker, 142) < 9 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Fallen Angel - Request of Dawn (In Progress)");

}
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) >= 9 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Fallen Angel - Request of Dawn (In Progress)");

}
if (gg.HaveMemo(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 0 && talker.transformID == 113) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Seven Signs, Secret Ritual of the Priests");

}
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 2) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Seven Signs, Secret Ritual of the Priests (In progress)");

}
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 3 && gg.OwnItemCount(talker, 13822) >= 1 && gg.OwnItemCount(talker, 13823) < 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Seven Signs, Secret Ritual of the Priests (In progress)");

}
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 3 && gg.OwnItemCount(talker, 13822) >= 1 && gg.OwnItemCount(talker, 13823) >= 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Seven Signs, Secret Ritual of the Priests (In progress)");

}
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 4) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Seven Signs, Secret Ritual of the Priests (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1170) == 0 && gg.OwnItemCount(talker, 1163) == 0 && gg.OwnItemCount(talker, 1271)) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bishop_raimund_q0402_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1170) > 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1171) < 12) {
myself.ShowPage(talker, "bishop_raimund_q0402_04.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "bishop_raimund_q0402_05.htm");
myself.DeleteItem1(talker, 1171, gg.OwnItemCount(talker, 1171));
myself.DeleteItem1(talker, 1170, 1);
myself.GiveItem1(talker, 1163, 1);

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1163) > 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bishop_raimund_q0402_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) < 2 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bishop_raimund_q0142_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 2 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 10351, gg.OwnItemCount(talker, 10351));
myself.SetMemoState(talker, 142, 3);
myself.ShowPage(talker, "bishop_raimund_q0142_02.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 3 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bishop_raimund_q0142_02a.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) >= 4 && gg.GetMemoState(talker, 142) < 9 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bishop_raimund_q0142_06.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) >= 9 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 10353, gg.OwnItemCount(talker, 10353));
myself.RemoveMemo(talker, 142);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "bishop_raimund_q0142_07.htm");
myself.SetOneTimeQuestFlag(talker, 142, 1);
gg.AddLog(2, talker, 142);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 44) {
myself.GiveItem1(talker, 57, 92676);
myself.IncrementParam(talker, 0, 223036);
myself.IncrementParam(talker, 1, 13901);

} else {
myself.GiveItem1(talker, 57, 92676);

}
gg.AddLog(3, talker, 142);

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 0 && talker.transformID == 113) {
myself.SetCurrentQuestID(195);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetOneTimeQuestFlag(talker, 194) == 1) {
myself.ShowPage(talker, "bishop_raimund_q0195_13.htm");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 2) {
myself.SetCurrentQuestID(195);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13822) >= 1 && talker.transformID != 113) {
myself.ShowPage(talker, "bishop_raimund_q0195_01.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 3 && gg.OwnItemCount(talker, 13822) >= 1 && gg.OwnItemCount(talker, 13823) < 1) {
myself.SetCurrentQuestID(195);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bishop_raimund_q0195_06.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 3 && gg.OwnItemCount(talker, 13822) >= 1 && gg.OwnItemCount(talker, 13823) >= 1) {
myself.SetCurrentQuestID(195);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bishop_raimund_q0195_09.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 4) {
myself.SetCurrentQuestID(195);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bishop_raimund_q0195_12.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 402) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 402) {
if (reply = 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "bishop_raimund_q0402_03.htm");
myself.GiveItem1(talker, 1170, 1);

}

}

}
if (ask == 142) {
myself.SetCurrentQuestID(142);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 142) {
if (reply == 3) {
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 3 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.ShowPage(talker, "bishop_raimund_q0142_03.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 3 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.ShowPage(talker, "bishop_raimund_q0142_04.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 142) == 1 && gg.GetMemoState(talker, 142) == 3 && myself.GetOneTimeQuestFlag(talker, 142) == 0) {
myself.SetMemoState(talker, 142, 4);
myself.ShowPage(talker, "bishop_raimund_q0142_05.htm");
myself.SetFlagJournal(talker, 142, 3);
myself.ShowQuestMark(talker, 142);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 195) {
myself.SetCurrentQuestID(195);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 195) {
if (reply == 1) {
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 2) {
if (gg.OwnItemCount(talker, 13822) >= 1 && talker.transformID != 113) {
myself.ShowPage(talker, "bishop_raimund_q0195_02.htm");

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 2) {
if (gg.OwnItemCount(talker, 13822) >= 1 && talker.transformID != 113) {
myself.ShowPage(talker, "bishop_raimund_q0195_03.htm");

}

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 2) {
if (gg.OwnItemCount(talker, 13822) >= 1 && talker.transformID != 113) {
myself.CastBuffForQuestReward(talker, 406585345);
myself.SetMemoState(talker, 195, 3);
myself.ShowPage(talker, "bishop_raimund_q0195_04.htm");
myself.SetFlagJournal(talker, 195, 3);
myself.ShowQuestMark(talker, 195);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 2) {
if (gg.OwnItemCount(talker, 13822) >= 1 && talker.transformID != 113) {
myself.ShowPage(talker, "bishop_raimund_q0195_05.htm");

}

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 3 && gg.OwnItemCount(talker, 13822) >= 1 && gg.OwnItemCount(talker, 13823) < 1) {
myself.CastBuffForQuestReward(talker, 406585345);
myself.ShowPage(talker, "bishop_raimund_q0195_07.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 3 && gg.OwnItemCount(talker, 13822) >= 1 && gg.OwnItemCount(talker, 13823) < 1) {
myself.CastBuffForQuestReward(talker, 406323201);
myself.ShowPage(talker, "bishop_raimund_q0195_08.htm");

}

}
if (reply == 7) {
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 3 && gg.OwnItemCount(talker, 13822) >= 1 && gg.OwnItemCount(talker, 13823) >= 1) {
myself.ShowPage(talker, "bishop_raimund_q0195_10.htm");

}

}
if (reply == 8) {
if (gg.HaveMemo(talker, 195) == 1 && gg.GetMemoState(talker, 195) == 3 && gg.OwnItemCount(talker, 13822) >= 1 && gg.OwnItemCount(talker, 13823) >= 1) {
myself.DeleteItem1(talker, 13822, 1);
myself.SetMemoState(talker, 195, 4);
myself.ShowPage(talker, "bishop_raimund_q0195_11.htm");
myself.SetFlagJournal(talker, 195, 4);
myself.ShowQuestMark(talker, 195);
if (talker.transformID == 113) {
myself.CastBuffForQuestReward(talker, 406323201);

}

}

}
if (reply == 9) {
if (gg.HaveMemo(talker, 195) == 0 && myself.GetOneTimeQuestFlag(talker, 195) == 0 && talker.transformID == 113) {
if (myself.GetOneTimeQuestFlag(talker, 194) == 1) {
myself.CastBuffForQuestReward(talker, 406323201);
myself.ShowPage(talker, "bishop_raimund_q0195_14.htm");

}

}

}

}
super;
	}


}