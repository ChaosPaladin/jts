package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class varka_silenos_footman extends warrior_ag_physicalspecial_stone {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 605) == 1 && gg.OwnItemCount(target, 7211) + gg.OwnItemCount(target, 7212) + gg.OwnItemCount(target, 7213) + gg.OwnItemCount(target, 7214) + gg.OwnItemCount(target, 7215) == 0 && gg.OwnItemCount(target, 7216) < 100 || gg.OwnItemCount(target, 7211) >= 1 && gg.OwnItemCount(target, 7216) < 200 || gg.OwnItemCount(target, 7212) >= 1 && gg.OwnItemCount(target, 7216) < 300 || gg.OwnItemCount(target, 7213) >= 1 && gg.OwnItemCount(target, 7216) < 300 || gg.OwnItemCount(target, 7214) >= 1 && gg.OwnItemCount(target, 7216) < 400) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 605) == 1 && gg.OwnItemCount(target, 7211) + gg.OwnItemCount(target, 7212) + gg.OwnItemCount(target, 7213) + gg.OwnItemCount(target, 7214) + gg.OwnItemCount(target, 7215) == 0 && gg.OwnItemCount(target, 7216) < 100 || gg.OwnItemCount(target, 7211) >= 1 && gg.OwnItemCount(target, 7216) < 200 || gg.OwnItemCount(target, 7212) >= 1 && gg.OwnItemCount(target, 7216) < 300 || gg.OwnItemCount(target, 7213) >= 1 && gg.OwnItemCount(target, 7216) < 300 || gg.OwnItemCount(target, 7214) >= 1 && gg.OwnItemCount(target, 7216) < 400) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 605) == 1 && gg.OwnItemCount(target, 7211) + gg.OwnItemCount(target, 7212) + gg.OwnItemCount(target, 7213) + gg.OwnItemCount(target, 7214) + gg.OwnItemCount(target, 7215) == 0 && gg.OwnItemCount(target, 7216) < 100 || gg.OwnItemCount(target, 7211) >= 1 && gg.OwnItemCount(target, 7216) < 200 || gg.OwnItemCount(target, 7212) >= 1 && gg.OwnItemCount(target, 7216) < 300 || gg.OwnItemCount(target, 7213) >= 1 && gg.OwnItemCount(target, 7216) < 300 || gg.OwnItemCount(target, 7214) >= 1 && gg.OwnItemCount(target, 7216) < 400) {
random1_list.SetInfo(0, target);

}

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
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
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

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(605);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 500) {
myself.GiveItem1(target, 7216, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(609);
if (gg.HaveMemo(attacker, 609) && gg.GetMemoState(attacker, 609) == 2) {
myself.SetMemoState(attacker, 609, 3);
myself.CreateOnePrivateEx(1031684, "udans_eye", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
if (myself.Skill_GetConsumeMP(297992193) < myself.sm.mp && myself.Skill_GetConsumeHP(297992193) < myself.sm.hp && myself.Skill_InReuseDelay(297992193) == 0) {
myself.AddUseSkillDesire(attacker, 297992193, 0, 1, 10000000);

}

}
super;
	}


}