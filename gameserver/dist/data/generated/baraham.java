package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class baraham extends party_leader {
	protected void MY_DYING(HandlerParam always_list, HandlerParam attacker, HandlerParam c1, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 241) == 1 && gg.GetMemoState(target, 241) == 3 * 10 + 1 && target.subjob_id != 0) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 241) == 1 && gg.GetMemoState(target, 241) == 3 * 10 + 1 && target.subjob_id != 0) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 241) == 1 && gg.GetMemoState(target, 241) == 3 * 10 + 1 && target.subjob_id != 0) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
always_list.SetInfo(1, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(211);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 211)) {
if (gg.GetMemoState(c1, 211) == 5 && gg.OwnItemCount(c1, 2630) == 0) {
myself.GiveItem1(c1, 2630, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetMemoState(c1, 211, 6);
myself.SetFlagJournal(c1, 211, 7);
myself.ShowQuestMark(c1, 211);

}
if (myself.Maker_GetNpcCount() < 10) {
myself.CreateOnePrivateEx(1030646, "raldo", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(attacker), 0, 0);

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
myself.SetCurrentQuestID(241);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 1000) {
if (gg.OwnItemCount(target, 7587) + 1 >= 1) {
if (gg.OwnItemCount(target, 7587) < 1) {
myself.GiveItem1(target, 7587, 1 - gg.OwnItemCount(target, 7587));
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 241, 4);
myself.ShowQuestMark(target, 241);
myself.SetMemoState(target, 241, 3 * 10 + 2);

}

} else {
myself.GiveItem1(target, 7587, 1);
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