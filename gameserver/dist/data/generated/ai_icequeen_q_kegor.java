package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_q_kegor extends default_npc {
	protected int Buff = 458752001;
	protected int TIMER_buff = 2314003;
	protected int TIMER_grima = 2314013;
	protected int ITEM_quest_potion = 15514;
	protected String MAKER_grimas = "schuttgart29_2512_204m1";
	protected String fnHi = "kegor_savedun001.htm";
	protected int debug_mode = 0;

	protected void CREATED() {
if (myself.IsAttackable(myself.sm) == 1) {
myself.SetAttackable(myself.sm, 0);

}
myself.EquipItem(15280);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
	}

	protected void TALKED(HandlerParam talker) {
if (myself.i_ai0 == 0) {
myself.ShowPage(talker, "kegor_savedun001.htm");

} else if (myself.i_ai0 == 1) {
if (gg.HaveMemo(talker, 10284) && gg.GetMemoState(talker, 10284) == 2) {
myself.ShowPage(talker, "kegor_savedun_q10284_02.htm");

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -2315) {
if (reply == 1) {
if (gg.HaveMemo(talker, 10284) && gg.GetMemoState(talker, 10284) == 2) {
if (gg.OwnItemCount(talker, ITEM_quest_potion) > 0 && myself.i_ai0 == 0) {
myself.DeleteItem1(talker, 15514, gg.OwnItemCount(talker, 15514));
myself.ShowPage(talker, "kegor_savedun_q10284_01.htm");
myself.SetFlagJournal(talker, 10284, 5);
myself.ShowQuestMark(talker, 10284);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.AddTimerEx(TIMER_grima, 3000);
myself.AddTimerEx(TIMER_buff, 3500);

}

}

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai0 >= 1) {
if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 0) {
myself.AddAttackDesire(attacker, 1, damage * 5);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.IsNullCreature(creature) == 0 && creature.is_pc == 1) {
if (debug_mode) {
myself.Say("ispc");

}
myself.i_ai1 = gg.GetIndexFromCreature(creature);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam maker0) {
if (timer_id == TIMER_buff) {
myself.BroadcastScriptEvent(2117001, gg.GetIndexFromCreature(myself.sm), 1000);
if (debug_mode) {
myself.Say("timer_buff");

}
if (myself.i_ai0 == 1) {
c0 = gg.GetCreatureFromIndex(myself.i_ai1);
if (myself.IsNullCreature(c0) == 0) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(c0, Buff, 1, 1, 10000000);

}

}
myself.AddTimerEx(TIMER_buff, 30 * 1000);

}

} else if (timer_id == TIMER_grima) {
if (debug_mode) {
myself.Say("timer_grima");

}
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_grimas);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai0 = 1;

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 2117001) {
if (myself.i_ai0 == 1) {
if (debug_mode) {
myself.Say("어 그리마가 날 부르네");

}
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (c0 != myself.sm) {
myself.AddAttackDesire(c0, 1, 1000);

}

}

}

} else if (script_event_arg1 == 23141002) {
myself.RemoveAllDesire();
myself.StopMove();
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.AddFollowDesire(myself.c_ai0, 5);

}
myself.Say(gg.MakeFString(1801099, "", "", "", "", ""));
c0 = gg.GetCreatureFromIndex(myself.i_ai1);
if (gg.HaveMemo(c0, 10284) && gg.GetMemoState(c0, 10284) == 2) {
if (debug_mode) {
myself.Say("전투끝. 퀘스트 flag 갱신.");

}
myself.SetMemoState(c0, 10284, 3);
myself.SetFlagJournal(c0, 10284, 6);
myself.ShowQuestMark(c0, 10284);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.i_ai0 = 3;

}
myself.UnequipWeapon();
myself.InstantZone_Finish(3);

} else if (script_event_arg1 == 23140100) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 1000);

}

}
	}

	protected void MY_DYING(HandlerParam last_attacker) {
if (debug_mode) {
myself.Say("케고르 사망. 1분 후 강제 인존 종료");

}
myself.Say(gg.MakeFString(1801098, "", "", "", "", ""));
myself.InstantZone_Finish(1);
super;
	}


}