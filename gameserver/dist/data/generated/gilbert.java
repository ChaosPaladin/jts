package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gilbert extends chief_guard {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 257) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "The Guard is Busy");

}
if (gg.HaveMemo(talker, 257) == 1 && gg.OwnItemCount(talker, 752) < 1 && gg.OwnItemCount(talker, 1085) < 1 && gg.OwnItemCount(talker, 1086) < 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "The Guard is Busy (In Progress)");

}
if (gg.HaveMemo(talker, 257) == 1 && gg.OwnItemCount(talker, 752) > 0 || gg.OwnItemCount(talker, 1085) > 0 || gg.OwnItemCount(talker, 1086) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "The Guard is Busy (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1176) == 0 && gg.OwnItemCount(talker, 1271) && gg.OwnItemCount(talker, 1166) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1176) > 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1166) > 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Human Knight (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 257) == 0) {
myself.SetCurrentQuestID(257);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 6) {
myself.FHTML_SetFileName(fhtml0, "gilbert_q0257_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 257);
myself.ShowQuestFHTML(talker, fhtml0, 257);

} else {
myself.ShowQuestPage(talker, "gilbert_q0257_01.htm", 257);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 257) == 1 && gg.OwnItemCount(talker, 752) < 1 && gg.OwnItemCount(talker, 1085) < 1 && gg.OwnItemCount(talker, 1086) < 1) {
myself.SetCurrentQuestID(257);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gilbert_q0257_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 257) == 1 && gg.OwnItemCount(talker, 752) > 0 || gg.OwnItemCount(talker, 1085) > 0 || gg.OwnItemCount(talker, 1086) > 0) {
myself.SetCurrentQuestID(257);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gilbert_q0257_07.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 752) + gg.OwnItemCount(talker, 1085) + gg.OwnItemCount(talker, 1086) >= 10) {
myself.GiveItem1(talker, 57, 10 * gg.OwnItemCount(talker, 752) + 20 * gg.OwnItemCount(talker, 1085) + 20 * gg.OwnItemCount(talker, 1086) + 1000);

} else {
myself.GiveItem1(talker, 57, 10 * gg.OwnItemCount(talker, 752) + 20 * gg.OwnItemCount(talker, 1085) + 20 * gg.OwnItemCount(talker, 1086));

}
if (talker.level < 25 && myself.IsInCategory(0, talker.occupation) && myself.GetOneTimeQuestFlag(talker, 57) == 0) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 6000);
myself.SetOneTimeQuestFlag(talker, 57, 1);
myself.ShowQuestionMark(talker, 26);

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
myself.DeleteItem1(talker, 752, gg.OwnItemCount(talker, 752));
myself.DeleteItem1(talker, 1085, gg.OwnItemCount(talker, 1085));
myself.DeleteItem1(talker, 1086, gg.OwnItemCount(talker, 1086));
gg.AddLog(3, talker, 257);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1176) == 0 && gg.OwnItemCount(talker, 1271) && gg.OwnItemCount(talker, 1166) == 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gilbert_q0402_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1176) > 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1177) < 20) {
myself.ShowPage(talker, "gilbert_q0402_03.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gilbert_q0402_04.htm");
myself.DeleteItem1(talker, 1177, gg.OwnItemCount(talker, 1177));
myself.DeleteItem1(talker, 1176, 1);
myself.GiveItem1(talker, 1166, 1);

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1166) > 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gilbert_q0402_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 257) {
myself.SetCurrentQuestID(257);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "gilbert_q0257_03.htm", 257);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 257);
gg.AddLog(1, talker, 257);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 1084, 1);
myself.SetFlagJournal(talker, 257, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 257) {
myself.SetCurrentQuestID(257);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 257) {
if (reply == 2) {
myself.ShowPage(talker, "gilbert_q0257_05.htm");
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1084, gg.OwnItemCount(talker, 1084));
myself.RemoveMemo(talker, 257);
gg.AddLog(2, talker, 257);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (reply == 3) {
myself.ShowPage(talker, "gilbert_q0257_06.htm");

}

}
if (ask == 402) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 402) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gilbert_q0402_02.htm");
myself.GiveItem1(talker, 1176, 1);

}

}

}
super;
	}


}