package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blacksmith_alltran extends blacksmith {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 101) == 1 && gg.OwnItemCount(talker, 796) > 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Sword of Solidarity (In Progress)");

}
if (gg.HaveMemo(talker, 101) == 1 && gg.OwnItemCount(talker, 796) == 0 && gg.OwnItemCount(talker, 937) > 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Sword of Solidarity (In Progress)");

}
if (gg.HaveMemo(talker, 101) == 1 && gg.OwnItemCount(talker, 742) && gg.OwnItemCount(talker, 937) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Sword of Solidarity (In Progress)");

}
if (gg.HaveMemo(talker, 101) == 1 && gg.OwnItemCount(talker, 739) > 0 && myself.GetOneTimeQuestFlag(talker, 101) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Sword of Solidarity (In Progress)");

}
if (gg.HaveMemo(talker, 152) != 0 && gg.OwnItemCount(talker, 1008) != 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Shards of Golem (In Progress)");

}
if (gg.HaveMemo(talker, 152) != 0 && gg.OwnItemCount(talker, 1009) != 0 && gg.OwnItemCount(talker, 1010) < 5 && gg.OwnItemCount(talker, 1011) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Shards of Golem (In Progress)");

}
if (gg.HaveMemo(talker, 152) != 0 && gg.OwnItemCount(talker, 1009) != 0 && gg.OwnItemCount(talker, 1010) >= 5 && gg.OwnItemCount(talker, 1011) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Shards of Golem (In Progress)");

}
if (gg.HaveMemo(talker, 152) != 0 && gg.OwnItemCount(talker, 1009) != 0 && gg.OwnItemCount(talker, 1011) != 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Shards of Golem (In Progress)");

}
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3120) == 1 && gg.OwnItemCount(talker, 3121) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Trial of the Guildsman (In Progress)");

}
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3120) == 1 && gg.OwnItemCount(talker, 3121) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Trial of the Guildsman (In Progress)");

}
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Trial of the Guildsman (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 101) == 1 && gg.OwnItemCount(talker, 796) > 0) {
myself.SetCurrentQuestID(101);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_alltran_q0101_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 101) == 1 && gg.OwnItemCount(talker, 796) == 0 && gg.OwnItemCount(talker, 937) > 0) {
myself.SetCurrentQuestID(101);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 741) && gg.OwnItemCount(talker, 740) == 0) {
myself.ShowPage(talker, "blacksmith_alltran_q0101_08.htm");

}
if (gg.OwnItemCount(talker, 741) == 0 && gg.OwnItemCount(talker, 740)) {
myself.ShowPage(talker, "blacksmith_alltran_q0101_08.htm");

}
if (gg.OwnItemCount(talker, 741) == 0 && gg.OwnItemCount(talker, 740) == 0) {
myself.ShowPage(talker, "blacksmith_alltran_q0101_03.htm");

}
if (gg.OwnItemCount(talker, 741) && gg.OwnItemCount(talker, 740)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_alltran_q0101_04.htm");
myself.DeleteItem1(talker, 937, gg.OwnItemCount(talker, 937));
myself.DeleteItem1(talker, 741, gg.OwnItemCount(talker, 741));
myself.DeleteItem1(talker, 740, gg.OwnItemCount(talker, 740));
myself.GiveItem1(talker, 742, 1);
myself.SetFlagJournal(talker, 101, 4);
myself.ShowQuestMark(talker, 101);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 101) == 1 && gg.OwnItemCount(talker, 742) && gg.OwnItemCount(talker, 937) == 0) {
myself.SetCurrentQuestID(101);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_alltran_q0101_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 101) == 1 && gg.OwnItemCount(talker, 739) > 0 && myself.GetOneTimeQuestFlag(talker, 101) == 0) {
myself.SetCurrentQuestID(101);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_alltran_q0101_06.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 152) != 0 && gg.OwnItemCount(talker, 1008) != 0) {
myself.SetCurrentQuestID(152);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_alltran_q0301_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 152) != 0 && gg.OwnItemCount(talker, 1009) != 0 && gg.OwnItemCount(talker, 1010) < 5 && gg.OwnItemCount(talker, 1011) == 0) {
myself.SetCurrentQuestID(152);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_alltran_q0301_03.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 152) != 0 && gg.OwnItemCount(talker, 1009) != 0 && gg.OwnItemCount(talker, 1010) >= 5 && gg.OwnItemCount(talker, 1011) == 0) {
myself.SetCurrentQuestID(152);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 1010, gg.OwnItemCount(talker, 1010));
if (gg.OwnItemCount(talker, 1011) == 0) {
myself.GiveItem1(talker, 1011, 1);

}
myself.ShowPage(talker, "blacksmith_alltran_q0301_04.htm");
myself.SetFlagJournal(talker, 152, 4);
myself.ShowQuestMark(talker, 152);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 152) != 0 && gg.OwnItemCount(talker, 1009) != 0 && gg.OwnItemCount(talker, 1011) != 0) {
myself.SetCurrentQuestID(152);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_alltran_q0301_05.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3120) == 1 && gg.OwnItemCount(talker, 3121) == 0) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_alltran_q0216_01.htm");
myself.SetFlagJournal(talker, 216, 2);
myself.ShowQuestMark(talker, 216);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3120) == 1 && gg.OwnItemCount(talker, 3121) == 1) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_alltran_q0216_02.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) == 1) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3139) < 7) {
myself.ShowPage(talker, "blacksmith_alltran_q0216_04.htm");

} else {
myself.ShowPage(talker, "blacksmith_alltran_q0216_05.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 101) {
myself.SetCurrentQuestID(101);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 101) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_alltran_q0101_02.htm");
myself.DeleteItem1(talker, 796, gg.OwnItemCount(talker, 796));
myself.GiveItem1(talker, 937, 1);
myself.SetFlagJournal(talker, 101, 2);
myself.ShowQuestMark(talker, 101);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 101) {
myself.SetCurrentQuestID(101);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 101) {
if (reply == 3 && gg.HaveMemo(talker, 101) == 1 && gg.OwnItemCount(talker, 739) > 0 && myself.GetOneTimeQuestFlag(talker, 101) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 25 && myself.IsInCategory(0, talker.occupation)) {
myself.GiveItem1(talker, 5789, 7000);
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);

}
myself.DeleteItem1(talker, 739, gg.OwnItemCount(talker, 739));
myself.GiveItem1(talker, 738, 1);
myself.GiveItem1(talker, 1060, 100);
myself.GiveItem1(talker, 4414, 10);
myself.GiveItem1(talker, 4415, 10);
myself.GiveItem1(talker, 4416, 10);
myself.GiveItem1(talker, 4413, 10);
myself.GiveItem1(talker, 4412, 10);
myself.IncrementParam(talker, 0, 25747);
myself.IncrementParam(talker, 1, 2171);
myself.GiveItem1(talker, 57, 10981);
myself.RemoveMemo(talker, 101);
gg.AddLog(2, talker, 101);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "blacksmith_alltran_q0101_07.htm");
myself.SetOneTimeQuestFlag(talker, 101, 1);
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 100000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4154, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 1000000 / 100000 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 100000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4154, "", "", "", "", ""));

}

}

}

}
if (ask == 152) {
myself.SetCurrentQuestID(152);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 152) {
if (reply == 2 && gg.OwnItemCount(talker, 1008) > 0) {
myself.DeleteItem1(talker, 1008, gg.OwnItemCount(talker, 1008));
myself.SetFlagJournal(talker, 152, 2);
myself.ShowQuestMark(talker, 152);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (gg.OwnItemCount(talker, 1009) == 0) {
myself.GiveItem1(talker, 1009, 1);

}
myself.ShowPage(talker, "blacksmith_alltran_q0301_02.htm");

}

}
if (ask == 216) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 216) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 3120) >= 1 && gg.OwnItemCount(talker, 3121) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_alltran_q0216_03.htm");
myself.DeleteItem1(talker, 3120, 1);
myself.GiveItem1(talker, 3122, 1);
myself.DeleteItem1(talker, 3121, 1);
myself.GiveItem1(talker, 3024, 1);
myself.GiveItem1(talker, 3123, 1);
myself.GiveItem1(talker, 3124, 1);
myself.SetFlagJournal(talker, 216, 5);
myself.ShowQuestMark(talker, 216);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}