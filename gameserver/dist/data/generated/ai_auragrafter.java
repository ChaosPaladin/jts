package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_auragrafter extends default_npc {
	protected int Max_Desire = 1000000000000000000;
	protected int TID_LIFETIME = 78001;
	protected int TIME_LIFETIME = 3;
	protected int aura_hp01 = 434176001;
	protected int aura_hp02 = 434241538;
	protected int aura_hp03 = 434307075;
	protected int aura_mp01 = 434372609;
	protected int aura_mp02 = 434438146;
	protected int aura_mp03 = 434503683;
	protected int aura_melee01 = 434569217;
	protected int aura_melee02 = 434700289;
	protected int aura_melee03 = 434831361;
	protected int aura_melee04 = 434962433;
	protected int aura_melee05 = 435093505;
	protected int aura_bow01 = 437387265;
	protected int aura_caster01 = 434634753;
	protected int aura_caster02 = 434765825;
	protected int aura_special01 = 434896897;
	protected int aura_special02 = 435027969;
	protected int aura_special03 = 435159041;
	protected int babble_mode = 0;

	protected void CREATED(HandlerParam i0, HandlerParam i1) {
if (babble_mode) {
myself.Say("spawned");

}
myself.c_ai0 = gg.GetCreatureFromID(myself.sm.param1);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (babble_mode) {
myself.Say(myself.c_ai0.name);

}
i0 = gg.Rand(100);
if (i0 <= 42) {
i1 = gg.Rand(100);
if (i1 <= 7) {
if (babble_mode) {
myself.Say("aura_hp03");

}
myself.AddUseSkillDesire(myself.c_ai0, aura_hp03, 0, 1, Max_Desire);

} else if (i1 <= 45) {
if (babble_mode) {
myself.Say("aura_hp02");

}
myself.AddUseSkillDesire(myself.c_ai0, aura_hp02, 0, 1, Max_Desire);

} else {
if (babble_mode) {
myself.Say("aura_hp01");

}
myself.AddUseSkillDesire(myself.c_ai0, aura_hp01, 0, 1, Max_Desire);

}

}
if (i0 <= 11) {
i1 = gg.Rand(100);
if (i1 <= 8) {
if (babble_mode) {
myself.Say("aura_mp03");

}
myself.AddUseSkillDesire(myself.c_ai0, aura_mp03, 0, 1, Max_Desire);

} else if (i1 <= 60) {
if (babble_mode) {
myself.Say("aura_mp02");

}
myself.AddUseSkillDesire(myself.c_ai0, aura_mp02, 0, 1, Max_Desire);

} else {
if (babble_mode) {
myself.Say("aura_mp01");

}
myself.AddUseSkillDesire(myself.c_ai0, aura_mp01, 0, 1, Max_Desire);

}

}
if (i0 <= 25) {
i1 = gg.Rand(100);
if (i1 <= 20) {
if (babble_mode) {
myself.Say("aura_melee05");

}
myself.CastBuffForQuestReward(myself.c_ai0, aura_melee05);

} else if (i1 <= 40) {
if (babble_mode) {
myself.Say("aura_bow01");

}
myself.CastBuffForQuestReward(myself.c_ai0, aura_bow01);

} else if (i1 <= 60) {
if (babble_mode) {
myself.Say("aura_melee03");

}
myself.CastBuffForQuestReward(myself.c_ai0, aura_melee03);

} else if (i1 <= 80) {
if (babble_mode) {
myself.Say("aura_melee02");

}
myself.CastBuffForQuestReward(myself.c_ai0, aura_melee02);

} else {
if (babble_mode) {
myself.Say("aura_melee01");

}
myself.CastBuffForQuestReward(myself.c_ai0, aura_melee01);

}

}
if (i0 <= 10) {
if (babble_mode) {
myself.Say("aura_bow01");

}
myself.CastBuffForQuestReward(myself.c_ai0, aura_bow01);

}
if (i0 <= 1) {
i1 = gg.Rand(100);
if (i1 <= 34) {
if (babble_mode) {
myself.Say("aura_melee01~03");

}
myself.CastBuffForQuestReward(myself.c_ai0, aura_melee01);
myself.CastBuffForQuestReward(myself.c_ai0, aura_melee02);
myself.CastBuffForQuestReward(myself.c_ai0, aura_melee03);

} else if (i1 <= 67) {
if (babble_mode) {
myself.Say("aura_bow01");

}
myself.CastBuffForQuestReward(myself.c_ai0, aura_bow01);

} else {
if (babble_mode) {
myself.Say("aura_hp03, aura_mp03");

}
myself.AddUseSkillDesire(myself.c_ai0, aura_hp03, 0, 1, Max_Desire);
myself.AddUseSkillDesire(myself.c_ai0, aura_mp03, 0, 1, Max_Desire);

}

}
if (i0 <= 11) {
i1 = gg.Rand(100);
if (i1 <= 3) {
if (babble_mode) {
myself.Say("aura_special03");

}
myself.CastBuffForQuestReward(myself.c_ai0, aura_special03);

} else if (i1 <= 6) {
if (babble_mode) {
myself.Say("aura_special02");

}
myself.CastBuffForQuestReward(myself.c_ai0, aura_special02);

} else {
if (babble_mode) {
myself.Say("aura_special01");

}
myself.CastBuffForQuestReward(myself.c_ai0, aura_special01);

}

}

}
myself.AddTimerEx(TID_LIFETIME, TIME_LIFETIME * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TID_LIFETIME) {
if (babble_mode) {
myself.Say("despawned");

}
myself.Despawn();

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id) {
if (babble_mode) {
myself.Say("USE_SKILL_FINISHED:" + skill_name_id / 256 * 256);

}
	}


}