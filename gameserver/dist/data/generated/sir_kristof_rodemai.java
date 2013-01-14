package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sir_kristof_rodemai extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam pledge0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 501) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Proof of Clan Alliance");

}
if (gg.HaveMemo(talker, 501) == 1 && gg.GetMemoState(talker, 501) == 6 && gg.OwnItemCount(talker, 3873) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Proof of Clan Alliance (In Progress)");

}
if (gg.HaveMemo(talker, 501) == 1 && gg.GetMemoState(talker, 501) >= 1 && gg.OwnItemCount(talker, 3873) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Proof of Clan Alliance (In Progress)");

}
if (gg.HaveMemo(talker, 344) == 1 && gg.OwnItemCount(talker, 4270) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "1000 Years, the End of Lamentation (In Progress)");

}
if (gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 5) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "1000 Years, the End of Lamentation (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 501) == 0) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.is_pledge_master == 1) {
if (myself.GetMemoCount(talker) < 41) {
pledge0 = myself.GetPledge(talker);
if (gg.IsNull(pledge0) == 0) {
if (pledge0.skill_level < 3) {
myself.ShowPage(talker, "sir_kristof_rodemai_q0501_01.htm");

} else if (pledge0.skill_level == 3) {
if (gg.OwnItemCount(talker, 3874) == 1) {
myself.ShowPage(talker, "sir_kristof_rodemai_q0501_03.htm");

} else {
myself.ShowPage(talker, "sir_kristof_rodemai_q0501_04.htm");

}

} else {
myself.ShowPage(talker, "sir_kristof_rodemai_q0501_02.htm");

}

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

} else {
myself.ShowPage(talker, "sir_kristof_rodemai_q0501_05.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 501) == 1 && gg.GetMemoState(talker, 501) == 6 && gg.OwnItemCount(talker, 3873) == 1) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_kristof_rodemai_q0501_09.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 3873, gg.OwnItemCount(talker, 3873));
myself.GiveItem1(talker, 3874, 1);
myself.IncrementParam(talker, 1, 120000);
myself.RemoveMemo(talker, 501);
gg.AddLog(2, talker, 501);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 501) == 1 && gg.GetMemoState(talker, 501) >= 1 && gg.OwnItemCount(talker, 3873) == 0) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_kristof_rodemai_q0501_10.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 1 && gg.OwnItemCount(talker, 4270) >= 1) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 <= 39) {
myself.GiveItem1(talker, 1879, 55);

} else if (i0 <= 89) {
myself.GiveItem1(talker, 951, 1);

} else {
myself.GiveItem1(talker, 885, 1);

}
myself.DeleteItem1(talker, 4270, gg.OwnItemCount(talker, 4270));
myself.SetMemoState(talker, 344, 5);
myself.ShowPage(talker, "sir_kristof_rodemai_q0344_01.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 344) == 1 && gg.GetMemoState(talker, 344) == 5) {
myself.SetCurrentQuestID(344);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sir_kristof_rodemai_q0344_02.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 501) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowPage(talker, "sir_kristof_rodemai_q0501_07.htm");
gg.AddLog(1, talker, 501);
myself.SetMemoState(talker, 501, 1);
myself.SetJournal(talker, 501, 1);
myself.i_quest0 = 0;

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 501) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 501) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "sir_kristof_rodemai_q0501_06.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 501);
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 2) {
myself.ShowPage(talker, "sir_kristof_rodemai_q0501_08.htm");

}

}
super;
	}


}