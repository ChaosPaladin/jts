package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class barler_clear_npc extends default_npc {
	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.c_ai0 = gg.GetNullCreature();
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam party0) {
if (timer_id == 2001) {
myself.BroadcastScriptEvent(13004, 0, 3000);
myself.SpecialCamera3(myself.sm, 2300, 0, 90, 2000, 3000, 2500, 0, 180, 1, 0, 1);
myself.EffectMusic(myself.sm, 5000, "BS06_A");
myself.AddTimerEx(2002, 2000);

} else if (timer_id == 2002) {
myself.SpecialCamera3(myself.sm, 10, 180, 0, 17000, 3000, 30000, 0, 20, 1, 0, 0);
myself.AddTimerEx(2003, 17 * 1000);

} else if (timer_id == 2003) {
myself.SpecialCamera3(myself.sm, 15, 15, 0, 6000, 3000, 9000, 0, 10, 1, 0, 0);
myself.AddTimerEx(2004, 6 * 1000);

} else if (timer_id == 2004) {
myself.SpecialCamera3(myself.sm, 5, 200, 0, 6000, 3000, 9000, 0, 10, 1, 0, 0);
myself.AddTimerEx(2005, 6 * 1000);

} else if (timer_id == 2005) {
myself.SpecialCamera3(myself.sm, 5, 70, 0, 4000, 3000, 9000, 0, 10, 1, 0, 0);
myself.AddTimerEx(2006, 4 * 1000);

} else if (timer_id == 2006) {
myself.SpecialCamera3(myself.sm, 200, 60, 0, 1000, 3000, 4000, 0, 6, 1, 0, 0);
myself.AddTimerEx(2007, 1000);

} else if (timer_id == 2007) {
myself.SpecialCamera3(myself.sm, 500, 260, 0, 8000, 3000, 9000, 0, 10, 1, 0, 0);
myself.BroadcastScriptEvent(13009, 0, 3000);
myself.AddTimerEx(2008, 8 * 1000);

} else if (timer_id == 2008) {
myself.SpecialCamera3(myself.sm, 850, 260, 70, 2000, 3000, 5000, 0, 0, 1, 0, 0);
myself.AddTimerEx(2009, 2 * 1000);

} else if (timer_id == 2009) {
myself.SpecialCamera3(myself.sm, 0, 260, 70, 1000, 3000, 2000, 0, 0, 1, 0, 0);
myself.AddTimerEx(2010, 1000);

} else if (timer_id == 2010) {
myself.SpecialCamera3(myself.sm, 200, 20, 0, 100, 3000, 5000, 160, 15, 1, 0, 0);
myself.AddTimerEx(2011, 2000);
myself.AddTimerEx(2012, 500);

} else if (timer_id == 2011) {
myself.SpecialCamera3(myself.sm, 100, 20, 0, 4000, 3000, 7000, 160, 10, 1, 0, 0);
myself.AddTimerEx(2014, 6500);

} else if (timer_id == 2012) {
myself.BroadcastScriptEvent(13011, 0, 4000);
myself.AddTimerEx(2013, 500);

} else if (timer_id == 2013) {
myself.BroadcastScriptEvent(13010, 0, 3000);

} else if (timer_id == 2014) {
myself.BroadcastScriptEvent(13007, 0, 3000);

} else if (timer_id == 3001) {
if (myself.i_ai2 != 10) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c0) == 1) {
myself.i_ai2 = 10;
myself.AddTimerEx(2001, 1000);
return;

}

}

}

}

} else if (timer_id == 3002) {
if (myself.Skill_GetConsumeMP(353959937) < myself.sm.mp && myself.Skill_GetConsumeHP(353959937) < myself.sm.hp && myself.Skill_InReuseDelay(353959937) == 0) {
myself.AddUseSkillDesire(myself.sm, 353959937, 1, 0, 1000000);

}
myself.AddTimerEx(3003, 8000);

} else if (timer_id == 3003) {
myself.BroadcastScriptEvent(13025, 0, 3000);
myself.BroadcastScriptEvent(13019, 0, 2000);
myself.Despawn();

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 13008) {

}
if (script_event_arg1 == 13022) {
myself.AddTimerEx(3002, 1300);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam party0, HandlerParam i0) {
myself.c_ai0 = creature;
if (creature.is_pc == 1 && myself.i_ai2 == 0) {
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
i0 = party0.member_count;
myself.i_ai3 = i0;

} else {
myself.AddTimerEx(2001, 1000);
myself.i_ai2 = 10;

}

}
if (myself.i_ai2 <= myself.i_ai3) {
myself.i_ai2 = myself.i_ai2 + 1;
if (myself.i_ai3 == myself.i_ai2) {
myself.AddTimerEx(2001, 3000);
myself.i_ai2 = 10;

}

}
myself.AddTimerEx(3001, 15 * 1000);
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == 353959937) {
myself.BroadcastScriptEvent(13025, 0, 3000);
myself.BroadcastScriptEvent(13019, 0, 2000);
myself.Despawn();

}
	}


}