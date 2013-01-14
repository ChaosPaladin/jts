package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_beastfarm_beast_ev extends warrior_use_skill {
	protected int ITEM_feed_item = 15474;
	protected int ITEM_feed_adena = 15475;
	protected int ITEM_feed_item_s = 15478;
	protected int ITEM_feed_adena_s = 15479;
	protected int ITEM_feed_item_bress = 15476;
	protected int ITEM_feed_adena_bress = 15477;
	protected int SKILL_feed_item = 593035265;
	protected int SKILL_feed_adena = 593100801;
	protected int SKILL_feed_item_s = 593297409;
	protected int SKILL_feed_adena_s = 593362945;
	protected int SKILL_feed_item_bress = 593166337;
	protected int SKILL_feed_adena_bress = 593231873;
	protected int Buff = 458752001;
	protected int Skill_Display = 458752001;
	protected int reward_adena = 100000;
	protected int debug_mode = 0;

	protected void CREATED() {
super;
if (myself.sm.param1 != 0) {
myself.i_ai0 = myself.sm.param1;
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.param1);

} else if (debug_mode) {
myself.Say("ERR : param1 is 0");

}
if (myself.IsNullCreature(myself.c_ai0) == 1) {
if (debug_mode) {
myself.Say("ERR : param1's PC is NULL");

}

} else {
myself.AddAttackDesire(myself.c_ai0, 1, 1000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0, HandlerParam i1) {
super;
if (skill_name_id == SKILL_feed_item || skill_name_id == SKILL_feed_adena || skill_name_id == SKILL_feed_item_s || skill_name_id == SKILL_feed_adena_s || skill_name_id == SKILL_feed_item_bress || skill_name_id == SKILL_feed_adena_bress) {
myself.ShowSystemMessageStr(attacker, gg.MakeFString(1801092, "", "", "", "", ""));
if (skill_name_id == SKILL_feed_item) {
myself.DropItem2(myself.sm, ITEM_feed_item, 1, attacker.id);

} else if (skill_name_id == SKILL_feed_adena) {
myself.DropItem2(myself.sm, ITEM_feed_adena, 1, attacker.id);

} else if (skill_name_id == SKILL_feed_item_s) {
myself.DropItem2(myself.sm, ITEM_feed_item_s, 1, attacker.id);

} else if (skill_name_id == SKILL_feed_adena_s) {
myself.DropItem2(myself.sm, ITEM_feed_adena_s, 1, attacker.id);

} else if (skill_name_id == SKILL_feed_item_bress) {
myself.DropItem2(myself.sm, ITEM_feed_item_bress, 1, attacker.id);

} else if (skill_name_id == SKILL_feed_adena_bress) {
myself.DropItem2(myself.sm, ITEM_feed_adena_bress, 1, attacker.id);

}

}
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam i0) {
if (myself.IsNullCreature(last_attacker) == 0) {
for (i0 = 0; i0 < 15; i0 = i0 + 1) {
myself.AddUseSkillDesire(myself.sm, Skill_Display, 1, 0, 100000000);
myself.DropItem2(myself.sm, 57, gg.Rand(reward_adena) + reward_adena / 2, last_attacker.id);

}

}
super;
	}


}