package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_malignant_thing extends warrior_basic {
	protected String SuperPointName = "";
	protected String my_maker_name = "gludio56_2025_malignant99m1";

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0) {
if (script_event_arg1 == 78010015) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 100000);

}

}
super;
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam maker0) {
if (gg.IsSameString(SuperPointName, "malign_conveyor_1_1") == 1 && script_event_arg1 == 4 || gg.IsSameString(SuperPointName, "malign_conveyor_1_2") == 1 && script_event_arg1 == 5 || gg.IsSameString(SuperPointName, "malign_conveyor_1_3") == 1 && script_event_arg1 == 2) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010033, 0, 0);
myself.Despawn();

}

} else if (gg.IsSameString(SuperPointName, "malign_conveyor_1_4") == 1 && script_event_arg1 == 3) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010032, 0, 0);
myself.Despawn();

}

}
super;
	}


}