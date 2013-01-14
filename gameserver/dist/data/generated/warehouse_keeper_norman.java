package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_keeper_norman extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 167) == 1 && gg.OwnItemCount(talker, 1106) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Dwarven Kinship (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3186)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3187)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) == 1 && gg.OwnItemCount(talker, 3123) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Guildsman (In Progress)");

}
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) >= 1 && gg.OwnItemCount(talker, 3125) >= 1 && gg.OwnItemCount(talker, 3126) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Guildsman (In Progress)");

}
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) >= 1 && gg.OwnItemCount(talker, 3125) >= 1 && gg.OwnItemCount(talker, 3127) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of the Guildsman (In Progress)");

}
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) >= 1 && gg.OwnItemCount(talker, 3125) >= 1 && gg.OwnItemCount(talker, 3128) >= 30) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Trial of the Guildsman (In Progress)");

}
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) >= 1 && gg.OwnItemCount(talker, 3129) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Trial of the Guildsman (In Progress)");

}
if (gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3125) == 0 && gg.OwnItemCount(talker, 3129) == 0 && gg.OwnItemCount(talker, 3122) == 1 && gg.OwnItemCount(talker, 3134) >= 1 || gg.OwnItemCount(talker, 3139) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Trial of the Guildsman (In Progress)");

}
if (talker.level >= 21 && gg.HaveMemo(talker, 661) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Making the Harvest Grounds Safe");

}
if (talker.level < 21 && gg.HaveMemo(talker, 661) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Making the Harvest Grounds Safe");

}
if (gg.HaveMemo(talker, 661) == 1 && gg.GetMemoState(talker, 661) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Making the Harvest Grounds Safe (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 167) == 1 && gg.OwnItemCount(talker, 1106) == 1) {
myself.SetCurrentQuestID(167);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_norman_q0323_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3186)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "warehouse_keeper_norman_q0219_01.htm");
myself.GiveItem1(talker, 3187, 1);
myself.DeleteItem1(talker, 3186, 1);
myself.SetFlagJournal(talker, 219, 13);
myself.ShowQuestMark(talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3187)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_norman_q0219_02.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) == 1 && gg.OwnItemCount(talker, 3123) == 1) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_norman_q0216_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) >= 1 && gg.OwnItemCount(talker, 3125) >= 1 && gg.OwnItemCount(talker, 3126) >= 1) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_norman_q0216_05.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) >= 1 && gg.OwnItemCount(talker, 3125) >= 1 && gg.OwnItemCount(talker, 3127) >= 1) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_norman_q0216_06.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) >= 1 && gg.OwnItemCount(talker, 3125) >= 1 && gg.OwnItemCount(talker, 3128) >= 30) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_norman_q0216_07.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3122) >= 1 && gg.OwnItemCount(talker, 3129) >= 1) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3130) >= 70 && gg.OwnItemCount(talker, 3131) >= 70 && gg.OwnItemCount(talker, 3132) >= 70 && gg.OwnItemCount(talker, 3133) >= 70) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "warehouse_keeper_norman_q0216_12.htm");
myself.DeleteItem1(talker, 3129, gg.OwnItemCount(talker, 3129));
myself.DeleteItem1(talker, 3130, gg.OwnItemCount(talker, 3130));
myself.DeleteItem1(talker, 3131, gg.OwnItemCount(talker, 3131));
myself.DeleteItem1(talker, 3132, gg.OwnItemCount(talker, 3132));
myself.DeleteItem1(talker, 3133, gg.OwnItemCount(talker, 3133));
myself.GiveItem1(talker, 3134, 7);
if (gg.OwnItemCount(talker, 3138) >= 7) {
myself.SetFlagJournal(talker, 216, 6);
myself.ShowQuestMark(talker, 216);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

} else {
myself.ShowPage(talker, "warehouse_keeper_norman_q0216_11.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 216) == 1 && gg.OwnItemCount(talker, 3125) == 0 && gg.OwnItemCount(talker, 3129) == 0 && gg.OwnItemCount(talker, 3122) == 1 && gg.OwnItemCount(talker, 3134) >= 1 || gg.OwnItemCount(talker, 3139) >= 1) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_norman_q0216_13.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || talker.level >= 21 && gg.HaveMemo(talker, 661) == 0) {
myself.SetCurrentQuestID(661);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "warehouse_keeper_norman_q0661_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 661);
myself.ShowQuestFHTML(talker, fhtml0, 661);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || talker.level < 21 && gg.HaveMemo(talker, 661) == 0) {
myself.SetCurrentQuestID(661);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_norman_q0661_0102.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 661) == 1 && gg.GetMemoState(talker, 661) == 1 * 10 + 1) {
myself.SetCurrentQuestID(661);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 8283) == 0 && gg.OwnItemCount(talker, 8284) == 0 && gg.OwnItemCount(talker, 8285) == 0) {
myself.ShowPage(talker, "warehouse_keeper_norman_q0661_0106.htm");

} else {
myself.SetHTMLCookie(talker, 661, 1);
myself.ShowPage(talker, "warehouse_keeper_norman_q0661_0105.htm");

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
if (quest_id == 661) {
myself.SetCurrentQuestID(661);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1 && talker.level >= 21) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 661);
myself.SetMemoState(talker, 661, 1 * 10 + 1);
gg.AddLog(1, talker, 661);
myself.SetFlagJournal(talker, 661, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "warehouse_keeper_norman_q0661_0103.htm", 661);
myself.ShowQuestMark(talker, 661);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 167) {
myself.SetCurrentQuestID(167);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 167) {
if (reply == 1 && myself.GetOneTimeQuestFlag(talker, 167) == 0 && gg.OwnItemCount(talker, 1106) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "warehouse_keeper_norman_q0323_02.htm");
myself.DeleteItem1(talker, 1106, 1);
myself.GiveItem1(talker, 57, 20000);
myself.RemoveMemo(talker, 167);
gg.AddLog(2, talker, 167);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 167, 1);

}

}

}
if (ask == 216) {
myself.SetCurrentQuestID(216);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 216) {
if (reply == 1) {
myself.ShowPage(talker, "warehouse_keeper_norman_q0216_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "warehouse_keeper_norman_q0216_03.htm");

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 3123) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "warehouse_keeper_norman_q0216_04.htm");
myself.DeleteItem1(talker, 3123, 1);
myself.GiveItem1(talker, 3125, 1);
myself.GiveItem1(talker, 3126, 1);

}

}

}
if (reply == 4) {
myself.ShowPage(talker, "warehouse_keeper_norman_q0216_08.htm");

}
if (reply == 5) {
myself.ShowPage(talker, "warehouse_keeper_norman_q0216_09.htm");

}
if (reply == 6) {
if (gg.OwnItemCount(talker, 3125) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "warehouse_keeper_norman_q0216_10.htm");
myself.DeleteItem1(talker, 3128, gg.OwnItemCount(talker, 3128));
myself.DeleteItem1(talker, 3125, 1);
myself.GiveItem1(talker, 3129, 1);

}

}

}

}
if (ask == 661) {
myself.SetCurrentQuestID(661);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 661) {
i0 = myself.GetHTMLCookie(talker, 661, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 661) == 1) {
myself.ShowPage(talker, "warehouse_keeper_norman_q0661_0201.htm");

}
if (reply == 3 && gg.HaveMemo(talker, 661) == 1) {
if (gg.OwnItemCount(talker, 8283) == 0 && gg.OwnItemCount(talker, 8284) == 0 && gg.OwnItemCount(talker, 8285) == 0) {
myself.ShowPage(talker, "warehouse_keeper_norman_q0661_0202.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 8283, gg.OwnItemCount(talker, 8283));
myself.DeleteItem1(talker, 8284, gg.OwnItemCount(talker, 8284));
myself.DeleteItem1(talker, 8285, gg.OwnItemCount(talker, 8285));
if (gg.OwnItemCount(talker, 8283) + gg.OwnItemCount(talker, 8284) + gg.OwnItemCount(talker, 8285) >= 10) {
myself.GiveItem1(talker, 57, 5773 + 57 * gg.OwnItemCount(talker, 8283) + 56 * gg.OwnItemCount(talker, 8284) + 60 * gg.OwnItemCount(talker, 8285));

} else {
myself.GiveItem1(talker, 57, 57 * gg.OwnItemCount(talker, 8283) + 56 * gg.OwnItemCount(talker, 8284) + 60 * gg.OwnItemCount(talker, 8285));

}
gg.AddLog(3, talker, 661);
myself.ShowPage(talker, "warehouse_keeper_norman_q0661_0203.htm");

}

}
if (reply == 4 && gg.HaveMemo(talker, 661) == 1) {
myself.ShowPage(talker, "warehouse_keeper_norman_q0661_0204.htm");
myself.RemoveMemo(talker, 661);
gg.AddLog(2, talker, 661);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}

}
super;
	}


}