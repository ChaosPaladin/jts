package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_xmas_giver_santa extends default_npc {
	protected int debug_mode = 0;
	protected int GM_ID = -1;
	protected int item_XMAS_GIFT = 14616;
	protected int item_XMAS_SOCKS = 14612;
	protected int skill_DOMINION_REG = 400228353;
	protected int timer_XMAS_GIFT_START = 2220;
	protected int timer_XMAS_GIFT_01 = 2221;
	protected int timer_XMAS_GIFT_02 = 2222;
	protected int timer_XMAS_GIFT_END = 2225;
	protected int timer_XMAS_GIFT_MUSIC = 2226;

	protected void CREATED() {
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.param1);
myself.i_ai0 = 0;
myself.AddTimerEx(timer_XMAS_GIFT_START, 5 * 1000);
myself.AddTimerEx(timer_XMAS_GIFT_MUSIC, 2 * 1000);
if (debug_mode) {
myself.Shout("선물 산타 정상적으로 스폰!! 현위치 X : " + myself.sm.x + " Y : " + myself.sm.y + " Z : " + myself.sm.z);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam i0) {
if (timer_id == timer_XMAS_GIFT_MUSIC) {
myself.EffectMusic(myself.sm, 10000, "EV_02");

}
if (timer_id == timer_XMAS_GIFT_START) {
if (gg.Rand(2) == 0) {
myself.Say(gg.MakeFString(1800739, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800740, "", "", "", "", ""));

}
myself.AddEffectActionDesire(myself.sm, 1, 170, 10000000);
myself.AddTimerEx(timer_XMAS_GIFT_01, 5 * 1000);

} else if (timer_id == timer_XMAS_GIFT_01) {
if (myself.IsNullCreature(myself.c_ai0) == 1) {
if (debug_mode) {
myself.Shout("선물 줄 크리쳐가 없네!");

}

} else if (gg.Rand(2) == 1) {
myself.Say(gg.MakeFString(1800741, myself.c_ai0.name, "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800742, myself.c_ai0.name, "", "", "", ""));

}
myself.AddEffectActionDesire(myself.sm, 5, 280, 10000000);
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(skill_DOMINION_REG)) > 0) {
myself.Dispel(myself.c_ai0, myself.Skill_GetAbnormalType(skill_DOMINION_REG));
if (gg.OwnItemCount(myself.c_ai0, item_XMAS_SOCKS) >= 1) {
myself.DeleteItem1(myself.c_ai0, item_XMAS_SOCKS, 1);

}
myself.GiveItem1(myself.c_ai0, item_XMAS_GIFT, 1);

} else {
myself.AddTimerEx(timer_XMAS_GIFT_END, 5 * 1000);

}
myself.AddTimerEx(timer_XMAS_GIFT_02, 5 * 1000);

} else if (timer_id == timer_XMAS_GIFT_02) {
if (gg.Rand(2) == 1) {
myself.Say(gg.MakeFString(1800743, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800744, "", "", "", "", ""));

}
myself.AddTimerEx(timer_XMAS_GIFT_END, 5 * 1000);

} else if (timer_id == timer_XMAS_GIFT_END) {
myself.Suicide();

}
	}


}