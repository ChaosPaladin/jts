package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_mine_partybug extends warrior_use_skill {
	protected int SelfBuff = 458752001;
	protected int PartyNum = -1;
	protected int debug_mode = 0;

	protected void CREATED(HandlerParam i0) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 10000000);

}
if (PartyNum > 0) {
for (i0 = 0; i0 < 4; i0 = i0 + 1) {
myself.CreateOnePrivateEx(1022689, "ai_mine_partybug", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, PartyNum, 0, 0);

}

}
if (PartyNum > 0) {
myself.i_ai5 = PartyNum;

} else if (myself.sm.param1 > 0) {
myself.i_ai5 = myself.sm.param1;

} else if (debug_mode) {
myself.Say("ERR! PartyNum is wrong. POS에 기재된 PartyNum이 필요합니다.");

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
myself.BroadcastScriptEventEx(2512003, gg.GetIndexFromCreature(myself.top_desire_target), myself.i_ai5, 500);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 2512003) {
if (script_event_arg3 == myself.i_ai5) {
myself.AddAttackDesire(gg.GetCreatureFromIndex(script_event_arg2), 1, 1000);

}

}
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_level, HandlerParam skill_name_id, HandlerParam s0, HandlerParam i0) {
super;
if (skill_id == 6145 && skill_level == 0) {
if (myself.p_state != 3) {
if (debug_mode) {
myself.Say("전투중이 아닐 때 어스웜의 마기가 해제되었음. 재버프");

}
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 10000000);

}

}

}
	}


}