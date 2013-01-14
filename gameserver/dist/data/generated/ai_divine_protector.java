package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_divine_protector extends warrior_basic {
	protected int IsAggressive = 1;
	protected int Skill01_ID = 414056449;
	protected int Skill01_Probablity = 100;
	protected int Skill01_Target = 2;
	protected int Skill01_Type = 1;
	protected int Skill02_ID = 414121985;
	protected int Skill02_Probablity = 100;
	protected int Skill02_Target = 2;
	protected int Skill02_Type = 1;
	protected int Skill03_ID = 413925377;
	protected int Skill03_Target = 2;
	protected int Skill03_Probablity = 100;
	protected int Skill03_Type = 3;
	protected int Skill03_HighHP = 50;
	protected int Skill03_HPTarget = 1;
	protected int Skill04_ID = 438173697;
	protected int Skill04_Probablity = 10000;
	protected int Skill04_Target = 2;
	protected int Skill04_HighHP = 20;
	protected int Skill04_Type = 2;
	protected int Skill05_ID = 458752001;
	protected int Skill05_Probablity = 100;
	protected int Skill05_Target = 1;

	protected void MY_DYING() {
myself.CastBuffForQuestReward(myself.sm, Skill04_ID);
super;
	}


}