package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sailren_clear_npc extends default_npc {
	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.RemoveAllDesire();
if (myself.Skill_GetConsumeMP(333578241) < myself.sm.mp && myself.Skill_GetConsumeHP(333578241) < myself.sm.hp && myself.Skill_InReuseDelay(333578241) == 0) {
myself.AddUseSkillDesire(myself.sm, 333578241, 1, 1, 1000000);

}

}
if (timer_id == 1002) {
myself.RemoveAllDesire();
if (myself.Skill_GetConsumeMP(333578241) < myself.sm.mp && myself.Skill_GetConsumeHP(333578241) < myself.sm.hp && myself.Skill_InReuseDelay(333578241) == 0) {
myself.AddUseSkillDesire(myself.sm, 333578241, 1, 1, 1000000);

}

}
if (timer_id == 1003) {
myself.RemoveAllDesire();
if (myself.Skill_GetConsumeMP(333578241) < myself.sm.mp && myself.Skill_GetConsumeHP(333578241) < myself.sm.hp && myself.Skill_InReuseDelay(333578241) == 0) {
myself.AddUseSkillDesire(myself.sm, 333578241, 1, 1, 1000000);

}

}
if (timer_id == 1004) {
myself.RemoveAllDesire();
if (myself.Skill_GetConsumeMP(333578241) < myself.sm.mp && myself.Skill_GetConsumeHP(333578241) < myself.sm.hp && myself.Skill_InReuseDelay(333578241) == 0) {
myself.AddUseSkillDesire(myself.sm, 333578241, 1, 1, 1000000);

}

}
if (timer_id == 1005) {
myself.RemoveAllDesire();
if (myself.Skill_GetConsumeMP(333643777) < myself.sm.mp && myself.Skill_GetConsumeHP(333643777) < myself.sm.hp && myself.Skill_InReuseDelay(333643777) == 0) {
myself.AddUseSkillDesire(myself.sm, 333643777, 1, 1, 1000000);

}

}
if (timer_id == 1006) {
myself.RemoveAllDesire();
if (myself.Skill_GetConsumeMP(333643777) < myself.sm.mp && myself.Skill_GetConsumeHP(333643777) < myself.sm.hp && myself.Skill_InReuseDelay(333643777) == 0) {
myself.AddUseSkillDesire(myself.sm, 333643777, 1, 1, 1000000);

}

}
if (timer_id == 2000) {
myself.SpecialCamera(myself.sm, 100, 180, 30, 3000, 1500, 20000, 0, 50, 1, 0, 0);
myself.AddTimerEx(2001, 3000);

}
if (timer_id == 2001) {
myself.SpecialCamera(myself.sm, 150, 270, 25, 3000, 1500, 20000, 0, 30, 1, 0, 0);
myself.AddTimerEx(2002, 3000);

}
if (timer_id == 2002) {
myself.SpecialCamera(myself.sm, 160, 360, 20, 3000, 1500, 20000, 10, 15, 1, 0, 0);
myself.AddTimerEx(2003, 3000);

}
if (timer_id == 2003) {
myself.SpecialCamera(myself.sm, 160, 450, 10, 3000, 1500, 20000, 0, 10, 1, 0, 0);
myself.AddTimerEx(2004, 3000);

}
if (timer_id == 2004) {
myself.SpecialCamera(myself.sm, 160, 560, 0, 3000, 1500, 20000, 0, 10, 1, 0, 0);
myself.AddTimerEx(2005, 7000);

}
if (timer_id == 2005) {
myself.SpecialCamera(myself.sm, 70, 560, 0, 500, 1500, 7000, -15, 20, 1, 0, 0);
myself.AddTimerEx(2006, 15000);

}
if (timer_id == 2006) {
myself.BroadcastScriptEventEx(11055, myself.i_ai0, 0, 1000);

}
if (timer_id == 3001) {
myself.SpecialCamera(myself.sm, 60, 110, 30, 4000, 1500, 20000, 0, 65, 1, 0, 0);
if (myself.Skill_GetConsumeMP(333578241) < myself.sm.mp && myself.Skill_GetConsumeHP(333578241) < myself.sm.hp && myself.Skill_InReuseDelay(333578241) == 0) {
myself.AddUseSkillDesire(myself.sm, 333578241, 1, 1, 1000000);

}
myself.AddTimerEx(1001, 3400);
if (myself.Skill_GetConsumeMP(333578241) < myself.sm.mp && myself.Skill_GetConsumeHP(333578241) < myself.sm.hp && myself.Skill_InReuseDelay(333578241) == 0) {
myself.AddUseSkillDesire(myself.sm, 333578241, 1, 1, 1000000);

}
myself.AddTimerEx(1002, 6800);
if (myself.Skill_GetConsumeMP(333578241) < myself.sm.mp && myself.Skill_GetConsumeHP(333578241) < myself.sm.hp && myself.Skill_InReuseDelay(333578241) == 0) {
myself.AddUseSkillDesire(myself.sm, 333578241, 1, 1, 1000000);

}
myself.AddTimerEx(1003, 10000);
if (myself.Skill_GetConsumeMP(333578241) < myself.sm.mp && myself.Skill_GetConsumeHP(333578241) < myself.sm.hp && myself.Skill_InReuseDelay(333578241) == 0) {
myself.AddUseSkillDesire(myself.sm, 333578241, 1, 1, 1000000);

}
myself.AddTimerEx(1004, 13200);
if (myself.Skill_GetConsumeMP(333643777) < myself.sm.mp && myself.Skill_GetConsumeHP(333643777) < myself.sm.hp && myself.Skill_InReuseDelay(333643777) == 0) {
myself.AddUseSkillDesire(myself.sm, 333643777, 1, 1, 1000000);

}
myself.AddTimerEx(1005, 16500);
if (myself.Skill_GetConsumeMP(333643777) < myself.sm.mp && myself.Skill_GetConsumeHP(333643777) < myself.sm.hp && myself.Skill_InReuseDelay(333643777) == 0) {
myself.AddUseSkillDesire(myself.sm, 333643777, 1, 1, 1000000);

}
myself.AddTimerEx(1006, 23500);
myself.AddTimerEx(2000, 4100);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam party0) {
if (creature.is_pc == 1) {
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
myself.i_ai0 = party0.id;

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam maker0) {
if (script_event_arg1 == 11044) {
myself.AddTimerEx(3001, 3 * 60 * 1000 + 6);

}
if (script_event_arg1 == 11046) {
if (gg.Rand(100) < 50) {
myself.InstantTeleportInMyTerritory(23575, -7727, -1272, 100);

} else {
myself.InstantTeleportInMyTerritory(23421, -8167, -1326, 100);

}

}
if (script_event_arg1 == 11048) {
if (gg.Rand(100) < 50) {
myself.InstantTeleportInMyTerritory(23575, -7727, -1272, 100);

} else {
myself.InstantTeleportInMyTerritory(23421, -8167, -1326, 100);

}

}
if (script_event_arg1 == 11051) {
if (gg.Rand(100) < 50) {
myself.InstantTeleportInMyTerritory(23575, -7727, -1272, 100);

} else {
myself.InstantTeleportInMyTerritory(23421, -8167, -1326, 100);

}
maker0 = gg.GetNpcMaker("rune20_mb2017_01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11052, 0, 0);
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker("rune20_mb2017_02m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11052, 0, 0);
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker("rune20_mb2017_03m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11052, 0, 0);
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.GetNpcMaker("rune16_npc2017_01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 11050, 0, 0);

}

}
if (script_event_arg1 == 11054) {
myself.CreateOnePrivateEx(1032107, "ai_teleport_cube_sailren", 0, 0, 27644, -6638, -2008, 0, 0, 0, 0);

}
if (script_event_arg1 == 11047) {
if (gg.Rand(100) < 50) {
myself.InstantTeleportInMyTerritory(23575, -7727, -1272, 100);

} else {
myself.InstantTeleportInMyTerritory(23421, -8167, -1326, 100);

}

}
	}


}