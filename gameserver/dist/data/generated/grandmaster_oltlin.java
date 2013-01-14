package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class grandmaster_oltlin extends master_lv3_de {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 358) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Illegitimate Child of the Goddess");

}
if (gg.HaveMemo(talker, 358) == 1 && gg.OwnItemCount(talker, 5868) < 108) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Illegitimate Child of the Goddess (In Progress)");

}
if (gg.HaveMemo(talker, 358) == 1 && gg.OwnItemCount(talker, 5868) >= 108) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Illegitimate Child of the Goddess (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 358) == 0) {
myself.SetCurrentQuestID(358);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 63) {
myself.ShowPage(talker, "grandmaster_oltlin_q0358_01.htm");

} else if (talker.level >= 63) {
myself.ShowQuestPage(talker, "grandmaster_oltlin_q0358_02.htm", 358);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 358) == 1 && gg.OwnItemCount(talker, 5868) < 108) {
myself.SetCurrentQuestID(358);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmaster_oltlin_q0358_06.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 358) == 1 && gg.OwnItemCount(talker, 5868) >= 108) {
myself.SetCurrentQuestID(358);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.Rand(1000);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (i0 < 125) {
myself.GiveItem1(talker, 6331, 1);

} else if (i0 < 250) {
myself.GiveItem1(talker, 6337, 1);

} else if (i0 < 375) {
myself.GiveItem1(talker, 6329, 1);

} else if (i0 < 500) {
myself.GiveItem1(talker, 6335, 1);

} else if (i0 < 625) {
myself.GiveItem1(talker, 6333, 1);

} else if (i0 < 750) {
myself.GiveItem1(talker, 6339, 1);

} else if (i0 < 875) {
myself.GiveItem1(talker, 5366, 1);

} else {
myself.GiveItem1(talker, 5364, 1);

}
myself.DeleteItem1(talker, 5868, gg.OwnItemCount(talker, 5868));
myself.RemoveMemo(talker, 358);
gg.AddLog(2, talker, 358);
gg.AddLog(3, talker, 358);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "grandmaster_oltlin_q0358_07.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 358) {
myself.SetCurrentQuestID(358);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 358);
gg.AddLog(1, talker, 358);
myself.SetFlagJournal(talker, 358, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "grandmaster_oltlin_q0358_05.htm", 358);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 358) {
myself.SetCurrentQuestID(358);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 358) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "grandmaster_oltlin_q0358_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 358);
myself.ShowQuestFHTML(talker, fhtml0, 358);

}

}
super;
	}


}