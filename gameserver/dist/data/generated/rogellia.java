package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rogellia extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 408) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Elven Wizard");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1218) == 0 && gg.OwnItemCount(talker, 1222) == 0 && gg.OwnItemCount(talker, 1224) == 0 && gg.OwnItemCount(talker, 1272) == 0 && gg.OwnItemCount(talker, 1273) == 0 && gg.OwnItemCount(talker, 1274) == 0 && gg.OwnItemCount(talker, 1229) != 0 && gg.OwnItemCount(talker, 1220) == 0 || gg.OwnItemCount(talker, 1226) == 0 || gg.OwnItemCount(talker, 1221) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1218) != 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1272) != 0 && gg.OwnItemCount(talker, 1219) < 5) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1272) != 0 && gg.OwnItemCount(talker, 1219) >= 5) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1222) != 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1273) != 0 && gg.OwnItemCount(talker, 1223) < 5) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1273) != 0 && gg.OwnItemCount(talker, 1223) >= 5) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1224) != 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1274) != 0 && gg.OwnItemCount(talker, 1225) < 2) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1274) != 0 && gg.OwnItemCount(talker, 1225) >= 2) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1218) == 0 && gg.OwnItemCount(talker, 1222) == 0 && gg.OwnItemCount(talker, 1224) == 0 && gg.OwnItemCount(talker, 1272) == 0 && gg.OwnItemCount(talker, 1273) == 0 && gg.OwnItemCount(talker, 1274) == 0 && gg.OwnItemCount(talker, 1229) != 0 && gg.OwnItemCount(talker, 1220) != 0 && gg.OwnItemCount(talker, 1226) != 0 && gg.OwnItemCount(talker, 1221) != 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Path of the Elven Wizard (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) == 0) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "rogellia_q0408_01.htm", 408);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1218) == 0 && gg.OwnItemCount(talker, 1222) == 0 && gg.OwnItemCount(talker, 1224) == 0 && gg.OwnItemCount(talker, 1272) == 0 && gg.OwnItemCount(talker, 1273) == 0 && gg.OwnItemCount(talker, 1274) == 0 && gg.OwnItemCount(talker, 1229) != 0 && gg.OwnItemCount(talker, 1220) == 0 || gg.OwnItemCount(talker, 1226) == 0 || gg.OwnItemCount(talker, 1221) == 0) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rogellia_q0408_11.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1218) != 0) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rogellia_q0408_08.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1272) != 0 && gg.OwnItemCount(talker, 1219) < 5) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rogellia_q0408_09.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1272) != 0 && gg.OwnItemCount(talker, 1219) >= 5) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rogellia_q0408_25.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1222) != 0) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rogellia_q0408_15.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1273) != 0 && gg.OwnItemCount(talker, 1223) < 5) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rogellia_q0408_16.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1273) != 0 && gg.OwnItemCount(talker, 1223) >= 5) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rogellia_q0408_26.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1224) != 0) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rogellia_q0408_19.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1274) != 0 && gg.OwnItemCount(talker, 1225) < 2) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rogellia_q0408_20.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1274) != 0 && gg.OwnItemCount(talker, 1225) >= 2) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rogellia_q0408_27.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1218) == 0 && gg.OwnItemCount(talker, 1222) == 0 && gg.OwnItemCount(talker, 1224) == 0 && gg.OwnItemCount(talker, 1272) == 0 && gg.OwnItemCount(talker, 1273) == 0 && gg.OwnItemCount(talker, 1274) == 0 && gg.OwnItemCount(talker, 1229) != 0 && gg.OwnItemCount(talker, 1220) != 0 && gg.OwnItemCount(talker, 1226) != 0 && gg.OwnItemCount(talker, 1221) != 0) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1220, gg.OwnItemCount(talker, 1220));
myself.DeleteItem1(talker, 1221, gg.OwnItemCount(talker, 1221));
myself.DeleteItem1(talker, 1226, gg.OwnItemCount(talker, 1226));
myself.DeleteItem1(talker, 1229, gg.OwnItemCount(talker, 1229));
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 22532);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 29230);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 35928);

}
myself.GiveItem1(talker, 57, 163800);

}
myself.RemoveMemo(talker, 408);
gg.AddLog(2, talker, 408);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (gg.OwnItemCount(talker, 1230) == 0) {
myself.GiveItem1(talker, 1230, 1);

}
myself.ShowPage(talker, "rogellia_q0408_24.htm");

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
if (quest_id == 408) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.occupation != 25) {
if (talker.occupation == 26) {
myself.ShowQuestPage(talker, "rogellia_q0408_02a.htm", 408);

} else {
myself.ShowQuestPage(talker, "rogellia_q0408_03.htm", 408);

}

} else if (talker.level < 18) {
myself.ShowQuestPage(talker, "rogellia_q0408_04.htm", 408);

} else if (gg.OwnItemCount(talker, 1230) != 0) {
myself.ShowQuestPage(talker, "rogellia_q0408_05.htm", 408);

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 408);
gg.AddLog(1, talker, 408);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 1229) == 0) {
myself.GiveItem1(talker, 1229, 1);

}
myself.ShowQuestPage(talker, "rogellia_q0408_06.htm", 408);
myself.SetFlagJournal(talker, 408, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 408) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 408 && reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1220) != 0) {
myself.ShowPage(talker, "rogellia_q0408_10.htm");

} else if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1220) == 0 && gg.OwnItemCount(talker, 1229) != 0) {
if (gg.OwnItemCount(talker, 1218) == 0) {
myself.GiveItem1(talker, 1218, 1);

}
myself.ShowPage(talker, "rogellia_q0408_07.htm");

}

}

}
if (ask == 408) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 408 && reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1221) != 0) {
myself.ShowPage(talker, "rogellia_q0408_13.htm");

} else if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1221) == 0 && gg.OwnItemCount(talker, 1229) != 0) {
if (gg.OwnItemCount(talker, 1222) == 0) {
myself.GiveItem1(talker, 1222, 1);

}
myself.ShowPage(talker, "rogellia_q0408_14.htm");

}

}

}
if (ask == 408) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 408 && reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1226) != 0) {
myself.ShowPage(talker, "rogellia_q0408_17.htm");

} else if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1226) == 0 && gg.OwnItemCount(talker, 1229) != 0) {
if (gg.OwnItemCount(talker, 1224) == 0) {
myself.GiveItem1(talker, 1224, 1);

}
myself.ShowPage(talker, "rogellia_q0408_18.htm");

}

}

}
super;
	}


}