package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_talbot extends mage_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 413) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Shillien Oracle (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 413) == 1) {
myself.SetCurrentQuestID(413);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1262) == 1) {
myself.ShowPage(talker, "magister_talbot_q0413_01.htm");

} else if (gg.OwnItemCount(talker, 1263) == 5 && gg.OwnItemCount(talker, 1264) == 0) {
myself.ShowPage(talker, "magister_talbot_q0413_03.htm");

} else if (gg.OwnItemCount(talker, 1264) > 0 && gg.OwnItemCount(talker, 1264) < 5) {
myself.ShowPage(talker, "magister_talbot_q0413_04.htm");

} else if (gg.OwnItemCount(talker, 1264) >= 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "magister_talbot_q0413_05.htm");
myself.DeleteItem1(talker, 1264, gg.OwnItemCount(talker, 1264));
myself.GiveItem1(talker, 1265, 1);
myself.GiveItem1(talker, 1266, 1);
myself.SetFlagJournal(talker, 413, 4);
myself.ShowQuestMark(talker, 413);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (gg.OwnItemCount(talker, 1266) + gg.OwnItemCount(talker, 1267) + gg.OwnItemCount(talker, 1268) > 0) {
myself.ShowPage(talker, "magister_talbot_q0413_06.htm");

} else if (gg.OwnItemCount(talker, 1269) == 1 && gg.OwnItemCount(talker, 1265) == 1) {
myself.ShowPage(talker, "magister_talbot_q0413_07.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 413) {
myself.SetCurrentQuestID(413);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 413) {
if (reply == 1 && gg.OwnItemCount(talker, 1262) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "magister_talbot_q0413_02.htm");
myself.DeleteItem1(talker, 1262, 1);
myself.GiveItem1(talker, 1263, 5);
myself.SetFlagJournal(talker, 413, 2);
myself.ShowQuestMark(talker, 413);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}