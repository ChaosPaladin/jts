package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fairy_mymyu extends citizen {
	protected void TALK_SELECTED(HandlerParam c0, HandlerParam fhtml0, HandlerParam i0, HandlerParam item0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 420) == 1 && gg.OwnItemCount(talker, 3816) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.OwnItemCount(talker, 3817) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 5) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 6 && gg.OwnItemCount(talker, 3821) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 7) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 8) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 0 || gg.GetMemoState(talker, 420) < 4 || gg.GetMemoState(talker, 420) > 8 && gg.OwnItemCount(talker, 3816) == 0 && gg.OwnItemCount(talker, 3817) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Little Wing");

}
if (gg.HaveMemo(talker, 421) == 1 && gg.GetMemoState(talker, 421) == 100) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Little Wing's Big Adventure (In Progress)");

}
if (gg.HaveMemo(talker, 421) == 1 && gg.GetMemoState(talker, 421) == 200) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Little Wing's Big Adventure (In Progress)");

}
if (gg.HaveMemo(talker, 421) == 1 && gg.GetMemoState(talker, 421) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Little Wing's Big Adventure (In Progress)");

}
if (gg.HaveMemo(talker, 421) == 1 && gg.GetMemoState(talker, 421) > 0 && gg.GetMemoState(talker, 421) < 15 && gg.OwnItemCount(talker, 4325) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Little Wing's Big Adventure (In Progress)");

}
if (gg.HaveMemo(talker, 421) == 1 && gg.GetMemoState(talker, 421) == 15 && gg.OwnItemCount(talker, 4325) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Little Wing's Big Adventure (In Progress)");

}
if (gg.HaveMemo(talker, 421) == 1 && gg.GetMemoState(talker, 421) == 16 && gg.OwnItemCount(talker, 4325) == 0) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Little Wing's Big Adventure (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.OwnItemCount(talker, 3816) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairy_mymyu_q0420_02.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.OwnItemCount(talker, 3817) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairy_mymyu_q0420_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 5) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairy_mymyu_q0420_07.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 6 && gg.OwnItemCount(talker, 3821) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairy_mymyu_q0420_09.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 7) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3823) < 20 && gg.OwnItemCount(talker, 3825) < 20 && gg.OwnItemCount(talker, 3827) < 20 && gg.OwnItemCount(talker, 3829) < 20 && gg.OwnItemCount(talker, 3831) < 20) {
myself.ShowPage(talker, "fairy_mymyu_q0420_10.htm");

} else {
myself.ShowPage(talker, "fairy_mymyu_q0420_11.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 8) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairy_mymyu_q0420_12.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 0 || gg.GetMemoState(talker, 420) < 4 || gg.GetMemoState(talker, 420) > 8 && gg.OwnItemCount(talker, 3816) == 0 && gg.OwnItemCount(talker, 3817) == 0) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.i_quest0 = myself.i_quest0 + 1;
i0 = myself.i_quest0 % 3;
if (i0 == 0) {
myself.InstantTeleport(myself.sm, 109816, 40854, -4640);

} else if (i0 == 1) {
myself.InstantTeleport(myself.sm, 108940, 41615, -4643);

} else {
myself.InstantTeleport(myself.sm, 110395, 41625, -4642);

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 421) == 1 && gg.GetMemoState(talker, 421) == 100) {
myself.SetCurrentQuestID(421);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 421, 200);
myself.ShowPage(talker, "fairy_mymyu_q0421_01.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 421) == 1 && gg.GetMemoState(talker, 421) == 200) {
myself.SetCurrentQuestID(421);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
c0 = myself.GetSummon(talker);
if (c0) {
if (c0.pet_dbid == gg.GetMemoStateEx(talker, 421, 1)) {
myself.ShowPage(talker, "fairy_mymyu_q0421_04.htm");

} else {
myself.ShowPage(talker, "fairy_mymyu_q0421_03.htm");

}

} else {
myself.ShowPage(talker, "fairy_mymyu_q0421_02.htm");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 421) == 1 && gg.GetMemoState(talker, 421) == 0) {
myself.SetCurrentQuestID(421);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairy_mymyu_q0421_07.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 421) == 1 && gg.GetMemoState(talker, 421) > 0 && gg.GetMemoState(talker, 421) < 15 && gg.OwnItemCount(talker, 4325) >= 1) {
myself.SetCurrentQuestID(421);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fairy_mymyu_q0421_11.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 421) == 1 && gg.GetMemoState(talker, 421) == 15 && gg.OwnItemCount(talker, 4325) == 0) {
myself.SetCurrentQuestID(421);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
c0 = myself.GetSummon(talker);
if (c0) {
if (c0.pet_dbid == gg.GetMemoStateEx(talker, 421, 1)) {
myself.SetMemoState(talker, 421, 16);
myself.ShowPage(talker, "fairy_mymyu_q0421_13.htm");

} else {
myself.ShowPage(talker, "fairy_mymyu_q0421_14.htm");

}

} else {
myself.ShowPage(talker, "fairy_mymyu_q0421_12.htm");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 421) == 1 && gg.GetMemoState(talker, 421) == 16 && gg.OwnItemCount(talker, 4325) == 0) {
myself.SetCurrentQuestID(421);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
c0 = myself.GetSummon(talker);
if (c0) {
myself.ShowPage(talker, "fairy_mymyu_q0421_15.htm");

} else if (gg.OwnItemCount(talker, 3500) + gg.OwnItemCount(talker, 3501) + gg.OwnItemCount(talker, 3502) == 1) {
if (gg.OwnItemCount(talker, 3500) == 1) {
item0 = myself.GetItemData(talker, 3500);
if (item0) {
if (item0.dbid == gg.GetMemoStateEx(talker, 421, 1)) {
myself.EvolvePet(talker, item0.dbid, 1012311, 4422, 1012526, item0.pet_level);
myself.ShowPage(talker, "fairy_mymyu_q0421_16.htm");
myself.RemoveMemo(talker, 421);
gg.AddLog(2, talker, 421);
gg.AddLog(3, talker, 421);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else {
myself.AddUseSkillDesire(talker, 273088513, 0, 0, 1000000);
myself.ShowPage(talker, "fairy_mymyu_q0421_18.htm");

}

}

}
if (gg.OwnItemCount(talker, 3501) == 1) {
item0 = myself.GetItemData(talker, 3501);
if (item0) {
if (item0.dbid == gg.GetMemoStateEx(talker, 421, 1)) {
myself.EvolvePet(talker, item0.dbid, 1012312, 4423, 1012527, item0.pet_level);
myself.ShowPage(talker, "fairy_mymyu_q0421_16.htm");
myself.RemoveMemo(talker, 421);
gg.AddLog(2, talker, 421);
gg.AddLog(3, talker, 421);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else {
myself.AddUseSkillDesire(talker, 273088513, 0, 0, 1000000);
myself.ShowPage(talker, "fairy_mymyu_q0421_18.htm");

}

}

}
if (gg.OwnItemCount(talker, 3502) == 1) {
item0 = myself.GetItemData(talker, 3502);
if (item0) {
if (item0.dbid == gg.GetMemoStateEx(talker, 421, 1)) {
myself.EvolvePet(talker, item0.dbid, 1012313, 4424, 1012528, item0.pet_level);
myself.ShowPage(talker, "fairy_mymyu_q0421_16.htm");
myself.RemoveMemo(talker, 421);
gg.AddLog(2, talker, 421);
gg.AddLog(3, talker, 421);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else {
myself.AddUseSkillDesire(talker, 273088513, 0, 0, 1000000);
myself.ShowPage(talker, "fairy_mymyu_q0421_18.htm");

}

}

}

} else if (gg.OwnItemCount(talker, 3500) + gg.OwnItemCount(talker, 3501) + gg.OwnItemCount(talker, 3502) >= 2) {
myself.ShowPage(talker, "fairy_mymyu_q0421_17.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam c0, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 420) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 420) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 3816, gg.OwnItemCount(talker, 3816));
myself.SetMemoState(talker, 420, 5);
myself.ShowPage(talker, "fairy_mymyu_q0420_03.htm");

}

}
if (reply == 3 && gg.OwnItemCount(talker, 3817)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3499, 1);
myself.DeleteItem1(talker, 3817, gg.OwnItemCount(talker, 3817));
myself.SetMemoState(talker, 420, 5);
myself.ShowPage(talker, "fairy_mymyu_q0420_05.htm");

}

}
if (reply == 2) {
myself.ShowPage(talker, "fairy_mymyu_q0420_06.htm");

}
if (reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3821, 1);
myself.SetMemoState(talker, 420, 6);
myself.ShowPage(talker, "fairy_mymyu_q0420_08.htm");
myself.SetJournal(talker, 420, 5);
myself.ShowQuestMark(talker, 420);

}

}
if (reply == 5) {
if (gg.OwnItemCount(talker, 3499) == 1) {
myself.ShowPage(talker, "fairy_mymyu_q0420_13.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (gg.OwnItemCount(talker, 3823) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 45) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 75) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}

} else if (i0 < 50) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 85) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}
myself.DeleteItem1(talker, 3823, gg.OwnItemCount(talker, 3823));

} else if (gg.OwnItemCount(talker, 3829) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 55) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 85) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}

} else if (i0 < 65) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 95) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}
myself.DeleteItem1(talker, 3829, gg.OwnItemCount(talker, 3829));

} else if (gg.OwnItemCount(talker, 3827) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 60) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 90) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}

} else if (i0 < 70) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else {
myself.CreatePet(talker, 3501, 1012312, 35);

}
myself.DeleteItem1(talker, 3827, gg.OwnItemCount(talker, 3827));

} else if (gg.OwnItemCount(talker, 3831) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 70) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else {
myself.CreatePet(talker, 3501, 1012312, 35);

}

} else if (i0 < 85) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else {
myself.CreatePet(talker, 3501, 1012312, 35);

}
myself.DeleteItem1(talker, 3831, gg.OwnItemCount(talker, 3831));

} else if (gg.OwnItemCount(talker, 3825) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 90) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else {
myself.CreatePet(talker, 3501, 1012312, 35);

}

} else {
myself.CreatePet(talker, 3500, 1012311, 35);

}
myself.DeleteItem1(talker, 3825, gg.OwnItemCount(talker, 3825));

}
myself.RemoveMemo(talker, 420);
gg.AddLog(2, talker, 420);
gg.AddLog(3, talker, 420);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "fairy_mymyu_q0420_16.htm");

}

}
if (reply == 7) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (gg.OwnItemCount(talker, 3823) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 45) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 75) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}

} else if (i0 < 50) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 85) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}
myself.DeleteItem1(talker, 3823, gg.OwnItemCount(talker, 3823));

} else if (gg.OwnItemCount(talker, 3829) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 55) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 85) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}

} else if (i0 < 65) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 95) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}
myself.DeleteItem1(talker, 3829, gg.OwnItemCount(talker, 3829));

} else if (gg.OwnItemCount(talker, 3827) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 60) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 90) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}

} else if (i0 < 70) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else {
myself.CreatePet(talker, 3501, 1012312, 35);

}
myself.DeleteItem1(talker, 3827, gg.OwnItemCount(talker, 3827));

} else if (gg.OwnItemCount(talker, 3831) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 70) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else {
myself.CreatePet(talker, 3501, 1012312, 35);

}

} else if (i0 < 85) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else {
myself.CreatePet(talker, 3501, 1012312, 35);

}
myself.DeleteItem1(talker, 3831, gg.OwnItemCount(talker, 3831));

} else if (gg.OwnItemCount(talker, 3825) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 90) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else {
myself.CreatePet(talker, 3501, 1012312, 35);

}

} else {
myself.CreatePet(talker, 3500, 1012311, 35);

}
myself.DeleteItem1(talker, 3825, gg.OwnItemCount(talker, 3825));

}
myself.RemoveMemo(talker, 420);
gg.AddLog(2, talker, 420);
gg.AddLog(3, talker, 420);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "fairy_mymyu_q0420_14.htm");

}

}
if (reply == 6) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (gg.OwnItemCount(talker, 3823) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 45) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 75) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}

} else if (i0 < 50) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 85) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}
myself.DeleteItem1(talker, 3823, gg.OwnItemCount(talker, 3823));

} else if (gg.OwnItemCount(talker, 3829) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 55) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 85) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}

} else if (i0 < 65) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 95) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}
myself.DeleteItem1(talker, 3829, gg.OwnItemCount(talker, 3829));

} else if (gg.OwnItemCount(talker, 3827) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 60) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else if (i0 < 90) {
myself.CreatePet(talker, 3501, 1012312, 35);

} else {
myself.CreatePet(talker, 3502, 1012313, 35);

}

} else if (i0 < 70) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else {
myself.CreatePet(talker, 3501, 1012312, 35);

}
myself.DeleteItem1(talker, 3827, gg.OwnItemCount(talker, 3827));

} else if (gg.OwnItemCount(talker, 3831) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 70) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else {
myself.CreatePet(talker, 3501, 1012312, 35);

}

} else if (i0 < 85) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else {
myself.CreatePet(talker, 3501, 1012312, 35);

}
myself.DeleteItem1(talker, 3831, gg.OwnItemCount(talker, 3831));

} else if (gg.OwnItemCount(talker, 3825) >= 1) {
if (gg.OwnItemCount(talker, 3499) == 1) {
if (i0 < 90) {
myself.CreatePet(talker, 3500, 1012311, 35);

} else {
myself.CreatePet(talker, 3501, 1012312, 35);

}

} else {
myself.CreatePet(talker, 3500, 1012311, 35);

}
myself.DeleteItem1(talker, 3825, gg.OwnItemCount(talker, 3825));

}
myself.RemoveMemo(talker, 420);
gg.AddLog(2, talker, 420);
gg.AddLog(3, talker, 420);
myself.SoundEffect(talker, "ItemSound.quest_finish");
if (gg.OwnItemCount(talker, 3499) == 0) {
myself.ShowPage(talker, "fairy_mymyu_q0420_14.htm");

} else {
if (i0 < 5) {
myself.ShowPage(talker, "fairy_mymyu_q0420_15.htm");
myself.GiveItem1(talker, 3912, 1);

} else {
myself.ShowPage(talker, "fairy_mymyu_q0420_15t.htm");
myself.GiveItem1(talker, 4038, 20);

}
myself.DeleteItem1(talker, 3499, gg.OwnItemCount(talker, 3499));

}

}

}

}
if (ask == 421) {
myself.SetCurrentQuestID(421);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 421) {
if (reply == 1) {
c0 = myself.GetSummon(talker);
if (c0) {
if (c0.pet_dbid == gg.GetMemoStateEx(talker, 421, 1)) {
myself.ShowPage(talker, "fairy_mymyu_q0421_04.htm");

} else {
myself.ShowPage(talker, "fairy_mymyu_q0421_03.htm");

}

} else {
myself.ShowPage(talker, "fairy_mymyu_q0421_02.htm");

}

}
if (reply == 2) {
c0 = myself.GetSummon(talker);
if (c0) {
if (c0.pet_dbid == gg.GetMemoStateEx(talker, 421, 1)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4325, 4);
myself.SetMemoState(talker, 421, 0);
myself.SetFlagJournal(talker, 421, 2);
myself.ShowQuestMark(talker, 421);
myself.SoundEffect(talker, "ItemSound.quest_middle");
talker.flag = 0;
myself.ShowPage(talker, "fairy_mymyu_q0421_05.htm");

}

} else {
myself.ShowPage(talker, "fairy_mymyu_q0421_06.htm");

}

} else {
myself.ShowPage(talker, "fairy_mymyu_q0421_06.htm");

}

}
if (reply == 3) {
myself.ShowPage(talker, "fairy_mymyu_q0421_07.htm");

}
if (reply == 4) {
myself.ShowPage(talker, "fairy_mymyu_q0421_08.htm");

}
if (reply == 5) {
myself.ShowPage(talker, "fairy_mymyu_q0421_09.htm");

}
if (reply == 6) {
myself.ShowPage(talker, "fairy_mymyu_q0421_10.htm");

}

}
super;
	}


}