package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blueprint_seller_shaling extends merchant {
protected Object[][] SellList0 = {
{"sb_summon_mechanic_golem1";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 27) == 1 && gg.OwnItemCount(talker, 7625) >= 1 && myself.GetOneTimeQuestFlag(talker, 27) == 0 && gg.GetMemoState(talker, 27) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Chest caught with a Bait of Wind (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 27) == 1 && gg.OwnItemCount(talker, 7625) >= 1 && myself.GetOneTimeQuestFlag(talker, 27) == 0 && gg.GetMemoState(talker, 27) == 2 * 10 + 1) {
myself.SetCurrentQuestID(27);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 27, 2);
myself.ShowPage(talker, "blueprint_seller_shaling_q0027_0201.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 27) {
myself.SetCurrentQuestID(27);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 27 && myself.GetOneTimeQuestFlag(talker, 27) == 0) {
i0 = myself.GetHTMLCookie(talker, 27, 3 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 27) == 1 && myself.GetOneTimeQuestFlag(talker, 27) == 0) {
if (gg.OwnItemCount(talker, 7625) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7625, 1);
myself.GiveItem1(talker, 880, 1);

}
gg.AddLog(2, talker, 27);
myself.RemoveMemo(talker, 27);
myself.SetOneTimeQuestFlag(talker, 27, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "blueprint_seller_shaling_q0027_0301.htm");

} else {
myself.ShowPage(talker, "blueprint_seller_shaling_q0027_0302.htm");

}

}

}

}
super;
	}


}