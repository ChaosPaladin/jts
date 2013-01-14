package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_sidra extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 413) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Shillien Oracle");

}
if (gg.HaveMemo(talker, 413) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Shillien Oracle (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 413) == 0) {
myself.SetCurrentQuestID(413);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "master_sidra_q0413_01.htm", 413);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 413) == 1) {
myself.SetCurrentQuestID(413);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1262) == 1) {
myself.ShowPage(talker, "master_sidra_q0413_07.htm");

} else if (gg.OwnItemCount(talker, 1263) > 0 || gg.OwnItemCount(talker, 1264) > 0) {
myself.ShowPage(talker, "master_sidra_q0413_08.htm");

} else if (gg.OwnItemCount(talker, 1269) == 0 && gg.OwnItemCount(talker, 1266) + gg.OwnItemCount(talker, 1265) + gg.OwnItemCount(talker, 1267) + gg.OwnItemCount(talker, 1268) > 0) {
myself.ShowPage(talker, "master_sidra_q0413_09.htm");

} else if (gg.OwnItemCount(talker, 1269) == 1 && gg.OwnItemCount(talker, 1265) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_sidra_q0413_10.htm");
myself.DeleteItem1(talker, 1269, 1);
myself.DeleteItem1(talker, 1265, 1);
myself.GiveItem1(talker, 1270, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 26532);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 33230);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 39928);

}
myself.GiveItem1(talker, 57, 163800);

}
myself.RemoveMemo(talker, 413);
gg.AddLog(2, talker, 413);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

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
if (quest_id == 413) {
myself.SetCurrentQuestID(413);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "master_sidra_q0413_06.htm", 413);
myself.SetMemo(talker, 413);
myself.ShowQuestMark(talker, 413);
gg.AddLog(1, talker, 413);
myself.SetFlagJournal(talker, 413, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 1262, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 413) {
myself.SetCurrentQuestID(413);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 413) {
if (reply == 1) {
if (talker.level >= 18 && talker.occupation == 38 && gg.OwnItemCount(talker, 1270) == 0) {
myself.FHTML_SetFileName(fhtml0, "master_sidra_q0413_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 413);
myself.ShowQuestFHTML(talker, fhtml0, 413);

} else if (talker.occupation != 38) {
if (talker.occupation == 42) {
myself.ShowQuestPage(talker, "master_sidra_q0413_02a.htm", 413);

} else {
myself.ShowQuestPage(talker, "master_sidra_q0413_03.htm", 413);

}

} else if (talker.level < 18 && talker.occupation == 38) {
myself.ShowQuestPage(talker, "master_sidra_q0413_02.htm", 413);

} else if (talker.level >= 18 && talker.occupation == 38 && gg.OwnItemCount(talker, 1270) == 1) {
myself.ShowQuestPage(talker, "master_sidra_q0413_04.htm", 413);

}

}

}
super;
	}


}