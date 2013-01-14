package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_stakato_refine_female extends party_private_ag_couple_follower_female {
	protected void MY_DYING(HandlerParam maker0) {
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 20090501, myself.GetLifeTime() + myself.sm.param3, myself.GetCurrentTick());

} else {
myself.Say("메이커가 Null 입니다.");

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (myself.sm.master.alive == 0 && myself.i_ai0 == 0) {
if (myself.sm.hp > myself.sm.max_hp * 0.700000) {
if (gg.IsNull(myself.top_desire_target) == 0) {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(myself.top_desire_target), 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(myself.top_desire_target), 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(myself.top_desire_target), 0);
myself.i_ai0 = 1;

}

}

}
	}


}