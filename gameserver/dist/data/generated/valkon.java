package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class valkon extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 216) == 0 && myself.GetOneTimeQuestFlag(talker, 216) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Guildsman");

}
if (gg.HaveMemo(talker, 216) == 0 && myself.GetOneTimeQuestFlag(talker, 216) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Guildsman (Done)");

}
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3120) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Guildsman (In Progress)");

}
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Guildsman (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) == 1 && gg.OwnItemCount(talker, 2710) == 0 && gg.OwnItemCount(talker, 2714) == 0 && gg.OwnItemCount(talker, 2707) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) == 1 && gg.OwnItemCount(talker, 2710) == 1 && gg.OwnItemCount(talker, 2714) == 0 && gg.OwnItemCount(talker, 2707) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) == 1 && gg.OwnItemCount(talker, 2710) == 0 && gg.OwnItemCount(talker, 2714) == 1 && gg.OwnItemCount(talker, 2707) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) == 1 && gg.OwnItemCount(talker, 2710) == 0 && gg.OwnItemCount(talker, 2714) == 0 && gg.OwnItemCount(talker, 2707) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Trial of the Scholar (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 0 && myself.GetOneTimeQuestFlag(talker, 216) == 0) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.occupation == 56 || talker.occupation == 54) {
if (talker.level < 35) {
myself.ShowPage(talker, "valkon_q0216_02.htm");

} else {
myself.ShowQuestPage(talker, "valkon_q0216_03.htm", 216);

}

} else {
myself.ShowPage(talker, "valkon_q0216_01.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 0 && myself.GetOneTimeQuestFlag(talker, 216) == 1) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3120) == 1) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "valkon_q0216_07.htm");
myself.SetFlagJournal(talker, 216, 3);
myself.ShowQuestMark(talker, 216);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) == 1) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3139) < 7) {
myself.ShowPage(talker, "valkon_q0216_08.htm");

} else {
myself.ShowPage(talker, "valkon_q0216_09.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) == 1 && gg.OwnItemCount(talker, 2710) == 0 && gg.OwnItemCount(talker, 2714) == 0 && gg.OwnItemCount(talker, 2707) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "valkon_q0214_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) == 1 && gg.OwnItemCount(talker, 2710) == 1 && gg.OwnItemCount(talker, 2714) == 0 && gg.OwnItemCount(talker, 2707) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "valkon_q0214_05.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) == 1 && gg.OwnItemCount(talker, 2710) == 0 && gg.OwnItemCount(talker, 2714) == 1 && gg.OwnItemCount(talker, 2707) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "valkon_q0214_06.htm");
myself.DeleteItem1(talker, 2714, 1);
myself.GiveItem1(talker, 2707, 1);

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) == 1 && gg.OwnItemCount(talker, 2710) == 0 && gg.OwnItemCount(talker, 2714) == 0 && gg.OwnItemCount(talker, 2707) == 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "valkon_q0214_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 216) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 57) >= 2000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 3120) == 0) {
myself.GiveItem1(talker, 3120, 1);

}
myself.DeleteItem1(talker, 57, 2000);
myself.SetFlagJournal(talker, 216, 1);
myself.ShowQuestMark(talker, 216);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (myself.GetOneTimeQuestFlag(talker, 54) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 85);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 85);

}
myself.SetOneTimeQuestFlag(talker, 54, 1);
myself.ShowQuestPage(talker, "valkon_q0216_06d.htm", 216);

} else {
myself.ShowQuestPage(talker, "valkon_q0216_06.htm", 216);

}

}

} else {
myself.ShowQuestPage(talker, "valkon_q0216_05b.htm", 216);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 216) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 216) {
if (reply == 1) {
myself.ShowQuestPage(talker, "valkon_q0216_04.htm", 216);

}
if (reply == 2) {
myself.FHTML_SetFileName(fhtml0, "valkon_q0216_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 216);
myself.ShowQuestFHTML(talker, fhtml0, 216);

}
if (reply == 3) {
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) >= 1 && gg.OwnItemCount(talker, 3139) >= 7) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "valkon_q0216_09a.htm");
myself.RemoveMemo(talker, 216);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 216, 1);
myself.IncrementParam(talker, 0, 1029478);
myself.IncrementParam(talker, 1, 66768);
myself.GiveItem1(talker, 57, 187606);
myself.DeleteItem1(talker, 3139, gg.OwnItemCount(talker, 3139));
myself.DeleteItem1(talker, 3122, gg.OwnItemCount(talker, 3122));
myself.DeleteItem1(talker, 3024, gg.OwnItemCount(talker, 3024));
myself.GiveItem1(talker, 3119, 1);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (myself.GetOneTimeQuestFlag(talker, 54) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 85);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 85);

}
myself.SetOneTimeQuestFlag(talker, 54, 1);

}

}

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) >= 1 && gg.OwnItemCount(talker, 3139) >= 7) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 514739);
myself.IncrementParam(talker, 1, 33384);
myself.GiveItem1(talker, 57, 93803);
myself.ShowPage(talker, "valkon_q0216_09b.htm");
myself.RemoveMemo(talker, 216);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 216, 1);
myself.DeleteItem1(talker, 3139, gg.OwnItemCount(talker, 3139));
myself.DeleteItem1(talker, 3122, gg.OwnItemCount(talker, 3122));
myself.DeleteItem1(talker, 3024, gg.OwnItemCount(talker, 3024));
myself.GiveItem1(talker, 3119, 1);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (myself.GetOneTimeQuestFlag(talker, 54) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 85);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 85);

}
myself.SetOneTimeQuestFlag(talker, 54, 1);

}

}

}

}

}
if (ask == 214) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 214) {
if (reply == 1) {
myself.ShowPage(talker, "valkon_q0214_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "valkon_q0214_03.htm");

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "valkon_q0214_04.htm");
myself.GiveItem1(talker, 2710, 1);

}

}

}
super;
	}


}