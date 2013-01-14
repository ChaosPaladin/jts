package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class seer_somak extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3404) == 0 && gg.OwnItemCount(talker, 3402) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3394) >= 1 && gg.OwnItemCount(talker, 3401) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3404) == 0 && gg.OwnItemCount(talker, 3401) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3394) >= 1 && gg.OwnItemCount(talker, 3402) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3404) >= 1 && gg.OwnItemCount(talker, 3394) == 0 && gg.OwnItemCount(talker, 3402) == 0 && gg.OwnItemCount(talker, 3401) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 0 && myself.GetOneTimeQuestFlag(talker, 233) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the War Spirit");

}
if (gg.HaveMemo(talker, 233) == 0 && myself.GetOneTimeQuestFlag(talker, 233) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the War Spirit (Done)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2880) == 0 && gg.OwnItemCount(talker, 2882) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of the War Spirit (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2880) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of the War Spirit (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2882) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Test of the War Spirit (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3404) == 0 && gg.OwnItemCount(talker, 3402) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3394) >= 1 && gg.OwnItemCount(talker, 3401) >= 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_somak_q0232_01.htm");
myself.DeleteItem1(talker, 3401, 1);
myself.GiveItem1(talker, 3402, 1);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3404) == 0 && gg.OwnItemCount(talker, 3401) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3394) >= 1 && gg.OwnItemCount(talker, 3402) >= 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_somak_q0232_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3404) >= 1 && gg.OwnItemCount(talker, 3394) == 0 && gg.OwnItemCount(talker, 3402) == 0 && gg.OwnItemCount(talker, 3401) == 0) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_somak_q0232_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 0 && myself.GetOneTimeQuestFlag(talker, 233) == 0) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 3) {
myself.ShowPage(talker, "seer_somak_q0233_01.htm");

} else if (talker.race == 3 && talker.occupation != 50) {
myself.ShowPage(talker, "seer_somak_q0233_02.htm");

} else if (talker.race == 3 && talker.occupation == 50) {
if (talker.level < 39) {
myself.ShowPage(talker, "seer_somak_q0233_03.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "seer_somak_q0233_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 233);
myself.ShowQuestFHTML(talker, fhtml0, 233);

}

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 0 && myself.GetOneTimeQuestFlag(talker, 233) == 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2880) == 0 && gg.OwnItemCount(talker, 2882) == 0) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2887) >= 1 && gg.OwnItemCount(talker, 2901) >= 1 && gg.OwnItemCount(talker, 2910) >= 1 && gg.OwnItemCount(talker, 2894) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_somak_q0233_07.htm");
myself.DeleteItem1(talker, 2887, gg.OwnItemCount(talker, 2887));
myself.DeleteItem1(talker, 2901, gg.OwnItemCount(talker, 2901));
myself.DeleteItem1(talker, 2910, gg.OwnItemCount(talker, 2910));
myself.DeleteItem1(talker, 2894, 1);
myself.GiveItem1(talker, 2880, 1);
myself.SetFlagJournal(talker, 233, 3);
myself.ShowQuestMark(talker, 233);

}

} else {
myself.ShowPage(talker, "seer_somak_q0233_06.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2880) == 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2881) < 13) {
myself.ShowPage(talker, "seer_somak_q0233_08.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_somak_q0233_09.htm");
myself.DeleteItem1(talker, 2880, 1);
myself.GiveItem1(talker, 2882, 1);
myself.GiveItem1(talker, 2911, 1);
myself.GiveItem1(talker, 2913, 1);
myself.GiveItem1(talker, 2914, 1);
myself.GiveItem1(talker, 2912, 1);
myself.SetFlagJournal(talker, 233, 5);
myself.ShowQuestMark(talker, 233);

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2882) == 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_somak_q0233_10.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 233) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 233) == 0 && myself.GetOneTimeQuestFlag(talker, 233) == 0 && myself.GetMemoCount(talker) < 41 && talker.occupation == 50 && talker.level >= 39) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 233, 1);
myself.ShowQuestMark(talker, 233);
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
myself.ShowQuestPage(talker, "seer_somak_q0233_05e.htm", 233);

} else {
myself.ShowQuestPage(talker, "seer_somak_q0233_05.htm", 233);

}

}

}
return;

}
super;
	}


}