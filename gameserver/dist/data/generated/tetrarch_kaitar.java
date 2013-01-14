package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tetrarch_kaitar extends npc_elder {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 320) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Bones Tell the Future");

}
if (gg.HaveMemo(talker, 320)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Bones Tell the Future (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 320) == 0) {
myself.SetCurrentQuestID(320);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 2) {
myself.ShowQuestPage(talker, "tetrarch_kaitar_q0320_00.htm", 320);

} else if (talker.level >= 10) {
myself.FHTML_SetFileName(fhtml0, "tetrarch_kaitar_q0320_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 320);
myself.ShowQuestFHTML(talker, fhtml0, 320);

} else {
myself.ShowQuestPage(talker, "tetrarch_kaitar_q0320_02.htm", 320);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 320)) {
myself.SetCurrentQuestID(320);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 809) >= 0 && gg.OwnItemCount(talker, 809) < 10) {
myself.ShowPage(talker, "tetrarch_kaitar_q0320_05.htm");

} else if (gg.OwnItemCount(talker, 809) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tetrarch_kaitar_q0320_06.htm");
myself.GiveItem1(talker, 57, 8470);
myself.DeleteItem1(talker, 809, gg.OwnItemCount(talker, 809));
myself.RemoveMemo(talker, 320);
gg.AddLog(2, talker, 320);
gg.AddLog(3, talker, 320);
myself.SoundEffect(talker, "ItemSound.quest_finish");

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
if (quest_id == 320) {
myself.SetCurrentQuestID(320);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "tetrarch_kaitar_q0320_04.htm", 320);
myself.SetMemo(talker, 320);
myself.ShowQuestMark(talker, 320);
myself.SetFlagJournal(talker, 320, 1);
gg.AddLog(1, talker, 320);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}
return;

}
super;
	}


}