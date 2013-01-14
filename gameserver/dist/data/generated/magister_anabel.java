package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_anabel extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 29) == 1 && gg.OwnItemCount(talker, 7627) >= 1 && myself.GetOneTimeQuestFlag(talker, 29) == 0 && gg.GetMemoState(talker, 29) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Chest caught with a Bait of Earth (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 29) == 1 && gg.OwnItemCount(talker, 7627) >= 1 && myself.GetOneTimeQuestFlag(talker, 29) == 0 && gg.GetMemoState(talker, 29) == 2 * 10 + 1) {
myself.SetCurrentQuestID(29);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 29, 2);
myself.ShowPage(talker, "magister_anabel_q0029_0201.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 29) {
myself.SetCurrentQuestID(29);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 29 && myself.GetOneTimeQuestFlag(talker, 29) == 0) {
i0 = myself.GetHTMLCookie(talker, 29, 3 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 29) == 1 && myself.GetOneTimeQuestFlag(talker, 29) == 0) {
if (gg.OwnItemCount(talker, 7627) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7627, 1);
myself.GiveItem1(talker, 2455, 1);

}
gg.AddLog(2, talker, 29);
myself.RemoveMemo(talker, 29);
myself.SetOneTimeQuestFlag(talker, 29, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "magister_anabel_q0029_0301.htm");

} else {
myself.ShowPage(talker, "magister_anabel_q0029_0302.htm");

}

}

}

}
super;
	}


}