package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sparky_the_cat_hero extends citizen {
	protected void TALKED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 13) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Arcana Lord (In Progress)");

}
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 14 && gg.OwnItemCount(talker, 7444) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Arcana Lord (In Progress)");

}
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 14 && gg.OwnItemCount(talker, 7444) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Arcana Lord (In Progress)");

}
if (gg.HaveMemo(talker, 91) == 0 || talker.occupation != 14 || gg.GetMemoState(talker, 91) != 13 && gg.GetMemoState(talker, 91) != 14) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Arcana Lord (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 0);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 13) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.i_quest0 == 0 && myself.sm.param2 == talker.dbid) {
myself.ShowPage(talker, "sparky_the_cat_hero_q0091_0101.htm");

}
if (myself.i_quest0 == 0 && myself.sm.param2 != talker.dbid) {
myself.ShowPage(talker, "sparky_the_cat_hero_q0091_0102.htm");

}
if (myself.i_quest0 == 1) {
myself.ShowPage(talker, "sparky_the_cat_hero_q0091_0103.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 14 && gg.OwnItemCount(talker, 7444) == 0) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.i_quest0 == 0 && myself.sm.param2 == talker.dbid) {
myself.ShowPage(talker, "sparky_the_cat_hero_q0091_0104.htm");

}
if (myself.i_quest0 == 0 && myself.sm.param2 != talker.dbid) {
myself.ShowPage(talker, "sparky_the_cat_hero_q0091_0105.htm");

}
if (myself.i_quest0 == 1 && myself.sm.param2 == talker.dbid) {
myself.ShowPage(talker, "sparky_the_cat_hero_q0091_0106.htm");

}
if (myself.i_quest0 == 1 && myself.sm.param2 != talker.dbid) {
myself.ShowPage(talker, "sparky_the_cat_hero_q0091_0107.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 14 && gg.OwnItemCount(talker, 7444) >= 1) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.i_quest0 == 0) {
myself.ShowPage(talker, "sparky_the_cat_hero_q0091_0108.htm");

}
if (myself.i_quest0 == 1) {
myself.ShowPage(talker, "sparky_the_cat_hero_q0091_0109.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 91) == 0 || talker.occupation != 14 || gg.GetMemoState(talker, 91) != 13 && gg.GetMemoState(talker, 91) != 14) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "noquest.htm");

}
break;

}

}
return;

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam c1) {
myself.SetCurrentQuestID(91);
c1 = attacker;
if (c1.master) {
c1 = c1.master;

}
if (c1.is_pc == 0) {
myself.AddAttackDesire(attacker, 1, 2000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam npc0, HandlerParam timer_id) {
myself.SetCurrentQuestID(91);
if (timer_id == 99903) {
myself.Say(gg.MakeFString(9157, "", "", "", "", ""));
myself.AddTimerEx(99904, 1500);

} else if (timer_id == 99904) {
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (c0) {
if (c0.is_pc == 1) {
myself.Say(gg.MakeFString(9158, c0.name, "", "", "", ""));

}

}
myself.AddTimerEx(99909, 10000);

} else if (timer_id == 99905) {
myself.i_quest1 = myself.i_quest1 + 1;
if (myself.i_quest0 == 1 || myself.i_quest0 == 2 || myself.i_quest1 > 3) {
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
if (myself.i_quest0 == 1) {
myself.Say(gg.MakeFString(9161, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(9162, "", "", "", "", ""));

}
myself.Despawn();

} else {
myself.AddTimerEx(99905, 1000);

}

} else if (timer_id == 99909) {
if (myself.i_quest0 == 0) {
if (gg.Rand(2) == 0) {
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (c0) {
if (c0.is_pc == 1) {
myself.Say(gg.MakeFString(9159, c0.name, "", "", "", ""));

}

}

} else {
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (c0) {
if (c0.is_pc == 1) {
myself.Say(gg.MakeFString(9160, c0.name, "", "", "", ""));

}

}

}
myself.AddTimerEx(99909, 13000);

}

}
super;
	}

	protected void CREATED() {
myself.SetCurrentQuestID(91);
myself.AddTimerEx(99903, 500);
myself.AddTimerEx(99905, 1000 * 60);
myself.i_quest0 = 0;
myself.i_quest1 = 0;
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam npc0, HandlerParam reply, HandlerParam talker) {
if (ask == 91) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 91) {
if (reply == 1) {
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 14 && gg.OwnItemCount(talker, 7444) == 0 && myself.i_quest0 == 1 && myself.sm.param2 == talker.dbid) {
myself.ShowPage(talker, "sparky_the_cat_hero_q0091_0110.htm");

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 14 && gg.OwnItemCount(talker, 7444) == 0 && myself.i_quest0 == 1 && myself.sm.param2 != talker.dbid) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7444, 1);
myself.ShowPage(talker, "sparky_the_cat_hero_q0091_0111.htm");
myself.SetFlagJournal(talker, 91, 18);
myself.ShowQuestMark(talker, 91);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

} else if (reply == 3) {
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 14 && gg.OwnItemCount(talker, 7444) == 0 && myself.i_quest0 == 1 && myself.sm.param2 == talker.dbid) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7444, 1);
myself.SetFlagJournal(talker, 91, 18);
myself.ShowQuestMark(talker, 91);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.Say(gg.MakeFString(9163, "", "", "", "", ""));
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
myself.Despawn();

}

}

}

}
super;
	}


}