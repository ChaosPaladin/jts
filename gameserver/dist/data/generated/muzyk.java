package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class muzyk extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 38 && gg.HaveMemo(talker, 431) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Wedding March");

}
if (talker.level < 38 && gg.HaveMemo(talker, 431) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Wedding March");

}
if (gg.HaveMemo(talker, 431) == 1 && gg.GetMemoState(talker, 431) >= 1 * 10 + 1 && gg.GetMemoState(talker, 431) <= 1 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Wedding March (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 4 * 10 + 1 && talker.subjob_id != 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 4 * 10 + 1 && talker.subjob_id == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) <= 5 * 10 + 2 && gg.GetMemoState(talker, 241) >= 5 * 10 + 1 && talker.subjob_id != 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) <= 5 * 10 + 2 && gg.GetMemoState(talker, 241) >= 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 38 && gg.HaveMemo(talker, 431) == 0) {
myself.SetCurrentQuestID(431);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "muzyk_q0431_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 431);
myself.ShowQuestFHTML(talker, fhtml0, 431);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 38 && gg.HaveMemo(talker, 431) == 0) {
myself.SetCurrentQuestID(431);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "muzyk_q0431_0103.htm", 431);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 431) == 1 && gg.GetMemoState(talker, 431) >= 1 * 10 + 1 && gg.GetMemoState(talker, 431) <= 1 * 10 + 2) {
myself.SetCurrentQuestID(431);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 431) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7540) >= 50) {
myself.SetHTMLCookie(talker, 431, 1);
myself.ShowPage(talker, "muzyk_q0431_0105.htm");

} else {
myself.ShowPage(talker, "muzyk_q0431_0106.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 4 * 10 + 1 && talker.subjob_id != 0) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 241, 4);
myself.ShowPage(talker, "muzyk_q0241_0401.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 4 * 10 + 1 && talker.subjob_id == 0) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quest_not_subclass001.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) <= 5 * 10 + 2 && gg.GetMemoState(talker, 241) >= 5 * 10 + 1 && talker.subjob_id != 0) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 241) == 5 * 10 + 2 && gg.OwnItemCount(talker, 7597) >= 10) {
myself.SetHTMLCookie(talker, 241, 5);
myself.ShowPage(talker, "muzyk_q0241_0502.htm");

} else {
myself.ShowPage(talker, "muzyk_q0241_0503.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) <= 5 * 10 + 2 && gg.GetMemoState(talker, 241) >= 5 * 10 + 1) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quest_not_subclass001.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 6 * 10 + 1) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "muzyk_q0241_0603.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 6 * 10 + 1) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quest_not_subclass001.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 431) {
myself.SetCurrentQuestID(431);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 431);
myself.ShowQuestMark(talker, 431);
myself.SetMemoState(talker, 431, 1 * 10 + 1);
gg.AddLog(1, talker, 431);
myself.SetFlagJournal(talker, 431, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "muzyk_q0431_0104.htm", 431);

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
myself.ShowPage(talker, "muzyk_q0362_01.htm");

}

} else if (gg.OwnItemCount(talker, 4410) && gg.OwnItemCount(talker, 57) < 200) {
myself.ShowPage(talker, "muzyk_q0362_02.htm");

} else if (gg.OwnItemCount(talker, 4410) == 0) {
myself.ShowPage(talker, "muzyk_q0362_03.htm");

}

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 4409) && gg.OwnItemCount(talker, 57) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4412, 1);
myself.DeleteItem1(talker, 57, 200);
myself.ShowPage(talker, "muzyk_q0362_04.htm");

}

} else if (gg.OwnItemCount(talker, 4409) && gg.OwnItemCount(talker, 57) < 200) {
myself.ShowPage(talker, "muzyk_q0362_05.htm");

} else if (gg.OwnItemCount(talker, 4409) == 0) {
myself.ShowPage(talker, "muzyk_q0362_06.htm");

}

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 4408) && gg.OwnItemCount(talker, 57) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4413, 1);
myself.DeleteItem1(talker, 57, 200);
myself.ShowPage(talker, "muzyk_q0362_07.htm");

}

} else if (gg.OwnItemCount(talker, 4408) && gg.OwnItemCount(talker, 57) < 200) {
myself.ShowPage(talker, "muzyk_q0362_08.htm");

} else if (gg.OwnItemCount(talker, 4408) == 0) {
myself.ShowPage(talker, "muzyk_q0362_09.htm");

}

}
if (reply == 4) {
if (gg.OwnItemCount(talker, 4420) && gg.OwnItemCount(talker, 57) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4414, 1);
myself.DeleteItem1(talker, 57, 200);
myself.ShowPage(talker, "muzyk_q0362_10.htm");

}

} else if (gg.OwnItemCount(talker, 4420) && gg.OwnItemCount(talker, 57) < 200) {
myself.ShowPage(talker, "muzyk_q0362_11.htm");

} else if (gg.OwnItemCount(talker, 4420) == 0) {
myself.ShowPage(talker, "muzyk_q0362_12.htm");

}

}
if (reply == 5) {
if (gg.OwnItemCount(talker, 4421) && gg.OwnItemCount(talker, 57) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4415, 1);
myself.DeleteItem1(talker, 57, 200);
myself.ShowPage(talker, "muzyk_q0362_13.htm");

}

} else if (gg.OwnItemCount(talker, 4421) && gg.OwnItemCount(talker, 57) < 200) {
myself.ShowPage(talker, "muzyk_q0362_14.htm");

} else if (gg.OwnItemCount(talker, 4421) == 0) {
myself.ShowPage(talker, "muzyk_q0362_15.htm");

}

}
if (reply == 6) {
if (gg.OwnItemCount(talker, 4419) && gg.OwnItemCount(talker, 57) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4417, 1);
myself.DeleteItem1(talker, 57, 200);
myself.ShowPage(talker, "muzyk_q0362_16.htm");

}

} else if (gg.OwnItemCount(talker, 4419) && gg.OwnItemCount(talker, 57) < 200) {
myself.ShowPage(talker, "muzyk_q0362_02.htm");

} else if (gg.OwnItemCount(talker, 4419) == 0) {
myself.ShowPage(talker, "muzyk_q0362_03.htm");

}

}
if (reply == 7) {
if (gg.OwnItemCount(talker, 4418) && gg.OwnItemCount(talker, 57) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4416, 1);
myself.DeleteItem1(talker, 57, 200);
myself.ShowPage(talker, "muzyk_q0362_17.htm");

}

} else if (gg.OwnItemCount(talker, 4418) && gg.OwnItemCount(talker, 57) < 200) {
myself.ShowPage(talker, "muzyk_q0362_02.htm");

} else if (gg.OwnItemCount(talker, 4418) == 0) {
myself.ShowPage(talker, "muzyk_q0362_03.htm");

}

}

}
if (ask == 431) {
myself.SetCurrentQuestID(431);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 431) {
i0 = myself.GetHTMLCookie(talker, 431, 2 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 431) == 1) {
if (gg.OwnItemCount(talker, 7540) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7540, gg.OwnItemCount(talker, 7540));
myself.GiveItem1(talker, 7062, 25);

}
gg.AddLog(2, talker, 431);
gg.AddLog(3, talker, 431);
myself.RemoveMemo(talker, 431);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "muzyk_q0431_0201.htm");

} else {
myself.ShowPage(talker, "muzyk_q0431_0202.htm");

}

}

}

}
if (ask == 241) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 241) {
i0 = myself.GetHTMLCookie(talker, 241, 5 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 241) == 1 && talker.subjob_id != 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "muzyk_q0241_0501.htm");
myself.SetMemoState(talker, 241, 5 * 10 + 1);
myself.SetFlagJournal(talker, 241, 6);
myself.ShowQuestMark(talker, 241);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 241) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 241) {
i0 = myself.GetHTMLCookie(talker, 241, 6 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 241) == 1 && talker.subjob_id != 0) {
if (gg.OwnItemCount(talker, 7597) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7597, 10);
myself.GiveItem1(talker, 7589, 1);
myself.ShowPage(talker, "muzyk_q0241_0601.htm");
myself.SetMemoState(talker, 241, 6 * 10 + 1);
myself.SetFlagJournal(talker, 241, 8);
myself.ShowQuestMark(talker, 241);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "muzyk_q0241_0602.htm");

}

}

}

}
super;
	}


}