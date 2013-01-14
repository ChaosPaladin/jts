package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class varika extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 412) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Dark Wizard");

}
if (gg.HaveMemo(talker, 412) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Dark Wizard (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 412) == 0) {
myself.SetCurrentQuestID(412);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 1261) == 0) {
myself.FHTML_SetFileName(fhtml0, "varika_q0412_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 412);
myself.ShowQuestFHTML(talker, fhtml0, 412);

} else {
myself.ShowQuestPage(talker, "varika_q0412_04.htm", 412);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 412) == 1) {
myself.SetCurrentQuestID(412);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1254) && gg.OwnItemCount(talker, 1255) && gg.OwnItemCount(talker, 1256) && gg.OwnItemCount(talker, 1253)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "varika_q0412_16.htm");
myself.DeleteItem1(talker, 1255, 1);
myself.DeleteItem1(talker, 1253, 1);
myself.DeleteItem1(talker, 1256, 1);
myself.DeleteItem1(talker, 1254, 1);
myself.GiveItem1(talker, 1261, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 28630);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 28630);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 35328);

}
myself.GiveItem1(talker, 57, 163800);

}
myself.RemoveMemo(talker, 412);
gg.AddLog(2, talker, 412);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

} else if (gg.OwnItemCount(talker, 1254) == 1 && gg.OwnItemCount(talker, 1257) == 0 && gg.OwnItemCount(talker, 1277) == 0 && gg.OwnItemCount(talker, 1278) == 0 && gg.OwnItemCount(talker, 1279) == 0 && gg.OwnItemCount(talker, 1259) == 0 && gg.OwnItemCount(talker, 1260) == 0) {
myself.ShowPage(talker, "varika_q0412_17.htm");

} else if (gg.OwnItemCount(talker, 1254) == 1 && gg.GetMemoState(talker, 412) == 1 && gg.OwnItemCount(talker, 1253) == 0) {
myself.ShowPage(talker, "varika_q0412_08.htm");

} else if (gg.OwnItemCount(talker, 1254) == 1 && gg.GetMemoState(talker, 412) == 2 && gg.OwnItemCount(talker, 1255) == 0) {
myself.ShowPage(talker, "varika_q0412_19.htm");

} else if (gg.OwnItemCount(talker, 1254) == 1 && gg.GetMemoState(talker, 412) == 3 && gg.OwnItemCount(talker, 1256) == 0) {
myself.ShowPage(talker, "varika_q0412_13.htm");

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
if (quest_id == 412) {
myself.SetCurrentQuestID(412);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 412) == 0) {
if (talker.level >= 18 && talker.occupation == 38 && gg.OwnItemCount(talker, 1261) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 412);
myself.ShowQuestMark(talker, 412);
gg.AddLog(1, talker, 412);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 1254, 1);
myself.ShowQuestPage(talker, "varika_q0412_05.htm", 412);
myself.SetFlagJournal(talker, 412, 1);

}

} else if (talker.occupation != 38) {
if (talker.occupation == 39) {
myself.ShowQuestPage(talker, "varika_q0412_02a.htm", 412);

} else {
myself.ShowQuestPage(talker, "varika_q0412_03.htm", 412);

}

} else if (talker.level < 18 && talker.occupation == 38) {
myself.ShowQuestPage(talker, "varika_q0412_02.htm", 412);

} else if (talker.level >= 18 && talker.occupation == 38 && gg.OwnItemCount(talker, 1261) == 1) {
myself.ShowQuestPage(talker, "varika_q0412_04.htm", 412);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 412) {
myself.SetCurrentQuestID(412);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 412) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 1253)) {
myself.ShowPage(talker, "varika_q0412_06.htm");

} else {
myself.ShowPage(talker, "varika_q0412_07.htm");
myself.SetMemoState(talker, 412, 1);

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 1255)) {
myself.ShowPage(talker, "varika_q0412_09.htm");

} else {
myself.ShowPage(talker, "varika_q0412_10.htm");
myself.SetMemoState(talker, 412, 2);

}

} else if (reply == 3) {
if (gg.OwnItemCount(talker, 1256)) {
myself.ShowPage(talker, "varika_q0412_12.htm");

} else if (gg.OwnItemCount(talker, 1256) == 0 && gg.OwnItemCount(talker, 1254)) {
myself.ShowPage(talker, "varika_q0412_13.htm");
myself.SetMemoState(talker, 412, 3);

}

}

}
super;
	}


}