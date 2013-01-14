package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_npc_priest extends citizen {
	protected int ssq_priest_type = 1;
	protected int ssq_event_listener = 0;
	protected String ShopName = "";
	protected String szName = "ssq_npc_priest";
	protected String QUEST_ID = "q0506";
	protected int ssqitemBlue = 6360;
	protected int ssqitemGreen = 6361;
	protected int ssqitemRed = 6362;
	protected int ItemTypeA = 0;
	protected int ItemTypeB = 1;
	protected int ItemTypeC = 2;

protected Object[][] Position = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};
protected Object[][] PositionCompetition = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};

	protected void CREATED() {
if (ssq_event_listener == 1) {
myself.RegisterToEventListener(1);

}
myself.RegisterTeleporterType(1, 0);
super;
	}

	protected void TALKED(HandlerParam talker) {
if (ssq_priest_type == 2) {
if (myself.GetSSQStatus() == 1) {
switch (gg.GetSSQPart(talker)) {
case 2: {

}
case 0: {
myself.ShowPage(talker, szName + "001.htm");
return;

}

}

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && myself.GetSSQSealOwner(2) == 2 && gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "026.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && myself.GetSSQSealOwner(2) != 2 && gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "029.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && gg.GetSSQPart(talker) == 2 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "032.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 0 && gg.GetSSQPart(talker) == 2 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "033.htm");
return;

}
if (gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "034.htm");
return;

}
if (myself.GetSSQStatus() == 0) {
myself.ShowPage(talker, szName + "072.htm");
return;

} else if (myself.GetSSQStatus() == 2) {
myself.ShowPage(talker, szName + "085.htm");

} else if (myself.GetSSQStatus() == 3 && gg.GetSSQPart(talker) != 2) {
myself.ShowPage(talker, szName + "083.htm");

}

} else {
if (myself.GetSSQStatus() == 1 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "035.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && myself.GetSSQSealOwner(2) == 1 && gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "059.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && myself.GetSSQSealOwner(2) != 1 && gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "062.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "065.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 0 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "066.htm");
return;

}
if (gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "067.htm");
return;

}
if (myself.GetSSQStatus() == 0) {
myself.ShowPage(talker, szName + "076.htm");
return;

} else if (myself.GetSSQStatus() == 2) {
myself.ShowPage(talker, szName + "086.htm");

} else if (myself.GetSSQStatus() == 3 && gg.GetSSQPart(talker) != 1) {
myself.ShowPage(talker, szName + "084.htm");

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam pledge0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam s0, HandlerParam i9, HandlerParam i10, HandlerParam i11) {
i9 = 0;
i10 = 0;
i11 = 0;
if (ask == 506) {
switch (reply) {
case 0: {

}
case 38: {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_02.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_36.htm");

}
break;

}
case 1: {

}
case 39: {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_16.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_49.htm");

}
break;

}
case 2: {

}
case 40: {
if (ssq_priest_type == 2) {
if (gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_19.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_20.htm");

}

} else if (gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_52.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_53.htm");

}
break;

}
case 3: {

}
case 41: {
switch (gg.GetSSQPart(talker)) {
case 2: {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_08.htm");
return;

}
case 1: {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_41.htm");
return;

}

}
if (myself.IsInCategory(6, talker.occupation) == 1 || myself.IsInCategory(62, talker.occupation) == 1) {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_03.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_37.htm");

}
return;

} else if (myself.IsInCategory(7, talker.occupation) == 1 || myself.IsInCategory(63, talker.occupation) == 1) {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_04.htm");

} else if (myself.IsJoinableToDawn(talker)) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_39a.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_38.htm");

}
return;

} else if (myself.IsInCategory(8, talker.occupation) == 1 || myself.IsInCategory(9, talker.occupation) == 1 || myself.IsInCategory(64, talker.occupation) == 1 || myself.IsInCategory(65, talker.occupation) == 1) {
if (ssq_priest_type == 2) {
if (myself.IsJoinableToDawn(talker)) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_05.htm");
return;

} else if (gg.OwnItemCount(talker, 6388) > 0) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_07.htm");
return;

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_07a.htm");
return;

}

} else if (myself.IsJoinableToDawn(talker)) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_39.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_40.htm");

}

}
break;

}
case 4: {

}
case 42: {

}
case 43: {

}
case 48: {

}
case 53: {

}
case 54: {

}
case 55: {

}
case 64: {
if (ssq_priest_type == 2) {
if (myself.GetSSQStatus() == 1) {
switch (gg.GetSSQPart(talker)) {
case 2: {

}
case 0: {
myself.ShowPage(talker, szName + "001.htm");
return;

}

}

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && myself.GetSSQSealOwner(2) == 2 && gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "026.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && myself.GetSSQSealOwner(2) != 2 && gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "029.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && gg.GetSSQPart(talker) == 2 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "032.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 0 && gg.GetSSQPart(talker) == 2 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "033.htm");
return;

}
if (gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "034.htm");
return;

}
if (myself.GetSSQStatus() == 0) {
myself.ShowPage(talker, szName + "072.htm");
return;

} else if (myself.GetSSQStatus() == 2) {
myself.ShowPage(talker, szName + "085.htm");

} else if (myself.GetSSQStatus() == 3 && gg.GetSSQPart(talker) != 2) {
myself.ShowPage(talker, szName + "083.htm");

}

} else {
if (myself.GetSSQStatus() == 1 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "035.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && myself.GetSSQSealOwner(2) == 1 && gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "059.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && myself.GetSSQSealOwner(2) != 1 && gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "062.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "065.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 0 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "066.htm");
return;

}
if (gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "067.htm");
return;

}
if (myself.GetSSQStatus() == 0) {
myself.ShowPage(talker, szName + "076.htm");
return;

} else if (myself.GetSSQStatus() == 2) {
myself.ShowPage(talker, szName + "086.htm");

} else if (myself.GetSSQStatus() == 3 && gg.GetSSQPart(talker) != 1) {
myself.ShowPage(talker, szName + "084.htm");

}

}
break;

}
case 5: {
if (ssq_priest_type == 2) {
if (myself.GetSSQStatus() == 1) {
switch (gg.GetSSQPart(talker)) {
case 2: {

}
case 0: {
myself.ShowPage(talker, szName + "001.htm");
return;

}

}

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && myself.GetSSQSealOwner(2) == 2 && gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "026.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && myself.GetSSQSealOwner(2) != 2 && gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "029.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && gg.GetSSQPart(talker) == 2 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "032.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 0 && gg.GetSSQPart(talker) == 2 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "033.htm");
return;

}
if (gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "034.htm");
return;

}
if (myself.GetSSQStatus() == 0) {
myself.ShowPage(talker, szName + "072.htm");
return;

} else if (myself.GetSSQStatus() == 2) {
myself.ShowPage(talker, szName + "085.htm");

} else if (myself.GetSSQStatus() == 3 && gg.GetSSQPart(talker) != 2) {
myself.ShowPage(talker, szName + "083.htm");

}

} else {
if (myself.GetSSQStatus() == 1 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "035.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && myself.GetSSQSealOwner(2) == 1 && gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "059.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && myself.GetSSQSealOwner(2) != 1 && gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "062.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "065.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 0 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "066.htm");
return;

}
if (gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "067.htm");
return;

}
if (myself.GetSSQStatus() == 0) {
myself.ShowPage(talker, szName + "076.htm");
return;

} else if (myself.GetSSQStatus() == 2) {
myself.ShowPage(talker, szName + "086.htm");

} else if (myself.GetSSQStatus() == 3 && gg.GetSSQPart(talker) != 1) {
myself.ShowPage(talker, szName + "084.htm");

}

}
break;

}
case 6: {

}
case 10: {

}
case 16: {

}
case 44: {

}
case 49: {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_10.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_43.htm");

}
break;

}
case 7: {

}
case 11: {

}
case 17: {

}
case 45: {

}
case 50: {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_11.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_44.htm");

}
break;

}
case 8: {

}
case 12: {

}
case 18: {

}
case 46: {

}
case 51: {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_12.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_45.htm");

}
break;

}
case 9: {

}
case 14: {

}
case 15: {

}
case 20: {

}
case 21: {

}
case 22: {

}
case 56: {
if (ssq_priest_type == 2) {
if (myself.GetSSQStatus() == 1) {
switch (gg.GetSSQPart(talker)) {
case 2: {

}
case 0: {
myself.ShowPage(talker, szName + "001.htm");
return;

}

}

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && myself.GetSSQSealOwner(2) == 2 && gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "026.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && myself.GetSSQSealOwner(2) != 2 && gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "029.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && gg.GetSSQPart(talker) == 2 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "032.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 0 && gg.GetSSQPart(talker) == 2 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "033.htm");
return;

}
if (gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "034.htm");
return;

}
if (myself.GetSSQStatus() == 0) {
myself.ShowPage(talker, szName + "072.htm");
return;

} else if (myself.GetSSQStatus() == 2) {
myself.ShowPage(talker, szName + "085.htm");

} else if (myself.GetSSQStatus() == 3 && gg.GetSSQPart(talker) != 2) {
myself.ShowPage(talker, szName + "083.htm");

}

} else {
if (myself.GetSSQStatus() == 1 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "035.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && myself.GetSSQSealOwner(2) == 1 && gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "059.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && myself.GetSSQSealOwner(2) != 1 && gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "062.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "065.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 0 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "066.htm");
return;

}
if (gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "067.htm");
return;

}
if (myself.GetSSQStatus() == 0) {
myself.ShowPage(talker, szName + "076.htm");
return;

} else if (myself.GetSSQStatus() == 2) {
myself.ShowPage(talker, szName + "086.htm");

} else if (myself.GetSSQStatus() == 3 && gg.GetSSQPart(talker) != 1) {
myself.ShowPage(talker, szName + "084.htm");

}

}
break;

}
case 13: {

}
case 19: {

}
case 47: {

}
case 52: {
if (ssq_priest_type == 2) {
myself.FHTML_SetFileName(fhtml0, szName + "_" + QUEST_ID + "_09.htm");

} else {
myself.FHTML_SetFileName(fhtml0, szName + "_" + QUEST_ID + "_42.htm");

}
if (myself.GetSSQStatus() != 3) {
myself.FHTML_SetStr(fhtml0, "seal_avarice", gg.MakeFString(1000302, "", "", "", "", ""));

} else {
switch (myself.GetSSQSealOwner(1)) {
case 0: {
myself.FHTML_SetStr(fhtml0, "seal_avarice", gg.MakeFString(1000302, "", "", "", "", ""));
break;

}
case 2: {
myself.FHTML_SetStr(fhtml0, "seal_avarice", gg.MakeFString(1000300, "", "", "", "", ""));
break;

}
case 1: {
myself.FHTML_SetStr(fhtml0, "seal_avarice", gg.MakeFString(1000301, "", "", "", "", ""));
break;

}

}

}
if (myself.GetSSQStatus() != 3) {
myself.FHTML_SetStr(fhtml0, "seal_revelation", gg.MakeFString(1000302, "", "", "", "", ""));

} else {
switch (myself.GetSSQSealOwner(2)) {
case 0: {
myself.FHTML_SetStr(fhtml0, "seal_revelation", gg.MakeFString(1000302, "", "", "", "", ""));
break;

}
case 2: {
myself.FHTML_SetStr(fhtml0, "seal_revelation", gg.MakeFString(1000300, "", "", "", "", ""));
break;

}
case 1: {
myself.FHTML_SetStr(fhtml0, "seal_revelation", gg.MakeFString(1000301, "", "", "", "", ""));
break;

}

}

}
if (myself.GetSSQStatus() != 3) {
myself.FHTML_SetStr(fhtml0, "seal_strife", gg.MakeFString(1000302, "", "", "", "", ""));

} else {
switch (myself.GetSSQSealOwner(3)) {
case 0: {
myself.FHTML_SetStr(fhtml0, "seal_strife", gg.MakeFString(1000302, "", "", "", "", ""));
break;

}
case 2: {
myself.FHTML_SetStr(fhtml0, "seal_strife", gg.MakeFString(1000300, "", "", "", "", ""));
break;

}
case 1: {
myself.FHTML_SetStr(fhtml0, "seal_strife", gg.MakeFString(1000301, "", "", "", "", ""));
break;

}

}

}
myself.ShowFHTML(talker, fhtml0);
break;

}
case 23: {

}
case 57: {
if (ssq_priest_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetSSQPrevWinner() == 2) {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1307);
return;

}
i0 = myself.GetDepositedSSQItemCount(talker, 2, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 2, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 2, 2);
if (i0 > 0 || i1 > 0 || i2 > 0) {
i3 = i0 * 3 + i1 * 5 + i2 * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
myself.GiveItem1(talker, 5575, i3);
myself.DeleteDepositedSSQItem(talker, 2, 0, i0);
myself.DeleteDepositedSSQItem(talker, 2, 1, i1);
myself.DeleteDepositedSSQItem(talker, 2, 2, i2);

} else {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, "ssq_npc_priest091.htm");

} else {
myself.ShowPage(talker, "ssq_npc_priest092.htm");

}
return;

}

}

}
i4 = 0;
if (myself.IsInCategory(8, talker.occupation) == 1 || myself.IsInCategory(9, talker.occupation) == 1 || myself.IsInCategory(64, talker.occupation) == 1 || myself.IsInCategory(65, talker.occupation) == 1) {
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_73.htm");
return;

}
switch (gg.GetSSQPart(talker)) {
case 0: {
if (gg.GetSSQPart(talker) == 0) {
if (2 == 2) {
if (myself.IsJoinableToDawn(talker) == 0) {
if (gg.OwnItemCount(talker, 6388) > 0) {
myself.DeleteItem1(talker, 6388, 1);
i4 = 2;

} else if (gg.OwnItemCount(talker, 57) >= 50000) {
myself.DeleteItem1(talker, 57, 50000);
i4 = 3;

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_06.htm");
return;

}

} else {
i4 = 1;

}

} else if (2 == 1) {
i4 = 0;

}

}
break;

}
case 2: {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_08.htm");
return;

}
case 1: {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_41.htm");
return;

}

}
if (myself.GetSSQPrevWinner() != 2) {
i0 = myself.GetDepositedSSQItemCount(talker, 2, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 2, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 2, 2);
i3 = i0 * 1 + i1 * 1 + i2 * 10;
if (myself.AddSSQMember(talker, 2, 1, 2, i3, i4) == 0) {
return;

}

} else {
i3 = 0;
if (myself.AddSSQMember(talker, 2, 1, 2, i3, i4) == 0) {
return;

}

}

} else {
i4 = 0;
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_73.htm");
return;

}
if (myself.GetSSQPrevWinner() != 2) {
i0 = myself.GetDepositedSSQItemCount(talker, 2, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 2, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 2, 2);
i3 = i0 * 1 + i1 * 1 + i2 * 10;
if (myself.AddSSQMember(talker, 2, 1, 1, i3, i4) == 0) {
return;

}

} else {
i3 = 0;
if (myself.AddSSQMember(talker, 2, 1, 1, i3, i4) == 0) {
return;

}

}

}
if (2 == 2) {
myself.ShowSystemMessage(talker, 1273);

} else if (2 == 1) {
myself.ShowSystemMessage(talker, 1274);

}
switch (1) {
case 1: {
myself.ShowSystemMessage(talker, 1275);
break;

}
case 2: {
myself.ShowSystemMessage(talker, 1276);
break;

}
case 3: {
myself.ShowSystemMessage(talker, 1277);
break;

}

}
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_13.htm");

} else {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetSSQPrevWinner() == 1) {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1307);
return;

}
i0 = myself.GetDepositedSSQItemCount(talker, 1, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 1, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 1, 2);
if (i0 > 0 || i1 > 0 || i2 > 0) {
i3 = i0 * 3 + i1 * 5 + i2 * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
myself.GiveItem1(talker, 5575, i3);
myself.DeleteDepositedSSQItem(talker, 1, 0, i0);
myself.DeleteDepositedSSQItem(talker, 1, 1, i1);
myself.DeleteDepositedSSQItem(talker, 1, 2, i2);

} else {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, "ssq_npc_priest091.htm");

} else {
myself.ShowPage(talker, "ssq_npc_priest092.htm");

}
return;

}

}

}
i4 = 0;
if (myself.IsInCategory(8, talker.occupation) == 1 || myself.IsInCategory(9, talker.occupation) == 1 || myself.IsInCategory(64, talker.occupation) == 1 || myself.IsInCategory(65, talker.occupation) == 1) {
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_73.htm");
return;

}
switch (gg.GetSSQPart(talker)) {
case 0: {
if (gg.GetSSQPart(talker) == 0) {
if (1 == 2) {
if (myself.IsJoinableToDawn(talker) == 0) {
if (gg.OwnItemCount(talker, 6388) > 0) {
myself.DeleteItem1(talker, 6388, 1);
i4 = 2;

} else if (gg.OwnItemCount(talker, 57) >= 50000) {
myself.DeleteItem1(talker, 57, 50000);
i4 = 3;

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_06.htm");
return;

}

} else {
i4 = 1;

}

} else if (1 == 1) {
i4 = 0;

}

}
break;

}
case 2: {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_08.htm");
return;

}
case 1: {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_41.htm");
return;

}

}
if (myself.GetSSQPrevWinner() != 1) {
i0 = myself.GetDepositedSSQItemCount(talker, 1, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 1, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 1, 2);
i3 = i0 * 1 + i1 * 1 + i2 * 10;
if (myself.AddSSQMember(talker, 1, 1, 2, i3, i4) == 0) {
return;

}

} else {
i3 = 0;
if (myself.AddSSQMember(talker, 1, 1, 2, i3, i4) == 0) {
return;

}

}

} else {
i4 = 0;
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_73.htm");
return;

}
if (myself.GetSSQPrevWinner() != 1) {
i0 = myself.GetDepositedSSQItemCount(talker, 1, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 1, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 1, 2);
i3 = i0 * 1 + i1 * 1 + i2 * 10;
if (myself.AddSSQMember(talker, 1, 1, 1, i3, i4) == 0) {
return;

}

} else {
i3 = 0;
if (myself.AddSSQMember(talker, 1, 1, 1, i3, i4) == 0) {
return;

}

}

}
if (1 == 2) {
myself.ShowSystemMessage(talker, 1273);

} else if (1 == 1) {
myself.ShowSystemMessage(talker, 1274);

}
switch (1) {
case 1: {
myself.ShowSystemMessage(talker, 1275);
break;

}
case 2: {
myself.ShowSystemMessage(talker, 1276);
break;

}
case 3: {
myself.ShowSystemMessage(talker, 1277);
break;

}

}
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_46.htm");

}
break;

}
case 24: {

}
case 58: {
if (ssq_priest_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetSSQPrevWinner() == 2) {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1307);
return;

}
i0 = myself.GetDepositedSSQItemCount(talker, 2, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 2, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 2, 2);
if (i0 > 0 || i1 > 0 || i2 > 0) {
i3 = i0 * 3 + i1 * 5 + i2 * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
myself.GiveItem1(talker, 5575, i3);
myself.DeleteDepositedSSQItem(talker, 2, 0, i0);
myself.DeleteDepositedSSQItem(talker, 2, 1, i1);
myself.DeleteDepositedSSQItem(talker, 2, 2, i2);

} else {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, "ssq_npc_priest091.htm");

} else {
myself.ShowPage(talker, "ssq_npc_priest092.htm");

}
return;

}

}

}
i4 = 0;
if (myself.IsInCategory(8, talker.occupation) == 1 || myself.IsInCategory(9, talker.occupation) == 1 || myself.IsInCategory(64, talker.occupation) == 1 || myself.IsInCategory(65, talker.occupation) == 1) {
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_73.htm");
return;

}
switch (gg.GetSSQPart(talker)) {
case 0: {
if (gg.GetSSQPart(talker) == 0) {
if (2 == 2) {
if (myself.IsJoinableToDawn(talker) == 0) {
if (gg.OwnItemCount(talker, 6388) > 0) {
myself.DeleteItem1(talker, 6388, 1);
i4 = 2;

} else if (gg.OwnItemCount(talker, 57) >= 50000) {
myself.DeleteItem1(talker, 57, 50000);
i4 = 3;

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_06.htm");
return;

}

} else {
i4 = 1;

}

} else if (2 == 1) {
i4 = 0;

}

}
break;

}
case 2: {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_08.htm");
return;

}
case 1: {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_41.htm");
return;

}

}
if (myself.GetSSQPrevWinner() != 2) {
i0 = myself.GetDepositedSSQItemCount(talker, 2, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 2, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 2, 2);
i3 = i0 * 1 + i1 * 1 + i2 * 10;
if (myself.AddSSQMember(talker, 2, 2, 2, i3, i4) == 0) {
return;

}

} else {
i3 = 0;
if (myself.AddSSQMember(talker, 2, 2, 2, i3, i4) == 0) {
return;

}

}

} else {
i4 = 0;
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_73.htm");
return;

}
if (myself.GetSSQPrevWinner() != 2) {
i0 = myself.GetDepositedSSQItemCount(talker, 2, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 2, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 2, 2);
i3 = i0 * 1 + i1 * 1 + i2 * 10;
if (myself.AddSSQMember(talker, 2, 2, 1, i3, i4) == 0) {
return;

}

} else {
i3 = 0;
if (myself.AddSSQMember(talker, 2, 2, 1, i3, i4) == 0) {
return;

}

}

}
if (2 == 2) {
myself.ShowSystemMessage(talker, 1273);

} else if (2 == 1) {
myself.ShowSystemMessage(talker, 1274);

}
switch (2) {
case 1: {
myself.ShowSystemMessage(talker, 1275);
break;

}
case 2: {
myself.ShowSystemMessage(talker, 1276);
break;

}
case 3: {
myself.ShowSystemMessage(talker, 1277);
break;

}

}
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_14.htm");

} else {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetSSQPrevWinner() == 1) {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1307);
return;

}
i0 = myself.GetDepositedSSQItemCount(talker, 1, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 1, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 1, 2);
if (i0 > 0 || i1 > 0 || i2 > 0) {
i3 = i0 * 3 + i1 * 5 + i2 * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
myself.GiveItem1(talker, 5575, i3);
myself.DeleteDepositedSSQItem(talker, 1, 0, i0);
myself.DeleteDepositedSSQItem(talker, 1, 1, i1);
myself.DeleteDepositedSSQItem(talker, 1, 2, i2);

} else {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, "ssq_npc_priest091.htm");

} else {
myself.ShowPage(talker, "ssq_npc_priest092.htm");

}
return;

}

}

}
i4 = 0;
if (myself.IsInCategory(8, talker.occupation) == 1 || myself.IsInCategory(9, talker.occupation) == 1 || myself.IsInCategory(64, talker.occupation) == 1 || myself.IsInCategory(65, talker.occupation) == 1) {
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_73.htm");
return;

}
switch (gg.GetSSQPart(talker)) {
case 0: {
if (gg.GetSSQPart(talker) == 0) {
if (1 == 2) {
if (myself.IsJoinableToDawn(talker) == 0) {
if (gg.OwnItemCount(talker, 6388) > 0) {
myself.DeleteItem1(talker, 6388, 1);
i4 = 2;

} else if (gg.OwnItemCount(talker, 57) >= 50000) {
myself.DeleteItem1(talker, 57, 50000);
i4 = 3;

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_06.htm");
return;

}

} else {
i4 = 1;

}

} else if (1 == 1) {
i4 = 0;

}

}
break;

}
case 2: {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_08.htm");
return;

}
case 1: {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_41.htm");
return;

}

}
if (myself.GetSSQPrevWinner() != 1) {
i0 = myself.GetDepositedSSQItemCount(talker, 1, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 1, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 1, 2);
i3 = i0 * 1 + i1 * 1 + i2 * 10;
if (myself.AddSSQMember(talker, 1, 2, 2, i3, i4) == 0) {
return;

}

} else {
i3 = 0;
if (myself.AddSSQMember(talker, 1, 2, 2, i3, i4) == 0) {
return;

}

}

} else {
i4 = 0;
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_73.htm");
return;

}
if (myself.GetSSQPrevWinner() != 1) {
i0 = myself.GetDepositedSSQItemCount(talker, 1, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 1, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 1, 2);
i3 = i0 * 1 + i1 * 1 + i2 * 10;
if (myself.AddSSQMember(talker, 1, 2, 1, i3, i4) == 0) {
return;

}

} else {
i3 = 0;
if (myself.AddSSQMember(talker, 1, 2, 1, i3, i4) == 0) {
return;

}

}

}
if (1 == 2) {
myself.ShowSystemMessage(talker, 1273);

} else if (1 == 1) {
myself.ShowSystemMessage(talker, 1274);

}
switch (2) {
case 1: {
myself.ShowSystemMessage(talker, 1275);
break;

}
case 2: {
myself.ShowSystemMessage(talker, 1276);
break;

}
case 3: {
myself.ShowSystemMessage(talker, 1277);
break;

}

}
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_47.htm");

}
break;

}
case 25: {

}
case 59: {
if (ssq_priest_type == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetSSQPrevWinner() == 2) {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1307);
return;

}
i0 = myself.GetDepositedSSQItemCount(talker, 2, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 2, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 2, 2);
if (i0 > 0 || i1 > 0 || i2 > 0) {
i3 = i0 * 3 + i1 * 5 + i2 * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
myself.GiveItem1(talker, 5575, i3);
myself.DeleteDepositedSSQItem(talker, 2, 0, i0);
myself.DeleteDepositedSSQItem(talker, 2, 1, i1);
myself.DeleteDepositedSSQItem(talker, 2, 2, i2);

} else {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, "ssq_npc_priest091.htm");

} else {
myself.ShowPage(talker, "ssq_npc_priest092.htm");

}
return;

}

}

}
i4 = 0;
if (myself.IsInCategory(8, talker.occupation) == 1 || myself.IsInCategory(9, talker.occupation) == 1 || myself.IsInCategory(64, talker.occupation) == 1 || myself.IsInCategory(65, talker.occupation) == 1) {
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_73.htm");
return;

}
switch (gg.GetSSQPart(talker)) {
case 0: {
if (gg.GetSSQPart(talker) == 0) {
if (2 == 2) {
if (myself.IsJoinableToDawn(talker) == 0) {
if (gg.OwnItemCount(talker, 6388) > 0) {
myself.DeleteItem1(talker, 6388, 1);
i4 = 2;

} else if (gg.OwnItemCount(talker, 57) >= 50000) {
myself.DeleteItem1(talker, 57, 50000);
i4 = 3;

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_06.htm");
return;

}

} else {
i4 = 1;

}

} else if (2 == 1) {
i4 = 0;

}

}
break;

}
case 2: {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_08.htm");
return;

}
case 1: {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_41.htm");
return;

}

}
if (myself.GetSSQPrevWinner() != 2) {
i0 = myself.GetDepositedSSQItemCount(talker, 2, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 2, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 2, 2);
i3 = i0 * 1 + i1 * 1 + i2 * 10;
if (myself.AddSSQMember(talker, 2, 3, 2, i3, i4) == 0) {
return;

}

} else {
i3 = 0;
if (myself.AddSSQMember(talker, 2, 3, 2, i3, i4) == 0) {
return;

}

}

} else {
i4 = 0;
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_73.htm");
return;

}
if (myself.GetSSQPrevWinner() != 2) {
i0 = myself.GetDepositedSSQItemCount(talker, 2, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 2, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 2, 2);
i3 = i0 * 1 + i1 * 1 + i2 * 10;
if (myself.AddSSQMember(talker, 2, 3, 1, i3, i4) == 0) {
return;

}

} else {
i3 = 0;
if (myself.AddSSQMember(talker, 2, 3, 1, i3, i4) == 0) {
return;

}

}

}
if (2 == 2) {
myself.ShowSystemMessage(talker, 1273);

} else if (2 == 1) {
myself.ShowSystemMessage(talker, 1274);

}
switch (3) {
case 1: {
myself.ShowSystemMessage(talker, 1275);
break;

}
case 2: {
myself.ShowSystemMessage(talker, 1276);
break;

}
case 3: {
myself.ShowSystemMessage(talker, 1277);
break;

}

}
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_15.htm");

} else {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetSSQPrevWinner() == 1) {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1307);
return;

}
i0 = myself.GetDepositedSSQItemCount(talker, 1, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 1, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 1, 2);
if (i0 > 0 || i1 > 0 || i2 > 0) {
i3 = i0 * 3 + i1 * 5 + i2 * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
myself.GiveItem1(talker, 5575, i3);
myself.DeleteDepositedSSQItem(talker, 1, 0, i0);
myself.DeleteDepositedSSQItem(talker, 1, 1, i1);
myself.DeleteDepositedSSQItem(talker, 1, 2, i2);

} else {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, "ssq_npc_priest091.htm");

} else {
myself.ShowPage(talker, "ssq_npc_priest092.htm");

}
return;

}

}

}
i4 = 0;
if (myself.IsInCategory(8, talker.occupation) == 1 || myself.IsInCategory(9, talker.occupation) == 1 || myself.IsInCategory(64, talker.occupation) == 1 || myself.IsInCategory(65, talker.occupation) == 1) {
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_73.htm");
return;

}
switch (gg.GetSSQPart(talker)) {
case 0: {
if (gg.GetSSQPart(talker) == 0) {
if (1 == 2) {
if (myself.IsJoinableToDawn(talker) == 0) {
if (gg.OwnItemCount(talker, 6388) > 0) {
myself.DeleteItem1(talker, 6388, 1);
i4 = 2;

} else if (gg.OwnItemCount(talker, 57) >= 50000) {
myself.DeleteItem1(talker, 57, 50000);
i4 = 3;

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_06.htm");
return;

}

} else {
i4 = 1;

}

} else if (1 == 1) {
i4 = 0;

}

}
break;

}
case 2: {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_08.htm");
return;

}
case 1: {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_41.htm");
return;

}

}
if (myself.GetSSQPrevWinner() != 1) {
i0 = myself.GetDepositedSSQItemCount(talker, 1, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 1, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 1, 2);
i3 = i0 * 1 + i1 * 1 + i2 * 10;
if (myself.AddSSQMember(talker, 1, 3, 2, i3, i4) == 0) {
return;

}

} else {
i3 = 0;
if (myself.AddSSQMember(talker, 1, 3, 2, i3, i4) == 0) {
return;

}

}

} else {
i4 = 0;
if (myself.GetSSQStatus() != 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_73.htm");
return;

}
if (myself.GetSSQPrevWinner() != 1) {
i0 = myself.GetDepositedSSQItemCount(talker, 1, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 1, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 1, 2);
i3 = i0 * 1 + i1 * 1 + i2 * 10;
if (myself.AddSSQMember(talker, 1, 3, 1, i3, i4) == 0) {
return;

}

} else {
i3 = 0;
if (myself.AddSSQMember(talker, 1, 3, 1, i3, i4) == 0) {
return;

}

}

}
if (1 == 2) {
myself.ShowSystemMessage(talker, 1273);

} else if (1 == 1) {
myself.ShowSystemMessage(talker, 1274);

}
switch (3) {
case 1: {
myself.ShowSystemMessage(talker, 1275);
break;

}
case 2: {
myself.ShowSystemMessage(talker, 1276);
break;

}
case 3: {
myself.ShowSystemMessage(talker, 1277);
break;

}

}
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_48.htm");

}
break;

}
case 26: {

}
case 60: {
if (gg.OwnItemCount(talker, 57) >= 500) {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_17.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_50.htm");

}
myself.GiveItem1(talker, 5707, 1);
myself.DeleteItem1(talker, 57, 500);

} else if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_18.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_51.htm");

}
break;

}
case 27: {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1305);
return;

}
myself.FHTML_SetFileName(fhtml0, szName + "_" + QUEST_ID + "_21.htm");
myself.FHTML_SetInt(fhtml0, "cnt", gg.OwnItemCount(talker, 6360));
myself.ShowFHTML(talker, fhtml0);
break;

}
case 28: {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1305);
return;

}
myself.FHTML_SetFileName(fhtml0, szName + "_" + QUEST_ID + "_22.htm");
myself.FHTML_SetInt(fhtml0, "cnt", gg.OwnItemCount(talker, 6361));
myself.ShowFHTML(talker, fhtml0);
break;

}
case 29: {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1305);
return;

}
myself.FHTML_SetFileName(fhtml0, szName + "_" + QUEST_ID + "_23.htm");
myself.FHTML_SetInt(fhtml0, "cnt", gg.OwnItemCount(talker, 6362));
myself.ShowFHTML(talker, fhtml0);
break;

}
case 61: {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1305);
return;

}
myself.FHTML_SetFileName(fhtml0, szName + "_" + QUEST_ID + "_54.htm");
myself.FHTML_SetInt(fhtml0, "cnt", gg.OwnItemCount(talker, 6360));
myself.ShowFHTML(talker, fhtml0);
break;

}
case 62: {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1305);
return;

}
myself.FHTML_SetFileName(fhtml0, szName + "_" + QUEST_ID + "_55.htm");
myself.FHTML_SetInt(fhtml0, "cnt", gg.OwnItemCount(talker, 6361));
myself.ShowFHTML(talker, fhtml0);
break;

}
case 63: {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1305);
return;

}
myself.FHTML_SetFileName(fhtml0, szName + "_" + QUEST_ID + "_56.htm");
myself.FHTML_SetInt(fhtml0, "cnt", gg.OwnItemCount(talker, 6362));
myself.ShowFHTML(talker, fhtml0);
break;

}
case 31: {
if (ssq_priest_type == 2) {
if (myself.GetSSQStatus() == 1) {
switch (gg.GetSSQPart(talker)) {
case 2: {

}
case 0: {
myself.ShowPage(talker, szName + "001.htm");
return;

}

}

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && myself.GetSSQSealOwner(2) == 2 && gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "026.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && myself.GetSSQSealOwner(2) != 2 && gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "029.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && gg.GetSSQPart(talker) == 2 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "032.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 0 && gg.GetSSQPart(talker) == 2 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "033.htm");
return;

}
if (gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "034.htm");
return;

}
if (myself.GetSSQStatus() == 0) {
myself.ShowPage(talker, szName + "072.htm");
return;

} else if (myself.GetSSQStatus() == 2) {
myself.ShowPage(talker, szName + "085.htm");

} else if (myself.GetSSQStatus() == 3 && gg.GetSSQPart(talker) != 2) {
myself.ShowPage(talker, szName + "083.htm");

}

} else {
if (myself.GetSSQStatus() == 1 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "035.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && myself.GetSSQSealOwner(2) == 1 && gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "059.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && myself.GetSSQSealOwner(2) != 1 && gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "062.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "065.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 0 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "066.htm");
return;

}
if (gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "067.htm");
return;

}
if (myself.GetSSQStatus() == 0) {
myself.ShowPage(talker, szName + "076.htm");
return;

} else if (myself.GetSSQStatus() == 2) {
myself.ShowPage(talker, szName + "086.htm");

} else if (myself.GetSSQStatus() == 3 && gg.GetSSQPart(talker) != 1) {
myself.ShowPage(talker, szName + "084.htm");

}

}
break;

}
case 32: {

}
case 36: {
if (gg.GetSSQPart(talker) == 2 && myself.GetSSQWinner() == 2) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetSSQStatus() != 3) {
myself.ShowSystemMessage(talker, 1307);
return;

}
if (gg.GetSSQPart(talker) != myself.GetSSQWinner()) {
return;

}
i0 = myself.GetDepositedSSQItemCount(talker, 2, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 2, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 2, 2);
if (i0 > 0 || i1 > 0 || i2 > 0) {
i3 = i0 * 3 + i1 * 5 + i2 * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
myself.GiveItem1(talker, 5575, i3);
myself.DeleteDepositedSSQItem(talker, 2, 0, i0);
myself.DeleteDepositedSSQItem(talker, 2, 1, i1);
myself.DeleteDepositedSSQItem(talker, 2, 2, i2);
if (2 == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_30.htm");

} else if (2 == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_60.htm");

}

} else {
if (2 == 2) {
myself.ShowPage(talker, "ssq_npc_priest089.htm");

} else if (2 == 1) {
myself.ShowPage(talker, "ssq_npc_priest090.htm");

}
return;

}

} else if (2 == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_31.htm");

} else if (2 == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_61.htm");

}

}
break;

}
case 30: {

}
case 33: {

}
case 35: {

}
case 67: {

}
case 69: {
if (ssq_priest_type == 2) {
if (myself.GetSSQStatus() == 1) {
switch (gg.GetSSQPart(talker)) {
case 2: {

}
case 0: {
myself.ShowPage(talker, szName + "001.htm");
return;

}

}

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && myself.GetSSQSealOwner(2) == 2 && gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "026.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && myself.GetSSQSealOwner(2) != 2 && gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "029.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && gg.GetSSQPart(talker) == 2 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "032.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 0 && gg.GetSSQPart(talker) == 2 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "033.htm");
return;

}
if (gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "034.htm");
return;

}
if (myself.GetSSQStatus() == 0) {
myself.ShowPage(talker, szName + "072.htm");
return;

} else if (myself.GetSSQStatus() == 2) {
myself.ShowPage(talker, szName + "085.htm");

} else if (myself.GetSSQStatus() == 3 && gg.GetSSQPart(talker) != 2) {
myself.ShowPage(talker, szName + "083.htm");

}

} else {
if (myself.GetSSQStatus() == 1 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "035.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && myself.GetSSQSealOwner(2) == 1 && gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "059.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 1 && myself.GetSSQSealOwner(2) != 1 && gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "062.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 2 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "065.htm");
return;

}
if (myself.GetSSQStatus() == 3 && myself.GetSSQWinner() == 0 && gg.GetSSQPart(talker) == 1 || gg.GetSSQPart(talker) == 0) {
myself.ShowPage(talker, szName + "066.htm");
return;

}
if (gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "067.htm");
return;

}
if (myself.GetSSQStatus() == 0) {
myself.ShowPage(talker, szName + "076.htm");
return;

} else if (myself.GetSSQStatus() == 2) {
myself.ShowPage(talker, szName + "086.htm");

} else if (myself.GetSSQStatus() == 3 && gg.GetSSQPart(talker) != 1) {
myself.ShowPage(talker, szName + "084.htm");

}

}
break;

}
case 66: {

}
case 70: {
if (gg.GetSSQPart(talker) == 1 && myself.GetSSQWinner() == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetSSQStatus() != 3) {
myself.ShowSystemMessage(talker, 1307);
return;

}
if (gg.GetSSQPart(talker) != myself.GetSSQWinner()) {
return;

}
i0 = myself.GetDepositedSSQItemCount(talker, 1, 0);
i1 = myself.GetDepositedSSQItemCount(talker, 1, 1);
i2 = myself.GetDepositedSSQItemCount(talker, 1, 2);
if (i0 > 0 || i1 > 0 || i2 > 0) {
i3 = i0 * 3 + i1 * 5 + i2 * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
myself.GiveItem1(talker, 5575, i3);
myself.DeleteDepositedSSQItem(talker, 1, 0, i0);
myself.DeleteDepositedSSQItem(talker, 1, 1, i1);
myself.DeleteDepositedSSQItem(talker, 1, 2, i2);
if (1 == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_30.htm");

} else if (1 == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_60.htm");

}

} else {
if (1 == 2) {
myself.ShowPage(talker, "ssq_npc_priest089.htm");

} else if (1 == 1) {
myself.ShowPage(talker, "ssq_npc_priest090.htm");

}
return;

}

} else if (1 == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_31.htm");

} else if (1 == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_61.htm");

}

}
break;

}
case 71: {

}
case 73: {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_19.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_52.htm");

}
break;

}
case 74: {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1305);
return;

}
i0 = gg.OwnItemCount(talker, 6360);
i1 = gg.OwnItemCount(talker, 6361);
i2 = gg.OwnItemCount(talker, 6362);
if (i0 > 0 || i1 > 0 || i2 > 0 && gg.GetSSQPart(talker) == 2) {
if (myself.DepositSSQItemEx(talker, 2, i0, i1, i2, i0 + i1 + i2 * 10)) {
if (i0) {
myself.DeleteItem1(talker, 6360, i0);

}
if (i1) {
myself.DeleteItem1(talker, 6361, i1);

}
if (i2) {
myself.DeleteItem1(talker, 6362, i2);

}
if (2 == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_70.htm");

} else if (2 == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_74.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_71.htm");

}
break;

}
case 72: {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1305);
return;

}
i0 = gg.OwnItemCount(talker, 6360);
i1 = gg.OwnItemCount(talker, 6361);
i2 = gg.OwnItemCount(talker, 6362);
if (i0 > 0 || i1 > 0 || i2 > 0 && gg.GetSSQPart(talker) == 1) {
if (myself.DepositSSQItemEx(talker, 1, i0, i1, i2, i0 + i1 + i2 * 10)) {
if (i0) {
myself.DeleteItem1(talker, 6360, i0);

}
if (i1) {
myself.DeleteItem1(talker, 6361, i1);

}
if (i2) {
myself.DeleteItem1(talker, 6362, i2);

}
if (1 == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_70.htm");

} else if (1 == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_74.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_75.htm");

}
break;

}
case 80: {
if (gg.GetSSQPart(talker) == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80a.htm");

}
break;

}
case 82: {
myself.FHTML_SetFileName(fhtml0, szName + "_" + QUEST_ID + "_80b.htm");
myself.FHTML_SetInt(fhtml0, "cnt", gg.OwnItemCount(talker, 6360));
myself.ShowFHTML(talker, fhtml0);
break;

}
case 83: {
myself.FHTML_SetFileName(fhtml0, szName + "_" + QUEST_ID + "_80c.htm");
myself.FHTML_SetInt(fhtml0, "cnt", gg.OwnItemCount(talker, 6361));
myself.ShowFHTML(talker, fhtml0);
break;

}
case 84: {
myself.FHTML_SetFileName(fhtml0, szName + "_" + QUEST_ID + "_80d.htm");
myself.FHTML_SetInt(fhtml0, "cnt", gg.OwnItemCount(talker, 6362));
myself.ShowFHTML(talker, fhtml0);
break;

}
case 85: {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.OwnItemCount(talker, 6360);
i1 = gg.OwnItemCount(talker, 6361);
i2 = gg.OwnItemCount(talker, 6362);
if (i0 > 0 || i1 > 0 || i2 > 0 && gg.GetSSQPart(talker) == 2) {
i3 = i0 * 3 + i1 * 5 + i2 * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
if (i0 > 0) {
if (2 == 2) {
myself.DeleteItem1(talker, 6360, i0);

} else {
myself.DeleteItem1(talker, 6360, i0);

}

}
if (i1 > 0) {
if (2 == 2) {
myself.DeleteItem1(talker, 6361, i1);

} else {
myself.DeleteItem1(talker, 6361, i1);

}

}
if (i2 > 0) {
if (2 == 2) {
myself.DeleteItem1(talker, 6362, i2);

} else {
myself.DeleteItem1(talker, 6362, i2);

}

}
if (i3 > 0) {
myself.GiveItem1(talker, 5575, i3);

}

} else {
if (2 == 2) {
myself.ShowPage(talker, "ssq_npc_priest089.htm");

} else if (2 == 1) {
myself.ShowPage(talker, "ssq_npc_priest090.htm");

}
return;

}
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80e.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80f.htm");

}
break;

}
case 86: {
if (gg.GetSSQPart(talker) == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_81a.htm");

}
break;

}
case 87: {
myself.FHTML_SetFileName(fhtml0, szName + "_" + QUEST_ID + "_81b.htm");
myself.FHTML_SetInt(fhtml0, "cnt", gg.OwnItemCount(talker, 6360));
myself.ShowFHTML(talker, fhtml0);
break;

}
case 88: {
myself.FHTML_SetFileName(fhtml0, szName + "_" + QUEST_ID + "_81c.htm");
myself.FHTML_SetInt(fhtml0, "cnt", gg.OwnItemCount(talker, 6361));
myself.ShowFHTML(talker, fhtml0);
break;

}
case 89: {
myself.FHTML_SetFileName(fhtml0, szName + "_" + QUEST_ID + "_81d.htm");
myself.FHTML_SetInt(fhtml0, "cnt", gg.OwnItemCount(talker, 6362));
myself.ShowFHTML(talker, fhtml0);
break;

}
case 90: {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.OwnItemCount(talker, 6360);
i1 = gg.OwnItemCount(talker, 6361);
i2 = gg.OwnItemCount(talker, 6362);
if (i0 > 0 || i1 > 0 || i2 > 0 && gg.GetSSQPart(talker) == 1) {
i3 = i0 * 3 + i1 * 5 + i2 * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
if (i0 > 0) {
if (1 == 2) {
myself.DeleteItem1(talker, 6360, i0);

} else {
myself.DeleteItem1(talker, 6360, i0);

}

}
if (i1 > 0) {
if (1 == 2) {
myself.DeleteItem1(talker, 6361, i1);

} else {
myself.DeleteItem1(talker, 6361, i1);

}

}
if (i2 > 0) {
if (1 == 2) {
myself.DeleteItem1(talker, 6362, i2);

} else {
myself.DeleteItem1(talker, 6362, i2);

}

}
if (i3 > 0) {
myself.GiveItem1(talker, 5575, i3);

}

} else {
if (1 == 2) {
myself.ShowPage(talker, "ssq_npc_priest089.htm");

} else if (1 == 1) {
myself.ShowPage(talker, "ssq_npc_priest090.htm");

}
return;

}
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_81e.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_81f.htm");

}
break;

}
case 91: {

}
case 92: {

}
case 93: {
if (myself.IsInCategory(7, talker.occupation) == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_04.htm");

} else if (myself.IsInCategory(8, talker.occupation) == 1 && myself.IsJoinableToDawn(talker)) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_05.htm");

} else if (myself.IsInCategory(8, talker.occupation) == 1 && myself.OwnItemCountEx(talker, 5708, myself.GetSSQRoundNumber()) > 0) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_07.htm");

} else if (myself.IsInCategory(9, talker.occupation) == 1 && myself.IsJoinableToDawn(talker)) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_05.htm");

} else if (myself.IsInCategory(9, talker.occupation) == 1 && myself.OwnItemCountEx(talker, 5708, myself.GetSSQRoundNumber()) > 0) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_07.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_07a.htm");

}
break;

}
case 94: {

}
case 95: {

}
case 96: {
if (myself.IsInCategory(7, talker.occupation) == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_38.htm");

} else if (myself.IsInCategory(8, talker.occupation) == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_40.htm");

} else if (myself.IsInCategory(9, talker.occupation) == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_40.htm");

}
break;

}
case 97: {
if (gg.OwnItemCount(talker, 57) >= 50000) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_07.htm");

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_07b.htm");

}
break;

}

}

} else if (ask == -201) {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1305);
return;

}
if (reply > 0) {
if (reply > gg.OwnItemCount(talker, 6360)) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_24.htm");

} else {
switch (ItemTypeA) {
case 0: {
i0 = reply * 1;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, reply, 0, 0, i0)) {
myself.DeleteItem1(talker, ssqitemBlue, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}
case 1: {
i0 = reply * 1;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, 0, reply, 0, i0)) {
myself.DeleteItem1(talker, ssqitemBlue, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}
case 2: {
i0 = reply * 10;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, 0, 0, reply, i0)) {
myself.DeleteItem1(talker, ssqitemBlue, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}

}

}

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_79.htm");

}

} else if (ask == -202) {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1305);
return;

}
if (reply > 0) {
if (reply > gg.OwnItemCount(talker, 6361)) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_24.htm");

} else {
switch (ItemTypeB) {
case 0: {
i0 = reply * 1;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, reply, 0, 0, i0)) {
myself.DeleteItem1(talker, ssqitemGreen, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}
case 1: {
i0 = reply * 1;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, 0, reply, 0, i0)) {
myself.DeleteItem1(talker, ssqitemGreen, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}
case 2: {
i0 = reply * 10;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, 0, 0, reply, i0)) {
myself.DeleteItem1(talker, ssqitemGreen, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}

}

}

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_79.htm");

}

} else if (ask == -203) {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1305);
return;

}
if (reply > 0) {
if (reply > gg.OwnItemCount(talker, 6362)) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_24.htm");

} else {
switch (ItemTypeC) {
case 0: {
i0 = reply * 1;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, reply, 0, 0, i0)) {
myself.DeleteItem1(talker, ssqitemRed, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}
case 1: {
i0 = reply * 1;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, 0, reply, 0, i0)) {
myself.DeleteItem1(talker, ssqitemRed, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}
case 2: {
i0 = reply * 10;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, 0, 0, reply, i0)) {
myself.DeleteItem1(talker, ssqitemRed, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}

}

}

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_79.htm");

}

} else if (ask == -204) {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1305);
return;

}
if (reply > 0) {
if (reply > gg.OwnItemCount(talker, 6360)) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_57.htm");

} else {
switch (ItemTypeA) {
case 0: {
i0 = reply * 1;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, reply, 0, 0, i0)) {
myself.DeleteItem1(talker, ssqitemBlue, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}
case 1: {
i0 = reply * 1;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, 0, reply, 0, i0)) {
myself.DeleteItem1(talker, ssqitemBlue, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}
case 2: {
i0 = reply * 10;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, 0, 0, reply, i0)) {
myself.DeleteItem1(talker, ssqitemBlue, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}

}

}

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80.htm");

}

} else if (ask == -205) {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1305);
return;

}
if (reply > 0) {
if (reply > gg.OwnItemCount(talker, 6361)) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_57.htm");

} else {
switch (ItemTypeB) {
case 0: {
i0 = reply * 1;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, reply, 0, 0, i0)) {
myself.DeleteItem1(talker, ssqitemGreen, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}
case 1: {
i0 = reply * 1;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, 0, reply, 0, i0)) {
myself.DeleteItem1(talker, ssqitemGreen, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}
case 2: {
i0 = reply * 10;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, 0, 0, reply, i0)) {
myself.DeleteItem1(talker, ssqitemGreen, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}

}

}

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80.htm");

}

} else if (ask == -206) {
if (myself.GetSSQStatus() != 1) {
myself.ShowSystemMessage(talker, 1305);
return;

}
if (reply > 0) {
if (reply > gg.OwnItemCount(talker, 6362)) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_57.htm");

} else {
switch (ItemTypeC) {
case 0: {
i0 = reply * 1;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, reply, 0, 0, i0)) {
myself.DeleteItem1(talker, ssqitemRed, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}
case 1: {
i0 = reply * 1;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, 0, reply, 0, i0)) {
myself.DeleteItem1(talker, ssqitemRed, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}
case 2: {
i0 = reply * 10;
if (myself.DepositSSQItemEx(talker, ssq_priest_type, 0, 0, reply, i0)) {
myself.DeleteItem1(talker, ssqitemRed, reply);
if (ssq_priest_type == 2) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_25.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_58.htm");

}

} else {
myself.ShowSystemMessage(talker, 1279);

}
break;

}

}

}

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80.htm");

}

} else if (ask == -207) {
if (myself.GetSSQStatus() != 3) {
myself.ShowSystemMessage(talker, 1307);
return;

}
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.OwnItemCount(talker, 6360);
if (reply > 0) {
if (reply > i0) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80g.htm");

} else {
i3 = reply * 3 + i10 * 5 + i11 * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
if (reply > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6360, reply);

} else {
myself.DeleteItem1(talker, 6360, reply);

}

}
if (i10 > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6361, i10);

} else {
myself.DeleteItem1(talker, 6361, i10);

}

}
if (i11 > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6362, i11);

} else {
myself.DeleteItem1(talker, 6362, i11);

}

}
if (i3 > 0) {
myself.GiveItem1(talker, 5575, i3);

}

} else {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, "ssq_npc_priest089.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, "ssq_npc_priest090.htm");

}
return;

}
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80h.htm");

}

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80i.htm");

}

} else if (ask == -208) {
if (myself.GetSSQStatus() != 3) {
myself.ShowSystemMessage(talker, 1307);
return;

}
i0 = gg.OwnItemCount(talker, 6361);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (reply > 0) {
if (reply > i0) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80g.htm");

} else {
i3 = i9 * 3 + reply * 5 + i11 * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
if (i9 > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6360, i9);

} else {
myself.DeleteItem1(talker, 6360, i9);

}

}
if (reply > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6361, reply);

} else {
myself.DeleteItem1(talker, 6361, reply);

}

}
if (i11 > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6362, i11);

} else {
myself.DeleteItem1(talker, 6362, i11);

}

}
if (i3 > 0) {
myself.GiveItem1(talker, 5575, i3);

}

} else {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, "ssq_npc_priest089.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, "ssq_npc_priest090.htm");

}
return;

}
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80h.htm");

}

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80i.htm");

}

} else if (ask == -209) {
if (myself.GetSSQStatus() != 3) {
myself.ShowSystemMessage(talker, 1307);
return;

}
i0 = gg.OwnItemCount(talker, 6362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (reply > 0) {
if (reply > i0) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80g.htm");

} else {
i3 = i9 * 3 + i10 * 5 + reply * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
if (i9 > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6360, i9);

} else {
myself.DeleteItem1(talker, 6360, i9);

}

}
if (i10 > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6361, i10);

} else {
myself.DeleteItem1(talker, 6361, i10);

}

}
if (reply > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6362, reply);

} else {
myself.DeleteItem1(talker, 6362, reply);

}

}
if (i3 > 0) {
myself.GiveItem1(talker, 5575, i3);

}

} else {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, "ssq_npc_priest089.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, "ssq_npc_priest090.htm");

}
return;

}
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80h.htm");

}

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_80i.htm");

}

} else if (ask == -210) {
if (myself.GetSSQStatus() != 3) {
myself.ShowSystemMessage(talker, 1307);
return;

}
i0 = gg.OwnItemCount(talker, 6360);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (reply > 0) {
if (reply > i0) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_81g.htm");

} else {
i3 = reply * 3 + i10 * 5 + i11 * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
if (reply > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6360, reply);

} else {
myself.DeleteItem1(talker, 6360, reply);

}

}
if (i10 > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6361, i10);

} else {
myself.DeleteItem1(talker, 6361, i10);

}

}
if (i11 > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6362, i11);

} else {
myself.DeleteItem1(talker, 6362, i11);

}

}
if (i3 > 0) {
myself.GiveItem1(talker, 5575, i3);

}

} else {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, "ssq_npc_priest089.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, "ssq_npc_priest090.htm");

}
return;

}
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_81h.htm");

}

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_81i.htm");

}

} else if (ask == -211) {
if (myself.GetSSQStatus() != 3) {
myself.ShowSystemMessage(talker, 1307);
return;

}
i0 = gg.OwnItemCount(talker, 6361);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (reply > 0) {
if (reply > i0) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_81g.htm");

} else {
i3 = i9 * 3 + reply * 5 + i11 * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
if (i9 > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6360, i9);

} else {
myself.DeleteItem1(talker, 6360, i9);

}

}
if (reply > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6361, reply);

} else {
myself.DeleteItem1(talker, 6361, reply);

}

}
if (i11 > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6362, i11);

} else {
myself.DeleteItem1(talker, 6362, i11);

}

}
if (i3 > 0) {
myself.GiveItem1(talker, 5575, i3);

}

} else {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, "ssq_npc_priest089.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, "ssq_npc_priest090.htm");

}
return;

}
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_81h.htm");

}

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_81i.htm");

}

} else if (ask == -212) {
if (myself.GetSSQStatus() != 3) {
myself.ShowSystemMessage(talker, 1307);
return;

}
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.OwnItemCount(talker, 6362);
if (reply > 0) {
if (reply > i0) {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_81g.htm");

} else {
i3 = i9 * 3 + i10 * 5 + reply * 10;
if (gg.OwnItemCount(talker, 5575) + i3 < 2147483647) {
if (i9 > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6360, i9);

} else {
myself.DeleteItem1(talker, 6360, i9);

}

}
if (i10 > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6361, i10);

} else {
myself.DeleteItem1(talker, 6361, i10);

}

}
if (reply > 0) {
if (ssq_priest_type == 2) {
myself.DeleteItem1(talker, 6362, reply);

} else {
myself.DeleteItem1(talker, 6362, reply);

}

}
if (i3 > 0) {
myself.GiveItem1(talker, 5575, i3);

}

} else {
if (ssq_priest_type == 2) {
myself.ShowPage(talker, "ssq_npc_priest089.htm");

} else if (ssq_priest_type == 1) {
myself.ShowPage(talker, "ssq_npc_priest090.htm");

}
return;

}
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_81h.htm");

}

} else {
myself.ShowPage(talker, szName + "_" + QUEST_ID + "_81i.htm");

}

} else if (ask == -303) {
myself.ShowMultisell(reply, talker);

}
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
if (myself.GetSSQStatus() != 3) {
if (gg.GetSSQPart(talker) == ssq_priest_type) {
if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, PositionCompetition, ShopName, "", "", "", 5575, gg.MakeFString(1000309, "", "", "", "", ""));

}

} else if (ssq_priest_type == 2) {
myself.ShowPage(talker, "ssq_npc_priest087.htm");

} else {
myself.ShowPage(talker, "ssq_npc_priest088.htm");

}

} else if (myself.GetSSQStatus() == 3 && gg.GetSSQPart(talker) == myself.GetSSQWinner()) {
if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, Position, ShopName, "", "", "", 5575, gg.MakeFString(1000309, "", "", "", "", ""));

}

}
	}

	protected void ON_SSQ_SYSTEM_EVENT(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 1 && reply == 1) {
myself.EffectMusic(myself.sm, 0, "SSQ_Neutral_01");
myself.BroadcastSystemMessage(myself.sm, 0, 1210);

} else if (ask == 1 && reply == 0) {
myself.EffectMusic(myself.sm, 0, "SSQ_Neutral_01");
myself.BroadcastSystemMessage(myself.sm, 0, 1211);

} else if (ask == 3 && reply == 1) {
myself.BroadcastSystemMessage(myself.sm, 0, 1218);
if (myself.GetSSQWinner() == 1) {
myself.EffectMusic(myself.sm, 0, "SSQ_Dusk_01");

} else if (myself.GetSSQWinner() == 2) {
myself.EffectMusic(myself.sm, 0, "SSQ_Dawn_01");

}
if (myself.GetSSQSealOwner(1) == 2) {
myself.BroadcastSystemMessage(myself.sm, 0, 1212);

} else if (myself.GetSSQSealOwner(1) == 1) {
myself.BroadcastSystemMessage(myself.sm, 0, 1215);

}
if (myself.GetSSQSealOwner(2) == 2) {
myself.BroadcastSystemMessage(myself.sm, 0, 1213);

} else if (myself.GetSSQSealOwner(2) == 1) {
myself.BroadcastSystemMessage(myself.sm, 0, 1216);

}
if (myself.GetSSQSealOwner(3) == 2) {
myself.BroadcastSystemMessage(myself.sm, 0, 1214);

} else if (myself.GetSSQSealOwner(3) == 1) {
myself.BroadcastSystemMessage(myself.sm, 0, 1217);

}

} else if (ask == 3 && reply == 0) {
myself.EffectMusic(myself.sm, 0, "SSQ_Neutral_01");
myself.BroadcastSystemMessage(myself.sm, 0, 1219);

} else if (ask == 2 && reply == 1) {
if (myself.GetSSQWinner() == 1) {
myself.BroadcastSystemMessage(myself.sm, 0, 1240);

} else if (myself.GetSSQWinner() == 2) {
myself.BroadcastSystemMessage(myself.sm, 0, 1241);

}

}
	}


}