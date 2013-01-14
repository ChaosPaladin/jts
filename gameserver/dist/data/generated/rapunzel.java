package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rapunzel extends teleporter {
protected Object[][] Position = {
{"The Village of Gludin";-80684;149770;-3043;18000;0}, {"Dark Elf Village";9709;15566;-4500;24000;0}, {"Dwarven Village";115120;-178224;-917;46000;0}, {"Elven Village";46951;51550;-2976;23000;0}, {"Orc Village";-45158;-112583;-236;35000;0}, {"Kamael Village";-117251;46771;380;20000;0}, {"Elven Ruins";-112367;234703;-3688;830;0}, {"Singing Waterfall";-111728;244330;-3448;770;0}, {"Talking Island, Northern Territory";-106696;214691;-3424;1000;0}, {"Obelisk of Victory";-99586;237637;-3568;470;0}
};
protected Object[][] PositionNoblessNeedItemField = {
{"Gludin Arena";-87328;142266;-3640;1;0}, {"Giran Arena";73579;142709;-3768;1;0}, {"Center of the Elven Ruins";49315;248452;-5960;1;0}, {"Coliseum";146440;46723;-3400;1;0}
};
protected Object[][] PositionNoblessNoItemField = {
{"Gludin Arena";-87328;142266;-3640;1000;0}, {"Giran Arena";73579;142709;-3768;1000;0}, {"Center of the Elven Ruins";49315;248452;-5960;1000;0}, {"Coliseum";146440;46723;-3400;1000;0}
};
protected Object[][] PositionNewbie = {
{"Dark Elf Village";9709;15566;-4500;1;0}, {"Dwarven Village";115120;-178224;-917;1;0}, {"Elven Village";46951;51550;-2976;1;0}, {"Orc Village";-45158;-112583;-236;1;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 1) && myself.GetOneTimeQuestFlag(talker, 1) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Letters of Love (In Progress)");

}
if (talker.level >= 3 && gg.HaveMemo(talker, 6) == 0 && myself.GetOneTimeQuestFlag(talker, 6) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Step Into the Future");

}
if (talker.level < 3 && gg.HaveMemo(talker, 6) == 0 && myself.GetOneTimeQuestFlag(talker, 6) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Step Into the Future");

}
if (gg.HaveMemo(talker, 6) == 0 && myself.GetOneTimeQuestFlag(talker, 6) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Step Into the Future (Done)");

}
if (gg.HaveMemo(talker, 6) == 1 && myself.GetOneTimeQuestFlag(talker, 6) == 0 && gg.GetMemoState(talker, 6) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Step Into the Future (In Progress)");

}
if (gg.HaveMemo(talker, 6) == 1 && gg.GetMemoState(talker, 6) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Step Into the Future (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 1) && myself.GetOneTimeQuestFlag(talker, 1) == 0) {
myself.SetCurrentQuestID(1);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 688) == 0 && gg.OwnItemCount(talker, 687)) {
myself.GiveItem1(talker, 688, 1);
myself.DeleteItem1(talker, 687, 1);
myself.ShowPage(talker, "rapunzel_q0001_01.htm");
myself.SetFlagJournal(talker, 1, 2);
myself.ShowQuestMark(talker, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 1, 2);

} else if (gg.OwnItemCount(talker, 1080) || gg.OwnItemCount(talker, 1079)) {
myself.ShowPage(talker, "rapunzel_q0001_03.htm");

} else if (gg.OwnItemCount(talker, 688)) {
myself.ShowPage(talker, "rapunzel_q0001_02.htm");

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level >= 3 && gg.HaveMemo(talker, 6) == 0 && myself.GetOneTimeQuestFlag(talker, 6) == 0) {
myself.SetCurrentQuestID(6);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "rapunzel_q0006_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 6);
myself.ShowQuestFHTML(talker, fhtml0, 6);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || talker.level < 3 && gg.HaveMemo(talker, 6) == 0 && myself.GetOneTimeQuestFlag(talker, 6) == 0) {
myself.SetCurrentQuestID(6);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rapunzel_q0006_0103.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 6) == 0 && myself.GetOneTimeQuestFlag(talker, 6) == 1) {
myself.SetCurrentQuestID(6);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 6) == 1 && myself.GetOneTimeQuestFlag(talker, 6) == 0 && gg.GetMemoState(talker, 6) == 1 * 10 + 1) {
myself.SetCurrentQuestID(6);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rapunzel_q0006_0105.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 6) == 1 && gg.GetMemoState(talker, 6) == 3 * 10 + 1) {
myself.SetCurrentQuestID(6);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 6, 3);
myself.ShowPage(talker, "rapunzel_q0006_0301.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 6) {
myself.SetCurrentQuestID(6);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 6);
myself.ShowQuestMark(talker, 6);
myself.SetMemoState(talker, 6, 1 * 10 + 1);
gg.AddLog(1, talker, 6);
myself.SetFlagJournal(talker, 6, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "rapunzel_q0006_0104.htm", 6);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 6) {
myself.SetCurrentQuestID(6);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 6 && myself.GetOneTimeQuestFlag(talker, 6) == 0) {
i0 = myself.GetHTMLCookie(talker, 6, 4 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 6) == 1 && myself.GetOneTimeQuestFlag(talker, 6) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7559, 1);
myself.GiveItem1(talker, 7570, 1);

}
gg.AddLog(2, talker, 6);
myself.RemoveMemo(talker, 6);
myself.SetOneTimeQuestFlag(talker, 6, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "rapunzel_q0006_0401.htm");

}

}

}
super;
	}


}