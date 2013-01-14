package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blueprint_seller_luka extends merchant {
protected Object[][] SellList0 = {
{"sb_summon_mechanic_golem1";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) == 2 && myself.GetOneTimeQuestFlag(talker, 186) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Contract Execution (In Progress)");

}
if (gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) == 3 && myself.GetOneTimeQuestFlag(talker, 186) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Contract Execution (In Progress)");

}
if (gg.HaveMemo(talker, 189) == 0 && myself.GetOneTimeQuestFlag(talker, 189) == 0 && myself.GetOneTimeQuestFlag(talker, 186) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Contract Completion");

}
if (myself.GetOneTimeQuestFlag(talker, 189) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Contract Completion (Done)");

}
if (gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) >= 1 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Contract Completion (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) == 2 && myself.GetOneTimeQuestFlag(talker, 186) == 0) {
myself.SetCurrentQuestID(186);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 10367) > 0) {
myself.ShowPage(talker, "blueprint_seller_luka_q0186_02.htm");

} else {
myself.ShowPage(talker, "blueprint_seller_luka_q0186_01.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) == 3 && myself.GetOneTimeQuestFlag(talker, 186) == 0) {
myself.SetCurrentQuestID(186);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blueprint_seller_luka_q0186_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 189) == 0 && myself.GetOneTimeQuestFlag(talker, 189) == 0 && myself.GetOneTimeQuestFlag(talker, 186) == 1) {
myself.SetCurrentQuestID(189);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 42) {
myself.FHTML_SetFileName(fhtml0, "blueprint_seller_luka_q0189_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 189);
myself.ShowQuestFHTML(talker, fhtml0, 189);

} else {
myself.ShowQuestPage(talker, "blueprint_seller_luka_q0189_02.htm", 189);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 189) == 1) {
myself.SetCurrentQuestID(189);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 189) == 1 && gg.GetMemoState(talker, 189) >= 1 && myself.GetOneTimeQuestFlag(talker, 189) == 0) {
myself.SetCurrentQuestID(189);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blueprint_seller_luka_q0189_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 189) {
myself.SetCurrentQuestID(189);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 189) == 0 && talker.level >= 42 && myself.GetOneTimeQuestFlag(talker, 189) == 0 && myself.GetOneTimeQuestFlag(talker, 186) == 1) {
myself.GiveItem1(talker, 10370, 1);
myself.SetMemoState(talker, 189, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "blueprint_seller_luka_q0189_03.htm", 189);
gg.AddLog(1, talker, quest_id);
myself.SetFlagJournal(talker, 189, 1);
myself.ShowQuestMark(talker, 189);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 186) {
myself.SetCurrentQuestID(186);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 186) {
if (reply == 1) {
if (gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) == 2 && myself.GetOneTimeQuestFlag(talker, 186) == 0 && gg.OwnItemCount(talker, 10367) > 0) {
myself.ShowPage(talker, "blueprint_seller_luka_q0186_03.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) == 2 && myself.GetOneTimeQuestFlag(talker, 186) == 0 && gg.OwnItemCount(talker, 10367) > 0) {
myself.SetMemoState(talker, 186, 3);
myself.ShowPage(talker, "blueprint_seller_luka_q0186_04.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 186) == 1 && gg.GetMemoState(talker, 186) == 3 && myself.GetOneTimeQuestFlag(talker, 186) == 0) {
myself.DeleteItem1(talker, 10366, gg.OwnItemCount(talker, 10366));
myself.DeleteItem1(talker, 10367, gg.OwnItemCount(talker, 10367));
myself.ShowPage(talker, "blueprint_seller_luka_q0186_06.htm");
gg.AddLog(2, talker, 186);
myself.RemoveMemo(talker, 186);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 186, 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 47) {
myself.GiveItem1(talker, 57, 105083);
myself.IncrementParam(talker, 0, 285935);
myself.IncrementParam(talker, 1, 18711);

} else {
myself.GiveItem1(talker, 57, 105083);

}
gg.AddLog(3, talker, 186);

}

}

}

}
super;
	}


}