package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class black_judge extends black_judge_basic {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam item0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 422) == 0 && talker.pk_count == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Repent Your Sins");

}
if (gg.HaveMemo(talker, 422) == 0 && talker.pk_count > 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Repent Your Sins");

}
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 1000) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Repent Your Sins (In Progress)");

}
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) < 9) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Repent Your Sins (In Progress)");

}
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4331) == 0 && gg.OwnItemCount(talker, 4426) == 0 && gg.OwnItemCount(talker, 4330) == 0 && gg.OwnItemCount(talker, 4425) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Repent Your Sins (In Progress)");

}
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4331) >= 1 && gg.OwnItemCount(talker, 4426) == 0 && gg.OwnItemCount(talker, 4330) == 0 && gg.OwnItemCount(talker, 4425) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Repent Your Sins (In Progress)");

}
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4331) == 0 && gg.OwnItemCount(talker, 4426) == 0 && gg.OwnItemCount(talker, 4330) >= 1 && gg.OwnItemCount(talker, 4425) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Repent Your Sins (In Progress)");

}
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4425) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Repent Your Sins (In Progress)");

}
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4426) >= 1 && gg.OwnItemCount(talker, 4425) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Repent Your Sins (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 0 && talker.pk_count == 0) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "black_judge_q0422_01.htm", 422);

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 0 && talker.pk_count > 0) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.FHTML_SetFileName(fhtml0, "black_judge_q0422_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 422);
myself.ShowQuestFHTML(talker, fhtml0, 422);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 1000) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 4425, 1);

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) < 9) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "black_judge_q0422_07.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4331) == 0 && gg.OwnItemCount(talker, 4426) == 0 && gg.OwnItemCount(talker, 4330) == 0 && gg.OwnItemCount(talker, 4425) == 0) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4331, 1);
myself.ShowPage(talker, "black_judge_q0422_08.htm");
myself.SetFlagJournal(talker, 422, 14);
myself.ShowQuestMark(talker, 422);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4331) >= 1 && gg.OwnItemCount(talker, 4426) == 0 && gg.OwnItemCount(talker, 4330) == 0 && gg.OwnItemCount(talker, 4425) == 0) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "black_judge_q0422_09.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4331) == 0 && gg.OwnItemCount(talker, 4426) == 0 && gg.OwnItemCount(talker, 4330) >= 1 && gg.OwnItemCount(talker, 4425) == 0) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "black_judge_q0422_10.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4425) >= 1) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
item0 = myself.GetItemData(talker, 4425);
if (item0.pet_level < gg.GetMemoStateEx(talker, 422, 1) + 1) {
myself.ShowPage(talker, "black_judge_q0422_12.htm");

} else {
myself.ShowPage(talker, "black_judge_q0422_13.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4426) >= 1 && gg.OwnItemCount(talker, 4425) == 0) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "black_judge_q0422_16t.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 422) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level > 20 && talker.level < 31) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "black_judge_q0422_04.htm", 422);
myself.SetMemoState(talker, 422, 2);
myself.SetFlagJournal(talker, 422, 3);
myself.ShowQuestMark(talker, 422);
gg.AddLog(1, talker, 422);

}

} else if (talker.level < 21) {
myself.ShowQuestPage(talker, "black_judge_q0422_03.htm", 422);
myself.SetMemoState(talker, 422, 1);
myself.SetMemoStateEx(talker, 422, 1, 0);
myself.SetFlagJournal(talker, 422, 1);
myself.SetFlagJournal(talker, 422, 2);
myself.ShowQuestMark(talker, 422);

} else if (talker.level > 30 && talker.level < 41) {
myself.ShowQuestPage(talker, "black_judge_q0422_05.htm", 422);
myself.SetMemoState(talker, 422, 3);
myself.SetFlagJournal(talker, 422, 4);
myself.ShowQuestMark(talker, 422);

} else {
myself.ShowQuestPage(talker, "black_judge_q0422_06.htm", 422);
myself.SetMemoState(talker, 422, 4);
myself.SetFlagJournal(talker, 422, 5);
myself.ShowQuestMark(talker, 422);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam item0, HandlerParam reply, HandlerParam talker) {
if (ask == 422) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 422) {
if (reply == 1) {
if (gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && gg.OwnItemCount(talker, 4426) >= 1 || gg.OwnItemCount(talker, 4330) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 4330) > 0) {
myself.DeleteItem1(talker, 4330, 1);

}
if (gg.OwnItemCount(talker, 4426) > 0) {
myself.DeleteItem1(talker, 4426, 1);

}
item0 = myself.GetItemData(talker, 4425);
myself.SetMemoStateEx(talker, 422, 1, talker.level);
myself.CreatePet(talker, 4425, 1012564, talker.level);
myself.ShowPage(talker, "black_judge_q0422_11.htm");
myself.SetFlagJournal(talker, 422, 16);
myself.ShowQuestMark(talker, 422);

}

}

}
if (reply == 2) {
if (gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12) {
myself.ShowPage(talker, "black_judge_q0422_14.htm");

}

}
if (reply == 3) {
item0 = myself.GetItemData(talker, 4425);
if (gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12 && item0.pet_level > gg.GetMemoStateEx(talker, 422, 1)) {
c0 = myself.GetSummon(talker);
if (c0) {
myself.ShowPage(talker, "black_judge_q0422_15t.htm");

} else {
if (talker.level > gg.GetMemoStateEx(talker, 422, 1)) {
i1 = item0.pet_level - gg.GetMemoStateEx(talker, 422, 1) - talker.level - gg.GetMemoStateEx(talker, 422, 1);

} else {
i1 = item0.pet_level - gg.GetMemoStateEx(talker, 422, 1);

}
if (i1 < 0) {
i1 = 0;

}
i0 = gg.Rand(Rand * i1) + 1;
if (talker.pk_count <= i0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4426, 1);
if (item0) {
myself.DestroyPet(talker, item0.dbid, item0.pet_level);

}
myself.ShowPage(talker, "black_judge_q0422_15.htm");
myself.IncrementParam(talker, 9, -1 * talker.pk_count);
myself.RemoveMemo(talker, 422);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(3, talker, 422);

}

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4426, 1);
if (item0) {
myself.DestroyPet(talker, item0.dbid, item0.pet_level);

}
myself.ShowPage(talker, "black_judge_q0422_16.htm");
myself.IncrementParam(talker, 9, -1 * i0);
myself.SetMemoStateEx(talker, 422, 1, 0);

}

}

}

}
if (reply == 4) {
if (gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12) {
myself.ShowPage(talker, "black_judge_q0422_17.htm");

}

}
if (reply == 5) {
if (gg.GetMemoState(talker, 422) >= 9 && gg.GetMemoState(talker, 422) <= 12) {
myself.ShowPage(talker, "black_judge_q0422_18.htm");
myself.RemoveMemo(talker, 422);
myself.DeleteItem1(talker, 4326, gg.OwnItemCount(talker, 4326));
myself.DeleteItem1(talker, 4327, gg.OwnItemCount(talker, 4327));
myself.DeleteItem1(talker, 4328, gg.OwnItemCount(talker, 4328));
myself.DeleteItem1(talker, 4329, gg.OwnItemCount(talker, 4329));
myself.DeleteItem1(talker, 4330, gg.OwnItemCount(talker, 4330));
myself.DeleteItem1(talker, 4331, gg.OwnItemCount(talker, 4331));
myself.DeleteItem1(talker, 4425, gg.OwnItemCount(talker, 4425));
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(3, talker, 422);

}

}

}
super;
	}


}