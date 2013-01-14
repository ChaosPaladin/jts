package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_entrance_defeated extends default_npc {
	protected int TIMER_next_voice = 23147001;
	protected int TIMER_pc_leave = 23147002;
	protected int scene_sec_21 = 24000;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
gg.SendScriptEvent(myself.boss, 23140022, gg.GetIndexFromCreature(myself.sm));
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai0 == 0 && creature.is_pc == 1) {
myself.i_ai0 = 1;
myself.VoiceNPCEffect(creature, "Freya.freya_voice_01", 0);
myself.i_ai1 = gg.GetIndexFromCreature(creature);
myself.AddTimerEx(TIMER_next_voice, 20 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
if (timer_id == TIMER_next_voice) {
c0 = gg.GetCreatureFromIndex(myself.i_ai1);
if (myself.IsNullCreature(c0) == 0) {
if (c0.instant_zone_id == myself.InstantZone_GetId()) {
myself.VoiceNPCEffect(c0, "Freya.freya_voice_02", 0);

}

}

} else if (timer_id == TIMER_pc_leave) {
c0 = gg.GetCreatureFromIndex(myself.i_ai1);
if (myself.IsNullCreature(c0) == 0) {
myself.SetMemoState(c0, 10285, 3);
myself.SetFlagJournal(c0, 10285, 10);
myself.ShowQuestMark(c0, 10285);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.InstantZone_Leave(c0);

}
myself.InstantZone_Finish(1);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 231400001) {
myself.AddTimerEx(TIMER_pc_leave, scene_sec_21);

}
	}


}