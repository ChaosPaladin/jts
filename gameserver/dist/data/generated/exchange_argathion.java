package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class exchange_argathion extends citizen {
	protected int goods_ex1 = 6471;
	protected int goods_ex2 = 5094;
	protected int goods_ex3 = 9814;
	protected int goods_ex4 = 9816;
	protected int goods_ex5 = 9817;
	protected int goods_ex6 = 9815;
	protected int goods_ex7 = 57;
	protected int num_ex1 = 200;
	protected int num_ex2 = 400;
	protected int num_ex3 = 40;
	protected int num_ex4 = 50;
	protected int num_ex5 = 50;
	protected int num_ex6 = 30;
	protected int num_ex7 = 3550000;
	protected int refund_rate = 90;
	protected int agathion_failed = 10408;
	protected int agathion_devil1 = 10321;
	protected int agathion_devil2 = 10322;
	protected int agathion_devil3 = 10323;
	protected int agathion_devil4 = 10324;
	protected int agathion_devil5 = 10325;
	protected int agathion_devil = 10326;
	protected int prob_devil1 = 600;
	protected int prob_devil2 = 10;
	protected int prob_devil3 = 10;
	protected int prob_devil4 = 5;
	protected int prob_devil5 = 5;
	protected int prob_devil = 370;
	protected int agathion_angel1 = 10315;
	protected int agathion_angel2 = 10316;
	protected int agathion_angel3 = 10317;
	protected int agathion_angel4 = 10318;
	protected int agathion_angel5 = 10319;
	protected int agathion_angel = 10320;
	protected int prob_angel1 = 600;
	protected int prob_angel2 = 10;
	protected int prob_angel3 = 10;
	protected int prob_angel4 = 5;
	protected int prob_angel5 = 5;
	protected int prob_angel = 370;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
if (ask == -1901) {
switch (reply) {
case 0: {
break;

}
case 1: {
i0 = gg.Rand(1000);
i1 = 0;
i2 = prob_devil1;
i3 = agathion_devil1;
if (i1 <= i0 && i0 < i2) {
if (gg.OwnItemCount(talker, goods_ex1) >= num_ex1 && gg.OwnItemCount(talker, goods_ex2) >= num_ex2 && gg.OwnItemCount(talker, goods_ex3) >= num_ex3 && gg.OwnItemCount(talker, goods_ex4) >= num_ex4 && gg.OwnItemCount(talker, goods_ex5) >= num_ex5 && gg.OwnItemCount(talker, goods_ex6) >= num_ex6 && gg.OwnItemCount(talker, goods_ex7) >= num_ex7) {
myself.DeleteItem1(talker, goods_ex1, num_ex1);
myself.DeleteItem1(talker, goods_ex2, num_ex2);
myself.DeleteItem1(talker, goods_ex3, num_ex3);
myself.DeleteItem1(talker, goods_ex4, num_ex4);
myself.DeleteItem1(talker, goods_ex5, num_ex5);
myself.DeleteItem1(talker, goods_ex6, num_ex6);
myself.DeleteItem1(talker, goods_ex7, num_ex7);
myself.GiveItem1(talker, i3, 1);
if (agathion_failed == 0) {
myself.ShowPage(talker, "alexandria003.htm");

} else {
myself.GiveItem1(talker, agathion_failed, 1);
myself.ShowPage(talker, "alexandria003a.htm");

}

} else {
myself.ShowPage(talker, "alexandria004.htm");

}
return;

}
i1 = i1 + prob_devil1;
i2 = i2 + prob_devil2;
i3 = agathion_devil2;
if (i1 <= i0 && i0 < i2) {
if (gg.OwnItemCount(talker, goods_ex1) >= num_ex1 && gg.OwnItemCount(talker, goods_ex2) >= num_ex2 && gg.OwnItemCount(talker, goods_ex3) >= num_ex3 && gg.OwnItemCount(talker, goods_ex4) >= num_ex4 && gg.OwnItemCount(talker, goods_ex5) >= num_ex5 && gg.OwnItemCount(talker, goods_ex6) >= num_ex6 && gg.OwnItemCount(talker, goods_ex7) >= num_ex7) {
myself.DeleteItem1(talker, goods_ex1, num_ex1);
myself.DeleteItem1(talker, goods_ex2, num_ex2);
myself.DeleteItem1(talker, goods_ex3, num_ex3);
myself.DeleteItem1(talker, goods_ex4, num_ex4);
myself.DeleteItem1(talker, goods_ex5, num_ex5);
myself.DeleteItem1(talker, goods_ex6, num_ex6);
myself.DeleteItem1(talker, goods_ex7, num_ex7);
myself.GiveItem1(talker, i3, 1);
if (0 == 0) {
myself.ShowPage(talker, "alexandria003.htm");

} else {
myself.GiveItem1(talker, 0, 1);
myself.ShowPage(talker, "alexandria003a.htm");

}

} else {
myself.ShowPage(talker, "alexandria004.htm");

}
return;

}
i1 = i1 + prob_devil2;
i2 = i2 + prob_devil3;
i3 = agathion_devil3;
if (i1 <= i0 && i0 < i2) {
if (gg.OwnItemCount(talker, goods_ex1) >= num_ex1 && gg.OwnItemCount(talker, goods_ex2) >= num_ex2 && gg.OwnItemCount(talker, goods_ex3) >= num_ex3 && gg.OwnItemCount(talker, goods_ex4) >= num_ex4 && gg.OwnItemCount(talker, goods_ex5) >= num_ex5 && gg.OwnItemCount(talker, goods_ex6) >= num_ex6 && gg.OwnItemCount(talker, goods_ex7) >= num_ex7) {
myself.DeleteItem1(talker, goods_ex1, num_ex1);
myself.DeleteItem1(talker, goods_ex2, num_ex2);
myself.DeleteItem1(talker, goods_ex3, num_ex3);
myself.DeleteItem1(talker, goods_ex4, num_ex4);
myself.DeleteItem1(talker, goods_ex5, num_ex5);
myself.DeleteItem1(talker, goods_ex6, num_ex6);
myself.DeleteItem1(talker, goods_ex7, num_ex7);
myself.GiveItem1(talker, i3, 1);
if (0 == 0) {
myself.ShowPage(talker, "alexandria003.htm");

} else {
myself.GiveItem1(talker, 0, 1);
myself.ShowPage(talker, "alexandria003a.htm");

}

} else {
myself.ShowPage(talker, "alexandria004.htm");

}
return;

}
i1 = i1 + prob_devil3;
i2 = i2 + prob_devil4;
i3 = agathion_devil4;
if (i1 <= i0 && i0 < i2) {
if (gg.OwnItemCount(talker, goods_ex1) >= num_ex1 && gg.OwnItemCount(talker, goods_ex2) >= num_ex2 && gg.OwnItemCount(talker, goods_ex3) >= num_ex3 && gg.OwnItemCount(talker, goods_ex4) >= num_ex4 && gg.OwnItemCount(talker, goods_ex5) >= num_ex5 && gg.OwnItemCount(talker, goods_ex6) >= num_ex6 && gg.OwnItemCount(talker, goods_ex7) >= num_ex7) {
myself.DeleteItem1(talker, goods_ex1, num_ex1);
myself.DeleteItem1(talker, goods_ex2, num_ex2);
myself.DeleteItem1(talker, goods_ex3, num_ex3);
myself.DeleteItem1(talker, goods_ex4, num_ex4);
myself.DeleteItem1(talker, goods_ex5, num_ex5);
myself.DeleteItem1(talker, goods_ex6, num_ex6);
myself.DeleteItem1(talker, goods_ex7, num_ex7);
myself.GiveItem1(talker, i3, 1);
if (0 == 0) {
myself.ShowPage(talker, "alexandria003.htm");

} else {
myself.GiveItem1(talker, 0, 1);
myself.ShowPage(talker, "alexandria003a.htm");

}

} else {
myself.ShowPage(talker, "alexandria004.htm");

}
return;

}
i1 = i1 + prob_devil4;
i2 = i2 + prob_devil5;
i3 = agathion_devil5;
if (i1 <= i0 && i0 < i2) {
if (gg.OwnItemCount(talker, goods_ex1) >= num_ex1 && gg.OwnItemCount(talker, goods_ex2) >= num_ex2 && gg.OwnItemCount(talker, goods_ex3) >= num_ex3 && gg.OwnItemCount(talker, goods_ex4) >= num_ex4 && gg.OwnItemCount(talker, goods_ex5) >= num_ex5 && gg.OwnItemCount(talker, goods_ex6) >= num_ex6 && gg.OwnItemCount(talker, goods_ex7) >= num_ex7) {
myself.DeleteItem1(talker, goods_ex1, num_ex1);
myself.DeleteItem1(talker, goods_ex2, num_ex2);
myself.DeleteItem1(talker, goods_ex3, num_ex3);
myself.DeleteItem1(talker, goods_ex4, num_ex4);
myself.DeleteItem1(talker, goods_ex5, num_ex5);
myself.DeleteItem1(talker, goods_ex6, num_ex6);
myself.DeleteItem1(talker, goods_ex7, num_ex7);
myself.GiveItem1(talker, i3, 1);
if (0 == 0) {
myself.ShowPage(talker, "alexandria003.htm");

} else {
myself.GiveItem1(talker, 0, 1);
myself.ShowPage(talker, "alexandria003a.htm");

}

} else {
myself.ShowPage(talker, "alexandria004.htm");

}
return;

}
i1 = i1 + prob_devil5;
i2 = i2 + prob_devil;
i3 = agathion_devil;
if (i1 <= i0 && i0 < i2) {
if (gg.OwnItemCount(talker, goods_ex1) >= num_ex1 && gg.OwnItemCount(talker, goods_ex2) >= num_ex2 && gg.OwnItemCount(talker, goods_ex3) >= num_ex3 && gg.OwnItemCount(talker, goods_ex4) >= num_ex4 && gg.OwnItemCount(talker, goods_ex5) >= num_ex5 && gg.OwnItemCount(talker, goods_ex6) >= num_ex6 && gg.OwnItemCount(talker, goods_ex7) >= num_ex7) {
myself.DeleteItem1(talker, goods_ex1, num_ex1);
myself.DeleteItem1(talker, goods_ex2, num_ex2);
myself.DeleteItem1(talker, goods_ex3, num_ex3);
myself.DeleteItem1(talker, goods_ex4, num_ex4);
myself.DeleteItem1(talker, goods_ex5, num_ex5);
myself.DeleteItem1(talker, goods_ex6, num_ex6);
myself.DeleteItem1(talker, goods_ex7, num_ex7);
myself.GiveItem1(talker, i3, 1);
if (0 == 0) {
myself.ShowPage(talker, "alexandria003.htm");

} else {
myself.GiveItem1(talker, 0, 1);
myself.ShowPage(talker, "alexandria003a.htm");

}

} else {
myself.ShowPage(talker, "alexandria004.htm");

}
return;

}
break;

}
case 2: {
i0 = gg.Rand(1000);
i1 = 0;
i2 = prob_angel1;
i3 = agathion_angel1;
if (i1 <= i0 && i0 < i2) {
if (gg.OwnItemCount(talker, goods_ex1) >= num_ex1 && gg.OwnItemCount(talker, goods_ex2) >= num_ex2 && gg.OwnItemCount(talker, goods_ex3) >= num_ex3 && gg.OwnItemCount(talker, goods_ex4) >= num_ex4 && gg.OwnItemCount(talker, goods_ex5) >= num_ex5 && gg.OwnItemCount(talker, goods_ex6) >= num_ex6 && gg.OwnItemCount(talker, goods_ex7) >= num_ex7) {
myself.DeleteItem1(talker, goods_ex1, num_ex1);
myself.DeleteItem1(talker, goods_ex2, num_ex2);
myself.DeleteItem1(talker, goods_ex3, num_ex3);
myself.DeleteItem1(talker, goods_ex4, num_ex4);
myself.DeleteItem1(talker, goods_ex5, num_ex5);
myself.DeleteItem1(talker, goods_ex6, num_ex6);
myself.DeleteItem1(talker, goods_ex7, num_ex7);
myself.GiveItem1(talker, i3, 1);
if (agathion_failed == 0) {
myself.ShowPage(talker, "alexandria003.htm");

} else {
myself.GiveItem1(talker, agathion_failed, 1);
myself.ShowPage(talker, "alexandria003a.htm");

}

} else {
myself.ShowPage(talker, "alexandria004.htm");

}
return;

}
i1 = i1 + prob_angel1;
i2 = i2 + prob_angel2;
i3 = agathion_angel2;
if (i1 <= i0 && i0 < i2) {
if (gg.OwnItemCount(talker, goods_ex1) >= num_ex1 && gg.OwnItemCount(talker, goods_ex2) >= num_ex2 && gg.OwnItemCount(talker, goods_ex3) >= num_ex3 && gg.OwnItemCount(talker, goods_ex4) >= num_ex4 && gg.OwnItemCount(talker, goods_ex5) >= num_ex5 && gg.OwnItemCount(talker, goods_ex6) >= num_ex6 && gg.OwnItemCount(talker, goods_ex7) >= num_ex7) {
myself.DeleteItem1(talker, goods_ex1, num_ex1);
myself.DeleteItem1(talker, goods_ex2, num_ex2);
myself.DeleteItem1(talker, goods_ex3, num_ex3);
myself.DeleteItem1(talker, goods_ex4, num_ex4);
myself.DeleteItem1(talker, goods_ex5, num_ex5);
myself.DeleteItem1(talker, goods_ex6, num_ex6);
myself.DeleteItem1(talker, goods_ex7, num_ex7);
myself.GiveItem1(talker, i3, 1);
if (0 == 0) {
myself.ShowPage(talker, "alexandria003.htm");

} else {
myself.GiveItem1(talker, 0, 1);
myself.ShowPage(talker, "alexandria003a.htm");

}

} else {
myself.ShowPage(talker, "alexandria004.htm");

}
return;

}
i1 = i1 + prob_angel2;
i2 = i2 + prob_angel3;
i3 = agathion_angel3;
if (i1 <= i0 && i0 < i2) {
if (gg.OwnItemCount(talker, goods_ex1) >= num_ex1 && gg.OwnItemCount(talker, goods_ex2) >= num_ex2 && gg.OwnItemCount(talker, goods_ex3) >= num_ex3 && gg.OwnItemCount(talker, goods_ex4) >= num_ex4 && gg.OwnItemCount(talker, goods_ex5) >= num_ex5 && gg.OwnItemCount(talker, goods_ex6) >= num_ex6 && gg.OwnItemCount(talker, goods_ex7) >= num_ex7) {
myself.DeleteItem1(talker, goods_ex1, num_ex1);
myself.DeleteItem1(talker, goods_ex2, num_ex2);
myself.DeleteItem1(talker, goods_ex3, num_ex3);
myself.DeleteItem1(talker, goods_ex4, num_ex4);
myself.DeleteItem1(talker, goods_ex5, num_ex5);
myself.DeleteItem1(talker, goods_ex6, num_ex6);
myself.DeleteItem1(talker, goods_ex7, num_ex7);
myself.GiveItem1(talker, i3, 1);
if (0 == 0) {
myself.ShowPage(talker, "alexandria003.htm");

} else {
myself.GiveItem1(talker, 0, 1);
myself.ShowPage(talker, "alexandria003a.htm");

}

} else {
myself.ShowPage(talker, "alexandria004.htm");

}
return;

}
i1 = i1 + prob_angel3;
i2 = i2 + prob_angel4;
i3 = agathion_angel4;
if (i1 <= i0 && i0 < i2) {
if (gg.OwnItemCount(talker, goods_ex1) >= num_ex1 && gg.OwnItemCount(talker, goods_ex2) >= num_ex2 && gg.OwnItemCount(talker, goods_ex3) >= num_ex3 && gg.OwnItemCount(talker, goods_ex4) >= num_ex4 && gg.OwnItemCount(talker, goods_ex5) >= num_ex5 && gg.OwnItemCount(talker, goods_ex6) >= num_ex6 && gg.OwnItemCount(talker, goods_ex7) >= num_ex7) {
myself.DeleteItem1(talker, goods_ex1, num_ex1);
myself.DeleteItem1(talker, goods_ex2, num_ex2);
myself.DeleteItem1(talker, goods_ex3, num_ex3);
myself.DeleteItem1(talker, goods_ex4, num_ex4);
myself.DeleteItem1(talker, goods_ex5, num_ex5);
myself.DeleteItem1(talker, goods_ex6, num_ex6);
myself.DeleteItem1(talker, goods_ex7, num_ex7);
myself.GiveItem1(talker, i3, 1);
if (0 == 0) {
myself.ShowPage(talker, "alexandria003.htm");

} else {
myself.GiveItem1(talker, 0, 1);
myself.ShowPage(talker, "alexandria003a.htm");

}

} else {
myself.ShowPage(talker, "alexandria004.htm");

}
return;

}
i1 = i1 + prob_angel4;
i2 = i2 + prob_angel5;
i3 = agathion_angel5;
if (i1 <= i0 && i0 < i2) {
if (gg.OwnItemCount(talker, goods_ex1) >= num_ex1 && gg.OwnItemCount(talker, goods_ex2) >= num_ex2 && gg.OwnItemCount(talker, goods_ex3) >= num_ex3 && gg.OwnItemCount(talker, goods_ex4) >= num_ex4 && gg.OwnItemCount(talker, goods_ex5) >= num_ex5 && gg.OwnItemCount(talker, goods_ex6) >= num_ex6 && gg.OwnItemCount(talker, goods_ex7) >= num_ex7) {
myself.DeleteItem1(talker, goods_ex1, num_ex1);
myself.DeleteItem1(talker, goods_ex2, num_ex2);
myself.DeleteItem1(talker, goods_ex3, num_ex3);
myself.DeleteItem1(talker, goods_ex4, num_ex4);
myself.DeleteItem1(talker, goods_ex5, num_ex5);
myself.DeleteItem1(talker, goods_ex6, num_ex6);
myself.DeleteItem1(talker, goods_ex7, num_ex7);
myself.GiveItem1(talker, i3, 1);
if (0 == 0) {
myself.ShowPage(talker, "alexandria003.htm");

} else {
myself.GiveItem1(talker, 0, 1);
myself.ShowPage(talker, "alexandria003a.htm");

}

} else {
myself.ShowPage(talker, "alexandria004.htm");

}
return;

}
i1 = i1 + prob_angel5;
i2 = i2 + prob_angel;
i3 = agathion_angel;
if (i1 <= i0 && i0 < i2) {
if (gg.OwnItemCount(talker, goods_ex1) >= num_ex1 && gg.OwnItemCount(talker, goods_ex2) >= num_ex2 && gg.OwnItemCount(talker, goods_ex3) >= num_ex3 && gg.OwnItemCount(talker, goods_ex4) >= num_ex4 && gg.OwnItemCount(talker, goods_ex5) >= num_ex5 && gg.OwnItemCount(talker, goods_ex6) >= num_ex6 && gg.OwnItemCount(talker, goods_ex7) >= num_ex7) {
myself.DeleteItem1(talker, goods_ex1, num_ex1);
myself.DeleteItem1(talker, goods_ex2, num_ex2);
myself.DeleteItem1(talker, goods_ex3, num_ex3);
myself.DeleteItem1(talker, goods_ex4, num_ex4);
myself.DeleteItem1(talker, goods_ex5, num_ex5);
myself.DeleteItem1(talker, goods_ex6, num_ex6);
myself.DeleteItem1(talker, goods_ex7, num_ex7);
myself.GiveItem1(talker, i3, 1);
if (0 == 0) {
myself.ShowPage(talker, "alexandria003.htm");

} else {
myself.GiveItem1(talker, 0, 1);
myself.ShowPage(talker, "alexandria003a.htm");

}

} else {
myself.ShowPage(talker, "alexandria004.htm");

}
return;

}
break;

}

}

} else {
super;

}
	}


}