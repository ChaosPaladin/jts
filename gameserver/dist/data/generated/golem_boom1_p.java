package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class golem_boom1_p extends ai_golem_boom1 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 647) == 1 && gg.GetMemoState(target, 647) == 1 * 10 + 1 && gg.GetMemoStateEx(target, 647, 1) == 99) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 647) == 1 && gg.GetMemoState(target, 647) == 1 * 10 + 1 && gg.GetMemoStateEx(target, 647, 1) == 99) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 647) == 1 && gg.GetMemoState(target, 647) == 1 * 10 + 1 && gg.GetMemoStateEx(target, 647, 1) == 99) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
if (gg.HaveMemo(target, 463) == 1 && gg.GetMemoState(target, 463) == 1 && gg.OwnItemCount(target, 15511) < 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 463) == 1 && gg.GetMemoState(target, 463) == 1 && gg.OwnItemCount(target, 15511) < 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 463) == 1 && gg.GetMemoState(target, 463) == 1 && gg.OwnItemCount(target, 15511) < 1) {
random1_list.SetInfo(2, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(714);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 714) == 1 && gg.GetMemoState(c0, 714) == 6 && myself.DistFromMe(c0) <= 1500) {
i0 = gg.GetMemoStateEx(c0, 714, 1);
if (i0 < 300) {
myself.SetMemoStateEx(c0, 714, 1, i0 + 1);

} else {
myself.SetMemoState(c0, 714, 7);
myself.SetFlagJournal(c0, 714, 6);
myself.ShowQuestMark(c0, 714);
myself.SoundEffect(c0, "ItemSound.quest_middle");

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
case 0: {
myself.SetCurrentQuestID(647);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 463) {
if (gg.OwnItemCount(target, 15521) + 1 >= 500) {
if (gg.OwnItemCount(target, 15521) < 500) {
myself.GiveItem1(target, 15521, 500 - gg.OwnItemCount(target, 15521));
myself.SoundEffect(target, "ItemSound.quest_middle");

}
myself.SetFlagJournal(target, 647, 2);
myself.ShowQuestMark(target, 647);
myself.SetMemoState(target, 647, 1 * 10 + 2);

} else {
myself.GiveItem1(target, 15521, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(463);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = 1;
if (gg.OwnItemCount(target, 15510) + i0 == gg.GetMemoStateEx(target, 463, 1)) {
myself.DeleteItem1(target, 15510, gg.OwnItemCount(target, 15510));
myself.GiveItem1(target, 15511, 1);
myself.SetMemoState(target, 463, 2);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.SetFlagJournal(target, 463, 2);
myself.ShowQuestMark(target, 463);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 15510, i0);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
myself.Say(gg.MakeFString(46350, target.name, gg.IntToStr(i0), "", "", ""));

}
break;

}

}

}
super;
	}


}