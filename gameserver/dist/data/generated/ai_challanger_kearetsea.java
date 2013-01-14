package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_challanger_kearetsea extends wizard_basic {
	protected String my_maker_name = "gludio58_1926_700m1";
	protected String Privates = "";
	protected int my_id = 78010038;
	protected int mate_id_1 = 78010036;
	protected int mate_id_2 = 78010037;
	protected double hp_heal_percentage = 0.030000;
	protected double ATTACKED_Weight_Point = 10.000000;
	protected double CLAN_ATTACKED_Weight_Point = 5.000000;
	protected double PARTY_ATTACKED_Weight_Point = 0.000000;
	protected double SEE_SPELL_Weight_Point = 30.000000;
	protected double HATE_SKILL_Weight_Point = 5.000000;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.c_ai0 = gg.GetNullCreature();
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

} else if (myself.IsNullCreature(myself.c_ai1) == 0 && myself.IsNullCreature(myself.c_ai2) == 0 && myself.IsNullCreature(victim) == 0 && gg.Rand(1000) > 333) {
if (victim == myself.sm || victim == myself.c_ai1 || victim == myself.c_ai2) {
myself.c_ai0 = victim;
myself.AddTimerEx(78002, 1 * 1000);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 78001) {
myself.BroadcastScriptEventEx(my_id, myself.sm.id, 0, 1000);

} else if (timer_id == 78002) {
if (gg.Rand(100000) > 333 && myself.IsNullCreature(myself.c_ai0) == 0 && myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp) {
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.c_ai0, Skill03_ID, 1, 1, 1000000000);

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == Skill03_ID && success == 1) {
gg.SetNpcParam(target, 9, target.hp + target.max_hp * hp_heal_percentage);

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
myself.AddUseSkillDesire(c1, Skill01_ID, 0, 1, 1000000000);

}

} else {
myself.AddUseSkillDesire(c0, Skill01_ID, 0, 1, 1000000000);

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