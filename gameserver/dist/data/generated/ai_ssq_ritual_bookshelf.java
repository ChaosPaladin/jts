package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ssq_ritual_bookshelf extends default_npc {
	protected String fnHi = "chi.htm";
	protected String fnSuccess = "bookshelf2_dawn_q0195_02.htm";
	protected String fnFailed = "bookshelf2_dawn_q0195_03.htm";
	protected String fnScroll = "bookshelf2_dawn_q0195_02a.htm";
	protected String fnDame = "bookshelf2_dawn_q0195_02c.htm";
	protected String fnExit = "bookshelf2_dawn_q0195_02b.htm";
	protected int quest_name = 195;
	protected int ITEM_contract = 13823;
	protected int debug_mode = 0;

	protected void CREATED() {
if (debug_mode) {
myself.Say("나 나왔슈!" + myself.sm.param1);

}
	}

	protected void TALKED(HandlerParam talker) {
if (gg.OwnItemCount(talker, ITEM_contract) > 0 && myself.sm.param1 == 1) {
if (debug_mode) {
myself.Say("계약서만 받고 HTML 삭제 뒤 다시 말 건 경우");

}
myself.ShowPage(talker, fnDame);

} else {
myself.ShowPage(talker, fnHi);

}
if (debug_mode) {
if (myself.sm.param1 == 1) {
if (debug_mode) {
myself.Say("성공");

}

} else if (myself.sm.param1 == 2) {
if (debug_mode) {
myself.Say("실패");

}

} else if (debug_mode) {
myself.Say("ERR param1값 에러");

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0) {
if (ask == 195) {
if (reply == 1) {
if (myself.sm.param1 == 1 && gg.HaveMemo(talker, quest_name) == 1 && gg.GetMemoState(talker, quest_name) == 3) {
if (debug_mode) {
myself.Say("조건이 맞다! 아이템 줌");

}
myself.ShowPage(talker, fnSuccess);
myself.GiveItem1(talker, ITEM_contract, 1);

} else if (myself.sm.param1 == 2) {
if (debug_mode) {
myself.Say("난 안주는 책장일 뿐이고");

}
myself.ShowPage(talker, fnFailed);

}

} else if (reply == 2) {
myself.ShowPage(talker, fnScroll);

} else if (reply == 3) {
if (debug_mode) {
myself.Say("인존 종료");

}
myself.ShowPage(talker, fnExit);
myself.InstantZone_Leave(talker);

}

}
	}


}