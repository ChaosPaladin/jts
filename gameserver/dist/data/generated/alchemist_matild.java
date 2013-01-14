package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class alchemist_matild extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 334) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "The Wishing Potion");

}
if (gg.HaveMemo(talker, 334) && gg.OwnItemCount(talker, 3679) == 0 && gg.OwnItemCount(talker, 3678) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "The Wishing Potion (In Progress)");

}
if (gg.HaveMemo(talker, 334) && gg.OwnItemCount(talker, 3679) == 1 && gg.OwnItemCount(talker, 3678) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "The Wishing Potion (In Progress)");

}
if (gg.HaveMemo(talker, 334) && gg.OwnItemCount(talker, 3680) == 1 && gg.OwnItemCount(talker, 3681) == 1 && gg.OwnItemCount(talker, 3684) == 0 || gg.OwnItemCount(talker, 3685) && gg.OwnItemCount(talker, 3686) == 0 || gg.OwnItemCount(talker, 3687) == 0 || gg.OwnItemCount(talker, 3688) == 0 || gg.OwnItemCount(talker, 3689) == 0 || gg.OwnItemCount(talker, 3690) == 0 || gg.OwnItemCount(talker, 3691) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "The Wishing Potion (In Progress)");

}
if (gg.HaveMemo(talker, 334) && gg.OwnItemCount(talker, 3680) == 1 && gg.OwnItemCount(talker, 3681) == 1 && gg.OwnItemCount(talker, 3684) && gg.OwnItemCount(talker, 3685) && gg.OwnItemCount(talker, 3686) && gg.OwnItemCount(talker, 3687) && gg.OwnItemCount(talker, 3688) && gg.OwnItemCount(talker, 3689) && gg.OwnItemCount(talker, 3690) && gg.OwnItemCount(talker, 3691)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "The Wishing Potion (In Progress)");

}
if (gg.HaveMemo(talker, 334) && gg.OwnItemCount(talker, 3682) == 1 && gg.OwnItemCount(talker, 3680) == 0 && gg.OwnItemCount(talker, 3681) == 0 && gg.OwnItemCount(talker, 3684) == 0 || gg.OwnItemCount(talker, 3685) && gg.OwnItemCount(talker, 3686) == 0 || gg.OwnItemCount(talker, 3687) == 0 || gg.OwnItemCount(talker, 3688) == 0 || gg.OwnItemCount(talker, 3689) == 0 || gg.OwnItemCount(talker, 3690) == 0 || gg.OwnItemCount(talker, 3691) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "The Wishing Potion (In Progress)");

}
if (gg.HaveMemo(talker, 242) == 1 && talker.subjob_id == 0 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path of the Noblesse, Possessor of a Precious Soul - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 242) == 1 && talker.subjob_id != 0 && gg.GetMemoState(talker, 242) == 7 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Path of the Noblesse, Possessor of a Precious Soul - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 242) == 1 && talker.subjob_id != 0 && gg.GetMemoState(talker, 242) == 8 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Path of the Noblesse, Possessor of a Precious Soul - 2 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 334) == 0) {
myself.SetCurrentQuestID(334);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 30) {
myself.ShowQuestPage(talker, "alchemist_matild_q0334_01.htm", 334);

} else {
myself.ShowQuestPage(talker, "alchemist_matild_q0334_02.htm", 334);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 334) && gg.OwnItemCount(talker, 3679) == 0 && gg.OwnItemCount(talker, 3678) == 1) {
myself.SetCurrentQuestID(334);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alchemist_matild_q0334_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 334) && gg.OwnItemCount(talker, 3679) == 1 && gg.OwnItemCount(talker, 3678) == 1) {
myself.SetCurrentQuestID(334);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alchemist_matild_q0334_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 334) && gg.OwnItemCount(talker, 3680) == 1 && gg.OwnItemCount(talker, 3681) == 1 && gg.OwnItemCount(talker, 3684) == 0 || gg.OwnItemCount(talker, 3685) && gg.OwnItemCount(talker, 3686) == 0 || gg.OwnItemCount(talker, 3687) == 0 || gg.OwnItemCount(talker, 3688) == 0 || gg.OwnItemCount(talker, 3689) == 0 || gg.OwnItemCount(talker, 3690) == 0 || gg.OwnItemCount(talker, 3691) == 0) {
myself.SetCurrentQuestID(334);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alchemist_matild_q0334_08.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 334) && gg.OwnItemCount(talker, 3680) == 1 && gg.OwnItemCount(talker, 3681) == 1 && gg.OwnItemCount(talker, 3684) && gg.OwnItemCount(talker, 3685) && gg.OwnItemCount(talker, 3686) && gg.OwnItemCount(talker, 3687) && gg.OwnItemCount(talker, 3688) && gg.OwnItemCount(talker, 3689) && gg.OwnItemCount(talker, 3690) && gg.OwnItemCount(talker, 3691)) {
myself.SetCurrentQuestID(334);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alchemist_matild_q0334_09.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 334) && gg.OwnItemCount(talker, 3682) == 1 && gg.OwnItemCount(talker, 3680) == 0 && gg.OwnItemCount(talker, 3681) == 0 && gg.OwnItemCount(talker, 3684) == 0 || gg.OwnItemCount(talker, 3685) && gg.OwnItemCount(talker, 3686) == 0 || gg.OwnItemCount(talker, 3687) == 0 || gg.OwnItemCount(talker, 3688) == 0 || gg.OwnItemCount(talker, 3689) == 0 || gg.OwnItemCount(talker, 3690) == 0 || gg.OwnItemCount(talker, 3691) == 0) {
myself.SetCurrentQuestID(334);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alchemist_matild_q0334_12.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 242) == 1 && talker.subjob_id == 0 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
myself.SetCurrentQuestID(242);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quest_not_subclass001.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 242) == 1 && talker.subjob_id != 0 && gg.GetMemoState(talker, 242) == 7 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
myself.SetCurrentQuestID(242);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alchemist_matild_q0242_01.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 242) == 1 && talker.subjob_id != 0 && gg.GetMemoState(talker, 242) == 8 && myself.GetOneTimeQuestFlag(talker, 242) == 0) {
myself.SetCurrentQuestID(242);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alchemist_matild_q0242_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 334) {
myself.SetCurrentQuestID(334);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 3678) == 0) {
myself.GiveItem1(talker, 3678, 1);

}
myself.ShowQuestPage(talker, "alchemist_matild_q0334_04.htm", quest_id);
myself.SetMemoState(talker, 334, 1);
myself.SetJournal(talker, 334, 1);
myself.ShowQuestMark(talker, 334);

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam i0, HandlerParam i1, HandlerParam talker, HandlerParam timer_id) {
myself.SetCurrentQuestID(334);
if (timer_id == 2336008) {
myself.Say(gg.MakeFString(33415, "", "", "", "", ""));
myself.AddTimerEx(2336009, 4 * 1000);

} else if (timer_id == 2336009) {
myself.Say(gg.MakeFString(33416, "", "", "", "", ""));
myself.AddTimerEx(2336010, 4 * 1000);

} else if (timer_id == 2336010) {
myself.Say(gg.MakeFString(33417, "", "", "", "", ""));
if (myself.i_quest0 == 1) {
i0 = gg.Rand(2);

} else if (myself.i_quest0 == 3 || myself.i_quest0 == 4 || myself.i_quest0 == 2) {
i0 = gg.Rand(3);

}
switch (i0) {
case 0: {
if (myself.i_quest0 == 1) {
myself.CreateOnePrivate(1030742, "fairy_rupina", 0, 1);
myself.av_quest0.Exchange(0);

} else if (myself.i_quest0 == 2) {
myself.CreateOnePrivate(1027135, "grima", 0, 1);
myself.CreateOnePrivate(1027135, "grima", 0, 1);
myself.CreateOnePrivate(1027135, "grima", 0, 1);
myself.av_quest0.Exchange(0);

} else if (myself.i_quest0 == 3) {
myself.c_quest2.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(myself.c_quest2, 3469, 1);
myself.av_quest0.Exchange(0);

} else if (myself.i_quest0 == 4) {
myself.c_quest2.quest_last_reward_time = myself.GetCurrentTick();
myself.CreateOnePrivate(1030743, "wisdom_chest", 0, 1);
myself.av_quest0.Exchange(0);

}
break;

}
case 1: {
if (myself.i_quest0 == 1) {
myself.CreateOnePrivate(1027136, "succubus_of_seduction", 0, 1);
myself.CreateOnePrivate(1027136, "succubus_of_seduction", 0, 1);
myself.CreateOnePrivate(1027136, "succubus_of_seduction", 0, 1);
myself.av_quest0.Exchange(0);

} else if (myself.i_quest0 == 2) {
myself.c_quest2.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(myself.c_quest2, 57, 10000);
myself.av_quest0.Exchange(0);

} else if (myself.i_quest0 == 3) {
myself.CreateOnePrivate(1027153, "dlord_alexandrosanches", 0, 1);
myself.av_quest0.Exchange(0);

} else if (myself.i_quest0 == 4) {
myself.CreateOnePrivate(1030743, "wisdom_chest", 0, 1);
myself.av_quest0.Exchange(0);

}
break;

}
case 2: {
if (myself.i_quest0 == 2) {
myself.c_quest2.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(myself.c_quest2, 57, 10000);
myself.av_quest0.Exchange(0);

} else if (myself.i_quest0 == 3) {
myself.c_quest2.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(myself.c_quest2, 3468, 1);
myself.av_quest0.Exchange(0);

} else if (myself.i_quest0 == 4) {
myself.CreateOnePrivate(1030743, "wisdom_chest", 0, 1);
myself.av_quest0.Exchange(0);

}
break;

}

}

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 334) {
myself.SetCurrentQuestID(334);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 334) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "alchemist_matild_q0334_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 334);
myself.ShowQuestFHTML(talker, fhtml0, 334);

} else if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "alchemist_matild_q0334_07.htm");
myself.DeleteItem1(talker, 3679, gg.OwnItemCount(talker, 3679));
myself.DeleteItem1(talker, 3678, gg.OwnItemCount(talker, 3678));
myself.GiveItem1(talker, 3680, 1);
myself.GiveItem1(talker, 3681, 1);
myself.SetMemoState(talker, 334, 2);
myself.SetJournal(talker, 334, 3);
myself.ShowQuestMark(talker, 334);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 3) {
myself.ShowPage(talker, "alchemist_matild_q0334_10.htm");

} else if (reply == 4 && gg.OwnItemCount(talker, 3684) && gg.OwnItemCount(talker, 3686) && gg.OwnItemCount(talker, 3687) && gg.OwnItemCount(talker, 3688) && gg.OwnItemCount(talker, 3689) && gg.OwnItemCount(talker, 3690) && gg.OwnItemCount(talker, 3691) && gg.OwnItemCount(talker, 3685) && gg.OwnItemCount(talker, 3680) && gg.OwnItemCount(talker, 3681)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "alchemist_matild_q0334_11.htm");
myself.GiveItem1(talker, 3467, 1);
if (gg.OwnItemCount(talker, 3682) == 0) {
myself.GiveItem1(talker, 3682, 1);

}
myself.DeleteItem1(talker, 3684, 1);
myself.DeleteItem1(talker, 3686, 1);
myself.DeleteItem1(talker, 3687, 1);
myself.DeleteItem1(talker, 3688, 1);
myself.DeleteItem1(talker, 3689, 1);
myself.DeleteItem1(talker, 3690, 1);
myself.DeleteItem1(talker, 3691, 1);
myself.DeleteItem1(talker, 3685, 1);
myself.DeleteItem1(talker, 3680, gg.OwnItemCount(talker, 3680));
myself.DeleteItem1(talker, 3681, gg.OwnItemCount(talker, 3681));
myself.SetMemoState(talker, 334, 2);
myself.SoundEffect(talker, "ItemSound.quest_itemget");
myself.SetJournal(talker, 334, 5);
myself.ShowQuestMark(talker, 334);

}

} else if (reply == 5) {
if (gg.OwnItemCount(talker, 3467) > 0) {
myself.ShowPage(talker, "alchemist_matild_q0334_13.htm");
if (myself.av_quest0.GetValue() != 1) {
myself.i_quest0 = 0;

}

} else {
myself.ShowPage(talker, "alchemist_matild_q0334_14.htm");

}

} else if (reply == 6) {
if (gg.OwnItemCount(talker, 3467) > 0) {
myself.ShowPage(talker, "alchemist_matild_q0334_15a.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "alchemist_matild_q0334_15.htm");
myself.GiveItem1(talker, 3680, 1);
myself.GiveItem1(talker, 3681, 1);

}

} else if (reply == 7) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 3467) > 0) {
if (myself.av_quest0.CompareExchange(1, 0) == 0) {
myself.ShowPage(talker, "alchemist_matild_q0334_16.htm");
myself.DeleteItem1(talker, 3467, 1);
myself.i_quest0 = 1;
myself.c_quest2 = talker;
talker.flag = 1;
myself.AddTimerEx(2336008, 3 * 1000);
gg.AddLog(5, talker, 334001);
gg.AddLog(3, talker, 334);

} else {
myself.ShowPage(talker, "alchemist_matild_q0334_20.htm");

}

} else {
myself.ShowPage(talker, "alchemist_matild_q0334_14.htm");

}

}

} else if (reply == 8) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 3467) > 0) {
if (myself.av_quest0.CompareExchange(1, 0) == 0) {
myself.ShowPage(talker, "alchemist_matild_q0334_17.htm");
myself.DeleteItem1(talker, 3467, 1);
myself.i_quest0 = 2;
myself.c_quest2 = talker;
talker.flag = 2;
myself.AddTimerEx(2336008, 3 * 1000);
gg.AddLog(5, talker, 334002);
gg.AddLog(3, talker, 334);

} else {
myself.ShowPage(talker, "alchemist_matild_q0334_20.htm");

}

} else {
myself.ShowPage(talker, "alchemist_matild_q0334_14.htm");

}

}

} else if (reply == 9) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 3467) > 0) {
if (myself.av_quest0.CompareExchange(1, 0) == 0) {
myself.ShowPage(talker, "alchemist_matild_q0334_18.htm");
myself.DeleteItem1(talker, 3467, 1);
myself.i_quest0 = 3;
myself.c_quest2 = talker;
talker.flag = 3;
myself.AddTimerEx(2336008, 3 * 1000);
gg.AddLog(5, talker, 334003);
gg.AddLog(3, talker, 334);

} else {
myself.ShowPage(talker, "alchemist_matild_q0334_20.htm");

}

} else {
myself.ShowPage(talker, "alchemist_matild_q0334_14.htm");

}

}

} else if (reply == 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 3467) > 0) {
if (myself.av_quest0.CompareExchange(1, 0) == 0) {
myself.ShowPage(talker, "alchemist_matild_q0334_19.htm");
myself.DeleteItem1(talker, 3467, 1);
myself.i_quest0 = 4;
myself.c_quest2 = talker;
talker.flag = 4;
myself.AddTimerEx(2336008, 3 * 1000);
gg.AddLog(5, talker, 334004);
gg.AddLog(3, talker, 334);

} else {
myself.ShowPage(talker, "alchemist_matild_q0334_20.htm");

}

} else {
myself.ShowPage(talker, "alchemist_matild_q0334_14.htm");

}

}

}

}
if (ask == 242) {
myself.SetCurrentQuestID(242);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 242) {
if (reply == 1 && gg.GetMemoState(talker, 242) == 7) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7596, 1);
myself.SetMemoState(talker, 242, 8);
myself.SetFlagJournal(talker, 242, 8);
myself.ShowQuestMark(talker, 242);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "alchemist_matild_q0242_02.htm");

}

}

}
super;
	}


}