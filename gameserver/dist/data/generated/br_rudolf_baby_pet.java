package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_rudolf_baby_pet extends default_npc {
	protected int TIMER_GROWTH = 2500;
	protected int TIMER_EAT = 2501;
	protected int TIMER_EAT_CONFIRM = 2502;
	protected int TIMER_AFFECTION_WAIT = 2503;
	protected int TIMER_IDLE = 2504;
	protected int TIMER_EVOLVE = 2505;
	protected int TIMER_EVOLVE_BABY = 2506;
	protected int TIMER_EVOLVE_GIRL = 2507;
	protected int TIMER_EVOLVE_AFTER = 2508;
	protected int TIMER_GOODBYE = 2599;
	protected int TIMER_GROWTH_PERIOD = 36000;
	protected int TIMER_AFFECTION_PERIOD = 60000;

	protected void CREATED(HandlerParam i0) {
myself.AddPetDefaultDesire_Follow(20.000000);
myself.i_ai0 = myself.sm.sp / 10000 % 100;
myself.i_ai1 = myself.sm.sp / 100 % 100;
myself.i_ai2 = myself.sm.sp % 100;
myself.i_ai3 = gg.FloatToInt(myself.sm.hp_regen) % 100;
myself.i_ai4 = 0;
myself.i_ai5 = 0;
myself.i_ai6 = 0;
i0 = gg.GetEventValue(0);
if (i0 <= 0) {
i0 = 1;

}
if (myself.sm.level == 2) {
myself.AddTimerEx(TIMER_EAT, 3000);
myself.AddTimerEx(TIMER_EAT_CONFIRM, 2100);
myself.AddTimerEx(TIMER_AFFECTION_WAIT, TIMER_AFFECTION_PERIOD / i0);

}
if (myself.sm.level >= 2) {
myself.AddTimerEx(TIMER_GROWTH, TIMER_GROWTH_PERIOD / i0);

}
myself.AddTimerEx(TIMER_IDLE, 50 * 1000 + gg.Rand(10000));
	}

	protected void NO_DESIRE() {
if (myself.i_ai6 == 0) {
myself.AddPetDefaultDesire_Follow(20.000000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam item0) {
if (timer_id == TIMER_GROWTH) {
if (myself.sm.level == 2) {
myself.i_ai0 = myself.i_ai0 + 1;
if (myself.i_ai0 >= 99) {
myself.i_ai0 = 99;

}
gg.SetNpcParam(myself.sm, 13, myself.i_ai0 * 10000 + myself.i_ai1 * 100 + myself.i_ai2);
if (myself.i_ai0 == 83) {
myself.Say(gg.MakeFString(1900136, "", "", "", "", ""));

} else if (myself.i_ai0 == 92) {
myself.Say(gg.MakeFString(1900137, "", "", "", "", ""));

}

} else if (myself.sm.level >= 3) {
myself.i_ai0 = myself.i_ai0 + 6;
if (myself.i_ai0 >= 99) {
myself.i_ai0 = 99;

}
gg.SetNpcParam(myself.sm, 13, myself.i_ai0 * 10000 + myself.i_ai1 * 100 + myself.i_ai2);
if (myself.sm.level < 7) {
if (myself.i_ai0 == 30) {
myself.Say(gg.MakeFString(1900121, myself.master.name, "", "", "", ""));

} else if (myself.i_ai0 == 54) {
myself.Say(gg.MakeFString(1900122, myself.master.name, "", "", "", ""));

} else if (myself.i_ai0 == 90) {
myself.Say(gg.MakeFString(1900123, myself.master.name, "", "", "", ""));

}

} else if (myself.sm.level == 7) {
if (myself.i_ai0 == 30) {
myself.Say(gg.MakeFString(1900127, myself.master.name, "", "", "", ""));

} else if (myself.i_ai0 == 54) {
myself.Say(gg.MakeFString(1900128, myself.master.name, "", "", "", ""));

} else if (myself.i_ai0 == 90) {
myself.Say(gg.MakeFString(1900129, myself.master.name, "", "", "", ""));

}

}

}
if (myself.sm.level == 2 && myself.i_ai0 >= 99 && myself.i_ai1 >= 99 && myself.i_ai2 >= 99) {
myself.AddTimerEx(TIMER_EVOLVE, 5500);
myself.RemoveAllDesire();
myself.i_ai6 = 1;
myself.AddEffectActionDesire(myself.sm, 1, 177, 1000000);

} else if (myself.sm.level >= 3 && myself.i_ai0 >= 99) {
if (myself.sm.level < 7) {
myself.Say(gg.MakeFString(1900124, myself.master.name, "", "", "", ""));

} else if (myself.sm.level == 7) {
myself.Say(gg.MakeFString(1900130, myself.master.name, "", "", "", ""));

}
myself.RemoveAllDesire();
myself.i_ai6 = 1;
myself.AddEffectActionDesire(myself.sm, 1, 177, 1000000);
myself.AddTimerEx(TIMER_GOODBYE, 7000);

} else if (myself.sm.level >= 2) {
i0 = gg.GetEventValue(0);
if (i0 <= 0) {
i0 = 1;

}
myself.AddTimerEx(TIMER_GROWTH, TIMER_GROWTH_PERIOD / i0);

}

}
if (timer_id == TIMER_EVOLVE) {
i0 = gg.Rand(10000);
if (i0 < 2400) {
i0 = 0;

} else if (i0 < 4900) {
i0 = 1;

} else if (i0 < 7400) {
i0 = 2;

} else if (i0 < 9900) {
i0 = 3;

} else if (i0 < 9993) {
i0 = 4;

} else {
i0 = 5;

}
i1 = gg.GetEventValue(1);
if (i1 > 0) {
i0 = i1 - 1;

}
if (i0 < 5) {
gg.SetNpcParam(myself.sm, 1, 3 + i0);
myself.i_ai0 = 0;
gg.SetNpcParam(myself.sm, 13, myself.i_ai0 * 10000 + myself.i_ai1 * 100 + myself.i_ai2);

}
if (i0 == 0) {
myself.CastBuffForQuestReward(myself.master, 1517617153);
myself.AddTimerEx(TIMER_EVOLVE_AFTER, 800);
myself.Say(gg.MakeFString(1900120, "", "", "", "", ""));

} else if (i0 == 1) {
myself.CastBuffForQuestReward(myself.master, 1517682689);
myself.AddTimerEx(TIMER_EVOLVE_AFTER, 800);
myself.Say(gg.MakeFString(1900120, "", "", "", "", ""));

} else if (i0 == 2) {
myself.CastBuffForQuestReward(myself.master, 1517748225);
myself.AddTimerEx(TIMER_EVOLVE_AFTER, 800);
myself.Say(gg.MakeFString(1900120, "", "", "", "", ""));

} else if (i0 == 3) {
myself.CastBuffForQuestReward(myself.master, 1517813761);
myself.AddTimerEx(TIMER_EVOLVE_AFTER, 800);
myself.Say(gg.MakeFString(1900120, "", "", "", "", ""));

} else if (i0 == 4) {
myself.Say(gg.MakeFString(1900125, "", "", "", "", ""));
myself.AddTimerEx(TIMER_EVOLVE_AFTER, 500);
myself.AddTimerEx(TIMER_EVOLVE_GIRL, 7500);

}
if (i0 == 5) {
myself.CreateOnePrivateEx(1000001, "br_rudolf_turkey", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(myself.master), 0, 0);
myself.RemoveAllDesire();
myself.DestroyPet(myself.master, myself.sm.pet_dbid, -99);

} else if (i0 < 4) {
i1 = gg.GetEventValue(0);
if (i1 <= 0) {
i1 = 1;

}
myself.AddTimerEx(TIMER_GROWTH, TIMER_GROWTH_PERIOD / i1);
myself.i_ai6 = 0;

}

}
if (timer_id == TIMER_EVOLVE_GIRL) {
myself.CastBuffForQuestReward(myself.master, 1517879297);
myself.CastBuffForQuestReward(myself.master, 1517944833);
myself.AddEffectActionDesire(myself.sm, 5, 177, 1000000);
myself.Say(gg.MakeFString(1900126, "", "", "", "", ""));
i1 = gg.GetEventValue(0);
if (i1 <= 0) {
i1 = 1;

}
myself.AddTimerEx(TIMER_GROWTH, TIMER_GROWTH_PERIOD / i1);
myself.i_ai6 = 0;

}
if (timer_id == TIMER_EAT) {
myself.LookItem(150, 1, 20772);
myself.LookItem(150, 1, 20771);
myself.LookItem(150, 1, 20770);
if (myself.sm.level <= 2 || myself.sm.level > 2 && myself.i_ai0 < 90) {
myself.AddTimerEx(TIMER_EAT, 3000);

}

}
if (timer_id == TIMER_EAT_CONFIRM) {
i0 = gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(1450180609));
if (i0 > 0) {
myself.i_ai5 = 0;
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(1450180609));
i1 = gg.GetEventValue(0);
if (i1 <= 0) {
i1 = 1;

}
myself.i_ai2 = myself.i_ai2 + 10 * i1;
if (myself.i_ai2 > 99) {
myself.i_ai2 = 99;

}
gg.SetNpcParam(myself.sm, 13, myself.i_ai0 * 10000 + myself.i_ai1 * 100 + myself.i_ai2);
myself.CastBuffForQuestReward(myself.master, 1450180609 + i0 - 1);
if (myself.sm.level == 2) {
if (gg.Rand(100) < 30) {
myself.Say(gg.MakeFString(1900115, "", "", "", "", ""));

} else if (gg.Rand(100) < 60) {
myself.Say(gg.MakeFString(1900116, "", "", "", "", ""));

}

}

} else {
myself.i_ai5 = myself.i_ai5 + 1;
if (myself.i_ai5 >= 200 && myself.sm.level == 2) {
myself.CastBuffForQuestReward(myself.master, 1518141441);
myself.Say(gg.MakeFString(1900119, "", "", "", "", ""));
myself.i_ai5 = 0;

}

}
if (myself.sm.level <= 2 || myself.sm.level > 2 && myself.i_ai0 < 90) {
myself.AddTimerEx(TIMER_EAT_CONFIRM, 2100);

}

}
if (timer_id == TIMER_AFFECTION_WAIT) {
myself.i_ai3 = myself.i_ai3 + 1;
if (myself.i_ai3 >= 99) {
myself.i_ai3 = 99;

}
gg.SetNpcParam(myself.sm, 35, myself.i_ai3);
if (myself.i_ai1 < 99 && myself.i_ai3 >= 15) {
if (myself.i_ai4 == 0) {
myself.Say(gg.MakeFString(1900112, "", "", "", "", ""));
myself.AddEffectActionDesire(myself.sm, 4, 177, 1000000);

} else if (myself.i_ai4 > 10) {
myself.Say(gg.MakeFString(1900119, "", "", "", "", ""));
myself.i_ai4 = -1;
myself.CastBuffForQuestReward(myself.master, 1518141441);

} else {
myself.AddEffectActionDesire(myself.sm, 4, 177, 10000);

}
myself.i_ai4 = myself.i_ai4 + 1;

}
i0 = gg.GetEventValue(0);
if (i0 <= 0) {
i0 = 1;

}
if (myself.sm.level == 2 && myself.i_ai1 < 99) {
myself.AddTimerEx(TIMER_AFFECTION_WAIT, TIMER_AFFECTION_PERIOD - gg.Rand(10000) / i0);

}

}
if (timer_id == TIMER_IDLE) {
if (myself.i_ai6 == 0) {
myself.AddEffectActionDesire(myself.sm, 3, 147, 1000);

}
if (myself.sm.level <= 2 || myself.sm.level > 2 && myself.i_ai0 < 90) {
myself.AddTimerEx(TIMER_IDLE, 50 * 1000 + gg.Rand(10000));

}
if (myself.sm.level == 1) {
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(1900105, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1900106, "", "", "", "", ""));

}

} else if (myself.sm.level == 2) {
if (gg.Rand(100) < 12) {
myself.Say(gg.MakeFString(1900109, "", "", "", "", ""));

} else if (gg.Rand(100) < 18) {
myself.Say(gg.MakeFString(1900110, "", "", "", "", ""));

} else if (gg.Rand(100) < 22) {
myself.Say(gg.MakeFString(1900111, "", "", "", "", ""));

}

}

}
if (timer_id == TIMER_EVOLVE_BABY) {
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(1900107, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1900108, "", "", "", "", ""));

}
gg.SetNpcParam(myself.sm, 1, 2);
myself.AddTimerEx(TIMER_EVOLVE_AFTER, 800);
i0 = gg.GetEventValue(0);
if (i0 <= 0) {
i0 = 1;

}
myself.i_ai3 = 0;
gg.SetNpcParam(myself.sm, 35, myself.i_ai3);
myself.AddTimerEx(TIMER_AFFECTION_WAIT, TIMER_AFFECTION_PERIOD - gg.Rand(10000) / i0);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
gg.SetNpcParam(myself.sm, 13, myself.i_ai0 * 10000 + myself.i_ai1 * 100 + myself.i_ai2);
myself.AddTimerEx(TIMER_EAT, 3000);
myself.AddTimerEx(TIMER_EAT_CONFIRM, 2100);
myself.AddTimerEx(TIMER_GROWTH, TIMER_GROWTH_PERIOD / i0);
myself.i_ai6 = 0;

}
if (timer_id == TIMER_EVOLVE_AFTER) {
myself.AddEffectActionDesire(myself.sm, 2, 177, 1000000);

}
if (timer_id == TIMER_GOODBYE) {
myself.RemoveAllDesire();
myself.DestroyPet(myself.master, myself.sm.pet_dbid, -99);

}
	}

	protected void SEE_ITEM(HandlerParam item_index_list, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (myself.sm.level < 2) {
return;

}
i0 = item_index_list.GetSize();
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
myself.AddGetItemDesireEx(item_index_list.GetItemIndex(i1), 10000);

}
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0) {
if (skill_name_id == 1450049537 && speller == myself.master) {
if (myself.sm.level == 1) {
myself.RemoveAllDesire();
myself.i_ai6 = 1;
myself.AddEffectActionDesire(myself.sm, 1, 177, 1000000);
myself.AddTimerEx(TIMER_EVOLVE_BABY, 5500);

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0, HandlerParam action_id) {
if (action_id == 5000 && myself.i_ai3 >= 15) {
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(1900113, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1900114, "", "", "", "", ""));

}
myself.i_ai1 = myself.i_ai1 + 25;
if (myself.i_ai1 >= 99) {
myself.i_ai1 = 99;

}
myself.i_ai4 = 0;
gg.SetNpcParam(myself.sm, 13, myself.i_ai0 * 10000 + myself.i_ai1 * 100 + myself.i_ai2);
myself.AddEffectActionDesire(myself.sm, 2, 171, 1000000);
myself.i_ai3 = gg.Rand(2);
gg.SetNpcParam(myself.sm, 35, myself.i_ai3);
myself.Dispel(myself.master, myself.Skill_GetAbnormalType(1518141441));
myself.CastBuffForQuestReward(myself.master, 1517486081);

}
	}


}