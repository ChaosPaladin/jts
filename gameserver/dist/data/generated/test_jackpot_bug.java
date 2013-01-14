package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class test_jackpot_bug extends warrior_basic {
	protected int RandRate = -1;
	protected int ItemName_A = 57;
	protected int ItemName_B_1 = 1881;
	protected int ItemName_B_2 = 1890;
	protected int ItemName_B_3 = 1880;
	protected int ItemName_B_4 = 729;

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam maker0, HandlerParam last_attacker) {
if (myself.i_ai2 == 0) {
myself.Say(gg.MakeFString(1800290, "", "", "", "", ""));

} else {
myself.AddUseSkillDesire(myself.sm, 377356289, 1, 0, 5000000);

}
switch (myself.i_ai2) {
case 1: {
i0 = 695;
i1 = 2245;
myself.DropItem1(myself.sm, ItemName_A, i0 + gg.Rand(i1 - i0));
break;

}
case 2: {
i0 = 3200;
i1 = 8400;
myself.DropItem1(myself.sm, ItemName_A, i0 + gg.Rand(i1 - i0));
break;

}
case 3: {
i0 = 7;
i1 = 17;
myself.DropItem1(myself.sm, ItemName_B_1, i0 + gg.Rand(i1 - i0));
i0 = 1;
i1 = 1;
myself.DropItem1(myself.sm, ItemName_B_2, i0 + gg.Rand(i1 - i0));
i0 = 7;
i1 = 17;
myself.DropItem1(myself.sm, ItemName_B_3, i0 + gg.Rand(i1 - i0));
break;

}
case 4: {
i0 = 15;
i1 = 45;
myself.DropItem1(myself.sm, ItemName_B_1, i0 + gg.Rand(i1 - i0));
i0 = 10;
i1 = 20;
myself.DropItem1(myself.sm, ItemName_B_2, i0 + gg.Rand(i1 - i0));
i0 = 15;
i1 = 45;
myself.DropItem1(myself.sm, ItemName_B_3, i0 + gg.Rand(i1 - i0));
i0 = 1;
i1 = 1;
if (gg.Rand(100) < 10) {
myself.DropItem1(myself.sm, ItemName_B_4, 1);

}
break;

}

}
	}

	protected void CREATED(HandlerParam i0) {
	}

	protected void ATTACKED() {
myself.Say(" 공격 받았음 [0]");
myself.i_ai3 = 1;
myself.AddTimerEx(7777, 1000);
myself.AddTimerEx(7778, 1000);
	}

	protected void SEE_CREATURE() {
myself.Say(" 공격 받았음 [1]");
	}

	protected void SPELLED() {
myself.Say(" 공격 받았음 [2]");
	}

	protected void SEE_SPELL() {
myself.Say(" 공격 받았음 [3]");
	}

	protected void DESIRE_MANIPULATION() {
myself.Say(" 공격 받았음 [4]");
	}

	protected void NO_DESIRE() {
myself.LookItem(500, 1, 0);
	}

	protected void GET_ITEM_FINISHED(HandlerParam item, HandlerParam success) {
if (success == 1) {
myself.AddUseSkillDesire(myself.sm, 396165121, 1, 0, 5000000);
myself.Say(" Test - 얌 얌 얌 얌 ");
myself.i_ai0 = myself.i_ai0 + 1;
if (myself.i_ai0 == 0) {
myself.i_ai1 = 0;

}
if (myself.i_ai0 > 1 && myself.i_ai0 <= 10) {
myself.i_ai1 = 1;

}
if (myself.i_ai0 > 10 && myself.i_ai0 <= 100) {
myself.i_ai1 = 2;

}
if (myself.i_ai0 > 100 && myself.i_ai0 <= 500) {
myself.i_ai1 = 3;

}
if (myself.i_ai0 > 500 && myself.i_ai0 <= 1000) {
myself.i_ai1 = 4;

}
if (myself.i_ai0 > 1000) {
myself.i_ai1 = 5;

}
switch (myself.i_ai1) {
case 0: {
myself.i_ai2 = 0;
break;

}
case 1: {
if (gg.Rand(100) < 10) {
myself.i_ai2 = 2;

} else if (gg.Rand(100) < 15) {
myself.i_ai2 = 3;

} else {
myself.i_ai2 = 1;

}
break;

}
case 2: {
if (gg.Rand(100) < 10) {
myself.i_ai2 = 3;

} else if (gg.Rand(100) < 15) {
myself.i_ai2 = 4;

} else {
myself.i_ai2 = 2;

}
break;

}
case 3: {
if (gg.Rand(100) < 10) {
myself.i_ai2 = 4;

} else {
myself.i_ai2 = 3;

}
break;

}
case 4: {
if (gg.Rand(100) < 10) {
myself.i_ai2 = 3;

} else {
myself.i_ai2 = 4;

}
break;

}

}

}
	}

	protected void SEE_ITEM(HandlerParam item_index_list, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (myself.i_ai3 == 0) {
return;

}
i0 = item_index_list.GetSize();
if (i0 > 5) {
i0 = 5;

}
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
if (myself.IsStackableItemEx(item_index_list.GetItemIndex(i1))) {
myself.AddGetItemDesireEx(item_index_list.GetItemIndex(i1), 10000 - i1);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 7777) {
myself.LookItem(500, 1, 0);
myself.AddTimerEx(7777, 10 * 1000);

}
if (timer_id == 7778) {
switch (myself.i_ai0) {
case 0: {
if (gg.Rand(2)) {
myself.Say(gg.MakeFString(1800279, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800280, "", "", "", "", ""));

}
break;

}
case 1: {
if (gg.Rand(2)) {
myself.Say(gg.MakeFString(1800281, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800282, "", "", "", "", ""));

}
break;

}
case 2: {
if (gg.Rand(2)) {
myself.Say(gg.MakeFString(1800283, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800284, "", "", "", "", ""));

}
break;

}
case 3: {
if (gg.Rand(2)) {
myself.Say(gg.MakeFString(1800285, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800286, "", "", "", "", ""));

}
break;

}
case 4: {
if (gg.Rand(2)) {
myself.Say(gg.MakeFString(1800287, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800288, "", "", "", "", ""));

}
break;

}
case 5: {
myself.Say(gg.MakeFString(1800289, "", "", "", "", ""));
break;

}

}
i0 = gg.Rand(10);
myself.AddTimerEx(7778, 10000 + i0 * 1000);

}
	}


}