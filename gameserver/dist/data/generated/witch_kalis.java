package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class witch_kalis extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 501) == 1 && gg.GetMemoState(talker, 501) == 1 && gg.OwnItemCount(talker, 3837) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Proof of Clan Alliance (In Progress)");

}
if (gg.HaveMemo(talker, 501) == 1 && gg.GetMemoState(talker, 501) == 2 && gg.OwnItemCount(talker, 3837) < 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Proof of Clan Alliance (In Progress)");

}
if (gg.HaveMemo(talker, 501) == 1 && gg.OwnItemCount(talker, 3837) >= 3 && gg.GetAbnormalLevel(talker, 56) == -1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Proof of Clan Alliance (In Progress)");

}
if (gg.HaveMemo(talker, 501) == 1 && gg.GetMemoState(talker, 501) == 5 && gg.OwnItemCount(talker, 3835) == 1 && gg.OwnItemCount(talker, 3833) >= 1 && gg.OwnItemCount(talker, 3832) >= 1 && gg.OwnItemCount(talker, 3834) >= 1 && gg.GetAbnormalLevel(talker, 56) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Proof of Clan Alliance (In Progress)");

}
if (gg.HaveMemo(talker, 501) == 1 && gg.GetMemoState(talker, 501) == 3 || gg.GetMemoState(talker, 501) == 4 || gg.GetMemoState(talker, 501) == 5 && gg.GetAbnormalLevel(talker, 56) == -1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Proof of Clan Alliance (In Progress)");

}
if (gg.HaveMemo(talker, 501) && gg.GetMemoState(talker, 501) < 6 && gg.GetMemoState(talker, 501) >= 3 && gg.OwnItemCount(talker, 3835) == 0 || gg.OwnItemCount(talker, 3833) == 0 || gg.OwnItemCount(talker, 3832) == 0 || gg.OwnItemCount(talker, 3834) == 0 && gg.GetAbnormalLevel(talker, 56) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Proof of Clan Alliance (In Progress)");

}
if (gg.HaveMemo(talker, 501) && gg.GetMemoState(talker, 501) == 6) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Proof of Clan Alliance (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 501) && gg.HaveMemo(talker, 501) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Proof of Clan Alliance (In Progress)");

}
if (talker.subjob_id == 0 && gg.GetMemoState(talker, 242) >= 6 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Path of the Noblesse, Possessor of a Precious Soul - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 242) == 1 && talker.subjob_id != 0 && gg.GetMemoState(talker, 242) == 6 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Path of the Noblesse, Possessor of a Precious Soul - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 242) == 1 && talker.subjob_id != 0 && gg.GetMemoState(talker, 242) == 7 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Path of the Noblesse, Possessor of a Precious Soul - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 242) == 1 && talker.subjob_id != 0 && gg.GetMemoState(talker, 242) == 8 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Path of the Noblesse, Possessor of a Precious Soul - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 242) == 1 && talker.subjob_id != 0 && gg.GetMemoState(talker, 242) >= 9 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Path of the Noblesse, Possessor of a Precious Soul - 2 (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Pursuit of Clan Ambition! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 501) == 1 && gg.GetMemoState(talker, 501) == 1 && gg.OwnItemCount(talker, 3837) == 0) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_kalis_q0501_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 501) == 1 && gg.GetMemoState(talker, 501) == 2 && gg.OwnItemCount(talker, 3837) < 3) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_kalis_q0501_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 501) == 1 && gg.OwnItemCount(talker, 3837) >= 3 && gg.GetAbnormalLevel(talker, 56) == -1) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.GetAbnormalLevel(talker, 56);
myself.ShowPage(talker, "witch_kalis_q0501_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 501) == 1 && gg.GetMemoState(talker, 501) == 5 && gg.OwnItemCount(talker, 3835) == 1 && gg.OwnItemCount(talker, 3833) >= 1 && gg.OwnItemCount(talker, 3832) >= 1 && gg.OwnItemCount(talker, 3834) >= 1 && gg.GetAbnormalLevel(talker, 56) == 1) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "witch_kalis_q0501_08.htm");
myself.GiveItem1(talker, 3873, 1);
myself.GiveItem1(talker, 3889, 1);
myself.DeleteItem1(talker, 3835, gg.OwnItemCount(talker, 3835));
myself.DeleteItem1(talker, 3872, gg.OwnItemCount(talker, 3872));
myself.DeleteItem1(talker, 3834, gg.OwnItemCount(talker, 3834));
myself.DeleteItem1(talker, 3832, gg.OwnItemCount(talker, 3832));
myself.DeleteItem1(talker, 3833, gg.OwnItemCount(talker, 3833));
myself.SetMemoState(talker, 501, 6);
myself.SetJournal(talker, 501, 4);
myself.ShowQuestMark(talker, 501);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 501) == 1 && gg.GetMemoState(talker, 501) == 3 || gg.GetMemoState(talker, 501) == 4 || gg.GetMemoState(talker, 501) == 5 && gg.GetAbnormalLevel(talker, 56) == -1) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_kalis_q0501_09.htm");
myself.SetMemoState(talker, 501, 1);
myself.DeleteItem1(talker, 3872, gg.OwnItemCount(talker, 3872));

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 501) && gg.GetMemoState(talker, 501) < 6 && gg.GetMemoState(talker, 501) >= 3 && gg.OwnItemCount(talker, 3835) == 0 || gg.OwnItemCount(talker, 3833) == 0 || gg.OwnItemCount(talker, 3832) == 0 || gg.OwnItemCount(talker, 3834) == 0 && gg.GetAbnormalLevel(talker, 56) == 1) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_kalis_q0501_10.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 501) && gg.GetMemoState(talker, 501) == 6) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_kalis_q0501_11.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 501) && gg.HaveMemo(talker, 501) == 0) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.is_pledge_master == 0) {
myself.ShowPage(talker, "witch_kalis_q0501_12.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || talker.subjob_id == 0 && gg.GetMemoState(talker, 242) >= 6 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
myself.SetCurrentQuestID(242);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quest_not_subclass001.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 242) == 1 && talker.subjob_id != 0 && gg.GetMemoState(talker, 242) == 6 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
myself.SetCurrentQuestID(242);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_kalis_q0242_01.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 242) == 1 && talker.subjob_id != 0 && gg.GetMemoState(talker, 242) == 7 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
myself.SetCurrentQuestID(242);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_kalis_q0242_03.htm");
myself.SetMemoState(talker, 242, 7);

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 242) == 1 && talker.subjob_id != 0 && gg.GetMemoState(talker, 242) == 8 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
myself.SetCurrentQuestID(242);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_kalis_q0242_04.htm");
myself.DeleteItem1(talker, 7596, gg.OwnItemCount(talker, 7596));

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 242) == 1 && talker.subjob_id != 0 && gg.GetMemoState(talker, 242) >= 9 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
myself.SetCurrentQuestID(242);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_kalis_q0242_06.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_kalis_q0503_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(503);
if (timer_id == 250303) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(503);
if (myself.sm.param2 == 50302) {
myself.Say(gg.MakeFString(50341, "", "", "", "", ""));
myself.AddTimerEx(250303, 1000 * 5);

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 501) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 501) {
if (reply == 1) {
myself.ShowPage(talker, "witch_kalis_q0501_02.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "witch_kalis_q0501_03.htm");
myself.SetMemoState(talker, 501, 2);
myself.SetJournal(talker, 501, 2);
myself.ShowQuestMark(talker, 501);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (reply == 3) {
myself.ShowPage(talker, "witch_kalis_q0501_04.htm");

} else if (reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "witch_kalis_q0501_07.htm");
myself.DeleteItem1(talker, 3837, gg.OwnItemCount(talker, 3837));
myself.GiveItem1(talker, 3872, 1);
myself.AddUseSkillDesire(talker, 267517953, 0, 0, 1000000);
myself.SetMemoState(talker, 501, 3);
myself.SetJournal(talker, 501, 3);
myself.ShowQuestMark(talker, 501);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 242) {
myself.SetCurrentQuestID(242);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 242) {
if (reply == 1 && gg.GetMemoState(talker, 242) == 6) {
myself.SetMemoState(talker, 242, 7);
myself.SetFlagJournal(talker, 242, 7);
myself.ShowQuestMark(talker, 242);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "witch_kalis_q0242_02.htm");

}
if (reply == 2 && gg.GetMemoState(talker, 242) == 8) {
myself.SetMemoState(talker, 242, 9);
myself.SetFlagJournal(talker, 242, 9);
myself.ShowQuestMark(talker, 242);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "witch_kalis_q0242_05.htm");

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

}
super;
	}


}