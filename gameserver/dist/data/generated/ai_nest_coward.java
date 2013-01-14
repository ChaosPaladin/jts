package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_nest_coward extends warrior_use_skill {
	protected int reward_adena = 1000000;
	protected int reward_adena_small = 10000;
	protected int reward_num = 10;
	protected int reward_prob = 10;
	protected int reward_prob_small = 1000;
	protected int stop_attack_sec = 10;
	protected double stop_attack_hp = 0.300000;
	protected double allow_attack_hp = 0.100000;
	protected int SKILL_display = 408551425;
	protected int TIMER_SAY = 33311;
	protected int TIMER_check_hp = 33312;
	protected int TIMER_RUNAWAY = 33313;
	protected int TIMER_DESPAWN = 33314;
	protected int debug_mode = 0;
	protected int debug_reward_prob = 50000;

	protected void CREATED() {
super;
myself.i_ai5 = 0;
myself.i_ai6 = 0;
myself.i_ai7 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (myself.i_ai5 == 0) {
if (debug_mode) {
myself.Say("전투 시작");

}
myself.i_ai5 = 1;
myself.AddTimerEx(TIMER_SAY, gg.Rand(5) + 3 * 1000);

} else if (myself.i_ai5 == 1) {
if (myself.sm.hp < myself.sm.max_hp * stop_attack_hp) {
if (debug_mode) {
myself.Say("이벤트 조건 충족! - starting TIMER_check_hp");

}
myself.Say(gg.MakeFString(1800832, "", "", "", "", ""));
myself.AddTimerEx(TIMER_check_hp, stop_attack_sec * 1000);
myself.i_ai5 = 2;
myself.i_ai6 = gg.FloatToInt(myself.sm.hp);

}

} else if (myself.i_ai5 == 2) {
if (debug_mode) {
myself.Say("지금은 공격을 멈춰야 하는 phase임!");

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam c0) {
super;
if (timer_id == TIMER_SAY) {
if (myself.i_ai5 == 1) {
i0 = gg.Rand(2) + 1;
if (i0 == 1) {
myself.Say(gg.MakeFString(1800833, "", "", "", "", ""));

} else if (i0 == 2) {
myself.Say(gg.MakeFString(1800834, "", "", "", "", ""));

}

}
myself.AddTimerEx(TIMER_SAY, gg.Rand(5) + 5 * 1000);

} else if (timer_id == TIMER_check_hp) {
if (debug_mode) {
myself.Say("TIMER_check_hp!");
myself.Say("타이머 시작시 HP : " + myself.i_ai6);
myself.Say("현재 HP : " + gg.FloatToInt(myself.sm.hp));
myself.Say("HP 변동 허용폭 : " + myself.sm.max_hp * stop_attack_hp - allow_attack_hp);
myself.Say("판정식 : " + myself.i_ai6 + " - " + gg.FloatToInt(myself.sm.hp) + " = " + myself.i_ai6 - gg.FloatToInt(myself.sm.hp));
if (myself.i_ai6 - gg.FloatToInt(myself.sm.hp) < myself.sm.max_hp * stop_attack_hp - allow_attack_hp) {
myself.Say("조건 만족");

} else {
myself.Say("조건 불만족");

}

}
if (myself.i_ai6 - gg.FloatToInt(myself.sm.hp) < myself.sm.max_hp * stop_attack_hp - allow_attack_hp) {
if (gg.Rand(100000) < reward_prob || debug_mode == 1 && gg.Rand(100000) < debug_reward_prob) {
if (debug_mode) {
myself.Say("(대박) 아데나 드랍!");

}
i0 = gg.Rand(2) + 1;
if (i0 == 1) {
myself.Say(gg.MakeFString(1800835, "", "", "", "", ""));

} else if (i0 == 2) {
myself.Say(gg.MakeFString(1800836, "", "", "", "", ""));

}
myself.RemoveAllDesire();
myself.StopMove();
myself.i_ai7 = 1;
myself.AddUseSkillDesire(myself.sm, SKILL_display, 1, 0, 100000000);
myself.AddTimerEx(TIMER_RUNAWAY, 3 * 1000);

} else if (gg.Rand(100000) < reward_prob_small || debug_mode == 1 && gg.Rand(100000) < debug_reward_prob) {
if (debug_mode) {
myself.Say("(소박) 아데나 드랍!");

}
i0 = gg.Rand(2) + 1;
if (i0 == 1) {
myself.Say(gg.MakeFString(1800835, "", "", "", "", ""));

} else if (i0 == 2) {
myself.Say(gg.MakeFString(1800871, "", "", "", "", ""));

}
myself.RemoveAllDesire();
myself.StopMove();
myself.i_ai7 = 2;
myself.AddUseSkillDesire(myself.sm, SKILL_display, 1, 0, 100000000);
myself.AddTimerEx(TIMER_RUNAWAY, 3 * 1000);

} else {
if (debug_mode) {
myself.Say("아이템 드랍 실패!");

}
i0 = gg.Rand(2) + 1;
if (i0 == 1) {
myself.Say(gg.MakeFString(1800837, "", "", "", "", ""));

} else if (i0 == 2) {
myself.Say(gg.MakeFString(1800838, "", "", "", "", ""));

}
myself.AddTimerEx(TIMER_RUNAWAY, 1000);

}

}

} else if (timer_id == TIMER_RUNAWAY) {
myself.RemoveAllDesire();
myself.StopMove();
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0) {
myself.AddFleeDesire(myself.GetLastAttacker(), 10000000);

}
myself.AddTimerEx(TIMER_DESPAWN, 3000);

} else if (timer_id == TIMER_DESPAWN) {
myself.Despawn();

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success, HandlerParam c0, HandlerParam i0) {
if (SKILL_display != 0 && success == 1) {
if (skill_name_id == SKILL_display) {
if (debug_mode) {
if (myself.i_ai7 == 1) {
myself.Say("드랍 아데나(고정) : " + reward_adena);
myself.Say("드랍 갯수(고정) : " + reward_num);

} else if (myself.i_ai7 == 2) {
myself.Say("드랍 아데나(고정) : " + reward_adena_small);
myself.Say("드랍 갯수(고정) : " + reward_num);

}

}
c0 = myself.GetLastAttacker();
for (i0 = 0; i0 < reward_num; i0 = i0 + 1) {
if (myself.i_ai7 == 1) {
if (myself.IsNullCreature(c0) == 0) {
myself.DropItem2(myself.sm, 57, reward_adena, c0.id);

} else {
myself.DropItem1(myself.sm, 57, reward_adena);

}

} else if (myself.i_ai7 == 2) {
if (myself.IsNullCreature(c0) == 0) {
myself.DropItem2(myself.sm, 57, reward_adena_small, c0.id);

} else {
myself.DropItem1(myself.sm, 57, reward_adena_small);

}

}

}

}

}
	}

	protected void MY_DYING(HandlerParam i0) {
if (debug_mode) {
myself.Say("MY_DYING! 맞아죽었다");

}
myself.i_ai5 = 3;
i0 = gg.Rand(2) + 1;
if (i0 == 1) {
myself.Say(gg.MakeFString(1800839, "", "", "", "", ""));

} else if (i0 == 2) {
myself.Say(gg.MakeFString(1800840, "", "", "", "", ""));

}
	}


}