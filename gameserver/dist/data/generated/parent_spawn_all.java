package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class parent_spawn_all extends default_use_db_maker {
	protected int unique_npc = 0;
	protected String maker_nameA1 = "parent_spawn_all_A1_default";
	protected String maker_nameA2 = "parent_spawn_all_A2_default";
	protected String maker_nameA3 = "parent_spawn_all_A3_default";
	protected String maker_nameA4 = "parent_spawn_all_A4_default";
	protected String maker_nameA5 = "parent_spawn_all_A5_default";
	protected String maker_nameA6 = "parent_spawn_all_A6_default";
	protected String maker_nameA7 = "parent_spawn_all_A7_default";
	protected String maker_nameA8 = "parent_spawn_all_A8_default";
	protected String maker_nameA9 = "parent_spawn_all_A9_default";
	protected String maker_nameA10 = "parent_spawn_all_A10_default";
	protected String maker_nameB1 = "parent_spawn_all_B1_default";
	protected String maker_nameB2 = "parent_spawn_all_B2_default";
	protected String maker_nameB3 = "parent_spawn_all_B3_default";
	protected String maker_nameB4 = "parent_spawn_all_B4_default";
	protected String maker_nameB5 = "parent_spawn_all_B5_default";
	protected String maker_nameB6 = "parent_spawn_all_B6_default";
	protected String maker_nameB7 = "parent_spawn_all_B7_default";
	protected String maker_nameB8 = "parent_spawn_all_B8_default";
	protected String maker_nameB9 = "parent_spawn_all_B9_default";

	protected void ON_START(HandlerParam i0, HandlerParam def0, HandlerParam maker0) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0 && def0.has_dbname) {
def0.LoadDBNpcInfo(1010);

}

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam deleted_npc, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (deleted_npc.sm.class_id == unique_npc) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}
if (gg.IsSameString(maker_nameA1, "parent_spawn_all_A1_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
if (gg.IsSameString(maker_nameA2, "parent_spawn_all_A2_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
if (gg.IsSameString(maker_nameA3, "parent_spawn_all_A3_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
if (gg.IsSameString(maker_nameA4, "parent_spawn_all_A4_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
if (gg.IsSameString(maker_nameA5, "parent_spawn_all_A5_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
if (gg.IsSameString(maker_nameA6, "parent_spawn_all_A6_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA6);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
if (gg.IsSameString(maker_nameA7, "parent_spawn_all_A7_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA7);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
if (gg.IsSameString(maker_nameA8, "parent_spawn_all_A8_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA8);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
if (gg.IsSameString(maker_nameA9, "parent_spawn_all_A9_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA9);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
if (gg.IsSameString(maker_nameA10, "parent_spawn_all_A10_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA10);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}

}
	}

	protected void ON_NPC_CREATED(HandlerParam created_def, HandlerParam created_npc, HandlerParam maker0, HandlerParam i0) {
if (created_npc.sm.class_id == unique_npc) {
if (gg.IsSameString(maker_nameA1, "parent_spawn_all_A1_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA2, "parent_spawn_all_A2_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA3, "parent_spawn_all_A3_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA4, "parent_spawn_all_A4_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA5, "parent_spawn_all_A5_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA6, "parent_spawn_all_A6_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA6);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA7, "parent_spawn_all_A7_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA7);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA8, "parent_spawn_all_A8_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA8);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA9, "parent_spawn_all_A9_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA9);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA10, "parent_spawn_all_A10_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA10);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB1, "parent_spawn_all_B1_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB2, "parent_spawn_all_B2_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB3, "parent_spawn_all_B3_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB4, "parent_spawn_all_B4_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB5, "parent_spawn_all_B5_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB6, "parent_spawn_all_B6_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB6);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB7, "parent_spawn_all_B7_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB7);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB8, "parent_spawn_all_B8_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB8);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB9, "parent_spawn_all_B9_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB9);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}

}
	}

	protected void ON_DB_NPC_INFO(HandlerParam loaded_def, HandlerParam record0, HandlerParam maker0, HandlerParam i0) {
if (record0.is_alive) {
if (myself.AtomicIncreaseTotal(loaded_def, 1, 1)) {
loaded_def.SetDBLoaded(1);
loaded_def.SpawnEx(1, 0, record0.x, record0.y, record0.z, 0, record0.hp, record0.mp, record0.db_value);
if (gg.IsSameString(maker_nameA1, "parent_spawn_all_A1_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA2, "parent_spawn_all_A2_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA3, "parent_spawn_all_A3_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA4, "parent_spawn_all_A4_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA5, "parent_spawn_all_A5_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA6, "parent_spawn_all_A6_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA6);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA7, "parent_spawn_all_A7_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA7);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA8, "parent_spawn_all_A8_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA8);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA9, "parent_spawn_all_A9_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA9);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA10, "parent_spawn_all_A10_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA10);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB1, "parent_spawn_all_B1_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB2, "parent_spawn_all_B2_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB3, "parent_spawn_all_B3_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB4, "parent_spawn_all_B4_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB5, "parent_spawn_all_B5_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB6, "parent_spawn_all_B6_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB6);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB7, "parent_spawn_all_B7_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB7);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB8, "parent_spawn_all_B8_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB8);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB9, "parent_spawn_all_B9_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB9);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}

}

} else if (myself.AtomicIncreaseTotal(loaded_def, 1, 1)) {
if (record0.death_time == 0) {
loaded_def.Spawn2(loaded_def.total, 0, 0);
if (gg.IsSameString(maker_nameA1, "parent_spawn_all_A1_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA2, "parent_spawn_all_A2_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA3, "parent_spawn_all_A3_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA4, "parent_spawn_all_A4_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA5, "parent_spawn_all_A5_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA6, "parent_spawn_all_A6_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA6);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA7, "parent_spawn_all_A7_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA7);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA8, "parent_spawn_all_A8_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA8);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA9, "parent_spawn_all_A9_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA9);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameA10, "parent_spawn_all_A10_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameA10);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB1, "parent_spawn_all_B1_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB2, "parent_spawn_all_B2_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB3, "parent_spawn_all_B3_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB3);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB4, "parent_spawn_all_B4_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB4);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB5, "parent_spawn_all_B5_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB5);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB6, "parent_spawn_all_B6_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB6);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB7, "parent_spawn_all_B7_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB7);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB8, "parent_spawn_all_B8_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB8);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
if (gg.IsSameString(maker_nameB9, "parent_spawn_all_B9_default") == 0) {
maker0 = gg.GetNpcMaker(maker_nameB9);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}

} else {
i0 = record0.death_time + loaded_def.respawn_time;
loaded_def.RegToRespawnTimer(i0);

}

}
	}


}