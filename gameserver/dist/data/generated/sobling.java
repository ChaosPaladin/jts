package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sobling extends ai_sobling {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 376) == 0 && talker.level >= 79) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Exploration of the Giants' Cave - Part 1");

}
if (gg.HaveMemo(talker, 376) == 0 && talker.level < 79) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Exploration of the Giants' Cave - Part 1");

}
if (gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 11 && gg.OwnItemCount(talker, 14836) < 1 || gg.OwnItemCount(talker, 14837) < 1 || gg.OwnItemCount(talker, 14838) < 1 || gg.OwnItemCount(talker, 14839) < 1 || gg.OwnItemCount(talker, 14840) < 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Exploration of the Giants' Cave - Part 1 (In Progress)");

}
if (gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 11 && gg.OwnItemCount(talker, 14836) >= 1 && gg.OwnItemCount(talker, 14837) >= 1 && gg.OwnItemCount(talker, 14838) >= 1 && gg.OwnItemCount(talker, 14839) >= 1 && gg.OwnItemCount(talker, 14840) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Exploration of the Giants' Cave - Part 1 (In Progress)");

}
if (gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 1 || gg.GetMemoState(talker, 376) == 2 && gg.OwnItemCount(talker, 5922) < 1 || gg.OwnItemCount(talker, 5923) < 1 || gg.OwnItemCount(talker, 5924) < 1 || gg.OwnItemCount(talker, 5925) < 1 || gg.OwnItemCount(talker, 5926) < 1 && gg.OwnItemCount(talker, 5927) < 1 || gg.OwnItemCount(talker, 5928) < 1 || gg.OwnItemCount(talker, 5929) < 1 || gg.OwnItemCount(talker, 5930) < 1 || gg.OwnItemCount(talker, 5931) < 1 && gg.OwnItemCount(talker, 5932) < 1 || gg.OwnItemCount(talker, 5933) < 1 || gg.OwnItemCount(talker, 5934) < 1 || gg.OwnItemCount(talker, 5935) < 1 || gg.OwnItemCount(talker, 5936) < 1 && gg.OwnItemCount(talker, 5937) < 1 || gg.OwnItemCount(talker, 5938) < 1 || gg.OwnItemCount(talker, 5939) < 1 || gg.OwnItemCount(talker, 5940) < 1 || gg.OwnItemCount(talker, 5941) < 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Exploration of the Giants' Cave - Part 1 (In Progress)");

}
if (gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 1 || gg.GetMemoState(talker, 376) == 2 && gg.OwnItemCount(talker, 5922) >= 1 && gg.OwnItemCount(talker, 5923) >= 1 && gg.OwnItemCount(talker, 5924) >= 1 && gg.OwnItemCount(talker, 5925) >= 1 && gg.OwnItemCount(talker, 5926) >= 1 || gg.OwnItemCount(talker, 5927) >= 1 && gg.OwnItemCount(talker, 5928) >= 1 && gg.OwnItemCount(talker, 5929) >= 1 && gg.OwnItemCount(talker, 5930) >= 1 && gg.OwnItemCount(talker, 5931) >= 1 || gg.OwnItemCount(talker, 5932) >= 1 && gg.OwnItemCount(talker, 5933) >= 1 && gg.OwnItemCount(talker, 5934) >= 1 && gg.OwnItemCount(talker, 5935) >= 1 && gg.OwnItemCount(talker, 5936) >= 1 || gg.OwnItemCount(talker, 5937) >= 1 && gg.OwnItemCount(talker, 5938) >= 1 && gg.OwnItemCount(talker, 5939) >= 1 && gg.OwnItemCount(talker, 5940) >= 1 && gg.OwnItemCount(talker, 5941) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Exploration of the Giants' Cave - Part 1 (In Progress)");

}
if (gg.HaveMemo(talker, 377) == 0 && talker.level >= 79) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Exploration of the Giants' Cave - Part 2");

}
if (gg.HaveMemo(talker, 377) == 0 && talker.level < 79) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Exploration of the Giants' Cave - Part 2");

}
if (gg.HaveMemo(talker, 377) >= 1 && gg.GetMemoState(talker, 377) == 11 && gg.OwnItemCount(talker, 14842) < 1 || gg.OwnItemCount(talker, 14843) < 1 || gg.OwnItemCount(talker, 14844) < 1 || gg.OwnItemCount(talker, 14845) < 1 || gg.OwnItemCount(talker, 14846) < 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Exploration of the Giants' Cave - Part 2 (In Progress)");

}
if (gg.HaveMemo(talker, 377) >= 1 && gg.GetMemoState(talker, 377) == 11 && gg.OwnItemCount(talker, 14842) >= 1 && gg.OwnItemCount(talker, 14843) >= 1 && gg.OwnItemCount(talker, 14844) >= 1 && gg.OwnItemCount(talker, 14845) >= 1 && gg.OwnItemCount(talker, 14846) >= 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Exploration of the Giants' Cave - Part 2 (In Progress)");

}
if (gg.HaveMemo(talker, 377) == 1 && gg.GetMemoState(talker, 377) == 1 && gg.OwnItemCount(talker, 5950) < 1 || gg.OwnItemCount(talker, 5951) < 1 || gg.OwnItemCount(talker, 5952) < 1 || gg.OwnItemCount(talker, 5953) < 1 || gg.OwnItemCount(talker, 5954) < 1 && gg.OwnItemCount(talker, 5945) < 1 || gg.OwnItemCount(talker, 5946) < 1 || gg.OwnItemCount(talker, 5947) < 1 || gg.OwnItemCount(talker, 5948) < 1 || gg.OwnItemCount(talker, 5949) < 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Exploration of the Giants' Cave - Part 2 (In Progress)");

}
if (gg.HaveMemo(talker, 377) == 1 && gg.GetMemoState(talker, 377) == 1 && gg.OwnItemCount(talker, 5950) >= 1 && gg.OwnItemCount(talker, 5951) >= 1 && gg.OwnItemCount(talker, 5952) >= 1 && gg.OwnItemCount(talker, 5953) >= 1 && gg.OwnItemCount(talker, 5954) >= 1 || gg.OwnItemCount(talker, 5945) >= 1 && gg.OwnItemCount(talker, 5946) >= 1 && gg.OwnItemCount(talker, 5947) >= 1 && gg.OwnItemCount(talker, 5948) >= 1 && gg.OwnItemCount(talker, 5949) >= 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Exploration of the Giants' Cave - Part 2 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 376) == 0 && talker.level >= 79) {
myself.SetCurrentQuestID(376);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.FHTML_SetFileName(fhtml0, "sobling_q0376_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 376);
myself.ShowQuestFHTML(talker, fhtml0, 376);

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 376) == 0 && talker.level < 79) {
myself.SetCurrentQuestID(376);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sobling_q0376_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 11 && gg.OwnItemCount(talker, 14836) < 1 || gg.OwnItemCount(talker, 14837) < 1 || gg.OwnItemCount(talker, 14838) < 1 || gg.OwnItemCount(talker, 14839) < 1 || gg.OwnItemCount(talker, 14840) < 1) {
myself.SetCurrentQuestID(376);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sobling_q0376_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 11 && gg.OwnItemCount(talker, 14836) >= 1 && gg.OwnItemCount(talker, 14837) >= 1 && gg.OwnItemCount(talker, 14838) >= 1 && gg.OwnItemCount(talker, 14839) >= 1 && gg.OwnItemCount(talker, 14840) >= 1) {
myself.SetCurrentQuestID(376);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sobling_q0376_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 1 || gg.GetMemoState(talker, 376) == 2 && gg.OwnItemCount(talker, 5922) < 1 || gg.OwnItemCount(talker, 5923) < 1 || gg.OwnItemCount(talker, 5924) < 1 || gg.OwnItemCount(talker, 5925) < 1 || gg.OwnItemCount(talker, 5926) < 1 && gg.OwnItemCount(talker, 5927) < 1 || gg.OwnItemCount(talker, 5928) < 1 || gg.OwnItemCount(talker, 5929) < 1 || gg.OwnItemCount(talker, 5930) < 1 || gg.OwnItemCount(talker, 5931) < 1 && gg.OwnItemCount(talker, 5932) < 1 || gg.OwnItemCount(talker, 5933) < 1 || gg.OwnItemCount(talker, 5934) < 1 || gg.OwnItemCount(talker, 5935) < 1 || gg.OwnItemCount(talker, 5936) < 1 && gg.OwnItemCount(talker, 5937) < 1 || gg.OwnItemCount(talker, 5938) < 1 || gg.OwnItemCount(talker, 5939) < 1 || gg.OwnItemCount(talker, 5940) < 1 || gg.OwnItemCount(talker, 5941) < 1) {
myself.SetCurrentQuestID(376);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sobling_q0376_04.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 1 || gg.GetMemoState(talker, 376) == 2 && gg.OwnItemCount(talker, 5922) >= 1 && gg.OwnItemCount(talker, 5923) >= 1 && gg.OwnItemCount(talker, 5924) >= 1 && gg.OwnItemCount(talker, 5925) >= 1 && gg.OwnItemCount(talker, 5926) >= 1 || gg.OwnItemCount(talker, 5927) >= 1 && gg.OwnItemCount(talker, 5928) >= 1 && gg.OwnItemCount(talker, 5929) >= 1 && gg.OwnItemCount(talker, 5930) >= 1 && gg.OwnItemCount(talker, 5931) >= 1 || gg.OwnItemCount(talker, 5932) >= 1 && gg.OwnItemCount(talker, 5933) >= 1 && gg.OwnItemCount(talker, 5934) >= 1 && gg.OwnItemCount(talker, 5935) >= 1 && gg.OwnItemCount(talker, 5936) >= 1 || gg.OwnItemCount(talker, 5937) >= 1 && gg.OwnItemCount(talker, 5938) >= 1 && gg.OwnItemCount(talker, 5939) >= 1 && gg.OwnItemCount(talker, 5940) >= 1 && gg.OwnItemCount(talker, 5941) >= 1) {
myself.SetCurrentQuestID(376);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 5922) > 0 && gg.OwnItemCount(talker, 5923) > 0 && gg.OwnItemCount(talker, 5924) > 0 && gg.OwnItemCount(talker, 5925) > 0 && gg.OwnItemCount(talker, 5926) > 0) {
myself.DeleteItem1(talker, 5922, 1);
myself.DeleteItem1(talker, 5923, 1);
myself.DeleteItem1(talker, 5924, 1);
myself.DeleteItem1(talker, 5925, 1);
myself.DeleteItem1(talker, 5926, 1);
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 5416, 1);

} else {
myself.GiveItem1(talker, 5418, 1);

}

}
if (gg.OwnItemCount(talker, 5927) > 0 && gg.OwnItemCount(talker, 5928) > 0 && gg.OwnItemCount(talker, 5929) > 0 && gg.OwnItemCount(talker, 5930) > 0 && gg.OwnItemCount(talker, 5931) > 0) {
myself.DeleteItem1(talker, 5927, 1);
myself.DeleteItem1(talker, 5928, 1);
myself.DeleteItem1(talker, 5929, 1);
myself.DeleteItem1(talker, 5930, 1);
myself.DeleteItem1(talker, 5931, 1);
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 5424, 1);

} else {
myself.GiveItem1(talker, 5340, 1);

}

}
if (gg.OwnItemCount(talker, 5932) > 0 && gg.OwnItemCount(talker, 5933) > 0 && gg.OwnItemCount(talker, 5934) > 0 && gg.OwnItemCount(talker, 5935) > 0 && gg.OwnItemCount(talker, 5936) > 0) {
myself.DeleteItem1(talker, 5932, 1);
myself.DeleteItem1(talker, 5933, 1);
myself.DeleteItem1(talker, 5934, 1);
myself.DeleteItem1(talker, 5935, 1);
myself.DeleteItem1(talker, 5936, 1);
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 5332, 1);

} else {
myself.GiveItem1(talker, 5334, 1);

}

}
if (gg.OwnItemCount(talker, 5937) > 0 && gg.OwnItemCount(talker, 5938) > 0 && gg.OwnItemCount(talker, 5939) > 0 && gg.OwnItemCount(talker, 5940) > 0 && gg.OwnItemCount(talker, 5941) > 0) {
myself.DeleteItem1(talker, 5937, 1);
myself.DeleteItem1(talker, 5938, 1);
myself.DeleteItem1(talker, 5939, 1);
myself.DeleteItem1(talker, 5940, 1);
myself.DeleteItem1(talker, 5941, 1);
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 5354, 1);

} else {
myself.GiveItem1(talker, 5346, 1);

}

}
gg.AddLog(3, talker, 376);
myself.ShowPage(talker, "sobling_q0376_05.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 377) == 0 && talker.level >= 79) {
myself.SetCurrentQuestID(377);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.FHTML_SetFileName(fhtml0, "sobling_q0377_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 377);
myself.ShowQuestFHTML(talker, fhtml0, 377);

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 377) == 0 && talker.level < 79) {
myself.SetCurrentQuestID(377);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sobling_q0377_02.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 377) >= 1 && gg.GetMemoState(talker, 377) == 11 && gg.OwnItemCount(talker, 14842) < 1 || gg.OwnItemCount(talker, 14843) < 1 || gg.OwnItemCount(talker, 14844) < 1 || gg.OwnItemCount(talker, 14845) < 1 || gg.OwnItemCount(talker, 14846) < 1) {
myself.SetCurrentQuestID(377);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sobling_q0377_04.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 377) >= 1 && gg.GetMemoState(talker, 377) == 11 && gg.OwnItemCount(talker, 14842) >= 1 && gg.OwnItemCount(talker, 14843) >= 1 && gg.OwnItemCount(talker, 14844) >= 1 && gg.OwnItemCount(talker, 14845) >= 1 && gg.OwnItemCount(talker, 14846) >= 1) {
myself.SetCurrentQuestID(377);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sobling_q0377_05.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 377) == 1 && gg.GetMemoState(talker, 377) == 1 && gg.OwnItemCount(talker, 5950) < 1 || gg.OwnItemCount(talker, 5951) < 1 || gg.OwnItemCount(talker, 5952) < 1 || gg.OwnItemCount(talker, 5953) < 1 || gg.OwnItemCount(talker, 5954) < 1 && gg.OwnItemCount(talker, 5945) < 1 || gg.OwnItemCount(talker, 5946) < 1 || gg.OwnItemCount(talker, 5947) < 1 || gg.OwnItemCount(talker, 5948) < 1 || gg.OwnItemCount(talker, 5949) < 1) {
myself.SetCurrentQuestID(377);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "sobling_q0377_04.htm", 377);

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 377) == 1 && gg.GetMemoState(talker, 377) == 1 && gg.OwnItemCount(talker, 5950) >= 1 && gg.OwnItemCount(talker, 5951) >= 1 && gg.OwnItemCount(talker, 5952) >= 1 && gg.OwnItemCount(talker, 5953) >= 1 && gg.OwnItemCount(talker, 5954) >= 1 || gg.OwnItemCount(talker, 5945) >= 1 && gg.OwnItemCount(talker, 5946) >= 1 && gg.OwnItemCount(talker, 5947) >= 1 && gg.OwnItemCount(talker, 5948) >= 1 && gg.OwnItemCount(talker, 5949) >= 1) {
myself.SetCurrentQuestID(377);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 5950) > 0 && gg.OwnItemCount(talker, 5951) > 0 && gg.OwnItemCount(talker, 5952) > 0 && gg.OwnItemCount(talker, 5953) > 0 && gg.OwnItemCount(talker, 5954) > 0) {
myself.DeleteItem1(talker, 5950, 1);
myself.DeleteItem1(talker, 5951, 1);
myself.DeleteItem1(talker, 5952, 1);
myself.DeleteItem1(talker, 5953, 1);
myself.DeleteItem1(talker, 5954, 1);
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 5422, 1);

} else {
myself.GiveItem1(talker, 5420, 1);

}

}
if (gg.OwnItemCount(talker, 5945) > 0 && gg.OwnItemCount(talker, 5946) > 0 && gg.OwnItemCount(talker, 5947) > 0 && gg.OwnItemCount(talker, 5948) > 0 && gg.OwnItemCount(talker, 5949) > 0) {
myself.DeleteItem1(talker, 5945, 1);
myself.DeleteItem1(talker, 5946, 1);
myself.DeleteItem1(talker, 5947, 1);
myself.DeleteItem1(talker, 5948, 1);
myself.DeleteItem1(talker, 5949, 1);
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 5336, 1);

} else {
myself.GiveItem1(talker, 5338, 1);

}

}
gg.AddLog(2, talker, 377);
myself.ShowQuestPage(talker, "sobling_q0377_05.htm", 377);

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
if (quest_id == 376) {
myself.SetCurrentQuestID(376);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 376);
myself.SetMemoState(talker, 376, 11);
myself.SetJournal(talker, 376, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sobling_q0376_03.htm", 376);
gg.AddLog(1, talker, quest_id);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}
return;

}
if (quest_id == 377) {
myself.SetCurrentQuestID(377);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 377);
myself.SetMemoState(talker, 377, 11);
myself.SetJournal(talker, 377, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sobling_q0377_03.htm", 377);
gg.AddLog(1, talker, quest_id);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 376) {
myself.SetCurrentQuestID(376);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 376) {
if (reply == 1 && gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 11 && gg.OwnItemCount(talker, 14836) >= 1 && gg.OwnItemCount(talker, 14837) >= 1 && gg.OwnItemCount(talker, 14838) >= 1 && gg.OwnItemCount(talker, 14839) >= 1 && gg.OwnItemCount(talker, 14840) >= 1) {
myself.ShowPage(talker, "sobling_q0376_07.htm");

} else if (reply == 1 && gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 11 && gg.OwnItemCount(talker, 14836) < 1 || gg.OwnItemCount(talker, 14837) < 1 || gg.OwnItemCount(talker, 14838) < 1 || gg.OwnItemCount(talker, 14839) < 1 || gg.OwnItemCount(talker, 14840) < 1) {
myself.ShowPage(talker, "sobling_q0376_04.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "sobling_q0376_06.htm");

}
if (reply == 3) {
myself.RemoveMemo(talker, 376);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "sobling_q0376_09.htm");
gg.AddLog(2, talker, 376);

}
if (reply == 10 && gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 11 && gg.OwnItemCount(talker, 14836) >= 1 && gg.OwnItemCount(talker, 14837) >= 1 && gg.OwnItemCount(talker, 14838) >= 1 && gg.OwnItemCount(talker, 14839) >= 1 && gg.OwnItemCount(talker, 14840) >= 1) {
myself.ShowPage(talker, "sobling_q0376_07a.htm");

}
if (reply == 20 && gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 11 && gg.OwnItemCount(talker, 14836) >= 1 && gg.OwnItemCount(talker, 14837) >= 1 && gg.OwnItemCount(talker, 14838) >= 1 && gg.OwnItemCount(talker, 14839) >= 1 && gg.OwnItemCount(talker, 14840) >= 1) {
myself.ShowPage(talker, "sobling_q0376_07b.htm");

}
if (reply >= 11 && reply <= 19 && gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 11) {
if (gg.OwnItemCount(talker, 14836) >= 10 && gg.OwnItemCount(talker, 14837) >= 10 && gg.OwnItemCount(talker, 14838) >= 10 && gg.OwnItemCount(talker, 14839) >= 10 && gg.OwnItemCount(talker, 14840) >= 10) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
if (reply == 11) {
myself.GiveItem1(talker, 9967, 1);

}
if (reply == 12) {
myself.GiveItem1(talker, 9968, 1);

}
if (reply == 13) {
myself.GiveItem1(talker, 9969, 1);

}
if (reply == 14) {
myself.GiveItem1(talker, 9970, 1);

}
if (reply == 15) {
myself.GiveItem1(talker, 9971, 1);

}
if (reply == 16) {
myself.GiveItem1(talker, 9972, 1);

}
if (reply == 17) {
myself.GiveItem1(talker, 9973, 1);

}
if (reply == 18) {
myself.GiveItem1(talker, 9974, 1);

}
if (reply == 19) {
myself.GiveItem1(talker, 9975, 1);

}
myself.DeleteItem1(talker, 14836, 10);
myself.DeleteItem1(talker, 14837, 10);
myself.DeleteItem1(talker, 14838, 10);
myself.DeleteItem1(talker, 14839, 10);
myself.DeleteItem1(talker, 14840, 10);
myself.ShowPage(talker, "sobling_q0376_08a.htm");
gg.AddLog(3, talker, 376);

}

} else {
myself.ShowPage(talker, "sobling_q0376_08d.htm");

}

}
if (reply >= 21 && reply <= 24 && gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 11 && gg.OwnItemCount(talker, 14836) >= 1 && gg.OwnItemCount(talker, 14837) >= 1 && gg.OwnItemCount(talker, 14838) >= 1 && gg.OwnItemCount(talker, 14839) >= 1 && gg.OwnItemCount(talker, 14840) >= 1) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
if (reply == 21) {
myself.GiveItem1(talker, 9628, 6);
myself.GiveItem1(talker, 57, 9750);
myself.ShowPage(talker, "sobling_q0376_08b.htm");

}
if (reply == 22) {
myself.GiveItem1(talker, 9629, 3);
myself.GiveItem1(talker, 57, 30750);
myself.ShowPage(talker, "sobling_q0376_08b.htm");

}
if (reply == 23) {
myself.GiveItem1(talker, 9630, 4);
myself.GiveItem1(talker, 57, 11150);
myself.ShowPage(talker, "sobling_q0376_08b.htm");

}
if (reply == 24) {
if (gg.Rand(1000) < 461) {
myself.GiveItem1(talker, 9628, 2);

} else {
myself.GiveItem1(talker, 9628, 1);

}
if (gg.Rand(1000) < 461) {
myself.GiveItem1(talker, 9629, 2);

} else {
myself.GiveItem1(talker, 9629, 1);

}
if (gg.Rand(1000) < 461) {
myself.GiveItem1(talker, 9630, 2);

} else {
myself.GiveItem1(talker, 9630, 1);

}
myself.ShowPage(talker, "sobling_q0376_08c.htm");

}
myself.DeleteItem1(talker, 14836, 1);
myself.DeleteItem1(talker, 14837, 1);
myself.DeleteItem1(talker, 14838, 1);
myself.DeleteItem1(talker, 14839, 1);
myself.DeleteItem1(talker, 14840, 1);
gg.AddLog(3, talker, 376);

}

}

}
if (ask == 376) {
myself.SetCurrentQuestID(376);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 376) {
if (reply == 1 && gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 1 || gg.GetMemoState(talker, 376) == 2 && gg.OwnItemCount(talker, 5922) >= 1 && gg.OwnItemCount(talker, 5923) >= 1 && gg.OwnItemCount(talker, 5924) >= 1 && gg.OwnItemCount(talker, 5925) >= 1 && gg.OwnItemCount(talker, 5926) >= 1 || gg.OwnItemCount(talker, 5927) >= 1 && gg.OwnItemCount(talker, 5928) >= 1 && gg.OwnItemCount(talker, 5929) >= 1 && gg.OwnItemCount(talker, 5930) >= 1 && gg.OwnItemCount(talker, 5931) >= 1 || gg.OwnItemCount(talker, 5932) >= 1 && gg.OwnItemCount(talker, 5933) >= 1 && gg.OwnItemCount(talker, 5934) >= 1 && gg.OwnItemCount(talker, 5935) >= 1 && gg.OwnItemCount(talker, 5936) >= 1 || gg.OwnItemCount(talker, 5937) >= 1 && gg.OwnItemCount(talker, 5938) >= 1 && gg.OwnItemCount(talker, 5939) >= 1 && gg.OwnItemCount(talker, 5940) >= 1 && gg.OwnItemCount(talker, 5941) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 5922) > 0 && gg.OwnItemCount(talker, 5923) > 0 && gg.OwnItemCount(talker, 5924) > 0 && gg.OwnItemCount(talker, 5925) > 0 && gg.OwnItemCount(talker, 5926) > 0) {
myself.DeleteItem1(talker, 5922, 1);
myself.DeleteItem1(talker, 5923, 1);
myself.DeleteItem1(talker, 5924, 1);
myself.DeleteItem1(talker, 5925, 1);
myself.DeleteItem1(talker, 5926, 1);
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 5416, 1);

} else {
myself.GiveItem1(talker, 5418, 1);

}

}
if (gg.OwnItemCount(talker, 5927) > 0 && gg.OwnItemCount(talker, 5928) > 0 && gg.OwnItemCount(talker, 5929) > 0 && gg.OwnItemCount(talker, 5930) > 0 && gg.OwnItemCount(talker, 5931) > 0) {
myself.DeleteItem1(talker, 5927, 1);
myself.DeleteItem1(talker, 5928, 1);
myself.DeleteItem1(talker, 5929, 1);
myself.DeleteItem1(talker, 5930, 1);
myself.DeleteItem1(talker, 5931, 1);
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 5424, 1);

} else {
myself.GiveItem1(talker, 5340, 1);

}

}
if (gg.OwnItemCount(talker, 5932) > 0 && gg.OwnItemCount(talker, 5933) > 0 && gg.OwnItemCount(talker, 5934) > 0 && gg.OwnItemCount(talker, 5935) > 0 && gg.OwnItemCount(talker, 5936) > 0) {
myself.DeleteItem1(talker, 5932, 1);
myself.DeleteItem1(talker, 5933, 1);
myself.DeleteItem1(talker, 5934, 1);
myself.DeleteItem1(talker, 5935, 1);
myself.DeleteItem1(talker, 5936, 1);
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 5332, 1);

} else {
myself.GiveItem1(talker, 5334, 1);

}

}
if (gg.OwnItemCount(talker, 5937) > 0 && gg.OwnItemCount(talker, 5938) > 0 && gg.OwnItemCount(talker, 5939) > 0 && gg.OwnItemCount(talker, 5940) > 0 && gg.OwnItemCount(talker, 5941) > 0) {
myself.DeleteItem1(talker, 5937, 1);
myself.DeleteItem1(talker, 5938, 1);
myself.DeleteItem1(talker, 5939, 1);
myself.DeleteItem1(talker, 5940, 1);
myself.DeleteItem1(talker, 5941, 1);
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 5354, 1);

} else {
myself.GiveItem1(talker, 5346, 1);

}

}
myself.ShowPage(talker, "sobling_q0376_05.htm");
gg.AddLog(3, talker, 376);

}

} else if (reply == 1 && gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 1 || gg.GetMemoState(talker, 376) == 2) {
myself.ShowPage(talker, "sobling_q0376_04.htm");

}
if (reply == 2 && gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 1 || gg.GetMemoState(talker, 376) == 2) {
myself.ShowPage(talker, "sobling_q0376_06.htm");

}
if (reply == 3 && gg.HaveMemo(talker, 376) >= 1 && gg.GetMemoState(talker, 376) == 1 || gg.GetMemoState(talker, 376) == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.RemoveMemo(talker, 376);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "sobling_q0376_07.htm");
gg.AddLog(2, talker, 376);

}

}

}
if (ask == 377) {
myself.SetCurrentQuestID(377);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 377) {
if (reply == 1 && gg.HaveMemo(talker, 377) >= 1 && gg.GetMemoState(talker, 377) == 11 && gg.OwnItemCount(talker, 14842) >= 1 && gg.OwnItemCount(talker, 14843) >= 1 && gg.OwnItemCount(talker, 14844) >= 1 && gg.OwnItemCount(talker, 14845) >= 1 && gg.OwnItemCount(talker, 14846) >= 1) {
myself.ShowPage(talker, "sobling_q0377_07.htm");

} else if (reply == 1 && gg.HaveMemo(talker, 377) >= 1 && gg.GetMemoState(talker, 377) == 11 && gg.OwnItemCount(talker, 14842) < 1 || gg.OwnItemCount(talker, 14843) < 1 || gg.OwnItemCount(talker, 14844) < 1 || gg.OwnItemCount(talker, 14845) < 1 || gg.OwnItemCount(talker, 14846) < 1) {
myself.ShowPage(talker, "sobling_q0377_04.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "sobling_q0377_06.htm");

}
if (reply == 3) {
myself.RemoveMemo(talker, 377);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "sobling_q0377_09.htm");
gg.AddLog(2, talker, 377);

}
if (reply == 10 && gg.HaveMemo(talker, 377) >= 1 && gg.GetMemoState(talker, 377) == 11 && gg.OwnItemCount(talker, 14842) >= 1 && gg.OwnItemCount(talker, 14843) >= 1 && gg.OwnItemCount(talker, 14844) >= 1 && gg.OwnItemCount(talker, 14845) >= 1 && gg.OwnItemCount(talker, 14846) >= 1) {
myself.ShowPage(talker, "sobling_q0377_07a.htm");

}
if (reply == 20 && gg.HaveMemo(talker, 377) >= 1 && gg.GetMemoState(talker, 377) == 11 && gg.OwnItemCount(talker, 14842) >= 1 && gg.OwnItemCount(talker, 14843) >= 1 && gg.OwnItemCount(talker, 14844) >= 1 && gg.OwnItemCount(talker, 14845) >= 1 && gg.OwnItemCount(talker, 14846) >= 1) {
myself.ShowPage(talker, "sobling_q0377_07b.htm");

}
if (reply == 11 && gg.HaveMemo(talker, 377) >= 1 && gg.GetMemoState(talker, 377) == 11) {
if (gg.OwnItemCount(talker, 14842) >= 5 && gg.OwnItemCount(talker, 14843) >= 5 && gg.OwnItemCount(talker, 14844) >= 5 && gg.OwnItemCount(talker, 14845) >= 5 && gg.OwnItemCount(talker, 14846) >= 5) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
i0 = gg.Rand(10);
if (i0 < 6) {
myself.GiveItem1(talker, 9625, 1);

} else {
myself.GiveItem1(talker, 9626, 1);

}
myself.DeleteItem1(talker, 14842, 5);
myself.DeleteItem1(talker, 14843, 5);
myself.DeleteItem1(talker, 14844, 5);
myself.DeleteItem1(talker, 14845, 5);
myself.DeleteItem1(talker, 14846, 5);
myself.ShowPage(talker, "sobling_q0377_08a.htm");
gg.AddLog(3, talker, 377);

}

} else {
myself.ShowPage(talker, "sobling_q0377_08d.htm");

}

}
if (reply >= 21 && reply <= 24 && gg.HaveMemo(talker, 377) >= 1 && gg.GetMemoState(talker, 377) == 11 && gg.OwnItemCount(talker, 14842) >= 1 && gg.OwnItemCount(talker, 14843) >= 1 && gg.OwnItemCount(talker, 14844) >= 1 && gg.OwnItemCount(talker, 14845) >= 1 && gg.OwnItemCount(talker, 14846) >= 1) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
if (reply == 21) {
myself.GiveItem1(talker, 9628, 6);
myself.GiveItem1(talker, 57, 9750);
myself.ShowPage(talker, "sobling_q0377_08b.htm");

}
if (reply == 22) {
myself.GiveItem1(talker, 9629, 3);
myself.GiveItem1(talker, 57, 30750);
myself.ShowPage(talker, "sobling_q0377_08b.htm");

}
if (reply == 23) {
myself.GiveItem1(talker, 9630, 4);
myself.GiveItem1(talker, 57, 11150);
myself.ShowPage(talker, "sobling_q0377_08b.htm");

}
if (reply == 24) {
if (gg.Rand(1000) < 461) {
myself.GiveItem1(talker, 9628, 2);

} else {
myself.GiveItem1(talker, 9628, 1);

}
if (gg.Rand(1000) < 461) {
myself.GiveItem1(talker, 9629, 2);

} else {
myself.GiveItem1(talker, 9629, 1);

}
if (gg.Rand(1000) < 461) {
myself.GiveItem1(talker, 9630, 2);

} else {
myself.GiveItem1(talker, 9630, 1);

}
myself.ShowPage(talker, "sobling_q0377_08c.htm");

}
myself.DeleteItem1(talker, 14842, 1);
myself.DeleteItem1(talker, 14843, 1);
myself.DeleteItem1(talker, 14844, 1);
myself.DeleteItem1(talker, 14845, 1);
myself.DeleteItem1(talker, 14846, 1);
gg.AddLog(3, talker, 377);

}

}

}
if (ask == 377) {
myself.SetCurrentQuestID(377);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 377) {
if (reply == 1 && gg.HaveMemo(talker, 377) >= 1 && gg.GetMemoState(talker, 377) == 1 && gg.OwnItemCount(talker, 5950) >= 1 && gg.OwnItemCount(talker, 5951) >= 1 && gg.OwnItemCount(talker, 5952) >= 1 && gg.OwnItemCount(talker, 5953) >= 1 && gg.OwnItemCount(talker, 5954) >= 1 || gg.OwnItemCount(talker, 5945) >= 1 && gg.OwnItemCount(talker, 5946) >= 1 && gg.OwnItemCount(talker, 5947) >= 1 && gg.OwnItemCount(talker, 5948) >= 1 && gg.OwnItemCount(talker, 5949) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 5950) > 0 && gg.OwnItemCount(talker, 5951) > 0 && gg.OwnItemCount(talker, 5952) > 0 && gg.OwnItemCount(talker, 5953) > 0 && gg.OwnItemCount(talker, 5954) > 0) {
myself.DeleteItem1(talker, 5950, 1);
myself.DeleteItem1(talker, 5951, 1);
myself.DeleteItem1(talker, 5952, 1);
myself.DeleteItem1(talker, 5953, 1);
myself.DeleteItem1(talker, 5954, 1);
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 5422, 1);

} else {
myself.GiveItem1(talker, 5420, 1);

}

}
if (gg.OwnItemCount(talker, 5945) > 0 && gg.OwnItemCount(talker, 5946) > 0 && gg.OwnItemCount(talker, 5947) > 0 && gg.OwnItemCount(talker, 5948) > 0 && gg.OwnItemCount(talker, 5949) > 0) {
myself.DeleteItem1(talker, 5945, 1);
myself.DeleteItem1(talker, 5946, 1);
myself.DeleteItem1(talker, 5947, 1);
myself.DeleteItem1(talker, 5948, 1);
myself.DeleteItem1(talker, 5949, 1);
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 5336, 1);

} else {
myself.GiveItem1(talker, 5338, 1);

}

}
gg.AddLog(3, talker, 377);
myself.ShowQuestPage(talker, "sobling_q0377_05.htm", 377);

}

} else if (reply == 1 && gg.HaveMemo(talker, 377) >= 1 && gg.GetMemoState(talker, 377) == 1) {
myself.ShowQuestPage(talker, "sobling_q0377_04.htm", 377);

}
if (reply == 2 && gg.HaveMemo(talker, 377) >= 1 && gg.GetMemoState(talker, 377) == 1) {
myself.ShowQuestPage(talker, "sobling_q0377_06.htm", 377);

}
if (reply == 3 && gg.HaveMemo(talker, 377) >= 1 && gg.GetMemoState(talker, 377) == 1) {
myself.RemoveMemo(talker, 377);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowQuestPage(talker, "sobling_q0377_07.htm", 377);
gg.AddLog(2, talker, 377);

}

}
super;
	}


}