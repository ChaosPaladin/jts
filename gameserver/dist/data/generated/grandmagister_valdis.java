package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class grandmagister_valdis extends master_lv3_hew {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam pledge0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 8) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 10) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 509) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "A Clan's Fame");

}
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "A Clan's Fame (In Progress)");

}
if (gg.HaveMemo(talker, 509) == 1 && talker.is_pledge_master == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "A Clan's Fame (In Progress)");

}
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 1 && gg.OwnItemCount(talker, 8489) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "A Clan's Fame (In Progress)");

}
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 1 && gg.OwnItemCount(talker, 8489) >= 1 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "A Clan's Fame (In Progress)");

}
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 2 && gg.OwnItemCount(talker, 8490) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "A Clan's Fame (In Progress)");

}
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 2 && gg.OwnItemCount(talker, 8490) >= 1 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "A Clan's Fame (In Progress)");

}
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 3 && gg.OwnItemCount(talker, 8491) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "A Clan's Fame (In Progress)");

}
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 3 && gg.OwnItemCount(talker, 8491) >= 1 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "A Clan's Fame (In Progress)");

}
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 4 && gg.OwnItemCount(talker, 8492) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "A Clan's Fame (In Progress)");

}
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 4 && gg.OwnItemCount(talker, 8492) >= 1 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "A Clan's Fame (In Progress)");

}
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 5 && gg.OwnItemCount(talker, 8493) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "A Clan's Fame (In Progress)");

}
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 5 && gg.OwnItemCount(talker, 8493) >= 1 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "A Clan's Fame (In Progress)");

}
if (gg.HaveMemo(talker, 510) == 0) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "A Clan's Prestige");

}
if (gg.HaveMemo(talker, 510) == 1 && gg.GetMemoState(talker, 510) == 1 && gg.OwnItemCount(talker, 8767) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "A Clan's Prestige (In Progress)");

}
if (gg.HaveMemo(talker, 510) == 1 && talker.is_pledge_master == 0) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "A Clan's Prestige (In Progress)");

}
if (gg.HaveMemo(talker, 510) == 1 && gg.GetMemoState(talker, 510) == 1 && gg.OwnItemCount(talker, 8767) >= 1 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "A Clan's Prestige (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 8) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmagister_valdis_q0073_0121.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 9 && gg.OwnItemCount(talker, 7081) == 0) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmagister_valdis_q0073_0124.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmagister_valdis_q0073_0125.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 10) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmagister_valdis_q0073_0126.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 509) == 0) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.is_pledge_master == 1) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
if (pledge0.skill_level >= 6) {
myself.ShowQuestPage(talker, "grandmagister_valdis_q0509_01.htm", 509);

} else {
myself.ShowQuestPage(talker, "grandmagister_valdis_q0509_02.htm", 509);

}

}

} else {
myself.ShowQuestPage(talker, "grandmagister_valdis_q0509_03.htm", 509);

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmagister_valdis_q0509_05.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 509) == 1 && talker.is_pledge_master == 0) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.RemoveMemo(talker, 509);
gg.AddLog(2, talker, 509);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "grandmagister_valdis_q0509_05a.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 1 && gg.OwnItemCount(talker, 8489) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmagister_valdis_q0509_16.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 1 && gg.OwnItemCount(talker, 8489) >= 1 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.UpdatePledgeNameValue(talker, 689);
myself.ShowSystemMessageStr(talker, gg.MakeFString(50851, gg.IntToStr(689), "", "", "", ""));
myself.SoundEffect(talker, "ItemSound.quest_fanfare_1");
myself.DeleteItem1(talker, 8489, gg.OwnItemCount(talker, 8489));
gg.AddLog(3, talker, 509);
myself.SetMemoState(talker, 509, 0);
myself.ShowPage(talker, "grandmagister_valdis_q0509_17.htm");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 2 && gg.OwnItemCount(talker, 8490) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmagister_valdis_q0509_18.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 2 && gg.OwnItemCount(talker, 8490) >= 1 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.UpdatePledgeNameValue(talker, 689);
myself.ShowSystemMessageStr(talker, gg.MakeFString(50851, gg.IntToStr(689), "", "", "", ""));
myself.SoundEffect(talker, "ItemSound.quest_fanfare_1");
myself.DeleteItem1(talker, 8490, gg.OwnItemCount(talker, 8490));
gg.AddLog(3, talker, 509);
myself.SetMemoState(talker, 509, 0);
myself.ShowPage(talker, "grandmagister_valdis_q0509_19.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 3 && gg.OwnItemCount(talker, 8491) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmagister_valdis_q0509_20.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 3 && gg.OwnItemCount(talker, 8491) >= 1 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.UpdatePledgeNameValue(talker, 535);
myself.ShowSystemMessageStr(talker, gg.MakeFString(50851, gg.IntToStr(535), "", "", "", ""));
myself.SoundEffect(talker, "ItemSound.quest_fanfare_1");
myself.DeleteItem1(talker, 8491, gg.OwnItemCount(talker, 8491));
gg.AddLog(3, talker, 509);
myself.SetMemoState(talker, 509, 0);
myself.ShowPage(talker, "grandmagister_valdis_q0509_21.htm");

}

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 4 && gg.OwnItemCount(talker, 8492) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmagister_valdis_q0509_22.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 4 && gg.OwnItemCount(talker, 8492) >= 1 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.UpdatePledgeNameValue(talker, 391);
myself.ShowSystemMessageStr(talker, gg.MakeFString(50851, gg.IntToStr(391), "", "", "", ""));
myself.SoundEffect(talker, "ItemSound.quest_fanfare_1");
myself.DeleteItem1(talker, 8492, gg.OwnItemCount(talker, 8492));
gg.AddLog(3, talker, 509);
myself.SetMemoState(talker, 509, 0);
myself.ShowPage(talker, "grandmagister_valdis_q0509_23.htm");

}

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 5 && gg.OwnItemCount(talker, 8493) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmagister_valdis_q0509_24.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 5 && gg.OwnItemCount(talker, 8493) >= 1 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.UpdatePledgeNameValue(talker, 674);
myself.ShowSystemMessageStr(talker, gg.MakeFString(50851, gg.IntToStr(674), "", "", "", ""));
myself.SoundEffect(talker, "ItemSound.quest_fanfare_1");
myself.DeleteItem1(talker, 8493, gg.OwnItemCount(talker, 8493));
gg.AddLog(3, talker, 509);
myself.SetMemoState(talker, 509, 0);
myself.ShowPage(talker, "grandmagister_valdis_q0509_25.htm");

}

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 510) == 0) {
myself.SetCurrentQuestID(510);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.is_pledge_master == 1) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
if (pledge0.skill_level >= 5) {
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "grandmagister_valdis_q0510_01.htm", 510);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

} else {
myself.ShowQuestPage(talker, "grandmagister_valdis_q0510_03.htm", 510);

}

}

} else {
myself.ShowQuestPage(talker, "grandmagister_valdis_q0510_04.htm", 510);

}

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 510) == 1 && gg.GetMemoState(talker, 510) == 1 && gg.OwnItemCount(talker, 8767) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(510);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmagister_valdis_q0510_06.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 510) == 1 && talker.is_pledge_master == 0) {
myself.SetCurrentQuestID(510);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.RemoveMemo(talker, 510);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 510);
myself.ShowPage(talker, "grandmagister_valdis_q0510_07a.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 510) == 1 && gg.GetMemoState(talker, 510) == 1 && gg.OwnItemCount(talker, 8767) >= 1 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(510);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 8767) < 10) {
i0 = 15 * gg.OwnItemCount(talker, 8767);

} else {
i0 = 59 + 15 * gg.OwnItemCount(talker, 8767);

}
myself.UpdatePledgeNameValue(talker, i0);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_1");
myself.ShowSystemMessageStr(talker, gg.MakeFString(50851, gg.IntToStr(i0), "", "", "", ""));
myself.DeleteItem1(talker, 8767, gg.OwnItemCount(talker, 8767));
myself.ShowPage(talker, "grandmagister_valdis_q0510_07.htm");
gg.AddLog(3, talker, 510);

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam pledge0, HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 509) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 509) == 0 && talker.is_pledge_master == 1) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
if (pledge0.skill_level >= 6) {
myself.SetMemo(talker, quest_id);
myself.SetMemoState(talker, 509, 0);
myself.SetFlagJournal(talker, 509, 1);
myself.ShowQuestMark(talker, 509);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "grandmagister_valdis_q0509_04.htm", 509);
gg.AddLog(1, talker, quest_id);

}

}

}

}
return;

}
if (quest_id == 510) {
myself.SetCurrentQuestID(510);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
if (gg.HaveMemo(talker, 510) == 0 && talker.is_pledge_master == 1 && pledge0.skill_level >= 5) {
myself.SetMemoState(talker, 510, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "grandmagister_valdis_q0510_05.htm", 510);
gg.AddLog(1, talker, quest_id);

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam pledge0, HandlerParam reply, HandlerParam talker) {
if (ask == 73) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 73) {
if (reply == 5) {
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 8) {
myself.ShowPage(talker, "grandmagister_valdis_q0073_0127.htm");

}

} else if (reply == 6) {
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 8) {
myself.SetMemoState(talker, 73, 9);
myself.ShowPage(talker, "grandmagister_valdis_q0073_0122.htm");
myself.SetFlagJournal(talker, 73, 11);
myself.ShowQuestMark(talker, 73);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 7) {
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 8) {
myself.SetMemoState(talker, 73, 9);
myself.ShowPage(talker, "grandmagister_valdis_q0073_0123.htm");
myself.SetFlagJournal(talker, 73, 12);
myself.ShowQuestMark(talker, 73);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 8) {
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 9 && gg.OwnItemCount(talker, 7081) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7364, 1);
myself.DeleteItem1(talker, 7081, 1);
myself.SetMemoState(talker, 73, 10);
myself.ShowPage(talker, "grandmagister_valdis_q0073_0128.htm");
myself.SetFlagJournal(talker, 73, 13);
myself.ShowQuestMark(talker, 73);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 509) {
myself.SetCurrentQuestID(509);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 509) {
if (reply == 100) {
if (gg.HaveMemo(talker, 509) == 1) {
myself.ShowPage(talker, "grandmagister_valdis_q0509_06.htm");

}

}
if (reply == 101) {
myself.RemoveMemo(talker, 509);
gg.AddLog(2, talker, 509);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "grandmagister_valdis_q0509_07.htm");

}
if (reply == 102) {
if (gg.HaveMemo(talker, 509) == 1) {
myself.SetMemoState(talker, 509, 0);
myself.ShowPage(talker, "grandmagister_valdis_q0509_08.htm");

}

}
if (reply == 110) {
if (talker.is_pledge_master == 1) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
if (pledge0.skill_level >= 6) {
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "grandmagister_valdis_q0509_01a.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 509);
myself.ShowQuestFHTML(talker, fhtml0, 509);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}

}

}

}
if (reply == 1) {
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 0) {
myself.SetMemoState(talker, 509, 1);
myself.ShowPage(talker, "grandmagister_valdis_q0509_09.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 0) {
myself.SetMemoState(talker, 509, 2);
myself.ShowPage(talker, "grandmagister_valdis_q0509_10.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 0) {
myself.SetMemoState(talker, 509, 3);
myself.ShowPage(talker, "grandmagister_valdis_q0509_11.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 0) {
myself.SetMemoState(talker, 509, 4);
myself.ShowPage(talker, "grandmagister_valdis_q0509_12.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 509) == 1 && gg.GetMemoState(talker, 509) == 0) {
myself.SetMemoState(talker, 509, 5);
myself.ShowPage(talker, "grandmagister_valdis_q0509_13.htm");

}

}

}
if (ask == 510) {
myself.SetCurrentQuestID(510);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 510) {
if (reply == 1 && gg.HaveMemo(talker, 510) == 0 && talker.is_pledge_master == 1) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
if (pledge0.skill_level >= 5) {
myself.FHTML_SetFileName(fhtml0, "grandmagister_valdis_q0510_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 510);
myself.ShowQuestFHTML(talker, fhtml0, 510);

}

}

}
if (reply == 2 && gg.HaveMemo(talker, 510) == 1 && talker.is_pledge_master == 1) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
if (pledge0.skill_level >= 5) {
myself.ShowPage(talker, "grandmagister_valdis_q0510_08.htm");

}

}

}
if (reply == 3 && gg.HaveMemo(talker, 510) == 1 && talker.is_pledge_master == 1) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
if (pledge0.skill_level >= 5) {
myself.RemoveMemo(talker, 510);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "grandmagister_valdis_q0510_09.htm");
myself.DeleteItem1(talker, 8767, gg.OwnItemCount(talker, 8767));
gg.AddLog(2, talker, 510);

}

}

}

}
super;
	}


}