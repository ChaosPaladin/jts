package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class goblin_brigand_leader extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 108) == 1 && gg.OwnItemCount(target, 1563)) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 292)) {
random1_list.SetInfo(1, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(108);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) < 8) {
if (gg.OwnItemCount(target, 1564) + gg.OwnItemCount(target, 1565) >= 19) {
if (gg.OwnItemCount(target, 1564) < 10) {
myself.GiveItem1(target, 1564, 1);
myself.SetFlagJournal(target, 108, 6);
myself.ShowQuestMark(target, 108);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

} else if (gg.OwnItemCount(target, 1564) < 10) {
myself.GiveItem1(target, 1564, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
if (gg.Rand(10) < 8) {
if (gg.OwnItemCount(target, 1564) + gg.OwnItemCount(target, 1565) >= 19) {
if (gg.OwnItemCount(target, 1565) < 10) {
myself.GiveItem1(target, 1565, 1);
myself.SetFlagJournal(target, 108, 6);
myself.ShowQuestMark(target, 108);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

} else if (gg.OwnItemCount(target, 1564) + gg.OwnItemCount(target, 1565) < 20) {
if (gg.OwnItemCount(target, 1565) < 10) {
myself.GiveItem1(target, 1565, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(292);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(10);
if (i0 > 5) {
myself.GiveItem1(target, 1484, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (i0 > 4) {
if (gg.OwnItemCount(target, 1487) < 1 && gg.OwnItemCount(target, 1486) < 3) {
myself.GiveItem1(target, 1486, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(target, 1487) < 1 && gg.OwnItemCount(target, 1486) == 3) {
myself.GiveItem1(target, 1487, 1);
myself.SetFlagJournal(target, 292, 2);
myself.ShowQuestMark(target, 292);
myself.DeleteItem1(target, 1486, gg.OwnItemCount(target, 1486));
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


}