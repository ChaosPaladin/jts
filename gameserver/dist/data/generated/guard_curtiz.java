package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_curtiz extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 325) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Grim Collector");

}
if (gg.HaveMemo(talker, 325) == 1 && gg.OwnItemCount(talker, 1349) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Grim Collector (In Progress)");

}
if (gg.HaveMemo(talker, 325) == 1 && gg.OwnItemCount(talker, 1349) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Grim Collector (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 325) == 0) {
myself.SetCurrentQuestID(325);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 15) {
myself.FHTML_SetFileName(fhtml0, "guard_curtiz_q0325_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 325);
myself.ShowQuestFHTML(talker, fhtml0, 325);

} else {
myself.ShowQuestPage(talker, "guard_curtiz_q0325_01.htm", 325);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 325) == 1 && gg.OwnItemCount(talker, 1349) == 0) {
myself.SetCurrentQuestID(325);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_curtiz_q0325_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 325) == 1 && gg.OwnItemCount(talker, 1349) == 1) {
myself.SetCurrentQuestID(325);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_curtiz_q0325_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 325) {
myself.SetCurrentQuestID(325);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 325);
myself.ShowQuestMark(talker, 325);
gg.AddLog(1, talker, 325);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "guard_curtiz_q0325_03.htm", 325);

}
return;

}
super;
	}


}