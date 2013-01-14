package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_ag_type1_freya_rg extends raid_boss_ag_type1 {
	protected void MY_DYING(HandlerParam maker0) {
maker0 = gg.GetNpcMaker("schuttgart13_mb2314_05m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10005, 0, 0);

}
myself.BroadcastScriptEvent(11036, 3, 7000);
	}


}