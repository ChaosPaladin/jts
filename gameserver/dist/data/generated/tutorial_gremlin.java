package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tutorial_gremlin extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(201);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.GetMemoStateEx(myself.c_quest0, 255, 1) == 1 || gg.GetMemoStateEx(myself.c_quest0, 255, 1) == 0) {
myself.VoiceEffect(myself.c_quest0, "tutorial_voice_011", 1000);
myself.ShowQuestionMark(myself.c_quest0, 3);
myself.SetMemoStateEx(myself.c_quest0, 255, 1, 2);

}
if (gg.GetMemoStateEx(myself.c_quest0, 255, 1) == 1 || gg.GetMemoStateEx(myself.c_quest0, 255, 1) == 2 || gg.GetMemoStateEx(myself.c_quest0, 255, 1) == 0 && gg.OwnItemCount(myself.c_quest0, 6353) < 1 && myself.i_quest0 == 1 && gg.Rand(2) <= 1) {
myself.DropItem1(myself.c_quest0, 6353, 1);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_tutorial");

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
myself.SetCurrentQuestID(201);
switch (myself.i_quest0) {
case 0: {
myself.i_quest0 = 1;
myself.c_quest0 = attacker;

}
case 1: {
if (myself.c_quest0 != attacker) {
myself.i_quest0 = 2;

}
break;

}
case 2: {
break;

}

}
super;
	}


}