package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gatekeeper_tamil extends teleporter_need_item {
protected Object[][] Position = {
{"The Town of Gludio";-12787;122779;-3114;23000;1}, {"Town of Schuttgart";87126;-143520;-1288;13000;9}, {"Dark Elf Village";9709;15566;-4500;13000;0}, {"Dwarven Village";115120;-178224;-917;17000;0}, {"Talking Island Village";-84141;244623;-3729;35000;0}, {"Elven Village";46951;51550;-2976;18000;0}, {"Kamael Village";-117251;46771;380;17000;0}, {"Immortal Plateau, Southern Region";-4190;-80040;-2696;2000;0}, {"The Immortal Plateau";-10983;-117484;-2464;960;0}, {"Cave of Trials";9340;-112509;-2536;1500;0}, {"Frozen Waterfall";8652;-139941;-1144;1600;0}
};
protected Object[][] PositionNoblessNeedItemField = {
{"Gludin Arena";-87328;142266;-3640;1;0}, {"The Town of Giran";83396;147904;-3404;1;0}, {"Immortal Plateau, Northern Region";-25309;-131569;-680;1;0}, {"Coliseum";146440;46723;-3400;1;0}
};
protected Object[][] PositionNoblessNoItemField = {
{"Gludin Arena";-87328;142266;-3640;1000;0}, {"The Town of Giran";83396;147904;-3404;1000;0}, {"Immortal Plateau, Northern Region";-25309;-131569;-680;1000;0}, {"Coliseum";146440;46723;-3400;1000;0}
};
protected Object[][] PositionNewbie = {
{"Dark Elf Village";9709;15566;-4500;1;0}, {"Dwarven Village";115120;-178224;-917;1;0}, {"Talking Island Village";-84141;244623;-3729;1;0}, {"Elven Village";46951;51550;-2976;1;0}
};

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam quest_id) {
if (ask == 9) {
myself.SetCurrentQuestID(9);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 9 && myself.GetOneTimeQuestFlag(talker, 9) == 0) {
i0 = myself.GetHTMLCookie(talker, 9, 3 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 9) == 1 && myself.GetOneTimeQuestFlag(talker, 9) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7559, 1);
myself.GiveItem1(talker, 7570, 1);

}
gg.AddLog(2, talker, 9);
myself.RemoveMemo(talker, 9);
myself.SetOneTimeQuestFlag(talker, 9, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "gatekeeper_tamil_q0009_0301.htm");

}

}

}
if (ask == -6) {
if (gg.OwnItemCount(talker, ItemNeeded) != 0) {
myself.InstantTeleportWithItem(talker, -80684, 149770, -3043, ItemNeeded, 1);
return;

} else {
myself.ShowPage(talker, fnNoItem);

}

}
super;
	}

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 277) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Gatekeeper's Offering");

}
if (gg.HaveMemo(talker, 277) == 1 && gg.OwnItemCount(talker, 1572) < 20) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Gatekeeper's Offering (In Progress)");

}
if (gg.HaveMemo(talker, 277) == 1 && gg.OwnItemCount(talker, 1572) >= 20) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Gatekeeper's Offering (In Progress)");

}
if (gg.HaveMemo(talker, 9) == 1 && gg.GetMemoState(talker, 9) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Into the City of Humans (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 277) == 0) {
myself.SetCurrentQuestID(277);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "gatekeeper_tamil_q0277_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 277);
myself.ShowQuestFHTML(talker, fhtml0, 277);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 277) == 1 && gg.OwnItemCount(talker, 1572) < 20) {
myself.SetCurrentQuestID(277);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gatekeeper_tamil_q0277_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 277) == 1 && gg.OwnItemCount(talker, 1572) >= 20) {
myself.SetCurrentQuestID(277);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gatekeeper_tamil_q0277_05.htm");
myself.DeleteItem1(talker, 1572, gg.OwnItemCount(talker, 1572));
myself.GiveItem1(talker, 1658, 2);
myself.RemoveMemo(talker, 277);
gg.AddLog(2, talker, 277);
gg.AddLog(3, talker, 277);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 9) == 1 && gg.GetMemoState(talker, 9) == 2 * 10 + 1) {
myself.SetCurrentQuestID(9);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 9, 2);
myself.ShowPage(talker, "gatekeeper_tamil_q0009_0201.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 277) {
myself.SetCurrentQuestID(277);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 15) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "gatekeeper_tamil_q0277_03.htm", 277);
myself.SetMemo(talker, 277);
myself.ShowQuestMark(talker, 277);
myself.SetFlagJournal(talker, 277, 1);
gg.AddLog(1, talker, 277);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}

} else {
myself.ShowQuestPage(talker, "gatekeeper_tamil_q0277_01.htm", 277);

}
return;

}
super;
	}


}