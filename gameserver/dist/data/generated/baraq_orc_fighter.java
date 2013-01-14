package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class baraq_orc_fighter extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(163);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (myself.IsNullCreature(c1) == 0) {
if (gg.HaveMemo(c1, 163) == 1) {
if (gg.Rand(10) == 0 && gg.OwnItemCount(c1, 1038) == 0) {
myself.GiveItem1(c1, 1038, 1);
if (gg.OwnItemCount(c1, 1038) + gg.OwnItemCount(c1, 1039) + gg.OwnItemCount(c1, 1040) + gg.OwnItemCount(c1, 1041) >= 3) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetFlagJournal(c1, 163, 2);
myself.ShowQuestMark(c1, 163);

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}
if (gg.Rand(10) > 7 && gg.OwnItemCount(c1, 1039) == 0) {
myself.GiveItem1(c1, 1039, 1);
if (gg.OwnItemCount(c1, 1038) + gg.OwnItemCount(c1, 1039) + gg.OwnItemCount(c1, 1040) + gg.OwnItemCount(c1, 1041) >= 3) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetFlagJournal(c1, 163, 2);
myself.ShowQuestMark(c1, 163);

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}
if (gg.Rand(10) > 7 && gg.OwnItemCount(c1, 1040) == 0) {
myself.GiveItem1(c1, 1040, 1);
if (gg.OwnItemCount(c1, 1038) + gg.OwnItemCount(c1, 1039) + gg.OwnItemCount(c1, 1040) + gg.OwnItemCount(c1, 1041) >= 3) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetFlagJournal(c1, 163, 2);
myself.ShowQuestMark(c1, 163);

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}
if (gg.Rand(10) > 5 && gg.OwnItemCount(c1, 1041) == 0) {
myself.GiveItem1(c1, 1041, 1);
if (gg.OwnItemCount(c1, 1038) + gg.OwnItemCount(c1, 1039) + gg.OwnItemCount(c1, 1040) + gg.OwnItemCount(c1, 1041) >= 3) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetFlagJournal(c1, 163, 2);
myself.ShowQuestMark(c1, 163);

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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