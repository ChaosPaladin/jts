package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_darion extends warrior_basic {
	protected int Skill01_ID = 360513537;
	protected int Skill01_Probablity = 500;
	protected int Skill01_Target = 0;
	protected int Skill01_Type = 0;
	protected int Skill01_AttackSplash = 0;
	protected double Skill01_Desire = 1000000000.000000;
	protected int Skill01_Check_Dist = 1;
	protected int Skill01_Dist_Min = 0;
	protected int Skill01_Dist_Max = 100;
	protected int Skill02_ID = 360448001;
	protected int Skill02_Probablity = 500;
	protected int Skill02_Target = 0;
	protected int Skill02_Type = 0;
	protected int Skill02_AttackSplash = 1;
	protected double Skill02_Desire = 1000000000.000000;
	protected int Skill02_Check_Dist = 0;
	protected int Skill02_Dist_Min = 0;
	protected int Skill02_Dist_Max = 2000;
	protected int Skill03_ID = 360579073;
	protected int Skill03_Probablity = 300;
	protected int Skill03_Target = 1;
	protected int Skill03_Type = 0;
	protected int Skill03_AttackSplash = 0;
	protected double Skill03_Desire = 1000000000.000000;
	protected int Skill03_Check_Dist = 0;
	protected int Skill03_Dist_Min = 0;
	protected int Skill03_Dist_Max = 2000;
	protected int Skill03_HPTarget = 0;
	protected int Skill03_HighHP = 70;
	protected int Skill03_LowHP = 0;
	protected int Skill04_ID = 360644609;
	protected int Skill04_Probablity = 50;
	protected int Skill04_Target = 3;
	protected int Skill04_Type = 1;
	protected int Skill04_AttackSplash = 0;
	protected double Skill04_Desire = 1000000000.000000;
	protected int Skill04_Check_Dist = 0;
	protected int Skill04_Dist_Min = 0;
	protected int Skill04_Dist_Max = 2000;
	protected int Skill04_HPTarget = 0;
	protected int Skill04_HighHP = 50;
	protected int Skill04_LowHP = 0;
	protected double ATTACKED_Weight_Point = 1.000000;
	protected double CLAN_ATTACKED_Weight_Point = 1.000000;
	protected double PARTY_ATTACKED_Weight_Point = 1.000000;
	protected double SEE_SPELL_Weight_Point = 1.000000;
	protected double HATE_SKILL_Weight_Point = 100.000000;
	protected String second_door = "door_default";
	protected String third_door = "door_default";
	protected String bridge_a = "darion_raid_c_004";
	protected String bridge_b = "darion_raid_b_004";
	protected String secret_a = "darion_raid_b_003";
	protected String secret_b = "darion_raid_c_003";
	protected String bridge_control_pos = "pos_default";
	protected int MoveArounding = 0;
	protected int GM_ID = 12;

	protected void CREATED(HandlerParam reply) {
myself.RegisterGlobalMap(GM_ID, myself.sm.id);
myself.SetDBValue(myself.sm, 0);
myself.BroadcastScriptEvent(0, 0, 8000);
myself.i_quest0 = myself.GetCurrentTick();
if (reply == 0) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, 279696, -10492, 200);

}
myself.AddTimerEx(9631, 60 * 1000);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (myself.sm.db_value == 0) {
myself.SetDBValue(myself.sm, 1);

}
myself.i_quest0 = myself.GetCurrentTick();
i1 = gg.OwnItemCount(attacker, 57);
i2 = gg.OwnItemCount(attacker, 6651);
if (i1 == 1980 && i2 == 1980) {
myself.Suicide();

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 9631) {
if (myself.GetCurrentTick() > myself.i_quest0 + 10 * 60 && myself.sm.db_value != 0) {
myself.SetDBValue(myself.sm, 0);
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, 279696, -10492, 200);
myself.RemoveAllDesire();
myself.StopMove();
gg.InstantTeleportEx(myself.sm, 20886, 244088, 11062, 0);

}
myself.AddTimerEx(9631, 60 * 1000);

}
super;
	}

	protected void MY_DYING() {
myself.SetDBValue(myself.sm, 0);
myself.RegisterGlobalMap(GM_ID, -1);
myself.BroadcastScriptEvent(1, 0, 8000);
super;
	}


}