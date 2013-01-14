package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_dummy_air_monster extends default_npc {
	protected int FormationID = -1;
	protected int GroupID = -1;
	protected String RaidMakerName = "default_maker_name";
	protected String MakerName = "default_maker_name";

	protected void CREATED() {
myself.AddMoveFormationDesire("", 35, 1, GroupID, GroupID, FormationID, 1, 2000);
	}

	protected void NODE_ARRIVED() {
myself.AddMoveFormationDesire("", 35, 1, GroupID, GroupID, FormationID, 1, 50);
	}


}