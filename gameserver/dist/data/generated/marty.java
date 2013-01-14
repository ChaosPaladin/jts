package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class marty extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam c0, HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (myself.IsMyLord(talker) == 0 && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path to Becoming a Lord - Oren (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || myself.IsMyLord(talker) == 0 && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.SetCurrentQuestID(712);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 712) == 1 && gg.GetMemoState(c0, 712) == 4) {
myself.ShowPage(talker, "marty_q0712_01.htm");

} else if (gg.HaveMemo(c0, 712) == 1 && gg.GetMemoState(c0, 712) == 5) {
myself.ShowPage(talker, "marty_q0712_03.htm");

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

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam c0, HandlerParam reply, HandlerParam talker) {
if (ask == 712) {
myself.SetCurrentQuestID(712);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 712) {
if (reply == 1 && myself.IsMyLord(talker) == 0 && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
c0 = myself.Pledge_GetLeader(talker);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 712) == 1 && gg.GetMemoState(c0, 712) == 4) {
myself.SetMemoState(c0, 712, 5);
myself.ShowPage(talker, "marty_q0712_02.htm");
myself.SetFlagJournal(c0, 712, 4);
myself.ShowQuestMark(c0, 712);
myself.SoundEffect(c0, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}