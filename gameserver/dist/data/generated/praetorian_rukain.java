package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class praetorian_rukain extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 271) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Proof of Valor");

}
if (gg.HaveMemo(talker, 271)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Proof of Valor (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 271) == 0) {
myself.SetCurrentQuestID(271);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 3) {
myself.ShowQuestPage(talker, "praetorian_rukain_q0271_00.htm", 271);

} else if (talker.level < 4) {
myself.ShowQuestPage(talker, "praetorian_rukain_q0271_01.htm", 271);

} else if (gg.OwnItemCount(talker, 1506) || gg.OwnItemCount(talker, 1507)) {
myself.FHTML_SetFileName(fhtml0, "praetorian_rukain_q0271_06.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 271);
myself.ShowQuestFHTML(talker, fhtml0, 271);

} else {
myself.FHTML_SetFileName(fhtml0, "praetorian_rukain_q0271_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 271);
myself.ShowQuestFHTML(talker, fhtml0, 271);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 271)) {
myself.SetCurrentQuestID(271);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1473) < 50) {
myself.ShowPage(talker, "praetorian_rukain_q0271_04.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.RemoveMemo(talker, 271);
gg.AddLog(2, talker, 271);
gg.AddLog(3, talker, 271);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.DeleteItem1(talker, 1473, gg.OwnItemCount(talker, 1473));
i0 = gg.Rand(100);
if (i0 <= 13) {
myself.GiveItem1(talker, 1507, 1);
myself.GiveItem1(talker, 1061, 10);

} else {
myself.GiveItem1(talker, 1506, 1);

}
myself.ShowPage(talker, "praetorian_rukain_q0271_05.htm");

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
if (quest_id == 271) {
myself.SetCurrentQuestID(271);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 271);
myself.ShowQuestMark(talker, 271);
gg.AddLog(1, talker, 271);
myself.SetFlagJournal(talker, 271, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 1506) && gg.OwnItemCount(talker, 1507) > 0) {
myself.ShowQuestPage(talker, "praetorian_rukain_q0271_07.htm", 271);

} else {
myself.ShowQuestPage(talker, "praetorian_rukain_q0271_03.htm", 271);

}

}
return;

}
super;
	}


}