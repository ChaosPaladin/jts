package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class disturbed_waterspirit extends warrior_basic_reed {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 238) == 1 && gg.GetMemoState(target, 238) == 4 || gg.GetMemoState(target, 238) == 5) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 238) == 1 && gg.GetMemoState(target, 238) == 4 || gg.GetMemoState(target, 238) == 5) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 238) == 1 && gg.GetMemoState(target, 238) == 4 || gg.GetMemoState(target, 238) == 5) {
random1_list.SetInfo(0, target);

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
myself.SetCurrentQuestID(238);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(1000);
if (i0 < 800) {
if (gg.OwnItemCount(target, 14868) < 19) {
myself.GiveItem1(target, 14868, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(target, 14868) == 19) {
myself.GiveItem1(target, 14868, 1);
myself.SetMemoState(target, 238, 5);
myself.SetFlagJournal(target, 238, 4);
myself.ShowQuestMark(target, 238);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}

}
break;

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam skill_name_id, HandlerParam target) {
myself.SetCurrentQuestID(238);
if (gg.HaveMemo(attacker, 238) == 1 && gg.GetMemoState(attacker, 238) == 4 || gg.GetMemoState(attacker, 238) == 5) {
if (myself.IsNullCreature(attacker) == 0 && myself.sm.alive) {
if (myself.sm.level - attacker.level <= 5 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(190054401)) > 0) {
target = attacker;
if (i0 < 800) {
if (gg.OwnItemCount(target, 14868) < 19) {
myself.GiveItem1(target, 14868, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(target, 14868) == 19) {
myself.GiveItem1(target, 14868, 1);
myself.SetMemoState(target, 238, 5);
myself.SetFlagJournal(target, 238, 4);
myself.ShowQuestMark(target, 238);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}

}

}

}
super;
	}


}