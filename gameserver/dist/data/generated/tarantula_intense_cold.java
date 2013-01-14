package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tarantula_intense_cold extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 648) == 1 && gg.GetMemoState(target, 648) >= 1) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 648) == 1 && gg.GetMemoState(target, 648) >= 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 648) == 1 && gg.GetMemoState(target, 648) >= 1) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 648) == 1 && gg.GetMemoState(target, 648) >= 2 && myself.GetOneTimeQuestFlag(target, 115) == 1) {
always_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 648) == 1 && gg.GetMemoState(target, 648) >= 2 && myself.GetOneTimeQuestFlag(target, 115) == 1) {
always_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 648) == 1 && gg.GetMemoState(target, 648) >= 2 && myself.GetOneTimeQuestFlag(target, 115) == 1) {
always_list.SetInfo(1, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(648);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i1 = gg.Rand(1000);
if (i1 < 58) {
myself.GiveItem1(target, 8057, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(648);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i1 = gg.Rand(1000);
if (i1 < 570) {
myself.GiveItem1(target, 8077, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}

}

}
super;
	}


}