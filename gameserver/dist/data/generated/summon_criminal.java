package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class summon_criminal extends default_npc {
	protected void CREATED(HandlerParam i0) {
myself.Summon_SetOption(3, 0);
myself.AddPetDefaultDesire_Follow(20.000000);
i0 = gg.Rand(100);
if (i0 < 50) {
myself.Say(gg.MakeFString(42231, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(42232, "", "", "", "", ""));

}
myself.AddTimerEx(2001, 60000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (gg.Rand(100) < 30) {
i0 = gg.Rand(100);
if (i0 < 35) {
myself.Say(gg.MakeFString(42233, "", "", "", "", ""));

} else if (i0 < 70) {
myself.Say(gg.MakeFString(42234, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(42235, "", "", "", "", ""));

}

}
	}

	protected void MY_DYING(HandlerParam i0) {
i0 = gg.Rand(100);
if (i0 < 35) {
myself.Say(gg.MakeFString(42236, "", "", "", "", ""));

} else if (i0 < 70) {
myself.Say(gg.MakeFString(42237, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(42238, "", "", "", "", ""));

}
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam i0) {
if (gg.Rand(100) < 10) {
i0 = gg.Rand(100);
if (i0 < 25) {
myself.Say(gg.MakeFString(42239, "", "", "", "", ""));

} else if (i0 < 50) {
myself.Say(gg.MakeFString(42240, "", "", "", "", ""));

} else if (i0 < 75) {
myself.Say(gg.MakeFString(42241, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(42242, "", "", "", "", ""));

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 2001) {
if (gg.Rand(100) < 30) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.Say(gg.MakeFString(42243, "", "", "", "", ""));

} else if (i0 < 40) {
myself.Say(gg.MakeFString(42244, "", "", "", "", ""));

} else if (i0 < 60) {
myself.Say(gg.MakeFString(42245, "", "", "", "", ""));

} else if (i0 < 80) {
myself.Say(gg.MakeFString(42246, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(42247, "", "", "", "", ""));

}

}

}
myself.AddTimerEx(timer_id, 60000);
	}


}