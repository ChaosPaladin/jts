package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class captain_bezique extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1271) > 0 && gg.OwnItemCount(talker, 1164) == 0 && gg.OwnItemCount(talker, 1172) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1172) > 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1164) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 403) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Rogue");

}
if (gg.HaveMemo(talker, 403) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Rogue (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1271) > 0 && gg.OwnItemCount(talker, 1164) == 0 && gg.OwnItemCount(talker, 1172) == 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_bezique_q0402_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1172) > 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1173) < 20) {
myself.ShowPage(talker, "captain_bezique_q0402_03.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "captain_bezique_q0402_04.htm");
myself.DeleteItem1(talker, 1173, gg.OwnItemCount(talker, 1173));
myself.DeleteItem1(talker, 1172, 1);
myself.GiveItem1(talker, 1164, 1);

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1164) > 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "captain_bezique_q0402_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 403) == 0) {
myself.SetCurrentQuestID(403);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "captain_bezique_q0403_01.htm", 403);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 403) == 1) {
myself.SetCurrentQuestID(403);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1184) == 0 && gg.OwnItemCount(talker, 1186) && gg.OwnItemCount(talker, 1187) && gg.OwnItemCount(talker, 1188) && gg.OwnItemCount(talker, 1189)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "captain_bezique_q0403_09.htm");
myself.GiveItem1(talker, 1190, 1);
myself.DeleteItem1(talker, 1181, gg.OwnItemCount(talker, 1181));
myself.DeleteItem1(talker, 1182, gg.OwnItemCount(talker, 1182));
myself.DeleteItem1(talker, 1186, 1);
myself.DeleteItem1(talker, 1187, 1);
myself.DeleteItem1(talker, 1188, 1);
myself.DeleteItem1(talker, 1189, 1);
myself.DeleteItem1(talker, 1185, gg.OwnItemCount(talker, 1185));
myself.RemoveMemo(talker, 403);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 20232);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 26930);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 33628);

}
myself.GiveItem1(talker, 57, 163800);

}
gg.AddLog(2, talker, 403);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

} else if (gg.OwnItemCount(talker, 1184) == 0 && gg.OwnItemCount(talker, 1180) > 0) {
myself.ShowPage(talker, "captain_bezique_q0403_07.htm");

} else if (gg.OwnItemCount(talker, 1184) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "captain_bezique_q0403_08.htm");
myself.DeleteItem1(talker, 1184, 1);
myself.GiveItem1(talker, 1185, 1);
myself.SetFlagJournal(talker, 403, 5);
myself.ShowQuestMark(talker, 403);

}

} else if (gg.OwnItemCount(talker, 1181) && gg.OwnItemCount(talker, 1182) && gg.OwnItemCount(talker, 1185) == 0) {
myself.ShowPage(talker, "captain_bezique_q0403_10.htm");

} else if (gg.OwnItemCount(talker, 1185)) {
myself.ShowPage(talker, "captain_bezique_q0403_11.htm");

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
if (quest_id == 403) {
myself.SetCurrentQuestID(403);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 403);
gg.AddLog(1, talker, 403);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 1180, 1);
myself.ShowQuestPage(talker, "captain_bezique_q0403_06.htm", 403);
myself.SetFlagJournal(talker, 403, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
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
myself.ShowPage(talker, "captain_bezique_q0402_02.htm");
myself.GiveItem1(talker, 1172, 1);

}

}

}
if (ask == 403) {
myself.SetCurrentQuestID(403);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 403) {
if (reply == 2) {
if (talker.occupation == 0) {
if (talker.level >= 18) {
if (gg.OwnItemCount(talker, 1190) > 0) {
myself.ShowQuestPage(talker, "captain_bezique_q0403_04.htm", 403);

} else {
myself.FHTML_SetFileName(fhtml0, "captain_bezique_q0403_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 403);
myself.ShowQuestFHTML(talker, fhtml0, 403);

}

} else {
myself.ShowQuestPage(talker, "captain_bezique_q0403_03.htm", 403);

}

} else if (talker.occupation == 7) {
myself.ShowQuestPage(talker, "captain_bezique_q0403_02a.htm", 403);

} else {
myself.ShowQuestPage(talker, "captain_bezique_q0403_02.htm", 403);

}

}

}
super;
	}


}