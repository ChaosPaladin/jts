package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kalinta extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 410) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Palus Knight (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 410) == 1) {
myself.SetCurrentQuestID(410);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1239)) {
myself.ShowPage(talker, "kalinta_q0410_01.htm");

} else if (gg.OwnItemCount(talker, 1240) && gg.OwnItemCount(talker, 1242) == 0 && gg.OwnItemCount(talker, 1241) == 0) {
myself.ShowPage(talker, "kalinta_q0410_03.htm");

} else if (gg.OwnItemCount(talker, 1240) && gg.OwnItemCount(talker, 1242) == 0 && gg.OwnItemCount(talker, 1241) > 0) {
myself.ShowPage(talker, "kalinta_q0410_04.htm");

} else if (gg.OwnItemCount(talker, 1240) && gg.OwnItemCount(talker, 1242) >= 5 && gg.OwnItemCount(talker, 1241) > 0) {
myself.ShowPage(talker, "kalinta_q0410_05.htm");

} else if (gg.OwnItemCount(talker, 1240) && gg.OwnItemCount(talker, 1242) > 0 && gg.OwnItemCount(talker, 1241) >= 0) {
myself.ShowPage(talker, "kalinta_q0410_04.htm");

} else if (gg.OwnItemCount(talker, 1243)) {
myself.ShowPage(talker, "kalinta_q0410_06.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 410) {
myself.SetCurrentQuestID(410);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 410) {
if (reply == 1 && gg.OwnItemCount(talker, 1239) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "kalinta_q0410_02.htm");
myself.DeleteItem1(talker, 1239, 1);
myself.GiveItem1(talker, 1240, 1);
myself.SetFlagJournal(talker, 410, 4);
myself.ShowQuestMark(talker, 410);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (reply == 2 && gg.OwnItemCount(talker, 1240) > 0 && gg.OwnItemCount(talker, 1242) > 0 && gg.OwnItemCount(talker, 1241) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "kalinta_q0410_06.htm");
myself.DeleteItem1(talker, 1240, 1);
myself.DeleteItem1(talker, 1242, gg.OwnItemCount(talker, 1242));
myself.DeleteItem1(talker, 1241, gg.OwnItemCount(talker, 1241));
myself.GiveItem1(talker, 1243, 1);
myself.SetFlagJournal(talker, 410, 6);
myself.ShowQuestMark(talker, 410);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}