package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class water_spirit_ashutar extends raid_boss_type4 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam av_quest0, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam c3, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam npc0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
always_list.SetInfo(0, target);
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
always_list.SetInfo(0, target);

}

}
target = last_attacker;
always_list.SetInfo(1, target);
always_list.SetInfo(1, target);
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
always_list.SetInfo(1, target);

}

}
target = last_attacker;
if (gg.HaveMemo(target, 610) == 1 && gg.GetMemoState(target, 610) >= 2 * 10 - 9 && gg.GetMemoState(target, 610) <= 2 * 10 + 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 610) == 1 && gg.GetMemoState(target, 610) >= 2 * 10 - 9 && gg.GetMemoState(target, 610) <= 2 * 10 + 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 610) == 1 && gg.GetMemoState(target, 610) >= 2 * 10 - 9 && gg.GetMemoState(target, 610) <= 2 * 10 + 1) {
random1_list.SetInfo(2, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 350) == 1) {
always_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 350) == 1) {
always_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 350) == 1) {
always_list.SetInfo(3, target);

}

}

}
target = last_attacker;
always_list.SetInfo(4, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(611);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(611);
if (gg.OwnItemCount(target, 7225) >= 1) {
myself.DeleteItem1(target, 7225, gg.OwnItemCount(target, 7225));
myself.GiveItem1(target, 7224, 1);

} else if (gg.OwnItemCount(target, 7224) >= 1) {
myself.DeleteItem1(target, 7224, gg.OwnItemCount(target, 7224));
myself.GiveItem1(target, 7223, 1);

} else if (gg.OwnItemCount(target, 7223) >= 1) {
myself.DeleteItem1(target, 7223, gg.OwnItemCount(target, 7223));
myself.GiveItem1(target, 7222, 1);

} else if (gg.OwnItemCount(target, 7222) >= 1) {
myself.DeleteItem1(target, 7222, gg.OwnItemCount(target, 7222));
myself.GiveItem1(target, 7221, 1);

} else if (gg.OwnItemCount(target, 7221) >= 1) {
myself.DeleteItem1(target, 7221, gg.OwnItemCount(target, 7221));

}
if (gg.HaveMemo(target, 611)) {
myself.RemoveMemo(target, 611);
gg.AddLog(2, target, 611);
myself.DeleteItem1(target, 7226, gg.OwnItemCount(target, 7226));
myself.DeleteItem1(target, 7227, gg.OwnItemCount(target, 7227));
myself.DeleteItem1(target, 7228, gg.OwnItemCount(target, 7228));

}
if (gg.HaveMemo(target, 612)) {
myself.RemoveMemo(target, 612);
gg.AddLog(2, target, 612);
myself.DeleteItem1(target, 7234, gg.OwnItemCount(target, 7234));

}
if (gg.HaveMemo(target, 613)) {
myself.RemoveMemo(target, 613);
gg.AddLog(2, target, 613);
myself.DeleteItem1(target, 7240, gg.OwnItemCount(target, 7240));

}
if (gg.HaveMemo(target, 614)) {
myself.RemoveMemo(target, 614);
gg.AddLog(2, target, 614);
myself.DeleteItem1(target, 7241, gg.OwnItemCount(target, 7241));

}
if (gg.HaveMemo(target, 615)) {
myself.RemoveMemo(target, 615);
gg.AddLog(2, target, 615);
myself.DeleteItem1(target, 7242, gg.OwnItemCount(target, 7242));

}
if (gg.HaveMemo(target, 616)) {
myself.RemoveMemo(target, 616);
gg.AddLog(2, target, 616);
myself.DeleteItem1(target, 7244, gg.OwnItemCount(target, 7244));

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(610);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
npc0 = gg.GetNPCFromID(myself.sm.param1);
if (gg.IsNull(npc0) == 0) {
npc0.av_quest0.Exchange(0);

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(350);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 4651) + gg.OwnItemCount(target, 4652) + gg.OwnItemCount(target, 4653) + gg.OwnItemCount(target, 4654) + gg.OwnItemCount(target, 4655) + gg.OwnItemCount(target, 4656) + gg.OwnItemCount(target, 4657) + gg.OwnItemCount(target, 4658) + gg.OwnItemCount(target, 4659) + gg.OwnItemCount(target, 4660) + gg.OwnItemCount(target, 4661) + gg.OwnItemCount(target, 5579) + gg.OwnItemCount(target, 5582) + gg.OwnItemCount(target, 5914) + gg.OwnItemCount(target, 4629) + gg.OwnItemCount(target, 4630) + gg.OwnItemCount(target, 4631) + gg.OwnItemCount(target, 4632) + gg.OwnItemCount(target, 4633) + gg.OwnItemCount(target, 4634) + gg.OwnItemCount(target, 4635) + gg.OwnItemCount(target, 4636) + gg.OwnItemCount(target, 4637) + gg.OwnItemCount(target, 4638) + gg.OwnItemCount(target, 4639) + gg.OwnItemCount(target, 5577) + gg.OwnItemCount(target, 5580) + gg.OwnItemCount(target, 5908) + gg.OwnItemCount(target, 4640) + gg.OwnItemCount(target, 4641) + gg.OwnItemCount(target, 4642) + gg.OwnItemCount(target, 4643) + gg.OwnItemCount(target, 4644) + gg.OwnItemCount(target, 4645) + gg.OwnItemCount(target, 4646) + gg.OwnItemCount(target, 4647) + gg.OwnItemCount(target, 4648) + gg.OwnItemCount(target, 4649) + gg.OwnItemCount(target, 4650) + gg.OwnItemCount(target, 5578) + gg.OwnItemCount(target, 5581) + gg.OwnItemCount(target, 5911) + gg.OwnItemCount(target, 9571) + gg.OwnItemCount(target, 10161) + gg.OwnItemCount(target, 9570) + gg.OwnItemCount(target, 10160) + gg.OwnItemCount(target, 9572) + gg.OwnItemCount(target, 10162) + gg.OwnItemCount(target, 10482) + gg.OwnItemCount(target, 10481) + gg.OwnItemCount(target, 10480) + gg.OwnItemCount(target, 13072) + gg.OwnItemCount(target, 13073) + gg.OwnItemCount(target, 13071) + gg.OwnItemCount(target, 15542) + gg.OwnItemCount(target, 15543) + gg.OwnItemCount(target, 15541) == 1) {
if (gg.OwnItemCount(target, 4661) == 1) {
if (3 == 100 || gg.Rand(100) < 3) {
if (35001 == 35001) {
switch (11) {
case 11: {
myself.DeleteItem1(target, 4661, 1);
myself.GiveItem1(target, 5579, 1);
gg.AddLog(6, target, 5579);
break;

}
case 12: {
myself.DeleteItem1(target, 5579, 1);
myself.GiveItem1(target, 5582, 1);
gg.AddLog(6, target, 5582);
break;

}
case 13: {
myself.DeleteItem1(target, 5582, 1);
myself.GiveItem1(target, 5914, 1);
gg.AddLog(6, target, 5914);
break;

}
case 14: {
myself.DeleteItem1(target, 5914, 1);
myself.GiveItem1(target, 9571, 1);
gg.AddLog(6, target, 9571);
break;

}
case 15: {
myself.DeleteItem1(target, 9571, 1);
myself.GiveItem1(target, 10481, 1);
gg.AddLog(6, target, 10481);
break;

}
case 16: {
myself.DeleteItem1(target, 10481, 1);
myself.GiveItem1(target, 13072, 1);
gg.AddLog(6, target, 13072);
break;

}
case 17: {
myself.DeleteItem1(target, 13072, 1);
myself.GiveItem1(target, 15542, 1);
gg.AddLog(6, target, 15542);
break;

}
case 18: {
myself.DeleteItem1(target, 15542, 1);
myself.GiveItem1(target, 15827, 1);
gg.AddLog(6, target, 15827);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, target.name, gg.IntToStr(11), "", "", ""));

} else if (35001 == 35002) {
switch (11) {
case 11: {
myself.DeleteItem1(target, 4639, 1);
myself.GiveItem1(target, 5577, 1);
gg.AddLog(6, target, 5577);
break;

}
case 12: {
myself.DeleteItem1(target, 5577, 1);
myself.GiveItem1(target, 5580, 1);
gg.AddLog(6, target, 5580);
break;

}
case 13: {
myself.DeleteItem1(target, 5580, 1);
myself.GiveItem1(target, 5908, 1);
gg.AddLog(6, target, 5908);
break;

}
case 14: {
myself.DeleteItem1(target, 5908, 1);
myself.GiveItem1(target, 9570, 1);
gg.AddLog(6, target, 9570);
break;

}
case 15: {
myself.DeleteItem1(target, 9570, 1);
myself.GiveItem1(target, 10480, 1);
gg.AddLog(6, target, 10480);
break;

}
case 16: {
myself.DeleteItem1(target, 10480, 1);
myself.GiveItem1(target, 13071, 1);
gg.AddLog(6, target, 13071);
break;

}
case 17: {
myself.DeleteItem1(target, 13071, 1);
myself.GiveItem1(target, 15541, 1);
gg.AddLog(6, target, 15541);
break;

}
case 18: {
myself.DeleteItem1(target, 15541, 1);
myself.GiveItem1(target, 15826, 1);
gg.AddLog(6, target, 15826);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, target.name, gg.IntToStr(11), "", "", ""));

} else if (35001 == 35003) {
switch (11) {
case 11: {
myself.DeleteItem1(target, 4650, 1);
myself.GiveItem1(target, 5578, 1);
gg.AddLog(6, target, 5578);
break;

}
case 12: {
myself.DeleteItem1(target, 5578, 1);
myself.GiveItem1(target, 5581, 1);
gg.AddLog(6, target, 5581);
break;

}
case 13: {
myself.DeleteItem1(target, 5581, 1);
myself.GiveItem1(target, 5911, 1);
gg.AddLog(6, target, 5911);
break;

}
case 14: {
myself.DeleteItem1(target, 5911, 1);
myself.GiveItem1(target, 9572, 1);
gg.AddLog(6, target, 9572);
break;

}
case 15: {
myself.DeleteItem1(target, 9572, 1);
myself.GiveItem1(target, 10482, 1);
gg.AddLog(6, target, 10482);
break;

}
case 16: {
myself.DeleteItem1(target, 10482, 1);
myself.GiveItem1(target, 13073, 1);
gg.AddLog(6, target, 13073);
break;

}
case 17: {
myself.DeleteItem1(target, 13073, 1);
myself.GiveItem1(target, 15543, 1);
gg.AddLog(6, target, 15543);
break;

}
case 18: {
myself.DeleteItem1(target, 15543, 1);
myself.GiveItem1(target, 15828, 1);
gg.AddLog(6, target, 15828);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, target.name, gg.IntToStr(11), "", "", ""));

}

} else {
myself.ShowSystemMessage(target, 975);

}

} else if (gg.OwnItemCount(target, 5579) == 1) {
if (3 == 100 || gg.Rand(100) < 3) {
if (35001 == 35001) {
switch (12) {
case 11: {
myself.DeleteItem1(target, 4661, 1);
myself.GiveItem1(target, 5579, 1);
gg.AddLog(6, target, 5579);
break;

}
case 12: {
myself.DeleteItem1(target, 5579, 1);
myself.GiveItem1(target, 5582, 1);
gg.AddLog(6, target, 5582);
break;

}
case 13: {
myself.DeleteItem1(target, 5582, 1);
myself.GiveItem1(target, 5914, 1);
gg.AddLog(6, target, 5914);
break;

}
case 14: {
myself.DeleteItem1(target, 5914, 1);
myself.GiveItem1(target, 9571, 1);
gg.AddLog(6, target, 9571);
break;

}
case 15: {
myself.DeleteItem1(target, 9571, 1);
myself.GiveItem1(target, 10481, 1);
gg.AddLog(6, target, 10481);
break;

}
case 16: {
myself.DeleteItem1(target, 10481, 1);
myself.GiveItem1(target, 13072, 1);
gg.AddLog(6, target, 13072);
break;

}
case 17: {
myself.DeleteItem1(target, 13072, 1);
myself.GiveItem1(target, 15542, 1);
gg.AddLog(6, target, 15542);
break;

}
case 18: {
myself.DeleteItem1(target, 15542, 1);
myself.GiveItem1(target, 15827, 1);
gg.AddLog(6, target, 15827);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, target.name, gg.IntToStr(12), "", "", ""));

} else if (35001 == 35002) {
switch (12) {
case 11: {
myself.DeleteItem1(target, 4639, 1);
myself.GiveItem1(target, 5577, 1);
gg.AddLog(6, target, 5577);
break;

}
case 12: {
myself.DeleteItem1(target, 5577, 1);
myself.GiveItem1(target, 5580, 1);
gg.AddLog(6, target, 5580);
break;

}
case 13: {
myself.DeleteItem1(target, 5580, 1);
myself.GiveItem1(target, 5908, 1);
gg.AddLog(6, target, 5908);
break;

}
case 14: {
myself.DeleteItem1(target, 5908, 1);
myself.GiveItem1(target, 9570, 1);
gg.AddLog(6, target, 9570);
break;

}
case 15: {
myself.DeleteItem1(target, 9570, 1);
myself.GiveItem1(target, 10480, 1);
gg.AddLog(6, target, 10480);
break;

}
case 16: {
myself.DeleteItem1(target, 10480, 1);
myself.GiveItem1(target, 13071, 1);
gg.AddLog(6, target, 13071);
break;

}
case 17: {
myself.DeleteItem1(target, 13071, 1);
myself.GiveItem1(target, 15541, 1);
gg.AddLog(6, target, 15541);
break;

}
case 18: {
myself.DeleteItem1(target, 15541, 1);
myself.GiveItem1(target, 15826, 1);
gg.AddLog(6, target, 15826);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, target.name, gg.IntToStr(12), "", "", ""));

} else if (35001 == 35003) {
switch (12) {
case 11: {
myself.DeleteItem1(target, 4650, 1);
myself.GiveItem1(target, 5578, 1);
gg.AddLog(6, target, 5578);
break;

}
case 12: {
myself.DeleteItem1(target, 5578, 1);
myself.GiveItem1(target, 5581, 1);
gg.AddLog(6, target, 5581);
break;

}
case 13: {
myself.DeleteItem1(target, 5581, 1);
myself.GiveItem1(target, 5911, 1);
gg.AddLog(6, target, 5911);
break;

}
case 14: {
myself.DeleteItem1(target, 5911, 1);
myself.GiveItem1(target, 9572, 1);
gg.AddLog(6, target, 9572);
break;

}
case 15: {
myself.DeleteItem1(target, 9572, 1);
myself.GiveItem1(target, 10482, 1);
gg.AddLog(6, target, 10482);
break;

}
case 16: {
myself.DeleteItem1(target, 10482, 1);
myself.GiveItem1(target, 13073, 1);
gg.AddLog(6, target, 13073);
break;

}
case 17: {
myself.DeleteItem1(target, 13073, 1);
myself.GiveItem1(target, 15543, 1);
gg.AddLog(6, target, 15543);
break;

}
case 18: {
myself.DeleteItem1(target, 15543, 1);
myself.GiveItem1(target, 15828, 1);
gg.AddLog(6, target, 15828);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, target.name, gg.IntToStr(12), "", "", ""));

}

} else {
myself.ShowSystemMessage(target, 975);

}

} else if (gg.OwnItemCount(target, 5582) == 1) {
if (3 == 100 || gg.Rand(100) < 3) {
if (35001 == 35001) {
switch (13) {
case 11: {
myself.DeleteItem1(target, 4661, 1);
myself.GiveItem1(target, 5579, 1);
gg.AddLog(6, target, 5579);
break;

}
case 12: {
myself.DeleteItem1(target, 5579, 1);
myself.GiveItem1(target, 5582, 1);
gg.AddLog(6, target, 5582);
break;

}
case 13: {
myself.DeleteItem1(target, 5582, 1);
myself.GiveItem1(target, 5914, 1);
gg.AddLog(6, target, 5914);
break;

}
case 14: {
myself.DeleteItem1(target, 5914, 1);
myself.GiveItem1(target, 9571, 1);
gg.AddLog(6, target, 9571);
break;

}
case 15: {
myself.DeleteItem1(target, 9571, 1);
myself.GiveItem1(target, 10481, 1);
gg.AddLog(6, target, 10481);
break;

}
case 16: {
myself.DeleteItem1(target, 10481, 1);
myself.GiveItem1(target, 13072, 1);
gg.AddLog(6, target, 13072);
break;

}
case 17: {
myself.DeleteItem1(target, 13072, 1);
myself.GiveItem1(target, 15542, 1);
gg.AddLog(6, target, 15542);
break;

}
case 18: {
myself.DeleteItem1(target, 15542, 1);
myself.GiveItem1(target, 15827, 1);
gg.AddLog(6, target, 15827);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, target.name, gg.IntToStr(13), "", "", ""));

} else if (35001 == 35002) {
switch (13) {
case 11: {
myself.DeleteItem1(target, 4639, 1);
myself.GiveItem1(target, 5577, 1);
gg.AddLog(6, target, 5577);
break;

}
case 12: {
myself.DeleteItem1(target, 5577, 1);
myself.GiveItem1(target, 5580, 1);
gg.AddLog(6, target, 5580);
break;

}
case 13: {
myself.DeleteItem1(target, 5580, 1);
myself.GiveItem1(target, 5908, 1);
gg.AddLog(6, target, 5908);
break;

}
case 14: {
myself.DeleteItem1(target, 5908, 1);
myself.GiveItem1(target, 9570, 1);
gg.AddLog(6, target, 9570);
break;

}
case 15: {
myself.DeleteItem1(target, 9570, 1);
myself.GiveItem1(target, 10480, 1);
gg.AddLog(6, target, 10480);
break;

}
case 16: {
myself.DeleteItem1(target, 10480, 1);
myself.GiveItem1(target, 13071, 1);
gg.AddLog(6, target, 13071);
break;

}
case 17: {
myself.DeleteItem1(target, 13071, 1);
myself.GiveItem1(target, 15541, 1);
gg.AddLog(6, target, 15541);
break;

}
case 18: {
myself.DeleteItem1(target, 15541, 1);
myself.GiveItem1(target, 15826, 1);
gg.AddLog(6, target, 15826);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, target.name, gg.IntToStr(13), "", "", ""));

} else if (35001 == 35003) {
switch (13) {
case 11: {
myself.DeleteItem1(target, 4650, 1);
myself.GiveItem1(target, 5578, 1);
gg.AddLog(6, target, 5578);
break;

}
case 12: {
myself.DeleteItem1(target, 5578, 1);
myself.GiveItem1(target, 5581, 1);
gg.AddLog(6, target, 5581);
break;

}
case 13: {
myself.DeleteItem1(target, 5581, 1);
myself.GiveItem1(target, 5911, 1);
gg.AddLog(6, target, 5911);
break;

}
case 14: {
myself.DeleteItem1(target, 5911, 1);
myself.GiveItem1(target, 9572, 1);
gg.AddLog(6, target, 9572);
break;

}
case 15: {
myself.DeleteItem1(target, 9572, 1);
myself.GiveItem1(target, 10482, 1);
gg.AddLog(6, target, 10482);
break;

}
case 16: {
myself.DeleteItem1(target, 10482, 1);
myself.GiveItem1(target, 13073, 1);
gg.AddLog(6, target, 13073);
break;

}
case 17: {
myself.DeleteItem1(target, 13073, 1);
myself.GiveItem1(target, 15543, 1);
gg.AddLog(6, target, 15543);
break;

}
case 18: {
myself.DeleteItem1(target, 15543, 1);
myself.GiveItem1(target, 15828, 1);
gg.AddLog(6, target, 15828);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, target.name, gg.IntToStr(13), "", "", ""));

}

} else {
myself.ShowSystemMessage(target, 975);

}

} else if (gg.OwnItemCount(target, 5914) == 1) {
if (3 == 100 || gg.Rand(100) < 3) {
if (35001 == 35001) {
switch (14) {
case 11: {
myself.DeleteItem1(target, 4661, 1);
myself.GiveItem1(target, 5579, 1);
gg.AddLog(6, target, 5579);
break;

}
case 12: {
myself.DeleteItem1(target, 5579, 1);
myself.GiveItem1(target, 5582, 1);
gg.AddLog(6, target, 5582);
break;

}
case 13: {
myself.DeleteItem1(target, 5582, 1);
myself.GiveItem1(target, 5914, 1);
gg.AddLog(6, target, 5914);
break;

}
case 14: {
myself.DeleteItem1(target, 5914, 1);
myself.GiveItem1(target, 9571, 1);
gg.AddLog(6, target, 9571);
break;

}
case 15: {
myself.DeleteItem1(target, 9571, 1);
myself.GiveItem1(target, 10481, 1);
gg.AddLog(6, target, 10481);
break;

}
case 16: {
myself.DeleteItem1(target, 10481, 1);
myself.GiveItem1(target, 13072, 1);
gg.AddLog(6, target, 13072);
break;

}
case 17: {
myself.DeleteItem1(target, 13072, 1);
myself.GiveItem1(target, 15542, 1);
gg.AddLog(6, target, 15542);
break;

}
case 18: {
myself.DeleteItem1(target, 15542, 1);
myself.GiveItem1(target, 15827, 1);
gg.AddLog(6, target, 15827);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, target.name, gg.IntToStr(14), "", "", ""));

} else if (35001 == 35002) {
switch (14) {
case 11: {
myself.DeleteItem1(target, 4639, 1);
myself.GiveItem1(target, 5577, 1);
gg.AddLog(6, target, 5577);
break;

}
case 12: {
myself.DeleteItem1(target, 5577, 1);
myself.GiveItem1(target, 5580, 1);
gg.AddLog(6, target, 5580);
break;

}
case 13: {
myself.DeleteItem1(target, 5580, 1);
myself.GiveItem1(target, 5908, 1);
gg.AddLog(6, target, 5908);
break;

}
case 14: {
myself.DeleteItem1(target, 5908, 1);
myself.GiveItem1(target, 9570, 1);
gg.AddLog(6, target, 9570);
break;

}
case 15: {
myself.DeleteItem1(target, 9570, 1);
myself.GiveItem1(target, 10480, 1);
gg.AddLog(6, target, 10480);
break;

}
case 16: {
myself.DeleteItem1(target, 10480, 1);
myself.GiveItem1(target, 13071, 1);
gg.AddLog(6, target, 13071);
break;

}
case 17: {
myself.DeleteItem1(target, 13071, 1);
myself.GiveItem1(target, 15541, 1);
gg.AddLog(6, target, 15541);
break;

}
case 18: {
myself.DeleteItem1(target, 15541, 1);
myself.GiveItem1(target, 15826, 1);
gg.AddLog(6, target, 15826);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, target.name, gg.IntToStr(14), "", "", ""));

} else if (35001 == 35003) {
switch (14) {
case 11: {
myself.DeleteItem1(target, 4650, 1);
myself.GiveItem1(target, 5578, 1);
gg.AddLog(6, target, 5578);
break;

}
case 12: {
myself.DeleteItem1(target, 5578, 1);
myself.GiveItem1(target, 5581, 1);
gg.AddLog(6, target, 5581);
break;

}
case 13: {
myself.DeleteItem1(target, 5581, 1);
myself.GiveItem1(target, 5911, 1);
gg.AddLog(6, target, 5911);
break;

}
case 14: {
myself.DeleteItem1(target, 5911, 1);
myself.GiveItem1(target, 9572, 1);
gg.AddLog(6, target, 9572);
break;

}
case 15: {
myself.DeleteItem1(target, 9572, 1);
myself.GiveItem1(target, 10482, 1);
gg.AddLog(6, target, 10482);
break;

}
case 16: {
myself.DeleteItem1(target, 10482, 1);
myself.GiveItem1(target, 13073, 1);
gg.AddLog(6, target, 13073);
break;

}
case 17: {
myself.DeleteItem1(target, 13073, 1);
myself.GiveItem1(target, 15543, 1);
gg.AddLog(6, target, 15543);
break;

}
case 18: {
myself.DeleteItem1(target, 15543, 1);
myself.GiveItem1(target, 15828, 1);
gg.AddLog(6, target, 15828);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, target.name, gg.IntToStr(14), "", "", ""));

}

} else {
myself.ShowSystemMessage(target, 975);

}

} else if (gg.OwnItemCount(target, 4639) == 1) {
if (3 == 100 || gg.Rand(100) < 3) {
if (35002 == 35001) {
switch (11) {
case 11: {
myself.DeleteItem1(target, 4661, 1);
myself.GiveItem1(target, 5579, 1);
gg.AddLog(6, target, 5579);
break;

}
case 12: {
myself.DeleteItem1(target, 5579, 1);
myself.GiveItem1(target, 5582, 1);
gg.AddLog(6, target, 5582);
break;

}
case 13: {
myself.DeleteItem1(target, 5582, 1);
myself.GiveItem1(target, 5914, 1);
gg.AddLog(6, target, 5914);
break;

}
case 14: {
myself.DeleteItem1(target, 5914, 1);
myself.GiveItem1(target, 9571, 1);
gg.AddLog(6, target, 9571);
break;

}
case 15: {
myself.DeleteItem1(target, 9571, 1);
myself.GiveItem1(target, 10481, 1);
gg.AddLog(6, target, 10481);
break;

}
case 16: {
myself.DeleteItem1(target, 10481, 1);
myself.GiveItem1(target, 13072, 1);
gg.AddLog(6, target, 13072);
break;

}
case 17: {
myself.DeleteItem1(target, 13072, 1);
myself.GiveItem1(target, 15542, 1);
gg.AddLog(6, target, 15542);
break;

}
case 18: {
myself.DeleteItem1(target, 15542, 1);
myself.GiveItem1(target, 15827, 1);
gg.AddLog(6, target, 15827);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, target.name, gg.IntToStr(11), "", "", ""));

} else if (35002 == 35002) {
switch (11) {
case 11: {
myself.DeleteItem1(target, 4639, 1);
myself.GiveItem1(target, 5577, 1);
gg.AddLog(6, target, 5577);
break;

}
case 12: {
myself.DeleteItem1(target, 5577, 1);
myself.GiveItem1(target, 5580, 1);
gg.AddLog(6, target, 5580);
break;

}
case 13: {
myself.DeleteItem1(target, 5580, 1);
myself.GiveItem1(target, 5908, 1);
gg.AddLog(6, target, 5908);
break;

}
case 14: {
myself.DeleteItem1(target, 5908, 1);
myself.GiveItem1(target, 9570, 1);
gg.AddLog(6, target, 9570);
break;

}
case 15: {
myself.DeleteItem1(target, 9570, 1);
myself.GiveItem1(target, 10480, 1);
gg.AddLog(6, target, 10480);
break;

}
case 16: {
myself.DeleteItem1(target, 10480, 1);
myself.GiveItem1(target, 13071, 1);
gg.AddLog(6, target, 13071);
break;

}
case 17: {
myself.DeleteItem1(target, 13071, 1);
myself.GiveItem1(target, 15541, 1);
gg.AddLog(6, target, 15541);
break;

}
case 18: {
myself.DeleteItem1(target, 15541, 1);
myself.GiveItem1(target, 15826, 1);
gg.AddLog(6, target, 15826);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, target.name, gg.IntToStr(11), "", "", ""));

} else if (35002 == 35003) {
switch (11) {
case 11: {
myself.DeleteItem1(target, 4650, 1);
myself.GiveItem1(target, 5578, 1);
gg.AddLog(6, target, 5578);
break;

}
case 12: {
myself.DeleteItem1(target, 5578, 1);
myself.GiveItem1(target, 5581, 1);
gg.AddLog(6, target, 5581);
break;

}
case 13: {
myself.DeleteItem1(target, 5581, 1);
myself.GiveItem1(target, 5911, 1);
gg.AddLog(6, target, 5911);
break;

}
case 14: {
myself.DeleteItem1(target, 5911, 1);
myself.GiveItem1(target, 9572, 1);
gg.AddLog(6, target, 9572);
break;

}
case 15: {
myself.DeleteItem1(target, 9572, 1);
myself.GiveItem1(target, 10482, 1);
gg.AddLog(6, target, 10482);
break;

}
case 16: {
myself.DeleteItem1(target, 10482, 1);
myself.GiveItem1(target, 13073, 1);
gg.AddLog(6, target, 13073);
break;

}
case 17: {
myself.DeleteItem1(target, 13073, 1);
myself.GiveItem1(target, 15543, 1);
gg.AddLog(6, target, 15543);
break;

}
case 18: {
myself.DeleteItem1(target, 15543, 1);
myself.GiveItem1(target, 15828, 1);
gg.AddLog(6, target, 15828);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, target.name, gg.IntToStr(11), "", "", ""));

}

} else {
myself.ShowSystemMessage(target, 975);

}

} else if (gg.OwnItemCount(target, 5577) == 1) {
if (3 == 100 || gg.Rand(100) < 3) {
if (35002 == 35001) {
switch (12) {
case 11: {
myself.DeleteItem1(target, 4661, 1);
myself.GiveItem1(target, 5579, 1);
gg.AddLog(6, target, 5579);
break;

}
case 12: {
myself.DeleteItem1(target, 5579, 1);
myself.GiveItem1(target, 5582, 1);
gg.AddLog(6, target, 5582);
break;

}
case 13: {
myself.DeleteItem1(target, 5582, 1);
myself.GiveItem1(target, 5914, 1);
gg.AddLog(6, target, 5914);
break;

}
case 14: {
myself.DeleteItem1(target, 5914, 1);
myself.GiveItem1(target, 9571, 1);
gg.AddLog(6, target, 9571);
break;

}
case 15: {
myself.DeleteItem1(target, 9571, 1);
myself.GiveItem1(target, 10481, 1);
gg.AddLog(6, target, 10481);
break;

}
case 16: {
myself.DeleteItem1(target, 10481, 1);
myself.GiveItem1(target, 13072, 1);
gg.AddLog(6, target, 13072);
break;

}
case 17: {
myself.DeleteItem1(target, 13072, 1);
myself.GiveItem1(target, 15542, 1);
gg.AddLog(6, target, 15542);
break;

}
case 18: {
myself.DeleteItem1(target, 15542, 1);
myself.GiveItem1(target, 15827, 1);
gg.AddLog(6, target, 15827);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, target.name, gg.IntToStr(12), "", "", ""));

} else if (35002 == 35002) {
switch (12) {
case 11: {
myself.DeleteItem1(target, 4639, 1);
myself.GiveItem1(target, 5577, 1);
gg.AddLog(6, target, 5577);
break;

}
case 12: {
myself.DeleteItem1(target, 5577, 1);
myself.GiveItem1(target, 5580, 1);
gg.AddLog(6, target, 5580);
break;

}
case 13: {
myself.DeleteItem1(target, 5580, 1);
myself.GiveItem1(target, 5908, 1);
gg.AddLog(6, target, 5908);
break;

}
case 14: {
myself.DeleteItem1(target, 5908, 1);
myself.GiveItem1(target, 9570, 1);
gg.AddLog(6, target, 9570);
break;

}
case 15: {
myself.DeleteItem1(target, 9570, 1);
myself.GiveItem1(target, 10480, 1);
gg.AddLog(6, target, 10480);
break;

}
case 16: {
myself.DeleteItem1(target, 10480, 1);
myself.GiveItem1(target, 13071, 1);
gg.AddLog(6, target, 13071);
break;

}
case 17: {
myself.DeleteItem1(target, 13071, 1);
myself.GiveItem1(target, 15541, 1);
gg.AddLog(6, target, 15541);
break;

}
case 18: {
myself.DeleteItem1(target, 15541, 1);
myself.GiveItem1(target, 15826, 1);
gg.AddLog(6, target, 15826);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, target.name, gg.IntToStr(12), "", "", ""));

} else if (35002 == 35003) {
switch (12) {
case 11: {
myself.DeleteItem1(target, 4650, 1);
myself.GiveItem1(target, 5578, 1);
gg.AddLog(6, target, 5578);
break;

}
case 12: {
myself.DeleteItem1(target, 5578, 1);
myself.GiveItem1(target, 5581, 1);
gg.AddLog(6, target, 5581);
break;

}
case 13: {
myself.DeleteItem1(target, 5581, 1);
myself.GiveItem1(target, 5911, 1);
gg.AddLog(6, target, 5911);
break;

}
case 14: {
myself.DeleteItem1(target, 5911, 1);
myself.GiveItem1(target, 9572, 1);
gg.AddLog(6, target, 9572);
break;

}
case 15: {
myself.DeleteItem1(target, 9572, 1);
myself.GiveItem1(target, 10482, 1);
gg.AddLog(6, target, 10482);
break;

}
case 16: {
myself.DeleteItem1(target, 10482, 1);
myself.GiveItem1(target, 13073, 1);
gg.AddLog(6, target, 13073);
break;

}
case 17: {
myself.DeleteItem1(target, 13073, 1);
myself.GiveItem1(target, 15543, 1);
gg.AddLog(6, target, 15543);
break;

}
case 18: {
myself.DeleteItem1(target, 15543, 1);
myself.GiveItem1(target, 15828, 1);
gg.AddLog(6, target, 15828);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, target.name, gg.IntToStr(12), "", "", ""));

}

} else {
myself.ShowSystemMessage(target, 975);

}

} else if (gg.OwnItemCount(target, 5580) == 1) {
if (3 == 100 || gg.Rand(100) < 3) {
if (35002 == 35001) {
switch (13) {
case 11: {
myself.DeleteItem1(target, 4661, 1);
myself.GiveItem1(target, 5579, 1);
gg.AddLog(6, target, 5579);
break;

}
case 12: {
myself.DeleteItem1(target, 5579, 1);
myself.GiveItem1(target, 5582, 1);
gg.AddLog(6, target, 5582);
break;

}
case 13: {
myself.DeleteItem1(target, 5582, 1);
myself.GiveItem1(target, 5914, 1);
gg.AddLog(6, target, 5914);
break;

}
case 14: {
myself.DeleteItem1(target, 5914, 1);
myself.GiveItem1(target, 9571, 1);
gg.AddLog(6, target, 9571);
break;

}
case 15: {
myself.DeleteItem1(target, 9571, 1);
myself.GiveItem1(target, 10481, 1);
gg.AddLog(6, target, 10481);
break;

}
case 16: {
myself.DeleteItem1(target, 10481, 1);
myself.GiveItem1(target, 13072, 1);
gg.AddLog(6, target, 13072);
break;

}
case 17: {
myself.DeleteItem1(target, 13072, 1);
myself.GiveItem1(target, 15542, 1);
gg.AddLog(6, target, 15542);
break;

}
case 18: {
myself.DeleteItem1(target, 15542, 1);
myself.GiveItem1(target, 15827, 1);
gg.AddLog(6, target, 15827);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, target.name, gg.IntToStr(13), "", "", ""));

} else if (35002 == 35002) {
switch (13) {
case 11: {
myself.DeleteItem1(target, 4639, 1);
myself.GiveItem1(target, 5577, 1);
gg.AddLog(6, target, 5577);
break;

}
case 12: {
myself.DeleteItem1(target, 5577, 1);
myself.GiveItem1(target, 5580, 1);
gg.AddLog(6, target, 5580);
break;

}
case 13: {
myself.DeleteItem1(target, 5580, 1);
myself.GiveItem1(target, 5908, 1);
gg.AddLog(6, target, 5908);
break;

}
case 14: {
myself.DeleteItem1(target, 5908, 1);
myself.GiveItem1(target, 9570, 1);
gg.AddLog(6, target, 9570);
break;

}
case 15: {
myself.DeleteItem1(target, 9570, 1);
myself.GiveItem1(target, 10480, 1);
gg.AddLog(6, target, 10480);
break;

}
case 16: {
myself.DeleteItem1(target, 10480, 1);
myself.GiveItem1(target, 13071, 1);
gg.AddLog(6, target, 13071);
break;

}
case 17: {
myself.DeleteItem1(target, 13071, 1);
myself.GiveItem1(target, 15541, 1);
gg.AddLog(6, target, 15541);
break;

}
case 18: {
myself.DeleteItem1(target, 15541, 1);
myself.GiveItem1(target, 15826, 1);
gg.AddLog(6, target, 15826);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, target.name, gg.IntToStr(13), "", "", ""));

} else if (35002 == 35003) {
switch (13) {
case 11: {
myself.DeleteItem1(target, 4650, 1);
myself.GiveItem1(target, 5578, 1);
gg.AddLog(6, target, 5578);
break;

}
case 12: {
myself.DeleteItem1(target, 5578, 1);
myself.GiveItem1(target, 5581, 1);
gg.AddLog(6, target, 5581);
break;

}
case 13: {
myself.DeleteItem1(target, 5581, 1);
myself.GiveItem1(target, 5911, 1);
gg.AddLog(6, target, 5911);
break;

}
case 14: {
myself.DeleteItem1(target, 5911, 1);
myself.GiveItem1(target, 9572, 1);
gg.AddLog(6, target, 9572);
break;

}
case 15: {
myself.DeleteItem1(target, 9572, 1);
myself.GiveItem1(target, 10482, 1);
gg.AddLog(6, target, 10482);
break;

}
case 16: {
myself.DeleteItem1(target, 10482, 1);
myself.GiveItem1(target, 13073, 1);
gg.AddLog(6, target, 13073);
break;

}
case 17: {
myself.DeleteItem1(target, 13073, 1);
myself.GiveItem1(target, 15543, 1);
gg.AddLog(6, target, 15543);
break;

}
case 18: {
myself.DeleteItem1(target, 15543, 1);
myself.GiveItem1(target, 15828, 1);
gg.AddLog(6, target, 15828);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, target.name, gg.IntToStr(13), "", "", ""));

}

} else {
myself.ShowSystemMessage(target, 975);

}

} else if (gg.OwnItemCount(target, 5908) == 1) {
if (3 == 100 || gg.Rand(100) < 3) {
if (35002 == 35001) {
switch (14) {
case 11: {
myself.DeleteItem1(target, 4661, 1);
myself.GiveItem1(target, 5579, 1);
gg.AddLog(6, target, 5579);
break;

}
case 12: {
myself.DeleteItem1(target, 5579, 1);
myself.GiveItem1(target, 5582, 1);
gg.AddLog(6, target, 5582);
break;

}
case 13: {
myself.DeleteItem1(target, 5582, 1);
myself.GiveItem1(target, 5914, 1);
gg.AddLog(6, target, 5914);
break;

}
case 14: {
myself.DeleteItem1(target, 5914, 1);
myself.GiveItem1(target, 9571, 1);
gg.AddLog(6, target, 9571);
break;

}
case 15: {
myself.DeleteItem1(target, 9571, 1);
myself.GiveItem1(target, 10481, 1);
gg.AddLog(6, target, 10481);
break;

}
case 16: {
myself.DeleteItem1(target, 10481, 1);
myself.GiveItem1(target, 13072, 1);
gg.AddLog(6, target, 13072);
break;

}
case 17: {
myself.DeleteItem1(target, 13072, 1);
myself.GiveItem1(target, 15542, 1);
gg.AddLog(6, target, 15542);
break;

}
case 18: {
myself.DeleteItem1(target, 15542, 1);
myself.GiveItem1(target, 15827, 1);
gg.AddLog(6, target, 15827);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, target.name, gg.IntToStr(14), "", "", ""));

} else if (35002 == 35002) {
switch (14) {
case 11: {
myself.DeleteItem1(target, 4639, 1);
myself.GiveItem1(target, 5577, 1);
gg.AddLog(6, target, 5577);
break;

}
case 12: {
myself.DeleteItem1(target, 5577, 1);
myself.GiveItem1(target, 5580, 1);
gg.AddLog(6, target, 5580);
break;

}
case 13: {
myself.DeleteItem1(target, 5580, 1);
myself.GiveItem1(target, 5908, 1);
gg.AddLog(6, target, 5908);
break;

}
case 14: {
myself.DeleteItem1(target, 5908, 1);
myself.GiveItem1(target, 9570, 1);
gg.AddLog(6, target, 9570);
break;

}
case 15: {
myself.DeleteItem1(target, 9570, 1);
myself.GiveItem1(target, 10480, 1);
gg.AddLog(6, target, 10480);
break;

}
case 16: {
myself.DeleteItem1(target, 10480, 1);
myself.GiveItem1(target, 13071, 1);
gg.AddLog(6, target, 13071);
break;

}
case 17: {
myself.DeleteItem1(target, 13071, 1);
myself.GiveItem1(target, 15541, 1);
gg.AddLog(6, target, 15541);
break;

}
case 18: {
myself.DeleteItem1(target, 15541, 1);
myself.GiveItem1(target, 15826, 1);
gg.AddLog(6, target, 15826);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, target.name, gg.IntToStr(14), "", "", ""));

} else if (35002 == 35003) {
switch (14) {
case 11: {
myself.DeleteItem1(target, 4650, 1);
myself.GiveItem1(target, 5578, 1);
gg.AddLog(6, target, 5578);
break;

}
case 12: {
myself.DeleteItem1(target, 5578, 1);
myself.GiveItem1(target, 5581, 1);
gg.AddLog(6, target, 5581);
break;

}
case 13: {
myself.DeleteItem1(target, 5581, 1);
myself.GiveItem1(target, 5911, 1);
gg.AddLog(6, target, 5911);
break;

}
case 14: {
myself.DeleteItem1(target, 5911, 1);
myself.GiveItem1(target, 9572, 1);
gg.AddLog(6, target, 9572);
break;

}
case 15: {
myself.DeleteItem1(target, 9572, 1);
myself.GiveItem1(target, 10482, 1);
gg.AddLog(6, target, 10482);
break;

}
case 16: {
myself.DeleteItem1(target, 10482, 1);
myself.GiveItem1(target, 13073, 1);
gg.AddLog(6, target, 13073);
break;

}
case 17: {
myself.DeleteItem1(target, 13073, 1);
myself.GiveItem1(target, 15543, 1);
gg.AddLog(6, target, 15543);
break;

}
case 18: {
myself.DeleteItem1(target, 15543, 1);
myself.GiveItem1(target, 15828, 1);
gg.AddLog(6, target, 15828);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, target.name, gg.IntToStr(14), "", "", ""));

}

} else {
myself.ShowSystemMessage(target, 975);

}

} else if (gg.OwnItemCount(target, 4650) == 1) {
if (3 == 100 || gg.Rand(100) < 3) {
if (35003 == 35001) {
switch (11) {
case 11: {
myself.DeleteItem1(target, 4661, 1);
myself.GiveItem1(target, 5579, 1);
gg.AddLog(6, target, 5579);
break;

}
case 12: {
myself.DeleteItem1(target, 5579, 1);
myself.GiveItem1(target, 5582, 1);
gg.AddLog(6, target, 5582);
break;

}
case 13: {
myself.DeleteItem1(target, 5582, 1);
myself.GiveItem1(target, 5914, 1);
gg.AddLog(6, target, 5914);
break;

}
case 14: {
myself.DeleteItem1(target, 5914, 1);
myself.GiveItem1(target, 9571, 1);
gg.AddLog(6, target, 9571);
break;

}
case 15: {
myself.DeleteItem1(target, 9571, 1);
myself.GiveItem1(target, 10481, 1);
gg.AddLog(6, target, 10481);
break;

}
case 16: {
myself.DeleteItem1(target, 10481, 1);
myself.GiveItem1(target, 13072, 1);
gg.AddLog(6, target, 13072);
break;

}
case 17: {
myself.DeleteItem1(target, 13072, 1);
myself.GiveItem1(target, 15542, 1);
gg.AddLog(6, target, 15542);
break;

}
case 18: {
myself.DeleteItem1(target, 15542, 1);
myself.GiveItem1(target, 15827, 1);
gg.AddLog(6, target, 15827);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, target.name, gg.IntToStr(11), "", "", ""));

} else if (35003 == 35002) {
switch (11) {
case 11: {
myself.DeleteItem1(target, 4639, 1);
myself.GiveItem1(target, 5577, 1);
gg.AddLog(6, target, 5577);
break;

}
case 12: {
myself.DeleteItem1(target, 5577, 1);
myself.GiveItem1(target, 5580, 1);
gg.AddLog(6, target, 5580);
break;

}
case 13: {
myself.DeleteItem1(target, 5580, 1);
myself.GiveItem1(target, 5908, 1);
gg.AddLog(6, target, 5908);
break;

}
case 14: {
myself.DeleteItem1(target, 5908, 1);
myself.GiveItem1(target, 9570, 1);
gg.AddLog(6, target, 9570);
break;

}
case 15: {
myself.DeleteItem1(target, 9570, 1);
myself.GiveItem1(target, 10480, 1);
gg.AddLog(6, target, 10480);
break;

}
case 16: {
myself.DeleteItem1(target, 10480, 1);
myself.GiveItem1(target, 13071, 1);
gg.AddLog(6, target, 13071);
break;

}
case 17: {
myself.DeleteItem1(target, 13071, 1);
myself.GiveItem1(target, 15541, 1);
gg.AddLog(6, target, 15541);
break;

}
case 18: {
myself.DeleteItem1(target, 15541, 1);
myself.GiveItem1(target, 15826, 1);
gg.AddLog(6, target, 15826);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, target.name, gg.IntToStr(11), "", "", ""));

} else if (35003 == 35003) {
switch (11) {
case 11: {
myself.DeleteItem1(target, 4650, 1);
myself.GiveItem1(target, 5578, 1);
gg.AddLog(6, target, 5578);
break;

}
case 12: {
myself.DeleteItem1(target, 5578, 1);
myself.GiveItem1(target, 5581, 1);
gg.AddLog(6, target, 5581);
break;

}
case 13: {
myself.DeleteItem1(target, 5581, 1);
myself.GiveItem1(target, 5911, 1);
gg.AddLog(6, target, 5911);
break;

}
case 14: {
myself.DeleteItem1(target, 5911, 1);
myself.GiveItem1(target, 9572, 1);
gg.AddLog(6, target, 9572);
break;

}
case 15: {
myself.DeleteItem1(target, 9572, 1);
myself.GiveItem1(target, 10482, 1);
gg.AddLog(6, target, 10482);
break;

}
case 16: {
myself.DeleteItem1(target, 10482, 1);
myself.GiveItem1(target, 13073, 1);
gg.AddLog(6, target, 13073);
break;

}
case 17: {
myself.DeleteItem1(target, 13073, 1);
myself.GiveItem1(target, 15543, 1);
gg.AddLog(6, target, 15543);
break;

}
case 18: {
myself.DeleteItem1(target, 15543, 1);
myself.GiveItem1(target, 15828, 1);
gg.AddLog(6, target, 15828);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, target.name, gg.IntToStr(11), "", "", ""));

}

} else {
myself.ShowSystemMessage(target, 975);

}

} else if (gg.OwnItemCount(target, 5578) == 1) {
if (3 == 100 || gg.Rand(100) < 3) {
if (35003 == 35001) {
switch (12) {
case 11: {
myself.DeleteItem1(target, 4661, 1);
myself.GiveItem1(target, 5579, 1);
gg.AddLog(6, target, 5579);
break;

}
case 12: {
myself.DeleteItem1(target, 5579, 1);
myself.GiveItem1(target, 5582, 1);
gg.AddLog(6, target, 5582);
break;

}
case 13: {
myself.DeleteItem1(target, 5582, 1);
myself.GiveItem1(target, 5914, 1);
gg.AddLog(6, target, 5914);
break;

}
case 14: {
myself.DeleteItem1(target, 5914, 1);
myself.GiveItem1(target, 9571, 1);
gg.AddLog(6, target, 9571);
break;

}
case 15: {
myself.DeleteItem1(target, 9571, 1);
myself.GiveItem1(target, 10481, 1);
gg.AddLog(6, target, 10481);
break;

}
case 16: {
myself.DeleteItem1(target, 10481, 1);
myself.GiveItem1(target, 13072, 1);
gg.AddLog(6, target, 13072);
break;

}
case 17: {
myself.DeleteItem1(target, 13072, 1);
myself.GiveItem1(target, 15542, 1);
gg.AddLog(6, target, 15542);
break;

}
case 18: {
myself.DeleteItem1(target, 15542, 1);
myself.GiveItem1(target, 15827, 1);
gg.AddLog(6, target, 15827);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, target.name, gg.IntToStr(12), "", "", ""));

} else if (35003 == 35002) {
switch (12) {
case 11: {
myself.DeleteItem1(target, 4639, 1);
myself.GiveItem1(target, 5577, 1);
gg.AddLog(6, target, 5577);
break;

}
case 12: {
myself.DeleteItem1(target, 5577, 1);
myself.GiveItem1(target, 5580, 1);
gg.AddLog(6, target, 5580);
break;

}
case 13: {
myself.DeleteItem1(target, 5580, 1);
myself.GiveItem1(target, 5908, 1);
gg.AddLog(6, target, 5908);
break;

}
case 14: {
myself.DeleteItem1(target, 5908, 1);
myself.GiveItem1(target, 9570, 1);
gg.AddLog(6, target, 9570);
break;

}
case 15: {
myself.DeleteItem1(target, 9570, 1);
myself.GiveItem1(target, 10480, 1);
gg.AddLog(6, target, 10480);
break;

}
case 16: {
myself.DeleteItem1(target, 10480, 1);
myself.GiveItem1(target, 13071, 1);
gg.AddLog(6, target, 13071);
break;

}
case 17: {
myself.DeleteItem1(target, 13071, 1);
myself.GiveItem1(target, 15541, 1);
gg.AddLog(6, target, 15541);
break;

}
case 18: {
myself.DeleteItem1(target, 15541, 1);
myself.GiveItem1(target, 15826, 1);
gg.AddLog(6, target, 15826);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, target.name, gg.IntToStr(12), "", "", ""));

} else if (35003 == 35003) {
switch (12) {
case 11: {
myself.DeleteItem1(target, 4650, 1);
myself.GiveItem1(target, 5578, 1);
gg.AddLog(6, target, 5578);
break;

}
case 12: {
myself.DeleteItem1(target, 5578, 1);
myself.GiveItem1(target, 5581, 1);
gg.AddLog(6, target, 5581);
break;

}
case 13: {
myself.DeleteItem1(target, 5581, 1);
myself.GiveItem1(target, 5911, 1);
gg.AddLog(6, target, 5911);
break;

}
case 14: {
myself.DeleteItem1(target, 5911, 1);
myself.GiveItem1(target, 9572, 1);
gg.AddLog(6, target, 9572);
break;

}
case 15: {
myself.DeleteItem1(target, 9572, 1);
myself.GiveItem1(target, 10482, 1);
gg.AddLog(6, target, 10482);
break;

}
case 16: {
myself.DeleteItem1(target, 10482, 1);
myself.GiveItem1(target, 13073, 1);
gg.AddLog(6, target, 13073);
break;

}
case 17: {
myself.DeleteItem1(target, 13073, 1);
myself.GiveItem1(target, 15543, 1);
gg.AddLog(6, target, 15543);
break;

}
case 18: {
myself.DeleteItem1(target, 15543, 1);
myself.GiveItem1(target, 15828, 1);
gg.AddLog(6, target, 15828);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, target.name, gg.IntToStr(12), "", "", ""));

}

} else {
myself.ShowSystemMessage(target, 975);

}

} else if (gg.OwnItemCount(target, 5581) == 1) {
if (3 == 100 || gg.Rand(100) < 3) {
if (35003 == 35001) {
switch (13) {
case 11: {
myself.DeleteItem1(target, 4661, 1);
myself.GiveItem1(target, 5579, 1);
gg.AddLog(6, target, 5579);
break;

}
case 12: {
myself.DeleteItem1(target, 5579, 1);
myself.GiveItem1(target, 5582, 1);
gg.AddLog(6, target, 5582);
break;

}
case 13: {
myself.DeleteItem1(target, 5582, 1);
myself.GiveItem1(target, 5914, 1);
gg.AddLog(6, target, 5914);
break;

}
case 14: {
myself.DeleteItem1(target, 5914, 1);
myself.GiveItem1(target, 9571, 1);
gg.AddLog(6, target, 9571);
break;

}
case 15: {
myself.DeleteItem1(target, 9571, 1);
myself.GiveItem1(target, 10481, 1);
gg.AddLog(6, target, 10481);
break;

}
case 16: {
myself.DeleteItem1(target, 10481, 1);
myself.GiveItem1(target, 13072, 1);
gg.AddLog(6, target, 13072);
break;

}
case 17: {
myself.DeleteItem1(target, 13072, 1);
myself.GiveItem1(target, 15542, 1);
gg.AddLog(6, target, 15542);
break;

}
case 18: {
myself.DeleteItem1(target, 15542, 1);
myself.GiveItem1(target, 15827, 1);
gg.AddLog(6, target, 15827);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, target.name, gg.IntToStr(13), "", "", ""));

} else if (35003 == 35002) {
switch (13) {
case 11: {
myself.DeleteItem1(target, 4639, 1);
myself.GiveItem1(target, 5577, 1);
gg.AddLog(6, target, 5577);
break;

}
case 12: {
myself.DeleteItem1(target, 5577, 1);
myself.GiveItem1(target, 5580, 1);
gg.AddLog(6, target, 5580);
break;

}
case 13: {
myself.DeleteItem1(target, 5580, 1);
myself.GiveItem1(target, 5908, 1);
gg.AddLog(6, target, 5908);
break;

}
case 14: {
myself.DeleteItem1(target, 5908, 1);
myself.GiveItem1(target, 9570, 1);
gg.AddLog(6, target, 9570);
break;

}
case 15: {
myself.DeleteItem1(target, 9570, 1);
myself.GiveItem1(target, 10480, 1);
gg.AddLog(6, target, 10480);
break;

}
case 16: {
myself.DeleteItem1(target, 10480, 1);
myself.GiveItem1(target, 13071, 1);
gg.AddLog(6, target, 13071);
break;

}
case 17: {
myself.DeleteItem1(target, 13071, 1);
myself.GiveItem1(target, 15541, 1);
gg.AddLog(6, target, 15541);
break;

}
case 18: {
myself.DeleteItem1(target, 15541, 1);
myself.GiveItem1(target, 15826, 1);
gg.AddLog(6, target, 15826);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, target.name, gg.IntToStr(13), "", "", ""));

} else if (35003 == 35003) {
switch (13) {
case 11: {
myself.DeleteItem1(target, 4650, 1);
myself.GiveItem1(target, 5578, 1);
gg.AddLog(6, target, 5578);
break;

}
case 12: {
myself.DeleteItem1(target, 5578, 1);
myself.GiveItem1(target, 5581, 1);
gg.AddLog(6, target, 5581);
break;

}
case 13: {
myself.DeleteItem1(target, 5581, 1);
myself.GiveItem1(target, 5911, 1);
gg.AddLog(6, target, 5911);
break;

}
case 14: {
myself.DeleteItem1(target, 5911, 1);
myself.GiveItem1(target, 9572, 1);
gg.AddLog(6, target, 9572);
break;

}
case 15: {
myself.DeleteItem1(target, 9572, 1);
myself.GiveItem1(target, 10482, 1);
gg.AddLog(6, target, 10482);
break;

}
case 16: {
myself.DeleteItem1(target, 10482, 1);
myself.GiveItem1(target, 13073, 1);
gg.AddLog(6, target, 13073);
break;

}
case 17: {
myself.DeleteItem1(target, 13073, 1);
myself.GiveItem1(target, 15543, 1);
gg.AddLog(6, target, 15543);
break;

}
case 18: {
myself.DeleteItem1(target, 15543, 1);
myself.GiveItem1(target, 15828, 1);
gg.AddLog(6, target, 15828);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, target.name, gg.IntToStr(13), "", "", ""));

}

} else {
myself.ShowSystemMessage(target, 975);

}

} else if (gg.OwnItemCount(target, 5911) == 1) {
if (3 == 100 || gg.Rand(100) < 3) {
if (35003 == 35001) {
switch (14) {
case 11: {
myself.DeleteItem1(target, 4661, 1);
myself.GiveItem1(target, 5579, 1);
gg.AddLog(6, target, 5579);
break;

}
case 12: {
myself.DeleteItem1(target, 5579, 1);
myself.GiveItem1(target, 5582, 1);
gg.AddLog(6, target, 5582);
break;

}
case 13: {
myself.DeleteItem1(target, 5582, 1);
myself.GiveItem1(target, 5914, 1);
gg.AddLog(6, target, 5914);
break;

}
case 14: {
myself.DeleteItem1(target, 5914, 1);
myself.GiveItem1(target, 9571, 1);
gg.AddLog(6, target, 9571);
break;

}
case 15: {
myself.DeleteItem1(target, 9571, 1);
myself.GiveItem1(target, 10481, 1);
gg.AddLog(6, target, 10481);
break;

}
case 16: {
myself.DeleteItem1(target, 10481, 1);
myself.GiveItem1(target, 13072, 1);
gg.AddLog(6, target, 13072);
break;

}
case 17: {
myself.DeleteItem1(target, 13072, 1);
myself.GiveItem1(target, 15542, 1);
gg.AddLog(6, target, 15542);
break;

}
case 18: {
myself.DeleteItem1(target, 15542, 1);
myself.GiveItem1(target, 15827, 1);
gg.AddLog(6, target, 15827);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35051, target.name, gg.IntToStr(14), "", "", ""));

} else if (35003 == 35002) {
switch (14) {
case 11: {
myself.DeleteItem1(target, 4639, 1);
myself.GiveItem1(target, 5577, 1);
gg.AddLog(6, target, 5577);
break;

}
case 12: {
myself.DeleteItem1(target, 5577, 1);
myself.GiveItem1(target, 5580, 1);
gg.AddLog(6, target, 5580);
break;

}
case 13: {
myself.DeleteItem1(target, 5580, 1);
myself.GiveItem1(target, 5908, 1);
gg.AddLog(6, target, 5908);
break;

}
case 14: {
myself.DeleteItem1(target, 5908, 1);
myself.GiveItem1(target, 9570, 1);
gg.AddLog(6, target, 9570);
break;

}
case 15: {
myself.DeleteItem1(target, 9570, 1);
myself.GiveItem1(target, 10480, 1);
gg.AddLog(6, target, 10480);
break;

}
case 16: {
myself.DeleteItem1(target, 10480, 1);
myself.GiveItem1(target, 13071, 1);
gg.AddLog(6, target, 13071);
break;

}
case 17: {
myself.DeleteItem1(target, 13071, 1);
myself.GiveItem1(target, 15541, 1);
gg.AddLog(6, target, 15541);
break;

}
case 18: {
myself.DeleteItem1(target, 15541, 1);
myself.GiveItem1(target, 15826, 1);
gg.AddLog(6, target, 15826);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35052, target.name, gg.IntToStr(14), "", "", ""));

} else if (35003 == 35003) {
switch (14) {
case 11: {
myself.DeleteItem1(target, 4650, 1);
myself.GiveItem1(target, 5578, 1);
gg.AddLog(6, target, 5578);
break;

}
case 12: {
myself.DeleteItem1(target, 5578, 1);
myself.GiveItem1(target, 5581, 1);
gg.AddLog(6, target, 5581);
break;

}
case 13: {
myself.DeleteItem1(target, 5581, 1);
myself.GiveItem1(target, 5911, 1);
gg.AddLog(6, target, 5911);
break;

}
case 14: {
myself.DeleteItem1(target, 5911, 1);
myself.GiveItem1(target, 9572, 1);
gg.AddLog(6, target, 9572);
break;

}
case 15: {
myself.DeleteItem1(target, 9572, 1);
myself.GiveItem1(target, 10482, 1);
gg.AddLog(6, target, 10482);
break;

}
case 16: {
myself.DeleteItem1(target, 10482, 1);
myself.GiveItem1(target, 13073, 1);
gg.AddLog(6, target, 13073);
break;

}
case 17: {
myself.DeleteItem1(target, 13073, 1);
myself.GiveItem1(target, 15543, 1);
gg.AddLog(6, target, 15543);
break;

}
case 18: {
myself.DeleteItem1(target, 15543, 1);
myself.GiveItem1(target, 15828, 1);
gg.AddLog(6, target, 15828);
break;

}

}
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);
myself.BroadcastSystemMessageStr(myself.sm, 1500, gg.MakeFString(35053, target.name, gg.IntToStr(14), "", "", ""));

}

} else {
myself.ShowSystemMessage(target, 975);

}

} else if (gg.OwnItemCount(target, 4651) + gg.OwnItemCount(target, 4652) + gg.OwnItemCount(target, 4653) + gg.OwnItemCount(target, 4654) + gg.OwnItemCount(target, 4655) + gg.OwnItemCount(target, 4656) + gg.OwnItemCount(target, 4657) + gg.OwnItemCount(target, 4658) + gg.OwnItemCount(target, 4659) + gg.OwnItemCount(target, 4660) + gg.OwnItemCount(target, 4629) + gg.OwnItemCount(target, 4630) + gg.OwnItemCount(target, 4631) + gg.OwnItemCount(target, 4632) + gg.OwnItemCount(target, 4633) + gg.OwnItemCount(target, 4634) + gg.OwnItemCount(target, 4635) + gg.OwnItemCount(target, 4636) + gg.OwnItemCount(target, 4637) + gg.OwnItemCount(target, 4638) + gg.OwnItemCount(target, 4637) + gg.OwnItemCount(target, 4638) + gg.OwnItemCount(target, 4640) + gg.OwnItemCount(target, 4641) + gg.OwnItemCount(target, 4642) + gg.OwnItemCount(target, 4643) + gg.OwnItemCount(target, 4644) + gg.OwnItemCount(target, 4645) + gg.OwnItemCount(target, 4646) + gg.OwnItemCount(target, 4647) + gg.OwnItemCount(target, 4648) + gg.OwnItemCount(target, 4649) > 0) {
myself.ShowSystemMessage(target, 1264);

} else {
myself.ShowSystemMessage(target, 978);

}

} else if (gg.OwnItemCount(target, 4651) + gg.OwnItemCount(target, 4652) + gg.OwnItemCount(target, 4653) + gg.OwnItemCount(target, 4654) + gg.OwnItemCount(target, 4655) + gg.OwnItemCount(target, 4656) + gg.OwnItemCount(target, 4657) + gg.OwnItemCount(target, 4658) + gg.OwnItemCount(target, 4659) + gg.OwnItemCount(target, 4660) + gg.OwnItemCount(target, 4661) + gg.OwnItemCount(target, 5579) + gg.OwnItemCount(target, 5582) + gg.OwnItemCount(target, 5914) + gg.OwnItemCount(target, 4629) + gg.OwnItemCount(target, 4630) + gg.OwnItemCount(target, 4631) + gg.OwnItemCount(target, 4632) + gg.OwnItemCount(target, 4633) + gg.OwnItemCount(target, 4634) + gg.OwnItemCount(target, 4635) + gg.OwnItemCount(target, 4636) + gg.OwnItemCount(target, 4637) + gg.OwnItemCount(target, 4638) + gg.OwnItemCount(target, 4639) + gg.OwnItemCount(target, 5577) + gg.OwnItemCount(target, 5580) + gg.OwnItemCount(target, 5908) + gg.OwnItemCount(target, 4640) + gg.OwnItemCount(target, 4641) + gg.OwnItemCount(target, 4642) + gg.OwnItemCount(target, 4643) + gg.OwnItemCount(target, 4644) + gg.OwnItemCount(target, 4645) + gg.OwnItemCount(target, 4646) + gg.OwnItemCount(target, 4647) + gg.OwnItemCount(target, 4648) + gg.OwnItemCount(target, 4649) + gg.OwnItemCount(target, 4650) + gg.OwnItemCount(target, 5578) + gg.OwnItemCount(target, 5581) + gg.OwnItemCount(target, 5911) + gg.OwnItemCount(target, 9571) + gg.OwnItemCount(target, 10161) + gg.OwnItemCount(target, 9570) + gg.OwnItemCount(target, 10160) + gg.OwnItemCount(target, 9572) + gg.OwnItemCount(target, 10162) + gg.OwnItemCount(target, 10481) + gg.OwnItemCount(target, 10482) + gg.OwnItemCount(target, 10480) + gg.OwnItemCount(target, 13072) + gg.OwnItemCount(target, 13073) + gg.OwnItemCount(target, 13071) + gg.OwnItemCount(target, 15542) + gg.OwnItemCount(target, 15543) + gg.OwnItemCount(target, 15541) >= 2) {
myself.ShowSystemMessage(target, 977);

} else {
myself.ShowSystemMessage(target, 1265);

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(715);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.Say(gg.MakeFString(71551, target.name, "", "", "", ""));
c0 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 715) == 1 && gg.GetMemoState(c0, 715) / 10 % 10 == 1) {
if (gg.GetMemoState(c0, 715) / 10 == 21) {
i0 = gg.GetMemoState(c0, 715);
myself.SetMemoState(c0, 715, i0 + 10);
myself.SetFlagJournal(c0, 715, 9);
myself.ShowQuestMark(c0, 715);
myself.SoundEffect(c0, "ItemSound.quest_middle");

} else if (gg.GetMemoState(c0, 715) / 10 == 1) {
i0 = gg.GetMemoState(c0, 715);
myself.SetMemoState(c0, 715, i0 + 10);
myself.SetFlagJournal(c0, 715, 5);
myself.ShowQuestMark(c0, 715);
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
case 2: {
myself.SetCurrentQuestID(610);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(610);
if (myself.sm.param2 == target.dbid) {
myself.GiveItem1(target, 7239, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 610, 3);
myself.ShowQuestMark(target, 610);
myself.SetMemoState(target, 610, 2 * 10 + 2);

} else if (gg.GetMemoState(target, 610) == 21) {
myself.GiveItem1(target, 7239, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 610, 3);
myself.ShowQuestMark(target, 610);
myself.SetMemoState(target, 610, 2 * 10 + 2);

} else if (gg.OwnItemCount(target, 7238) >= 1) {
myself.DeleteItem1(target, 7238, 1);
myself.GiveItem1(target, 7239, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 610, 3);
myself.ShowQuestMark(target, 610);
myself.SetMemoState(target, 610, 2 * 10 + 2);

}
npc0 = gg.GetNPCFromID(myself.sm.param1);
if (gg.IsNull(npc0) == 0) {
npc0.av_quest0.Exchange(0);

}

}

}
break;

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam i0, HandlerParam npc0, HandlerParam talker, HandlerParam timer_id) {
myself.SetCurrentQuestID(610);
if (timer_id == 610 * 100 + 1) {
myself.Say(gg.MakeFString(61051, "", "", "", "", ""));
npc0 = gg.GetNPCFromID(myself.sm.param1);
if (gg.IsNull(npc0) == 0) {
npc0.av_quest0.Exchange(0);

}
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0, HandlerParam i_quest0) {
myself.SetCurrentQuestID(610);
myself.AddTimerEx(AddTimerEx * 100 + 1, 1000 * 1200);
myself.Say(gg.MakeFString(61050, "", "", "", "", ""));
super;
	}


}