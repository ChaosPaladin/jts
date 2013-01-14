package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sentinel_rayjien extends guard_stand {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 260) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Orc Hunting");

}
if (gg.HaveMemo(talker, 260) == 1 && gg.OwnItemCount(talker, 1114) == 0 && gg.OwnItemCount(talker, 1115) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Orc Hunting (In Progress)");

}
if (gg.HaveMemo(talker, 260) == 1 && gg.OwnItemCount(talker, 1114) > 0 || gg.OwnItemCount(talker, 1115) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Orc Hunting (In Progress)");

}
if (gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 746) == 1 && gg.OwnItemCount(talker, 1133) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Sea of Spores Fever (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 260) == 0) {
myself.SetCurrentQuestID(260);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 6 && talker.race == 1) {
myself.FHTML_SetFileName(fhtml0, "sentinel_rayjien_q0260_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 260);
myself.ShowQuestFHTML(talker, fhtml0, 260);

} else if (talker.race != 1) {
myself.ShowQuestPage(talker, "sentinel_rayjien_q0260_00.htm", 260);

} else if (talker.level < 6) {
myself.ShowQuestPage(talker, "sentinel_rayjien_q0260_01.htm", 260);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 260) == 1 && gg.OwnItemCount(talker, 1114) == 0 && gg.OwnItemCount(talker, 1115) == 0) {
myself.SetCurrentQuestID(260);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sentinel_rayjien_q0260_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 260) == 1 && gg.OwnItemCount(talker, 1114) > 0 || gg.OwnItemCount(talker, 1115) > 0) {
myself.SetCurrentQuestID(260);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sentinel_rayjien_q0260_05.htm");
if (gg.OwnItemCount(talker, 1114) + gg.OwnItemCount(talker, 1115) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1114) * 12 + gg.OwnItemCount(talker, 1115) * 30 + 1000);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1114) * 12 + gg.OwnItemCount(talker, 1115) * 30);

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
myself.DeleteItem1(talker, 1114, gg.OwnItemCount(talker, 1114));
myself.DeleteItem1(talker, 1115, gg.OwnItemCount(talker, 1115));
gg.AddLog(3, talker, 260);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 746) == 1 && gg.OwnItemCount(talker, 1133) == 1) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 102, gg.OwnItemCount(talker, 1130) + gg.OwnItemCount(talker, 1131) + gg.OwnItemCount(talker, 1132) + gg.OwnItemCount(talker, 1133) + gg.OwnItemCount(talker, 1134));
myself.DeleteItem1(talker, 1133, 1);
if (gg.OwnItemCount(talker, 1130) + gg.OwnItemCount(talker, 1131) + gg.OwnItemCount(talker, 1132) + gg.OwnItemCount(talker, 1134) < 1) {
myself.SetFlagJournal(talker, 102, 6);
myself.ShowQuestMark(talker, 102);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
myself.ShowPage(talker, "sentinel_rayjien_q0102_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 260) {
myself.SetCurrentQuestID(260);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 260);
myself.ShowQuestMark(talker, 260);
gg.AddLog(1, talker, 260);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sentinel_rayjien_q0260_03.htm", 260);
myself.SetFlagJournal(talker, 260, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 260) {
myself.SetCurrentQuestID(260);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 260) {
if (reply == 2) {
myself.ShowPage(talker, "sentinel_rayjien_q0260_06.htm");
myself.RemoveMemo(talker, 260);
gg.AddLog(2, talker, 260);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (reply == 1) {
myself.ShowPage(talker, "sentinel_rayjien_q0260_07.htm");

}

}
super;
	}


}