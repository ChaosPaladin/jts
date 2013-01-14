package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_36_normal_private extends inzone_combat_monster {
	protected int basic_hate = 100;
	protected int Skill01 = 274857987;
	protected int Skill01_Probablity = 50;
	protected int Skill01_Target_Type = 0;
	protected int reflect_skill = 273678339;

	protected void CREATED() {
myself.AddTimerEx(9004, 60 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam party0, HandlerParam h0, HandlerParam private) {
if (timer_id == 9004) {
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(myself.boss, reflect_skill, 0, 1, 700000000);

}
myself.AddTimerEx(9004, 50 * 1000 + gg.Rand(1000));

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 4) {
myself.Despawn();

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private == myself.boss) {
myself.Despawn();

}
	}


}