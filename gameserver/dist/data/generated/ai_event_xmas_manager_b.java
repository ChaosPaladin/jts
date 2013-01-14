package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_xmas_manager_b extends default_npc {
	protected int debug_mode = 0;
	protected int item_XMAS_HAT = 14613;
	protected int item_XMAS_SOCKS = 14612;
	protected int item_COST_XMAS_SOCKS = 2000;
	protected int item_XMAS_GIFT_NORMAL = 14619;
	protected int item_XMAS_GIFT_JACKPOT = 14620;
	protected int skill_DOMINION_REG = 458752001;
	protected int skill_XMAS_FESTIVAL = 400162817;
	protected int skill_XMAS_5WIN = 399966213;
	protected int skill_DOMINION_GLUDIO = 400228353;
	protected int skill_DOMINION_DION = 400293889;
	protected int skill_DOMINION_GIRAN = 400359425;
	protected int skill_DOMINION_OREN = 400424961;
	protected int skill_DOMINION_ADEN = 400490497;
	protected int skill_DOMINION_HEINESS = 400556033;
	protected int skill_DOMINION_GODARD = 400621569;
	protected int skill_DOMINION_RUNE = 400687105;
	protected int skill_DOMINION_SCHTGART = 400752641;
	protected String fnHi = "cat_of_xmas1001.htm";

	protected void TALKED(HandlerParam talker, HandlerParam i0) {
if (debug_mode) {
myself.Say("TALKED");

}
myself.ShowPage(talker, fnHi);
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam s0) {
if (ask == -1225) {
if (debug_mode) {
myself.Say("ASK 확인, reply는 : " + reply);

}
switch (reply) {
case 4: {
if (gg.OwnItemCount(talker, item_XMAS_GIFT_NORMAL) > 0) {
myself.ShowPage(talker, "cat_of_xmas1062.htm");

} else if (gg.OwnItemCount(talker, item_XMAS_GIFT_JACKPOT) > 0) {
myself.ShowPage(talker, "cat_of_xmas1061.htm");

} else {
myself.ShowPage(talker, "cat_of_xmas1063.htm");

}
break;

}
case 101: {
i1 = 14621;
break;

}
case 102: {
i1 = 14622;
break;

}
case 103: {
i1 = 14625;
break;

}
case 104: {
i1 = 14623;
break;

}
case 105: {
i1 = 14624;
break;

}
case 106: {
i1 = 14630;
break;

}
case 107: {
i1 = 14631;
break;

}
case 108: {
i1 = 14628;
break;

}
case 109: {
i1 = 14627;
break;

}
case 110: {
i1 = 14626;
break;

}
case 111: {
i1 = 14674;
break;

}
case 112: {
i1 = 14632;
break;

}
case 113: {
i1 = 14634;
break;

}
case 114: {
i1 = 14633;
break;

}
case 511: {
i1 = 2500;
s0 = "다크 레기온";
break;

}
case 512: {
i1 = 81;
s0 = "드래곤 슬레이어";
break;

}
case 513: {
i1 = 236;
s0 = "소울세퍼레이터";
break;

}
case 514: {
i1 = 164;
s0 = "엘리시온";
break;

}
case 515: {
i1 = 7902;
s0 = "둠 크러셔";
break;

}
case 516: {
i1 = 7895;
s0 = "드래곤 플레임 헤드";
break;

}
case 517: {
i1 = 213;
s0 = "세계수의 가지";
break;

}
case 518: {
i1 = 270;
s0 = "드래곤 그라인더";
break;

}
case 519: {
i1 = 289;
s0 = "영혼의 활";
break;

}
case 520: {
i1 = 305;
s0 = "탈룸 글레이브";
break;

}
case 521: {
i1 = 5706;
s0 = "다마스커스*다마스커스";
break;

}
case 522: {
i1 = 9340;
s0 = "그리드 스팅거";
break;

}
case 523: {
i1 = 9344;
s0 = "데스브링거";
break;

}
case 524: {
i1 = 9348;
s0 = "소울 슈터";
break;

}

}
if (reply >= 101 && reply <= 114) {
myself.GiveItem1(talker, i1, 1);
myself.DeleteItem1(talker, item_XMAS_GIFT_NORMAL, 1);
myself.ShowPage(talker, "cat_of_xmas1064.htm");

}
if (reply >= 511 && reply <= 524) {
i2 = 10 + gg.Rand(6);
myself.GiveItemEx(talker, i1, i2, 1);
myself.DeleteItem1(talker, item_XMAS_GIFT_JACKPOT, 1);
myself.BroadcastSystemMessageStr(myself.sm, 0, gg.MakeFString(1800753, talker.name, gg.IntToStr(i2), s0, "", ""));
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 2, 0, 1, 1, 1, 1, 5 * 1000, 0, gg.MakeFString(1800753, talker.name, gg.IntToStr(i2), s0, "", ""));
myself.ShowPage(talker, "cat_of_xmas1065.htm");

}

}
	}


}