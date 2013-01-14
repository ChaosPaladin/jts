package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class grey extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 335) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Song of the Hunter");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3695) && gg.OwnItemCount(talker, 3709) >= 40 + gg.OwnItemCount(talker, 3710) >= 20 + gg.OwnItemCount(talker, 3711) + gg.OwnItemCount(talker, 3712) + gg.OwnItemCount(talker, 3713) >= 3 + gg.OwnItemCount(talker, 3714) >= 1 + gg.OwnItemCount(talker, 3715) >= 20 + gg.OwnItemCount(talker, 3716) >= 30 < 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3695) && gg.OwnItemCount(talker, 3709) >= 40 + gg.OwnItemCount(talker, 3710) >= 20 + gg.OwnItemCount(talker, 3711) + gg.OwnItemCount(talker, 3712) + gg.OwnItemCount(talker, 3713) >= 3 + gg.OwnItemCount(talker, 3714) >= 1 + gg.OwnItemCount(talker, 3715) >= 20 + gg.OwnItemCount(talker, 3716) >= 30 >= 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && talker.level < 45 && gg.OwnItemCount(talker, 3692)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && talker.level >= 45 && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3696) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3696) && gg.OwnItemCount(talker, 3717) >= 20 + gg.OwnItemCount(talker, 3718) >= 20 + gg.OwnItemCount(talker, 3719) >= 30 + gg.OwnItemCount(talker, 3720) >= 20 + gg.OwnItemCount(talker, 3721) >= 20 + gg.OwnItemCount(talker, 3722) + gg.OwnItemCount(talker, 3723) + gg.OwnItemCount(talker, 3724) + gg.OwnItemCount(talker, 3725) + gg.OwnItemCount(talker, 3726) >= 5 < 3) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3696) && gg.OwnItemCount(talker, 3717) >= 20 + gg.OwnItemCount(talker, 3718) >= 20 + gg.OwnItemCount(talker, 3719) >= 30 + gg.OwnItemCount(talker, 3720) >= 20 + gg.OwnItemCount(talker, 3721) >= 20 + gg.OwnItemCount(talker, 3722) + gg.OwnItemCount(talker, 3723) + gg.OwnItemCount(talker, 3724) + gg.OwnItemCount(talker, 3725) + gg.OwnItemCount(talker, 3726) >= 5 >= 3) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693)) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Song of the Hunter  (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) == 0) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 35) {
myself.FHTML_SetFileName(fhtml0, "grey_q0335_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 335);
myself.ShowQuestFHTML(talker, fhtml0, 335);

} else {
myself.ShowQuestPage(talker, "grey_q0335_01.htm", 335);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3695) && gg.OwnItemCount(talker, 3709) >= 40 + gg.OwnItemCount(talker, 3710) >= 20 + gg.OwnItemCount(talker, 3711) + gg.OwnItemCount(talker, 3712) + gg.OwnItemCount(talker, 3713) >= 3 + gg.OwnItemCount(talker, 3714) >= 1 + gg.OwnItemCount(talker, 3715) >= 20 + gg.OwnItemCount(talker, 3716) >= 30 < 3) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grey_q0335_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3695) && gg.OwnItemCount(talker, 3709) >= 40 + gg.OwnItemCount(talker, 3710) >= 20 + gg.OwnItemCount(talker, 3711) + gg.OwnItemCount(talker, 3712) + gg.OwnItemCount(talker, 3713) >= 3 + gg.OwnItemCount(talker, 3714) >= 1 + gg.OwnItemCount(talker, 3715) >= 20 + gg.OwnItemCount(talker, 3716) >= 30 >= 3) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "grey_q0335_06.htm");
myself.SetJournal(talker, 335, 2);
myself.ShowQuestMark(talker, 335);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 3692, 1);
myself.DeleteItem1(talker, 3709, gg.OwnItemCount(talker, 3709));
myself.DeleteItem1(talker, 3710, gg.OwnItemCount(talker, 3710));
myself.DeleteItem1(talker, 3711, gg.OwnItemCount(talker, 3711));
myself.DeleteItem1(talker, 3712, gg.OwnItemCount(talker, 3712));
myself.DeleteItem1(talker, 3713, gg.OwnItemCount(talker, 3713));
myself.DeleteItem1(talker, 3714, gg.OwnItemCount(talker, 3714));
myself.DeleteItem1(talker, 3715, gg.OwnItemCount(talker, 3715));
myself.DeleteItem1(talker, 3716, gg.OwnItemCount(talker, 3716));
myself.DeleteItem1(talker, 3695, gg.OwnItemCount(talker, 3695));

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && talker.level < 45 && gg.OwnItemCount(talker, 3692)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grey_q0335_07.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && talker.level >= 45 && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3696) == 0) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grey_q0335_08.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3696) && gg.OwnItemCount(talker, 3717) >= 20 + gg.OwnItemCount(talker, 3718) >= 20 + gg.OwnItemCount(talker, 3719) >= 30 + gg.OwnItemCount(talker, 3720) >= 20 + gg.OwnItemCount(talker, 3721) >= 20 + gg.OwnItemCount(talker, 3722) + gg.OwnItemCount(talker, 3723) + gg.OwnItemCount(talker, 3724) + gg.OwnItemCount(talker, 3725) + gg.OwnItemCount(talker, 3726) >= 5 < 3) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grey_q0335_11.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3696) && gg.OwnItemCount(talker, 3717) >= 20 + gg.OwnItemCount(talker, 3718) >= 20 + gg.OwnItemCount(talker, 3719) >= 30 + gg.OwnItemCount(talker, 3720) >= 20 + gg.OwnItemCount(talker, 3721) >= 20 + gg.OwnItemCount(talker, 3722) + gg.OwnItemCount(talker, 3723) + gg.OwnItemCount(talker, 3724) + gg.OwnItemCount(talker, 3725) + gg.OwnItemCount(talker, 3726) >= 5 >= 3) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "grey_q0335_12.htm");
myself.SetJournal(talker, 335, 3);
myself.ShowQuestMark(talker, 335);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 3693, 1);
myself.DeleteItem1(talker, 3718, gg.OwnItemCount(talker, 3718));
myself.DeleteItem1(talker, 3717, gg.OwnItemCount(talker, 3717));
myself.DeleteItem1(talker, 3719, gg.OwnItemCount(talker, 3719));
myself.DeleteItem1(talker, 3720, gg.OwnItemCount(talker, 3720));
myself.DeleteItem1(talker, 3721, gg.OwnItemCount(talker, 3721));
myself.DeleteItem1(talker, 3722, gg.OwnItemCount(talker, 3722));
myself.DeleteItem1(talker, 3723, gg.OwnItemCount(talker, 3723));
myself.DeleteItem1(talker, 3724, gg.OwnItemCount(talker, 3724));
myself.DeleteItem1(talker, 3725, gg.OwnItemCount(talker, 3725));
myself.DeleteItem1(talker, 3726, gg.OwnItemCount(talker, 3726));
myself.DeleteItem1(talker, 3696, gg.OwnItemCount(talker, 3696));
myself.DeleteItem1(talker, 3692, gg.OwnItemCount(talker, 3692));

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grey_q0335_14.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 335) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 3695) == 0) {
myself.GiveItem1(talker, 3695, 1);

}
myself.ShowQuestPage(talker, "grey_q0335_03.htm", quest_id);
gg.AddLog(1, talker, 335);
myself.SetMemoState(talker, 335, 0);
myself.ShowQuestMark(talker, 335);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 335) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 335) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 3727) + gg.OwnItemCount(talker, 3728) + gg.OwnItemCount(talker, 3729) + gg.OwnItemCount(talker, 3730) + gg.OwnItemCount(talker, 3731) + gg.OwnItemCount(talker, 3732) + gg.OwnItemCount(talker, 3733) + gg.OwnItemCount(talker, 3734) + gg.OwnItemCount(talker, 3735) + gg.OwnItemCount(talker, 3736) + gg.OwnItemCount(talker, 3737) + gg.OwnItemCount(talker, 3738) + gg.OwnItemCount(talker, 3739) + gg.OwnItemCount(talker, 3740) + gg.OwnItemCount(talker, 3741) + gg.OwnItemCount(talker, 3742) + gg.OwnItemCount(talker, 3743) + gg.OwnItemCount(talker, 3744) + gg.OwnItemCount(talker, 3745) + gg.OwnItemCount(talker, 3746) + gg.OwnItemCount(talker, 3747) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "grey_q0335_09.htm");
myself.GiveItem1(talker, 3696, 1);

}

} else {
myself.ShowPage(talker, "grey_q0335_09a.htm");

}

} else if (reply == 2) {
myself.ShowPage(talker, "grey_q0335_15.htm");

} else if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.RemoveMemo(talker, 335);
gg.AddLog(2, talker, 335);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.DeleteItem1(talker, 3692, gg.OwnItemCount(talker, 3692));
myself.DeleteItem1(talker, 3693, gg.OwnItemCount(talker, 3693));
myself.DeleteItem1(talker, 3694, gg.OwnItemCount(talker, 3694));
myself.DeleteItem1(talker, 3695, gg.OwnItemCount(talker, 3695));
myself.DeleteItem1(talker, 3696, gg.OwnItemCount(talker, 3696));
myself.DeleteItem1(talker, 3697, gg.OwnItemCount(talker, 3697));
myself.DeleteItem1(talker, 3698, gg.OwnItemCount(talker, 3698));
myself.DeleteItem1(talker, 3699, gg.OwnItemCount(talker, 3699));
myself.DeleteItem1(talker, 3700, gg.OwnItemCount(talker, 3700));
myself.DeleteItem1(talker, 3701, gg.OwnItemCount(talker, 3701));
myself.DeleteItem1(talker, 3702, gg.OwnItemCount(talker, 3702));
myself.DeleteItem1(talker, 3703, gg.OwnItemCount(talker, 3703));
myself.DeleteItem1(talker, 3704, gg.OwnItemCount(talker, 3704));
myself.DeleteItem1(talker, 3705, gg.OwnItemCount(talker, 3705));
myself.DeleteItem1(talker, 3706, gg.OwnItemCount(talker, 3706));
myself.DeleteItem1(talker, 3707, gg.OwnItemCount(talker, 3707));
myself.DeleteItem1(talker, 3708, gg.OwnItemCount(talker, 3708));
myself.DeleteItem1(talker, 3471, gg.OwnItemCount(talker, 3471));
myself.DeleteItem1(talker, 3709, gg.OwnItemCount(talker, 3709));
myself.DeleteItem1(talker, 3710, gg.OwnItemCount(talker, 3710));
myself.DeleteItem1(talker, 3711, gg.OwnItemCount(talker, 3711));
myself.DeleteItem1(talker, 3712, gg.OwnItemCount(talker, 3712));
myself.DeleteItem1(talker, 3713, gg.OwnItemCount(talker, 3713));
myself.DeleteItem1(talker, 3714, gg.OwnItemCount(talker, 3714));
myself.DeleteItem1(talker, 3715, gg.OwnItemCount(talker, 3715));
myself.DeleteItem1(talker, 3716, gg.OwnItemCount(talker, 3716));
myself.DeleteItem1(talker, 3717, gg.OwnItemCount(talker, 3717));
myself.DeleteItem1(talker, 3718, gg.OwnItemCount(talker, 3718));
myself.DeleteItem1(talker, 3719, gg.OwnItemCount(talker, 3719));
myself.DeleteItem1(talker, 3720, gg.OwnItemCount(talker, 3720));
myself.DeleteItem1(talker, 3721, gg.OwnItemCount(talker, 3721));
myself.DeleteItem1(talker, 3722, gg.OwnItemCount(talker, 3722));
myself.DeleteItem1(talker, 3723, gg.OwnItemCount(talker, 3723));
myself.DeleteItem1(talker, 3724, gg.OwnItemCount(talker, 3724));
myself.DeleteItem1(talker, 3725, gg.OwnItemCount(talker, 3725));
myself.DeleteItem1(talker, 3726, gg.OwnItemCount(talker, 3726));
myself.DeleteItem1(talker, 3727, gg.OwnItemCount(talker, 3727));
myself.DeleteItem1(talker, 3728, gg.OwnItemCount(talker, 3728));
myself.DeleteItem1(talker, 3729, gg.OwnItemCount(talker, 3729));
myself.DeleteItem1(talker, 3730, gg.OwnItemCount(talker, 3730));
myself.DeleteItem1(talker, 3731, gg.OwnItemCount(talker, 3731));
myself.DeleteItem1(talker, 3732, gg.OwnItemCount(talker, 3732));
myself.DeleteItem1(talker, 3733, gg.OwnItemCount(talker, 3733));
myself.DeleteItem1(talker, 3734, gg.OwnItemCount(talker, 3734));
myself.DeleteItem1(talker, 3735, gg.OwnItemCount(talker, 3735));
myself.DeleteItem1(talker, 3736, gg.OwnItemCount(talker, 3736));
myself.DeleteItem1(talker, 3737, gg.OwnItemCount(talker, 3737));
myself.DeleteItem1(talker, 3738, gg.OwnItemCount(talker, 3738));
myself.DeleteItem1(talker, 3739, gg.OwnItemCount(talker, 3739));
myself.DeleteItem1(talker, 3740, gg.OwnItemCount(talker, 3740));
myself.DeleteItem1(talker, 3741, gg.OwnItemCount(talker, 3741));
myself.DeleteItem1(talker, 3742, gg.OwnItemCount(talker, 3742));
myself.DeleteItem1(talker, 3743, gg.OwnItemCount(talker, 3743));
myself.DeleteItem1(talker, 3744, gg.OwnItemCount(talker, 3744));
myself.DeleteItem1(talker, 3745, gg.OwnItemCount(talker, 3745));
myself.DeleteItem1(talker, 3746, gg.OwnItemCount(talker, 3746));
myself.DeleteItem1(talker, 3747, gg.OwnItemCount(talker, 3747));
myself.DeleteItem1(talker, 3748, gg.OwnItemCount(talker, 3748));
myself.DeleteItem1(talker, 3749, gg.OwnItemCount(talker, 3749));
myself.DeleteItem1(talker, 3750, gg.OwnItemCount(talker, 3750));
myself.DeleteItem1(talker, 3751, gg.OwnItemCount(talker, 3751));
myself.DeleteItem1(talker, 3752, gg.OwnItemCount(talker, 3752));
myself.DeleteItem1(talker, 3753, gg.OwnItemCount(talker, 3753));
myself.DeleteItem1(talker, 3754, gg.OwnItemCount(talker, 3754));
myself.DeleteItem1(talker, 3755, gg.OwnItemCount(talker, 3755));
myself.DeleteItem1(talker, 3756, gg.OwnItemCount(talker, 3756));
myself.DeleteItem1(talker, 3757, gg.OwnItemCount(talker, 3757));
myself.DeleteItem1(talker, 3758, gg.OwnItemCount(talker, 3758));
myself.DeleteItem1(talker, 3759, gg.OwnItemCount(talker, 3759));
myself.DeleteItem1(talker, 3760, gg.OwnItemCount(talker, 3760));
myself.DeleteItem1(talker, 3761, gg.OwnItemCount(talker, 3761));
myself.DeleteItem1(talker, 3762, gg.OwnItemCount(talker, 3762));
myself.DeleteItem1(talker, 3763, gg.OwnItemCount(talker, 3763));
myself.DeleteItem1(talker, 3764, gg.OwnItemCount(talker, 3764));
myself.DeleteItem1(talker, 3765, gg.OwnItemCount(talker, 3765));
myself.DeleteItem1(talker, 3766, gg.OwnItemCount(talker, 3766));
myself.DeleteItem1(talker, 3767, gg.OwnItemCount(talker, 3767));
myself.DeleteItem1(talker, 3768, gg.OwnItemCount(talker, 3768));
myself.DeleteItem1(talker, 3769, gg.OwnItemCount(talker, 3769));
myself.DeleteItem1(talker, 3770, gg.OwnItemCount(talker, 3770));
myself.DeleteItem1(talker, 3771, gg.OwnItemCount(talker, 3771));
myself.DeleteItem1(talker, 3772, gg.OwnItemCount(talker, 3772));
myself.DeleteItem1(talker, 3773, gg.OwnItemCount(talker, 3773));
myself.DeleteItem1(talker, 3774, gg.OwnItemCount(talker, 3774));
myself.DeleteItem1(talker, 3775, gg.OwnItemCount(talker, 3775));
myself.DeleteItem1(talker, 3776, gg.OwnItemCount(talker, 3776));
myself.DeleteItem1(talker, 3777, gg.OwnItemCount(talker, 3777));
myself.DeleteItem1(talker, 3778, gg.OwnItemCount(talker, 3778));
myself.DeleteItem1(talker, 3779, gg.OwnItemCount(talker, 3779));
myself.DeleteItem1(talker, 3780, gg.OwnItemCount(talker, 3780));
myself.DeleteItem1(talker, 3781, gg.OwnItemCount(talker, 3781));
myself.DeleteItem1(talker, 3782, gg.OwnItemCount(talker, 3782));
myself.DeleteItem1(talker, 3783, gg.OwnItemCount(talker, 3783));
myself.DeleteItem1(talker, 3784, gg.OwnItemCount(talker, 3784));
myself.DeleteItem1(talker, 3785, gg.OwnItemCount(talker, 3785));
myself.DeleteItem1(talker, 3786, gg.OwnItemCount(talker, 3786));
myself.DeleteItem1(talker, 3787, gg.OwnItemCount(talker, 3787));
myself.DeleteItem1(talker, 3788, gg.OwnItemCount(talker, 3788));
myself.DeleteItem1(talker, 3789, gg.OwnItemCount(talker, 3789));
myself.DeleteItem1(talker, 3790, gg.OwnItemCount(talker, 3790));
myself.DeleteItem1(talker, 3791, gg.OwnItemCount(talker, 3791));
myself.DeleteItem1(talker, 3792, gg.OwnItemCount(talker, 3792));
myself.DeleteItem1(talker, 3793, gg.OwnItemCount(talker, 3793));
myself.DeleteItem1(talker, 3794, gg.OwnItemCount(talker, 3794));
myself.DeleteItem1(talker, 3795, gg.OwnItemCount(talker, 3795));
myself.DeleteItem1(talker, 3796, gg.OwnItemCount(talker, 3796));
myself.DeleteItem1(talker, 3797, gg.OwnItemCount(talker, 3797));
myself.DeleteItem1(talker, 3798, gg.OwnItemCount(talker, 3798));
myself.DeleteItem1(talker, 3799, gg.OwnItemCount(talker, 3799));
myself.DeleteItem1(talker, 3800, gg.OwnItemCount(talker, 3800));
myself.DeleteItem1(talker, 3801, gg.OwnItemCount(talker, 3801));
myself.DeleteItem1(talker, 3802, gg.OwnItemCount(talker, 3802));
myself.DeleteItem1(talker, 3803, gg.OwnItemCount(talker, 3803));
myself.DeleteItem1(talker, 3804, gg.OwnItemCount(talker, 3804));
myself.DeleteItem1(talker, 3805, gg.OwnItemCount(talker, 3805));
myself.DeleteItem1(talker, 3806, gg.OwnItemCount(talker, 3806));
myself.DeleteItem1(talker, 3807, gg.OwnItemCount(talker, 3807));
myself.DeleteItem1(talker, 3808, gg.OwnItemCount(talker, 3808));
myself.DeleteItem1(talker, 3809, gg.OwnItemCount(talker, 3809));
myself.DeleteItem1(talker, 3810, gg.OwnItemCount(talker, 3810));
if (gg.OwnItemCount(talker, 3694) < 20) {
myself.ShowPage(talker, "grey_q0335_16.htm");

} else {
myself.ShowPage(talker, "grey_q0335_17.htm");
i0 = gg.Rand(10);
myself.GiveItem1(talker, 57, 20000);

}

}

} else if (reply == 4) {
myself.ShowPage(talker, "grey_q0335_18.htm");

}

}
super;
	}


}