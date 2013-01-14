package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class nameless_revenant extends warrior_pa_slow_type2 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
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
if (gg.HaveMemo(c1, 229) == 1 && gg.OwnItemCount(c1, 3309) == 1 && gg.OwnItemCount(c1, 3314) == 1 && gg.OwnItemCount(c1, 3319) == 0) {
myself.GiveItem1(c1, 3319, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.DeleteItem1(c1, 3314, gg.OwnItemCount(c1, 3314));
if (gg.OwnItemCount(c1, 3317) >= 1 && gg.OwnItemCount(c1, 3318) >= 1 && gg.OwnItemCount(c1, 3320) >= 1 && gg.OwnItemCount(c1, 3321) >= 1 && gg.OwnItemCount(c1, 3322) >= 1) {
myself.SetFlagJournal(c1, 229, 3);
myself.ShowQuestMark(c1, 229);

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(227);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(c1, 227) == 1 && gg.GetMemoState(c1, 227) == 1 && gg.OwnItemCount(c1, 2831) < 7 && gg.OwnItemCount(c1, 2822) >= 1 && myself.i_quest0 == 1 && gg.OwnItemCount(c1, 2832) == 0) {
if (gg.OwnItemCount(c1, 2831) == 6) {
myself.CreateOnePrivateEx(1027128, "aruraune", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.DeleteItem1(c1, 2831, gg.OwnItemCount(c1, 2831));
myself.SetFlagJournal(c1, 227, 2);
myself.ShowQuestMark(c1, 227);

} else {
myself.GiveItem1(c1, 2831, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id) {
myself.SetCurrentQuestID(229);
if (attacker.master) {
attacker = attacker.master;

}
if (gg.HaveMemo(attacker, 229) == 1 && gg.OwnItemCount(attacker, 3309) == 1 && gg.OwnItemCount(attacker, 3314) == 1 && gg.OwnItemCount(attacker, 3319) == 0) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.Say(gg.MakeFString(22933, "", "", "", "", ""));

}

}
myself.SetCurrentQuestID(227);
if (skill_name_id / 65536 == 67567617 / 65536) {
myself.i_quest0 = 1;

} else {
myself.i_quest0 = 2;

}
super;
	}


}