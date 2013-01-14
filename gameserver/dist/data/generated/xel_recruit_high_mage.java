package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class xel_recruit_high_mage extends ai_xel_recruit_mage {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 251) == 1 && gg.GetMemoState(target, 251) == 1 && gg.OwnItemCount(target, 15508) < 9) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 251) == 1 && gg.GetMemoState(target, 251) == 1 && gg.OwnItemCount(target, 15508) < 9) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 251) == 1 && gg.GetMemoState(target, 251) == 1 && gg.OwnItemCount(target, 15508) < 9) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 251) == 1 && gg.GetMemoState(target, 251) == 1 && gg.OwnItemCount(target, 15508) == 9) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 251) == 1 && gg.GetMemoState(target, 251) == 1 && gg.OwnItemCount(target, 15508) == 9) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 251) == 1 && gg.GetMemoState(target, 251) == 1 && gg.OwnItemCount(target, 15508) == 9) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 290) == 1 && gg.GetMemoState(target, 290) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 290) == 1 && gg.GetMemoState(target, 290) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 290) == 1 && gg.GetMemoState(target, 290) == 1) {
random1_list.SetInfo(2, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 461) == 1 && gg.GetMemoState(target, 461) == 1 && myself.i_quest0 == 1 && gg.OwnItemCount(target, 16382) < 9) {
random1_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 461) == 1 && gg.GetMemoState(target, 461) == 1 && myself.i_quest0 == 1 && gg.OwnItemCount(target, 16382) < 9) {
random1_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 461) == 1 && gg.GetMemoState(target, 461) == 1 && myself.i_quest0 == 1 && gg.OwnItemCount(target, 16382) < 9) {
random1_list.SetInfo(3, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 461) == 1 && gg.GetMemoState(target, 461) == 1 && myself.i_quest0 == 1 && gg.OwnItemCount(target, 16382) == 9) {
random1_list.SetInfo(4, target);

}
if (gg.HaveMemo(target, 461) == 1 && gg.GetMemoState(target, 461) == 1 && myself.i_quest0 == 1 && gg.OwnItemCount(target, 16382) == 9) {
random1_list.SetInfo(4, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 461) == 1 && gg.GetMemoState(target, 461) == 1 && myself.i_quest0 == 1 && gg.OwnItemCount(target, 16382) == 9) {
random1_list.SetInfo(4, target);

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
myself.SetCurrentQuestID(251);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(1000);
if (i0 < 643) {
myself.GiveItem1(target, 15508, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(251);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(1000);
if (i0 < 643) {
myself.GiveItem1(target, 15508, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
if (gg.OwnItemCount(target, 15509) >= 5) {
myself.SetFlagJournal(target, 251, 2);
myself.ShowQuestMark(target, 251);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(290);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(1000);
if (i0 < 483) {
myself.GiveItem1(target, 15714, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(461);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(461);
i0 = gg.Rand(1000);
if (i0 < 772) {
myself.GiveItem1(target, 16382, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(461);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(461);
i0 = gg.Rand(1000);
if (i0 < 772) {
myself.GiveItem1(target, 16382, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
if (gg.OwnItemCount(target, 15503) >= 5) {
myself.SetFlagJournal(target, 461, 2);
myself.ShowQuestMark(target, 461);
myself.SoundEffect(target, "ItemSound.quest_middle");

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