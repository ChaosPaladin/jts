package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class jasmine extends teleporter {
protected Object[][] Position = {
{"The Town of Gludio";-12787;122779;-3114;10000;1}, {"Dwarven Village";115120;-178224;-917;22000;0}, {"Talking Island Village";-84141;244623;-3729;24000;0}, {"Orc Village";-45158;-112583;-236;13000;0}, {"Kamael Village";-117251;46771;380;13000;0}, {"Dark Forest";-22224;14168;-3232;890;0}, {"Swampland";-21966;40544;-3192;1100;0}, {"Spider Nest";-61095;75104;-3383;3600;0}, {"Neutral Zone";-10612;75881;-3592;1700;0}
};
protected Object[][] PositionNoblessNeedItemField = {
{"Gludin Arena";-87328;142266;-3640;1;0}, {"Giran Arena";73579;142709;-3768;1;0}, {"The Center of the Neutral Zone";-18415;85624;-3680;1;0}, {"The Center of the Dark Forest";-14129;27094;-3680;1;0}, {"Center of the School of Dark Arts";-49185;49441;-5912;1;0}, {"Coliseum";146440;46723;-3400;1;0}
};
protected Object[][] PositionNoblessNoItemField = {
{"Gludin Arena";-87328;142266;-3640;1000;0}, {"Giran Arena";73579;142709;-3768;1000;0}, {"The Center of the Neutral Zone";-18415;85624;-3680;1000;0}, {"The Center of the Dark Forest";-14129;27094;-3680;1000;0}, {"Center of the School of Dark Arts";-49185;49441;-5912;1000;0}, {"Coliseum";146440;46723;-3400;1000;0}
};
protected Object[][] PositionNewbie = {
{"Dwarven Village";115120;-178224;-917;1;0}, {"Talking Island Village";-84141;244623;-3729;1;0}, {"Elven Village";46951;51550;-2976;1;0}, {"Orc Village";-45158;-112583;-236;1;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 3 && gg.HaveMemo(talker, 8) == 0 && myself.GetOneTimeQuestFlag(talker, 8) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "An Adventure Begins");

}
if (talker.level < 3 && gg.HaveMemo(talker, 8) == 0 && myself.GetOneTimeQuestFlag(talker, 8) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "An Adventure Begins");

}
if (gg.HaveMemo(talker, 8) == 0 && myself.GetOneTimeQuestFlag(talker, 8) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "An Adventure Begins (Done)");

}
if (gg.HaveMemo(talker, 8) == 1 && myself.GetOneTimeQuestFlag(talker, 8) == 0 && gg.GetMemoState(talker, 8) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "An Adventure Begins (In Progress)");

}
if (gg.HaveMemo(talker, 8) == 1 && gg.GetMemoState(talker, 8) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "An Adventure Begins (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 3 && gg.HaveMemo(talker, 8) == 0 && myself.GetOneTimeQuestFlag(talker, 8) == 0) {
myself.SetCurrentQuestID(8);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race == 2) {
myself.FHTML_SetFileName(fhtml0, "jasmine_q0008_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 8);
myself.ShowQuestFHTML(talker, fhtml0, 8);

} else {
myself.ShowPage(talker, "jasmine_q0008_0102.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 3 && gg.HaveMemo(talker, 8) == 0 && myself.GetOneTimeQuestFlag(talker, 8) == 0) {
myself.SetCurrentQuestID(8);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jasmine_q0008_0103.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 8) == 0 && myself.GetOneTimeQuestFlag(talker, 8) == 1) {
myself.SetCurrentQuestID(8);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 8) == 1 && myself.GetOneTimeQuestFlag(talker, 8) == 0 && gg.GetMemoState(talker, 8) == 1 * 10 + 1) {
myself.SetCurrentQuestID(8);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jasmine_q0008_0105.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 8) == 1 && gg.GetMemoState(talker, 8) == 3 * 10 + 1) {
myself.SetCurrentQuestID(8);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 8, 3);
myself.ShowPage(talker, "jasmine_q0008_0301.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 8) {
myself.SetCurrentQuestID(8);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 8);
myself.ShowQuestMark(talker, 8);
myself.SetMemoState(talker, 8, 1 * 10 + 1);
gg.AddLog(1, talker, 8);
myself.SetFlagJournal(talker, 8, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "jasmine_q0008_0104.htm", 8);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 8) {
myself.SetCurrentQuestID(8);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 8 && myself.GetOneTimeQuestFlag(talker, 8) == 0) {
i0 = myself.GetHTMLCookie(talker, 8, 4 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 8) == 1 && myself.GetOneTimeQuestFlag(talker, 8) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7559, 1);
myself.GiveItem1(talker, 7570, 1);

}
gg.AddLog(2, talker, 8);
myself.RemoveMemo(talker, 8);
myself.SetOneTimeQuestFlag(talker, 8, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "jasmine_q0008_0401.htm");

}

}

}
super;
	}


}