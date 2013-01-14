package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guyder extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 350) == 0 && talker.level < 40) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Enhance Your Weapon");

}
if (gg.HaveMemo(talker, 350) == 0 && talker.level >= 40) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Enhance Your Weapon");

}
if (gg.HaveMemo(talker, 350) == 1 && gg.GetMemoState(talker, 350) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Enhance Your Weapon (In Progress)");

}
if (gg.HaveMemo(talker, 350) == 1 && gg.GetMemoState(talker, 350) != 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Enhance Your Weapon (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 350) == 0 && talker.level < 40) {
myself.SetCurrentQuestID(350);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "guyder_q0350_01.htm", 350);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 350) == 0 && talker.level >= 40) {
myself.SetCurrentQuestID(350);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "guyder_q0350_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 350);
myself.ShowQuestFHTML(talker, fhtml0, 350);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 350) == 1 && gg.GetMemoState(talker, 350) == 1) {
myself.SetCurrentQuestID(350);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guyder_q0350_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 350) == 1 && gg.GetMemoState(talker, 350) != 1) {
myself.SetCurrentQuestID(350);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 4661) || gg.OwnItemCount(talker, 5579) || gg.OwnItemCount(talker, 5582) || gg.OwnItemCount(talker, 5914) || gg.OwnItemCount(talker, 4639) || gg.OwnItemCount(talker, 5577) || gg.OwnItemCount(talker, 5580) || gg.OwnItemCount(talker, 5908) || gg.OwnItemCount(talker, 4650) || gg.OwnItemCount(talker, 5578) || gg.OwnItemCount(talker, 5581) || gg.OwnItemCount(talker, 5911)) {
myself.ShowPage(talker, "guyder_q0350_11a.htm");

} else if (gg.OwnItemCount(talker, 4651) || gg.OwnItemCount(talker, 4652) || gg.OwnItemCount(talker, 4653) || gg.OwnItemCount(talker, 4654) || gg.OwnItemCount(talker, 4655) || gg.OwnItemCount(talker, 4656) || gg.OwnItemCount(talker, 4657) || gg.OwnItemCount(talker, 4658) || gg.OwnItemCount(talker, 4659) || gg.OwnItemCount(talker, 4660) || gg.OwnItemCount(talker, 4629) || gg.OwnItemCount(talker, 4630) || gg.OwnItemCount(talker, 4631) || gg.OwnItemCount(talker, 4632) || gg.OwnItemCount(talker, 4633) || gg.OwnItemCount(talker, 4634) || gg.OwnItemCount(talker, 4635) || gg.OwnItemCount(talker, 4636) || gg.OwnItemCount(talker, 4637) || gg.OwnItemCount(talker, 4638) || gg.OwnItemCount(talker, 4640) || gg.OwnItemCount(talker, 4641) || gg.OwnItemCount(talker, 4642) || gg.OwnItemCount(talker, 4643) || gg.OwnItemCount(talker, 4644) || gg.OwnItemCount(talker, 4645) || gg.OwnItemCount(talker, 4646) || gg.OwnItemCount(talker, 4647) || gg.OwnItemCount(talker, 4648) || gg.OwnItemCount(talker, 4649)) {
myself.ShowPage(talker, "guyder_q0350_11.htm");

} else {
myself.DeleteItem1(talker, 4662, gg.OwnItemCount(talker, 4662));
myself.DeleteItem1(talker, 4663, gg.OwnItemCount(talker, 4663));
myself.DeleteItem1(talker, 4664, gg.OwnItemCount(talker, 4664));
myself.ShowPage(talker, "guyder_q0350_13.htm");

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
if (quest_id == 350) {
myself.SetCurrentQuestID(350);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 350);
myself.ShowQuestMark(talker, 350);
myself.SetMemoState(talker, 350, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 350);
myself.ShowQuestPage(talker, "guyder_q0350_03.htm", 350);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 350) {
myself.SetCurrentQuestID(350);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 350) {
if (reply == 1) {
myself.ShowPage(talker, "guyder_q0350_05.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "guyder_q0350_06.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "guyder_q0350_07.htm");

}
if (reply == 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4629, 1);
myself.SetMemoState(talker, 350, 2);
myself.ShowPage(talker, "guyder_q0350_08.htm");

}

}
if (reply == 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4640, 1);
myself.SetMemoState(talker, 350, 2);
myself.ShowPage(talker, "guyder_q0350_09.htm");

}

}
if (reply == 6) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4651, 1);
myself.SetMemoState(talker, 350, 2);
myself.ShowPage(talker, "guyder_q0350_10.htm");

}

}
if (reply == 7) {
myself.DeleteItem1(talker, 4651, gg.OwnItemCount(talker, 4651));
myself.DeleteItem1(talker, 4652, gg.OwnItemCount(talker, 4652));
myself.DeleteItem1(talker, 4653, gg.OwnItemCount(talker, 4653));
myself.DeleteItem1(talker, 4654, gg.OwnItemCount(talker, 4654));
myself.DeleteItem1(talker, 4655, gg.OwnItemCount(talker, 4655));
myself.DeleteItem1(talker, 4656, gg.OwnItemCount(talker, 4656));
myself.DeleteItem1(talker, 4657, gg.OwnItemCount(talker, 4657));
myself.DeleteItem1(talker, 4658, gg.OwnItemCount(talker, 4658));
myself.DeleteItem1(talker, 4659, gg.OwnItemCount(talker, 4659));
myself.DeleteItem1(talker, 4660, gg.OwnItemCount(talker, 4660));
myself.DeleteItem1(talker, 4661, gg.OwnItemCount(talker, 4661));
myself.DeleteItem1(talker, 4664, gg.OwnItemCount(talker, 4664));
myself.DeleteItem1(talker, 4629, gg.OwnItemCount(talker, 4629));
myself.DeleteItem1(talker, 4630, gg.OwnItemCount(talker, 4630));
myself.DeleteItem1(talker, 4631, gg.OwnItemCount(talker, 4631));
myself.DeleteItem1(talker, 4632, gg.OwnItemCount(talker, 4632));
myself.DeleteItem1(talker, 4633, gg.OwnItemCount(talker, 4633));
myself.DeleteItem1(talker, 4634, gg.OwnItemCount(talker, 4634));
myself.DeleteItem1(talker, 4635, gg.OwnItemCount(talker, 4635));
myself.DeleteItem1(talker, 4636, gg.OwnItemCount(talker, 4636));
myself.DeleteItem1(talker, 4637, gg.OwnItemCount(talker, 4637));
myself.DeleteItem1(talker, 4638, gg.OwnItemCount(talker, 4638));
myself.DeleteItem1(talker, 4639, gg.OwnItemCount(talker, 4639));
myself.DeleteItem1(talker, 4662, gg.OwnItemCount(talker, 4662));
myself.DeleteItem1(talker, 4640, gg.OwnItemCount(talker, 4640));
myself.DeleteItem1(talker, 4641, gg.OwnItemCount(talker, 4641));
myself.DeleteItem1(talker, 4642, gg.OwnItemCount(talker, 4642));
myself.DeleteItem1(talker, 4643, gg.OwnItemCount(talker, 4643));
myself.DeleteItem1(talker, 4644, gg.OwnItemCount(talker, 4644));
myself.DeleteItem1(talker, 4645, gg.OwnItemCount(talker, 4645));
myself.DeleteItem1(talker, 4646, gg.OwnItemCount(talker, 4646));
myself.DeleteItem1(talker, 4647, gg.OwnItemCount(talker, 4647));
myself.DeleteItem1(talker, 4648, gg.OwnItemCount(talker, 4648));
myself.DeleteItem1(talker, 4649, gg.OwnItemCount(talker, 4649));
myself.DeleteItem1(talker, 4650, gg.OwnItemCount(talker, 4650));
myself.DeleteItem1(talker, 4663, gg.OwnItemCount(talker, 4663));
myself.RemoveMemo(talker, 350);
gg.AddLog(2, talker, 350);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "guyder_q0350_14.htm");

}
if (reply == 8) {
myself.ShowPage(talker, "guyder_q0350_06a.htm");

}

}
super;
	}


}