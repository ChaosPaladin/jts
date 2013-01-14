package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_desmond extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 372) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Legacy of Insolence (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 372) == 1) {
myself.SetCurrentQuestID(372);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 5972) < 1 || gg.OwnItemCount(talker, 5973) < 1 || gg.OwnItemCount(talker, 5974) < 1 || gg.OwnItemCount(talker, 5975) < 1 || gg.OwnItemCount(talker, 5976) < 1 || gg.OwnItemCount(talker, 5977) < 1 || gg.OwnItemCount(talker, 5978) < 1) {
myself.ShowPage(talker, "magister_desmond_q0372_01.htm");

} else if (gg.OwnItemCount(talker, 5972) >= 1 && gg.OwnItemCount(talker, 5973) >= 1 && gg.OwnItemCount(talker, 5974) >= 1 && gg.OwnItemCount(talker, 5975) >= 1 && gg.OwnItemCount(talker, 5976) >= 1 && gg.OwnItemCount(talker, 5977) >= 1 && gg.OwnItemCount(talker, 5978) >= 1) {
myself.DeleteItem1(talker, 5972, 1);
myself.DeleteItem1(talker, 5973, 1);
myself.DeleteItem1(talker, 5974, 1);
myself.DeleteItem1(talker, 5975, 1);
myself.DeleteItem1(talker, 5976, 1);
myself.DeleteItem1(talker, 5977, 1);
myself.DeleteItem1(talker, 5978, 1);
gg.AddLog(3, talker, 372);
i1 = gg.Rand(100);
if (i1 < 31) {
myself.GiveItem1(talker, 5503, 1);

} else if (i1 < 62) {
myself.GiveItem1(talker, 5515, 1);

} else if (i1 < 75) {
myself.GiveItem1(talker, 5528, 1);

} else if (i1 < 83) {
myself.GiveItem1(talker, 5503, 1);
myself.GiveItem1(talker, 5515, 1);
myself.GiveItem1(talker, 5528, 1);

} else if (i1 < 100) {
myself.GiveItem1(talker, 57, 4000);

}
myself.ShowPage(talker, "magister_desmond_q0372_02.htm");

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