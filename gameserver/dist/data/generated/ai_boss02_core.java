package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss02_core extends default_npc {
	protected String Privates = "orc:party_private:1:20sec";
	protected int different_level_9_attacked = 295895041;
	protected int different_level_9_see_spelled = 276234241;

	protected void CREATED() {
myself.EffectMusic(myself.sm, 10000, "BS01_A");
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.CreatePrivates(Privates);
myself.AddTimerEx(1001, 60000);
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, 280 + gg.Rand(40));

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam c0, HandlerParam i0) {
myself.i_ai2 = myself.GetCurrentTick();
if (attacker.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(different_level_9_attacked)) == -1) {
if (different_level_9_attacked == 295895041) {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);
myself.RemoveAttackDesire(attacker.id);
return;

} else {
myself.CastBuffForQuestReward(attacker, different_level_9_attacked);

}

}

}
if (myself.i_ai0 == 0) {
myself.Say(gg.MakeFString(1000001, "", "", "", "", ""));
myself.Say(gg.MakeFString(1000002, "", "", "", "", ""));
myself.i_ai0 = 1;

} else if (gg.Rand(100) < 1) {
myself.Say(gg.MakeFString(1000003, "", "", "", "", ""));

}
if (myself.i_ai1 == 0) {
i0 = myself.MPCC_GetMPCCId(attacker);
c0 = myself.MPCC_GetMaster(i0);
if (myself.IsNullCreature(c0) == 0 && attacker.builder_level > 0 && attacker.builder_level <= 3 && myself.MPCC_GetMemberCount(i0) >= 1) {
myself.MPCC_SetMasterPartyRouting(i0, myself.sm, 1);
myself.int_list.Add(i0);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800002, c0.name, "", "", "", ""));

} else if (myself.IsNullCreature(c0) == 0 && myself.MPCC_GetMemberCount(i0) >= 36) {
myself.MPCC_SetMasterPartyRouting(i0, myself.sm, 1);
myself.int_list.Add(i0);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800002, c0.name, "", "", "", ""));

}
myself.i_ai1 = 1;

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (speller.level > myself.sm.level + 8) {
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(different_level_9_see_spelled)) == -1) {
if (different_level_9_see_spelled == 295895041) {
myself.CastBuffForQuestReward(speller, different_level_9_see_spelled);
myself.RemoveAttackDesire(speller.id);
return;

} else {
myself.CastBuffForQuestReward(speller, different_level_9_see_spelled);

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam c0, HandlerParam i0) {
if (myself.sm.alive) {
if (myself.i_ai0 == 0) {
myself.Say(gg.MakeFString(1000001, "", "", "", "", ""));
myself.Say(gg.MakeFString(1000002, "", "", "", "", ""));

} else if (gg.Rand(100) < 1) {
myself.Say(gg.MakeFString(1000003, "", "", "", "", ""));

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
if (myself.i_ai1 == 1 && myself.GetCurrentTick() > myself.i_ai2 + 60 * 5) {
myself.MPCC_SetMasterPartyRouting(myself.int_list.Get(0), myself.sm, 0);
myself.int_list.Clear();
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 10000, 0, gg.MakeFString(1800006, "", "", "", "", ""));
myself.i_ai1 = 0;

}
myself.AddTimerEx(1001, 60000);

}
	}

	protected void MY_DYING() {
myself.EffectMusic(myself.sm, 10000, "BS02_D");
myself.Say(gg.MakeFString(1000004, "", "", "", "", ""));
myself.Say(gg.MakeFString(1000005, "", "", "", "", ""));
myself.Say(gg.MakeFString(1000006, "", "", "", "", ""));
	}


}