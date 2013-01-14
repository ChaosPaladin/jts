package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blacksmith_kluto extends blacksmith {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) >= 20 && gg.OwnItemCount(talker, 1202) != 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Elven Knight (In Progress)");

}
if (gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) >= 20 && gg.OwnItemCount(talker, 1276) != 0 && gg.OwnItemCount(talker, 1206) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Elven Knight (In Progress)");

}
if (gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) >= 20 && gg.OwnItemCount(talker, 1276) != 0 && gg.OwnItemCount(talker, 1206) > 0 && gg.OwnItemCount(talker, 1206) < 20) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Elven Knight (In Progress)");

}
if (gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) >= 20 && gg.OwnItemCount(talker, 1276) != 0 && gg.OwnItemCount(talker, 1206) >= 20) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Elven Knight (In Progress)");

}
if (gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) != 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Elven Knight (In Progress)");

}
if (gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1639) == 0 && gg.OwnItemCount(talker, 1638) == 0 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1634) == 0 && gg.OwnItemCount(talker, 1641) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Artisan (In Progress)");

}
if (gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1638) || gg.OwnItemCount(talker, 1639)) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path of the Artisan (In Progress)");

}
if (gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1634) && gg.OwnItemCount(talker, 1641)) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Path of the Artisan (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) >= 20 && gg.OwnItemCount(talker, 1202) != 0) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_kluto_q0406_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) >= 20 && gg.OwnItemCount(talker, 1276) != 0 && gg.OwnItemCount(talker, 1206) == 0) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_kluto_q0406_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) >= 20 && gg.OwnItemCount(talker, 1276) != 0 && gg.OwnItemCount(talker, 1206) > 0 && gg.OwnItemCount(talker, 1206) < 20) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_kluto_q0406_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) == 0 && gg.OwnItemCount(talker, 1205) >= 20 && gg.OwnItemCount(talker, 1276) != 0 && gg.OwnItemCount(talker, 1206) >= 20) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1206, gg.OwnItemCount(talker, 1206));
myself.DeleteItem1(talker, 1205, gg.OwnItemCount(talker, 1205));
if (gg.OwnItemCount(talker, 1203) == 0) {
myself.GiveItem1(talker, 1203, 1);
myself.DeleteItem1(talker, 1276, 1);

}
myself.ShowPage(talker, "blacksmith_kluto_q0406_05.htm");
myself.SetFlagJournal(talker, 406, 6);
myself.ShowQuestMark(talker, 406);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 406) != 0 && gg.OwnItemCount(talker, 1203) != 0) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_kluto_q0406_06.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1639) == 0 && gg.OwnItemCount(talker, 1638) == 0 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1634) == 0 && gg.OwnItemCount(talker, 1641) == 0) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_kluto_q0418_01.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1638) || gg.OwnItemCount(talker, 1639)) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_kluto_q0418_08.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1634) && gg.OwnItemCount(talker, 1641)) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_kluto_q0418_09.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 406) {
myself.SetCurrentQuestID(406);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 406 && reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 406) != 0) {
myself.DeleteItem1(talker, 1202, gg.OwnItemCount(talker, 1202));
if (gg.OwnItemCount(talker, 1276) == 0) {
myself.GiveItem1(talker, 1276, 1);

}
myself.ShowPage(talker, "blacksmith_kluto_q0406_02.htm");
myself.SetFlagJournal(talker, 406, 4);
myself.ShowQuestMark(talker, 406);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 418) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 418 && reply == 1) {
myself.ShowPage(talker, "blacksmith_kluto_q0418_02.htm");

}
if (ask == 418 && reply == 2) {
myself.ShowPage(talker, "blacksmith_kluto_q0418_05.htm");

}
if (ask == 418 && reply == 3) {
myself.ShowPage(talker, "blacksmith_kluto_q0418_03.htm");

}
if (ask == 418 && reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_kluto_q0418_04.htm");
myself.GiveItem1(talker, 1638, 1);
myself.SetFlagJournal(talker, 418, 4);
myself.ShowQuestMark(talker, 418);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 418 && reply == 5) {
myself.ShowPage(talker, "blacksmith_kluto_q0418_06.htm");

}
if (ask == 418 && reply == 6) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_kluto_q0418_07.htm");
myself.GiveItem1(talker, 1638, 1);
myself.SetFlagJournal(talker, 418, 4);
myself.ShowQuestMark(talker, 418);

}

}
if (ask == 418 && reply == 7 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1634) && gg.OwnItemCount(talker, 1641)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_kluto_q0418_10.htm");
myself.DeleteItem1(talker, 1633, 1);
myself.DeleteItem1(talker, 1634, 1);
myself.DeleteItem1(talker, 1641, 1);
myself.GiveItem1(talker, 1635, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 32452);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 30150);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 36848);

}
myself.GiveItem1(talker, 57, 163800);

}
myself.RemoveMemo(talker, 418);
gg.AddLog(2, talker, 418);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
if (ask == 418 && reply == 8) {
myself.ShowPage(talker, "blacksmith_kluto_q0418_11.htm");

}
if (ask == 418 && reply == 9 && gg.OwnItemCount(talker, 1633) && gg.OwnItemCount(talker, 1634) && gg.OwnItemCount(talker, 1641)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_kluto_q0418_12.htm");
myself.DeleteItem1(talker, 1633, 1);
myself.DeleteItem1(talker, 1634, 1);
myself.DeleteItem1(talker, 1641, 1);
myself.GiveItem1(talker, 1635, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 160267);
myself.IncrementParam(talker, 1, 11726);
myself.GiveItem1(talker, 57, 81900);

} else if (talker.level >= 19) {
myself.IncrementParam(talker, 0, 228064);
myself.IncrementParam(talker, 1, 15075);
myself.GiveItem1(talker, 57, 81900);

} else {
myself.IncrementParam(talker, 0, 295862);
myself.IncrementParam(talker, 1, 18424);
myself.GiveItem1(talker, 57, 81900);

}

}
myself.RemoveMemo(talker, 418);
gg.AddLog(2, talker, 418);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}
super;
	}


}