package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class canni_stakato_event_egg extends default_npc {
	protected int key_skill = 190382081;
	protected int box_name = 14834;
	protected int type = 0;

	protected void CREATED() {
myself.c_ai4 = gg.GetNullCreature();
if (type == 1) {
myself.CreateOnePrivateEx(1018793, "canni_stakato_event_egg", 0, 0, gg.FloatToInt(myself.sm.x) + 50 + gg.Rand(20) + gg.Rand(20), gg.FloatToInt(myself.sm.y) + 50 + gg.Rand(40), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1018794, "canni_stakato_event_egg", 0, 0, gg.FloatToInt(myself.sm.x) - 50 - gg.Rand(40), gg.FloatToInt(myself.sm.y) - 50 - gg.Rand(20) - gg.Rand(20), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (type == 2) {
myself.CreateOnePrivateEx(1018796, "canni_stakato_event_egg", 0, 0, gg.FloatToInt(myself.sm.x) + 50 + gg.Rand(20) + gg.Rand(20), gg.FloatToInt(myself.sm.y) + 50 + gg.Rand(40), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1018797, "canni_stakato_event_egg", 0, 0, gg.FloatToInt(myself.sm.x) - 50 - gg.Rand(40), gg.FloatToInt(myself.sm.y) - 50 - gg.Rand(20) - gg.Rand(20), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
	}

	protected void DEBUG_AI(HandlerParam reply, HandlerParam creature, HandlerParam c0, HandlerParam i0, HandlerParam i1) {
if (reply == 0) {
if (myself.i_quest9) {
myself.Say("Debug Mode : Off");

}
myself.i_quest9 = reply;

} else if (reply == 1) {
myself.Say("Debug Mode : On");
myself.i_quest9 = reply;

} else if (reply == 2) {
if (myself.i_quest9) {
myself.Say("약하고 보상 적은 놈 스폰");

}
myself.CreateOnePrivateEx(1025670, "canni_stakato_event_boss", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirectionToTarget(creature) * 182, 0, 0, gg.GetIndexFromCreature(creature));
myself.Suicide();

} else if (reply == 3) {
if (myself.i_quest9) {
myself.Say("약하고 보상 많은 놈 스폰");

}
myself.CreateOnePrivateEx(1025669, "canni_stakato_event_boss", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirectionToTarget(creature) * 182, 0, 1, gg.GetIndexFromCreature(creature));
myself.Suicide();

} else if (reply == 5) {
if (myself.i_quest9) {
myself.Say("강하고 보상 많은 놈 스폰");

}
myself.CreateOnePrivateEx(1025667, "canni_stakato_event_boss", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirectionToTarget(creature) * 182, 0, 1, gg.GetIndexFromCreature(creature));
myself.Suicide();

} else if (reply == 6) {
if (myself.i_quest9) {
myself.Say("강하고 보상 적은 놈 스폰");

}
myself.CreateOnePrivateEx(1025668, "canni_stakato_event_boss", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirectionToTarget(creature) * 182, 0, 0, gg.GetIndexFromCreature(creature));
myself.Suicide();

}
	}

	protected void ATTACKED(HandlerParam skill_name_id, HandlerParam attacker, HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam i1) {
if (skill_name_id == key_skill) {
myself.c_ai4 = attacker;
if (myself.i_quest9) {
myself.Say("작동자 : " + myself.c_ai4.name + " 스킬 들어옴");

}
i0 = gg.Rand(100);
if (myself.i_quest9) {
myself.Say("랜덤값은 " + i0 + " 입니다.");

}
if (i0 >= 99) {
if (myself.IsNullCreature(myself.c_ai4)) {

} else {
if (myself.c_ai4.master) {
myself.c_ai4 = myself.c_ai4.master;

}
i1 = gg.Party_GetCount(myself.c_ai4);
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = gg.Party_GetCreature(myself.c_ai4, i0);
if (myself.DistFromMe(c0) <= 1500) {
myself.GiveItem1(c0, box_name, 3);

}

}

}

} else if (i0 >= 89) {
myself.CreateOnePrivateEx(1025670, "canni_stakato_event_boss", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirectionToTarget(attacker) * 182, 0, 0, gg.GetIndexFromCreature(myself.c_ai4));

} else if (i0 >= 79) {
myself.CreateOnePrivateEx(1025669, "canni_stakato_event_boss", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirectionToTarget(attacker) * 182, 0, 1, gg.GetIndexFromCreature(myself.c_ai4));

} else if (i0 >= 59) {
myself.CreateOnePrivateEx(1025667, "canni_stakato_event_boss", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirectionToTarget(attacker) * 182, 0, 1, gg.GetIndexFromCreature(myself.c_ai4));

} else {
myself.CreateOnePrivateEx(1025668, "canni_stakato_event_boss", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirectionToTarget(attacker) * 182, 0, 0, gg.GetIndexFromCreature(myself.c_ai4));

}
myself.Suicide();

}
	}


}