package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_organ_dummy extends default_npc {
	protected void CREATED(HandlerParam c0, HandlerParam i0) {
myself.i_ai9 = 0;
c0 = gg.GetCreatureFromID(myself.sm.param1);
if (myself.IsNullCreature(c0) == 0) {
if (myself.i_ai9 == 1) {
myself.Shout("카메라 시작");

}
myself.i_ai6 = c0.id;

}
if (myself.i_ai9 == 1) {
myself.Shout("카메라 시작");

}
myself.AddTimerEx(1000, 1);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam i0) {
c0 = gg.GetCreatureFromID(myself.i_ai6);
if (timer_id == 1000) {
myself.EffectMusic(myself.sm, 6000, "BS04_A");
myself.SpecialCamera3(myself.sm, 2500, 180, 20, 0, 5000, 10000, 20, 90, 1, 1, 1);
myself.AddTimerEx(1001, 100);

}
if (timer_id == 1001) {
myself.SpecialCamera3(myself.sm, 2500, 180, 20, 100, 5000, 10000, 20, 90, 1, 1, 1);
myself.AddTimerEx(1002, 400);

} else if (timer_id == 1002) {
myself.SpecialCamera3(myself.sm, 2000, 190, 0, 4000, 5000, 10000, 0, 30, 1, 1, 1);
myself.AddTimerEx(1003, 4000);

} else if (timer_id == 1003) {
myself.SpecialCamera3(myself.sm, 100, 180, 0, 5000, 5000, 10000, 0, 0, 1, 1, 1);
myself.AddTimerEx(1004, 7300);

} else if (timer_id == 1004) {
myself.SpecialCamera3(myself.sm, 5, 165, -15, 0, 5000, 10000, 6, 15, 1, 1, 1);
myself.AddTimerEx(1005, 7300);

} else if (timer_id == 1005) {
myself.SpecialCamera3(myself.sm, 1100, 240, 0, 0, 5000, 10000, 210, 0, 1, 1, 1);
myself.AddTimerEx(1006, 100);

} else if (timer_id == 1006) {
myself.SpecialCamera3(myself.sm, 1100, 240, 0, 0, 5000, 10000, 210, 0, 1, 1, 1);
myself.AddTimerEx(1007, 3400);

} else if (timer_id == 1007) {
myself.SpecialCamera3(myself.sm, 150, 180, 0, 0, 5000, 10000, 0, 0, 1, 1, 1);
myself.AddTimerEx(1008, 100);

} else if (timer_id == 1008) {
myself.SpecialCamera3(myself.sm, 150, 180, 0, 0, 5000, 10000, 0, 0, 1, 1, 1);
myself.AddTimerEx(1009, 400);

} else if (timer_id == 1009) {
myself.SpecialCamera3(myself.sm, 50, 180, 20, 4000, 5000, 10000, 0, -5, 1, 1, 1);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 0, 200);

}
myself.AddTimerEx(1010, 5000);

} else if (timer_id == 1010) {
myself.SpecialCamera3(myself.sm, 0, 280, 40, 0, 5000, 10000, 0, 0, 1, 1, 1);
myself.AddTimerEx(1011, 2500);

} else if (timer_id == 1011) {
myself.SpecialCamera3(myself.sm, 500, 230, 45, 7500, 5000, 10000, 15, 3, 1, 1, 1);
myself.AddTimerEx(1012, 7500);

} else if (timer_id == 1012) {
myself.SpecialCamera3(myself.sm, 2100, 200, 13, 9000, 5000, 10000, 4, 10, 1, 1, 1);
myself.AddTimerEx(1013, 9500);

} else if (timer_id == 1013) {
myself.SpecialCamera3(myself.sm, 2000, 190, 0, 0, 5000, 10000, -50, 45, 1, 1, 1);
myself.AddTimerEx(1014, 100);

} else if (timer_id == 1014) {
myself.SpecialCamera3(myself.sm, 2000, 190, 0, 0, 5000, 10000, -50, 45, 1, 1, 1);
myself.AddTimerEx(1015, 1000);

} else if (timer_id == 1015) {
myself.SpecialCamera3(myself.sm, 2000, 195, 0, 1800, 5000, 10000, -47, 42, 1, 1, 1);
myself.AddTimerEx(1016, 1800);

} else if (timer_id == 1016) {
myself.SpecialCamera3(myself.sm, 2000, 195, 0, 600, 5000, 10000, -47, 0, 1, 1, 1);
myself.AddTimerEx(1017, 2800);

} else if (timer_id == 1017) {
myself.SpecialCamera3(myself.sm, 1800, 175, 0, 0, 5000, 10000, 40, -3, 1, 1, 1);
myself.AddTimerEx(1018, 100);

} else if (timer_id == 1018) {
myself.SpecialCamera3(myself.sm, 1800, 175, 0, 0, 5000, 10000, 40, -3, 1, 1, 1);
myself.AddTimerEx(1019, 900);

} else if (timer_id == 1019) {
myself.SpecialCamera3(myself.sm, 2000, 180, 1, 2000, 5000, 3000, 0, -5, 1, 1, 1);
myself.AddTimerEx(1020, 3000);

} else if (timer_id == 1020) {
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) < 20) {
myself.AddAttackDesire(c0, 0, 200);

}
myself.AddTimerEx(1020, 10000);

} else if (timer_id == 2000) {
myself.SpecialCamera3(myself.sm, 500, 210, 10, 0, 5000, 10000, 10, 0, 1, 1, 1);
myself.AddTimerEx(2001, 100);

} else if (timer_id == 2001) {
myself.SpecialCamera3(myself.sm, 500, 210, 10, 0, 5000, 10000, 10, 0, 1, 1, 1);
myself.AddTimerEx(2002, 400);

} else if (timer_id == 2002) {
myself.SpecialCamera3(myself.sm, 5, 210, 10, 5500, 5000, 10000, 0, 0, 1, 1, 1);
myself.AddTimerEx(2003, 5500);

} else if (timer_id == 2003) {
myself.SpecialCamera3(myself.sm, 5, 150, 10, 0, 5000, 10000, 0, 0, 1, 1, 1);
myself.AddTimerEx(2004, 100);

} else if (timer_id == 2004) {
myself.SpecialCamera3(myself.sm, 5, 150, 10, 0, 5000, 10000, 0, 0, 1, 1, 1);
myself.AddTimerEx(2005, 1000);

} else if (timer_id == 2005) {
myself.SpecialCamera3(myself.sm, 1500, 180, 10, 6000, 5000, 6000, 0, 13, 1, 1, 1);
myself.AddTimerEx(2006, 6000);

} else if (timer_id == 3000) {
myself.SpecialCamera3(myself.sm, 0, 230, 10, 0, 5000, 10000, 0, -5, 1, 1, 1);
myself.AddTimerEx(3001, 100);

} else if (timer_id == 3001) {
myself.RemoveAllDesire();
myself.AddUseSkillDesire(c0, 328007681, 1, 0, 1000000);
myself.SpecialCamera3(myself.sm, 0, 230, 10, 0, 5000, 10000, 0, -5, 1, 1, 1);
myself.AddTimerEx(3002, 400);

} else if (timer_id == 3002) {
myself.SpecialCamera3(myself.sm, 0, 180, 10, 5000, 5000, 10000, 0, -5, 1, 1, 1);
myself.AddTimerEx(3006, 7000);

} else if (timer_id == 3006) {
myself.SpecialCamera3(myself.sm, 1000, 180, 15, 8000, 5000, 8000, 0, 10, 1, 1, 1);
myself.AddTimerEx(3007, 8000);

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private.class_id == 1029045) {
myself.Suicide();

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg2 == 50000) {
myself.AddTimerEx(2000, 1000);

} else if (script_event_arg2 == 8) {
myself.AddTimerEx(3000, 5000);

}
	}


}