package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_recom_class_cheker2 extends default_npc {
	protected int knight_pack_30 = 15201;
	protected int magic_pack_30 = 15202;
	protected int warrior_pack_30 = 15203;
	protected int rogue_pack_30 = 15204;
	protected int kamael_pack_30 = 15205;
	protected int orcf_pack_30 = 15206;
	protected int orcm_pack_30 = 15207;
	protected int ticket_pack_30 = 15211;

	protected void CREATED(HandlerParam i0, HandlerParam c0) {
c0 = gg.GetCreatureFromID(myself.sm.summoner_id);
if (myself.IsNullCreature(c0) == 0) {
if (myself.IsInCategory(113, c0.occupation) == 1) {
myself.DeleteItem1(c0, ticket_pack_30, 1);
myself.GiveItem1(c0, knight_pack_30, 1);

} else if (myself.IsInCategory(114, c0.occupation) == 1) {
myself.DeleteItem1(c0, ticket_pack_30, 1);
myself.GiveItem1(c0, magic_pack_30, 1);

} else if (myself.IsInCategory(115, c0.occupation) == 1) {
myself.DeleteItem1(c0, ticket_pack_30, 1);
myself.GiveItem1(c0, warrior_pack_30, 1);

} else if (myself.IsInCategory(116, c0.occupation) == 1) {
myself.DeleteItem1(c0, ticket_pack_30, 1);
myself.GiveItem1(c0, rogue_pack_30, 1);

} else if (myself.IsInCategory(117, c0.occupation) == 1) {
myself.DeleteItem1(c0, ticket_pack_30, 1);
myself.GiveItem1(c0, kamael_pack_30, 1);

} else if (myself.IsInCategory(118, c0.occupation) == 1) {
myself.DeleteItem1(c0, ticket_pack_30, 1);
myself.GiveItem1(c0, orcf_pack_30, 1);

} else if (myself.IsInCategory(119, c0.occupation) == 1) {
myself.DeleteItem1(c0, ticket_pack_30, 1);
myself.GiveItem1(c0, orcm_pack_30, 1);

}

}
myself.AddTimerEx(2003, 30000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam c0) {
if (timer_id == 2003) {
myself.Despawn();

}
	}


}