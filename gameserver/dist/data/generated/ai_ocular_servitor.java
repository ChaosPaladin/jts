package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ocular_servitor extends wizard_basic {
	protected int Skill01_Check_Dist = 0;
	protected int Skill02_ID = 348323843;
	protected int Skill01_Probablity = 1500;
	protected int Skill02_Probablity = 0;
	protected int Skill02_Target = 2;
	protected int Skill02_Type = 3;

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam target, HandlerParam success, HandlerParam c0, HandlerParam h0) {
if (skill_name_id == Skill01_ID) {
myself.RemoveAttackDesire(target.id);

}
if (skill_name_id == Skill02_ID && success == 1) {
myself.Despawn();

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private == myself.boss && private != myself.sm) {
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, 100000000);

}
super;
	}


}