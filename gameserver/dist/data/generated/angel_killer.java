package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class angel_killer extends warrior_pa_casting_3skill_magical2 {
	protected void ATTACKED(HandlerParam attacker, HandlerParam c1, HandlerParam damage, HandlerParam i0) {
myself.SetCurrentQuestID(348);
if (attacker.master) {
attacker = attacker.master;

}
if (gg.HaveMemo(attacker, 348) && gg.GetMemoStateEx(attacker, 348, 0) < 8 && gg.GetMemoStateEx(attacker, 348, 1) % 100 / 10 == 1 && gg.OwnItemCount(attacker, 4291) == 0 && gg.OwnItemCount(attacker, 4398) == 0) {
if (myself.sm.hp < myself.sm.max_hp * 0.300000) {
i0 = gg.GetMemoStateEx(attacker, 348, 1);
i0 = i0 + 10;
myself.SetMemoStateEx(attacker, 348, 1, i0);
if (i0 % 10 == 0) {
myself.DeleteRadar(attacker, -2908, 44128, -2712, 1);
myself.ShowRadar(attacker, -2908, 44128, -2712, 1);

} else {
myself.SetFlagJournal(attacker, 348, 19);
myself.ShowQuestMark(attacker, 348);
myself.SoundEffect(attacker, "ItemSound.quest_middle");

}
myself.Say(gg.MakeFString(34830, "", "", "", "", ""));
myself.Despawn();

}

} else if (gg.HaveMemo(attacker, 348) && gg.GetMemoStateEx(attacker, 348, 0) < 8 && gg.GetMemoStateEx(attacker, 348, 1) % 100 / 10 == 2 && gg.OwnItemCount(attacker, 4291) == 0 && gg.OwnItemCount(attacker, 4398) == 0) {
myself.Say(gg.MakeFString(34839, "", "", "", "", ""));
myself.Despawn();

} else if (gg.HaveMemo(attacker, 348) && gg.OwnItemCount(attacker, 4291) >= 1 || gg.OwnItemCount(attacker, 4398) >= 1) {
myself.Say(gg.MakeFString(34839, "", "", "", "", ""));
myself.Despawn();

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam timer_id) {
myself.SetCurrentQuestID(348);
if (timer_id == 34801) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(348);
myself.AddTimerEx(34801, 1000 * 600);
myself.Say(gg.MakeFString(34831, "", "", "", "", ""));
super;
	}


}