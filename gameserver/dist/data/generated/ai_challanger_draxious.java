package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_challanger_draxious extends warrior_basic {
	protected String my_maker_name = "gludio58_1926_700m1";
	protected String Privates = "";
	protected int Skill04_ID = 458752001;
	protected int my_id = 78010037;
	protected int mate_id_1 = 78010036;
	protected int mate_id_2 = 78010038;
	protected double hp_regen_percentage = 0.000100;
	protected double ATTACKED_Weight_Point = 10.000000;
	protected double CLAN_ATTACKED_Weight_Point = 5.000000;
	protected double PARTY_ATTACKED_Weight_Point = 0.000000;
	protected double SEE_SPELL_Weight_Point = 5.000000;
	protected double HATE_SKILL_Weight_Point = 30.000000;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.AddTimerEx(78001, 10 * 1000);
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam maker0) {
if (myself.i_ai0 == 0) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010005, gg.GetIndexFromCreature(attacker), 0);

}

} else if (myself.IsNullCreature(attacker) == 0) {
if (victim == myself.c_ai1 || victim == myself.c_ai2) {
if (myself.IsNullCreature(myself.c_ai1) == 0 && gg.Rand(10000) > 1500) {
gg.SetNpcParam(myself.sm, 9, myself.sm.hp - myself.sm.max_hp * hp_regen_percentage);
gg.SetNpcParam(myself.c_ai1, 9, myself.c_ai1.hp + myself.sm.max_hp * hp_regen_percentage);

}
if (myself.IsNullCreature(myself.c_ai2) == 0 && gg.Rand(10000) > 3000) {
gg.SetNpcParam(myself.sm, 9, myself.sm.hp - myself.sm.max_hp * hp_regen_percentage);
gg.SetNpcParam(myself.c_ai2, 9, myself.c_ai2.hp + myself.sm.max_hp * hp_regen_percentage);

}
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && gg.Rand(10000) > 333) {
myself.AddUseSkillDesire(attacker, Skill03_ID, 0, 1, 1000000);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 78001) {
myself.BroadcastScriptEventEx(my_id, myself.sm.id, 0, 1000);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam c1, HandlerParam party0) {
if (script_event_arg1 == 78010005) {
if (myself.i_ai0 == 0) {
if (gg.IsSameString(Privates, "") == 0) {
myself.CreatePrivates(Privates);

}
c0 = gg.GetCreatureFromIndex(script_event_arg2);
party0 = gg.GetParty(c0);
if (myself.IsNullParty(gg.GetParty(c0)) == 0) {
c1 = myself.GetMemberOfParty(party0, gg.Rand(party0.member_count) + 1);
if (myself.IsNullCreature(c1) == 0) {
myself.AddAttackDesire(c1, 1, 1000);

}

} else {
myself.AddAttackDesire(c0, 1, 1000);

}
myself.i_ai0 = 1;

}

} else if (script_event_arg1 == mate_id_1) {
myself.c_ai1 = gg.GetCreatureFromID(script_event_arg2);

} else if (script_event_arg1 == mate_id_2) {
myself.c_ai2 = gg.GetCreatureFromID(script_event_arg2);

}
super;
	}

	protected void MY_DYING(HandlerParam maker0) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010025, 0, 0);

}
	}


}