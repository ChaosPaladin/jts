package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mint extends teleporter {
protected Object[][] Position = {
{"The Town of Gludio";-12787;122779;-3114;9200;1}, {"Dwarven Village";115120;-178224;-917;23000;0}, {"Talking Island Village";-84141;244623;-3729;23000;0}, {"Orc Village";-45158;-112583;-236;18000;0}, {"Kamael Village";-117251;46771;380;16000;0}, {"Elven Forest";21362;51122;-3688;710;0}, {"Elven Fortress";29294;74968;-3776;820;0}, {"Neutral Zone";-10612;75881;-3592;1700;0}
};
protected Object[][] PositionNoblessNeedItemField = {
{"Gludin Arena";-87328;142266;-3640;1;0}, {"Giran Arena";73579;142709;-3768;1;0}, {"The Center of the Neutral Zone";-18415;85624;-3680;1;0}, {"Coliseum";146440;46723;-3400;1;0}
};
protected Object[][] PositionNoblessNoItemField = {
{"Gludin Arena";-87328;142266;-3640;1000;0}, {"Giran Arena";73579;142709;-3768;1000;0}, {"The Center of the Neutral Zone";-18415;85624;-3680;1000;0}, {"Coliseum";146440;46723;-3400;1000;0}
};
protected Object[][] PositionNewbie = {
{"Dark Elf Village";9709;15566;-4500;1;0}, {"Dwarven Village";115120;-178224;-917;1;0}, {"Talking Island Village";-84141;244623;-3729;1;0}, {"Orc Village";-45158;-112583;-236;1;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 2) == 1 && myself.GetOneTimeQuestFlag(talker, 2) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "What Women Want (In Progress)");

}
if (talker.level >= 3 && gg.HaveMemo(talker, 7) == 0 && myself.GetOneTimeQuestFlag(talker, 7) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "A Trip Begins");

}
if (talker.level < 3 && gg.HaveMemo(talker, 7) == 0 && myself.GetOneTimeQuestFlag(talker, 7) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "A Trip Begins");

}
if (gg.HaveMemo(talker, 7) == 0 && myself.GetOneTimeQuestFlag(talker, 7) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "A Trip Begins (Done)");

}
if (gg.HaveMemo(talker, 7) == 1 && myself.GetOneTimeQuestFlag(talker, 7) == 0 && gg.GetMemoState(talker, 7) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "A Trip Begins (In Progress)");

}
if (gg.HaveMemo(talker, 7) == 1 && gg.GetMemoState(talker, 7) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "A Trip Begins (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 2) == 1 && myself.GetOneTimeQuestFlag(talker, 2) == 0) {
myself.SetCurrentQuestID(2);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1092)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "mint_q0002_01.htm");
myself.SetFlagJournal(talker, 2, 2);
myself.ShowQuestMark(talker, 2);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 1092, 1);
myself.GiveItem1(talker, 1093, 1);

}

} else if (gg.OwnItemCount(talker, 1093) || gg.OwnItemCount(talker, 1094) || gg.OwnItemCount(talker, 689) || gg.OwnItemCount(talker, 693)) {
myself.ShowPage(talker, "mint_q0002_02.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level >= 3 && gg.HaveMemo(talker, 7) == 0 && myself.GetOneTimeQuestFlag(talker, 7) == 0) {
myself.SetCurrentQuestID(7);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race == 1) {
myself.FHTML_SetFileName(fhtml0, "mint_q0007_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 7);
myself.ShowQuestFHTML(talker, fhtml0, 7);

} else {
myself.ShowPage(talker, "mint_q0007_0102.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || talker.level < 3 && gg.HaveMemo(talker, 7) == 0 && myself.GetOneTimeQuestFlag(talker, 7) == 0) {
myself.SetCurrentQuestID(7);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mint_q0007_0103.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 7) == 0 && myself.GetOneTimeQuestFlag(talker, 7) == 1) {
myself.SetCurrentQuestID(7);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 7) == 1 && myself.GetOneTimeQuestFlag(talker, 7) == 0 && gg.GetMemoState(talker, 7) == 1 * 10 + 1) {
myself.SetCurrentQuestID(7);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mint_q0007_0105.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 7) == 1 && gg.GetMemoState(talker, 7) == 3 * 10 + 1) {
myself.SetCurrentQuestID(7);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 7, 3);
myself.ShowPage(talker, "mint_q0007_0301.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 7) {
myself.SetCurrentQuestID(7);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 7);
myself.ShowQuestMark(talker, 7);
myself.SetMemoState(talker, 7, 1 * 10 + 1);
gg.AddLog(1, talker, 7);
myself.SetFlagJournal(talker, 7, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "mint_q0007_0104.htm", 7);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 7) {
myself.SetCurrentQuestID(7);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 7 && myself.GetOneTimeQuestFlag(talker, 7) == 0) {
i0 = myself.GetHTMLCookie(talker, 7, 4 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 7) == 1 && myself.GetOneTimeQuestFlag(talker, 7) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7559, 1);
myself.GiveItem1(talker, 7570, 1);

}
gg.AddLog(2, talker, 7);
myself.RemoveMemo(talker, 7);
myself.SetOneTimeQuestFlag(talker, 7, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "mint_q0007_0401.htm");

}

}

}
super;
	}


}