package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class seer_reva extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 371) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Shrieks of Ghosts");

}
if (gg.HaveMemo(talker, 371) == 1 && gg.OwnItemCount(talker, 6002) < 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Shrieks of Ghosts (In Progress)");

}
if (gg.HaveMemo(talker, 371) == 1 && gg.OwnItemCount(talker, 6002) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Shrieks of Ghosts (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 371) == 0) {
myself.SetCurrentQuestID(371);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 59) {
myself.ShowPage(talker, "seer_reva_q0371_01.htm");

} else if (talker.level >= 59) {
myself.FHTML_SetFileName(fhtml0, "seer_reva_q0371_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 371);
myself.ShowQuestFHTML(talker, fhtml0, 371);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 371) == 1 && gg.OwnItemCount(talker, 6002) < 1) {
myself.SetCurrentQuestID(371);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_reva_q0371_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 371) == 1 && gg.OwnItemCount(talker, 6002) >= 1) {
myself.SetCurrentQuestID(371);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_reva_q0371_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 371) {
myself.SetCurrentQuestID(371);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "seer_reva_q0371_03.htm", 371);
gg.AddLog(1, talker, 371);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 371) {
myself.SetCurrentQuestID(371);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 371) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 5903) < 1) {
myself.ShowPage(talker, "seer_reva_q0371_06.htm");

}
if (gg.OwnItemCount(talker, 5903) >= 1 && gg.OwnItemCount(talker, 5903) < 100) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5903) * 1000 + 15000);
myself.DeleteItem1(talker, 5903, gg.OwnItemCount(talker, 5903));
myself.ShowPage(talker, "seer_reva_q0371_07.htm");

}

}
if (gg.OwnItemCount(talker, 5903) >= 100) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5903) * 1000 + 37700);
myself.DeleteItem1(talker, 5903, gg.OwnItemCount(talker, 5903));
myself.ShowPage(talker, "seer_reva_q0371_08.htm");

}

}
gg.AddLog(3, talker, 371);

}
if (reply == 2) {
myself.ShowPage(talker, "seer_reva_q0371_09.htm");

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 5903) > 0) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 5903) * 1000);

}
myself.DeleteItem1(talker, 5903, gg.OwnItemCount(talker, 5903));
myself.RemoveMemo(talker, 371);
gg.AddLog(2, talker, 371);
gg.AddLog(3, talker, 371);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "seer_reva_q0371_10.htm");

}

}

}
super;
	}


}