package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class picat_araneid extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 123) == 1 && gg.GetMemoState(target, 123) == 4 && gg.OwnItemCount(target, 8550) < 8) {
always_list.SetInfo(0, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(123);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) < 7) {
if (myself.HasAcademyMaster(target) == 1) {
c0 = myself.GetAcademyMaster(target);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) <= 1500) {
myself.GiveItem1(target, 8550, 1);
if (gg.OwnItemCount(target, 8550) >= 7) {
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 123, 8);
myself.ShowQuestMark(target, 123);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

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
code_info.code;

}
super;
	}


}