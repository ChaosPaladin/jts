package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cybellin extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) == 0 && gg.OwnItemCount(talker, 3692) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) || gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3697) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) || gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3697) && gg.OwnItemCount(talker, 3698)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) || gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3697) && gg.OwnItemCount(talker, 3699) || gg.OwnItemCount(talker, 3700) || gg.OwnItemCount(talker, 3701) || gg.OwnItemCount(talker, 3702) || gg.OwnItemCount(talker, 3703) || gg.OwnItemCount(talker, 3704) || gg.OwnItemCount(talker, 3705) || gg.OwnItemCount(talker, 3706)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3707)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) || gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3697) && gg.OwnItemCount(talker, 3698) == 0 && gg.OwnItemCount(talker, 3699) == 0 && gg.OwnItemCount(talker, 3700) == 0 && gg.OwnItemCount(talker, 3701) == 0 && gg.OwnItemCount(talker, 3702) == 0 && gg.OwnItemCount(talker, 3703) == 0 && gg.OwnItemCount(talker, 3704) == 0 && gg.OwnItemCount(talker, 3705) == 0 && gg.OwnItemCount(talker, 3706) == 0 && gg.OwnItemCount(talker, 3707) == 0 && gg.OwnItemCount(talker, 3708) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) || gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3697) && gg.OwnItemCount(talker, 3708)) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Song of the Hunter  (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) == 0 && gg.OwnItemCount(talker, 3692) == 0) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cybellin_q0335_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) || gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3697) == 0) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cybellin_q0335_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) || gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3697) && gg.OwnItemCount(talker, 3698)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cybellin_q0335_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) || gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3697) && gg.OwnItemCount(talker, 3699) || gg.OwnItemCount(talker, 3700) || gg.OwnItemCount(talker, 3701) || gg.OwnItemCount(talker, 3702) || gg.OwnItemCount(talker, 3703) || gg.OwnItemCount(talker, 3704) || gg.OwnItemCount(talker, 3705) || gg.OwnItemCount(talker, 3706)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cybellin_q0335_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3707)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "cybellin_q0335_05a.htm");
myself.GiveItem1(talker, 57, 870400);
myself.DeleteItem1(talker, 3707, gg.OwnItemCount(talker, 3707));
gg.AddLog(3, talker, 335);

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) || gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3697) && gg.OwnItemCount(talker, 3698) == 0 && gg.OwnItemCount(talker, 3699) == 0 && gg.OwnItemCount(talker, 3700) == 0 && gg.OwnItemCount(talker, 3701) == 0 && gg.OwnItemCount(talker, 3702) == 0 && gg.OwnItemCount(talker, 3703) == 0 && gg.OwnItemCount(talker, 3704) == 0 && gg.OwnItemCount(talker, 3705) == 0 && gg.OwnItemCount(talker, 3706) == 0 && gg.OwnItemCount(talker, 3707) == 0 && gg.OwnItemCount(talker, 3708) == 0) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cybellin_q0335_08.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) || gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3697) && gg.OwnItemCount(talker, 3708)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cybellin_q0335_09.htm");
myself.DeleteItem1(talker, 3708, gg.OwnItemCount(talker, 3708));

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 335) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 335) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "cybellin_q0335_03.htm");
if (gg.OwnItemCount(talker, 3471) == 0) {
myself.GiveItem1(talker, 3471, 1);

}
if (gg.OwnItemCount(talker, 3697) == 0) {
myself.GiveItem1(talker, 3697, 1);

}
myself.GiveItem1(talker, 3698, 1);
if (gg.OwnItemCount(talker, 3708) == 1) {
myself.DeleteItem1(talker, 3708, gg.OwnItemCount(talker, 3708));

}

}

} else if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "cybellin_q0335_06.htm");
if (gg.OwnItemCount(talker, 3699)) {
myself.GiveItem1(talker, 57, 3400);

} else if (gg.OwnItemCount(talker, 3700)) {
myself.GiveItem1(talker, 57, 6800);

} else if (gg.OwnItemCount(talker, 3701)) {
myself.GiveItem1(talker, 57, 13600);

} else if (gg.OwnItemCount(talker, 3702)) {
myself.GiveItem1(talker, 57, 27200);

} else if (gg.OwnItemCount(talker, 3703)) {
myself.GiveItem1(talker, 57, 54400);

} else if (gg.OwnItemCount(talker, 3704)) {
myself.GiveItem1(talker, 57, 108800);

} else if (gg.OwnItemCount(talker, 3705)) {
myself.GiveItem1(talker, 57, 217600);

} else if (gg.OwnItemCount(talker, 3706)) {
myself.GiveItem1(talker, 57, 435200);

} else if (gg.OwnItemCount(talker, 3707)) {
myself.GiveItem1(talker, 57, 870400);

}
myself.DeleteItem1(talker, 3699, gg.OwnItemCount(talker, 3699));
myself.DeleteItem1(talker, 3700, gg.OwnItemCount(talker, 3700));
myself.DeleteItem1(talker, 3701, gg.OwnItemCount(talker, 3701));
myself.DeleteItem1(talker, 3702, gg.OwnItemCount(talker, 3702));
myself.DeleteItem1(talker, 3703, gg.OwnItemCount(talker, 3703));
myself.DeleteItem1(talker, 3704, gg.OwnItemCount(talker, 3704));
myself.DeleteItem1(talker, 3705, gg.OwnItemCount(talker, 3705));
myself.DeleteItem1(talker, 3706, gg.OwnItemCount(talker, 3706));
myself.DeleteItem1(talker, 3707, gg.OwnItemCount(talker, 3707));
gg.AddLog(3, talker, 335);

}

} else if (reply == 3) {
myself.ShowPage(talker, "cybellin_q0335_07.htm");

} else if (reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "cybellin_q0335_10.htm");
myself.DeleteItem1(talker, 3698, gg.OwnItemCount(talker, 3698));
myself.DeleteItem1(talker, 3471, gg.OwnItemCount(talker, 3471));
myself.DeleteItem1(talker, 3697, gg.OwnItemCount(talker, 3697));

}

}

}
super;
	}


}