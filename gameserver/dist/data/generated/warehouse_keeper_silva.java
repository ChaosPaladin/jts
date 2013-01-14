package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_keeper_silva extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 357) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Warehouse Keeper's Ambition");

}
if (gg.HaveMemo(talker, 357) == 1 && gg.OwnItemCount(talker, 5867) < 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Warehouse Keeper's Ambition (In Progress)");

}
if (gg.HaveMemo(talker, 357) == 1 && gg.OwnItemCount(talker, 5867) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Warehouse Keeper's Ambition (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 357) == 0) {
myself.SetCurrentQuestID(357);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 47) {
myself.ShowPage(talker, "warehouse_keeper_silva_q0357_01.htm");

} else if (talker.level >= 47) {
myself.ShowQuestPage(talker, "warehouse_keeper_silva_q0357_02.htm", 357);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 357) == 1 && gg.OwnItemCount(talker, 5867) < 1) {
myself.SetCurrentQuestID(357);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_silva_q0357_06.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 357) == 1 && gg.OwnItemCount(talker, 5867) >= 1) {
myself.SetCurrentQuestID(357);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_silva_q0357_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 357) {
myself.SetCurrentQuestID(357);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 357);
gg.AddLog(1, talker, 357);
myself.SetFlagJournal(talker, 357, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "warehouse_keeper_silva_q0357_05.htm", 357);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 357) {
myself.SetCurrentQuestID(357);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 357) {
if (reply == 1) {
myself.ShowQuestPage(talker, "warehouse_keeper_silva_q0357_03.htm", 357);

}
if (reply == 2) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_silva_q0357_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 357);
myself.ShowQuestFHTML(talker, fhtml0, 357);

}
if (reply == 3 && gg.HaveMemo(talker, 357) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 5867) < 100 && gg.OwnItemCount(talker, 5867) > 0) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5867) * 425 + 13500);
myself.DeleteItem1(talker, 5867, gg.OwnItemCount(talker, 5867));
myself.ShowPage(talker, "warehouse_keeper_silva_q0357_08.htm");
gg.AddLog(3, talker, 357);

} else if (gg.OwnItemCount(talker, 5867) >= 100) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5867) * 425 + 40500);
myself.DeleteItem1(talker, 5867, gg.OwnItemCount(talker, 5867));
myself.ShowPage(talker, "warehouse_keeper_silva_q0357_09.htm");
gg.AddLog(3, talker, 357);

}

}

}
if (reply == 4) {
myself.ShowPage(talker, "warehouse_keeper_silva_q0357_10.htm");

}
if (reply == 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 5867) < 100 && gg.OwnItemCount(talker, 5867) > 0) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5867) * 425);

} else if (gg.OwnItemCount(talker, 5867) >= 100) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5867) * 425 + 40500);

}
myself.DeleteItem1(talker, 5867, gg.OwnItemCount(talker, 5867));
myself.RemoveMemo(talker, 357);
gg.AddLog(2, talker, 357);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "warehouse_keeper_silva_q0357_11.htm");

}

}

}
super;
	}


}