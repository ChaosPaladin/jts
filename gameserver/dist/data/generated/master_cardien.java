package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_cardien extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 218) == 0 && myself.GetOneTimeQuestFlag(talker, 218) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Life");

}
if (gg.HaveMemo(talker, 218) == 0 && myself.GetOneTimeQuestFlag(talker, 218) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Life (Done)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3141) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Life (In Progress)");

}
if (gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3142) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Life (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 0 && myself.GetOneTimeQuestFlag(talker, 218) == 0) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race == 1 && talker.level >= 37 && myself.IsInCategory(19, talker.occupation)) {
myself.FHTML_SetFileName(fhtml0, "master_cardien_q0218_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 218);
myself.ShowQuestFHTML(talker, fhtml0, 218);

} else if (talker.race == 1 && talker.level >= 37) {
myself.ShowPage(talker, "master_cardien_q0218_01a.htm");

} else if (talker.race == 1) {
myself.ShowPage(talker, "master_cardien_q0218_02.htm");

} else {
myself.ShowPage(talker, "master_cardien_q0218_01.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 0 && myself.GetOneTimeQuestFlag(talker, 218) == 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3141) == 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_cardien_q0218_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3144) == 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_cardien_q0218_06.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 218) == 1 && gg.OwnItemCount(talker, 3142) == 1) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 1886832);
myself.IncrementParam(talker, 1, 125918);
myself.GiveItem1(talker, 57, 342288);
myself.DeleteItem1(talker, 3142, 1);
myself.GiveItem1(talker, 3140, 1);
myself.ShowPage(talker, "master_cardien_q0218_07.htm");
myself.RemoveMemo(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 218, 1);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (myself.GetOneTimeQuestFlag(talker, 55) == 0) {
if (talker.race == 0) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.race == 1) {
myself.GiveItem1(talker, 7562, 102);

} else if (talker.race == 2) {
myself.GiveItem1(talker, 7562, 98);

} else if (talker.race == 3) {
myself.GiveItem1(talker, 7562, 109);

} else if (talker.race == 4) {
myself.GiveItem1(talker, 7562, 50);

}
myself.SetOneTimeQuestFlag(talker, 55, 1);

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
if (quest_id == 218) {
myself.SetCurrentQuestID(218);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 218) == 0 && myself.GetOneTimeQuestFlag(talker, 218) == 0 && myself.GetMemoCount(talker) < 41 && talker.race == 1 && talker.level >= 37 && myself.IsInCategory(19, talker.occupation)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 3141) == 0) {
myself.GiveItem1(talker, 3141, 1);

}
myself.SetFlagJournal(talker, 218, 1);
myself.ShowQuestMark(talker, 218);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (myself.GetOneTimeQuestFlag(talker, 55) == 0) {
if (talker.race == 0) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.race == 1) {
myself.GiveItem1(talker, 7562, 102);

} else if (talker.race == 2) {
myself.GiveItem1(talker, 7562, 98);

} else if (talker.race == 3) {
myself.GiveItem1(talker, 7562, 109);

} else if (talker.race == 4) {
myself.GiveItem1(talker, 7562, 50);

}
myself.SetOneTimeQuestFlag(talker, 55, 1);
myself.ShowQuestPage(talker, "master_cardien_q0218_04a.htm", 218);

} else {
myself.ShowQuestPage(talker, "master_cardien_q0218_04.htm", 218);

}

}

}
return;

}
super;
	}


}