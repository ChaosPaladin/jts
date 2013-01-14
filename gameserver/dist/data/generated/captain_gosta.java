package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class captain_gosta extends inzone_raid_controller {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 351) == 0 && talker.level < 32) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Black Swan");

}
if (gg.HaveMemo(talker, 351) == 0 && talker.level >= 32) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Black Swan");

}
if (gg.HaveMemo(talker, 351) == 1 && gg.GetMemoState(talker, 351) >= 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Black Swan (In Progress)");

}
if (gg.HaveMemo(talker, 10278) == 0 && myself.GetOneTimeQuestFlag(talker, 10278) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Mutated Kaneus - Heine");

}
if (gg.HaveMemo(talker, 10278) == 0 && myself.GetOneTimeQuestFlag(talker, 10278) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Mutated Kaneus - Heine (Done)");

}
if (gg.HaveMemo(talker, 10278) == 1 && gg.GetMemoState(talker, 10278) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Mutated Kaneus - Heine (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 351) == 0 && talker.level < 32) {
myself.SetCurrentQuestID(351);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_gosta_q0351_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 351) == 0 && talker.level >= 32) {
myself.SetCurrentQuestID(351);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "captain_gosta_q0351_02.htm", 351);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 351) == 1 && gg.GetMemoState(talker, 351) >= 0) {
myself.SetCurrentQuestID(351);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_gosta_q0351_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10278) == 0 && myself.GetOneTimeQuestFlag(talker, 10278) == 0) {
myself.SetCurrentQuestID(10278);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 38) {
myself.ShowQuestPage(talker, "captain_gosta_q10278_01.htm", 10278);

} else {
myself.ShowQuestPage(talker, "captain_gosta_q10278_04.htm", 10278);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10278) == 0 && myself.GetOneTimeQuestFlag(talker, 10278) == 1) {
myself.SetCurrentQuestID(10278);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_gosta_q10278_02.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10278) == 1 && gg.GetMemoState(talker, 10278) == 1) {
myself.SetCurrentQuestID(10278);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13834) >= 1 && gg.OwnItemCount(talker, 13835) >= 1) {
myself.ShowPage(talker, "captain_gosta_q10278_07.htm");

} else {
myself.ShowPage(talker, "captain_gosta_q10278_06.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam i0, HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 351) {
myself.SetCurrentQuestID(351);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4296, 1);
myself.SetMemo(talker, 351);
myself.SetMemoState(talker, 351, 1);
gg.AddLog(1, talker, 351);
myself.SetFlagJournal(talker, 351, 1);
myself.ShowQuestPage(talker, "captain_gosta_q0351_04.htm", 351);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}
return;

}
if (quest_id == 10278) {
myself.SetCurrentQuestID(10278);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 10278) == 0 && talker.level >= 38 && myself.GetOneTimeQuestFlag(talker, 10278) == 0) {
myself.SetMemoState(talker, 10278, 1);
myself.SetMemo(talker, 10278);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "captain_gosta_q10278_05.htm", 10278);
myself.SetFlagJournal(talker, 10278, 1);
myself.ShowQuestMark(talker, 10278);
gg.AddLog(1, talker, 10278);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 351) {
myself.SetCurrentQuestID(351);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 351) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "captain_gosta_q0351_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 351);
myself.ShowQuestFHTML(talker, fhtml0, 351);

}

}
if (ask == 10278) {
myself.SetCurrentQuestID(10278);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10278) {
if (reply == 1) {
if (gg.HaveMemo(talker, 10278) == 0 && myself.GetOneTimeQuestFlag(talker, 10278) == 0) {
if (talker.level >= 38) {
myself.FHTML_SetFileName(fhtml0, "captain_gosta_q10278_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 10278);
myself.ShowQuestFHTML(talker, fhtml0, 10278);

}

}

}

}
super;
	}


}