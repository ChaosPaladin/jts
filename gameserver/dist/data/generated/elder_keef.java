package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class elder_keef extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 294) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Covert Business");

}
if (gg.HaveMemo(talker, 294) == 1 && gg.OwnItemCount(talker, 1491) < 100) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Covert Business (In Progress)");

}
if (gg.HaveMemo(talker, 294) == 1 && gg.OwnItemCount(talker, 1491) >= 100) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Covert Business (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3249) >= 1 && gg.OwnItemCount(talker, 3260) == 0 && gg.OwnItemCount(talker, 3263) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3260) == 0 && gg.OwnItemCount(talker, 3263) == 0 && gg.OwnItemCount(talker, 3249) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3263) >= 1 && gg.OwnItemCount(talker, 3249) == 0 && gg.OwnItemCount(talker, 3260) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3260) >= 1 && gg.OwnItemCount(talker, 3263) == 0 && gg.OwnItemCount(talker, 3249) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Prosperity (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 294) == 0) {
myself.SetCurrentQuestID(294);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 4) {
myself.ShowQuestPage(talker, "elder_keef_q0294_00.htm", 294);

} else if (talker.level >= 10) {
myself.FHTML_SetFileName(fhtml0, "elder_keef_q0294_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 294);
myself.ShowQuestFHTML(talker, fhtml0, 294);

} else {
myself.ShowQuestPage(talker, "elder_keef_q0294_01.htm", 294);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 294) == 1 && gg.OwnItemCount(talker, 1491) < 100) {
myself.SetCurrentQuestID(294);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_keef_q0294_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 294) == 1 && gg.OwnItemCount(talker, 1491) >= 100) {
myself.SetCurrentQuestID(294);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1508) < 1) {
myself.ShowPage(talker, "elder_keef_q0294_05.htm");
myself.GiveItem1(talker, 1508, 1);
myself.IncrementParam(talker, 1, 600);
myself.DeleteItem1(talker, 1491, gg.OwnItemCount(talker, 1491));
myself.RemoveMemo(talker, 294);
gg.AddLog(2, talker, 294);
gg.AddLog(3, talker, 294);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (gg.OwnItemCount(talker, 1508) >= 1) {
myself.ShowPage(talker, "elder_keef_q0294_06.htm");
myself.GiveItem1(talker, 57, 2400);
myself.IncrementParam(talker, 1, 600);
myself.DeleteItem1(talker, 1491, gg.OwnItemCount(talker, 1491));
myself.RemoveMemo(talker, 294);
gg.AddLog(2, talker, 294);
gg.AddLog(3, talker, 294);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_keef_q0231_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3249) >= 1 && gg.OwnItemCount(talker, 3260) == 0 && gg.OwnItemCount(talker, 3263) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_keef_q0221_01.htm");
myself.DeleteItem1(talker, 3249, gg.OwnItemCount(talker, 3249));

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3260) == 0 && gg.OwnItemCount(talker, 3263) == 0 && gg.OwnItemCount(talker, 3249) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_keef_q0221_02.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3263) >= 1 && gg.OwnItemCount(talker, 3249) == 0 && gg.OwnItemCount(talker, 3260) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_keef_q0221_03.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3260) >= 1 && gg.OwnItemCount(talker, 3263) == 0 && gg.OwnItemCount(talker, 3249) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_keef_q0221_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 294) {
myself.SetCurrentQuestID(294);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 294);
myself.ShowQuestMark(talker, 294);
gg.AddLog(1, talker, 294);
myself.SetFlagJournal(talker, 294, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "elder_keef_q0294_03.htm", 294);

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
if (gg.OwnItemCount(talker, 57) < 5000) {
myself.ShowPage(talker, "elder_keef_q0221_03a.htm");

} else if (gg.OwnItemCount(talker, 3263) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_keef_q0221_03b.htm");
myself.DeleteItem1(talker, 57, 5000);
myself.DeleteItem1(talker, 3263, 1);
myself.GiveItem1(talker, 3260, 1);

}

}

}

}
super;
	}


}