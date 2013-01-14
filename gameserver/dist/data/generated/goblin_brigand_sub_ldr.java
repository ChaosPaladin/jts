package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class goblin_brigand_sub_ldr extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 292)) {
random1_list.SetInfo(1, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(2, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(108);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 108) == 1 && gg.OwnItemCount(c1, 1563)) {
if (gg.HaveMemo(c1, 108) == 1 && gg.OwnItemCount(c1, 1563)) {
if (gg.Rand(10) < 6) {
if (gg.OwnItemCount(c1, 1564) + gg.OwnItemCount(c1, 1565) >= 19) {
if (gg.OwnItemCount(c1, 1564) < 10) {
myself.GiveItem1(c1, 1564, 1);
myself.SetFlagJournal(c1, 108, 6);
myself.ShowQuestMark(c1, 108);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

} else if (gg.OwnItemCount(c1, 1564) < 10) {
myself.GiveItem1(c1, 1564, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}
if (gg.Rand(10) < 6) {
if (gg.OwnItemCount(c1, 1564) + gg.OwnItemCount(c1, 1565) >= 19) {
if (gg.OwnItemCount(c1, 1565) < 10) {
myself.GiveItem1(c1, 1565, 1);
myself.SetFlagJournal(c1, 108, 6);
myself.ShowQuestMark(c1, 108);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

} else if (gg.OwnItemCount(c1, 1564) + gg.OwnItemCount(c1, 1565) < 20) {
if (gg.OwnItemCount(c1, 1565) < 10) {
myself.GiveItem1(c1, 1565, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

}

}

}
break;

}

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(292);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(10);
if (i0 > 5) {
myself.GiveItem1(target, 1483, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (i0 > 4) {
if (gg.OwnItemCount(target, 1487) < 1 && gg.OwnItemCount(target, 1486) < 3) {
myself.GiveItem1(target, 1486, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(target, 1487) < 1 && gg.OwnItemCount(target, 1486) == 3) {
myself.GiveItem1(target, 1487, 1);
myself.SetFlagJournal(target, 292, 2);
myself.ShowQuestMark(target, 292);
myself.DeleteItem1(target, 1486, gg.OwnItemCount(target, 1486));
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 85) {
myself.GiveItem1(target, 7586, 1);
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