package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class murcrokian_awakened extends warrior_basic_reed {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 308) == 1 && gg.GetMemoState(target, 308) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 308) == 1 && gg.GetMemoState(target, 308) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 308) == 1 && gg.GetMemoState(target, 308) == 1) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 309) == 1 && gg.GetMemoState(target, 309) == 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 309) == 1 && gg.GetMemoState(target, 309) == 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 309) == 1 && gg.GetMemoState(target, 309) == 1) {
random1_list.SetInfo(1, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(308);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.GiveItem1(target, 14872, 1);
i0 = gg.Rand(1000);
if (i0 < 124) {
myself.GiveItem1(target, 14872, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(309);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(1000);
if (i0 < 220) {
myself.GiveItem1(target, 14873, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam skill_name_id, HandlerParam target) {
myself.SetCurrentQuestID(308);
if (gg.HaveMemo(attacker, 308) == 1 && gg.GetMemoState(attacker, 308) == 1) {
if (myself.IsNullCreature(attacker) == 0 && myself.sm.alive) {
if (myself.sm.level - attacker.level <= 5 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(190054401)) > 0) {
target = attacker;
myself.GiveItem1(target, 14871, 1);
i0 = gg.Rand(1000);
if (i0 < 124) {
myself.GiveItem1(target, 14871, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}

}
myself.SetCurrentQuestID(309);
if (gg.HaveMemo(attacker, 309) == 1 && gg.GetMemoState(attacker, 309) == 1) {
if (myself.IsNullCreature(attacker) == 0 && myself.sm.alive) {
if (myself.sm.level - attacker.level <= 5 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(190054401)) > 0) {
target = attacker;
myself.GiveItem1(target, 14873, 1);
i0 = gg.Rand(1000);
if (i0 < 220) {
myself.GiveItem1(target, 14873, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}

}
super;
	}


}