package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_type1_move extends raid_boss_type1 {
	protected String SuperPointName = "gordon";
	protected int SuperPointMove = 2;

	protected void CREATED(HandlerParam reply) {
if (reply == 0) {
if (gg.IsSameString(SuperPointName, "") || SuperPointMove == -1) {
myself.Say("슈퍼포인트 없음");

} else {
myself.ChangeMoveType(0);
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMove, 2000);

}

} else {
myself.InstantTeleport(myself.sm, 147408, -43552, -2296);
if (gg.IsSameString(SuperPointName, "") || SuperPointMove == -1) {
myself.Say("슈퍼포인트 없음");

} else {
myself.ChangeMoveType(0);
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMove, 2000);

}

}
myself.AddTimerEx(2001, 40 * 1000);
myself.AddTimerEx(2003, 3 * 1000);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0, HandlerParam damage) {
if (gg.OwnItemCount(attacker, 8190) == 1 || gg.OwnItemCount(attacker, 8689) == 1) {
myself.AddAttackDesire(attacker, 1, damage * 10);

}
super;
	}

	protected void ATTACK_FINISHED(HandlerParam target) {
if (target.alive == 0 && target.is_pc != 0) {
myself.LookItem(450, 1, 8190);
myself.LookItem(450, 1, 8689);

}
super;
	}

	protected void SEE_ITEM(HandlerParam item_index_list, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i0 = item_index_list.GetSize();
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
myself.AddGetItemDesireEx(item_index_list.GetItemIndex(i1), 1000000);
myself.AddTimerEx(2002, 3000);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (gg.OwnItemCount(creature, 8190) == 1 || gg.OwnItemCount(creature, 8689) == 1) {
myself.AddAttackDesire(creature, 1, 1000000);

}
super;
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg3 == 1) {
myself.AddEffectActionDesire(myself.sm, script_event_arg3, 3300, 10000000);

}
myself.ChangeMoveType(0);
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMove, 50);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
myself.LookNeighbor(500);
myself.AddTimerEx(2001, 40 * 1000);

} else if (timer_id == 2002) {
if (gg.OwnItemCount(myself.sm, 8190) > 0 || gg.OwnItemCount(myself.sm, 8689) > 0) {
myself.Despawn();

}

} else if (timer_id == 2003) {
myself.LookItem(450, 1, 8190);
myself.LookItem(450, 1, 8689);
myself.AddTimerEx(2003, 3 * 1000);

}
super;
	}

	protected void GET_ITEM_FINISHED() {
	}


}