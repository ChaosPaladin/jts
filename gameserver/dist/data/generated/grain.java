package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class grain extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 2) == 1 && myself.GetOneTimeQuestFlag(talker, 2) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "What Women Want (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1218) != 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1272) != 0 && gg.OwnItemCount(talker, 1219) < 5) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1272) != 0 && gg.OwnItemCount(talker, 1219) >= 5) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Elven Wizard (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 2) == 1 && myself.GetOneTimeQuestFlag(talker, 2) == 0) {
myself.SetCurrentQuestID(2);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 689)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "grain_q0002_02.htm");
myself.SetFlagJournal(talker, 2, 5);
myself.ShowQuestMark(talker, 2);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 689, 1);
myself.GiveItem1(talker, 693, 1);

}

} else if (gg.OwnItemCount(talker, 693)) {
myself.ShowPage(talker, "grain_q0002_03.htm");

} else if (gg.OwnItemCount(talker, 1092) || gg.OwnItemCount(talker, 1093) || gg.OwnItemCount(talker, 1094)) {
myself.ShowPage(talker, "grain_q0002_01.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1218) != 0) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grain_q0408_01.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1272) != 0 && gg.OwnItemCount(talker, 1219) < 5) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grain_q0408_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1272) != 0 && gg.OwnItemCount(talker, 1219) >= 5) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1219, gg.OwnItemCount(talker, 1219));
myself.DeleteItem1(talker, 1272, gg.OwnItemCount(talker, 1272));
if (gg.OwnItemCount(talker, 1220) == 0) {
myself.GiveItem1(talker, 1220, 1);

}
myself.ShowPage(talker, "grain_q0408_04.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 408) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 408 && reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1218) != 0) {
myself.DeleteItem1(talker, 1218, gg.OwnItemCount(talker, 1218));
if (gg.OwnItemCount(talker, 1272) == 0) {
myself.GiveItem1(talker, 1272, 1);

}
myself.ShowPage(talker, "grain_q0408_02.htm");

} else {
myself.Say("뭔가 에러.");

}

}

}
super;
	}


}