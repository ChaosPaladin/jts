package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_blocker_ssq3 extends default_npc {
	protected int OneHandArm = -1;
	protected int TwoHandsArms = 15281;
	protected int ID_Number = -1;

	protected void CREATED() {
myself.i_ai0 = 1;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0, HandlerParam maker0) {
if (myself.i_ai0 == 1) {
if (myself.sm.hp <= 10) {
myself.GiveItem1(attacker, 13846, 1);
myself.EquipItem(TwoHandsArms);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, "iz112_1724_f03m1");
if (gg.IsNull(maker0) == 0) {
myself.BroadcastSystemMessage(myself.sm, 2000, 3060);
gg.SendMakerScriptEvent(maker0, 9274216, ID_Number, attacker.id);

}
myself.i_ai0 = 2;

}

}
i0 = gg.Rand(100);
if (i0 < 50) {
myself.AddUseSkillDesire(myself.sm, 391905283, 0, 1, 1000000);

}
	}


}