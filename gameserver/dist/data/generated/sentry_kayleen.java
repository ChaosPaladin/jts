package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sentry_kayleen extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 263) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Orc Subjugation");

}
if (gg.HaveMemo(talker, 263) == 1 && gg.OwnItemCount(talker, 1116) == 0 && gg.OwnItemCount(talker, 1117) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Orc Subjugation (In Progress)");

}
if (gg.HaveMemo(talker, 263) == 1 && gg.OwnItemCount(talker, 1116) > 0 || gg.OwnItemCount(talker, 1117) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Orc Subjugation (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 263) == 0) {
myself.SetCurrentQuestID(263);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 8 && talker.race == 2) {
myself.FHTML_SetFileName(fhtml0, "sentry_kayleen_q0263_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 263);
myself.ShowQuestFHTML(talker, fhtml0, 263);

} else if (talker.race != 2) {
myself.ShowQuestPage(talker, "sentry_kayleen_q0263_00.htm", 263);

} else if (talker.level < 8) {
myself.ShowQuestPage(talker, "sentry_kayleen_q0263_01.htm", 263);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 263) == 1 && gg.OwnItemCount(talker, 1116) == 0 && gg.OwnItemCount(talker, 1117) == 0) {
myself.SetCurrentQuestID(263);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sentry_kayleen_q0263_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 263) == 1 && gg.OwnItemCount(talker, 1116) > 0 || gg.OwnItemCount(talker, 1117) > 0) {
myself.SetCurrentQuestID(263);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sentry_kayleen_q0263_05.htm");
if (gg.OwnItemCount(talker, 1116) + gg.OwnItemCount(talker, 1117) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1116) * 20 + gg.OwnItemCount(talker, 1117) * 30 + 1100);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1116) * 20 + gg.OwnItemCount(talker, 1117) * 30);

}
myself.DeleteItem1(talker, 1116, gg.OwnItemCount(talker, 1116));
myself.DeleteItem1(talker, 1117, gg.OwnItemCount(talker, 1117));
gg.AddLog(3, talker, 263);

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
if (quest_id == 263) {
myself.SetCurrentQuestID(263);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 263);
myself.ShowQuestMark(talker, 263);
gg.AddLog(1, talker, 263);
myself.SetFlagJournal(talker, 263, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sentry_kayleen_q0263_03.htm", 263);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 263) {
myself.SetCurrentQuestID(263);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 263) {
if (reply == 2) {
myself.ShowPage(talker, "sentry_kayleen_q0263_06.htm");
myself.RemoveMemo(talker, 263);
gg.AddLog(2, talker, 263);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (reply == 1) {
myself.ShowPage(talker, "sentry_kayleen_q0263_07.htm");

}

}
super;
	}


}