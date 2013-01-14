package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class levian extends human_elf_mage_lv2_master {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1174) == 0 && gg.OwnItemCount(talker, 1271) && gg.OwnItemCount(talker, 1165) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1174) > 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1165) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Human Knight (In Progress)");

}
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 4) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Subjugation of Lizardmen (In Progress)");

}
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 5) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Subjugation of Lizardmen (In Progress)");

}
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 6) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Subjugation of Lizardmen (In Progress)");

}
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 7) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Subjugation of Lizardmen (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1174) == 0 && gg.OwnItemCount(talker, 1271) && gg.OwnItemCount(talker, 1165) == 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "levian_q0402_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1174) > 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1175) < 20) {
myself.ShowPage(talker, "levian_q0402_03.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "levian_q0402_04.htm");
myself.DeleteItem1(talker, 1175, gg.OwnItemCount(talker, 1175));
myself.DeleteItem1(talker, 1174, 1);
myself.GiveItem1(talker, 1165, 1);

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 402) == 1 && gg.OwnItemCount(talker, 1165) > 0) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "levian_q0402_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 4) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "levian_q0340_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 5) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "levian_q0340_03.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 6) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 4258, gg.OwnItemCount(talker, 4258));
myself.SetMemoState(talker, 340, 7);
myself.SetFlagJournal(talker, 340, 7);
myself.ShowQuestMark(talker, 340);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "levian_q0340_04.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 7) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "levian_q0340_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 402) {
myself.SetCurrentQuestID(402);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 402) {
if (reply = 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "levian_q0402_02.htm");
myself.GiveItem1(talker, 1174, 1);

}

}

}
if (ask == 340) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 340) {
if (reply == 1) {
myself.SetMemoState(talker, 340, 5);
myself.SetFlagJournal(talker, 340, 5);
myself.ShowQuestMark(talker, 340);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "levian_q0340_02.htm");

}

}
super;
	}


}