package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class foreman_laferon extends citizen {
	protected void TALKED(HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.OwnItemCount(talker, 1498) > 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Dwarf's Tutorial");

}
if (gg.OwnItemCount(talker, 1498) == 0 && gg.GetMemoStateEx(talker, 255, 1) > 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Dwarf's Tutorial");

}
if (gg.OwnItemCount(talker, 1498) == 0 && gg.GetMemoStateEx(talker, 255, 1) <= 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Dwarf's Tutorial");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 0);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.OwnItemCount(talker, 1498) > 0) {
myself.SetCurrentQuestID(206);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "foreman_laferon001.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.OwnItemCount(talker, 1498) == 0 && gg.GetMemoStateEx(talker, 255, 1) > 3) {
myself.SetCurrentQuestID(206);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "foreman_laferon004.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.OwnItemCount(talker, 1498) == 0 && gg.GetMemoStateEx(talker, 255, 1) <= 3) {
myself.SetCurrentQuestID(206);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "foreman_laferon003.htm");

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam talker, HandlerParam timer_id) {
myself.SetCurrentQuestID(206);
if (timer_id <= 1000000) {
return;

}
talker = gg.GetCreatureFromIndex(timer_id - 1000000);
if (myself.IsNullCreature(talker) == 0) {
if (talker.alive == 0 || talker.is_pc == 0) {
return;

}
if (gg.GetMemoStateEx(talker, 255, 1) >= 4 && timer_id >= 1000000) {
myself.ShowQuestionMark(talker, 7);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.VoiceEffect(talker, "tutorial_voice_025", 1000);

}

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 206) {
myself.SetCurrentQuestID(206);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 420) {
if (reply == 31 && gg.OwnItemCount(talker, 1498) > 0) {
if (myself.IsInCategory(0, talker.occupation) && gg.OwnItemCount(talker, 5789) <= 200) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 200);
myself.IncrementParam(talker, 1, 50);

}
if (myself.IsInCategory(1, talker.occupation) && gg.OwnItemCount(talker, 5789) <= 200 && gg.OwnItemCount(talker, 5790) <= 100) {
myself.VoiceEffect(talker, "tutorial_voice_027", 1000);
myself.GiveItem1(talker, 5790, 100);
myself.IncrementParam(talker, 1, 50);

}
myself.ShowPage(talker, "foreman_laferon002.htm");
myself.DeleteItem1(talker, 1498, 1);
myself.AddTimerEx(gg.GetIndexFromCreature(talker) + 1000000, 1000 * 60);
if (gg.GetMemoStateEx(talker, 255, 1) <= 3) {
myself.SetMemoStateEx(talker, 255, 1, 4);

}

}
if (reply == 41) {
myself.ShowPage(talker, "foreman_laferon005.htm");
myself.InstantTeleport(talker, -120050, 44500, 360);
myself.ShowRadar(talker, -119692, 44504, 380, 1);

}
if (reply == 42) {
myself.ShowPage(talker, "foreman_laferon006.htm");
myself.ShowRadar(talker, 115632, -177996, -905, 1);

}

}
super;
	}


}