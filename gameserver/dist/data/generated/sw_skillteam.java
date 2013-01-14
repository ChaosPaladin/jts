package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sw_skillteam extends show_npc {
	protected int MoveType = 0;
	protected String SuperPointName = "";
	protected int SearchType = 2;
	protected int SearchType_Base = 0;
	protected int SuperPointDesire = 100000;
	protected int IsStaticNpc = 0;

	protected void CREATED() {
myself.EffectMusic(myself.sm, 5000, "TP05_F");
myself.AddTimerEx(7000, 3 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 7000) {
myself.AddMoveSuperPointDesire(SuperPointName, SearchType, SuperPointDesire);
myself.AddTimerEx(7001, 102 * 1000);

}
if (timer_id == 7001) {
myself.RemoveAllDesire();
myself.AddTimerEx(7002, 1000);

}
if (timer_id == 7002) {
if (gg.IsSameString(SuperPointName, "show_skillteam_a1")) {
myself.AddMoveToDesire(-AddMoveToDesire, -56375, -2008, 20000);

}
if (gg.IsSameString(SuperPointName, "show_skillteam_a2")) {
myself.AddMoveToDesire(-AddMoveToDesire, -56289, -2008, 20000);

}
if (gg.IsSameString(SuperPointName, "show_skillteam_b1")) {
myself.AddMoveToDesire(-AddMoveToDesire, -56429, -2008, 20000);

}
if (gg.IsSameString(SuperPointName, "show_skillteam_b2")) {
myself.AddMoveToDesire(-AddMoveToDesire, -56246, -2008, 20000);

}
if (gg.IsSameString(SuperPointName, "show_skillteam_c1")) {
myself.AddMoveToDesire(-AddMoveToDesire, -56334, -2008, 20000);

}
if (gg.IsSameString(SuperPointName, "show_skillteam_d1")) {
myself.AddMoveToDesire(-AddMoveToDesire, -56427, -2008, 20000);

}
if (gg.IsSameString(SuperPointName, "show_skillteam_d2")) {
myself.AddMoveToDesire(-AddMoveToDesire, -56248, -2008, 20000);

}
if (gg.IsSameString(SuperPointName, "show_skillteam_e1")) {
myself.AddMoveToDesire(-AddMoveToDesire, -56473, -2008, 20000);

}
if (gg.IsSameString(SuperPointName, "show_skillteam_e2")) {
myself.AddMoveToDesire(-AddMoveToDesire, -56201, -2008, 20000);

}

}
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
myself.BroadcastScriptEvent(11, 6, 10000);
myself.Despawn();
	}


}