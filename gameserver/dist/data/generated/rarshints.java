package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rarshints extends guard_stand {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 34 && gg.HaveMemo(talker, 300) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Leto Lizardmen Hunting");

}
if (talker.level < 34 && gg.HaveMemo(talker, 300) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Leto Lizardmen Hunting");

}
if (gg.HaveMemo(talker, 300) == 1 && gg.GetMemoState(talker, 300) >= 1 * 10 + 1 && gg.GetMemoState(talker, 300) <= 1 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Leto Lizardmen Hunting (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 34 && gg.HaveMemo(talker, 300) == 0) {
myself.SetCurrentQuestID(300);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "rarshints_q0300_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 300);
myself.ShowQuestFHTML(talker, fhtml0, 300);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 34 && gg.HaveMemo(talker, 300) == 0) {
myself.SetCurrentQuestID(300);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "rarshints_q0300_0103.htm", 300);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 300) == 1 && gg.GetMemoState(talker, 300) >= 1 * 10 + 1 && gg.GetMemoState(talker, 300) <= 1 * 10 + 2) {
myself.SetCurrentQuestID(300);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 300) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7139) >= 60) {
myself.SetHTMLCookie(talker, 300, 1);
myself.ShowPage(talker, "rarshints_q0300_0105.htm");

} else {
myself.ShowPage(talker, "rarshints_q0300_0106.htm");

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
if (quest_id == 300) {
myself.SetCurrentQuestID(300);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 300);
myself.ShowQuestMark(talker, 300);
myself.SetMemoState(talker, 300, 1 * 10 + 1);
gg.AddLog(1, talker, 300);
myself.SetFlagJournal(talker, 300, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "rarshints_q0300_0104.htm", 300);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 300) {
myself.SetCurrentQuestID(300);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 300) {
i0 = myself.GetHTMLCookie(talker, 300, 2 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 300) == 1) {
if (gg.OwnItemCount(talker, 7139) >= 60) {
i1 = gg.Rand(1000);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7139, gg.OwnItemCount(talker, 7139));
if (i1 < 500) {
myself.GiveItem1(talker, 57, 30000);

} else if (i1 < 500 + 250) {
myself.GiveItem1(talker, 1867, 50);

} else if (i1 < 500 + 250 + 250) {
myself.GiveItem1(talker, 1872, 50);

}

}
gg.AddLog(2, talker, 300);
gg.AddLog(3, talker, 300);
myself.RemoveMemo(talker, 300);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "rarshints_q0300_0201.htm");

} else {
myself.ShowPage(talker, "rarshints_q0300_0202.htm");

}

}

}

}
super;
	}


}