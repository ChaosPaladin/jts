package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_nell extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 369) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Collector of Jewels");

}
if (gg.HaveMemo(talker, 369) == 1 && gg.OwnItemCount(talker, 5883) < 50 || gg.OwnItemCount(talker, 5882) < 50 && gg.GetMemoState(talker, 369) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Collector of Jewels (In Progress)");

}
if (gg.HaveMemo(talker, 369) == 1 && gg.OwnItemCount(talker, 5883) >= 50 && gg.OwnItemCount(talker, 5882) >= 50 && gg.GetMemoState(talker, 369) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Collector of Jewels (In Progress)");

}
if (gg.HaveMemo(talker, 369) == 1 && gg.GetMemoState(talker, 369) == 2) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Collector of Jewels (In Progress)");

}
if (gg.HaveMemo(talker, 369) == 1 && gg.GetMemoState(talker, 369) == 3 && gg.OwnItemCount(talker, 5883) < 200 || gg.OwnItemCount(talker, 5882) < 200) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Collector of Jewels (In Progress)");

}
if (gg.HaveMemo(talker, 369) == 1 && gg.GetMemoState(talker, 369) == 3 && gg.OwnItemCount(talker, 5883) >= 200 && gg.OwnItemCount(talker, 5882) >= 200) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Collector of Jewels (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 369) == 0) {
myself.SetCurrentQuestID(369);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 25) {
myself.ShowPage(talker, "magister_nell_q0369_01.htm");

} else if (talker.level >= 25) {
myself.FHTML_SetFileName(fhtml0, "magister_nell_q0369_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 369);
myself.ShowQuestFHTML(talker, fhtml0, 369);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 369) == 1 && gg.OwnItemCount(talker, 5883) < 50 || gg.OwnItemCount(talker, 5882) < 50 && gg.GetMemoState(talker, 369) == 1) {
myself.SetCurrentQuestID(369);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_nell_q0369_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 369) == 1 && gg.OwnItemCount(talker, 5883) >= 50 && gg.OwnItemCount(talker, 5882) >= 50 && gg.GetMemoState(talker, 369) == 1) {
myself.SetCurrentQuestID(369);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 31810);
myself.DeleteItem1(talker, 5882, gg.OwnItemCount(talker, 5882));
myself.DeleteItem1(talker, 5883, gg.OwnItemCount(talker, 5883));
gg.AddLog(3, talker, 369);
myself.SetMemoState(talker, 369, 2);
myself.ShowPage(talker, "magister_nell_q0369_05.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 369) == 1 && gg.GetMemoState(talker, 369) == 2) {
myself.SetCurrentQuestID(369);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_nell_q0369_09.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 369) == 1 && gg.GetMemoState(talker, 369) == 3 && gg.OwnItemCount(talker, 5883) < 200 || gg.OwnItemCount(talker, 5882) < 200) {
myself.SetCurrentQuestID(369);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_nell_q0369_10.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 369) == 1 && gg.GetMemoState(talker, 369) == 3 && gg.OwnItemCount(talker, 5883) >= 200 && gg.OwnItemCount(talker, 5882) >= 200) {
myself.SetCurrentQuestID(369);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 84415);
myself.DeleteItem1(talker, 5882, gg.OwnItemCount(talker, 5882));
myself.DeleteItem1(talker, 5883, gg.OwnItemCount(talker, 5883));
myself.RemoveMemo(talker, 369);
gg.AddLog(2, talker, 369);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "magister_nell_q0369_11.htm");

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
if (quest_id == 369) {
myself.SetCurrentQuestID(369);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 369);
myself.SetMemoState(talker, 369, 1);
gg.AddLog(1, talker, 369);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "magister_nell_q0369_03.htm", 369);
myself.SetFlagJournal(talker, 369, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 369) {
myself.SetCurrentQuestID(369);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 369) {
if (reply == 1) {
myself.SetMemoState(talker, 369, 3);
myself.ShowPage(talker, "magister_nell_q0369_07.htm");
myself.SetFlagJournal(talker, 369, 3);
myself.ShowQuestMark(talker, 369);

}
if (reply == 2) {
myself.DeleteItem1(talker, 5882, gg.OwnItemCount(talker, 5882));
myself.DeleteItem1(talker, 5883, gg.OwnItemCount(talker, 5883));
myself.RemoveMemo(talker, 369);
gg.AddLog(2, talker, 369);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "magister_nell_q0369_08.htm");

}

}
super;
	}


}