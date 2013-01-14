package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sir_eric_rodemai extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam pledge0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 508) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "A Clan's Reputation");

}
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(talker, 508) == 1 && talker.is_pledge_master == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 2 && gg.OwnItemCount(talker, 8277) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 2 && gg.OwnItemCount(talker, 8277) >= 1 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 4 && gg.OwnItemCount(talker, 14883) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 4 && gg.OwnItemCount(talker, 14883) >= 1 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 4 && gg.OwnItemCount(talker, 8279) >= 1 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 5 && gg.OwnItemCount(talker, 8280) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 5 && gg.OwnItemCount(talker, 8280) >= 1 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 6 && gg.OwnItemCount(talker, 8281) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 6 && gg.OwnItemCount(talker, 8281) >= 1 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 7 && gg.OwnItemCount(talker, 8282) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 7 && gg.OwnItemCount(talker, 8282) >= 1 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 8 && gg.OwnItemCount(talker, 8494) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 8 && gg.OwnItemCount(talker, 8494) >= 1 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "A Clan's Reputation (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 7000 && talker.is_pledge_master == 0) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 7000 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 8000) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 8100 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 8100 && talker.is_pledge_master == 0) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) < 8511 && gg.GetMemoState(talker, 503) >= 8500) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 8700) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) >= 9000) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Pursuit of Clan Ambition! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 0) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.is_pledge_master == 1) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
if (pledge0.skill_level >= 5) {
myself.ShowQuestPage(talker, "sir_eric_rodemai_q0508_01.htm", 508);

} else {
myself.ShowQuestPage(talker, "sir_eric_rodemai_q0508_02.htm", 508);

}

}

} else {
myself.ShowQuestPage(talker, "sir_eric_rodemai_q0508_03.htm", 508);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_eric_rodemai_q0508_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && talker.is_pledge_master == 0) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.RemoveMemo(talker, 508);
gg.AddLog(2, talker, 508);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "sir_eric_rodemai_q0508_05a.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 2 && gg.OwnItemCount(talker, 8277) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_eric_rodemai_q0508_18.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 2 && gg.OwnItemCount(talker, 8277) >= 1 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.UpdatePledgeNameValue(talker, 280);
myself.ShowSystemMessageStr(talker, gg.MakeFString(50851, gg.IntToStr(280), "", "", "", ""));
myself.SoundEffect(talker, "ItemSound.quest_fanfare_1");
myself.DeleteItem1(talker, 8277, gg.OwnItemCount(talker, 8277));
gg.AddLog(3, talker, 508);
myself.SetMemoState(talker, 508, 0);
myself.ShowPage(talker, "sir_eric_rodemai_q0508_19.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 4 && gg.OwnItemCount(talker, 14883) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_eric_rodemai_q0508_22.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 4 && gg.OwnItemCount(talker, 14883) >= 1 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.UpdatePledgeNameValue(talker, 292);
myself.ShowSystemMessageStr(talker, gg.MakeFString(50851, gg.IntToStr(292), "", "", "", ""));
myself.SoundEffect(talker, "ItemSound.quest_fanfare_1");
myself.DeleteItem1(talker, 14883, gg.OwnItemCount(talker, 14883));
gg.AddLog(3, talker, 508);
myself.SetMemoState(talker, 508, 0);
myself.ShowPage(talker, "sir_eric_rodemai_q0508_23a.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 4 && gg.OwnItemCount(talker, 8279) >= 1 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.UpdatePledgeNameValue(talker, 309);
myself.ShowSystemMessageStr(talker, gg.MakeFString(50851, gg.IntToStr(309), "", "", "", ""));
myself.SoundEffect(talker, "ItemSound.quest_fanfare_1");
myself.DeleteItem1(talker, 8279, gg.OwnItemCount(talker, 8279));
gg.AddLog(3, talker, 508);
myself.SetMemoState(talker, 508, 0);
myself.ShowPage(talker, "sir_eric_rodemai_q0508_23.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 5 && gg.OwnItemCount(talker, 8280) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_eric_rodemai_q0508_24.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 5 && gg.OwnItemCount(talker, 8280) >= 1 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.UpdatePledgeNameValue(talker, 301);
myself.ShowSystemMessageStr(talker, gg.MakeFString(50851, gg.IntToStr(301), "", "", "", ""));
myself.SoundEffect(talker, "ItemSound.quest_fanfare_1");
myself.DeleteItem1(talker, 8280, gg.OwnItemCount(talker, 8280));
gg.AddLog(3, talker, 508);
myself.SetMemoState(talker, 508, 0);
myself.ShowPage(talker, "sir_eric_rodemai_q0508_25.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 6 && gg.OwnItemCount(talker, 8281) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_eric_rodemai_q0508_26.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 6 && gg.OwnItemCount(talker, 8281) >= 1 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.UpdatePledgeNameValue(talker, 392);
myself.ShowSystemMessageStr(talker, gg.MakeFString(50851, gg.IntToStr(392), "", "", "", ""));
myself.SoundEffect(talker, "ItemSound.quest_fanfare_1");
myself.DeleteItem1(talker, 8281, gg.OwnItemCount(talker, 8281));
gg.AddLog(3, talker, 508);
myself.SetMemoState(talker, 508, 0);
myself.ShowPage(talker, "sir_eric_rodemai_q0508_27.htm");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 7 && gg.OwnItemCount(talker, 8282) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_eric_rodemai_q0508_28.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 7 && gg.OwnItemCount(talker, 8282) >= 1 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.UpdatePledgeNameValue(talker, 279);
myself.ShowSystemMessageStr(talker, gg.MakeFString(50851, gg.IntToStr(279), "", "", "", ""));
myself.SoundEffect(talker, "ItemSound.quest_fanfare_1");
myself.DeleteItem1(talker, 8282, gg.OwnItemCount(talker, 8282));
gg.AddLog(3, talker, 508);
myself.SetMemoState(talker, 508, 0);
myself.ShowPage(talker, "sir_eric_rodemai_q0508_29.htm");

}

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 8 && gg.OwnItemCount(talker, 8494) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_eric_rodemai_q0508_30.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 8 && gg.OwnItemCount(talker, 8494) >= 1 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.UpdatePledgeNameValue(talker, 384);
myself.ShowSystemMessageStr(talker, gg.MakeFString(50851, gg.IntToStr(384), "", "", "", ""));
myself.SoundEffect(talker, "ItemSound.quest_fanfare_1");
myself.DeleteItem1(talker, 8494, gg.OwnItemCount(talker, 8494));
gg.AddLog(3, talker, 508);
myself.SetMemoState(talker, 508, 0);
myself.ShowPage(talker, "sir_eric_rodemai_q0508_31.htm");

}

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 7000 && talker.is_pledge_master == 0) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_eric_rodemai_q0503_01.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 7000 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_eric_rodemai_q0503_02.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 8000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_eric_rodemai_q0503_05.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 8100 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 503, 8500);
myself.ShowPage(talker, "sir_eric_rodemai_q0503_06.htm");
myself.SetJournal(talker, 503, 10);
myself.ShowQuestMark(talker, 503);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 8100 && talker.is_pledge_master == 0) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_eric_rodemai_q0503_07.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) < 8511 && gg.GetMemoState(talker, 503) >= 8500) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_eric_rodemai_q0503_08.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 8700) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_eric_rodemai_q0503_09.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) >= 9000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_eric_rodemai_q0503_11.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam pledge0, HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 508) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 508) == 0 && talker.is_pledge_master == 1) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
if (pledge0.skill_level >= 5) {
myself.SetMemo(talker, quest_id);
myself.SetMemoState(talker, 508, 0);
myself.SetFlagJournal(talker, 508, 1);
myself.ShowQuestMark(talker, 508);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sir_eric_rodemai_q0508_04.htm", 508);
gg.AddLog(1, talker, quest_id);

}

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam pledge0, HandlerParam reply, HandlerParam talker) {
if (ask == 508) {
myself.SetCurrentQuestID(508);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 508) {
if (reply == 100) {
if (gg.HaveMemo(talker, 508) == 1) {
myself.ShowPage(talker, "sir_eric_rodemai_q0508_06.htm");

}

}
if (reply == 101) {
myself.RemoveMemo(talker, 508);
gg.AddLog(2, talker, 508);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "sir_eric_rodemai_q0508_07.htm");

}
if (reply == 102) {
if (gg.HaveMemo(talker, 508) == 1) {
myself.SetMemoState(talker, 508, 0);
myself.ShowPage(talker, "sir_eric_rodemai_q0508_08.htm");

}

}
if (reply == 110) {
if (talker.is_pledge_master == 1) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
if (pledge0.skill_level >= 5) {
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "sir_eric_rodemai_q0508_01a.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 508);
myself.ShowQuestFHTML(talker, fhtml0, 508);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 0) {
myself.SetMemoState(talker, 508, 2);
myself.ShowPage(talker, "sir_eric_rodemai_q0508_10.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 0) {
myself.SetMemoState(talker, 508, 4);
myself.ShowPage(talker, "sir_eric_rodemai_q0508_12.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 0) {
myself.SetMemoState(talker, 508, 5);
myself.ShowPage(talker, "sir_eric_rodemai_q0508_13.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 0) {
myself.SetMemoState(talker, 508, 6);
myself.ShowPage(talker, "sir_eric_rodemai_q0508_14.htm");

}

}
if (reply == 7) {
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 0) {
myself.SetMemoState(talker, 508, 7);
myself.ShowPage(talker, "sir_eric_rodemai_q0508_15.htm");

}

}
if (reply == 8) {
if (gg.HaveMemo(talker, 508) == 1 && gg.GetMemoState(talker, 508) == 0) {
myself.SetMemoState(talker, 508, 8);
myself.ShowPage(talker, "sir_eric_rodemai_q0508_15a.htm");

}

}

}
if (ask == 503) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 503) {
if (reply == 1) {
myself.ShowPage(talker, "sir_eric_rodemai_q0503_03.htm");

}
if (reply == 2) {
myself.DeleteItem1(talker, 3868, gg.OwnItemCount(talker, 3868));
myself.SetMemoState(talker, 503, 8000);
myself.ShowPage(talker, "sir_eric_rodemai_q0503_04.htm");
myself.SetJournal(talker, 503, 8);
myself.ShowQuestMark(talker, 503);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
if (reply == 3) {
myself.SetMemoState(talker, 503, 9000);
myself.ShowPage(talker, "sir_eric_rodemai_q0503_10.htm");
myself.SetJournal(talker, 503, 11);
myself.ShowQuestMark(talker, 503);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
super;
	}


}