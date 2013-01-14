package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class atuba_chief_varkees extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 4) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Long Live the Pa'agrio Lord (In Progress)");

}
if (gg.HaveMemo(talker, 273) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Invaders of the Holy Land");

}
if (gg.HaveMemo(talker, 273)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Invaders of the Holy Land (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) == 1 && gg.OwnItemCount(talker, 3400) == 0 && gg.OwnItemCount(talker, 3392) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3400) == 0 && gg.OwnItemCount(talker, 3399) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3392) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3400) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3392) >= 1 && gg.OwnItemCount(talker, 3399) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3392) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3400) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of the Lord (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 4) == 1) {
myself.SetCurrentQuestID(4);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1541) < 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "atuba_chief_varkees_q0004_01.htm");
myself.GiveItem1(talker, 1541, 1);
if (gg.OwnItemCount(talker, 1541) + gg.OwnItemCount(talker, 1542) + gg.OwnItemCount(talker, 1543) + gg.OwnItemCount(talker, 1544) + gg.OwnItemCount(talker, 1545) + gg.OwnItemCount(talker, 1546) >= 5) {
myself.SetFlagJournal(talker, 4, 2);
myself.ShowQuestMark(talker, 4);

}
myself.SoundEffect(talker, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(talker, 1541) >= 1) {
myself.ShowPage(talker, "atuba_chief_varkees_q0004_02.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 273) == 0) {
myself.SetCurrentQuestID(273);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 3) {
myself.ShowQuestPage(talker, "atuba_chief_varkees_q0273_00.htm", 273);

} else if (talker.level < 6) {
myself.ShowQuestPage(talker, "atuba_chief_varkees_q0273_01.htm", 273);

} else {
myself.FHTML_SetFileName(fhtml0, "atuba_chief_varkees_q0273_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 273);
myself.ShowQuestFHTML(talker, fhtml0, 273);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 273)) {
myself.SetCurrentQuestID(273);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1475) + gg.OwnItemCount(talker, 1476) == 0) {
myself.ShowPage(talker, "atuba_chief_varkees_q0273_04.htm");

} else if (gg.OwnItemCount(talker, 1476) == 0) {
i0 = gg.OwnItemCount(talker, 1475);
myself.ShowPage(talker, "atuba_chief_varkees_q0273_05.htm");
if (gg.OwnItemCount(talker, 1475) >= 10) {
myself.GiveItem1(talker, 57, i0 * 3 + 1500);

} else {
myself.GiveItem1(talker, 57, i0 * 3);

}
myself.DeleteItem1(talker, 1475, i0);
gg.AddLog(3, talker, 273);
myself.SoundEffect(talker, "ItemSound.quest_finish");
if (talker.level < 25 && myself.GetOneTimeQuestFlag(talker, 57) == 0) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 6000);
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

} else {
myself.ShowPage(talker, "atuba_chief_varkees_q0273_06.htm");
if (gg.OwnItemCount(talker, 1475) + gg.OwnItemCount(talker, 1476) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1476) * 10 + gg.OwnItemCount(talker, 1475) * 3 + 1800);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1476) * 10 + gg.OwnItemCount(talker, 1475) * 3);

}
myself.DeleteItem1(talker, 1475, gg.OwnItemCount(talker, 1475));
myself.DeleteItem1(talker, 1476, gg.OwnItemCount(talker, 1476));
if (talker.level < 25 && myself.GetOneTimeQuestFlag(talker, 57) == 0) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 6000);
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
gg.AddLog(3, talker, 273);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) == 1 && gg.OwnItemCount(talker, 3400) == 0 && gg.OwnItemCount(talker, 3392) == 0) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "atuba_chief_varkees_q0232_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3400) == 0 && gg.OwnItemCount(talker, 3399) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3392) >= 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "atuba_chief_varkees_q0232_03.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3400) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3392) >= 1 && gg.OwnItemCount(talker, 3399) >= 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "atuba_chief_varkees_q0232_04.htm");
myself.DeleteItem1(talker, 3392, gg.OwnItemCount(talker, 3392));
myself.DeleteItem1(talker, 3399, 1);
myself.GiveItem1(talker, 3400, 1);
if (gg.OwnItemCount(talker, 3406) == 1 && gg.OwnItemCount(talker, 3404) == 1 && gg.OwnItemCount(talker, 3409) == 1 && gg.OwnItemCount(talker, 3411) == 1) {
myself.SetFlagJournal(talker, 232, 2);
myself.ShowQuestMark(talker, 232);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3392) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3400) >= 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "atuba_chief_varkees_q0232_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 273) {
myself.SetCurrentQuestID(273);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 273);
myself.ShowQuestMark(talker, 273);
gg.AddLog(1, talker, 273);
myself.SetFlagJournal(talker, 273, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "atuba_chief_varkees_q0273_03.htm", 273);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 273) {
myself.SetCurrentQuestID(273);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 273) {
if (reply == 1) {
myself.ShowPage(talker, "atuba_chief_varkees_q0273_07.htm");
myself.RemoveMemo(talker, 273);
gg.AddLog(2, talker, 273);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (reply == 2) {
myself.ShowPage(talker, "atuba_chief_varkees_q0273_08.htm");
myself.SoundEffect(talker, "ItemSound.quest_accept");

}

}
if (ask == 232) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 232) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "atuba_chief_varkees_q0232_02.htm");
myself.GiveItem1(talker, 3392, 1);

}

}

}
super;
	}


}