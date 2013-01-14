package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mineral_trader_kiki extends merchant {
protected Object[][] SellList0 = {
{"spirit_ore";10;0.000000;0}, {"soul_ore";10;0.000000;0}, {"rope_of_magic_d";10;0.000000;0}, {"rope_of_magic_c";10;0.000000;0}, {"rope_of_magic_b";10;0.000000;0}, {"rope_of_magic_a";10;0.000000;0}, {"gemstone_d";10;0.000000;0}, {"gemstone_c";10;0.000000;0}, {"gemstone_b";10;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 28) == 1 && gg.OwnItemCount(talker, 7626) >= 1 && myself.GetOneTimeQuestFlag(talker, 28) == 0 && gg.GetMemoState(talker, 28) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Chest caught with a Bait of Icy Air (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 28) == 1 && gg.OwnItemCount(talker, 7626) >= 1 && myself.GetOneTimeQuestFlag(talker, 28) == 0 && gg.GetMemoState(talker, 28) == 2 * 10 + 1) {
myself.SetCurrentQuestID(28);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 28, 2);
myself.ShowPage(talker, "mineral_trader_kiki_q0028_0201.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 28) {
myself.SetCurrentQuestID(28);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 28 && myself.GetOneTimeQuestFlag(talker, 28) == 0) {
i0 = myself.GetHTMLCookie(talker, 28, 3 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 28) == 1 && myself.GetOneTimeQuestFlag(talker, 28) == 0) {
if (gg.OwnItemCount(talker, 7626) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7626, 1);
myself.GiveItem1(talker, 881, 1);

}
gg.AddLog(2, talker, 28);
myself.RemoveMemo(talker, 28);
myself.SetOneTimeQuestFlag(talker, 28, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "mineral_trader_kiki_q0028_0301.htm");

} else {
myself.ShowPage(talker, "mineral_trader_kiki_q0028_0302.htm");

}

}

}

}
super;
	}


}