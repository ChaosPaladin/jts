package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mineral_trader_fundin extends merchant {
protected Object[][] SellList0 = {
{"spirit_ore";20;0.000000;0}, {"soul_ore";20;0.000000;0}, {"rope_of_magic_d";20;0.000000;0}, {"rope_of_magic_c";20;0.000000;0}, {"rope_of_magic_b";20;0.000000;0}, {"rope_of_magic_a";20;0.000000;0}, {"gemstone_d";20;0.000000;0}, {"gemstone_c";20;0.000000;0}, {"gemstone_b";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 74 && gg.HaveMemo(talker, 13) == 0 && myself.GetOneTimeQuestFlag(talker, 13) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Parcel Delivery");

}
if (talker.level < 74 && gg.HaveMemo(talker, 13) == 0 && myself.GetOneTimeQuestFlag(talker, 13) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Parcel Delivery");

}
if (gg.HaveMemo(talker, 13) == 0 && myself.GetOneTimeQuestFlag(talker, 13) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Parcel Delivery (Done)");

}
if (gg.HaveMemo(talker, 13) == 1 && myself.GetOneTimeQuestFlag(talker, 13) == 0 && gg.GetMemoState(talker, 13) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Parcel Delivery (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 74 && gg.HaveMemo(talker, 13) == 0 && myself.GetOneTimeQuestFlag(talker, 13) == 0) {
myself.SetCurrentQuestID(13);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "mineral_trader_fundin_q0013_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 13);
myself.ShowQuestFHTML(talker, fhtml0, 13);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 74 && gg.HaveMemo(talker, 13) == 0 && myself.GetOneTimeQuestFlag(talker, 13) == 0) {
myself.SetCurrentQuestID(13);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mineral_trader_fundin_q0013_0103.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 13) == 0 && myself.GetOneTimeQuestFlag(talker, 13) == 1) {
myself.SetCurrentQuestID(13);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 13) == 1 && myself.GetOneTimeQuestFlag(talker, 13) == 0 && gg.GetMemoState(talker, 13) == 1 * 10 + 1) {
myself.SetCurrentQuestID(13);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mineral_trader_fundin_q0013_0105.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 13) {
myself.SetCurrentQuestID(13);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 13);
myself.ShowQuestMark(talker, 13);
myself.SetMemoState(talker, 13, 1 * 10 + 1);
gg.AddLog(1, talker, 13);
myself.SetFlagJournal(talker, 13, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "mineral_trader_fundin_q0013_0104.htm", 13);
myself.GiveItem1(talker, 7263, 1);

}
return;

}
super;
	}


}