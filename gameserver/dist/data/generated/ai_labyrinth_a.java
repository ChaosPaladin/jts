package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_labyrinth_a extends warrior_use_skill {
	protected int is_private = 1;
	protected int silhouette = 1020130;
	protected String ai_type = "warrior";

	protected void CREATED(HandlerParam i0) {
myself.AddTimerEx(8255, 3 * 1000);
if (is_private == 0) {
i0 = gg.Rand(9);
if (i0 == 0) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y - 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y + 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);

} else if (i0 == 1) {
myself.InstantTeleport(myself.sm, myself.start_x - 85, myself.start_y - 60, myself.start_z);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y - 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y + 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);

} else if (i0 == 2) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y - 120, myself.start_z);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y + 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);

} else if (i0 == 3) {
myself.InstantTeleport(myself.sm, myself.start_x + 85, myself.start_y - 60, myself.start_z);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y - 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y + 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);

} else if (i0 == 4) {
myself.InstantTeleport(myself.sm, myself.start_x - 120, myself.start_y, myself.start_z);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y - 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y + 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);

} else if (i0 == 5) {
myself.InstantTeleport(myself.sm, myself.start_x + 120, myself.start_y, myself.start_z);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y - 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y + 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);

} else if (i0 == 6) {
myself.InstantTeleport(myself.sm, myself.start_x - 85, myself.start_y + 60, myself.start_z);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y - 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y + 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);

} else if (i0 == 7) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y + 120, myself.start_z);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y - 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);

} else {
myself.InstantTeleport(myself.sm, myself.start_x + 85, myself.start_y + 60, myself.start_z);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y - 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 85), gg.FloatToInt(myself.start_y - 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x + 120), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x - 85), gg.FloatToInt(myself.start_y + 60), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y + 120), gg.FloatToInt(myself.start_z), 0, 0, 0, 0);

}

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (is_private == 0) {
if (private != myself.sm) {
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, 0);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 8255) {
if (myself.start_z - gg.FloatToInt(myself.sm.z) > 500 || myself.start_z - gg.FloatToInt(myself.sm.z) < -500) {
myself.RemoveAllAttackDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}
myself.AddTimerEx(8255, 3000);

}
super;
	}


}