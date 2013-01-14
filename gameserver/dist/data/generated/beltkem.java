package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class beltkem extends guard_stand {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 331) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Arrow of Vengeance");

}
if (gg.HaveMemo(talker, 331) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Arrow of Vengeance (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 331) == 0) {
myself.SetCurrentQuestID(331);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 32) {
myself.FHTML_SetFileName(fhtml0, "beltkem_q0331_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 331);
myself.ShowQuestFHTML(talker, fhtml0, 331);

} else {
myself.ShowQuestPage(talker, "beltkem_q0331_01.htm", 331);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 331) == 1) {
myself.SetCurrentQuestID(331);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1452) + gg.OwnItemCount(talker, 1453) + gg.OwnItemCount(talker, 1454) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1452) + gg.OwnItemCount(talker, 1453) + gg.OwnItemCount(talker, 1454) >= 10) {
myself.GiveItem1(talker, 57, 3100 + 78 * gg.OwnItemCount(talker, 1452) + 88 * gg.OwnItemCount(talker, 1453) + 92 * gg.OwnItemCount(talker, 1454));

} else {
myself.GiveItem1(talker, 57, 78 * gg.OwnItemCount(talker, 1452) + 88 * gg.OwnItemCount(talker, 1453) + 92 * gg.OwnItemCount(talker, 1454));

}
myself.DeleteItem1(talker, 1452, gg.OwnItemCount(talker, 1452));
myself.DeleteItem1(talker, 1453, gg.OwnItemCount(talker, 1453));
myself.DeleteItem1(talker, 1454, gg.OwnItemCount(talker, 1454));
myself.ShowPage(talker, "beltkem_q0331_05.htm");
gg.AddLog(3, talker, 331);

}

} else {
myself.ShowPage(talker, "beltkem_q0331_04.htm");

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
if (quest_id == 331) {
myself.SetCurrentQuestID(331);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
gg.AddLog(1, talker, 331);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "beltkem_q0331_03.htm", 331);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 331) {
myself.SetCurrentQuestID(331);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 331) {
if (reply == 1) {
myself.ShowPage(talker, "beltkem_q0331_06.htm");
myself.RemoveMemo(talker, 331);
gg.AddLog(2, talker, 331);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (reply == 2) {
myself.ShowPage(talker, "beltkem_q0331_07.htm");

}

}
super;
	}


}