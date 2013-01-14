package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_basic_forge extends warrior_basic {
	protected int Skill02_Probablity = 2000;
	protected int Skill02_Check_Dist = 1;
	protected int HateClass1 = 71;
	protected double HateClass1Boost = 5.000000;
	protected double HATE_SKILL_Weight_Point = 30.000000;
	protected int TID_MOB_COUNT_REFRESH = 78001;
	protected int TIME_MOB_COUNT_REFRESH = 15;
	protected int MobCount_bonus_min = 3;
	protected int MobCount_bonus_upper_lv01 = 5;
	protected int MobCount_bonus_upper_lv02 = 10;
	protected int MobCount_bonus_upper_lv03 = 15;
	protected int MobCount_bonus_upper_lv04 = 20;
	protected int MobCount_bonus_upper_lv05 = 35;
	protected int MobCount_bonus_lower_lv01 = 5;
	protected int MobCount_bonus_lower_lv02 = 10;
	protected int MobCount_bonus_lower_lv03 = 15;
	protected int Prob_forge_bonus01 = 20;
	protected int Prob_forge_bonus02 = 40;
	protected int mode = 0;
	protected int babble_mode = 0;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.AddTimerEx(TID_MOB_COUNT_REFRESH, TIME_MOB_COUNT_REFRESH * 1000);
super;
	}

	protected void SEE_CREATURE() {
if (babble_mode == 1) {
myself.Say("보임");

}
super;
	}

	protected void CLAN_DIED(HandlerParam victim) {
if (victim != myself.sm && myself.DistFromMe(victim) <= 300 && victim.npc_class_id != 1018799 && victim.npc_class_id != 1018800 && victim.npc_class_id != 1018801 && victim.npc_class_id != 1018802 && victim.npc_class_id != 1018803 && victim.npc_class_id != 1022642 && victim.npc_class_id != 1022643) {
myself.i_ai1 = myself.i_ai1 + 1;
if (babble_mode == 1) {
myself.Say("사망 신호 접수:" + myself.i_ai1 + "회");

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == TID_MOB_COUNT_REFRESH) {
if (myself.sm.alive == 1 && myself.i_ai1 > 0 && gg.FloatToInt(myself.sm.hp) == gg.FloatToInt(myself.sm.max_hp)) {
myself.i_ai1 = 0;

}
myself.AddTimerEx(TID_MOB_COUNT_REFRESH, TIME_MOB_COUNT_REFRESH * 1000);

}
super;
	}

	protected void MY_DYING(HandlerParam i0) {
if (babble_mode == 1) {
myself.Say("사망 - 접수된 주변 사망 수:" + myself.i_ai1 + "회");

}
i0 = gg.Rand(100);
if (mode == 1 && myself.Maker_GetNpcCount() < 48) {
if (myself.i_ai1 > MobCount_bonus_lower_lv03 && i0 <= Prob_forge_bonus02) {
if (babble_mode == 1) {
myself.Say("5단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018803, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (myself.i_ai1 > MobCount_bonus_lower_lv02 && myself.i_ai1 <= MobCount_bonus_lower_lv03) {
if (i0 <= Prob_forge_bonus01) {
if (babble_mode == 1) {
myself.Say("5단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018803, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (i0 <= Prob_forge_bonus02) {
if (babble_mode == 1) {
myself.Say("4단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018802, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else if (myself.i_ai1 > MobCount_bonus_lower_lv01 && myself.i_ai1 <= MobCount_bonus_lower_lv02) {
if (i0 <= Prob_forge_bonus01) {
if (babble_mode == 1) {
myself.Say("4단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018802, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (i0 <= Prob_forge_bonus02) {
if (babble_mode == 1) {
myself.Say("3단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018801, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

}
if (myself.i_ai1 >= MobCount_bonus_min && myself.i_ai1 <= MobCount_bonus_lower_lv01) {
if (i0 <= Prob_forge_bonus01) {
if (babble_mode == 1) {
myself.Say("3단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018801, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (i0 <= Prob_forge_bonus02) {
if (babble_mode == 1) {
myself.Say("2단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018800, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

}

} else if (myself.Maker_GetNpcCount() < 32) {
if (myself.i_ai1 > MobCount_bonus_upper_lv05 && i0 <= Prob_forge_bonus02) {
if (babble_mode == 1) {
myself.Say("5단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018803, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (myself.i_ai1 > MobCount_bonus_upper_lv04 && myself.i_ai1 <= MobCount_bonus_upper_lv05) {
if (i0 <= Prob_forge_bonus01) {
if (babble_mode == 1) {
myself.Say("5단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018803, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (i0 <= Prob_forge_bonus02) {
if (babble_mode == 1) {
myself.Say("4단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018802, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else if (myself.i_ai1 > MobCount_bonus_upper_lv03 && myself.i_ai1 <= MobCount_bonus_upper_lv04) {
if (i0 <= Prob_forge_bonus01) {
if (babble_mode == 1) {
myself.Say("4단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018802, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (i0 <= Prob_forge_bonus02) {
if (babble_mode == 1) {
myself.Say("3단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018801, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else if (myself.i_ai1 > MobCount_bonus_upper_lv02 && myself.i_ai1 <= MobCount_bonus_upper_lv03) {
if (i0 <= Prob_forge_bonus01) {
if (babble_mode == 1) {
myself.Say("3단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018801, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (i0 <= Prob_forge_bonus02) {
if (babble_mode == 1) {
myself.Say("2단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018800, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else if (myself.i_ai1 > MobCount_bonus_upper_lv01 && myself.i_ai1 <= MobCount_bonus_upper_lv02) {
if (i0 <= Prob_forge_bonus01) {
if (babble_mode == 1) {
myself.Say("2단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018800, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (i0 <= Prob_forge_bonus02) {
if (babble_mode == 1) {
myself.Say("1단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018799, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

}
if (myself.i_ai1 >= MobCount_bonus_min && myself.i_ai1 <= MobCount_bonus_upper_lv01 && i0 <= Prob_forge_bonus01) {
if (babble_mode == 1) {
myself.Say("1단계 보너스 스폰");

}
myself.CreateOnePrivateEx(1018799, "wizard_bonus_forge", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

}
super;
	}


}