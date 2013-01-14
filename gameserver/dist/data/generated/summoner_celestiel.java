package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class summoner_celestiel extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3358) == 0 && gg.OwnItemCount(talker, 3375) == 0 && gg.OwnItemCount(talker, 3376) == 0 && gg.OwnItemCount(talker, 3377) == 0 && gg.OwnItemCount(talker, 3378) == 0 && gg.OwnItemCount(talker, 3379) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3358) == 0 && gg.OwnItemCount(talker, 3375) == 0 && gg.OwnItemCount(talker, 3376) == 0 && gg.OwnItemCount(talker, 3377) == 0 && gg.OwnItemCount(talker, 3378) && gg.OwnItemCount(talker, 3379) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3358) == 0 && gg.OwnItemCount(talker, 3375) == 0 && gg.OwnItemCount(talker, 3376) == 0 && gg.OwnItemCount(talker, 3377) && gg.OwnItemCount(talker, 3378) == 0 && gg.OwnItemCount(talker, 3379) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3358) == 0 && gg.OwnItemCount(talker, 3375) == 0 && gg.OwnItemCount(talker, 3376) == 0 && gg.OwnItemCount(talker, 3377) == 0 && gg.OwnItemCount(talker, 3378) == 0 && gg.OwnItemCount(talker, 3379)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3358) == 0 && gg.OwnItemCount(talker, 3375) && gg.OwnItemCount(talker, 3376) == 0 && gg.OwnItemCount(talker, 3377) == 0 && gg.OwnItemCount(talker, 3378) == 0 && gg.OwnItemCount(talker, 3379) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3358) == 0 && gg.OwnItemCount(talker, 3375) == 0 && gg.OwnItemCount(talker, 3376) && gg.OwnItemCount(talker, 3377) == 0 && gg.OwnItemCount(talker, 3378) == 0 && gg.OwnItemCount(talker, 3379) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of the Summoner (In Progress)");

}
if (gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3358) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of the Summoner (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3358) == 0 && gg.OwnItemCount(talker, 3375) == 0 && gg.OwnItemCount(talker, 3376) == 0 && gg.OwnItemCount(talker, 3377) == 0 && gg.OwnItemCount(talker, 3378) == 0 && gg.OwnItemCount(talker, 3379) == 0) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "summoner_celestiel_q0230_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3358) == 0 && gg.OwnItemCount(talker, 3375) == 0 && gg.OwnItemCount(talker, 3376) == 0 && gg.OwnItemCount(talker, 3377) == 0 && gg.OwnItemCount(talker, 3378) && gg.OwnItemCount(talker, 3379) == 0) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "summoner_celestiel_q0230_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3358) == 0 && gg.OwnItemCount(talker, 3375) == 0 && gg.OwnItemCount(talker, 3376) == 0 && gg.OwnItemCount(talker, 3377) && gg.OwnItemCount(talker, 3378) == 0 && gg.OwnItemCount(talker, 3379) == 0) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "summoner_celestiel_q0230_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3358) == 0 && gg.OwnItemCount(talker, 3375) == 0 && gg.OwnItemCount(talker, 3376) == 0 && gg.OwnItemCount(talker, 3377) == 0 && gg.OwnItemCount(talker, 3378) == 0 && gg.OwnItemCount(talker, 3379)) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "summoner_celestiel_q0230_07.htm");
myself.GiveItem1(talker, 3358, 1);
myself.DeleteItem1(talker, 3379, gg.OwnItemCount(talker, 3379));
if (gg.OwnItemCount(talker, 3354) >= 1 && gg.OwnItemCount(talker, 3357) >= 1 && gg.OwnItemCount(talker, 3355) >= 1 && gg.OwnItemCount(talker, 3356) >= 1 && gg.OwnItemCount(talker, 3359) >= 1) {
myself.SetFlagJournal(talker, 230, 4);
myself.ShowQuestMark(talker, 230);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3358) == 0 && gg.OwnItemCount(talker, 3375) && gg.OwnItemCount(talker, 3376) == 0 && gg.OwnItemCount(talker, 3377) == 0 && gg.OwnItemCount(talker, 3378) == 0 && gg.OwnItemCount(talker, 3379) == 0) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "summoner_celestiel_q0230_08.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3358) == 0 && gg.OwnItemCount(talker, 3375) == 0 && gg.OwnItemCount(talker, 3376) && gg.OwnItemCount(talker, 3377) == 0 && gg.OwnItemCount(talker, 3378) == 0 && gg.OwnItemCount(talker, 3379) == 0) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "summoner_celestiel_q0230_09.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 230) == 1 && gg.OwnItemCount(talker, 3358) == 1) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "summoner_celestiel_q0230_10.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 230) {
myself.SetCurrentQuestID(230);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 230) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 3353) >= 1) {
myself.ShowPage(talker, "summoner_celestiel_q0230_03.htm");

} else {
myself.ShowPage(talker, "summoner_celestiel_q0230_02.htm");

}

} else if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 270401537, 1, 0, 1000000);
myself.ShowPage(talker, "summoner_celestiel_q0230_04.htm");
myself.GiveItem1(talker, 3375, 1);
myself.DeleteItem1(talker, 3377, gg.OwnItemCount(talker, 3377));
myself.DeleteItem1(talker, 3378, gg.OwnItemCount(talker, 3378));
myself.DeleteItem1(talker, 3353, 1);

}

}

}
super;
	}


}