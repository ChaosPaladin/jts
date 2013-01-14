package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rune_ghost2 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 22) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.sm.param2 != talker.dbid) {
myself.ShowPage(talker, "rune_ghost2_q0022_01a.htm");
myself.SoundEffect(talker, "AmbSound.d_horror_15");

} else if (myself.sm.param2 == talker.dbid) {
myself.ShowPage(talker, "rune_ghost2_q0022_01.htm");
myself.SoundEffect(talker, "AmbSound.d_horror_15");

}

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam npc0, HandlerParam timer_id) {
myself.SetCurrentQuestID(22);
if (timer_id == 2201) {
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
myself.Say(gg.MakeFString(2251, "", "", "", "", ""));
myself.Despawn();

} else if (timer_id == 2202) {
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam c0) {
myself.SetCurrentQuestID(22);
myself.AddTimerEx(2201, 1000 * 120);
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (c0) {
myself.Say(gg.MakeFString(2250, c0.name, "", "", "", ""));

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 22) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 22) {
if (reply == 6) {
myself.ShowPage(talker, "rune_ghost2_q0022_04.htm");
myself.SoundEffect(talker, "AmbSound.d_horror_03");

}
if (reply == 7) {
myself.SetMemoState(talker, 22, 5);
myself.ShowPage(talker, "rune_ghost2_q0022_08.htm");
myself.AddTimerEx(2202, 1000 * 3);
myself.SetFlagJournal(talker, 22, 8);
myself.ShowQuestMark(talker, 22);

}

}
super;
	}


}