package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guardian_of_secrets_c extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 72) == 1 && target.occupation == 21 && gg.GetMemoState(target, 72) == 6 && gg.OwnItemCount(target, 7301) == 0) {
always_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 75) == 1 && target.occupation == 46 && gg.GetMemoState(target, 75) == 6 && gg.OwnItemCount(target, 7304) == 0) {
always_list.SetInfo(1, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 78) == 1 && target.occupation == 52 && gg.GetMemoState(target, 78) == 6 && gg.OwnItemCount(target, 7307) == 0) {
always_list.SetInfo(2, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 81) == 1 && target.occupation == 36 && gg.GetMemoState(target, 81) == 6 && gg.OwnItemCount(target, 7310) == 0) {
always_list.SetInfo(3, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 84) == 1 && target.occupation == 37 && gg.GetMemoState(target, 84) == 6 && gg.OwnItemCount(target, 7313) == 0) {
always_list.SetInfo(4, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 87) == 1 && target.occupation == 30 && gg.GetMemoState(target, 87) == 6 && gg.OwnItemCount(target, 7316) == 0) {
always_list.SetInfo(5, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 90) == 1 && target.occupation == 40 && gg.GetMemoState(target, 90) == 6 && gg.OwnItemCount(target, 7319) == 0) {
always_list.SetInfo(6, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 93) == 1 && target.occupation == 41 && gg.GetMemoState(target, 93) == 6 && gg.OwnItemCount(target, 7322) == 0) {
always_list.SetInfo(7, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 96) == 1 && target.occupation == 34 && gg.GetMemoState(target, 96) == 6 && gg.OwnItemCount(target, 7325) == 0) {
always_list.SetInfo(8, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 99) == 1 && target.occupation == 55 && gg.GetMemoState(target, 99) == 6 && gg.OwnItemCount(target, 7328) == 0) {
always_list.SetInfo(9, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 69) == 1 && target.occupation == 130 && gg.GetMemoState(target, 69) == 6 && gg.OwnItemCount(target, 9727) == 0) {
always_list.SetInfo(10, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(72);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 72, 1) < 9) {
myself.SetMemoStateEx(target, 72, 1, gg.GetMemoStateEx(target, 72, 1) + 1);

} else {
myself.GiveItem1(target, 7301, 1);
myself.SetFlagJournal(target, 72, 7);
myself.ShowQuestMark(target, 72);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(75);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 75, 1) < 9) {
myself.SetMemoStateEx(target, 75, 1, gg.GetMemoStateEx(target, 75, 1) + 1);

} else {
myself.GiveItem1(target, 7304, 1);
myself.SetFlagJournal(target, 75, 7);
myself.ShowQuestMark(target, 75);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(78);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 78, 1) < 9) {
myself.SetMemoStateEx(target, 78, 1, gg.GetMemoStateEx(target, 78, 1) + 1);

} else {
myself.GiveItem1(target, 7307, 1);
myself.SetFlagJournal(target, 78, 7);
myself.ShowQuestMark(target, 78);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(81);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 81, 1) < 9) {
myself.SetMemoStateEx(target, 81, 1, gg.GetMemoStateEx(target, 81, 1) + 1);

} else {
myself.GiveItem1(target, 7310, 1);
myself.SetFlagJournal(target, 81, 7);
myself.ShowQuestMark(target, 81);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(84);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 84, 1) < 9) {
myself.SetMemoStateEx(target, 84, 1, gg.GetMemoStateEx(target, 84, 1) + 1);

} else {
myself.GiveItem1(target, 7313, 1);
myself.SetFlagJournal(target, 84, 7);
myself.ShowQuestMark(target, 84);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(87);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 87, 1) < 9) {
myself.SetMemoStateEx(target, 87, 1, gg.GetMemoStateEx(target, 87, 1) + 1);

} else {
myself.GiveItem1(target, 7316, 1);
myself.SetFlagJournal(target, 87, 7);
myself.ShowQuestMark(target, 87);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 6: {
myself.SetCurrentQuestID(90);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 90, 1) < 9) {
myself.SetMemoStateEx(target, 90, 1, gg.GetMemoStateEx(target, 90, 1) + 1);

} else {
myself.GiveItem1(target, 7319, 1);
myself.SetFlagJournal(target, 90, 7);
myself.ShowQuestMark(target, 90);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 7: {
myself.SetCurrentQuestID(93);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 93, 1) < 9) {
myself.SetMemoStateEx(target, 93, 1, gg.GetMemoStateEx(target, 93, 1) + 1);

} else {
myself.GiveItem1(target, 7322, 1);
myself.SetFlagJournal(target, 93, 7);
myself.ShowQuestMark(target, 93);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 8: {
myself.SetCurrentQuestID(96);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 96, 1) < 9) {
myself.SetMemoStateEx(target, 96, 1, gg.GetMemoStateEx(target, 96, 1) + 1);

} else {
myself.GiveItem1(target, 7325, 1);
myself.SetFlagJournal(target, 96, 7);
myself.ShowQuestMark(target, 96);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 9: {
myself.SetCurrentQuestID(99);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 99, 1) < 9) {
myself.SetMemoStateEx(target, 99, 1, gg.GetMemoStateEx(target, 99, 1) + 1);

} else {
myself.GiveItem1(target, 7328, 1);
myself.SetFlagJournal(target, 99, 7);
myself.ShowQuestMark(target, 99);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 10: {
myself.SetCurrentQuestID(69);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetMemoStateEx(target, 69, 1) < 9) {
myself.SetMemoStateEx(target, 69, 1, gg.GetMemoStateEx(target, 69, 1) + 1);

} else {
myself.GiveItem1(target, 9727, 1);
myself.SetFlagJournal(target, 69, 7);
myself.ShowQuestMark(target, 69);
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