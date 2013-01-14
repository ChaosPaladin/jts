package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ketra_orc_medium extends wizard_ag_casting_clanbuff_rangedd_curse_stone {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
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
if (gg.HaveMemo(target, 611) == 1 && gg.OwnItemCount(target, 7221) >= 1 && gg.OwnItemCount(target, 7227) < 100 || gg.OwnItemCount(target, 7222) >= 1 && gg.OwnItemCount(target, 7227) < 200 || gg.OwnItemCount(target, 7223) >= 1 && gg.OwnItemCount(target, 7227) < 300 || gg.OwnItemCount(target, 7224) >= 1 && gg.OwnItemCount(target, 7227) < 400) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 611) == 1 && gg.OwnItemCount(target, 7221) >= 1 && gg.OwnItemCount(target, 7227) < 100 || gg.OwnItemCount(target, 7222) >= 1 && gg.OwnItemCount(target, 7227) < 200 || gg.OwnItemCount(target, 7223) >= 1 && gg.OwnItemCount(target, 7227) < 300 || gg.OwnItemCount(target, 7224) >= 1 && gg.OwnItemCount(target, 7227) < 400) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 611) == 1 && gg.OwnItemCount(target, 7221) >= 1 && gg.OwnItemCount(target, 7227) < 100 || gg.OwnItemCount(target, 7222) >= 1 && gg.OwnItemCount(target, 7227) < 200 || gg.OwnItemCount(target, 7223) >= 1 && gg.OwnItemCount(target, 7227) < 300 || gg.OwnItemCount(target, 7224) >= 1 && gg.OwnItemCount(target, 7227) < 400) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 612) == 1 && gg.GetMemoState(target, 612) == 1 * 10 + 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 612) == 1 && gg.GetMemoState(target, 612) == 1 * 10 + 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 612) == 1 && gg.GetMemoState(target, 612) == 1 * 10 + 1) {
random1_list.SetInfo(2, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(605);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(605);
if (gg.OwnItemCount(target, 7215) >= 1) {
myself.DeleteItem1(target, 7215, gg.OwnItemCount(target, 7215));
myself.GiveItem1(target, 7214, 1);

} else if (gg.OwnItemCount(target, 7214) >= 1) {
myself.DeleteItem1(target, 7214, gg.OwnItemCount(target, 7214));
myself.GiveItem1(target, 7213, 1);

} else if (gg.OwnItemCount(target, 7213) >= 1) {
myself.DeleteItem1(target, 7213, gg.OwnItemCount(target, 7213));
myself.GiveItem1(target, 7212, 1);

} else if (gg.OwnItemCount(target, 7212) >= 1) {
myself.DeleteItem1(target, 7212, gg.OwnItemCount(target, 7212));
myself.GiveItem1(target, 7211, 1);

} else if (gg.OwnItemCount(target, 7211) >= 1) {
myself.DeleteItem1(target, 7211, gg.OwnItemCount(target, 7211));

}
if (gg.HaveMemo(target, 605)) {
myself.RemoveMemo(target, 605);
gg.AddLog(2, target, 605);
myself.DeleteItem1(target, 7216, gg.OwnItemCount(target, 7216));
myself.DeleteItem1(target, 7217, gg.OwnItemCount(target, 7217));
myself.DeleteItem1(target, 7218, gg.OwnItemCount(target, 7218));

}
if (gg.HaveMemo(target, 606)) {
myself.RemoveMemo(target, 606);
gg.AddLog(2, target, 606);
myself.DeleteItem1(target, 7233, gg.OwnItemCount(target, 7233));

}
if (gg.HaveMemo(target, 607)) {
myself.RemoveMemo(target, 607);
gg.AddLog(2, target, 607);
myself.DeleteItem1(target, 7235, gg.OwnItemCount(target, 7235));

}
if (gg.HaveMemo(target, 608)) {
myself.RemoveMemo(target, 608);
gg.AddLog(2, target, 608);
myself.DeleteItem1(target, 7236, gg.OwnItemCount(target, 7236));

}
if (gg.HaveMemo(target, 609)) {
myself.RemoveMemo(target, 609);
gg.AddLog(2, target, 609);
myself.DeleteItem1(target, 7237, gg.OwnItemCount(target, 7237));

}
if (gg.HaveMemo(target, 610)) {
myself.RemoveMemo(target, 610);
gg.AddLog(2, target, 610);
myself.DeleteItem1(target, 7239, gg.OwnItemCount(target, 7239));

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
case 1: {
myself.SetCurrentQuestID(611);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 509) {
myself.GiveItem1(target, 7227, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(612);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 539) {
myself.GiveItem1(target, 7234, 1);
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
myself.SetCurrentQuestID(615);
if (gg.HaveMemo(attacker, 615) && gg.GetMemoState(attacker, 615) == 2) {
myself.SetMemoState(attacker, 615, 3);
myself.CreateOnePrivateEx(1031685, "asefas_eye", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
if (myself.Skill_GetConsumeMP(297992193) < myself.sm.mp && myself.Skill_GetConsumeHP(297992193) < myself.sm.hp && myself.Skill_InReuseDelay(297992193) == 0) {
myself.AddUseSkillDesire(attacker, 297992193, 0, 1, 10000000);

}

}
super;
	}


}