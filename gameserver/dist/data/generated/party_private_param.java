package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_param extends warrior {
	protected int IsSayPrivate = 1;

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam c1) {
if (myself.sm.alive == 0) {
return;

}
if (script_event_arg1 == 10002) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (c0 == myself.boss) {
c1 = gg.GetCreatureFromIndex(myself.boss.flag);
if (myself.IsNullCreature(c1) == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == c1) {
return;

}

}
if (IsSayPrivate == 1) {
switch (gg.Rand(4)) {
case 0: {
myself.Say(gg.MakeFString(1000292, "", "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000400, "", "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000401, "", "", "", "", ""));
break;

}
case 3: {
myself.Say(gg.MakeFString(1000402, "", "", "", "", ""));
break;

}

}

}
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(c1, 1, 2000);

}

}

}

} else if (script_event_arg1 == 11039) {
myself.Despawn();

}
	}


}