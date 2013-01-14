package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guild_master_test_helper1 extends merchant_for_chaotic {
	protected String fnHi = "test_server_helper001.htm";
	protected String fnSell = "test_server_helper002.htm";
	protected String fnBuy = "test_server_helper003.htm";
	protected String fnUnableItemSell = "test_server_helper005.htm";
	protected String fnYouAreThirdClass = "test_server_helper010.htm";
	protected String fnYouAreFourthClass = "test_server_helper011.htm";
	protected String fnHumanFighter = "test_server_helper012.htm";
	protected String fnHumanMage = "test_server_helper013.htm";
	protected String fnElfFighter = "test_server_helper014.htm";
	protected String fnElfMage = "test_server_helper015.htm";
	protected String fnDElfFighter = "test_server_helper016.htm";
	protected String fnDElfMage = "test_server_helper017.htm";
	protected String fnOrcFighter = "test_server_helper018.htm";
	protected String fnOrcMage = "test_server_helper019.htm";
	protected String fnDwarfFighter = "test_server_helper020.htm";
	protected String fnAfterClassChange = "test_server_helper021.htm";
	protected String fnPledgeLevelUP = "test_server_helper022.htm";
	protected String fnLowLevel = "test_server_helper023.htm";
	protected String fnKamael = "test_server_helper030.htm";
	protected int type = 0;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -4 && reply == 1) {
if (type == 0) {
myself.ShowPage(talker, "test_server_helper001a.htm");

} else {
myself.ShowPage(talker, "test_server_helper001b.htm");

}

}
if (ask == -6 && reply == 1) {
if (talker.nobless_type == 1) {
myself.ShowPage(talker, "test_server_helper025b.htm");

} else if (talker.level < 75) {
myself.ShowPage(talker, "test_server_helper025a.htm");

} else {
myself.SetNobless(talker);
myself.SetOneTimeQuestFlag(talker, 235, 1);
myself.ShowPage(talker, "test_server_helper025.htm");

}

}
if (ask == -7 && reply == 1) {
if (myself.IsInCategory(6, talker.occupation) == 1) {
if (talker.level < 20) {
myself.ShowPage(talker, "test_server_helper027.htm");
return;

}
if (talker.race == 0) {
switch (talker.occupation) {
case 0: {
myself.ShowPage(talker, "test_server_helper026a.htm");
break;

}
case 10: {
myself.ShowPage(talker, "test_server_helper026b.htm");
break;

}

}

} else if (talker.race == 1) {
switch (talker.occupation) {
case 18: {
myself.ShowPage(talker, "test_server_helper026c.htm");
break;

}
case 25: {
myself.ShowPage(talker, "test_server_helper026d.htm");
break;

}

}

} else if (talker.race == 2) {
switch (talker.occupation) {
case 31: {
myself.ShowPage(talker, "test_server_helper026e.htm");
break;

}
case 38: {
myself.ShowPage(talker, "test_server_helper026f.htm");
break;

}

}

} else if (talker.race == 3) {
switch (talker.occupation) {
case 44: {
myself.ShowPage(talker, "test_server_helper026g.htm");
break;

}
case 49: {
myself.ShowPage(talker, "test_server_helper026h.htm");
break;

}

}

} else if (talker.race == 4) {
switch (talker.occupation) {
case 53: {
myself.ShowPage(talker, "test_server_helper026i.htm");
break;

}

}

} else if (talker.race == 5) {
switch (talker.occupation) {
case 123: {
myself.ClassChange(talker, 125);
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 124: {
myself.ClassChange(talker, 126);
myself.ShowPage(talker, fnAfterClassChange);
break;

}

}

}

} else if (myself.IsInCategory(7, talker.occupation) == 1) {
myself.ShowPage(talker, "test_server_helper028.htm");

} else if (myself.IsInCategory(8, talker.occupation) == 1) {
myself.ShowPage(talker, fnYouAreThirdClass);

} else if (myself.IsInCategory(9, talker.occupation) == 1) {
myself.ShowPage(talker, fnYouAreFourthClass);

}

}
if (ask == -2 && reply == 1) {
if (myself.IsInCategory(7, talker.occupation) == 1) {
if (talker.level < 40) {
myself.ShowPage(talker, fnLowLevel);
return;

}
if (talker.race == 0) {
switch (talker.occupation) {
case 0: {
myself.ShowPage(talker, fnHumanFighter);
break;

}
case 1: {
myself.ShowPage(talker, "test_server_helper012a.htm");
break;

}
case 4: {
myself.ShowPage(talker, "test_server_helper012b.htm");
break;

}
case 7: {
myself.ShowPage(talker, "test_server_helper012c.htm");
break;

}
case 10: {
myself.ShowPage(talker, fnHumanMage);
break;

}
case 11: {
myself.ShowPage(talker, "test_server_helper013a.htm");
break;

}
case 15: {
myself.ShowPage(talker, "test_server_helper013b.htm");
break;

}

}

} else if (talker.race == 1) {
switch (talker.occupation) {
case 18: {
myself.ShowPage(talker, fnElfFighter);
break;

}
case 19: {
myself.ShowPage(talker, "test_server_helper014a.htm");
break;

}
case 22: {
myself.ShowPage(talker, "test_server_helper014b.htm");
break;

}
case 25: {
myself.ShowPage(talker, fnElfMage);
break;

}
case 26: {
myself.ShowPage(talker, "test_server_helper015a.htm");
break;

}
case 29: {
myself.ShowPage(talker, "test_server_helper015b.htm");
break;

}

}

} else if (talker.race == 2) {
switch (talker.occupation) {
case 31: {
myself.ShowPage(talker, fnDElfFighter);
break;

}
case 32: {
myself.ShowPage(talker, "test_server_helper016a.htm");
break;

}
case 35: {
myself.ShowPage(talker, "test_server_helper016b.htm");
break;

}
case 38: {
myself.ShowPage(talker, fnDElfMage);
break;

}
case 39: {
myself.ShowPage(talker, "test_server_helper017a.htm");
break;

}
case 42: {
myself.ShowPage(talker, "test_server_helper017b.htm");
break;

}

}

} else if (talker.race == 3) {
switch (talker.occupation) {
case 44: {
myself.ShowPage(talker, fnOrcFighter);
break;

}
case 45: {
myself.ShowPage(talker, "test_server_helper018a.htm");
break;

}
case 47: {
myself.ShowPage(talker, "test_server_helper018b.htm");
break;

}
case 49: {
myself.ShowPage(talker, fnOrcMage);
break;

}
case 50: {
myself.ShowPage(talker, fnOrcMage);
break;

}

}

} else if (talker.race == 4) {
switch (talker.occupation) {
case 53: {
myself.ShowPage(talker, fnDwarfFighter);
break;

}
case 56: {
myself.ShowPage(talker, "test_server_helper020b.htm");
break;

}
case 54: {
myself.ShowPage(talker, "test_server_helper020a.htm");
break;

}

}

} else if (talker.race == 5) {
switch (talker.occupation) {
case 125: {
myself.ShowPage(talker, "test_server_helper020c.htm");
break;

}
case 126: {
myself.ShowPage(talker, "test_server_helper020d.htm");
break;

}

}

}

} else if (myself.IsInCategory(8, talker.occupation) == 1) {
myself.ShowPage(talker, fnYouAreThirdClass);

} else if (myself.IsInCategory(9, talker.occupation) == 1) {
myself.ShowPage(talker, fnYouAreFourthClass);

} else {
myself.ShowPage(talker, "test_server_helper029.htm");

}

}
if (ask == -5 && reply == 1) {
if (myself.IsInCategory(8, talker.occupation) == 1 && talker.level > 75) {
switch (talker.occupation) {
case 2: {
myself.ClassChange(talker, 88);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 3: {
myself.ClassChange(talker, 89);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 5: {
myself.ClassChange(talker, 90);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 6: {
myself.ClassChange(talker, 91);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 8: {
myself.ClassChange(talker, 93);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 9: {
myself.ClassChange(talker, 92);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 12: {
myself.ClassChange(talker, 94);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 13: {
myself.ClassChange(talker, 95);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 14: {
myself.ClassChange(talker, 96);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 16: {
myself.ClassChange(talker, 97);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.GiveItem1(talker, 15307, 1);
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 17: {
myself.ClassChange(talker, 98);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 20: {
myself.ClassChange(talker, 99);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 21: {
myself.ClassChange(talker, 100);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 23: {
myself.ClassChange(talker, 101);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 24: {
myself.ClassChange(talker, 102);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 27: {
myself.ClassChange(talker, 103);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 28: {
myself.ClassChange(talker, 104);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 30: {
myself.ClassChange(talker, 105);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.GiveItem1(talker, 15308, 1);
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 33: {
myself.ClassChange(talker, 106);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 34: {
myself.ClassChange(talker, 107);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 36: {
myself.ClassChange(talker, 108);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 37: {
myself.ClassChange(talker, 109);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 40: {
myself.ClassChange(talker, 110);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 41: {
myself.ClassChange(talker, 111);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 43: {
myself.ClassChange(talker, 112);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.GiveItem1(talker, 15309, 4);
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 46: {
myself.ClassChange(talker, 113);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 48: {
myself.ClassChange(talker, 114);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 51: {
myself.ClassChange(talker, 115);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 52: {
myself.ClassChange(talker, 116);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 55: {
myself.ClassChange(talker, 117);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 57: {
myself.ClassChange(talker, 118);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 127: {
myself.ClassChange(talker, 131);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 128: {
myself.ClassChange(talker, 132);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 129: {
myself.ClassChange(talker, 133);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 130: {
myself.ClassChange(talker, 134);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}
case 135: {
myself.ClassChange(talker, 136);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
break;

}

}

} else if (myself.IsInCategory(9, talker.occupation) == 1) {
myself.ShowPage(talker, fnYouAreFourthClass);

} else {
myself.ShowPage(talker, "test_server_helper024.htm");

}

}
if (ask == -3) {
if (reply == 0) {
if (talker.level < 10) {
myself.ShowPage(talker, "pl002.htm");

} else if (talker.is_pledge_master != 0) {
myself.ShowPage(talker, "pl003.htm");

} else if (talker.pledge_id != 0) {
myself.ShowPage(talker, "pl004.htm");

} else {
myself.ShowPage(talker, "pl005.htm");

}

} else if (reply == 2) {
if (talker.is_pledge_master != 0) {
myself.ShowPage(talker, "pl007.htm");

} else {
myself.ShowPage(talker, "pl008.htm");

}

} else if (reply == 3) {
if (talker.is_pledge_master != 0) {
myself.ShowPage(talker, "pl010.htm");

} else {
myself.ShowPage(talker, "pl011.htm");

}

} else if (reply == 1) {
if (talker.is_pledge_master != 0) {
myself.ShowPage(talker, fnPledgeLevelUP);

} else {
myself.ShowPage(talker, "pl014.htm");

}

}

}
if (ask == -1) {
if (reply == 0) {
myself.ShowBuySell(talker, SellList0, BuyList0, -50);

} else if (reply == 1) {
myself.ShowBuySell(talker, SellList1, BuyList0, -50);

} else if (reply == 2) {
myself.ShowBuySell(talker, SellList2, BuyList0, -50);

} else if (reply == 3) {
myself.ShowBuySell(talker, SellList3, BuyList0, -50);

} else if (reply == 4) {
myself.ShowBuySell(talker, SellList4, BuyList0, -50);

} else if (reply == 5) {
myself.ShowBuySell(talker, SellList5, BuyList0, -50);

} else if (reply == 6) {
myself.ShowBuySell(talker, SellList6, BuyList0, -50);

} else if (reply == 7) {
myself.ShowBuySell(talker, SellList7, BuyList0, -50);

} else {
super;

}

}
if (ask == -8 && reply == 1) {
if (myself.IsNullCreature(talker) == 0) {
gg.SetSkillAll(talker);

}

}
if (ask == -1006) {
if (reply == 1) {
if (myself.GetOneTimeQuestFlag(talker, 133) == 0) {
myself.SetOneTimeQuestFlag(talker, 133, 1);

}
myself.InstantTeleport(talker, -11272, 236464, -3248);

}

}
if (ask == -303) {
if (reply == 622) {
myself.ShowMultisell(622, talker);

} else if (reply == 644) {
myself.ShowMultisell(644, talker);

} else if (reply == 695) {
myself.ShowMultisell(695, talker);

} else if (reply == 696) {
myself.ShowMultisell(696, talker);

} else if (reply == 697) {
myself.ShowMultisell(697, talker);

}

}
	}

	protected void CLASS_CHANGE_REQUESTED(HandlerParam talker, HandlerParam occupation_name_id) {
if (myself.IsInCategory(6, talker.occupation) && talker.level > 19) {
if (myself.IsInCategory(7, occupation_name_id)) {
myself.ClassChange(talker, occupation_name_id);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
return;

}

} else if (myself.IsInCategory(7, talker.occupation) && talker.level > 39) {
if (myself.IsInCategory(8, occupation_name_id)) {
myself.ClassChange(talker, occupation_name_id);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
return;

}

} else if (myself.IsInCategory(8, talker.occupation) && talker.level > 74) {
if (myself.IsInCategory(9, occupation_name_id)) {
myself.ClassChange(talker, occupation_name_id);
myself.SoundEffect(talker, "ItemSound.quest_fanfare_2");
myself.ShowPage(talker, fnAfterClassChange);
return;

}

}
	}

	protected void LEVEL_UP_PLEDGE(HandlerParam talker, HandlerParam reply) {
if (reply == 0) {
myself.PledgeLevelUp(talker, 1);

} else if (reply == 1) {
myself.PledgeLevelUp(talker, 2);

} else if (reply == 2) {
myself.PledgeLevelUp(talker, 3);

} else if (reply == 3) {
myself.PledgeLevelUp(talker, 4);

} else if (reply == 4) {
myself.PledgeLevelUp(talker, 5);

}
	}


}