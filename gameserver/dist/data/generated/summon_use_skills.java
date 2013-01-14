package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class summon_use_skills extends default_npc {
	protected int Skill01 = 458752001;
	protected int Skill01_ID = -1;
	protected int Skill02 = 458752001;
	protected int Skill02_ID = -1;
	protected int Skill03 = 458752001;
	protected int Skill03_ID = -1;
	protected int Skill04 = 458752001;
	protected int Skill04_ID = -1;

	protected void CREATED() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0, HandlerParam action_id) {
if (myself.sm.level < 60) {
if (action_id == Skill01_ID) {
if (myself.Skill_GetConsumeMP(356646913) < myself.sm.mp && myself.Skill_GetConsumeHP(356646913) < myself.sm.hp && myself.Skill_InReuseDelay(356646913) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, 356646913, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(356646913) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(356646913) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(356646913) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

} else if (myself.sm.level < 65) {
if (action_id == Skill01_ID) {
if (myself.Skill_GetConsumeMP(356646914) < myself.sm.mp && myself.Skill_GetConsumeHP(356646914) < myself.sm.hp && myself.Skill_InReuseDelay(356646914) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, 356646914, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(356646914) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(356646914) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(356646914) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

} else if (action_id == Skill02_ID) {
if (myself.Skill_GetConsumeMP(356712450) < myself.sm.mp && myself.Skill_GetConsumeHP(356712450) < myself.sm.hp && myself.Skill_InReuseDelay(356712450) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, 356712450, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(356712450) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(356712450) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(356712450) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

} else if (myself.sm.level < 70) {
if (action_id == Skill01_ID) {
if (myself.Skill_GetConsumeMP(356646915) < myself.sm.mp && myself.Skill_GetConsumeHP(356646915) < myself.sm.hp && myself.Skill_InReuseDelay(356646915) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, 356646915, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(356646915) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(356646915) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(356646915) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

} else if (action_id == Skill02_ID) {
if (myself.Skill_GetConsumeMP(356712451) < myself.sm.mp && myself.Skill_GetConsumeHP(356712451) < myself.sm.hp && myself.Skill_InReuseDelay(356712451) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, 356712451, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(356712451) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(356712451) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(356712451) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

} else if (action_id == Skill03_ID) {
if (myself.Skill_GetConsumeMP(356777985) < myself.sm.mp && myself.Skill_GetConsumeHP(356777985) < myself.sm.hp && myself.Skill_InReuseDelay(356777985) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, 356777985, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(356777985) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(356777985) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(356777985) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}

} else if (action_id == Skill01_ID) {
if (myself.Skill_GetConsumeMP(356646916) < myself.sm.mp && myself.Skill_GetConsumeHP(356646916) < myself.sm.hp && myself.Skill_InReuseDelay(356646916) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, 356646916, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(356646916) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(356646916) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(356646916) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

} else if (action_id == Skill02_ID) {
if (myself.Skill_GetConsumeMP(356712452) < myself.sm.mp && myself.Skill_GetConsumeHP(356712452) < myself.sm.hp && myself.Skill_InReuseDelay(356712452) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, 356712452, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(356712452) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(356712452) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(356712452) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

} else if (action_id == Skill03_ID) {
if (myself.Skill_GetConsumeMP(356777986) < myself.sm.mp && myself.Skill_GetConsumeHP(356777986) < myself.sm.hp && myself.Skill_InReuseDelay(356777986) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, 356777986, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(356777986) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(356777986) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(356777986) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

} else if (action_id == Skill04_ID) {
if (myself.Skill_GetConsumeMP(356843521) < myself.sm.mp && myself.Skill_GetConsumeHP(356843521) < myself.sm.hp && myself.Skill_InReuseDelay(356843521) == 0) {
myself.AddUseSkillDesireEx(myself.master.target_id, 356843521, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(356843521) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(356843521) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(356843521) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}
	}


}