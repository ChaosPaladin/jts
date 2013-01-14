package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_main_event_sibyl extends citizen {
	protected int part_type = 0;
	protected int room_index = -1;
	protected int escape_x = 1;
	protected int escape_y = 1;
	protected int escape_z = 1;
	protected int battle1_1x = 1;
	protected int battle1_1y = 1;
	protected int battle1_11x = 1;
	protected int battle1_11y = 1;
	protected int battle1_12x = 1;
	protected int battle1_12y = 1;
	protected int battle1_13x = 1;
	protected int battle1_13y = 1;
	protected int battle1_2x = 1;
	protected int battle1_2y = 1;
	protected int battle1_21x = 1;
	protected int battle1_21y = 1;
	protected int battle1_22x = 1;
	protected int battle1_22y = 1;
	protected int battle1_23x = 1;
	protected int battle1_23y = 1;
	protected int battle1_3x = 1;
	protected int battle1_3y = 1;
	protected int battle1_31x = 1;
	protected int battle1_31y = 1;
	protected int battle1_32x = 1;
	protected int battle1_32y = 1;
	protected int battle1_33x = 1;
	protected int battle1_33y = 1;
	protected int battle1_4x = 1;
	protected int battle1_4y = 1;
	protected int battle1_41x = 1;
	protected int battle1_41y = 1;
	protected int battle1_42x = 1;
	protected int battle1_42y = 1;
	protected int battle1_43x = 1;
	protected int battle1_43y = 1;
	protected int battle2_1x = 1;
	protected int battle2_1y = 1;
	protected int battle2_2x = 1;
	protected int battle2_2y = 1;
	protected int battle2_3x = 1;
	protected int battle2_3y = 1;
	protected int battle2_4x = 1;
	protected int battle2_4y = 1;
	protected int stair_1x = 1;
	protected int stair_1y = 1;
	protected int stair_2x = 1;
	protected int stair_2y = 1;
	protected int stair_3x = 1;
	protected int stair_3y = 1;
	protected int stair_4x = 1;
	protected int stair_4y = 1;
	protected int coord_z = 1;
	protected int battle1_npc_name = 1;
	protected String battle1_npc_ai = "warrior";
	protected int battle1_archer_name = 1;
	protected String battle1_archer_ai = "";
	protected int battle_supporter_name = 1;
	protected String battle_supporter_ai = "warrior";
	protected int battle_supporter_name_ex = 1;
	protected String battle_supporter_ai_ex = "warrior";
	protected int battle_sniper_name = 1;
	protected String battle_sniper_ai = "warrior";
	protected int battle_fast_type_name = 1;
	protected String battle_fast_type_ai = "warrior";
	protected int battle_slow_type_name = 1;
	protected String battle_slow_type_ai = "warrior";
	protected int battle_fast_type_name_ex = 1;
	protected String battle_fast_type_ai_ex = "warrior";
	protected int battle_slow_type_name_ex = 1;
	protected String battle_slow_type_ai_ex = "warrior";
	protected int battle_present_name = 1;
	protected String battle_present_ai = "warrior";
	protected int battle_bomb_man_name = 1;
	protected String battle_bomb_man_ai = "warrior";

	protected void CREATED() {
myself.i_ai0 = myself.GetCurrentTick();
myself.i_ai1 = 0;
myself.i_ai3 = myself.GetCurrentTick();
myself.i_quest0 = 0;
myself.i_quest1 = 1;
myself.i_quest2 = 0;
myself.i_quest3 = 0;
myself.i_quest4 = 1;
myself.i_ai2 = 0;
myself.i_ai4 = 1;
myself.sm.param1 = 0;
myself.sm.flag = 0;
myself.AddTimerEx(3001, 3000);
myself.SetPrivateID(part_type * room_index);
myself.EffectMusic(myself.sm, 2000, "B06_S01");
myself.AddTimerEx(3023, 120 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam s0, HandlerParam party0) {
if (timer_id == 3001) {
if (myself.GetCurrentTick() - myself.i_ai0 > 60 * 17 + 45 && myself.i_ai1 == 2) {
myself.i_ai1 = 3;
myself.ShoutEx(gg.MakeFString(1000380, "", "", "", "", ""), 1500);

}
if (myself.GetCurrentTick() - myself.i_ai0 > 60 * 10 && myself.i_ai1 == 1) {
for (i0 = 0; i0 < 10; i0 = i0 + 1) {
i1 = gg.Rand(4);
i2 = gg.FloatToInt(myself.sm.x);
i3 = gg.FloatToInt(myself.sm.y);
if (i1 == 0) {
i2 = i2 + 200 + 50 - gg.Rand(100);
i3 = i3 + 200 + 50 - gg.Rand(100);

} else if (i1 == 1) {
i2 = i2 + 200 + 50 - gg.Rand(100);
i3 = i3 - 200 + 50 - gg.Rand(100);

} else if (i1 == 2) {
i2 = i2 - 200 + 50 - gg.Rand(100);
i3 = i3 + 200 + 50 - gg.Rand(100);

} else {
i2 = i2 - 200 + 50 - gg.Rand(100);
i3 = i3 - 200 + 50 - gg.Rand(100);

}
myself.CreateOnePrivateEx(battle_present_name, battle_present_ai, 10, 0, i2, i3, coord_z, 0, 0, 0, 0);

}
myself.i_ai1 = 2;

}
if (myself.GetCurrentTick() - myself.i_ai0 > 60 * 17 + 50) {
myself.InstantTeleportInMyTerritory(escape_x, escape_y, coord_z, 100);
if (room_index == -1 || part_type == 0) {

} else {
gg.ClearEventRoom(room_index, part_type, 1);

}
myself.Despawn();

}
if (myself.GetCurrentTick() - myself.i_ai0 > 10 && myself.i_ai1 == 0) {
myself.i_ai1 = 1;
myself.CreateOnePrivateEx(battle1_npc_name, battle1_npc_ai, 10, 0, battle1_1x, battle1_1y, coord_z, 32768, 1, myself.i_ai0, 0);
myself.CreateOnePrivateEx(battle1_npc_name, battle1_npc_ai, 10, 0, battle1_2x, battle1_2y, coord_z, 32768, 16, myself.i_ai0, 0);
myself.CreateOnePrivateEx(battle1_npc_name, battle1_npc_ai, 10, 0, battle1_3x, battle1_3y, coord_z, 32768, 256, myself.i_ai0, 0);
myself.CreateOnePrivateEx(battle1_npc_name, battle1_npc_ai, 10, 0, battle1_4x, battle1_4y, coord_z, 32768, 4096, myself.i_ai0, 0);

}
if (myself.GetCurrentTick() - myself.i_ai0 > 60 * 5) {
i0 = myself.GetCurrentTick() - myself.i_ai0;
if (i0 > 15 * 60) {
myself.i_ai4 = 4;

} else if (i0 > 10 * 60) {
myself.i_ai4 = 3;

} else if (i0 > 8 * 60) {
myself.i_ai4 = 4;

} else if (i0 > 6 * 60) {
myself.i_ai4 = 2;

}
i0 = 0;
if (myself.i_ai2 & 1) {
i0 = i0 + 1;

}
if (myself.i_ai2 & 16) {
i0 = i0 + 1;

}
if (myself.i_ai2 & 256) {
i0 = i0 + 1;

}
if (myself.i_ai2 & 4096) {
i0 = i0 + 1;

}
if (i0 < myself.i_ai4) {
i2 = gg.Rand(4) + 1;
if (i2 == 1) {
i2 = 1;

} else if (i2 == 2) {
i2 = 16;

} else if (i2 == 3) {
i2 = 256;

} else if (i2 == 4) {
i2 = 4096;

}
i0 = 0;
for (i1 = 1; i1 < 5; i1 = i1 + 1) {
if (i0 == 0 && i2 & myself.i_ai2 == 0) {
i0 = i2;
myself.i_ai2 = myself.i_ai2 + i0;

} else if (i2 == 1) {
i2 = 16;

} else if (i2 == 16) {
i2 = 256;

} else if (i2 == 256) {
i2 = 4096;

} else if (i2 == 4096) {
i2 = 1;

}

}
if (i2 == 0) {
myself.Say("빵꾸다!!");

}
i1 = 3000 + 60 * 18 - myself.GetCurrentTick() - myself.i_ai0 * 10;
if (i0 == 1) {
myself.AddTimerEx(3010, i1);

} else if (i0 == 16) {
myself.AddTimerEx(3011, i1);

} else if (i0 == 256) {
myself.AddTimerEx(3012, i1);

} else if (i0 == 4096) {
myself.AddTimerEx(3013, i1);

} else {
myself.Say("궁수 스폰에 빵꾸다!!");

}

}
i0 = myself.GetCurrentTick() - myself.i_ai0;
if (i0 > 16 * 60) {
myself.i_quest4 = 4;

} else if (i0 > 13 * 60) {
myself.i_quest4 = 3;

} else if (i0 > 10 * 60) {
myself.i_quest4 = 2;

} else if (i0 > 8 * 60) {
myself.i_quest4 = 3;

} else if (i0 > 6 * 60) {
myself.i_quest4 = 2;

}
i0 = 0;
if (myself.i_quest2 & 1) {
i0 = i0 + 1;

}
if (myself.i_quest2 & 16) {
i0 = i0 + 1;

}
if (myself.i_quest2 & 256) {
i0 = i0 + 1;

}
if (myself.i_quest2 & 4096) {
i0 = i0 + 1;

}
if (i0 < myself.i_quest4) {
i2 = gg.Rand(4) + 1;
if (i2 == 1) {
i2 = 1;

} else if (i2 == 2) {
i2 = 16;

} else if (i2 == 3) {
i2 = 256;

} else if (i2 == 4) {
i2 = 4096;

}
i0 = 0;
for (i1 = 1; i1 < 5; i1 = i1 + 1) {
if (i0 == 0 && i2 & myself.i_quest2 == 0) {
i0 = i2;
myself.i_quest2 = myself.i_quest2 + i0;

} else if (i2 == 1) {
i2 = 16;

} else if (i2 == 16) {
i2 = 256;

} else if (i2 == 256) {
i2 = 4096;

} else if (i2 == 4096) {
i2 = 1;

}

}
if (i2 == 0) {
myself.Say("빵꾸다!!");

}
i1 = 3000 + 60 * 18 - myself.GetCurrentTick() - myself.i_ai0 * 10;
if (i0 == 1) {
myself.AddTimerEx(3014, i1);

} else if (i0 == 16) {
myself.AddTimerEx(3015, i1);

} else if (i0 == 256) {
myself.AddTimerEx(3016, i1);

} else if (i0 == 4096) {
myself.AddTimerEx(3017, i1);

} else {
myself.Say("궁수 스폰에 빵꾸다!!");

}

}
i0 = 0;
if (myself.i_quest3 & 1) {
i0 = i0 + 1;

}
if (myself.i_quest3 & 16) {
i0 = i0 + 1;

}
if (myself.i_quest3 & 256) {
i0 = i0 + 1;

}
if (myself.i_quest3 & 4096) {
i0 = i0 + 1;

}
if (i0 < myself.i_quest4) {
i2 = gg.Rand(4) + 1;
if (i2 == 1) {
i2 = 1;

} else if (i2 == 2) {
i2 = 16;

} else if (i2 == 3) {
i2 = 256;

} else if (i2 == 4) {
i2 = 4096;

}
i0 = 0;
for (i1 = 1; i1 < 5; i1 = i1 + 1) {
if (i0 == 0 && i2 & myself.i_quest3 == 0) {
i0 = i2;
myself.i_quest3 = myself.i_quest3 + i0;

} else if (i2 == 1) {
i2 = 16;

} else if (i2 == 16) {
i2 = 256;

} else if (i2 == 256) {
i2 = 4096;

} else if (i2 == 4096) {
i2 = 1;

}

}
if (i2 == 0) {
myself.Say("빵꾸다!!");

}
i1 = 3000 + 60 * 18 - myself.GetCurrentTick() - myself.i_ai0 * 10;
if (i0 == 1) {
myself.AddTimerEx(3018, i1);

} else if (i0 == 16) {
myself.AddTimerEx(3019, i1);

} else if (i0 == 256) {
myself.AddTimerEx(3020, i1);

} else if (i0 == 4096) {
myself.AddTimerEx(3021, i1);

} else {
myself.Say("궁수 스폰에 빵꾸다!!");

}

}
if (myself.sm.flag == 0) {
if (gg.Rand(100) < 10) {
myself.CreateOnePrivateEx(battle_bomb_man_name, battle_bomb_man_ai, 0, 0, gg.FloatToInt(myself.sm.x) + 250 + gg.Rand(100), gg.FloatToInt(myself.sm.y) + 250 + gg.Rand(100), gg.FloatToInt(myself.sm.z), 0, gg.FloatToInt(myself.sm.x), myself.i_ai0, 0);
myself.sm.flag = myself.GetCurrentTick();

}

} else if (myself.GetCurrentTick() - myself.sm.flag > 260 && gg.Rand(100) < 30) {
myself.CreateOnePrivateEx(battle_bomb_man_name, battle_bomb_man_ai, 0, 0, gg.FloatToInt(myself.sm.x) - 250 - gg.Rand(100), gg.FloatToInt(myself.sm.y) - 250 - gg.Rand(100), gg.FloatToInt(myself.sm.z), 0, gg.FloatToInt(myself.sm.x), myself.i_ai0, 0);
myself.sm.flag = myself.GetCurrentTick();

}

}
i0 = myself.GetCurrentTick() - myself.i_ai0;
if (i0 > 14 * 60) {
myself.i_quest1 = 4;

} else if (i0 > 12 * 60) {
myself.i_quest1 = 3;

} else if (i0 > 10 * 60) {
myself.i_quest1 = 2;

} else if (i0 > 8 * 60) {
myself.i_quest1 = 3;

} else if (i0 > 6 * 60) {
myself.i_quest1 = 2;

}
i0 = 0;
if (myself.i_quest0 & 1) {
i0 = i0 + 1;

}
if (myself.i_quest0 & 16) {
i0 = i0 + 1;

}
if (myself.i_quest0 & 256) {
i0 = i0 + 1;

}
if (myself.i_quest0 & 4096) {
i0 = i0 + 1;

}
if (i0 < myself.i_quest1) {
i2 = gg.Rand(4) + 1;
if (i2 == 1) {
i2 = 1;

} else if (i2 == 2) {
i2 = 16;

} else if (i2 == 3) {
i2 = 256;

} else if (i2 == 4) {
i2 = 4096;

}
i0 = 0;
for (i1 = 1; i1 < 5; i1 = i1 + 1) {
if (i0 == 0 && i2 & myself.i_quest0 == 0) {
i0 = i2;
myself.i_quest0 = myself.i_quest0 + i0;

} else if (i2 == 1) {
i2 = 16;

} else if (i2 == 16) {
i2 = 256;

} else if (i2 == 256) {
i2 = 4096;

} else if (i2 == 4096) {
i2 = 1;

}

}
if (i2 == 0) {
myself.Say("빵꾸다!!");

}
i1 = 3000 + 60 * 18 - myself.GetCurrentTick() - myself.i_ai0 * 10;
if (i0 == 1) {
myself.AddTimerEx(3006, i1);

} else if (i0 == 16) {
myself.AddTimerEx(3007, i1);

} else if (i0 == 256) {
myself.AddTimerEx(3008, i1);

} else if (i0 == 4096) {
myself.AddTimerEx(3009, i1);

} else {
myself.Say("궁수 스폰에 빵꾸다!!");

}

}
myself.AddTimerEx(3001, 3000);

}
if (timer_id == 3002) {
myself.CreateOnePrivateEx(battle1_npc_name, battle1_npc_ai, 10, 0, battle1_1x, battle1_1y, coord_z, 32768, 1, myself.i_ai0, 0);

}
if (timer_id == 3003) {
myself.CreateOnePrivateEx(battle1_npc_name, battle1_npc_ai, 10, 0, battle1_2x, battle1_2y, coord_z, 32768, 16, myself.i_ai0, 0);

}
if (timer_id == 3004) {
myself.CreateOnePrivateEx(battle1_npc_name, battle1_npc_ai, 10, 0, battle1_3x, battle1_3y, coord_z, 32768, 256, myself.i_ai0, 0);

}
if (timer_id == 3005) {
myself.CreateOnePrivateEx(battle1_npc_name, battle1_npc_ai, 10, 0, battle1_4x, battle1_4y, coord_z, 32768, 4096, myself.i_ai0, 0);

}
if (timer_id == 3006) {
myself.CreateOnePrivateEx(battle_sniper_name, battle_sniper_ai, 10, 0, stair_1x, stair_1y, coord_z, 32768, 1, myself.i_ai0, 0);

}
if (timer_id == 3007) {
myself.CreateOnePrivateEx(battle_sniper_name, battle_sniper_ai, 10, 0, stair_2x, stair_2y, coord_z, 32768, 16, myself.i_ai0, 0);

}
if (timer_id == 3008) {
myself.CreateOnePrivateEx(battle_sniper_name, battle_sniper_ai, 10, 0, stair_3x, stair_3y, coord_z, 32768, 256, myself.i_ai0, 0);

}
if (timer_id == 3009) {
myself.CreateOnePrivateEx(battle_sniper_name, battle_sniper_ai, 10, 0, stair_4x, stair_4y, coord_z, 32768, 4096, myself.i_ai0, 0);

}
i0 = gg.FloatToInt(1.000000 * myself.GetCurrentTick() - myself.i_ai0 / 60 * 20 * 100);
if (i0 >= gg.Rand(100)) {
i0 = 1;

} else {
i0 = 0;

}
if (timer_id >= 3010 && timer_id <= 3013) {
if (i0 == 1) {
i0 = battle_slow_type_name_ex;
s0 = battle_slow_type_ai_ex;

} else {
i0 = battle_slow_type_name;
s0 = battle_slow_type_ai;

}
if (timer_id == 3010) {
myself.CreateOnePrivateEx(i0, s0, 10, 0, battle2_1x - 80 + gg.Rand(160), battle2_1y - 80 + gg.Rand(160), coord_z, 32768, gg.FloatToInt(myself.sm.x), myself.i_ai0, 1);

}
if (timer_id == 3011) {
myself.CreateOnePrivateEx(i0, s0, 10, 0, battle2_2x - 80 + gg.Rand(160), battle2_2y - 80 + gg.Rand(160), coord_z, 32768, gg.FloatToInt(myself.sm.x), myself.i_ai0, 16);

}
if (timer_id == 3012) {
myself.CreateOnePrivateEx(i0, s0, 10, 0, battle2_3x - 80 + gg.Rand(160), battle2_3y - 80 + gg.Rand(160), coord_z, 32768, gg.FloatToInt(myself.sm.x), myself.i_ai0, 256);

}
if (timer_id == 3013) {
myself.CreateOnePrivateEx(i0, s0, 10, 0, battle2_4x - 80 + gg.Rand(160), battle2_4y - 80 + gg.Rand(160), coord_z, 32768, gg.FloatToInt(myself.sm.x), myself.i_ai0, 4096);

}

}
if (timer_id >= 3014 && timer_id <= 3021) {
if (i0 == 1) {
i0 = battle_fast_type_name_ex;
s0 = battle_fast_type_ai_ex;

} else {
i0 = battle_fast_type_name;
s0 = battle_fast_type_ai;

}
if (timer_id == 3014) {
myself.CreateOnePrivateEx(i0, s0, 10, 0, battle2_1x - 80 + gg.Rand(160), battle2_1y - 80 + gg.Rand(160), coord_z, 32768, gg.FloatToInt(myself.sm.x), myself.i_ai0, 1);

}
if (timer_id == 3015) {
myself.CreateOnePrivateEx(i0, s0, 10, 0, battle2_2x - 80 + gg.Rand(160), battle2_2y - 80 + gg.Rand(160), coord_z, 32768, gg.FloatToInt(myself.sm.x), myself.i_ai0, 16);

}
if (timer_id == 3016) {
myself.CreateOnePrivateEx(i0, s0, 10, 0, battle2_3x - 80 + gg.Rand(160), battle2_3y - 80 + gg.Rand(160), coord_z, 32768, gg.FloatToInt(myself.sm.x), myself.i_ai0, 256);

}
if (timer_id == 3017) {
myself.CreateOnePrivateEx(i0, s0, 10, 0, battle2_4x - 80 + gg.Rand(160), battle2_4y - 80 + gg.Rand(160), coord_z, 32768, gg.FloatToInt(myself.sm.x), myself.i_ai0, 4096);

}
if (timer_id == 3018) {
myself.CreateOnePrivateEx(i0, s0, 10, 0, battle2_1x - 80 + gg.Rand(160), battle2_1y - 80 + gg.Rand(160), coord_z, 32768, gg.FloatToInt(myself.sm.x), myself.i_ai0, 268435457);

}
if (timer_id == 3019) {
myself.CreateOnePrivateEx(i0, s0, 10, 0, battle2_2x - 80 + gg.Rand(160), battle2_2y - 80 + gg.Rand(160), coord_z, 32768, gg.FloatToInt(myself.sm.x), myself.i_ai0, 268435472);

}
if (timer_id == 3020) {
myself.CreateOnePrivateEx(i0, s0, 10, 0, battle2_3x - 80 + gg.Rand(160), battle2_3y - 80 + gg.Rand(160), coord_z, 32768, gg.FloatToInt(myself.sm.x), myself.i_ai0, 268435712);

}
if (timer_id == 3021) {
myself.CreateOnePrivateEx(i0, s0, 10, 0, battle2_4x - 80 + gg.Rand(160), battle2_4y - 80 + gg.Rand(160), coord_z, 32768, gg.FloatToInt(myself.sm.x), myself.i_ai0, 268439552);

}

}
if (timer_id == 3022) {
myself.InstantTeleportInMyTerritory(escape_x, escape_y, coord_z, 100);
gg.ClearEventRoom(room_index, part_type, 0);

}
if (timer_id == 3023) {
myself.EffectMusic(myself.sm, 2000, "B06_S01");
myself.AddTimerEx(3024, 180 * 1000);

}
if (timer_id == 3024) {
myself.EffectMusic(myself.sm, 2000, "B07_S01");
myself.AddTimerEx(3025, 122 * 1000);

}
if (timer_id == 3025) {
myself.EffectMusic(myself.sm, 2000, "B07_S01");
myself.AddTimerEx(3026, 122 * 1000);

}
if (timer_id == 3026) {
myself.EffectMusic(myself.sm, 2000, "B07_S01");
myself.AddTimerEx(3027, 122 * 1000);

}
if (timer_id == 3027) {
myself.EffectMusic(myself.sm, 2000, "B07_S01");
myself.AddTimerEx(3028, 180 * 1000);

}
if (timer_id == 3028) {
myself.EffectMusic(myself.sm, 2000, "B06_F");
myself.AddTimerEx(3029, 120 * 1000);

}
if (timer_id == 3029) {
myself.EffectMusic(myself.sm, 2000, "B06_F");

}
myself.BroadcastScriptEventEx(10007, gg.FloatToInt(myself.sm.y), gg.GetIndexFromCreature(myself.sm), 1000);
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 10012) {
if (myself.GetCurrentTick() - myself.sm.param2 > 90 + gg.Rand(60)) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 10013, 0);

}
myself.sm.param2 = myself.GetCurrentTick();

}

}
if (script_event_arg1 == 10005 && myself.GetCurrentTick() - myself.i_ai0 < 270) {
if (script_event_arg2 == 1) {
myself.AddTimerEx(3002, 8000 + gg.Rand(8) * 1000);

} else if (script_event_arg2 == 16) {
myself.AddTimerEx(3003, 8000 + gg.Rand(8) * 1000);

} else if (script_event_arg2 == 256) {
myself.AddTimerEx(3004, 8000 + gg.Rand(8) * 1000);

} else if (script_event_arg2 == 4096) {
myself.AddTimerEx(3005, 8000 + gg.Rand(8) * 1000);

}

}
if (script_event_arg1 == 10004) {
i0 = gg.Rand(2) + 1;
if (script_event_arg2 == 1) {
myself.CreateOnePrivateEx(battle1_archer_name, battle1_archer_ai, 10, 0, battle1_11x, battle1_11y, coord_z, 32768, 1, myself.i_ai0, 0);
if (i0 == 2) {
myself.CreateOnePrivateEx(battle1_archer_name, battle1_archer_ai, 10, 0, battle1_12x, battle1_12y, coord_z, 32768, 1, myself.i_ai0, 0);

}

}
if (script_event_arg2 == 16) {
myself.CreateOnePrivateEx(battle1_archer_name, battle1_archer_ai, 10, 0, battle1_21x, battle1_21y, coord_z, 32768, 16, myself.i_ai0, 0);
if (i0 == 2) {
myself.CreateOnePrivateEx(battle1_archer_name, battle1_archer_ai, 10, 0, battle1_22x, battle1_22y, coord_z, 32768, 16, myself.i_ai0, 0);

}

}
if (script_event_arg2 == 256) {
myself.CreateOnePrivateEx(battle1_archer_name, battle1_archer_ai, 10, 0, battle1_31x, battle1_31y, coord_z, 32768, 256, myself.i_ai0, 0);
if (i0 == 2) {
myself.CreateOnePrivateEx(battle1_archer_name, battle1_archer_ai, 10, 0, battle1_32x, battle1_32y, coord_z, 32768, 256, myself.i_ai0, 0);

}

}
if (script_event_arg2 == 4096) {
myself.CreateOnePrivateEx(battle1_archer_name, battle1_archer_ai, 10, 0, battle1_41x, battle1_41y, coord_z, 32768, 4096, myself.i_ai0, 0);
if (i0 == 2) {
myself.CreateOnePrivateEx(battle1_archer_name, battle1_archer_ai, 10, 0, battle1_42x, battle1_42y, coord_z, 32768, 4096, myself.i_ai0, 0);

}

}

}
if (script_event_arg1 == 10006) {
myself.i_quest0 = myself.i_quest0 - script_event_arg2;

}
if (script_event_arg1 == 10008) {
myself.i_ai2 = myself.i_ai2 - script_event_arg2;

}
if (script_event_arg1 == 10009) {
myself.i_quest2 = myself.i_quest2 - script_event_arg2;

}
if (script_event_arg1 == 10010) {
myself.i_quest3 = myself.i_quest3 - script_event_arg2;

}
if (script_event_arg1 == 10011) {
myself.sm.param1 = myself.sm.param1 - 1;

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam fhtml0) {
if (ask == 505) {
if (reply == 1) {
if (myself.IsNullCreature(gg.Party_GetLeader(talker))) {
myself.InstantTeleport(talker, escape_x, escape_y, coord_z);

} else if (gg.Party_GetLeader(talker) != talker) {
myself.ShowPage(talker, "ssq_main_event_sibyl_q0505_04.htm");

} else {
myself.ShowPage(talker, "ssq_main_event_sibyl_q0505_01.htm");

}

} else if (reply == 2) {
if (gg.Party_GetLeader(talker) != talker) {
myself.ShowPage(talker, "ssq_main_event_sibyl_q0505_04.htm");

} else {
myself.ShowPage(talker, "ssq_main_event_sibyl_q0505_02.htm");

}

} else if (reply == 3) {
myself.AddTimerEx(3022, 7000);
myself.BroadcastScriptEvent(10015, 0, 1500);
myself.ShowPage(talker, "ssq_main_event_sibyl_q0505_05.htm");

} else if (reply == 4) {
if (myself.GetCurrentTick() - myself.i_ai3 < 10 || myself.sm.param1 >= 5) {
myself.ShowPage(talker, "ssq_main_event_sibyl_q0505_03.htm");

} else {
i0 = gg.FloatToInt(myself.sm.x) - 500 + gg.Rand(1000);
i1 = gg.FloatToInt(myself.sm.y) - 500 + gg.Rand(1000);
if (gg.Rand(100) < 40) {
myself.CreateOnePrivateEx(battle_supporter_name, battle_supporter_ai, 10, 0, i0, i1, coord_z, 32768, 0, myself.i_ai0, 0);

} else {
myself.CreateOnePrivateEx(battle_supporter_name_ex, battle_supporter_ai_ex, 10, 0, i0, i1, coord_z, 32768, 0, myself.i_ai0, 0);

}
myself.sm.param1 = myself.sm.param1 + 1;
myself.i_ai3 = myself.GetCurrentTick();

}

}

}
	}


}