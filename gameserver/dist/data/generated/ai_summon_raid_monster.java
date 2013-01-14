package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_summon_raid_monster extends default_npc {
	protected int DS_fieldCycle_ID = 2;
	protected String DummyMakerName = "dummy_default_maker_name";
	protected String NormalMakerName = "default_maker_name";
	protected String DropMonsterMakerName = "rumwarsha_e1225_05m1";

	protected void CREATED() {
myself.AddTimerEx(1225001, 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam i0) {
if (timer_id == 1225001) {
i0 = gg.GetStep_FieldCycle(DS_fieldCycle_ID);
if (i0 == 2 && myself.i_ai0 == 0) {
maker0 = gg.GetNpcMaker(DropMonsterMakerName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai0 = 1;

}
if (i0 != 2 && myself.i_ai0 == 1) {
maker0 = gg.GetNpcMaker(DropMonsterMakerName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai0 = 0;

}
myself.AddTimerEx(1225001, 10000);

}
if (timer_id == 1225002) {
i0 = gg.GetStep_FieldCycle(DS_fieldCycle_ID);
if (i0 == 2 && myself.i_ai0 == 0) {
maker0 = gg.GetNpcMaker(DropMonsterMakerName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai0 = 1;

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam private, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam s1) {
if (script_event_arg1 == 1225001) {
myself.i_ai0 = 0;
myself.AddTimerEx(1225002, 60 * 60 * 1000);

}
	}


}