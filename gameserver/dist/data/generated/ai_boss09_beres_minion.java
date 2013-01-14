package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss09_beres_minion extends ai_boss09_bereth_behavior {
	protected int is_key = 0;
	protected int IsAggressive = 1;
	protected int Skill05_ID = 360316929;
	protected int Skill05_Probablity = 0;
	protected int Skill05_Target = 3;
	protected int Skill05_Type = 3;
	protected int Skill05_AttackSplash = 1;
	protected double Skill05_Desire = 10000000.000000;
	protected int Skill05_Check_Dist = 0;
	protected int Skill05_Dist_Min = 0;
	protected int Skill05_Dist_Max = 2000;
	protected int Skill05_HPTarget = 0;
	protected int Skill05_HighHP = 100;
	protected int Skill05_LowHP = 0;

	protected void CREATED(HandlerParam reply, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
myself.i_ai9 = 0;
i0 = myself.GetGlobalMap(GM_ID);
if (i0 == -1) {
return;

} else {
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
if (c0.hp < c0.max_hp / 10) {
i1 = 1;

} else if (c0.hp >= c0.max_hp) {
i1 = 10;

} else {
i1 = gg.FloatToInt(c0.hp / c0.max_hp / 10) + 1;

}
i2 = gg.FloatToInt(myself.sm.max_hp) * i1;
gg.SetNpcParam(myself.sm, 9, i2);

}

}
if (MovingAttack == 0) {

} else {
myself.InstantRandomTeleportInMyTerritory();

}
if (myself.i_ai9 == 1) {
myself.Shout("디버깅 시작");
myself.AddTimerEx(7029, 1000);

}
myself.i_ai6 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam h0) {
if (is_key == 0) {
i0 = myself.GetGlobalMap(11);
if (i0 == -1) {
super;
return;

} else {
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
if (c0.db_value == 3) {
super;

} else {
super;
return;

}
if (myself.i_ai6 == 1) {
gg.SendScriptEvent(c0, 1109243, 0);

}

} else {
super;
return;

}

}

}
if (gg.Rand(100) < 2) {
if (myself.i_ai3 == 1) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullCreature(h0.creature) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 1, Skill05_Desire);

}

}

}
i1 = gg.OwnItemCount(attacker, 57);
i2 = gg.OwnItemCount(attacker, 6651);
if (i1 == 1980 && i2 == 1980) {
if (myself.i_ai3 == 1) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullCreature(h0.creature) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_ID, 1, 1, Skill05_Desire);

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam h0) {
if (script_event_arg1 == 1109239) {
if (gg.Rand(100) < 30) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullCreature(h0.creature) == 0) {
myself.AddUseSkillDesire(myself.sm, 352321541, 1, 1, Skill05_Desire);

}

}

} else if (script_event_arg1 == 1109240) {
if (MovingAttack == 0) {

} else {
myself.InstantRandomTeleportInMyTerritory();

}

} else if (script_event_arg1 == 1109241) {
myself.i_ai6 = 1;
if (myself.i_ai9 == 1) {
myself.Shout("키 몬스터 세팅");
myself.AddTimerEx(2011, 30 + gg.Rand(30) * 1000);

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == 352321541 && success == 1) {
myself.Despawn();

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam f0, HandlerParam i0, HandlerParam h0, HandlerParam i1, HandlerParam c0) {
i0 = myself.GetGlobalMap(GM_ID);
if (i1 == -1) {
return;

} else {
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
if (c0.db_value < 3) {
return;

} else {
super;

}

}

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam c0) {
if (myself.i_ai6 == 1) {
i0 = myself.GetGlobalMap(11);
if (i0 == -1) {
return;

}
c0 = gg.GetCreatureFromID(i0);
if (myself.IsNullCreature(c0) == 0) {
if (myself.i_ai9 == 1) {
myself.Shout("키 몬스터 사망");

}
gg.SendScriptEvent(c0, 1109242, 0);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 7029) {
if (myself.i_ai6 == 1) {
if (myself.i_ai9 == 1) {
myself.Say("내가 진짜");

}

}
myself.AddTimerEx(7029, 1000);

} else if (timer_id == 2011) {
i0 = gg.Rand(3);
if (i0 == 0) {
myself.Say(gg.MakeFString(1801068, "", "", "", "", ""));

}
if (i0 == 0) {
myself.Say(gg.MakeFString(1801069, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1801070, "", "", "", "", ""));

}
myself.AddTimerEx(2011, 30 + gg.Rand(30) * 1000);

}
super;
	}


}