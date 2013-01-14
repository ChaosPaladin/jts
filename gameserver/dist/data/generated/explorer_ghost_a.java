package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class explorer_ghost_a extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 619) == 0 && talker.level >= 74) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Relics of the Old Empire");

}
if (gg.HaveMemo(talker, 619) == 0 && talker.level < 74) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Relics of the Old Empire");

}
if (gg.HaveMemo(talker, 619) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Relics of the Old Empire (In Progress)");

}
if (gg.HaveMemo(talker, 14) == 1 && gg.OwnItemCount(talker, 7253) >= 1 && myself.GetOneTimeQuestFlag(talker, 14) == 0 && gg.GetMemoState(talker, 14) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Whereabouts of the Archaeologist (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 619) == 0 && talker.level >= 74) {
myself.SetCurrentQuestID(619);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "explorer_ghost_a_q0619_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 619);
myself.ShowQuestFHTML(talker, fhtml0, 619);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 619) == 0 && talker.level < 74) {
myself.SetCurrentQuestID(619);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "explorer_ghost_a_q0619_02.htm", 619);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 619) == 1) {
myself.SetCurrentQuestID(619);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7254) >= 1000 && gg.OwnItemCount(talker, 7075) >= 1) {
myself.ShowPage(talker, "explorer_ghost_a_q0619_04.htm");

}
if (gg.OwnItemCount(talker, 7254) >= 1000 && gg.OwnItemCount(talker, 7075) == 0) {
myself.ShowPage(talker, "explorer_ghost_a_q0619_05.htm");

}
if (gg.OwnItemCount(talker, 7254) < 1000 && gg.OwnItemCount(talker, 7075) >= 1) {
myself.ShowPage(talker, "explorer_ghost_a_q0619_06.htm");

}
if (gg.OwnItemCount(talker, 7254) < 1000 && gg.OwnItemCount(talker, 7075) == 0) {
myself.ShowPage(talker, "explorer_ghost_a_q0619_07.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 14) == 1 && gg.OwnItemCount(talker, 7253) >= 1 && myself.GetOneTimeQuestFlag(talker, 14) == 0 && gg.GetMemoState(talker, 14) == 1 * 10 + 1) {
myself.SetCurrentQuestID(14);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 14, 1);
myself.ShowPage(talker, "explorer_ghost_a_q0014_0101.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 619) {
myself.SetCurrentQuestID(619);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "explorer_ghost_a_q0619_03.htm", 619);
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 619) {
myself.SetCurrentQuestID(619);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 619) {
if (reply == 1) {
myself.ShowPage(talker, "explorer_ghost_a_q0619_08.htm");

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 7254) >= 1000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(10);
if (i0 == 0) {
myself.GiveItem1(talker, 6881, 1);

} else if (i0 == 1) {
myself.GiveItem1(talker, 6883, 1);

} else if (i0 == 2) {
myself.GiveItem1(talker, 6885, 1);

} else if (i0 == 3) {
myself.GiveItem1(talker, 6887, 1);

} else if (i0 == 4) {
myself.GiveItem1(talker, 7580, 1);

} else if (i0 == 5) {
myself.GiveItem1(talker, 6891, 1);

} else if (i0 == 6) {
myself.GiveItem1(talker, 6893, 1);

} else if (i0 == 7) {
myself.GiveItem1(talker, 6895, 1);

} else if (i0 == 8) {
myself.GiveItem1(talker, 6897, 1);

} else if (i0 == 9) {
myself.GiveItem1(talker, 6899, 1);

}
myself.DeleteItem1(talker, 7254, 1000);
myself.ShowPage(talker, "explorer_ghost_a_q0619_09.htm");
gg.AddLog(3, talker, 619);

}

}

}
if (reply == 4) {
myself.DeleteItem1(talker, 7254, gg.OwnItemCount(talker, 7254));
myself.RemoveMemo(talker, 619);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "explorer_ghost_a_q0619_10.htm");
gg.AddLog(2, talker, 619);

}

}
if (ask == 14) {
myself.SetCurrentQuestID(14);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 14 && myself.GetOneTimeQuestFlag(talker, 14) == 0) {
i0 = myself.GetHTMLCookie(talker, 14, 2 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 14) == 1 && myself.GetOneTimeQuestFlag(talker, 14) == 0) {
if (gg.OwnItemCount(talker, 7253) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7253, gg.OwnItemCount(talker, 7253));
myself.GiveItem1(talker, 57, 136928);
myself.IncrementParam(talker, 0, 325881);
myself.IncrementParam(talker, 1, 32524);

}
gg.AddLog(2, talker, 14);
myself.RemoveMemo(talker, 14);
myself.SetOneTimeQuestFlag(talker, 14, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "explorer_ghost_a_q0014_0201.htm");

} else {
myself.ShowPage(talker, "explorer_ghost_a_q0014_0202.htm");

}

}

}

}
super;
	}


}