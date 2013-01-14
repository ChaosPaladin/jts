package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sentry_krpion extends guard_stand {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1156) == 1 && gg.OwnItemCount(talker, 1154) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Deliver Supplies (In Progress)");

}
if (gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1156) == 0 && gg.OwnItemCount(talker, 1157) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Deliver Supplies (In Progress)");

}
if (gg.HaveMemo(talker, 265) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Bonds of Slavery");

}
if (gg.HaveMemo(talker, 265) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Bonds of Slavery (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1156) == 1 && gg.OwnItemCount(talker, 1154) == 0) {
myself.SetCurrentQuestID(168);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sentry_krpion_q0325_01.htm");
myself.DeleteItem1(talker, 1156, 1);
myself.GiveItem1(talker, 1157, 1);
if (gg.OwnItemCount(talker, 1157) >= 1) {
myself.SetFlagJournal(talker, 168, 4);
myself.ShowQuestMark(talker, 168);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1156) == 0 && gg.OwnItemCount(talker, 1157) >= 1) {
myself.SetCurrentQuestID(168);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sentry_krpion_q0325_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 265) == 0) {
myself.SetCurrentQuestID(265);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 6 && talker.race == 2) {
myself.FHTML_SetFileName(fhtml0, "sentry_krpion_q0265_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 265);
myself.ShowQuestFHTML(talker, fhtml0, 265);

} else if (talker.race != 2) {
myself.ShowQuestPage(talker, "sentry_krpion_q0265_00.htm", 265);

} else if (talker.level < 6) {
myself.ShowQuestPage(talker, "sentry_krpion_q0265_01.htm", 265);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 265) == 1) {
myself.SetCurrentQuestID(265);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1368) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1368) >= 10) {
myself.GiveItem1(talker, 57, 12 * gg.OwnItemCount(talker, 1368) + 500);

} else {
myself.GiveItem1(talker, 57, 12 * gg.OwnItemCount(talker, 1368));

}
myself.DeleteItem1(talker, 1368, gg.OwnItemCount(talker, 1368));
if (talker.level < 25 && myself.IsInCategory(0, talker.occupation) && myself.GetOneTimeQuestFlag(talker, 57) == 0) {
myself.GiveItem1(talker, 5789, 6000);
myself.SetOneTimeQuestFlag(talker, 57, 1);
myself.ShowQuestionMark(talker, 26);
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);

}
if (talker.level < 25 && myself.IsInCategory(1, talker.occupation) && myself.GetOneTimeQuestFlag(talker, 57) == 0) {
myself.VoiceEffect(talker, "tutorial_voice_027", 1000);
myself.GiveItem1(talker, 5790, 3000);
myself.SetOneTimeQuestFlag(talker, 57, 1);
myself.ShowQuestionMark(talker, 26);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 1000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4152, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 10000 / 1000 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 1000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4152, "", "", "", "", ""));

}
myself.ShowPage(talker, "sentry_krpion_q0265_05.htm");
gg.AddLog(3, talker, 265);

}

} else {
myself.ShowPage(talker, "sentry_krpion_q0265_04.htm");

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
if (quest_id == 265) {
myself.SetCurrentQuestID(265);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 265);
gg.AddLog(1, talker, 265);
myself.SetFlagJournal(talker, 265, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sentry_krpion_q0265_03.htm", 265);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 265) {
myself.SetCurrentQuestID(265);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 265) {
if (reply == 1) {
myself.ShowPage(talker, "sentry_krpion_q0265_06.htm");
myself.RemoveMemo(talker, 265);
gg.AddLog(2, talker, 265);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (reply == 2) {
myself.ShowPage(talker, "sentry_krpion_q0265_07.htm");

}

}
super;
	}


}