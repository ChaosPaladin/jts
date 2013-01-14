package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class karta extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 106)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Forgotten Truth (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 106)) {
myself.SetCurrentQuestID(106);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 984)) {
myself.ShowPage(talker, "karta_q0106_01.htm");
myself.DeleteItem1(talker, 984, 1);
myself.GiveItem1(talker, 985, 1);
myself.SetFlagJournal(talker, 106, 2);
myself.ShowQuestMark(talker, 106);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(talker, 985) && gg.OwnItemCount(talker, 986) == 0 || gg.OwnItemCount(talker, 987) == 0) {
myself.ShowPage(talker, "karta_q0106_02.htm");

} else if (gg.OwnItemCount(talker, 986) && gg.OwnItemCount(talker, 987)) {
myself.ShowPage(talker, "karta_q0106_03.htm");
myself.DeleteItem1(talker, 985, gg.OwnItemCount(talker, 985));
myself.DeleteItem1(talker, 986, 1);
myself.DeleteItem1(talker, 987, 1);
myself.GiveItem1(talker, 988, 1);
myself.SetFlagJournal(talker, 106, 4);
myself.ShowQuestMark(talker, 106);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(talker, 988)) {
myself.ShowPage(talker, "karta_q0106_04.htm");

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