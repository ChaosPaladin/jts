package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class bone_animator extends wizard_pa_corpse_necro {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 24) == 1 && gg.GetMemoState(target, 24) == 11 && gg.OwnItemCount(target, 7151) == 0) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 633) == 1 && gg.GetMemoState(target, 633) == 1 * 10 + 1 || gg.GetMemoState(target, 633) == 1 * 10 + 2) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 633) == 1 && gg.GetMemoState(target, 633) == 1 * 10 + 1 || gg.GetMemoState(target, 633) == 1 * 10 + 2) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 633) == 1 && gg.GetMemoState(target, 633) == 1 * 10 + 1 || gg.GetMemoState(target, 633) == 1 * 10 + 2) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 637) == 1 && gg.OwnItemCount(target, 8066) < 10) {
always_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 637) == 1 && gg.OwnItemCount(target, 8066) < 10) {
always_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 637) == 1 && gg.OwnItemCount(target, 8066) < 10) {
always_list.SetInfo(2, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 2: {
myself.SetCurrentQuestID(637);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 84) {
myself.GiveItem1(target, 8066, 1);
if (gg.OwnItemCount(target, 8066) >= 9) {
myself.SetFlagJournal(target, 637, 2);
myself.ShowQuestMark(target, 637);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

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
myself.SetCurrentQuestID(24);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 10) {
myself.GiveItem1(target, 7151, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.SetFlagJournal(target, 24, 10);
myself.ShowQuestMark(target, 24);

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(633);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 420) {
if (gg.OwnItemCount(target, 7544) >= 199) {
if (gg.OwnItemCount(target, 7544) < 200) {
myself.GiveItem1(target, 7544, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");

}
myself.SetFlagJournal(target, 633, 2);
myself.ShowQuestMark(target, 633);
myself.SetMemoState(target, 633, 1 * 10 + 2);

} else {
myself.GiveItem1(target, 7544, 1);
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