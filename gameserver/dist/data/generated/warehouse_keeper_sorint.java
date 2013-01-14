package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_keeper_sorint extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 336) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Coins of Magic");

}
if (gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3812) == 0 && gg.GetMemoState(talker, 336) == 1 || gg.GetMemoState(talker, 336) == 2) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3812) == 1 && gg.GetMemoState(talker, 336) == 2 || gg.GetMemoState(talker, 336) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3815) == 1 && gg.GetMemoState(talker, 336) == 3) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3814) == 1 && gg.GetMemoState(talker, 336) == 3) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3813) == 1 && gg.GetMemoState(talker, 336) == 3) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 381) == 0 && gg.OwnItemCount(talker, 3813) > 0 && talker.level >= 55 && gg.OwnItemCount(talker, 5898) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Let's Become a Royal Member!");

}
if (gg.HaveMemo(talker, 381) == 0 && gg.OwnItemCount(talker, 3813) == 0 || talker.level < 55) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Let's Become a Royal Member!");

}
if (gg.HaveMemo(talker, 381) == 1 && gg.GetMemoState(talker, 381) >= 1 && gg.OwnItemCount(talker, 5899) == 0 && gg.OwnItemCount(talker, 5900) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Let's Become a Royal Member! (In Progress)");

}
if (gg.HaveMemo(talker, 381) == 1 && gg.GetMemoState(talker, 381) >= 1 && gg.OwnItemCount(talker, 5899) > 0 && gg.OwnItemCount(talker, 5900) == 0 || gg.OwnItemCount(talker, 5899) == 0 && gg.OwnItemCount(talker, 5900) > 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Let's Become a Royal Member! (In Progress)");

}
if (gg.HaveMemo(talker, 381) == 1 && gg.GetMemoState(talker, 381) >= 1 && gg.OwnItemCount(talker, 5899) > 0 && gg.OwnItemCount(talker, 5900) > 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Let's Become a Royal Member! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 0) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 40) {
myself.ShowQuestPage(talker, "warehouse_keeper_sorint_q0336_01.htm", 336);

} else {
myself.ShowQuestPage(talker, "warehouse_keeper_sorint_q0336_02.htm", 336);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3812) == 0 && gg.GetMemoState(talker, 336) == 1 || gg.GetMemoState(talker, 336) == 2) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_06.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3812) == 1 && gg.GetMemoState(talker, 336) == 2 || gg.GetMemoState(talker, 336) == 1) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_07.htm");
myself.GiveItem1(talker, 3815, 1);
myself.DeleteItem1(talker, 3811, gg.OwnItemCount(talker, 3811));
myself.DeleteItem1(talker, 3812, 1);
myself.SetMemoState(talker, 336, 3);
myself.SetFlagJournal(talker, 336, 4);
myself.ShowQuestMark(talker, 336);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3815) == 1 && gg.GetMemoState(talker, 336) == 3) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_10.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3814) == 1 && gg.GetMemoState(talker, 336) == 3) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_11.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3813) == 1 && gg.GetMemoState(talker, 336) == 3) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_12.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 381) == 0 && gg.OwnItemCount(talker, 3813) > 0 && talker.level >= 55 && gg.OwnItemCount(talker, 5898) == 0) {
myself.SetCurrentQuestID(381);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_sorint_q0381_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 381);
myself.ShowQuestFHTML(talker, fhtml0, 381);

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 381) == 0 && gg.OwnItemCount(talker, 3813) == 0 || talker.level < 55) {
myself.SetCurrentQuestID(381);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_sorint_q0381_02.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 381) == 1 && gg.GetMemoState(talker, 381) >= 1 && gg.OwnItemCount(talker, 5899) == 0 && gg.OwnItemCount(talker, 5900) == 0) {
myself.SetCurrentQuestID(381);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_sorint_q0381_04.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 381) == 1 && gg.GetMemoState(talker, 381) >= 1 && gg.OwnItemCount(talker, 5899) > 0 && gg.OwnItemCount(talker, 5900) == 0 || gg.OwnItemCount(talker, 5899) == 0 && gg.OwnItemCount(talker, 5900) > 0) {
myself.SetCurrentQuestID(381);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_sorint_q0381_05.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 381) == 1 && gg.GetMemoState(talker, 381) >= 1 && gg.OwnItemCount(talker, 5899) > 0 && gg.OwnItemCount(talker, 5900) > 0) {
myself.SetCurrentQuestID(381);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
gg.AddLog(2, talker, 381);
gg.AddLog(3, talker, 381);
myself.GiveItem1(talker, 5898, 1);
myself.DeleteItem1(talker, 5899, gg.OwnItemCount(talker, 5899));
myself.DeleteItem1(talker, 5900, gg.OwnItemCount(talker, 5900));
myself.RemoveMemo(talker, 381);
myself.ShowPage(talker, "warehouse_keeper_sorint_q0381_06.htm");

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
if (quest_id == 336) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 3811) == 0) {
myself.GiveItem1(talker, 3811, 1);

}
myself.ShowQuestPage(talker, "warehouse_keeper_sorint_q0336_05.htm", quest_id);
gg.AddLog(1, talker, 336);
myself.SetMemoState(talker, 336, 1);
myself.SetFlagJournal(talker, 336, 1);
myself.ShowQuestMark(talker, 336);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
return;

}
if (quest_id == 381) {
myself.SetCurrentQuestID(381);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemoState(talker, 381, 1);
myself.SetJournal(talker, 381, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "warehouse_keeper_sorint_q0381_03.htm", 381);
gg.AddLog(1, talker, quest_id);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 336) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 336) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_sorint_q0336_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 336);
myself.ShowQuestFHTML(talker, fhtml0, 336);

} else if (reply == 2) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_04.htm");

} else if (reply == 3) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_08.htm");

} else if (reply == 4) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_09.htm");

} else if (reply == 5) {
if (gg.OwnItemCount(talker, 3815) == 1 && gg.OwnItemCount(talker, 3475) == 0 || gg.OwnItemCount(talker, 3473) == 0 || gg.OwnItemCount(talker, 3483) == 0 || gg.OwnItemCount(talker, 3485) == 0 || gg.OwnItemCount(talker, 3491) == 0 || gg.OwnItemCount(talker, 3494) == 0) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_13.htm");
myself.SetFlagJournal(talker, 336, 8);
myself.ShowQuestMark(talker, 336);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(talker, 3815) == 1 && gg.OwnItemCount(talker, 3475) >= 1 && gg.OwnItemCount(talker, 3473) >= 1 && gg.OwnItemCount(talker, 3483) >= 1 && gg.OwnItemCount(talker, 3485) >= 1 && gg.OwnItemCount(talker, 3491) >= 1 && gg.OwnItemCount(talker, 3494) >= 1) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_16.htm");
myself.SetFlagJournal(talker, 336, 9);
myself.ShowQuestMark(talker, 336);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 3815, gg.OwnItemCount(talker, 3815));
myself.DeleteItem1(talker, 3475, 1);
myself.DeleteItem1(talker, 3473, 1);
myself.DeleteItem1(talker, 3483, 1);
myself.DeleteItem1(talker, 3485, 1);
myself.DeleteItem1(talker, 3491, 1);
myself.DeleteItem1(talker, 3494, 1);
myself.GiveItem1(talker, 3814, 1);

}

} else if (gg.OwnItemCount(talker, 3814) == 1 && gg.OwnItemCount(talker, 3474) == 0 || gg.OwnItemCount(talker, 3476) == 0 || gg.OwnItemCount(talker, 3484) == 0 || gg.OwnItemCount(talker, 3486) == 0 || gg.OwnItemCount(talker, 3495) == 0 || gg.OwnItemCount(talker, 3492) == 0) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_14.htm");
myself.SetFlagJournal(talker, 336, 10);
myself.ShowQuestMark(talker, 336);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(talker, 3814) == 1 && gg.OwnItemCount(talker, 3474) >= 1 && gg.OwnItemCount(talker, 3476) >= 1 && gg.OwnItemCount(talker, 3484) >= 1 && gg.OwnItemCount(talker, 3486) >= 1 && gg.OwnItemCount(talker, 3495) >= 1 && gg.OwnItemCount(talker, 3492) >= 1) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_17.htm");
myself.SetFlagJournal(talker, 336, 11);
myself.ShowQuestMark(talker, 336);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
myself.DeleteItem1(talker, 3814, gg.OwnItemCount(talker, 3814));
myself.DeleteItem1(talker, 3474, 1);
myself.DeleteItem1(talker, 3476, 1);
myself.DeleteItem1(talker, 3484, 1);
myself.DeleteItem1(talker, 3486, 1);
myself.DeleteItem1(talker, 3495, 1);
myself.DeleteItem1(talker, 3492, 1);
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3813, 1);

}

} else if (gg.OwnItemCount(talker, 3813) == 1) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_15.htm");

}

} else if (reply == 6) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_18.htm");

} else if (reply == 7) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_19.htm");

} else if (reply == 8) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_20.htm");

} else if (reply == 9) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_21.htm");

} else if (reply == 10) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_22.htm");
myself.SetFlagJournal(talker, 336, 6);
myself.ShowQuestMark(talker, 336);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (reply == 11) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_23.htm");
myself.SetFlagJournal(talker, 336, 5);
myself.ShowQuestMark(talker, 336);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (reply == 20) {
if (gg.OwnItemCount(talker, 3478) >= 1 && gg.OwnItemCount(talker, 3493) >= 1 && gg.OwnItemCount(talker, 3486) >= 13) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24a.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 206, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 3478, 1);
myself.DeleteItem1(talker, 3493, 1);
myself.DeleteItem1(talker, 3486, 13);

}

} else {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24.htm");

}

} else if (reply == 21) {
if (gg.OwnItemCount(talker, 3487) >= 1 && gg.OwnItemCount(talker, 3477) >= 1 && gg.OwnItemCount(talker, 3492) >= 1 && gg.OwnItemCount(talker, 3484) >= 1) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24b.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 233, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 3487, 1);
myself.DeleteItem1(talker, 3477, 1);
myself.DeleteItem1(talker, 3492, 1);
myself.DeleteItem1(talker, 3484, 1);

}

} else {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24.htm");

}

} else if (reply == 22) {
if (gg.OwnItemCount(talker, 3496) >= 1 && gg.OwnItemCount(talker, 3481) >= 1 && gg.OwnItemCount(talker, 3476) >= 1 && gg.OwnItemCount(talker, 3474) >= 2) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24c.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 303, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 3496, 1);
myself.DeleteItem1(talker, 3481, 1);
myself.DeleteItem1(talker, 3476, 1);
myself.DeleteItem1(talker, 3474, 2);

}

} else {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24.htm");

}

} else if (reply == 23) {
if (gg.OwnItemCount(talker, 3481) >= 1 && gg.OwnItemCount(talker, 3493) >= 1 && gg.OwnItemCount(talker, 3477) >= 1 && gg.OwnItemCount(talker, 3495) >= 1) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24d.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 132, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 3481, 1);
myself.DeleteItem1(talker, 3493, 1);
myself.DeleteItem1(talker, 3477, 1);
myself.DeleteItem1(talker, 3495, 1);

}

} else {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24.htm");

}

} else if (reply == 24) {
if (gg.OwnItemCount(talker, 3488) >= 1) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24e.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2435, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 3488, 1);

}

} else {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24.htm");

}

} else if (reply == 25) {
if (gg.OwnItemCount(talker, 3497) >= 1 && gg.OwnItemCount(talker, 3492) >= 1) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24f.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 472, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 3497, 1);
myself.DeleteItem1(talker, 3492, 1);

}

} else {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24.htm");

}

} else if (reply == 26) {
if (gg.OwnItemCount(talker, 3488) >= 1) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24g.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2459, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 3488, 1);

}

} else {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24.htm");

}

} else if (reply == 27) {
if (gg.OwnItemCount(talker, 3479) >= 1 && gg.OwnItemCount(talker, 3484) >= 1 && gg.OwnItemCount(talker, 3486) >= 1) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24h.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2414, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 3479, 1);
myself.DeleteItem1(talker, 3484, 1);
myself.DeleteItem1(talker, 3486, 1);

}

} else {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24.htm");

}

} else if (reply == 28) {
if (gg.OwnItemCount(talker, 3480) >= 2 && gg.OwnItemCount(talker, 3485) >= 2 && gg.OwnItemCount(talker, 3475) >= 2 && gg.OwnItemCount(talker, 3483) >= 3) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24i.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 852, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 3480, 2);
myself.DeleteItem1(talker, 3485, 2);
myself.DeleteItem1(talker, 3475, 2);
myself.DeleteItem1(talker, 3483, 3);

}

} else {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24.htm");

}

} else if (reply == 29) {
if (gg.OwnItemCount(talker, 3480) >= 7 && gg.OwnItemCount(talker, 3483) >= 5 && gg.OwnItemCount(talker, 3475) >= 5 && gg.OwnItemCount(talker, 3494) >= 5) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24j.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 855, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 3480, 7);
myself.DeleteItem1(talker, 3483, 5);
myself.DeleteItem1(talker, 3475, 5);
myself.DeleteItem1(talker, 3494, 5);

}

} else {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24.htm");

}

} else if (reply == 30) {
if (gg.OwnItemCount(talker, 3489) >= 5 && gg.OwnItemCount(talker, 3494) >= 4 && gg.OwnItemCount(talker, 3485) >= 4 && gg.OwnItemCount(talker, 3475) >= 4) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24k.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 886, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 3489, 5);
myself.DeleteItem1(talker, 3494, 4);
myself.DeleteItem1(talker, 3485, 4);
myself.DeleteItem1(talker, 3475, 4);

}

} else {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24.htm");

}

} else if (reply == 31) {
if (gg.OwnItemCount(talker, 3498) >= 5 && gg.OwnItemCount(talker, 3491) >= 3 && gg.OwnItemCount(talker, 3483) >= 3 && gg.OwnItemCount(talker, 3475) >= 3) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24l.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 916, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 3498, 5);
myself.DeleteItem1(talker, 3491, 3);
myself.DeleteItem1(talker, 3483, 3);
myself.DeleteItem1(talker, 3475, 3);

}

} else {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_24.htm");

}

} else if (reply == 100) {
myself.ShowPage(talker, "warehouse_keeper_sorint_q0336_18a.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 3813, gg.OwnItemCount(talker, 3813));
myself.DeleteItem1(talker, 3814, gg.OwnItemCount(talker, 3814));
myself.DeleteItem1(talker, 3815, gg.OwnItemCount(talker, 3815));
myself.RemoveMemo(talker, 336);
gg.AddLog(2, talker, 336);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}

}
super;
	}


}