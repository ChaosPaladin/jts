package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class carl extends citizen {
	protected void TALKED(HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.GetMemoStateEx(talker, 255, 1) < 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Fighter's Tutorial");

}
if (gg.GetMemoStateEx(talker, 255, 1) == 1 || gg.GetMemoStateEx(talker, 255, 1) == 2 || gg.GetMemoStateEx(talker, 255, 1) == 0 && gg.OwnItemCount(talker, 6353) < 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Fighter's Tutorial");

}
if (gg.GetMemoStateEx(talker, 255, 1) == 1 || gg.GetMemoStateEx(talker, 255, 1) == 2 || gg.GetMemoStateEx(talker, 255, 1) == 0 && gg.OwnItemCount(talker, 6353) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Fighter's Tutorial");

}
if (gg.GetMemoStateEx(talker, 255, 1) == 3) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Fighter's Tutorial");

}
if (gg.GetMemoStateEx(talker, 255, 1) > 3) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Fighter's Tutorial");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 0);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.GetMemoStateEx(talker, 255, 1) < 0) {
myself.SetCurrentQuestID(201);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.occupation == 0 && talker.race == 0) {
myself.DeleteRadar(talker, -71424, 258336, -3109, 2);
myself.AddTimerEx(gg.GetIndexFromCreature(talker) + 1000000, 1000 * 30);
myself.ShowPage(talker, "carl001.htm");
myself.SetMemoStateEx(talker, 255, 1, 0);
i1 = gg.GetMemoState(talker, 255);
i0 = i1 & 2147483392;
myself.EnableTutorialEvent(talker, i0 | 1048576);

} else {
myself.ShowPage(talker, "carl006.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.GetMemoStateEx(talker, 255, 1) == 1 || gg.GetMemoStateEx(talker, 255, 1) == 2 || gg.GetMemoStateEx(talker, 255, 1) == 0 && gg.OwnItemCount(talker, 6353) < 1) {
myself.SetCurrentQuestID(201);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "carl002.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.GetMemoStateEx(talker, 255, 1) == 1 || gg.GetMemoStateEx(talker, 255, 1) == 2 || gg.GetMemoStateEx(talker, 255, 1) == 0 && gg.OwnItemCount(talker, 6353) > 0) {
myself.SetCurrentQuestID(201);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "carl003.htm");
myself.DeleteItem1(talker, 6353, gg.OwnItemCount(talker, 6353));
myself.SetMemoStateEx(talker, 255, 1, 3);
myself.GiveItem1(talker, 1067, 1);
myself.AddTimerEx(gg.GetIndexFromCreature(talker) + 1000000, 1000 * 30);
i0 = gg.GetMemoState(talker, 255) & 2147483392;
myself.SetMemoState(talker, 255, i0 | 4);
if (myself.IsInCategory(0, talker.occupation) && gg.OwnItemCount(talker, 5789) <= 0) {
myself.GiveItem1(talker, 5789, 200);
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);

}
if (myself.IsInCategory(1, talker.occupation) && gg.OwnItemCount(talker, 5789) <= 0 && gg.OwnItemCount(talker, 5790) <= 0) {
if (talker.occupation == 49) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 200);

} else {
myself.VoiceEffect(talker, "tutorial_voice_027", 1000);
myself.GiveItem1(talker, 5790, 100);

}

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.GetMemoStateEx(talker, 255, 1) == 3) {
myself.SetCurrentQuestID(201);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "carl004.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.GetMemoStateEx(talker, 255, 1) > 3) {
myself.SetCurrentQuestID(201);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "carl005.htm");

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam talker, HandlerParam timer_id) {
myself.SetCurrentQuestID(201);
if (timer_id <= 1000000) {
return;

}
talker = gg.GetCreatureFromIndex(timer_id - 1000000);
if (myself.IsNullCreature(talker) == 0) {
if (talker.alive == 0 || talker.is_pc == 0) {
return;

}
if (gg.GetMemoStateEx(talker, 255, 1) == 0 && timer_id >= 1000000) {
myself.VoiceEffect(talker, "tutorial_voice_009a", 0);
myself.SetMemoStateEx(talker, 255, 1, 1);

}
if (gg.GetMemoStateEx(talker, 255, 1) == 3 && timer_id >= 1000000) {
myself.VoiceEffect(talker, "tutorial_voice_010a", 0);

}

}
super;
	}


}