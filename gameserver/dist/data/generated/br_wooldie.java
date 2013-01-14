package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_wooldie extends default_npc {
	protected int WAIT_STATE1 = 20090801;
	protected int WAIT_STATE2 = 20090802;
	protected int WAIT_STATE3 = 20090803;
	protected int WAIT_STATE4 = 20090804;
	protected int FAIL_STATE1 = 20090811;
	protected int FAIL_STATE2 = 20090812;
	protected int GAME_STATE1 = 20090821;
	protected int GAME_STATE2 = 20090822;
	protected int GAME_STATE3 = 20090823;
	protected int GAME_STATE4 = 20090824;
	protected int GAME_STATE5 = 20090825;
	protected int GAME_WIN_STATE1 = 20090831;
	protected int GAME_WIN_STATE2 = 20090832;
	protected int GAME_WIN_STATE3 = 20090833;
	protected int FSTRING_VALUE = 0;

	protected void CREATED() {
myself.Say(gg.MakeFString(MakeFString + FSTRING_VALUE, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.master, 1515323393, 1, 0, 1000000);
myself.AddTimerEx(WAIT_STATE1, 4000);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == WAIT_STATE1) {
myself.Say(gg.MakeFString(MakeFString + FSTRING_VALUE, "", "", "", "", ""));
myself.AddTimerEx(WAIT_STATE3, 1000);

} else if (timer_id == WAIT_STATE2) {
if (myself.i_ai2 == 1) {
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(MakeFString + FSTRING_VALUE, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(MakeFString + FSTRING_VALUE, "", "", "", "", ""));

}

}

} else if (timer_id == WAIT_STATE3) {
myself.AddUseSkillDesire(myself.master, 1515257857, 1, 0, 1000000);
myself.AddTimerEx(WAIT_STATE4, 950);
if (myself.i_ai3 != 0 && gg.Rand(100) < 40) {
myself.AddTimerEx(WAIT_STATE2, 3000);

}
myself.AddTimerEx(GAME_STATE4, 7000);

} else if (timer_id == WAIT_STATE4) {
myself.i_ai2 = 1;

} else if (timer_id == FAIL_STATE1) {
myself.Say(gg.MakeFString(MakeFString + FSTRING_VALUE, "", "", "", "", ""));
myself.AddTimerEx(FAIL_STATE2, 3500);

} else if (timer_id == FAIL_STATE2) {
myself.Say(gg.MakeFString(MakeFString + FSTRING_VALUE, "", "", "", "", ""));
myself.AddTimerEx(WAIT_STATE1, 3500);

} else if (timer_id == GAME_STATE1) {
if (gg.GetEventValue(0) == 0) {
myself.i_ai0 = gg.Rand(20) % 2 + 1;

} else if (gg.GetEventValue(0) == 1) {
myself.i_ai0 = 1;

} else if (gg.GetEventValue(0) == 2) {
myself.i_ai0 = 2;

} else {
myself.i_ai0 = gg.Rand(20) % 2 + 1;

}
if (myself.i_ai0 == 1) {
myself.AddUseSkillDesire(myself.sm, 1513357313, 1, 0, 1000000);

} else if (myself.i_ai0 == 2) {
myself.AddUseSkillDesire(myself.sm, 1513422849, 1, 0, 1000000);

}
myself.AddTimerEx(GAME_STATE2, 2000);
myself.AddTimerEx(GAME_STATE3, 3000);

} else if (timer_id == GAME_STATE2) {
if (myself.i_ai0 == myself.i_ai1) {
myself.i_ai3 = myself.i_ai3 + 1;
switch (myself.i_ai3) {
case 1: {
myself.i_ai4 = 1513684993;
break;

}
case 2: {
myself.i_ai4 = 1513750529;
break;

}
case 3: {
myself.i_ai4 = 1513816065;
break;

}
case 4: {
myself.i_ai4 = 1513881601;
break;

}
case 5: {
myself.i_ai4 = 1513947137;
break;

}
case 6: {
myself.i_ai4 = 1514012673;
break;

}
case 7: {
myself.i_ai4 = 1514078209;
break;

}
case 8: {
myself.i_ai4 = 1514143745;
break;

}
case 9: {
myself.i_ai4 = 1514209281;
break;

}
case 10: {
myself.i_ai4 = 1514274817;
break;

}
case 11: {
myself.i_ai4 = 1514340353;
break;

}
case 12: {
myself.i_ai4 = 1514405889;
break;

}
case 13: {
myself.i_ai4 = 1514471425;
break;

}
case 14: {
myself.i_ai4 = 1514536961;
break;

}
case 15: {
myself.i_ai4 = 1514602497;
break;

}
case 16: {
myself.i_ai4 = 1514668033;
break;

}
case 17: {
myself.i_ai4 = 1514733569;
break;

}
case 18: {
myself.i_ai4 = 1514799105;
break;

}
case 19: {
myself.i_ai4 = 1514864641;
break;

}
case 20: {
myself.i_ai4 = 1514930177;

}

}
myself.AddUseSkillDesire(myself.master, myself.i_ai4, 1, 0, 1000000);

} else {
myself.AddUseSkillDesire(myself.master, 1513619457, 1, 0, 1000000);

}

} else if (timer_id == GAME_STATE3) {
if (myself.i_ai0 == myself.i_ai1) {
if (myself.i_ai3 >= 5) {
myself.InsertEventRanking(20091031, myself.master, myself.i_ai3);

}
myself.AddEffectActionDesire(myself.sm, 2, 2000, 1000000);
if (myself.i_ai3 == 1 || myself.i_ai3 >= 16 && myself.i_ai3 <= 19) {
myself.Say(gg.MakeFString(MakeFString + FSTRING_VALUE, "", "", "", "", ""));

} else if (myself.i_ai3 == 20) {
myself.Say(gg.MakeFString(MakeFString + FSTRING_VALUE, "", "", "", "", ""));

} else if (myself.i_ai3 >= 5 && myself.i_ai3 <= 15) {
myself.i_ai4 = 1900051 + FSTRING_VALUE + myself.i_ai3 - 5 * 2;
myself.Say(gg.MakeFString(myself.i_ai4, "", "", "", "", ""));

}
myself.ShowSystemMessageStr(myself.master, gg.MakeFString(1900081, myself.master.name, gg.IntToStr(myself.i_ai3), "", "", ""));
switch (myself.i_ai3) {
case 1: {

}
case 2: {

}
case 3: {

}
case 4: {

}
case 16: {

}
case 17: {

}
case 18: {

}
case 19: {

}
case 20: {
myself.i_ai4 = 20706;
break;

}
case 5: {
myself.i_ai4 = 20717;
break;

}
case 6: {
myself.i_ai4 = 22025;
break;

}
case 7: {
myself.i_ai4 = 5593;
break;

}
case 8: {
myself.i_ai4 = 3934;
break;

}
case 9: {
myself.i_ai4 = 13339;
break;

}
case 10: {
myself.i_ai4 = 20335;
break;

}
case 11: {
myself.i_ai4 = 20739;
break;

}
case 12: {
myself.i_ai4 = 20740;
break;

}
case 13: {
myself.i_ai4 = 20554;
break;

}
case 14: {
myself.i_ai4 = 20494;
break;

}
case 15: {
myself.i_ai4 = 20723;

}

}
if (myself.GetInventoryInfo(myself.master, 0) > myself.GetInventoryInfo(myself.master, 1) * 0.800000 || myself.GetInventoryInfo(myself.master, 2) > myself.GetInventoryInfo(myself.master, 3) * 0.800000) {
myself.ShowSystemMessage(myself.master, 6006);

} else {
myself.GiveItem1(myself.master, myself.i_ai4, 1);
if (myself.i_ai3 == 10) {
myself.GiveItem1(myself.master, 20392, 4);

}

}
if (myself.i_ai3 == 20) {
myself.AddTimerEx(GAME_WIN_STATE2, 4000);
myself.BroadcastSystemMessageStr(myself.master, 0, gg.MakeFString(1900082, myself.master.name, gg.IntToStr(myself.i_ai3), "", "", ""));

} else if (myself.i_ai3 == 15) {
myself.AddTimerEx(GAME_STATE5, 4000);
myself.BroadcastSystemMessageStr(myself.master, 0, gg.MakeFString(1900082, myself.master.name, gg.IntToStr(myself.i_ai3), "", "", ""));

} else {
myself.AddTimerEx(WAIT_STATE1, 5000);

}

} else {
myself.AddEffectActionDesire(myself.sm, 1, 3000, 1000000);
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(MakeFString + FSTRING_VALUE, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(MakeFString + FSTRING_VALUE, "", "", "", "", ""));

}
myself.AddTimerEx(GAME_WIN_STATE1, 3000);

}
myself.i_ai1 = 0;

} else if (timer_id == GAME_STATE4) {
if (myself.i_ai2 == 1) {
myself.i_ai2 = 0;
if (myself.i_ai4 == 0) {
myself.Say(gg.MakeFString(MakeFString + FSTRING_VALUE, "", "", "", "", ""));
myself.AddTimerEx(FAIL_STATE1, 3500);
myself.i_ai4 = 1;

} else {
myself.Say(gg.MakeFString(MakeFString + FSTRING_VALUE, "", "", "", "", ""));
myself.AddTimerEx(GAME_WIN_STATE2, 4000);
myself.AddLogByNpc2(127, myself.master, "jack_game", "nocard_ending", myself.i_ai3, 2, 0, 0, 0, 0);

}

}

} else if (timer_id == GAME_STATE5) {
myself.Say(gg.MakeFString(MakeFString + FSTRING_VALUE, "", "", "", "", ""));
myself.AddTimerEx(WAIT_STATE1, 4000);

} else if (timer_id == GAME_WIN_STATE1) {
myself.CastBuffForQuestReward(myself.master, 1513291777);
myself.AddLogByNpc2(127, myself.master, "jack_game", "normal_ending", myself.i_ai3, 1, 0, 0, 0, 0);
myself.AddTimerEx(GAME_WIN_STATE2, 2000);

} else if (timer_id == GAME_WIN_STATE2) {
myself.Despawn();

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam c0) {
if (myself.i_ai2 == 1 && attacker.id == myself.master.id) {
if (skill_name_id == 1384120321) {
myself.i_ai2 = 0;
myself.CastBuffForQuestReward(attacker, 1513488385);
myself.i_ai1 = 1;
myself.AddTimerEx(GAME_STATE1, 1);

} else if (skill_name_id == 1384185857) {
myself.i_ai2 = 0;
myself.CastBuffForQuestReward(attacker, 1513553921);
myself.i_ai1 = 2;
myself.AddTimerEx(GAME_STATE1, 1);

}

}
	}


}