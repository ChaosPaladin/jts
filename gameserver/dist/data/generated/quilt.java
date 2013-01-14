package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class quilt extends human_mage_lv1_master {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 158) == 0 && myself.GetOneTimeQuestFlag(talker, 158) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Seed of Evil");

}
if (gg.HaveMemo(talker, 158) == 0 && myself.GetOneTimeQuestFlag(talker, 158) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Seed of Evil (Done)");

}
if (gg.HaveMemo(talker, 158) != 0 && gg.OwnItemCount(talker, 1025) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Seed of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 158) != 0 && gg.OwnItemCount(talker, 1025) != 0 && myself.GetOneTimeQuestFlag(talker, 158) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Seed of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1178) == 0 && gg.OwnItemCount(talker, 1271) && gg.OwnItemCount(talker, 1167) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1178) > 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1167) > 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 19 && gg.OwnItemCount(talker, 2744)) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Trust (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 158) == 0 && myself.GetOneTimeQuestFlag(talker, 158) == 0) {
myself.SetCurrentQuestID(158);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 21) {
myself.FHTML_SetFileName(fhtml0, "quilt_q0309_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 158);
myself.ShowQuestFHTML(talker, fhtml0, 158);

} else {
myself.ShowPage(talker, "quilt_q0309_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 158) == 0 && myself.GetOneTimeQuestFlag(talker, 158) == 1) {
myself.SetCurrentQuestID(158);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 158) != 0 && gg.OwnItemCount(talker, 1025) == 0) {
myself.SetCurrentQuestID(158);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quilt_q0309_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 158) != 0 && gg.OwnItemCount(talker, 1025) != 0 && myself.GetOneTimeQuestFlag(talker, 158) == 0) {
myself.SetCurrentQuestID(158);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1025, gg.OwnItemCount(talker, 1025));
myself.RemoveMemo(talker, 158);
gg.AddLog(2, talker, 158);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 158, 1);
myself.GiveItem1(talker, 956, 1);
myself.IncrementParam(talker, 0, 17818);
myself.IncrementParam(talker, 1, 927);
myself.GiveItem1(talker, 57, 1495);
myself.ShowPage(talker, "quilt_q0309_06.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1178) == 0 && gg.OwnItemCount(talker, 1271) && gg.OwnItemCount(talker, 1167) == 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quilt_q0402_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1178) > 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1179) < 10) {
myself.ShowPage(talker, "quilt_q0402_03.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "quilt_q0402_04.htm");
myself.DeleteItem1(talker, 1179, gg.OwnItemCount(talker, 1179));
myself.DeleteItem1(talker, 1178, 1);
myself.GiveItem1(talker, 1167, 1);

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1167) > 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quilt_q0402_05.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 19 && gg.OwnItemCount(talker, 2744)) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 1390298);
myself.IncrementParam(talker, 1, 92782);
myself.GiveItem1(talker, 57, 252212);
myself.ShowPage(talker, "quilt_q0217_01.htm");
myself.DeleteItem1(talker, 2744, 1);
myself.GiveItem1(talker, 2734, 1);
myself.RemoveMemo(talker, 217);
gg.AddLog(2, talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 217, 1);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (myself.GetOneTimeQuestFlag(talker, 55) == 0) {
if (talker.race == 0) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.race == 1) {
myself.GiveItem1(talker, 7562, 102);

} else if (talker.race == 2) {
myself.GiveItem1(talker, 7562, 98);

} else if (talker.race == 3) {
myself.GiveItem1(talker, 7562, 109);

} else if (talker.race == 4) {
myself.GiveItem1(talker, 7562, 50);

}
myself.SetOneTimeQuestFlag(talker, 55, 1);

}

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
if (quest_id == 158) {
myself.SetCurrentQuestID(158);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 158);
gg.AddLog(1, talker, 158);
myself.SetFlagJournal(talker, 158, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "quilt_q0309_04.htm", 158);

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
myself.ShowPage(talker, "quilt_q0402_02.htm");
myself.GiveItem1(talker, 1178, 1);

}

}

}
super;
	}


}