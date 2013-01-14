package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class scavenger_ant extends warrior_ag_casting_3skill_approach {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 70) == 1 && target.occupation == 5 && gg.GetMemoState(target, 70) == 12 && gg.OwnItemCount(target, 7392) == 0) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 70) == 1 && target.occupation == 5 && gg.GetMemoState(target, 70) == 12 && gg.OwnItemCount(target, 7392) == 0) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 70) == 1 && target.occupation == 5 && gg.GetMemoState(target, 70) == 12 && gg.OwnItemCount(target, 7392) == 0) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 71) == 1 && target.occupation == 20 && gg.GetMemoState(target, 71) == 12 && gg.OwnItemCount(target, 7393) == 0) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 71) == 1 && target.occupation == 20 && gg.GetMemoState(target, 71) == 12 && gg.OwnItemCount(target, 7393) == 0) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 71) == 1 && target.occupation == 20 && gg.GetMemoState(target, 71) == 12 && gg.OwnItemCount(target, 7393) == 0) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 72) == 1 && target.occupation == 21 && gg.GetMemoState(target, 72) == 12 && gg.OwnItemCount(target, 7394) == 0) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 72) == 1 && target.occupation == 21 && gg.GetMemoState(target, 72) == 12 && gg.OwnItemCount(target, 7394) == 0) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 72) == 1 && target.occupation == 21 && gg.GetMemoState(target, 72) == 12 && gg.OwnItemCount(target, 7394) == 0) {
random1_list.SetInfo(2, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 73) == 1 && target.occupation == 2 && gg.GetMemoState(target, 73) == 12 && gg.OwnItemCount(target, 7395) == 0) {
random1_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 73) == 1 && target.occupation == 2 && gg.GetMemoState(target, 73) == 12 && gg.OwnItemCount(target, 7395) == 0) {
random1_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 73) == 1 && target.occupation == 2 && gg.GetMemoState(target, 73) == 12 && gg.OwnItemCount(target, 7395) == 0) {
random1_list.SetInfo(3, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 74) == 1 && target.occupation == 3 && gg.GetMemoState(target, 74) == 12 && gg.OwnItemCount(target, 7396) == 0) {
random1_list.SetInfo(4, target);

}
if (gg.HaveMemo(target, 74) == 1 && target.occupation == 3 && gg.GetMemoState(target, 74) == 12 && gg.OwnItemCount(target, 7396) == 0) {
random1_list.SetInfo(4, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 74) == 1 && target.occupation == 3 && gg.GetMemoState(target, 74) == 12 && gg.OwnItemCount(target, 7396) == 0) {
random1_list.SetInfo(4, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 75) == 1 && target.occupation == 46 && gg.GetMemoState(target, 75) == 12 && gg.OwnItemCount(target, 7397) == 0) {
random1_list.SetInfo(5, target);

}
if (gg.HaveMemo(target, 75) == 1 && target.occupation == 46 && gg.GetMemoState(target, 75) == 12 && gg.OwnItemCount(target, 7397) == 0) {
random1_list.SetInfo(5, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 75) == 1 && target.occupation == 46 && gg.GetMemoState(target, 75) == 12 && gg.OwnItemCount(target, 7397) == 0) {
random1_list.SetInfo(5, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 76) == 1 && target.occupation == 48 && gg.GetMemoState(target, 76) == 12 && gg.OwnItemCount(target, 7398) == 0) {
random1_list.SetInfo(6, target);

}
if (gg.HaveMemo(target, 76) == 1 && target.occupation == 48 && gg.GetMemoState(target, 76) == 12 && gg.OwnItemCount(target, 7398) == 0) {
random1_list.SetInfo(6, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 76) == 1 && target.occupation == 48 && gg.GetMemoState(target, 76) == 12 && gg.OwnItemCount(target, 7398) == 0) {
random1_list.SetInfo(6, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 77) == 1 && target.occupation == 51 && gg.GetMemoState(target, 77) == 12 && gg.OwnItemCount(target, 7399) == 0) {
random1_list.SetInfo(7, target);

}
if (gg.HaveMemo(target, 77) == 1 && target.occupation == 51 && gg.GetMemoState(target, 77) == 12 && gg.OwnItemCount(target, 7399) == 0) {
random1_list.SetInfo(7, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 77) == 1 && target.occupation == 51 && gg.GetMemoState(target, 77) == 12 && gg.OwnItemCount(target, 7399) == 0) {
random1_list.SetInfo(7, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 78) == 1 && target.occupation == 52 && gg.GetMemoState(target, 78) == 12 && gg.OwnItemCount(target, 7400) == 0) {
random1_list.SetInfo(8, target);

}
if (gg.HaveMemo(target, 78) == 1 && target.occupation == 52 && gg.GetMemoState(target, 78) == 12 && gg.OwnItemCount(target, 7400) == 0) {
random1_list.SetInfo(8, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 78) == 1 && target.occupation == 52 && gg.GetMemoState(target, 78) == 12 && gg.OwnItemCount(target, 7400) == 0) {
random1_list.SetInfo(8, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 79) == 1 && target.occupation == 8 && gg.GetMemoState(target, 79) == 12 && gg.OwnItemCount(target, 7401) == 0) {
random1_list.SetInfo(9, target);

}
if (gg.HaveMemo(target, 79) == 1 && target.occupation == 8 && gg.GetMemoState(target, 79) == 12 && gg.OwnItemCount(target, 7401) == 0) {
random1_list.SetInfo(9, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 79) == 1 && target.occupation == 8 && gg.GetMemoState(target, 79) == 12 && gg.OwnItemCount(target, 7401) == 0) {
random1_list.SetInfo(9, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 80) == 1 && target.occupation == 23 && gg.GetMemoState(target, 80) == 12 && gg.OwnItemCount(target, 7402) == 0) {
random1_list.SetInfo(10, target);

}
if (gg.HaveMemo(target, 80) == 1 && target.occupation == 23 && gg.GetMemoState(target, 80) == 12 && gg.OwnItemCount(target, 7402) == 0) {
random1_list.SetInfo(10, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 80) == 1 && target.occupation == 23 && gg.GetMemoState(target, 80) == 12 && gg.OwnItemCount(target, 7402) == 0) {
random1_list.SetInfo(10, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 81) == 1 && target.occupation == 36 && gg.GetMemoState(target, 81) == 12 && gg.OwnItemCount(target, 7403) == 0) {
random1_list.SetInfo(11, target);

}
if (gg.HaveMemo(target, 81) == 1 && target.occupation == 36 && gg.GetMemoState(target, 81) == 12 && gg.OwnItemCount(target, 7403) == 0) {
random1_list.SetInfo(11, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 81) == 1 && target.occupation == 36 && gg.GetMemoState(target, 81) == 12 && gg.OwnItemCount(target, 7403) == 0) {
random1_list.SetInfo(11, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 82) == 1 && target.occupation == 9 && gg.GetMemoState(target, 82) == 12 && gg.OwnItemCount(target, 7404) == 0) {
random1_list.SetInfo(12, target);

}
if (gg.HaveMemo(target, 82) == 1 && target.occupation == 9 && gg.GetMemoState(target, 82) == 12 && gg.OwnItemCount(target, 7404) == 0) {
random1_list.SetInfo(12, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 82) == 1 && target.occupation == 9 && gg.GetMemoState(target, 82) == 12 && gg.OwnItemCount(target, 7404) == 0) {
random1_list.SetInfo(12, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 83) == 1 && target.occupation == 24 && gg.GetMemoState(target, 83) == 12 && gg.OwnItemCount(target, 7405) == 0) {
random1_list.SetInfo(13, target);

}
if (gg.HaveMemo(target, 83) == 1 && target.occupation == 24 && gg.GetMemoState(target, 83) == 12 && gg.OwnItemCount(target, 7405) == 0) {
random1_list.SetInfo(13, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 83) == 1 && target.occupation == 24 && gg.GetMemoState(target, 83) == 12 && gg.OwnItemCount(target, 7405) == 0) {
random1_list.SetInfo(13, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 84) == 1 && target.occupation == 37 && gg.GetMemoState(target, 84) == 12 && gg.OwnItemCount(target, 7406) == 0) {
random1_list.SetInfo(14, target);

}
if (gg.HaveMemo(target, 84) == 1 && target.occupation == 37 && gg.GetMemoState(target, 84) == 12 && gg.OwnItemCount(target, 7406) == 0) {
random1_list.SetInfo(14, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 84) == 1 && target.occupation == 37 && gg.GetMemoState(target, 84) == 12 && gg.OwnItemCount(target, 7406) == 0) {
random1_list.SetInfo(14, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 85) == 1 && target.occupation == 16 && gg.GetMemoState(target, 85) == 12 && gg.OwnItemCount(target, 7407) == 0) {
random1_list.SetInfo(15, target);

}
if (gg.HaveMemo(target, 85) == 1 && target.occupation == 16 && gg.GetMemoState(target, 85) == 12 && gg.OwnItemCount(target, 7407) == 0) {
random1_list.SetInfo(15, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 85) == 1 && target.occupation == 16 && gg.GetMemoState(target, 85) == 12 && gg.OwnItemCount(target, 7407) == 0) {
random1_list.SetInfo(15, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 86) == 1 && target.occupation == 17 && gg.GetMemoState(target, 86) == 12 && gg.OwnItemCount(target, 7408) == 0) {
random1_list.SetInfo(16, target);

}
if (gg.HaveMemo(target, 86) == 1 && target.occupation == 17 && gg.GetMemoState(target, 86) == 12 && gg.OwnItemCount(target, 7408) == 0) {
random1_list.SetInfo(16, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 86) == 1 && target.occupation == 17 && gg.GetMemoState(target, 86) == 12 && gg.OwnItemCount(target, 7408) == 0) {
random1_list.SetInfo(16, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 87) == 1 && target.occupation == 30 && gg.GetMemoState(target, 87) == 12 && gg.OwnItemCount(target, 7409) == 0) {
random1_list.SetInfo(17, target);

}
if (gg.HaveMemo(target, 87) == 1 && target.occupation == 30 && gg.GetMemoState(target, 87) == 12 && gg.OwnItemCount(target, 7409) == 0) {
random1_list.SetInfo(17, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 87) == 1 && target.occupation == 30 && gg.GetMemoState(target, 87) == 12 && gg.OwnItemCount(target, 7409) == 0) {
random1_list.SetInfo(17, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 88) == 1 && target.occupation == 12 && gg.GetMemoState(target, 88) == 12 && gg.OwnItemCount(target, 7410) == 0) {
random1_list.SetInfo(18, target);

}
if (gg.HaveMemo(target, 88) == 1 && target.occupation == 12 && gg.GetMemoState(target, 88) == 12 && gg.OwnItemCount(target, 7410) == 0) {
random1_list.SetInfo(18, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 88) == 1 && target.occupation == 12 && gg.GetMemoState(target, 88) == 12 && gg.OwnItemCount(target, 7410) == 0) {
random1_list.SetInfo(18, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 89) == 1 && target.occupation == 27 && gg.GetMemoState(target, 89) == 12 && gg.OwnItemCount(target, 7411) == 0) {
random1_list.SetInfo(19, target);

}
if (gg.HaveMemo(target, 89) == 1 && target.occupation == 27 && gg.GetMemoState(target, 89) == 12 && gg.OwnItemCount(target, 7411) == 0) {
random1_list.SetInfo(19, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 89) == 1 && target.occupation == 27 && gg.GetMemoState(target, 89) == 12 && gg.OwnItemCount(target, 7411) == 0) {
random1_list.SetInfo(19, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 90) == 1 && target.occupation == 40 && gg.GetMemoState(target, 90) == 12 && gg.OwnItemCount(target, 7412) == 0) {
random1_list.SetInfo(20, target);

}
if (gg.HaveMemo(target, 90) == 1 && target.occupation == 40 && gg.GetMemoState(target, 90) == 12 && gg.OwnItemCount(target, 7412) == 0) {
random1_list.SetInfo(20, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 90) == 1 && target.occupation == 40 && gg.GetMemoState(target, 90) == 12 && gg.OwnItemCount(target, 7412) == 0) {
random1_list.SetInfo(20, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 91) == 1 && target.occupation == 14 && gg.GetMemoState(target, 91) == 12 && gg.OwnItemCount(target, 7413) == 0) {
random1_list.SetInfo(21, target);

}
if (gg.HaveMemo(target, 91) == 1 && target.occupation == 14 && gg.GetMemoState(target, 91) == 12 && gg.OwnItemCount(target, 7413) == 0) {
random1_list.SetInfo(21, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 91) == 1 && target.occupation == 14 && gg.GetMemoState(target, 91) == 12 && gg.OwnItemCount(target, 7413) == 0) {
random1_list.SetInfo(21, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 92) == 1 && target.occupation == 28 && gg.GetMemoState(target, 92) == 12 && gg.OwnItemCount(target, 7414) == 0) {
random1_list.SetInfo(22, target);

}
if (gg.HaveMemo(target, 92) == 1 && target.occupation == 28 && gg.GetMemoState(target, 92) == 12 && gg.OwnItemCount(target, 7414) == 0) {
random1_list.SetInfo(22, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 92) == 1 && target.occupation == 28 && gg.GetMemoState(target, 92) == 12 && gg.OwnItemCount(target, 7414) == 0) {
random1_list.SetInfo(22, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 93) == 1 && target.occupation == 41 && gg.GetMemoState(target, 93) == 12 && gg.OwnItemCount(target, 7415) == 0) {
random1_list.SetInfo(23, target);

}
if (gg.HaveMemo(target, 93) == 1 && target.occupation == 41 && gg.GetMemoState(target, 93) == 12 && gg.OwnItemCount(target, 7415) == 0) {
random1_list.SetInfo(23, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 93) == 1 && target.occupation == 41 && gg.GetMemoState(target, 93) == 12 && gg.OwnItemCount(target, 7415) == 0) {
random1_list.SetInfo(23, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 94) == 1 && target.occupation == 13 && gg.GetMemoState(target, 94) == 12 && gg.OwnItemCount(target, 7416) == 0) {
random1_list.SetInfo(24, target);

}
if (gg.HaveMemo(target, 94) == 1 && target.occupation == 13 && gg.GetMemoState(target, 94) == 12 && gg.OwnItemCount(target, 7416) == 0) {
random1_list.SetInfo(24, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 94) == 1 && target.occupation == 13 && gg.GetMemoState(target, 94) == 12 && gg.OwnItemCount(target, 7416) == 0) {
random1_list.SetInfo(24, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 95) == 1 && target.occupation == 6 && gg.GetMemoState(target, 95) == 12 && gg.OwnItemCount(target, 7417) == 0) {
random1_list.SetInfo(25, target);

}
if (gg.HaveMemo(target, 95) == 1 && target.occupation == 6 && gg.GetMemoState(target, 95) == 12 && gg.OwnItemCount(target, 7417) == 0) {
random1_list.SetInfo(25, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 95) == 1 && target.occupation == 6 && gg.GetMemoState(target, 95) == 12 && gg.OwnItemCount(target, 7417) == 0) {
random1_list.SetInfo(25, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 96) == 1 && target.occupation == 34 && gg.GetMemoState(target, 96) == 12 && gg.OwnItemCount(target, 7418) == 0) {
random1_list.SetInfo(26, target);

}
if (gg.HaveMemo(target, 96) == 1 && target.occupation == 34 && gg.GetMemoState(target, 96) == 12 && gg.OwnItemCount(target, 7418) == 0) {
random1_list.SetInfo(26, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 96) == 1 && target.occupation == 34 && gg.GetMemoState(target, 96) == 12 && gg.OwnItemCount(target, 7418) == 0) {
random1_list.SetInfo(26, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 97) == 1 && target.occupation == 33 && gg.GetMemoState(target, 97) == 12 && gg.OwnItemCount(target, 7419) == 0) {
random1_list.SetInfo(27, target);

}
if (gg.HaveMemo(target, 97) == 1 && target.occupation == 33 && gg.GetMemoState(target, 97) == 12 && gg.OwnItemCount(target, 7419) == 0) {
random1_list.SetInfo(27, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 97) == 1 && target.occupation == 33 && gg.GetMemoState(target, 97) == 12 && gg.OwnItemCount(target, 7419) == 0) {
random1_list.SetInfo(27, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 98) == 1 && target.occupation == 43 && gg.GetMemoState(target, 98) == 12 && gg.OwnItemCount(target, 7420) == 0) {
random1_list.SetInfo(28, target);

}
if (gg.HaveMemo(target, 98) == 1 && target.occupation == 43 && gg.GetMemoState(target, 98) == 12 && gg.OwnItemCount(target, 7420) == 0) {
random1_list.SetInfo(28, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 98) == 1 && target.occupation == 43 && gg.GetMemoState(target, 98) == 12 && gg.OwnItemCount(target, 7420) == 0) {
random1_list.SetInfo(28, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 99) == 1 && target.occupation == 55 && gg.GetMemoState(target, 99) == 12 && gg.OwnItemCount(target, 7421) == 0) {
random1_list.SetInfo(29, target);

}
if (gg.HaveMemo(target, 99) == 1 && target.occupation == 55 && gg.GetMemoState(target, 99) == 12 && gg.OwnItemCount(target, 7421) == 0) {
random1_list.SetInfo(29, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 99) == 1 && target.occupation == 55 && gg.GetMemoState(target, 99) == 12 && gg.OwnItemCount(target, 7421) == 0) {
random1_list.SetInfo(29, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 100) == 1 && target.occupation == 57 && gg.GetMemoState(target, 100) == 12 && gg.OwnItemCount(target, 7422) == 0) {
random1_list.SetInfo(30, target);

}
if (gg.HaveMemo(target, 100) == 1 && target.occupation == 57 && gg.GetMemoState(target, 100) == 12 && gg.OwnItemCount(target, 7422) == 0) {
random1_list.SetInfo(30, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 100) == 1 && target.occupation == 57 && gg.GetMemoState(target, 100) == 12 && gg.OwnItemCount(target, 7422) == 0) {
random1_list.SetInfo(30, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 67) == 1 && target.occupation == 127 && gg.GetMemoState(target, 67) == 12 && gg.OwnItemCount(target, 9734) == 0) {
random1_list.SetInfo(31, target);

}
if (gg.HaveMemo(target, 67) == 1 && target.occupation == 127 && gg.GetMemoState(target, 67) == 12 && gg.OwnItemCount(target, 9734) == 0) {
random1_list.SetInfo(31, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 67) == 1 && target.occupation == 127 && gg.GetMemoState(target, 67) == 12 && gg.OwnItemCount(target, 9734) == 0) {
random1_list.SetInfo(31, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 69) == 1 && target.occupation == 130 && gg.GetMemoState(target, 69) == 12 && gg.OwnItemCount(target, 9736) == 0) {
random1_list.SetInfo(32, target);

}
if (gg.HaveMemo(target, 69) == 1 && target.occupation == 130 && gg.GetMemoState(target, 69) == 12 && gg.OwnItemCount(target, 9736) == 0) {
random1_list.SetInfo(32, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 69) == 1 && target.occupation == 130 && gg.GetMemoState(target, 69) == 12 && gg.OwnItemCount(target, 9736) == 0) {
random1_list.SetInfo(32, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 68) == 1 && target.occupation == 128 || target.occupation == 129 && gg.GetMemoState(target, 68) == 12 && gg.OwnItemCount(target, 9735) == 0) {
random1_list.SetInfo(33, target);

}
if (gg.HaveMemo(target, 68) == 1 && target.occupation == 128 || target.occupation == 129 && gg.GetMemoState(target, 68) == 12 && gg.OwnItemCount(target, 9735) == 0) {
random1_list.SetInfo(33, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 68) == 1 && target.occupation == 128 || target.occupation == 129 && gg.GetMemoState(target, 68) == 12 && gg.OwnItemCount(target, 9735) == 0) {
random1_list.SetInfo(33, target);

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
myself.SetCurrentQuestID(70);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7485) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7485) >= 20) {
myself.DeleteItem1(target, 7485, 20);

}
myself.CreateOnePrivateEx(1027219, "argos_boss_01", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7392);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7485, i0);

} else {
myself.GiveItem1(target, 7485, 700 - i1);

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(71);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7486) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7486) >= 20) {
myself.DeleteItem1(target, 7486, 20);

}
myself.CreateOnePrivateEx(1027220, "argos_boss_02", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7486);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7486, i0);

} else {
myself.GiveItem1(target, 7486, 700 - i1);

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(72);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7487) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7487) >= 20) {
myself.DeleteItem1(target, 7487, 20);

}
myself.CreateOnePrivateEx(1027221, "argos_boss_03", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
myself.GiveItem1(target, 7487, 1);

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(73);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7488) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7488) >= 20) {
myself.DeleteItem1(target, 7488, 20);

}
myself.CreateOnePrivateEx(1027222, "argos_boss_04", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7488);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7488, i0);

} else {
myself.GiveItem1(target, 7488, 700 - i1);

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(74);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7489) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7489) >= 20) {
myself.DeleteItem1(target, 7489, 20);

}
myself.CreateOnePrivateEx(1027223, "argos_boss_05", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7489);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7489, i0);

} else {
myself.GiveItem1(target, 7489, 700 - i1);

}

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(75);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7490) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7490) >= 20) {
myself.DeleteItem1(target, 7490, 20);

}
myself.CreateOnePrivateEx(1027224, "argos_boss_06", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7490);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7490, i0);

} else {
myself.GiveItem1(target, 7490, 700 - i1);

}

}

}
break;

}
case 6: {
myself.SetCurrentQuestID(76);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7491) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7491) >= 20) {
myself.DeleteItem1(target, 7491, 20);

}
myself.CreateOnePrivateEx(1027225, "argos_boss_07", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7491);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7491, i0);

} else {
myself.GiveItem1(target, 7491, 700 - i1);

}

}

}
break;

}
case 7: {
myself.SetCurrentQuestID(77);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7492) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7492) >= 20) {
myself.DeleteItem1(target, 7492, 20);

}
myself.CreateOnePrivateEx(1027226, "argos_boss_08", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7492);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7492, i0);

} else {
myself.GiveItem1(target, 7492, 700 - i1);

}

}

}
break;

}
case 8: {
myself.SetCurrentQuestID(78);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7493) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7493) >= 20) {
myself.DeleteItem1(target, 7493, 20);

}
myself.CreateOnePrivateEx(1027227, "argos_boss_09", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7493);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7493, i0);

} else {
myself.GiveItem1(target, 7493, 700 - i1);

}

}

}
break;

}
case 9: {
myself.SetCurrentQuestID(79);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7494) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7494) >= 20) {
myself.DeleteItem1(target, 7494, 20);

}
myself.CreateOnePrivateEx(1027228, "argos_boss_10", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7494);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7494, i0);

} else {
myself.GiveItem1(target, 7494, 700 - i1);

}

}

}
break;

}
case 10: {
myself.SetCurrentQuestID(80);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7495) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7495) >= 20) {
myself.DeleteItem1(target, 7495, 20);

}
myself.CreateOnePrivateEx(1027229, "argos_boss_11", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7495);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7495, i0);

} else {
myself.GiveItem1(target, 7495, 700 - i1);

}

}

}
break;

}
case 11: {
myself.SetCurrentQuestID(81);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7496) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7496) >= 20) {
myself.DeleteItem1(target, 7496, 20);

}
myself.CreateOnePrivateEx(1027230, "argos_boss_12", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7496);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7496, i0);

} else {
myself.GiveItem1(target, 7496, 700 - i1);

}

}

}
break;

}
case 12: {
myself.SetCurrentQuestID(82);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7497) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7497) >= 20) {
myself.DeleteItem1(target, 7497, 20);

}
myself.CreateOnePrivateEx(1027231, "argos_boss_13", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7497);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7497, i0);

} else {
myself.GiveItem1(target, 7497, 700 - i1);

}

}

}
break;

}
case 13: {
myself.SetCurrentQuestID(83);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7498) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7498) >= 20) {
myself.DeleteItem1(target, 7498, 20);

}
myself.CreateOnePrivateEx(1027232, "argos_boss_14", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7498);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7498, i0);

} else {
myself.GiveItem1(target, 7498, 700 - i1);

}

}

}
break;

}
case 14: {
myself.SetCurrentQuestID(84);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7499) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7499) >= 20) {
myself.DeleteItem1(target, 7499, 20);

}
myself.CreateOnePrivateEx(1027233, "argos_boss_15", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7499);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7499, i0);

} else {
myself.GiveItem1(target, 7499, 700 - i1);

}

}

}
break;

}
case 15: {
myself.SetCurrentQuestID(85);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7500) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7500) >= 20) {
myself.DeleteItem1(target, 7500, 20);

}
myself.CreateOnePrivateEx(1027234, "argos_boss_16", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7500);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7500, i0);

} else {
myself.GiveItem1(target, 7500, 700 - i1);

}

}

}
break;

}
case 16: {
myself.SetCurrentQuestID(86);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7501) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7501) >= 20) {
myself.DeleteItem1(target, 7501, 20);

}
myself.CreateOnePrivateEx(1027235, "argos_boss_17", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7501);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7501, i0);

} else {
myself.GiveItem1(target, 7501, 700 - i1);

}

}

}
break;

}
case 17: {
myself.SetCurrentQuestID(87);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7502) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7502) >= 20) {
myself.DeleteItem1(target, 7502, 20);

}
myself.CreateOnePrivateEx(1027236, "argos_boss_18", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7502);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7502, i0);

} else {
myself.GiveItem1(target, 7502, 700 - i1);

}

}

}
break;

}
case 18: {
myself.SetCurrentQuestID(88);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7503) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7503) >= 20) {
myself.DeleteItem1(target, 7503, 20);

}
myself.CreateOnePrivateEx(1027237, "argos_boss_19", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7503);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7503, i0);

} else {
myself.GiveItem1(target, 7503, 700 - i1);

}

}

}
break;

}
case 19: {
myself.SetCurrentQuestID(89);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7504) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7504) >= 20) {
myself.DeleteItem1(target, 7504, 20);

}
myself.CreateOnePrivateEx(1027238, "argos_boss_20", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7504);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7504, i0);

} else {
myself.GiveItem1(target, 7504, 700 - i1);

}

}

}
break;

}
case 20: {
myself.SetCurrentQuestID(90);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7505) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7505) >= 20) {
myself.DeleteItem1(target, 7505, 20);

}
myself.CreateOnePrivateEx(1027239, "argos_boss_21", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7505);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7505, i0);

} else {
myself.GiveItem1(target, 7505, 700 - i1);

}

}

}
break;

}
case 21: {
myself.SetCurrentQuestID(91);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7506) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7506) >= 20) {
myself.DeleteItem1(target, 7506, 20);

}
myself.CreateOnePrivateEx(1027240, "argos_boss_22", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7506);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7506, i0);

} else {
myself.GiveItem1(target, 7506, 700 - i1);

}

}

}
break;

}
case 22: {
myself.SetCurrentQuestID(92);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7507) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7507) >= 20) {
myself.DeleteItem1(target, 7507, 20);

}
myself.CreateOnePrivateEx(1027241, "argos_boss_23", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7507);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7507, i0);

} else {
myself.GiveItem1(target, 7507, 700 - i1);

}

}

}
break;

}
case 23: {
myself.SetCurrentQuestID(93);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7508) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7508) >= 20) {
myself.DeleteItem1(target, 7508, 20);

}
myself.CreateOnePrivateEx(1027242, "argos_boss_24", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7508);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7508, i0);

} else {
myself.GiveItem1(target, 7508, 700 - i1);

}

}

}
break;

}
case 24: {
myself.SetCurrentQuestID(94);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7509) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7509) >= 20) {
myself.DeleteItem1(target, 7509, 20);

}
myself.CreateOnePrivateEx(1027243, "argos_boss_25", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7509);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7509, i0);

} else {
myself.GiveItem1(target, 7509, 700 - i1);

}

}

}
break;

}
case 25: {
myself.SetCurrentQuestID(95);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7510) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7510) >= 20) {
myself.DeleteItem1(target, 7510, 20);

}
myself.CreateOnePrivateEx(1027244, "argos_boss_26", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7510);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7510, i0);

} else {
myself.GiveItem1(target, 7510, 700 - i1);

}

}

}
break;

}
case 26: {
myself.SetCurrentQuestID(96);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7511) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7511) >= 20) {
myself.DeleteItem1(target, 7511, 20);

}
myself.CreateOnePrivateEx(1027245, "argos_boss_27", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7511);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7511, i0);

} else {
myself.GiveItem1(target, 7511, 700 - i1);

}

}

}
break;

}
case 27: {
myself.SetCurrentQuestID(97);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7512) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7512) >= 20) {
myself.DeleteItem1(target, 7512, 20);

}
myself.CreateOnePrivateEx(1027246, "argos_boss_28", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7512);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7512, i0);

} else {
myself.GiveItem1(target, 7512, 700 - i1);

}

}

}
break;

}
case 28: {
myself.SetCurrentQuestID(98);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7513) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7513) >= 20) {
myself.DeleteItem1(target, 7513, 20);

}
myself.CreateOnePrivateEx(1027247, "argos_boss_29", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7513);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7513, i0);

} else {
myself.GiveItem1(target, 7513, 700 - i1);

}

}

}
break;

}
case 29: {
myself.SetCurrentQuestID(99);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7514) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7514) >= 20) {
myself.DeleteItem1(target, 7514, 20);

}
myself.CreateOnePrivateEx(1027248, "argos_boss_30", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7514);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7514, i0);

} else {
myself.GiveItem1(target, 7514, 700 - i1);

}

}

}
break;

}
case 30: {
myself.SetCurrentQuestID(100);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 7515) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 7515) >= 20) {
myself.DeleteItem1(target, 7515, 20);

}
myself.CreateOnePrivateEx(1027249, "argos_boss_31", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 7515);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 7515, i0);

} else {
myself.GiveItem1(target, 7515, 700 - i1);

}

}

}
break;

}
case 31: {
myself.SetCurrentQuestID(67);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 9740) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 9740) >= 20) {
myself.DeleteItem1(target, 9740, 20);

}
myself.CreateOnePrivateEx(1027325, "argos_boss_32", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 9740);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 9740, i0);

} else {
myself.GiveItem1(target, 9740, 700 - i1);

}

}

}
break;

}
case 32: {
myself.SetCurrentQuestID(69);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 9742) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 9742) >= 20) {
myself.DeleteItem1(target, 9742, 20);

}
myself.CreateOnePrivateEx(1027334, "argos_boss_34", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 9742);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 9742, i0);

} else {
myself.GiveItem1(target, 9742, 700 - i1);

}

}

}
break;

}
case 33: {
myself.SetCurrentQuestID(68);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 9741) >= 700 && target.is_pc == 1) {
if (gg.OwnItemCount(target, 9741) >= 20) {
myself.DeleteItem1(target, 9741, 20);

}
myself.CreateOnePrivateEx(1027329, "argos_boss_33", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, 0);

} else {
i0 = gg.Rand(4) + 1;
i1 = gg.OwnItemCount(target, 9741);
if (i0 + i1 <= 700) {
myself.GiveItem1(target, 9741, i0);

} else {
myself.GiveItem1(target, 9741, 700 - i1);

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