package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class marketeer_of_mammon extends ssq_npc_depravity_priest {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 10 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Good Work's Reward (In Progress)");

}
if (myself.GetOneTimeQuestFlag(talker, 60) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Good Work's Reward (Done)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 10 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.IsInCategory(7, talker.occupation)) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_01.htm");
myself.SetMemoStateEx(talker, 60, 1, 0);

} else {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_01a.htm");
myself.RemoveMemo(talker, 60);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 60, 1);
gg.AddLog(2, talker, 60);
myself.GiveItem1(talker, 57, 3000000);

}

}
break;

}
case 1: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 60) == 1) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.IsInCategory(7, talker.occupation)) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_23.htm");

} else {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_24.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam reply, HandlerParam talker) {
if (ask == 60) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 60) {
if (reply == 1) {
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 10 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_02.htm");
if (myself.GetOneTimeQuestFlag(talker, 211) == 1 || myself.GetOneTimeQuestFlag(talker, 212) == 1 || myself.GetOneTimeQuestFlag(talker, 213) == 1 || myself.GetOneTimeQuestFlag(talker, 214) == 1 || myself.GetOneTimeQuestFlag(talker, 215) == 1 || myself.GetOneTimeQuestFlag(talker, 216) == 1) {
if (myself.GetOneTimeQuestFlag(talker, 217) == 1 || myself.GetOneTimeQuestFlag(talker, 218) == 1 || myself.GetOneTimeQuestFlag(talker, 219) == 1 || myself.GetOneTimeQuestFlag(talker, 220) == 1 || myself.GetOneTimeQuestFlag(talker, 221) == 1) {
if (myself.GetOneTimeQuestFlag(talker, 222) == 1 || myself.GetOneTimeQuestFlag(talker, 223) == 1 || myself.GetOneTimeQuestFlag(talker, 224) == 1 || myself.GetOneTimeQuestFlag(talker, 225) == 1 || myself.GetOneTimeQuestFlag(talker, 226) == 1 || myself.GetOneTimeQuestFlag(talker, 227) == 1 || myself.GetOneTimeQuestFlag(talker, 228) == 1 || myself.GetOneTimeQuestFlag(talker, 229) == 1 || myself.GetOneTimeQuestFlag(talker, 230) == 1 || myself.GetOneTimeQuestFlag(talker, 231) == 1 || myself.GetOneTimeQuestFlag(talker, 232) == 1 || myself.GetOneTimeQuestFlag(talker, 233) == 1) {
myself.SetMemoStateEx(talker, 60, 1, 3);

} else {
myself.SetMemoStateEx(talker, 60, 1, 2);

}

} else if (myself.GetOneTimeQuestFlag(talker, 222) == 1 || myself.GetOneTimeQuestFlag(talker, 223) == 1 || myself.GetOneTimeQuestFlag(talker, 224) == 1 || myself.GetOneTimeQuestFlag(talker, 225) == 1 || myself.GetOneTimeQuestFlag(talker, 226) == 1 || myself.GetOneTimeQuestFlag(talker, 227) == 1 || myself.GetOneTimeQuestFlag(talker, 228) == 1 || myself.GetOneTimeQuestFlag(talker, 229) == 1 || myself.GetOneTimeQuestFlag(talker, 230) == 1 || myself.GetOneTimeQuestFlag(talker, 231) == 1 || myself.GetOneTimeQuestFlag(talker, 232) == 1 || myself.GetOneTimeQuestFlag(talker, 233) == 1) {
myself.SetMemoStateEx(talker, 60, 1, 2);

} else {
myself.SetMemoStateEx(talker, 60, 1, 1);

}

} else if (myself.GetOneTimeQuestFlag(talker, 217) == 1 || myself.GetOneTimeQuestFlag(talker, 218) == 1 || myself.GetOneTimeQuestFlag(talker, 219) == 1 || myself.GetOneTimeQuestFlag(talker, 220) == 1 || myself.GetOneTimeQuestFlag(talker, 221) == 1) {
if (myself.GetOneTimeQuestFlag(talker, 222) == 1 || myself.GetOneTimeQuestFlag(talker, 223) == 1 || myself.GetOneTimeQuestFlag(talker, 224) == 1 || myself.GetOneTimeQuestFlag(talker, 225) == 1 || myself.GetOneTimeQuestFlag(talker, 226) == 1 || myself.GetOneTimeQuestFlag(talker, 227) == 1 || myself.GetOneTimeQuestFlag(talker, 228) == 1 || myself.GetOneTimeQuestFlag(talker, 229) == 1 || myself.GetOneTimeQuestFlag(talker, 230) == 1 || myself.GetOneTimeQuestFlag(talker, 231) == 1 || myself.GetOneTimeQuestFlag(talker, 232) == 1 || myself.GetOneTimeQuestFlag(talker, 233) == 1) {
myself.SetMemoStateEx(talker, 60, 1, 2);

} else {
myself.SetMemoStateEx(talker, 60, 1, 1);

}

} else if (myself.GetOneTimeQuestFlag(talker, 222) == 1 || myself.GetOneTimeQuestFlag(talker, 223) == 1 || myself.GetOneTimeQuestFlag(talker, 224) == 1 || myself.GetOneTimeQuestFlag(talker, 225) == 1 || myself.GetOneTimeQuestFlag(talker, 226) == 1 || myself.GetOneTimeQuestFlag(talker, 227) == 1 || myself.GetOneTimeQuestFlag(talker, 228) == 1 || myself.GetOneTimeQuestFlag(talker, 229) == 1 || myself.GetOneTimeQuestFlag(talker, 230) == 1 || myself.GetOneTimeQuestFlag(talker, 231) == 1 || myself.GetOneTimeQuestFlag(talker, 232) == 1 || myself.GetOneTimeQuestFlag(talker, 233) == 1) {
myself.SetMemoStateEx(talker, 60, 1, 1);

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 10 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
if (gg.GetMemoStateEx(talker, 60, 1) >= 3) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_03b.htm");

} else if (gg.GetMemoStateEx(talker, 60, 1) >= 1) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_03.htm");

} else {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_03a.htm");

}

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 10) {
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 10 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
if (gg.GetMemoStateEx(talker, 60, 1) >= 3) {
myself.GiveItem1(talker, 57, 3000000);
myself.ShowPage(talker, "marketeer_of_mammon_q0060_04a.htm");

} else if (gg.GetMemoStateEx(talker, 60, 1) == 2) {
myself.GiveItem1(talker, 57, 2000000);
myself.ShowPage(talker, "marketeer_of_mammon_q0060_04b.htm");

} else if (gg.GetMemoStateEx(talker, 60, 1) == 1) {
myself.GiveItem1(talker, 57, 1000000);
myself.ShowPage(talker, "marketeer_of_mammon_q0060_04b.htm");

}
myself.RemoveMemo(talker, 60);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 60, 1);
gg.AddLog(2, talker, 60);

}

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 10) {
if (talker.occupation == 1) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_05.htm");

} else if (talker.occupation == 4) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_06.htm");

} else if (talker.occupation == 7) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_07.htm");

} else if (talker.occupation == 11) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_08.htm");

} else if (talker.occupation == 15) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_09.htm");

} else if (talker.occupation == 19) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_10.htm");

} else if (talker.occupation == 22) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_11.htm");

} else if (talker.occupation == 26) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_12.htm");

} else if (talker.occupation == 29) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_13.htm");

} else if (talker.occupation == 32) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_14.htm");

} else if (talker.occupation == 35) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_15.htm");

} else if (talker.occupation == 39) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_16.htm");

} else if (talker.occupation == 42) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_17.htm");

} else if (talker.occupation == 45) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_18.htm");

} else if (talker.occupation == 47) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_19.htm");

} else if (talker.occupation == 50) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_20.htm");

} else if (talker.occupation == 54) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_21.htm");

} else if (talker.occupation == 56) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_22.htm");

}
myself.RemoveMemo(talker, 60);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 60, 1);
gg.AddLog(2, talker, 60);

}

}
if (reply == 5) {
if (myself.GetOneTimeQuestFlag(talker, 60) == 1 && myself.IsInCategory(7, talker.occupation)) {
if (talker.occupation == 1) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_05a.htm");

} else if (talker.occupation == 4) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_06a.htm");

} else if (talker.occupation == 7) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_07a.htm");

} else if (talker.occupation == 11) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_08a.htm");

} else if (talker.occupation == 15) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_09a.htm");

} else if (talker.occupation == 19) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_10a.htm");

} else if (talker.occupation == 22) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_11a.htm");

} else if (talker.occupation == 26) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_12a.htm");

} else if (talker.occupation == 29) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_13a.htm");

} else if (talker.occupation == 32) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_14a.htm");

} else if (talker.occupation == 35) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_15a.htm");

} else if (talker.occupation == 39) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_16a.htm");

} else if (talker.occupation == 42) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_17a.htm");

} else if (talker.occupation == 45) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_18a.htm");

} else if (talker.occupation == 47) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_19a.htm");

} else if (talker.occupation == 50) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_20a.htm");

} else if (talker.occupation == 54) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_21a.htm");

} else if (talker.occupation == 56) {
myself.ShowPage(talker, "marketeer_of_mammon_q0060_22a.htm");

}

}

}
if (reply == 11) {
if (talker.occupation == 1) {
if (gg.OwnItemCount(talker, 2627) == 0) {
myself.GiveItem1(talker, 2627, 1);

}
if (gg.OwnItemCount(talker, 2734) == 0) {
myself.GiveItem1(talker, 2734, 1);

}
if (gg.OwnItemCount(talker, 2762) == 0) {
myself.GiveItem1(talker, 2762, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 12) {
if (talker.occupation == 1) {
if (gg.OwnItemCount(talker, 2627) == 0) {
myself.GiveItem1(talker, 2627, 1);

}
if (gg.OwnItemCount(talker, 2734) == 0) {
myself.GiveItem1(talker, 2734, 1);

}
if (gg.OwnItemCount(talker, 3276) == 0) {
myself.GiveItem1(talker, 3276, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 13) {
if (talker.occupation == 4) {
if (gg.OwnItemCount(talker, 2633) == 0) {
myself.GiveItem1(talker, 2633, 1);

}
if (gg.OwnItemCount(talker, 2734) == 0) {
myself.GiveItem1(talker, 2734, 1);

}
if (gg.OwnItemCount(talker, 2820) == 0) {
myself.GiveItem1(talker, 2820, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 14) {
if (talker.occupation == 4) {
if (gg.OwnItemCount(talker, 2633) == 0) {
myself.GiveItem1(talker, 2633, 1);

}
if (gg.OwnItemCount(talker, 2734) == 0) {
myself.GiveItem1(talker, 2734, 1);

}
if (gg.OwnItemCount(talker, 3307) == 0) {
myself.GiveItem1(talker, 3307, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 15) {
if (talker.occupation == 7) {
if (gg.OwnItemCount(talker, 2673) == 0) {
myself.GiveItem1(talker, 2673, 1);

}
if (gg.OwnItemCount(talker, 2734) == 0) {
myself.GiveItem1(talker, 2734, 1);

}
if (gg.OwnItemCount(talker, 2809) == 0) {
myself.GiveItem1(talker, 2809, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 16) {
if (talker.occupation == 7) {
if (gg.OwnItemCount(talker, 2673) == 0) {
myself.GiveItem1(talker, 2673, 1);

}
if (gg.OwnItemCount(talker, 2734) == 0) {
myself.GiveItem1(talker, 2734, 1);

}
if (gg.OwnItemCount(talker, 3293) == 0) {
myself.GiveItem1(talker, 3293, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 17) {
if (talker.occupation == 11) {
if (gg.OwnItemCount(talker, 2674) == 0) {
myself.GiveItem1(talker, 2674, 1);

}
if (gg.OwnItemCount(talker, 2734) == 0) {
myself.GiveItem1(talker, 2734, 1);

}
if (gg.OwnItemCount(talker, 2840) == 0) {
myself.GiveItem1(talker, 2840, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 18) {
if (talker.occupation == 11) {
if (gg.OwnItemCount(talker, 2674) == 0) {
myself.GiveItem1(talker, 2674, 1);

}
if (gg.OwnItemCount(talker, 2734) == 0) {
myself.GiveItem1(talker, 2734, 1);

}
if (gg.OwnItemCount(talker, 3307) == 0) {
myself.GiveItem1(talker, 3307, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 19) {
if (talker.occupation == 11) {
if (gg.OwnItemCount(talker, 2674) == 0) {
myself.GiveItem1(talker, 2674, 1);

}
if (gg.OwnItemCount(talker, 2734) == 0) {
myself.GiveItem1(talker, 2734, 1);

}
if (gg.OwnItemCount(talker, 3336) == 0) {
myself.GiveItem1(talker, 3336, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 20) {
if (talker.occupation == 15) {
if (gg.OwnItemCount(talker, 2721) == 0) {
myself.GiveItem1(talker, 2721, 1);

}
if (gg.OwnItemCount(talker, 2734) == 0) {
myself.GiveItem1(talker, 2734, 1);

}
if (gg.OwnItemCount(talker, 2820) == 0) {
myself.GiveItem1(talker, 2820, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 21) {
if (talker.occupation == 15) {
if (gg.OwnItemCount(talker, 2721) == 0) {
myself.GiveItem1(talker, 2721, 1);

}
if (gg.OwnItemCount(talker, 2734) == 0) {
myself.GiveItem1(talker, 2734, 1);

}
if (gg.OwnItemCount(talker, 2821) == 0) {
myself.GiveItem1(talker, 2821, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 22) {
if (talker.occupation == 19) {
if (gg.OwnItemCount(talker, 2633) == 0) {
myself.GiveItem1(talker, 2633, 1);

}
if (gg.OwnItemCount(talker, 3140) == 0) {
myself.GiveItem1(talker, 3140, 1);

}
if (gg.OwnItemCount(talker, 2820) == 0) {
myself.GiveItem1(talker, 2820, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 23) {
if (talker.occupation == 19) {
if (gg.OwnItemCount(talker, 2627) == 0) {
myself.GiveItem1(talker, 2627, 1);

}
if (gg.OwnItemCount(talker, 3140) == 0) {
myself.GiveItem1(talker, 3140, 1);

}
if (gg.OwnItemCount(talker, 2762) == 0) {
myself.GiveItem1(talker, 2762, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 24) {
if (talker.occupation == 22) {
if (gg.OwnItemCount(talker, 2673) == 0) {
myself.GiveItem1(talker, 2673, 1);

}
if (gg.OwnItemCount(talker, 3140) == 0) {
myself.GiveItem1(talker, 3140, 1);

}
if (gg.OwnItemCount(talker, 2809) == 0) {
myself.GiveItem1(talker, 2809, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 25) {
if (talker.occupation == 22) {
if (gg.OwnItemCount(talker, 2673) == 0) {
myself.GiveItem1(talker, 2673, 1);

}
if (gg.OwnItemCount(talker, 3140) == 0) {
myself.GiveItem1(talker, 3140, 1);

}
if (gg.OwnItemCount(talker, 3293) == 0) {
myself.GiveItem1(talker, 3293, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 26) {
if (talker.occupation == 26) {
if (gg.OwnItemCount(talker, 2674) == 0) {
myself.GiveItem1(talker, 2674, 1);

}
if (gg.OwnItemCount(talker, 3140) == 0) {
myself.GiveItem1(talker, 3140, 1);

}
if (gg.OwnItemCount(talker, 2840) == 0) {
myself.GiveItem1(talker, 2840, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 27) {
if (talker.occupation == 26) {
if (gg.OwnItemCount(talker, 2674) == 0) {
myself.GiveItem1(talker, 2674, 1);

}
if (gg.OwnItemCount(talker, 3140) == 0) {
myself.GiveItem1(talker, 3140, 1);

}
if (gg.OwnItemCount(talker, 3336) == 0) {
myself.GiveItem1(talker, 3336, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 28) {
if (talker.occupation == 29) {
if (gg.OwnItemCount(talker, 2721) == 0) {
myself.GiveItem1(talker, 2721, 1);

}
if (gg.OwnItemCount(talker, 3140) == 0) {
myself.GiveItem1(talker, 3140, 1);

}
if (gg.OwnItemCount(talker, 2820) == 0) {
myself.GiveItem1(talker, 2820, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 29) {
if (talker.occupation == 32) {
if (gg.OwnItemCount(talker, 2633) == 0) {
myself.GiveItem1(talker, 2633, 1);

}
if (gg.OwnItemCount(talker, 3172) == 0) {
myself.GiveItem1(talker, 3172, 1);

}
if (gg.OwnItemCount(talker, 3307) == 0) {
myself.GiveItem1(talker, 3307, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 30) {
if (talker.occupation == 32) {
if (gg.OwnItemCount(talker, 2627) == 0) {
myself.GiveItem1(talker, 2627, 1);

}
if (gg.OwnItemCount(talker, 3172) == 0) {
myself.GiveItem1(talker, 3172, 1);

}
if (gg.OwnItemCount(talker, 2762) == 0) {
myself.GiveItem1(talker, 2762, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 31) {
if (talker.occupation == 35) {
if (gg.OwnItemCount(talker, 2673) == 0) {
myself.GiveItem1(talker, 2673, 1);

}
if (gg.OwnItemCount(talker, 3172) == 0) {
myself.GiveItem1(talker, 3172, 1);

}
if (gg.OwnItemCount(talker, 2809) == 0) {
myself.GiveItem1(talker, 2809, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 32) {
if (talker.occupation == 35) {
if (gg.OwnItemCount(talker, 2673) == 0) {
myself.GiveItem1(talker, 2673, 1);

}
if (gg.OwnItemCount(talker, 3172) == 0) {
myself.GiveItem1(talker, 3172, 1);

}
if (gg.OwnItemCount(talker, 3293) == 0) {
myself.GiveItem1(talker, 3293, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 33) {
if (talker.occupation == 39) {
if (gg.OwnItemCount(talker, 2674) == 0) {
myself.GiveItem1(talker, 2674, 1);

}
if (gg.OwnItemCount(talker, 3172) == 0) {
myself.GiveItem1(talker, 3172, 1);

}
if (gg.OwnItemCount(talker, 2840) == 0) {
myself.GiveItem1(talker, 2840, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 34) {
if (talker.occupation == 39) {
if (gg.OwnItemCount(talker, 2674) == 0) {
myself.GiveItem1(talker, 2674, 1);

}
if (gg.OwnItemCount(talker, 3172) == 0) {
myself.GiveItem1(talker, 3172, 1);

}
if (gg.OwnItemCount(talker, 3336) == 0) {
myself.GiveItem1(talker, 3336, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 35) {
if (talker.occupation == 42) {
if (gg.OwnItemCount(talker, 2721) == 0) {
myself.GiveItem1(talker, 2721, 1);

}
if (gg.OwnItemCount(talker, 3172) == 0) {
myself.GiveItem1(talker, 3172, 1);

}
if (gg.OwnItemCount(talker, 2821) == 0) {
myself.GiveItem1(talker, 2821, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 36) {
if (talker.occupation == 45) {
if (gg.OwnItemCount(talker, 2627) == 0) {
myself.GiveItem1(talker, 2627, 1);

}
if (gg.OwnItemCount(talker, 3203) == 0) {
myself.GiveItem1(talker, 3203, 1);

}
if (gg.OwnItemCount(talker, 3276) == 0) {
myself.GiveItem1(talker, 3276, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 37) {
if (talker.occupation == 47) {
if (gg.OwnItemCount(talker, 2627) == 0) {
myself.GiveItem1(talker, 2627, 1);

}
if (gg.OwnItemCount(talker, 3203) == 0) {
myself.GiveItem1(talker, 3203, 1);

}
if (gg.OwnItemCount(talker, 2762) == 0) {
myself.GiveItem1(talker, 2762, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 38) {
if (talker.occupation == 50) {
if (gg.OwnItemCount(talker, 2721) == 0) {
myself.GiveItem1(talker, 2721, 1);

}
if (gg.OwnItemCount(talker, 3203) == 0) {
myself.GiveItem1(talker, 3203, 1);

}
if (gg.OwnItemCount(talker, 3390) == 0) {
myself.GiveItem1(talker, 3390, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 39) {
if (talker.occupation == 50) {
if (gg.OwnItemCount(talker, 2721) == 0) {
myself.GiveItem1(talker, 2721, 1);

}
if (gg.OwnItemCount(talker, 3203) == 0) {
myself.GiveItem1(talker, 3203, 1);

}
if (gg.OwnItemCount(talker, 2879) == 0) {
myself.GiveItem1(talker, 2879, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 40) {
if (talker.occupation == 54) {
if (gg.OwnItemCount(talker, 3119) == 0) {
myself.GiveItem1(talker, 3119, 1);

}
if (gg.OwnItemCount(talker, 3238) == 0) {
myself.GiveItem1(talker, 3238, 1);

}
if (gg.OwnItemCount(talker, 2809) == 0) {
myself.GiveItem1(talker, 2809, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}
if (reply == 41) {
if (talker.occupation == 56) {
if (gg.OwnItemCount(talker, 3119) == 0) {
myself.GiveItem1(talker, 3119, 1);

}
if (gg.OwnItemCount(talker, 3238) == 0) {
myself.GiveItem1(talker, 3238, 1);

}
if (gg.OwnItemCount(talker, 2867) == 0) {
myself.GiveItem1(talker, 2867, 1);

}
myself.ShowPage(talker, "marketeer_of_mammon_q0060_25.htm");

}

}

}
super;
	}


}