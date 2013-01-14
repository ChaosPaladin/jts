package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class r54_roomboss_clanbuff2 extends royal_rush_roomboss_4 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 619) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 619) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 619) == 1) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 620) == 1) {
always_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 620) == 1) {
always_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 620) == 1) {
always_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 70) == 1 && target.occupation == 5 && gg.GetMemoState(target, 70) == 12 && gg.OwnItemCount(target, 7392) == 0) {
always_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 70) == 1 && target.occupation == 5 && gg.GetMemoState(target, 70) == 12 && gg.OwnItemCount(target, 7392) == 0) {
always_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 70) == 1 && target.occupation == 5 && gg.GetMemoState(target, 70) == 12 && gg.OwnItemCount(target, 7392) == 0) {
always_list.SetInfo(2, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 71) == 1 && target.occupation == 20 && gg.GetMemoState(target, 71) == 12 && gg.OwnItemCount(target, 7393) == 0) {
always_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 71) == 1 && target.occupation == 20 && gg.GetMemoState(target, 71) == 12 && gg.OwnItemCount(target, 7393) == 0) {
always_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 71) == 1 && target.occupation == 20 && gg.GetMemoState(target, 71) == 12 && gg.OwnItemCount(target, 7393) == 0) {
always_list.SetInfo(3, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 72) == 1 && target.occupation == 21 && gg.GetMemoState(target, 72) == 12 && gg.OwnItemCount(target, 7394) == 0) {
always_list.SetInfo(4, target);

}
if (gg.HaveMemo(target, 72) == 1 && target.occupation == 21 && gg.GetMemoState(target, 72) == 12 && gg.OwnItemCount(target, 7394) == 0) {
always_list.SetInfo(4, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 72) == 1 && target.occupation == 21 && gg.GetMemoState(target, 72) == 12 && gg.OwnItemCount(target, 7394) == 0) {
always_list.SetInfo(4, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 73) == 1 && target.occupation == 2 && gg.GetMemoState(target, 73) == 12 && gg.OwnItemCount(target, 7395) == 0) {
always_list.SetInfo(5, target);

}
if (gg.HaveMemo(target, 73) == 1 && target.occupation == 2 && gg.GetMemoState(target, 73) == 12 && gg.OwnItemCount(target, 7395) == 0) {
always_list.SetInfo(5, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 73) == 1 && target.occupation == 2 && gg.GetMemoState(target, 73) == 12 && gg.OwnItemCount(target, 7395) == 0) {
always_list.SetInfo(5, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 74) == 1 && target.occupation == 3 && gg.GetMemoState(target, 74) == 12 && gg.OwnItemCount(target, 7396) == 0) {
always_list.SetInfo(6, target);

}
if (gg.HaveMemo(target, 74) == 1 && target.occupation == 3 && gg.GetMemoState(target, 74) == 12 && gg.OwnItemCount(target, 7396) == 0) {
always_list.SetInfo(6, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 74) == 1 && target.occupation == 3 && gg.GetMemoState(target, 74) == 12 && gg.OwnItemCount(target, 7396) == 0) {
always_list.SetInfo(6, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 75) == 1 && target.occupation == 46 && gg.GetMemoState(target, 75) == 12 && gg.OwnItemCount(target, 7397) == 0) {
always_list.SetInfo(7, target);

}
if (gg.HaveMemo(target, 75) == 1 && target.occupation == 46 && gg.GetMemoState(target, 75) == 12 && gg.OwnItemCount(target, 7397) == 0) {
always_list.SetInfo(7, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 75) == 1 && target.occupation == 46 && gg.GetMemoState(target, 75) == 12 && gg.OwnItemCount(target, 7397) == 0) {
always_list.SetInfo(7, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 76) == 1 && target.occupation == 48 && gg.GetMemoState(target, 76) == 12 && gg.OwnItemCount(target, 7398) == 0) {
always_list.SetInfo(8, target);

}
if (gg.HaveMemo(target, 76) == 1 && target.occupation == 48 && gg.GetMemoState(target, 76) == 12 && gg.OwnItemCount(target, 7398) == 0) {
always_list.SetInfo(8, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 76) == 1 && target.occupation == 48 && gg.GetMemoState(target, 76) == 12 && gg.OwnItemCount(target, 7398) == 0) {
always_list.SetInfo(8, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 77) == 1 && target.occupation == 51 && gg.GetMemoState(target, 77) == 12 && gg.OwnItemCount(target, 7399) == 0) {
always_list.SetInfo(9, target);

}
if (gg.HaveMemo(target, 77) == 1 && target.occupation == 51 && gg.GetMemoState(target, 77) == 12 && gg.OwnItemCount(target, 7399) == 0) {
always_list.SetInfo(9, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 77) == 1 && target.occupation == 51 && gg.GetMemoState(target, 77) == 12 && gg.OwnItemCount(target, 7399) == 0) {
always_list.SetInfo(9, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 78) == 1 && target.occupation == 52 && gg.GetMemoState(target, 78) == 12 && gg.OwnItemCount(target, 7400) == 0) {
always_list.SetInfo(10, target);

}
if (gg.HaveMemo(target, 78) == 1 && target.occupation == 52 && gg.GetMemoState(target, 78) == 12 && gg.OwnItemCount(target, 7400) == 0) {
always_list.SetInfo(10, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 78) == 1 && target.occupation == 52 && gg.GetMemoState(target, 78) == 12 && gg.OwnItemCount(target, 7400) == 0) {
always_list.SetInfo(10, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 79) == 1 && target.occupation == 8 && gg.GetMemoState(target, 79) == 12 && gg.OwnItemCount(target, 7401) == 0) {
always_list.SetInfo(11, target);

}
if (gg.HaveMemo(target, 79) == 1 && target.occupation == 8 && gg.GetMemoState(target, 79) == 12 && gg.OwnItemCount(target, 7401) == 0) {
always_list.SetInfo(11, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 79) == 1 && target.occupation == 8 && gg.GetMemoState(target, 79) == 12 && gg.OwnItemCount(target, 7401) == 0) {
always_list.SetInfo(11, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 80) == 1 && target.occupation == 23 && gg.GetMemoState(target, 80) == 12 && gg.OwnItemCount(target, 7402) == 0) {
always_list.SetInfo(12, target);

}
if (gg.HaveMemo(target, 80) == 1 && target.occupation == 23 && gg.GetMemoState(target, 80) == 12 && gg.OwnItemCount(target, 7402) == 0) {
always_list.SetInfo(12, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 80) == 1 && target.occupation == 23 && gg.GetMemoState(target, 80) == 12 && gg.OwnItemCount(target, 7402) == 0) {
always_list.SetInfo(12, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 81) == 1 && target.occupation == 36 && gg.GetMemoState(target, 81) == 12 && gg.OwnItemCount(target, 7403) == 0) {
always_list.SetInfo(13, target);

}
if (gg.HaveMemo(target, 81) == 1 && target.occupation == 36 && gg.GetMemoState(target, 81) == 12 && gg.OwnItemCount(target, 7403) == 0) {
always_list.SetInfo(13, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 81) == 1 && target.occupation == 36 && gg.GetMemoState(target, 81) == 12 && gg.OwnItemCount(target, 7403) == 0) {
always_list.SetInfo(13, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 82) == 1 && target.occupation == 9 && gg.GetMemoState(target, 82) == 12 && gg.OwnItemCount(target, 7404) == 0) {
always_list.SetInfo(14, target);

}
if (gg.HaveMemo(target, 82) == 1 && target.occupation == 9 && gg.GetMemoState(target, 82) == 12 && gg.OwnItemCount(target, 7404) == 0) {
always_list.SetInfo(14, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 82) == 1 && target.occupation == 9 && gg.GetMemoState(target, 82) == 12 && gg.OwnItemCount(target, 7404) == 0) {
always_list.SetInfo(14, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 83) == 1 && target.occupation == 24 && gg.GetMemoState(target, 83) == 12 && gg.OwnItemCount(target, 7405) == 0) {
always_list.SetInfo(15, target);

}
if (gg.HaveMemo(target, 83) == 1 && target.occupation == 24 && gg.GetMemoState(target, 83) == 12 && gg.OwnItemCount(target, 7405) == 0) {
always_list.SetInfo(15, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 83) == 1 && target.occupation == 24 && gg.GetMemoState(target, 83) == 12 && gg.OwnItemCount(target, 7405) == 0) {
always_list.SetInfo(15, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 84) == 1 && target.occupation == 37 && gg.GetMemoState(target, 84) == 12 && gg.OwnItemCount(target, 7406) == 0) {
always_list.SetInfo(16, target);

}
if (gg.HaveMemo(target, 84) == 1 && target.occupation == 37 && gg.GetMemoState(target, 84) == 12 && gg.OwnItemCount(target, 7406) == 0) {
always_list.SetInfo(16, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 84) == 1 && target.occupation == 37 && gg.GetMemoState(target, 84) == 12 && gg.OwnItemCount(target, 7406) == 0) {
always_list.SetInfo(16, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 85) == 1 && target.occupation == 16 && gg.GetMemoState(target, 85) == 12 && gg.OwnItemCount(target, 7407) == 0) {
always_list.SetInfo(17, target);

}
if (gg.HaveMemo(target, 85) == 1 && target.occupation == 16 && gg.GetMemoState(target, 85) == 12 && gg.OwnItemCount(target, 7407) == 0) {
always_list.SetInfo(17, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 85) == 1 && target.occupation == 16 && gg.GetMemoState(target, 85) == 12 && gg.OwnItemCount(target, 7407) == 0) {
always_list.SetInfo(17, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 86) == 1 && target.occupation == 17 && gg.GetMemoState(target, 86) == 12 && gg.OwnItemCount(target, 7408) == 0) {
always_list.SetInfo(18, target);

}
if (gg.HaveMemo(target, 86) == 1 && target.occupation == 17 && gg.GetMemoState(target, 86) == 12 && gg.OwnItemCount(target, 7408) == 0) {
always_list.SetInfo(18, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 86) == 1 && target.occupation == 17 && gg.GetMemoState(target, 86) == 12 && gg.OwnItemCount(target, 7408) == 0) {
always_list.SetInfo(18, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 87) == 1 && target.occupation == 30 && gg.GetMemoState(target, 87) == 12 && gg.OwnItemCount(target, 7409) == 0) {
always_list.SetInfo(19, target);

}
if (gg.HaveMemo(target, 87) == 1 && target.occupation == 30 && gg.GetMemoState(target, 87) == 12 && gg.OwnItemCount(target, 7409) == 0) {
always_list.SetInfo(19, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 87) == 1 && target.occupation == 30 && gg.GetMemoState(target, 87) == 12 && gg.OwnItemCount(target, 7409) == 0) {
always_list.SetInfo(19, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 88) == 1 && target.occupation == 12 && gg.GetMemoState(target, 88) == 12 && gg.OwnItemCount(target, 7410) == 0) {
always_list.SetInfo(20, target);

}
if (gg.HaveMemo(target, 88) == 1 && target.occupation == 12 && gg.GetMemoState(target, 88) == 12 && gg.OwnItemCount(target, 7410) == 0) {
always_list.SetInfo(20, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 88) == 1 && target.occupation == 12 && gg.GetMemoState(target, 88) == 12 && gg.OwnItemCount(target, 7410) == 0) {
always_list.SetInfo(20, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 89) == 1 && target.occupation == 27 && gg.GetMemoState(target, 89) == 12 && gg.OwnItemCount(target, 7411) == 0) {
always_list.SetInfo(21, target);

}
if (gg.HaveMemo(target, 89) == 1 && target.occupation == 27 && gg.GetMemoState(target, 89) == 12 && gg.OwnItemCount(target, 7411) == 0) {
always_list.SetInfo(21, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 89) == 1 && target.occupation == 27 && gg.GetMemoState(target, 89) == 12 && gg.OwnItemCount(target, 7411) == 0) {
always_list.SetInfo(21, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 90) == 1 && target.occupation == 40 && gg.GetMemoState(target, 90) == 12 && gg.OwnItemCount(target, 7412) == 0) {
always_list.SetInfo(22, target);

}
if (gg.HaveMemo(target, 90) == 1 && target.occupation == 40 && gg.GetMemoState(target, 90) == 12 && gg.OwnItemCount(target, 7412) == 0) {
always_list.SetInfo(22, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 90) == 1 && target.occupation == 40 && gg.GetMemoState(target, 90) == 12 && gg.OwnItemCount(target, 7412) == 0) {
always_list.SetInfo(22, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 91) == 1 && target.occupation == 14 && gg.GetMemoState(target, 91) == 12 && gg.OwnItemCount(target, 7413) == 0) {
always_list.SetInfo(23, target);

}
if (gg.HaveMemo(target, 91) == 1 && target.occupation == 14 && gg.GetMemoState(target, 91) == 12 && gg.OwnItemCount(target, 7413) == 0) {
always_list.SetInfo(23, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 91) == 1 && target.occupation == 14 && gg.GetMemoState(target, 91) == 12 && gg.OwnItemCount(target, 7413) == 0) {
always_list.SetInfo(23, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 92) == 1 && target.occupation == 28 && gg.GetMemoState(target, 92) == 12 && gg.OwnItemCount(target, 7414) == 0) {
always_list.SetInfo(24, target);

}
if (gg.HaveMemo(target, 92) == 1 && target.occupation == 28 && gg.GetMemoState(target, 92) == 12 && gg.OwnItemCount(target, 7414) == 0) {
always_list.SetInfo(24, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 92) == 1 && target.occupation == 28 && gg.GetMemoState(target, 92) == 12 && gg.OwnItemCount(target, 7414) == 0) {
always_list.SetInfo(24, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 93) == 1 && target.occupation == 41 && gg.GetMemoState(target, 93) == 12 && gg.OwnItemCount(target, 7415) == 0) {
always_list.SetInfo(25, target);

}
if (gg.HaveMemo(target, 93) == 1 && target.occupation == 41 && gg.GetMemoState(target, 93) == 12 && gg.OwnItemCount(target, 7415) == 0) {
always_list.SetInfo(25, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 93) == 1 && target.occupation == 41 && gg.GetMemoState(target, 93) == 12 && gg.OwnItemCount(target, 7415) == 0) {
always_list.SetInfo(25, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 94) == 1 && target.occupation == 13 && gg.GetMemoState(target, 94) == 12 && gg.OwnItemCount(target, 7416) == 0) {
always_list.SetInfo(26, target);

}
if (gg.HaveMemo(target, 94) == 1 && target.occupation == 13 && gg.GetMemoState(target, 94) == 12 && gg.OwnItemCount(target, 7416) == 0) {
always_list.SetInfo(26, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 94) == 1 && target.occupation == 13 && gg.GetMemoState(target, 94) == 12 && gg.OwnItemCount(target, 7416) == 0) {
always_list.SetInfo(26, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 95) == 1 && target.occupation == 6 && gg.GetMemoState(target, 95) == 12 && gg.OwnItemCount(target, 7417) == 0) {
always_list.SetInfo(27, target);

}
if (gg.HaveMemo(target, 95) == 1 && target.occupation == 6 && gg.GetMemoState(target, 95) == 12 && gg.OwnItemCount(target, 7417) == 0) {
always_list.SetInfo(27, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 95) == 1 && target.occupation == 6 && gg.GetMemoState(target, 95) == 12 && gg.OwnItemCount(target, 7417) == 0) {
always_list.SetInfo(27, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 96) == 1 && target.occupation == 34 && gg.GetMemoState(target, 96) == 12 && gg.OwnItemCount(target, 7418) == 0) {
always_list.SetInfo(28, target);

}
if (gg.HaveMemo(target, 96) == 1 && target.occupation == 34 && gg.GetMemoState(target, 96) == 12 && gg.OwnItemCount(target, 7418) == 0) {
always_list.SetInfo(28, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 96) == 1 && target.occupation == 34 && gg.GetMemoState(target, 96) == 12 && gg.OwnItemCount(target, 7418) == 0) {
always_list.SetInfo(28, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 97) == 1 && target.occupation == 33 && gg.GetMemoState(target, 97) == 12 && gg.OwnItemCount(target, 7419) == 0) {
always_list.SetInfo(29, target);

}
if (gg.HaveMemo(target, 97) == 1 && target.occupation == 33 && gg.GetMemoState(target, 97) == 12 && gg.OwnItemCount(target, 7419) == 0) {
always_list.SetInfo(29, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 97) == 1 && target.occupation == 33 && gg.GetMemoState(target, 97) == 12 && gg.OwnItemCount(target, 7419) == 0) {
always_list.SetInfo(29, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 98) == 1 && target.occupation == 43 && gg.GetMemoState(target, 98) == 12 && gg.OwnItemCount(target, 7420) == 0) {
always_list.SetInfo(30, target);

}
if (gg.HaveMemo(target, 98) == 1 && target.occupation == 43 && gg.GetMemoState(target, 98) == 12 && gg.OwnItemCount(target, 7420) == 0) {
always_list.SetInfo(30, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 98) == 1 && target.occupation == 43 && gg.GetMemoState(target, 98) == 12 && gg.OwnItemCount(target, 7420) == 0) {
always_list.SetInfo(30, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 99) == 1 && target.occupation == 55 && gg.GetMemoState(target, 99) == 12 && gg.OwnItemCount(target, 7421) == 0) {
always_list.SetInfo(31, target);

}
if (gg.HaveMemo(target, 99) == 1 && target.occupation == 55 && gg.GetMemoState(target, 99) == 12 && gg.OwnItemCount(target, 7421) == 0) {
always_list.SetInfo(31, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 99) == 1 && target.occupation == 55 && gg.GetMemoState(target, 99) == 12 && gg.OwnItemCount(target, 7421) == 0) {
always_list.SetInfo(31, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 100) == 1 && target.occupation == 57 && gg.GetMemoState(target, 100) == 12 && gg.OwnItemCount(target, 7422) == 0) {
always_list.SetInfo(32, target);

}
if (gg.HaveMemo(target, 100) == 1 && target.occupation == 57 && gg.GetMemoState(target, 100) == 12 && gg.OwnItemCount(target, 7422) == 0) {
always_list.SetInfo(32, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 100) == 1 && target.occupation == 57 && gg.GetMemoState(target, 100) == 12 && gg.OwnItemCount(target, 7422) == 0) {
always_list.SetInfo(32, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 67) == 1 && target.occupation == 127 && gg.GetMemoState(target, 67) == 12 && gg.OwnItemCount(target, 9734) == 0) {
always_list.SetInfo(33, target);

}
if (gg.HaveMemo(target, 67) == 1 && target.occupation == 127 && gg.GetMemoState(target, 67) == 12 && gg.OwnItemCount(target, 9734) == 0) {
always_list.SetInfo(33, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 67) == 1 && target.occupation == 127 && gg.GetMemoState(target, 67) == 12 && gg.OwnItemCount(target, 9734) == 0) {
always_list.SetInfo(33, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 69) == 1 && target.occupation == 130 && gg.GetMemoState(target, 69) == 12 && gg.OwnItemCount(target, 9736) == 0) {
always_list.SetInfo(34, target);

}
if (gg.HaveMemo(target, 69) == 1 && target.occupation == 130 && gg.GetMemoState(target, 69) == 12 && gg.OwnItemCount(target, 9736) == 0) {
always_list.SetInfo(34, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 69) == 1 && target.occupation == 130 && gg.GetMemoState(target, 69) == 12 && gg.OwnItemCount(target, 9736) == 0) {
always_list.SetInfo(34, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 68) == 1 && target.occupation == 128 || target.occupation == 129 && gg.GetMemoState(target, 68) == 12 && gg.OwnItemCount(target, 9735) == 0) {
always_list.SetInfo(35, target);

}
if (gg.HaveMemo(target, 68) == 1 && target.occupation == 128 || target.occupation == 129 && gg.GetMemoState(target, 68) == 12 && gg.OwnItemCount(target, 9735) == 0) {
always_list.SetInfo(35, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 68) == 1 && target.occupation == 128 || target.occupation == 129 && gg.GetMemoState(target, 68) == 12 && gg.OwnItemCount(target, 9735) == 0) {
always_list.SetInfo(35, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(620);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 50) {
myself.GiveItem1(target, 7255, 5);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else {
myself.GiveItem1(target, 7255, 4);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(70);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(70);
myself.GiveItem1(target, 7392, 1);
myself.SetFlagJournal(target, 70, 16);
myself.ShowQuestMark(target, 70);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7485, gg.OwnItemCount(target, 7485));

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(71);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(71);
myself.GiveItem1(target, 7393, 1);
myself.SetFlagJournal(target, 71, 16);
myself.ShowQuestMark(target, 71);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7486, gg.OwnItemCount(target, 7486));

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(72);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(72);
myself.GiveItem1(target, 7394, 1);
myself.SetFlagJournal(target, 72, 16);
myself.ShowQuestMark(target, 72);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7487, gg.OwnItemCount(target, 7487));

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(73);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(73);
myself.GiveItem1(target, 7395, 1);
myself.SetFlagJournal(target, 73, 16);
myself.ShowQuestMark(target, 73);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7488, gg.OwnItemCount(target, 7488));

}

}
break;

}
case 6: {
myself.SetCurrentQuestID(74);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(74);
myself.GiveItem1(target, 7396, 1);
myself.SetFlagJournal(target, 74, 16);
myself.ShowQuestMark(target, 74);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7489, gg.OwnItemCount(target, 7489));

}

}
break;

}
case 7: {
myself.SetCurrentQuestID(75);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(75);
myself.GiveItem1(target, 7397, 1);
myself.SetFlagJournal(target, 75, 16);
myself.ShowQuestMark(target, 75);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7490, gg.OwnItemCount(target, 7490));

}

}
break;

}
case 8: {
myself.SetCurrentQuestID(76);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(76);
myself.GiveItem1(target, 7398, 1);
myself.SetFlagJournal(target, 76, 16);
myself.ShowQuestMark(target, 76);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7491, gg.OwnItemCount(target, 7491));

}

}
break;

}
case 9: {
myself.SetCurrentQuestID(77);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(77);
myself.GiveItem1(target, 7399, 1);
myself.SetFlagJournal(target, 77, 16);
myself.ShowQuestMark(target, 77);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7492, gg.OwnItemCount(target, 7492));

}

}
break;

}
case 10: {
myself.SetCurrentQuestID(78);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(78);
myself.GiveItem1(target, 7400, 1);
myself.SetFlagJournal(target, 78, 16);
myself.ShowQuestMark(target, 78);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7493, gg.OwnItemCount(target, 7493));

}

}
break;

}
case 11: {
myself.SetCurrentQuestID(79);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(79);
myself.GiveItem1(target, 7401, 1);
myself.SetFlagJournal(target, 79, 16);
myself.ShowQuestMark(target, 79);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7494, gg.OwnItemCount(target, 7494));

}

}
break;

}
case 12: {
myself.SetCurrentQuestID(80);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(80);
myself.GiveItem1(target, 7402, 1);
myself.SetFlagJournal(target, 80, 16);
myself.ShowQuestMark(target, 80);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7495, gg.OwnItemCount(target, 7495));

}

}
break;

}
case 13: {
myself.SetCurrentQuestID(81);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(81);
myself.GiveItem1(target, 7403, 1);
myself.SetFlagJournal(target, 81, 16);
myself.ShowQuestMark(target, 81);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7496, gg.OwnItemCount(target, 7496));

}

}
break;

}
case 14: {
myself.SetCurrentQuestID(82);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(82);
myself.GiveItem1(target, 7404, 1);
myself.SetFlagJournal(target, 82, 16);
myself.ShowQuestMark(target, 82);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7497, gg.OwnItemCount(target, 7497));

}

}
break;

}
case 15: {
myself.SetCurrentQuestID(83);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(83);
myself.GiveItem1(target, 7405, 1);
myself.SetFlagJournal(target, 83, 16);
myself.ShowQuestMark(target, 83);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7498, gg.OwnItemCount(target, 7498));

}

}
break;

}
case 16: {
myself.SetCurrentQuestID(84);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(84);
myself.GiveItem1(target, 7406, 1);
myself.SetFlagJournal(target, 84, 16);
myself.ShowQuestMark(target, 84);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7499, gg.OwnItemCount(target, 7499));

}

}
break;

}
case 17: {
myself.SetCurrentQuestID(85);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(85);
myself.GiveItem1(target, 7407, 1);
myself.SetFlagJournal(target, 85, 16);
myself.ShowQuestMark(target, 85);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7500, gg.OwnItemCount(target, 7500));

}

}
break;

}
case 18: {
myself.SetCurrentQuestID(86);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(86);
myself.GiveItem1(target, 7408, 1);
myself.SetFlagJournal(target, 86, 16);
myself.ShowQuestMark(target, 86);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7501, gg.OwnItemCount(target, 7501));

}

}
break;

}
case 19: {
myself.SetCurrentQuestID(87);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(87);
myself.GiveItem1(target, 7409, 1);
myself.SetFlagJournal(target, 87, 16);
myself.ShowQuestMark(target, 87);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7502, gg.OwnItemCount(target, 7502));

}

}
break;

}
case 20: {
myself.SetCurrentQuestID(88);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(88);
myself.GiveItem1(target, 7410, 1);
myself.SetFlagJournal(target, 88, 16);
myself.ShowQuestMark(target, 88);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7503, gg.OwnItemCount(target, 7503));

}

}
break;

}
case 21: {
myself.SetCurrentQuestID(89);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(89);
myself.GiveItem1(target, 7411, 1);
myself.SetFlagJournal(target, 89, 16);
myself.ShowQuestMark(target, 89);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7504, gg.OwnItemCount(target, 7504));

}

}
break;

}
case 22: {
myself.SetCurrentQuestID(90);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(90);
myself.GiveItem1(target, 7412, 1);
myself.SetFlagJournal(target, 90, 16);
myself.ShowQuestMark(target, 90);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7505, gg.OwnItemCount(target, 7505));

}

}
break;

}
case 23: {
myself.SetCurrentQuestID(91);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(91);
myself.GiveItem1(target, 7413, 1);
myself.SetFlagJournal(target, 91, 16);
myself.ShowQuestMark(target, 91);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7506, gg.OwnItemCount(target, 7506));

}

}
break;

}
case 24: {
myself.SetCurrentQuestID(92);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(92);
myself.GiveItem1(target, 7414, 1);
myself.SetFlagJournal(target, 92, 16);
myself.ShowQuestMark(target, 92);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7507, gg.OwnItemCount(target, 7507));

}

}
break;

}
case 25: {
myself.SetCurrentQuestID(93);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(93);
myself.GiveItem1(target, 7415, 1);
myself.SetFlagJournal(target, 93, 16);
myself.ShowQuestMark(target, 93);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7508, gg.OwnItemCount(target, 7508));

}

}
break;

}
case 26: {
myself.SetCurrentQuestID(94);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(94);
myself.GiveItem1(target, 7416, 1);
myself.SetFlagJournal(target, 94, 16);
myself.ShowQuestMark(target, 94);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7509, gg.OwnItemCount(target, 7509));

}

}
break;

}
case 27: {
myself.SetCurrentQuestID(95);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(95);
myself.GiveItem1(target, 7417, 1);
myself.SetFlagJournal(target, 95, 16);
myself.ShowQuestMark(target, 95);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7510, gg.OwnItemCount(target, 7510));

}

}
break;

}
case 28: {
myself.SetCurrentQuestID(96);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(96);
myself.GiveItem1(target, 7418, 1);
myself.SetFlagJournal(target, 96, 16);
myself.ShowQuestMark(target, 96);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7511, gg.OwnItemCount(target, 7511));

}

}
break;

}
case 29: {
myself.SetCurrentQuestID(97);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(97);
myself.GiveItem1(target, 7419, 1);
myself.SetFlagJournal(target, 97, 16);
myself.ShowQuestMark(target, 97);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7512, gg.OwnItemCount(target, 7512));

}

}
break;

}
case 30: {
myself.SetCurrentQuestID(98);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(98);
myself.GiveItem1(target, 7420, 1);
myself.SetFlagJournal(target, 98, 16);
myself.ShowQuestMark(target, 98);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7513, gg.OwnItemCount(target, 7513));

}

}
break;

}
case 31: {
myself.SetCurrentQuestID(99);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(99);
myself.GiveItem1(target, 7421, 1);
myself.SetFlagJournal(target, 99, 16);
myself.ShowQuestMark(target, 99);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7514, gg.OwnItemCount(target, 7514));

}

}
break;

}
case 32: {
myself.SetCurrentQuestID(100);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(100);
myself.GiveItem1(target, 7422, 1);
myself.SetFlagJournal(target, 100, 16);
myself.ShowQuestMark(target, 100);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7515, gg.OwnItemCount(target, 7515));

}

}
break;

}
case 33: {
myself.SetCurrentQuestID(67);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(67);
myself.GiveItem1(target, 9734, 1);
myself.SetFlagJournal(target, 67, 16);
myself.ShowQuestMark(target, 67);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 9740, gg.OwnItemCount(target, 9740));

}

}
break;

}
case 34: {
myself.SetCurrentQuestID(69);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(69);
myself.GiveItem1(target, 9736, 1);
myself.SetFlagJournal(target, 69, 16);
myself.ShowQuestMark(target, 69);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 9742, gg.OwnItemCount(target, 9742));

}

}
break;

}
case 35: {
myself.SetCurrentQuestID(68);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(68);
myself.GiveItem1(target, 9735, 1);
myself.SetFlagJournal(target, 68, 16);
myself.ShowQuestMark(target, 68);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 9741, gg.OwnItemCount(target, 9741));

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
myself.SetCurrentQuestID(619);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 79) {
myself.GiveItem1(target, 7254, 4);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else {
myself.GiveItem1(target, 7254, 3);
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