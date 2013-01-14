package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class drevanul_prince_zeruel extends warrior_passive {
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
if (gg.HaveMemo(c1, 229) == 1 && gg.OwnItemCount(c1, 3324) == 1 && gg.OwnItemCount(c1, 3335) == 1 && gg.OwnItemCount(c1, 3029) == 1 && gg.OwnItemCount(c1, 3332) == 1) {
if (c1.equiped_weapon_class_id == 3029) {
myself.Say(gg.MakeFString(22936, "", "", "", "", ""));
myself.GiveItem1(c1, 3334, 1);
myself.GiveItem1(c1, 3333, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.DeleteItem1(c1, 3335, gg.OwnItemCount(c1, 3335));
myself.DeleteItem1(c1, 3332, gg.OwnItemCount(c1, 3332));
myself.SetFlagJournal(c1, 229, 10);
myself.ShowQuestMark(c1, 229);

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
if (gg.HaveMemo(attacker, 229) == 1 && gg.OwnItemCount(attacker, 3323) == 1) {
myself.Say(gg.MakeFString(22934, "", "", "", "", ""));
myself.Despawn();
myself.SetFlagJournal(attacker, 229, 5);
myself.ShowQuestMark(attacker, 229);
myself.SoundEffect(attacker, "ItemSound.quest_middle");

} else if (gg.HaveMemo(attacker, 229) == 1 && gg.OwnItemCount(attacker, 3324) == 1 && gg.OwnItemCount(attacker, 3335) == 1 && gg.OwnItemCount(attacker, 3029) == 1 && gg.OwnItemCount(attacker, 3332) == 1) {
if (myself.i_quest0 == 0 && attacker.equiped_weapon_class_id == 3029) {
myself.Say(gg.MakeFString(22935, "", "", "", "", ""));
myself.i_quest0 = 1;

}

}
super;
	}


}