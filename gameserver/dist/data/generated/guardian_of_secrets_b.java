package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guardian_of_secrets_b extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 71) == 1 && target.occupation == 20 && gg.GetMemoState(target, 71) == 6 && gg.OwnItemCount(target, 7300) == 0) {
always_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 74) == 1 && target.occupation == 3 && gg.GetMemoState(target, 74) == 6 && gg.OwnItemCount(target, 7303) == 0) {
always_list.SetInfo(1, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 77) == 1 && target.occupation == 51 && gg.GetMemoState(target, 77) == 6 && gg.OwnItemCount(target, 7306) == 0) {
always_list.SetInfo(2, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 80) == 1 && target.occupation == 23 && gg.GetMemoState(target, 80) == 6 && gg.OwnItemCount(target, 7309) == 0) {
always_list.SetInfo(3, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 83) == 1 && target.occupation == 24 && gg.GetMemoState(target, 83) == 6 && gg.OwnItemCount(target, 7312) == 0) {
always_list.SetInfo(4, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 86) == 1 && target.occupation == 17 && gg.GetMemoState(target, 86) == 6 && gg.OwnItemCount(target, 7315) == 0) {
always_list.SetInfo(5, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 89) == 1 && target.occupation == 27 && gg.GetMemoState(target, 89) == 6 && gg.OwnItemCount(target, 7318) == 0) {
always_list.SetInfo(6, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 92) == 1 && target.occupation == 28 && gg.GetMemoState(target, 92) == 6 && gg.OwnItemCount(target, 7321) == 0) {
always_list.SetInfo(7, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 94) == 1 && target.occupation == 13 && gg.GetMemoState(target, 94) == 6 && gg.OwnItemCount(target, 7323) == 0) {
always_list.SetInfo(8, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 97) == 1 && target.occupation == 33 && gg.GetMemoState(target, 97) == 6 && gg.OwnItemCount(target, 7326) == 0) {
always_list.SetInfo(9, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 100) == 1 && target.occupation == 57 && gg.GetMemoState(target, 100) == 6 && gg.OwnItemCount(target, 7329) == 0) {
always_list.SetInfo(10, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 68) == 1 && target.occupation == 128 || target.occupation == 129 && gg.GetMemoState(target, 68) == 6 && gg.OwnItemCount(target, 9726) == 0) {
always_list.SetInfo(11, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(71);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 71, 1) < 9) {
myself.SetMemoStateEx(target, 71, 1, gg.GetMemoStateEx(target, 71, 1) + 1);

} else {
myself.GiveItem1(target, 7300, 1);
myself.SetFlagJournal(target, 71, 7);
myself.ShowQuestMark(target, 71);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(74);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 74, 1) < 9) {
myself.SetMemoStateEx(target, 74, 1, gg.GetMemoStateEx(target, 74, 1) + 1);

} else {
myself.GiveItem1(target, 7303, 1);
myself.SetFlagJournal(target, 74, 7);
myself.ShowQuestMark(target, 74);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(77);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 77, 1) < 9) {
myself.SetMemoStateEx(target, 77, 1, gg.GetMemoStateEx(target, 77, 1) + 1);

} else {
myself.GiveItem1(target, 7306, 1);
myself.SetFlagJournal(target, 77, 7);
myself.ShowQuestMark(target, 77);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(80);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 80, 1) < 9) {
myself.SetMemoStateEx(target, 80, 1, gg.GetMemoStateEx(target, 80, 1) + 1);

} else {
myself.GiveItem1(target, 7309, 1);
myself.SetFlagJournal(target, 80, 7);
myself.ShowQuestMark(target, 80);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(83);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 83, 1) < 9) {
myself.SetMemoStateEx(target, 83, 1, gg.GetMemoStateEx(target, 83, 1) + 1);

} else {
myself.GiveItem1(target, 7312, 1);
myself.SetFlagJournal(target, 83, 7);
myself.ShowQuestMark(target, 83);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(86);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 86, 1) < 9) {
myself.SetMemoStateEx(target, 86, 1, gg.GetMemoStateEx(target, 86, 1) + 1);

} else {
myself.GiveItem1(target, 7315, 1);
myself.SetFlagJournal(target, 86, 7);
myself.ShowQuestMark(target, 86);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 6: {
myself.SetCurrentQuestID(89);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 89, 1) < 9) {
myself.SetMemoStateEx(target, 89, 1, gg.GetMemoStateEx(target, 89, 1) + 1);

} else {
myself.GiveItem1(target, 7318, 1);
myself.SetFlagJournal(target, 89, 7);
myself.ShowQuestMark(target, 89);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 7: {
myself.SetCurrentQuestID(92);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 92, 1) < 9) {
myself.SetMemoStateEx(target, 92, 1, gg.GetMemoStateEx(target, 92, 1) + 1);

} else {
myself.GiveItem1(target, 7321, 1);
myself.SetFlagJournal(target, 92, 7);
myself.ShowQuestMark(target, 92);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 8: {
myself.SetCurrentQuestID(94);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 94, 1) < 9) {
myself.SetMemoStateEx(target, 94, 1, gg.GetMemoStateEx(target, 94, 1) + 1);

} else {
myself.GiveItem1(target, 7323, 1);
myself.SetFlagJournal(target, 94, 7);
myself.ShowQuestMark(target, 94);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 9: {
myself.SetCurrentQuestID(97);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 97, 1) < 9) {
myself.SetMemoStateEx(target, 97, 1, gg.GetMemoStateEx(target, 97, 1) + 1);

} else {
myself.GiveItem1(target, 7326, 1);
myself.SetFlagJournal(target, 97, 7);
myself.ShowQuestMark(target, 97);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 10: {
myself.SetCurrentQuestID(100);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 100, 1) < 9) {
myself.SetMemoStateEx(target, 100, 1, gg.GetMemoStateEx(target, 100, 1) + 1);

} else {
myself.GiveItem1(target, 7329, 1);
myself.SetFlagJournal(target, 100, 7);
myself.ShowQuestMark(target, 100);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 11: {
myself.SetCurrentQuestID(68);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 68, 1) < 9) {
myself.SetMemoStateEx(target, 68, 1, gg.GetMemoStateEx(target, 68, 1) + 1);

} else {
myself.GiveItem1(target, 9726, 1);
myself.SetFlagJournal(target, 68, 7);
myself.ShowQuestMark(target, 68);
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