package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class jeremy extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 68 && gg.HaveMemo(talker, 621) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Egg Delivery");

}
if (talker.level < 68 && gg.HaveMemo(talker, 621) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Egg Delivery");

}
if (gg.HaveMemo(talker, 621) == 1 && gg.GetMemoState(talker, 621) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Egg Delivery (In Progress)");

}
if (gg.HaveMemo(talker, 621) == 1 && gg.OwnItemCount(talker, 7196) >= 1 && myself.GetOneTimeQuestFlag(talker, 621) == 0 && gg.GetMemoState(talker, 621) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Egg Delivery (In Progress)");

}
if (gg.HaveMemo(talker, 621) == 1 && myself.GetOneTimeQuestFlag(talker, 621) == 0 && gg.GetMemoState(talker, 621) == 7 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Egg Delivery (In Progress)");

}
if (talker.level >= 68 && gg.HaveMemo(talker, 622) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Specialty Liquor Delivery");

}
if (talker.level < 68 && gg.HaveMemo(talker, 622) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Specialty Liquor Delivery");

}
if (gg.HaveMemo(talker, 622) == 1 && gg.GetMemoState(talker, 622) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Specialty Liquor Delivery (In Progress)");

}
if (gg.HaveMemo(talker, 622) == 1 && gg.OwnItemCount(talker, 7198) >= 1 && myself.GetOneTimeQuestFlag(talker, 622) == 0 && gg.GetMemoState(talker, 622) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Specialty Liquor Delivery (In Progress)");

}
if (gg.HaveMemo(talker, 622) == 1 && myself.GetOneTimeQuestFlag(talker, 622) == 0 && gg.GetMemoState(talker, 622) == 7 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Specialty Liquor Delivery (In Progress)");

}
if (talker.level >= 71 && gg.HaveMemo(talker, 623) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "The Finest Food");

}
if (talker.level < 71 && gg.HaveMemo(talker, 623) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "The Finest Food");

}
if (gg.HaveMemo(talker, 623) == 1 && gg.GetMemoState(talker, 623) >= 1 * 10 + 1 && gg.GetMemoState(talker, 623) <= 1 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "The Finest Food (In Progress)");

}
if (talker.level >= 73 && gg.HaveMemo(talker, 624) == 0) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "The Finest Ingredients - Part 1");

}
if (talker.level < 73 && gg.HaveMemo(talker, 624) == 0) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "The Finest Ingredients - Part 1");

}
if (gg.HaveMemo(talker, 624) == 1 && gg.GetMemoState(talker, 624) >= 1 * 10 + 1 && gg.GetMemoState(talker, 624) <= 1 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "The Finest Ingredients - Part 1 (In Progress)");

}
if (talker.level >= 73 && gg.HaveMemo(talker, 625) == 0) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "The Finest Ingredients - Part 2");

}
if (talker.level < 73 && gg.HaveMemo(talker, 625) == 0) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "The Finest Ingredients - Part 2");

}
if (gg.HaveMemo(talker, 625) == 1 && gg.GetMemoState(talker, 625) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "The Finest Ingredients - Part 2 (In Progress)");

}
if (gg.HaveMemo(talker, 625) == 1 && gg.GetMemoState(talker, 625) >= 2 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "The Finest Ingredients - Part 2 (In Progress)");

}
if (gg.HaveMemo(talker, 37) == 1 && gg.OwnItemCount(talker, 7164) >= 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Make Formal Wear (In Progress)");

}
if (gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Make Formal Wear (In Progress)");

}
if (gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Make Formal Wear (In Progress)");

}
if (gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Make Formal Wear (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 68 && gg.HaveMemo(talker, 621) == 0) {
myself.SetCurrentQuestID(621);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "jeremy_q0621_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 621);
myself.ShowQuestFHTML(talker, fhtml0, 621);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 68 && gg.HaveMemo(talker, 621) == 0) {
myself.SetCurrentQuestID(621);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "jeremy_q0621_0103.htm", 621);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 621) == 1 && gg.GetMemoState(talker, 621) == 1 * 10 + 1) {
myself.SetCurrentQuestID(621);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jeremy_q0621_0105.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 621) == 1 && gg.OwnItemCount(talker, 7196) >= 1 && myself.GetOneTimeQuestFlag(talker, 621) == 0 && gg.GetMemoState(talker, 621) == 6 * 10 + 1) {
myself.SetCurrentQuestID(621);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 621, 6);
myself.ShowPage(talker, "jeremy_q0621_0601.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 621) == 1 && myself.GetOneTimeQuestFlag(talker, 621) == 0 && gg.GetMemoState(talker, 621) == 7 * 10 + 1) {
myself.SetCurrentQuestID(621);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jeremy_q0621_0703.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || talker.level >= 68 && gg.HaveMemo(talker, 622) == 0) {
myself.SetCurrentQuestID(622);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "jeremy_q0622_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 622);
myself.ShowQuestFHTML(talker, fhtml0, 622);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || talker.level < 68 && gg.HaveMemo(talker, 622) == 0) {
myself.SetCurrentQuestID(622);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "jeremy_q0622_0103.htm", 622);

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 622) == 1 && gg.GetMemoState(talker, 622) == 1 * 10 + 1) {
myself.SetCurrentQuestID(622);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jeremy_q0622_0105.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 622) == 1 && gg.OwnItemCount(talker, 7198) >= 1 && myself.GetOneTimeQuestFlag(talker, 622) == 0 && gg.GetMemoState(talker, 622) == 6 * 10 + 1) {
myself.SetCurrentQuestID(622);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 622, 6);
myself.ShowPage(talker, "jeremy_q0622_0601.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 622) == 1 && myself.GetOneTimeQuestFlag(talker, 622) == 0 && gg.GetMemoState(talker, 622) == 7 * 10 + 1) {
myself.SetCurrentQuestID(622);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jeremy_q0622_0703.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || talker.level >= 71 && gg.HaveMemo(talker, 623) == 0) {
myself.SetCurrentQuestID(623);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "jeremy_q0623_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 623);
myself.ShowQuestFHTML(talker, fhtml0, 623);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || talker.level < 71 && gg.HaveMemo(talker, 623) == 0) {
myself.SetCurrentQuestID(623);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "jeremy_q0623_0103.htm", 623);

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 623) == 1 && gg.GetMemoState(talker, 623) >= 1 * 10 + 1 && gg.GetMemoState(talker, 623) <= 1 * 10 + 2) {
myself.SetCurrentQuestID(623);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 623) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7199) >= 100 && gg.OwnItemCount(talker, 7200) >= 100 && gg.OwnItemCount(talker, 7201) >= 100) {
myself.SetHTMLCookie(talker, 623, 1);
myself.ShowPage(talker, "jeremy_q0623_0105.htm");

} else {
myself.ShowPage(talker, "jeremy_q0623_0106.htm");

}

}
break;

}
case 13: {
if (_from_choice == 0 || talker.level >= 73 && gg.HaveMemo(talker, 624) == 0) {
myself.SetCurrentQuestID(624);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "jeremy_q0624_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 624);
myself.ShowQuestFHTML(talker, fhtml0, 624);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 14: {
if (_from_choice == 0 || talker.level < 73 && gg.HaveMemo(talker, 624) == 0) {
myself.SetCurrentQuestID(624);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "jeremy_q0624_0103.htm", 624);

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 624) == 1 && gg.GetMemoState(talker, 624) >= 1 * 10 + 1 && gg.GetMemoState(talker, 624) <= 1 * 10 + 2) {
myself.SetCurrentQuestID(624);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 624) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7203) >= 50 && gg.OwnItemCount(talker, 7202) >= 50 && gg.OwnItemCount(talker, 7204) >= 50) {
myself.SetHTMLCookie(talker, 624, 1);
myself.ShowPage(talker, "jeremy_q0624_0105.htm");

} else {
myself.ShowPage(talker, "jeremy_q0624_0106.htm");

}

}
break;

}
case 16: {
if (_from_choice == 0 || talker.level >= 73 && gg.HaveMemo(talker, 625) == 0) {
myself.SetCurrentQuestID(625);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 7205) >= 1) {
myself.FHTML_SetFileName(fhtml0, "jeremy_q0625_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 625);
myself.ShowQuestFHTML(talker, fhtml0, 625);

} else {
myself.ShowQuestPage(talker, "jeremy_q0625_0102.htm", 625);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 17: {
if (_from_choice == 0 || talker.level < 73 && gg.HaveMemo(talker, 625) == 0) {
myself.SetCurrentQuestID(625);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "jeremy_q0625_0103.htm", 625);

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 625) == 1 && gg.GetMemoState(talker, 625) == 1 * 10 + 1) {
myself.SetCurrentQuestID(625);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jeremy_q0625_0105.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 625) == 1 && gg.GetMemoState(talker, 625) >= 2 * 10 + 2) {
myself.SetCurrentQuestID(625);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7210) >= 1) {
myself.SetHTMLCookie(talker, 625, 2);
myself.ShowPage(talker, "jeremy_q0625_0201.htm");

} else {
myself.ShowPage(talker, "jeremy_q0625_0202.htm");

}

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 37) == 1 && gg.OwnItemCount(talker, 7164) >= 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 2 * 10 + 1) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 37, 2);
myself.ShowPage(talker, "jeremy_q0037_0201.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 3 * 10 + 1) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jeremy_q0037_0303.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 4 * 10 + 1) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 37, 4);
myself.ShowPage(talker, "jeremy_q0037_0401.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 5 * 10 + 1) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jeremy_q0037_0502.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 621) {
myself.SetCurrentQuestID(621);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 621);
myself.SetMemoState(talker, 621, 1 * 10 + 1);
gg.AddLog(1, talker, 621);
myself.SetFlagJournal(talker, 621, 1);
myself.ShowQuestMark(talker, 621);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "jeremy_q0621_0104.htm", 621);
myself.GiveItem1(talker, 7195, 5);

}
return;

}
if (quest_id == 622) {
myself.SetCurrentQuestID(622);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 622);
myself.SetMemoState(talker, 622, 1 * 10 + 1);
gg.AddLog(1, talker, 622);
myself.SetFlagJournal(talker, 622, 1);
myself.ShowQuestMark(talker, 622);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "jeremy_q0622_0104.htm", 622);
myself.GiveItem1(talker, 7197, 5);

}
return;

}
if (quest_id == 623) {
myself.SetCurrentQuestID(623);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 623);
myself.SetMemoState(talker, 623, 1 * 10 + 1);
myself.ShowQuestMark(talker, 623);
gg.AddLog(1, talker, 623);
myself.SetFlagJournal(talker, 623, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "jeremy_q0623_0104.htm", 623);

}
return;

}
if (quest_id == 624) {
myself.SetCurrentQuestID(624);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 624);
myself.ShowQuestMark(talker, 624);
myself.SetMemoState(talker, 624, 1 * 10 + 1);
gg.AddLog(1, talker, 624);
myself.SetFlagJournal(talker, 624, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "jeremy_q0624_0104.htm", 624);

}
return;

}
if (quest_id == 625) {
myself.SetCurrentQuestID(625);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7205, 1);
myself.SetMemo(talker, 625);
myself.ShowQuestMark(talker, 625);
myself.SetMemoState(talker, 625, 1 * 10 + 1);
gg.AddLog(1, talker, 625);
myself.SetFlagJournal(talker, 625, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "jeremy_q0625_0104.htm", 625);
myself.GiveItem1(talker, 7209, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 621) {
myself.SetCurrentQuestID(621);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 621) {
i0 = myself.GetHTMLCookie(talker, 621, 7 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 621) == 1 && myself.GetOneTimeQuestFlag(talker, 621) == 0) {
if (gg.OwnItemCount(talker, 7196) >= 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7196, 5);
myself.ShowPage(talker, "jeremy_q0621_0701.htm");
myself.SetMemoState(talker, 621, 7 * 10 + 1);
myself.SetFlagJournal(talker, 621, 7);
myself.ShowQuestMark(talker, 621);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "jeremy_q0621_0702.htm");

}

}

}

}
if (ask == 622) {
myself.SetCurrentQuestID(622);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 622) {
i0 = myself.GetHTMLCookie(talker, 622, 7 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 622) == 1 && myself.GetOneTimeQuestFlag(talker, 622) == 0) {
if (gg.OwnItemCount(talker, 7198) >= 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7198, 5);
myself.ShowPage(talker, "jeremy_q0622_0701.htm");
myself.SetMemoState(talker, 622, 7 * 10 + 1);
myself.SetFlagJournal(talker, 622, 7);
myself.ShowQuestMark(talker, 622);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "jeremy_q0622_0702.htm");

}

}

}

}
if (ask == 623) {
myself.SetCurrentQuestID(623);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 623) {
i0 = myself.GetHTMLCookie(talker, 623, 2 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 623) == 1) {
if (gg.OwnItemCount(talker, 7199) >= 100 && gg.OwnItemCount(talker, 7200) >= 100 && gg.OwnItemCount(talker, 7201) >= 100) {
i1 = gg.Rand(1000);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7199, gg.OwnItemCount(talker, 7199));
myself.DeleteItem1(talker, 7200, gg.OwnItemCount(talker, 7200));
myself.DeleteItem1(talker, 7201, gg.OwnItemCount(talker, 7201));
if (i1 < 120) {
myself.GiveItem1(talker, 57, 25000);
myself.GiveItem1(talker, 6849, 1);

} else if (i1 < 120 + 120) {
myself.GiveItem1(talker, 57, 65000);
myself.GiveItem1(talker, 6847, 1);

} else if (i1 < 120 + 120 + 100) {
myself.GiveItem1(talker, 6851, 1);
myself.GiveItem1(talker, 57, 25000);

} else if (i1 < 120 + 120 + 100 + 660) {
myself.GiveItem1(talker, 57, 73000);
myself.IncrementParam(talker, 0, 230000);
myself.IncrementParam(talker, 1, 18200);

}

}
gg.AddLog(2, talker, 623);
gg.AddLog(3, talker, 623);
myself.RemoveMemo(talker, 623);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "jeremy_q0623_0201.htm");

} else {
myself.ShowPage(talker, "jeremy_q0623_0202.htm");

}

}

}

}
if (ask == 624) {
myself.SetCurrentQuestID(624);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 624) {
i0 = myself.GetHTMLCookie(talker, 624, 2 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 624) == 1) {
if (gg.OwnItemCount(talker, 7202) >= 50 && gg.OwnItemCount(talker, 7203) >= 50 && gg.OwnItemCount(talker, 7204) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7202, gg.OwnItemCount(talker, 7202));
myself.DeleteItem1(talker, 7203, gg.OwnItemCount(talker, 7203));
myself.DeleteItem1(talker, 7204, gg.OwnItemCount(talker, 7204));
myself.GiveItem1(talker, 7205, 1);
myself.GiveItem1(talker, 7080, 1);

}
gg.AddLog(2, talker, 624);
gg.AddLog(3, talker, 624);
myself.RemoveMemo(talker, 624);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "jeremy_q0624_0201.htm");

} else {
myself.ShowPage(talker, "jeremy_q0624_0202.htm");

}

}

}

}
if (ask == 625) {
myself.SetCurrentQuestID(625);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 625) {
i0 = myself.GetHTMLCookie(talker, 625, 3 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 625) == 1) {
if (gg.OwnItemCount(talker, 7210) >= 1) {
i1 = gg.Rand(1000);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7210, 1);
if (i1 < 167) {
myself.GiveItem1(talker, 4589, 5);

} else if (i1 < 167 + 167) {
myself.GiveItem1(talker, 4590, 5);

} else if (i1 < 167 + 167 + 167) {
myself.GiveItem1(talker, 4591, 5);

} else if (i1 < 167 + 167 + 167 + 167) {
myself.GiveItem1(talker, 4592, 5);

} else if (i1 < 167 + 167 + 167 + 167 + 167) {
myself.GiveItem1(talker, 4593, 5);

} else if (i1 < 167 + 167 + 167 + 167 + 167 + 165) {
myself.GiveItem1(talker, 4594, 5);

}

}
gg.AddLog(2, talker, 625);
gg.AddLog(3, talker, 625);
myself.RemoveMemo(talker, 625);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "jeremy_q0625_0301.htm");

} else {
myself.ShowPage(talker, "jeremy_q0625_0302.htm");

}

}

}

}
if (ask == 37) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 37) {
i0 = myself.GetHTMLCookie(talker, 37, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0) {
if (gg.OwnItemCount(talker, 0) >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7160, 1);
myself.ShowPage(talker, "jeremy_q0037_0301.htm");
myself.SetMemoState(talker, 37, 3 * 10 + 1);
myself.SetFlagJournal(talker, 37, 3);
myself.ShowQuestMark(talker, 37);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "jeremy_q0037_0302.htm");

}

}

}

}
if (ask == 37) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 37) {
i0 = myself.GetHTMLCookie(talker, 37, 5 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7159, 1);
myself.ShowPage(talker, "jeremy_q0037_0501.htm");
myself.SetMemoState(talker, 37, 5 * 10 + 1);
myself.SetFlagJournal(talker, 37, 5);
myself.ShowQuestMark(talker, 37);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}