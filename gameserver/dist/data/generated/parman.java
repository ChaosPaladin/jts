package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class parman extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 221) == 0 && myself.GetOneTimeQuestFlag(talker, 221) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Prosperity");

}
if (gg.HaveMemo(talker, 221) == 0 && myself.GetOneTimeQuestFlag(talker, 221) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Prosperity (Done)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3268) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3269) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3270) >= 1 || gg.OwnItemCount(talker, 3271) >= 1 || gg.OwnItemCount(talker, 3272) >= 1 && gg.OwnItemCount(talker, 3240) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3245) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Prosperity (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 0 && myself.GetOneTimeQuestFlag(talker, 221) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race == 4 && talker.level >= 37 && myself.IsInCategory(22, talker.occupation)) {
myself.FHTML_SetFileName(fhtml0, "parman_q0221_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 221);
myself.ShowQuestFHTML(talker, fhtml0, 221);

} else if (talker.race == 4 && talker.level >= 37) {
myself.ShowPage(talker, "parman_q0221_01a.htm");

} else if (talker.race == 4) {
myself.ShowPage(talker, "parman_q0221_02.htm");

} else {
myself.ShowPage(talker, "parman_q0221_01.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 0 && myself.GetOneTimeQuestFlag(talker, 221) == 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) == 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3241) >= 1 && gg.OwnItemCount(talker, 3242) >= 1 && gg.OwnItemCount(talker, 3243) >= 1 && gg.OwnItemCount(talker, 3244) >= 1) {
myself.ShowPage(talker, "parman_q0221_06.htm");

} else {
myself.ShowPage(talker, "parman_q0221_05.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3268) == 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "parman_q0221_10.htm");
myself.DeleteItem1(talker, 3268, 1);
myself.GiveItem1(talker, 3240, 1);
myself.GiveItem1(talker, 3269, 1);
myself.SetFlagJournal(talker, 221, 4);
myself.ShowQuestMark(talker, 221);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3269) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "parman_q0221_11.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3270) >= 1 || gg.OwnItemCount(talker, 3271) >= 1 || gg.OwnItemCount(talker, 3272) >= 1 && gg.OwnItemCount(talker, 3240) == 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "parman_q0221_12.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3245) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 1199958);
myself.IncrementParam(talker, 1, 80080);
myself.GiveItem1(talker, 57, 217682);
myself.DeleteItem1(talker, 3240, gg.OwnItemCount(talker, 3240));
myself.DeleteItem1(talker, 3245, 1);
myself.GiveItem1(talker, 3238, 1);
myself.ShowPage(talker, "parman_q0221_13.htm");
myself.RemoveMemo(talker, 221);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 221, 1);
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
if (quest_id == 221) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 221) == 0 && myself.GetOneTimeQuestFlag(talker, 221) == 0 && myself.GetMemoCount(talker) < 41 && talker.race == 4 && talker.level >= 37 && myself.IsInCategory(22, talker.occupation)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 3239) == 0) {
myself.GiveItem1(talker, 3239, 1);

}
myself.SetFlagJournal(talker, 221, 1);
myself.ShowQuestMark(talker, 221);
myself.SoundEffect(talker, "ItemSound.quest_middle");
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
myself.ShowQuestPage(talker, "parman_q0221_04e.htm", 221);

} else {
myself.ShowQuestPage(talker, "parman_q0221_04.htm", 221);

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 221) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 221) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "parman_q0221_08.htm");
myself.DeleteItem1(talker, 3239, gg.OwnItemCount(talker, 3239));
myself.DeleteItem1(talker, 3241, gg.OwnItemCount(talker, 3241));
myself.DeleteItem1(talker, 3242, gg.OwnItemCount(talker, 3242));
myself.DeleteItem1(talker, 3243, gg.OwnItemCount(talker, 3243));
myself.DeleteItem1(talker, 3244, gg.OwnItemCount(talker, 3244));
myself.GiveItem1(talker, 3240, 1);
myself.GiveItem1(talker, 3269, 1);
myself.SetFlagJournal(talker, 221, 4);
myself.ShowQuestMark(talker, 221);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}