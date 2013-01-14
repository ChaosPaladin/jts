package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class priestess_restina extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 368) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trespassing into the Holy Ground");

}
if (gg.HaveMemo(talker, 368) == 1 && gg.OwnItemCount(talker, 5881) < 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trespassing into the Holy Ground (In Progress)");

}
if (gg.HaveMemo(talker, 368) == 1 && gg.OwnItemCount(talker, 5881) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trespassing into the Holy Ground (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 368) == 0) {
myself.SetCurrentQuestID(368);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 36) {
myself.FHTML_SetFileName(fhtml0, "priestess_restina_q0368_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 368);
myself.ShowQuestFHTML(talker, fhtml0, 368);

} else if (talker.level < 36) {
myself.ShowPage(talker, "priestess_restina_q0368_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 368) == 1 && gg.OwnItemCount(talker, 5881) < 1) {
myself.SetCurrentQuestID(368);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priestess_restina_q0368_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 368) == 1 && gg.OwnItemCount(talker, 5881) >= 1) {
myself.SetCurrentQuestID(368);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 5881) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5881) * 250 + 9450);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5881) * 250 + 2000);

}
myself.DeleteItem1(talker, 5881, gg.OwnItemCount(talker, 5881));
gg.AddLog(3, talker, 368);
myself.ShowPage(talker, "priestess_restina_q0368_05.htm");

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
if (quest_id == 368) {
myself.SetCurrentQuestID(368);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
gg.AddLog(1, talker, 368);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "priestess_restina_q0368_03.htm", 368);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 368) {
myself.SetCurrentQuestID(368);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 368) {
if (reply == 1) {
myself.RemoveMemo(talker, 368);
gg.AddLog(2, talker, 368);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "priestess_restina_q0368_06.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "priestess_restina_q0368_07.htm");

}

}
super;
	}


}