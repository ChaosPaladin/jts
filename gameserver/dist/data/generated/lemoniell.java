package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lemoniell extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 405) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Cleric (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 405) == 1) {
myself.SetCurrentQuestID(405);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1192) == 0) {
myself.ShowPage(talker, "lemoniell_q0405_02.htm");

} else if (gg.OwnItemCount(talker, 1192) == 1 && gg.OwnItemCount(talker, 1193) == 0 && gg.OwnItemCount(talker, 1200) == 0 && gg.OwnItemCount(talker, 1197) == 0) {
myself.ShowPage(talker, "lemoniell_q0405_01.htm");
myself.GiveItem1(talker, 1193, 1);
myself.SetFlagJournal(talker, 405, 4);
myself.ShowQuestMark(talker, 405);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(talker, 1192) == 1 && gg.OwnItemCount(talker, 1193) == 1 && gg.OwnItemCount(talker, 1200) == 0 && gg.OwnItemCount(talker, 1197) == 0) {
myself.ShowPage(talker, "lemoniell_q0405_03.htm");

} else if (gg.OwnItemCount(talker, 1192) == 1 && gg.OwnItemCount(talker, 1193) == 0 && gg.OwnItemCount(talker, 1200) == 0 && gg.OwnItemCount(talker, 1197) == 1) {
myself.ShowPage(talker, "lemoniell_q0405_04.htm");
myself.DeleteItem1(talker, 1197, 1);
myself.GiveItem1(talker, 1200, 1);
myself.SetFlagJournal(talker, 405, 6);
myself.ShowQuestMark(talker, 405);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(talker, 1192) == 1 && gg.OwnItemCount(talker, 1193) == 0 && gg.OwnItemCount(talker, 1200) == 1 && gg.OwnItemCount(talker, 1197) == 0) {
myself.ShowPage(talker, "lemoniell_q0405_05.htm");

}

}

}
break;

}

}
return;

}
super;
	}


}