package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_wizard_explosion extends wizard_basic {
	protected String MyMaker = "my_maker";
	protected int SelfExplosion = 362283009;
	protected int MyMakerNumber = 0;
	protected int SD_skill = 458752001;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 1) {
myself.Whisper(creature, "자폭 체크 플래그 값 : " + gg.IntToStr(myself.i_ai0) + " 체크");
myself.Whisper(creature, "메시지 체크 플래그 값 : " + gg.IntToStr(myself.i_ai1) + " 체크");

}
	}

	protected void ATTACKED(HandlerParam maker0) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 30 && myself.i_ai0 == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(29622273)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(45547521)) > 0) {

} else {
myself.RemoveAllDesire();
myself.i_ai0 = 1;
myself.AddTimerEx(9889, 10 * 1000);
myself.AddUseSkillDesire(myself.sm, SelfExplosion, 1, 0, 999999999999999999);

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 88012) {
if (myself.i_ai1 == 0) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, SelfExplosion, 1, 0, 999999999999999999);

} else {
return;

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success, HandlerParam maker0, HandlerParam h0) {
if (skill_name_id == SelfExplosion && myself.i_ai0 == 1) {
myself.i_ai1 = 1;
myself.BroadcastScriptEvent(88012, gg.GetIndexFromCreature(myself.sm), 100);
maker0 = gg.GetNpcMaker(MyMaker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 88004, 0, 0);
myself.Suicide();

}

} else if (skill_name_id == SelfExplosion && myself.i_ai0 == 0) {
myself.i_ai1 = 1;
myself.BroadcastScriptEvent(88012, gg.GetIndexFromCreature(myself.sm), 100);
maker0 = gg.GetNpcMaker(MyMaker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 88005, MyMakerNumber, 0);
myself.Despawn();

}

} else if (skill_name_id == Skill01_ID && gg.Rand(100) < 20) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.AddUseSkillDesire(h0.creature, SD_skill, 0, 1, 999999999999999999);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 9989) {
if (myself.i_ai0 == 1) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;

}

}
	}


}