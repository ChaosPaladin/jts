package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_santa extends default_npc {
	protected void CREATED() {
gg.SendScriptEvent(myself.boss, 2, 0);
myself.AddTimerEx(1229, 5000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
if (timer_id == 1229) {
if (gg.Rand(2) == 0) {
myself.Say(gg.MakeFString(1900019, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1900020, "", "", "", "", ""));

}
myself.AddTimerEx(1230, 5000);

} else if (timer_id == 1230) {
c0 = gg.GetCreatureFromID(myself.GetGlobalMap(101));
if (myself.IsNullCreature(c0) == 1) {
myself.Say(gg.MakeFString(1900021, "!", "", "", "", ""));

} else if (gg.Rand(2) == 1) {
myself.Say(gg.MakeFString(1900021, c0.name, "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1900022, c0.name, "", "", "", ""));

}
myself.PlayAnimation(4, 600);
myself.AddTimerEx(1231, 5000);

} else if (timer_id == 1231) {
if (gg.Rand(2) == 1) {
myself.Say(gg.MakeFString(1900023, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1900024, "", "", "", "", ""));

}
myself.AddTimerEx(1232, 5000);

} else if (timer_id == 1232) {
myself.PlayAnimation(3, 600);
myself.AddTimerEx(1233, 1000);

} else if (timer_id == 1233) {
myself.SetVisible(0);
myself.AddTimerEx(1234, 5000);

} else if (timer_id == 1234) {
myself.Despawn();

}
super;
	}


}