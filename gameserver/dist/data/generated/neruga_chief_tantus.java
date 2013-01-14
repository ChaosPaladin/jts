package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class neruga_chief_tantus extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 275) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Dark Winged Spies");

}
if (gg.HaveMemo(talker, 275)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Dark Winged Spies (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) == 1 && gg.OwnItemCount(talker, 3406) == 0 && gg.OwnItemCount(talker, 3393) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3393) >= 1 && gg.OwnItemCount(talker, 3406) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3393) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3406) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the Lord (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 275) == 0) {
myself.SetCurrentQuestID(275);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 3) {
myself.ShowQuestPage(talker, "neruga_chief_tantus_q0275_00.htm", 275);

} else if (talker.level < 11) {
myself.ShowQuestPage(talker, "neruga_chief_tantus_q0275_01.htm", 275);

} else {
myself.FHTML_SetFileName(fhtml0, "neruga_chief_tantus_q0275_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 275);
myself.ShowQuestFHTML(talker, fhtml0, 275);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 275)) {
myself.SetCurrentQuestID(275);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1478) < 70) {
myself.ShowPage(talker, "neruga_chief_tantus_q0275_04.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "neruga_chief_tantus_q0275_05.htm");
myself.RemoveMemo(talker, 275);
gg.AddLog(2, talker, 275);
gg.AddLog(3, talker, 275);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1478) * 60);
myself.DeleteItem1(talker, 1478, gg.OwnItemCount(talker, 1478));
myself.DeleteItem1(talker, 1479, gg.OwnItemCount(talker, 1479));

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) == 1 && gg.OwnItemCount(talker, 3406) == 0 && gg.OwnItemCount(talker, 3393) == 0) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "neruga_chief_tantus_q0232_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3393) >= 1 && gg.OwnItemCount(talker, 3406) == 0) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1341) < 1000 || gg.OwnItemCount(talker, 3405) == 0) {
myself.ShowPage(talker, "neruga_chief_tantus_q0232_03.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "neruga_chief_tantus_q0232_04.htm");
myself.DeleteItem1(talker, 3405, gg.OwnItemCount(talker, 3405));
myself.DeleteItem1(talker, 1341, 1000);
myself.DeleteItem1(talker, 3393, 1);
myself.GiveItem1(talker, 3406, 1);
if (gg.OwnItemCount(talker, 3400) == 1 && gg.OwnItemCount(talker, 3404) == 1 && gg.OwnItemCount(talker, 3409) == 1 && gg.OwnItemCount(talker, 3411) == 1) {
myself.SetFlagJournal(talker, 232, 2);
myself.ShowQuestMark(talker, 232);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3393) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3406) >= 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "neruga_chief_tantus_q0232_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 275) {
myself.SetCurrentQuestID(275);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 275);
myself.ShowQuestMark(talker, 275);
gg.AddLog(1, talker, 275);
myself.SetFlagJournal(talker, 275, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "neruga_chief_tantus_q0275_03.htm", 275);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 232) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 232) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "neruga_chief_tantus_q0232_02.htm");
myself.GiveItem1(talker, 3393, 1);

}

}

}
super;
	}


}