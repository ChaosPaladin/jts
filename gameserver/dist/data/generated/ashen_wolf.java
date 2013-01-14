package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ashen_wolf extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 165) == 1 && gg.OwnItemCount(target, 1160) < 13) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
always_list.SetInfo(1, target);
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
case 1: {
myself.SetCurrentQuestID(264);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.OwnItemCount(c1, 1367) < 50 && gg.HaveMemo(c1, 264)) {
i0 = gg.Rand(5);
if (i0 < 4) {
if (gg.OwnItemCount(c1, 1367) >= 49) {
myself.GiveItem1(c1, 1367, 1);
myself.SetFlagJournal(c1, 264, 2);
myself.ShowQuestMark(c1, 264);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.GiveItem1(c1, 1367, 1);
myself.ShowQuestMark(c1, 264);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(c1, 1367) >= 49) {
myself.GiveItem1(c1, 1367, 1);
myself.SetFlagJournal(c1, 264, 2);
myself.ShowQuestMark(c1, 264);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 1367) == 48) {
myself.GiveItem1(c1, 1367, 2);
myself.SetFlagJournal(c1, 264, 2);
myself.ShowQuestMark(c1, 264);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.GiveItem1(c1, 1367, 2);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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
case 0: {
myself.SetCurrentQuestID(165);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(3) < 3) {
myself.GiveItem1(target, 1160, 1);
if (gg.OwnItemCount(target, 1160) >= 12) {
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 165, 2);
myself.ShowQuestMark(target, 165);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 2) {
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