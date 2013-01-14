package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_nest_protector_of_altar extends default_npc {
	protected int DeBuff = 402915329;
	protected int ITEM_Pendant = 14848;
	protected int TIMER_check_focus = 31152;
	protected int TIMER_check_debuff = 31153;
	protected int TIMER_decide_spawn = 31154;
	protected int Pos_X = 71976;
	protected int Pos_Y = -103426;
	protected int Pos_Z = -968;
	protected int Pos_baranka_X = 74710;
	protected int Pos_baranka_Y = -101918;
	protected int Pos_baranka_Z = -960;
	protected int Pos_inv_X = 72717;
	protected int Pos_inv_Y = -102009;
	protected int Pos_inv_Z = -960;
	protected int debug_mode = 0;

	protected void CREATED() {
super;
myself.i_ai5 = 0;
myself.i_ai6 = 0;
myself.i_ai7 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.SetMaxHateListSize(200);
myself.AddTimerEx(TIMER_check_debuff, 10 * 1000);
myself.InstantTeleportInMyTerritory(Pos_X, Pos_Y, Pos_Z, 100);
myself.CreateOnePrivateEx(1032656, "ai_raid_baranka_observer", 0, 0, Pos_inv_X, Pos_inv_Y, Pos_inv_Z, 0, 0, 0, 0);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam c0) {
if (attacker.is_pc == 1) {
c0 = attacker;

} else if (myself.IsInCategory(12, attacker.npc_class_id)) {
c0 = attacker.master;

}
if (myself.IsNullCreature(myself.c_ai0) == 1) {
if (gg.OwnItemCount(c0, ITEM_Pendant) > 0) {
if (debug_mode) {
myself.Say("ATTACKED - 주시대상 설정!!!");

}
myself.c_ai0 = c0;
myself.i_ai5 = 1;
myself.i_ai6 = myself.GetCurrentTick();

}

}
if (c0 != myself.c_ai0) {
if (debug_mode) {
myself.Say("ATTACKED - debuff - 주시대상이 아님");

}
if (myself.IsNullCreature(c0) == 0) {
myself.CastBuffForQuestReward(c0, DeBuff);

}

} else if (gg.OwnItemCount(c0, ITEM_Pendant) <= 0) {
if (debug_mode) {
myself.Say("ATTACKED - debuff - 팬던트 없음");

}

} else if (myself.sm.hp < myself.sm.max_hp * 0.050000) {
if (myself.i_ai7 == 0) {
if (debug_mode) {
myself.Say("ATTACKED - 바랑카 스폰 HP 조건 만족");

}
if (c0 == myself.c_ai0) {
if (myself.IsNullCreature(myself.c_ai1)) {
myself.i_ai7 = 1;
if (debug_mode) {
myself.Say("ATTACKED - 바랑카 스폰!!");

}
myself.c_ai1 = myself.c_ai0;
myself.AddTimerEx(TIMER_decide_spawn, 1000);

}

} else if (debug_mode) {
myself.Say("ATTACKED - ERR - 주시대상이 아님");

}

} else if (debug_mode) {
myself.Say("ATTACKED - 이미 바랑카 스폰 CALL");

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam c0) {
myself.AddHateInfo(creature, 1, 0, 1, 1);
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1) {
if (creature.is_pc == 1) {
c0 = creature;

} else {
c0 = creature.master;

}

}
if (myself.i_ai5 == 0) {
if (gg.OwnItemCount(c0, ITEM_Pendant) > 0) {
if (debug_mode) {
myself.Say("SEE_CREATURE - 주시대상 설정!");

}
myself.c_ai0 = c0;
myself.i_ai5 = 1;
myself.i_ai6 = myself.GetCurrentTick();
myself.AddTimerEx(TIMER_check_focus, 10 * 1000);
gg.ShowOnScreenMsgStr(myself.c_ai0, 5, 0, 1, 0, 1, 0, 5000, 0, gg.MakeFString(1800831, "", "", "", "", ""));

} else {
if (debug_mode) {
myself.Say("SEE_CREATURE - debuff - 팬던트 없음");

}
if (myself.IsNullCreature(c0) == 0) {
myself.CastBuffForQuestReward(c0, DeBuff);

}

}

} else if (myself.i_ai5 == 1) {
if (c0 == myself.c_ai0) {
if (debug_mode) {
myself.Say("SEE_CREATURE - 주시대상");

}

} else {
if (debug_mode) {
myself.Say("SEE_CREATURE - debuff - 다른 유저가 선점");

}
if (myself.IsNullCreature(c0) == 0) {
myself.CastBuffForQuestReward(c0, DeBuff);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam h0) {
if (timer_id == TIMER_check_focus) {
if (myself.i_ai7 == 1) {
if (debug_mode) {
myself.Say("TIMER - 바랑카가 스폰됐으므로 주시대상 체크 중지");

}

} else {
if (debug_mode) {
myself.Say("TIMER - 주시대상 체크 타이머");

}
if (myself.IsNullCreature(myself.c_ai0) || myself.c_ai0.alive == 0 || myself.DistFromMe(myself.c_ai0) >= 3000 || myself.GetCurrentTick() - myself.i_ai6 >= 300) {
if (debug_mode) {
myself.Say("TIMER - 주시 대상 사라짐! 디스폰함!");

}
myself.Despawn();

} else {
myself.AddTimerEx(TIMER_check_focus, 10 * 1000);

}

}

} else if (timer_id == TIMER_decide_spawn) {
if (debug_mode) {
myself.Say("TIMER - 바랑카 스폰 타이머!, name :" + myself.c_ai1.name);

}
myself.CreateOnePrivateEx(1018808, "ai_raid_baranka", 0, 0, Pos_baranka_X, Pos_baranka_Y, Pos_baranka_Z, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 0);

} else if (timer_id == TIMER_check_debuff) {
i0 = myself.GetHateInfoCount();
if (i0 > 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
h0 = myself.GetHateInfoByIndex(i1);
if (myself.IsNullCreature(h0.creature) || myself.DistFromMe(h0.creature) >= 2500) {
myself.RemoveHateInfoByCreature(h0.creature);

} else if (myself.c_ai0 == h0.creature) {
myself.RemoveHateInfoByCreature(h0.creature);

} else if (myself.IsInCategory(12, h0.creature.npc_class_id) && myself.c_ai0 == h0.creature.master) {
myself.RemoveHateInfoByCreature(h0.creature);

} else {
myself.CastBuffForQuestReward(h0.creature, DeBuff);

}

}

}
myself.AddTimerEx(TIMER_check_debuff, 10 * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 2214007) {
if (debug_mode) {
myself.Say("SCRIPT_EVENT - BARANKA DIED!");

}
myself.Suicide();

} else if (script_event_arg1 == 2214009) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (gg.OwnItemCount(c0, ITEM_Pendant) <= 0 || gg.OwnItemCount(c0, ITEM_Pendant) > 0 && myself.IsNullCreature(myself.c_ai0) == 0) {
myself.AddHateInfo(c0, 1, 0, 1, 1);

}

}

}
	}


}