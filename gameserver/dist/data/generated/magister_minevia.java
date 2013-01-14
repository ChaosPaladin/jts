package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_minevia extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 10278) == 1 && gg.GetMemoState(talker, 10278) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Mutated Kaneus - Heine (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10278) == 1 && gg.GetMemoState(talker, 10278) == 1) {
myself.SetCurrentQuestID(10278);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13834) >= 1 && gg.OwnItemCount(talker, 13835) >= 1) {
myself.ShowPage(talker, "magister_minevia_q10278_02.htm");

} else {
myself.ShowPage(talker, "magister_minevia_q10278_01.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 10278) {
myself.SetCurrentQuestID(10278);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10278) {
if (reply == 1) {
if (gg.HaveMemo(talker, 10278) == 1 && gg.GetMemoState(talker, 10278) == 1) {
if (gg.OwnItemCount(talker, 13834) >= 1 && gg.OwnItemCount(talker, 13835) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 50000);
myself.DeleteItem1(talker, 13834, gg.OwnItemCount(talker, 13834));
myself.DeleteItem1(talker, 13835, gg.OwnItemCount(talker, 13835));
myself.RemoveMemo(talker, 10278);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 10278);
gg.AddLog(3, talker, 10278);
myself.ShowPage(talker, "magister_minevia_q10278_03.htm");
myself.SetOneTimeQuestFlag(talker, 10278, 1);

}

}

}

}

}
super;
	}


}