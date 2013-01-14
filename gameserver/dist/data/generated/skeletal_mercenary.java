package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class skeletal_mercenary extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(229);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 229) == 1 && gg.OwnItemCount(c1, 3316) == 1 && gg.OwnItemCount(c1, 3320) == 0 || gg.OwnItemCount(c1, 3321) == 0 || gg.OwnItemCount(c1, 3322) == 0) {
if (gg.OwnItemCount(c1, 3320) == 0) {
myself.GiveItem1(c1, 3320, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(c1, 3321) == 0) {
myself.GiveItem1(c1, 3321, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(c1, 3322) == 0) {
myself.GiveItem1(c1, 3322, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.DeleteItem1(c1, 3316, gg.OwnItemCount(c1, 3316));
if (gg.OwnItemCount(c1, 3317) >= 1 && gg.OwnItemCount(c1, 3318) >= 1 && gg.OwnItemCount(c1, 3319) >= 1) {
myself.SetFlagJournal(c1, 229, 3);
myself.ShowQuestMark(c1, 229);

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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(229);
if (attacker.master) {
attacker = attacker.master;

}
if (gg.HaveMemo(attacker, 229) == 1 && gg.OwnItemCount(attacker, 3316) == 1 && gg.OwnItemCount(attacker, 3320) == 0 || gg.OwnItemCount(attacker, 3321) == 0 || gg.OwnItemCount(attacker, 3322) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.Say(gg.MakeFString(22933, "", "", "", "", ""));

}

}
super;
	}


}