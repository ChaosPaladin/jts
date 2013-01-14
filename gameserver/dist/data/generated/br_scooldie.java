package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_scooldie extends br_wooldie {
	protected int FSTRING_VALUE = 52;

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == WAIT_STATE1) {
myself.Say(gg.MakeFString(1900094, "", "", "", "", ""));
myself.AddTimerEx(WAIT_STATE3, 1000);

} else if (timer_id == WAIT_STATE2) {
if (myself.i_ai2 == 1) {
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(1900045, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1900047, "", "", "", "", ""));

}

}

} else if (timer_id == WAIT_STATE3) {
myself.AddUseSkillDesire(myself.master, 1515257857, 1, 0, 1000000);
myself.AddTimerEx(WAIT_STATE4, 950);
if (myself.i_ai3 != 0) {
myself.AddTimerEx(WAIT_STATE2, 3000);

}
myself.AddTimerEx(GAME_STATE4, 7500);

} else if (timer_id == WAIT_STATE4) {
myself.i_ai2 = 1;

} else if (timer_id == FAIL_STATE1) {
myself.Say(gg.MakeFString(1900100, "", "", "", "", ""));
myself.AddTimerEx(FAIL_STATE2, 4000);

} else if (timer_id == FAIL_STATE2) {
myself.Say(gg.MakeFString(1900101, "", "", "", "", ""));
myself.AddTimerEx(WAIT_STATE1, 4000);

} else if (timer_id == GAME_STATE1) {
myself.i_ai0 = gg.Rand(20) % 2 + 1;
if (myself.i_ai0 == 1) {
myself.AddUseSkillDesire(myself.sm, 1513357313, 1, 0, 1000000);

} else if (myself.i_ai0 == 2) {
myself.AddUseSkillDesire(myself.sm, 1513422849, 1, 0, 1000000);

}
myself.AddTimerEx(GAME_STATE2, 3000);

} else if (timer_id == GAME_STATE2) {
myself.i_ai3 = myself.i_ai3 + 1;
if (myself.i_ai0 == myself.i_ai1) {
myself.AddEffectActionDesire(myself.sm, 2, 2000, 1000000);
myself.Say(gg.MakeFString(1900095, "", "", "", "", ""));

} else {
myself.AddEffectActionDesire(myself.sm, 1, 3000, 1000000);
myself.Say(gg.MakeFString(1900096, "", "", "", "", ""));

}
if (myself.i_ai3 == 3) {
myself.AddTimerEx(GAME_WIN_STATE1, 6000);

} else {
myself.AddTimerEx(GAME_STATE3, 4000);

}

} else if (timer_id == GAME_STATE3) {
if (myself.i_ai0 == myself.i_ai1) {
myself.Say(gg.MakeFString(1900097, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1900098, "", "", "", "", ""));

}
myself.AddTimerEx(WAIT_STATE1, 6000);

} else if (timer_id == GAME_STATE4) {
if (myself.i_ai2 == 1) {
myself.i_ai2 = 0;
if (myself.i_ai4 == 0) {
myself.Say(gg.MakeFString(1900099, "", "", "", "", ""));
myself.AddTimerEx(FAIL_STATE1, 4000);
myself.i_ai4 = 1;

} else {
myself.Say(gg.MakeFString(1900102, "", "", "", "", ""));
myself.AddTimerEx(GAME_WIN_STATE2, 4000);

}

}

} else if (timer_id == GAME_WIN_STATE1) {
myself.Say(gg.MakeFString(1900103, "", "", "", "", ""));
myself.AddTimerEx(GAME_WIN_STATE2, 5500);

} else if (timer_id == GAME_WIN_STATE2) {
myself.Despawn();

}
	}


}