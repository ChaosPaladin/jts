package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_shout_target extends party_private {
	protected int MagicHeal = 458752001;

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam c1) {
if (myself.sm.alive == 0) {
return;

}
if (script_event_arg1 == 10002) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
c1 = gg.GetCreatureFromIndex(myself.boss.flag);
if (myself.IsNullCreature(c0) == 0 && c0 == myself.boss) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.IsNullCreature(c1) == 0 && myself.top_desire_target == c1) {
return;

}

}
switch (gg.Rand(4)) {
case 0: {
myself.Say(gg.MakeFString(1000292, "", "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000400, "", "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000401, "", "", "", "", ""));
break;

}
case 3: {
myself.Say(gg.MakeFString(1000402, "", "", "", "", ""));
break;

}

}
if (myself.IsNullCreature(c1) == 0) {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(gg.GetCreatureFromIndex(myself.boss.flag), 1, 1000000);

}

}

}
if (script_event_arg1 == 10034) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(myself.boss, MagicHeal, 1, 1, 1000000);

}

}
if (script_event_arg1 == 11039) {
myself.Despawn();

}
	}


}