package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tree_q0421_2 extends quest_party_leader {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(421);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), -1);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);
myself.CreateOnePrivateEx(1027189, "guardian_of_tree", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);

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

	protected void ATTACKED(HandlerParam attacker, HandlerParam c1, HandlerParam damage, HandlerParam i0) {
myself.SetCurrentQuestID(421);
myself.c_quest0 = attacker;
if (myself.c_quest0.master) {
c1 = myself.c_quest0.master;
if (gg.HaveMemo(c1, 421) && gg.GetMemoState(c1, 421) <= 16) {
if (gg.GetMemoState(c1, 421) % 4 < 2) {
if (attacker.pet_dbid == gg.GetMemoStateEx(c1, 421, 1)) {
c1.flag = c1.flag + 1;
if (c1.flag < 400) {

} else if (gg.Rand(100) <= 1) {
if (gg.OwnItemCount(c1, 4325) >= 1) {
myself.Say(gg.MakeFString(42111, "", "", "", "", ""));
myself.DeleteItem1(c1, 4325, 1);
myself.SetMemoState(c1, 421, gg.GetMemoState(c1, 421) + 2);
myself.ShowQuestMark(c1, 421);
c1.flag = 0;
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.GetMemoStateEx(c1, 421, 1) >= 15 && gg.OwnItemCount(c1, 4325) <= 1) {
myself.SetFlagJournal(c1, 421, 3);
myself.ShowQuestMark(c1, 421);

}

}

}

}

} else {
i0 = gg.Rand(3);
if (i0 == 0) {
myself.Say(gg.MakeFString(42112, "", "", "", "", ""));

} else if (i0 == 1) {
myself.Say(gg.MakeFString(42115, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(42114, "", "", "", "", ""));

}

}

}

} else if (gg.HaveMemo(myself.c_quest0, 421) && gg.GetMemoState(myself.c_quest0, 421) <= 16) {
if (gg.Rand(100) <= 29) {
myself.AddUseSkillDesire(myself.c_quest0, 278069249, 0, 0, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 0.670000 && gg.Rand(100) <= 29) {
myself.AddUseSkillDesire(myself.c_quest0, 278069249, 0, 0, 1000000);

}
super;
	}


}