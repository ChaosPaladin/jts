package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_elite_turtlian extends ai_a_seed_elite_monster {
	protected int Skill01_ID = 420020225;
	protected int Skill01_Probablity = 10;
	protected int Skill01_Target_Type = 0;
	protected int Skill02_ID = 420085761;
	protected int Skill02_Probablity = 10;
	protected int Skill02_Target_Type = 2;
	protected int SpecialSkill01_ID = 420151297;
	protected int SpecialSkill02_ID = 420216833;
	protected int FieldCycle_ID = 5;
	protected int FieldCycle_point = 10;

	protected void CREATED() {
myself.CreateOnePrivateEx(1022754, "turtlian", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1022756, "tardion", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1022755, "krakian", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
super;
	}


}