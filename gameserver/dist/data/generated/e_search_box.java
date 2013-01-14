package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class e_search_box extends default_npc {
	protected int search_AW_1 = 8678;
	protected int search_AW_2 = 8679;
	protected int search_AW_3 = 8680;
	protected int search_AW_4 = 8681;
	protected int search_AW_5 = 8682;
	protected int search_AW_6 = 8683;
	protected int search_AW_7 = 8684;
	protected int search_AW_8 = 8685;
	protected int search_AW_9 = 8686;
	protected int search_AW_10 = 8687;
	protected int search_AW_11 = 8688;
	protected int search_jaru1 = 10254;
	protected int search_jaru2 = 10255;
	protected int search_jaru3 = 10256;
	protected int search_jaru4 = 10257;
	protected int search_jaru5 = 10258;
	protected int search_jaru6 = 10259;
	protected int search_piece = 10272;
	protected int search_wolfride = 10273;

	protected void CREATED() {
myself.i_ai0 = 0;
if (gg.Rand(50) < 1) {
if (myself.Skill_GetConsumeMP(206831617) < myself.sm.mp && myself.Skill_GetConsumeHP(206831617) < myself.sm.hp && myself.Skill_InReuseDelay(206831617) == 0) {
myself.AddUseSkillDesire(myself.sm, 206831617, 1, 1, 1000000);

}
myself.i_ai0 = 1;

}
myself.i_ai1 = 1;
myself.AddTimerEx(1112, 4000);
myself.AddTimerEx(1111, 15000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 1111) {
if (gg.Rand(2) < 1 && myself.i_ai1 == 1) {
if (gg.Rand(3) < 1) {
myself.Say(gg.MakeFString(1600022, "", "", "", "", ""));

} else if (gg.Rand(2) < 1) {
myself.Say(gg.MakeFString(1600004, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1600005, "", "", "", "", ""));

}

}
myself.i_ai1 = 0;
myself.AddTimerEx(1113, 3000);

} else if (timer_id == 1112) {
if (gg.Rand(3) < 1 && myself.i_ai1 == 1) {
if (gg.Rand(4) < 1) {
myself.Say(gg.MakeFString(1600007, "", "", "", "", ""));

} else if (gg.Rand(3) < 1) {
myself.Say(gg.MakeFString(1600008, "", "", "", "", ""));

} else if (gg.Rand(2) < 1) {
myself.Say(gg.MakeFString(1600009, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1600010, "", "", "", "", ""));

}

}
myself.AddTimerEx(1112, 4000);

} else if (timer_id == 1113) {
myself.Despawn();

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
if (skill_name_id == 41287681) {
myself.i_ai1 = 0;
myself.Say(gg.MakeFString(1600006, "", "", "", "", ""));
if (myself.i_ai0 == 1) {
i0 = gg.Rand(100000);
if (i0 < 1) {
i1 = gg.Rand(11);
if (i1 < 1) {
myself.GiveItem1(attacker, search_AW_1, 1);

} else if (i1 < 2) {
myself.GiveItem1(attacker, search_AW_2, 1);

} else if (i1 < 3) {
myself.GiveItem1(attacker, search_AW_3, 1);

} else if (i1 < 4) {
myself.GiveItem1(attacker, search_AW_4, 1);

} else if (i1 < 5) {
myself.GiveItem1(attacker, search_AW_5, 1);

} else if (i1 < 6) {
myself.GiveItem1(attacker, search_AW_6, 1);

} else if (i1 < 7) {
myself.GiveItem1(attacker, search_AW_7, 1);

} else if (i1 < 8) {
myself.GiveItem1(attacker, search_AW_8, 1);

} else if (i1 < 9) {
myself.GiveItem1(attacker, search_AW_9, 1);

} else if (i1 < 10) {
myself.GiveItem1(attacker, search_AW_10, 1);

} else {
myself.GiveItem1(attacker, search_AW_11, 1);

}

} else if (i0 < 13500) {
myself.GiveItem1(attacker, search_wolfride, 1);

} else if (i0 < 31500) {
i1 = gg.Rand(10000);
if (i1 < 24) {
myself.GiveItem1(attacker, search_jaru1, 1);

} else if (i1 < 628) {
myself.GiveItem1(attacker, search_jaru2, 1);

} else if (i1 < 1835) {
myself.GiveItem1(attacker, search_jaru3, 1);

} else if (i1 < 3560) {
myself.GiveItem1(attacker, search_jaru4, 1);

} else if (i1 < 5975) {
myself.GiveItem1(attacker, search_jaru5, 1);

} else {
myself.GiveItem1(attacker, search_jaru6, 1);

}

} else {
myself.GiveItem1(attacker, search_piece, 5 + gg.Rand(11));

}

}
myself.Suicide();

}
	}


}