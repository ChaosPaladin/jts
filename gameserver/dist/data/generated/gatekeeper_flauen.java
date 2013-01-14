package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gatekeeper_flauen extends teleporter {
protected Object[][] Position = {
{"The Town of Giran";83551;147945;-3400;7600;3}, {"Town of Oren";82971;53207;-1470;50000;4}, {"The Town of Dion";15472;142880;-2699;12000;2}, {"Town of Aden";146783;25808;-2000;59000;5}, {"Town of Goddard";148024;-55281;-2728;83000;7}, {"Rune Township";43835;-47749;-792;82000;8}, {"Town of Schuttgart";87126;-143520;-1288;100000;9}, {"The Town of Gludio";-12787;122779;-3114;47000;1}, {"Giran Harbor";47938;186864;-3420;7100;3}, {"Field of Silence";87691;162835;-3563;12000;0}, {"Field of Whispers";82192;226128;-3664;5900;0}, {"Alligator Island";115583;192261;-3488;2100;0}, {"Garden of Eva";84413;234334;-3656;2400;0}, {"Isle of Prayer";149518;195280;-3736;7200;0}
};
protected Object[][] PositionNoblessNeedItemField = {
{"Gludin Arena";-87328;142266;-3640;1;0}, {"Giran Arena";73579;142709;-3768;1;0}, {"Field of Silence Center";80987;182423;-3504;1;0}, {"Field of Whispers Center";86147;218268;-3592;1;0}, {"Field of Silence (Western Section)";75387;195263;-3000;1;0}, {"Field of Whispers (Eastern Section)";97786;209303;-3040;1;0}, {"The Center of Alligator Island";113708;178387;-3232;1;0}, {"Inside the Garden of Eva";82693;242220;-6712;1;0}, {"Garden of Eva - 2nd Level";79248;247390;-8816;1;0}, {"Garden of Eva - 3rd Level";77868;250400;-9328;1;0}, {"Garden of Eva - 4th Level";78721;253309;-9840;1;0}, {"Garden of Eva - 5th Level";82951;252354;-10592;1;0}, {"Coliseum";146440;46723;-3400;1;0}
};
protected Object[][] PositionNoblessNoItemField = {
{"Gludin Arena";-87328;142266;-3640;1000;0}, {"Giran Arena";73579;142709;-3768;1000;0}, {"Field of Silence Center";80987;182423;-3504;1000;0}, {"Field of Whispers Center";86147;218268;-3592;1000;0}, {"Field of Silence (Western Section)";75387;195263;-3000;1000;0}, {"Field of Whispers (Eastern Section)";97786;209303;-3040;1000;0}, {"The Center of Alligator Island";113708;178387;-3232;1000;0}, {"Inside the Garden of Eva";82693;242220;-6712;1000;0}, {"Garden of Eva - 2nd Level";79248;247390;-8816;1000;0}, {"Garden of Eva - 3rd Level";77868;250400;-9328;1000;0}, {"Garden of Eva - 4th Level";78721;253309;-9840;1000;0}, {"Garden of Eva - 5th Level";82951;252354;-10592;1000;0}, {"Coliseum";146440;46723;-3400;1000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 237) == 0 && myself.GetOneTimeQuestFlag(talker, 237) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Winds of Change");

}
if (gg.HaveMemo(talker, 237) == 0 && myself.GetOneTimeQuestFlag(talker, 237) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Winds of Change (Done)");

}
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 1 || gg.GetMemoState(talker, 237) == 2 || gg.GetMemoState(talker, 237) == 5) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Winds of Change (In progress)");

}
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 3) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Winds of Change (In progress)");

}
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 4) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Winds of Change (In progress)");

}
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 6 || gg.GetMemoState(talker, 237) == 7) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Winds of Change (In progress)");

}
if (gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 3) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Oath (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 0 && myself.GetOneTimeQuestFlag(talker, 237) == 0) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "gatekeeper_flauen_q0237_01.htm", 237);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 0 && myself.GetOneTimeQuestFlag(talker, 237) == 1) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gatekeeper_flauen_q0237_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 1 || gg.GetMemoState(talker, 237) == 2 || gg.GetMemoState(talker, 237) == 5) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gatekeeper_flauen_q0237_09.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 3) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gatekeeper_flauen_q0237_10.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 4) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gatekeeper_flauen_q0237_11.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 6 || gg.GetMemoState(talker, 237) == 7) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gatekeeper_flauen_q0237_12.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 3) {
myself.SetCurrentQuestID(464);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gatekeeper_flauen_q0464_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 237) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 237) == 0 && myself.GetOneTimeQuestFlag(talker, 237) == 0 && talker.level >= 82) {
myself.GiveItem1(talker, 14862, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 237);
myself.SetMemoState(talker, 237, 1);
myself.ShowQuestPage(talker, "gatekeeper_flauen_q0237_08.htm", 237);
myself.SetFlagJournal(talker, 237, 1);
myself.ShowQuestMark(talker, 237);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 237) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 237) {
if (reply == 1) {
if (gg.HaveMemo(talker, 237) == 0 && myself.GetOneTimeQuestFlag(talker, 237) == 0 && talker.level < 82) {
myself.ShowPage(talker, "gatekeeper_flauen_q0237_03.htm");

} else if (gg.HaveMemo(talker, 237) == 0 && myself.GetOneTimeQuestFlag(talker, 237) == 0 && talker.level >= 82) {
myself.ShowPage(talker, "gatekeeper_flauen_q0237_04.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 237) == 0 && myself.GetOneTimeQuestFlag(talker, 237) == 0 && talker.level >= 82) {
myself.ShowPage(talker, "gatekeeper_flauen_q0237_05.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 237) == 0 && myself.GetOneTimeQuestFlag(talker, 237) == 0 && talker.level >= 82) {
myself.ShowPage(talker, "gatekeeper_flauen_q0237_06.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 237) == 0 && myself.GetOneTimeQuestFlag(talker, 237) == 0 && talker.level >= 82) {
myself.FHTML_SetFileName(fhtml0, "gatekeeper_flauen_q0237_07.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 237);
myself.ShowQuestFHTML(talker, fhtml0, 237);

}

}

}
if (ask == 464) {
myself.SetCurrentQuestID(464);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 464) {
if (reply == 1) {
if (gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 3) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 57, 69210);
myself.IncrementParam(talker, 0, 249180);
myself.IncrementParam(talker, 1, 28542);
myself.DeleteItem1(talker, 15539, gg.OwnItemCount(talker, 15539));
myself.RemoveMemo(talker, 464);
gg.SetDailyQuestFlag(talker, 464);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 464);
gg.AddLog(3, talker, 464);
myself.ShowPage(talker, "gatekeeper_flauen_q0464_02.htm");

}

}

}

}
super;
	}


}