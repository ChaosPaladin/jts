package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_sub_maker extends default_maker {
	protected String maker0 = "fortress_sub_maker_default";

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam def0, HandlerParam reply) {
if (reply == 0) {
def0 = myself.GetSpawnDefine(0);
gg.SendMakerScriptEvent(maker0, 10025, 0, 0);

}
	}


}