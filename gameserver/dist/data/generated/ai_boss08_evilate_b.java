package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_evilate_b extends default_npc {
	protected String Privates = "portrait_spirit_winged:ai_boss08_portrait_spirit_winged:4:20sec";
	protected int SpawnPosX = 174230;
	protected int SpawnPosY = -88012;
	protected int SpawnPosZ = -5112;
	protected int SpawnAngle = 16384;

	protected void CREATED(HandlerParam i0) {
myself.AddTimerEx(1000, 45 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.CreateOnePrivateInzoneEx(1029051, "ai_boss08_portrait_spirit_winged", 0, 0, SpawnPosX, SpawnPosY, SpawnPosZ, SpawnAngle, 0, 0, 0, myself.InstantZone_GetId());
myself.AddTimerEx(1001, 20000);

} else if (timer_id == 1001) {
myself.CreateOnePrivateInzoneEx(1029051, "ai_boss08_portrait_spirit_winged", 0, 0, SpawnPosX, SpawnPosY, SpawnPosZ, SpawnAngle, 0, 0, 0, myself.InstantZone_GetId());

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.CreateOnePrivateInzoneEx(private.npc_class_id, private.ai, private.weight_point, 20, SpawnPosX, SpawnPosY, SpawnPosZ, SpawnAngle, 0, 0, 0, myself.InstantZone_GetId());

}
	}

	protected void ATTACKED(HandlerParam skill_name_id) {
if (skill_name_id == 149159937) {
myself.Suicide();

}
	}


}