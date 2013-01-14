package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class swordman_use_skill_key_monster extends warrior_use_skill {
	protected int silhouette = 1022301;
	protected String ai_type = "swordman_party_leader_named_monster";

	protected void MY_DYING() {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, 147616, 146704, -12230, 0, 0, 0, 0);
super;
	}


}