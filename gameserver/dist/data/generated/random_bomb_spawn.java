package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class random_bomb_spawn extends default_maker {
	protected String maker_name1 = "random_bomb_spawn_default1";
	protected String maker_name2 = "random_bomb_spawn_default2";
	protected String maker_name3 = "random_bomb_spawn_default3";
	protected int spawn_rate1 = 0;
	protected int spawn_rate2 = 0;
	protected int spawn_rate3 = 0;
	protected int maker_cnt = 1;

	protected void ON_START(HandlerParam i0, HandlerParam i1, HandlerParam def0, HandlerParam maker0) {
i0 = spawn_rate1 + spawn_rate2 + spawn_rate3;
i1 = gg.Rand(i0);
if (i1 < spawn_rate1) {
maker0 = gg.GetNpcMaker(maker_name1);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

} else if (i1 < spawn_rate1 + spawn_rate2) {
maker0 = gg.GetNpcMaker(maker_name2);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

} else {
maker0 = gg.GetNpcMaker(maker_name3);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
switch (script_event_arg1) {
case 1000: {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}
break;

}
case 1001: {
i0 = spawn_rate1 + spawn_rate2 + spawn_rate3;
i1 = gg.Rand(i0);
if (i1 < spawn_rate1) {
maker0 = gg.GetNpcMaker(maker_name1);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

} else if (i1 < spawn_rate1 + spawn_rate2) {
maker0 = gg.GetNpcMaker(maker_name2);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

} else {
maker0 = gg.GetNpcMaker(maker_name3);
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
break;

}

}
	}


}