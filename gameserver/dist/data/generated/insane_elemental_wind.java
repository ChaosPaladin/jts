package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class insane_elemental_wind extends warrior_basic {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target, HandlerParam weapon_class_id) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 10275) == 1 && gg.GetMemoStateEx(target, 10275, 1) == 2 && gg.GetMemoState(target, 10275) == 9 || gg.GetMemoState(target, 10275) == 11) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 10275) == 1 && gg.GetMemoStateEx(target, 10275, 1) == 2 && gg.GetMemoState(target, 10275) == 9 || gg.GetMemoState(target, 10275) == 11) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 10275) == 1 && gg.GetMemoStateEx(target, 10275, 1) == 2 && gg.GetMemoState(target, 10275) == 9 || gg.GetMemoState(target, 10275) == 11) {
random1_list.SetInfo(0, target);

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
myself.SetCurrentQuestID(10275);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (myself.IsNullCreature(c1) == 0) {
if (gg.HaveMemo(c1, 10275) == 1 && myself.sm.last_blow_weapon_class_id == 13881) {
if (gg.Rand(1000) < 766) {
if (gg.OwnItemCount(c1, 13862) == 5) {
myself.GiveItem1(c1, 13862, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.GetMemoState(c1, 10275) == 9) {
myself.SetMemoState(c1, 10275, 10);
myself.SetFlagJournal(c1, 10275, 9);
myself.ShowQuestMark(c1, 10275);

} else if (gg.GetMemoState(c1, 10275) == 11) {
myself.SetMemoState(c1, 10275, 12);
myself.SetFlagJournal(c1, 10275, 11);
myself.ShowQuestMark(c1, 10275);

}

} else {
myself.GiveItem1(c1, 13862, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

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