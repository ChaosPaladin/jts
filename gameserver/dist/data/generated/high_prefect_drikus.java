package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class high_prefect_drikus extends orc_lv2_master {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 44) == 1 && gg.OwnItemCount(talker, 7553) >= 1 && gg.GetMemoState(talker, 44) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Help the Son! (In Progress)");

}
if (gg.HaveMemo(talker, 44) == 1 && gg.GetMemoState(talker, 44) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Help the Son! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 44) == 1 && gg.OwnItemCount(talker, 7553) >= 1 && gg.GetMemoState(talker, 44) == 3 * 10 + 1) {
myself.SetCurrentQuestID(44);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 44, 3);
myself.ShowPage(talker, "high_prefect_drikus_q0044_0301.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 44) == 1 && gg.GetMemoState(talker, 44) == 4 * 10 + 1) {
myself.SetCurrentQuestID(44);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "high_prefect_drikus_q0044_0403.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 44) {
myself.SetCurrentQuestID(44);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 44) {
i0 = myself.GetHTMLCookie(talker, 44, 4 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 44) == 1) {
if (gg.OwnItemCount(talker, 7553) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7553, 1);
myself.ShowPage(talker, "high_prefect_drikus_q0044_0401.htm");
myself.SetMemoState(talker, 44, 4 * 10 + 1);
myself.SetFlagJournal(talker, 44, 5);
myself.ShowQuestMark(talker, 44);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "high_prefect_drikus_q0044_0402.htm");

}

}

}

}
super;
	}


}