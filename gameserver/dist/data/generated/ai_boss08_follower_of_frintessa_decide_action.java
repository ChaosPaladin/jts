package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_follower_of_frintessa_decide_action extends ai_boss08_follower_of_frintessa_set_db {
	protected void CREATED(HandlerParam reply) {
super;
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai3 = 0;
myself.i_ai2 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = myself.GetCurrentTick();
myself.AddTimerEx(3000, 60 * 1000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam i1, HandlerParam plist0, HandlerParam pos0, HandlerParam i2, HandlerParam c0) {
if (myself.sm.hp < myself.sm.max_hp * 0.600000 && myself.i_ai0 == 0) {
myself.RemoveAllDesire();
myself.i_ai4 = 1;
myself.i_quest2 = 0;
myself.i_quest3 = 0;
myself.i_quest4 = 0;
myself.AddUseSkillDesire(myself.sm, ChangeBodySkill, 1, 1, 1000000);
myself.SetDBValue(myself.sm, 6);
i2 = myself.GetGlobalMap(4);
c0 = gg.GetCreatureFromIndex(i2);
gg.SendScriptEvent(c0, gg.GetIndexFromCreature(myself.sm), 6);
myself.i_ai3 = 6;
myself.AddTimerEx(4000, 2000);
myself.i_ai0 = 1;

} else if (myself.sm.hp < myself.sm.max_hp * 0.500000 && myself.i_ai3 == 30010) {
c0 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, myself.sm.id, 30010);

}
myself.i_ai3 = 30010;

} else if (myself.sm.hp <= myself.sm.max_hp * 0.200000 && myself.i_ai4 == 0) {
myself.i_ai3 = 30011;
myself.BroadcastScriptEvent(0, 50000, 6000);
myself.RemoveAllDesire();
myself.RemoveAllHateInfoIF(0, 0);
myself.RemoveAllAttackDesire();
myself.StopMove();
myself.i_ai4 = 1;
myself.AddTimerEx(2000, 1000);

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker) {
super;
	}

	protected void SEE_SPELL(HandlerParam speller) {
super;
	}

	protected void SPELLED(HandlerParam speller) {
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam maker0) {
super;
if (timer_id == 3000) {
if (myself.i_ai4 == 0) {
myself.LookNeighbor(2000);
myself.AddTimerEx(3000, 60 * 1000);

}

} else if (timer_id == 4000) {
myself.RemoveAllDesire();
myself.EquipItem(ChangeWeapon);
myself.AddTimerEx(4001, 3000);

} else if (timer_id == 4001) {
myself.i_ai4 = 0;
myself.AddTimerEx(3000, 1000);

}
	}

	protected void NO_DESIRE(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c2, HandlerParam h0) {
if (myself.i_ai4 == 1) {
return;

} else {
myself.LookNeighbor(2000);
if (myself.i_ai4 == 0) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 5000);
h0 = myself.GetMaxHateInfo(0);
if (gg.IsNull(h0) == 0) {
c2 = h0.creature;

}
if (myself.IsNullCreature(c2) == 0) {
if (myself.i_ai3 < 30010) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(h0.creature, DashAllVer1, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer1, 0, 1, 10000);

}

}
if (myself.i_ai3 >= 30010) {
if (myself.i_ai2 > 0) {
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.500000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

}

}

}

}
	}


}