package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_solina_seeker extends default_npc {
	protected int Skill01_ID = 413466625;
	protected int Skill02_ID = 437583873;
	protected int Skill03_ID = 437649409;
	protected int Q_TIME = 1003;
	protected int TP_TIME = 1004;
	protected int UB_Q_TIME = 1005;
	protected int RESET_TIMER = 1006;
	protected int POSX1 = 107110;
	protected int POSY1 = -87760;
	protected int POSZ1 = -2920;
	protected int POSX2 = 124586;
	protected int POSY2 = -75193;
	protected int POSZ2 = -2912;
	protected int SuperPointMethod = 0;
	protected int SuperPointDesire = 50;
	protected String SuperPointName = "no1path";
	protected String fnHi1 = "n_solina_seeker001.htm";
	protected String fnHi2 = "n_solina_seeker002.htm";
	protected String fnHi3 = "n_solina_seeker003.htm";
	protected String fnHi4 = "n_solina_seeker004.htm";
	protected String fnHi5 = "n_solina_seeker005.htm";
	protected String fnHi6 = "n_solina_seeker006.htm";
	protected String fnHi7 = "n_solina_seeker007.htm";
	protected String fnHi8 = "n_solina_seeker008.htm";
	protected String fnHi9 = "n_solina_seeker009.htm";
	protected String fnHi10 = "n_solina_seeker010.htm";

	protected void CREATED() {
myself.i_ai1 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.ChangeMoveType(0);
myself.FixMoveType(1);
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMethod, SuperPointDesire);
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
myself.c_ai0 = attacker;
myself.AddTimerEx(TP_TIME, 2 * 1000);
myself.BlockTimer(Q_TIME);
myself.AddTimerEx(UB_Q_TIME, 20 * 1000);
myself.ChangeMoveType2(0, 1);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 && myself.i_ai1 == 0 && myself.IsNullCreature(myself.c_ai0) == 1 && myself.DistFromMe(creature) < 300) {
if (gg.Rand(100) > 0) {
myself.Say("PC발견");
myself.UnblockTimer(Q_TIME);
myself.ChangeMoveType2(1, 1);
myself.i_ai1 = 1;
myself.ChangeUserTalkTarget(creature);
myself.AddFollowDesire2(creature, 1000, 1, 40, 180);
myself.c_ai0 = creature;
switch (gg.Rand(8)) {
case 0: {
myself.Say("1번질문중");
myself.ChangeUserTalkTarget(creature);
myself.ShowPage(creature, fnHi1);
myself.AddTimerEx(Q_TIME, 15 * 1000);
break;

}
case 1: {
myself.Say("2번질문중");
myself.ChangeUserTalkTarget(creature);
myself.ShowPage(creature, fnHi2);
myself.AddTimerEx(Q_TIME, 15 * 1000);
break;

}
case 2: {
myself.Say("3번질문중");
myself.ChangeUserTalkTarget(creature);
myself.ShowPage(creature, fnHi3);
myself.AddTimerEx(Q_TIME, 15 * 1000);
break;

}
case 3: {
if (creature.is_pc == 1 && myself.i_ai1 == 0) {
myself.Say("4번질문중");
myself.ChangeUserTalkTarget(creature);
myself.ShowPage(creature, fnHi4);
myself.AddTimerEx(Q_TIME, 15 * 1000);

}
break;

}
case 4: {
myself.Say("5번질문중");
myself.ChangeUserTalkTarget(creature);
myself.ShowPage(creature, fnHi5);
myself.AddTimerEx(Q_TIME, 15 * 1000);
break;

}
case 5: {
myself.Say("6번질문중");
myself.ChangeUserTalkTarget(creature);
myself.ShowPage(creature, fnHi6);
myself.AddTimerEx(Q_TIME, 15 * 1000);
break;

}
case 6: {
myself.Say("7번질문중");
myself.ChangeUserTalkTarget(creature);
myself.ShowPage(creature, fnHi7);
myself.AddTimerEx(Q_TIME, 15 * 1000);
break;

}
case 7: {
myself.Say("8번질문중");
myself.ChangeUserTalkTarget(creature);
myself.ShowPage(creature, fnHi8);
myself.AddTimerEx(Q_TIME, 15 * 1000);
break;

}

}

} else {
myself.Say("PC발견 하지만 확률실패");
myself.i_ai1 = 1;
myself.RemoveAllDesire();
myself.AddTimerEx(RESET_TIMER, 60 * 1000);

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0) {
myself.ChangeMoveType2(0, 1);
myself.ChangeUserTalkTarget(myself.c_ai0);
if (ask == -1 || ask == -2 || ask == -3 || ask == -4) {
if (reply == 1) {
myself.ChangeMoveType2(0, 1);
myself.ShowPage(talker, fnHi10);
myself.BlockTimer(Q_TIME);
myself.AddTimerEx(UB_Q_TIME, 20 * 1000);
myself.RemoveAllDesire();
myself.AddTimerEx(RESET_TIMER, 90 * 1000);
myself.c_ai0 = gg.GetNullCreature();

} else {
myself.ChangeMoveType2(0, 1);
myself.ShowPage(talker, fnHi9);
myself.c_ai0 = talker;
myself.AddTimerEx(TP_TIME, 1 * 1000);
myself.BlockTimer(Q_TIME);
myself.AddTimerEx(UB_Q_TIME, 20 * 1000);
myself.RemoveAllDesire();
myself.AddTimerEx(RESET_TIMER, 90 * 1000);

}

}
if (ask == -5 || ask == -6 || ask == -7 || ask == -8) {
if (reply == 2) {
myself.ChangeMoveType2(0, 1);
myself.ShowPage(talker, fnHi10);
myself.BlockTimer(Q_TIME);
myself.AddTimerEx(UB_Q_TIME, 20 * 1000);
myself.RemoveAllDesire();
myself.AddTimerEx(RESET_TIMER, 90 * 1000);
myself.c_ai0 = gg.GetNullCreature();

} else {
myself.ChangeMoveType2(0, 1);
myself.ShowPage(talker, fnHi9);
myself.c_ai0 = talker;
myself.AddTimerEx(TP_TIME, 1 * 1000);
myself.BlockTimer(Q_TIME);
myself.AddTimerEx(UB_Q_TIME, 20 * 1000);
myself.RemoveAllDesire();
myself.AddTimerEx(RESET_TIMER, 90 * 1000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == Q_TIME) {
myself.AddTimerEx(TP_TIME, 1 * 1000);
myself.AddTimerEx(RESET_TIMER, 2 * 1000);

} else if (timer_id == UB_Q_TIME) {
myself.UnblockTimer(Q_TIME);
myself.c_ai0 = gg.GetNullCreature();

} else if (timer_id == TP_TIME) {
myself.ChangeMoveType2(0, 1);
switch (gg.Rand(2)) {
case 0: {
myself.InstantTeleport(myself.c_ai0, POSX1, POSY1, POSZ1);
myself.RemoveAllDesire();
break;

}
case 1: {
myself.InstantTeleport(myself.c_ai0, POSX2, POSY2, POSZ2);
myself.RemoveAllDesire();
break;

}

}

} else if (timer_id == RESET_TIMER) {
myself.i_ai1 = 0;
myself.Shout("리셋완료");

}
	}

	protected void NO_DESIRE() {
myself.c_ai0 = gg.GetNullCreature();
myself.AddMoveSuperPointDesire(SuperPointName, SuperPointMethod, SuperPointDesire);
	}


}