package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_harant extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1153) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Deliver Supplies (In Progress)");

}
if (gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1154) + gg.OwnItemCount(talker, 1155) + gg.OwnItemCount(talker, 1156) > 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Deliver Supplies (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1153) == 1) {
myself.SetCurrentQuestID(168);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_harant_q0325_01.htm");
myself.DeleteItem1(talker, 1153, 1);
myself.GiveItem1(talker, 1154, 1);
myself.GiveItem1(talker, 1155, 1);
myself.GiveItem1(talker, 1156, 1);
myself.SetFlagJournal(talker, 168, 2);
myself.ShowQuestMark(talker, 168);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 168) == 1 && gg.OwnItemCount(talker, 1154) + gg.OwnItemCount(talker, 1155) + gg.OwnItemCount(talker, 1156) > 0) {
myself.SetCurrentQuestID(168);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_harant_q0325_02.htm");

}
break;

}

}
return;

}
super;
	}


}