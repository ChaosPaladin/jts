package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class muzyko extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 31 && gg.HaveMemo(talker, 432) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Birthday Party Song");

}
if (talker.level < 31 && gg.HaveMemo(talker, 432) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Birthday Party Song");

}
if (gg.HaveMemo(talker, 432) == 1 && gg.GetMemoState(talker, 432) >= 1 * 10 + 1 && gg.GetMemoState(talker, 432) <= 1 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Birthday Party Song (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 31 && gg.HaveMemo(talker, 432) == 0) {
myself.SetCurrentQuestID(432);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "muzyko_q0432_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 432);
myself.ShowQuestFHTML(talker, fhtml0, 432);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 31 && gg.HaveMemo(talker, 432) == 0) {
myself.SetCurrentQuestID(432);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "muzyko_q0432_0103.htm", 432);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 432) == 1 && gg.GetMemoState(talker, 432) >= 1 * 10 + 1 && gg.GetMemoState(talker, 432) <= 1 * 10 + 2) {
myself.SetCurrentQuestID(432);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 432) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7541) >= 50) {
myself.SetHTMLCookie(talker, 432, 1);
myself.ShowPage(talker, "muzyko_q0432_0105.htm");

} else {
myself.ShowPage(talker, "muzyko_q0432_0106.htm");

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
if (quest_id == 432) {
myself.SetCurrentQuestID(432);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 432);
myself.ShowQuestMark(talker, 432);
myself.SetMemoState(talker, 432, 1 * 10 + 1);
gg.AddLog(1, talker, 432);
myself.SetFlagJournal(talker, 432, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "muzyko_q0432_0104.htm", 432);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 362) {
myself.SetCurrentQuestID(362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 362) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 4410) && gg.OwnItemCount(talker, 57) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4411, 1);
myself.DeleteItem1(talker, 57, 200);
myself.ShowPage(talker, "muzyko_q0362_01.htm");

}

} else if (gg.OwnItemCount(talker, 4410) && gg.OwnItemCount(talker, 57) < 200) {
myself.ShowPage(talker, "muzyko_q0362_02.htm");

} else if (gg.OwnItemCount(talker, 4410) == 0) {
myself.ShowPage(talker, "muzyko_q0362_03.htm");

}

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 4409) && gg.OwnItemCount(talker, 57) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4412, 1);
myself.DeleteItem1(talker, 57, 200);
myself.ShowPage(talker, "muzyko_q0362_04.htm");

}

} else if (gg.OwnItemCount(talker, 4409) && gg.OwnItemCount(talker, 57) < 200) {
myself.ShowPage(talker, "muzyko_q0362_05.htm");

} else if (gg.OwnItemCount(talker, 4409) == 0) {
myself.ShowPage(talker, "muzyko_q0362_06.htm");

}

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 4408) && gg.OwnItemCount(talker, 57) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4413, 1);
myself.DeleteItem1(talker, 57, 200);
myself.ShowPage(talker, "muzyko_q0362_07.htm");

}

} else if (gg.OwnItemCount(talker, 4408) && gg.OwnItemCount(talker, 57) < 200) {
myself.ShowPage(talker, "muzyko_q0362_08.htm");

} else if (gg.OwnItemCount(talker, 4408) == 0) {
myself.ShowPage(talker, "muzyko_q0362_09.htm");

}

}
if (reply == 4) {
if (gg.OwnItemCount(talker, 4420) && gg.OwnItemCount(talker, 57) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4414, 1);
myself.DeleteItem1(talker, 57, 200);
myself.ShowPage(talker, "muzyko_q0362_10.htm");

}

} else if (gg.OwnItemCount(talker, 4420) && gg.OwnItemCount(talker, 57) < 200) {
myself.ShowPage(talker, "muzyko_q0362_11.htm");

} else if (gg.OwnItemCount(talker, 4420) == 0) {
myself.ShowPage(talker, "muzyko_q0362_12.htm");

}

}
if (reply == 5) {
if (gg.OwnItemCount(talker, 4421) && gg.OwnItemCount(talker, 57) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4415, 1);
myself.DeleteItem1(talker, 57, 200);
myself.ShowPage(talker, "muzyko_q0362_13.htm");

}

} else if (gg.OwnItemCount(talker, 4421) && gg.OwnItemCount(talker, 57) < 200) {
myself.ShowPage(talker, "muzyko_q0362_14.htm");

} else if (gg.OwnItemCount(talker, 4421) == 0) {
myself.ShowPage(talker, "muzyko_q0362_15.htm");

}

}
if (reply == 6) {
if (gg.OwnItemCount(talker, 4419) && gg.OwnItemCount(talker, 57) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4417, 1);
myself.DeleteItem1(talker, 57, 200);
myself.ShowPage(talker, "muzyko_q0362_16.htm");

}

} else if (gg.OwnItemCount(talker, 4419) && gg.OwnItemCount(talker, 57) < 200) {
myself.ShowPage(talker, "muzyko_q0362_05.htm");

} else if (gg.OwnItemCount(talker, 4419) == 0) {
myself.ShowPage(talker, "muzyko_q0362_06.htm");

}

}
if (reply == 7) {
if (gg.OwnItemCount(talker, 4418) && gg.OwnItemCount(talker, 57) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4416, 1);
myself.DeleteItem1(talker, 57, 200);
myself.ShowPage(talker, "muzyko_q0362_17.htm");

}

} else if (gg.OwnItemCount(talker, 4418) && gg.OwnItemCount(talker, 57) < 200) {
myself.ShowPage(talker, "muzyko_q0362_05.htm");

} else if (gg.OwnItemCount(talker, 4418) == 0) {
myself.ShowPage(talker, "muzyko_q0362_06.htm");

}

}

}
if (ask == 432) {
myself.SetCurrentQuestID(432);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 432) {
i0 = myself.GetHTMLCookie(talker, 432, 2 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 432) == 1) {
if (gg.OwnItemCount(talker, 7541) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7541, gg.OwnItemCount(talker, 7541));
myself.GiveItem1(talker, 7061, 25);

}
gg.AddLog(2, talker, 432);
gg.AddLog(3, talker, 432);
myself.RemoveMemo(talker, 432);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "muzyko_q0432_0201.htm");

} else {
myself.ShowPage(talker, "muzyko_q0432_0202.htm");

}

}

}

}
super;
	}


}