package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tyrannosaurus_s extends tyranno_primeval_sp {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam i_quest0, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam pledge0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
random1_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 642) == 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 642) == 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 642) == 1) {
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
myself.SetCurrentQuestID(510);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.Pledge_GetLeader(target);
pledge0 = myself.GetPledge(target);
if (gg.IsNull(pledge0) == 0) {
if (myself.IsNullCreature(c1) == 0 && myself.i_quest0 > 0) {
if (gg.HaveMemo(c1, 510) == 1 && gg.GetMemoState(c1, 510) == 1 && c1.is_pledge_master == 1 && myself.DistFromMe(c1) <= 1500 && pledge0.skill_level >= 5) {
myself.GiveItem1(c1, 8767, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(642);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(642);
i4 = gg.Rand(1000);
if (i4 < 988) {
myself.GiveItem1(target, 8774, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}

}

}
super;
	}


}