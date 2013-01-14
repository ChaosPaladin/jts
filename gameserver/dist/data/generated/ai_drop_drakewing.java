package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_drop_drakewing extends default_npc {
	protected int DS_fieldCycle_ID = 2;
	protected int FreewayID = 35;
	protected int FreewayMethod = 1;
	protected int FreewayDesire = 2000;
	protected String DummyMakerName = "rumwarsha_e1225_02m1";
	protected String NormalMakerName = "rumwarsha_e1225_01m1";

	protected void CREATED() {
myself.AddMoveFreewayDesire(FreewayID, FreewayMethod, FreewayDesire);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam skill_name_id, HandlerParam f0) {
if (skill_name_id == 381550593) {
i0 = gg.GetStep_FieldCycle(DS_fieldCycle_ID);
if (i0 == 2) {
maker0 = gg.GetNpcMaker(DummyMakerName);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.Despawn();

}

}
super;
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id) {
	}


}