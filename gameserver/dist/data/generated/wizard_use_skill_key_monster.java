package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_use_skill_key_monster extends wizard_use_skill {
	protected int silhouette = 1022298;
	protected String ai_type = "wizard_party_leader_named_monster";

	protected void MY_DYING() {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, 142672, 140480, -11840, 0, 0, 0, 0);
super;
	}


}