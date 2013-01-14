package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class enter_necropolis2 extends ssq_npc_ss_teleporter {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 385) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Yoke of the Past");

}
if (gg.HaveMemo(talker, 385) == 1 && gg.OwnItemCount(talker, 5902) < 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Yoke of the Past (In Progress)");

}
if (gg.HaveMemo(talker, 385) == 1 && gg.OwnItemCount(talker, 5902) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Yoke of the Past (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 385) == 0) {
myself.SetCurrentQuestID(385);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 20) {
myself.ShowQuestPage(talker, "enter_necropolis1_q0385_01.htm", 385);

} else if (talker.level < 20) {
myself.ShowQuestPage(talker, "enter_necropolis1_q0385_02.htm", 385);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 385) == 1 && gg.OwnItemCount(talker, 5902) < 1) {
myself.SetCurrentQuestID(385);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "enter_necropolis1_q0385_08.htm", 385);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 385) == 1 && gg.OwnItemCount(talker, 5902) >= 1) {
myself.SetCurrentQuestID(385);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 5965, gg.OwnItemCount(talker, 5902));
myself.DeleteItem1(talker, 5902, gg.OwnItemCount(talker, 5902));
gg.AddLog(3, talker, 385);
myself.ShowQuestPage(talker, "enter_necropolis1_q0385_09.htm", 385);

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 385) {
myself.SetCurrentQuestID(385);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
gg.AddLog(1, talker, 385);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "enter_necropolis1_q0385_05.htm", 385);

}
return;

}
if (quest_id == 635) {
myself.SetCurrentQuestID(635);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.GetMemoStateEx(talker, 255, 1);
i1 = i0 % 100;
if (i1 >= 95 || i1 < 0) {
i1 = 0;

}
i2 = talker.level / 10;
if (i2 < 7) {
i3 = i2 * i2 * 500;

} else {
i3 = 7 * 7 * 500;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 635) == 0) {
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 57) >= i3) {
myself.SetMemoState(talker, 635, 0);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SetMemoStateEx(talker, 255, 1, i1 + 230000);
myself.InstantTeleport(talker, -114796, -179334, -6752);
gg.AddLog(1, talker, quest_id);
myself.ShowPage(talker, "enter_necropolis1_q0635_10.htm");
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.DeleteItem1(talker, 57, i3);

} else {
myself.ShowPage(talker, "enter_necropolis1_q0635_11.htm");

}

}

} else if (gg.HaveMemo(talker, 635) == 1) {
if (gg.OwnItemCount(talker, 57) >= i3) {
myself.SetMemoState(talker, 635, 0);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SetMemoStateEx(talker, 255, 1, i1 + 230000);
myself.InstantTeleport(talker, -114796, -179334, -6752);
gg.AddLog(1, talker, quest_id);
myself.ShowPage(talker, "enter_necropolis1_q0635_10.htm");
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.DeleteItem1(talker, 57, i3);

} else {
myself.ShowPage(talker, "enter_necropolis1_q0635_11.htm");

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam c0, HandlerParam c1, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam reply, HandlerParam talker) {
if (ask == 385) {
myself.SetCurrentQuestID(385);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 385) {
if (reply == 1) {
myself.ShowQuestPage(talker, "enter_necropolis1_q0385_03.htm", 385);

}
if (reply == 2) {
myself.FHTML_SetFileName(fhtml0, "enter_necropolis1_q0385_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 385);
myself.ShowQuestFHTML(talker, fhtml0, 385);

}
if (reply == 3) {
myself.FHTML_SetFileName(fhtml0, "enter_necropolis1_q0385_07.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 385);
myself.ShowQuestFHTML(talker, fhtml0, 385);

}
if (reply == 4) {
myself.ShowQuestPage(talker, "enter_necropolis1_q0385_06.htm", 385);

}
if (reply == 5) {
myself.RemoveMemo(talker, 385);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 385);
myself.ShowQuestPage(talker, "enter_necropolis1_q0385_10.htm", 385);

}
if (reply == 6) {
myself.ShowQuestPage(talker, "enter_necropolis1_q0385_11.htm", 385);

}

}
if (ask == 635) {
myself.SetCurrentQuestID(635);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 635) {
if (reply == 1) {
if (gg.HaveMemo(talker, 635) == 0) {
if (myself.GetMemoCount(talker) > 41 - 1) {
myself.ShowPage(talker, "fullquest.htm");

} else if (talker.level >= 20) {
if (gg.OwnItemCount(talker, 7079) >= 1) {
i0 = talker.level / 10;
if (i0 >= 8) {
i0 = 7;

}
i1 = i0 * i0 * 500;
if (gg.OwnItemCount(talker, 57) >= i1) {
myself.FHTML_SetFileName(fhtml0, "enter_necropolis1_q0635_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 635);
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, "enter_necropolis1_q0635_05.htm");

}

} else {
myself.ShowPage(talker, "enter_necropolis1_q0635_03.htm");

}

} else {
myself.ShowPage(talker, "enter_necropolis1_q0635_02.htm");

}

} else if (gg.HaveMemo(talker, 635) == 1) {
if (talker.level >= 20) {
if (gg.OwnItemCount(talker, 7079) >= 1) {
i0 = talker.level / 10;
if (i0 >= 8) {
i0 = 7;

}
i1 = i0 * i0 * 500;
if (gg.OwnItemCount(talker, 57) >= i1) {
myself.FHTML_SetFileName(fhtml0, "enter_necropolis1_q0635_08.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 635);
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, "enter_necropolis1_q0635_09.htm");

}

} else {
myself.ShowPage(talker, "enter_necropolis1_q0635_07.htm");

}

} else {
myself.ShowPage(talker, "enter_necropolis1_q0635_06.htm");

}

}

}

}
super;
	}


}