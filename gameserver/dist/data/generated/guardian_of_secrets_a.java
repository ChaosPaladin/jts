package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guardian_of_secrets_a extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 70) == 1 && target.occupation == 5 && gg.GetMemoState(target, 70) == 6 && gg.OwnItemCount(target, 7299) == 0) {
always_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 73) == 1 && target.occupation == 2 && gg.GetMemoState(target, 73) == 6 && gg.OwnItemCount(target, 7302) == 0) {
always_list.SetInfo(1, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 76) == 1 && target.occupation == 48 && gg.GetMemoState(target, 76) == 6 && gg.OwnItemCount(target, 7305) == 0) {
always_list.SetInfo(2, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 79) == 1 && target.occupation == 8 && gg.GetMemoState(target, 79) == 6 && gg.OwnItemCount(target, 7308) == 0) {
always_list.SetInfo(3, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 82) == 1 && target.occupation == 9 && gg.GetMemoState(target, 82) == 6 && gg.OwnItemCount(target, 7311) == 0) {
always_list.SetInfo(4, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 85) == 1 && target.occupation == 16 && gg.GetMemoState(target, 85) == 6 && gg.OwnItemCount(target, 7314) == 0) {
always_list.SetInfo(5, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 88) == 1 && target.occupation == 12 && gg.GetMemoState(target, 88) == 6 && gg.OwnItemCount(target, 7317) == 0) {
always_list.SetInfo(6, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 91) == 1 && target.occupation == 14 && gg.GetMemoState(target, 91) == 6 && gg.OwnItemCount(target, 7320) == 0) {
always_list.SetInfo(7, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 95) == 1 && target.occupation == 6 && gg.GetMemoState(target, 95) == 6 && gg.OwnItemCount(target, 7324) == 0) {
always_list.SetInfo(8, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 98) == 1 && target.occupation == 43 && gg.GetMemoState(target, 98) == 6 && gg.OwnItemCount(target, 7327) == 0) {
always_list.SetInfo(9, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 67) == 1 && target.occupation == 127 && gg.GetMemoState(target, 67) == 6 && gg.OwnItemCount(target, 9725) == 0) {
always_list.SetInfo(10, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(70);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 70, 1) < 9) {
myself.SetMemoStateEx(target, 70, 1, gg.GetMemoStateEx(target, 70, 1) + 1);

} else {
myself.GiveItem1(target, 7299, 1);
myself.SetFlagJournal(target, 70, 7);
myself.ShowQuestMark(target, 70);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(73);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 73, 1) < 9) {
myself.SetMemoStateEx(target, 73, 1, gg.GetMemoStateEx(target, 73, 1) + 1);

} else {
myself.GiveItem1(target, 7302, 1);
myself.SetFlagJournal(target, 73, 7);
myself.ShowQuestMark(target, 73);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(76);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 76, 1) < 9) {
myself.SetMemoStateEx(target, 76, 1, gg.GetMemoStateEx(target, 76, 1) + 1);

} else {
myself.GiveItem1(target, 7305, 1);
myself.SetFlagJournal(target, 76, 7);
myself.ShowQuestMark(target, 76);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(79);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 79, 1) < 9) {
myself.SetMemoStateEx(target, 79, 1, gg.GetMemoStateEx(target, 79, 1) + 1);

} else {
myself.GiveItem1(target, 7308, 1);
myself.SetFlagJournal(target, 79, 7);
myself.ShowQuestMark(target, 79);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(82);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 82, 1) < 9) {
myself.SetMemoStateEx(target, 82, 1, gg.GetMemoStateEx(target, 82, 1) + 1);

} else {
myself.GiveItem1(target, 7311, 1);
myself.SetFlagJournal(target, 82, 7);
myself.ShowQuestMark(target, 82);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(85);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 85, 1) < 9) {
myself.SetMemoStateEx(target, 85, 1, gg.GetMemoStateEx(target, 85, 1) + 1);

} else {
myself.GiveItem1(target, 7314, 1);
myself.SetFlagJournal(target, 85, 7);
myself.ShowQuestMark(target, 85);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 6: {
myself.SetCurrentQuestID(88);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 88, 1) < 9) {
myself.SetMemoStateEx(target, 88, 1, gg.GetMemoStateEx(target, 88, 1) + 1);

} else {
myself.GiveItem1(target, 7317, 1);
myself.SetFlagJournal(target, 88, 7);
myself.ShowQuestMark(target, 88);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 7: {
myself.SetCurrentQuestID(91);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 91, 1) < 9) {
myself.SetMemoStateEx(target, 91, 1, gg.GetMemoStateEx(target, 91, 1) + 1);

} else {
myself.GiveItem1(target, 7320, 1);
myself.SetFlagJournal(target, 91, 7);
myself.ShowQuestMark(target, 91);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 8: {
myself.SetCurrentQuestID(95);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 95, 1) < 9) {
myself.SetMemoStateEx(target, 95, 1, gg.GetMemoStateEx(target, 95, 1) + 1);

} else {
myself.GiveItem1(target, 7324, 1);
myself.SetFlagJournal(target, 95, 7);
myself.ShowQuestMark(target, 95);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 9: {
myself.SetCurrentQuestID(98);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 98, 1) < 9) {
myself.SetMemoStateEx(target, 98, 1, gg.GetMemoStateEx(target, 98, 1) + 1);

} else {
myself.GiveItem1(target, 7327, 1);
myself.SetFlagJournal(target, 98, 7);
myself.ShowQuestMark(target, 98);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 10: {
myself.SetCurrentQuestID(67);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 67, 1) < 9) {
myself.SetMemoStateEx(target, 67, 1, gg.GetMemoStateEx(target, 67, 1) + 1);

} else {
myself.GiveItem1(target, 9725, 1);
myself.SetFlagJournal(target, 67, 7);
myself.ShowQuestMark(target, 67);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
code_info.code;

}
super;
	}


}