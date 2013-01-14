package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class carrier_torocco extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1560) && gg.OwnItemCount(talker, 1561) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1560) == 0 && gg.OwnItemCount(talker, 1561)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1566) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1566) == 0 && gg.OwnItemCount(talker, 1560) == 0 && gg.OwnItemCount(talker, 1561) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3260) == 0 && gg.OwnItemCount(talker, 3263) == 0 && gg.OwnItemCount(talker, 3249) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3263) >= 1 && gg.OwnItemCount(talker, 3260) == 0 && gg.OwnItemCount(talker, 3249) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Prosperity (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1560) && gg.OwnItemCount(talker, 1561) == 0) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "carrier_torocco_q0108_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1560) == 0 && gg.OwnItemCount(talker, 1561)) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "carrier_torocco_q0108_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1566) == 1) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "carrier_torocco_q0108_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1566) == 0 && gg.OwnItemCount(talker, 1560) == 0 && gg.OwnItemCount(talker, 1561) == 0) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "carrier_torocco_q0108_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3260) == 0 && gg.OwnItemCount(talker, 3263) == 0 && gg.OwnItemCount(talker, 3249) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "carrier_torocco_q0221_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3263) >= 1 && gg.OwnItemCount(talker, 3260) == 0 && gg.OwnItemCount(talker, 3249) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "carrier_torocco_q0221_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 108) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 108 && reply == 1 && gg.OwnItemCount(talker, 1560) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "carrier_torocco_q0108_02.htm");
myself.DeleteItem1(talker, 1560, 1);
myself.GiveItem1(talker, 1561, 1);
myself.SetFlagJournal(talker, 108, 3);
myself.ShowQuestMark(talker, 108);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 221) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 221) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "carrier_torocco_q0221_02.htm");
myself.GiveItem1(talker, 3263, 1);

}

}

}
super;
	}


}