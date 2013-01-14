package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_growh_basic extends wizard_ddmagic2 {
	protected int silhouette1 = 1020130;
	protected String ai_type1 = "default_npc";
	protected int silhouette2 = 1020130;
	protected String ai_type2 = "default_npc";
	protected int silhouette_ex = 33;
	protected String ai_type_ex = "default_npc";
	protected int silhouette_ex2 = 33;
	protected String ai_type_ex2 = "default_npc";
	protected int TakeSocial = 5;

	protected void CREATED() {
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id) {
super;
	}


}