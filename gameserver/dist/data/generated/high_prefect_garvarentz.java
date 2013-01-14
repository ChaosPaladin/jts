package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class high_prefect_garvarentz extends master_lv3_orc {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 344) == 1 && gg.OwnItemCount(talker, 4272) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "1000 Years, the End of Lamentation (In Progress)");

}
if (gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 7) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "1000 Years, the End of Lamentation (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 1 && gg.OwnItemCount(talker, 4272) >= 1) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 <= 47) {
myself.GiveItem1(talker, 1882, 70);

} else if (i0 <= 97) {
myself.GiveItem1(talker, 1881, 50);

} else {
myself.GiveItem1(talker, 191, 1);

}
myself.DeleteItem1(talker, 4272, gg.OwnItemCount(talker, 4272));
myself.SetMemoState(talker, 344, 7);
myself.ShowPage(talker, "high_prefect_garvarentz_q0344_01.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 7) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "high_prefect_garvarentz_q0344_02.htm");

}
break;

}

}
return;

}
super;
	}


}