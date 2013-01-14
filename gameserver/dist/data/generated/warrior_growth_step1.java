package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_growth_step1 extends warrior {
	protected int FeedID1 = 57;
	protected int FeedID2 = 57;
	protected int TakeSocial = 5;
	protected int FeedID1_warrior_silhouette1 = 1020130;
	protected int FeedID1_warrior_silhouette2 = 1020130;
	protected int FeedID1_wizard_silhouette1 = 1020130;
	protected int FeedID1_wizard_silhouette2 = 1020130;
	protected int FeedID2_warrior_silhouette1 = 1020130;
	protected int FeedID2_warrior_silhouette2 = 1020130;
	protected int FeedID2_wizard_silhouette1 = 1020130;
	protected int FeedID2_wizard_silhouette2 = 1020130;
	protected String FeedID1_warrior_ai1 = "default_npc";
	protected String FeedID1_warrior_ai2 = "default_npc";
	protected String FeedID1_wizard_ai1 = "default_npc";
	protected String FeedID1_wizard_ai2 = "default_npc";
	protected String FeedID2_warrior_ai1 = "default_npc";
	protected String FeedID2_warrior_ai2 = "default_npc";
	protected String FeedID2_wizard_ai1 = "default_npc";
	protected String FeedID2_wizard_ai2 = "default_npc";

	protected void CREATED() {
myself.i_ai4 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0) {
if (skill_name_id / 256 * 256 == FeedID1 / 256 * 256 || skill_name_id / 256 * 256 == FeedID2 / 256 * 256) {
myself.i_ai3 = skill_name_id / 256 * 256;
if (myself.i_ai4 == 0) {
myself.AddTimerEx(2001, TakeSocial * 1000 / 30);
myself.i_ai4 = 1;
myself.c_ai0 = attacker;
i0 = 0;
if (skill_name_id / 65536 == myself.i_ai3) {
if (TakeSocial != 0) {
myself.AddEffectActionDesire(myself.sm, 1, MoveAroundSocial * 1000 / 30, 200);

}
i0 = 1;

}
if (gg.Rand(100) < 5) {
i0 = gg.Rand(Rand - 2004 + 1);
i0 = i0 + 2004;
myself.Say(gg.MakeFString(i0, "", "", "", "", ""));

}

} else if (myself.i_ai4 == 1 && myself.c_ai0 == attacker) {

} else {
myself.i_ai4 = 2;
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddAttackDesire(attacker, 1, f0 * 100);

}

}

} else {
super;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 2001 && myself.i_ai4 == 1 && myself.sm.alive != 0) {
i0 = myself.GetDirection(myself.sm);
if (myself.i_ai3 == FeedID1 / 256 * 256) {
if (gg.Rand(100) < 50) {
if (gg.Rand(100) < 50) {
myself.CreateOnePrivateEx(FeedID1_warrior_silhouette1, FeedID1_warrior_ai1, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);

} else {
myself.CreateOnePrivateEx(FeedID1_warrior_silhouette2, FeedID1_warrior_ai2, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);

}

} else if (gg.Rand(100) < 50) {
myself.CreateOnePrivateEx(FeedID1_wizard_silhouette1, FeedID1_wizard_ai1, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);

} else {
myself.CreateOnePrivateEx(FeedID1_wizard_silhouette2, FeedID1_wizard_ai2, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);

}

} else if (gg.Rand(100) < 50) {
if (gg.Rand(100) < 50) {
myself.CreateOnePrivateEx(FeedID2_warrior_silhouette1, FeedID2_warrior_ai1, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);

} else {
myself.CreateOnePrivateEx(FeedID2_warrior_silhouette2, FeedID2_warrior_ai2, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);

}

} else if (gg.Rand(100) < 50) {
myself.CreateOnePrivateEx(FeedID2_wizard_silhouette1, FeedID2_wizard_ai1, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);

} else {
myself.CreateOnePrivateEx(FeedID2_wizard_silhouette2, FeedID2_wizard_ai2, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, gg.GetIndexFromCreature(myself.c_ai0), myself.i_ai3, 0);

}
myself.Despawn();

}
	}


}