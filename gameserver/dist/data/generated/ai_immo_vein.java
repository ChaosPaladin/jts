package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_immo_vein extends default_npc {
	protected String type = "";
	protected int reward_siege = 13797;
	protected int reward_rate = 1;
	protected int reward_rate_wall = 50;
	protected int FieldCycle = 3;
	protected int FieldCycle_Quantity = 100;
	protected int Skill_Branding = 542375937;
	protected int Skill_dying_display = 395640833;
	protected int TM_VEIN_SIGNAL = 78001;
	protected int TIME_VEIN_SIGNAL = 15;
	protected int babble_mode = 0;

	protected void CREATED() {
if (gg.IsSameString(type, "boss_vein") == 0 && gg.IsSameString(type, "wall") == 0) {
myself.i_ai0 = 1;
if (babble_mode == 1) {
myself.Say("베인 - 스폰 이벤트 전파");

}
myself.BroadcastScriptEventEx(78010058, 0, myself.sm.id, 500);
myself.AddTimerEx(TM_VEIN_SIGNAL, TIME_VEIN_SIGNAL * 1000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1) {
if (gg.IsSameString(type, "boss_vein") == 0 && gg.IsSameString(type, "wall") == 0) {
if (myself.sm.hp / myself.sm.max_hp >= 0.800000) {
i1 = 0;

} else if (myself.sm.hp / myself.sm.max_hp >= 0.600000) {
i1 = 1;

} else if (myself.sm.hp / myself.sm.max_hp >= 0.400000) {
i1 = 2;

} else if (myself.sm.hp / myself.sm.max_hp >= 0.200000) {
i1 = 3;

} else if (myself.sm.hp / myself.sm.max_hp >= 0.010000) {
i1 = 4;

}
if (damage / myself.sm.max_hp >= 0.010000) {
i1 = i1 + 4;

} else if (damage / myself.sm.max_hp >= 0.006000) {
i1 = i1 + 3;

} else if (damage / myself.sm.max_hp >= 0.003000) {
i1 = i1 + 2;

} else if (damage / myself.sm.max_hp >= 0.001000) {
i1 = i1 + 1;

}
myself.BroadcastScriptEventEx(78010058, attacker.id, i1, 300 + gg.Rand(100));

}
if (skill_name_id == Skill_Branding) {
if (babble_mode == 1) {
myself.Say("실드 브랜딩 맞음!!");

}
if (myself.IsNullCreature(attacker) == 0 && attacker.is_pc == 1) {
myself.ShowSystemMessageStr(attacker, gg.MakeFString(1800293, gg.IntToStr(gg.FloatToInt(myself.sm.hp * 0.200000)), "", "", "", ""));
gg.SetNpcParam(myself.sm, 9, myself.sm.hp - myself.sm.hp * 0.200000);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (gg.IsSameString(type, "boss_vein") == 0 && gg.IsSameString(type, "wall") == 0) {
if (script_event_arg1 == 989812) {
myself.i_ai0 = 1;

} else if (script_event_arg1 == 998915) {
myself.i_ai0 = myself.i_ai0 + 1;

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
if (timer_id == TM_VEIN_SIGNAL) {
myself.BroadcastScriptEventEx(78010058, 0, myself.sm.id, 500);
myself.AddTimerEx(TM_VEIN_SIGNAL, TIME_VEIN_SIGNAL * 1000);

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (gg.IsSameString(type, "boss_vein") == 0) {
i0 = gg.Rand(100);
if (gg.IsSameString(type, "wall") == 1) {
if (i0 <= reward_rate_wall) {
if (babble_mode == 1) {
myself.Shout("베인 - 아이템 드랍");

}
myself.DropItem1(myself.sm, reward_siege, 1);

}

} else {
if (babble_mode == 1) {
myself.Shout("베인 - 사망 이벤트 전파");

}
myself.BroadcastScriptEventEx(78010058, 1, myself.i_ai0, 500);
if (i0 <= reward_rate) {
if (babble_mode == 1) {
myself.Shout("베인 - 아이템 드랍");

}
myself.DropItem1(myself.sm, reward_siege, 1);

}

}

}
	}


}